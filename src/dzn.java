import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dzn implements akr, dzo {
   private static final Logger b = LogUtils.getLogger();
   public static final dzm<dzs> a = new dzm<>(dzp.c, dzg.a);
   private Map<dzm<?>, ?> c = Map.of();
   private Multimap<dzp<?>, acq> d = ImmutableMultimap.of();

   @Override
   public final CompletableFuture<Void> a(akr.a $$0, akx $$1, ban $$2, ban $$3, Executor $$4, Executor $$5) {
      Map<dzp<?>, Map<acq, ?>> $$6 = new HashMap<>();
      CompletableFuture<?>[] $$7 = dzp.c().map($$3x -> a($$3x, $$1, $$4, $$6)).toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf($$7).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$6), $$5);
   }

   private static <T> CompletableFuture<?> a(dzp<T> $$0, akx $$1, Executor $$2, Map<dzp<?>, Map<acq, ?>> $$3) {
      Map<acq, T> $$4 = new HashMap<>();
      $$3.put($$0, $$4);
      return CompletableFuture.runAsync(() -> {
         Map<acq, JsonElement> $$3x = new HashMap<>();
         alb.a($$1, $$0.b(), $$0.a(), $$3x);
         $$3x.forEach(($$2xx, $$3xx) -> $$0.a($$2xx, $$3xx).ifPresent($$2xxx -> $$4.put($$2xx, (T)$$2xxx)));
      }, $$2);
   }

   private void a(Map<dzp<?>, Map<acq, ?>> $$0) {
      Object $$1 = $$0.get(dzp.c).remove(dzg.a);
      if ($$1 != null) {
         b.warn("Datapack tried to redefine {} loot table, ignoring", dzg.a);
      }

      Builder<dzm<?>, Object> $$2 = ImmutableMap.builder();
      com.google.common.collect.ImmutableMultimap.Builder<dzp<?>, acq> $$3 = ImmutableMultimap.builder();
      $$0.forEach(($$2x, $$3x) -> $$3x.forEach(($$3xx, $$4x) -> {
            $$2.put(new dzm($$2x, $$3xx), $$4x);
            $$3.put($$2x, $$3xx);
         }));
      $$2.put(a, dzs.a);
      final Map<dzm<?>, ?> $$4 = $$2.build();
      dzv $$5 = new dzv(ebv.m, new dzo() {
         @Nullable
         @Override
         public <T> T getElement(dzm<T> $$0) {
            return (T)$$4.get($$0);
         }
      });
      $$4.forEach(($$1x, $$2x) -> a($$5, $$1x, $$2x));
      $$5.a().forEach(($$0x, $$1x) -> b.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      this.c = $$4;
      this.d = $$3.build();
   }

   private static <T> void a(dzv $$0, dzm<T> $$1, Object $$2) {
      $$1.a().a($$0, $$1, (T)$$2);
   }

   @Nullable
   @Override
   public <T> T getElement(dzm<T> $$0) {
      return (T)this.c.get($$0);
   }

   public Collection<acq> a(dzp<?> $$0) {
      return this.d.get($$0);
   }

   public static eck a(eck[] $$0) {
      return new dzn.a($$0);
   }

   public static eaz a(eaz[] $$0) {
      return new dzn.b($$0);
   }

   static class a implements eck {
      private final eck[] a;
      private final Predicate<dzk> b;

      a(eck[] $$0) {
         this.a = $$0;
         this.b = ecm.a($$0);
      }

      public final boolean a(dzk $$0) {
         return this.b.test($$0);
      }

      @Override
      public void a(dzv $$0) {
         eck.super.a($$0);

         for (int $$1 = 0; $$1 < this.a.length; $$1++) {
            this.a[$$1].a($$0.b(".term[" + $$1 + "]"));
         }
      }

      @Override
      public ecl b() {
         throw new UnsupportedOperationException();
      }
   }

   static class b implements eaz {
      protected final eaz[] a;
      private final BiFunction<cfz, dzk, cfz> b;

      public b(eaz[] $$0) {
         this.a = $$0;
         this.b = ebb.a($$0);
      }

      public cfz a(cfz $$0, dzk $$1) {
         return this.b.apply($$0, $$1);
      }

      @Override
      public void a(dzv $$0) {
         eaz.super.a($$0);

         for (int $$1 = 0; $$1 < this.a.length; $$1++) {
            this.a[$$1].a($$0.b(".function[" + $$1 + "]"));
         }
      }

      @Override
      public eba b() {
         throw new UnsupportedOperationException();
      }
   }
}
