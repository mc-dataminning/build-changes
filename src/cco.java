import java.util.EnumSet;

public class cco extends cdd {
   private final bwn a;

   public cco(bwn $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cdd.a.a, cdd.a.b));
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
      Iterable<jh> $$0 = jh.b(
         bae.a(this.a.dA() - 1.0), this.a.dB(), bae.a(this.a.dG() - 1.0), bae.a(this.a.dA() + 1.0), bae.a(this.a.dC() + 8.0), bae.a(this.a.dG() + 1.0)
      );
      jh $$1 = null;

      for (jh $$2 : $$0) {
         if (this.a(this.a.dV(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = jh.a(this.a.dA(), this.a.dC() + 8.0, this.a.dG());
      }

      this.a.L().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new fbx((double)this.a.bo, (double)this.a.bp, (double)this.a.bq));
      this.a.a(bwj.a, this.a.dy());
   }

   private boolean a(dhk $$0, jh $$1) {
      dxu $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dkn.ny)) && $$2.a(eul.a);
   }
}
