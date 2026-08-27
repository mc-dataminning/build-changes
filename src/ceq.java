public class ceq extends cfa {
   public ceq(bnw<? extends ceq> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public static bpo.a u() {
      return cer.gm().a(bpp.o, 0.2F);
   }

   public static boolean b(bnw<ceq> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return $$1.aj() != blt.a;
   }

   @Override
   public boolean a(cvu $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(bpp.a).a((double)($$0 * 3));
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Override
   protected jx w() {
      return jz.E;
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   protected int A() {
      return super.A() * 4;
   }

   @Override
   protected void gc() {
      this.d *= 0.9F;
   }

   @Override
   protected void fb() {
      enz $$0 = this.dp();
      float $$1 = (float)this.gh() * 0.1F;
      this.o($$0.c, (double)(this.eZ() + $$1), $$0.e);
      this.at = true;
   }

   @Override
   protected void c(aup<egv> $$0) {
      if ($$0 == auf.b) {
         enz $$1 = this.dp();
         this.o($$1.c, (double)(0.22F + (float)this.gh() * 0.05F), $$1.e);
         this.at = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gd() {
      return this.cY();
   }

   @Override
   protected float ge() {
      return super.ge() + 2.0F;
   }

   @Override
   protected atk d(bmp $$0) {
      return this.gi() ? atl.nS : atl.nR;
   }

   @Override
   protected atk n_() {
      return this.gi() ? atl.nJ : atl.nQ;
   }

   @Override
   protected atk gf() {
      return this.gi() ? atl.nV : atl.nU;
   }

   @Override
   protected atk gg() {
      return atl.nT;
   }
}
