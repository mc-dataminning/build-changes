import java.util.List;

public class cth extends ctx implements cuu {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cth(ctx.a $$0) {
      super($$0);
   }

   @Override
   public bqg a(cxo $$0) {
      dcf $$1 = $$0.q();
      if (!$$1.B) {
         cuc $$2 = $$0.n();
         ewf $$3 = $$0.l();
         jf $$4 = $$0.k();
         cmx $$5 = new cmx($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bqg.a($$1.B);
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      if ($$1.fB()) {
         cuc $$3 = $$1.b($$2);
         if (!$$0.B) {
            cmx $$4 = new cmx($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(avr.c.b(this));
         }

         return bqh.a($$1.b($$2), $$0.x_());
      } else {
         return bqh.c($$1.b($$2));
      }
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      cwv $$4 = $$0.a(kn.U);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cnc a(dcf $$0, jt $$1, cuc $$2, jf $$3) {
      return new cmx($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cuu.a c() {
      return cuu.a.a().a(cth::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static ewf a(kr $$0, jf $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)bsm.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)bsm.P.m() / 2.0) - (double)bsm.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)bsm.P.l() / 2.0)
         );
   }
}
