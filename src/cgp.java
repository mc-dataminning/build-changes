import java.util.List;
import javax.annotation.Nullable;

public class cgp extends cgn {
   public static final double e = 0.375;

   public cgp(bqr<? extends cgp> $$0, czu $$1) {
      super($$0, $$1);
   }

   public cgp(czu $$0, im $$1) {
      super(bqr.ak, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void y() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ai().k() / 2.0;
      double $$1 = (double)this.ai().l();
      this.a(new eta(this.ds() - $$0, this.du(), this.dy() - $$0, this.ds() + $$0, this.du() + $$1, this.dy() + $$0));
   }

   @Override
   public void a(ir $$0) {
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
   public void b(@Nullable bql $$0) {
      this.a(auz.nI, 1.0F, 1.0F);
   }

   @Override
   public void b(ty $$0) {
   }

   @Override
   public void a(ty $$0) {
   }

   @Override
   public boq a(ckl $$0, bop $$1) {
      if (this.dN().B) {
         return boq.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<brg> $$4 = this.dN().a(brg.class, new eta(this.ds() - 7.0, this.du() - 7.0, this.dy() - 7.0, this.ds() + 7.0, this.du() + 7.0, this.dy() + 7.0));

         for (brg $$5 : $$4) {
            if ($$5.ge() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.am();
            if ($$0.gb().d) {
               for (brg $$7 : $$4) {
                  if ($$7.gc() && $$7.ge() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dur.b, $$0);
         }

         return boq.b;
      }
   }

   @Override
   public boolean z() {
      return this.dN().a_(this.c).a(avo.S);
   }

   public static cgp b(czu $$0, im $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cgp $$6 : $$0.a(cgp.class, new eta((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.D().equals($$1)) {
            return $$6;
         }
      }

      cgp $$7 = new cgp($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void C() {
      this.a(auz.nJ, 1.0F, 1.0F);
   }

   @Override
   public yz<abk> dj() {
      return new abl(this, 0, this.D());
   }

   @Override
   public etf q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public csd dA() {
      return new csd(csg.uK);
   }
}
