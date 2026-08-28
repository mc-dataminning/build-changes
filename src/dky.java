import com.mojang.serialization.MapCodec;

public class dky extends dfa {
   public static final MapCodec<dky> a = b(dky::new);

   @Override
   public MapCodec<dky> a() {
      return a;
   }

   protected dky(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      if (!$$0.a(cut.rV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bqx.a($$2.B);
      } else {
         je $$7 = $$6.b();
         je $$8 = $$7.o() == je.a.b ? $$4.cH().g() : $$7;
         $$2.a(null, $$3, awa.uT, awb.e, 1.0F, 1.0F);
         $$2.a($$3, dfc.ee.o().a(dfu.b, $$8), 11);
         cji $$9 = new cji(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cuq(cut.rY, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, btq.d($$5));
         $$2.a($$4, dww.M, $$3);
         $$4.b(awk.c.b(cut.rV));
         return bqx.a($$2.B);
      }
   }
}
