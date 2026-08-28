import java.util.EnumSet;

public class bzy extends can {
   private final bty a;

   public bzy(bty $$0) {
      this.a = $$0;
      this.a(EnumSet.of(can.a.a, can.a.b));
   }

   @Override
   public boolean a() {
      return this.a.cl() < 140;
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
      Iterable<iz> $$0 = iz.b(
         ayz.a(this.a.du() - 1.0), this.a.dv(), ayz.a(this.a.dA() - 1.0), ayz.a(this.a.du() + 1.0), ayz.a(this.a.dw() + 8.0), ayz.a(this.a.dA() + 1.0)
      );
      iz $$1 = null;

      for (iz $$2 : $$0) {
         if (this.a(this.a.dP(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = iz.a(this.a.du(), this.a.dw() + 8.0, this.a.dA());
      }

      this.a.K().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new evr((double)this.a.bo, (double)this.a.bp, (double)this.a.bq));
      this.a.a(btu.a, this.a.ds());
   }

   private boolean a(dcb $$0, iz $$1) {
      dsc $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dfb.nd)) && $$2.a(eok.a);
   }
}
