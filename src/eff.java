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

public class eff implements apf, efg {
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   public static final efe<efk> a = new efe<>(efh.c, efa.a);
   private Map<efe<?>, ?> d = Map.of();
   private Multimap<efh<?>, agm> e = ImmutableMultimap.of();

   @Override
   public final CompletableFuture<Void> a(apf.a $$0, apl $$1, bfs $$2, bfs $$3, Executor $$4, Executor $$5) {
      Map<efh<?>, Map<agm, ?>> $$6 = new HashMap<>();
      CompletableFuture<?>[] $$7 = efh.b().map($$3x -> a($$3x, $$1, $$4, $$6)).toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf($$7).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$6), $$5);
   }

   private static <T> CompletableFuture<?> a(efh<T> $$0, apl $$1, Executor $$2, Map<efh<?>, Map<agm, ?>> $$3) {
      Map<agm, T> $$4 = new HashMap<>();
      $$3.put($$0, $$4);
      return CompletableFuture.runAsync(() -> {
         Map<agm, JsonElement> $$3x = new HashMap<>();
         app.a($$1, $$0.a(), c, $$3x);
         $$3x.forEach(($$2xx, $$3xx) -> $$0.a($$2xx, $$3xx).ifPresent($$2xxx -> $$4.put($$2xx, (T)$$2xxx)));
      }, $$2);
   }

   private void a(Map<efh<?>, Map<agm, ?>> $$0) {
      Object $$1 = $$0.get(efh.c).remove(efa.a);
      if ($$1 != null) {
         b.warn("Datapack tried to redefine {} loot table, ignoring", efa.a);
      }

      Builder<efe<?>, Object> $$2 = ImmutableMap.builder();
      com.google.common.collect.ImmutableMultimap.Builder<efh<?>, agm> $$3 = ImmutableMultimap.builder();
      $$0.forEach(($$2x, $$3x) -> $$3x.forEach(($$3xx, $$4x) -> {
            $$2.put(new efe($$2x, $$3xx), $$4x);
            $$3.put($$2x, $$3xx);
         }));
      $$2.put(a, efk.a);
      final Map<efe<?>, ?> $$4 = $$2.build();
      efl $$5 = new efl(ehm.n, new efg() {
         @Nullable
         @Override
         public <T> T getElement(efe<T> $$0) {
            return (T)$$4.get($$0);
         }
      });
      $$4.forEach(($$1x, $$2x) -> a($$5, $$1x, $$2x));
      $$5.a().forEach(($$0x, $$1x) -> b.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      this.d = $$4;
      this.e = $$3.build();
   }

   private static <T> void a(efl $$0, efe<T> $$1, Object $$2) {
      $$1.a().a($$0, $$1, (T)$$2);
   }

   @Nullable
   @Override
   public <T> T getElement(efe<T> $$0) {
      return (T)this.d.get($$0);
   }

   public Collection<agm> a(efh<?> $$0) {
      return this.e.get($$0);
   }
}
