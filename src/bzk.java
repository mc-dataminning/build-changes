import java.util.List;
import javax.annotation.Nullable;

public class bzk extends bzi {
   public static final double e = 0.375;

   public bzk(bjx<? extends bzk> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public bzk(cqz $$0, ht $$1) {
      super(bjx.ah, $$0, $$1);
      this.e((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void y() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ag().k() / 2.0;
      double $$1 = (double)this.ag().l();
      this.a(new eia(this.dq() - $$0, this.ds(), this.dw() - $$0, this.dq() + $$0, this.ds() + $$1, this.dw() + $$0));
   }

   @Override
   public void a(hx $$0) {
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
   protected float a(bkv $$0, bju $$1) {
      return 0.0625F;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(@Nullable bjt $$0) {
      this.a(aqd.ms, 1.0F, 1.0F);
   }

   @Override
   public void b(rt $$0) {
   }

   @Override
   public void a(rt $$0) {
   }

   @Override
   public bib a(ccx $$0, bia $$1) {
      if (this.dL().B) {
         return bib.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bkl> $$4 = this.dL().a(bkl.class, new eia(this.dq() - 7.0, this.ds() - 7.0, this.dw() - 7.0, this.dq() + 7.0, this.ds() + 7.0, this.dw() + 7.0));

         for (bkl $$5 : $$4) {
            if ($$5.fT() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.ak();
            if ($$0.fT().d) {
               for (bkl $$7 : $$4) {
                  if ($$7.fS() && $$7.fT() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dkl.b, $$0);
         }

         return bib.b;
      }
   }

   @Override
   public boolean z() {
      return this.dL().a_(this.c).a(aqs.S);
   }

   public static bzk b(cqz $$0, ht $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (bzk $$6 : $$0.a(bzk.class, new eia((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.E().equals($$1)) {
            return $$6;
         }
      }

      bzk $$7 = new bzk($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void C() {
      this.a(aqd.mt, 1.0F, 1.0F);
   }

   @Override
   public wb<xu> di() {
      return new xv(this, 0, this.E());
   }

   @Override
   public eif q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public ckj dy() {
      return new ckj(ckm.tQ);
   }
}
