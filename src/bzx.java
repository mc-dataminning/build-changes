import java.util.EnumSet;

public class bzx extends cam {
   private final btw a;

   public bzx(btw $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cam.a.a, cam.a.b));
   }

   @Override
   public boolean b() {
      return this.a.cm() < 140;
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
      Iterable<jd> $$0 = jd.b(
         ayo.a(this.a.dt() - 1.0), this.a.du(), ayo.a(this.a.dz() - 1.0), ayo.a(this.a.dt() + 1.0), ayo.a(this.a.dv() + 8.0), ayo.a(this.a.dz() + 1.0)
      );
      jd $$1 = null;

      for (jd $$2 : $$0) {
         if (this.a(this.a.dO(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = jd.a(this.a.dt(), this.a.dv() + 8.0, this.a.dz());
      }

      this.a.N().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new exc((double)this.a.bo, (double)this.a.bp, (double)this.a.bq));
      this.a.a(bts.a, this.a.dr());
   }

   private boolean a(dcz $$0, jd $$1) {
      dtc $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dga.nd)) && $$2.a(ept.a);
   }
}
