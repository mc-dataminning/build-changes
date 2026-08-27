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

public class ald {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private static final jm c = new jm(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<jh<alc>> a(jh<alc> $$0, aud $$1, Executor $$2) {
      jo.b $$3 = $$0.b(alc.d);
      akr<JsonElement> $$4 = new ald.a($$3).a(JsonOps.INSTANCE);
      List<CompletableFuture<jw<?>>> $$5 = err.a().map($$3x -> a($$3x, $$4, $$1, $$2)).toList();
      CompletableFuture<List<jw<?>>> $$6 = ad.d($$5);
      return $$6.thenApplyAsync($$1x -> a($$0, $$1x), $$2);
   }

   private static <T> CompletableFuture<jw<?>> a(err<T> $$0, akr<JsonElement> $$1, aud $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         jw<T> $$3x = new ji<>($$0.b(), Lifecycle.experimental());
         Map<akt, JsonElement> $$4 = new HashMap<>();
         auh.a($$2, $$0.d(), b, $$4);
         $$4.forEach(($$3xx, $$4x) -> $$0.a($$3xx, $$1, $$4x).ifPresent($$3xxx -> $$3x.a(aks.a($$0.b(), $$3xx), (T)$$3xxx, c)));
         return $$3x;
      }, $$3);
   }

   private static jh<alc> a(jh<alc> $$0, List<jw<?>> $$1) {
      jh<alc> $$2 = b($$0, $$1);
      ayr.a $$3 = new ayr.a();
      jo.b $$4 = $$2.a();
      erv $$5 = new erv($$3, euf.p, $$4.b());
      err.a().forEach($$2x -> a($$5, $$2x, $$4));
      $$3.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      return $$2;
   }

   private static jh<alc> b(jh<alc> $$0, List<jw<?>> $$1) {
      jo $$2 = new jo.c($$1);
      ((jw)$$2.<eru>d(li.aU)).a(ern.a, eru.a, c);
      return $$0.a(alc.d, $$2.d());
   }

   private static <T> void a(erv $$0, err<T> $$1, jo $$2) {
      jn<T> $$3 = $$2.d($$1.b());
      $$3.h().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   static class a implements jc.a {
      private final jo a;

      a(jo $$0) {
         this.a = $$0;
      }

      @Override
      public Stream<aks<? extends jn<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<jc.b<T>> a(aks<? extends jn<? extends T>> $$0) {
         return this.a.c($$0).map(jn::u);
      }
   }

   public static class b {
      private final jo.b a;

      public b(jo.b $$0) {
         this.a = $$0;
      }

      public jo.b a() {
         return this.a;
      }

      public jb.a b() {
         return this.a.b();
      }

      public Collection<akt> a(aks<? extends jn<?>> $$0) {
         return this.a.c($$0).stream().flatMap($$0x -> $$0x.h().map($$0xx -> $$0xx.h().a())).toList();
      }

      public eru b(aks<eru> $$0) {
         return this.a.a(li.aU).flatMap($$1 -> $$1.a($$0)).map(ja::a).orElse(eru.a);
      }
   }
}
