import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class aqf implements aqa.b, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final Map<bos<?>, aqe<? extends Function<bos<azo>, ?>>> b;
   private final Set<bos<?>> c;
   private final bot<bov.b> d;

   public aqf(List<bos<?>> $$0, Executor $$1, int $$2) {
      this.b = $$0.stream().collect(Collectors.toMap(Function.identity(), $$1x -> new aqe<>($$1x.bx() + "_queue", $$2)));
      this.c = Sets.newHashSet($$0);
      this.d = new bot<>(new bov.a(4), $$1, "sorter");
   }

   public boolean a() {
      return this.d.c() || this.b.values().stream().anyMatch(aqe::b);
   }

   public static <T> aqf.a<T> a(Function<bos<azo>, T> $$0, long $$1, IntSupplier $$2) {
      return new aqf.a<>($$0, $$1, $$2);
   }

   public static aqf.a<Runnable> a(Runnable $$0, long $$1, IntSupplier $$2) {
      return new aqf.a<>($$1x -> () -> {
            $$0.run();
            $$1x.a(azo.a);
         }, $$1, $$2);
   }

   public static aqf.a<Runnable> a(aqa $$0, Runnable $$1) {
      return a($$1, $$0.k().a(), $$0::m);
   }

   public static <T> aqf.a<T> a(aqa $$0, Function<bos<azo>, T> $$1) {
      return a($$1, $$0.k().a(), $$0::m);
   }

   public static aqf.b a(Runnable $$0, long $$1, boolean $$2) {
      return new aqf.b($$0, $$1, $$2);
   }

   public <T> bos<aqf.a<T>> a(bos<T> $$0, boolean $$1) {
      return this.d.<bos<aqf.a<T>>>b($$2 -> new bov.b(0, () -> {
            this.b($$0);
            $$2.a(bos.a("chunk priority sorter around " + $$0.bx(), $$2xx -> this.a($$0, $$2xx.a, $$2xx.b, $$2xx.c, $$1)));
         })).join();
   }

   public bos<aqf.b> a(bos<Runnable> $$0) {
      return this.d
         .<bos<aqf.b>>b($$1 -> new bov.b(0, () -> $$1.a(bos.a("chunk priority sorter around " + $$0.bx(), $$1xx -> this.a($$0, $$1xx.b, $$1xx.a, $$1xx.c)))))
         .join();
   }

   @Override
   public void onLevelChange(dbh $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
      this.d.a(new bov.b(0, () -> {
         int $$4 = $$1.getAsInt();
         this.b.values().forEach($$3xx -> $$3xx.a($$4, $$0, $$2));
         $$3.accept($$2);
      }));
   }

   private <T> void a(bos<T> $$0, long $$1, Runnable $$2, boolean $$3) {
      this.d.a(new bov.b(1, () -> {
         aqe<Function<bos<azo>, T>> $$4 = this.b($$0);
         $$4.a($$1, $$3);
         if (this.c.remove($$0)) {
            this.a($$4, $$0);
         }

         $$2.run();
      }));
   }

   private <T> void a(bos<T> $$0, Function<bos<azo>, T> $$1, long $$2, IntSupplier $$3, boolean $$4) {
      this.d.a(new bov.b(2, () -> {
         aqe<Function<bos<azo>, T>> $$5 = this.b($$0);
         int $$6 = $$3.getAsInt();
         $$5.a(Optional.of($$1), $$2, $$6);
         if ($$4) {
            $$5.a(Optional.empty(), $$2, $$6);
         }

         if (this.c.remove($$0)) {
            this.a($$5, $$0);
         }
      }));
   }

   private <T> void a(aqe<Function<bos<azo>, T>> $$0, bos<T> $$1) {
      this.d.a(new bov.b(3, () -> {
         Stream<Either<Function<bos<azo>, T>, Runnable>> $$2 = $$0.a();
         if ($$2 == null) {
            this.c.add($$1);
         } else {
            CompletableFuture.allOf($$2.map($$1xx -> (CompletableFuture)$$1xx.map($$1::b, $$0xxx -> {
                  $$0xxx.run();
                  return CompletableFuture.completedFuture(azo.a);
               })).toArray(CompletableFuture[]::new)).thenAccept($$2x -> this.a($$0, $$1));
         }
      }));
   }

   private <T> aqe<Function<bos<azo>, T>> b(bos<T> $$0) {
      aqe<? extends Function<bos<azo>, ?>> $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw (IllegalArgumentException)ad.b(new IllegalArgumentException("No queue for: " + $$0));
      } else {
         return (aqe<Function<bos<azo>, T>>)$$1;
      }
   }

   @VisibleForTesting
   public String b() {
      return this.b
            .entrySet()
            .stream()
            .map($$0 -> $$0.getKey().bx() + "=[" + $$0.getValue().c().stream().map($$0x -> $$0x + ":" + new dbh($$0x)).collect(Collectors.joining(",")) + "]")
            .collect(Collectors.joining(","))
         + ", s="
         + this.c.size();
   }

   @Override
   public void close() {
      this.b.keySet().forEach(bos::close);
   }

   public static final class a<T> {
      final Function<bos<azo>, T> a;
      final long b;
      final IntSupplier c;

      a(Function<bos<azo>, T> $$0, long $$1, IntSupplier $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   public static final class b {
      final Runnable a;
      final long b;
      final boolean c;

      b(Runnable $$0, long $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
