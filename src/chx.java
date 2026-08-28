import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class chx extends cgx {
   public float bY;
   public float bZ;
   public float ca;
   public float cb;
   public float cc;
   public float cd;
   public float ce;
   public float cf;
   private float cg;
   private float ch;
   private float ci;
   ezy cj = ezy.c;

   public chx(bus<? extends chx> $$0, dfm $$1) {
      super($$0, $$1);
      this.ae.b((long)this.ar());
      this.ch = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void B() {
      this.bS.a(0, new chx.b(this));
      this.bS.a(1, new chx.a());
   }

   public static bwo.a gm() {
      return bvj.C().a(bwp.s, 10.0);
   }

   @Override
   protected awm t() {
      return awn.zd;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.zf;
   }

   @Override
   protected awm n_() {
      return awn.ze;
   }

   protected awm q() {
      return awn.zg;
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
   protected bul.b bg() {
      return bul.b.c;
   }

   @Nullable
   @Override
   public buc a(arp $$0, buc $$1) {
      return bus.bn.a($$0, bur.e);
   }

   @Override
   protected double bd() {
      return 0.08;
   }

   @Override
   public void d_() {
      super.d_();
      this.bZ = this.bY;
      this.cb = this.ca;
      this.cd = this.cc;
      this.cf = this.ce;
      this.cc = this.cc + this.ch;
      if ((double)this.cc > Math.PI * 2) {
         if (this.dV().C) {
            this.cc = (float) (Math.PI * 2);
         } else {
            this.cc -= (float) (Math.PI * 2);
            if (this.ae.a(10) == 0) {
               this.ch = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
            }

            this.dV().a(this, (byte)19);
         }
      }

      if (this.bm()) {
         if (this.cc < (float) Math.PI) {
            float $$0 = this.cc / (float) Math.PI;
            this.ce = azm.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               if (this.di()) {
                  this.h(this.cj);
               }

               this.ci = 1.0F;
            } else {
               this.ci *= 0.8F;
            }
         } else {
            this.ce = 0.0F;
            if (this.di()) {
               this.h(this.dy().c(0.9));
            }

            this.ci *= 0.99F;
         }

         ezy $$1 = this.dy();
         double $$2 = $$1.i();
         this.aW = this.aW + (-((float)azm.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aW) * 0.1F;
         this.v(this.aW);
         this.ca = this.ca + (float) Math.PI * this.ci * 1.5F;
         this.bY = this.bY + (-((float)azm.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bY) * 0.1F;
      } else {
         this.ce = azm.e(azm.a(this.cc)) * (float) Math.PI * 0.25F;
         if (!this.dV().C) {
            double $$3 = this.dy().e;
            if (this.b(bts.y)) {
               $$3 = 0.05 * (double)(this.c(bts.y).e() + 1);
            } else {
               $$3 -= this.be();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bY = this.bY + (-90.0F - this.bY) * 0.02F;
      }
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (super.a($$0, $$1, $$2) && this.ep() != null) {
         this.v();
         return true;
      } else {
         return false;
      }
   }

   private ezy k(ezy $$0) {
      ezy $$1 = $$0.a(this.bZ * (float) (Math.PI / 180.0));
      return $$1.b(-this.aX * (float) (Math.PI / 180.0));
   }

   private void v() {
      this.b(this.q());
      ezy $$0 = this.k(new ezy(0.0, -1.0, 0.0)).b(this.dA(), this.dC(), this.dG());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         ezy $$2 = this.k(new ezy((double)this.ae.i() * 0.6 - 0.3, -1.0, (double)this.ae.i() * 0.6 - 0.3));
         float $$3 = this.e_() ? 0.1F : 0.3F;
         ezy $$4 = $$2.c((double)($$3 + this.ae.i() * 2.0F));
         ((arp)this.dV()).a(this.n(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lq n() {
      return ls.ai;
   }

   @Override
   public void a_(ezy $$0) {
      if (this.di()) {
         this.a(bvl.a, this.dy());
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.cc = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public boolean gn() {
      return this.cj.h() > 1.0E-5F;
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      bwa $$4 = Objects.requireNonNullElseGet($$3, () -> new buc.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends ccf {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bvh $$0 = chx.this.ep();
         return chx.this.bj() && $$0 != null ? chx.this.g((bul)$$0) < 100.0 : false;
      }

      @Override
      public void d() {
         this.e = 0;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         this.e++;
         bvh $$0 = chx.this.ep();
         if ($$0 != null) {
            ezy $$1 = new ezy(chx.this.dA() - $$0.dA(), chx.this.dC() - $$0.dC(), chx.this.dG() - $$0.dG());
            dvv $$2 = chx.this.dV().a_(jh.a(chx.this.dA() + $$1.d, chx.this.dC() + $$1.e, chx.this.dG() + $$1.f));
            erv $$3 = chx.this.dV().b_(jh.a(chx.this.dA() + $$1.d, chx.this.dC() + $$1.e, chx.this.dG() + $$1.f));
            if ($$3.a(axi.a) || $$2.l()) {
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

               chx.this.cj = new ezy($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               chx.this.dV().a(ls.d, chx.this.dA(), chx.this.dC(), chx.this.dG(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends ccf {
      private final chx a;

      public b(final chx $$0) {
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
            this.a.cj = ezy.c;
         } else if (this.a.dY().a(b(50)) == 0 || !this.a.ag || !this.a.gn()) {
            float $$1 = this.a.dY().i() * (float) (Math.PI * 2);
            this.a.cj = new ezy((double)(azm.b($$1) * 0.2F), (double)(-0.1F + this.a.dY().i() * 0.2F), (double)(azm.a($$1) * 0.2F));
         }
      }
   }
}
