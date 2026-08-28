import java.util.List;

public class cvv extends cwk implements cxj {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cvv(cwk.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dah $$0) {
      dgh $$1 = $$0.q();
      if ($$1 instanceof ard $$2) {
         cwo $$3 = $$0.n();
         faz $$4 = $$0.l();
         jn $$5 = $$0.k();
         cpp.a(new cpk($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bsj.a;
   }

   @Override
   public bsj a(dgh $$0, cow $$1, bsi $$2) {
      if ($$1.fJ()) {
         cwo $$3 = $$1.b($$2);
         if ($$0 instanceof ard $$4) {
            cpp.a(new cpk($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awk.c.b(this));
         }

         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   @Override
   public void a(cwo $$0, cwk.b $$1, List<wp> $$2, cyg $$3) {
      cze $$4 = $$0.a(kv.af);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cpp a(dgh $$0, kb $$1, cwo $$2, jn $$3) {
      return new cpk($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cxj.a b() {
      return cxj.a.a().a(cvv::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static faz a(kz $$0, jn $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}
