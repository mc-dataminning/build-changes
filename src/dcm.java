import com.mojang.serialization.MapCodec;

public class dcm extends cwp {
   public static final MapCodec<dcm> a = b(dcm::new);

   @Override
   public MapCodec<dcm> a() {
      return a;
   }

   protected dcm(djf.d $$0) {
      super($$0);
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      cmx $$6 = $$3.b($$4);
      if ($$6.a(cna.rS)) {
         if (!$$1.B) {
            ic $$7 = $$5.b();
            ic $$8 = $$7.o() == ic.a.b ? $$3.cE().g() : $$7;
            $$1.a(null, $$2, arr.tZ, ars.e, 1.0F, 1.0F);
            $$1.a($$2, cwr.ee.o().a(cxj.b, $$8), 11);
            cbt $$9 = new cbt(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new cmx(cna.rV, 4)
            );
            $$9.o(0.05 * (double)$$8.j() + $$1.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.z.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, dnq.M, $$2);
            $$3.b(asb.c.b(cna.rS));
         }

         return bka.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
