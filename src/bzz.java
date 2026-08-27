import java.util.List;
import javax.annotation.Nullable;

public class bzz extends bzx {
   public static final double e = 0.375;

   public bzz(bkm<? extends bzz> $$0, crs $$1) {
      super($$0, $$1);
   }

   public bzz(crs $$0, ht $$1) {
      super(bkm.ah, $$0, $$1);
      this.e((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void y() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ag().k() / 2.0;
      double $$1 = (double)this.ag().l();
      this.a(new ejd(this.dq() - $$0, this.ds(), this.dw() - $$0, this.dq() + $$0, this.ds() + $$1, this.dw() + $$0));
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
   protected float a(blk $$0, bkj $$1) {
      return 0.0625F;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(@Nullable bki $$0) {
      this.a(aqn.mu, 1.0F, 1.0F);
   }

   @Override
   public void b(rz $$0) {
   }

   @Override
   public void a(rz $$0) {
   }

   @Override
   public biq a(cdm $$0, bip $$1) {
      if (this.dL().B) {
         return biq.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bla> $$4 = this.dL().a(bla.class, new ejd(this.dq() - 7.0, this.ds() - 7.0, this.dw() - 7.0, this.dq() + 7.0, this.ds() + 7.0, this.dw() + 7.0));

         for (bla $$5 : $$4) {
            if ($$5.fT() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.ak();
            if ($$0.fT().d) {
               for (bla $$7 : $$4) {
                  if ($$7.fS() && $$7.fT() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dlg.b, $$0);
         }

         return biq.b;
      }
   }

   @Override
   public boolean z() {
      return this.dL().a_(this.c).a(arc.S);
   }

   public static bzz b(crs $$0, ht $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (bzz $$6 : $$0.a(bzz.class, new ejd((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.E().equals($$1)) {
            return $$6;
         }
      }

      bzz $$7 = new bzz($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void C() {
      this.a(aqn.mv, 1.0F, 1.0F);
   }

   @Override
   public wk<yd> di() {
      return new ye(this, 0, this.E());
   }

   @Override
   public eji q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public clb dy() {
      return new clb(cle.tR);
   }
}
