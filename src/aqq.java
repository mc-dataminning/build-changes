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

public class aqq implements aql.a, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final Map<bqh<?>, aqp<? extends Function<bqh<bai>, ?>>> b;
   private final Set<bqh<?>> c;
   private final bqi<bqk.b> d;

   public aqq(List<bqh<?>> $$0, Executor $$1, int $$2) {
      this.b = $$0.stream().collect(Collectors.toMap(Function.identity(), $$1x -> new aqp<>($$1x.bA() + "_queue", $$2)));
      this.c = Sets.newHashSet($$0);
      this.d = new bqi<>(new bqk.a(4), $$1, "sorter");
   }

   public boolean a() {
      return this.d.c() || this.b.values().stream().anyMatch(aqp::b);
   }

   public static <T> aqq.a<T> a(Function<bqh<bai>, T> $$0, long $$1, IntSupplier $$2) {
      return new aqq.a<>($$0, $$1, $$2);
   }

   public static aqq.a<Runnable> a(Runnable $$0, long $$1, IntSupplier $$2) {
      return new aqq.a<>($$1x -> () -> {
            $$0.run();
            $$1x.a(bai.a);
         }, $$1, $$2);
   }

   public static aqq.a<Runnable> a(aqz $$0, Runnable $$1) {
      return a($$1, $$0.r().a(), $$0::j);
   }

   public static <T> aqq.a<T> a(aqz $$0, Function<bqh<bai>, T> $$1) {
      return a($$1, $$0.r().a(), $$0::j);
   }

   public static aqq.b a(Runnable $$0, long $$1, boolean $$2) {
      return new aqq.b($$0, $$1, $$2);
   }

   public <T> bqh<aqq.a<T>> a(bqh<T> $$0, boolean $$1) {
      return this.d.<bqh<aqq.a<T>>>b($$2 -> new bqk.b(0, () -> {
            this.b($$0);
            $$2.a(bqh.a("chunk priority sorter around " + $$0.bA(), $$2xx -> this.a($$0, $$2xx.a, $$2xx.b, $$2xx.c, $$1)));
         })).join();
   }

   public bqh<aqq.b> a(bqh<Runnable> $$0) {
      return this.d
         .<bqh<aqq.b>>b($$1 -> new bqk.b(0, () -> $$1.a(bqh.a("chunk priority sorter around " + $$0.bA(), $$1xx -> this.a($$0, $$1xx.b, $$1xx.a, $$1xx.c)))))
         .join();
   }

   @Override
   public void onLevelChange(ddm $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
      this.d.a(new bqk.b(0, () -> {
         int $$4 = $$1.getAsInt();
         this.b.values().forEach($$3xx -> $$3xx.a($$4, $$0, $$2));
         $$3.accept($$2);
      }));
   }

   private <T> void a(bqh<T> $$0, long $$1, Runnable $$2, boolean $$3) {
      this.d.a(new bqk.b(1, () -> {
         aqp<Function<bqh<bai>, T>> $$4 = this.b($$0);
         $$4.a($$1, $$3);
         if (this.c.remove($$0)) {
            this.a($$4, $$0);
         }

         $$2.run();
      }));
   }

   private <T> void a(bqh<T> $$0, Function<bqh<bai>, T> $$1, long $$2, IntSupplier $$3, boolean $$4) {
      this.d.a(new bqk.b(2, () -> {
         aqp<Function<bqh<bai>, T>> $$5 = this.b($$0);
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

   private <T> void a(aqp<Function<bqh<bai>, T>> $$0, bqh<T> $$1) {
      this.d.a(new bqk.b(3, () -> {
         Stream<Either<Function<bqh<bai>, T>, Runnable>> $$2 = $$0.a();
         if ($$2 == null) {
            this.c.add($$1);
         } else {
            CompletableFuture.allOf($$2.map($$1xx -> (CompletableFuture)$$1xx.map($$1::b, $$0xxx -> {
                  $$0xxx.run();
                  return CompletableFuture.completedFuture(bai.a);
               })).toArray(CompletableFuture[]::new)).thenAccept($$2x -> this.a($$0, $$1));
         }
      }));
   }

   private <T> aqp<Function<bqh<bai>, T>> b(bqh<T> $$0) {
      aqp<? extends Function<bqh<bai>, ?>> $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw (IllegalArgumentException)ad.b(new IllegalArgumentException("No queue for: " + $$0));
      } else {
         return (aqp<Function<bqh<bai>, T>>)$$1;
      }
   }

   @VisibleForTesting
   public String b() {
      return this.b
            .entrySet()
            .stream()
            .map($$0 -> $$0.getKey().bA() + "=[" + $$0.getValue().c().stream().map($$0x -> $$0x + ":" + new ddm($$0x)).collect(Collectors.joining(",")) + "]")
            .collect(Collectors.joining(","))
         + ", s="
         + this.c.size();
   }

   @Override
   public void close() {
      this.b.keySet().forEach(bqh::close);
   }

   public static final class a<T> {
      final Function<bqh<bai>, T> a;
      final long b;
      final IntSupplier c;

      a(Function<bqh<bai>, T> $$0, long $$1, IntSupplier $$2) {
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
