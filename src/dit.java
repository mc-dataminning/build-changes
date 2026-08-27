import com.mojang.serialization.MapCodec;

public class dit extends dcv {
   public static final MapCodec<dit> a = b(dit::new);

   @Override
   public MapCodec<dit> a() {
      return a;
   }

   protected dit(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      if (!$$0.a(csg.rV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bos.a($$2.B);
      } else {
         ir $$7 = $$6.b();
         ir $$8 = $$7.o() == ir.a.b ? $$4.cF().g() : $$7;
         $$2.a(null, $$3, auz.uH, ava.e, 1.0F, 1.0F);
         $$2.a($$3, dcx.ee.n().a(ddp.b, $$8), 11);
         cgv $$9 = new cgv(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new csd(csg.rY, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bre.d($$5));
         $$2.a($$4, dur.M, $$3);
         $$4.b(avj.c.b(csg.rV));
         return bos.a($$2.B);
      }
   }
}
