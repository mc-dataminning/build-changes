import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class dsu {
   private static boolean a(dru $$0) {
      return $$0.j().b(dst.l) && $$0.v();
   }

   static CompletableFuture<dru> a(dsx $$0, dst $$1, Executor $$2, dsw $$3, List<dru> $$4, dru $$5) {
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dru> a(dsx $$0, dst $$1, dsw $$2, dru $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dru> b(dsx $$0, dst $$1, Executor $$2, dsw $$3, List<dru> $$4, dru $$5) {
      aqe $$6 = $$0.a();
      if ($$6.o().bc().y().c()) {
         $$0.b().a($$6.H_(), $$6.l().h(), $$6.a(), $$5, $$0.c());
      }

      $$6.a($$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dru> b(dsx $$0, dst $$1, dsw $$2, dru $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dru> c(dsx $$0, dst $$1, Executor $$2, dsw $$3, List<dru> $$4, dru $$5) {
      aqe $$6 = $$0.a();
      aql $$7 = new aql($$6, $$4, $$1, -1);
      $$0.b().a($$7, $$6.a().a($$7), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dru> d(dsx $$0, dst $$1, Executor $$2, dsw $$3, List<dru> $$4, dru $$5) {
      aqe $$6 = $$0.a();
      aql $$7 = new aql($$6, $$4, $$1, -1);
      return $$0.b().a($$2, $$6.l().i(), dws.a($$7), $$6.a().a($$7), $$5);
   }

   static CompletableFuture<dru> e(dsx $$0, dst $$1, Executor $$2, dsw $$3, List<dru> $$4, dru $$5) {
      aqe $$6 = $$0.a();
      aql $$7 = new aql($$6, $$4, $$1, 0);
      return $$0.b().a($$2, dws.a($$7), $$6.l().i(), $$6.a().a($$7), $$5).thenApply($$0x -> {
         if ($$0x instanceof dso $$1x) {
            dve $$2x = $$1x.x();
            if ($$2x != null) {
               dve.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dru> f(dsx $$0, dst $$1, Executor $$2, dsw $$3, List<dru> $$4, dru $$5) {
      aqe $$6 = $$0.a();
      aql $$7 = new aql($$6, $$4, $$1, 0);
      $$0.b().a($$7, $$6.a().a($$7), $$6.l().i(), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dru> g(dsx $$0, dst $$1, Executor $$2, dsw $$3, List<dru> $$4, dru $$5) {
      aqe $$6 = $$0.a();
      aql $$7 = new aql($$6, $$4, $$1, 0);
      if ($$5 instanceof dso $$8) {
         dws.a($$7, $$8);
      }

      $$0.b().a($$7, $$6.C(), $$6.l().i(), $$6.F_(), $$6.a().a($$7), $$5, dvm.a.a);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dru> h(dsx $$0, dst $$1, Executor $$2, dsw $$3, List<dru> $$4, dru $$5) {
      aqe $$6 = $$0.a();
      dvq.a($$5, EnumSet.of(dvq.a.e, dvq.a.f, dvq.a.d, dvq.a.b));
      aql $$7 = new aql($$6, $$4, $$1, 1);
      $$0.b().a($$7, $$5, $$6.a().a($$7));
      dws.a($$7, $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dru> i(dsx $$0, dst $$1, Executor $$2, dsw $$3, List<dru> $$4, dru $$5) {
      return a($$0.d(), $$5);
   }

   static CompletableFuture<dru> c(dsx $$0, dst $$1, dsw $$2, dru $$3) {
      return a($$0.d(), $$3);
   }

   private static CompletableFuture<dru> a(aqh $$0, dru $$1) {
      $$1.A();
      ((dso)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2);
   }

   static CompletableFuture<dru> j(dsx $$0, dst $$1, Executor $$2, dsw $$3, List<dru> $$4, dru $$5) {
      return b($$0.d(), $$5);
   }

   static CompletableFuture<dru> d(dsx $$0, dst $$1, dsw $$2, dru $$3) {
      return b($$0.d(), $$3);
   }

   private static CompletableFuture<dru> b(aqh $$0, dru $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2);
   }

   static CompletableFuture<dru> k(dsx $$0, dst $$1, Executor $$2, dsw $$3, List<dru> $$4, dru $$5) {
      if (!$$5.y()) {
         $$0.b().a(new aql($$0.a(), $$4, $$1, -1));
      }

      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dru> l(dsx $$0, dst $$1, Executor $$2, dsw $$3, List<dru> $$4, dru $$5) {
      return $$3.apply($$5);
   }

   static CompletableFuture<dru> e(dsx $$0, dst $$1, dsw $$2, dru $$3) {
      return $$2.apply($$3);
   }
}
