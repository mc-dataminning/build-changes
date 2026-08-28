import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class ctu extends csr implements cta {
   public static final dkd d = new dlc(true, false, Optional.empty(), mh.e.a(axn.cF).map(Function.identity()));
   public static final double e = 0.25;

   public ctu(bxn<? extends ctu> $$0, dkj $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public ctu(bxn<? extends ctu> $$0, dkj $$1, bxe $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   ctu(bxn<? extends ctu> $$0, double $$1, double $$2, double $$3, fgc $$4, dkj $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected ffx c(fgc $$0) {
      float $$1 = this.an().n().a() / 2.0F;
      float $$2 = this.an().n().b();
      float $$3 = 0.15F;
      return new ffx($$0.d - (double)$$1, $$0.e - 0.15F, $$0.f - (double)$$1, $$0.d + (double)$$1, $$0.e - 0.15F + (double)$$2, $$0.f + (double)$$1);
   }

   @Override
   public boolean i(bxe $$0) {
      return $$0 instanceof ctu ? false : super.i($$0);
   }

   @Override
   protected boolean b(bxe $$0) {
      if ($$0 instanceof ctu) {
         return false;
      } else {
         return $$0.an() == bxn.S ? false : super.b($$0);
      }
   }

   @Override
   protected void a(ffz $$0) {
      super.a($$0);
      if (this.dV() instanceof asb $$1) {
         byf $$4 = this.p() instanceof byf $$3 ? $$3 : null;
         bxe $$5 = $$0.a();
         if ($$4 != null) {
            $$4.B($$5);
         }

         bvt $$6 = this.dW().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof byf $$7) {
            dgz.a($$1, (bxe)$$7, $$6);
         }

         this.a(this.dt());
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(fgc var1);

   @Override
   protected void a(ffy $$0) {
      super.a($$0);
      if (!this.dV().C) {
         kb $$1 = $$0.c().q();
         fgc $$2 = fgc.a($$1).d(0.25, 0.25, 0.25);
         fgc $$3 = $$0.g().e($$2);
         this.a($$3);
         this.aq();
      }
   }

   @Override
   protected void a(fga $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.aq();
      }
   }

   @Override
   protected boolean f() {
      return false;
   }

   @Override
   public dak e() {
      return dak.l;
   }

   @Override
   protected float l() {
      return 1.0F;
   }

   @Override
   protected float m() {
      return this.l();
   }

   @Nullable
   @Override
   protected lx i() {
      return null;
   }

   @Override
   public void g() {
      if (!this.dV().C && this.dB() > this.dV().ao() + 30) {
         this.a(this.dt());
         this.aq();
      } else {
         super.g();
      }
   }
}
