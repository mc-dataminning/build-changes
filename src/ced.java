import java.util.EnumSet;

public class ced extends cdn {
   private final bwt a;
   private bwr b;
   private int c;

   public ced(bwt $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cdn.a.a, cdn.a.b));
   }

   @Override
   public boolean b() {
      bwr $$0 = this.a.f();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean c() {
      if (!this.b.bK()) {
         return false;
      } else {
         return this.a.g(this.b) > 225.0 ? false : !this.a.O().k() || this.b();
      }
   }

   @Override
   public void e() {
      this.b = null;
      this.a.O().m();
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void a() {
      this.a.J().a(this.b, 30.0F, 30.0F);
      double $$0 = (double)(this.a.dq() * 2.0F * this.a.dq() * 2.0F);
      double $$1 = this.a.i(this.b.dA(), this.b.dC(), this.b.dG());
      double $$2 = 0.8;
      if ($$1 > $$0 && $$1 < 16.0) {
         $$2 = 1.33;
      } else if ($$1 < 225.0) {
         $$2 = 0.6;
      }

      this.a.O().a(this.b, $$2);
      this.c = Math.max(this.c - 1, 0);
      if (!($$1 > $$0)) {
         if (this.c <= 0) {
            this.c = 20;
            this.a.c(a(this.a), this.b);
         }
      }
   }
}
