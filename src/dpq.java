import com.mojang.serialization.MapCodec;

public class dpq extends djn {
   public static final MapCodec<dpq> a = b(dpq::new);

   @Override
   public MapCodec<dpq> a() {
      return a;
   }

   protected dpq(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      if (!$$0.a(cwu.sS)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bsl.a;
      } else {
         jn $$7 = $$6.c();
         jn $$8 = $$7.o() == jn.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, awa.vw, awb.e, 1.0F, 1.0F);
         $$2.a($$3, djp.er.m().b(dki.b, $$8), 11);
         cld $$9 = new cld(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cwq(cwu.sV, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bvi.d($$5));
         $$2.a($$4, ebu.M, $$3);
         $$4.b(awk.c.b(cwu.sS));
         return bsl.a;
      }
   }
}
