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

public class alm {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<azx> b = CompletableFuture.completedFuture(azx.a);
   private final all.b c;
   private final alm.a d;
   private final eq e;
   private final cyt f;
   private final axd g;
   private final alo h;
   private final alp i;

   private alm(jw.b $$0, cpg $$1, eq.a $$2, int $$3) {
      this.c = new all.b($$0);
      this.d = new alm.a($$0);
      this.d.a(alm.b.a);
      this.f = new cyt(this.d);
      this.g = new axd($$0);
      this.e = new eq($$2, el.a(this.d, $$1));
      this.h = new alo(this.d);
      this.i = new alp($$3, this.e.a());
   }

   public alp a() {
      return this.i;
   }

   public all.b b() {
      return this.c;
   }

   public cyt c() {
      return this.f;
   }

   public eq d() {
      return this.e;
   }

   public alo e() {
      return this.h;
   }

   public List<auf> f() {
      return List.of(this.g, this.f, this.i, this.h);
   }

   public static CompletableFuture<alm> a(aul $$0, jp<alk> $$1, cpg $$2, eq.a $$3, int $$4, Executor $$5, Executor $$6) {
      return all.a($$1, $$0, $$5).thenCompose($$6x -> {
         alm $$7 = new alm($$6x.a(), $$2, $$3, $$4);
         return aur.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1xx, $$2xx) -> $$7.d.a(alm.b.b)).thenApply($$1xx -> $$7);
      });
   }

   public void g() {
      this.g.a().forEach($$0 -> a(this.c.a(), (axd.a<?>)$$0));
      doq.f();
      dew.a();
   }

   private static <T> void a(jw $$0, axd.a<T> $$1) {
      ala<? extends jv<T>> $$2 = $$1.a();
      Map<axb<T>, List<ji<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> axb.a($$2, (alb)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends ji<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }

   static class a implements jk.a {
      private final jw a;
      alm.b b;

      a(jw $$0) {
         this.b = alm.b.b;
         this.a = $$0;
      }

      public void a(alm.b $$0) {
         this.b = $$0;
      }

      @Override
      public Stream<ala<? extends jv<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<jk.b<T>> a(ala<? extends jv<? extends T>> $$0) {
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
