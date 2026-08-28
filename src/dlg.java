import com.mojang.serialization.MapCodec;

public class dlg extends dfi {
   public static final MapCodec<dlg> a = b(dlg::new);

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   protected dlg(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      if (!$$0.a(cug.rV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bqj.a($$2.B);
      } else {
         jf $$7 = $$6.b();
         jf $$8 = $$7.o() == jf.a.b ? $$4.cJ().g() : $$7;
         $$2.a(null, $$3, avh.uW, avi.e, 1.0F, 1.0F);
         $$2.a($$3, dfk.ee.o().a(dgc.b, $$8), 11);
         civ $$9 = new civ(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cud(cug.rY, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, btc.d($$5));
         $$2.a($$4, dxh.M, $$3);
         $$4.b(avr.c.b(cug.rV));
         return bqj.a($$2.B);
      }
   }
}
