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

public class alu {
   private static final Logger a = LogUtils.getLogger();
   private static final js b = new js(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<alu.b> a(jn<alt> $$0, List<jt.a<?>> $$1, avh $$2, Executor $$3) {
      List<ji.b<?>> $$4 = axw.a($$0.b(alt.d), $$1);
      ji.a $$5 = ji.a.a($$4.stream());
      ali<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
      List<CompletableFuture<kc<?>>> $$7 = fal.a().map($$3x -> a($$3x, $$6, $$2, $$3)).toList();
      CompletableFuture<List<kc<?>>> $$8 = ag.d($$7);
      return $$8.thenApplyAsync($$2x -> a($$0, $$5, $$2x), $$3);
   }

   private static <T> CompletableFuture<kc<?>> a(fal<T> $$0, ali<JsonElement> $$1, avh $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         kc<T> $$3x = new jo<>($$0.b(), Lifecycle.experimental());
         Map<alk, T> $$4 = new HashMap<>();
         avl.a($$2, $$0.b(), $$1, $$0.c(), $$4);
         $$4.forEach(($$2xx, $$3xx) -> $$3x.a(alj.a($$0.b(), $$2xx), (T)$$3xx, b));
         axw.a($$2, $$3x);
         return $$3x;
      }, $$3);
   }

   private static alu.b a(jn<alt> $$0, ji.a $$1, List<kc<?>> $$2) {
      jn<alt> $$3 = a($$0, $$2);
      ji.a $$4 = a($$1, $$3.a(alt.d));
      a($$4);
      return new alu.b($$3, $$4);
   }

   private static ji.a a(ji.a $$0, ji.a $$1) {
      return ji.a.a(Stream.concat($$0.c(), $$1.c()));
   }

   private static void a(ji.a $$0) {
      azx.a $$1 = new azx.a();
      fap $$2 = new fap($$1, fdc.q, $$0);
      fal.a().forEach($$2x -> a($$2, $$2x, $$0));
      $$1.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
   }

   private static jn<alt> a(jn<alt> $$0, List<kc<?>> $$1) {
      return $$0.a(alt.d, new ju.c($$1).e());
   }

   private static <T> void a(fap $$0, fal<T> $$1, ji.a $$2) {
      ji<T> $$3 = $$2.e($$1.b());
      $$3.c().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   public static class a {
      private final ji.a a;

      public a(ji.a $$0) {
         this.a = $$0;
      }

      public jh.a a() {
         return this.a;
      }

      public Collection<alk> a(alj<? extends jt<?>> $$0) {
         return this.a.e($$0).c_().map(alj::a).toList();
      }

      public fao b(alj<fao> $$0) {
         return this.a.a(mi.br).flatMap($$1 -> $$1.a($$0)).map(jg::a).orElse(fao.f);
      }
   }

   public static record b(jn<alt> a, ji.a b) {
   }
}
