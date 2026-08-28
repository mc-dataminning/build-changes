import javax.annotation.Nullable;

public class cjl extends cjx implements cjr {
   private static final int e = 4;
   private static final int ca = 3;
   private static final int cb = 3;
   private int cc;
   private final evz[][] cd;

   public cjl(bsj<? extends cjl> $$0, dcd $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.cd = new evz[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cd[0][$$2] = evz.b;
         this.cd[1][$$2] = evz.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzq(this));
      this.bU.a(1, new cjx.b());
      this.bU.a(4, new cjl.b());
      this.bU.a(5, new cjl.a());
      this.bU.a(6, new caw<>(this, 0.5, 20, 15.0F));
      this.bU.a(8, new cat(this, 0.6));
      this.bU.a(9, new cae(this, cmh.class, 3.0F, 1.0F));
      this.bU.a(10, new cae(this, bta.class, 8.0F));
      this.bV.a(1, new cbo(this, cnt.class).a());
      this.bV.a(2, new cbp<>(this, cmh.class, true).c(300));
      this.bV.a(3, new cbp<>(this, clp.class, false).c(300));
      this.bV.a(3, new cbp<>(this, cfa.class, false).c(300));
   }

   public static buf.a u() {
      return cjn.gt().a(bug.v, 0.5).a(bug.m, 18.0).a(bug.s, 32.0);
   }

   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      this.a(bsk.a, new cua(cud.ou));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public evu h_() {
      return this.cK().c(3.0, 0.0, 3.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.dP().B && this.ch()) {
         this.cc--;
         if (this.cc < 0) {
            this.cc = 0;
         }

         if (this.aO == 1 || this.ai % 1200 == 0) {
            this.cc = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cd[0][$$2] = this.cd[1][$$2];
               this.cd[1][$$2] = new evz(
                  (double)(-6.0F + (float)this.ah.a(13)) * 0.5, (double)Math.max(0, this.ah.a(6) - 4), (double)(-6.0F + (float)this.ah.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dP().a(lj.e, this.d(0.5), this.dx(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dP().a(this.du(), this.dw(), this.dA(), avf.ni, this.de(), 1.0F, 1.0F, false);
         } else if (this.aO == this.aP - 1) {
            this.cc = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cd[0][$$4] = this.cd[1][$$4];
               this.cd[1][$$4] = new evz(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public ave ae_() {
      return avf.ne;
   }

   public evz[] H(float $$0) {
      if (this.cc <= 0) {
         return this.cd[1];
      } else {
         double $$1 = (double)(((float)this.cc - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         evz[] $$2 = new evz[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cd[1][$$3].a(1.0 - $$1).e(this.cd[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected ave v() {
      return avf.ne;
   }

   @Override
   protected ave o_() {
      return avf.ng;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.nh;
   }

   @Override
   protected ave gn() {
      return avf.nf;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bsy $$0, float $$1) {
      cua $$2 = this.b(cnb.a(this, cud.ou));
      cua $$3 = this.g($$2);
      cmn $$4 = cnb.a(this, $$3, $$1, $$2);
      double $$5 = $$0.du() - this.du();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dw();
      double $$7 = $$0.dA() - this.dA();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      $$4.c($$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(avf.xn, 1.0F, 1.0F / (this.dS().i() * 0.4F + 0.8F));
      this.dP().b($$4);
   }

   @Override
   public ciu.a s() {
      if (this.gx()) {
         return ciu.a.c;
      } else {
         return this.ge() ? ciu.a.d : ciu.a.a;
      }
   }

   class a extends cjx.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cjl.this.p() == null) {
            return false;
         } else {
            return cjl.this.p().al() == this.e ? false : cjl.this.dP().d_(cjl.this.dp()).a((float)bqa.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bsy $$0 = cjl.this.p();
         if ($$0 != null) {
            this.e = $$0.al();
         }
      }

      @Override
      protected int h() {
         return 20;
      }

      @Override
      protected int i() {
         return 180;
      }

      @Override
      protected void k() {
         cjl.this.p().b(new brl(brn.o, 400), cjl.this);
      }

      @Override
      protected ave l() {
         return avf.nj;
      }

      @Override
      protected cjx.a m() {
         return cjx.a.f;
      }
   }

   class b extends cjx.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cjl.this.b(brn.n);
      }

      @Override
      protected int h() {
         return 20;
      }

      @Override
      protected int i() {
         return 340;
      }

      @Override
      protected void k() {
         cjl.this.b(new brl(brn.n, 1200));
      }

      @Nullable
      @Override
      protected ave l() {
         return avf.nk;
      }

      @Override
      protected cjx.a m() {
         return cjx.a.e;
      }
   }
}
