import com.google.common.base.Ticker;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.MoreExecutors;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceImmutableList;
import it.unimi.dsi.fastutil.objects.ReferenceList;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ad {
   static final Logger g = LogUtils.getLogger();
   private static final int h = 255;
   private static final int i = 10;
   private static final String j = "max.bg.threads";
   private static final ExecutorService k = c("Main");
   private static final ExecutorService l = a("IO-Worker-", false);
   private static final ExecutorService m = a("Download-", true);
   private static final DateTimeFormatter n = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH.mm.ss", Locale.ROOT);
   public static final int a = 8;
   private static final Set<String> o = Set.of("http", "https");
   public static final long b = 1000000L;
   public static bac.a c = System::nanoTime;
   public static final Ticker d = new Ticker() {
      public long read() {
         return ad.c.getAsLong();
      }
   };
   public static final UUID e = new UUID(0L, 0L);
   public static final FileSystemProvider f = FileSystemProvider.installedProviders()
      .stream()
      .filter($$0 -> $$0.getScheme().equalsIgnoreCase("jar"))
      .findFirst()
      .orElseThrow(() -> new IllegalStateException("No jar file system provider found"));
   private static Consumer<String> p = $$0 -> {
   };

   public static <K, V> Collector<Entry<? extends K, ? extends V>, ?, Map<K, V>> a() {
      return Collectors.toMap(Entry::getKey, Entry::getValue);
   }

   public static <T> Collector<T, ?, List<T>> b() {
      return Collectors.toCollection(Lists::newArrayList);
   }

   public static <T extends Comparable<T>> String a(dvd<T> $$0, Object $$1) {
      return $$0.a((T)$$1);
   }

   public static String a(String $$0, @Nullable alb $$1) {
      return $$1 == null ? $$0 + ".unregistered_sadface" : $$0 + "." + $$1.b() + "." + $$1.a().replace('/', '.');
   }

   public static long c() {
      return d() / 1000000L;
   }

   public static long d() {
      return c.getAsLong();
   }

   public static long e() {
      return Instant.now().toEpochMilli();
   }

   public static String f() {
      return n.format(ZonedDateTime.now());
   }

   private static ExecutorService c(String $$0) {
      int $$1 = azc.a(Runtime.getRuntime().availableProcessors() - 1, 1, p());
      ExecutorService $$2;
      if ($$1 <= 0) {
         $$2 = MoreExecutors.newDirectExecutorService();
      } else {
         AtomicInteger $$3 = new AtomicInteger(1);
         $$2 = new ForkJoinPool($$1, $$2x -> {
            ForkJoinWorkerThread $$3x = new ForkJoinWorkerThread($$2x) {
               @Override
               protected void onTermination(Throwable $$0) {
                  if ($$0 != null) {
                     ad.g.warn("{} died", this.getName(), $$0);
                  } else {
                     ad.g.debug("{} shutdown", this.getName());
                  }

                  super.onTermination($$0);
               }
            };
            $$3x.setName("Worker-" + $$0 + "-" + $$3.getAndIncrement());
            return $$3x;
         }, ad::a, true);
      }

      return $$2;
   }

   private static int p() {
      String $$0 = System.getProperty("max.bg.threads");
      if ($$0 != null) {
         try {
            int $$1 = Integer.parseInt($$0);
            if ($$1 >= 1 && $$1 <= 255) {
               return $$1;
            }

            g.error("Wrong {} property value '{}'. Should be an integer value between 1 and {}.", new Object[]{"max.bg.threads", $$0, 255});
         } catch (NumberFormatException var2) {
            g.error("Could not parse {} property value '{}'. Should be an integer value between 1 and {}.", new Object[]{"max.bg.threads", $$0, 255});
         }
      }

      return 255;
   }

   public static ExecutorService g() {
      return k;
   }

   public static ExecutorService h() {
      return l;
   }

   public static ExecutorService i() {
      return m;
   }

   public static void j() {
      a(k);
      a(l);
   }

   private static void a(ExecutorService $$0) {
      $$0.shutdown();

      boolean $$1;
      try {
         $$1 = $$0.awaitTermination(3L, TimeUnit.SECONDS);
      } catch (InterruptedException var3) {
         $$1 = false;
      }

      if (!$$1) {
         $$0.shutdownNow();
      }
   }

   private static ExecutorService a(String $$0, boolean $$1) {
      AtomicInteger $$2 = new AtomicInteger(1);
      return Executors.newCachedThreadPool($$3 -> {
         Thread $$4 = new Thread($$3);
         $$4.setName($$0 + $$2.getAndIncrement());
         $$4.setDaemon($$1);
         $$4.setUncaughtExceptionHandler(ad::a);
         return $$4;
      });
   }

   public static void a(Throwable $$0) {
      throw $$0 instanceof RuntimeException ? (RuntimeException)$$0 : new RuntimeException($$0);
   }

   private static void a(Thread $$0, Throwable $$1) {
      b($$1);
      if ($$1 instanceof CompletionException) {
         $$1 = $$1.getCause();
      }

      if ($$1 instanceof z $$2) {
         ald.a($$2.a().a(y.a));
         System.exit(-1);
      }

      g.error(String.format(Locale.ROOT, "Caught exception in thread %s", $$0), $$1);
   }

   @Nullable
   public static Type<?> a(TypeReference $$0, String $$1) {
      return !ab.aV ? null : b($$0, $$1);
   }

   @Nullable
   private static Type<?> b(TypeReference $$0, String $$1) {
      Type<?> $$2 = null;

      try {
         $$2 = bam.a().getSchema(DataFixUtils.makeKey(ab.b().d().c())).getChoiceType($$0, $$1);
      } catch (IllegalArgumentException var4) {
         g.error("No data fixer registered for {}", $$1);
         if (ab.aW) {
            throw var4;
         }
      }

      return $$2;
   }

   public static Runnable a(String $$0, Runnable $$1) {
      return ab.aW ? () -> {
         Thread $$2 = Thread.currentThread();
         String $$3 = $$2.getName();
         $$2.setName($$0);

         try {
            $$1.run();
         } finally {
            $$2.setName($$3);
         }
      } : $$1;
   }

   public static <V> Supplier<V> a(String $$0, Supplier<V> $$1) {
      return ab.aW ? () -> {
         Thread $$2 = Thread.currentThread();
         String $$3 = $$2.getName();
         $$2.setName($$0);

         Object var4;
         try {
            var4 = $$1.get();
         } finally {
            $$2.setName($$3);
         }

         return (V)var4;
      } : $$1;
   }

   public static <T> String a(ka<T> $$0, T $$1) {
      alb $$2 = $$0.b($$1);
      return $$2 == null ? "[unregistered]" : $$2.toString();
   }

   public static <T> Predicate<T> k() {
      return $$0 -> true;
   }

   public static <T> Predicate<T> a(Predicate<? super T> $$0) {
      return (Predicate<T>)$$0;
   }

   public static <T> Predicate<T> a(Predicate<? super T> $$0, Predicate<? super T> $$1) {
      return $$2 -> $$0.test($$2) && $$1.test($$2);
   }

   public static <T> Predicate<T> a(Predicate<? super T> $$0, Predicate<? super T> $$1, Predicate<? super T> $$2) {
      return $$3 -> $$0.test($$3) && $$1.test($$3) && $$2.test($$3);
   }

   public static <T> Predicate<T> a(Predicate<? super T> $$0, Predicate<? super T> $$1, Predicate<? super T> $$2, Predicate<? super T> $$3) {
      return $$4 -> $$0.test($$4) && $$1.test($$4) && $$2.test($$4) && $$3.test($$4);
   }

   public static <T> Predicate<T> a(
      Predicate<? super T> $$0, Predicate<? super T> $$1, Predicate<? super T> $$2, Predicate<? super T> $$3, Predicate<? super T> $$4
   ) {
      return $$5 -> $$0.test($$5) && $$1.test($$5) && $$2.test($$5) && $$3.test($$5) && $$4.test($$5);
   }

   @SafeVarargs
   public static <T> Predicate<T> a(Predicate<? super T>... $$0) {
      return $$1 -> {
         for (Predicate<? super T> $$2 : $$0) {
            if (!$$2.test($$1)) {
               return false;
            }
         }

         return true;
      };
   }

   public static <T> Predicate<T> a(List<? extends Predicate<? super T>> $$0) {
      return switch ($$0.size()) {
         case 0 -> k();
         case 1 -> a((Predicate<? super T>)$$0.get(0));
         case 2 -> a((Predicate<? super T>)$$0.get(0), (Predicate<? super T>)$$0.get(1));
         case 3 -> a((Predicate<? super T>)$$0.get(0), (Predicate<? super T>)$$0.get(1), (Predicate<? super T>)$$0.get(2));
         case 4 -> a((Predicate<? super T>)$$0.get(0), (Predicate<? super T>)$$0.get(1), (Predicate<? super T>)$$0.get(2), (Predicate<? super T>)$$0.get(3));
         case 5 -> a(
         (Predicate<? super T>)$$0.get(0),
         (Predicate<? super T>)$$0.get(1),
         (Predicate<? super T>)$$0.get(2),
         (Predicate<? super T>)$$0.get(3),
         (Predicate<? super T>)$$0.get(4)
      );
         default -> {
            Predicate<? super T>[] $$1 = $$0.toArray(Predicate[]::new);
            yield a($$1);
         }
      };
   }

   public static <T> Predicate<T> l() {
      return $$0 -> false;
   }

   public static <T> Predicate<T> b(Predicate<? super T> $$0) {
      return (Predicate<T>)$$0;
   }

   public static <T> Predicate<T> b(Predicate<? super T> $$0, Predicate<? super T> $$1) {
      return $$2 -> $$0.test($$2) || $$1.test($$2);
   }

   public static <T> Predicate<T> b(Predicate<? super T> $$0, Predicate<? super T> $$1, Predicate<? super T> $$2) {
      return $$3 -> $$0.test($$3) || $$1.test($$3) || $$2.test($$3);
   }

   public static <T> Predicate<T> b(Predicate<? super T> $$0, Predicate<? super T> $$1, Predicate<? super T> $$2, Predicate<? super T> $$3) {
      return $$4 -> $$0.test($$4) || $$1.test($$4) || $$2.test($$4) || $$3.test($$4);
   }

   public static <T> Predicate<T> b(
      Predicate<? super T> $$0, Predicate<? super T> $$1, Predicate<? super T> $$2, Predicate<? super T> $$3, Predicate<? super T> $$4
   ) {
      return $$5 -> $$0.test($$5) || $$1.test($$5) || $$2.test($$5) || $$3.test($$5) || $$4.test($$5);
   }

   @SafeVarargs
   public static <T> Predicate<T> b(Predicate<? super T>... $$0) {
      return $$1 -> {
         for (Predicate<? super T> $$2 : $$0) {
            if ($$2.test($$1)) {
               return true;
            }
         }

         return false;
      };
   }

   public static <T> Predicate<T> b(List<? extends Predicate<? super T>> $$0) {
      return switch ($$0.size()) {
         case 0 -> l();
         case 1 -> b((Predicate<? super T>)$$0.get(0));
         case 2 -> b((Predicate<? super T>)$$0.get(0), (Predicate<? super T>)$$0.get(1));
         case 3 -> b((Predicate<? super T>)$$0.get(0), (Predicate<? super T>)$$0.get(1), (Predicate<? super T>)$$0.get(2));
         case 4 -> b((Predicate<? super T>)$$0.get(0), (Predicate<? super T>)$$0.get(1), (Predicate<? super T>)$$0.get(2), (Predicate<? super T>)$$0.get(3));
         case 5 -> b(
         (Predicate<? super T>)$$0.get(0),
         (Predicate<? super T>)$$0.get(1),
         (Predicate<? super T>)$$0.get(2),
         (Predicate<? super T>)$$0.get(3),
         (Predicate<? super T>)$$0.get(4)
      );
         default -> {
            Predicate<? super T>[] $$1 = $$0.toArray(Predicate[]::new);
            yield b($$1);
         }
      };
   }

   public static <T> boolean a(int $$0, int $$1, List<T> $$2) {
      if ($$0 == 1) {
         return true;
      } else {
         int $$3 = $$0 / 2;

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            for (int $$5 = 0; $$5 < $$3; $$5++) {
               int $$6 = $$0 - 1 - $$5;
               T $$7 = $$2.get($$5 + $$4 * $$0);
               T $$8 = $$2.get($$6 + $$4 * $$0);
               if (!$$7.equals($$8)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public static ad.a m() {
      String $$0 = System.getProperty("os.name").toLowerCase(Locale.ROOT);
      if ($$0.contains("win")) {
         return ad.a.c;
      } else if ($$0.contains("mac")) {
         return ad.a.d;
      } else if ($$0.contains("solaris")) {
         return ad.a.b;
      } else if ($$0.contains("sunos")) {
         return ad.a.b;
      } else if ($$0.contains("linux")) {
         return ad.a.a;
      } else {
         return $$0.contains("unix") ? ad.a.a : ad.a.e;
      }
   }

   public static URI a(String $$0) throws URISyntaxException {
      URI $$1 = new URI($$0);
      String $$2 = $$1.getScheme();
      if ($$2 == null) {
         throw new URISyntaxException($$0, "Missing protocol in URI: " + $$0);
      } else {
         String $$3 = $$2.toLowerCase(Locale.ROOT);
         if (!o.contains($$3)) {
            throw new URISyntaxException($$0, "Unsupported protocol in URI: " + $$0);
         } else {
            return $$1;
         }
      }
   }

   public static Stream<String> n() {
      RuntimeMXBean $$0 = ManagementFactory.getRuntimeMXBean();
      return $$0.getInputArguments().stream().filter($$0x -> $$0x.startsWith("-X"));
   }

   public static <T> T c(List<T> $$0) {
      return $$0.get($$0.size() - 1);
   }

   public static <T> T a(Iterable<T> $$0, @Nullable T $$1) {
      Iterator<T> $$2 = $$0.iterator();
      T $$3 = $$2.next();
      if ($$1 != null) {
         T $$4 = $$3;

         while ($$4 != $$1) {
            if ($$2.hasNext()) {
               $$4 = $$2.next();
            }
         }

         if ($$2.hasNext()) {
            return $$2.next();
         }
      }

      return $$3;
   }

   public static <T> T b(Iterable<T> $$0, @Nullable T $$1) {
      Iterator<T> $$2 = $$0.iterator();
      T $$3 = null;

      while ($$2.hasNext()) {
         T $$4 = $$2.next();
         if ($$4 == $$1) {
            if ($$3 == null) {
               $$3 = (T)($$2.hasNext() ? Iterators.getLast($$2) : $$1);
            }
            break;
         }

         $$3 = $$4;
      }

      return $$3;
   }

   public static <T> T a(Supplier<T> $$0) {
      return $$0.get();
   }

   public static <T> T a(T $$0, Consumer<? super T> $$1) {
      $$1.accept($$0);
      return $$0;
   }

   public static <V> CompletableFuture<List<V>> d(List<? extends CompletableFuture<V>> $$0) {
      if ($$0.isEmpty()) {
         return CompletableFuture.completedFuture(List.of());
      } else if ($$0.size() == 1) {
         return $$0.get(0).thenApply(List::of);
      } else {
         CompletableFuture<Void> $$1 = CompletableFuture.allOf($$0.toArray(new CompletableFuture[0]));
         return $$1.thenApply($$1x -> $$0.stream().map(CompletableFuture::join).toList());
      }
   }

   public static <V> CompletableFuture<List<V>> e(List<? extends CompletableFuture<? extends V>> $$0) {
      CompletableFuture<List<V>> $$1 = new CompletableFuture<>();
      return a($$0, $$1::completeExceptionally).applyToEither($$1, Function.identity());
   }

   public static <V> CompletableFuture<List<V>> f(List<? extends CompletableFuture<? extends V>> $$0) {
      CompletableFuture<List<V>> $$1 = new CompletableFuture<>();
      return a($$0, $$2 -> {
         if ($$1.completeExceptionally($$2)) {
            for (CompletableFuture<? extends V> $$3 : $$0) {
               $$3.cancel(true);
            }
         }
      }).applyToEither($$1, Function.identity());
   }

   private static <V> CompletableFuture<List<V>> a(List<? extends CompletableFuture<? extends V>> $$0, Consumer<Throwable> $$1) {
      List<V> $$2 = Lists.newArrayListWithCapacity($$0.size());
      CompletableFuture<?>[] $$3 = new CompletableFuture[$$0.size()];
      $$0.forEach($$3x -> {
         int $$4 = $$2.size();
         $$2.add(null);
         $$3[$$4] = $$3x.whenComplete(($$3xx, $$4x) -> {
            if ($$4x != null) {
               $$1.accept($$4x);
            } else {
               $$2.set($$4, (V)$$3xx);
            }
         });
      });
      return CompletableFuture.allOf($$3).thenApply($$1x -> $$2);
   }

   public static <T> Optional<T> a(Optional<T> $$0, Consumer<T> $$1, Runnable $$2) {
      if ($$0.isPresent()) {
         $$1.accept($$0.get());
      } else {
         $$2.run();
      }

      return $$0;
   }

   public static <T> Supplier<T> a(Supplier<T> $$0, Supplier<String> $$1) {
      return $$0;
   }

   public static Runnable a(Runnable $$0, Supplier<String> $$1) {
      return $$0;
   }

   public static void b(String $$0) {
      g.error($$0);
      if (ab.aW) {
         d($$0);
      }
   }

   public static void a(String $$0, Throwable $$1) {
      g.error($$0, $$1);
      if (ab.aW) {
         d($$0);
      }
   }

   public static <T extends Throwable> T b(T $$0) {
      if (ab.aW) {
         g.error("Trying to throw a fatal exception, pausing in IDE", $$0);
         d($$0.getMessage());
      }

      return $$0;
   }

   public static void a(Consumer<String> $$0) {
      p = $$0;
   }

   private static void d(String $$0) {
      Instant $$1 = Instant.now();
      g.warn("Did you remember to set a breakpoint here?");
      boolean $$2 = Duration.between($$1, Instant.now()).toMillis() > 500L;
      if (!$$2) {
         p.accept($$0);
      }
   }

   public static String c(Throwable $$0) {
      if ($$0.getCause() != null) {
         return c($$0.getCause());
      } else {
         return $$0.getMessage() != null ? $$0.getMessage() : $$0.toString();
      }
   }

   public static <T> T a(T[] $$0, azk $$1) {
      return $$0[$$1.a($$0.length)];
   }

   public static int a(int[] $$0, azk $$1) {
      return $$0[$$1.a($$0.length)];
   }

   public static <T> T a(List<T> $$0, azk $$1) {
      return $$0.get($$1.a($$0.size()));
   }

   public static <T> Optional<T> b(List<T> $$0, azk $$1) {
      return $$0.isEmpty() ? Optional.empty() : Optional.of(a($$0, $$1));
   }

   private static BooleanSupplier a(final Path $$0, final Path $$1) {
      return new BooleanSupplier() {
         @Override
         public boolean getAsBoolean() {
            try {
               Files.move($$0, $$1);
               return true;
            } catch (IOException var2) {
               ad.g.error("Failed to rename", var2);
               return false;
            }
         }

         @Override
         public String toString() {
            return "rename " + $$0 + " to " + $$1;
         }
      };
   }

   private static BooleanSupplier a(final Path $$0) {
      return new BooleanSupplier() {
         @Override
         public boolean getAsBoolean() {
            try {
               Files.deleteIfExists($$0);
               return true;
            } catch (IOException var2) {
               ad.g.warn("Failed to delete", var2);
               return false;
            }
         }

         @Override
         public String toString() {
            return "delete old " + $$0;
         }
      };
   }

   private static BooleanSupplier b(final Path $$0) {
      return new BooleanSupplier() {
         @Override
         public boolean getAsBoolean() {
            return !Files.exists($$0);
         }

         @Override
         public String toString() {
            return "verify that " + $$0 + " is deleted";
         }
      };
   }

   private static BooleanSupplier c(final Path $$0) {
      return new BooleanSupplier() {
         @Override
         public boolean getAsBoolean() {
            return Files.isRegularFile($$0);
         }

         @Override
         public String toString() {
            return "verify that " + $$0 + " is present";
         }
      };
   }

   private static boolean a(BooleanSupplier... $$0) {
      for (BooleanSupplier $$1 : $$0) {
         if (!$$1.getAsBoolean()) {
            g.warn("Failed to execute {}", $$1);
            return false;
         }
      }

      return true;
   }

   private static boolean a(int $$0, String $$1, BooleanSupplier... $$2) {
      for (int $$3 = 0; $$3 < $$0; $$3++) {
         if (a($$2)) {
            return true;
         }

         g.error("Failed to {}, retrying {}/{}", new Object[]{$$1, $$3, $$0});
      }

      g.error("Failed to {}, aborting, progress might be lost", $$1);
      return false;
   }

   public static void a(Path $$0, Path $$1, Path $$2) {
      a($$0, $$1, $$2, false);
   }

   public static boolean a(Path $$0, Path $$1, Path $$2, boolean $$3) {
      if (Files.exists($$0) && !a(10, "create backup " + $$2, a($$2), a($$0, $$2), c($$2))) {
         return false;
      } else if (!a(10, "remove old " + $$0, a($$0), b($$0))) {
         return false;
      } else if (!a(10, "replace " + $$0 + " with " + $$1, a($$1, $$0), c($$0)) && !$$3) {
         a(10, "restore " + $$0 + " from " + $$2, a($$2, $$0), c($$0));
         return false;
      } else {
         return true;
      }
   }

   public static int a(String $$0, int $$1, int $$2) {
      int $$3 = $$0.length();
      if ($$2 >= 0) {
         for (int $$4 = 0; $$1 < $$3 && $$4 < $$2; $$4++) {
            if (Character.isHighSurrogate($$0.charAt($$1++)) && $$1 < $$3 && Character.isLowSurrogate($$0.charAt($$1))) {
               $$1++;
            }
         }
      } else {
         for (int $$5 = $$2; $$1 > 0 && $$5 < 0; $$5++) {
            $$1--;
            if (Character.isLowSurrogate($$0.charAt($$1)) && $$1 > 0 && Character.isHighSurrogate($$0.charAt($$1 - 1))) {
               $$1--;
            }
         }
      }

      return $$1;
   }

   public static Consumer<String> a(String $$0, Consumer<String> $$1) {
      return $$2 -> $$1.accept($$0 + $$2);
   }

   public static DataResult<int[]> a(IntStream $$0, int $$1) {
      int[] $$2 = $$0.limit((long)($$1 + 1)).toArray();
      if ($$2.length != $$1) {
         Supplier<String> $$3 = () -> "Input is not a list of " + $$1 + " ints";
         return $$2.length >= $$1 ? DataResult.error($$3, Arrays.copyOf($$2, $$1)) : DataResult.error($$3);
      } else {
         return DataResult.success($$2);
      }
   }

   public static DataResult<long[]> a(LongStream $$0, int $$1) {
      long[] $$2 = $$0.limit((long)($$1 + 1)).toArray();
      if ($$2.length != $$1) {
         Supplier<String> $$3 = () -> "Input is not a list of " + $$1 + " longs";
         return $$2.length >= $$1 ? DataResult.error($$3, Arrays.copyOf($$2, $$1)) : DataResult.error($$3);
      } else {
         return DataResult.success($$2);
      }
   }

   public static <T> DataResult<List<T>> a(List<T> $$0, int $$1) {
      if ($$0.size() != $$1) {
         Supplier<String> $$2 = () -> "Input is not a list of " + $$1 + " elements";
         return $$0.size() >= $$1 ? DataResult.error($$2, $$0.subList(0, $$1)) : DataResult.error($$2);
      } else {
         return DataResult.success($$0);
      }
   }

   public static void o() {
      Thread $$0 = new Thread("Timer hack thread") {
         @Override
         public void run() {
            while (true) {
               try {
                  Thread.sleep(2147483647L);
               } catch (InterruptedException var2) {
                  ad.g.warn("Timer hack thread interrupted, that really should not happen");
                  return;
               }
            }
         }
      };
      $$0.setDaemon(true);
      $$0.setUncaughtExceptionHandler(new r(g));
      $$0.start();
   }

   public static void b(Path $$0, Path $$1, Path $$2) throws IOException {
      Path $$3 = $$0.relativize($$2);
      Path $$4 = $$1.resolve($$3);
      Files.copy($$2, $$4);
   }

   public static String a(String $$0, m $$1) {
      return $$0.toLowerCase(Locale.ROOT).chars().mapToObj($$1x -> $$1.test((char)$$1x) ? Character.toString((char)$$1x) : "_").collect(Collectors.joining());
   }

   public static <K, V> azs<K, V> a(Function<K, V> $$0) {
      return new azs<>($$0);
   }

   public static <T, R> Function<T, R> b(final Function<T, R> $$0) {
      return new Function<T, R>() {
         private final Map<T, R> b = new ConcurrentHashMap<>();

         @Override
         public R apply(T $$0x) {
            return this.b.computeIfAbsent($$0, $$0);
         }

         @Override
         public String toString() {
            return "memoize/1[function=" + $$0 + ", size=" + this.b.size() + "]";
         }
      };
   }

   public static <T, U, R> BiFunction<T, U, R> a(final BiFunction<T, U, R> $$0) {
      return new BiFunction<T, U, R>() {
         private final Map<Pair<T, U>, R> b = new ConcurrentHashMap<>();

         @Override
         public R apply(T $$0x, U $$1) {
            return this.b.computeIfAbsent(Pair.of($$0, $$1), $$1x -> $$0.apply((T)$$1x.getFirst(), (U)$$1x.getSecond()));
         }

         @Override
         public String toString() {
            return "memoize/2[function=" + $$0 + ", size=" + this.b.size() + "]";
         }
      };
   }

   public static <T> List<T> a(Stream<T> $$0, azk $$1) {
      ObjectArrayList<T> $$2 = $$0.collect(ObjectArrayList.toList());
      c($$2, $$1);
      return $$2;
   }

   public static IntArrayList a(IntStream $$0, azk $$1) {
      IntArrayList $$2 = IntArrayList.wrap($$0.toArray());
      int $$3 = $$2.size();

      for (int $$4 = $$3; $$4 > 1; $$4--) {
         int $$5 = $$1.a($$4);
         $$2.set($$4 - 1, $$2.set($$5, $$2.getInt($$4 - 1)));
      }

      return $$2;
   }

   public static <T> List<T> b(T[] $$0, azk $$1) {
      ObjectArrayList<T> $$2 = new ObjectArrayList($$0);
      c($$2, $$1);
      return $$2;
   }

   public static <T> List<T> a(ObjectArrayList<T> $$0, azk $$1) {
      ObjectArrayList<T> $$2 = new ObjectArrayList($$0);
      c($$2, $$1);
      return $$2;
   }

   public static <T> void c(List<T> $$0, azk $$1) {
      int $$2 = $$0.size();

      for (int $$3 = $$2; $$3 > 1; $$3--) {
         int $$4 = $$1.a($$3);
         $$0.set($$3 - 1, $$0.set($$4, $$0.get($$3 - 1)));
      }
   }

   public static <T> CompletableFuture<T> c(Function<Executor, CompletableFuture<T>> $$0) {
      return a($$0, CompletableFuture::isDone);
   }

   public static <T> T a(Function<Executor, T> $$0, Predicate<T> $$1) {
      BlockingQueue<Runnable> $$2 = new LinkedBlockingQueue<>();
      T $$3 = $$0.apply($$2::add);

      while (!$$1.test($$3)) {
         try {
            Runnable $$4 = $$2.poll(100L, TimeUnit.MILLISECONDS);
            if ($$4 != null) {
               $$4.run();
            }
         } catch (InterruptedException var5) {
            g.warn("Interrupted wait");
            break;
         }
      }

      int $$6 = $$2.size();
      if ($$6 > 0) {
         g.warn("Tasks left in queue: {}", $$6);
      }

      return $$3;
   }

   public static <T> ToIntFunction<T> g(List<T> $$0) {
      int $$1 = $$0.size();
      if ($$1 < 8) {
         return $$0::indexOf;
      } else {
         Object2IntMap<T> $$2 = new Object2IntOpenHashMap($$1);
         $$2.defaultReturnValue(-1);

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$2.put($$0.get($$3), $$3);
         }

         return $$2;
      }
   }

   public static <T> ToIntFunction<T> h(List<T> $$0) {
      int $$1 = $$0.size();
      if ($$1 < 8) {
         ReferenceList<T> $$2 = new ReferenceImmutableList($$0);
         return $$2::indexOf;
      } else {
         Reference2IntMap<T> $$3 = new Reference2IntOpenHashMap($$1);
         $$3.defaultReturnValue(-1);

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            $$3.put($$0.get($$4), $$4);
         }

         return $$3;
      }
   }

   public static <A, B> Typed<B> a(Typed<A> $$0, Type<B> $$1, UnaryOperator<Dynamic<?>> $$2) {
      Dynamic<?> $$3 = (Dynamic<?>)$$0.write().getOrThrow();
      return a($$1, $$2.apply($$3), true);
   }

   public static <T> Typed<T> a(Type<T> $$0, Dynamic<?> $$1) {
      return a($$0, $$1, false);
   }

   public static <T> Typed<T> a(Type<T> $$0, Dynamic<?> $$1, boolean $$2) {
      DataResult<Typed<T>> $$3 = $$0.readTyped($$1).map(Pair::getFirst);

      try {
         return $$2 ? (Typed)$$3.getPartialOrThrow(IllegalStateException::new) : (Typed)$$3.getOrThrow(IllegalStateException::new);
      } catch (IllegalStateException var7) {
         o $$5 = o.a(var7, "Reading type");
         p $$6 = $$5.a("Info");
         $$6.a("Data", $$1);
         $$6.a("Type", $$0);
         throw new z($$5);
      }
   }

   public static <T> List<T> a(List<T> $$0, T $$1) {
      return ImmutableList.builderWithExpectedSize($$0.size() + 1).addAll($$0).add($$1).build();
   }

   public static <T> List<T> a(T $$0, List<T> $$1) {
      return ImmutableList.builderWithExpectedSize($$1.size() + 1).add($$0).addAll($$1).build();
   }

   public static <K, V> Map<K, V> a(Map<K, V> $$0, K $$1, V $$2) {
      return ImmutableMap.builderWithExpectedSize($$0.size() + 1).putAll($$0).put($$1, $$2).buildKeepingLast();
   }

   public static enum a {
      a("linux"),
      b("solaris"),
      c("windows") {
         @Override
         protected String[] b(URI $$0) {
            return new String[]{"rundll32", "url.dll,FileProtocolHandler", $$0.toString()};
         }
      },
      d("mac") {
         @Override
         protected String[] b(URI $$0) {
            return new String[]{"open", $$0.toString()};
         }
      },
      e("unknown");

      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      public void a(URI $$0) {
         try {
            Process $$1 = AccessController.doPrivileged((PrivilegedExceptionAction<Process>)(() -> Runtime.getRuntime().exec(this.b($$0))));
            $$1.getInputStream().close();
            $$1.getErrorStream().close();
            $$1.getOutputStream().close();
         } catch (IOException | PrivilegedActionException var3) {
            ad.g.error("Couldn't open location '{}'", $$0, var3);
         }
      }

      public void a(File $$0) {
         this.a($$0.toURI());
      }

      public void a(Path $$0) {
         this.a($$0.toUri());
      }

      protected String[] b(URI $$0) {
         String $$1 = $$0.toString();
         if ("file".equals($$0.getScheme())) {
            $$1 = $$1.replace("file:", "file://");
         }

         return new String[]{"xdg-open", $$1};
      }

      public void a(String $$0) {
         try {
            this.a(new URI($$0));
         } catch (IllegalArgumentException | URISyntaxException var3) {
            ad.g.error("Couldn't open uri '{}'", $$0, var3);
         }
      }

      public String a() {
         return this.f;
      }
   }
}
