import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cmx extends bzb implements byk {
   private static final aku<Boolean> bO = aky.a(cmx.class, akw.k);
   private static final aku<Integer> bP = aky.a(cmx.class, akw.b);
   private static final aku<Integer> bQ = aky.a(cmx.class, akw.b);
   private static final aku<jg<cna>> bR = aky.a(cmx.class, akw.A);
   private static final aku<jg<cmy>> bS = aky.a(cmx.class, akw.B);
   public static final ciu.a bM = ($$0, $$1) -> {
      bxn<?> $$2 = $$0.an();
      return $$2 == bxn.bc || $$2 == bxn.aZ || $$2 == bxn.ab;
   };
   private static final float bT = 8.0F;
   private static final float bU = 40.0F;
   private static final float bV = 0.125F;
   public static final float bN = (float) (Math.PI / 5);
   private static final czi bW = czi.o;
   private float bX;
   private float bY;
   private boolean bZ;
   private boolean ca;
   private float cb;
   private float cc;
   private static final bun cd = bbd.a(20, 39);
   @Nullable
   private UUID ce;

   public cmx(bxn<? extends cmx> $$0, dkj $$1) {
      super($$0, $$1);
      this.a(false, false);
      this.a(eyr.f, -1.0F);
      this.a(eyr.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cev(this));
      this.bF.a(1, new bzb.a(1.5, axo.G));
      this.bF.a(2, new cgg(this));
      this.bF.a(3, new cmx.a<>(this, cmh.class, 24.0F, 1.5, 1.5));
      this.bF.a(4, new cfh(this, 0.4F));
      this.bF.a(5, new cfl(this, 1.0, true));
      this.bF.a(6, new cez(this, 1.0, 10.0F, 2.0F));
      this.bF.a(7, new cen(this, 1.0));
      this.bF.a(8, new cgo(this, 1.0));
      this.bF.a(9, new cej(this, 8.0F));
      this.bF.a(10, new cfj(this, csi.class, 8.0F));
      this.bF.a(10, new cfw(this));
      this.bG.a(1, new cgy(this));
      this.bG.a(2, new cgz(this));
      this.bG.a(3, new cgt(this).a());
      this.bG.a(4, new cgu<>(this, csi.class, 10, true, false, this::a));
      this.bG.a(5, new cgx<>(this, cjv.class, false, bM));
      this.bG.a(6, new cgx<>(this, clc.class, false, clc.bI));
      this.bG.a(7, new cgu<>(this, cos.class, false));
      this.bG.a(8, new cha<>(this, true));
   }

   public alr gG() {
      cna $$0 = this.gL().a();
      if (this.q()) {
         return $$0.b().b().b();
      } else {
         return this.af_() ? $$0.b().c().b() : $$0.b().a().b();
      }
   }

   private jg<cna> gL() {
      return this.al.a(bR);
   }

   private void j(jg<cna> $$0) {
      this.al.a(bR, $$0);
   }

   private jg<cmy> gM() {
      return this.al.a(bS);
   }

   private void k(jg<cmy> $$0) {
      this.al.a(bS, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      if ($$0 == kl.aw) {
         return c((kk<T>)$$0, this.gL());
      } else if ($$0 == kl.ax) {
         return c((kk<T>)$$0, this.gM());
      } else {
         return $$0 == kl.ay ? c((kk<T>)$$0, this.gJ()) : super.a($$0);
      }
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aw);
      this.a($$0, kl.ax);
      this.a($$0, kl.ay);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aw) {
         this.j(c(kl.aw, $$1));
         return true;
      } else if ($$0 == kl.ax) {
         this.k(c(kl.ax, $$1));
         return true;
      } else if ($$0 == kl.ay) {
         this.a(c(kl.ay, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public static bzk.a gH() {
      return cjv.gz().a(bzl.v, 0.3F).a(bzl.s, 8.0).a(bzl.c, 4.0);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      jt<cmy> $$1 = this.dX().f(mi.bn);
      $$0.a(bR, cur.a(this.dX(), cnb.j));
      $$0.a(bS, $$1.a(cmz.a).or($$1::a).orElseThrow());
      $$0.a(bO, false);
      $$0.a(bP, bW.a());
      $$0.a(bQ, 0);
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.DR, 0.15F, 1.0F);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("CollarColor", czi.s, this.gJ());
      cur.a($$0, this.gL());
      this.a_($$0);
      this.gM().e().ifPresent($$1 -> $$0.a("sound_variant", alq.a(mi.bn), $$1));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      cur.a($$0, this.dX(), mi.bm).ifPresent(this::j);
      this.a($$0.<czi>a("CollarColor", czi.s).orElse(bW));
      this.a(this.dV(), $$0);
      $$0.<alq>a("sound_variant", alq.a(mi.bn)).flatMap($$0x -> this.dX().f(mi.bn).a($$0x)).ifPresent(this::k);
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      if ($$3 instanceof cmx.b $$4) {
         this.j($$4.a);
      } else {
         Optional<? extends jg<cna>> $$5 = cnb.a(this.ae, this.dX(), cuo.a($$0, this.dv()));
         if ($$5.isPresent()) {
            this.j((jg<cna>)$$5.get());
            $$3 = new cmx.b((jg<cna>)$$5.get());
         }
      }

      this.k(cmz.a(this.dX(), this.ae));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awx u() {
      if (this.af_()) {
         return this.gM().a().c().a();
      } else if (this.ae.a(3) == 0) {
         return this.q() && this.eG() < 20.0F ? this.gM().a().f().a() : this.gM().a().e().a();
      } else {
         return this.gM().a().a().a();
      }
   }

   @Override
   protected awx e(bvt $$0) {
      return this.i($$0) ? awy.DO : this.gM().a().d().a();
   }

   @Override
   protected awx l_() {
      return this.gM().a().b().a();
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C && this.bZ && !this.ca && !this.gq() && this.aH()) {
         this.ca = true;
         this.cb = 0.0F;
         this.cc = 0.0F;
         this.dV().a(this, (byte)8);
      }

      if (!this.dV().C) {
         this.a((asb)this.dV(), true);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.bJ()) {
         this.bY = this.bX;
         if (this.gK()) {
            this.bX = this.bX + (1.0F - this.bX) * 0.4F;
         } else {
            this.bX = this.bX + (0.0F - this.bX) * 0.4F;
         }

         if (this.bk()) {
            this.bZ = true;
            if (this.ca && !this.dV().C) {
               this.dV().a(this, (byte)56);
               this.gN();
            }
         } else if ((this.bZ || this.ca) && this.ca) {
            if (this.cb == 0.0F) {
               this.a(awy.DQ, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(egq.u);
            }

            this.cc = this.cb;
            this.cb += 0.05F;
            if (this.cc >= 2.0F) {
               this.bZ = false;
               this.ca = false;
               this.cc = 0.0F;
               this.cb = 0.0F;
            }

            if (this.cb > 0.4F) {
               float $$0 = (float)this.dC();
               int $$1 = (int)(azz.a((this.cb - 0.4F) * (float) Math.PI) * 7.0F);
               fgc $$2 = this.dy();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  this.dV().a(lz.ap, this.dA() + (double)$$4, (double)($$0 + 0.8F), this.dG() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gN() {
      this.ca = false;
      this.cb = 0.0F;
      this.cc = 0.0F;
   }

   @Override
   public void a(bvt $$0) {
      this.bZ = false;
      this.ca = false;
      this.cc = 0.0F;
      this.cb = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.bZ ? 1.0F : Math.min(0.75F + azz.h($$0, this.cc, this.cb) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azz.h($$0, this.cc, this.cb);
   }

   public float L(float $$0) {
      return azz.h($$0, this.bY, this.bX) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ad() {
      return this.x() ? 20 : super.ad();
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(asb $$0, bvt $$1, float $$2) {
      if (!this.i($$1)) {
         super.c($$0, $$1, $$2);
      } else {
         dak $$3 = this.fY();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(azz.f($$2), this, bxo.g);
         if (bxa.b.a($$4, $$5) != bxa.b.a(this.fY())) {
            this.a(awy.DN);
            $$0.a(new lv(lz.U, dao.pe.m()), this.dA(), this.dC() + 1.0, this.dG(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean i(bvt $$0) {
      return this.fY().a(dao.pf) && !$$0.a(axo.C);
   }

   @Override
   protected void t() {
      if (this.q()) {
         this.g(bzl.s).a(40.0);
         this.d(40.0F);
      } else {
         this.g(bzl.s).a(8.0);
      }
   }

   @Override
   protected void c(bvt $$0, float $$1) {
      this.a($$0, $$1, new bxo[]{bxo.g});
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      dag $$3 = $$2.h();
      if (this.q()) {
         if (this.i($$2) && this.eG() < this.eU()) {
            this.a($$0, $$1, $$2);
            cvy $$4 = $$2.a(kl.v);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bvc.a;
         } else {
            if ($$3 instanceof czj $$6 && this.j($$0)) {
               czi $$7 = $$6.a();
               if ($$7 != this.gJ()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bvc.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bxo.g) && !this.ga() && this.j($$0) && !this.n_()) {
               this.h($$2.c(1));
               $$2.a(1, $$0);
               return bvc.a;
            } else if ($$2.a(dao.td) && this.j($$0) && this.ga() && (!dgz.a(this.fY(), dgy.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(awy.az);
               dak $$8 = this.fY();
               this.h(dak.l);
               if (this.dV() instanceof asb $$9) {
                  this.a($$9, $$8);
               }

               return bvc.a;
            } else if (this.x() && this.ga() && this.j($$0) && this.fY().n() && this.fY().c($$2)) {
               $$2.h(1);
               this.a(awy.DP);
               dak $$10 = this.fY();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return bvc.a;
            } else {
               bvc $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.j($$0)) {
                  this.y(!this.gu());
                  this.bf = false;
                  this.bE.m();
                  this.g(null);
                  return bvc.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dV().C && $$2.a(dao.sH) && !this.af_()) {
         $$2.a(1, $$0);
         this.f($$0);
         return bvc.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void f(csi $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.bE.m();
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
         this.ca = true;
         this.cb = 0.0F;
         this.cc = 0.0F;
      } else if ($$0 == 56) {
         this.gN();
      } else {
         super.b($$0);
      }
   }

   public float gI() {
      if (this.af_()) {
         return 1.5393804F;
      } else if (this.q()) {
         float $$0 = this.eU();
         float $$1 = ($$0 - this.eG()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.ai);
   }

   @Override
   public int fX() {
      return 8;
   }

   @Override
   public int a() {
      return this.al.a(bQ);
   }

   @Override
   public void a(int $$0) {
      this.al.a(bQ, $$0);
   }

   @Override
   public void c() {
      this.a(cd.a(this.ae));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ce;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ce = $$0;
   }

   public czi gJ() {
      return czi.a(this.al.a(bP));
   }

   private void a(czi $$0) {
      this.al.a(bP, $$0.a());
   }

   @Nullable
   public cmx b(asb $$0, bwu $$1) {
      cmx $$2 = bxn.bN.a($$0, bxm.e);
      if ($$2 != null && $$1 instanceof cmx $$3) {
         if (this.ae.h()) {
            $$2.j(this.gL());
         } else {
            $$2.j($$3.gL());
         }

         if (this.q()) {
            $$2.a(this.d());
            $$2.a(true, true);
            czi $$4 = this.gJ();
            czi $$5 = $$3.gJ();
            $$2.a(czi.a($$0, $$4, $$5));
         }

         $$2.k(cmz.a(this.dX(), this.ae));
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.al.a(bO, $$0);
   }

   @Override
   public boolean a(cjv $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof cmx $$1)) {
         return false;
      } else if (!$$1.q()) {
         return false;
      } else {
         return $$1.x() ? false : this.gE() && $$1.gE();
      }
   }

   public boolean gK() {
      return this.al.a(bO);
   }

   @Override
   public boolean a(byf $$0, byf $$1) {
      if ($$0 instanceof cow || $$0 instanceof cpe || $$0 instanceof coc) {
         return false;
      } else if ($$0 instanceof cmx $$2) {
         return !$$2.q() || $$2.e() != $$1;
      } else {
         if ($$0 instanceof csi $$3 && $$1 instanceof csi $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cme $$5 && $$5.gL()) {
            return false;
         }

         if ($$0 instanceof bzb $$6 && $$6.q()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean w() {
      return !this.af_();
   }

   @Override
   public fgc cT() {
      return new fgc(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   public static boolean c(bxn<cmx> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.a_($$3.e()).a(axn.cj) && a($$1, $$3);
   }

   class a<T extends byf> extends cei<T> {
      private final cmx j;

      public a(final cmx $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cmh ? !this.j.q() && this.a((cmh)this.b) : false;
      }

      private boolean a(cmh $$0) {
         return $$0.gy() >= cmx.this.ae.a(5);
      }

      @Override
      public void d() {
         cmx.this.g(null);
         super.d();
      }

      @Override
      public void a() {
         cmx.this.g(null);
         super.a();
      }
   }

   public static class b extends bwu.a {
      public final jg<cna> a;

      public b(jg<cna> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
