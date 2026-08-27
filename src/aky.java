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

public class aky {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<azh> b = CompletableFuture.completedFuture(azh.a);
   private final akx.b c;
   private final aky.a d;
   private final ef e;
   private final cxz f;
   private final awo g;
   private final ala h;
   private final alb i;

   private aky(jl.b $$0, col $$1, ef.a $$2, int $$3) {
      this.c = new akx.b($$0);
      this.d = new aky.a($$0);
      this.d.a(aky.b.a);
      this.f = new cxz(this.d);
      this.g = new awo($$0);
      this.e = new ef($$2, ea.a(this.d, $$1));
      this.h = new ala(this.d);
      this.i = new alb($$3, this.e.a());
   }

   public alb a() {
      return this.i;
   }

   public akx.b b() {
      return this.c;
   }

   public cxz c() {
      return this.f;
   }

   public ef d() {
      return this.e;
   }

   public ala e() {
      return this.h;
   }

   public List<atr> f() {
      return List.of(this.g, this.f, this.i, this.h);
   }

   public static CompletableFuture<aky> a(atx $$0, je<akw> $$1, col $$2, ef.a $$3, int $$4, Executor $$5, Executor $$6) {
      return akx.a($$1, $$0, $$5).thenCompose($$6x -> {
         aky $$7 = new aky($$6x.a(), $$2, $$3, $$4);
         return aud.a($$0, $$7.f(), $$5, $$6, b, a.isDebugEnabled()).a().whenComplete(($$1xx, $$2xx) -> $$7.d.a(aky.b.b)).thenApply($$1xx -> $$7);
      });
   }

   public void g() {
      this.g.a().forEach($$0 -> a(this.c.a(), (awo.a<?>)$$0));
      dnw.f();
      dec.a();
   }

   private static <T> void a(jl $$0, awo.a<T> $$1) {
      akm<? extends jk<T>> $$2 = $$1.a();
      Map<awm<T>, List<ix<T>>> $$3 = $$1.b()
         .entrySet()
         .stream()
         .collect(Collectors.toUnmodifiableMap($$1x -> awm.a($$2, (akn)$$1x.getKey()), $$0x -> List.copyOf((Collection<? extends ix<T>>)$$0x.getValue())));
      $$0.d($$2).a($$3);
   }

   static class a implements iz.a {
      private final jl a;
      aky.b b;

      a(jl $$0) {
         this.b = aky.b.b;
         this.a = $$0;
      }

      public void a(aky.b $$0) {
         this.b = $$0;
      }

      @Override
      public Stream<akm<? extends jk<?>>> a() {
         return this.a.a();
      }

      @Override
      public <T> Optional<iz.b<T>> a(akm<? extends jk<? extends T>> $$0) {
         return this.a.c($$0).map($$0x -> this.a($$0x.p(), $$0x.u()));
      }

      private <T> iz.b<T> a(final iz.b<T> $$0, final iz.b<T> $$1) {
         return new iz.b.a<T>() {
            @Override
            public iz.b<T> a() {
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
