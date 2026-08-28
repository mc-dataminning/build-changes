import java.util.EnumSet;

public class cdl extends cel {
   private final civ g;

   public cdl(civ $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(cdy.a.c, cdy.a.a));
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.gq() && !this.g.gD() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.x(false);
   }

   @Override
   protected int a(bxk $$0) {
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
      } else if (!this.g.gD()) {
         this.g.z(true);
      }
   }

   @Override
   protected boolean a(diy $$0, iu $$1) {
      return $$0.v($$1.d()) && $$0.a_($$1).a(axc.T);
   }
}
