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
   private static final jr b = new jr(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<als.b> a(jm<alr> $$0, List<js.a<?>> $$1, avf $$2, Executor $$3) {
      List<jh.b<?>> $$4 = axu.a($$0.b(alr.d), $$1);
      jh.a $$5 = jh.a.a($$4.stream());
      alg<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
      List<CompletableFuture<kb<?>>> $$7 = faj.a().map($$3x -> a($$3x, $$6, $$2, $$3)).toList();
      CompletableFuture<List<kb<?>>> $$8 = ag.d($$7);
      return $$8.thenApplyAsync($$2x -> a($$0, $$5, $$2x), $$3);
   }

   private static <T> CompletableFuture<kb<?>> a(faj<T> $$0, alg<JsonElement> $$1, avf $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         kb<T> $$3x = new jn<>($$0.b(), Lifecycle.experimental());
         Map<ali, T> $$4 = new HashMap<>();
         avj.a($$2, $$0.b(), $$1, $$0.c(), $$4);
         $$4.forEach(($$2xx, $$3xx) -> $$3x.a(alh.a($$0.b(), $$2xx), (T)$$3xx, b));
         axu.a($$2, $$3x);
         return $$3x;
      }, $$3);
   }

   private static als.b a(jm<alr> $$0, jh.a $$1, List<kb<?>> $$2) {
      jm<alr> $$3 = a($$0, $$2);
      jh.a $$4 = a($$1, $$3.a(alr.d));
      a($$4);
      return new als.b($$3, $$4);
   }

   private static jh.a a(jh.a $$0, jh.a $$1) {
      return jh.a.a(Stream.concat($$0.c(), $$1.c()));
   }

   private static void a(jh.a $$0) {
      azv.a $$1 = new azv.a();
      fan $$2 = new fan($$1, fda.q, $$0);
      faj.a().forEach($$2x -> a($$2, $$2x, $$0));
      $$1.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
   }

   private static jm<alr> a(jm<alr> $$0, List<kb<?>> $$1) {
      return $$0.a(alr.d, new jt.c($$1).e());
   }

   private static <T> void a(fan $$0, faj<T> $$1, jh.a $$2) {
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

      public Collection<ali> a(alh<? extends js<?>> $$0) {
         return this.a.e($$0).c_().map(alh::a).toList();
      }

      public fam b(alh<fam> $$0) {
         return this.a.a(mh.br).flatMap($$1 -> $$1.a($$0)).map(jf::a).orElse(fam.f);
      }
   }

   public static record b(jm<alr> a, jh.a b) {
   }
}
