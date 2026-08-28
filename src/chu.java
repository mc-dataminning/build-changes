import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class chu extends cgu {
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
   ezr cj = ezr.c;

   public chu(bup<? extends chu> $$0, dff $$1) {
      super($$0, $$1);
      this.af.b((long)this.as());
      this.ch = 1.0F / (this.af.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void D() {
      this.bS.a(0, new chu.b(this));
      this.bS.a(1, new chu.a());
   }

   public static bwl.a gv() {
      return bvg.E().a(bwm.s, 10.0);
   }

   @Override
   protected awn w() {
      return awo.zd;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.zf;
   }

   @Override
   protected awn o_() {
      return awo.ze;
   }

   protected awn t() {
      return awo.zg;
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected float fj() {
      return 0.4F;
   }

   @Override
   protected bui.b bi() {
      return bui.b.c;
   }

   @Nullable
   @Override
   public btz a(arq $$0, btz $$1) {
      return bup.aX.a($$0, buo.e);
   }

   @Override
   protected double bf() {
      return 0.08;
   }

   @Override
   public void n_() {
      super.n_();
      this.bZ = this.bY;
      this.cb = this.ca;
      this.cd = this.cc;
      this.cf = this.ce;
      this.cc = this.cc + this.ch;
      if ((double)this.cc > Math.PI * 2) {
         if (this.dY().C) {
            this.cc = (float) (Math.PI * 2);
         } else {
            this.cc -= (float) (Math.PI * 2);
            if (this.af.a(10) == 0) {
               this.ch = 1.0F / (this.af.i() + 1.0F) * 0.2F;
            }

            this.dY().a(this, (byte)19);
         }
      }

      if (this.bo()) {
         if (this.cc < (float) Math.PI) {
            float $$0 = this.cc / (float) Math.PI;
            this.ce = azn.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               if (this.dk()) {
                  this.h(this.cj);
               }

               this.ci = 1.0F;
            } else {
               this.ci *= 0.8F;
            }
         } else {
            this.ce = 0.0F;
            if (this.dk()) {
               this.h(this.dB().c(0.9));
            }

            this.ci *= 0.99F;
         }

         ezr $$1 = this.dB();
         double $$2 = $$1.i();
         this.aX = this.aX + (-((float)azn.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aX) * 0.1F;
         this.v(this.aX);
         this.ca = this.ca + (float) Math.PI * this.ci * 1.5F;
         this.bY = this.bY + (-((float)azn.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bY) * 0.1F;
      } else {
         this.ce = azn.e(azn.a(this.cc)) * (float) Math.PI * 0.25F;
         if (!this.dY().C) {
            double $$3 = this.dB().e;
            if (this.b(btp.y)) {
               $$3 = 0.05 * (double)(this.c(btp.y).e() + 1);
            } else {
               $$3 -= this.bg();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bY = this.bY + (-90.0F - this.bY) * 0.02F;
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (super.a($$0, $$1) && this.et() != null) {
         if (!this.dY().C) {
            this.y();
         }

         return true;
      } else {
         return false;
      }
   }

   private ezr k(ezr $$0) {
      ezr $$1 = $$0.a(this.bZ * (float) (Math.PI / 180.0));
      return $$1.b(-this.aY * (float) (Math.PI / 180.0));
   }

   private void y() {
      this.b(this.t());
      ezr $$0 = this.k(new ezr(0.0, -1.0, 0.0)).b(this.dD(), this.dF(), this.dJ());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         ezr $$2 = this.k(new ezr((double)this.af.i() * 0.6 - 0.3, -1.0, (double)this.af.i() * 0.6 - 0.3));
         float $$3 = this.p_() ? 0.1F : 0.3F;
         ezr $$4 = $$2.c((double)($$3 + this.af.i() * 2.0F));
         ((arq)this.dY()).a(this.q(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lq q() {
      return ls.ai;
   }

   @Override
   public void a_(ezr $$0) {
      if (this.dk()) {
         this.a(bvi.a, this.dB());
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

   public boolean gw() {
      return this.cj.h() > 1.0E-5F;
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      bvx $$4 = Objects.requireNonNullElseGet($$3, () -> new btz.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends ccc {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bve $$0 = chu.this.et();
         return chu.this.bl() && $$0 != null ? chu.this.g((bui)$$0) < 100.0 : false;
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
         bve $$0 = chu.this.et();
         if ($$0 != null) {
            ezr $$1 = new ezr(chu.this.dD() - $$0.dD(), chu.this.dF() - $$0.dF(), chu.this.dJ() - $$0.dJ());
            dvo $$2 = chu.this.dY().a_(jh.a(chu.this.dD() + $$1.d, chu.this.dF() + $$1.e, chu.this.dJ() + $$1.f));
            ero $$3 = chu.this.dY().b_(jh.a(chu.this.dD() + $$1.d, chu.this.dF() + $$1.e, chu.this.dJ() + $$1.f));
            if ($$3.a(axj.a) || $$2.l()) {
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

               chu.this.cj = new ezr($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               chu.this.dY().a(ls.d, chu.this.dD(), chu.this.dF(), chu.this.dJ(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends ccc {
      private final chu a;

      public b(final chu $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public void a() {
         int $$0 = this.a.ex();
         if ($$0 > 100) {
            this.a.cj = ezr.c;
         } else if (this.a.eb().a(b(50)) == 0 || !this.a.ah || !this.a.gw()) {
            float $$1 = this.a.eb().i() * (float) (Math.PI * 2);
            this.a.cj = new ezr((double)(azn.b($$1) * 0.2F), (double)(-0.1F + this.a.eb().i() * 0.2F), (double)(azn.a($$1) * 0.2F));
         }
      }
   }
}
