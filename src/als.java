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

public class als {
   private static final Logger a = LogUtils.getLogger();
   private static final kc b = new kc(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<als.b> a(jx<alr> $$0, List<kd.a<?>> $$1, avb $$2, Executor $$3) {
      List<js.b<?>> $$4 = axr.a($$0.b(alr.d), $$1);
      js.a $$5 = js.a.a($$4.stream());
      alg<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
      List<CompletableFuture<km<?>>> $$7 = eue.a().map($$3x -> a($$3x, $$6, $$2, $$3)).toList();
      CompletableFuture<List<km<?>>> $$8 = ae.d($$7);
      return $$8.thenApplyAsync($$2x -> a($$0, $$5, $$2x), $$3);
   }

   private static <T> CompletableFuture<km<?>> a(eue<T> $$0, alg<JsonElement> $$1, avb $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         km<T> $$3x = new jy<>($$0.b(), Lifecycle.experimental());
         Map<ali, T> $$4 = new HashMap<>();
         String $$5 = lz.c($$0.b());
         avf.a($$2, $$5, $$1, $$0.c(), $$4);
         $$4.forEach(($$2xx, $$3xx) -> $$3x.a(alh.a($$0.b(), $$2xx), (T)$$3xx, b));
         axr.a($$2, $$3x);
         return $$3x;
      }, $$3);
   }

   private static als.b a(jx<alr> $$0, js.a $$1, List<km<?>> $$2) {
      jx<alr> $$3 = a($$0, $$2);
      js.a $$4 = a($$1, $$3.a(alr.d));
      a($$4);
      return new als.b($$3, $$4);
   }

   private static js.a a(js.a $$0, js.a $$1) {
      return js.a.a(Stream.concat($$0.c(), $$1.c()));
   }

   private static void a(js.a $$0) {
      azq.a $$1 = new azq.a();
      eui $$2 = new eui($$1, ewx.q, $$0);
      eue.a().forEach($$2x -> a($$2, $$2x, $$0));
      $$1.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
   }

   private static jx<alr> a(jx<alr> $$0, List<km<?>> $$1) {
      return $$0.a(alr.d, new ke.c($$1).e());
   }

   private static <T> void a(eui $$0, eue<T> $$1, js.a $$2) {
      js<T> $$3 = $$2.d($$1.b());
      $$3.c().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   public static class a {
      private final js.a a;

      public a(js.a $$0) {
         this.a = $$0;
      }

      public jr.a a() {
         return this.a;
      }

      public Collection<ali> a(alh<? extends kd<?>> $$0) {
         return this.a.d($$0).c_().map(alh::a).toList();
      }

      public euh b(alh<euh> $$0) {
         return this.a.a(lz.bd).flatMap($$1 -> $$1.a($$0)).map(jq::a).orElse(euh.a);
      }
   }

   public static record b(jx<alr> a, js.a b) {
   }
}
