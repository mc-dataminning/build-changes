import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cor extends ciu implements bxb {
   private static final alg bG = alg.b("suffocating");
   private static final byi bH = new byi(bG, -0.34F, byi.a.b);
   private static final float bI = 0.35F;
   private static final float bK = 0.55F;
   private static final akj<Integer> bL = akn.a(cor.class, akl.b);
   private static final akj<Boolean> bM = akn.a(cor.class, akl.k);
   private final bxa bN = new bxa(this.al, bL);
   @Nullable
   private cfi bO;

   public cor(bwo<? extends cor> $$0, dja $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(exf.j, -1.0F);
      this.a(exf.i, 0.0F);
      this.a(exf.n, 0.0F);
      this.a(exf.o, 0.0F);
   }

   public static boolean c(bwo<cor> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      iu.a $$5 = $$3.k();

      do {
         $$5.c(ja.b);
      } while ($$1.b_($$5).a(axh.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(akj<?> $$0) {
      if (bL.equals($$0) && this.dV().C) {
         this.bN.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bL, 0);
      $$0.a(bM, false);
   }

   @Override
   public boolean e(bwp $$0) {
      return $$0 != bwp.h ? super.e($$0) : this.bK() && !this.n_();
   }

   @Override
   protected boolean f(bwp $$0) {
      return $$0 == bwp.h || super.f($$0);
   }

   @Override
   protected je<awm> a(bwp $$0, czd $$1, dhm $$2) {
      return (je<awm>)($$0 == bwp.h ? awn.zi : super.a($$0, $$1, $$2));
   }

   @Override
   protected void D() {
      this.bD.a(1, new cet(this, 1.65));
      this.bD.a(2, new cdm(this, 1.0));
      this.bO = new cfi(this, 1.4, $$0 -> $$0.a(axk.az), false);
      this.bD.a(3, this.bO);
      this.bD.a(4, new cor.a(this, 1.0));
      this.bD.a(5, new cdz(this, 1.0));
      this.bD.a(7, new cex(this, 1.0, 60));
      this.bD.a(8, new cei(this, crc.class, 8.0F));
      this.bD.a(8, new cev(this));
      this.bD.a(9, new cei(this, cor.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.al.a(bM, $$0);
      byg $$1 = this.g(byk.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.a(bH);
         } else {
            $$1.c(bG);
         }
      }
   }

   public boolean q() {
      return this.al.a(bM);
   }

   @Override
   public boolean a(ewo $$0) {
      return $$0.a(axh.b);
   }

   @Override
   protected feq a(bwf $$0, bwi $$1, float $$2) {
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
   public boolean a(djd $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bxe cW() {
      return (bxe)(this.ak() && this.cZ() instanceof crc $$0 && $$0.b(czh.oB) ? $$0 : super.cW());
   }

   @Override
   public feq b(bxe $$0) {
      feq[] $$1 = new feq[]{
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

      for (feq $$6 : $$1) {
         $$5.b(this.dA() + $$6.d, $$3, this.dG() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(ja.a);
         }
      }

      for (iu $$8 : $$2) {
         if (!this.dV().b_($$8).a(axh.b)) {
            double $$9 = this.dV().j($$8);
            if (ctv.a($$9)) {
               feq $$10 = feq.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fO().iterator();

               while (var14.hasNext()) {
                  bxq $$11 = (bxq)var14.next();
                  fel $$12 = $$0.f($$11);
                  if (ctv.a(this.dV(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new feq(this.dA(), this.cR().e, this.dG());
   }

   @Override
   protected void a(crc $$0, feq $$1) {
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aV = this.aX = this.dL();
      this.bN.b();
      super.a($$0, $$1);
   }

   @Override
   protected feq b(crc $$0, feq $$1) {
      return new feq(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(crc $$0) {
      return (float)(this.h(byk.v) * (double)(this.q() ? 0.35F : 0.55F) * (double)this.bN.c());
   }

   @Override
   protected float aU() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(this.bw() ? awn.zg : awn.zf, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.bN.a(this.dY());
   }

   @Override
   protected void a(double $$0, boolean $$1, eah $$2, iu $$3) {
      if (this.bw()) {
         this.k();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void h() {
      if (this.x() && this.ae.a(140) == 0) {
         this.b(awn.zb);
      } else if (this.go() && this.ae.a(60) == 0) {
         this.b(awn.zc);
      }

      if (!this.gg()) {
         boolean $$2;
         boolean var10000;
         label36: {
            eah $$0 = this.dV().a_(this.dv());
            eah $$1 = this.bs();
            $$2 = $$0.a(axc.aW) || $$1.a(axc.aW) || this.b(axh.b) > 0.0;
            if (this.dk() instanceof cor $$3 && $$3.q()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.h();
      this.gr();
   }

   private boolean x() {
      return this.bO != null && this.bO.i();
   }

   @Override
   protected boolean F() {
      return true;
   }

   private void gr() {
      if (this.bw()) {
         fev $$0 = fev.a(this);
         if ($$0.a(drb.d, this.dv(), true) && !this.dV().b_(this.dv().d()).a(axh.b)) {
            this.d(true);
         } else {
            this.i(this.dy().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static byj.a t() {
      return ciu.gw().a(byk.v, 0.175F);
   }

   @Override
   protected awm u() {
      return !this.go() && !this.x() ? awn.za : null;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.ze;
   }

   @Override
   protected awm l_() {
      return awn.zd;
   }

   @Override
   protected boolean r(bwf $$0) {
      return !this.ca() && !this.a(axh.b);
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   protected cgo b(dja $$0) {
      return new cor.b(this, $$0);
   }

   @Override
   public float a(iu $$0, djd $$1) {
      if ($$1.a_($$0).y().a(axh.b)) {
         return 10.0F;
      } else {
         return this.bw() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cor b(arq $$0, bvv $$1) {
      return bwo.bt.a($$0, bwn.e);
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.ay);
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      boolean $$2 = this.i($$0.b($$1));
      if (!$$2 && this.ak() && !this.ca() && !$$0.fY()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bud.a;
      } else {
         bud $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            czd $$4 = $$0.b($$1);
            return (bud)(this.a($$4, bwp.h) ? $$4.a($$0, this, $$1) : bud.e);
         } else {
            if ($$2 && !this.bb()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.zh, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public feq cT() {
      return new feq(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      if (this.n_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azv $$4 = $$0.C_();
         if ($$4.a(30) == 0) {
            bxg $$5 = bwo.bR.a($$0.a(), bwn.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cox.b(cox.a($$4), false));
               $$5.a(bwp.a, new czd(czh.oB));
               this.a(bwp.h, new czd(czh.ou));
               this.g(bwp.h);
            }
         } else if ($$4.a(10) == 0) {
            bvv $$6 = bwo.bt.a($$0.a(), bwn.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bvv.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bxw a(djr $$0, bub $$1, bxg $$2, @Nullable bxw $$3) {
      $$2.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
      $$2.a($$0, $$1, bwn.g, $$3);
      $$2.a(this, true);
      return new bvv.a(0.0F);
   }

   static class a extends cen {
      private final cor g;

      a(cor $$0, double $$1) {
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
      protected boolean a(djd $$0, iu $$1) {
         return $$0.a_($$1).a(dmh.K) && $$0.a_($$1.d()).a(exd.a);
      }
   }

   static class b extends cgn {
      b(cor $$0, dja $$1) {
         super($$0, $$1);
      }

      @Override
      protected exe a(int $$0) {
         this.o = new exk();
         return new exe(this.o, $$0);
      }

      @Override
      protected boolean a(exf $$0) {
         return $$0 != exf.i && $$0 != exf.o && $$0 != exf.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(iu $$0) {
         return this.b.a_($$0).a(dmh.K) || super.a($$0);
      }
   }
}
