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

public class alm {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private static final jz c = new jz(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<alm.b> a(ju<all> $$0, List<ka.a<?>> $$1, aut $$2, Executor $$3) {
      List<jp.b<?>> $$4 = axk.a($$0.b(all.d), $$1);
      jp.a $$5 = jp.a.a($$4.stream());
      ala<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
      List<CompletableFuture<kj<?>>> $$7 = etj.a().map($$3x -> a($$3x, $$6, $$2, $$3)).toList();
      CompletableFuture<List<kj<?>>> $$8 = ad.d($$7);
      return $$8.thenApplyAsync($$2x -> a($$0, $$5, $$2x), $$3);
   }

   private static <T> CompletableFuture<kj<?>> a(etj<T> $$0, ala<JsonElement> $$1, aut $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         kj<T> $$3x = new jv<>($$0.b(), Lifecycle.experimental());
         Map<alc, JsonElement> $$4 = new HashMap<>();
         String $$5 = lv.c($$0.b());
         auy.a($$2, $$5, b, $$4);
         $$4.forEach(($$3xx, $$4x) -> $$0.a($$3xx, $$1, $$4x).ifPresent($$3xxx -> $$3x.a(alb.a($$0.b(), $$3xx), (T)$$3xxx, c)));
         axk.a($$2, $$3x);
         return $$3x;
      }, $$3);
   }

   private static alm.b a(ju<all> $$0, jp.a $$1, List<kj<?>> $$2) {
      ju<all> $$3 = a($$0, $$2);
      jp.a $$4 = a($$1, $$3.a(all.d));
      a($$4);
      return new alm.b($$3, $$4);
   }

   private static jp.a a(jp.a $$0, jp.a $$1) {
      return jp.a.a(Stream.concat($$0.b(), $$1.b()));
   }

   private static void a(jp.a $$0) {
      azj.a $$1 = new azj.a();
      etn $$2 = new etn($$1, ewc.q, $$0.c());
      etj.a().forEach($$2x -> a($$2, $$2x, $$0));
      $$1.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
   }

   private static ju<all> a(ju<all> $$0, List<kj<?>> $$1) {
      kb $$2 = new kb.c($$1);
      ((kj)$$2.<etm>d(lv.bd)).a(etd.a, etm.a, c);
      return $$0.a(all.d, $$2.f());
   }

   private static <T> void a(etn $$0, etj<T> $$1, jp.a $$2) {
      jp<T> $$3 = $$2.b($$1.b());
      $$3.b().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   public static class a {
      private final jp.a a;

      public a(jp.a $$0) {
         this.a = $$0;
      }

      public jo.a a() {
         return this.a.c();
      }

      public Collection<alc> a(alb<? extends ka<?>> $$0) {
         return this.a.b($$0).c().map(alb::a).toList();
      }

      public etm b(alb<etm> $$0) {
         return this.a.a(lv.bd).flatMap($$1 -> $$1.a($$0)).map(jn::a).orElse(etm.a);
      }
   }

   public static record b(ju<all> a, jp.a b) {
   }
}
