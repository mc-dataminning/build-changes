import java.util.function.Predicate;

public abstract class cly extends bvp implements clq {
   protected cly(bus<? extends cly> $$0, dgi $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public awb dm() {
      return awb.f;
   }

   @Override
   public void d_() {
      this.eX();
      this.gw();
      super.d_();
   }

   protected void gw() {
      float $$0 = this.by();
      if ($$0 > 0.5F) {
         this.bf += 2;
      }
   }

   @Override
   protected boolean ab() {
      return true;
   }

   @Override
   protected avz aV() {
      return awa.nw;
   }

   @Override
   protected avz aW() {
      return awa.nv;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.nt;
   }

   @Override
   protected avz o_() {
      return awa.ns;
   }

   @Override
   public bvh.a eM() {
      return new bvh.a(awa.nu, awa.nr);
   }

   @Override
   public float a(ji $$0, dgl $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dgz $$0, ji $$1, azh $$2) {
      if ($$0.a(dgr.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         eas $$3 = $$0.G_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dgr.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().af() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bus<? extends cly> $$0, dgz $$1, bur $$2, ji $$3, azh $$4) {
      return $$1.am() != bsh.a && (bur.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bus<? extends cly> $$0, dgj $$1, bur $$2, ji $$3, azh $$4) {
      return $$1.am() != bsh.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bwo.a gx() {
      return bvj.F().a(bwp.c);
   }

   @Override
   public boolean em() {
      return true;
   }

   @Override
   protected boolean en() {
      return true;
   }

   public boolean a(ard $$0, cox $$1) {
      return true;
   }

   @Override
   public cwp d(cwp $$0) {
      if ($$0.h() instanceof cxl) {
         Predicate<cwp> $$1 = ((cxl)$$0.h()).d();
         cwp $$2 = cxl.a(this, $$1);
         return $$2.f() ? new cwp(cwt.pb) : $$2;
      } else {
         return cwp.j;
      }
   }
}
