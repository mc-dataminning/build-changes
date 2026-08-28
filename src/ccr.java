import java.util.EnumSet;

public class ccr extends cdr {
   private final cia g;

   public ccr(cia $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(cde.a.c, cde.a.a));
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
   protected int a(bwo $$0) {
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
   protected boolean a(dhl $$0, jh $$1) {
      return $$0.u($$1.d()) && $$0.a_($$1).a(axu.T);
   }
}
