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

public class aku {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private static final jv c = new jv(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<jq<akt>> a(jq<akt> $$0, atw $$1, Executor $$2) {
      jx.b $$3 = $$0.b(akt.d);
      aki<JsonElement> $$4 = new aku.a($$3).a(JsonOps.INSTANCE);
      List<CompletableFuture<kf<?>>> $$5 = eqy.a().map($$3x -> a($$3x, $$4, $$1, $$2)).toList();
      CompletableFuture<List<kf<?>>> $$6 = ac.d($$5);
      return $$6.thenApplyAsync($$1x -> a($$0, $$1x), $$2);
   }

   private static <T> CompletableFuture<kf<?>> a(eqy<T> $$0, aki<JsonElement> $$1, atw $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         kf<T> $$3x = new jr<>($$0.b(), Lifecycle.experimental());
         Map<akk, JsonElement> $$4 = new HashMap<>();
         aua.a($$2, $$0.d(), b, $$4);
         $$4.forEach(($$3xx, $$4x) -> $$0.a($$3xx, $$1, $$4x).ifPresent($$3xxx -> $$3x.a(akj.a($$0.b(), $$3xx), (T)$$3xxx, c)));
         return $$3x;
      }, $$3);
   }

   private static jq<akt> a(jq<akt> $$0, List<kf<?>> $$1) {
      jq<akt> $$2 = b($$0, $$1);
      aym.a $$3 = new aym.a();
      jx.b $$4 = $$2.a();
      erc $$5 = new erc($$3, etr.q, $$4.b());
      eqy.a().forEach($$2x -> a($$5, $$2x, $$4));
      $$3.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      return $$2;
   }

   private static jq<akt> b(jq<akt> $$0, List<kf<?>> $$1) {
      jx $$2 = new jx.c($$1);
      ((kf)$$2.<erb>d(lr.bb)).a(eqs.a, erb.a, c);
      return $$0.a(akt.d, $$2.d());
   }

   private static <T> void a(erc $$0, eqy<T> $$1, jx $$2) {
      jw<T> $$3 = $$2.d($$1.b());
      $$3.i().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   static class a implements jl.a {
      private final jx a;

      a(jx $$0) {
         this.a = $$0;
      }

      @Override
      public Stream<akj<? extends jw<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<jl.b<T>> a(akj<? extends jw<? extends T>> $$0) {
         return this.a.c($$0).map(jw::v);
      }
   }

   public static class b {
      private final jx.b a;

      public b(jx.b $$0) {
         this.a = $$0;
      }

      public jx.b a() {
         return this.a;
      }

      public jk.a b() {
         return this.a.b();
      }

      public Collection<akk> a(akj<? extends jw<?>> $$0) {
         return this.a.c($$0).stream().flatMap($$0x -> $$0x.i().map($$0xx -> $$0xx.h().a())).toList();
      }

      public erb b(akj<erb> $$0) {
         return this.a.a(lr.bb).flatMap($$1 -> $$1.a($$0)).map(jj::a).orElse(erb.a);
      }
   }
}
