import java.util.EnumSet;

public class cfr extends cfb {
   private final byh a;
   private byf b;
   private int c;

   public cfr(byh $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cfb.a.a, cfb.a.b));
   }

   @Override
   public boolean b() {
      byf $$0 = this.a.e();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean c() {
      if (!this.b.bJ()) {
         return false;
      } else {
         return this.a.g((bxe)this.b) > 225.0 ? false : !this.a.N().k() || this.b();
      }
   }

   @Override
   public void e() {
      this.b = null;
      this.a.N().m();
   }

   @Override
   public boolean W_() {
      return true;
   }

   @Override
   public void a() {
      this.a.I().a(this.b, 30.0F, 30.0F);
      double $$0 = (double)(this.a.dq() * 2.0F * this.a.dq() * 2.0F);
      double $$1 = this.a.h(this.b.dA(), this.b.dC(), this.b.dG());
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
            this.a.c(a(this.a), this.b);
         }
      }
   }
}
