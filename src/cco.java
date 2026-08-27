import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class cco extends cbn {
   protected static final afs<Boolean> b = afv.a(cco.class, afu.k);
   protected static final int c = 300;
   protected static final float d = 1.79F;
   protected int e;

   public cco(bkz<? extends cco> $$0, csf $$1) {
      super($$0, $$1);
      this.s(true);
      this.A();
      this.a(edi.n, 16.0F);
      this.a(edi.o, -1.0F);
   }

   private void A() {
      if (bwc.a(this)) {
         ((but)this.N()).b(true);
      }
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return 1.79F;
   }

   @Override
   protected float l(bkv $$0) {
      return -0.7F;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected abstract boolean u();

   public void w(boolean $$0) {
      this.an().b(b, $$0);
   }

   protected boolean w() {
      return this.an().b(b);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      if (this.w()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.e);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.e = $$0.h("TimeInOverworld");
   }

   @Override
   protected void Z() {
      super.Z();
      if (this.gf()) {
         this.e++;
      } else {
         this.e = 0;
      }

      if (this.e > 300) {
         this.gj();
         this.c((ami)this.dN());
      }
   }

   public boolean gf() {
      return !this.dN().E_().b() && !this.w() && !this.fV();
   }

   protected void c(ami $$0) {
      cci $$1 = this.a(bkz.bs, true);
      if ($$1 != null) {
         $$1.b(new bki(bkk.i, 200, 0));
      }
   }

   public boolean gg() {
      return !this.o_();
   }

   public abstract ccr gh();

   @Nullable
   @Override
   public bll q() {
      return this.bz.c(bum.o).orElse(null);
   }

   protected boolean gi() {
      return this.eU().d() instanceof cnc;
   }

   @Override
   public void R() {
      if (ccq.d(this)) {
         super.R();
      }
   }

   @Override
   protected void Y() {
      super.Y();
      aco.a(this);
   }

   protected abstract void gj();
}
