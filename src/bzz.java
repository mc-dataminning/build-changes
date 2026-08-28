import java.util.EnumSet;

public class bzz extends caz {
   private final cfh g;

   public bzz(cfh $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(cam.a.c, cam.a.a));
   }

   @Override
   public boolean b() {
      return this.g.s() && !this.g.gl() && !this.g.gx() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.x(false);
   }

   @Override
   protected int a(btw $$0) {
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
      } else if (!this.g.gx()) {
         this.g.z(true);
      }
   }

   @Override
   protected boolean a(dcz $$0, jd $$1) {
      return $$0.u($$1.d()) && $$0.a_($$1).a(awe.R);
   }
}
