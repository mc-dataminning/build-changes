import java.util.List;
import javax.annotation.Nullable;

public class ciz extends civ {
   public static final double c = 0.375;

   public ciz(bsw<? extends ciz> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public ciz(dcu $$0, jd $$1) {
      super(bsw.al, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(ajz.a $$0) {
   }

   @Override
   protected void p() {
      this.o((double)this.b.u() + 0.5, (double)this.b.v() + 0.375, (double)this.b.w() + 0.5);
      double $$0 = (double)this.am().l() / 2.0;
      double $$1 = (double)this.am().m();
      this.a(new ewr(this.dv() - $$0, this.dx(), this.dB() - $$0, this.dv() + $$0, this.dx() + $$1, this.dB() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void b(@Nullable bsq $$0) {
      this.a(avo.nS, 1.0F, 1.0F);
   }

   @Override
   public void b(ua $$0) {
   }

   @Override
   public void a(ua $$0) {
   }

   @Override
   public bqq a(cmv $$0, bqp $$1) {
      if (this.dQ().B) {
         return bqq.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<btn> $$4 = this.dQ().a(btn.class, new ewr(this.dv() - 7.0, this.dx() - 7.0, this.dB() - 7.0, this.dv() + 7.0, this.dx() + 7.0, this.dB() + 7.0));

         for (btn $$5 : $$4) {
            if ($$5.ga() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.aq();
            if ($$0.ga().d) {
               for (btn $$7 : $$4) {
                  if ($$7.fY() && $$7.ga() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dxw.b, $$0);
         }

         return bqq.c;
      }
   }

   @Override
   public boolean s() {
      return this.dQ().a_(this.b).a(awd.S);
   }

   public static ciz b(dcu $$0, jd $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (ciz $$6 : $$0.a(ciz.class, new ewr((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.t().equals($$1)) {
            return $$6;
         }
      }

      ciz $$7 = new ciz($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void v() {
      this.a(avo.nT, 1.0F, 1.0F);
   }

   @Override
   public zf<abt> dm() {
      return new abu(this, 0, this.t());
   }

   @Override
   public eww r(float $$0) {
      return this.m($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cuo dD() {
      return new cuo(cur.uK);
   }
}
