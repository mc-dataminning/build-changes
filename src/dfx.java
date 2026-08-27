import com.mojang.serialization.MapCodec;

public class dfx extends daa {
   public static final MapCodec<dfx> a = b(dfx::new);

   @Override
   public MapCodec<dfx> a() {
      return a;
   }

   protected dfx(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      if (!$$0.a(cqn.rU)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bne.a($$2.B);
      } else {
         ih $$7 = $$6.b();
         ih $$8 = $$7.o() == ih.a.b ? $$4.cE().g() : $$7;
         $$2.a(null, $$3, aty.us, atz.e, 1.0F, 1.0F);
         $$2.a($$3, dac.ee.o().a(dau.b, $$8), 11);
         cfd $$9 = new cfd(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cqk(cqn.rX, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bpo.d($$5));
         $$2.a($$4, drn.M, $$3);
         $$4.b(aui.c.b(cqn.rU));
         return bne.a($$2.B);
      }
   }
}
