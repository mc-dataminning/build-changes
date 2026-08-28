import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class dvd {
   private static boolean a(dud $$0) {
      return $$0.j().b(dvc.l) && $$0.v();
   }

   static CompletableFuture<dud> a(dvg $$0, dvc $$1, Executor $$2, dvf $$3, List<dud> $$4, dud $$5) {
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dud> a(dvg $$0, dvc $$1, dvf $$2, dud $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dud> b(dvg $$0, dvc $$1, Executor $$2, dvf $$3, List<dud> $$4, dud $$5) {
      aqk $$6 = $$0.a();
      if ($$6.o().bb().y().c()) {
         $$0.b().a($$6.H_(), $$6.l().h(), $$6.a(), $$5, $$0.c());
      }

      $$6.a($$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dud> b(dvg $$0, dvc $$1, dvf $$2, dud $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dud> c(dvg $$0, dvc $$1, Executor $$2, dvf $$3, List<dud> $$4, dud $$5) {
      aqk $$6 = $$0.a();
      aqr $$7 = new aqr($$6, $$4, $$1, -1);
      $$0.b().a($$7, $$6.a().a($$7), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dud> d(dvg $$0, dvc $$1, Executor $$2, dvf $$3, List<dud> $$4, dud $$5) {
      aqk $$6 = $$0.a();
      aqr $$7 = new aqr($$6, $$4, $$1, -1);
      return $$0.b().a($$2, $$6.l().i(), dzb.a($$7), $$6.a().a($$7), $$5);
   }

   static CompletableFuture<dud> e(dvg $$0, dvc $$1, Executor $$2, dvf $$3, List<dud> $$4, dud $$5) {
      aqk $$6 = $$0.a();
      aqr $$7 = new aqr($$6, $$4, $$1, 0);
      return $$0.b().a($$2, dzb.a($$7), $$6.l().i(), $$6.a().a($$7), $$5).thenApply($$0x -> {
         if ($$0x instanceof dux $$1x) {
            dxn $$2x = $$1x.x();
            if ($$2x != null) {
               dxn.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dud> f(dvg $$0, dvc $$1, Executor $$2, dvf $$3, List<dud> $$4, dud $$5) {
      aqk $$6 = $$0.a();
      aqr $$7 = new aqr($$6, $$4, $$1, 0);
      $$0.b().a($$7, $$6.a().a($$7), $$6.l().i(), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dud> g(dvg $$0, dvc $$1, Executor $$2, dvf $$3, List<dud> $$4, dud $$5) {
      aqk $$6 = $$0.a();
      aqr $$7 = new aqr($$6, $$4, $$1, 0);
      if ($$5 instanceof dux $$8) {
         dzb.a($$7, $$8);
      }

      $$0.b().a($$7, $$6.C(), $$6.l().i(), $$6.F_(), $$6.a().a($$7), $$5, dxv.a.a);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dud> h(dvg $$0, dvc $$1, Executor $$2, dvf $$3, List<dud> $$4, dud $$5) {
      aqk $$6 = $$0.a();
      dxz.a($$5, EnumSet.of(dxz.a.e, dxz.a.f, dxz.a.d, dxz.a.b));
      aqr $$7 = new aqr($$6, $$4, $$1, 1);
      $$0.b().a($$7, $$5, $$6.a().a($$7));
      dzb.a($$7, $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dud> i(dvg $$0, dvc $$1, Executor $$2, dvf $$3, List<dud> $$4, dud $$5) {
      return a($$0.d(), $$5);
   }

   static CompletableFuture<dud> c(dvg $$0, dvc $$1, dvf $$2, dud $$3) {
      return a($$0.d(), $$3);
   }

   private static CompletableFuture<dud> a(aqn $$0, dud $$1) {
      $$1.A();
      ((dux)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2);
   }

   static CompletableFuture<dud> j(dvg $$0, dvc $$1, Executor $$2, dvf $$3, List<dud> $$4, dud $$5) {
      return b($$0.d(), $$5);
   }

   static CompletableFuture<dud> d(dvg $$0, dvc $$1, dvf $$2, dud $$3) {
      return b($$0.d(), $$3);
   }

   private static CompletableFuture<dud> b(aqn $$0, dud $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2);
   }

   static CompletableFuture<dud> k(dvg $$0, dvc $$1, Executor $$2, dvf $$3, List<dud> $$4, dud $$5) {
      if (!$$5.y()) {
         $$0.b().a(new aqr($$0.a(), $$4, $$1, -1));
      }

      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dud> l(dvg $$0, dvc $$1, Executor $$2, dvf $$3, List<dud> $$4, dud $$5) {
      return $$3.apply($$5);
   }

   static CompletableFuture<dud> e(dvg $$0, dvc $$1, dvf $$2, dud $$3) {
      return $$2.apply($$3);
   }
}
