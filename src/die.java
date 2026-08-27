import com.mojang.serialization.MapCodec;

public class die extends dch {
   public static final MapCodec<die> a = b(die::new);

   @Override
   public MapCodec<die> a() {
      return a;
   }

   protected die(dph.d $$0) {
      super($$0);
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      if (!$$0.a(crv.rU)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return boh.a($$2.B);
      } else {
         ij $$7 = $$6.b();
         ij $$8 = $$7.o() == ij.a.b ? $$4.cE().g() : $$7;
         $$2.a(null, $$3, auo.uA, aup.e, 1.0F, 1.0F);
         $$2.a($$3, dcj.ee.n().a(ddb.b, $$8), 11);
         cgk $$9 = new cgk(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new crs(crv.rX, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bqt.d($$5));
         $$2.a($$4, dub.M, $$3);
         $$4.b(auz.c.b(crv.rU));
         return boh.a($$2.B);
      }
   }
}
