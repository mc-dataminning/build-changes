import java.util.List;
import javax.annotation.Nullable;

public class cnw extends cns {
   public static final double b = 0.375;

   public cnw(bxc<? extends cnw> $$0, djx $$1) {
      super($$0, $$1);
   }

   public cnw(djx $$0, iv $$1) {
      super(bxc.aw, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(akp.a $$0) {
   }

   @Override
   protected void f() {
      this.o((double)this.a.u() + 0.5, (double)this.a.v() + 0.375, (double)this.a.w() + 0.5);
      double $$0 = (double)this.an().l() / 2.0;
      double $$1 = (double)this.an().m();
      this.a(new ffl(this.dA() - $$0, this.dC(), this.dG() - $$0, this.dA() + $$0, this.dC() + $$1, this.dG() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(ars $$0, @Nullable bwt $$1) {
      this.a(awp.oE, 1.0F, 1.0F);
   }

   @Override
   public void b(tz $$0) {
   }

   @Override
   public void a(tz $$0) {
   }

   @Override
   public bur a(crx $$0, buq $$1) {
      if (this.dV().C) {
         return bur.a;
      } else {
         boolean $$2 = false;
         List<bxs> $$3 = dai.a(this.dV(), this.j(), $$1x -> {
            bwt $$2x = $$1x.C();
            return $$2x == $$0 || $$2x == this;
         });

         for (bxs $$4 : $$3) {
            if ($$4.C() == $$0) {
               $$4.a_(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.aq();
            if ($$0.gk().d) {
               for (bxs $$6 : $$3) {
                  if ($$6.S_() && $$6.C() == this) {
                     $$6.z();
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(ege.b, $$0);
         }

         return bur.a;
      }
   }

   @Override
   public boolean g() {
      return this.dV().a_(this.a).a(axe.U);
   }

   public static cnw b(djx $$0, iv $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cnw $$6 : $$0.a(cnw.class, new ffl((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.j().equals($$1)) {
            return $$6;
         }
      }

      cnw $$7 = new cnw($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void m() {
      this.a(awp.oF, 1.0F, 1.0F);
   }

   @Override
   public zh<abw> a(arq $$0) {
      return new abx(this, 0, this.j());
   }

   @Override
   public ffq v(float $$0) {
      return this.p($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public czy dI() {
      return new czy(dac.vV);
   }
}
