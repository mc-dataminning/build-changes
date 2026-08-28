import java.util.EnumSet;

public class cba extends cak {
   private final btn a;
   private btl b;
   private int c;

   public cba(btn $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cak.a.a, cak.a.b));
   }

   @Override
   public boolean b() {
      btl $$0 = this.a.p();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean c() {
      if (!this.b.bE()) {
         return false;
      } else {
         return this.a.g((bsq)this.b) > 225.0 ? false : !this.a.J().l() || this.b();
      }
   }

   @Override
   public void e() {
      this.b = null;
      this.a.J().n();
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void a() {
      this.a.F().a(this.b, 30.0F, 30.0F);
      double $$0 = (double)(this.a.dk() * 2.0F * this.a.dk() * 2.0F);
      double $$1 = this.a.i(this.b.dv(), this.b.dx(), this.b.dB());
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
