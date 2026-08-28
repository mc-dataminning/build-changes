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

public class alf {
   private static final Logger a = LogUtils.getLogger();
   private static final kd b = new kd(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<alf.b> a(jy<ale> $$0, List<ke.a<?>> $$1, aup $$2, Executor $$3) {
      List<jt.b<?>> $$4 = axg.a($$0.b(ale.d), $$1);
      jt.a $$5 = jt.a.a($$4.stream());
      akt<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
      List<CompletableFuture<kn<?>>> $$7 = evt.a().map($$3x -> a($$3x, $$6, $$2, $$3)).toList();
      CompletableFuture<List<kn<?>>> $$8 = af.d($$7);
      return $$8.thenApplyAsync($$2x -> a($$0, $$5, $$2x), $$3);
   }

   private static <T> CompletableFuture<kn<?>> a(evt<T> $$0, akt<JsonElement> $$1, aup $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         kn<T> $$3x = new jz<>($$0.b(), Lifecycle.experimental());
         Map<akv, T> $$4 = new HashMap<>();
         aut.a($$2, $$0.b(), $$1, $$0.c(), $$4);
         $$4.forEach(($$2xx, $$3xx) -> $$3x.a(aku.a($$0.b(), $$2xx), (T)$$3xx, b));
         axg.a($$2, $$3x);
         return $$3x;
      }, $$3);
   }

   private static alf.b a(jy<ale> $$0, jt.a $$1, List<kn<?>> $$2) {
      jy<ale> $$3 = a($$0, $$2);
      jt.a $$4 = a($$1, $$3.a(ale.d));
      a($$4);
      return new alf.b($$3, $$4);
   }

   private static jt.a a(jt.a $$0, jt.a $$1) {
      return jt.a.a(Stream.concat($$0.c(), $$1.c()));
   }

   private static void a(jt.a $$0) {
      azf.a $$1 = new azf.a();
      evx $$2 = new evx($$1, eyk.q, $$0);
      evt.a().forEach($$2x -> a($$2, $$2x, $$0));
      $$1.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
   }

   private static jy<ale> a(jy<ale> $$0, List<kn<?>> $$1) {
      return $$0.a(ale.d, new kf.c($$1).e());
   }

   private static <T> void a(evx $$0, evt<T> $$1, jt.a $$2) {
      jt<T> $$3 = $$2.d($$1.b());
      $$3.c().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   public static class a {
      private final jt.a a;

      public a(jt.a $$0) {
         this.a = $$0;
      }

      public js.a a() {
         return this.a;
      }

      public Collection<akv> a(aku<? extends ke<?>> $$0) {
         return this.a.d($$0).c_().map(aku::a).toList();
      }

      public evw b(aku<evw> $$0) {
         return this.a.a(mc.bg).flatMap($$1 -> $$1.a($$0)).map(jr::a).orElse(evw.a);
      }
   }

   public static record b(jy<ale> a, jt.a b) {
   }
}
