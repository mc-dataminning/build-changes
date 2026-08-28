import java.util.EnumSet;

public class cda extends cea {
   private final cij g;

   public cda(cij $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(cdn.a.c, cdn.a.a));
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
   protected int a(bwz $$0) {
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
   protected boolean a(dhs $$0, jj $$1) {
      return $$0.u($$1.d()) && $$0.a_($$1).a(awz.T);
   }
}
