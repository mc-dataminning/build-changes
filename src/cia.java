import java.util.List;
import javax.annotation.Nullable;

public class cia extends chy {
   public static final double e = 0.375;

   public cia(bsb<? extends cia> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cia(dca $$0, ir $$1) {
      super(bsb.am, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void y() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ak().k() / 2.0;
      double $$1 = (double)this.ak().l();
      this.a(new ewp(this.dz() - $$0, this.dB(), this.dF() - $$0, this.dz() + $$0, this.dB() + $$1, this.dF() + $$0));
   }

   @Override
   public void a(iw $$0) {
   }

   @Override
   public int A() {
      return 9;
   }

   @Override
   public int B() {
      return 9;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void b(@Nullable brv $$0) {
      this.a(avo.oi, 1.0F, 1.0F);
   }

   @Override
   public void b(uk $$0) {
   }

   @Override
   public void a(uk $$0) {
   }

   @Override
   public bqa a(cly $$0, bpz $$1) {
      if (this.dU().C) {
         return bqa.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bsq> $$4 = this.dU().a(bsq.class, new ewp(this.dz() - 7.0, this.dB() - 7.0, this.dF() - 7.0, this.dz() + 7.0, this.dB() + 7.0, this.dF() + 7.0));

         for (bsq $$5 : $$4) {
            if ($$5.gn() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.ao();
            if ($$0.gm().d) {
               for (bsq $$7 : $$4) {
                  if ($$7.gl() && $$7.gn() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dxv.b, $$0);
         }

         return bqa.b;
      }
   }

   @Override
   public boolean z() {
      return this.dU().a_(this.c).a(awe.S);
   }

   public static cia b(dca $$0, ir $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cia $$6 : $$0.a(cia.class, new ewp((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.D().equals($$1)) {
            return $$6;
         }
      }

      cia $$7 = new cia($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void C() {
      this.a(avo.oj, 1.0F, 1.0F);
   }

   @Override
   public zl<abw> dq() {
      return new abx(this, 0, this.D());
   }

   @Override
   public ewu q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cuh dH() {
      return new cuh(cuk.wv);
   }
}
