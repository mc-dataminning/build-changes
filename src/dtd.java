import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class dtd {
   private static boolean a(dsd $$0) {
      return $$0.j().b(dtc.l) && $$0.v();
   }

   static CompletableFuture<dsd> a(dtg $$0, dtc $$1, Executor $$2, dtf $$3, List<dsd> $$4, dsd $$5) {
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsd> a(dtg $$0, dtc $$1, dtf $$2, dsd $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dsd> b(dtg $$0, dtc $$1, Executor $$2, dtf $$3, List<dsd> $$4, dsd $$5) {
      aqh $$6 = $$0.a();
      if ($$6.o().bb().y().c()) {
         $$0.b().a($$6.H_(), $$6.l().h(), $$6.a(), $$5, $$0.c());
      }

      $$6.a($$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsd> b(dtg $$0, dtc $$1, dtf $$2, dsd $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dsd> c(dtg $$0, dtc $$1, Executor $$2, dtf $$3, List<dsd> $$4, dsd $$5) {
      aqh $$6 = $$0.a();
      aqo $$7 = new aqo($$6, $$4, $$1, -1);
      $$0.b().a($$7, $$6.a().a($$7), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsd> d(dtg $$0, dtc $$1, Executor $$2, dtf $$3, List<dsd> $$4, dsd $$5) {
      aqh $$6 = $$0.a();
      aqo $$7 = new aqo($$6, $$4, $$1, -1);
      return $$0.b().a($$2, $$6.l().i(), dxb.a($$7), $$6.a().a($$7), $$5);
   }

   static CompletableFuture<dsd> e(dtg $$0, dtc $$1, Executor $$2, dtf $$3, List<dsd> $$4, dsd $$5) {
      aqh $$6 = $$0.a();
      aqo $$7 = new aqo($$6, $$4, $$1, 0);
      return $$0.b().a($$2, dxb.a($$7), $$6.l().i(), $$6.a().a($$7), $$5).thenApply($$0x -> {
         if ($$0x instanceof dsx $$1x) {
            dvn $$2x = $$1x.x();
            if ($$2x != null) {
               dvn.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dsd> f(dtg $$0, dtc $$1, Executor $$2, dtf $$3, List<dsd> $$4, dsd $$5) {
      aqh $$6 = $$0.a();
      aqo $$7 = new aqo($$6, $$4, $$1, 0);
      $$0.b().a($$7, $$6.a().a($$7), $$6.l().i(), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsd> g(dtg $$0, dtc $$1, Executor $$2, dtf $$3, List<dsd> $$4, dsd $$5) {
      aqh $$6 = $$0.a();
      aqo $$7 = new aqo($$6, $$4, $$1, 0);
      if ($$5 instanceof dsx $$8) {
         dxb.a($$7, $$8);
      }

      $$0.b().a($$7, $$6.C(), $$6.l().i(), $$6.F_(), $$6.a().a($$7), $$5, dvv.a.a);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsd> h(dtg $$0, dtc $$1, Executor $$2, dtf $$3, List<dsd> $$4, dsd $$5) {
      aqh $$6 = $$0.a();
      dvz.a($$5, EnumSet.of(dvz.a.e, dvz.a.f, dvz.a.d, dvz.a.b));
      aqo $$7 = new aqo($$6, $$4, $$1, 1);
      $$0.b().a($$7, $$5, $$6.a().a($$7));
      dxb.a($$7, $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsd> i(dtg $$0, dtc $$1, Executor $$2, dtf $$3, List<dsd> $$4, dsd $$5) {
      return a($$0.d(), $$5);
   }

   static CompletableFuture<dsd> c(dtg $$0, dtc $$1, dtf $$2, dsd $$3) {
      return a($$0.d(), $$3);
   }

   private static CompletableFuture<dsd> a(aqk $$0, dsd $$1) {
      $$1.A();
      ((dsx)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2);
   }

   static CompletableFuture<dsd> j(dtg $$0, dtc $$1, Executor $$2, dtf $$3, List<dsd> $$4, dsd $$5) {
      return b($$0.d(), $$5);
   }

   static CompletableFuture<dsd> d(dtg $$0, dtc $$1, dtf $$2, dsd $$3) {
      return b($$0.d(), $$3);
   }

   private static CompletableFuture<dsd> b(aqk $$0, dsd $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2);
   }

   static CompletableFuture<dsd> k(dtg $$0, dtc $$1, Executor $$2, dtf $$3, List<dsd> $$4, dsd $$5) {
      if (!$$5.y()) {
         $$0.b().a(new aqo($$0.a(), $$4, $$1, -1));
      }

      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsd> l(dtg $$0, dtc $$1, Executor $$2, dtf $$3, List<dsd> $$4, dsd $$5) {
      return $$3.apply($$5);
   }

   static CompletableFuture<dsd> e(dtg $$0, dtc $$1, dtf $$2, dsd $$3) {
      return $$2.apply($$3);
   }
}
