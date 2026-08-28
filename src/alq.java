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

public class alq {
   private static final Logger a = LogUtils.getLogger();
   private static final jr b = new jr(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<alq.b> a(jm<alp> $$0, List<js.a<?>> $$1, avd $$2, Executor $$3) {
      List<jh.b<?>> $$4 = axs.a($$0.b(alp.d), $$1);
      jh.a $$5 = jh.a.a($$4.stream());
      ale<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
      List<CompletableFuture<kb<?>>> $$7 = ezv.a().map($$3x -> a($$3x, $$6, $$2, $$3)).toList();
      CompletableFuture<List<kb<?>>> $$8 = ag.d($$7);
      return $$8.thenApplyAsync($$2x -> a($$0, $$5, $$2x), $$3);
   }

   private static <T> CompletableFuture<kb<?>> a(ezv<T> $$0, ale<JsonElement> $$1, avd $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         kb<T> $$3x = new jn<>($$0.b(), Lifecycle.experimental());
         Map<alg, T> $$4 = new HashMap<>();
         avh.a($$2, $$0.b(), $$1, $$0.c(), $$4);
         $$4.forEach(($$2xx, $$3xx) -> $$3x.a(alf.a($$0.b(), $$2xx), (T)$$3xx, b));
         axs.a($$2, $$3x);
         return $$3x;
      }, $$3);
   }

   private static alq.b a(jm<alp> $$0, jh.a $$1, List<kb<?>> $$2) {
      jm<alp> $$3 = a($$0, $$2);
      jh.a $$4 = a($$1, $$3.a(alp.d));
      a($$4);
      return new alq.b($$3, $$4);
   }

   private static jh.a a(jh.a $$0, jh.a $$1) {
      return jh.a.a(Stream.concat($$0.c(), $$1.c()));
   }

   private static void a(jh.a $$0) {
      azt.a $$1 = new azt.a();
      ezz $$2 = new ezz($$1, fcm.q, $$0);
      ezv.a().forEach($$2x -> a($$2, $$2x, $$0));
      $$1.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
   }

   private static jm<alp> a(jm<alp> $$0, List<kb<?>> $$1) {
      return $$0.a(alp.d, new jt.c($$1).e());
   }

   private static <T> void a(ezz $$0, ezv<T> $$1, jh.a $$2) {
      jh<T> $$3 = $$2.e($$1.b());
      $$3.c().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   public static class a {
      private final jh.a a;

      public a(jh.a $$0) {
         this.a = $$0;
      }

      public jg.a a() {
         return this.a;
      }

      public Collection<alg> a(alf<? extends js<?>> $$0) {
         return this.a.e($$0).c_().map(alf::a).toList();
      }

      public ezy b(alf<ezy> $$0) {
         return this.a.a(mh.br).flatMap($$1 -> $$1.a($$0)).map(jf::a).orElse(ezy.f);
      }
   }

   public static record b(jm<alp> a, jh.a b) {
   }
}
