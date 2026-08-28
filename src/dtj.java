import com.mojang.serialization.MapCodec;

public class dtj extends dne {
   public static final MapCodec<dtj> a = b(dtj::new);

   @Override
   public MapCodec<dtj> a() {
      return a;
   }

   protected dtj(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      if (!$$0.a(dae.td)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return but.a;
      } else {
         jc $$7 = $$6.c();
         jc $$8 = $$7.o() == jc.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, awr.vK, aws.e, 1.0F, 1.0F);
         $$2.a($$3, dng.ev.m().b(doa.b, $$8), 11);
         coe $$9 = new coe(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new daa(dae.tg, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bxw.d($$5));
         $$2.a($$4, egg.M, $$3);
         $$4.b(axb.c.b(dae.td));
         return but.a;
      }
   }
}
