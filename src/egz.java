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

public class egz implements aqc, eha {
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   public static final egy<ehe> a = new egy<>(ehb.c, egu.a);
   private Map<egy<?>, ?> d = Map.of();
   private Multimap<ehb<?>, ahg> e = ImmutableMultimap.of();

   @Override
   public final CompletableFuture<Void> a(aqc.a $$0, aqi $$1, bgs $$2, bgs $$3, Executor $$4, Executor $$5) {
      Map<ehb<?>, Map<ahg, ?>> $$6 = new HashMap<>();
      CompletableFuture<?>[] $$7 = ehb.b().map($$3x -> a($$3x, $$1, $$4, $$6)).toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf($$7).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$6), $$5);
   }

   private static <T> CompletableFuture<?> a(ehb<T> $$0, aqi $$1, Executor $$2, Map<ehb<?>, Map<ahg, ?>> $$3) {
      Map<ahg, T> $$4 = new HashMap<>();
      $$3.put($$0, $$4);
      return CompletableFuture.runAsync(() -> {
         Map<ahg, JsonElement> $$3x = new HashMap<>();
         aqm.a($$1, $$0.a(), c, $$3x);
         $$3x.forEach(($$2xx, $$3xx) -> $$0.a($$2xx, $$3xx).ifPresent($$2xxx -> $$4.put($$2xx, (T)$$2xxx)));
      }, $$2);
   }

   private void a(Map<ehb<?>, Map<ahg, ?>> $$0) {
      Object $$1 = $$0.get(ehb.c).remove(egu.a);
      if ($$1 != null) {
         b.warn("Datapack tried to redefine {} loot table, ignoring", egu.a);
      }

      Builder<egy<?>, Object> $$2 = ImmutableMap.builder();
      com.google.common.collect.ImmutableMultimap.Builder<ehb<?>, ahg> $$3 = ImmutableMultimap.builder();
      $$0.forEach(($$2x, $$3x) -> $$3x.forEach(($$3xx, $$4x) -> {
            $$2.put(new egy($$2x, $$3xx), $$4x);
            $$3.put($$2x, $$3xx);
         }));
      $$2.put(a, ehe.a);
      aut.a $$4 = new aut.a();
      final Map<egy<?>, ?> $$5 = $$2.build();
      ehf $$6 = new ehf($$4, ejg.n, new eha() {
         @Nullable
         @Override
         public <T> T getElement(egy<T> $$0) {
            return (T)$$5.get($$0);
         }
      });
      $$5.forEach(($$1x, $$2x) -> a($$6, $$1x, $$2x));
      $$4.a().forEach(($$0x, $$1x) -> b.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      this.d = $$5;
      this.e = $$3.build();
   }

   private static <T> void a(ehf $$0, egy<T> $$1, Object $$2) {
      $$1.a().a($$0, $$1, (T)$$2);
   }

   @Nullable
   @Override
   public <T> T getElement(egy<T> $$0) {
      return (T)this.d.get($$0);
   }

   public Collection<ahg> a(ehb<?> $$0) {
      return this.e.get($$0);
   }
}
