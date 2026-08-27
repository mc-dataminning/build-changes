import java.util.EnumSet;

public class bsv extends btk {
   private final bmx a;

   public bsv(bmx $$0) {
      this.a = $$0;
      this.a(EnumSet.of(btk.a.a, btk.a.b));
   }

   @Override
   public boolean a() {
      return this.a.ci() < 140;
   }

   @Override
   public boolean b() {
      return this.a();
   }

   @Override
   public boolean S_() {
      return false;
   }

   @Override
   public void c() {
      this.h();
   }

   private void h() {
      Iterable<hx> $$0 = hx.b(
         aup.a(this.a.dq() - 1.0), this.a.dr(), aup.a(this.a.dw() - 1.0), aup.a(this.a.dq() + 1.0), aup.a(this.a.ds() + 8.0), aup.a(this.a.dw() + 1.0)
      );
      hx $$1 = null;

      for (hx $$2 : $$0) {
         if (this.a(this.a.dL(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = hx.a(this.a.dq(), this.a.ds() + 8.0, this.a.dw());
      }

      this.a.N().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new emc((double)this.a.bk, (double)this.a.bl, (double)this.a.bm));
      this.a.a(bmu.a, this.a.do());
   }

   private boolean a(cua $$0, hx $$1) {
      djp $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(cxa.nd)) && $$2.a($$0, $$1, efp.a);
   }
}
