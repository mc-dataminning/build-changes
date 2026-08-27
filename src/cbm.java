import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class cbm extends cal {
   protected static final afc<Boolean> b = aff.a(cbm.class, afe.k);
   protected static final int c = 300;
   protected static final float d = 1.79F;
   protected int e;

   public cbm(bjx<? extends cbm> $$0, cqz $$1) {
      super($$0, $$1);
      this.s(true);
      this.y();
      this.a(ebp.n, 16.0F);
      this.a(ebp.o, -1.0F);
   }

   private void y() {
      if (bva.a(this)) {
         ((btr)this.L()).b(true);
      }
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return 1.79F;
   }

   @Override
   protected float l(bjt $$0) {
      return -0.7F;
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   protected abstract boolean s();

   public void w(boolean $$0) {
      this.al().b(b, $$0);
   }

   protected boolean t() {
      return this.al().b(b);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, false);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      if (this.t()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.e);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.e = $$0.h("TimeInOverworld");
   }

   @Override
   protected void X() {
      super.X();
      if (this.ge()) {
         this.e++;
      } else {
         this.e = 0;
      }

      if (this.e > 300) {
         this.gi();
         this.c((alq)this.dL());
      }
   }

   public boolean ge() {
      return !this.dL().D_().b() && !this.t() && !this.fU();
   }

   protected void c(alq $$0) {
      cbg $$1 = this.a(bjx.bs, true);
      if ($$1 != null) {
         $$1.b(new bjg(bji.i, 200, 0));
      }
   }

   public boolean gf() {
      return !this.n_();
   }

   public abstract cbp gg();

   @Nullable
   @Override
   public bkj q() {
      return this.bz.c(btk.o).orElse(null);
   }

   protected boolean gh() {
      return this.eS().d() instanceof clx;
   }

   @Override
   public void P() {
      if (cbo.d(this)) {
         super.P();
      }
   }

   @Override
   protected void W() {
      super.W();
      abz.a(this);
   }

   protected abstract void gi();
}
