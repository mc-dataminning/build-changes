import com.mojang.serialization.MapCodec;

public class dpo extends djl {
   public static final MapCodec<dpo> a = b(dpo::new);

   @Override
   public MapCodec<dpo> a() {
      return a;
   }

   protected dpo(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      if (!$$0.a(cws.sS)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bsj.a;
      } else {
         jn $$7 = $$6.c();
         jn $$8 = $$7.o() == jn.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, awa.vw, awb.e, 1.0F, 1.0F);
         $$2.a($$3, djn.er.m().b(dkg.b, $$8), 11);
         clb $$9 = new clb(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cwo(cws.sV, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bvg.d($$5));
         $$2.a($$4, ebs.M, $$3);
         $$4.b(awk.c.b(cws.sS));
         return bsj.a;
      }
   }
}
