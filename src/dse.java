import com.mojang.serialization.MapCodec;

public class dse extends dma {
   public static final MapCodec<dse> a = b(dse::new);

   @Override
   public MapCodec<dse> a() {
      return a;
   }

   protected dse(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      if (!$$0.a(czc.sY)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bub.a;
      } else {
         ja $$7 = $$6.c();
         ja $$8 = $$7.o() == ja.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, awn.vH, awo.e, 1.0F, 1.0F);
         $$2.a($$3, dmc.es.m().b(dmv.b, $$8), 11);
         cnd $$9 = new cnd(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cyy(czc.tb, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bxc.d($$5));
         $$2.a($$4, eez.M, $$3);
         $$4.b(awx.c.b(czc.sY));
         return bub.a;
      }
   }
}
