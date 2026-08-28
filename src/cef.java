import java.util.EnumSet;

public class cef extends cff {
   private final cjp g;

   public cef(cjp $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(ces.a.c, ces.a.a));
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
   protected int a(bye $$0) {
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
   protected boolean a(dkc $$0, iw $$1) {
      return $$0.v($$1.d()) && $$0.a_($$1).a(axg.T);
   }
}
