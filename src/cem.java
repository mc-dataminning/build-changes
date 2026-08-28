import java.util.EnumSet;

public class cem extends cfb {
   private final byn a;

   public cem(byn $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cfb.a.a, cfb.a.b));
   }

   @Override
   public boolean b() {
      return this.a.cs() < 140;
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public boolean V_() {
      return false;
   }

   @Override
   public void d() {
      this.h();
   }

   private void h() {
      Iterable<iw> $$0 = iw.b(
         azz.a(this.a.dA() - 1.0), this.a.dB(), azz.a(this.a.dG() - 1.0), azz.a(this.a.dA() + 1.0), azz.a(this.a.dC() + 8.0), azz.a(this.a.dG() + 1.0)
      );
      iw $$1 = null;

      for (iw $$2 : $$0) {
         if (this.a(this.a.dV(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = iw.a(this.a.dA(), this.a.dC() + 8.0, this.a.dG());
      }

      this.a.N().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new fgc((double)this.a.bg, (double)this.a.bh, (double)this.a.bi));
      this.a.a(byj.a, this.a.dy());
   }

   private boolean a(dkm $$0, iw $$1) {
      ebq $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dnq.nJ)) && $$2.a(eyp.a);
   }
}
