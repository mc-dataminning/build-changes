import java.util.EnumSet;

public class ced extends cfd {
   private final cjn g;

   public ced(cjn $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(ceq.a.c, ceq.a.a));
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.gu() && !this.g.gH() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.x(false);
   }

   @Override
   protected int a(byc $$0) {
      return 40;
   }

   @Override
   public void e() {
      super.e();
      this.g.z(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.x(false);
      if (!this.m()) {
         this.g.z(false);
      } else if (!this.g.gH()) {
         this.g.z(true);
      }
   }

   @Override
   protected boolean a(dka $$0, iv $$1) {
      return $$0.v($$1.d()) && $$0.a_($$1).a(axe.T);
   }
}
