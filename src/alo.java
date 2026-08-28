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

public class alo {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private static final ju c = new ju(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<jp<aln>> a(jp<aln> $$0, auo $$1, Executor $$2) {
      jw.b $$3 = $$0.b(aln.d);
      alc<JsonElement> $$4 = new alo.a($$3).a(JsonOps.INSTANCE);
      List<CompletableFuture<ke<?>>> $$5 = eqi.a().map($$3x -> a($$3x, $$4, $$1, $$2)).toList();
      CompletableFuture<List<ke<?>>> $$6 = ac.d($$5);
      return $$6.thenApplyAsync($$1x -> a($$0, $$1x), $$2);
   }

   private static <T> CompletableFuture<ke<?>> a(eqi<T> $$0, alc<JsonElement> $$1, auo $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         ke<T> $$3x = new jq<>($$0.b(), Lifecycle.experimental());
         Map<ale, JsonElement> $$4 = new HashMap<>();
         aus.a($$2, $$0.d(), b, $$4);
         $$4.forEach(($$3xx, $$4x) -> $$0.a($$3xx, $$1, $$4x).ifPresent($$3xxx -> $$3x.a(ald.a($$0.b(), $$3xx), (T)$$3xxx, c)));
         return $$3x;
      }, $$3);
   }

   private static jp<aln> a(jp<aln> $$0, List<ke<?>> $$1) {
      jp<aln> $$2 = b($$0, $$1);
      azd.a $$3 = new azd.a();
      jw.b $$4 = $$2.a();
      eqm $$5 = new eqm($$3, etb.q, $$4.b());
      eqi.a().forEach($$2x -> a($$5, $$2x, $$4));
      $$3.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
      return $$2;
   }

   private static jp<aln> b(jp<aln> $$0, List<ke<?>> $$1) {
      jw $$2 = new jw.c($$1);
      ((ke)$$2.<eql>d(lq.aU)).a(eqc.a, eql.a, c);
      return $$0.a(aln.d, $$2.d());
   }

   private static <T> void a(eqm $$0, eqi<T> $$1, jw $$2) {
      jv<T> $$3 = $$2.d($$1.b());
      $$3.h().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   static class a implements jk.a {
      private final jw a;

      a(jw $$0) {
         this.a = $$0;
      }

      @Override
      public Stream<ald<? extends jv<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<jk.b<T>> a(ald<? extends jv<? extends T>> $$0) {
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

      public Collection<ale> a(ald<? extends jv<?>> $$0) {
         return this.a.c($$0).stream().flatMap($$0x -> $$0x.h().map($$0xx -> $$0xx.h().a())).toList();
      }

      public eql b(ald<eql> $$0) {
         return this.a.a(lq.aU).flatMap($$1 -> $$1.a($$0)).map(ji::a).orElse(eql.a);
      }
   }
}
