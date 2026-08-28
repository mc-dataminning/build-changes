public class cfn extends cfq {
   public float b;
   public float c;
   public float d;
   public float e;
   public float ca;
   public float cb;
   public float cc;
   public float cd;
   private float ce;
   private float cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;

   public cfn(bsj<? extends cfn> $$0, dcd $$1) {
      super($$0, $$1);
      this.ah.b((long)this.al());
      this.cf = 1.0F / (this.ah.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void z() {
      this.bU.a(0, new cfn.b(this));
      this.bU.a(1, new cfn.a());
   }

   public static buf.a gn() {
      return bta.A().a(bug.s, 10.0);
   }

   @Override
   protected ave v() {
      return avf.yZ;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.zb;
   }

   @Override
   protected ave o_() {
      return avf.za;
   }

   protected ave u() {
      return avf.zc;
   }

   @Override
   public boolean a(cmh $$0) {
      return !this.fZ();
   }

   @Override
   protected float fa() {
      return 0.4F;
   }

   @Override
   protected bsd.b bb() {
      return bsd.b.c;
   }

   @Override
   protected double aY() {
      return 0.08;
   }

   @Override
   public void n_() {
      super.n_();
      this.c = this.b;
      this.e = this.d;
      this.cb = this.ca;
      this.cd = this.cc;
      this.ca = this.ca + this.cf;
      if ((double)this.ca > Math.PI * 2) {
         if (this.dP().B) {
            this.ca = (float) (Math.PI * 2);
         } else {
            this.ca -= (float) (Math.PI * 2);
            if (this.ah.a(10) == 0) {
               this.cf = 1.0F / (this.ah.i() + 1.0F) * 0.2F;
            }

            this.dP().a(this, (byte)19);
         }
      }

      if (this.bh()) {
         if (this.ca < (float) Math.PI) {
            float $$0 = this.ca / (float) Math.PI;
            this.cc = aye.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               this.ce = 1.0F;
               this.cg = 1.0F;
            } else {
               this.cg *= 0.8F;
            }
         } else {
            this.cc = 0.0F;
            this.ce *= 0.9F;
            this.cg *= 0.99F;
         }

         if (!this.dP().B) {
            this.o((double)(this.ch * this.ce), (double)(this.ci * this.ce), (double)(this.cj * this.ce));
         }

         evz $$1 = this.ds();
         double $$2 = $$1.h();
         this.aY = this.aY + (-((float)aye.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aY) * 0.1F;
         this.s(this.aY);
         this.d = this.d + (float) Math.PI * this.cg * 1.5F;
         this.b = this.b + (-((float)aye.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.cc = aye.e(aye.a(this.ca)) * (float) Math.PI * 0.25F;
         if (!this.dP().B) {
            double $$3 = this.ds().d;
            if (this.b(brn.y)) {
               $$3 = 0.05 * (double)(this.c(brn.y).e() + 1);
            } else {
               $$3 -= this.aZ();
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (super.a($$0, $$1) && this.ei() != null) {
         if (!this.dP().B) {
            this.y();
         }

         return true;
      } else {
         return false;
      }
   }

   private evz k(evz $$0) {
      evz $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aZ * (float) (Math.PI / 180.0));
   }

   private void y() {
      this.b(this.u());
      evz $$0 = this.k(new evz(0.0, -1.0, 0.0)).b(this.du(), this.dw(), this.dA());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         evz $$2 = this.k(new evz((double)this.ah.i() * 0.6 - 0.3, -1.0, (double)this.ah.i() * 0.6 - 0.3));
         evz $$3 = $$2.a(0.3 + (double)(this.ah.i() * 2.0F));
         ((aqk)this.dP()).a(this.s(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected lh s() {
      return lj.ai;
   }

   @Override
   public void a(evz $$0) {
      this.a(btd.a, this.ds());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.ca = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.ch = $$0;
      this.ci = $$1;
      this.cj = $$2;
   }

   public boolean go() {
      return this.ch != 0.0F || this.ci != 0.0F || this.cj != 0.0F;
   }

   class a extends bzw {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         bsy $$0 = cfn.this.ei();
         return cfn.this.be() && $$0 != null ? cfn.this.g((bsd)$$0) < 100.0 : false;
      }

      @Override
      public void c() {
         this.e = 0;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.e++;
         bsy $$0 = cfn.this.ei();
         if ($$0 != null) {
            evz $$1 = new evz(cfn.this.du() - $$0.du(), cfn.this.dw() - $$0.dw(), cfn.this.dA() - $$0.dA());
            dsh $$2 = cfn.this.dP().a_(ja.a(cfn.this.du() + $$1.c, cfn.this.dw() + $$1.d, cfn.this.dA() + $$1.e));
            eob $$3 = cfn.this.dP().b_(ja.a(cfn.this.du() + $$1.c, cfn.this.dw() + $$1.d, cfn.this.dA() + $$1.e));
            if ($$3.a(awa.a) || $$2.i()) {
               double $$4 = $$1.f();
               if ($$4 > 0.0) {
                  $$1.d();
                  double $$5 = 3.0;
                  if ($$4 > 5.0) {
                     $$5 -= ($$4 - 5.0) / 5.0;
                  }

                  if ($$5 > 0.0) {
                     $$1 = $$1.a($$5);
                  }
               }

               if ($$2.i()) {
                  $$1 = $$1.a(0.0, $$1.d, 0.0);
               }

               cfn.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               cfn.this.dP().a(lj.d, cfn.this.du(), cfn.this.dw(), cfn.this.dA(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends bzw {
      private final cfn a;

      public b(final cfn $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public void e() {
         int $$0 = this.a.em();
         if ($$0 > 100) {
            this.a.a(0.0F, 0.0F, 0.0F);
         } else if (this.a.dS().a(b(50)) == 0 || !this.a.aj || !this.a.go()) {
            float $$1 = this.a.dS().i() * (float) (Math.PI * 2);
            float $$2 = aye.b($$1) * 0.2F;
            float $$3 = -0.1F + this.a.dS().i() * 0.2F;
            float $$4 = aye.a($$1) * 0.2F;
            this.a.a($$2, $$3, $$4);
         }
      }
   }
}
