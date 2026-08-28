import java.util.List;
import javax.annotation.Nullable;

public class cnb extends cmx {
   public static final double b = 0.375;

   public cnb(bwo<? extends cnb> $$0, dja $$1) {
      super($$0, $$1);
   }

   public cnb(dja $$0, iu $$1) {
      super(bwo.av, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(akn.a $$0) {
   }

   @Override
   protected void f() {
      this.o((double)this.a.u() + 0.5, (double)this.a.v() + 0.375, (double)this.a.w() + 0.5);
      double $$0 = (double)this.aq().l() / 2.0;
      double $$1 = (double)this.aq().m();
      this.a(new fel(this.dA() - $$0, this.dC(), this.dG() - $$0, this.dA() + $$0, this.dC() + $$1, this.dG() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(arq $$0, @Nullable bwf $$1) {
      this.a(awn.oE, 1.0F, 1.0F);
   }

   @Override
   public void b(tz $$0) {
   }

   @Override
   public void a(tz $$0) {
   }

   @Override
   public bud a(crc $$0, buc $$1) {
      if (this.dV().C) {
         return bud.a;
      } else {
         boolean $$2 = false;
         List<bxc> $$3 = czn.a(this.dV(), this.j(), $$1x -> {
            bwf $$2x = $$1x.C();
            return $$2x == $$0 || $$2x == this;
         });

         for (bxc $$4 : $$3) {
            if ($$4.C() == $$0) {
               $$4.a_(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.at();
            if ($$0.gk().d) {
               for (bxc $$6 : $$3) {
                  if ($$6.O_() && $$6.C() == this) {
                     $$6.z();
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(efh.b, $$0);
         }

         return bud.a;
      }
   }

   @Override
   public boolean g() {
      return this.dV().a_(this.a).a(axc.U);
   }

   public static cnb b(dja $$0, iu $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cnb $$6 : $$0.a(cnb.class, new fel((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.j().equals($$1)) {
            return $$6;
         }
      }

      cnb $$7 = new cnb($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void m() {
      this.a(awn.oF, 1.0F, 1.0F);
   }

   @Override
   public zf<abu> a(aro $$0) {
      return new abv(this, 0, this.j());
   }

   @Override
   public feq v(float $$0) {
      return this.p($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public czd dI() {
      return new czd(czh.vV);
   }
}
