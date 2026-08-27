import java.util.EnumSet;

public class bum extends bvb {
   private final boo a;

   public bum(boo $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bvb.a.a, bvb.a.b));
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
      Iterable<hz> $$0 = hz.b(
         awh.a(this.a.dr() - 1.0), this.a.ds(), awh.a(this.a.dx() - 1.0), awh.a(this.a.dr() + 1.0), awh.a(this.a.dt() + 8.0), awh.a(this.a.dx() + 1.0)
      );
      hz $$1 = null;

      for (hz $$2 : $$0) {
         if (this.a(this.a.dM(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = hz.a(this.a.dr(), this.a.dt() + 8.0, this.a.dx());
      }

      this.a.N().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new ens((double)this.a.bk, (double)this.a.bl, (double)this.a.bm));
      this.a.a(bol.a, this.a.dp());
   }

   private boolean a(cvq $$0, hz $$1) {
      dlf $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(cyq.nd)) && $$2.a($$0, $$1, ehf.a);
   }
}
