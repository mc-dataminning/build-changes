import java.util.EnumSet;

public class cbq extends ccf {
   private final bvp a;

   public cbq(bvp $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccf.a.a, ccf.a.b));
   }

   @Override
   public boolean b() {
      return this.a.ct() < 140;
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public boolean U_() {
      return false;
   }

   @Override
   public void d() {
      this.h();
   }

   private void h() {
      Iterable<ji> $$0 = ji.b(
         ayz.a(this.a.dA() - 1.0), this.a.dB(), ayz.a(this.a.dG() - 1.0), ayz.a(this.a.dA() + 1.0), ayz.a(this.a.dC() + 8.0), ayz.a(this.a.dG() + 1.0)
      );
      ji $$1 = null;

      for (ji $$2 : $$0) {
         if (this.a(this.a.dV(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = ji.a(this.a.dA(), this.a.dC() + 8.0, this.a.dG());
      }

      this.a.P().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new fba((double)this.a.bn, (double)this.a.bo, (double)this.a.bp));
      this.a.a(bvl.a, this.a.dy());
   }

   private boolean a(dgl $$0, ji $$1) {
      dwx $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(djo.nF)) && $$2.a(eto.a);
   }
}
