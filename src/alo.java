import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class alo {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private static final ka c = new ka(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<alo.b> a(jv<aln> $$0, List<kb.a<?>> $$1, auv $$2, Executor $$3) {
      List<jq.b<?>> $$4 = axm.a($$0.b(aln.d), $$1);
      jq.a $$5 = jq.a.a($$4.stream());
      alc<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
      List<CompletableFuture<kk<?>>> $$7 = etn.a().map($$3x -> a($$3x, $$6, $$2, $$3)).toList();
      CompletableFuture<List<kk<?>>> $$8 = ad.d($$7);
      return $$8.thenApplyAsync($$2x -> a($$0, $$5, $$2x), $$3);
   }

   private static <T> CompletableFuture<kk<?>> a(etn<T> $$0, alc<JsonElement> $$1, auv $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         kk<T> $$3x = new jw<>($$0.b(), Lifecycle.experimental());
         Map<ale, JsonElement> $$4 = new HashMap<>();
         String $$5 = lw.c($$0.b());
         ava.a($$2, $$5, b, $$4);
         $$4.forEach(($$3xx, $$4x) -> $$0.a($$3xx, $$1, $$4x).ifPresent($$3xxx -> $$3x.a(ald.a($$0.b(), $$3xx), (T)$$3xxx, c)));
         axm.a($$2, $$3x);
         return $$3x;
      }, $$3);
   }

   private static alo.b a(jv<aln> $$0, jq.a $$1, List<kk<?>> $$2) {
      jv<aln> $$3 = a($$0, $$2);
      jq.a $$4 = a($$1, $$3.a(aln.d));
      a($$4);
      return new alo.b($$3, $$4);
   }

   private static jq.a a(jq.a $$0, jq.a $$1) {
      return jq.a.a(Stream.concat($$0.b(), $$1.b()));
   }

   private static void a(jq.a $$0) {
      azl.a $$1 = new azl.a();
      etr $$2 = new etr($$1, ewg.q, $$0);
      etn.a().forEach($$2x -> a($$2, $$2x, $$0));
      $$1.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
   }

   private static jv<aln> a(jv<aln> $$0, List<kk<?>> $$1) {
      return $$0.a(aln.d, new kc.c($$1).e());
   }

   private static <T> void a(etr $$0, etn<T> $$1, jq.a $$2) {
      jq<T> $$3 = $$2.d($$1.b());
      $$3.c().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   public static class a {
      private final jq.a a;

      public a(jq.a $$0) {
         this.a = $$0;
      }

      public jp.a a() {
         return this.a;
      }

      public Collection<ale> a(ald<? extends kb<?>> $$0) {
         return this.a.d($$0).c_().map(ald::a).toList();
      }

      public etq b(ald<etq> $$0) {
         return this.a.a(lw.be).flatMap($$1 -> $$1.a($$0)).map(jo::a).orElse(etq.a);
      }
   }

   public static record b(jv<aln> a, jq.a b) {
   }
}
