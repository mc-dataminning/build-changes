import com.mojang.serialization.MapCodec;

public class dsw extends dmr {
   public static final MapCodec<dsw> a = b(dsw::new);

   @Override
   public MapCodec<dsw> a() {
      return a;
   }

   protected dsw(eas.d $$0) {
      super($$0);
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      if (!$$0.a(czr.td)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bug.a;
      } else {
         jb $$7 = $$6.c();
         jb $$8 = $$7.o() == jb.a.b ? $$4.cN().g() : $$7;
         $$2.a(null, $$3, awn.vK, awo.e, 1.0F, 1.0F);
         $$2.a($$3, dmt.ev.m().b(dnn.b, $$8), 11);
         cnr $$9 = new cnr(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new czn(czr.tg, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bxj.d($$5));
         $$2.a($$4, eft.M, $$3);
         $$4.b(awx.c.b(czr.td));
         return bug.a;
      }
   }
}
