import java.util.List;

public class cuv extends cvk implements cwk {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cuv(cvk.a $$0) {
      super($$0);
   }

   @Override
   public brp a(czm $$0) {
      deg $$1 = $$0.q();
      if ($$1 instanceof arh $$2) {
         cvp $$3 = $$0.n();
         eys $$4 = $$0.l();
         jj $$5 = $$0.k();
         coo.a(new coi($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return brp.a;
   }

   @Override
   public brp a(deg $$0, cnu $$1, bro $$2) {
      if ($$1.fF()) {
         cvp $$3 = $$1.b($$2);
         if ($$0 instanceof arh $$4) {
            coo.a(new coi($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awo.c.b(this));
         }

         return brp.a;
      } else {
         return brp.e;
      }
   }

   @Override
   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
      cyj $$4 = $$0.a(kr.aa);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public coo a(deg $$0, jx $$1, cvp $$2, jj $$3) {
      return new coi($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cwk.a c() {
      return cwk.a.a().a(cuv::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static eys a(kv $$0, jj $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)btv.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)btv.P.m() / 2.0) - (double)btv.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)btv.P.l() / 2.0)
         );
   }
}
