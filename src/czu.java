import com.mojang.serialization.MapCodec;

public abstract class czu extends cwy implements czt {
   public czu(djo.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czu> a();

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (h($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cca $$4 = cca.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cca $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean h(djp $$0) {
      return $$0.i() || $$0.a(asi.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if ($$3.a(16) == 0) {
         hx $$4 = $$2.d();
         if (h($$1.a_($$4))) {
            aus.a($$1, $$2, $$3, new jp(jx.B, $$0));
         }
      }
   }

   public int b(djp $$0, ctd $$1, hx $$2) {
      return -16777216;
   }
}
