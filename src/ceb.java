import java.util.EnumSet;

public class ceb extends ceq {
   private final byc a;

   public ceb(byc $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ceq.a.a, ceq.a.b));
   }

   @Override
   public boolean b() {
      return this.a.cs() < 140;
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public boolean U_() {
      return false;
   }

   @Override
   public void d() {
      this.h();
   }

   private void h() {
      Iterable<iv> $$0 = iv.b(
         azo.a(this.a.dA() - 1.0), this.a.dB(), azo.a(this.a.dG() - 1.0), azo.a(this.a.dA() + 1.0), azo.a(this.a.dC() + 8.0), azo.a(this.a.dG() + 1.0)
      );
      iv $$1 = null;

      for (iv $$2 : $$0) {
         if (this.a(this.a.dV(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = iv.a(this.a.dA(), this.a.dC() + 8.0, this.a.dG());
      }

      this.a.O().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new ffq((double)this.a.bg, (double)this.a.bh, (double)this.a.bi));
      this.a.a(bxy.a, this.a.dy());
   }

   private boolean a(dka $$0, iv $$1) {
      ebe $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dne.nJ)) && $$2.a(eyd.a);
   }
}
