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

public class ekx implements asi, eky {
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   public static final ekw<elc> a = new ekw<>(ekz.c, eks.a);
   private final in.a d;
   private Map<ekw<?>, ?> e = Map.of();
   private Multimap<ekz<?>, ajh> f = ImmutableMultimap.of();

   public ekx(in.a $$0) {
      this.d = $$0;
   }

   @Override
   public final CompletableFuture<Void> a(asi.a $$0, aso $$1, bjq $$2, bjq $$3, Executor $$4, Executor $$5) {
      Map<ekz<?>, Map<ajh, ?>> $$6 = new HashMap<>();
      CompletableFuture<?>[] $$7 = ekz.b().map($$3x -> a($$3x, this.d, $$1, $$4, $$6)).toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf($$7).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$6), $$5);
   }

   private static <T> CompletableFuture<?> a(ekz<T> $$0, in.a $$1, aso $$2, Executor $$3, Map<ekz<?>, Map<ajh, ?>> $$4) {
      ajf<JsonElement> $$5 = ajf.a(JsonOps.INSTANCE, $$1);
      Map<ajh, T> $$6 = new HashMap<>();
      $$4.put($$0, $$6);
      return CompletableFuture.runAsync(() -> {
         Map<ajh, JsonElement> $$4x = new HashMap<>();
         ass.a($$2, $$0.a(), c, $$4x);
         $$4x.forEach(($$3xx, $$4xx) -> $$0.a($$3xx, $$5, $$4xx).ifPresent($$2xxx -> $$6.put($$3xx, (T)$$2xxx)));
      }, $$3);
   }

   private void a(Map<ekz<?>, Map<ajh, ?>> $$0) {
      Object $$1 = $$0.get(ekz.c).remove(eks.a);
      if ($$1 != null) {
         b.warn("Datapack tried to redefine {} loot table, ignoring", eks.a);
      }

      Builder<ekw<?>, Object> $$2 = ImmutableMap.builder();
      com.google.common.collect.ImmutableMultimap.Builder<ekz<?>, ajh> $$3 = ImmutableMultimap.builder();
      $$0.forEach(($$2x, $$3x) -> $$3x.forEach(($$3xx, $$4x) -> {
            $$2.put(new ekw($$2x, $$3xx), $$4x);
            $$3.put($$2x, $$3xx);
         }));
      $$2.put(a, elc.a);
      axb.a $$4 = new axb.a();
      final Map<ekw<?>, ?> $$5 = $$2.build();
      eld $$6 = new eld($$4, ene.p, new eky() {
         @Nullable
         @Override
         public <T> T getElement(ekw<T> $$0) {
            return (T)$$5.get($$0);
         }
      });
      $$5.forEach(($$1x, $$2x) -> a($$6, $$1x, $$2x));
      $$4.a().forEach(($$0x, $$1x) -> b.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      this.e = $$5;
      this.f = $$3.build();
   }

   private static <T> void a(eld $$0, ekw<T> $$1, Object $$2) {
      $$1.a().a($$0, $$1, (T)$$2);
   }

   @Nullable
   @Override
   public <T> T getElement(ekw<T> $$0) {
      return (T)this.e.get($$0);
   }

   public Collection<ajh> a(ekz<?> $$0) {
      return this.f.get($$0);
   }
}
