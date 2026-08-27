import java.util.EnumSet;

public class bsm extends btb {
   private final bmo a;

   public bsm(bmo $$0) {
      this.a = $$0;
      this.a(EnumSet.of(btb.a.a, btb.a.b));
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
         aui.a(this.a.dr() - 1.0), this.a.ds(), aui.a(this.a.dx() - 1.0), aui.a(this.a.dr() + 1.0), aui.a(this.a.dt() + 8.0), aui.a(this.a.dx() + 1.0)
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
      this.a.a(0.02F, new elm((double)this.a.bk, (double)this.a.bl, (double)this.a.bm));
      this.a.a(bml.a, this.a.dp());
   }

   private boolean a(ctl $$0, hx $$1) {
      dja $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(cwl.nd)) && $$2.a($$0, $$1, efa.a);
   }
}
