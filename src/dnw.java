import com.mojang.serialization.MapCodec;

public class dnw extends dhy {
   public static final MapCodec<dnw> a = b(dnw::new);

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   protected dnw(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      if (!$$0.a(cwb.rW)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bry.a;
      } else {
         jl $$7 = $$6.c();
         jl $$8 = $$7.o() == jl.a.b ? $$4.cP().g() : $$7;
         $$2.a(null, $$3, awk.uV, awl.e, 1.0F, 1.0F);
         $$2.a($$3, dia.ee.m().b(dis.b, $$8), 11);
         ckq $$9 = new ckq(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cvx(cwb.rZ, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, buv.d($$5));
         $$2.a($$4, eaa.M, $$3);
         $$4.b(awu.c.b(cwb.rW));
         return bry.a;
      }
   }
}
