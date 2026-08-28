import java.util.EnumSet;

public class bzx extends cax {
   private final cff g;

   public bzx(cff $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(cak.a.c, cak.a.a));
   }

   @Override
   public boolean b() {
      return this.g.s() && !this.g.gm() && !this.g.gy() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.x(false);
   }

   @Override
   protected int a(btu $$0) {
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
      } else if (!this.g.gy()) {
         this.g.z(true);
      }
   }

   @Override
   protected boolean a(dcx $$0, jd $$1) {
      return $$0.u($$1.c()) && $$0.a_($$1).a(awd.R);
   }
}
