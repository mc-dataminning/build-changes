import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cjm extends bxn implements bww {
   private static final akg<Boolean> bK = akk.a(cjm.class, aki.k);
   private static final akg<Integer> bL = akk.a(cjm.class, aki.b);
   private static final akg<Integer> bM = akk.a(cjm.class, aki.b);
   private static final akg<js<cjn>> bN = akk.a(cjm.class, aki.y);
   public static final chg.a bI = ($$0, $$1) -> {
      bwb<?> $$2 = $$0.aq();
      return $$2 == bwb.ba || $$2 == bwb.aX || $$2 == bwb.aa;
   };
   private static final float bO = 8.0F;
   private static final float bP = 40.0F;
   private static final float bQ = 0.125F;
   public static final float bJ = (float) (Math.PI / 5);
   private float bR;
   private float bS;
   private boolean bT;
   private boolean bU;
   private float bV;
   private float bW;
   private static final btb bX = bam.a(20, 39);
   @Nullable
   private UUID bY;

   public cjm(bwb<? extends cjm> $$0, dhp $$1) {
      super($$0, $$1);
      this.a(false, false);
      this.a(evk.f, -1.0F);
      this.a(evk.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bB.a(1, new cdh(this));
      this.bB.a(1, new bxn.a(1.5, axb.G));
      this.bB.a(2, new ces(this));
      this.bB.a(3, new cjm.a<>(this, ckq.class, 24.0F, 1.5, 1.5));
      this.bB.a(4, new cdt(this, 0.4F));
      this.bB.a(5, new cdx(this, 1.0, true));
      this.bB.a(6, new cdl(this, 1.0, 10.0F, 2.0F));
      this.bB.a(7, new ccz(this, 1.0));
      this.bB.a(8, new cfa(this, 1.0));
      this.bB.a(9, new ccv(this, 8.0F));
      this.bB.a(10, new cdv(this, cqi.class, 8.0F));
      this.bB.a(10, new cei(this));
      this.bC.a(1, new cfk(this));
      this.bC.a(2, new cfl(this));
      this.bC.a(3, new cff(this).a());
      this.bC.a(4, new cfg<>(this, cqi.class, 10, true, false, this::a));
      this.bC.a(5, new cfj<>(this, cig.class, false, bI));
      this.bC.a(6, new cfj<>(this, cjk.class, false, cjk.bE));
      this.bC.a(7, new cfg<>(this, cmr.class, false));
      this.bC.a(8, new cfm<>(this, true));
   }

   public ald gC() {
      cjn $$0 = this.gH().a();
      if (this.q()) {
         return $$0.b();
      } else {
         return this.W_() ? $$0.c() : $$0.a();
      }
   }

   private js<cjn> gH() {
      return this.al.a(bN);
   }

   private void j(js<cjn> $$0) {
      this.al.a(bN, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      if ($$0 == kx.at) {
         return b((kw<T>)$$0, this.gH());
      } else {
         return $$0 == kx.au ? b((kw<T>)$$0, this.gF()) : super.a($$0);
      }
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.at);
      this.a($$0, kx.au);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.at) {
         this.j(b(kx.at, $$1));
         return true;
      } else if ($$0 == kx.au) {
         this.a(b(kx.au, $$1));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   public static bxw.a gD() {
      return cig.gv().a(bxx.v, 0.3F).a(bxx.s, 8.0).a(bxx.c, 4.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      kg $$1 = this.dX();
      kf<cjn> $$2 = $$1.f(me.m);
      $$0.a(bN, $$2.a(cjo.j).or($$2::a).orElseThrow());
      $$0.a(bK, false);
      $$0.a(bL, cwv.o.a());
      $$0.a(bM, 0);
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.DR, 0.15F, 1.0F);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gF().a());
      this.gH().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      Optional.ofNullable(ald.c($$0.l("variant"))).map($$0x -> alc.a(me.m, $$0x)).flatMap($$0x -> this.dX().f(me.m).a($$0x)).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cwv.a($$0.h("CollarColor")));
      }

      this.a(this.dV(), $$0);
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      js<dis> $$4 = $$0.t(this.dv());
      js<cjn> $$6;
      if ($$3 instanceof cjm.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cjo.a(this.dX(), $$4);
         $$3 = new cjm.b($$6);
      }

      this.j($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awj u() {
      if (this.W_()) {
         return awk.DM;
      } else if (this.ae.a(3) == 0) {
         return this.q() && this.eF() < 20.0F ? awk.DS : awk.DP;
      } else {
         return awk.DK;
      }
   }

   @Override
   protected awj e(buh $$0) {
      return this.j($$0) ? awk.DI : awk.DO;
   }

   @Override
   protected awj l_() {
      return awk.DL;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C && this.bT && !this.bU && !this.gm() && this.aJ()) {
         this.bU = true;
         this.bV = 0.0F;
         this.bW = 0.0F;
         this.dV().a(this, (byte)8);
      }

      if (!this.dV().C) {
         this.a((arn)this.dV(), true);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.bK()) {
         this.bS = this.bR;
         if (this.gG()) {
            this.bR = this.bR + (1.0F - this.bR) * 0.4F;
         } else {
            this.bR = this.bR + (0.0F - this.bR) * 0.4F;
         }

         if (this.bl()) {
            this.bT = true;
            if (this.bU && !this.dV().C) {
               this.dV().a(this, (byte)56);
               this.gI();
            }
         } else if ((this.bT || this.bU) && this.bU) {
            if (this.bV == 0.0F) {
               this.a(awk.DQ, this.fd(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(edm.u);
            }

            this.bW = this.bV;
            this.bV += 0.05F;
            if (this.bW >= 2.0F) {
               this.bT = false;
               this.bU = false;
               this.bW = 0.0F;
               this.bV = 0.0F;
            }

            if (this.bV > 0.4F) {
               float $$0 = (float)this.dC();
               int $$1 = (int)(azk.a((this.bV - 0.4F) * (float) Math.PI) * 7.0F);
               fcu $$2 = this.dy();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  this.dV().a(lv.ap, this.dA() + (double)$$4, (double)($$0 + 0.8F), this.dG() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gI() {
      this.bU = false;
      this.bV = 0.0F;
      this.bW = 0.0F;
   }

   @Override
   public void a(buh $$0) {
      this.bT = false;
      this.bU = false;
      this.bW = 0.0F;
      this.bV = 0.0F;
      super.a($$0);
   }

   public float K(float $$0) {
      return !this.bT ? 1.0F : Math.min(0.75F + azk.h($$0, this.bW, this.bV) / 2.0F * 0.25F, 1.0F);
   }

   public float L(float $$0) {
      return azk.h($$0, this.bW, this.bV);
   }

   public float M(float $$0) {
      return azk.h($$0, this.bS, this.bR) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ac() {
      return this.x() ? 20 : super.ac();
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(arn $$0, buh $$1, float $$2) {
      if (!this.j($$1)) {
         super.b($$0, $$1, $$2);
      } else {
         cxy $$3 = this.aj();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(azk.f($$2), this, bwc.g);
         if (bvo.b.a($$4, $$5) != bvo.b.a(this.aj())) {
            this.a(awk.DH);
            $$0.a(new lr(lv.U, cyc.oZ.n()), this.dA(), this.dC() + 1.0, this.dG(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean j(buh $$0) {
      return this.aj().a(cyc.pa) && !$$0.a(axb.C);
   }

   @Override
   protected void t() {
      if (this.q()) {
         this.g(bxx.s).a(40.0);
         this.d(40.0F);
      } else {
         this.g(bxx.s).a(8.0);
      }
   }

   @Override
   protected void c(buh $$0, float $$1) {
      this.a($$0, $$1, new bwc[]{bwc.g});
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      cxu $$3 = $$2.h();
      if (this.q()) {
         if (this.k($$2) && this.eF() < this.eT()) {
            this.a($$0, $$1, $$2);
            ctk $$4 = $$2.a(kx.w);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return btq.a;
         } else {
            if ($$3 instanceof cww $$6 && this.k($$0)) {
               cwv $$7 = $$6.b();
               if ($$7 != this.gF()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return btq.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bwc.g) && !this.fW() && this.k($$0) && !this.n_()) {
               this.i($$2.c(1));
               $$2.a(1, $$0);
               return btq.a;
            } else if ($$2.a(cyc.sW) && this.k($$0) && this.fW() && (!dej.a(this.aj(), dei.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(awk.az);
               cxy $$8 = this.aj();
               this.i(cxy.k);
               if (this.dV() instanceof arn $$9) {
                  this.a($$9, $$8);
               }

               return btq.a;
            } else if (this.x() && this.fW() && this.k($$0) && this.aj().n() && this.aj().c($$2)) {
               $$2.h(1);
               this.a(awk.DJ);
               cxy $$10 = this.aj();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return btq.a;
            } else {
               btq $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.k($$0)) {
                  this.y(!this.gq());
                  this.be = false;
                  this.bA.m();
                  this.h(null);
                  return btq.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dV().C && $$2.a(cyc.sA) && !this.W_()) {
         $$2.a(1, $$0);
         this.f($$0);
         return btq.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void f(cqi $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.bA.m();
         this.h(null);
         this.y(true);
         this.dV().a(this, (byte)7);
      } else {
         this.dV().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.bU = true;
         this.bV = 0.0F;
         this.bW = 0.0F;
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
   public boolean k(cxy $$0) {
      return $$0.a(axi.ag);
   }

   @Override
   public int ai() {
      return 8;
   }

   @Override
   public int a() {
      return this.al.a(bM);
   }

   @Override
   public void a(int $$0) {
      this.al.a(bM, $$0);
   }

   @Override
   public void c() {
      this.a(bX.a(this.ae));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bY;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bY = $$0;
   }

   public cwv gF() {
      return cwv.a(this.al.a(bL));
   }

   private void a(cwv $$0) {
      this.al.a(bL, $$0.a());
   }

   @Nullable
   public cjm b(arn $$0, bvi $$1) {
      cjm $$2 = bwb.bL.a($$0, bwa.e);
      if ($$2 != null && $$1 instanceof cjm $$3) {
         if (this.ae.h()) {
            $$2.j(this.gH());
         } else {
            $$2.j($$3.gH());
         }

         if (this.q()) {
            $$2.a(this.d());
            $$2.a(true, true);
            cwv $$4 = this.gF();
            cwv $$5 = $$3.gF();
            $$2.a(cwv.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.al.a(bK, $$0);
   }

   @Override
   public boolean a(cig $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof cjm $$1)) {
         return false;
      } else if (!$$1.q()) {
         return false;
      } else {
         return $$1.x() ? false : this.gA() && $$1.gA();
      }
   }

   public boolean gG() {
      return this.al.a(bK);
   }

   @Override
   public boolean a(bwr $$0, bwr $$1) {
      if ($$0 instanceof cmv || $$0 instanceof cnd || $$0 instanceof cmc) {
         return false;
      } else if ($$0 instanceof cjm $$2) {
         return !$$2.q() || $$2.e() != $$1;
      } else {
         if ($$0 instanceof cqi $$3 && $$1 instanceof cqi $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof ckn $$5 && $$5.gH()) {
            return false;
         }

         if ($$0 instanceof bxn $$6 && $$6.q()) {
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
   public fcu cT() {
      return new fcu(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   public static boolean c(bwb<cjm> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.a_($$3.e()).a(awz.ci) && a($$1, $$3);
   }

   class a<T extends bwr> extends ccu<T> {
      private final cjm j;

      public a(final cjm $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof ckq ? !this.j.q() && this.a((ckq)this.b) : false;
      }

      private boolean a(ckq $$0) {
         return $$0.gu() >= cjm.this.ae.a(5);
      }

      @Override
      public void d() {
         cjm.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         cjm.this.h(null);
         super.a();
      }
   }

   public static class b extends bvi.a {
      public final js<cjn> a;

      public b(js<cjn> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
