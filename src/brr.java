import java.util.EnumSet;

public class brr extends bsg {
   private final blu a;

   public brr(blu $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bsg.a.a, bsg.a.b));
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
         atq.a(this.a.ds() - 1.0), this.a.dt(), atq.a(this.a.dy() - 1.0), atq.a(this.a.ds() + 1.0), atq.a(this.a.du() + 8.0), atq.a(this.a.dy() + 1.0)
      );
      hx $$1 = null;

      for (hx $$2 : $$0) {
         if (this.a(this.a.dN(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = hx.a(this.a.ds(), this.a.du() + 8.0, this.a.dy());
      }

      this.a.N().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new ejz((double)this.a.bk, (double)this.a.bl, (double)this.a.bm));
      this.a.a(blr.a, this.a.dq());
   }

   private boolean a(csi $$0, hx $$1) {
      dhn $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(cvh.nd)) && $$2.a($$0, $$1, edn.a);
   }
}
