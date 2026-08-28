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
   private static final ju c = new ju(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<jp<alk>> a(jp<alk> $$0, aul $$1, Executor $$2) {
      jw.b $$3 = $$0.b(alk.d);
      akz<JsonElement> $$4 = new all.a($$3).a(JsonOps.INSTANCE);
      List<CompletableFuture<ke<?>>> $$5 = eqf.a().map($$3x -> a($$3x, $$4, $$1, $$2)).toList();
      CompletableFuture<List<ke<?>>> $$6 = ac.d($$5);
      return $$6.thenApplyAsync($$1x -> a($$0, $$1x), $$2);
   }

   private static <T> CompletableFuture<ke<?>> a(eqf<T> $$0, akz<JsonElement> $$1, aul $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         ke<T> $$3x = new jq<>($$0.b(), Lifecycle.experimental());
         Map<alb, JsonElement> $$4 = new HashMap<>();
         aup.a($$2, $$0.d(), b, $$4);
         $$4.forEach(($$3xx, $$4x) -> $$0.a($$3xx, $$1, $$4x).ifPresent($$3xxx -> $$3x.a(ala.a($$0.b(), $$3xx), (T)$$3xxx, c)));
         return $$3x;
      }, $$3);
   }

   private static jp<alk> a(jp<alk> $$0, List<ke<?>> $$1) {
      jp<alk> $$2 = b($$0, $$1);
      aza.a $$3 = new aza.a();
      jw.b $$4 = $$2.a();
      eqj $$5 = new eqj($$3, esy.q, $$4.b());
      eqf.a().forEach($$2x -> a($$5, $$2x, $$4));
      $$3.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      return $$2;
   }

   private static jp<alk> b(jp<alk> $$0, List<ke<?>> $$1) {
      jw $$2 = new jw.c($$1);
      ((ke)$$2.<eqi>d(lq.aU)).a(epz.a, eqi.a, c);
      return $$0.a(alk.d, $$2.d());
   }

   private static <T> void a(eqj $$0, eqf<T> $$1, jw $$2) {
      jv<T> $$3 = $$2.d($$1.b());
      $$3.h().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   static class a implements jk.a {
      private final jw a;

      a(jw $$0) {
         this.a = $$0;
      }

      @Override
      public Stream<ala<? extends jv<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<jk.b<T>> a(ala<? extends jv<? extends T>> $$0) {
         return this.a.c($$0).map(jv::u);
      }
   }

   public static class b {
      private final jw.b a;

      public b(jw.b $$0) {
         this.a = $$0;
      }

      public jw.b a() {
         return this.a;
      }

      public jj.a b() {
         return this.a.b();
      }

      public Collection<alb> a(ala<? extends jv<?>> $$0) {
         return this.a.c($$0).stream().flatMap($$0x -> $$0x.h().map($$0xx -> $$0xx.h().a())).toList();
      }

      public eqi b(ala<eqi> $$0) {
         return this.a.a(lq.aU).flatMap($$1 -> $$1.a($$0)).map(ji::a).orElse(eqi.a);
      }
   }
}
