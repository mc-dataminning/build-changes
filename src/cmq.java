import javax.annotation.Nullable;

public class cmq extends cms {
   public static final ajy<Boolean> b = akc.a(cmq.class, aka.k);
   public static final ajy<Float> c = akc.a(cmq.class, aka.d);
   private static final float d = 100.0F;
   private static final double e = 5.0;

   public cmq(bsb<? extends cmq> $$0, dca $$1) {
      super($$0, $$1);
      this.ay = true;
   }

   public cmq(dca $$0, cly $$1) {
      this(bsb.bG, $$0);
      this.c($$1);
      this.a_($$1.dz(), $$1.dD() - 0.1, $$1.dF());
      this.g($$1.f(1.0F).a(5.0));
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(b, false);
      $$0.a(c, 0.0F);
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
   }

   @Override
   public void l() {
      super.l();
      cly $$0 = this.u();
      if ($$0 != null && (this.dU().x_() || !this.a($$0))) {
         ews $$1 = cmu.a(this, this::b);
         if ($$1.c() != ews.a.a) {
            this.a($$1);
         }

         this.b($$1.e());
         this.aW();
      } else {
         this.ao();
      }
   }

   private boolean a(cly $$0) {
      if (!$$0.dP() && $$0.bI() && $$0.b(cuk.Ar) && !(this.g($$0) > 10000.0)) {
         return false;
      } else {
         this.ao();
         return true;
      }
   }

   @Override
   protected boolean b(brv $$0) {
      return false;
   }

   @Override
   protected void a(ewq $$0) {
      super.a($$0);
      this.g(ewu.b);
      this.a(true);
      cly $$1 = this.u();
      if ($$1 != null) {
         double $$2 = $$1.bC().d($$0.e()).f();
         this.a(Math.max((float)$$2 * 0.5F - 3.0F, 1.5F));
      }
   }

   @Override
   public void b(uk $$0) {
      $$0.a("in_block", this.p());
      $$0.a("length", this.r());
   }

   @Override
   public void a(uk $$0) {
      this.a($$0.q("in_block"));
      this.a($$0.j("length"));
   }

   private void a(boolean $$0) {
      this.ap().a(b, $$0);
   }

   private void a(float $$0) {
      this.ap().a(c, $$0);
   }

   public boolean p() {
      return this.ap().a(b);
   }

   public float r() {
      return this.ap().a(c);
   }

   @Override
   protected brv.c bf() {
      return brv.c.a;
   }

   @Override
   public void a(brv.d $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void aq() {
      this.a(null);
   }

   @Override
   public void c(@Nullable brv $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cmq $$0) {
      cly $$1 = this.u();
      if ($$1 != null) {
         $$1.cK = $$0;
      }
   }

   @Nullable
   public cly u() {
      brv $$0 = this.t();
      return $$0 instanceof cly ? (cly)$$0 : null;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public zl<abw> dq() {
      brv $$0 = this.t();
      return new abx(this, $$0 == null ? this.al() : $$0.al());
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      if (this.u() == null) {
         this.an();
      }
   }
}
