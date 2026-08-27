import com.mojang.serialization.MapCodec;

public class cwb extends cwy implements cxb {
   public static final MapCodec<cwb> a = b(cwb::new);
   protected static final float b = 4.0F;
   protected static final emv c = cwy.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<cwb> a() {
      return a;
   }

   public cwb(djo.d $$0) {
      super($$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      emc $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return $$1.a_($$2.d()).a(asi.at);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         return cxa.a.o();
      } else {
         if ($$1 == ic.b && $$2.a(cxa.mZ)) {
            $$3.a($$4, cxa.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return new cng(cnj.dQ);
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(djp $$0, cfq $$1, ctd $$2, hx $$3) {
      return $$1.eT().d() instanceof cos ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(ctx $$0, hx $$1) {
      $$0.a($$1.c(), cxa.mZ.o().a(cwc.i, dkb.b), 3);
   }
}
