import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class akv {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<azk> b = CompletableFuture.completedFuture(azk.a);
   private final aku.b c;
   private final akv.a d;
   private final er e;
   private final cyn f;
   private final awo g;
   private final akx h;
   private final aky i;

   private akv(jx.b $$0, coz $$1, er.a $$2, int $$3) {
      this.c = new aku.b($$0);
      this.d = new akv.a($$0);
      this.d.a(akv.b.a);
      this.f = new cyn(this.d);
      this.g = new awo($$0);
      this.e = new er($$2, em.a(this.d, $$1));
      this.h = new akx(this.d);
      this.i = new aky($$3, this.e.a());
   }

   public aky a() {
      return this.i;
   }

   public aku.b b() {
      return this.c;
   }

   public cyn c() {
      return this.f;
   }

   public er d() {
      return this.e;
   }

   public akx e() {
      return this.h;
   }

   public List<atq> f() {
      return List.of(this.g, this.f, this.i, this.h);
   }

   public static CompletableFuture<akv> a(atw $$0, jq<akt> $$1, coz $$2, er.a $$3, int $$4, Executor $$5, Executor $$6) {
      return aku.a($$1, $$0, $$5).thenCompose($$6x -> {
         akv $$7 = new akv($$6x.a(), $$2, $$3, $$4);
         return auc.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1xx, $$2xx) -> $$7.d.a(akv.b.b)).thenApply($$1xx -> $$7);
      });
   }

   public void g() {
      this.g.a().forEach($$0 -> a(this.c.a(), (awo.a<?>)$$0));
      dpe.f();
      dfk.a();
   }

   private static <T> void a(jx $$0, awo.a<T> $$1) {
      akj<? extends jw<T>> $$2 = $$1.a();
      Map<awm<T>, List<jj<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> awm.a($$2, (akk)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends jj<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }

   static class a implements jl.a {
      private final jx a;
      akv.b b;

      a(jx $$0) {
         this.b = akv.b.b;
         this.a = $$0;
      }

      public void a(akv.b $$0) {
         this.b = $$0;
      }

      @Override
      public Stream<akj<? extends jw<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<jl.b<T>> a(akj<? extends jw<? extends T>> $$0) {
         return this.a.c($$0).map($$0x -> this.a($$0x.q(), $$0x.v()));
      }

      private <T> jl.b<T> a(final jl.b<T> $$0, final jl.b<T> $$1) {
         return new jl.b.a<T>() {
            @Override
            public jl.b<T> a() {
               return switch (a.this.b) {
                  case a -> $$1;
                  case b -> $$0;
               };
            }
         };
      }
   }

   static enum b {
      a,
      b;
   }
}
