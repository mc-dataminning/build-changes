import java.util.List;
import javax.annotation.Nullable;

public class cny extends cnu {
   public static final double b = 0.375;

   public cny(bxe<? extends cny> $$0, djz $$1) {
      super($$0, $$1);
   }

   public cny(djz $$0, iw $$1) {
      super(bxe.aw, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(akr.a $$0) {
   }

   @Override
   protected void f() {
      this.o((double)this.a.u() + 0.5, (double)this.a.v() + 0.375, (double)this.a.w() + 0.5);
      double $$0 = (double)this.an().l() / 2.0;
      double $$1 = (double)this.an().m();
      this.a(new ffn(this.dA() - $$0, this.dC(), this.dG() - $$0, this.dA() + $$0, this.dC() + $$1, this.dG() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(aru $$0, @Nullable bwv $$1) {
      this.a(awr.oE, 1.0F, 1.0F);
   }

   @Override
   public void b(ua $$0) {
   }

   @Override
   public void a(ua $$0) {
   }

   @Override
   public but a(crz $$0, bus $$1) {
      if (this.dV().C) {
         return but.a;
      } else {
         boolean $$2 = false;
         List<bxu> $$3 = dak.a(this.dV(), this.j(), $$1x -> {
            bwv $$2x = $$1x.C();
            return $$2x == $$0 || $$2x == this;
         });

         for (bxu $$4 : $$3) {
            if ($$4.C() == $$0) {
               $$4.a_(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.aq();
            if ($$0.gk().d) {
               for (bxu $$6 : $$3) {
                  if ($$6.S_() && $$6.C() == this) {
                     $$6.z();
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(egg.b, $$0);
         }

         return but.a;
      }
   }

   @Override
   public boolean g() {
      return this.dV().a_(this.a).a(axg.U);
   }

   public static cny b(djz $$0, iw $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cny $$6 : $$0.a(cny.class, new ffn((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.j().equals($$1)) {
            return $$6;
         }
      }

      cny $$7 = new cny($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void m() {
      this.a(awr.oF, 1.0F, 1.0F);
   }

   @Override
   public zj<aby> a(ars $$0) {
      return new abz(this, 0, this.j());
   }

   @Override
   public ffs v(float $$0) {
      return this.p($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public daa dI() {
      return new daa(dae.vV);
   }
}
