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

public class eod implements ati, eoe {
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   public static final eoc<eoi> a = new eoc<>(eof.c, eny.a);
   private final ix.a d;
   private Map<eoc<?>, ?> e = Map.of();
   private Multimap<eof<?>, akf> f = ImmutableMultimap.of();

   public eod(ix.a $$0) {
      this.d = $$0;
   }

   @Override
   public final CompletableFuture<Void> a(ati.a $$0, ato $$1, ble $$2, ble $$3, Executor $$4, Executor $$5) {
      Map<eof<?>, Map<akf, ?>> $$6 = new HashMap<>();
      CompletableFuture<?>[] $$7 = eof.b().map($$3x -> a($$3x, this.d, $$1, $$4, $$6)).toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf($$7).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$6), $$5);
   }

   private static <T> CompletableFuture<?> a(eof<T> $$0, ix.a $$1, ato $$2, Executor $$3, Map<eof<?>, Map<akf, ?>> $$4) {
      akd<JsonElement> $$5 = $$1.a(JsonOps.INSTANCE);
      Map<akf, T> $$6 = new HashMap<>();
      $$4.put($$0, $$6);
      return CompletableFuture.runAsync(() -> {
         Map<akf, JsonElement> $$4x = new HashMap<>();
         ats.a($$2, $$0.a(), c, $$4x);
         $$4x.forEach(($$3xx, $$4xx) -> $$0.a($$3xx, $$5, $$4xx).ifPresent($$2xxx -> $$6.put($$3xx, (T)$$2xxx)));
      }, $$3);
   }

   private void a(Map<eof<?>, Map<akf, ?>> $$0) {
      Object $$1 = $$0.get(eof.c).remove(eny.a);
      if ($$1 != null) {
         b.warn("Datapack tried to redefine {} loot table, ignoring", eny.a);
      }

      Builder<eoc<?>, Object> $$2 = ImmutableMap.builder();
      com.google.common.collect.ImmutableMultimap.Builder<eof<?>, akf> $$3 = ImmutableMultimap.builder();
      $$0.forEach(($$2x, $$3x) -> $$3x.forEach(($$3xx, $$4x) -> {
            $$2.put(new eoc($$2x, $$3xx), $$4x);
            $$3.put($$2x, $$3xx);
         }));
      $$2.put(a, eoi.a);
      ayb.a $$4 = new ayb.a();
      final Map<eoc<?>, ?> $$5 = $$2.build();
      eoj $$6 = new eoj($$4, eqs.p, new eoe() {
         @Nullable
         @Override
         public <T> T getElement(eoc<T> $$0) {
            return (T)$$5.get($$0);
         }
      });
      $$5.forEach(($$1x, $$2x) -> a($$6, $$1x, $$2x));
      $$4.a().forEach(($$0x, $$1x) -> b.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      this.e = $$5;
      this.f = $$3.build();
   }

   private static <T> void a(eoj $$0, eoc<T> $$1, Object $$2) {
      $$1.a().a($$0, $$1, (T)$$2);
   }

   @Nullable
   @Override
   public <T> T getElement(eoc<T> $$0) {
      return (T)this.e.get($$0);
   }

   public Collection<akf> a(eof<?> $$0) {
      return this.f.get($$0);
   }
}
