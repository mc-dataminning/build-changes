import java.util.EnumSet;

public class ccg extends ccv {
   private final bwf a;

   public ccg(bwf $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccv.a.a, ccv.a.b));
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
         azu.a(this.a.dB() - 1.0), this.a.dC(), azu.a(this.a.dH() - 1.0), azu.a(this.a.dB() + 1.0), azu.a(this.a.dD() + 8.0), azu.a(this.a.dH() + 1.0)
      );
      jh $$1 = null;

      for (jh $$2 : $$0) {
         if (this.a(this.a.dW(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = jh.a(this.a.dB(), this.a.dD() + 8.0, this.a.dH());
      }

      this.a.L().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new fbr((double)this.a.bo, (double)this.a.bp, (double)this.a.bq));
      this.a.a(bwb.a, this.a.dz());
   }

   private boolean a(dhc $$0, jh $$1) {
      dxo $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dkf.nF)) && $$2.a(euf.a);
   }
}
