import com.mojang.serialization.MapCodec;

public class del extends cyo {
   public static final MapCodec<del> a = b(del::new);

   @Override
   public MapCodec<del> a() {
      return a;
   }

   protected del(dle.d $$0) {
      super($$0);
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      if (!$$0.a(cpc.rU)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return blw.a($$2.B);
      } else {
         ie $$7 = $$6.b();
         ie $$8 = $$7.o() == ie.a.b ? $$4.cE().g() : $$7;
         $$2.a(null, $$3, atk.uo, atl.e, 1.0F, 1.0F);
         $$2.a($$3, cyq.ee.o().a(czi.b, $$8), 11);
         cds $$9 = new cds(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new coz(cpc.rX, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bog.d($$5));
         $$2.a($$4, dpp.M, $$3);
         $$4.b(atu.c.b(cpc.rU));
         return blw.a($$2.B);
      }
   }
}
