import java.util.EnumSet;

public class bph extends bpw {
   private final bjk a;

   public bph(bjk $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bpw.a.a, bpw.a.b));
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
      Iterable<gw> $$0 = gw.b(
         ars.a(this.a.dp() - 1.0), this.a.dq(), ars.a(this.a.dv() - 1.0), ars.a(this.a.dp() + 1.0), ars.a(this.a.dr() + 8.0), ars.a(this.a.dv() + 1.0)
      );
      gw $$1 = null;

      for (gw $$2 : $$0) {
         if (this.a(this.a.dK(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = gw.a(this.a.dp(), this.a.dr() + 8.0, this.a.dv());
      }

      this.a.H().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new ehi((double)this.a.bk, (double)this.a.bl, (double)this.a.bm));
      this.a.a(bjh.a, this.a.dn());
   }

   private boolean a(cpt $$0, gw $$1) {
      dfe $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(csr.nd)) && $$2.a($$0, $$1, eax.a);
   }
}
