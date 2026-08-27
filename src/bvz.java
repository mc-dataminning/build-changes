import java.util.EnumSet;

public class bvz extends bwz {
   private final cbh g;

   public bvz(cbh $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(bwm.a.c, bwm.a.a));
   }

   @Override
   public boolean a() {
      return this.g.r() && !this.g.gn() && !this.g.gv() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.x(false);
   }

   @Override
   protected int a(bpx $$0) {
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
      } else if (!this.g.gv()) {
         this.g.z(true);
      }
   }

   @Override
   protected boolean a(cxe $$0, ib $$1) {
      return $$0.u($$1.c()) && $$0.a_($$1).a(aun.R);
   }
}
