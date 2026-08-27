import java.util.List;
import javax.annotation.Nullable;

public class cbv extends cbt {
   public static final double e = 0.375;

   public cbv(bmc<? extends cbv> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cbv(ctx $$0, hx $$1) {
      super(bmc.aj, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void z() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ai().k() / 2.0;
      double $$1 = (double)this.ai().l();
      this.b(new elx(this.dq() - $$0, this.ds(), this.dw() - $$0, this.dq() + $$0, this.ds() + $$1, this.dw() + $$0));
   }

   @Override
   public void a(ic $$0) {
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
   public void a(@Nullable blw $$0) {
      this.a(art.nt, 1.0F, 1.0F);
   }

   @Override
   public void b(so $$0) {
   }

   @Override
   public void a(so $$0) {
   }

   @Override
   public bkc a(cfq $$0, bkb $$1) {
      if (this.dL().B) {
         return bkc.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bmq> $$4 = this.dL().a(bmq.class, new elx(this.dq() - 7.0, this.ds() - 7.0, this.dw() - 7.0, this.dq() + 7.0, this.ds() + 7.0, this.dw() + 7.0));

         for (bmq $$5 : $$4) {
            if ($$5.fU() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.am();
            if ($$0.fT().d) {
               for (bmq $$7 : $$4) {
                  if ($$7.fT() && $$7.fU() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dnz.b, $$0);
         }

         return bkc.b;
      }
   }

   @Override
   public boolean A() {
      return this.dL().a_(this.c).a(asi.S);
   }

   public static cbv b(ctx $$0, hx $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cbv $$6 : $$0.a(cbv.class, new elx((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.E().equals($$1)) {
            return $$6;
         }
      }

      cbv $$7 = new cbv($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void D() {
      this.a(art.nu, 1.0F, 1.0F);
   }

   @Override
   public xg<zb> di() {
      return new zc(this, 0, this.E());
   }

   @Override
   public emc q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cng dy() {
      return new cng(cnj.uG);
   }
}
