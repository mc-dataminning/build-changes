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

public class aqn implements aqi.b, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final Map<bph<?>, aqm<? extends Function<bph<azx>, ?>>> b;
   private final Set<bph<?>> c;
   private final bpi<bpk.b> d;

   public aqn(List<bph<?>> $$0, Executor $$1, int $$2) {
      this.b = $$0.stream().collect(Collectors.toMap(Function.identity(), $$1x -> new aqm<>($$1x.by() + "_queue", $$2)));
      this.c = Sets.newHashSet($$0);
      this.d = new bpi<>(new bpk.a(4), $$1, "sorter");
   }

   public boolean a() {
      return this.d.c() || this.b.values().stream().anyMatch(aqm::b);
   }

   public static <T> aqn.a<T> a(Function<bph<azx>, T> $$0, long $$1, IntSupplier $$2) {
      return new aqn.a<>($$0, $$1, $$2);
   }

   public static aqn.a<Runnable> a(Runnable $$0, long $$1, IntSupplier $$2) {
      return new aqn.a<>($$1x -> () -> {
            $$0.run();
            $$1x.a(azx.a);
         }, $$1, $$2);
   }

   public static aqn.a<Runnable> a(aqi $$0, Runnable $$1) {
      return a($$1, $$0.k().a(), $$0::m);
   }

   public static <T> aqn.a<T> a(aqi $$0, Function<bph<azx>, T> $$1) {
      return a($$1, $$0.k().a(), $$0::m);
   }

   public static aqn.b a(Runnable $$0, long $$1, boolean $$2) {
      return new aqn.b($$0, $$1, $$2);
   }

   public <T> bph<aqn.a<T>> a(bph<T> $$0, boolean $$1) {
      return this.d.<bph<aqn.a<T>>>b($$2 -> new bpk.b(0, () -> {
            this.b($$0);
            $$2.a(bph.a("chunk priority sorter around " + $$0.by(), $$2xx -> this.a($$0, $$2xx.a, $$2xx.b, $$2xx.c, $$1)));
         })).join();
   }

   public bph<aqn.b> a(bph<Runnable> $$0) {
      return this.d
         .<bph<aqn.b>>b($$1 -> new bpk.b(0, () -> $$1.a(bph.a("chunk priority sorter around " + $$0.by(), $$1xx -> this.a($$0, $$1xx.b, $$1xx.a, $$1xx.c)))))
         .join();
   }

   @Override
   public void onLevelChange(dba $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
      this.d.a(new bpk.b(0, () -> {
         int $$4 = $$1.getAsInt();
         this.b.values().forEach($$3xx -> $$3xx.a($$4, $$0, $$2));
         $$3.accept($$2);
      }));
   }

   private <T> void a(bph<T> $$0, long $$1, Runnable $$2, boolean $$3) {
      this.d.a(new bpk.b(1, () -> {
         aqm<Function<bph<azx>, T>> $$4 = this.b($$0);
         $$4.a($$1, $$3);
         if (this.c.remove($$0)) {
            this.a($$4, $$0);
         }

         $$2.run();
      }));
   }

   private <T> void a(bph<T> $$0, Function<bph<azx>, T> $$1, long $$2, IntSupplier $$3, boolean $$4) {
      this.d.a(new bpk.b(2, () -> {
         aqm<Function<bph<azx>, T>> $$5 = this.b($$0);
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

   private <T> void a(aqm<Function<bph<azx>, T>> $$0, bph<T> $$1) {
      this.d.a(new bpk.b(3, () -> {
         Stream<Either<Function<bph<azx>, T>, Runnable>> $$2 = $$0.a();
         if ($$2 == null) {
            this.c.add($$1);
         } else {
            CompletableFuture.allOf($$2.map($$1xx -> (CompletableFuture)$$1xx.map($$1::b, $$0xxx -> {
                  $$0xxx.run();
                  return CompletableFuture.completedFuture(azx.a);
               })).toArray(CompletableFuture[]::new)).thenAccept($$2x -> this.a($$0, $$1));
         }
      }));
   }

   private <T> aqm<Function<bph<azx>, T>> b(bph<T> $$0) {
      aqm<? extends Function<bph<azx>, ?>> $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw (IllegalArgumentException)ac.b(new IllegalArgumentException("No queue for: " + $$0));
      } else {
         return (aqm<Function<bph<azx>, T>>)$$1;
      }
   }

   @VisibleForTesting
   public String b() {
      return this.b
            .entrySet()
            .stream()
            .map($$0 -> $$0.getKey().by() + "=[" + $$0.getValue().c().stream().map($$0x -> $$0x + ":" + new dba($$0x)).collect(Collectors.joining(",")) + "]")
            .collect(Collectors.joining(","))
         + ", s="
         + this.c.size();
   }

   @Override
   public void close() {
      this.b.keySet().forEach(bph::close);
   }

   public static final class a<T> {
      final Function<bph<azx>, T> a;
      final long b;
      final IntSupplier c;

      a(Function<bph<azx>, T> $$0, long $$1, IntSupplier $$2) {
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
