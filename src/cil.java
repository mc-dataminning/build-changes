import java.util.List;
import javax.annotation.Nullable;

public class cil extends cih {
   public static final double c = 0.375;

   public cil(bsj<? extends cil> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cil(dcd $$0, ja $$1) {
      super(bsj.al, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(ajt.a $$0) {
   }

   @Override
   protected void p() {
      this.p((double)this.b.u() + 0.5, (double)this.b.v() + 0.375, (double)this.b.w() + 0.5);
      double $$0 = (double)this.ak().l() / 2.0;
      double $$1 = (double)this.ak().m();
      this.a(new evu(this.du() - $$0, this.dw(), this.dA() - $$0, this.du() + $$0, this.dw() + $$1, this.dA() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void b(@Nullable bsd $$0) {
      this.a(avf.nS, 1.0F, 1.0F);
   }

   @Override
   public void b(tx $$0) {
   }

   @Override
   public void a(tx $$0) {
   }

   @Override
   public bqd a(cmh $$0, bqc $$1) {
      if (this.dP().B) {
         return bqd.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bta> $$4 = this.dP().a(bta.class, new evu(this.du() - 7.0, this.dw() - 7.0, this.dA() - 7.0, this.du() + 7.0, this.dw() + 7.0, this.dA() + 7.0));

         for (bta $$5 : $$4) {
            if ($$5.gb() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.ao();
            if ($$0.fZ().d) {
               for (bta $$7 : $$4) {
                  if ($$7.fZ() && $$7.gb() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dxa.b, $$0);
         }

         return bqd.c;
      }
   }

   @Override
   public boolean s() {
      return this.dP().a_(this.b).a(avu.S);
   }

   public static cil b(dcd $$0, ja $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cil $$6 : $$0.a(cil.class, new evu((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.u().equals($$1)) {
            return $$6;
         }
      }

      cil $$7 = new cil($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void v() {
      this.a(avf.nT, 1.0F, 1.0F);
   }

   @Override
   public zb<abn> dl() {
      return new abo(this, 0, this.u());
   }

   @Override
   public evz r(float $$0) {
      return this.m($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cua dC() {
      return new cua(cud.uK);
   }
}
