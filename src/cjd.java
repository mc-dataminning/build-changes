import java.util.List;
import javax.annotation.Nullable;

public class cjd extends cjb {
   public static final double e = 0.375;

   public cjd(btc<? extends cjd> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cjd(dca $$0, iz $$1) {
      super(btc.al, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void y() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ak().l() / 2.0;
      double $$1 = (double)this.ak().m();
      this.a(new evo(this.du() - $$0, this.dw(), this.dA() - $$0, this.du() + $$0, this.dw() + $$1, this.dA() + $$0));
   }

   @Override
   public void a(je $$0) {
   }

   @Override
   public int A() {
      return 9;
   }

   @Override
   public int B() {
      return 9;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void b(@Nullable bsw $$0) {
      this.a(awa.nS, 1.0F, 1.0F);
   }

   @Override
   public void b(us $$0) {
   }

   @Override
   public void a(us $$0) {
   }

   @Override
   public bqw a(cmz $$0, bqv $$1) {
      if (this.dP().B) {
         return bqw.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<btt> $$4 = this.dP().a(btt.class, new evo(this.du() - 7.0, this.dw() - 7.0, this.dA() - 7.0, this.du() + 7.0, this.dw() + 7.0, this.dA() + 7.0));

         for (btt $$5 : $$4) {
            if ($$5.gf() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.ao();
            if ($$0.gd().d) {
               for (btt $$7 : $$4) {
                  if ($$7.gd() && $$7.gf() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dwx.b, $$0);
         }

         return bqw.c;
      }
   }

   @Override
   public boolean z() {
      return this.dP().a_(this.c).a(awp.S);
   }

   public static cjd b(dca $$0, iz $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cjd $$6 : $$0.a(cjd.class, new evo((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.D().equals($$1)) {
            return $$6;
         }
      }

      cjd $$7 = new cjd($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void C() {
      this.a(awa.nT, 1.0F, 1.0F);
   }

   @Override
   public zw<aci> dl() {
      return new acj(this, 0, this.D());
   }

   @Override
   public evt q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cur dC() {
      return new cur(cuu.uK);
   }
}
