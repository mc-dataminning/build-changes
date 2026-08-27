import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class dse {
   private static boolean a(dre $$0) {
      return $$0.j().b(dsd.l) && $$0.v();
   }

   static CompletableFuture<dre> a(dsh $$0, dsd $$1, Executor $$2, dsg $$3, List<dre> $$4, dre $$5) {
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dre> a(dsh $$0, dsd $$1, dsg $$2, dre $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dre> b(dsh $$0, dsd $$1, Executor $$2, dsg $$3, List<dre> $$4, dre $$5) {
      apu $$6 = $$0.a();
      if ($$6.o().bc().y().c()) {
         $$0.b().a($$6.H_(), $$6.l().h(), $$6.a(), $$5, $$0.c());
      }

      $$6.a($$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dre> b(dsh $$0, dsd $$1, dsg $$2, dre $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dre> c(dsh $$0, dsd $$1, Executor $$2, dsg $$3, List<dre> $$4, dre $$5) {
      apu $$6 = $$0.a();
      aqb $$7 = new aqb($$6, $$4, $$1, -1);
      $$0.b().a($$7, $$6.a().a($$7), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dre> d(dsh $$0, dsd $$1, Executor $$2, dsg $$3, List<dre> $$4, dre $$5) {
      apu $$6 = $$0.a();
      aqb $$7 = new aqb($$6, $$4, $$1, -1);
      return $$0.b().a($$2, $$6.l().i(), dwc.a($$7), $$6.a().a($$7), $$5);
   }

   static CompletableFuture<dre> e(dsh $$0, dsd $$1, Executor $$2, dsg $$3, List<dre> $$4, dre $$5) {
      apu $$6 = $$0.a();
      aqb $$7 = new aqb($$6, $$4, $$1, 0);
      return $$0.b().a($$2, dwc.a($$7), $$6.l().i(), $$6.a().a($$7), $$5).thenApply($$0x -> {
         if ($$0x instanceof dry $$1x) {
            duo $$2x = $$1x.x();
            if ($$2x != null) {
               duo.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dre> f(dsh $$0, dsd $$1, Executor $$2, dsg $$3, List<dre> $$4, dre $$5) {
      apu $$6 = $$0.a();
      aqb $$7 = new aqb($$6, $$4, $$1, 0);
      $$0.b().a($$7, $$6.a().a($$7), $$6.l().i(), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dre> g(dsh $$0, dsd $$1, Executor $$2, dsg $$3, List<dre> $$4, dre $$5) {
      apu $$6 = $$0.a();
      aqb $$7 = new aqb($$6, $$4, $$1, 0);
      if ($$5 instanceof dry $$8) {
         dwc.a($$7, $$8);
      }

      $$0.b().a($$7, $$6.C(), $$6.l().i(), $$6.F_(), $$6.a().a($$7), $$5, duw.a.a);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dre> h(dsh $$0, dsd $$1, Executor $$2, dsg $$3, List<dre> $$4, dre $$5) {
      apu $$6 = $$0.a();
      dva.a($$5, EnumSet.of(dva.a.e, dva.a.f, dva.a.d, dva.a.b));
      aqb $$7 = new aqb($$6, $$4, $$1, 1);
      $$0.b().a($$7, $$5, $$6.a().a($$7));
      dwc.a($$7, $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dre> i(dsh $$0, dsd $$1, Executor $$2, dsg $$3, List<dre> $$4, dre $$5) {
      return a($$0.d(), $$5);
   }

   static CompletableFuture<dre> c(dsh $$0, dsd $$1, dsg $$2, dre $$3) {
      return a($$0.d(), $$3);
   }

   private static CompletableFuture<dre> a(apx $$0, dre $$1) {
      $$1.A();
      ((dry)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2);
   }

   static CompletableFuture<dre> j(dsh $$0, dsd $$1, Executor $$2, dsg $$3, List<dre> $$4, dre $$5) {
      return b($$0.d(), $$5);
   }

   static CompletableFuture<dre> d(dsh $$0, dsd $$1, dsg $$2, dre $$3) {
      return b($$0.d(), $$3);
   }

   private static CompletableFuture<dre> b(apx $$0, dre $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2);
   }

   static CompletableFuture<dre> k(dsh $$0, dsd $$1, Executor $$2, dsg $$3, List<dre> $$4, dre $$5) {
      if (!$$5.y()) {
         $$0.b().a(new aqb($$0.a(), $$4, $$1, -1));
      }

      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dre> l(dsh $$0, dsd $$1, Executor $$2, dsg $$3, List<dre> $$4, dre $$5) {
      return $$3.apply($$5);
   }

   static CompletableFuture<dre> e(dsh $$0, dsd $$1, dsg $$2, dre $$3) {
      return $$2.apply($$3);
   }
}
