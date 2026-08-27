import java.util.EnumSet;

public class bqr extends bqb {
   private final bji a;
   private bjg b;
   private int c;

   public bqr(bji $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bqb.a.a, bqb.a.b));
   }

   @Override
   public boolean a() {
      bjg $$0 = this.a.q();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean b() {
      if (!this.b.bw()) {
         return false;
      } else {
         return this.a.f(this.b) > 225.0 ? false : !this.a.L().l() || this.a();
      }
   }

   @Override
   public void d() {
      this.b = null;
      this.a.L().n();
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void e() {
      this.a.G().a(this.b, 30.0F, 30.0F);
      double $$0 = (double)(this.a.dg() * 2.0F * this.a.dg() * 2.0F);
      double $$1 = this.a.i(this.b.dq(), this.b.ds(), this.b.dw());
      double $$2 = 0.8;
      if ($$1 > $$0 && $$1 < 16.0) {
         $$2 = 1.33;
      } else if ($$1 < 225.0) {
         $$2 = 0.6;
      }

      this.a.L().a(this.b, $$2);
      this.c = Math.max(this.c - 1, 0);
      if (!($$1 > $$0)) {
         if (this.c <= 0) {
            this.c = 20;
            this.a.C(this.b);
         }
      }
   }
}
