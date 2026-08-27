import java.util.EnumSet;

public class bnl extends bmv {
   private final bgb a;
   private bfz b;
   private int c;

   public bnl(bgb $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bmv.a.a, bmv.a.b));
   }

   @Override
   public boolean a() {
      bfz $$0 = this.a.j();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean b() {
      if (!this.b.bs()) {
         return false;
      } else {
         return this.a.f(this.b) > 225.0 ? false : !this.a.J().l() || this.a();
      }
   }

   @Override
   public void d() {
      this.b = null;
      this.a.J().n();
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      this.a.E().a(this.b, 30.0F, 30.0F);
      double $$0 = (double)(this.a.dd() * 2.0F * this.a.dd() * 2.0F);
      double $$1 = this.a.i(this.b.dn(), this.b.dp(), this.b.dt());
      double $$2 = 0.8;
      if ($$1 > $$0 && $$1 < 16.0) {
         $$2 = 1.33;
      } else if ($$1 < 225.0) {
         $$2 = 0.6;
      }

      this.a.J().a(this.b, $$2);
      this.c = Math.max(this.c - 1, 0);
      if (!($$1 > $$0)) {
         if (this.c <= 0) {
            this.c = 20;
            this.a.z(this.b);
         }
      }
   }
}
