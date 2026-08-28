import org.jetbrains.annotations.Nullable;

public class cgz extends cfz {
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
   private float cj;
   private float ck;
   private float cl;

   public cgz(btv<? extends cgz> $$0, deg $$1) {
      super($$0, $$1);
      this.af.b((long)this.ap());
      this.ch = 1.0F / (this.af.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void D() {
      this.bS.a(0, new cgz.b(this));
      this.bS.a(1, new cgz.a());
   }

   public static bvq.a gp() {
      return bum.E().a(bvr.s, 10.0);
   }

   @Override
   protected awd w() {
      return awe.zf;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.zh;
   }

   @Override
   protected awd n_() {
      return awe.zg;
   }

   protected awd t() {
      return awe.zi;
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   protected bto.b bf() {
      return bto.b.c;
   }

   @Nullable
   @Override
   public bth a(arh $$0, bth $$1) {
      return btv.aX.a($$0, btu.e);
   }

   @Override
   protected double bc() {
      return 0.08;
   }

   @Override
   public void m_() {
      super.m_();
      this.bZ = this.bY;
      this.cb = this.ca;
      this.cd = this.cc;
      this.cf = this.ce;
      this.cc = this.cc + this.ch;
      if ((double)this.cc > Math.PI * 2) {
         if (this.dS().B) {
            this.cc = (float) (Math.PI * 2);
         } else {
            this.cc -= (float) (Math.PI * 2);
            if (this.af.a(10) == 0) {
               this.ch = 1.0F / (this.af.i() + 1.0F) * 0.2F;
            }

            this.dS().a(this, (byte)19);
         }
      }

      if (this.bl()) {
         if (this.cc < (float) Math.PI) {
            float $$0 = this.cc / (float) Math.PI;
            this.ce = azd.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               this.cg = 1.0F;
               this.ci = 1.0F;
            } else {
               this.ci *= 0.8F;
            }
         } else {
            this.ce = 0.0F;
            this.cg *= 0.9F;
            this.ci *= 0.99F;
         }

         if (!this.dS().B) {
            this.n((double)(this.cj * this.cg), (double)(this.ck * this.cg), (double)(this.cl * this.cg));
         }

         eys $$1 = this.dv();
         double $$2 = $$1.i();
         this.aT = this.aT + (-((float)azd.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aT) * 0.1F;
         this.v(this.aT);
         this.ca = this.ca + (float) Math.PI * this.ci * 1.5F;
         this.bY = this.bY + (-((float)azd.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bY) * 0.1F;
      } else {
         this.ce = azd.e(azd.a(this.cc)) * (float) Math.PI * 0.25F;
         if (!this.dS().B) {
            double $$3 = this.dv().e;
            if (this.b(bsx.y)) {
               $$3 = 0.05 * (double)(this.c(bsx.y).e() + 1);
            } else {
               $$3 -= this.bd();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bY = this.bY + (-90.0F - this.bY) * 0.02F;
      }
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (super.a($$0, $$1) && this.em() != null) {
         if (!this.dS().B) {
            this.y();
         }

         return true;
      } else {
         return false;
      }
   }

   private eys k(eys $$0) {
      eys $$1 = $$0.a(this.bZ * (float) (Math.PI / 180.0));
      return $$1.b(-this.aU * (float) (Math.PI / 180.0));
   }

   private void y() {
      this.b(this.t());
      eys $$0 = this.k(new eys(0.0, -1.0, 0.0)).b(this.dx(), this.dz(), this.dD());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         eys $$2 = this.k(new eys((double)this.af.i() * 0.6 - 0.3, -1.0, (double)this.af.i() * 0.6 - 0.3));
         eys $$3 = $$2.c(0.3 + (double)(this.af.i() * 2.0F));
         ((arh)this.dS()).a(this.q(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$3.d, $$3.e, $$3.f, 0.1F);
      }
   }

   protected ll q() {
      return ln.ai;
   }

   @Override
   public void a_(eys $$0) {
      if (this.de()) {
         this.a(buo.a, this.dv());
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

   public void a(float $$0, float $$1, float $$2) {
      this.cj = $$0;
      this.ck = $$1;
      this.cl = $$2;
   }

   public boolean gq() {
      return this.cj != 0.0F || this.ck != 0.0F || this.cl != 0.0F;
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      if (this.af.i() > 0.95F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cbh {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         buk $$0 = cgz.this.em();
         return cgz.this.bi() && $$0 != null ? cgz.this.g((bto)$$0) < 100.0 : false;
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
         buk $$0 = cgz.this.em();
         if ($$0 != null) {
            eys $$1 = new eys(cgz.this.dx() - $$0.dx(), cgz.this.dz() - $$0.dz(), cgz.this.dD() - $$0.dD());
            duo $$2 = cgz.this.dS().a_(je.a(cgz.this.dx() + $$1.d, cgz.this.dz() + $$1.e, cgz.this.dD() + $$1.f));
            eqp $$3 = cgz.this.dS().b_(je.a(cgz.this.dx() + $$1.d, cgz.this.dz() + $$1.e, cgz.this.dD() + $$1.f));
            if ($$3.a(awz.a) || $$2.l()) {
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

               cgz.this.a((float)$$1.d / 20.0F, (float)$$1.e / 20.0F, (float)$$1.f / 20.0F);
            }

            if (this.e % 10 == 5) {
               cgz.this.dS().a(ln.d, cgz.this.dx(), cgz.this.dz(), cgz.this.dD(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends cbh {
      private final cgz a;

      public b(final cgz $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public void a() {
         int $$0 = this.a.eq();
         if ($$0 > 100) {
            this.a.a(0.0F, 0.0F, 0.0F);
         } else if (this.a.dV().a(b(50)) == 0 || !this.a.ah || !this.a.gq()) {
            float $$1 = this.a.dV().i() * (float) (Math.PI * 2);
            float $$2 = azd.b($$1) * 0.2F;
            float $$3 = -0.1F + this.a.dV().i() * 0.2F;
            float $$4 = azd.a($$1) * 0.2F;
            this.a.a($$2, $$3, $$4);
         }
      }
   }
}
