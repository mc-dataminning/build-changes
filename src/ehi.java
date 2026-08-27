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

public class ehi implements aqd, ehj {
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   public static final ehh<ehn> a = new ehh<>(ehk.c, ehd.a);
   private Map<ehh<?>, ?> d = Map.of();
   private Multimap<ehk<?>, ahh> e = ImmutableMultimap.of();

   @Override
   public final CompletableFuture<Void> a(aqd.a $$0, aqj $$1, bgt $$2, bgt $$3, Executor $$4, Executor $$5) {
      Map<ehk<?>, Map<ahh, ?>> $$6 = new HashMap<>();
      CompletableFuture<?>[] $$7 = ehk.b().map($$3x -> a($$3x, $$1, $$4, $$6)).toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf($$7).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$6), $$5);
   }

   private static <T> CompletableFuture<?> a(ehk<T> $$0, aqj $$1, Executor $$2, Map<ehk<?>, Map<ahh, ?>> $$3) {
      Map<ahh, T> $$4 = new HashMap<>();
      $$3.put($$0, $$4);
      return CompletableFuture.runAsync(() -> {
         Map<ahh, JsonElement> $$3x = new HashMap<>();
         aqn.a($$1, $$0.a(), c, $$3x);
         $$3x.forEach(($$2xx, $$3xx) -> $$0.a($$2xx, $$3xx).ifPresent($$2xxx -> $$4.put($$2xx, (T)$$2xxx)));
      }, $$2);
   }

   private void a(Map<ehk<?>, Map<ahh, ?>> $$0) {
      Object $$1 = $$0.get(ehk.c).remove(ehd.a);
      if ($$1 != null) {
         b.warn("Datapack tried to redefine {} loot table, ignoring", ehd.a);
      }

      Builder<ehh<?>, Object> $$2 = ImmutableMap.builder();
      com.google.common.collect.ImmutableMultimap.Builder<ehk<?>, ahh> $$3 = ImmutableMultimap.builder();
      $$0.forEach(($$2x, $$3x) -> $$3x.forEach(($$3xx, $$4x) -> {
            $$2.put(new ehh($$2x, $$3xx), $$4x);
            $$3.put($$2x, $$3xx);
         }));
      $$2.put(a, ehn.a);
      auu.a $$4 = new auu.a();
      final Map<ehh<?>, ?> $$5 = $$2.build();
      eho $$6 = new eho($$4, ejp.n, new ehj() {
         @Nullable
         @Override
         public <T> T getElement(ehh<T> $$0) {
            return (T)$$5.get($$0);
         }
      });
      $$5.forEach(($$1x, $$2x) -> a($$6, $$1x, $$2x));
      $$4.a().forEach(($$0x, $$1x) -> b.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      this.d = $$5;
      this.e = $$3.build();
   }

   private static <T> void a(eho $$0, ehh<T> $$1, Object $$2) {
      $$1.a().a($$0, $$1, (T)$$2);
   }

   @Nullable
   @Override
   public <T> T getElement(ehh<T> $$0) {
      return (T)this.d.get($$0);
   }

   public Collection<ahh> a(ehk<?> $$0) {
      return this.e.get($$0);
   }
}
