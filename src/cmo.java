import java.util.function.Predicate;

public abstract class cmo extends bwf implements cmg {
   protected cmo(bvi<? extends cmo> $$0, dgz $$1) {
      super($$0, $$1);
      this.bO = 5;
   }

   @Override
   public aww dn() {
      return aww.f;
   }

   @Override
   public void d_() {
      this.eX();
      this.gs();
      super.d_();
   }

   protected void gs() {
      float $$0 = this.by();
      if ($$0 > 0.5F) {
         this.bf += 2;
      }
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   protected awu aV() {
      return awv.nw;
   }

   @Override
   protected awu aW() {
      return awv.nv;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.nt;
   }

   @Override
   protected awu o_() {
      return awv.ns;
   }

   @Override
   public bvx.a eM() {
      return new bvx.a(awv.nu, awv.nr);
   }

   @Override
   public float a(jh $$0, dhc $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dhq $$0, jh $$1, bac $$2) {
      if ($$0.a(dhi.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         ebj $$3 = $$0.G_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dhi.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().af() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bvi<? extends cmo> $$0, dhq $$1, bvh $$2, jh $$3, bac $$4) {
      return $$1.am() != bsx.a && (bvh.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bvi<? extends cmo> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return $$1.am() != bsx.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bxe.a gt() {
      return bvz.C().a(bxf.c);
   }

   @Override
   public boolean en() {
      return true;
   }

   @Override
   protected boolean eo() {
      return true;
   }

   public boolean a(arx $$0, cpo $$1) {
      return true;
   }

   @Override
   public cxg d(cxg $$0) {
      if ($$0.h() instanceof cyc) {
         Predicate<cxg> $$1 = ((cyc)$$0.h()).d();
         cxg $$2 = cyc.a(this, $$1);
         return $$2.f() ? new cxg(cxk.pb) : $$2;
      } else {
         return cxg.j;
      }
   }
}
