import java.util.List;
import javax.annotation.Nullable;

public class cjy extends cju {
   public static final double c = 0.375;

   public cjy(btv<? extends cjy> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cjy(deg $$0, je $$1) {
      super(btv.al, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(akk.a $$0) {
   }

   @Override
   protected void m() {
      this.o((double)this.b.u() + 0.5, (double)this.b.v() + 0.375, (double)this.b.w() + 0.5);
      double $$0 = (double)this.ao().l() / 2.0;
      double $$1 = (double)this.ao().m();
      this.a(new eyn(this.dx() - $$0, this.dz(), this.dD() - $$0, this.dx() + $$0, this.dz() + $$1, this.dD() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void b(@Nullable bto $$0) {
      this.a(awe.nT, 1.0F, 1.0F);
   }

   @Override
   public void b(uf $$0) {
   }

   @Override
   public void a(uf $$0) {
   }

   @Override
   public brp a(cnu $$0, bro $$1) {
      if (this.dS().B) {
         return brp.a;
      } else {
         boolean $$2 = false;
         List<bui> $$3 = cvz.a(this.dS(), this.q(), $$1x -> {
            bto $$2x = $$1x.C();
            return $$2x == $$0 || $$2x == this;
         });

         for (bui $$4 : $$3) {
            if ($$4.C() == $$0) {
               $$4.b(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.as();
            if ($$0.gd().d) {
               for (bui $$6 : $$3) {
                  if ($$6.K_() && $$6.C() == this) {
                     $$6.a(true, false);
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(dzl.b, $$0);
         }

         return brp.a;
      }
   }

   @Override
   public boolean o() {
      return this.dS().a_(this.b).a(awt.T);
   }

   public static cjy b(deg $$0, je $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cjy $$6 : $$0.a(cjy.class, new eyn((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.q().equals($$1)) {
            return $$6;
         }
      }

      cjy $$7 = new cjy($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void t() {
      this.a(awe.nU, 1.0F, 1.0F);
   }

   @Override
   public zk<abz> a(arg $$0) {
      return new aca(this, 0, this.q());
   }

   @Override
   public eys u(float $$0) {
      return this.o($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cvp dF() {
      return new cvp(cvt.uM);
   }
}
