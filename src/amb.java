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

public class amb implements alx.c, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final Map<bid<?>, ama<? extends Function<bid<avc>, ?>>> b;
   private final Set<bid<?>> c;
   private final bie<big.b> d;

   public amb(List<bid<?>> $$0, Executor $$1, int $$2) {
      this.b = $$0.stream().collect(Collectors.toMap(Function.identity(), $$1x -> new ama<>($$1x.bs() + "_queue", $$2)));
      this.c = Sets.newHashSet($$0);
      this.d = new bie<>(new big.a(4), $$1, "sorter");
   }

   public boolean a() {
      return this.d.c() || this.b.values().stream().anyMatch(ama::b);
   }

   public static <T> amb.a<T> a(Function<bid<avc>, T> $$0, long $$1, IntSupplier $$2) {
      return new amb.a<>($$0, $$1, $$2);
   }

   public static amb.a<Runnable> a(Runnable $$0, long $$1, IntSupplier $$2) {
      return new amb.a<>($$1x -> () -> {
            $$0.run();
            $$1x.a(avc.a);
         }, $$1, $$2);
   }

   public static amb.a<Runnable> a(alx $$0, Runnable $$1) {
      return a($$1, $$0.l().a(), $$0::n);
   }

   public static <T> amb.a<T> a(alx $$0, Function<bid<avc>, T> $$1) {
      return a($$1, $$0.l().a(), $$0::n);
   }

   public static amb.b a(Runnable $$0, long $$1, boolean $$2) {
      return new amb.b($$0, $$1, $$2);
   }

   public <T> bid<amb.a<T>> a(bid<T> $$0, boolean $$1) {
      return this.d.<bid<amb.a<T>>>b($$2 -> new big.b(0, () -> {
            this.b($$0);
            $$2.a(bid.a("chunk priority sorter around " + $$0.bs(), $$2xx -> this.a($$0, $$2xx.a, $$2xx.b, $$2xx.c, $$1)));
         })).join();
   }

   public bid<amb.b> a(bid<Runnable> $$0) {
      return this.d
         .<bid<amb.b>>b($$1 -> new big.b(0, () -> $$1.a(bid.a("chunk priority sorter around " + $$0.bs(), $$1xx -> this.a($$0, $$1xx.b, $$1xx.a, $$1xx.c)))))
         .join();
   }

   @Override
   public void onLevelChange(csf $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
      this.d.a(new big.b(0, () -> {
         int $$4 = $$1.getAsInt();
         this.b.values().forEach($$3xx -> $$3xx.a($$4, $$0, $$2));
         $$3.accept($$2);
      }));
   }

   private <T> void a(bid<T> $$0, long $$1, Runnable $$2, boolean $$3) {
      this.d.a(new big.b(1, () -> {
         ama<Function<bid<avc>, T>> $$4 = this.b($$0);
         $$4.a($$1, $$3);
         if (this.c.remove($$0)) {
            this.a($$4, $$0);
         }

         $$2.run();
      }));
   }

   private <T> void a(bid<T> $$0, Function<bid<avc>, T> $$1, long $$2, IntSupplier $$3, boolean $$4) {
      this.d.a(new big.b(2, () -> {
         ama<Function<bid<avc>, T>> $$5 = this.b($$0);
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

   private <T> void a(ama<Function<bid<avc>, T>> $$0, bid<T> $$1) {
      this.d.a(new big.b(3, () -> {
         Stream<Either<Function<bid<avc>, T>, Runnable>> $$2 = $$0.a();
         if ($$2 == null) {
            this.c.add($$1);
         } else {
            CompletableFuture.allOf($$2.map($$1xx -> (CompletableFuture)$$1xx.map($$1::b, $$0xxx -> {
                  $$0xxx.run();
                  return CompletableFuture.completedFuture(avc.a);
               })).toArray(CompletableFuture[]::new)).thenAccept($$2x -> this.a($$0, $$1));
         }
      }));
   }

   private <T> ama<Function<bid<avc>, T>> b(bid<T> $$0) {
      ama<? extends Function<bid<avc>, ?>> $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw (IllegalArgumentException)ac.b(new IllegalArgumentException("No queue for: " + $$0));
      } else {
         return (ama<Function<bid<avc>, T>>)$$1;
      }
   }

   @VisibleForTesting
   public String b() {
      return this.b
            .entrySet()
            .stream()
            .map($$0 -> $$0.getKey().bs() + "=[" + $$0.getValue().c().stream().map($$0x -> $$0x + ":" + new csf($$0x)).collect(Collectors.joining(",")) + "]")
            .collect(Collectors.joining(","))
         + ", s="
         + this.c.size();
   }

   @Override
   public void close() {
      this.b.keySet().forEach(bid::close);
   }

   public static final class a<T> {
      final Function<bid<avc>, T> a;
      final long b;
      final IntSupplier c;

      a(Function<bid<avc>, T> $$0, long $$1, IntSupplier $$2) {
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
