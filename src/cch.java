import java.util.EnumSet;

public class cch extends ccw {
   private final bwg a;

   public cch(bwg $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccw.a.a, ccw.a.b));
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
   public boolean P_() {
      return false;
   }

   @Override
   public void d() {
      this.h();
   }

   private void h() {
      Iterable<ji> $$0 = ji.b(
         ayz.a(this.a.dz() - 1.0), this.a.dA(), ayz.a(this.a.dF() - 1.0), ayz.a(this.a.dz() + 1.0), ayz.a(this.a.dB() + 8.0), ayz.a(this.a.dF() + 1.0)
      );
      ji $$1 = null;

      for (ji $$2 : $$0) {
         if (this.a(this.a.dU(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = ji.a(this.a.dz(), this.a.dB() + 8.0, this.a.dF());
      }

      this.a.O().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new fbx((double)this.a.bg, (double)this.a.bh, (double)this.a.bi));
      this.a.a(bwc.a, this.a.dx());
   }

   private boolean a(dhc $$0, ji $$1) {
      dxq $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dkg.nF)) && $$2.a(eul.a);
   }
}
