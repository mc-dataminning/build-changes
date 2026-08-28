import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cog extends cio implements bww {
   private static final ale bF = ale.b("suffocating");
   private static final byd bG = new byd(bF, -0.34F, byd.a.b);
   private static final float bH = 0.35F;
   private static final float bJ = 0.55F;
   private static final akh<Integer> bK = akl.a(cog.class, akj.b);
   private static final akh<Boolean> bL = akl.a(cog.class, akj.k);
   private final bwv bM = new bwv(this.al, bK);
   @Nullable
   private cfd bN;

   public cog(bwj<? extends cog> $$0, dip $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(ewm.j, -1.0F);
      this.a(ewm.i, 0.0F);
      this.a(ewm.n, 0.0F);
      this.a(ewm.o, 0.0F);
   }

   public static boolean c(bwj<cog> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      iu.a $$5 = $$3.k();

      do {
         $$5.c(ja.b);
      } while ($$1.b_($$5).a(axf.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(akh<?> $$0) {
      if (bK.equals($$0) && this.dV().C) {
         this.bM.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bK, 0);
      $$0.a(bL, false);
   }

   @Override
   public boolean e(bwk $$0) {
      return $$0 != bwk.h ? super.e($$0) : this.bK() && !this.n_();
   }

   @Override
   protected boolean f(bwk $$0) {
      return $$0 == bwk.h || super.f($$0);
   }

   @Override
   protected je<awk> a(bwk $$0, cys $$1, dhb $$2) {
      return (je<awk>)($$0 == bwk.h ? awl.zc : super.a($$0, $$1, $$2));
   }

   @Override
   protected void D() {
      this.bC.a(1, new ceo(this, 1.65));
      this.bC.a(2, new cdh(this, 1.0));
      this.bN = new cfd(this, 1.4, $$0 -> $$0.a(axi.ay), false);
      this.bC.a(3, this.bN);
      this.bC.a(4, new cog.a(this, 1.0));
      this.bC.a(5, new cdu(this, 1.0));
      this.bC.a(7, new ces(this, 1.0, 60));
      this.bC.a(8, new ced(this, cqs.class, 8.0F));
      this.bC.a(8, new ceq(this));
      this.bC.a(9, new ced(this, cog.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.al.a(bL, $$0);
      byb $$1 = this.g(byf.v);
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
   public boolean a(evv $$0) {
      return $$0.a(axf.b);
   }

   @Override
   protected fdw a(bwa $$0, bwd $$1, float $$2) {
      if (!this.dV().w_()) {
         return super.a($$0, $$1, $$2);
      } else {
         float $$3 = Math.min(0.25F, this.aT.b());
         float $$4 = this.aT.c();
         float $$5 = 0.12F * azk.b($$4 * 1.5F) * 2.0F * $$3;
         return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
      }
   }

   @Override
   public boolean a(dis $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bwz cW() {
      return (bwz)(this.ak() && this.cZ() instanceof cqs $$0 && $$0.b(cyw.ow) ? $$0 : super.cW());
   }

   @Override
   public fdw b(bwz $$0) {
      fdw[] $$1 = new fdw[]{
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

      for (fdw $$6 : $$1) {
         $$5.b(this.dA() + $$6.d, $$3, this.dG() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(ja.a);
         }
      }

      for (iu $$8 : $$2) {
         if (!this.dV().b_($$8).a(axf.b)) {
            double $$9 = this.dV().j($$8);
            if (ctk.a($$9)) {
               fdw $$10 = fdw.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fN().iterator();

               while (var14.hasNext()) {
                  bxl $$11 = (bxl)var14.next();
                  fdr $$12 = $$0.f($$11);
                  if (ctk.a(this.dV(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new fdw(this.dA(), this.cR().e, this.dG());
   }

   @Override
   protected void a(cqs $$0, fdw $$1) {
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aV = this.aX = this.dL();
      this.bM.b();
      super.a($$0, $$1);
   }

   @Override
   protected fdw b(cqs $$0, fdw $$1) {
      return new fdw(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(cqs $$0) {
      return (float)(this.h(byf.v) * (double)(this.q() ? 0.35F : 0.55F) * (double)this.bM.c());
   }

   @Override
   protected float aU() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(this.bw() ? awl.za : awl.yZ, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.bM.a(this.dY());
   }

   @Override
   protected void a(double $$0, boolean $$1, dzo $$2, iu $$3) {
      if (this.bw()) {
         this.k();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void h() {
      if (this.x() && this.ae.a(140) == 0) {
         this.b(awl.yV);
      } else if (this.gn() && this.ae.a(60) == 0) {
         this.b(awl.yW);
      }

      if (!this.gf()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dzo $$0 = this.dV().a_(this.dv());
            dzo $$1 = this.bs();
            $$2 = $$0.a(axa.aW) || $$1.a(axa.aW) || this.b(axf.b) > 0.0;
            if (this.dk() instanceof cog $$3 && $$3.q()) {
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
         feb $$0 = feb.a(this);
         if ($$0.a(dqo.d, this.dv(), true) && !this.dV().b_(this.dv().d()).a(axf.b)) {
            this.d(true);
         } else {
            this.i(this.dy().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bye.a t() {
      return cio.gv().a(byf.v, 0.175F);
   }

   @Override
   protected awk u() {
      return !this.gn() && !this.x() ? awl.yU : null;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.yY;
   }

   @Override
   protected awk l_() {
      return awl.yX;
   }

   @Override
   protected boolean r(bwa $$0) {
      return !this.ca() && !this.a(axf.b);
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
   protected cgj b(dip $$0) {
      return new cog.b(this, $$0);
   }

   @Override
   public float a(iu $$0, dis $$1) {
      if ($$1.a_($$0).y().a(axf.b)) {
         return 10.0F;
      } else {
         return this.bw() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cog b(aro $$0, bvq $$1) {
      return bwj.bt.a($$0, bwi.e);
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.ax);
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      boolean $$2 = this.k($$0.b($$1));
      if (!$$2 && this.ak() && !this.ca() && !$$0.fX()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bty.a;
      } else {
         bty $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cys $$4 = $$0.b($$1);
            return (bty)(this.a($$4, bwk.h) ? $$4.a($$0, this, $$1) : bty.e);
         } else {
            if ($$2 && !this.bb()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.zb, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public fdw cT() {
      return new fdw(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      if (this.n_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azt $$4 = $$0.C_();
         if ($$4.a(30) == 0) {
            bxb $$5 = bwj.bR.a($$0.a(), bwi.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new com.b(com.a($$4), false));
               $$5.a(bwk.a, new cys(cyw.ow));
               this.a(bwk.h, new cys(cyw.op));
               this.g(bwk.h);
            }
         } else if ($$4.a(10) == 0) {
            bvq $$6 = bwj.bt.a($$0.a(), bwi.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bvq.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bxr a(djg $$0, btw $$1, bxb $$2, @Nullable bxr $$3) {
      $$2.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
      $$2.a($$0, $$1, bwi.g, $$3);
      $$2.a(this, true);
      return new bvq.a(0.0F);
   }

   static class a extends cei {
      private final cog g;

      a(cog $$0, double $$1) {
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
      protected boolean a(dis $$0, iu $$1) {
         return $$0.a_($$1).a(dlw.K) && $$0.a_($$1.d()).a(ewk.a);
      }
   }

   static class b extends cgi {
      b(cog $$0, dip $$1) {
         super($$0, $$1);
      }

      @Override
      protected ewl a(int $$0) {
         this.o = new ewr();
         return new ewl(this.o, $$0);
      }

      @Override
      protected boolean a(ewm $$0) {
         return $$0 != ewm.i && $$0 != ewm.o && $$0 != ewm.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(iu $$0) {
         return this.b.a_($$0).a(dlw.K) || super.a($$0);
      }
   }
}
