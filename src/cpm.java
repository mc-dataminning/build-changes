import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cpm extends cjk implements bxr {
   private static final ali bI = ali.b("suffocating");
   private static final byy bJ = new byy(bI, -0.34F, byy.a.b);
   private static final float bK = 0.35F;
   private static final float bM = 0.55F;
   private static final akl<Integer> bN = akp.a(cpm.class, akn.b);
   private static final akl<Boolean> bO = akp.a(cpm.class, akn.k);
   private final bxq bP = new bxq(this.al, bN);
   @Nullable
   private cfy bQ;

   public cpm(bxc<? extends cpm> $$0, djx $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(eyf.j, -1.0F);
      this.a(eyf.i, 0.0F);
      this.a(eyf.n, 0.0F);
      this.a(eyf.o, 0.0F);
   }

   public static boolean c(bxc<cpm> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      iv.a $$5 = $$3.k();

      do {
         $$5.c(jb.b);
      } while ($$1.b_($$5).a(axj.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(akl<?> $$0) {
      if (bN.equals($$0) && this.dV().C) {
         this.bP.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bN, 0);
      $$0.a(bO, false);
   }

   @Override
   public boolean e(bxd $$0) {
      return $$0 != bxd.h ? super.e($$0) : this.bJ() && !this.n_();
   }

   @Override
   protected boolean f(bxd $$0) {
      return $$0 == bxd.h || super.f($$0);
   }

   @Override
   protected jf<awo> a(bxd $$0, czy $$1, dih $$2) {
      return (jf<awo>)($$0 == bxd.h ? awp.zi : super.a($$0, $$1, $$2));
   }

   @Override
   protected void D() {
      this.bF.a(1, new cfj(this, 1.65));
      this.bF.a(2, new cec(this, 1.0));
      this.bQ = new cfy(this, 1.4, $$0 -> $$0.a(axm.az), false);
      this.bF.a(3, this.bQ);
      this.bF.a(4, new cpm.a(this, 1.0));
      this.bF.a(5, new cep(this, 1.0));
      this.bF.a(7, new cfn(this, 1.0, 60));
      this.bF.a(8, new cey(this, crx.class, 8.0F));
      this.bF.a(8, new cfl(this));
      this.bF.a(9, new cey(this, cpm.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.al.a(bO, $$0);
      byw $$1 = this.g(bza.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.a(bJ);
         } else {
            $$1.c(bI);
         }
      }
   }

   public boolean q() {
      return this.al.a(bO);
   }

   @Override
   public boolean a(exo $$0) {
      return $$0.a(axj.b);
   }

   @Override
   protected ffq a(bwt $$0, bww $$1, float $$2) {
      if (!this.dV().A_()) {
         return super.a($$0, $$1, $$2);
      } else {
         float $$3 = Math.min(0.25F, this.aT.b());
         float $$4 = this.aT.c();
         float $$5 = 0.12F * azo.b($$4 * 1.5F) * 2.0F * $$3;
         return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
      }
   }

   @Override
   public boolean a(dka $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bxu cW() {
      return (bxu)(this.fZ() && this.cZ() instanceof crx $$0 && $$0.b(dac.oB) ? $$0 : super.cW());
   }

   @Override
   public ffq b(bxu $$0) {
      ffq[] $$1 = new ffq[]{
         a((double)this.dq(), (double)$$0.dq(), $$0.dL()),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() - 22.5F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() + 22.5F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() - 45.0F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() + 45.0F)
      };
      Set<iv> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cR().e;
      double $$4 = this.cR().b - 0.5;
      iv.a $$5 = new iv.a();

      for (ffq $$6 : $$1) {
         $$5.b(this.dA() + $$6.d, $$3, this.dG() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jb.a);
         }
      }

      for (iv $$8 : $$2) {
         if (!this.dV().b_($$8).a(axj.b)) {
            double $$9 = this.dV().j($$8);
            if (cuq.a($$9)) {
               ffq $$10 = ffq.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fO().iterator();

               while (var14.hasNext()) {
                  byg $$11 = (byg)var14.next();
                  ffl $$12 = $$0.f($$11);
                  if (cuq.a(this.dV(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ffq(this.dA(), this.cR().e, this.dG());
   }

   @Override
   protected void a(crx $$0, ffq $$1) {
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aV = this.aX = this.dL();
      this.bP.b();
      super.a($$0, $$1);
   }

   @Override
   protected ffq b(crx $$0, ffq $$1) {
      return new ffq(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(crx $$0) {
      return (float)(this.h(bza.v) * (double)(this.q() ? 0.35F : 0.55F) * (double)this.bP.c());
   }

   @Override
   protected float aT() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(this.bv() ? awp.zg : awp.zf, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.bP.a(this.dY());
   }

   @Override
   protected void a(double $$0, boolean $$1, ebe $$2, iv $$3) {
      if (this.bv()) {
         this.k();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void h() {
      if (this.x() && this.ae.a(140) == 0) {
         this.b(awp.zb);
      } else if (this.gr() && this.ae.a(60) == 0) {
         this.b(awp.zc);
      }

      if (!this.gj()) {
         boolean $$2;
         boolean var10000;
         label36: {
            ebe $$0 = this.dV().a_(this.dv());
            ebe $$1 = this.br();
            $$2 = $$0.a(axe.aW) || $$1.a(axe.aW) || this.b(axj.b) > 0.0;
            if (this.dk() instanceof cpm $$3 && $$3.q()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.h();
      this.gu();
   }

   private boolean x() {
      return this.bQ != null && this.bQ.i();
   }

   @Override
   protected boolean F() {
      return true;
   }

   private void gu() {
      if (this.bv()) {
         ffv $$0 = ffv.a(this);
         if ($$0.a(dry.d, this.dv(), true) && !this.dV().b_(this.dv().d()).a(axj.b)) {
            this.d(true);
         } else {
            this.i(this.dy().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static byz.a t() {
      return cjk.gz().a(bza.v, 0.175F);
   }

   @Override
   protected awo u() {
      return !this.gr() && !this.x() ? awp.za : null;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.ze;
   }

   @Override
   protected awo l_() {
      return awp.zd;
   }

   @Override
   protected boolean r(bwt $$0) {
      return !this.bZ() && !this.a(axj.b);
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   public boolean bX() {
      return false;
   }

   @Override
   protected che b(djx $$0) {
      return new cpm.b(this, $$0);
   }

   @Override
   public float a(iv $$0, dka $$1) {
      if ($$1.a_($$0).y().a(axj.b)) {
         return 10.0F;
      } else {
         return this.bv() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cpm b(ars $$0, bwj $$1) {
      return bxc.bu.a($$0, bxb.e);
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.ay);
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      boolean $$2 = this.i($$0.b($$1));
      if (!$$2 && this.fZ() && !this.bZ() && !$$0.fY()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bur.a;
      } else {
         bur $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            czy $$4 = $$0.b($$1);
            return (bur)(this.a($$4, bxd.h) ? $$4.a($$0, this, $$1) : bur.e);
         } else {
            if ($$2 && !this.ba()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awp.zh, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ffq cT() {
      return new ffq(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      if (this.n_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azx $$4 = $$0.G_();
         if ($$4.a(30) == 0) {
            bxw $$5 = bxc.bS.a($$0.a(), bxb.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cps.b(cps.a($$4), false));
               $$5.a(bxd.a, new czy(dac.oB));
               this.a(bxd.h, new czy(dac.ou));
               this.g(bxd.h);
            }
         } else if ($$4.a(10) == 0) {
            bwj $$6 = bxc.bu.a($$0.a(), bxb.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bwj.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bym a(dko $$0, bup $$1, bxw $$2, @Nullable bym $$3) {
      $$2.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
      $$2.a($$0, $$1, bxb.g, $$3);
      $$2.a(this, true);
      return new bwj.a(0.0F);
   }

   static class a extends cfd {
      private final cpm g;

      a(cpm $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public iv k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.bv() && this.a(this.g.dV(), this.e);
      }

      @Override
      public boolean b() {
         return !this.g.bv() && super.b();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dka $$0, iv $$1) {
         return $$0.a_($$1).a(dne.K) && $$0.a_($$1.d()).a(eyd.a);
      }
   }

   static class b extends chd {
      b(cpm $$0, djx $$1) {
         super($$0, $$1);
      }

      @Override
      protected eye a(int $$0) {
         this.o = new eyk();
         return new eye(this.o, $$0);
      }

      @Override
      protected boolean a(eyf $$0) {
         return $$0 != eyf.i && $$0 != eyf.o && $$0 != eyf.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(iv $$0) {
         return this.b.a_($$0).a(dne.K) || super.a($$0);
      }
   }
}
