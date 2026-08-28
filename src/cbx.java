import java.util.EnumSet;

public class cbx extends cbh {
   private final bum a;
   private buk b;
   private int c;

   public cbx(bum $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbh.a.a, cbh.a.b));
   }

   @Override
   public boolean b() {
      buk $$0 = this.a.m();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean c() {
      if (!this.b.bI()) {
         return false;
      } else {
         return this.a.g(this.b) > 225.0 ? false : !this.a.P().m() || this.b();
      }
   }

   @Override
   public void e() {
      this.b = null;
      this.a.P().o();
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void a() {
      this.a.K().a(this.b, 30.0F, 30.0F);
      double $$0 = (double)(this.a.dn() * 2.0F * this.a.dn() * 2.0F);
      double $$1 = this.a.i(this.b.dx(), this.b.dz(), this.b.dD());
      double $$2 = 0.8;
      if ($$1 > $$0 && $$1 < 16.0) {
         $$2 = 1.33;
      } else if ($$1 < 225.0) {
         $$2 = 0.6;
      }

      this.a.P().a(this.b, $$2);
      this.c = Math.max(this.c - 1, 0);
      if (!($$1 > $$0)) {
         if (this.c <= 0) {
            this.c = 20;
            this.a.E(this.b);
         }
      }
   }
}
