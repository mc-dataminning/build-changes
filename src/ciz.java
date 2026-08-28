import java.util.List;
import javax.annotation.Nullable;

public class ciz extends cix {
   public static final double e = 0.375;

   public ciz(bsy<? extends ciz> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public ciz(dbw $$0, iz $$1) {
      super(bsy.al, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void y() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ak().l() / 2.0;
      double $$1 = (double)this.ak().m();
      this.a(new evk(this.du() - $$0, this.dw(), this.dA() - $$0, this.du() + $$0, this.dw() + $$1, this.dA() + $$0));
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
   public void b(@Nullable bss $$0) {
      this.a(avz.nS, 1.0F, 1.0F);
   }

   @Override
   public void b(ur $$0) {
   }

   @Override
   public void a(ur $$0) {
   }

   @Override
   public bqs a(cmv $$0, bqr $$1) {
      if (this.dP().B) {
         return bqs.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<btp> $$4 = this.dP().a(btp.class, new evk(this.du() - 7.0, this.dw() - 7.0, this.dA() - 7.0, this.du() + 7.0, this.dw() + 7.0, this.dA() + 7.0));

         for (btp $$5 : $$4) {
            if ($$5.gf() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.ao();
            if ($$0.gd().d) {
               for (btp $$7 : $$4) {
                  if ($$7.gd() && $$7.gf() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dwt.b, $$0);
         }

         return bqs.c;
      }
   }

   @Override
   public boolean z() {
      return this.dP().a_(this.c).a(awo.S);
   }

   public static ciz b(dbw $$0, iz $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (ciz $$6 : $$0.a(ciz.class, new evk((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.D().equals($$1)) {
            return $$6;
         }
      }

      ciz $$7 = new ciz($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void C() {
      this.a(avz.nT, 1.0F, 1.0F);
   }

   @Override
   public zv<ach> dl() {
      return new aci(this, 0, this.D());
   }

   @Override
   public evp q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cun dC() {
      return new cun(cuq.uK);
   }
}
