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

public class alp {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bab> b = CompletableFuture.completedFuture(bab.a);
   private final alo.b c;
   private final alp.a d;
   private final eq e;
   private final cyx f;
   private final axg g;
   private final alr h;
   private final als i;

   private alp(jw.b $$0, cpk $$1, eq.a $$2, int $$3) {
      this.c = new alo.b($$0);
      this.d = new alp.a($$0);
      this.d.a(alp.b.a);
      this.f = new cyx(this.d);
      this.g = new axg($$0);
      this.e = new eq($$2, el.a(this.d, $$1));
      this.h = new alr(this.d);
      this.i = new als($$3, this.e.a());
   }

   public als a() {
      return this.i;
   }

   public alo.b b() {
      return this.c;
   }

   public cyx c() {
      return this.f;
   }

   public eq d() {
      return this.e;
   }

   public alr e() {
      return this.h;
   }

   public List<aui> f() {
      return List.of(this.g, this.f, this.i, this.h);
   }

   public static CompletableFuture<alp> a(auo $$0, jp<aln> $$1, cpk $$2, eq.a $$3, int $$4, Executor $$5, Executor $$6) {
      return alo.a($$1, $$0, $$5).thenCompose($$6x -> {
         alp $$7 = new alp($$6x.a(), $$2, $$3, $$4);
         return auu.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1xx, $$2xx) -> $$7.d.a(alp.b.b)).thenApply($$1xx -> $$7);
      });
   }

   public void g() {
      this.g.a().forEach($$0 -> a(this.c.a(), (axg.a<?>)$$0));
      dou.f();
      dfa.a();
   }

   private static <T> void a(jw $$0, axg.a<T> $$1) {
      ald<? extends jv<T>> $$2 = $$1.a();
      Map<axe<T>, List<ji<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> axe.a($$2, (ale)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends ji<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }

   static class a implements jk.a {
      private final jw a;
      alp.b b;

      a(jw $$0) {
         this.b = alp.b.b;
         this.a = $$0;
      }

      public void a(alp.b $$0) {
         this.b = $$0;
      }

      @Override
      public Stream<ald<? extends jv<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<jk.b<T>> a(ald<? extends jv<? extends T>> $$0) {
         return this.a.c($$0).map($$0x -> this.a($$0x.p(), $$0x.u()));
      }

      private <T> jk.b<T> a(final jk.b<T> $$0, final jk.b<T> $$1) {
         return new jk.b.a<T>() {
            @Override
            public jk.b<T> a() {
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
