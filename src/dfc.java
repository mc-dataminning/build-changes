import com.mojang.serialization.MapCodec;

public class dfc extends czf {
   public static final MapCodec<dfc> a = b(dfc::new);

   @Override
   public MapCodec<dfc> a() {
      return a;
   }

   protected dfc(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      if (!$$0.a(cpt.rU)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bmn.a($$2.B);
      } else {
         ih $$7 = $$6.b();
         ih $$8 = $$7.o() == ih.a.b ? $$4.cB().g() : $$7;
         $$2.a(null, $$3, atp.up, atq.e, 1.0F, 1.0F);
         $$2.a($$3, czh.ee.o().a(czz.b, $$8), 11);
         cel $$9 = new cel(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cpq(cpt.rX, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, box.d($$5));
         $$2.a($$4, dqr.M, $$3);
         $$4.b(atz.c.b(cpt.rU));
         return bmn.a($$2.B);
      }
   }
}
