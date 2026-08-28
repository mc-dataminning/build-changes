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

public class alb {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private static final jy c = new jy(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<jt<ala>> a(jt<ala> $$0, aue $$1, Executor $$2) {
      ka.b $$3 = $$0.b(ala.d);
      akp<JsonElement> $$4 = new alb.a($$3).a(JsonOps.INSTANCE);
      List<CompletableFuture<ki<?>>> $$5 = err.a().map($$3x -> a($$3x, $$4, $$1, $$2)).toList();
      CompletableFuture<List<ki<?>>> $$6 = ad.d($$5);
      return $$6.thenApplyAsync($$1x -> a($$0, $$1x), $$2);
   }

   private static <T> CompletableFuture<ki<?>> a(err<T> $$0, akp<JsonElement> $$1, aue $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         ki<T> $$3x = new ju<>($$0.b(), Lifecycle.experimental());
         Map<akr, JsonElement> $$4 = new HashMap<>();
         String $$5 = lu.c($$0.b());
         aui.a($$2, $$5, b, $$4);
         $$4.forEach(($$3xx, $$4x) -> $$0.a($$3xx, $$1, $$4x).ifPresent($$3xxx -> $$3x.a(akq.a($$0.b(), $$3xx), (T)$$3xxx, c)));
         return $$3x;
      }, $$3);
   }

   private static jt<ala> a(jt<ala> $$0, List<ki<?>> $$1) {
      jt<ala> $$2 = b($$0, $$1);
      ayu.a $$3 = new ayu.a();
      ka.b $$4 = $$2.a();
      erv $$5 = new erv($$3, euk.q, $$4.b());
      err.a().forEach($$2x -> a($$5, $$2x, $$4));
      $$3.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      return $$2;
   }

   private static jt<ala> b(jt<ala> $$0, List<ki<?>> $$1) {
      ka $$2 = new ka.c($$1);
      ((ki)$$2.<eru>d(lu.bc)).a(erl.a, eru.a, c);
      return $$0.a(ala.d, $$2.d());
   }

   private static <T> void a(erv $$0, err<T> $$1, ka $$2) {
      jz<T> $$3 = $$2.d($$1.b());
      $$3.i().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   static class a implements jo.a {
      private final ka a;

      a(ka $$0) {
         this.a = $$0;
      }

      @Override
      public Stream<akq<? extends jz<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<jo.b<T>> a(akq<? extends jz<? extends T>> $$0) {
         return this.a.c($$0).map(jz::v);
      }
   }

   public static class b {
      private final ka.b a;

      public b(ka.b $$0) {
         this.a = $$0;
      }

      public ka.b a() {
         return this.a;
      }

      public jn.a b() {
         return this.a.b();
      }

      public Collection<akr> a(akq<? extends jz<?>> $$0) {
         return this.a.c($$0).stream().flatMap($$0x -> $$0x.i().map($$0xx -> $$0xx.h().a())).toList();
      }

      public eru b(akq<eru> $$0) {
         return this.a.a(lu.bc).flatMap($$1 -> $$1.a($$0)).map(jm::a).orElse(eru.a);
      }
   }
}
