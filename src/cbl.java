import java.util.EnumSet;

public class cbl extends ccl {
   private final cgu g;

   public cbl(cgu $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(cby.a.c, cby.a.a));
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.gu() && !this.g.gH() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   protected int a(bvi $$0) {
      return 40;
   }

   @Override
   public void e() {
      super.e();
      this.g.A(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.y(false);
      if (!this.m()) {
         this.g.A(false);
      } else if (!this.g.gH()) {
         this.g.A(true);
      }
   }

   @Override
   protected boolean a(dfe $$0, jh $$1) {
      return $$0.u($$1.d()) && $$0.a_($$1).a(axa.S);
   }
}
