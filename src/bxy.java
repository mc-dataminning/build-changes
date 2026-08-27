import java.util.List;
import javax.annotation.Nullable;

public class bxy extends bxw {
   public static final double e = 0.375;

   public bxy(bik<? extends bxy> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public bxy(cpk $$0, gv $$1) {
      super(bik.ah, $$0, $$1);
      this.e((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void s() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ag().k() / 2.0;
      double $$1 = (double)this.ag().l();
      this.a(new eha(this.dp() - $$0, this.dr(), this.dv() - $$0, this.dp() + $$0, this.dr() + $$1, this.dv() + $$0));
   }

   @Override
   public void a(hb $$0) {
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
   protected float a(bji $$0, bih $$1) {
      return 0.0625F;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(@Nullable big $$0) {
      this.a(aou.mq, 1.0F, 1.0F);
   }

   @Override
   public void b(qs $$0) {
   }

   @Override
   public void a(qs $$0) {
   }

   @Override
   public bgo a(cbl $$0, bgn $$1) {
      if (this.dK().B) {
         return bgo.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<biy> $$4 = this.dK().a(biy.class, new eha(this.dp() - 7.0, this.dr() - 7.0, this.dv() - 7.0, this.dp() + 7.0, this.dr() + 7.0, this.dv() + 7.0));

         for (biy $$5 : $$4) {
            if ($$5.fP() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.ak();
            if ($$0.fR().d) {
               for (biy $$7 : $$4) {
                  if ($$7.fO() && $$7.fP() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dji.b, $$0);
         }

         return bgo.b;
      }
   }

   @Override
   public boolean t() {
      return this.dK().a_(this.c).a(apj.S);
   }

   public static bxy b(cpk $$0, gv $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (bxy $$6 : $$0.a(bxy.class, new eha((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.y().equals($$1)) {
            return $$6;
         }
      }

      bxy $$7 = new bxy($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void x() {
      this.a(aou.mr, 1.0F, 1.0F);
   }

   @Override
   public uw<wo> U() {
      return new wp(this, 0, this.y());
   }

   @Override
   public ehf q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public ciw dx() {
      return new ciw(ciz.tQ);
   }
}
