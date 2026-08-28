import com.mojang.serialization.MapCodec;

public class dsk extends dmf {
   public static final MapCodec<dsk> a = b(dsk::new);

   @Override
   public MapCodec<dsk> a() {
      return a;
   }

   protected dsk(eag.d $$0) {
      super($$0);
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      if (!$$0.a(czh.td)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bud.a;
      } else {
         ja $$7 = $$6.c();
         ja $$8 = $$7.o() == ja.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, awn.vK, awo.e, 1.0F, 1.0F);
         $$2.a($$3, dmh.ev.m().b(dnb.b, $$8), 11);
         cnh $$9 = new cnh(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new czd(czh.tg, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bxe.d($$5));
         $$2.a($$4, efh.M, $$3);
         $$4.b(awx.c.b(czh.td));
         return bud.a;
      }
   }
}
