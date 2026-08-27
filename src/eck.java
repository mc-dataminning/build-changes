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

public class eck implements ane, ecl {
   private static final Logger b = LogUtils.getLogger();
   public static final ecj<ecp> a = new ecj<>(ecm.c, ecd.a);
   private Map<ecj<?>, ?> c = Map.of();
   private Multimap<ecm<?>, aep> d = ImmutableMultimap.of();

   @Override
   public final CompletableFuture<Void> a(ane.a $$0, ank $$1, bde $$2, bde $$3, Executor $$4, Executor $$5) {
      Map<ecm<?>, Map<aep, ?>> $$6 = new HashMap<>();
      CompletableFuture<?>[] $$7 = ecm.c().map($$3x -> a($$3x, $$1, $$4, $$6)).toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf($$7).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$6), $$5);
   }

   private static <T> CompletableFuture<?> a(ecm<T> $$0, ank $$1, Executor $$2, Map<ecm<?>, Map<aep, ?>> $$3) {
      Map<aep, T> $$4 = new HashMap<>();
      $$3.put($$0, $$4);
      return CompletableFuture.runAsync(() -> {
         Map<aep, JsonElement> $$3x = new HashMap<>();
         ano.a($$1, $$0.b(), $$0.a(), $$3x);
         $$3x.forEach(($$2xx, $$3xx) -> $$0.a($$2xx, $$3xx).ifPresent($$2xxx -> $$4.put($$2xx, (T)$$2xxx)));
      }, $$2);
   }

   private void a(Map<ecm<?>, Map<aep, ?>> $$0) {
      Object $$1 = $$0.get(ecm.c).remove(ecd.a);
      if ($$1 != null) {
         b.warn("Datapack tried to redefine {} loot table, ignoring", ecd.a);
      }

      Builder<ecj<?>, Object> $$2 = ImmutableMap.builder();
      com.google.common.collect.ImmutableMultimap.Builder<ecm<?>, aep> $$3 = ImmutableMultimap.builder();
      $$0.forEach(($$2x, $$3x) -> $$3x.forEach(($$3xx, $$4x) -> {
            $$2.put(new ecj($$2x, $$3xx), $$4x);
            $$3.put($$2x, $$3xx);
         }));
      $$2.put(a, ecp.a);
      final Map<ecj<?>, ?> $$4 = $$2.build();
      ecs $$5 = new ecs(ees.m, new ecl() {
         @Nullable
         @Override
         public <T> T getElement(ecj<T> $$0) {
            return (T)$$4.get($$0);
         }
      });
      $$4.forEach(($$1x, $$2x) -> a($$5, $$1x, $$2x));
      $$5.a().forEach(($$0x, $$1x) -> b.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      this.c = $$4;
      this.d = $$3.build();
   }

   private static <T> void a(ecs $$0, ecj<T> $$1, Object $$2) {
      $$1.a().a($$0, $$1, (T)$$2);
   }

   @Nullable
   @Override
   public <T> T getElement(ecj<T> $$0) {
      return (T)this.c.get($$0);
   }

   public Collection<aep> a(ecm<?> $$0) {
      return this.d.get($$0);
   }

   public static efh a(efh[] $$0) {
      return new eck.a($$0);
   }

   public static edw a(edw[] $$0) {
      return new eck.b($$0);
   }

   static class a implements efh {
      private final efh[] a;
      private final Predicate<ech> b;

      a(efh[] $$0) {
         this.a = $$0;
         this.b = efj.a($$0);
      }

      public final boolean a(ech $$0) {
         return this.b.test($$0);
      }

      @Override
      public void a(ecs $$0) {
         efh.super.a($$0);

         for (int $$1 = 0; $$1 < this.a.length; $$1++) {
            this.a[$$1].a($$0.b(".term[" + $$1 + "]"));
         }
      }

      @Override
      public efi b() {
         throw new UnsupportedOperationException();
      }
   }

   static class b implements edw {
      protected final edw[] a;
      private final BiFunction<ciw, ech, ciw> b;

      public b(edw[] $$0) {
         this.a = $$0;
         this.b = edy.a($$0);
      }

      public ciw a(ciw $$0, ech $$1) {
         return this.b.apply($$0, $$1);
      }

      @Override
      public void a(ecs $$0) {
         edw.super.a($$0);

         for (int $$1 = 0; $$1 < this.a.length; $$1++) {
            this.a[$$1].a($$0.b(".function[" + $$1 + "]"));
         }
      }

      @Override
      public edx b() {
         throw new UnsupportedOperationException();
      }
   }
}
