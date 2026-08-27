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

public class ekz implements asi, ela {
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   public static final eky<ele> a = new eky<>(elb.c, eku.a);
   private final in.a d;
   private Map<eky<?>, ?> e = Map.of();
   private Multimap<elb<?>, ajh> f = ImmutableMultimap.of();

   public ekz(in.a $$0) {
      this.d = $$0;
   }

   @Override
   public final CompletableFuture<Void> a(asi.a $$0, aso $$1, bjr $$2, bjr $$3, Executor $$4, Executor $$5) {
      Map<elb<?>, Map<ajh, ?>> $$6 = new HashMap<>();
      CompletableFuture<?>[] $$7 = elb.b().map($$3x -> a($$3x, this.d, $$1, $$4, $$6)).toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf($$7).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$6), $$5);
   }

   private static <T> CompletableFuture<?> a(elb<T> $$0, in.a $$1, aso $$2, Executor $$3, Map<elb<?>, Map<ajh, ?>> $$4) {
      ajf<JsonElement> $$5 = $$1.a(JsonOps.INSTANCE);
      Map<ajh, T> $$6 = new HashMap<>();
      $$4.put($$0, $$6);
      return CompletableFuture.runAsync(() -> {
         Map<ajh, JsonElement> $$4x = new HashMap<>();
         ass.a($$2, $$0.a(), c, $$4x);
         $$4x.forEach(($$3xx, $$4xx) -> $$0.a($$3xx, $$5, $$4xx).ifPresent($$2xxx -> $$6.put($$3xx, (T)$$2xxx)));
      }, $$3);
   }

   private void a(Map<elb<?>, Map<ajh, ?>> $$0) {
      Object $$1 = $$0.get(elb.c).remove(eku.a);
      if ($$1 != null) {
         b.warn("Datapack tried to redefine {} loot table, ignoring", eku.a);
      }

      Builder<eky<?>, Object> $$2 = ImmutableMap.builder();
      com.google.common.collect.ImmutableMultimap.Builder<elb<?>, ajh> $$3 = ImmutableMultimap.builder();
      $$0.forEach(($$2x, $$3x) -> $$3x.forEach(($$3xx, $$4x) -> {
            $$2.put(new eky($$2x, $$3xx), $$4x);
            $$3.put($$2x, $$3xx);
         }));
      $$2.put(a, ele.a);
      axb.a $$4 = new axb.a();
      final Map<eky<?>, ?> $$5 = $$2.build();
      elf $$6 = new elf($$4, eng.p, new ela() {
         @Nullable
         @Override
         public <T> T getElement(eky<T> $$0) {
            return (T)$$5.get($$0);
         }
      });
      $$5.forEach(($$1x, $$2x) -> a($$6, $$1x, $$2x));
      $$4.a().forEach(($$0x, $$1x) -> b.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      this.e = $$5;
      this.f = $$3.build();
   }

   private static <T> void a(elf $$0, eky<T> $$1, Object $$2) {
      $$1.a().a($$0, $$1, (T)$$2);
   }

   @Nullable
   @Override
   public <T> T getElement(eky<T> $$0) {
      return (T)this.e.get($$0);
   }

   public Collection<ajh> a(elb<?> $$0) {
      return this.f.get($$0);
   }
}
