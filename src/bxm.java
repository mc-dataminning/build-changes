import java.util.EnumSet;

public class bxm extends byb {
   private final brm a;

   public bxm(brm $$0) {
      this.a = $$0;
      this.a(EnumSet.of(byb.a.a, byb.a.b));
   }

   @Override
   public boolean a() {
      return this.a.cj() < 140;
   }

   @Override
   public boolean b() {
      return this.a();
   }

   @Override
   public boolean Q_() {
      return false;
   }

   @Override
   public void c() {
      this.h();
   }

   private void h() {
      Iterable<im> $$0 = im.b(
         axw.a(this.a.ds() - 1.0), this.a.dt(), axw.a(this.a.dy() - 1.0), axw.a(this.a.ds() + 1.0), axw.a(this.a.du() + 8.0), axw.a(this.a.dy() + 1.0)
      );
      im $$1 = null;

      for (im $$2 : $$0) {
         if (this.a(this.a.dN(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = im.a(this.a.ds(), this.a.du() + 8.0, this.a.dy());
      }

      this.a.K().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new etf((double)this.a.bp, (double)this.a.bq, (double)this.a.br));
      this.a.a(brj.a, this.a.dq());
   }

   private boolean a(czx $$0, im $$1) {
      dpy $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dcx.nd)) && $$2.a(emg.a);
   }
}
