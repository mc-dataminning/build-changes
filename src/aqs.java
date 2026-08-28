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

public class aqs implements aqn.a, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final Map<bqk<?>, aqr<? extends Function<bqk<bak>, ?>>> b;
   private final Set<bqk<?>> c;
   private final bql<bqn.b> d;

   public aqs(List<bqk<?>> $$0, Executor $$1, int $$2) {
      this.b = $$0.stream().collect(Collectors.toMap(Function.identity(), $$1x -> new aqr<>($$1x.bA() + "_queue", $$2)));
      this.c = Sets.newHashSet($$0);
      this.d = new bql<>(new bqn.a(4), $$1, "sorter");
   }

   public boolean a() {
      return this.d.c() || this.b.values().stream().anyMatch(aqr::b);
   }

   public static <T> aqs.a<T> a(Function<bqk<bak>, T> $$0, long $$1, IntSupplier $$2) {
      return new aqs.a<>($$0, $$1, $$2);
   }

   public static aqs.a<Runnable> a(Runnable $$0, long $$1, IntSupplier $$2) {
      return new aqs.a<>($$1x -> () -> {
            $$0.run();
            $$1x.a(bak.a);
         }, $$1, $$2);
   }

   public static aqs.a<Runnable> a(arb $$0, Runnable $$1) {
      return a($$1, $$0.r().a(), $$0::j);
   }

   public static <T> aqs.a<T> a(arb $$0, Function<bqk<bak>, T> $$1) {
      return a($$1, $$0.r().a(), $$0::j);
   }

   public static aqs.b a(Runnable $$0, long $$1, boolean $$2) {
      return new aqs.b($$0, $$1, $$2);
   }

   public <T> bqk<aqs.a<T>> a(bqk<T> $$0, boolean $$1) {
      return this.d.<bqk<aqs.a<T>>>b($$2 -> new bqn.b(0, () -> {
            this.b($$0);
            $$2.a(bqk.a("chunk priority sorter around " + $$0.bA(), $$2xx -> this.a($$0, $$2xx.a, $$2xx.b, $$2xx.c, $$1)));
         })).join();
   }

   public bqk<aqs.b> a(bqk<Runnable> $$0) {
      return this.d
         .<bqk<aqs.b>>b($$1 -> new bqn.b(0, () -> $$1.a(bqk.a("chunk priority sorter around " + $$0.bA(), $$1xx -> this.a($$0, $$1xx.b, $$1xx.a, $$1xx.c)))))
         .join();
   }

   @Override
   public void onLevelChange(ddp $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
      this.d.a(new bqn.b(0, () -> {
         int $$4 = $$1.getAsInt();
         this.b.values().forEach($$3xx -> $$3xx.a($$4, $$0, $$2));
         $$3.accept($$2);
      }));
   }

   private <T> void a(bqk<T> $$0, long $$1, Runnable $$2, boolean $$3) {
      this.d.a(new bqn.b(1, () -> {
         aqr<Function<bqk<bak>, T>> $$4 = this.b($$0);
         $$4.a($$1, $$3);
         if (this.c.remove($$0)) {
            this.a($$4, $$0);
         }

         $$2.run();
      }));
   }

   private <T> void a(bqk<T> $$0, Function<bqk<bak>, T> $$1, long $$2, IntSupplier $$3, boolean $$4) {
      this.d.a(new bqn.b(2, () -> {
         aqr<Function<bqk<bak>, T>> $$5 = this.b($$0);
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

   private <T> void a(aqr<Function<bqk<bak>, T>> $$0, bqk<T> $$1) {
      this.d.a(new bqn.b(3, () -> {
         Stream<Either<Function<bqk<bak>, T>, Runnable>> $$2 = $$0.a();
         if ($$2 == null) {
            this.c.add($$1);
         } else {
            CompletableFuture.allOf($$2.map($$1xx -> (CompletableFuture)$$1xx.map($$1::b, $$0xxx -> {
                  $$0xxx.run();
                  return CompletableFuture.completedFuture(bak.a);
               })).toArray(CompletableFuture[]::new)).thenAccept($$2x -> this.a($$0, $$1));
         }
      }));
   }

   private <T> aqr<Function<bqk<bak>, T>> b(bqk<T> $$0) {
      aqr<? extends Function<bqk<bak>, ?>> $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw (IllegalArgumentException)ad.b(new IllegalArgumentException("No queue for: " + $$0));
      } else {
         return (aqr<Function<bqk<bak>, T>>)$$1;
      }
   }

   @VisibleForTesting
   public String b() {
      return this.b
            .entrySet()
            .stream()
            .map($$0 -> $$0.getKey().bA() + "=[" + $$0.getValue().c().stream().map($$0x -> $$0x + ":" + new ddp($$0x)).collect(Collectors.joining(",")) + "]")
            .collect(Collectors.joining(","))
         + ", s="
         + this.c.size();
   }

   @Override
   public void close() {
      this.b.keySet().forEach(bqk::close);
   }

   public static final class a<T> {
      final Function<bqk<bak>, T> a;
      final long b;
      final IntSupplier c;

      a(Function<bqk<bak>, T> $$0, long $$1, IntSupplier $$2) {
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
