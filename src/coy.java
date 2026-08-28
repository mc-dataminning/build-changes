import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class coy extends ciz implements bxg {
   private static final alg bG = alg.b("suffocating");
   private static final byn bH = new byn(bG, -0.34F, byn.a.b);
   private static final float bI = 0.35F;
   private static final float bK = 0.55F;
   private static final akj<Integer> bL = akn.a(coy.class, akl.b);
   private static final akj<Boolean> bM = akn.a(coy.class, akl.k);
   private final bxf bN = new bxf(this.al, bL);
   @Nullable
   private cfn bO;

   public coy(bwr<? extends coy> $$0, djh $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(exm.j, -1.0F);
      this.a(exm.i, 0.0F);
      this.a(exm.n, 0.0F);
      this.a(exm.o, 0.0F);
   }

   public static boolean c(bwr<coy> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      iv.a $$5 = $$3.k();

      do {
         $$5.c(jb.b);
      } while ($$1.b_($$5).a(axh.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(akj<?> $$0) {
      if (bL.equals($$0) && this.dU().C) {
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
   public boolean e(bws $$0) {
      return $$0 != bws.h ? super.e($$0) : this.bI() && !this.n_();
   }

   @Override
   protected boolean f(bws $$0) {
      return $$0 == bws.h || super.f($$0);
   }

   @Override
   protected jf<awm> a(bws $$0, czk $$1, dht $$2) {
      return (jf<awm>)($$0 == bws.h ? awn.zi : super.a($$0, $$1, $$2));
   }

   @Override
   protected void D() {
      this.bD.a(1, new cey(this, 1.65));
      this.bD.a(2, new cdr(this, 1.0));
      this.bO = new cfn(this, 1.4, $$0 -> $$0.a(axk.az), false);
      this.bD.a(3, this.bO);
      this.bD.a(4, new coy.a(this, 1.0));
      this.bD.a(5, new cee(this, 1.0));
      this.bD.a(7, new cfc(this, 1.0, 60));
      this.bD.a(8, new cen(this, crj.class, 8.0F));
      this.bD.a(8, new cfa(this));
      this.bD.a(9, new cen(this, coy.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.al.a(bM, $$0);
      byl $$1 = this.g(byp.v);
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
   public boolean a(ewv $$0) {
      return $$0.a(axh.b);
   }

   @Override
   protected fex a(bwi $$0, bwl $$1, float $$2) {
      if (!this.dU().w_()) {
         return super.a($$0, $$1, $$2);
      } else {
         float $$3 = Math.min(0.25F, this.aT.b());
         float $$4 = this.aT.c();
         float $$5 = 0.12F * azm.b($$4 * 1.5F) * 2.0F * $$3;
         return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
      }
   }

   @Override
   public boolean a(djk $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bxj cV() {
      return (bxj)(this.fY() && this.cY() instanceof crj $$0 && $$0.b(czo.oB) ? $$0 : super.cV());
   }

   @Override
   public fex b(bxj $$0) {
      fex[] $$1 = new fex[]{
         a((double)this.dp(), (double)$$0.dp(), $$0.dK()),
         a((double)this.dp(), (double)$$0.dp(), $$0.dK() - 22.5F),
         a((double)this.dp(), (double)$$0.dp(), $$0.dK() + 22.5F),
         a((double)this.dp(), (double)$$0.dp(), $$0.dK() - 45.0F),
         a((double)this.dp(), (double)$$0.dp(), $$0.dK() + 45.0F)
      };
      Set<iv> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cQ().e;
      double $$4 = this.cQ().b - 0.5;
      iv.a $$5 = new iv.a();

      for (fex $$6 : $$1) {
         $$5.b(this.dz() + $$6.d, $$3, this.dF() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jb.a);
         }
      }

      for (iv $$8 : $$2) {
         if (!this.dU().b_($$8).a(axh.b)) {
            double $$9 = this.dU().j($$8);
            if (cuc.a($$9)) {
               fex $$10 = fex.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fN().iterator();

               while (var14.hasNext()) {
                  bxv $$11 = (bxv)var14.next();
                  fes $$12 = $$0.f($$11);
                  if (cuc.a(this.dU(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new fex(this.dz(), this.cQ().e, this.dF());
   }

   @Override
   protected void a(crj $$0, fex $$1) {
      this.b($$0.dK(), $$0.dM() * 0.5F);
      this.N = this.aV = this.aX = this.dK();
      this.bN.b();
      super.a($$0, $$1);
   }

   @Override
   protected fex b(crj $$0, fex $$1) {
      return new fex(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(crj $$0) {
      return (float)(this.h(byp.v) * (double)(this.q() ? 0.35F : 0.55F) * (double)this.bN.c());
   }

   @Override
   protected float aS() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(iv $$0, eao $$1) {
      this.a(this.bu() ? awn.zg : awn.zf, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.bN.a(this.dX());
   }

   @Override
   protected void a(double $$0, boolean $$1, eao $$2, iv $$3) {
      if (this.bu()) {
         this.k();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void h() {
      if (this.x() && this.ae.a(140) == 0) {
         this.b(awn.zb);
      } else if (this.gq() && this.ae.a(60) == 0) {
         this.b(awn.zc);
      }

      if (!this.gi()) {
         boolean $$2;
         boolean var10000;
         label36: {
            eao $$0 = this.dU().a_(this.du());
            eao $$1 = this.bq();
            $$2 = $$0.a(axc.aW) || $$1.a(axc.aW) || this.b(axh.b) > 0.0;
            if (this.dj() instanceof coy $$3 && $$3.q()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.h();
      this.gt();
   }

   private boolean x() {
      return this.bO != null && this.bO.i();
   }

   @Override
   protected boolean F() {
      return true;
   }

   private void gt() {
      if (this.bu()) {
         ffc $$0 = ffc.a(this);
         if ($$0.a(dri.d, this.du(), true) && !this.dU().b_(this.du().d()).a(axh.b)) {
            this.d(true);
         } else {
            this.i(this.dx().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static byo.a t() {
      return ciz.gy().a(byp.v, 0.175F);
   }

   @Override
   protected awm u() {
      return !this.gq() && !this.x() ? awn.za : null;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.ze;
   }

   @Override
   protected awm l_() {
      return awn.zd;
   }

   @Override
   protected boolean r(bwi $$0) {
      return !this.bY() && !this.a(axh.b);
   }

   @Override
   public boolean fq() {
      return true;
   }

   @Override
   public boolean bW() {
      return false;
   }

   @Override
   protected cgt b(djh $$0) {
      return new coy.b(this, $$0);
   }

   @Override
   public float a(iv $$0, djk $$1) {
      if ($$1.a_($$0).y().a(axh.b)) {
         return 10.0F;
      } else {
         return this.bu() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public coy b(arq $$0, bvy $$1) {
      return bwr.bt.a($$0, bwq.e);
   }

   @Override
   public boolean i(czk $$0) {
      return $$0.a(axk.ay);
   }

   @Override
   public bug b(crj $$0, buf $$1) {
      boolean $$2 = this.i($$0.b($$1));
      if (!$$2 && this.fY() && !this.bY() && !$$0.fX()) {
         if (!this.dU().C) {
            $$0.n(this);
         }

         return bug.a;
      } else {
         bug $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            czk $$4 = $$0.b($$1);
            return (bug)(this.a($$4, bws.h) ? $$4.a($$0, this, $$1) : bug.e);
         } else {
            if ($$2 && !this.aZ()) {
               this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.zh, this.dl(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public fex cS() {
      return new fex(0.0, (double)(0.6F * this.cR()), (double)(this.dp() * 0.4F));
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      if (this.n_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azv $$4 = $$0.C_();
         if ($$4.a(30) == 0) {
            bxl $$5 = bwr.bR.a($$0.a(), bwq.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cpe.b(cpe.a($$4), false));
               $$5.a(bws.a, new czk(czo.oB));
               this.a(bws.h, new czk(czo.ou));
               this.g(bws.h);
            }
         } else if ($$4.a(10) == 0) {
            bvy $$6 = bwr.bt.a($$0.a(), bwq.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bvy.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private byb a(djy $$0, bue $$1, bxl $$2, @Nullable byb $$3) {
      $$2.b(this.dz(), this.dB(), this.dF(), this.dK(), 0.0F);
      $$2.a($$0, $$1, bwq.g, $$3);
      $$2.a(this, true);
      return new bvy.a(0.0F);
   }

   static class a extends ces {
      private final coy g;

      a(coy $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public iv k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.bu() && this.a(this.g.dU(), this.e);
      }

      @Override
      public boolean b() {
         return !this.g.bu() && super.b();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(djk $$0, iv $$1) {
         return $$0.a_($$1).a(dmo.K) && $$0.a_($$1.d()).a(exk.a);
      }
   }

   static class b extends cgs {
      b(coy $$0, djh $$1) {
         super($$0, $$1);
      }

      @Override
      protected exl a(int $$0) {
         this.o = new exr();
         return new exl(this.o, $$0);
      }

      @Override
      protected boolean a(exm $$0) {
         return $$0 != exm.i && $$0 != exm.o && $$0 != exm.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(iv $$0) {
         return this.b.a_($$0).a(dmo.K) || super.a($$0);
      }
   }
}
