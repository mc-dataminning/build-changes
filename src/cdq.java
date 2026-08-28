import java.util.EnumSet;

public class cdq extends cef {
   private final bxr a;

   public cdq(bxr $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cef.a.a, cef.a.b));
   }

   @Override
   public boolean b() {
      return this.a.cr() < 140;
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public boolean Q_() {
      return false;
   }

   @Override
   public void d() {
      this.h();
   }

   private void h() {
      Iterable<iv> $$0 = iv.b(
         azm.a(this.a.dz() - 1.0), this.a.dA(), azm.a(this.a.dF() - 1.0), azm.a(this.a.dz() + 1.0), azm.a(this.a.dB() + 8.0), azm.a(this.a.dF() + 1.0)
      );
      iv $$1 = null;

      for (iv $$2 : $$0) {
         if (this.a(this.a.dU(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = iv.a(this.a.dz(), this.a.dB() + 8.0, this.a.dF());
      }

      this.a.O().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new fex((double)this.a.bg, (double)this.a.bh, (double)this.a.bi));
      this.a.a(bxn.a, this.a.dx());
   }

   private boolean a(djk $$0, iv $$1) {
      eao $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dmo.nJ)) && $$2.a(exk.a);
   }
}
