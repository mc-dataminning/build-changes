import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cpx extends cjv implements byc {
   private static final alr bI = alr.b("suffocating");
   private static final bzj bJ = new bzj(bI, -0.34F, bzj.a.b);
   private static final float bK = 0.35F;
   private static final float bM = 0.55F;
   private static final aku<Integer> bN = aky.a(cpx.class, akw.b);
   private static final aku<Boolean> bO = aky.a(cpx.class, akw.k);
   private final byb bP = new byb(this.al, bN);
   @Nullable
   private cgj bQ;

   public cpx(bxn<? extends cpx> $$0, dkj $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(eyr.j, -1.0F);
      this.a(eyr.i, 0.0F);
      this.a(eyr.n, 0.0F);
      this.a(eyr.o, 0.0F);
   }

   public static boolean c(bxn<cpx> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      iw.a $$5 = $$3.k();

      do {
         $$5.c(jc.b);
      } while ($$1.b_($$5).a(axs.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(aku<?> $$0) {
      if (bN.equals($$0) && this.dV().C) {
         this.bP.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bN, 0);
      $$0.a(bO, false);
   }

   @Override
   public boolean e(bxo $$0) {
      return $$0 != bxo.h ? super.e($$0) : this.bJ() && !this.e_();
   }

   @Override
   protected boolean f(bxo $$0) {
      return $$0 == bxo.h || super.f($$0);
   }

   @Override
   protected jg<awx> a(bxo $$0, dak $$1, dit $$2) {
      return (jg<awx>)($$0 == bxo.h ? awy.zi : super.a($$0, $$1, $$2));
   }

   @Override
   protected void C() {
      this.bF.a(1, new cfu(this, 1.65));
      this.bF.a(2, new cen(this, 1.0));
      this.bQ = new cgj(this, 1.4, $$0 -> $$0.a(axv.aA), false);
      this.bF.a(3, this.bQ);
      this.bF.a(4, new cpx.a(this, 1.0));
      this.bF.a(5, new cfa(this, 1.0));
      this.bF.a(7, new cfy(this, 1.0, 60));
      this.bF.a(8, new cfj(this, csi.class, 8.0F));
      this.bF.a(8, new cfw(this));
      this.bF.a(9, new cfj(this, cpx.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.al.a(bO, $$0);
      bzh $$1 = this.g(bzl.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.a(bJ);
         } else {
            $$1.c(bI);
         }
      }
   }

   public boolean m() {
      return this.al.a(bO);
   }

   @Override
   public boolean a(eya $$0) {
      return $$0.a(axs.b);
   }

   @Override
   protected fgc a(bxe $$0, bxh $$1, float $$2) {
      if (!this.dV().A_()) {
         return super.a($$0, $$1, $$2);
      } else {
         float $$3 = Math.min(0.25F, this.aT.b());
         float $$4 = this.aT.c();
         float $$5 = 0.12F * azz.b($$4 * 1.5F) * 2.0F * $$3;
         return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
      }
   }

   @Override
   public boolean a(dkm $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public byf cW() {
      return (byf)(this.fZ() && this.cZ() instanceof csi $$0 && $$0.b(dao.oB) ? $$0 : super.cW());
   }

   @Override
   public fgc b(byf $$0) {
      fgc[] $$1 = new fgc[]{
         a((double)this.dq(), (double)$$0.dq(), $$0.dL()),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() - 22.5F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() + 22.5F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() - 45.0F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() + 45.0F)
      };
      Set<iw> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cR().e;
      double $$4 = this.cR().b - 0.5;
      iw.a $$5 = new iw.a();

      for (fgc $$6 : $$1) {
         $$5.b(this.dA() + $$6.d, $$3, this.dG() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jc.a);
         }
      }

      for (iw $$8 : $$2) {
         if (!this.dV().b_($$8).a(axs.b)) {
            double $$9 = this.dV().j($$8);
            if (cvb.a($$9)) {
               fgc $$10 = fgc.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fO().iterator();

               while (var14.hasNext()) {
                  byr $$11 = (byr)var14.next();
                  ffx $$12 = $$0.f($$11);
                  if (cvb.a(this.dV(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new fgc(this.dA(), this.cR().e, this.dG());
   }

   @Override
   protected void a(csi $$0, fgc $$1) {
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aV = this.aX = this.dL();
      this.bP.b();
      super.a($$0, $$1);
   }

   @Override
   protected fgc b(csi $$0, fgc $$1) {
      return new fgc(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(csi $$0) {
      return (float)(this.h(bzl.v) * (double)(this.m() ? 0.35F : 0.55F) * (double)this.bP.c());
   }

   @Override
   protected float aT() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(this.bv() ? awy.zg : awy.zf, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.bP.a(this.dY());
   }

   @Override
   protected void a(double $$0, boolean $$1, ebq $$2, iw $$3) {
      if (this.bv()) {
         this.j();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void g() {
      if (this.u() && this.ae.a(140) == 0) {
         this.b(awy.zb);
      } else if (this.gr() && this.ae.a(60) == 0) {
         this.b(awy.zc);
      }

      if (!this.gj()) {
         boolean $$2;
         boolean var10000;
         label36: {
            ebq $$0 = this.dV().a_(this.dv());
            ebq $$1 = this.br();
            $$2 = $$0.a(axn.aW) || $$1.a(axn.aW) || this.b(axs.b) > 0.0;
            if (this.dk() instanceof cpx $$3 && $$3.m()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.g();
      this.gu();
   }

   private boolean u() {
      return this.bQ != null && this.bQ.i();
   }

   @Override
   protected boolean E() {
      return true;
   }

   private void gu() {
      if (this.bv()) {
         fgh $$0 = fgh.a(this);
         if ($$0.a(dsk.d, this.dv(), true) && !this.dV().b_(this.dv().d()).a(axs.b)) {
            this.d(true);
         } else {
            this.i(this.dy().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bzk.a p() {
      return cjv.gz().a(bzl.v, 0.175F);
   }

   @Override
   protected awx s() {
      return !this.gr() && !this.u() ? awy.za : null;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.ze;
   }

   @Override
   protected awx j_() {
      return awy.zd;
   }

   @Override
   protected boolean r(bxe $$0) {
      return !this.bZ() && !this.a(axs.b);
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
   protected chp b(dkj $$0) {
      return new cpx.b(this, $$0);
   }

   @Override
   public float a(iw $$0, dkm $$1) {
      if ($$1.a_($$0).y().a(axs.b)) {
         return 10.0F;
      } else {
         return this.bv() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cpx b(asb $$0, bwu $$1) {
      return bxn.bu.a($$0, bxm.e);
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.az);
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      boolean $$2 = this.i($$0.b($$1));
      if (!$$2 && this.fZ() && !this.bZ() && !$$0.fY()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bvc.a;
      } else {
         bvc $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            dak $$4 = $$0.b($$1);
            return (bvc)(this.a($$4, bxo.h) ? $$4.a($$0, this, $$1) : bvc.e);
         } else {
            if ($$2 && !this.ba()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awy.zh, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public fgc cT() {
      return new fgc(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      if (this.e_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         bai $$4 = $$0.G_();
         if ($$4.a(30) == 0) {
            byh $$5 = bxn.bS.a($$0.a(), bxm.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cqd.b(cqd.a($$4), false));
               $$5.a(bxo.a, new dak(dao.oB));
               this.a(bxo.h, new dak(dao.ou));
               this.g(bxo.h);
            }
         } else if ($$4.a(10) == 0) {
            bwu $$6 = bxn.bu.a($$0.a(), bxm.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bwu.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private byx a(dla $$0, bva $$1, byh $$2, @Nullable byx $$3) {
      $$2.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
      $$2.a($$0, $$1, bxm.g, $$3);
      $$2.a(this, true);
      return new bwu.a(0.0F);
   }

   static class a extends cfo {
      private final cpx g;

      a(cpx $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public iw k() {
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
      protected boolean a(dkm $$0, iw $$1) {
         return $$0.a_($$1).a(dnq.K) && $$0.a_($$1.d()).a(eyp.a);
      }
   }

   static class b extends cho {
      b(cpx $$0, dkj $$1) {
         super($$0, $$1);
      }

      @Override
      protected eyq a(int $$0) {
         this.o = new eyw();
         return new eyq(this.o, $$0);
      }

      @Override
      protected boolean a(eyr $$0) {
         return $$0 != eyr.i && $$0 != eyr.o && $$0 != eyr.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(iw $$0) {
         return this.b.a_($$0).a(dnq.K) || super.a($$0);
      }
   }
}
