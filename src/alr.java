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

public class alr {
   private static final Logger a = LogUtils.getLogger();
   private static final kb b = new kb(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<alr.b> a(jw<alq> $$0, List<kc.a<?>> $$1, ava $$2, Executor $$3) {
      List<jr.b<?>> $$4 = axq.a($$0.b(alq.d), $$1);
      jr.a $$5 = jr.a.a($$4.stream());
      alf<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
      List<CompletableFuture<kl<?>>> $$7 = ety.a().map($$3x -> a($$3x, $$6, $$2, $$3)).toList();
      CompletableFuture<List<kl<?>>> $$8 = ad.d($$7);
      return $$8.thenApplyAsync($$2x -> a($$0, $$5, $$2x), $$3);
   }

   private static <T> CompletableFuture<kl<?>> a(ety<T> $$0, alf<JsonElement> $$1, ava $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         kl<T> $$3x = new jx<>($$0.b(), Lifecycle.experimental());
         Map<alh, T> $$4 = new HashMap<>();
         String $$5 = ly.c($$0.b());
         ave.a($$2, $$5, $$1, $$0.c(), $$4);
         $$4.forEach(($$2xx, $$3xx) -> $$3x.a(alg.a($$0.b(), $$2xx), (T)$$3xx, b));
         axq.a($$2, $$3x);
         return $$3x;
      }, $$3);
   }

   private static alr.b a(jw<alq> $$0, jr.a $$1, List<kl<?>> $$2) {
      jw<alq> $$3 = a($$0, $$2);
      jr.a $$4 = a($$1, $$3.a(alq.d));
      a($$4);
      return new alr.b($$3, $$4);
   }

   private static jr.a a(jr.a $$0, jr.a $$1) {
      return jr.a.a(Stream.concat($$0.b(), $$1.b()));
   }

   private static void a(jr.a $$0) {
      azp.a $$1 = new azp.a();
      euc $$2 = new euc($$1, ewr.q, $$0);
      ety.a().forEach($$2x -> a($$2, $$2x, $$0));
      $$1.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
   }

   private static jw<alq> a(jw<alq> $$0, List<kl<?>> $$1) {
      return $$0.a(alq.d, new kd.c($$1).e());
   }

   private static <T> void a(euc $$0, ety<T> $$1, jr.a $$2) {
      jr<T> $$3 = $$2.d($$1.b());
      $$3.c().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   public static class a {
      private final jr.a a;

      public a(jr.a $$0) {
         this.a = $$0;
      }

      public jq.a a() {
         return this.a;
      }

      public Collection<alh> a(alg<? extends kc<?>> $$0) {
         return this.a.d($$0).c_().map(alg::a).toList();
      }

      public eub b(alg<eub> $$0) {
         return this.a.a(ly.bd).flatMap($$1 -> $$1.a($$0)).map(jp::a).orElse(eub.a);
      }
   }

   public static record b(jw<alq> a, jr.a b) {
   }
}
