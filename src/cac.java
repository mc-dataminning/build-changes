import java.util.EnumSet;

public class cac extends bzm {
   private final bsq a;
   private bso b;
   private int c;

   public cac(bsq $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzm.a.a, bzm.a.b));
   }

   @Override
   public boolean a() {
      bso $$0 = this.a.p();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean b() {
      if (!this.b.bD()) {
         return false;
      } else {
         return this.a.g(this.b) > 225.0 ? false : !this.a.K().l() || this.a();
      }
   }

   @Override
   public void d() {
      this.b = null;
      this.a.K().n();
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      this.a.G().a(this.b, 30.0F, 30.0F);
      double $$0 = (double)(this.a.dj() * 2.0F * this.a.dj() * 2.0F);
      double $$1 = this.a.i(this.b.du(), this.b.dw(), this.b.dA());
      double $$2 = 0.8;
      if ($$1 > $$0 && $$1 < 16.0) {
         $$2 = 1.33;
      } else if ($$1 < 225.0) {
         $$2 = 0.6;
      }

      this.a.K().a(this.b, $$2);
      this.c = Math.max(this.c - 1, 0);
      if (!($$1 > $$0)) {
         if (this.c <= 0) {
            this.c = 20;
            this.a.C(this.b);
         }
      }
   }
}
