public class cem extends cew {
   public cem(bnu<? extends cem> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public static bpk.a u() {
      return cen.gm().a(bpl.o, 0.2F);
   }

   public static boolean b(bnu<cem> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return $$1.ak() != blr.a;
   }

   @Override
   public boolean a(cvq $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(bpl.a).a((double)($$0 * 3));
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
      ens $$0 = this.dp();
      float $$1 = (float)this.gh() * 0.1F;
      this.o($$0.c, (double)(this.eZ() + $$1), $$0.e);
      this.at = true;
   }

   @Override
   protected void c(auo<ego> $$0) {
      if ($$0 == aue.b) {
         ens $$1 = this.dp();
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
   protected atj d(bmn $$0) {
      return this.gi() ? atk.nR : atk.nQ;
   }

   @Override
   protected atj n_() {
      return this.gi() ? atk.nI : atk.nP;
   }

   @Override
   protected atj gf() {
      return this.gi() ? atk.nU : atk.nT;
   }

   @Override
   protected atj gg() {
      return atk.nS;
   }
}
