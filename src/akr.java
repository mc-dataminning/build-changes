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

public class akr {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private static final ji c = new ji(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<jd<akq>> a(jd<akq> $$0, atr $$1, Executor $$2) {
      jk.b $$3 = $$0.b(akq.d);
      akf<JsonElement> $$4 = new akr.a($$3).a(JsonOps.INSTANCE);
      List<CompletableFuture<js<?>>> $$5 = eon.a().map($$3x -> a($$3x, $$4, $$1, $$2)).toList();
      CompletableFuture<List<js<?>>> $$6 = ac.d($$5);
      return $$6.thenApplyAsync($$1x -> a($$0, $$1x), $$2);
   }

   private static <T> CompletableFuture<js<?>> a(eon<T> $$0, akf<JsonElement> $$1, atr $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         js<T> $$3x = new je<>($$0.b(), Lifecycle.experimental());
         Map<akh, JsonElement> $$4 = new HashMap<>();
         atv.a($$2, $$0.d(), b, $$4);
         $$4.forEach(($$3xx, $$4x) -> $$0.a($$3xx, $$1, $$4x).ifPresent($$3xxx -> $$3x.a(akg.a($$0.b(), $$3xx), (T)$$3xxx, c)));
         return $$3x;
      }, $$3);
   }

   private static jd<akq> a(jd<akq> $$0, List<js<?>> $$1) {
      jd<akq> $$2 = b($$0, $$1);
      aye.a $$3 = new aye.a();
      jk.b $$4 = $$2.a();
      eor $$5 = new eor($$3, erb.p, $$4.b());
      eon.a().forEach($$2x -> a($$5, $$2x, $$4));
      $$3.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      return $$2;
   }

   private static jd<akq> b(jd<akq> $$0, List<js<?>> $$1) {
      jk $$2 = new jk.c($$1);
      ((js)$$2.<eoq>d(le.aU)).a(eoj.a, eoq.a, c);
      return $$0.a(akq.d, $$2.d());
   }

   private static <T> void a(eor $$0, eon<T> $$1, jk $$2) {
      jj<T> $$3 = $$2.d($$1.b());
      $$3.h().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   static class a implements iy.a {
      private final jk a;

      a(jk $$0) {
         this.a = $$0;
      }

      @Override
      public Stream<akg<? extends jj<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<iy.b<T>> a(akg<? extends jj<? extends T>> $$0) {
         return this.a.c($$0).map(jj::u);
      }
   }

   public static class b {
      private final jk.b a;

      public b(jk.b $$0) {
         this.a = $$0;
      }

      public jk.b a() {
         return this.a;
      }

      public ix.a b() {
         return this.a.b();
      }

      public Collection<akh> a(akg<? extends jj<?>> $$0) {
         return this.a.c($$0).stream().flatMap($$0x -> $$0x.h().map($$0xx -> $$0xx.h().a())).toList();
      }

      public eoq b(akg<eoq> $$0) {
         return this.a.a(le.aU).flatMap($$1 -> $$1.a($$0)).map(iw::a).orElse(eoq.a);
      }
   }
}
