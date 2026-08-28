import com.mojang.serialization.MapCodec;

public class dtt extends dno {
   public static final MapCodec<dtt> a = b(dtt::new);

   @Override
   public MapCodec<dtt> a() {
      return a;
   }

   protected dtt(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      if (!$$0.a(dao.td)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bvc.a;
      } else {
         jc $$7 = $$6.c();
         jc $$8 = $$7.o() == jc.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, awy.vK, awz.e, 1.0F, 1.0F);
         $$2.a($$3, dnq.ev.m().b(dok.b, $$8), 11);
         coo $$9 = new coo(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new dak(dao.tg, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, byf.d($$5));
         $$2.a($$4, egq.M, $$3);
         $$4.b(axi.c.b(dao.td));
         return bvc.a;
      }
   }
}
