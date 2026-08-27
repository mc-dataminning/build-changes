import java.util.List;
import javax.annotation.Nullable;

public class cbn extends cbl {
   public static final double e = 0.375;

   public cbn(bly<? extends cbn> $$0, cto $$1) {
      super($$0, $$1);
   }

   public cbn(cto $$0, hx $$1) {
      super(bly.ai, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void z() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ai().k() / 2.0;
      double $$1 = (double)this.ai().l();
      this.a(new eln(this.dr() - $$0, this.dt(), this.dx() - $$0, this.dr() + $$0, this.dt() + $$1, this.dx() + $$0));
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
   protected float a(bmw $$0, blv $$1) {
      return 0.0625F;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(@Nullable blu $$0) {
      this.a(arr.ne, 1.0F, 1.0F);
   }

   @Override
   public void b(sn $$0) {
   }

   @Override
   public void a(sn $$0) {
   }

   @Override
   public bka a(cfh $$0, bjz $$1) {
      if (this.dM().B) {
         return bka.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bmm> $$4 = this.dM().a(bmm.class, new eln(this.dr() - 7.0, this.dt() - 7.0, this.dx() - 7.0, this.dr() + 7.0, this.dt() + 7.0, this.dx() + 7.0));

         for (bmm $$5 : $$4) {
            if ($$5.fT() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.am();
            if ($$0.fT().d) {
               for (bmm $$7 : $$4) {
                  if ($$7.fS() && $$7.fT() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dnq.b, $$0);
         }

         return bka.b;
      }
   }

   @Override
   public boolean A() {
      return this.dM().a_(this.c).a(asg.S);
   }

   public static cbn b(cto $$0, hx $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cbn $$6 : $$0.a(cbn.class, new eln((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.E().equals($$1)) {
            return $$6;
         }
      }

      cbn $$7 = new cbn($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void D() {
      this.a(arr.nf, 1.0F, 1.0F);
   }

   @Override
   public xf<za> dj() {
      return new zb(this, 0, this.E());
   }

   @Override
   public els q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cmx dz() {
      return new cmx(cna.uD);
   }
}
