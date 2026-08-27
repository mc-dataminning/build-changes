import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class efa implements apb, efb {
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   public static final eez<eff> a = new eez<>(efc.c, eev.a);
   private Map<eez<?>, ?> d = Map.of();
   private Multimap<efc<?>, agi> e = ImmutableMultimap.of();

   @Override
   public final CompletableFuture<Void> a(apb.a $$0, aph $$1, bfo $$2, bfo $$3, Executor $$4, Executor $$5) {
      Map<efc<?>, Map<agi, ?>> $$6 = new HashMap<>();
      CompletableFuture<?>[] $$7 = efc.b().map($$3x -> a($$3x, $$1, $$4, $$6)).toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf($$7).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$6), $$5);
   }

   private static <T> CompletableFuture<?> a(efc<T> $$0, aph $$1, Executor $$2, Map<efc<?>, Map<agi, ?>> $$3) {
      Map<agi, T> $$4 = new HashMap<>();
      $$3.put($$0, $$4);
      return CompletableFuture.runAsync(() -> {
         Map<agi, JsonElement> $$3x = new HashMap<>();
         apl.a($$1, $$0.a(), c, $$3x);
         $$3x.forEach(($$2xx, $$3xx) -> $$0.a($$2xx, $$3xx).ifPresent($$2xxx -> $$4.put($$2xx, (T)$$2xxx)));
      }, $$2);
   }

   private void a(Map<efc<?>, Map<agi, ?>> $$0) {
      Object $$1 = $$0.get(efc.c).remove(eev.a);
      if ($$1 != null) {
         b.warn("Datapack tried to redefine {} loot table, ignoring", eev.a);
      }

      Builder<eez<?>, Object> $$2 = ImmutableMap.builder();
      com.google.common.collect.ImmutableMultimap.Builder<efc<?>, agi> $$3 = ImmutableMultimap.builder();
      $$0.forEach(($$2x, $$3x) -> $$3x.forEach(($$3xx, $$4x) -> {
            $$2.put(new eez($$2x, $$3xx), $$4x);
            $$3.put($$2x, $$3xx);
         }));
      $$2.put(a, eff.a);
      final Map<eez<?>, ?> $$4 = $$2.build();
      efg $$5 = new efg(ehh.n, new efb() {
         @Nullable
         @Override
         public <T> T getElement(eez<T> $$0) {
            return (T)$$4.get($$0);
         }
      });
      $$4.forEach(($$1x, $$2x) -> a($$5, $$1x, $$2x));
      $$5.a().forEach(($$0x, $$1x) -> b.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      this.d = $$4;
      this.e = $$3.build();
   }

   private static <T> void a(efg $$0, eez<T> $$1, Object $$2) {
      $$1.a().a($$0, $$1, (T)$$2);
   }

   @Nullable
   @Override
   public <T> T getElement(eez<T> $$0) {
      return (T)this.d.get($$0);
   }

   public Collection<agi> a(efc<?> $$0) {
      return this.e.get($$0);
   }
}
