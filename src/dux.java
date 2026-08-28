import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class dux {
   private static boolean a(dtx $$0) {
      return $$0.j().b(duw.l) && $$0.v();
   }

   static CompletableFuture<dtx> a(dva $$0, duw $$1, Executor $$2, duz $$3, List<dtx> $$4, dtx $$5) {
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtx> a(dva $$0, duw $$1, duz $$2, dtx $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dtx> b(dva $$0, duw $$1, Executor $$2, duz $$3, List<dtx> $$4, dtx $$5) {
      are $$6 = $$0.a();
      if ($$6.o().bb().y().c()) {
         $$0.b().a($$6.H_(), $$6.l().h(), $$6.a(), $$5, $$0.c());
      }

      $$6.a($$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtx> b(dva $$0, duw $$1, duz $$2, dtx $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dtx> c(dva $$0, duw $$1, Executor $$2, duz $$3, List<dtx> $$4, dtx $$5) {
      are $$6 = $$0.a();
      arl $$7 = new arl($$6, $$4, $$1, -1);
      $$0.b().a($$7, $$6.a().a($$7), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtx> d(dva $$0, duw $$1, Executor $$2, duz $$3, List<dtx> $$4, dtx $$5) {
      are $$6 = $$0.a();
      arl $$7 = new arl($$6, $$4, $$1, -1);
      return $$0.b().a($$2, $$6.l().i(), dyv.a($$7), $$6.a().a($$7), $$5);
   }

   static CompletableFuture<dtx> e(dva $$0, duw $$1, Executor $$2, duz $$3, List<dtx> $$4, dtx $$5) {
      are $$6 = $$0.a();
      arl $$7 = new arl($$6, $$4, $$1, 0);
      return $$0.b().a($$2, dyv.a($$7), $$6.l().i(), $$6.a().a($$7), $$5).thenApply($$0x -> {
         if ($$0x instanceof dur $$1x) {
            dxh $$2x = $$1x.x();
            if ($$2x != null) {
               dxh.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dtx> f(dva $$0, duw $$1, Executor $$2, duz $$3, List<dtx> $$4, dtx $$5) {
      are $$6 = $$0.a();
      arl $$7 = new arl($$6, $$4, $$1, 0);
      $$0.b().a($$7, $$6.a().a($$7), $$6.l().i(), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtx> g(dva $$0, duw $$1, Executor $$2, duz $$3, List<dtx> $$4, dtx $$5) {
      are $$6 = $$0.a();
      arl $$7 = new arl($$6, $$4, $$1, 0);
      if ($$5 instanceof dur $$8) {
         dyv.a($$7, $$8);
      }

      $$0.b().a($$7, $$6.C(), $$6.l().i(), $$6.F_(), $$6.a().a($$7), $$5, dxp.a.a);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtx> h(dva $$0, duw $$1, Executor $$2, duz $$3, List<dtx> $$4, dtx $$5) {
      are $$6 = $$0.a();
      dxt.a($$5, EnumSet.of(dxt.a.e, dxt.a.f, dxt.a.d, dxt.a.b));
      arl $$7 = new arl($$6, $$4, $$1, 1);
      $$0.b().a($$7, $$5, $$6.a().a($$7));
      dyv.a($$7, $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtx> i(dva $$0, duw $$1, Executor $$2, duz $$3, List<dtx> $$4, dtx $$5) {
      return a($$0.d(), $$5);
   }

   static CompletableFuture<dtx> c(dva $$0, duw $$1, duz $$2, dtx $$3) {
      return a($$0.d(), $$3);
   }

   private static CompletableFuture<dtx> a(arh $$0, dtx $$1) {
      $$1.A();
      ((dur)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2);
   }

   static CompletableFuture<dtx> j(dva $$0, duw $$1, Executor $$2, duz $$3, List<dtx> $$4, dtx $$5) {
      return b($$0.d(), $$5);
   }

   static CompletableFuture<dtx> d(dva $$0, duw $$1, duz $$2, dtx $$3) {
      return b($$0.d(), $$3);
   }

   private static CompletableFuture<dtx> b(arh $$0, dtx $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2);
   }

   static CompletableFuture<dtx> k(dva $$0, duw $$1, Executor $$2, duz $$3, List<dtx> $$4, dtx $$5) {
      if (!$$5.y()) {
         $$0.b().a(new arl($$0.a(), $$4, $$1, -1));
      }

      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtx> l(dva $$0, duw $$1, Executor $$2, duz $$3, List<dtx> $$4, dtx $$5) {
      return $$3.apply($$5);
   }

   static CompletableFuture<dtx> e(dva $$0, duw $$1, duz $$2, dtx $$3) {
      return $$2.apply($$3);
   }
}
