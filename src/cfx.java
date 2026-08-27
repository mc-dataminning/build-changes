import java.util.List;
import javax.annotation.Nullable;

public class cfx extends cfv {
   public static final double e = 0.375;

   public cfx(bqb<? extends cfx> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public cfx(cyx $$0, ib $$1) {
      super(bqb.ak, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void y() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ai().k() / 2.0;
      double $$1 = (double)this.ai().l();
      this.a(new erv(this.dr() - $$0, this.dt(), this.dx() - $$0, this.dr() + $$0, this.dt() + $$1, this.dx() + $$0));
   }

   @Override
   public void a(ih $$0) {
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
   public void b(@Nullable bpv $$0) {
      this.a(aum.nD, 1.0F, 1.0F);
   }

   @Override
   public void b(tm $$0) {
   }

   @Override
   public void a(tm $$0) {
   }

   @Override
   public boa a(cjt $$0, bnz $$1) {
      if (this.dM().B) {
         return boa.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bqq> $$4 = this.dM().a(bqq.class, new erv(this.dr() - 7.0, this.dt() - 7.0, this.dx() - 7.0, this.dr() + 7.0, this.dt() + 7.0, this.dx() + 7.0));

         for (bqq $$5 : $$4) {
            if ($$5.gc() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.am();
            if ($$0.ga().d) {
               for (bqq $$7 : $$4) {
                  if ($$7.gb() && $$7.gc() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dts.b, $$0);
         }

         return boa.b;
      }
   }

   @Override
   public boolean z() {
      return this.dM().a_(this.c).a(avc.S);
   }

   public static cfx b(cyx $$0, ib $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cfx $$6 : $$0.a(cfx.class, new erv((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.D().equals($$1)) {
            return $$6;
         }
      }

      cfx $$7 = new cfx($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void C() {
      this.a(aum.nE, 1.0F, 1.0F);
   }

   @Override
   public yn<aay> di() {
      return new aaz(this, 0, this.D());
   }

   @Override
   public esa q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public crj dz() {
      return new crj(crm.uI);
   }
}
