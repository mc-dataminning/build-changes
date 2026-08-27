import com.google.common.base.Ticker;
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
import com.mojang.serialization.DataResult.PartialResult;
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
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
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

public class ac {
   static final Logger f = LogUtils.getLogger();
   private static final int g = 255;
   private static final int h = 10;
   private static final String i = "max.bg.threads";
   private static final ExecutorService j = c("Main");
   private static final ExecutorService k = a("IO-Worker-", false);
   private static final ExecutorService l = a("Download-", true);
   private static final DateTimeFormatter m = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH.mm.ss", Locale.ROOT);
   private static final int n = 8;
   public static final long a = 1000000L;
   public static axu.a b = System::nanoTime;
   public static final Ticker c = new Ticker() {
      public long read() {
         return ac.b.getAsLong();
      }
   };
   public static final UUID d = new UUID(0L, 0L);
   public static final FileSystemProvider e = FileSystemProvider.installedProviders()
      .stream()
      .filter($$0 -> $$0.getScheme().equalsIgnoreCase("jar"))
      .findFirst()
      .orElseThrow(() -> new IllegalStateException("No jar file system provider found"));
   private static Consumer<String> o = $$0 -> {
   };

   public static <K, V> Collector<Entry<? extends K, ? extends V>, ?, Map<K, V>> a() {
      return Collectors.toMap(Entry::getKey, Entry::getValue);
   }

   public static <T extends Comparable<T>> String a(doc<T> $$0, Object $$1) {
      return $$0.a((T)$$1);
   }

   public static String a(String $$0, @Nullable ajh $$1) {
      return $$1 == null ? $$0 + ".unregistered_sadface" : $$0 + "." + $$1.b() + "." + $$1.a().replace('/', '.');
   }

   public static long b() {
      return c() / 1000000L;
   }

   public static long c() {
      return b.getAsLong();
   }

   public static long d() {
      return Instant.now().toEpochMilli();
   }

   public static String e() {
      return m.format(ZonedDateTime.now());
   }

   private static ExecutorService c(String $$0) {
      int $$1 = aww.a(Runtime.getRuntime().availableProcessors() - 1, 1, m());
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
                     ac.f.warn("{} died", this.getName(), $$0);
                  } else {
                     ac.f.debug("{} shutdown", this.getName());
                  }

                  super.onTermination($$0);
               }
            };
            $$3x.setName("Worker-" + $$0 + "-" + $$3.getAndIncrement());
            return $$3x;
         }, ac::a, true);
      }

      return $$2;
   }

   private static int m() {
      String $$0 = System.getProperty("max.bg.threads");
      if ($$0 != null) {
         try {
            int $$1 = Integer.parseInt($$0);
            if ($$1 >= 1 && $$1 <= 255) {
               return $$1;
            }

            f.error("Wrong {} property value '{}'. Should be an integer value between 1 and {}.", new Object[]{"max.bg.threads", $$0, 255});
         } catch (NumberFormatException var2) {
            f.error("Could not parse {} property value '{}'. Should be an integer value between 1 and {}.", new Object[]{"max.bg.threads", $$0, 255});
         }
      }

      return 255;
   }

   public static ExecutorService f() {
      return j;
   }

   public static ExecutorService g() {
      return k;
   }

   public static ExecutorService h() {
      return l;
   }

   public static void i() {
      a(j);
      a(k);
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
         $$4.setUncaughtExceptionHandler(ac::a);
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

      if ($$1 instanceof y $$2) {
         ajj.a($$2.a().e());
         System.exit(-1);
      }

      f.error(String.format(Locale.ROOT, "Caught exception in thread %s", $$0), $$1);
   }

   @Nullable
   public static Type<?> a(TypeReference $$0, String $$1) {
      return !aa.aV ? null : b($$0, $$1);
   }

   @Nullable
   private static Type<?> b(TypeReference $$0, String $$1) {
      Type<?> $$2 = null;

      try {
         $$2 = ayd.a().getSchema(DataFixUtils.makeKey(aa.b().d().c())).getChoiceType($$0, $$1);
      } catch (IllegalArgumentException var4) {
         f.error("No data fixer registered for {}", $$1);
         if (aa.aW) {
            throw var4;
         }
      }

      return $$2;
   }

   public static Runnable a(String $$0, Runnable $$1) {
      return aa.aW ? () -> {
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
      return aa.aW ? () -> {
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

   public static <T> Predicate<T> a(List<? extends Predicate<T>> $$0) {
      List<Predicate<T>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> $$0x -> true;
         case 1 -> (Predicate)$$1.get(0);
         case 2 -> $$1.get(0).and($$1.get(1));
         default -> $$1x -> {
         for (Predicate<T> $$2 : $$1) {
            if (!$$2.test((T)$$1x)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static <T> Predicate<T> b(List<? extends Predicate<T>> $$0) {
      List<Predicate<T>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> $$0x -> false;
         case 1 -> (Predicate)$$1.get(0);
         case 2 -> $$1.get(0).or($$1.get(1));
         default -> $$1x -> {
         for (Predicate<T> $$2 : $$1) {
            if ($$2.test((T)$$1x)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   public static ac.a j() {
      String $$0 = System.getProperty("os.name").toLowerCase(Locale.ROOT);
      if ($$0.contains("win")) {
         return ac.a.c;
      } else if ($$0.contains("mac")) {
         return ac.a.d;
      } else if ($$0.contains("solaris")) {
         return ac.a.b;
      } else if ($$0.contains("sunos")) {
         return ac.a.b;
      } else if ($$0.contains("linux")) {
         return ac.a.a;
      } else {
         return $$0.contains("unix") ? ac.a.a : ac.a.e;
      }
   }

   public static Stream<String> k() {
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

   public static void a(String $$0) {
      f.error($$0);
      if (aa.aW) {
         d($$0);
      }
   }

   public static void a(String $$0, Throwable $$1) {
      f.error($$0, $$1);
      if (aa.aW) {
         d($$0);
      }
   }

   public static <T extends Throwable> T b(T $$0) {
      if (aa.aW) {
         f.error("Trying to throw a fatal exception, pausing in IDE", $$0);
         d($$0.getMessage());
      }

      return $$0;
   }

   public static void a(Consumer<String> $$0) {
      o = $$0;
   }

   private static void d(String $$0) {
      Instant $$1 = Instant.now();
      f.warn("Did you remember to set a breakpoint here?");
      boolean $$2 = Duration.between($$1, Instant.now()).toMillis() > 500L;
      if (!$$2) {
         o.accept($$0);
      }
   }

   public static String c(Throwable $$0) {
      if ($$0.getCause() != null) {
         return c($$0.getCause());
      } else {
         return $$0.getMessage() != null ? $$0.getMessage() : $$0.toString();
      }
   }

   public static <T> T a(T[] $$0, axd $$1) {
      return $$0[$$1.a($$0.length)];
   }

   public static int a(int[] $$0, axd $$1) {
      return $$0[$$1.a($$0.length)];
   }

   public static <T> T a(List<T> $$0, axd $$1) {
      return $$0.get($$1.a($$0.size()));
   }

   public static <T> Optional<T> b(List<T> $$0, axd $$1) {
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
               ac.f.error("Failed to rename", var2);
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
               ac.f.warn("Failed to delete", var2);
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
            f.warn("Failed to execute {}", $$1);
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

         f.error("Failed to {}, retrying {}/{}", new Object[]{$$1, $$3, $$0});
      }

      f.error("Failed to {}, aborting, progress might be lost", $$1);
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

   public static void l() {
      Thread $$0 = new Thread("Timer hack thread") {
         @Override
         public void run() {
            while (true) {
               try {
                  Thread.sleep(2147483647L);
               } catch (InterruptedException var2) {
                  ac.f.warn("Timer hack thread interrupted, that really should not happen");
                  return;
               }
            }
         }
      };
      $$0.setDaemon(true);
      $$0.setUncaughtExceptionHandler(new r(f));
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

   public static <K, V> axl<K, V> a(Function<K, V> $$0) {
      return new axl<>($$0);
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

   public static <T> List<T> a(Stream<T> $$0, axd $$1) {
      ObjectArrayList<T> $$2 = $$0.collect(ObjectArrayList.toList());
      c($$2, $$1);
      return $$2;
   }

   public static IntArrayList a(IntStream $$0, axd $$1) {
      IntArrayList $$2 = IntArrayList.wrap($$0.toArray());
      int $$3 = $$2.size();

      for (int $$4 = $$3; $$4 > 1; $$4--) {
         int $$5 = $$1.a($$4);
         $$2.set($$4 - 1, $$2.set($$5, $$2.getInt($$4 - 1)));
      }

      return $$2;
   }

   public static <T> List<T> b(T[] $$0, axd $$1) {
      ObjectArrayList<T> $$2 = new ObjectArrayList($$0);
      c($$2, $$1);
      return $$2;
   }

   public static <T> List<T> a(ObjectArrayList<T> $$0, axd $$1) {
      ObjectArrayList<T> $$2 = new ObjectArrayList($$0);
      c($$2, $$1);
      return $$2;
   }

   public static <T> void c(List<T> $$0, axd $$1) {
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
            f.warn("Interrupted wait");
            break;
         }
      }

      int $$6 = $$2.size();
      if ($$6 > 0) {
         f.warn("Tasks left in queue: {}", $$6);
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

   public static <T, E extends Throwable> T a(DataResult<T> $$0, Function<String, E> $$1) throws E {
      Optional<PartialResult<T>> $$2 = $$0.error();
      if ($$2.isPresent()) {
         throw $$1.apply($$2.get().message());
      } else {
         return (T)$$0.result().orElseThrow();
      }
   }

   public static <T, E extends Throwable> T b(DataResult<T> $$0, Function<String, E> $$1) throws E {
      Optional<PartialResult<T>> $$2 = $$0.error();
      if ($$2.isPresent()) {
         Optional<T> $$3 = $$0.resultOrPartial($$0x -> {
         });
         if ($$3.isPresent()) {
            return $$3.get();
         } else {
            throw $$1.apply($$2.get().message());
         }
      } else {
         return (T)$$0.result().orElseThrow();
      }
   }

   public static <A, B> Typed<B> a(Typed<A> $$0, Type<B> $$1, UnaryOperator<Dynamic<?>> $$2) {
      Dynamic<?> $$3 = a($$0.write(), IllegalStateException::new);
      return a($$1, $$2.apply($$3), true);
   }

   public static <T> Typed<T> a(Type<T> $$0, Dynamic<?> $$1) {
      return a($$0, $$1, false);
   }

   public static <T> Typed<T> a(Type<T> $$0, Dynamic<?> $$1, boolean $$2) {
      DataResult<Typed<T>> $$3 = $$0.readTyped($$1).map(Pair::getFirst);

      try {
         return $$2 ? b($$3, IllegalStateException::new) : a($$3, IllegalStateException::new);
      } catch (IllegalStateException var7) {
         o $$5 = o.a(var7, "Reading type");
         p $$6 = $$5.a("Info");
         $$6.a("Data", $$1);
         $$6.a("Type", $$0);
         throw new y($$5);
      }
   }

   public static boolean a(int $$0) {
      return Character.isWhitespace($$0) || Character.isSpaceChar($$0);
   }

   public static boolean b(@Nullable String $$0) {
      return $$0 != null && $$0.length() != 0 ? $$0.chars().allMatch(ac::a) : true;
   }

   public static enum a {
      a("linux"),
      b("solaris"),
      c("windows") {
         @Override
         protected String[] b(URL $$0) {
            return new String[]{"rundll32", "url.dll,FileProtocolHandler", $$0.toString()};
         }
      },
      d("mac") {
         @Override
         protected String[] b(URL $$0) {
            return new String[]{"open", $$0.toString()};
         }
      },
      e("unknown");

      private final String f;

      a(String $$0) {
         this.f = $$0;
      }

      public void a(URL $$0) {
         try {
            Process $$1 = AccessController.doPrivileged((PrivilegedExceptionAction<Process>)(() -> Runtime.getRuntime().exec(this.b($$0))));
            $$1.getInputStream().close();
            $$1.getErrorStream().close();
            $$1.getOutputStream().close();
         } catch (IOException | PrivilegedActionException var3) {
            ac.f.error("Couldn't open url '{}'", $$0, var3);
         }
      }

      public void a(URI $$0) {
         try {
            this.a($$0.toURL());
         } catch (MalformedURLException var3) {
            ac.f.error("Couldn't open uri '{}'", $$0, var3);
         }
      }

      public void a(File $$0) {
         try {
            this.a($$0.toURI().toURL());
         } catch (MalformedURLException var3) {
            ac.f.error("Couldn't open file '{}'", $$0, var3);
         }
      }

      protected String[] b(URL $$0) {
         String $$1 = $$0.toString();
         if ("file".equals($$0.getProtocol())) {
            $$1 = $$1.replace("file:", "file://");
         }

         return new String[]{"xdg-open", $$1};
      }

      public void a(String $$0) {
         try {
            this.a(new URI($$0).toURL());
         } catch (MalformedURLException | IllegalArgumentException | URISyntaxException var3) {
            ac.f.error("Couldn't open uri '{}'", $$0, var3);
         }
      }

      public String a() {
         return this.f;
      }
   }
}
