import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class dut {
   private static boolean a(dtt $$0) {
      return $$0.j().b(dus.l) && $$0.v();
   }

   static CompletableFuture<dtt> a(duw $$0, dus $$1, Executor $$2, duv $$3, List<dtt> $$4, dtt $$5) {
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtt> a(duw $$0, dus $$1, duv $$2, dtt $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dtt> b(duw $$0, dus $$1, Executor $$2, duv $$3, List<dtt> $$4, dtt $$5) {
      arb $$6 = $$0.a();
      if ($$6.o().bb().y().c()) {
         $$0.b().a($$6.H_(), $$6.l().h(), $$6.a(), $$5, $$0.c());
      }

      $$6.a($$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtt> b(duw $$0, dus $$1, duv $$2, dtt $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dtt> c(duw $$0, dus $$1, Executor $$2, duv $$3, List<dtt> $$4, dtt $$5) {
      arb $$6 = $$0.a();
      ari $$7 = new ari($$6, $$4, $$1, -1);
      $$0.b().a($$7, $$6.a().a($$7), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtt> d(duw $$0, dus $$1, Executor $$2, duv $$3, List<dtt> $$4, dtt $$5) {
      arb $$6 = $$0.a();
      ari $$7 = new ari($$6, $$4, $$1, -1);
      return $$0.b().a($$2, $$6.l().i(), dyr.a($$7), $$6.a().a($$7), $$5);
   }

   static CompletableFuture<dtt> e(duw $$0, dus $$1, Executor $$2, duv $$3, List<dtt> $$4, dtt $$5) {
      arb $$6 = $$0.a();
      ari $$7 = new ari($$6, $$4, $$1, 0);
      return $$0.b().a($$2, dyr.a($$7), $$6.l().i(), $$6.a().a($$7), $$5).thenApply($$0x -> {
         if ($$0x instanceof dun $$1x) {
            dxd $$2x = $$1x.x();
            if ($$2x != null) {
               dxd.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dtt> f(duw $$0, dus $$1, Executor $$2, duv $$3, List<dtt> $$4, dtt $$5) {
      arb $$6 = $$0.a();
      ari $$7 = new ari($$6, $$4, $$1, 0);
      $$0.b().a($$7, $$6.a().a($$7), $$6.l().i(), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtt> g(duw $$0, dus $$1, Executor $$2, duv $$3, List<dtt> $$4, dtt $$5) {
      arb $$6 = $$0.a();
      ari $$7 = new ari($$6, $$4, $$1, 0);
      if ($$5 instanceof dun $$8) {
         dyr.a($$7, $$8);
      }

      $$0.b().a($$7, $$6.C(), $$6.l().i(), $$6.F_(), $$6.a().a($$7), $$5, dxl.a.a);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtt> h(duw $$0, dus $$1, Executor $$2, duv $$3, List<dtt> $$4, dtt $$5) {
      arb $$6 = $$0.a();
      dxp.a($$5, EnumSet.of(dxp.a.e, dxp.a.f, dxp.a.d, dxp.a.b));
      ari $$7 = new ari($$6, $$4, $$1, 1);
      $$0.b().a($$7, $$5, $$6.a().a($$7));
      dyr.a($$7, $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtt> i(duw $$0, dus $$1, Executor $$2, duv $$3, List<dtt> $$4, dtt $$5) {
      return a($$0.d(), $$5);
   }

   static CompletableFuture<dtt> c(duw $$0, dus $$1, duv $$2, dtt $$3) {
      return a($$0.d(), $$3);
   }

   private static CompletableFuture<dtt> a(are $$0, dtt $$1) {
      $$1.A();
      ((dun)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2);
   }

   static CompletableFuture<dtt> j(duw $$0, dus $$1, Executor $$2, duv $$3, List<dtt> $$4, dtt $$5) {
      return b($$0.d(), $$5);
   }

   static CompletableFuture<dtt> d(duw $$0, dus $$1, duv $$2, dtt $$3) {
      return b($$0.d(), $$3);
   }

   private static CompletableFuture<dtt> b(are $$0, dtt $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2);
   }

   static CompletableFuture<dtt> k(duw $$0, dus $$1, Executor $$2, duv $$3, List<dtt> $$4, dtt $$5) {
      if (!$$5.y()) {
         $$0.b().a(new ari($$0.a(), $$4, $$1, -1));
      }

      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtt> l(duw $$0, dus $$1, Executor $$2, duv $$3, List<dtt> $$4, dtt $$5) {
      return $$3.apply($$5);
   }

   static CompletableFuture<dtt> e(duw $$0, dus $$1, duv $$2, dtt $$3) {
      return $$2.apply($$3);
   }
}
