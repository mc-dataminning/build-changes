import java.util.EnumSet;

public class bmg extends bmv {
   private final bgi a;

   public bmg(bgi $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bmv.a.a, bmv.a.b));
   }

   @Override
   public boolean a() {
      return this.a.cf() < 140;
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
      Iterable<gu> $$0 = gu.b(
         apa.a(this.a.dn() - 1.0), this.a.do(), apa.a(this.a.dt() - 1.0), apa.a(this.a.dn() + 1.0), apa.a(this.a.dp() + 8.0), apa.a(this.a.dt() + 1.0)
      );
      gu $$1 = null;

      for (gu $$2 : $$0) {
         if (this.a(this.a.dI(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = gu.a(this.a.dn(), this.a.dp() + 8.0, this.a.dt());
      }

      this.a.J().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new eei((double)this.a.bl, (double)this.a.bm, (double)this.a.bn));
      this.a.a(bgf.a, this.a.dl());
   }

   private boolean a(cmp $$0, gu $$1) {
      dcb $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(cpo.nd)) && $$2.a($$0, $$1, dxu.a);
   }
}
