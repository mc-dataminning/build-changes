import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class dtx {
   private static boolean a(dsx $$0) {
      return $$0.j().b(dtw.l) && $$0.v();
   }

   static CompletableFuture<dsx> a(dua $$0, dtw $$1, Executor $$2, dtz $$3, List<dsx> $$4, dsx $$5) {
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsx> a(dua $$0, dtw $$1, dtz $$2, dsx $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dsx> b(dua $$0, dtw $$1, Executor $$2, dtz $$3, List<dsx> $$4, dsx $$5) {
      aqm $$6 = $$0.a();
      if ($$6.o().bb().y().c()) {
         $$0.b().a($$6.H_(), $$6.l().h(), $$6.a(), $$5, $$0.c());
      }

      $$6.a($$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsx> b(dua $$0, dtw $$1, dtz $$2, dsx $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dsx> c(dua $$0, dtw $$1, Executor $$2, dtz $$3, List<dsx> $$4, dsx $$5) {
      aqm $$6 = $$0.a();
      aqt $$7 = new aqt($$6, $$4, $$1, -1);
      $$0.b().a($$7, $$6.a().a($$7), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsx> d(dua $$0, dtw $$1, Executor $$2, dtz $$3, List<dsx> $$4, dsx $$5) {
      aqm $$6 = $$0.a();
      aqt $$7 = new aqt($$6, $$4, $$1, -1);
      return $$0.b().a($$2, $$6.l().i(), dxv.a($$7), $$6.a().a($$7), $$5);
   }

   static CompletableFuture<dsx> e(dua $$0, dtw $$1, Executor $$2, dtz $$3, List<dsx> $$4, dsx $$5) {
      aqm $$6 = $$0.a();
      aqt $$7 = new aqt($$6, $$4, $$1, 0);
      return $$0.b().a($$2, dxv.a($$7), $$6.l().i(), $$6.a().a($$7), $$5).thenApply($$0x -> {
         if ($$0x instanceof dtr $$1x) {
            dwh $$2x = $$1x.x();
            if ($$2x != null) {
               dwh.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dsx> f(dua $$0, dtw $$1, Executor $$2, dtz $$3, List<dsx> $$4, dsx $$5) {
      aqm $$6 = $$0.a();
      aqt $$7 = new aqt($$6, $$4, $$1, 0);
      $$0.b().a($$7, $$6.a().a($$7), $$6.l().i(), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsx> g(dua $$0, dtw $$1, Executor $$2, dtz $$3, List<dsx> $$4, dsx $$5) {
      aqm $$6 = $$0.a();
      aqt $$7 = new aqt($$6, $$4, $$1, 0);
      if ($$5 instanceof dtr $$8) {
         dxv.a($$7, $$8);
      }

      $$0.b().a($$7, $$6.C(), $$6.l().i(), $$6.F_(), $$6.a().a($$7), $$5, dwp.a.a);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsx> h(dua $$0, dtw $$1, Executor $$2, dtz $$3, List<dsx> $$4, dsx $$5) {
      aqm $$6 = $$0.a();
      dwt.a($$5, EnumSet.of(dwt.a.e, dwt.a.f, dwt.a.d, dwt.a.b));
      aqt $$7 = new aqt($$6, $$4, $$1, 1);
      $$0.b().a($$7, $$5, $$6.a().a($$7));
      dxv.a($$7, $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsx> i(dua $$0, dtw $$1, Executor $$2, dtz $$3, List<dsx> $$4, dsx $$5) {
      return a($$0.d(), $$5);
   }

   static CompletableFuture<dsx> c(dua $$0, dtw $$1, dtz $$2, dsx $$3) {
      return a($$0.d(), $$3);
   }

   private static CompletableFuture<dsx> a(aqp $$0, dsx $$1) {
      $$1.A();
      ((dtr)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2);
   }

   static CompletableFuture<dsx> j(dua $$0, dtw $$1, Executor $$2, dtz $$3, List<dsx> $$4, dsx $$5) {
      return b($$0.d(), $$5);
   }

   static CompletableFuture<dsx> d(dua $$0, dtw $$1, dtz $$2, dsx $$3) {
      return b($$0.d(), $$3);
   }

   private static CompletableFuture<dsx> b(aqp $$0, dsx $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2);
   }

   static CompletableFuture<dsx> k(dua $$0, dtw $$1, Executor $$2, dtz $$3, List<dsx> $$4, dsx $$5) {
      if (!$$5.y()) {
         $$0.b().a(new aqt($$0.a(), $$4, $$1, -1));
      }

      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsx> l(dua $$0, dtw $$1, Executor $$2, dtz $$3, List<dsx> $$4, dsx $$5) {
      return $$3.apply($$5);
   }

   static CompletableFuture<dsx> e(dua $$0, dtw $$1, dtz $$2, dsx $$3) {
      return $$2.apply($$3);
   }
}
