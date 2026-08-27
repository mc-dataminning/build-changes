import java.util.List;
import javax.annotation.Nullable;

public class byc extends bya {
   public static final double e = 0.375;

   public byc(bip<? extends byc> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public byc(cpq $$0, gw $$1) {
      super(bip.ah, $$0, $$1);
      this.e((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void s() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ag().k() / 2.0;
      double $$1 = (double)this.ag().l();
      this.a(new ehd(this.dp() - $$0, this.dr(), this.dv() - $$0, this.dp() + $$0, this.dr() + $$1, this.dv() + $$0));
   }

   @Override
   public void a(hc $$0) {
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
   protected float a(bjn $$0, bim $$1) {
      return 0.0625F;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(@Nullable bil $$0) {
      this.a(aoz.mq, 1.0F, 1.0F);
   }

   @Override
   public void b(qu $$0) {
   }

   @Override
   public void a(qu $$0) {
   }

   @Override
   public bgt a(cbp $$0, bgs $$1) {
      if (this.dK().B) {
         return bgt.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bjd> $$4 = this.dK().a(bjd.class, new ehd(this.dp() - 7.0, this.dr() - 7.0, this.dv() - 7.0, this.dp() + 7.0, this.dr() + 7.0, this.dv() + 7.0));

         for (bjd $$5 : $$4) {
            if ($$5.fP() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.ak();
            if ($$0.fR().d) {
               for (bjd $$7 : $$4) {
                  if ($$7.fO() && $$7.fP() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(djo.b, $$0);
         }

         return bgt.b;
      }
   }

   @Override
   public boolean t() {
      return this.dK().a_(this.c).a(apo.S);
   }

   public static byc b(cpq $$0, gw $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (byc $$6 : $$0.a(byc.class, new ehd((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.y().equals($$1)) {
            return $$6;
         }
      }

      byc $$7 = new byc($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void x() {
      this.a(aoz.mr, 1.0F, 1.0F);
   }

   @Override
   public va<ws> U() {
      return new wt(this, 0, this.y());
   }

   @Override
   public ehi q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cja dx() {
      return new cja(cjd.tQ);
   }
}
