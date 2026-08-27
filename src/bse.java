import java.util.EnumSet;

public class bse extends bte {
   private final bxl g;

   public bse(bxl $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(bsr.a.c, bsr.a.a));
   }

   @Override
   public boolean a() {
      return this.g.u() && !this.g.ge() && !this.g.gm() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.y(false);
   }

   @Override
   protected int a(bme $$0) {
      return 40;
   }

   @Override
   public void d() {
      super.d();
      this.g.A(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.y(false);
      if (!this.m()) {
         this.g.A(false);
      } else if (!this.g.gm()) {
         this.g.A(true);
      }
   }

   @Override
   protected boolean a(ctb $$0, hv $$1) {
      return $$0.t($$1.c()) && $$0.a_($$1).a(arr.R);
   }
}
