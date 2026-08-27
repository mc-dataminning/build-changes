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

public class akx {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private static final jj c = new jj(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<je<akw>> a(je<akw> $$0, atx $$1, Executor $$2) {
      jl.b $$3 = $$0.b(akw.d);
      akl<JsonElement> $$4 = new akx.a($$3).a(JsonOps.INSTANCE);
      List<CompletableFuture<jt<?>>> $$5 = epj.a().map($$3x -> a($$3x, $$4, $$1, $$2)).toList();
      CompletableFuture<List<jt<?>>> $$6 = ac.d($$5);
      return $$6.thenApplyAsync($$1x -> a($$0, $$1x), $$2);
   }

   private static <T> CompletableFuture<jt<?>> a(epj<T> $$0, akl<JsonElement> $$1, atx $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         jt<T> $$3x = new jf<>($$0.b(), Lifecycle.experimental());
         Map<akn, JsonElement> $$4 = new HashMap<>();
         aub.a($$2, $$0.d(), b, $$4);
         $$4.forEach(($$3xx, $$4x) -> $$0.a($$3xx, $$1, $$4x).ifPresent($$3xxx -> $$3x.a(akm.a($$0.b(), $$3xx), (T)$$3xxx, c)));
         return $$3x;
      }, $$3);
   }

   private static je<akw> a(je<akw> $$0, List<jt<?>> $$1) {
      je<akw> $$2 = b($$0, $$1);
      ayk.a $$3 = new ayk.a();
      jl.b $$4 = $$2.a();
      epn $$5 = new epn($$3, ery.q, $$4.b());
      epj.a().forEach($$2x -> a($$5, $$2x, $$4));
      $$3.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      return $$2;
   }

   private static je<akw> b(je<akw> $$0, List<jt<?>> $$1) {
      jl $$2 = new jl.c($$1);
      ((jt)$$2.<epm>d(lf.aU)).a(epf.a, epm.a, c);
      return $$0.a(akw.d, $$2.d());
   }

   private static <T> void a(epn $$0, epj<T> $$1, jl $$2) {
      jk<T> $$3 = $$2.d($$1.b());
      $$3.h().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   static class a implements iz.a {
      private final jl a;

      a(jl $$0) {
         this.a = $$0;
      }

      @Override
      public Stream<akm<? extends jk<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<iz.b<T>> a(akm<? extends jk<? extends T>> $$0) {
         return this.a.c($$0).map(jk::u);
      }
   }

   public static class b {
      private final jl.b a;

      public b(jl.b $$0) {
         this.a = $$0;
      }

      public jl.b a() {
         return this.a;
      }

      public iy.a b() {
         return this.a.b();
      }

      public Collection<akn> a(akm<? extends jk<?>> $$0) {
         return this.a.c($$0).stream().flatMap($$0x -> $$0x.h().map($$0xx -> $$0xx.h().a())).toList();
      }

      public epm b(akm<epm> $$0) {
         return this.a.a(lf.aU).flatMap($$1 -> $$1.a($$0)).map(ix::a).orElse(epm.a);
      }
   }
}
