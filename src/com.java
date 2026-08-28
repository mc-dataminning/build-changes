import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class com extends cis implements bwz {
   private static final alg bF = alg.b("suffocating");
   private static final byg bG = new byg(bF, -0.34F, byg.a.b);
   private static final float bH = 0.35F;
   private static final float bJ = 0.55F;
   private static final akj<Integer> bK = akn.a(com.class, akl.b);
   private static final akj<Boolean> bL = akn.a(com.class, akl.k);
   private final bwy bM = new bwy(this.al, bK);
   @Nullable
   private cfg bN;

   public com(bwm<? extends com> $$0, div $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(ewx.j, -1.0F);
      this.a(ewx.i, 0.0F);
      this.a(ewx.n, 0.0F);
      this.a(ewx.o, 0.0F);
   }

   public static boolean c(bwm<com> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      iu.a $$5 = $$3.k();

      do {
         $$5.c(ja.b);
      } while ($$1.b_($$5).a(axh.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(akj<?> $$0) {
      if (bK.equals($$0) && this.dV().C) {
         this.bM.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bK, 0);
      $$0.a(bL, false);
   }

   @Override
   public boolean e(bwn $$0) {
      return $$0 != bwn.h ? super.e($$0) : this.bK() && !this.n_();
   }

   @Override
   protected boolean f(bwn $$0) {
      return $$0 == bwn.h || super.f($$0);
   }

   @Override
   protected je<awm> a(bwn $$0, cyy $$1, dhh $$2) {
      return (je<awm>)($$0 == bwn.h ? awn.zf : super.a($$0, $$1, $$2));
   }

   @Override
   protected void D() {
      this.bC.a(1, new cer(this, 1.65));
      this.bC.a(2, new cdk(this, 1.0));
      this.bN = new cfg(this, 1.4, $$0 -> $$0.a(axk.ay), false);
      this.bC.a(3, this.bN);
      this.bC.a(4, new com.a(this, 1.0));
      this.bC.a(5, new cdx(this, 1.0));
      this.bC.a(7, new cev(this, 1.0, 60));
      this.bC.a(8, new ceg(this, cqy.class, 8.0F));
      this.bC.a(8, new cet(this));
      this.bC.a(9, new ceg(this, com.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.al.a(bL, $$0);
      bye $$1 = this.g(byi.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.a(bG);
         } else {
            $$1.c(bF);
         }
      }
   }

   public boolean q() {
      return this.al.a(bL);
   }

   @Override
   public boolean a(ewg $$0) {
      return $$0.a(axh.b);
   }

   @Override
   protected fei a(bwd $$0, bwg $$1, float $$2) {
      if (!this.dV().w_()) {
         return super.a($$0, $$1, $$2);
      } else {
         float $$3 = Math.min(0.25F, this.aT.b());
         float $$4 = this.aT.c();
         float $$5 = 0.12F * azm.b($$4 * 1.5F) * 2.0F * $$3;
         return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
      }
   }

   @Override
   public boolean a(diy $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bxc cW() {
      return (bxc)(this.ak() && this.cZ() instanceof cqy $$0 && $$0.b(czc.oy) ? $$0 : super.cW());
   }

   @Override
   public fei b(bxc $$0) {
      fei[] $$1 = new fei[]{
         a((double)this.dq(), (double)$$0.dq(), $$0.dL()),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() - 22.5F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() + 22.5F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() - 45.0F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() + 45.0F)
      };
      Set<iu> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cR().e;
      double $$4 = this.cR().b - 0.5;
      iu.a $$5 = new iu.a();

      for (fei $$6 : $$1) {
         $$5.b(this.dA() + $$6.d, $$3, this.dG() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(ja.a);
         }
      }

      for (iu $$8 : $$2) {
         if (!this.dV().b_($$8).a(axh.b)) {
            double $$9 = this.dV().j($$8);
            if (ctq.a($$9)) {
               fei $$10 = fei.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fN().iterator();

               while (var14.hasNext()) {
                  bxo $$11 = (bxo)var14.next();
                  fed $$12 = $$0.f($$11);
                  if (ctq.a(this.dV(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new fei(this.dA(), this.cR().e, this.dG());
   }

   @Override
   protected void a(cqy $$0, fei $$1) {
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aV = this.aX = this.dL();
      this.bM.b();
      super.a($$0, $$1);
   }

   @Override
   protected fei b(cqy $$0, fei $$1) {
      return new fei(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(cqy $$0) {
      return (float)(this.h(byi.v) * (double)(this.q() ? 0.35F : 0.55F) * (double)this.bM.c());
   }

   @Override
   protected float aU() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(this.bw() ? awn.zd : awn.zc, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.bM.a(this.dY());
   }

   @Override
   protected void a(double $$0, boolean $$1, dzz $$2, iu $$3) {
      if (this.bw()) {
         this.k();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void h() {
      if (this.x() && this.ae.a(140) == 0) {
         this.b(awn.yY);
      } else if (this.gn() && this.ae.a(60) == 0) {
         this.b(awn.yZ);
      }

      if (!this.gf()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dzz $$0 = this.dV().a_(this.dv());
            dzz $$1 = this.bs();
            $$2 = $$0.a(axc.aW) || $$1.a(axc.aW) || this.b(axh.b) > 0.0;
            if (this.dk() instanceof com $$3 && $$3.q()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.h();
      this.gq();
   }

   private boolean x() {
      return this.bN != null && this.bN.i();
   }

   @Override
   protected boolean F() {
      return true;
   }

   private void gq() {
      if (this.bw()) {
         fen $$0 = fen.a(this);
         if ($$0.a(dqv.d, this.dv(), true) && !this.dV().b_(this.dv().d()).a(axh.b)) {
            this.d(true);
         } else {
            this.i(this.dy().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static byh.a t() {
      return cis.gv().a(byi.v, 0.175F);
   }

   @Override
   protected awm u() {
      return !this.gn() && !this.x() ? awn.yX : null;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.zb;
   }

   @Override
   protected awm l_() {
      return awn.za;
   }

   @Override
   protected boolean r(bwd $$0) {
      return !this.ca() && !this.a(axh.b);
   }

   @Override
   public boolean fq() {
      return true;
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   protected cgm b(div $$0) {
      return new com.b(this, $$0);
   }

   @Override
   public float a(iu $$0, diy $$1) {
      if ($$1.a_($$0).y().a(axh.b)) {
         return 10.0F;
      } else {
         return this.bw() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public com b(arq $$0, bvt $$1) {
      return bwm.bt.a($$0, bwl.e);
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.ax);
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.ak() && !this.ca() && !$$0.fX()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bub.a;
      } else {
         bub $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cyy $$4 = $$0.b($$1);
            return (bub)(this.a($$4, bwn.h) ? $$4.a($$0, this, $$1) : bub.e);
         } else {
            if ($$2 && !this.bb()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.ze, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public fei cT() {
      return new fei(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      if (this.n_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azv $$4 = $$0.C_();
         if ($$4.a(30) == 0) {
            bxe $$5 = bwm.bR.a($$0.a(), bwl.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cot.b(cot.a($$4), false));
               $$5.a(bwn.a, new cyy(czc.oy));
               this.a(bwn.h, new cyy(czc.or));
               this.g(bwn.h);
            }
         } else if ($$4.a(10) == 0) {
            bvt $$6 = bwm.bt.a($$0.a(), bwl.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bvt.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bxu a(djm $$0, btz $$1, bxe $$2, @Nullable bxu $$3) {
      $$2.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
      $$2.a($$0, $$1, bwl.g, $$3);
      $$2.a(this, true);
      return new bvt.a(0.0F);
   }

   static class a extends cel {
      private final com g;

      a(com $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public iu k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.bw() && this.a(this.g.dV(), this.e);
      }

      @Override
      public boolean b() {
         return !this.g.bw() && super.b();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(diy $$0, iu $$1) {
         return $$0.a_($$1).a(dmc.K) && $$0.a_($$1.d()).a(ewv.a);
      }
   }

   static class b extends cgl {
      b(com $$0, div $$1) {
         super($$0, $$1);
      }

      @Override
      protected eww a(int $$0) {
         this.o = new exc();
         return new eww(this.o, $$0);
      }

      @Override
      protected boolean a(ewx $$0) {
         return $$0 != ewx.i && $$0 != ewx.o && $$0 != ewx.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(iu $$0) {
         return this.b.a_($$0).a(dmc.K) || super.a($$0);
      }
   }
}
