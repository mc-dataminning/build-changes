import java.util.EnumSet;

public class cdt extends cdd {
   private final bwh a;
   private bwf b;
   private int c;

   public cdt(bwh $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cdd.a.a, cdd.a.b));
   }

   @Override
   public boolean b() {
      bwf $$0 = this.a.O_();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean c() {
      if (!this.b.bL()) {
         return false;
      } else {
         return this.a.g(this.b) > 225.0 ? false : !this.a.L().m() || this.b();
      }
   }

   @Override
   public void e() {
      this.b = null;
      this.a.L().o();
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      this.a.H().a(this.b, 30.0F, 30.0F);
      double $$0 = (double)(this.a.dq() * 2.0F * this.a.dq() * 2.0F);
      double $$1 = this.a.i(this.b.dA(), this.b.dC(), this.b.dG());
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
            this.a.c(a(this.a), this.b);
         }
      }
   }
}
