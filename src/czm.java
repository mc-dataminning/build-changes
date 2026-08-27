import com.mojang.serialization.MapCodec;

public class czm extends cwk {
   public static final MapCodec<czm> a = b(czm::new);
   protected static final emv b = cwy.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<czm> a() {
      return a;
   }

   protected czm(djo.d $$0) {
      super($$0);
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dit($$0, $$1);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if ($$1 instanceof ane && $$3.ct() && ems.c(ems.a($$3.cH().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), emg.i)) {
         ahg<ctx> $$4 = $$1.ae() == ctx.j ? ctx.h : ctx.j;
         ane $$5 = ((ane)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(jx.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return cng.f;
   }

   @Override
   public boolean a(djp $$0, eey $$1) {
      return false;
   }
}
