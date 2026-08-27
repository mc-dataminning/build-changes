import java.util.EnumSet;

public class bsw extends bsg {
   private final bln a;
   private bll b;
   private int c;

   public bsw(bln $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bsg.a.a, bsg.a.b));
   }

   @Override
   public boolean a() {
      bll $$0 = this.a.q();
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
      double $$0 = (double)(this.a.dh() * 2.0F * this.a.dh() * 2.0F);
      double $$1 = this.a.i(this.b.ds(), this.b.du(), this.b.dy());
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
            this.a.C(this.b);
         }
      }
   }
}
