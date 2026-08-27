import java.util.List;
import javax.annotation.Nullable;

public class cge extends cgc {
   public static final double e = 0.375;

   public cge(bqg<? extends cge> $$0, czg $$1) {
      super($$0, $$1);
   }

   public cge(czg $$0, id $$1) {
      super(bqg.ak, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void y() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ai().k() / 2.0;
      double $$1 = (double)this.ai().l();
      this.a(new ese(this.dr() - $$0, this.dt(), this.dx() - $$0, this.dr() + $$0, this.dt() + $$1, this.dx() + $$0));
   }

   @Override
   public void a(ij $$0) {
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
   public void b(@Nullable bqa $$0) {
      this.a(auo.nD, 1.0F, 1.0F);
   }

   @Override
   public void b(to $$0) {
   }

   @Override
   public void a(to $$0) {
   }

   @Override
   public bof a(cka $$0, boe $$1) {
      if (this.dM().B) {
         return bof.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bqv> $$4 = this.dM().a(bqv.class, new ese(this.dr() - 7.0, this.dt() - 7.0, this.dx() - 7.0, this.dr() + 7.0, this.dt() + 7.0, this.dx() + 7.0));

         for (bqv $$5 : $$4) {
            if ($$5.gc() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.am();
            if ($$0.ga().d) {
               for (bqv $$7 : $$4) {
                  if ($$7.gb() && $$7.gc() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dub.b, $$0);
         }

         return bof.b;
      }
   }

   @Override
   public boolean z() {
      return this.dM().a_(this.c).a(ave.S);
   }

   public static cge b(czg $$0, id $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cge $$6 : $$0.a(cge.class, new ese((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.D().equals($$1)) {
            return $$6;
         }
      }

      cge $$7 = new cge($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void C() {
      this.a(auo.nE, 1.0F, 1.0F);
   }

   @Override
   public yp<aba> di() {
      return new abb(this, 0, this.D());
   }

   @Override
   public esj q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public crs dz() {
      return new crs(crv.uI);
   }
}
