import javax.annotation.Nullable;

public class cku extends cjl {
   public cku(bsx<? extends cku> $$0, dcw $$1) {
      super($$0, $$1);
      this.a(epv.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bV.a(3, new ccf<>(this, clm.class, true));
      super.B();
   }

   @Override
   protected avo v() {
      return avp.CD;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.CF;
   }

   @Override
   protected avo n_() {
      return avp.CE;
   }

   @Override
   avo t() {
      return avp.CG;
   }

   @Override
   protected void a(aqu $$0, brk $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cjp $$4 && $$4.gl()) {
         $$4.gm();
         this.a((dcv)cut.um);
      }
   }

   @Override
   protected void a(ayw $$0, bqp $$1) {
      this.a(bsy.a, new cuq(cut.oR));
   }

   @Override
   protected void a(ddl $$0, ayw $$1, bqp $$2) {
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      buh $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(buw.c).a(4.0);
      this.x();
      return $$4;
   }

   @Override
   public boolean D(bsr $$0) {
      if (!super.D($$0)) {
         return false;
      } else {
         if ($$0 instanceof btn) {
            ((btn)$$0).b(new brz(bsb.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cnd a(cuq $$0, float $$1, @Nullable cuq $$2) {
      cnd $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean c(brz $$0) {
      return $$0.a(bsb.t) ? false : super.c($$0);
   }
}
