import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class cir extends chr {
   public float bZ;
   public float ca;
   public float cb;
   public float cc;
   public float cd;
   public float ce;
   public float cf;
   public float cg;
   private float ch;
   private float ci;
   private float cj;
   fbs ck = fbs.c;

   public cir(bvm<? extends cir> $$0, dha $$1) {
      super($$0, $$1);
      this.ae.b((long)this.ar());
      this.ci = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void B() {
      this.bT.a(0, new cir.b(this));
      this.bT.a(1, new cir.a());
   }

   public static bxi.a gm() {
      return bwd.C().a(bxj.s, 10.0);
   }

   @Override
   protected axe u() {
      return axf.zx;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.zz;
   }

   @Override
   protected axe o_() {
      return axf.zy;
   }

   protected axe t() {
      return axf.zA;
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected bvf.b bg() {
      return bvf.b.c;
   }

   @Nullable
   @Override
   public buw a(ash $$0, buw $$1) {
      return bvm.br.a($$0, bvl.e);
   }

   @Override
   protected double bd() {
      return 0.08;
   }

   @Override
   public void d_() {
      super.d_();
      this.ca = this.bZ;
      this.cc = this.cb;
      this.ce = this.cd;
      this.cg = this.cf;
      this.cd = this.cd + this.ci;
      if ((double)this.cd > Math.PI * 2) {
         if (this.dV().C) {
            this.cd = (float) (Math.PI * 2);
         } else {
            this.cd -= (float) (Math.PI * 2);
            if (this.ae.a(10) == 0) {
               this.ci = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
            }

            this.dV().a(this, (byte)19);
         }
      }

      if (this.bm()) {
         if (this.cd < (float) Math.PI) {
            float $$0 = this.cd / (float) Math.PI;
            this.cf = bae.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               if (this.di()) {
                  this.h(this.ck);
               }

               this.cj = 1.0F;
            } else {
               this.cj *= 0.8F;
            }
         } else {
            this.cf = 0.0F;
            if (this.di()) {
               this.h(this.dy().c(0.9));
            }

            this.cj *= 0.99F;
         }

         fbs $$1 = this.dy();
         double $$2 = $$1.i();
         this.aX = this.aX + (-((float)bae.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aX) * 0.1F;
         this.v(this.aX);
         this.cb = this.cb + (float) Math.PI * this.cj * 1.5F;
         this.bZ = this.bZ + (-((float)bae.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bZ) * 0.1F;
      } else {
         this.cf = bae.e(bae.a(this.cd)) * (float) Math.PI * 0.25F;
         if (!this.dV().C) {
            double $$3 = this.dy().e;
            if (this.b(bum.y)) {
               $$3 = 0.05 * (double)(this.c(bum.y).e() + 1);
            } else {
               $$3 -= this.be();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bZ = this.bZ + (-90.0F - this.bZ) * 0.02F;
      }
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      if (super.a($$0, $$1, $$2) && this.ep() != null) {
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private fbs k(fbs $$0) {
      fbs $$1 = $$0.a(this.ca * (float) (Math.PI / 180.0));
      return $$1.b(-this.aY * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      fbs $$0 = this.k(new fbs(0.0, -1.0, 0.0)).b(this.dA(), this.dC(), this.dG());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         fbs $$2 = this.k(new fbs((double)this.ae.i() * 0.6 - 0.3, -1.0, (double)this.ae.i() * 0.6 - 0.3));
         float $$3 = this.e_() ? 0.1F : 0.3F;
         fbs $$4 = $$2.c((double)($$3 + this.ae.i() * 2.0F));
         ((ash)this.dV()).a(this.p(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lq p() {
      return ls.aj;
   }

   @Override
   public void a_(fbs $$0) {
      if (this.di()) {
         this.a(bwf.a, this.dy());
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.cd = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public boolean gn() {
      return this.ck.h() > 1.0E-5F;
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      bwu $$4 = Objects.requireNonNullElseGet($$3, () -> new buw.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends ccz {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bwb $$0 = cir.this.ep();
         return cir.this.bj() && $$0 != null ? cir.this.g((bvf)$$0) < 100.0 : false;
      }

      @Override
      public void d() {
         this.e = 0;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         this.e++;
         bwb $$0 = cir.this.ep();
         if ($$0 != null) {
            fbs $$1 = new fbs(cir.this.dA() - $$0.dA(), cir.this.dC() - $$0.dC(), cir.this.dG() - $$0.dG());
            dxn $$2 = cir.this.dV().a_(jh.a(cir.this.dA() + $$1.d, cir.this.dC() + $$1.e, cir.this.dG() + $$1.f));
            etp $$3 = cir.this.dV().b_(jh.a(cir.this.dA() + $$1.d, cir.this.dC() + $$1.e, cir.this.dG() + $$1.f));
            if ($$3.a(aya.a) || $$2.l()) {
               double $$4 = $$1.g();
               if ($$4 > 0.0) {
                  $$1.d();
                  double $$5 = 3.0;
                  if ($$4 > 5.0) {
                     $$5 -= ($$4 - 5.0) / 5.0;
                  }

                  if ($$5 > 0.0) {
                     $$1 = $$1.c($$5);
                  }
               }

               if ($$2.l()) {
                  $$1 = $$1.a(0.0, $$1.e, 0.0);
               }

               cir.this.ck = new fbs($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               cir.this.dV().a(ls.d, cir.this.dA(), cir.this.dC(), cir.this.dG(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends ccz {
      private final cir a;

      public b(final cir $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public void a() {
         int $$0 = this.a.et();
         if ($$0 > 100) {
            this.a.ck = fbs.c;
         } else if (this.a.dY().a(b(50)) == 0 || !this.a.ag || !this.a.gn()) {
            float $$1 = this.a.dY().i() * (float) (Math.PI * 2);
            this.a.ck = new fbs((double)(bae.b($$1) * 0.2F), (double)(-0.1F + this.a.dY().i() * 0.2F), (double)(bae.a($$1) * 0.2F));
         }
      }
   }
}
