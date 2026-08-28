import java.util.EnumSet;

public class cci extends cdi {
   private final chr g;

   public cci(chr $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(ccv.a.c, ccv.a.a));
   }

   @Override
   public boolean b() {
      return this.g.p() && !this.g.go() && !this.g.gB() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   protected int a(bwf $$0) {
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
      } else if (!this.g.gB()) {
         this.g.A(true);
      }
   }

   @Override
   protected boolean a(dhc $$0, jh $$1) {
      return $$0.u($$1.d()) && $$0.a_($$1).a(axk.T);
   }
}
