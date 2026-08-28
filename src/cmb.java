import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cmb extends byf implements bxo {
   private static final akj<Boolean> bM = akn.a(cmb.class, akl.k);
   private static final akj<Integer> bN = akn.a(cmb.class, akl.b);
   private static final akj<Integer> bO = akn.a(cmb.class, akl.b);
   private static final akj<jf<cme>> bP = akn.a(cmb.class, akl.A);
   private static final akj<jf<cmc>> bQ = akn.a(cmb.class, akl.B);
   public static final chy.a bK = ($$0, $$1) -> {
      bwr<?> $$2 = $$0.an();
      return $$2 == bwr.bb || $$2 == bwr.aY || $$2 == bwr.aa;
   };
   private static final float bR = 8.0F;
   private static final float bS = 40.0F;
   private static final float bT = 0.125F;
   public static final float bL = (float) (Math.PI / 5);
   private static final cyl bU = cyl.o;
   private float bV;
   private float bW;
   private boolean bX;
   private boolean bY;
   private float bZ;
   private float ca;
   private static final btr cb = baq.a(20, 39);
   @Nullable
   private UUID cc;

   public cmb(bwr<? extends cmb> $$0, djm $$1) {
      super($$0, $$1);
      this.a(false, false);
      this.a(exr.f, -1.0F);
      this.a(exr.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cdz(this));
      this.bD.a(1, new byf.a(1.5, axd.G));
      this.bD.a(2, new cfk(this));
      this.bD.a(3, new cmb.a<>(this, cll.class, 24.0F, 1.5, 1.5));
      this.bD.a(4, new cel(this, 0.4F));
      this.bD.a(5, new cep(this, 1.0, true));
      this.bD.a(6, new ced(this, 1.0, 10.0F, 2.0F));
      this.bD.a(7, new cdr(this, 1.0));
      this.bD.a(8, new cfs(this, 1.0));
      this.bD.a(9, new cdn(this, 8.0F));
      this.bD.a(10, new cen(this, crm.class, 8.0F));
      this.bD.a(10, new cfa(this));
      this.bE.a(1, new cgc(this));
      this.bE.a(2, new cgd(this));
      this.bE.a(3, new cfx(this).a());
      this.bE.a(4, new cfy<>(this, crm.class, 10, true, false, this::a));
      this.bE.a(5, new cgb<>(this, ciz.class, false, bK));
      this.bE.a(6, new cgb<>(this, ckg.class, false, ckg.bG));
      this.bE.a(7, new cfy<>(this, cnv.class, false));
      this.bE.a(8, new cge<>(this, true));
   }

   public alg gF() {
      cme $$0 = this.gK().a();
      if (this.q()) {
         return $$0.b().b().b();
      } else {
         return this.aa_() ? $$0.b().c().b() : $$0.b().a().b();
      }
   }

   private jf<cme> gK() {
      return this.al.a(bP);
   }

   private void j(jf<cme> $$0) {
      this.al.a(bP, $$0);
   }

   private jf<cmc> gL() {
      return this.al.a(bQ);
   }

   private void k(jf<cmc> $$0) {
      this.al.a(bQ, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      if ($$0 == kk.aw) {
         return c((kj<T>)$$0, this.gK());
      } else if ($$0 == kk.ax) {
         return c((kj<T>)$$0, this.gL());
      } else {
         return $$0 == kk.ay ? c((kj<T>)$$0, this.gI()) : super.a($$0);
      }
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aw);
      this.a($$0, kk.ax);
      this.a($$0, kk.ay);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aw) {
         this.j(c(kk.aw, $$1));
         return true;
      } else if ($$0 == kk.ax) {
         this.k(c(kk.ax, $$1));
         return true;
      } else if ($$0 == kk.ay) {
         this.a(c(kk.ay, $$1));
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
      js<cmc> $$1 = this.dW().f(mh.bn);
      $$0.a(bP, ctv.a(this.dW(), cmf.j));
      $$0.a(bQ, $$1.a(cmd.a).or($$1::a).orElseThrow());
      $$0.a(bM, false);
      $$0.a(bN, bU.a());
      $$0.a(bO, 0);
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      this.a(awn.DR, 0.15F, 1.0F);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("CollarColor", cyl.s, this.gI());
      ctv.a($$0, this.gK());
      this.a_($$0);
      this.gL().e().ifPresent($$1 -> $$0.a("sound_variant", $$1.a().toString()));
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ctv.a($$0, this.dW(), mh.bm).ifPresent(this::j);
      this.a($$0.<cyl>a("CollarColor", cyl.s).orElse(bU));
      this.a(this.dU(), $$0);
      Optional.ofNullable(alg.c($$0.j("sound_variant"))).map($$0x -> alf.a(mh.bn, $$0x)).flatMap($$0x -> this.dW().f(mh.bn).a($$0x)).ifPresent(this::k);
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      if ($$3 instanceof cmb.b $$4) {
         this.j($$4.a);
      } else {
         Optional<? extends jf<cme>> $$5 = cmf.a(this.ae, this.dW(), cts.a($$0, this.du()));
         if ($$5.isPresent()) {
            this.j((jf<cme>)$$5.get());
            $$3 = new cmb.b((jf<cme>)$$5.get());
         }
      }

      this.k(cmd.a(this.dW(), this.ae));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awm u() {
      if (this.aa_()) {
         return this.gL().a().c().a();
      } else if (this.ae.a(3) == 0) {
         return this.q() && this.eF() < 20.0F ? this.gL().a().f().a() : this.gL().a().e().a();
      } else {
         return this.gL().a().a().a();
      }
   }

   @Override
   protected awm e(bux $$0) {
      return this.i($$0) ? awn.DO : this.gL().a().d().a();
   }

   @Override
   protected awm l_() {
      return this.gL().a().b().a();
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dU().C && this.bX && !this.bY && !this.gp() && this.aH()) {
         this.bY = true;
         this.bZ = 0.0F;
         this.ca = 0.0F;
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
         this.bW = this.bV;
         if (this.gJ()) {
            this.bV = this.bV + (1.0F - this.bV) * 0.4F;
         } else {
            this.bV = this.bV + (0.0F - this.bV) * 0.4F;
         }

         if (this.bj()) {
            this.bX = true;
            if (this.bY && !this.dU().C) {
               this.dU().a(this, (byte)56);
               this.gM();
            }
         } else if ((this.bX || this.bY) && this.bY) {
            if (this.bZ == 0.0F) {
               this.a(awn.DQ, this.fd(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(eft.u);
            }

            this.ca = this.bZ;
            this.bZ += 0.05F;
            if (this.ca >= 2.0F) {
               this.bX = false;
               this.bY = false;
               this.ca = 0.0F;
               this.bZ = 0.0F;
            }

            if (this.bZ > 0.4F) {
               float $$0 = (float)this.dB();
               int $$1 = (int)(azm.a((this.bZ - 0.4F) * (float) Math.PI) * 7.0F);
               ffc $$2 = this.dx();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dp() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dp() * 0.5F;
                  this.dU().a(ly.ap, this.dz() + (double)$$4, (double)($$0 + 0.8F), this.dF() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gM() {
      this.bY = false;
      this.bZ = 0.0F;
      this.ca = 0.0F;
   }

   @Override
   public void a(bux $$0) {
      this.bX = false;
      this.bY = false;
      this.ca = 0.0F;
      this.bZ = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.bX ? 1.0F : Math.min(0.75F + azm.h($$0, this.ca, this.bZ) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azm.h($$0, this.ca, this.bZ);
   }

   public float L(float $$0) {
      return azm.h($$0, this.bW, this.bV) * 0.15F * (float) Math.PI;
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
         czn $$3 = this.fX();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(azm.f($$2), this, bws.g);
         if (bwe.b.a($$4, $$5) != bwe.b.a(this.fX())) {
            this.a(awn.DN);
            $$0.a(new lu(ly.U, czr.pe.m()), this.dz(), this.dB() + 1.0, this.dF(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean i(bux $$0) {
      return this.fX().a(czr.pf) && !$$0.a(axd.C);
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
   public bug b(crm $$0, buf $$1) {
      czn $$2 = $$0.b($$1);
      czj $$3 = $$2.h();
      if (this.q()) {
         if (this.i($$2) && this.eF() < this.eT()) {
            this.a($$0, $$1, $$2);
            cvc $$4 = $$2.a(kk.v);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bug.a;
         } else {
            if ($$3 instanceof cym $$6 && this.j($$0)) {
               cyl $$7 = $$6.a();
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
            } else if ($$2.a(czr.td) && this.j($$0) && this.fZ() && (!dgc.a(this.fX(), dgb.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(awn.az);
               czn $$8 = this.fX();
               this.h(czn.k);
               if (this.dU() instanceof arq $$9) {
                  this.a($$9, $$8);
               }

               return bug.a;
            } else if (this.x() && this.fZ() && this.j($$0) && this.fX().n() && this.fX().c($$2)) {
               $$2.h(1);
               this.a(awn.DP);
               czn $$10 = this.fX();
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
      } else if (!this.dU().C && $$2.a(czr.sH) && !this.aa_()) {
         $$2.a(1, $$0);
         this.f($$0);
         return bug.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void f(crm $$0) {
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
         this.bY = true;
         this.bZ = 0.0F;
         this.ca = 0.0F;
      } else if ($$0 == 56) {
         this.gM();
      } else {
         super.b($$0);
      }
   }

   public float gH() {
      if (this.aa_()) {
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
   public boolean i(czn $$0) {
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
      this.a(cb.a(this.ae));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cc;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cc = $$0;
   }

   public cyl gI() {
      return cyl.a(this.al.a(bN));
   }

   private void a(cyl $$0) {
      this.al.a(bN, $$0.a());
   }

   @Nullable
   public cmb b(arq $$0, bvy $$1) {
      cmb $$2 = bwr.bM.a($$0, bwq.e);
      if ($$2 != null && $$1 instanceof cmb $$3) {
         if (this.ae.h()) {
            $$2.j(this.gK());
         } else {
            $$2.j($$3.gK());
         }

         if (this.q()) {
            $$2.a(this.d());
            $$2.a(true, true);
            cyl $$4 = this.gI();
            cyl $$5 = $$3.gI();
            $$2.a(cyl.a($$0, $$4, $$5));
         }

         $$2.k(cmd.a(this.dW(), this.ae));
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
      } else if (!($$0 instanceof cmb $$1)) {
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
      if ($$0 instanceof cnz || $$0 instanceof coh || $$0 instanceof cng) {
         return false;
      } else if ($$0 instanceof cmb $$2) {
         return !$$2.q() || $$2.e() != $$1;
      } else {
         if ($$0 instanceof crm $$3 && $$1 instanceof crm $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cli $$5 && $$5.gK()) {
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
      return !this.aa_();
   }

   @Override
   public ffc cS() {
      return new ffc(0.0, (double)(0.6F * this.cR()), (double)(this.dp() * 0.4F));
   }

   public static boolean c(bwr<cmb> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cj) && a($$1, $$3);
   }

   class a<T extends bxj> extends cdm<T> {
      private final cmb j;

      public a(final cmb $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cll ? !this.j.q() && this.a((cll)this.b) : false;
      }

      private boolean a(cll $$0) {
         return $$0.gx() >= cmb.this.ae.a(5);
      }

      @Override
      public void d() {
         cmb.this.g(null);
         super.d();
      }

      @Override
      public void a() {
         cmb.this.g(null);
         super.a();
      }
   }

   public static class b extends bvy.a {
      public final jf<cme> a;

      public b(jf<cme> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
