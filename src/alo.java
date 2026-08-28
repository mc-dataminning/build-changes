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
   private static final jq b = new jq(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<alo.b> a(jl<aln> $$0, List<jr.a<?>> $$1, avb $$2, Executor $$3) {
      List<jg.b<?>> $$4 = axq.a($$0.b(aln.d), $$1);
      jg.a $$5 = jg.a.a($$4.stream());
      alc<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
      List<CompletableFuture<ka<?>>> $$7 = eyp.a().map($$3x -> a($$3x, $$6, $$2, $$3)).toList();
      CompletableFuture<List<ka<?>>> $$8 = af.d($$7);
      return $$8.thenApplyAsync($$2x -> a($$0, $$5, $$2x), $$3);
   }

   private static <T> CompletableFuture<ka<?>> a(eyp<T> $$0, alc<JsonElement> $$1, avb $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         ka<T> $$3x = new jm<>($$0.b(), Lifecycle.experimental());
         Map<ale, T> $$4 = new HashMap<>();
         avf.a($$2, $$0.b(), $$1, $$0.c(), $$4);
         $$4.forEach(($$2xx, $$3xx) -> $$3x.a(ald.a($$0.b(), $$2xx), (T)$$3xx, b));
         axq.a($$2, $$3x);
         return $$3x;
      }, $$3);
   }

   private static alo.b a(jl<aln> $$0, jg.a $$1, List<ka<?>> $$2) {
      jl<aln> $$3 = a($$0, $$2);
      jg.a $$4 = a($$1, $$3.a(aln.d));
      a($$4);
      return new alo.b($$3, $$4);
   }

   private static jg.a a(jg.a $$0, jg.a $$1) {
      return jg.a.a(Stream.concat($$0.c(), $$1.c()));
   }

   private static void a(jg.a $$0) {
      azr.a $$1 = new azr.a();
      eyt $$2 = new eyt($$1, fbg.q, $$0);
      eyp.a().forEach($$2x -> a($$2, $$2x, $$0));
      $$1.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
   }

   private static jl<aln> a(jl<aln> $$0, List<ka<?>> $$1) {
      return $$0.a(aln.d, new js.c($$1).e());
   }

   private static <T> void a(eyt $$0, eyp<T> $$1, jg.a $$2) {
      jg<T> $$3 = $$2.e($$1.b());
      $$3.c().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   public static class a {
      private final jg.a a;

      public a(jg.a $$0) {
         this.a = $$0;
      }

      public jf.a a() {
         return this.a;
      }

      public Collection<ale> a(ald<? extends jr<?>> $$0) {
         return this.a.e($$0).c_().map(ald::a).toList();
      }

      public eys b(ald<eys> $$0) {
         return this.a.a(mg.bo).flatMap($$1 -> $$1.a($$0)).map(je::a).orElse(eys.a);
      }
   }

   public static record b(jl<aln> a, jg.a b) {
   }
}
