import java.util.function.Predicate;

public abstract class cba extends blh implements cas {
   protected cba(bkm<? extends cba> $$0, crs $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public aqo da() {
      return aqo.f;
   }

   @Override
   public void c_() {
      this.eP();
      this.gj();
      super.c_();
   }

   protected void gj() {
      float $$0 = this.bm();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean V() {
      return true;
   }

   @Override
   protected aqm aL() {
      return aqn.lA;
   }

   @Override
   protected aqm aM() {
      return aqn.lz;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.lx;
   }

   @Override
   protected aqm m_() {
      return aqn.lw;
   }

   @Override
   public bky.a eF() {
      return new bky.a(aqn.ly, aqn.lv);
   }

   @Override
   public float a(ht $$0, crv $$1) {
      return -$$1.v($$0);
   }

   public static boolean a(csh $$0, ht $$1, ato $$2) {
      if ($$0.a(csb.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dkf $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(csb.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.C().Y() ? $$0.c($$1, 10) : $$0.z($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bkm<? extends cba> $$0, csh $$1, blc $$2, ht $$3, ato $$4) {
      return $$1.ai() != bin.a && a($$1, $$3, $$4) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bkm<? extends cba> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return $$1.ai() != bin.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bmd.a gk() {
      return bla.A().a(bme.c);
   }

   @Override
   public boolean eb() {
      return true;
   }

   @Override
   protected boolean ec() {
      return true;
   }

   public boolean f(cdm $$0) {
      return true;
   }

   @Override
   public clb g(clb $$0) {
      if ($$0.d() instanceof clr) {
         Predicate<clb> $$1 = ((clr)$$0.d()).e();
         clb $$2 = clr.a(this, $$1);
         return $$2.b() ? new clb(cle.nH) : $$2;
      } else {
         return clb.b;
      }
   }
}
