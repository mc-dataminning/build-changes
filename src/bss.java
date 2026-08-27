import java.util.EnumSet;

public class bss extends bth {
   private final bmu a;

   public bss(bmu $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bth.a.a, bth.a.b));
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
         auo.a(this.a.dr() - 1.0), this.a.ds(), auo.a(this.a.dx() - 1.0), auo.a(this.a.dr() + 1.0), auo.a(this.a.dt() + 8.0), auo.a(this.a.dx() + 1.0)
      );
      hx $$1 = null;

      for (hx $$2 : $$0) {
         if (this.a(this.a.dM(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = hx.a(this.a.dr(), this.a.dt() + 8.0, this.a.dx());
      }

      this.a.N().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new elt((double)this.a.bk, (double)this.a.bl, (double)this.a.bm));
      this.a.a(bmr.a, this.a.dp());
   }

   private boolean a(cts $$0, hx $$1) {
      djh $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(cws.nd)) && $$2.a($$0, $$1, efh.a);
   }
}
