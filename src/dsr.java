import com.mojang.serialization.MapCodec;

public class dsr extends dmm {
   public static final MapCodec<dsr> a = b(dsr::new);

   @Override
   public MapCodec<dsr> a() {
      return a;
   }

   protected dsr(ean.d $$0) {
      super($$0);
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      if (!$$0.a(czo.td)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bug.a;
      } else {
         jb $$7 = $$6.c();
         jb $$8 = $$7.o() == jb.a.b ? $$4.cN().g() : $$7;
         $$2.a(null, $$3, awn.vK, awo.e, 1.0F, 1.0F);
         $$2.a($$3, dmo.ev.m().b(dni.b, $$8), 11);
         cno $$9 = new cno(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new czk(czo.tg, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bxj.d($$5));
         $$2.a($$4, efo.M, $$3);
         $$4.b(awx.c.b(czo.td));
         return bug.a;
      }
   }
}
