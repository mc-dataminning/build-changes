import java.util.List;
import javax.annotation.Nullable;

public class ckt extends ckp {
   public static final double c = 0.375;

   public ckt(bup<? extends ckt> $$0, dff $$1) {
      super($$0, $$1);
   }

   public ckt(dff $$0, jh $$1) {
      super(bup.al, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(aks.a $$0) {
   }

   @Override
   protected void m() {
      this.o((double)this.b.u() + 0.5, (double)this.b.v() + 0.375, (double)this.b.w() + 0.5);
      double $$0 = (double)this.ar().l() / 2.0;
      double $$1 = (double)this.ar().m();
      this.a(new ezm(this.dD() - $$0, this.dF(), this.dJ() - $$0, this.dD() + $$0, this.dF() + $$1, this.dJ() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void b(@Nullable bui $$0) {
      this.a(awo.nR, 1.0F, 1.0F);
   }

   @Override
   public void b(un $$0) {
   }

   @Override
   public void a(un $$0) {
   }

   @Override
   public bsh a(cor $$0, bsg $$1) {
      if (this.dY().C) {
         return bsh.a;
      } else {
         boolean $$2 = false;
         List<bvc> $$3 = cwp.a(this.dY(), this.q(), $$1x -> {
            bui $$2x = $$1x.C();
            return $$2x == $$0 || $$2x == this;
         });

         for (bvc $$4 : $$3) {
            if ($$4.C() == $$0) {
               $$4.b(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.av();
            if ($$0.gm().d) {
               for (bvc $$6 : $$3) {
                  if ($$6.M_() && $$6.C() == this) {
                     $$6.a(true, false);
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(eak.b, $$0);
         }

         return bsh.a;
      }
   }

   @Override
   public boolean o() {
      return this.dY().a_(this.b).a(axd.T);
   }

   public static ckt b(dff $$0, jh $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (ckt $$6 : $$0.a(ckt.class, new ezm((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.q().equals($$1)) {
            return $$6;
         }
      }

      ckt $$7 = new ckt($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void t() {
      this.a(awo.nS, 1.0F, 1.0F);
   }

   @Override
   public zs<ach> a(arp $$0) {
      return new aci(this, 0, this.q());
   }

   @Override
   public ezr u(float $$0) {
      return this.o($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cwf dL() {
      return new cwf(cwj.vc);
   }
}
