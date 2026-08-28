import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cju extends bxv implements bxe {
   private static final akh<Boolean> bL = akl.a(cju.class, akj.k);
   private static final akh<Integer> bM = akl.a(cju.class, akj.b);
   private static final akh<Integer> bN = akl.a(cju.class, akj.b);
   private static final akh<je<cjv>> bO = akl.a(cju.class, akj.y);
   public static final cho.a bJ = ($$0, $$1) -> {
      bwj<?> $$2 = $$0.aq();
      return $$2 == bwj.bb || $$2 == bwj.aY || $$2 == bwj.aa;
   };
   private static final float bP = 8.0F;
   private static final float bQ = 40.0F;
   private static final float bR = 0.125F;
   public static final float bK = (float) (Math.PI / 5);
   private float bS;
   private float bT;
   private boolean bU;
   private boolean bV;
   private float bW;
   private float bX;
   private static final btj bY = bao.a(20, 39);
   @Nullable
   private UUID bZ;

   public cju(bwj<? extends cju> $$0, dip $$1) {
      super($$0, $$1);
      this.a(false, false);
      this.a(ewm.f, -1.0F);
      this.a(ewm.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cdp(this));
      this.bC.a(1, new bxv.a(1.5, axb.G));
      this.bC.a(2, new cfa(this));
      this.bC.a(3, new cju.a<>(this, cla.class, 24.0F, 1.5, 1.5));
      this.bC.a(4, new ceb(this, 0.4F));
      this.bC.a(5, new cef(this, 1.0, true));
      this.bC.a(6, new cdt(this, 1.0, 10.0F, 2.0F));
      this.bC.a(7, new cdh(this, 1.0));
      this.bC.a(8, new cfi(this, 1.0));
      this.bC.a(9, new cdd(this, 8.0F));
      this.bC.a(10, new ced(this, cqs.class, 8.0F));
      this.bC.a(10, new ceq(this));
      this.bD.a(1, new cfs(this));
      this.bD.a(2, new cft(this));
      this.bD.a(3, new cfn(this).a());
      this.bD.a(4, new cfo<>(this, cqs.class, 10, true, false, this::a));
      this.bD.a(5, new cfr<>(this, cio.class, false, bJ));
      this.bD.a(6, new cfr<>(this, cjs.class, false, cjs.bF));
      this.bD.a(7, new cfo<>(this, cnb.class, false));
      this.bD.a(8, new cfu<>(this, true));
   }

   public ale gC() {
      cjv $$0 = this.gH().a();
      if (this.q()) {
         return $$0.b().b().b();
      } else {
         return this.W_() ? $$0.b().c().b() : $$0.b().a().b();
      }
   }

   private je<cjv> gH() {
      return this.al.a(bO);
   }

   private void j(je<cjv> $$0) {
      this.al.a(bO, $$0);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      if ($$0 == kj.aw) {
         return c((ki<T>)$$0, this.gH());
      } else {
         return $$0 == kj.ax ? c((ki<T>)$$0, this.gF()) : super.a($$0);
      }
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aw);
      this.a($$0, kj.ax);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aw) {
         this.j(c(kj.aw, $$1));
         return true;
      } else if ($$0 == kj.ax) {
         this.a(c(kj.ax, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public static bye.a gD() {
      return cio.gv().a(byf.v, 0.3F).a(byf.s, 8.0).a(byf.c, 4.0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bO, cta.a(this.dX(), cjw.j));
      $$0.a(bL, false);
      $$0.a(bM, cxq.o.a());
      $$0.a(bN, 0);
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.DR, 0.15F, 1.0F);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gF().a());
      cta.a($$0, this.gH());
      this.a_($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      cta.a($$0, this.dX(), mg.bk).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cxq.a($$0.h("CollarColor")));
      }

      this.a(this.dV(), $$0);
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      if ($$3 instanceof cju.b $$4) {
         this.j($$4.a);
      } else {
         Optional<? extends je<cjv>> $$5 = cjw.a(this.ae, this.dX(), csx.a($$0, this.dv()));
         if ($$5.isPresent()) {
            this.j((je<cjv>)$$5.get());
            $$3 = new cju.b((je<cjv>)$$5.get());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awk u() {
      if (this.W_()) {
         return awl.DM;
      } else if (this.ae.a(3) == 0) {
         return this.q() && this.eF() < 20.0F ? awl.DS : awl.DP;
      } else {
         return awl.DK;
      }
   }

   @Override
   protected awk e(bup $$0) {
      return this.j($$0) ? awl.DI : awl.DO;
   }

   @Override
   protected awk l_() {
      return awl.DL;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C && this.bU && !this.bV && !this.gm() && this.aJ()) {
         this.bV = true;
         this.bW = 0.0F;
         this.bX = 0.0F;
         this.dV().a(this, (byte)8);
      }

      if (!this.dV().C) {
         this.a((aro)this.dV(), true);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.bK()) {
         this.bT = this.bS;
         if (this.gG()) {
            this.bS = this.bS + (1.0F - this.bS) * 0.4F;
         } else {
            this.bS = this.bS + (0.0F - this.bS) * 0.4F;
         }

         if (this.bl()) {
            this.bU = true;
            if (this.bV && !this.dV().C) {
               this.dV().a(this, (byte)56);
               this.gI();
            }
         } else if ((this.bU || this.bV) && this.bV) {
            if (this.bW == 0.0F) {
               this.a(awl.DQ, this.fd(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(eeo.u);
            }

            this.bX = this.bW;
            this.bW += 0.05F;
            if (this.bX >= 2.0F) {
               this.bU = false;
               this.bV = false;
               this.bX = 0.0F;
               this.bW = 0.0F;
            }

            if (this.bW > 0.4F) {
               float $$0 = (float)this.dC();
               int $$1 = (int)(azk.a((this.bW - 0.4F) * (float) Math.PI) * 7.0F);
               fdw $$2 = this.dy();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  this.dV().a(lx.ap, this.dA() + (double)$$4, (double)($$0 + 0.8F), this.dG() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gI() {
      this.bV = false;
      this.bW = 0.0F;
      this.bX = 0.0F;
   }

   @Override
   public void a(bup $$0) {
      this.bU = false;
      this.bV = false;
      this.bX = 0.0F;
      this.bW = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.bU ? 1.0F : Math.min(0.75F + azk.h($$0, this.bX, this.bW) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azk.h($$0, this.bX, this.bW);
   }

   public float L(float $$0) {
      return azk.h($$0, this.bT, this.bS) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ac() {
      return this.x() ? 20 : super.ac();
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(aro $$0, bup $$1, float $$2) {
      if (!this.j($$1)) {
         super.b($$0, $$1, $$2);
      } else {
         cys $$3 = this.aj();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(azk.f($$2), this, bwk.g);
         if (bvw.b.a($$4, $$5) != bvw.b.a(this.aj())) {
            this.a(awl.DH);
            $$0.a(new lt(lx.U, cyw.oZ.m()), this.dA(), this.dC() + 1.0, this.dG(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean j(bup $$0) {
      return this.aj().a(cyw.pa) && !$$0.a(axb.C);
   }

   @Override
   protected void t() {
      if (this.q()) {
         this.g(byf.s).a(40.0);
         this.d(40.0F);
      } else {
         this.g(byf.s).a(8.0);
      }
   }

   @Override
   protected void c(bup $$0, float $$1) {
      this.a($$0, $$1, new bwk[]{bwk.g});
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      cyo $$3 = $$2.h();
      if (this.q()) {
         if (this.k($$2) && this.eF() < this.eT()) {
            this.a($$0, $$1, $$2);
            cuh $$4 = $$2.a(kj.v);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bty.a;
         } else {
            if ($$3 instanceof cxr $$6 && this.j($$0)) {
               cxq $$7 = $$6.a();
               if ($$7 != this.gF()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bty.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bwk.g) && !this.fW() && this.j($$0) && !this.n_()) {
               this.i($$2.c(1));
               $$2.a(1, $$0);
               return bty.a;
            } else if ($$2.a(cyw.sW) && this.j($$0) && this.fW() && (!dfh.a(this.aj(), dfg.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(awl.az);
               cys $$8 = this.aj();
               this.i(cys.k);
               if (this.dV() instanceof aro $$9) {
                  this.a($$9, $$8);
               }

               return bty.a;
            } else if (this.x() && this.fW() && this.j($$0) && this.aj().n() && this.aj().c($$2)) {
               $$2.h(1);
               this.a(awl.DJ);
               cys $$10 = this.aj();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return bty.a;
            } else {
               bty $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.j($$0)) {
                  this.y(!this.gq());
                  this.bf = false;
                  this.bB.m();
                  this.g(null);
                  return bty.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dV().C && $$2.a(cyw.sA) && !this.W_()) {
         $$2.a(1, $$0);
         this.f($$0);
         return bty.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void f(cqs $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.bB.m();
         this.g(null);
         this.y(true);
         this.dV().a(this, (byte)7);
      } else {
         this.dV().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.bV = true;
         this.bW = 0.0F;
         this.bX = 0.0F;
      } else if ($$0 == 56) {
         this.gI();
      } else {
         super.b($$0);
      }
   }

   public float gE() {
      if (this.W_()) {
         return 1.5393804F;
      } else if (this.q()) {
         float $$0 = this.eT();
         float $$1 = ($$0 - this.eF()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.ag);
   }

   @Override
   public int ai() {
      return 8;
   }

   @Override
   public int a() {
      return this.al.a(bN);
   }

   @Override
   public void a(int $$0) {
      this.al.a(bN, $$0);
   }

   @Override
   public void c() {
      this.a(bY.a(this.ae));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bZ;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bZ = $$0;
   }

   public cxq gF() {
      return cxq.a(this.al.a(bM));
   }

   private void a(cxq $$0) {
      this.al.a(bM, $$0.a());
   }

   @Nullable
   public cju b(aro $$0, bvq $$1) {
      cju $$2 = bwj.bM.a($$0, bwi.e);
      if ($$2 != null && $$1 instanceof cju $$3) {
         if (this.ae.h()) {
            $$2.j(this.gH());
         } else {
            $$2.j($$3.gH());
         }

         if (this.q()) {
            $$2.a(this.d());
            $$2.a(true, true);
            cxq $$4 = this.gF();
            cxq $$5 = $$3.gF();
            $$2.a(cxq.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.al.a(bL, $$0);
   }

   @Override
   public boolean a(cio $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof cju $$1)) {
         return false;
      } else if (!$$1.q()) {
         return false;
      } else {
         return $$1.x() ? false : this.gA() && $$1.gA();
      }
   }

   public boolean gG() {
      return this.al.a(bL);
   }

   @Override
   public boolean a(bwz $$0, bwz $$1) {
      if ($$0 instanceof cnf || $$0 instanceof cnn || $$0 instanceof cmm) {
         return false;
      } else if ($$0 instanceof cju $$2) {
         return !$$2.q() || $$2.e() != $$1;
      } else {
         if ($$0 instanceof cqs $$3 && $$1 instanceof cqs $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof ckx $$5 && $$5.gH()) {
            return false;
         }

         if ($$0 instanceof bxv $$6 && $$6.q()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean w() {
      return !this.W_();
   }

   @Override
   public fdw cT() {
      return new fdw(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   public static boolean c(bwj<cju> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return $$1.a_($$3.e()).a(axa.ci) && a($$1, $$3);
   }

   class a<T extends bwz> extends cdc<T> {
      private final cju j;

      public a(final cju $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cla ? !this.j.q() && this.a((cla)this.b) : false;
      }

      private boolean a(cla $$0) {
         return $$0.gu() >= cju.this.ae.a(5);
      }

      @Override
      public void d() {
         cju.this.g(null);
         super.d();
      }

      @Override
      public void a() {
         cju.this.g(null);
         super.a();
      }
   }

   public static class b extends bvq.a {
      public final je<cjv> a;

      public b(je<cjv> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
