import javax.annotation.Nullable;

public abstract class ckn extends cje {
   protected static final ajs<Boolean> b = ajw.a(ckn.class, aju.k);
   protected static final int c = 300;
   protected int d;

   public ckn(bsc<? extends ckn> $$0, daz $$1) {
      super($$0, $$1);
      this.a_(true);
      this.y();
      this.a(enn.n, 16.0F);
      this.a(enn.o, -1.0F);
   }

   private void y() {
      if (cdm.a(this)) {
         ((ccb)this.K()).b(true);
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
   protected void a(ajw.a $$0) {
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
         this.c((aqn)this.dP());
      }
   }

   public boolean gp() {
      return !this.dP().D_().b() && !this.u() && !this.gf();
   }

   protected void c(aqn $$0) {
      cjz $$1 = this.a(bsc.bx, true);
      if ($$1 != null) {
         $$1.b(new bre(brg.i, 200, 0));
      }
   }

   public boolean gq() {
      return !this.p_();
   }

   public abstract ckq gr();

   @Nullable
   @Override
   public bsq p() {
      return this.bD.c(cbu.o).orElse(null);
   }

   protected boolean gs() {
      return this.eX().g() instanceof cvg;
   }

   @Override
   public void P() {
      if (ckp.d(this)) {
         super.P();
      }
   }

   @Override
   protected void X() {
      super.X();
      agb.a(this);
   }

   protected abstract void gt();
}
