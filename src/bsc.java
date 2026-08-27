import java.util.EnumSet;

public class bsc extends bsr {
   private final bme a;

   public bsc(bme $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bsr.a.a, bsr.a.b));
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
      Iterable<hv> $$0 = hv.b(
         aty.a(this.a.dr() - 1.0), this.a.ds(), aty.a(this.a.dx() - 1.0), aty.a(this.a.dr() + 1.0), aty.a(this.a.dt() + 8.0), aty.a(this.a.dx() + 1.0)
      );
      hv $$1 = null;

      for (hv $$2 : $$0) {
         if (this.a(this.a.dM(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = hv.a(this.a.dr(), this.a.dt() + 8.0, this.a.dx());
      }

      this.a.N().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new elb((double)this.a.bk, (double)this.a.bl, (double)this.a.bm));
      this.a.a(bmb.a, this.a.dp());
   }

   private boolean a(ctb $$0, hv $$1) {
      dip $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(cwb.nd)) && $$2.a($$0, $$1, eep.a);
   }
}
