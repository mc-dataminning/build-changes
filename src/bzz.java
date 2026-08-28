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
   public boolean a() {
      return this.g.s() && !this.g.gq() && !this.g.gy() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.x(false);
   }

   @Override
   protected int a(btx $$0) {
      return 40;
   }

   @Override
   public void d() {
      super.d();
      this.g.z(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.x(false);
      if (!this.m()) {
         this.g.z(false);
      } else if (!this.g.gy()) {
         this.g.z(true);
      }
   }

   @Override
   protected boolean a(dca $$0, iz $$1) {
      return $$0.u($$1.c()) && $$0.a_($$1).a(awo.R);
   }
}
