import com.mojang.serialization.MapCodec;

public class drx extends dlu {
   public static final MapCodec<drx> a = b(drx::new);

   @Override
   public MapCodec<drx> a() {
      return a;
   }

   protected drx(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      if (!$$0.a(cyw.sW)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bty.a;
      } else {
         ja $$7 = $$6.c();
         ja $$8 = $$7.o() == ja.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, awl.vG, awm.e, 1.0F, 1.0F);
         $$2.a($$3, dlw.er.m().b(dmp.b, $$8), 11);
         cmx $$9 = new cmx(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cys(cyw.sZ, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bwz.d($$5));
         $$2.a($$4, eeo.M, $$3);
         $$4.b(awv.c.b(cyw.sW));
         return bty.a;
      }
   }
}
