import java.util.EnumSet;

public class bmi extends bni {
   private final bro g;

   public bmi(bro $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(bmv.a.c, bmv.a.a));
   }

   @Override
   public boolean a() {
      return this.g.q() && !this.g.fY() && !this.g.gg() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.y(false);
   }

   @Override
   protected int a(bgi $$0) {
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
      } else if (!this.g.gg()) {
         this.g.A(true);
      }
   }

   @Override
   protected boolean a(cmp $$0, gu $$1) {
      return $$0.t($$1.c()) && $$0.a_($$1).a(amw.R);
   }
}
