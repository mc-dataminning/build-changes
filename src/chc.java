import org.jetbrains.annotations.Nullable;

public class chc extends cgc {
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

   public chc(bty<? extends chc> $$0, dej $$1) {
      super($$0, $$1);
      this.af.b((long)this.ap());
      this.ch = 1.0F / (this.af.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void D() {
      this.bS.a(0, new chc.b(this));
      this.bS.a(1, new chc.a());
   }

   public static bvt.a go() {
      return bup.E().a(bvu.s, 10.0);
   }

   @Override
   protected awf w() {
      return awg.zf;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.zh;
   }

   @Override
   protected awf o_() {
      return awg.zg;
   }

   protected awf t() {
      return awg.zi;
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
   protected btr.b bf() {
      return btr.b.c;
   }

   @Nullable
   @Override
   public btk a(arj $$0, btk $$1) {
      return bty.aX.a($$0, btx.e);
   }

   @Override
   protected double bc() {
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
            this.ce = azf.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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

         eyw $$1 = this.dv();
         double $$2 = $$1.i();
         this.aT = this.aT + (-((float)azf.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aT) * 0.1F;
         this.v(this.aT);
         this.ca = this.ca + (float) Math.PI * this.ci * 1.5F;
         this.bY = this.bY + (-((float)azf.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bY) * 0.1F;
      } else {
         this.ce = azf.e(azf.a(this.cc)) * (float) Math.PI * 0.25F;
         if (!this.dS().B) {
            double $$3 = this.dv().e;
            if (this.b(bta.y)) {
               $$3 = 0.05 * (double)(this.c(bta.y).e() + 1);
            } else {
               $$3 -= this.bd();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bY = this.bY + (-90.0F - this.bY) * 0.02F;
      }
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (super.a($$0, $$1) && this.en() != null) {
         if (!this.dS().B) {
            this.y();
         }

         return true;
      } else {
         return false;
      }
   }

   private eyw k(eyw $$0) {
      eyw $$1 = $$0.a(this.bZ * (float) (Math.PI / 180.0));
      return $$1.b(-this.aU * (float) (Math.PI / 180.0));
   }

   private void y() {
      this.b(this.t());
      eyw $$0 = this.k(new eyw(0.0, -1.0, 0.0)).b(this.dx(), this.dz(), this.dD());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         eyw $$2 = this.k(new eyw((double)this.af.i() * 0.6 - 0.3, -1.0, (double)this.af.i() * 0.6 - 0.3));
         eyw $$3 = $$2.c(0.3 + (double)(this.af.i() * 2.0F));
         ((arj)this.dS()).a(this.q(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$3.d, $$3.e, $$3.f, 0.1F);
      }
   }

   protected lm q() {
      return lo.ai;
   }

   @Override
   public void a_(eyw $$0) {
      if (this.de()) {
         this.a(bur.a, this.dv());
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

   public boolean gp() {
      return this.cj != 0.0F || this.ck != 0.0F || this.cl != 0.0F;
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      if (this.af.i() > 0.95F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cbk {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bun $$0 = chc.this.en();
         return chc.this.bi() && $$0 != null ? chc.this.g((btr)$$0) < 100.0 : false;
      }

      @Override
      public void d() {
         this.e = 0;
      }

      @Override
      public boolean U_() {
         return true;
      }

      @Override
      public void a() {
         this.e++;
         bun $$0 = chc.this.en();
         if ($$0 != null) {
            eyw $$1 = new eyw(chc.this.dx() - $$0.dx(), chc.this.dz() - $$0.dz(), chc.this.dD() - $$0.dD());
            dus $$2 = chc.this.dS().a_(jf.a(chc.this.dx() + $$1.d, chc.this.dz() + $$1.e, chc.this.dD() + $$1.f));
            eqt $$3 = chc.this.dS().b_(jf.a(chc.this.dx() + $$1.d, chc.this.dz() + $$1.e, chc.this.dD() + $$1.f));
            if ($$3.a(axb.a) || $$2.l()) {
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

               chc.this.a((float)$$1.d / 20.0F, (float)$$1.e / 20.0F, (float)$$1.f / 20.0F);
            }

            if (this.e % 10 == 5) {
               chc.this.dS().a(lo.d, chc.this.dx(), chc.this.dz(), chc.this.dD(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends cbk {
      private final chc a;

      public b(final chc $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public void a() {
         int $$0 = this.a.er();
         if ($$0 > 100) {
            this.a.a(0.0F, 0.0F, 0.0F);
         } else if (this.a.dV().a(b(50)) == 0 || !this.a.ah || !this.a.gp()) {
            float $$1 = this.a.dV().i() * (float) (Math.PI * 2);
            float $$2 = azf.b($$1) * 0.2F;
            float $$3 = -0.1F + this.a.dV().i() * 0.2F;
            float $$4 = azf.a($$1) * 0.2F;
            this.a.a($$2, $$3, $$4);
         }
      }
   }
}
