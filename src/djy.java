import com.mojang.serialization.MapCodec;

public class djy extends dea {
   public static final MapCodec<djy> a = b(djy::new);

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   protected djy(drc.d $$0) {
      super($$0);
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      if (!$$0.a(ctt.rV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bpy.a($$2.B);
      } else {
         it $$7 = $$6.b();
         it $$8 = $$7.o() == it.a.b ? $$4.cH().g() : $$7;
         $$2.a(null, $$3, avi.uT, avj.e, 1.0F, 1.0F);
         $$2.a($$3, dec.ee.n().a(deu.b, $$8), 11);
         cii $$9 = new cii(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new ctq(ctt.rY, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bsq.d($$5));
         $$2.a($$4, dvw.M, $$3);
         $$4.b(avs.c.b(ctt.rV));
         return bpy.a($$2.B);
      }
   }
}
