import java.util.EnumSet;

public class cbp extends ccp {
   private final cgy g;

   public cbp(cgy $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(ccc.a.c, ccc.a.a));
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.gv() && !this.g.gI() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   protected int a(bvm $$0) {
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
      } else if (!this.g.gI()) {
         this.g.A(true);
      }
   }

   @Override
   protected boolean a(dfi $$0, jh $$1) {
      return $$0.u($$1.d()) && $$0.a_($$1).a(axd.S);
   }
}
