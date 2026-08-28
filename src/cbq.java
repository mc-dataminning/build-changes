import java.util.EnumSet;

public class cbq extends ccq {
   private final cgz g;

   public cbq(cgz $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(ccd.a.c, ccd.a.a));
   }

   @Override
   public boolean b() {
      return this.g.p() && !this.g.gp() && !this.g.gC() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   protected int a(bvn $$0) {
      return 40;
   }

   @Override
   public void e() {
      super.e();
      this.g.A(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.y(false);
      if (!this.m()) {
         this.g.A(false);
      } else if (!this.g.gC()) {
         this.g.A(true);
      }
   }

   @Override
   protected boolean a(dgj $$0, ji $$1) {
      return $$0.u($$1.d()) && $$0.a_($$1).a(awo.T);
   }
}
