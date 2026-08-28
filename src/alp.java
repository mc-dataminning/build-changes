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

public class alp {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private static final ju c = new ju(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<jp<alo>> a(jp<alo> $$0, aup $$1, Executor $$2) {
      jw.b $$3 = $$0.b(alo.d);
      ald<JsonElement> $$4 = new alp.a($$3).a(JsonOps.INSTANCE);
      List<CompletableFuture<ke<?>>> $$5 = eqk.a().map($$3x -> a($$3x, $$4, $$1, $$2)).toList();
      CompletableFuture<List<ke<?>>> $$6 = ac.d($$5);
      return $$6.thenApplyAsync($$1x -> a($$0, $$1x), $$2);
   }

   private static <T> CompletableFuture<ke<?>> a(eqk<T> $$0, ald<JsonElement> $$1, aup $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         ke<T> $$3x = new jq<>($$0.b(), Lifecycle.experimental());
         Map<alf, JsonElement> $$4 = new HashMap<>();
         aut.a($$2, $$0.d(), b, $$4);
         $$4.forEach(($$3xx, $$4x) -> $$0.a($$3xx, $$1, $$4x).ifPresent($$3xxx -> $$3x.a(ale.a($$0.b(), $$3xx), (T)$$3xxx, c)));
         return $$3x;
      }, $$3);
   }

   private static jp<alo> a(jp<alo> $$0, List<ke<?>> $$1) {
      jp<alo> $$2 = b($$0, $$1);
      azf.a $$3 = new azf.a();
      jw.b $$4 = $$2.a();
      eqo $$5 = new eqo($$3, etd.q, $$4.b());
      eqk.a().forEach($$2x -> a($$5, $$2x, $$4));
      $$3.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      return $$2;
   }

   private static jp<alo> b(jp<alo> $$0, List<ke<?>> $$1) {
      jw $$2 = new jw.c($$1);
      ((ke)$$2.<eqn>d(lq.aU)).a(eqe.a, eqn.a, c);
      return $$0.a(alo.d, $$2.d());
   }

   private static <T> void a(eqo $$0, eqk<T> $$1, jw $$2) {
      jv<T> $$3 = $$2.d($$1.b());
      $$3.h().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   static class a implements jk.a {
      private final jw a;

      a(jw $$0) {
         this.a = $$0;
      }

      @Override
      public Stream<ale<? extends jv<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<jk.b<T>> a(ale<? extends jv<? extends T>> $$0) {
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

      public Collection<alf> a(ale<? extends jv<?>> $$0) {
         return this.a.c($$0).stream().flatMap($$0x -> $$0x.h().map($$0xx -> $$0xx.h().a())).toList();
      }

      public eqn b(ale<eqn> $$0) {
         return this.a.a(lq.aU).flatMap($$1 -> $$1.a($$0)).map(ji::a).orElse(eqn.a);
      }
   }
}
