import java.util.EnumSet;

public class caq extends caa {
   private final bte a;
   private btc b;
   private int c;

   public caq(bte $$0) {
      this.a = $$0;
      this.a(EnumSet.of(caa.a.a, caa.a.b));
   }

   @Override
   public boolean a() {
      btc $$0 = this.a.p();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean b() {
      if (!this.b.bF()) {
         return false;
      } else {
         return this.a.g((bsh)this.b) > 225.0 ? false : !this.a.J().l() || this.a();
      }
   }

   @Override
   public void d() {
      this.b = null;
      this.a.J().n();
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      this.a.F().a(this.b, 30.0F, 30.0F);
      double $$0 = (double)(this.a.dl() * 2.0F * this.a.dl() * 2.0F);
      double $$1 = this.a.i(this.b.dw(), this.b.dy(), this.b.dC());
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
            this.a.D(this.b);
         }
      }
   }
}
