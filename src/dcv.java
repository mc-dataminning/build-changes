import com.mojang.serialization.MapCodec;

public class dcv extends cwy {
   public static final MapCodec<dcv> a = b(dcv::new);

   @Override
   public MapCodec<dcv> a() {
      return a;
   }

   protected dcv(djo.d $$0) {
      super($$0);
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      if (!$$0.a(cnj.rU)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bke.a($$2.B);
      } else {
         ic $$7 = $$6.b();
         ic $$8 = $$7.o() == ic.a.b ? $$4.cE().g() : $$7;
         $$2.a(null, $$3, art.uo, aru.e, 1.0F, 1.0F);
         $$2.a($$3, cxa.ee.o().a(cxs.b, $$8), 11);
         ccb $$9 = new ccb(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cng(cnj.rX, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, $$1x -> $$1x.d($$5));
         $$2.a($$4, dnz.M, $$3);
         $$4.b(asd.c.b(cnj.rU));
         return bke.a($$2.B);
      }
   }
}
