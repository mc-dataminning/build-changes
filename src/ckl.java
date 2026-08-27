import javax.annotation.Nullable;

public abstract class ckl extends cjc {
   protected static final ajr<Boolean> b = ajv.a(ckl.class, ajt.k);
   protected static final int c = 300;
   protected int d;

   public ckl(bsa<? extends ckl> $$0, dax $$1) {
      super($$0, $$1);
      this.a_(true);
      this.y();
      this.a(enl.n, 16.0F);
      this.a(enl.o, -1.0F);
   }

   private void y() {
      if (cdk.a(this)) {
         ((cbz)this.K()).b(true);
      }
   }

   protected abstract boolean s();

   public void w(boolean $$0) {
      this.ap().a(b, $$0);
   }

   protected boolean u() {
      return this.ap().a(b);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      if (this.u()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void Y() {
      super.Y();
      if (this.gp()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gt();
         this.c((aqm)this.dP());
      }
   }

   public boolean gp() {
      return !this.dP().D_().b() && !this.u() && !this.gf();
   }

   protected void c(aqm $$0) {
      cjx $$1 = this.a(bsa.bx, true);
      if ($$1 != null) {
         $$1.b(new brc(bre.i, 200, 0));
      }
   }

   public boolean gq() {
      return !this.p_();
   }

   public abstract cko gr();

   @Nullable
   @Override
   public bso p() {
      return this.bE.c(cbs.o).orElse(null);
   }

   protected boolean gs() {
      return this.eX().g() instanceof cve;
   }

   @Override
   public void P() {
      if (ckn.d(this)) {
         super.P();
      }
   }

   @Override
   protected void X() {
      super.X();
      aga.a(this);
   }

   protected abstract void gt();
}
