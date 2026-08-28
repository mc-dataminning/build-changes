import java.util.EnumSet;

public class ced extends ces {
   private final bye a;

   public ced(bye $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ces.a.a, ces.a.b));
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
      Iterable<iw> $$0 = iw.b(
         azq.a(this.a.dA() - 1.0), this.a.dB(), azq.a(this.a.dG() - 1.0), azq.a(this.a.dA() + 1.0), azq.a(this.a.dC() + 8.0), azq.a(this.a.dG() + 1.0)
      );
      iw $$1 = null;

      for (iw $$2 : $$0) {
         if (this.a(this.a.dV(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = iw.a(this.a.dA(), this.a.dC() + 8.0, this.a.dG());
      }

      this.a.O().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new ffs((double)this.a.bg, (double)this.a.bh, (double)this.a.bi));
      this.a.a(bya.a, this.a.dy());
   }

   private boolean a(dkc $$0, iw $$1) {
      ebg $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dng.nJ)) && $$2.a(eyf.a);
   }
}
