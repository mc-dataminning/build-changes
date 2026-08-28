import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class duy {
   private static boolean a(dty $$0) {
      return $$0.j().b(dux.l) && $$0.v();
   }

   static CompletableFuture<dty> a(dvb $$0, dux $$1, Executor $$2, dva $$3, List<dty> $$4, dty $$5) {
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dty> a(dvb $$0, dux $$1, dva $$2, dty $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dty> b(dvb $$0, dux $$1, Executor $$2, dva $$3, List<dty> $$4, dty $$5) {
      arf $$6 = $$0.a();
      if ($$6.o().bb().y().c()) {
         $$0.b().a($$6.H_(), $$6.l().h(), $$6.a(), $$5, $$0.c());
      }

      $$6.a($$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dty> b(dvb $$0, dux $$1, dva $$2, dty $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dty> c(dvb $$0, dux $$1, Executor $$2, dva $$3, List<dty> $$4, dty $$5) {
      arf $$6 = $$0.a();
      arm $$7 = new arm($$6, $$4, $$1, -1);
      $$0.b().a($$7, $$6.a().a($$7), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dty> d(dvb $$0, dux $$1, Executor $$2, dva $$3, List<dty> $$4, dty $$5) {
      arf $$6 = $$0.a();
      arm $$7 = new arm($$6, $$4, $$1, -1);
      return $$0.b().a($$2, $$6.l().i(), dyw.a($$7), $$6.a().a($$7), $$5);
   }

   static CompletableFuture<dty> e(dvb $$0, dux $$1, Executor $$2, dva $$3, List<dty> $$4, dty $$5) {
      arf $$6 = $$0.a();
      arm $$7 = new arm($$6, $$4, $$1, 0);
      return $$0.b().a($$2, dyw.a($$7), $$6.l().i(), $$6.a().a($$7), $$5).thenApply($$0x -> {
         if ($$0x instanceof dus $$1x) {
            dxi $$2x = $$1x.x();
            if ($$2x != null) {
               dxi.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dty> f(dvb $$0, dux $$1, Executor $$2, dva $$3, List<dty> $$4, dty $$5) {
      arf $$6 = $$0.a();
      arm $$7 = new arm($$6, $$4, $$1, 0);
      $$0.b().a($$7, $$6.a().a($$7), $$6.l().i(), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dty> g(dvb $$0, dux $$1, Executor $$2, dva $$3, List<dty> $$4, dty $$5) {
      arf $$6 = $$0.a();
      arm $$7 = new arm($$6, $$4, $$1, 0);
      if ($$5 instanceof dus $$8) {
         dyw.a($$7, $$8);
      }

      $$0.b().a($$7, $$6.C(), $$6.l().i(), $$6.F_(), $$6.a().a($$7), $$5, dxq.a.a);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dty> h(dvb $$0, dux $$1, Executor $$2, dva $$3, List<dty> $$4, dty $$5) {
      arf $$6 = $$0.a();
      dxu.a($$5, EnumSet.of(dxu.a.e, dxu.a.f, dxu.a.d, dxu.a.b));
      arm $$7 = new arm($$6, $$4, $$1, 1);
      $$0.b().a($$7, $$5, $$6.a().a($$7));
      dyw.a($$7, $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dty> i(dvb $$0, dux $$1, Executor $$2, dva $$3, List<dty> $$4, dty $$5) {
      return a($$0.d(), $$5);
   }

   static CompletableFuture<dty> c(dvb $$0, dux $$1, dva $$2, dty $$3) {
      return a($$0.d(), $$3);
   }

   private static CompletableFuture<dty> a(ari $$0, dty $$1) {
      $$1.A();
      ((dus)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2);
   }

   static CompletableFuture<dty> j(dvb $$0, dux $$1, Executor $$2, dva $$3, List<dty> $$4, dty $$5) {
      return b($$0.d(), $$5);
   }

   static CompletableFuture<dty> d(dvb $$0, dux $$1, dva $$2, dty $$3) {
      return b($$0.d(), $$3);
   }

   private static CompletableFuture<dty> b(ari $$0, dty $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2);
   }

   static CompletableFuture<dty> k(dvb $$0, dux $$1, Executor $$2, dva $$3, List<dty> $$4, dty $$5) {
      if (!$$5.y()) {
         $$0.b().a(new arm($$0.a(), $$4, $$1, -1));
      }

      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dty> l(dvb $$0, dux $$1, Executor $$2, dva $$3, List<dty> $$4, dty $$5) {
      return $$3.apply($$5);
   }

   static CompletableFuture<dty> e(dvb $$0, dux $$1, dva $$2, dty $$3) {
      return $$2.apply($$3);
   }
}
