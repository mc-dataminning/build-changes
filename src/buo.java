import java.util.EnumSet;

public class buo extends bvo {
   private final bzw g;

   public buo(bzw $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(bvb.a.c, bvb.a.a));
   }

   @Override
   public boolean a() {
      return this.g.u() && !this.g.gg() && !this.g.go() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.y(false);
   }

   @Override
   protected int a(boo $$0) {
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
      } else if (!this.g.go()) {
         this.g.A(true);
      }
   }

   @Override
   protected boolean a(cvq $$0, hz $$1) {
      return $$0.u($$1.c()) && $$0.a_($$1).a(atz.R);
   }
}
