import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class drv {
   private static boolean a(dqv $$0) {
      return $$0.j().b(dru.l) && $$0.v();
   }

   static CompletableFuture<dqv> a(dry $$0, dru $$1, Executor $$2, drx $$3, List<dqv> $$4, dqv $$5) {
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dqv> a(dry $$0, dru $$1, drx $$2, dqv $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dqv> b(dry $$0, dru $$1, Executor $$2, drx $$3, List<dqv> $$4, dqv $$5) {
      aps $$6 = $$0.a();
      if ($$6.o().bc().y().c()) {
         $$0.b().a($$6.H_(), $$6.l().h(), $$6.a(), $$5, $$0.c());
      }

      $$6.a($$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dqv> b(dry $$0, dru $$1, drx $$2, dqv $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dqv> c(dry $$0, dru $$1, Executor $$2, drx $$3, List<dqv> $$4, dqv $$5) {
      aps $$6 = $$0.a();
      apz $$7 = new apz($$6, $$4, $$1, -1);
      $$0.b().a($$7, $$6.a().a($$7), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dqv> d(dry $$0, dru $$1, Executor $$2, drx $$3, List<dqv> $$4, dqv $$5) {
      aps $$6 = $$0.a();
      apz $$7 = new apz($$6, $$4, $$1, -1);
      return $$0.b().a($$2, $$6.l().i(), dvt.a($$7), $$6.a().a($$7), $$5);
   }

   static CompletableFuture<dqv> e(dry $$0, dru $$1, Executor $$2, drx $$3, List<dqv> $$4, dqv $$5) {
      aps $$6 = $$0.a();
      apz $$7 = new apz($$6, $$4, $$1, 0);
      return $$0.b().a($$2, dvt.a($$7), $$6.l().i(), $$6.a().a($$7), $$5).thenApply($$0x -> {
         if ($$0x instanceof drp $$1x) {
            duf $$2x = $$1x.x();
            if ($$2x != null) {
               duf.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dqv> f(dry $$0, dru $$1, Executor $$2, drx $$3, List<dqv> $$4, dqv $$5) {
      aps $$6 = $$0.a();
      apz $$7 = new apz($$6, $$4, $$1, 0);
      $$0.b().a($$7, $$6.a().a($$7), $$6.l().i(), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dqv> g(dry $$0, dru $$1, Executor $$2, drx $$3, List<dqv> $$4, dqv $$5) {
      aps $$6 = $$0.a();
      apz $$7 = new apz($$6, $$4, $$1, 0);
      if ($$5 instanceof drp $$8) {
         dvt.a($$7, $$8);
      }

      $$0.b().a($$7, $$6.C(), $$6.l().i(), $$6.F_(), $$6.a().a($$7), $$5, dun.a.a);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dqv> h(dry $$0, dru $$1, Executor $$2, drx $$3, List<dqv> $$4, dqv $$5) {
      aps $$6 = $$0.a();
      dur.a($$5, EnumSet.of(dur.a.e, dur.a.f, dur.a.d, dur.a.b));
      apz $$7 = new apz($$6, $$4, $$1, 1);
      $$0.b().a($$7, $$5, $$6.a().a($$7));
      dvt.a($$7, $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dqv> i(dry $$0, dru $$1, Executor $$2, drx $$3, List<dqv> $$4, dqv $$5) {
      return a($$0.d(), $$5);
   }

   static CompletableFuture<dqv> c(dry $$0, dru $$1, drx $$2, dqv $$3) {
      return a($$0.d(), $$3);
   }

   private static CompletableFuture<dqv> a(apv $$0, dqv $$1) {
      $$1.A();
      ((drp)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2);
   }

   static CompletableFuture<dqv> j(dry $$0, dru $$1, Executor $$2, drx $$3, List<dqv> $$4, dqv $$5) {
      return b($$0.d(), $$5);
   }

   static CompletableFuture<dqv> d(dry $$0, dru $$1, drx $$2, dqv $$3) {
      return b($$0.d(), $$3);
   }

   private static CompletableFuture<dqv> b(apv $$0, dqv $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2);
   }

   static CompletableFuture<dqv> k(dry $$0, dru $$1, Executor $$2, drx $$3, List<dqv> $$4, dqv $$5) {
      if (!$$5.y()) {
         $$0.b().a(new apz($$0.a(), $$4, $$1, -1));
      }

      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dqv> l(dry $$0, dru $$1, Executor $$2, drx $$3, List<dqv> $$4, dqv $$5) {
      return $$3.apply($$5);
   }

   static CompletableFuture<dqv> e(dry $$0, dru $$1, drx $$2, dqv $$3) {
      return $$2.apply($$3);
   }
}
