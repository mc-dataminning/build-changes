import java.util.List;
import javax.annotation.Nullable;

public class cay extends caw {
   public static final double e = 0.375;

   public cay(blj<? extends cay> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cay(csy $$0, hv $$1) {
      super(blj.ai, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void z() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ai().k() / 2.0;
      double $$1 = (double)this.ai().l();
      this.a(new ekw(this.dr() - $$0, this.dt(), this.dx() - $$0, this.dr() + $$0, this.dt() + $$1, this.dx() + $$0));
   }

   @Override
   public void a(ia $$0) {
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
   protected float a(bmh $$0, blg $$1) {
      return 0.0625F;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(@Nullable blf $$0) {
      this.a(arc.ne, 1.0F, 1.0F);
   }

   @Override
   public void b(sj $$0) {
   }

   @Override
   public void a(sj $$0) {
   }

   @Override
   public bjl a(cer $$0, bjk $$1) {
      if (this.dM().B) {
         return bjl.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<blx> $$4 = this.dM().a(blx.class, new ekw(this.dr() - 7.0, this.dt() - 7.0, this.dx() - 7.0, this.dr() + 7.0, this.dt() + 7.0, this.dx() + 7.0));

         for (blx $$5 : $$4) {
            if ($$5.fT() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.am();
            if ($$0.fT().d) {
               for (blx $$7 : $$4) {
                  if ($$7.fS() && $$7.fT() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dmz.b, $$0);
         }

         return bjl.b;
      }
   }

   @Override
   public boolean A() {
      return this.dM().a_(this.c).a(arr.S);
   }

   public static cay b(csy $$0, hv $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cay $$6 : $$0.a(cay.class, new ekw((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.E().equals($$1)) {
            return $$6;
         }
      }

      cay $$7 = new cay($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void D() {
      this.a(arc.nf, 1.0F, 1.0F);
   }

   @Override
   public wu<yo> dj() {
      return new yp(this, 0, this.E());
   }

   @Override
   public elb q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cmh dz() {
      return new cmh(cmk.uD);
   }
}
