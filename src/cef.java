import java.util.List;
import javax.annotation.Nullable;

public class cef extends ced {
   public static final double e = 0.375;

   public cef(bol<? extends cef> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cef(cwe $$0, ib $$1) {
      super(bol.aj, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void z() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ai().k() / 2.0;
      double $$1 = (double)this.ai().l();
      this.a(new eoq(this.do() - $$0, this.dq(), this.du() - $$0, this.do() + $$0, this.dq() + $$1, this.du() + $$0));
   }

   @Override
   public void a(ih $$0) {
   }

   @Override
   public int B() {
      return 9;
   }

   @Override
   public int C() {
      return 9;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(@Nullable bof $$0) {
      this.a(atp.nu, 1.0F, 1.0F);
   }

   @Override
   public void b(sy $$0) {
   }

   @Override
   public void a(sy $$0) {
   }

   @Override
   public bml a(cia $$0, bmk $$1) {
      if (this.dJ().B) {
         return bml.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<boz> $$4 = this.dJ().a(boz.class, new eoq(this.do() - 7.0, this.dq() - 7.0, this.du() - 7.0, this.do() + 7.0, this.dq() + 7.0, this.du() + 7.0));

         for (boz $$5 : $$4) {
            if ($$5.ga() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.am();
            if ($$0.fW().d) {
               for (boz $$7 : $$4) {
                  if ($$7.fZ() && $$7.ga() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dqr.b, $$0);
         }

         return bml.b;
      }
   }

   @Override
   public boolean A() {
      return this.dJ().a_(this.c).a(aue.S);
   }

   public static cef b(cwe $$0, ib $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cef $$6 : $$0.a(cef.class, new eoq((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.E().equals($$1)) {
            return $$6;
         }
      }

      cef $$7 = new cef($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void D() {
      this.a(atp.nv, 1.0F, 1.0F);
   }

   @Override
   public xz<aai> df() {
      return new aaj(this, 0, this.E());
   }

   @Override
   public eov q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cpq dw() {
      return new cpq(cpt.uG);
   }
}
