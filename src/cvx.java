import java.util.List;

public class cvx extends cwm implements cxl {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cvx(cwm.a $$0) {
      super($$0);
   }

   @Override
   public bsl a(daj $$0) {
      dgj $$1 = $$0.q();
      if ($$1 instanceof ard $$2) {
         cwq $$3 = $$0.n();
         fbb $$4 = $$0.l();
         jn $$5 = $$0.k();
         cpr.a(new cpm($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bsl.a;
   }

   @Override
   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      if ($$1.fJ()) {
         cwq $$3 = $$1.b($$2);
         if ($$0 instanceof ard $$4) {
            cpr.a(new cpm($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awk.c.b(this));
         }

         return bsl.a;
      } else {
         return bsl.e;
      }
   }

   @Override
   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
      czg $$4 = $$0.a(kv.af);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cpr a(dgj $$0, kb $$1, cwq $$2, jn $$3) {
      return new cpm($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cxl.a b() {
      return cxl.a.a().a(cvx::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static fbb a(kz $$0, jn $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}
