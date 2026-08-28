import java.util.List;
import javax.annotation.Nullable;

public class cjt extends cjp {
   public static final double c = 0.375;

   public cjt(btq<? extends cjt> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cjt(dds $$0, je $$1) {
      super(btq.al, $$0, $$1);
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
      this.a(new exz(this.dx() - $$0, this.dz(), this.dD() - $$0, this.dx() + $$0, this.dz() + $$1, this.dD() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void b(@Nullable btj $$0) {
      this.a(awd.nT, 1.0F, 1.0F);
   }

   @Override
   public void b(uf $$0) {
   }

   @Override
   public void a(uf $$0) {
   }

   @Override
   public brk a(cnp $$0, brj $$1) {
      if (this.dS().B) {
         return brk.a;
      } else {
         boolean $$2 = false;
         List<bud> $$3 = cvu.a(this.dS(), this.q(), $$1x -> {
            btj $$2x = $$1x.C();
            return $$2x == $$0 || $$2x == this;
         });

         for (bud $$4 : $$3) {
            if ($$4.C() == $$0) {
               $$4.b(this, true);
               $$2 = true;
            }
         }

         boolean $$5 = false;
         if (!$$2) {
            this.as();
            if ($$0.gd().d) {
               for (bud $$6 : $$3) {
                  if ($$6.K_() && $$6.C() == this) {
                     $$6.a(true, false);
                     $$5 = true;
                  }
               }
            }
         }

         if ($$2 || $$5) {
            this.a(dyx.b, $$0);
         }

         return brk.a;
      }
   }

   @Override
   public boolean o() {
      return this.dS().a_(this.b).a(aws.T);
   }

   public static cjt b(dds $$0, je $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cjt $$6 : $$0.a(cjt.class, new exz((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.q().equals($$1)) {
            return $$6;
         }
      }

      cjt $$7 = new cjt($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   public void t() {
      this.a(awd.nU, 1.0F, 1.0F);
   }

   @Override
   public zk<abz> a(arf $$0) {
      return new aca(this, 0, this.q());
   }

   @Override
   public eye u(float $$0) {
      return this.o($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cvl dF() {
      return new cvl(cvo.uM);
   }
}
