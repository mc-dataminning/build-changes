import com.mojang.serialization.MapCodec;

public class dlx extends dfy {
   public static final MapCodec<dlx> a = b(dlx::new);

   @Override
   public MapCodec<dlx> a() {
      return a;
   }

   protected dlx(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, ewy $$6) {
      if (!$$0.a(cut.rV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bqt.a($$2.B);
      } else {
         ji $$7 = $$6.b();
         ji $$8 = $$7.o() == ji.a.b ? $$4.cH().g() : $$7;
         $$2.a(null, $$3, avp.uW, avq.e, 1.0F, 1.0F);
         $$2.a($$3, dga.ee.o().a(dgs.b, $$8), 11);
         cjh $$9 = new cjh(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cuq(cut.rY, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, btn.d($$5));
         $$2.a($$4, dxz.M, $$3);
         $$4.b(avz.c.b(cut.rV));
         return bqt.a($$2.B);
      }
   }
}
