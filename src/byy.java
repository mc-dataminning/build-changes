import java.util.EnumSet;

public class byy extends bzy {
   private final ceh g;

   public byy(ceh $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(bzl.a.c, bzl.a.a));
   }

   @Override
   public boolean a() {
      return this.g.r() && !this.g.gy() && !this.g.gG() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.x(false);
   }

   @Override
   protected int a(bsw $$0) {
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
      } else if (!this.g.gG()) {
         this.g.z(true);
      }
   }

   @Override
   protected boolean a(dcd $$0, ir $$1) {
      return $$0.u($$1.c()) && $$0.a_($$1).a(awe.R);
   }
}
