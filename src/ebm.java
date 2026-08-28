import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ebm {
   private static boolean a(eaj $$0) {
      return $$0.n().a(ebk.l) && $$0.x();
   }

   static CompletableFuture<eaj> a(ebp $$0, ebn $$1, bae<ard> $$2, eaj $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<eaj> b(ebp $$0, ebn $$1, bae<ard> $$2, eaj $$3) {
      arn $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.F_(), $$4.m().h(), $$4.b(), $$3, $$0.c(), $$4.aj());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<eaj> c(ebp $$0, ebn $$1, bae<ard> $$2, eaj $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<eaj> d(ebp $$0, ebn $$1, bae<ard> $$2, eaj $$3) {
      arn $$4 = $$0.a();
      arv $$5 = new arv($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<eaj> e(ebp $$0, ebn $$1, bae<ard> $$2, eaj $$3) {
      arn $$4 = $$0.a();
      arv $$5 = new arv($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), efn.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<eaj> f(ebp $$0, ebn $$1, bae<ard> $$2, eaj $$3) {
      arn $$4 = $$0.a();
      arv $$5 = new arv($$4, $$2, $$1, $$3);
      return $$0.b().a(efn.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof ebd $$1x) {
            edz $$2x = $$1x.z();
            if ($$2x != null) {
               edz.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<eaj> g(ebp $$0, ebn $$1, bae<ard> $$2, eaj $$3) {
      arn $$4 = $$0.a();
      arv $$5 = new arv($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<eaj> h(ebp $$0, ebn $$1, bae<ard> $$2, eaj $$3) {
      arn $$4 = $$0.a();
      arv $$5 = new arv($$4, $$2, $$1, $$3);
      if ($$3 instanceof ebd $$6) {
         efn.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.E(), $$4.m().i(), $$4.D_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<eaj> i(ebp $$0, ebn $$1, bae<ard> $$2, eaj $$3) {
      arn $$4 = $$0.a();
      eel.a($$3, EnumSet.of(eel.a.e, eel.a.f, eel.a.d, eel.a.b));
      arv $$5 = new arv($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      efn.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<eaj> j(ebp $$0, ebn $$1, bae<ard> $$2, eaj $$3) {
      arr $$4 = $$0.d();
      $$3.C();
      ((ebd)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<eaj> k(ebp $$0, ebn $$1, bae<ard> $$2, eaj $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<eaj> l(ebp $$0, ebn $$1, bae<ard> $$2, eaj $$3) {
      if (!$$3.A()) {
         $$0.b().a(new arv($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<eaj> m(ebp $$0, ebn $$1, bae<ard> $$2, eaj $$3) {
      dgw $$4 = $$3.f();
      ard $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         ebd $$3x = (ebd)$$3;
         arn $$4x = $$0.a();
         eat $$6;
         if ($$3x instanceof eas $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new eat($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new eas($$6, false));
         }

         $$6.b($$5::s);
         $$6.G();
         $$6.b(true);
         $$6.K();
         $$6.b($$4x);
         $$6.a($$0.f());
         return $$6;
      }, $$0.e());
   }

   private static void a(arn $$0, List<tw> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bwb.a($$1, $$0, bwa.r));
      }
   }
}
