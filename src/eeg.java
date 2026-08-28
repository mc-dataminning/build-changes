import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class eeg {
   private static boolean a(edd $$0) {
      return $$0.n().a(eee.l) && $$0.x();
   }

   static CompletableFuture<edd> a(eej $$0, eeh $$1, bam<ark> $$2, edd $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edd> b(eej $$0, eeh $$1, bam<ark> $$2, edd $$3) {
      aru $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.J_(), $$4.m().h(), $$4.b(), $$3, $$0.c(), $$4.aj());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edd> c(eej $$0, eeh $$1, bam<ark> $$2, edd $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edd> d(eej $$0, eeh $$1, bam<ark> $$2, edd $$3) {
      aru $$4 = $$0.a();
      asc $$5 = new asc($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edd> e(eej $$0, eeh $$1, bam<ark> $$2, edd $$3) {
      aru $$4 = $$0.a();
      asc $$5 = new asc($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), eih.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<edd> f(eej $$0, eeh $$1, bam<ark> $$2, edd $$3) {
      aru $$4 = $$0.a();
      asc $$5 = new asc($$4, $$2, $$1, $$3);
      return $$0.b().a(eih.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof edx $$1x) {
            egt $$2x = $$1x.z();
            if ($$2x != null) {
               egt.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<edd> g(eej $$0, eeh $$1, bam<ark> $$2, edd $$3) {
      aru $$4 = $$0.a();
      asc $$5 = new asc($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edd> h(eej $$0, eeh $$1, bam<ark> $$2, edd $$3) {
      aru $$4 = $$0.a();
      asc $$5 = new asc($$4, $$2, $$1, $$3);
      if ($$3 instanceof edx $$6) {
         eih.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.E(), $$4.m().i(), $$4.H_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edd> i(eej $$0, eeh $$1, bam<ark> $$2, edd $$3) {
      aru $$4 = $$0.a();
      ehf.a($$3, EnumSet.of(ehf.a.e, ehf.a.f, ehf.a.d, ehf.a.b));
      asc $$5 = new asc($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      eih.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edd> j(eej $$0, eeh $$1, bam<ark> $$2, edd $$3) {
      ary $$4 = $$0.d();
      $$3.C();
      ((edx)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<edd> k(eej $$0, eeh $$1, bam<ark> $$2, edd $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<edd> l(eej $$0, eeh $$1, bam<ark> $$2, edd $$3) {
      if (!$$3.A()) {
         $$0.b().a(new asc($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edd> m(eej $$0, eeh $$1, bam<ark> $$2, edd $$3) {
      dje $$4 = $$3.f();
      ark $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         edx $$3x = (edx)$$3;
         aru $$4x = $$0.a();
         edn $$6;
         if ($$3x instanceof edm $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new edn($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new edm($$6, false));
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

   private static void a(aru $$0, List<ua> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bxe.a($$1, $$0, bxd.r));
      }
   }
}
