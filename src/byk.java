import java.util.EnumSet;

public class byk extends bzk {
   private final cds g;

   public byk(cds $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(byx.a.c, byx.a.a));
   }

   @Override
   public boolean a() {
      return this.g.r() && !this.g.gp() && !this.g.gx() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.x(false);
   }

   @Override
   protected int a(bsi $$0) {
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
      } else if (!this.g.gx()) {
         this.g.z(true);
      }
   }

   @Override
   protected boolean a(dag $$0, in $$1) {
      return $$0.u($$1.c()) && $$0.a_($$1).a(avr.R);
   }
}
