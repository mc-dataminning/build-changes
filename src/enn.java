import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enn implements asy, eno {
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   public static final enm<ens> a = new enm<>(enp.c, eni.a);
   private final ip.a d;
   private Map<enm<?>, ?> e = Map.of();
   private Multimap<enp<?>, ajv> f = ImmutableMultimap.of();

   public enn(ip.a $$0) {
      this.d = $$0;
   }

   @Override
   public final CompletableFuture<Void> a(asy.a $$0, ate $$1, bkt $$2, bkt $$3, Executor $$4, Executor $$5) {
      Map<enp<?>, Map<ajv, ?>> $$6 = new HashMap<>();
      CompletableFuture<?>[] $$7 = enp.b().map($$3x -> a($$3x, this.d, $$1, $$4, $$6)).toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf($$7).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$6), $$5);
   }

   private static <T> CompletableFuture<?> a(enp<T> $$0, ip.a $$1, ate $$2, Executor $$3, Map<enp<?>, Map<ajv, ?>> $$4) {
      ajt<JsonElement> $$5 = $$1.a(JsonOps.INSTANCE);
      Map<ajv, T> $$6 = new HashMap<>();
      $$4.put($$0, $$6);
      return CompletableFuture.runAsync(() -> {
         Map<ajv, JsonElement> $$4x = new HashMap<>();
         ati.a($$2, $$0.a(), c, $$4x);
         $$4x.forEach(($$3xx, $$4xx) -> $$0.a($$3xx, $$5, $$4xx).ifPresent($$2xxx -> $$6.put($$3xx, (T)$$2xxx)));
      }, $$3);
   }

   private void a(Map<enp<?>, Map<ajv, ?>> $$0) {
      Object $$1 = $$0.get(enp.c).remove(eni.a);
      if ($$1 != null) {
         b.warn("Datapack tried to redefine {} loot table, ignoring", eni.a);
      }

      Builder<enm<?>, Object> $$2 = ImmutableMap.builder();
      com.google.common.collect.ImmutableMultimap.Builder<enp<?>, ajv> $$3 = ImmutableMultimap.builder();
      $$0.forEach(($$2x, $$3x) -> $$3x.forEach(($$3xx, $$4x) -> {
            $$2.put(new enm($$2x, $$3xx), $$4x);
            $$3.put($$2x, $$3xx);
         }));
      $$2.put(a, ens.a);
      axr.a $$4 = new axr.a();
      final Map<enm<?>, ?> $$5 = $$2.build();
      ent $$6 = new ent($$4, epw.p, new eno() {
         @Nullable
         @Override
         public <T> T getElement(enm<T> $$0) {
            return (T)$$5.get($$0);
         }
      });
      $$5.forEach(($$1x, $$2x) -> a($$6, $$1x, $$2x));
      $$4.a().forEach(($$0x, $$1x) -> b.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      this.e = $$5;
      this.f = $$3.build();
   }

   private static <T> void a(ent $$0, enm<T> $$1, Object $$2) {
      $$1.a().a($$0, $$1, (T)$$2);
   }

   @Nullable
   @Override
   public <T> T getElement(enm<T> $$0) {
      return (T)this.e.get($$0);
   }

   public Collection<ajv> a(enp<?> $$0) {
      return this.f.get($$0);
   }
}
