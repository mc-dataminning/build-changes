import java.util.EnumSet;

public class byz extends bzz {
   private final ceh g;

   public byz(ceh $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(bzm.a.c, bzm.a.a));
   }

   @Override
   public boolean a() {
      return this.g.s() && !this.g.gp() && !this.g.gx() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.x(false);
   }

   @Override
   protected int a(bsx $$0) {
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
   protected boolean a(dba $$0, io $$1) {
      return $$0.u($$1.c()) && $$0.a_($$1).a(avw.R);
   }
}
