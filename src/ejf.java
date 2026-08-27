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

public class ejf implements arv, ejg {
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   public static final eje<ejk> a = new eje<>(ejh.c, eja.a);
   private Map<eje<?>, ?> d = Map.of();
   private Multimap<ejh<?>, aiy> e = ImmutableMultimap.of();

   @Override
   public final CompletableFuture<Void> a(arv.a $$0, asb $$1, bin $$2, bin $$3, Executor $$4, Executor $$5) {
      Map<ejh<?>, Map<aiy, ?>> $$6 = new HashMap<>();
      CompletableFuture<?>[] $$7 = ejh.b().map($$3x -> a($$3x, $$1, $$4, $$6)).toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf($$7).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$6), $$5);
   }

   private static <T> CompletableFuture<?> a(ejh<T> $$0, asb $$1, Executor $$2, Map<ejh<?>, Map<aiy, ?>> $$3) {
      Map<aiy, T> $$4 = new HashMap<>();
      $$3.put($$0, $$4);
      return CompletableFuture.runAsync(() -> {
         Map<aiy, JsonElement> $$3x = new HashMap<>();
         asf.a($$1, $$0.a(), c, $$3x);
         $$3x.forEach(($$2xx, $$3xx) -> $$0.a($$2xx, $$3xx).ifPresent($$2xxx -> $$4.put($$2xx, (T)$$2xxx)));
      }, $$2);
   }

   private void a(Map<ejh<?>, Map<aiy, ?>> $$0) {
      Object $$1 = $$0.get(ejh.c).remove(eja.a);
      if ($$1 != null) {
         b.warn("Datapack tried to redefine {} loot table, ignoring", eja.a);
      }

      Builder<eje<?>, Object> $$2 = ImmutableMap.builder();
      com.google.common.collect.ImmutableMultimap.Builder<ejh<?>, aiy> $$3 = ImmutableMultimap.builder();
      $$0.forEach(($$2x, $$3x) -> $$3x.forEach(($$3xx, $$4x) -> {
            $$2.put(new eje($$2x, $$3xx), $$4x);
            $$3.put($$2x, $$3xx);
         }));
      $$2.put(a, ejk.a);
      awn.a $$4 = new awn.a();
      final Map<eje<?>, ?> $$5 = $$2.build();
      ejl $$6 = new ejl($$4, elm.o, new ejg() {
         @Nullable
         @Override
         public <T> T getElement(eje<T> $$0) {
            return (T)$$5.get($$0);
         }
      });
      $$5.forEach(($$1x, $$2x) -> a($$6, $$1x, $$2x));
      $$4.a().forEach(($$0x, $$1x) -> b.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      this.d = $$5;
      this.e = $$3.build();
   }

   private static <T> void a(ejl $$0, eje<T> $$1, Object $$2) {
      $$1.a().a($$0, $$1, (T)$$2);
   }

   @Nullable
   @Override
   public <T> T getElement(eje<T> $$0) {
      return (T)this.d.get($$0);
   }

   public Collection<aiy> a(ejh<?> $$0) {
      return this.e.get($$0);
   }
}
