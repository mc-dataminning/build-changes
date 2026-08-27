import javax.annotation.Nullable;

public abstract class bxd extends bwc {
   protected static final aby<Boolean> b = acb.a(bxd.class, aca.k);
   protected static final int c = 300;
   protected static final float d = 1.79F;
   protected int e;

   public bxd(bfn<? extends bxd> $$0, cmm $$1) {
      super($$0, $$1);
      this.s(true);
      this.w();
      this.a(dxp.n, 16.0F);
      this.a(dxp.o, -1.0F);
   }

   private void w() {
      if (bqr.a(this)) {
         ((bpi)this.J()).b(true);
      }
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return 1.79F;
   }

   protected abstract boolean q();

   public void w(boolean $$0) {
      this.aj().b(b, $$0);
   }

   protected boolean r() {
      return this.aj().b(b);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(b, false);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.r()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.e);
   }

   @Override
   public double bw() {
      return this.h_() ? -0.05 : -0.45;
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.e = $$0.h("TimeInOverworld");
   }

   @Override
   protected void W() {
      super.W();
      if (this.fY()) {
         this.e++;
      } else {
         this.e = 0;
      }

      if (this.e > 300) {
         this.gc();
         this.c((aif)this.dI());
      }
   }

   public boolean fY() {
      return !this.dI().x_().b() && !this.r() && !this.fQ();
   }

   protected void c(aif $$0) {
      bwx $$1 = this.a(bfn.bs, true);
      if ($$1 != null) {
         $$1.b(new bfa(bfc.i, 200, 0));
      }
   }

   public boolean fZ() {
      return !this.h_();
   }

   public abstract bxg ga();

   @Nullable
   @Override
   public bfz j() {
      return this.bA.c(bpb.o).orElse(null);
   }

   protected boolean gb() {
      return this.eO().d() instanceof chn;
   }

   @Override
   public void N() {
      if (bxf.d(this)) {
         super.N();
      }
   }

   @Override
   protected void V() {
      super.V();
      za.a(this);
   }

   protected abstract void gc();
}
