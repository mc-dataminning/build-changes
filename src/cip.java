import java.util.List;
import javax.annotation.Nullable;

public class cip extends cil {
   public static final double c = 0.375;

   public cip(bsn<? extends cip> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cip(dcg $$0, ja $$1) {
      super(bsn.al, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(ajt.a $$0) {
   }

   @Override
   protected void p() {
      this.p((double)this.b.u() + 0.5, (double)this.b.v() + 0.375, (double)this.b.w() + 0.5);
      double $$0 = (double)this.am().l() / 2.0;
      double $$1 = (double)this.am().m();
      this.a(new ewc(this.dw() - $$0, this.dy(), this.dC() - $$0, this.dw() + $$0, this.dy() + $$1, this.dC() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void b(@Nullable bsh $$0) {
      this.a(avh.nS, 1.0F, 1.0F);
   }

   @Override
   public void b(tx $$0) {
   }

   @Override
   public void a(tx $$0) {
   }

   @Override
   public bqh a(cml $$0, bqg $$1) {
      if (this.dR().B) {
         return bqh.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bte> $$4 = this.dR().a(bte.class, new ewc(this.dw() - 7.0, this.dy() - 7.0, this.dC() - 7.0, this.dw() + 7.0, this.dy() + 7.0, this.dC() + 7.0));

         for (bte $$5 : $$4) {
            if ($$5.gb() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.aq();
            if ($$0.gb().d) {
               for (bte $$7 : $$4) {
                  if ($$7.fZ() && $$7.gb() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dxh.b, $$0);
         }

         return bqh.c;
      }
   }

   @Override
   public boolean s() {
      return this.dR().a_(this.b).a(avw.S);
   }

   public static cip b(dcg $$0, ja $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cip $$6 : $$0.a(cip.class, new ewc((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.t().equals($$1)) {
            return $$6;
         }
      }

      cip $$7 = new cip($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void v() {
      this.a(avh.nT, 1.0F, 1.0F);
   }

   @Override
   public zb<abn> dn() {
      return new abo(this, 0, this.t());
   }

   @Override
   public ewh r(float $$0) {
      return this.m($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cud dE() {
      return new cud(cug.uK);
   }
}
