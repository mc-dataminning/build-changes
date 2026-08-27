import java.util.function.Predicate;

public abstract class cer extends boq implements cej {
   protected cer(bnw<? extends cer> $$0, cvr $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public atm db() {
      return atm.f;
   }

   @Override
   public void d_() {
      this.eR();
      this.gl();
      super.d_();
   }

   protected void gl() {
      float $$0 = this.bo();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean Y() {
      return true;
   }

   @Override
   protected atk aN() {
      return atl.mA;
   }

   @Override
   protected atk aO() {
      return atl.mz;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.mx;
   }

   @Override
   protected atk n_() {
      return atl.mw;
   }

   @Override
   public boi.a eH() {
      return new boi.a(atl.my, atl.mv);
   }

   @Override
   public float a(hz $$0, cvu $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(cwg $$0, hz $$1, awp $$2) {
      if ($$0.a(cwa.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dov $$3 = $$0.E_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cwa.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().aa() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bnw<? extends cer> $$0, cwg $$1, bom $$2, hz $$3, awp $$4) {
      return $$1.aj() != blt.a && (bom.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bnw<? extends cer> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return $$1.aj() != blt.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bpo.a gm() {
      return bok.C().a(bpp.c);
   }

   @Override
   public boolean ed() {
      return true;
   }

   @Override
   protected boolean ee() {
      return true;
   }

   public boolean f(chl $$0) {
      return true;
   }

   @Override
   public cpd g(cpd $$0) {
      if ($$0.d() instanceof cpt) {
         Predicate<cpd> $$1 = ((cpt)$$0.d()).e();
         cpd $$2 = cpt.a(this, $$1);
         return $$2.b() ? new cpd(cpg.ou) : $$2;
      } else {
         return cpd.h;
      }
   }
}
