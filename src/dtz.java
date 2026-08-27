import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class dtz {
   private static boolean a(dsz $$0) {
      return $$0.j().b(dty.l) && $$0.v();
   }

   static CompletableFuture<dsz> a(duc $$0, dty $$1, Executor $$2, dub $$3, List<dsz> $$4, dsz $$5) {
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsz> a(duc $$0, dty $$1, dub $$2, dsz $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dsz> b(duc $$0, dty $$1, Executor $$2, dub $$3, List<dsz> $$4, dsz $$5) {
      aqn $$6 = $$0.a();
      if ($$6.o().bb().y().c()) {
         $$0.b().a($$6.H_(), $$6.l().h(), $$6.a(), $$5, $$0.c());
      }

      $$6.a($$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsz> b(duc $$0, dty $$1, dub $$2, dsz $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dsz> c(duc $$0, dty $$1, Executor $$2, dub $$3, List<dsz> $$4, dsz $$5) {
      aqn $$6 = $$0.a();
      aqu $$7 = new aqu($$6, $$4, $$1, -1);
      $$0.b().a($$7, $$6.a().a($$7), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsz> d(duc $$0, dty $$1, Executor $$2, dub $$3, List<dsz> $$4, dsz $$5) {
      aqn $$6 = $$0.a();
      aqu $$7 = new aqu($$6, $$4, $$1, -1);
      return $$0.b().a($$2, $$6.l().i(), dxx.a($$7), $$6.a().a($$7), $$5);
   }

   static CompletableFuture<dsz> e(duc $$0, dty $$1, Executor $$2, dub $$3, List<dsz> $$4, dsz $$5) {
      aqn $$6 = $$0.a();
      aqu $$7 = new aqu($$6, $$4, $$1, 0);
      return $$0.b().a($$2, dxx.a($$7), $$6.l().i(), $$6.a().a($$7), $$5).thenApply($$0x -> {
         if ($$0x instanceof dtt $$1x) {
            dwj $$2x = $$1x.x();
            if ($$2x != null) {
               dwj.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dsz> f(duc $$0, dty $$1, Executor $$2, dub $$3, List<dsz> $$4, dsz $$5) {
      aqn $$6 = $$0.a();
      aqu $$7 = new aqu($$6, $$4, $$1, 0);
      $$0.b().a($$7, $$6.a().a($$7), $$6.l().i(), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsz> g(duc $$0, dty $$1, Executor $$2, dub $$3, List<dsz> $$4, dsz $$5) {
      aqn $$6 = $$0.a();
      aqu $$7 = new aqu($$6, $$4, $$1, 0);
      if ($$5 instanceof dtt $$8) {
         dxx.a($$7, $$8);
      }

      $$0.b().a($$7, $$6.C(), $$6.l().i(), $$6.F_(), $$6.a().a($$7), $$5, dwr.a.a);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsz> h(duc $$0, dty $$1, Executor $$2, dub $$3, List<dsz> $$4, dsz $$5) {
      aqn $$6 = $$0.a();
      dwv.a($$5, EnumSet.of(dwv.a.e, dwv.a.f, dwv.a.d, dwv.a.b));
      aqu $$7 = new aqu($$6, $$4, $$1, 1);
      $$0.b().a($$7, $$5, $$6.a().a($$7));
      dxx.a($$7, $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsz> i(duc $$0, dty $$1, Executor $$2, dub $$3, List<dsz> $$4, dsz $$5) {
      return a($$0.d(), $$5);
   }

   static CompletableFuture<dsz> c(duc $$0, dty $$1, dub $$2, dsz $$3) {
      return a($$0.d(), $$3);
   }

   private static CompletableFuture<dsz> a(aqq $$0, dsz $$1) {
      $$1.A();
      ((dtt)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2);
   }

   static CompletableFuture<dsz> j(duc $$0, dty $$1, Executor $$2, dub $$3, List<dsz> $$4, dsz $$5) {
      return b($$0.d(), $$5);
   }

   static CompletableFuture<dsz> d(duc $$0, dty $$1, dub $$2, dsz $$3) {
      return b($$0.d(), $$3);
   }

   private static CompletableFuture<dsz> b(aqq $$0, dsz $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2);
   }

   static CompletableFuture<dsz> k(duc $$0, dty $$1, Executor $$2, dub $$3, List<dsz> $$4, dsz $$5) {
      if (!$$5.y()) {
         $$0.b().a(new aqu($$0.a(), $$4, $$1, -1));
      }

      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dsz> l(duc $$0, dty $$1, Executor $$2, dub $$3, List<dsz> $$4, dsz $$5) {
      return $$3.apply($$5);
   }

   static CompletableFuture<dsz> e(duc $$0, dty $$1, dub $$2, dsz $$3) {
      return $$2.apply($$3);
   }
}
