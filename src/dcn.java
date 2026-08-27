import com.mojang.serialization.MapCodec;

public class dcn extends cwq {
   public static final MapCodec<dcn> a = b(dcn::new);

   @Override
   public MapCodec<dcn> a() {
      return a;
   }

   protected dcn(djg.d $$0) {
      super($$0);
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      cmy $$6 = $$3.b($$4);
      if ($$6.a(cnb.rS)) {
         if (!$$1.B) {
            ic $$7 = $$5.b();
            ic $$8 = $$7.o() == ic.a.b ? $$3.cE().g() : $$7;
            $$1.a(null, $$2, ars.tZ, art.e, 1.0F, 1.0F);
            $$1.a($$2, cws.ee.o().a(cxk.b, $$8), 11);
            cbu $$9 = new cbu(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new cmy(cnb.rV, 4)
            );
            $$9.o(0.05 * (double)$$8.j() + $$1.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.z.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, dnr.M, $$2);
            $$3.b(asc.c.b(cnb.rS));
         }

         return bkb.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
