import java.util.List;
import javax.annotation.Nullable;

public class cni extends cne {
   public static final double b = 0.375;

   public cni(bwr<? extends cni> $$0, djh $$1) {
      super($$0, $$1);
   }

   public cni(djh $$0, iv $$1) {
      super(bwr.av, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(akn.a $$0) {
   }

   @Override
   protected void f() {
      this.o((double)this.a.u() + 0.5, (double)this.a.v() + 0.375, (double)this.a.w() + 0.5);
      double $$0 = (double)this.an().l() / 2.0;
      double $$1 = (double)this.an().m();
      this.a(new fes(this.dz() - $$0, this.dB(), this.dF() - $$0, this.dz() + $$0, this.dB() + $$1, this.dF() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(arq $$0, @Nullable bwi $$1) {
      this.a(awn.oE, 1.0F, 1.0F);
   }

   @Override
   public void b(tz $$0) {
   }

   @Override
   public void a(tz $$0) {
   }

   @Override
   public bug a(crj $$0, buf $$1) {
      if (this.dU().C) {
         return bug.a;
      } else {
         boolean $$2 = false;
         List<bxh> $$3 = czu.a(this.dU(), this.j(), $$1x -> {
            bwi $$2x = $$1x.C();
            return $$2x == $$0 || $$2x == this;
         });

         for (bxh $$4 : $$3) {
            if ($$4.C() == $$0) {
               $$4.a_(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.aq();
            if ($$0.gj().d) {
               for (bxh $$6 : $$3) {
                  if ($$6.O_() && $$6.C() == this) {
                     $$6.z();
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(efo.b, $$0);
         }

         return bug.a;
      }
   }

   @Override
   public boolean g() {
      return this.dU().a_(this.a).a(axc.U);
   }

   public static cni b(djh $$0, iv $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cni $$6 : $$0.a(cni.class, new fes((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.j().equals($$1)) {
            return $$6;
         }
      }

      cni $$7 = new cni($$0, $$1);
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
   public fex v(float $$0) {
      return this.p($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public czk dH() {
      return new czk(czo.vV);
   }
}
