import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cki extends byf implements bxo {
   private static final akj<Boolean> bM = akn.a(cki.class, akl.k);
   private static final akj<Integer> bN = akn.a(cki.class, akl.b);
   private static final akj<Integer> bO = akn.a(cki.class, akl.b);
   private static final akj<jf<ckj>> bP = akn.a(cki.class, akl.A);
   public static final chy.a bK = ($$0, $$1) -> {
      bwr<?> $$2 = $$0.an();
      return $$2 == bwr.bb || $$2 == bwr.aY || $$2 == bwr.aa;
   };
   private static final float bQ = 8.0F;
   private static final float bR = 40.0F;
   private static final float bS = 0.125F;
   public static final float bL = (float) (Math.PI / 5);
   private static final cyi bT = cyi.o;
   private float bU;
   private float bV;
   private boolean bW;
   private boolean bX;
   private float bY;
   private float bZ;
   private static final btr ca = baq.a(20, 39);
   @Nullable
   private UUID cb;

   public cki(bwr<? extends cki> $$0, djh $$1) {
      super($$0, $$1);
      this.a(false, false);
      this.a(exm.f, -1.0F);
      this.a(exm.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cdz(this));
      this.bD.a(1, new byf.a(1.5, axd.G));
      this.bD.a(2, new cfk(this));
      this.bD.a(3, new cki.a<>(this, clo.class, 24.0F, 1.5, 1.5));
      this.bD.a(4, new cel(this, 0.4F));
      this.bD.a(5, new cep(this, 1.0, true));
      this.bD.a(6, new ced(this, 1.0, 10.0F, 2.0F));
      this.bD.a(7, new cdr(this, 1.0));
      this.bD.a(8, new cfs(this, 1.0));
      this.bD.a(9, new cdn(this, 8.0F));
      this.bD.a(10, new cen(this, crj.class, 8.0F));
      this.bD.a(10, new cfa(this));
      this.bE.a(1, new cgc(this));
      this.bE.a(2, new cgd(this));
      this.bE.a(3, new cfx(this).a());
      this.bE.a(4, new cfy<>(this, crj.class, 10, true, false, this::a));
      this.bE.a(5, new cgb<>(this, ciz.class, false, bK));
      this.bE.a(6, new cgb<>(this, ckg.class, false, ckg.bG));
      this.bE.a(7, new cfy<>(this, cns.class, false));
      this.bE.a(8, new cge<>(this, true));
   }

   public alg gF() {
      ckj $$0 = this.gK().a();
      if (this.q()) {
         return $$0.b().b().b();
      } else {
         return this.X_() ? $$0.b().c().b() : $$0.b().a().b();
      }
   }

   private jf<ckj> gK() {
      return this.al.a(bP);
   }

   private void j(jf<ckj> $$0) {
      this.al.a(bP, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      if ($$0 == kk.aw) {
         return c((kj<T>)$$0, this.gK());
      } else {
         return $$0 == kk.ax ? c((kj<T>)$$0, this.gI()) : super.a($$0);
      }
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aw);
      this.a($$0, kk.ax);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aw) {
         this.j(c(kk.aw, $$1));
         return true;
      } else if ($$0 == kk.ax) {
         this.a(c(kk.ax, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public static byo.a gG() {
      return ciz.gy().a(byp.v, 0.3F).a(byp.s, 8.0).a(byp.c, 4.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bP, cts.a(this.dW(), ckk.j));
      $$0.a(bM, false);
      $$0.a(bN, bT.a());
      $$0.a(bO, 0);
   }

   @Override
   protected void b(iv $$0, eao $$1) {
      this.a(awn.DX, 0.15F, 1.0F);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("CollarColor", cyi.s, this.gI());
      cts.a($$0, this.gK());
      this.a_($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      cts.a($$0, this.dW(), mh.bm).ifPresent(this::j);
      this.a($$0.<cyi>a("CollarColor", cyi.s).orElse(bT));
      this.a(this.dU(), $$0);
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      if ($$3 instanceof cki.b $$4) {
         this.j($$4.a);
      } else {
         Optional<? extends jf<ckj>> $$5 = ckk.a(this.ae, this.dW(), ctp.a($$0, this.du()));
         if ($$5.isPresent()) {
            this.j((jf<ckj>)$$5.get());
            $$3 = new cki.b((jf<ckj>)$$5.get());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awm u() {
      if (this.X_()) {
         return awn.DS;
      } else if (this.ae.a(3) == 0) {
         return this.q() && this.eF() < 20.0F ? awn.DY : awn.DV;
      } else {
         return awn.DQ;
      }
   }

   @Override
   protected awm e(bux $$0) {
      return this.i($$0) ? awn.DO : awn.DU;
   }

   @Override
   protected awm l_() {
      return awn.DR;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dU().C && this.bW && !this.bX && !this.gp() && this.aH()) {
         this.bX = true;
         this.bY = 0.0F;
         this.bZ = 0.0F;
         this.dU().a(this, (byte)8);
      }

      if (!this.dU().C) {
         this.a((arq)this.dU(), true);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.bI()) {
         this.bV = this.bU;
         if (this.gJ()) {
            this.bU = this.bU + (1.0F - this.bU) * 0.4F;
         } else {
            this.bU = this.bU + (0.0F - this.bU) * 0.4F;
         }

         if (this.bj()) {
            this.bW = true;
            if (this.bX && !this.dU().C) {
               this.dU().a(this, (byte)56);
               this.gL();
            }
         } else if ((this.bW || this.bX) && this.bX) {
            if (this.bY == 0.0F) {
               this.a(awn.DW, this.fd(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(efo.u);
            }

            this.bZ = this.bY;
            this.bY += 0.05F;
            if (this.bZ >= 2.0F) {
               this.bW = false;
               this.bX = false;
               this.bZ = 0.0F;
               this.bY = 0.0F;
            }

            if (this.bY > 0.4F) {
               float $$0 = (float)this.dB();
               int $$1 = (int)(azm.a((this.bY - 0.4F) * (float) Math.PI) * 7.0F);
               fex $$2 = this.dx();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dp() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dp() * 0.5F;
                  this.dU().a(ly.ap, this.dz() + (double)$$4, (double)($$0 + 0.8F), this.dF() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gL() {
      this.bX = false;
      this.bY = 0.0F;
      this.bZ = 0.0F;
   }

   @Override
   public void a(bux $$0) {
      this.bW = false;
      this.bX = false;
      this.bZ = 0.0F;
      this.bY = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.bW ? 1.0F : Math.min(0.75F + azm.h($$0, this.bZ, this.bY) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azm.h($$0, this.bZ, this.bY);
   }

   public float L(float $$0) {
      return azm.h($$0, this.bV, this.bU) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ad() {
      return this.x() ? 20 : super.ad();
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(arq $$0, bux $$1, float $$2) {
      if (!this.i($$1)) {
         super.c($$0, $$1, $$2);
      } else {
         czk $$3 = this.fX();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(azm.f($$2), this, bws.g);
         if (bwe.b.a($$4, $$5) != bwe.b.a(this.fX())) {
            this.a(awn.DN);
            $$0.a(new lu(ly.U, czo.pe.m()), this.dz(), this.dB() + 1.0, this.dF(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean i(bux $$0) {
      return this.fX().a(czo.pf) && !$$0.a(axd.C);
   }

   @Override
   protected void t() {
      if (this.q()) {
         this.g(byp.s).a(40.0);
         this.d(40.0F);
      } else {
         this.g(byp.s).a(8.0);
      }
   }

   @Override
   protected void c(bux $$0, float $$1) {
      this.a($$0, $$1, new bws[]{bws.g});
   }

   @Override
   public bug b(crj $$0, buf $$1) {
      czk $$2 = $$0.b($$1);
      czg $$3 = $$2.h();
      if (this.q()) {
         if (this.i($$2) && this.eF() < this.eT()) {
            this.a($$0, $$1, $$2);
            cuz $$4 = $$2.a(kk.v);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bug.a;
         } else {
            if ($$3 instanceof cyj $$6 && this.j($$0)) {
               cyi $$7 = $$6.a();
               if ($$7 != this.gI()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bug.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bws.g) && !this.fZ() && this.j($$0) && !this.n_()) {
               this.h($$2.c(1));
               $$2.a(1, $$0);
               return bug.a;
            } else if ($$2.a(czo.td) && this.j($$0) && this.fZ() && (!dfz.a(this.fX(), dfy.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(awn.az);
               czk $$8 = this.fX();
               this.h(czk.k);
               if (this.dU() instanceof arq $$9) {
                  this.a($$9, $$8);
               }

               return bug.a;
            } else if (this.x() && this.fZ() && this.j($$0) && this.fX().n() && this.fX().c($$2)) {
               $$2.h(1);
               this.a(awn.DP);
               czk $$10 = this.fX();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return bug.a;
            } else {
               bug $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.j($$0)) {
                  this.y(!this.gt());
                  this.bf = false;
                  this.bC.m();
                  this.g(null);
                  return bug.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dU().C && $$2.a(czo.sH) && !this.X_()) {
         $$2.a(1, $$0);
         this.f($$0);
         return bug.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void f(crj $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.bC.m();
         this.g(null);
         this.y(true);
         this.dU().a(this, (byte)7);
      } else {
         this.dU().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.bX = true;
         this.bY = 0.0F;
         this.bZ = 0.0F;
      } else if ($$0 == 56) {
         this.gL();
      } else {
         super.b($$0);
      }
   }

   public float gH() {
      if (this.X_()) {
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
   public boolean i(czk $$0) {
      return $$0.a(axk.ah);
   }

   @Override
   public int fW() {
      return 8;
   }

   @Override
   public int a() {
      return this.al.a(bO);
   }

   @Override
   public void a(int $$0) {
      this.al.a(bO, $$0);
   }

   @Override
   public void c() {
      this.a(ca.a(this.ae));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   public cyi gI() {
      return cyi.a(this.al.a(bN));
   }

   private void a(cyi $$0) {
      this.al.a(bN, $$0.a());
   }

   @Nullable
   public cki b(arq $$0, bvy $$1) {
      cki $$2 = bwr.bM.a($$0, bwq.e);
      if ($$2 != null && $$1 instanceof cki $$3) {
         if (this.ae.h()) {
            $$2.j(this.gK());
         } else {
            $$2.j($$3.gK());
         }

         if (this.q()) {
            $$2.a(this.d());
            $$2.a(true, true);
            cyi $$4 = this.gI();
            cyi $$5 = $$3.gI();
            $$2.a(cyi.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.al.a(bM, $$0);
   }

   @Override
   public boolean a(ciz $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof cki $$1)) {
         return false;
      } else if (!$$1.q()) {
         return false;
      } else {
         return $$1.x() ? false : this.gD() && $$1.gD();
      }
   }

   public boolean gJ() {
      return this.al.a(bM);
   }

   @Override
   public boolean a(bxj $$0, bxj $$1) {
      if ($$0 instanceof cnw || $$0 instanceof coe || $$0 instanceof cnd) {
         return false;
      } else if ($$0 instanceof cki $$2) {
         return !$$2.q() || $$2.e() != $$1;
      } else {
         if ($$0 instanceof crj $$3 && $$1 instanceof crj $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cll $$5 && $$5.gK()) {
            return false;
         }

         if ($$0 instanceof byf $$6 && $$6.q()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean w() {
      return !this.X_();
   }

   @Override
   public fex cS() {
      return new fex(0.0, (double)(0.6F * this.cR()), (double)(this.dp() * 0.4F));
   }

   public static boolean c(bwr<cki> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cj) && a($$1, $$3);
   }

   class a<T extends bxj> extends cdm<T> {
      private final cki j;

      public a(final cki $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof clo ? !this.j.q() && this.a((clo)this.b) : false;
      }

      private boolean a(clo $$0) {
         return $$0.gx() >= cki.this.ae.a(5);
      }

      @Override
      public void d() {
         cki.this.g(null);
         super.d();
      }

      @Override
      public void a() {
         cki.this.g(null);
         super.a();
      }
   }

   public static class b extends bvy.a {
      public final jf<ckj> a;

      public b(jf<ckj> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
