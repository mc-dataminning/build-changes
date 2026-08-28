import java.util.EnumSet;

public class cbo extends ccd {
   private final bvn a;

   public cbo(bvn $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccd.a.a, ccd.a.b));
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
   public boolean U_() {
      return false;
   }

   @Override
   public void d() {
      this.h();
   }

   private void h() {
      Iterable<ji> $$0 = ji.b(
         ayy.a(this.a.dB() - 1.0), this.a.dC(), ayy.a(this.a.dH() - 1.0), ayy.a(this.a.dB() + 1.0), ayy.a(this.a.dD() + 8.0), ayy.a(this.a.dH() + 1.0)
      );
      ji $$1 = null;

      for (ji $$2 : $$0) {
         if (this.a(this.a.dW(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = ji.a(this.a.dB(), this.a.dD() + 8.0, this.a.dH());
      }

      this.a.L().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new fay((double)this.a.bn, (double)this.a.bo, (double)this.a.bp));
      this.a.a(bvj.a, this.a.dz());
   }

   private boolean a(dgj $$0, ji $$1) {
      dwv $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(djm.nF)) && $$2.a(etm.a);
   }
}
