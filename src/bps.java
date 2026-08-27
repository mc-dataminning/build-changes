import java.util.EnumSet;

public class bps extends bqh {
   private final bjv a;

   public bps(bjv $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bqh.a.a, bqh.a.b));
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
   public boolean P_() {
      return false;
   }

   @Override
   public void c() {
      this.h();
   }

   private void h() {
      Iterable<gw> $$0 = gw.b(
         asb.a(this.a.dq() - 1.0), this.a.dr(), asb.a(this.a.dw() - 1.0), asb.a(this.a.dq() + 1.0), asb.a(this.a.ds() + 8.0), asb.a(this.a.dw() + 1.0)
      );
      gw $$1 = null;

      for (gw $$2 : $$0) {
         if (this.a(this.a.dL(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = gw.a(this.a.dq(), this.a.ds() + 8.0, this.a.dw());
      }

      this.a.L().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new ehh((double)this.a.bk, (double)this.a.bl, (double)this.a.bm));
      this.a.a(bjs.a, this.a.do());
   }

   private boolean a(cqe $$0, gw $$1) {
      dfd $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(cte.nd)) && $$2.a($$0, $$1, eaw.a);
   }
}
