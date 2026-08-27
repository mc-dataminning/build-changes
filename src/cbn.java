import java.util.function.Predicate;

public abstract class cbn extends blu implements cbf {
   protected cbn(bkz<? extends cbn> $$0, csf $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public aqw dc() {
      return aqw.f;
   }

   @Override
   public void d_() {
      this.eR();
      this.gk();
      super.d_();
   }

   protected void gk() {
      float $$0 = this.bo();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   protected aqu aN() {
      return aqv.lQ;
   }

   @Override
   protected aqu aO() {
      return aqv.lP;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.lN;
   }

   @Override
   protected aqu n_() {
      return aqv.lM;
   }

   @Override
   public bll.a eH() {
      return new bll.a(aqv.lO, aqv.lL);
   }

   @Override
   public float a(hx $$0, csi $$1) {
      return -$$1.v($$0);
   }

   public static boolean a(csu $$0, hx $$1, atw $$2) {
      if ($$0.a(cso.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dkw $$3 = $$0.E_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cso.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.D().Z() ? $$0.c($$1, 10) : $$0.z($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bkz<? extends cbn> $$0, csu $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.aj() != biy.a && a($$1, $$3, $$4) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bkz<? extends cbn> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.aj() != biy.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bmq.a gl() {
      return bln.C().a(bmr.c);
   }

   @Override
   public boolean ed() {
      return true;
   }

   @Override
   protected boolean ee() {
      return true;
   }

   public boolean f(cdz $$0) {
      return true;
   }

   @Override
   public clo g(clo $$0) {
      if ($$0.d() instanceof cme) {
         Predicate<clo> $$1 = ((cme)$$0.d()).e();
         clo $$2 = cme.a(this, $$1);
         return $$2.b() ? new clo(clr.os) : $$2;
      } else {
         return clo.b;
      }
   }
}
