import java.util.EnumSet;

public class bvv extends bvf {
   private final bok a;
   private boi b;
   private int c;

   public bvv(bok $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bvf.a.a, bvf.a.b));
   }

   @Override
   public boolean a() {
      boi $$0 = this.a.q();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean b() {
      if (!this.b.bx()) {
         return false;
      } else {
         return this.a.f(this.b) > 225.0 ? false : !this.a.N().l() || this.a();
      }
   }

   @Override
   public void d() {
      this.b = null;
      this.a.N().n();
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      this.a.I().a(this.b, 30.0F, 30.0F);
      double $$0 = (double)(this.a.dg() * 2.0F * this.a.dg() * 2.0F);
      double $$1 = this.a.i(this.b.dr(), this.b.dt(), this.b.dx());
      double $$2 = 0.8;
      if ($$1 > $$0 && $$1 < 16.0) {
         $$2 = 1.33;
      } else if ($$1 < 225.0) {
         $$2 = 0.6;
      }

      this.a.N().a(this.b, $$2);
      this.c = Math.max(this.c - 1, 0);
      if (!($$1 > $$0)) {
         if (this.c <= 0) {
            this.c = 20;
            this.a.B(this.b);
         }
      }
   }
}
