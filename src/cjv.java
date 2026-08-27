import javax.annotation.Nullable;

public class cjv extends cik {
   public cjv(bsb<? extends cjv> $$0, dca $$1) {
      super($$0, $$1);
      this.a(epv.i, 8.0F);
   }

   @Override
   protected void y() {
      this.cc.a(3, new cbe<>(this, ckn.class, true));
      super.y();
   }

   @Override
   protected avn u() {
      return avo.CX;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.CZ;
   }

   @Override
   protected avn n_() {
      return avo.CY;
   }

   @Override
   avn t() {
      return avo.Da;
   }

   @Override
   protected void a(bqt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cio $$4 && $$4.gz()) {
         $$4.gA();
         this.a((dbz)cuk.vX);
      }
   }

   @Override
   protected void a(ayt $$0, bpy $$1) {
      this.a(bsc.a, new cuh(cuk.qj));
   }

   @Override
   protected void b(ayt $$0, bpy $$1) {
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      btg $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(btv.c).a(4.0);
      this.x();
      return $$4;
   }

   @Override
   public boolean C(brv $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bso) {
            ((bso)$$0).b(new brh(brj.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cme b(cuh $$0, float $$1) {
      cme $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(brh $$0) {
      return $$0.a(brj.t) ? false : super.c($$0);
   }
}
