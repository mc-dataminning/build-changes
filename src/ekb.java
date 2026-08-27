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

public class ekb implements arz, ekc {
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   public static final eka<ekg> a = new eka<>(ekd.c, ejw.a);
   private final in.a d;
   private Map<eka<?>, ?> e = Map.of();
   private Multimap<ekd<?>, ajc> f = ImmutableMultimap.of();

   public ekb(in.a $$0) {
      this.d = $$0;
   }

   @Override
   public final CompletableFuture<Void> a(arz.a $$0, asf $$1, bjc $$2, bjc $$3, Executor $$4, Executor $$5) {
      Map<ekd<?>, Map<ajc, ?>> $$6 = new HashMap<>();
      CompletableFuture<?>[] $$7 = ekd.b().map($$3x -> a($$3x, this.d, $$1, $$4, $$6)).toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf($$7).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$6), $$5);
   }

   private static <T> CompletableFuture<?> a(ekd<T> $$0, in.a $$1, asf $$2, Executor $$3, Map<ekd<?>, Map<ajc, ?>> $$4) {
      aja<JsonElement> $$5 = aja.a(JsonOps.INSTANCE, $$1);
      Map<ajc, T> $$6 = new HashMap<>();
      $$4.put($$0, $$6);
      return CompletableFuture.runAsync(() -> {
         Map<ajc, JsonElement> $$4x = new HashMap<>();
         asj.a($$2, $$0.a(), c, $$4x);
         $$4x.forEach(($$3xx, $$4xx) -> $$0.a($$3xx, $$5, $$4xx).ifPresent($$2xxx -> $$6.put($$3xx, (T)$$2xxx)));
      }, $$3);
   }

   private void a(Map<ekd<?>, Map<ajc, ?>> $$0) {
      Object $$1 = $$0.get(ekd.c).remove(ejw.a);
      if ($$1 != null) {
         b.warn("Datapack tried to redefine {} loot table, ignoring", ejw.a);
      }

      Builder<eka<?>, Object> $$2 = ImmutableMap.builder();
      com.google.common.collect.ImmutableMultimap.Builder<ekd<?>, ajc> $$3 = ImmutableMultimap.builder();
      $$0.forEach(($$2x, $$3x) -> $$3x.forEach(($$3xx, $$4x) -> {
            $$2.put(new eka($$2x, $$3xx), $$4x);
            $$3.put($$2x, $$3xx);
         }));
      $$2.put(a, ekg.a);
      awr.a $$4 = new awr.a();
      final Map<eka<?>, ?> $$5 = $$2.build();
      ekh $$6 = new ekh($$4, emi.p, new ekc() {
         @Nullable
         @Override
         public <T> T getElement(eka<T> $$0) {
            return (T)$$5.get($$0);
         }
      });
      $$5.forEach(($$1x, $$2x) -> a($$6, $$1x, $$2x));
      $$4.a().forEach(($$0x, $$1x) -> b.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      this.e = $$5;
      this.f = $$3.build();
   }

   private static <T> void a(ekh $$0, eka<T> $$1, Object $$2) {
      $$1.a().a($$0, $$1, (T)$$2);
   }

   @Nullable
   @Override
   public <T> T getElement(eka<T> $$0) {
      return (T)this.e.get($$0);
   }

   public Collection<ajc> a(ekd<?> $$0) {
      return this.f.get($$0);
   }
}
