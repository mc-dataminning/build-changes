import java.util.EnumSet;

public class cbr extends ccr {
   private final cha g;

   public cbr(cha $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(cce.a.c, cce.a.a));
   }

   @Override
   public boolean b() {
      return this.g.p() && !this.g.gp() && !this.g.gC() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   protected int a(bvo $$0) {
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
      } else if (!this.g.gC()) {
         this.g.A(true);
      }
   }

   @Override
   protected boolean a(dgl $$0, ji $$1) {
      return $$0.u($$1.d()) && $$0.a_($$1).a(awp.T);
   }
}
