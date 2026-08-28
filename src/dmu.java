import com.mojang.serialization.MapCodec;

public class dmu extends dgv {
   public static final MapCodec<dmu> a = b(dmu::new);

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   protected dmu(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      if (!$$0.a(cvo.rW)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return brk.a;
      } else {
         jj $$7 = $$6.b();
         jj $$8 = $$7.o() == jj.a.b ? $$4.cL().g() : $$7;
         $$2.a(null, $$3, awd.uX, awe.e, 1.0F, 1.0F);
         $$2.a($$3, dgx.ee.o().b(dhp.b, $$8), 11);
         cjz $$9 = new cjz(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cvl(cvo.rZ, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, buf.d($$5));
         $$2.a($$4, dyx.M, $$3);
         $$4.b(awn.c.b(cvo.rW));
         return brk.a;
      }
   }
}
