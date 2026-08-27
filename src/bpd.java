import java.util.EnumSet;

public class bpd extends bps {
   private final bjf a;

   public bpd(bjf $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bps.a.a, bps.a.b));
   }

   @Override
   public boolean a() {
      return this.a.ch() < 140;
   }

   @Override
   public boolean b() {
      return this.a();
   }

   @Override
   public boolean J_() {
      return false;
   }

   @Override
   public void c() {
      this.h();
   }

   private void h() {
      Iterable<gv> $$0 = gv.b(
         aro.a(this.a.dp() - 1.0), this.a.dq(), aro.a(this.a.dv() - 1.0), aro.a(this.a.dp() + 1.0), aro.a(this.a.dr() + 8.0), aro.a(this.a.dv() + 1.0)
      );
      gv $$1 = null;

      for (gv $$2 : $$0) {
         if (this.a(this.a.dK(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = gv.a(this.a.dp(), this.a.dr() + 8.0, this.a.dv());
      }

      this.a.H().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new ehf((double)this.a.bk, (double)this.a.bl, (double)this.a.bm));
      this.a.a(bjc.a, this.a.dn());
   }

   private boolean a(cpn $$0, gv $$1) {
      dey $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(csl.nd)) && $$2.a($$0, $$1, ear.a);
   }
}
