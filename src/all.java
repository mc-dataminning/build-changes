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

public class all {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private static final jz c = new jz(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<all.b> a(ju<alk> $$0, List<ka.a<?>> $$1, aus $$2, Executor $$3) {
      List<jp.b<?>> $$4 = axj.a($$0.b(alk.d), $$1);
      jp.a $$5 = jp.a.a($$4.stream());
      akz<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
      List<CompletableFuture<kj<?>>> $$7 = esv.a().map($$3x -> a($$3x, $$6, $$2, $$3)).toList();
      CompletableFuture<List<kj<?>>> $$8 = ad.d($$7);
      return $$8.thenApplyAsync($$2x -> a($$0, $$5, $$2x), $$3);
   }

   private static <T> CompletableFuture<kj<?>> a(esv<T> $$0, akz<JsonElement> $$1, aus $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         kj<T> $$3x = new jv<>($$0.b(), Lifecycle.experimental());
         Map<alb, JsonElement> $$4 = new HashMap<>();
         String $$5 = lv.c($$0.b());
         auw.a($$2, $$5, b, $$4);
         $$4.forEach(($$3xx, $$4x) -> $$0.a($$3xx, $$1, $$4x).ifPresent($$3xxx -> $$3x.a(ala.a($$0.b(), $$3xx), (T)$$3xxx, c)));
         axj.a($$2, $$3x);
         return $$3x;
      }, $$3);
   }

   private static all.b a(ju<alk> $$0, jp.a $$1, List<kj<?>> $$2) {
      ju<alk> $$3 = a($$0, $$2);
      jp.a $$4 = a($$1, $$3.a(alk.d));
      a($$4);
      return new all.b($$3, $$4);
   }

   private static jp.a a(jp.a $$0, jp.a $$1) {
      return jp.a.a(Stream.concat($$0.b(), $$1.b()));
   }

   private static void a(jp.a $$0) {
      azi.a $$1 = new azi.a();
      esz $$2 = new esz($$1, evo.q, $$0.c());
      esv.a().forEach($$2x -> a($$2, $$2x, $$0));
      $$1.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
   }

   private static ju<alk> a(ju<alk> $$0, List<kj<?>> $$1) {
      kb $$2 = new kb.c($$1);
      ((kj)$$2.<esy>d(lv.bc)).a(esp.a, esy.a, c);
      return $$0.a(alk.d, $$2.f());
   }

   private static <T> void a(esz $$0, esv<T> $$1, jp.a $$2) {
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

      public Collection<alb> a(ala<? extends ka<?>> $$0) {
         return this.a.b($$0).c().map(ala::a).toList();
      }

      public esy b(ala<esy> $$0) {
         return this.a.a(lv.bc).flatMap($$1 -> $$1.a($$0)).map(jn::a).orElse(esy.a);
      }
   }

   public static record b(ju<alk> a, jp.a b) {
   }
}
