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

public class akx {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<azf> b = CompletableFuture.completedFuture(azf.a);
   private final akw.b c;
   private final akx.a d;
   private final ef e;
   private final cxx f;
   private final awn g;
   private final akz h;
   private final ala i;

   private akx(jl.b $$0, coj $$1, ef.a $$2, int $$3) {
      this.c = new akw.b($$0);
      this.d = new akx.a($$0);
      this.d.a(akx.b.a);
      this.f = new cxx(this.d);
      this.g = new awn($$0);
      this.e = new ef($$2, ea.a(this.d, $$1));
      this.h = new akz(this.d);
      this.i = new ala($$3, this.e.a());
   }

   public ala a() {
      return this.i;
   }

   public akw.b b() {
      return this.c;
   }

   public cxx c() {
      return this.f;
   }

   public ef d() {
      return this.e;
   }

   public akz e() {
      return this.h;
   }

   public List<atq> f() {
      return List.of(this.g, this.f, this.i, this.h);
   }

   public static CompletableFuture<akx> a(atw $$0, je<akv> $$1, coj $$2, ef.a $$3, int $$4, Executor $$5, Executor $$6) {
      return akw.a($$1, $$0, $$5).thenCompose($$6x -> {
         akx $$7 = new akx($$6x.a(), $$2, $$3, $$4);
         return auc.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1xx, $$2xx) -> $$7.d.a(akx.b.b)).thenApply($$1xx -> $$7);
      });
   }

   public void g() {
      this.g.a().forEach($$0 -> a(this.c.a(), (awn.a<?>)$$0));
      dnu.f();
      dea.a();
   }

   private static <T> void a(jl $$0, awn.a<T> $$1) {
      akl<? extends jk<T>> $$2 = $$1.a();
      Map<awl<T>, List<ix<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> awl.a($$2, (akm)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends ix<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }

   static class a implements iz.a {
      private final jl a;
      akx.b b;

      a(jl $$0) {
         this.b = akx.b.b;
         this.a = $$0;
      }

      public void a(akx.b $$0) {
         this.b = $$0;
      }

      @Override
      public Stream<akl<? extends jk<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<iz.b<T>> a(akl<? extends jk<? extends T>> $$0) {
         return this.a.c($$0).map($$0x -> this.a($$0x.p(), $$0x.u()));
      }

      private <T> iz.b<T> a(final iz.b<T> $$0, final iz.b<T> $$1) {
         return new iz.b.a<T>() {
            @Override
            public iz.b<T> a() {
               return switch (a.this.b) {
                  case b -> $$0;
                  case a -> $$1;
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
