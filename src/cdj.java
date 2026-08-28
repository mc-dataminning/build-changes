import java.util.EnumSet;

public class cdj extends cdy {
   private final bxk a;

   public cdj(bxk $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cdy.a.a, cdy.a.b));
   }

   @Override
   public boolean b() {
      return this.a.ct() < 140;
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public boolean P_() {
      return false;
   }

   @Override
   public void d() {
      this.h();
   }

   private void h() {
      Iterable<iu> $$0 = iu.b(
         azm.a(this.a.dA() - 1.0), this.a.dB(), azm.a(this.a.dG() - 1.0), azm.a(this.a.dA() + 1.0), azm.a(this.a.dC() + 8.0), azm.a(this.a.dG() + 1.0)
      );
      iu $$1 = null;

      for (iu $$2 : $$0) {
         if (this.a(this.a.dV(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = iu.a(this.a.dA(), this.a.dC() + 8.0, this.a.dG());
      }

      this.a.O().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new fei((double)this.a.bg, (double)this.a.bh, (double)this.a.bi));
      this.a.a(bxg.a, this.a.dy());
   }

   private boolean a(diy $$0, iu $$1) {
      dzz $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dmc.nG)) && $$2.a(ewv.a);
   }
}
