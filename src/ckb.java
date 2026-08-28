import java.util.List;
import javax.annotation.Nullable;

public class ckb extends cjx {
   public static final double c = 0.375;

   public ckb(bty<? extends ckb> $$0, dej $$1) {
      super($$0, $$1);
   }

   public ckb(dej $$0, jf $$1) {
      super(bty.al, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(akl.a $$0) {
   }

   @Override
   protected void m() {
      this.o((double)this.b.u() + 0.5, (double)this.b.v() + 0.375, (double)this.b.w() + 0.5);
      double $$0 = (double)this.ao().l() / 2.0;
      double $$1 = (double)this.ao().m();
      this.a(new eyr(this.dx() - $$0, this.dz(), this.dD() - $$0, this.dx() + $$0, this.dz() + $$1, this.dD() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void b(@Nullable btr $$0) {
      this.a(awg.nT, 1.0F, 1.0F);
   }

   @Override
   public void b(ug $$0) {
   }

   @Override
   public void a(ug $$0) {
   }

   @Override
   public brs a(cnx $$0, brr $$1) {
      if (this.dS().B) {
         return brs.a;
      } else {
         boolean $$2 = false;
         List<bul> $$3 = cwc.a(this.dS(), this.q(), $$1x -> {
            btr $$2x = $$1x.C();
            return $$2x == $$0 || $$2x == this;
         });

         for (bul $$4 : $$3) {
            if ($$4.C() == $$0) {
               $$4.b(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.as();
            if ($$0.ge().d) {
               for (bul $$6 : $$3) {
                  if ($$6.L_() && $$6.C() == this) {
                     $$6.a(true, false);
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(dzp.b, $$0);
         }

         return brs.a;
      }
   }

   @Override
   public boolean o() {
      return this.dS().a_(this.b).a(awv.T);
   }

   public static ckb b(dej $$0, jf $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (ckb $$6 : $$0.a(ckb.class, new eyr((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.q().equals($$1)) {
            return $$6;
         }
      }

      ckb $$7 = new ckb($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void t() {
      this.a(awg.nU, 1.0F, 1.0F);
   }

   @Override
   public zl<aca> a(ari $$0) {
      return new acb(this, 0, this.q());
   }

   @Override
   public eyw u(float $$0) {
      return this.o($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cvs dF() {
      return new cvs(cvw.uM);
   }
}
