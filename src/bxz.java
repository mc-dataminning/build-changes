import java.util.List;
import javax.annotation.Nullable;

public class bxz extends bxx {
   public static final double e = 0.375;

   public bxz(bim<? extends bxz> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public bxz(cpl $$0, gu $$1) {
      super(bim.ah, $$0, $$1);
      this.e((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void s() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ag().k() / 2.0;
      double $$1 = (double)this.ag().l();
      this.a(new egy(this.dp() - $$0, this.dr(), this.dv() - $$0, this.dp() + $$0, this.dr() + $$1, this.dv() + $$0));
   }

   @Override
   public void a(ha $$0) {
   }

   @Override
   public int v() {
      return 9;
   }

   @Override
   public int w() {
      return 9;
   }

   @Override
   protected float a(bjk $$0, bij $$1) {
      return 0.0625F;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(@Nullable bii $$0) {
      this.a(aow.mq, 1.0F, 1.0F);
   }

   @Override
   public void b(qr $$0) {
   }

   @Override
   public void a(qr $$0) {
   }

   @Override
   public bgq a(cbm $$0, bgp $$1) {
      if (this.dK().B) {
         return bgq.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bja> $$4 = this.dK().a(bja.class, new egy(this.dp() - 7.0, this.dr() - 7.0, this.dv() - 7.0, this.dp() + 7.0, this.dr() + 7.0, this.dv() + 7.0));

         for (bja $$5 : $$4) {
            if ($$5.fP() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.ak();
            if ($$0.fR().d) {
               for (bja $$7 : $$4) {
                  if ($$7.fO() && $$7.fP() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(djj.b, $$0);
         }

         return bgq.b;
      }
   }

   @Override
   public boolean t() {
      return this.dK().a_(this.c).a(apl.S);
   }

   public static bxz b(cpl $$0, gu $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (bxz $$6 : $$0.a(bxz.class, new egy((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.y().equals($$1)) {
            return $$6;
         }
      }

      bxz $$7 = new bxz($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void x() {
      this.a(aow.mr, 1.0F, 1.0F);
   }

   @Override
   public ux<wp> U() {
      return new wq(this, 0, this.y());
   }

   @Override
   public ehd q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cix dx() {
      return new cix(cja.tQ);
   }
}
