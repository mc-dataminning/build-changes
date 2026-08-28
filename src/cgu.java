import org.jetbrains.annotations.Nullable;

public class cgu extends cfu {
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
   private float ck;
   private float cl;
   private float cm;

   public cgu(btq<? extends cgu> $$0, dds $$1) {
      super($$0, $$1);
      this.af.b((long)this.ap());
      this.ci = 1.0F / (this.af.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void D() {
      this.bT.a(0, new cgu.b(this));
      this.bT.a(1, new cgu.a());
   }

   public static bvl.a go() {
      return buh.E().a(bvm.s, 10.0);
   }

   @Override
   protected awc w() {
      return awd.zf;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.zh;
   }

   @Override
   protected awc n_() {
      return awd.zg;
   }

   protected awc t() {
      return awd.zi;
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
   protected btj.b bf() {
      return btj.b.c;
   }

   @Nullable
   @Override
   public btc a(arg $$0, btc $$1) {
      return btq.aX.a($$0, btp.e);
   }

   @Override
   protected double bc() {
      return 0.08;
   }

   @Override
   public void m_() {
      super.m_();
      this.ca = this.bZ;
      this.cc = this.cb;
      this.ce = this.cd;
      this.cg = this.cf;
      this.cd = this.cd + this.ci;
      if ((double)this.cd > Math.PI * 2) {
         if (this.dS().B) {
            this.cd = (float) (Math.PI * 2);
         } else {
            this.cd -= (float) (Math.PI * 2);
            if (this.af.a(10) == 0) {
               this.ci = 1.0F / (this.af.i() + 1.0F) * 0.2F;
            }

            this.dS().a(this, (byte)19);
         }
      }

      if (this.bl()) {
         if (this.cd < (float) Math.PI) {
            float $$0 = this.cd / (float) Math.PI;
            this.cf = azc.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               this.ch = 1.0F;
               this.cj = 1.0F;
            } else {
               this.cj *= 0.8F;
            }
         } else {
            this.cf = 0.0F;
            this.ch *= 0.9F;
            this.cj *= 0.99F;
         }

         if (!this.dS().B) {
            this.n((double)(this.ck * this.ch), (double)(this.cl * this.ch), (double)(this.cm * this.ch));
         }

         eye $$1 = this.dv();
         double $$2 = $$1.i();
         this.aU = this.aU + (-((float)azc.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aU) * 0.1F;
         this.v(this.aU);
         this.cb = this.cb + (float) Math.PI * this.cj * 1.5F;
         this.bZ = this.bZ + (-((float)azc.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bZ) * 0.1F;
      } else {
         this.cf = azc.e(azc.a(this.cd)) * (float) Math.PI * 0.25F;
         if (!this.dS().B) {
            double $$3 = this.dv().e;
            if (this.b(bss.y)) {
               $$3 = 0.05 * (double)(this.c(bss.y).e() + 1);
            } else {
               $$3 -= this.bd();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bZ = this.bZ + (-90.0F - this.bZ) * 0.02F;
      }
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (super.a($$0, $$1) && this.em() != null) {
         if (!this.dS().B) {
            this.y();
         }

         return true;
      } else {
         return false;
      }
   }

   private eye k(eye $$0) {
      eye $$1 = $$0.a(this.ca * (float) (Math.PI / 180.0));
      return $$1.b(-this.aV * (float) (Math.PI / 180.0));
   }

   private void y() {
      this.b(this.t());
      eye $$0 = this.k(new eye(0.0, -1.0, 0.0)).b(this.dx(), this.dz(), this.dD());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         eye $$2 = this.k(new eye((double)this.af.i() * 0.6 - 0.3, -1.0, (double)this.af.i() * 0.6 - 0.3));
         eye $$3 = $$2.c(0.3 + (double)(this.af.i() * 2.0F));
         ((arg)this.dS()).a(this.q(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$3.d, $$3.e, $$3.f, 0.1F);
      }
   }

   protected ll q() {
      return ln.ai;
   }

   @Override
   public void a_(eye $$0) {
      if (this.de()) {
         this.a(buj.a, this.dv());
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

   public void a(float $$0, float $$1, float $$2) {
      this.ck = $$0;
      this.cl = $$1;
      this.cm = $$2;
   }

   public boolean gp() {
      return this.ck != 0.0F || this.cl != 0.0F || this.cm != 0.0F;
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      if (this.af.i() > 0.95F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cbc {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         buf $$0 = cgu.this.em();
         return cgu.this.bi() && $$0 != null ? cgu.this.g((btj)$$0) < 100.0 : false;
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
         buf $$0 = cgu.this.em();
         if ($$0 != null) {
            eye $$1 = new eye(cgu.this.dx() - $$0.dx(), cgu.this.dz() - $$0.dz(), cgu.this.dD() - $$0.dD());
            dua $$2 = cgu.this.dS().a_(je.a(cgu.this.dx() + $$1.d, cgu.this.dz() + $$1.e, cgu.this.dD() + $$1.f));
            eqb $$3 = cgu.this.dS().b_(je.a(cgu.this.dx() + $$1.d, cgu.this.dz() + $$1.e, cgu.this.dD() + $$1.f));
            if ($$3.a(awy.a) || $$2.l()) {
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

               cgu.this.a((float)$$1.d / 20.0F, (float)$$1.e / 20.0F, (float)$$1.f / 20.0F);
            }

            if (this.e % 10 == 5) {
               cgu.this.dS().a(ln.d, cgu.this.dx(), cgu.this.dz(), cgu.this.dD(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends cbc {
      private final cgu a;

      public b(final cgu $$0) {
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
         } else if (this.a.dV().a(b(50)) == 0 || !this.a.ah || !this.a.gp()) {
            float $$1 = this.a.dV().i() * (float) (Math.PI * 2);
            float $$2 = azc.b($$1) * 0.2F;
            float $$3 = -0.1F + this.a.dV().i() * 0.2F;
            float $$4 = azc.a($$1) * 0.2F;
            this.a.a($$2, $$3, $$4);
         }
      }
   }
}
