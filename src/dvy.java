import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class dvy {
   private static boolean a(duy $$0) {
      return $$0.k().b(dvx.l) && $$0.w();
   }

   static CompletableFuture<duy> a(dwb $$0, dvx $$1, Executor $$2, dwa $$3, List<duy> $$4, duy $$5) {
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<duy> a(dwb $$0, dvx $$1, dwa $$2, duy $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duy> b(dwb $$0, dvx $$1, Executor $$2, dwa $$3, List<duy> $$4, duy $$5) {
      aqt $$6 = $$0.a();
      if ($$6.o().bb().y().c()) {
         $$0.b().a($$6.I_(), $$6.l().h(), $$6.a(), $$5, $$0.c());
      }

      $$6.a($$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<duy> b(dwb $$0, dvx $$1, dwa $$2, duy $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duy> c(dwb $$0, dvx $$1, Executor $$2, dwa $$3, List<duy> $$4, duy $$5) {
      aqt $$6 = $$0.a();
      ara $$7 = new ara($$6, $$4, $$1, -1);
      $$0.b().a($$7, $$6.a().a($$7), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<duy> d(dwb $$0, dvx $$1, Executor $$2, dwa $$3, List<duy> $$4, duy $$5) {
      aqt $$6 = $$0.a();
      ara $$7 = new ara($$6, $$4, $$1, -1);
      return $$0.b().a($$2, $$6.l().i(), dzw.a($$7), $$6.a().a($$7), $$5);
   }

   static CompletableFuture<duy> e(dwb $$0, dvx $$1, Executor $$2, dwa $$3, List<duy> $$4, duy $$5) {
      aqt $$6 = $$0.a();
      ara $$7 = new ara($$6, $$4, $$1, 0);
      return $$0.b().a($$2, dzw.a($$7), $$6.l().i(), $$6.a().a($$7), $$5).thenApply($$0x -> {
         if ($$0x instanceof dvs $$1x) {
            dyi $$2x = $$1x.y();
            if ($$2x != null) {
               dyi.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<duy> f(dwb $$0, dvx $$1, Executor $$2, dwa $$3, List<duy> $$4, duy $$5) {
      aqt $$6 = $$0.a();
      ara $$7 = new ara($$6, $$4, $$1, 0);
      $$0.b().a($$7, $$6.a().a($$7), $$6.l().i(), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<duy> g(dwb $$0, dvx $$1, Executor $$2, dwa $$3, List<duy> $$4, duy $$5) {
      aqt $$6 = $$0.a();
      ara $$7 = new ara($$6, $$4, $$1, 0);
      if ($$5 instanceof dvs $$8) {
         dzw.a($$7, $$8);
      }

      $$0.b().a($$7, $$6.C(), $$6.l().i(), $$6.G_(), $$6.a().a($$7), $$5, dyq.a.a);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<duy> h(dwb $$0, dvx $$1, Executor $$2, dwa $$3, List<duy> $$4, duy $$5) {
      aqt $$6 = $$0.a();
      dyu.a($$5, EnumSet.of(dyu.a.e, dyu.a.f, dyu.a.d, dyu.a.b));
      ara $$7 = new ara($$6, $$4, $$1, 1);
      $$0.b().a($$7, $$5, $$6.a().a($$7));
      dzw.a($$7, $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<duy> i(dwb $$0, dvx $$1, Executor $$2, dwa $$3, List<duy> $$4, duy $$5) {
      return a($$0.d(), $$5);
   }

   static CompletableFuture<duy> c(dwb $$0, dvx $$1, dwa $$2, duy $$3) {
      return a($$0.d(), $$3);
   }

   private static CompletableFuture<duy> a(aqw $$0, duy $$1) {
      $$1.B();
      ((dvs)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2);
   }

   static CompletableFuture<duy> j(dwb $$0, dvx $$1, Executor $$2, dwa $$3, List<duy> $$4, duy $$5) {
      return b($$0.d(), $$5);
   }

   static CompletableFuture<duy> d(dwb $$0, dvx $$1, dwa $$2, duy $$3) {
      return b($$0.d(), $$3);
   }

   private static CompletableFuture<duy> b(aqw $$0, duy $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2);
   }

   static CompletableFuture<duy> k(dwb $$0, dvx $$1, Executor $$2, dwa $$3, List<duy> $$4, duy $$5) {
      if (!$$5.z()) {
         $$0.b().a(new ara($$0.a(), $$4, $$1, -1));
      }

      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<duy> l(dwb $$0, dvx $$1, Executor $$2, dwa $$3, List<duy> $$4, duy $$5) {
      return $$3.apply($$5);
   }

   static CompletableFuture<duy> e(dwb $$0, dvx $$1, dwa $$2, duy $$3) {
      return $$2.apply($$3);
   }
}
