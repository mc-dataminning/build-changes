import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class dva {
   private static boolean a(dua $$0) {
      return $$0.j().b(duz.l) && $$0.v();
   }

   static CompletableFuture<dua> a(dvd $$0, duz $$1, Executor $$2, dvc $$3, List<dua> $$4, dua $$5) {
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dua> a(dvd $$0, duz $$1, dvc $$2, dua $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dua> b(dvd $$0, duz $$1, Executor $$2, dvc $$3, List<dua> $$4, dua $$5) {
      arf $$6 = $$0.a();
      if ($$6.o().bb().y().c()) {
         $$0.b().a($$6.H_(), $$6.l().h(), $$6.a(), $$5, $$0.c());
      }

      $$6.a($$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dua> b(dvd $$0, duz $$1, dvc $$2, dua $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dua> c(dvd $$0, duz $$1, Executor $$2, dvc $$3, List<dua> $$4, dua $$5) {
      arf $$6 = $$0.a();
      arm $$7 = new arm($$6, $$4, $$1, -1);
      $$0.b().a($$7, $$6.a().a($$7), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dua> d(dvd $$0, duz $$1, Executor $$2, dvc $$3, List<dua> $$4, dua $$5) {
      arf $$6 = $$0.a();
      arm $$7 = new arm($$6, $$4, $$1, -1);
      return $$0.b().a($$2, $$6.l().i(), dyy.a($$7), $$6.a().a($$7), $$5);
   }

   static CompletableFuture<dua> e(dvd $$0, duz $$1, Executor $$2, dvc $$3, List<dua> $$4, dua $$5) {
      arf $$6 = $$0.a();
      arm $$7 = new arm($$6, $$4, $$1, 0);
      return $$0.b().a($$2, dyy.a($$7), $$6.l().i(), $$6.a().a($$7), $$5).thenApply($$0x -> {
         if ($$0x instanceof duu $$1x) {
            dxk $$2x = $$1x.x();
            if ($$2x != null) {
               dxk.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dua> f(dvd $$0, duz $$1, Executor $$2, dvc $$3, List<dua> $$4, dua $$5) {
      arf $$6 = $$0.a();
      arm $$7 = new arm($$6, $$4, $$1, 0);
      $$0.b().a($$7, $$6.a().a($$7), $$6.l().i(), $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dua> g(dvd $$0, duz $$1, Executor $$2, dvc $$3, List<dua> $$4, dua $$5) {
      arf $$6 = $$0.a();
      arm $$7 = new arm($$6, $$4, $$1, 0);
      if ($$5 instanceof duu $$8) {
         dyy.a($$7, $$8);
      }

      $$0.b().a($$7, $$6.C(), $$6.l().i(), $$6.F_(), $$6.a().a($$7), $$5, dxs.a.a);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dua> h(dvd $$0, duz $$1, Executor $$2, dvc $$3, List<dua> $$4, dua $$5) {
      arf $$6 = $$0.a();
      dxw.a($$5, EnumSet.of(dxw.a.e, dxw.a.f, dxw.a.d, dxw.a.b));
      arm $$7 = new arm($$6, $$4, $$1, 1);
      $$0.b().a($$7, $$5, $$6.a().a($$7));
      dyy.a($$7, $$5);
      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dua> i(dvd $$0, duz $$1, Executor $$2, dvc $$3, List<dua> $$4, dua $$5) {
      return a($$0.d(), $$5);
   }

   static CompletableFuture<dua> c(dvd $$0, duz $$1, dvc $$2, dua $$3) {
      return a($$0.d(), $$3);
   }

   private static CompletableFuture<dua> a(ari $$0, dua $$1) {
      $$1.A();
      ((duu)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2);
   }

   static CompletableFuture<dua> j(dvd $$0, duz $$1, Executor $$2, dvc $$3, List<dua> $$4, dua $$5) {
      return b($$0.d(), $$5);
   }

   static CompletableFuture<dua> d(dvd $$0, duz $$1, dvc $$2, dua $$3) {
      return b($$0.d(), $$3);
   }

   private static CompletableFuture<dua> b(ari $$0, dua $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2);
   }

   static CompletableFuture<dua> k(dvd $$0, duz $$1, Executor $$2, dvc $$3, List<dua> $$4, dua $$5) {
      if (!$$5.y()) {
         $$0.b().a(new arm($$0.a(), $$4, $$1, -1));
      }

      return CompletableFuture.completedFuture($$5);
   }

   static CompletableFuture<dua> l(dvd $$0, duz $$1, Executor $$2, dvc $$3, List<dua> $$4, dua $$5) {
      return $$3.apply($$5);
   }

   static CompletableFuture<dua> e(dvd $$0, duz $$1, dvc $$2, dua $$3) {
      return $$2.apply($$3);
   }
}
