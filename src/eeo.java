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

public class eeo implements aox, eep {
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   public static final een<eet> a = new een<>(eeq.c, eej.a);
   private Map<een<?>, ?> d = Map.of();
   private Multimap<eeq<?>, agg> e = ImmutableMultimap.of();

   @Override
   public final CompletableFuture<Void> a(aox.a $$0, apd $$1, bfh $$2, bfh $$3, Executor $$4, Executor $$5) {
      Map<eeq<?>, Map<agg, ?>> $$6 = new HashMap<>();
      CompletableFuture<?>[] $$7 = eeq.b().map($$3x -> a($$3x, $$1, $$4, $$6)).toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf($$7).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$6), $$5);
   }

   private static <T> CompletableFuture<?> a(eeq<T> $$0, apd $$1, Executor $$2, Map<eeq<?>, Map<agg, ?>> $$3) {
      Map<agg, T> $$4 = new HashMap<>();
      $$3.put($$0, $$4);
      return CompletableFuture.runAsync(() -> {
         Map<agg, JsonElement> $$3x = new HashMap<>();
         aph.a($$1, $$0.a(), c, $$3x);
         $$3x.forEach(($$2xx, $$3xx) -> $$0.a($$2xx, $$3xx).ifPresent($$2xxx -> $$4.put($$2xx, (T)$$2xxx)));
      }, $$2);
   }

   private void a(Map<eeq<?>, Map<agg, ?>> $$0) {
      Object $$1 = $$0.get(eeq.c).remove(eej.a);
      if ($$1 != null) {
         b.warn("Datapack tried to redefine {} loot table, ignoring", eej.a);
      }

      Builder<een<?>, Object> $$2 = ImmutableMap.builder();
      com.google.common.collect.ImmutableMultimap.Builder<eeq<?>, agg> $$3 = ImmutableMultimap.builder();
      $$0.forEach(($$2x, $$3x) -> $$3x.forEach(($$3xx, $$4x) -> {
            $$2.put(new een($$2x, $$3xx), $$4x);
            $$3.put($$2x, $$3xx);
         }));
      $$2.put(a, eet.a);
      final Map<een<?>, ?> $$4 = $$2.build();
      eeu $$5 = new eeu(egv.n, new eep() {
         @Nullable
         @Override
         public <T> T getElement(een<T> $$0) {
            return (T)$$4.get($$0);
         }
      });
      $$4.forEach(($$1x, $$2x) -> a($$5, $$1x, $$2x));
      $$5.a().forEach(($$0x, $$1x) -> b.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      this.d = $$4;
      this.e = $$3.build();
   }

   private static <T> void a(eeu $$0, een<T> $$1, Object $$2) {
      $$1.a().a($$0, $$1, (T)$$2);
   }

   @Nullable
   @Override
   public <T> T getElement(een<T> $$0) {
      return (T)this.d.get($$0);
   }

   public Collection<agg> a(eeq<?> $$0) {
      return this.e.get($$0);
   }
}
