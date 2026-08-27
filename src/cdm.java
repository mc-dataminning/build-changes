import java.util.List;
import javax.annotation.Nullable;

public class cdm extends cdk {
   public static final double e = 0.375;

   public cdm(bnu<? extends cdm> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cdm(cvn $$0, hz $$1) {
      super(bnu.aj, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void z() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ai().k() / 2.0;
      double $$1 = (double)this.ai().l();
      this.a(new enn(this.dr() - $$0, this.dt(), this.dx() - $$0, this.dr() + $$0, this.dt() + $$1, this.dx() + $$0));
   }

   @Override
   public void a(ie $$0) {
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
   public void a(@Nullable bno $$0) {
      this.a(atk.nt, 1.0F, 1.0F);
   }

   @Override
   public void b(sw $$0) {
   }

   @Override
   public void a(sw $$0) {
   }

   @Override
   public blu a(chh $$0, blt $$1) {
      if (this.dM().B) {
         return blu.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<boi> $$4 = this.dM().a(boi.class, new enn(this.dr() - 7.0, this.dt() - 7.0, this.dx() - 7.0, this.dr() + 7.0, this.dt() + 7.0, this.dx() + 7.0));

         for (boi $$5 : $$4) {
            if ($$5.fV() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.am();
            if ($$0.fU().d) {
               for (boi $$7 : $$4) {
                  if ($$7.fU() && $$7.fV() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dpp.b, $$0);
         }

         return blu.b;
      }
   }

   @Override
   public boolean A() {
      return this.dM().a_(this.c).a(atz.S);
   }

   public static cdm b(cvn $$0, hz $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cdm $$6 : $$0.a(cdm.class, new enn((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.E().equals($$1)) {
            return $$6;
         }
      }

      cdm $$7 = new cdm($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void D() {
      this.a(atk.nu, 1.0F, 1.0F);
   }

   @Override
   public xx<aag> di() {
      return new aah(this, 0, this.E());
   }

   @Override
   public ens q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public coz dz() {
      return new coz(cpc.uG);
   }
}
