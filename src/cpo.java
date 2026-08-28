import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cpo extends cjm implements bxt {
   private static final alk bI = alk.b("suffocating");
   private static final bza bJ = new bza(bI, -0.34F, bza.a.b);
   private static final float bK = 0.35F;
   private static final float bM = 0.55F;
   private static final akn<Integer> bN = akr.a(cpo.class, akp.b);
   private static final akn<Boolean> bO = akr.a(cpo.class, akp.k);
   private final bxs bP = new bxs(this.al, bN);
   @Nullable
   private cga bQ;

   public cpo(bxe<? extends cpo> $$0, djz $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(eyh.j, -1.0F);
      this.a(eyh.i, 0.0F);
      this.a(eyh.n, 0.0F);
      this.a(eyh.o, 0.0F);
   }

   public static boolean c(bxe<cpo> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      iw.a $$5 = $$3.k();

      do {
         $$5.c(jc.b);
      } while ($$1.b_($$5).a(axl.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(akn<?> $$0) {
      if (bN.equals($$0) && this.dV().C) {
         this.bP.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bN, 0);
      $$0.a(bO, false);
   }

   @Override
   public boolean e(bxf $$0) {
      return $$0 != bxf.h ? super.e($$0) : this.bJ() && !this.n_();
   }

   @Override
   protected boolean f(bxf $$0) {
      return $$0 == bxf.h || super.f($$0);
   }

   @Override
   protected jg<awq> a(bxf $$0, daa $$1, dij $$2) {
      return (jg<awq>)($$0 == bxf.h ? awr.zi : super.a($$0, $$1, $$2));
   }

   @Override
   protected void D() {
      this.bF.a(1, new cfl(this, 1.65));
      this.bF.a(2, new cee(this, 1.0));
      this.bQ = new cga(this, 1.4, $$0 -> $$0.a(axo.aA), false);
      this.bF.a(3, this.bQ);
      this.bF.a(4, new cpo.a(this, 1.0));
      this.bF.a(5, new cer(this, 1.0));
      this.bF.a(7, new cfp(this, 1.0, 60));
      this.bF.a(8, new cfa(this, crz.class, 8.0F));
      this.bF.a(8, new cfn(this));
      this.bF.a(9, new cfa(this, cpo.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.al.a(bO, $$0);
      byy $$1 = this.g(bzc.v);
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
   public boolean a(exq $$0) {
      return $$0.a(axl.b);
   }

   @Override
   protected ffs a(bwv $$0, bwy $$1, float $$2) {
      if (!this.dV().A_()) {
         return super.a($$0, $$1, $$2);
      } else {
         float $$3 = Math.min(0.25F, this.aT.b());
         float $$4 = this.aT.c();
         float $$5 = 0.12F * azq.b($$4 * 1.5F) * 2.0F * $$3;
         return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
      }
   }

   @Override
   public boolean a(dkc $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bxw cW() {
      return (bxw)(this.fZ() && this.cZ() instanceof crz $$0 && $$0.b(dae.oB) ? $$0 : super.cW());
   }

   @Override
   public ffs b(bxw $$0) {
      ffs[] $$1 = new ffs[]{
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

      for (ffs $$6 : $$1) {
         $$5.b(this.dA() + $$6.d, $$3, this.dG() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jc.a);
         }
      }

      for (iw $$8 : $$2) {
         if (!this.dV().b_($$8).a(axl.b)) {
            double $$9 = this.dV().j($$8);
            if (cus.a($$9)) {
               ffs $$10 = ffs.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fO().iterator();

               while (var14.hasNext()) {
                  byi $$11 = (byi)var14.next();
                  ffn $$12 = $$0.f($$11);
                  if (cus.a(this.dV(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ffs(this.dA(), this.cR().e, this.dG());
   }

   @Override
   protected void a(crz $$0, ffs $$1) {
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aV = this.aX = this.dL();
      this.bP.b();
      super.a($$0, $$1);
   }

   @Override
   protected ffs b(crz $$0, ffs $$1) {
      return new ffs(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(crz $$0) {
      return (float)(this.h(bzc.v) * (double)(this.q() ? 0.35F : 0.55F) * (double)this.bP.c());
   }

   @Override
   protected float aT() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(this.bv() ? awr.zg : awr.zf, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.bP.a(this.dY());
   }

   @Override
   protected void a(double $$0, boolean $$1, ebg $$2, iw $$3) {
      if (this.bv()) {
         this.k();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void h() {
      if (this.x() && this.ae.a(140) == 0) {
         this.b(awr.zb);
      } else if (this.gr() && this.ae.a(60) == 0) {
         this.b(awr.zc);
      }

      if (!this.gj()) {
         boolean $$2;
         boolean var10000;
         label36: {
            ebg $$0 = this.dV().a_(this.dv());
            ebg $$1 = this.br();
            $$2 = $$0.a(axg.aW) || $$1.a(axg.aW) || this.b(axl.b) > 0.0;
            if (this.dk() instanceof cpo $$3 && $$3.q()) {
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
         ffx $$0 = ffx.a(this);
         if ($$0.a(dsa.d, this.dv(), true) && !this.dV().b_(this.dv().d()).a(axl.b)) {
            this.d(true);
         } else {
            this.i(this.dy().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bzb.a t() {
      return cjm.gz().a(bzc.v, 0.175F);
   }

   @Override
   protected awq u() {
      return !this.gr() && !this.x() ? awr.za : null;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.ze;
   }

   @Override
   protected awq l_() {
      return awr.zd;
   }

   @Override
   protected boolean r(bwv $$0) {
      return !this.bZ() && !this.a(axl.b);
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
   protected chg b(djz $$0) {
      return new cpo.b(this, $$0);
   }

   @Override
   public float a(iw $$0, dkc $$1) {
      if ($$1.a_($$0).y().a(axl.b)) {
         return 10.0F;
      } else {
         return this.bv() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cpo b(aru $$0, bwl $$1) {
      return bxe.bu.a($$0, bxd.e);
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.az);
   }

   @Override
   public but b(crz $$0, bus $$1) {
      boolean $$2 = this.i($$0.b($$1));
      if (!$$2 && this.fZ() && !this.bZ() && !$$0.fY()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return but.a;
      } else {
         but $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            daa $$4 = $$0.b($$1);
            return (but)(this.a($$4, bxf.h) ? $$4.a($$0, this, $$1) : but.e);
         } else {
            if ($$2 && !this.ba()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awr.zh, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ffs cT() {
      return new ffs(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      if (this.n_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azz $$4 = $$0.G_();
         if ($$4.a(30) == 0) {
            bxy $$5 = bxe.bS.a($$0.a(), bxd.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cpu.b(cpu.a($$4), false));
               $$5.a(bxf.a, new daa(dae.oB));
               this.a(bxf.h, new daa(dae.ou));
               this.g(bxf.h);
            }
         } else if ($$4.a(10) == 0) {
            bwl $$6 = bxe.bu.a($$0.a(), bxd.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bwl.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private byo a(dkq $$0, bur $$1, bxy $$2, @Nullable byo $$3) {
      $$2.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
      $$2.a($$0, $$1, bxd.g, $$3);
      $$2.a(this, true);
      return new bwl.a(0.0F);
   }

   static class a extends cff {
      private final cpo g;

      a(cpo $$0, double $$1) {
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
      protected boolean a(dkc $$0, iw $$1) {
         return $$0.a_($$1).a(dng.K) && $$0.a_($$1.d()).a(eyf.a);
      }
   }

   static class b extends chf {
      b(cpo $$0, djz $$1) {
         super($$0, $$1);
      }

      @Override
      protected eyg a(int $$0) {
         this.o = new eym();
         return new eyg(this.o, $$0);
      }

      @Override
      protected boolean a(eyh $$0) {
         return $$0 != eyh.i && $$0 != eyh.o && $$0 != eyh.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(iw $$0) {
         return this.b.a_($$0).a(dng.K) || super.a($$0);
      }
   }
}
