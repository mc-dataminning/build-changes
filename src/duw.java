import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class duw {
   private static boolean a(dtw $$0) {
      return $$0.j().b(duv.l) && $$0.v();
   }

   static CompletableFuture<dtw> a(duz $$0, duv $$1, Executor $$2, duy $$3, List<dtw> $$4, dtw $$5) {
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtw> a(duz $$0, duv $$1, duy $$2, dtw $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dtw> b(duz $$0, duv $$1, Executor $$2, duy $$3, List<dtw> $$4, dtw $$5) {
      are $$6 = $$0.a();
      if ($$6.o().bb().y().c()) {
         $$0.b().a($$6.H_(), $$6.l().h(), $$6.a(), $$5, $$0.c());
      }

      $$6.a($$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtw> b(duz $$0, duv $$1, duy $$2, dtw $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dtw> c(duz $$0, duv $$1, Executor $$2, duy $$3, List<dtw> $$4, dtw $$5) {
      are $$6 = $$0.a();
      arl $$7 = new arl($$6, $$4, $$1, -1);
      $$0.b().a($$7, $$6.a().a($$7), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtw> d(duz $$0, duv $$1, Executor $$2, duy $$3, List<dtw> $$4, dtw $$5) {
      are $$6 = $$0.a();
      arl $$7 = new arl($$6, $$4, $$1, -1);
      return $$0.b().a($$2, $$6.l().i(), dyu.a($$7), $$6.a().a($$7), $$5);
   }

   static CompletableFuture<dtw> e(duz $$0, duv $$1, Executor $$2, duy $$3, List<dtw> $$4, dtw $$5) {
      are $$6 = $$0.a();
      arl $$7 = new arl($$6, $$4, $$1, 0);
      return $$0.b().a($$2, dyu.a($$7), $$6.l().i(), $$6.a().a($$7), $$5).thenApply($$0x -> {
         if ($$0x instanceof duq $$1x) {
            dxg $$2x = $$1x.x();
            if ($$2x != null) {
               dxg.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dtw> f(duz $$0, duv $$1, Executor $$2, duy $$3, List<dtw> $$4, dtw $$5) {
      are $$6 = $$0.a();
      arl $$7 = new arl($$6, $$4, $$1, 0);
      $$0.b().a($$7, $$6.a().a($$7), $$6.l().i(), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtw> g(duz $$0, duv $$1, Executor $$2, duy $$3, List<dtw> $$4, dtw $$5) {
      are $$6 = $$0.a();
      arl $$7 = new arl($$6, $$4, $$1, 0);
      if ($$5 instanceof duq $$8) {
         dyu.a($$7, $$8);
      }

      $$0.b().a($$7, $$6.C(), $$6.l().i(), $$6.F_(), $$6.a().a($$7), $$5, dxo.a.a);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtw> h(duz $$0, duv $$1, Executor $$2, duy $$3, List<dtw> $$4, dtw $$5) {
      are $$6 = $$0.a();
      dxs.a($$5, EnumSet.of(dxs.a.e, dxs.a.f, dxs.a.d, dxs.a.b));
      arl $$7 = new arl($$6, $$4, $$1, 1);
      $$0.b().a($$7, $$5, $$6.a().a($$7));
      dyu.a($$7, $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtw> i(duz $$0, duv $$1, Executor $$2, duy $$3, List<dtw> $$4, dtw $$5) {
      return a($$0.d(), $$5);
   }

   static CompletableFuture<dtw> c(duz $$0, duv $$1, duy $$2, dtw $$3) {
      return a($$0.d(), $$3);
   }

   private static CompletableFuture<dtw> a(arh $$0, dtw $$1) {
      $$1.A();
      ((duq)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2);
   }

   static CompletableFuture<dtw> j(duz $$0, duv $$1, Executor $$2, duy $$3, List<dtw> $$4, dtw $$5) {
      return b($$0.d(), $$5);
   }

   static CompletableFuture<dtw> d(duz $$0, duv $$1, duy $$2, dtw $$3) {
      return b($$0.d(), $$3);
   }

   private static CompletableFuture<dtw> b(arh $$0, dtw $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2);
   }

   static CompletableFuture<dtw> k(duz $$0, duv $$1, Executor $$2, duy $$3, List<dtw> $$4, dtw $$5) {
      if (!$$5.y()) {
         $$0.b().a(new arl($$0.a(), $$4, $$1, -1));
      }

      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtw> l(duz $$0, duv $$1, Executor $$2, duy $$3, List<dtw> $$4, dtw $$5) {
      return $$3.apply($$5);
   }

   static CompletableFuture<dtw> e(duz $$0, duv $$1, duy $$2, dtw $$3) {
      return $$2.apply($$3);
   }
}
