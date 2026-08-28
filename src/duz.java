import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class duz {
   private static boolean a(dtz $$0) {
      return $$0.j().b(duy.l) && $$0.v();
   }

   static CompletableFuture<dtz> a(dvc $$0, duy $$1, Executor $$2, dvb $$3, List<dtz> $$4, dtz $$5) {
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtz> a(dvc $$0, duy $$1, dvb $$2, dtz $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dtz> b(dvc $$0, duy $$1, Executor $$2, dvb $$3, List<dtz> $$4, dtz $$5) {
      arf $$6 = $$0.a();
      if ($$6.o().bb().y().c()) {
         $$0.b().a($$6.H_(), $$6.l().h(), $$6.a(), $$5, $$0.c());
      }

      $$6.a($$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtz> b(dvc $$0, duy $$1, dvb $$2, dtz $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dtz> c(dvc $$0, duy $$1, Executor $$2, dvb $$3, List<dtz> $$4, dtz $$5) {
      arf $$6 = $$0.a();
      arm $$7 = new arm($$6, $$4, $$1, -1);
      $$0.b().a($$7, $$6.a().a($$7), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtz> d(dvc $$0, duy $$1, Executor $$2, dvb $$3, List<dtz> $$4, dtz $$5) {
      arf $$6 = $$0.a();
      arm $$7 = new arm($$6, $$4, $$1, -1);
      return $$0.b().a($$2, $$6.l().i(), dyx.a($$7), $$6.a().a($$7), $$5);
   }

   static CompletableFuture<dtz> e(dvc $$0, duy $$1, Executor $$2, dvb $$3, List<dtz> $$4, dtz $$5) {
      arf $$6 = $$0.a();
      arm $$7 = new arm($$6, $$4, $$1, 0);
      return $$0.b().a($$2, dyx.a($$7), $$6.l().i(), $$6.a().a($$7), $$5).thenApply($$0x -> {
         if ($$0x instanceof dut $$1x) {
            dxj $$2x = $$1x.x();
            if ($$2x != null) {
               dxj.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dtz> f(dvc $$0, duy $$1, Executor $$2, dvb $$3, List<dtz> $$4, dtz $$5) {
      arf $$6 = $$0.a();
      arm $$7 = new arm($$6, $$4, $$1, 0);
      $$0.b().a($$7, $$6.a().a($$7), $$6.l().i(), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtz> g(dvc $$0, duy $$1, Executor $$2, dvb $$3, List<dtz> $$4, dtz $$5) {
      arf $$6 = $$0.a();
      arm $$7 = new arm($$6, $$4, $$1, 0);
      if ($$5 instanceof dut $$8) {
         dyx.a($$7, $$8);
      }

      $$0.b().a($$7, $$6.C(), $$6.l().i(), $$6.F_(), $$6.a().a($$7), $$5, dxr.a.a);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtz> h(dvc $$0, duy $$1, Executor $$2, dvb $$3, List<dtz> $$4, dtz $$5) {
      arf $$6 = $$0.a();
      dxv.a($$5, EnumSet.of(dxv.a.e, dxv.a.f, dxv.a.d, dxv.a.b));
      arm $$7 = new arm($$6, $$4, $$1, 1);
      $$0.b().a($$7, $$5, $$6.a().a($$7));
      dyx.a($$7, $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtz> i(dvc $$0, duy $$1, Executor $$2, dvb $$3, List<dtz> $$4, dtz $$5) {
      return a($$0.d(), $$5);
   }

   static CompletableFuture<dtz> c(dvc $$0, duy $$1, dvb $$2, dtz $$3) {
      return a($$0.d(), $$3);
   }

   private static CompletableFuture<dtz> a(ari $$0, dtz $$1) {
      $$1.A();
      ((dut)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2);
   }

   static CompletableFuture<dtz> j(dvc $$0, duy $$1, Executor $$2, dvb $$3, List<dtz> $$4, dtz $$5) {
      return b($$0.d(), $$5);
   }

   static CompletableFuture<dtz> d(dvc $$0, duy $$1, dvb $$2, dtz $$3) {
      return b($$0.d(), $$3);
   }

   private static CompletableFuture<dtz> b(ari $$0, dtz $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2);
   }

   static CompletableFuture<dtz> k(dvc $$0, duy $$1, Executor $$2, dvb $$3, List<dtz> $$4, dtz $$5) {
      if (!$$5.y()) {
         $$0.b().a(new arm($$0.a(), $$4, $$1, -1));
      }

      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dtz> l(dvc $$0, duy $$1, Executor $$2, dvb $$3, List<dtz> $$4, dtz $$5) {
      return $$3.apply($$5);
   }

   static CompletableFuture<dtz> e(dvc $$0, duy $$1, dvb $$2, dtz $$3) {
      return $$2.apply($$3);
   }
}
