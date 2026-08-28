import java.util.List;

public class cvw extends cwl implements cxk {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cvw(cwl.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dai $$0) {
      dgi $$1 = $$0.q();
      if ($$1 instanceof arc $$2) {
         cwp $$3 = $$0.n();
         fba $$4 = $$0.l();
         jn $$5 = $$0.k();
         cpq.a(new cpl($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bsj.a;
   }

   @Override
   public bsj a(dgi $$0, cox $$1, bsi $$2) {
      if ($$1.fJ()) {
         cwp $$3 = $$1.b($$2);
         if ($$0 instanceof arc $$4) {
            cpq.a(new cpl($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awk.c.b(this));
         }

         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wo> $$2, cyh $$3) {
      czf $$4 = $$0.a(kv.af);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cpq a(dgi $$0, kb $$1, cwp $$2, jn $$3) {
      return new cpl($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cxk.a b() {
      return cxk.a.a().a(cvw::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static fba a(kz $$0, jn $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}
