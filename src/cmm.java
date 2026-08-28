import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cmm extends byq implements bxz {
   private static final akl<Boolean> bO = akp.a(cmm.class, akn.k);
   private static final akl<Integer> bP = akp.a(cmm.class, akn.b);
   private static final akl<Integer> bQ = akp.a(cmm.class, akn.b);
   private static final akl<jf<cmp>> bR = akp.a(cmm.class, akn.A);
   private static final akl<jf<cmn>> bS = akp.a(cmm.class, akn.B);
   public static final cij.a bM = ($$0, $$1) -> {
      bxc<?> $$2 = $$0.an();
      return $$2 == bxc.bc || $$2 == bxc.aZ || $$2 == bxc.ab;
   };
   private static final float bT = 8.0F;
   private static final float bU = 40.0F;
   private static final float bV = 0.125F;
   public static final float bN = (float) (Math.PI / 5);
   private static final cyw bW = cyw.o;
   private float bX;
   private float bY;
   private boolean bZ;
   private boolean ca;
   private float cb;
   private float cc;
   private static final buc cd = bas.a(20, 39);
   @Nullable
   private UUID ce;

   public cmm(bxc<? extends cmm> $$0, djx $$1) {
      super($$0, $$1);
      this.a(false, false);
      this.a(eyf.f, -1.0F);
      this.a(eyf.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cek(this));
      this.bF.a(1, new byq.a(1.5, axf.G));
      this.bF.a(2, new cfv(this));
      this.bF.a(3, new cmm.a<>(this, clw.class, 24.0F, 1.5, 1.5));
      this.bF.a(4, new cew(this, 0.4F));
      this.bF.a(5, new cfa(this, 1.0, true));
      this.bF.a(6, new ceo(this, 1.0, 10.0F, 2.0F));
      this.bF.a(7, new cec(this, 1.0));
      this.bF.a(8, new cgd(this, 1.0));
      this.bF.a(9, new cdy(this, 8.0F));
      this.bF.a(10, new cey(this, crx.class, 8.0F));
      this.bF.a(10, new cfl(this));
      this.bG.a(1, new cgn(this));
      this.bG.a(2, new cgo(this));
      this.bG.a(3, new cgi(this).a());
      this.bG.a(4, new cgj<>(this, crx.class, 10, true, false, this::a));
      this.bG.a(5, new cgm<>(this, cjk.class, false, bM));
      this.bG.a(6, new cgm<>(this, ckr.class, false, ckr.bI));
      this.bG.a(7, new cgj<>(this, cog.class, false));
      this.bG.a(8, new cgp<>(this, true));
   }

   public ali gG() {
      cmp $$0 = this.gL().a();
      if (this.q()) {
         return $$0.b().b().b();
      } else {
         return this.ae_() ? $$0.b().c().b() : $$0.b().a().b();
      }
   }

   private jf<cmp> gL() {
      return this.al.a(bR);
   }

   private void j(jf<cmp> $$0) {
      this.al.a(bR, $$0);
   }

   private jf<cmn> gM() {
      return this.al.a(bS);
   }

   private void k(jf<cmn> $$0) {
      this.al.a(bS, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      if ($$0 == kk.aw) {
         return c((kj<T>)$$0, this.gL());
      } else if ($$0 == kk.ax) {
         return c((kj<T>)$$0, this.gM());
      } else {
         return $$0 == kk.ay ? c((kj<T>)$$0, this.gJ()) : super.a($$0);
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

   public static byz.a gH() {
      return cjk.gz().a(bza.v, 0.3F).a(bza.s, 8.0).a(bza.c, 4.0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      js<cmn> $$1 = this.dX().f(mh.bn);
      $$0.a(bR, cug.a(this.dX(), cmq.j));
      $$0.a(bS, $$1.a(cmo.a).or($$1::a).orElseThrow());
      $$0.a(bO, false);
      $$0.a(bP, bW.a());
      $$0.a(bQ, 0);
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.DR, 0.15F, 1.0F);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("CollarColor", cyw.s, this.gJ());
      cug.a($$0, this.gL());
      this.a_($$0);
      this.gM().e().ifPresent($$1 -> $$0.a("sound_variant", alh.a(mh.bn), $$1));
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      cug.a($$0, this.dX(), mh.bm).ifPresent(this::j);
      this.a($$0.<cyw>a("CollarColor", cyw.s).orElse(bW));
      this.a(this.dV(), $$0);
      $$0.<alh>a("sound_variant", alh.a(mh.bn)).flatMap($$0x -> this.dX().f(mh.bn).a($$0x)).ifPresent(this::k);
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      if ($$3 instanceof cmm.b $$4) {
         this.j($$4.a);
      } else {
         Optional<? extends jf<cmp>> $$5 = cmq.a(this.ae, this.dX(), cud.a($$0, this.dv()));
         if ($$5.isPresent()) {
            this.j((jf<cmp>)$$5.get());
            $$3 = new cmm.b((jf<cmp>)$$5.get());
         }
      }

      this.k(cmo.a(this.dX(), this.ae));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awo u() {
      if (this.ae_()) {
         return this.gM().a().c().a();
      } else if (this.ae.a(3) == 0) {
         return this.q() && this.eG() < 20.0F ? this.gM().a().f().a() : this.gM().a().e().a();
      } else {
         return this.gM().a().a().a();
      }
   }

   @Override
   protected awo e(bvi $$0) {
      return this.i($$0) ? awp.DO : this.gM().a().d().a();
   }

   @Override
   protected awo l_() {
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
         this.a((ars)this.dV(), true);
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
               this.a(awp.DQ, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(ege.u);
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
               int $$1 = (int)(azo.a((this.cb - 0.4F) * (float) Math.PI) * 7.0F);
               ffq $$2 = this.dy();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  this.dV().a(ly.ap, this.dA() + (double)$$4, (double)($$0 + 0.8F), this.dG() + (double)$$5, $$2.d, $$2.e, $$2.f);
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
   public void a(bvi $$0) {
      this.bZ = false;
      this.ca = false;
      this.cc = 0.0F;
      this.cb = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.bZ ? 1.0F : Math.min(0.75F + azo.h($$0, this.cc, this.cb) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azo.h($$0, this.cc, this.cb);
   }

   public float L(float $$0) {
      return azo.h($$0, this.bY, this.bX) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ad() {
      return this.x() ? 20 : super.ad();
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(ars $$0, bvi $$1, float $$2) {
      if (!this.i($$1)) {
         super.c($$0, $$1, $$2);
      } else {
         czy $$3 = this.fY();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(azo.f($$2), this, bxd.g);
         if (bwp.b.a($$4, $$5) != bwp.b.a(this.fY())) {
            this.a(awp.DN);
            $$0.a(new lu(ly.U, dac.pe.m()), this.dA(), this.dC() + 1.0, this.dG(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean i(bvi $$0) {
      return this.fY().a(dac.pf) && !$$0.a(axf.C);
   }

   @Override
   protected void t() {
      if (this.q()) {
         this.g(bza.s).a(40.0);
         this.d(40.0F);
      } else {
         this.g(bza.s).a(8.0);
      }
   }

   @Override
   protected void c(bvi $$0, float $$1) {
      this.a($$0, $$1, new bxd[]{bxd.g});
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      czu $$3 = $$2.h();
      if (this.q()) {
         if (this.i($$2) && this.eG() < this.eU()) {
            this.a($$0, $$1, $$2);
            cvn $$4 = $$2.a(kk.v);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bur.a;
         } else {
            if ($$3 instanceof cyx $$6 && this.j($$0)) {
               cyw $$7 = $$6.a();
               if ($$7 != this.gJ()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bur.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bxd.g) && !this.ga() && this.j($$0) && !this.n_()) {
               this.h($$2.c(1));
               $$2.a(1, $$0);
               return bur.a;
            } else if ($$2.a(dac.td) && this.j($$0) && this.ga() && (!dgn.a(this.fY(), dgm.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(awp.az);
               czy $$8 = this.fY();
               this.h(czy.k);
               if (this.dV() instanceof ars $$9) {
                  this.a($$9, $$8);
               }

               return bur.a;
            } else if (this.x() && this.ga() && this.j($$0) && this.fY().n() && this.fY().c($$2)) {
               $$2.h(1);
               this.a(awp.DP);
               czy $$10 = this.fY();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return bur.a;
            } else {
               bur $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.j($$0)) {
                  this.y(!this.gu());
                  this.bf = false;
                  this.bE.m();
                  this.g(null);
                  return bur.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dV().C && $$2.a(dac.sH) && !this.ae_()) {
         $$2.a(1, $$0);
         this.f($$0);
         return bur.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void f(crx $$0) {
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
      if (this.ae_()) {
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
   public boolean i(czy $$0) {
      return $$0.a(axm.ah);
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

   public cyw gJ() {
      return cyw.a(this.al.a(bP));
   }

   private void a(cyw $$0) {
      this.al.a(bP, $$0.a());
   }

   @Nullable
   public cmm b(ars $$0, bwj $$1) {
      cmm $$2 = bxc.bN.a($$0, bxb.e);
      if ($$2 != null && $$1 instanceof cmm $$3) {
         if (this.ae.h()) {
            $$2.j(this.gL());
         } else {
            $$2.j($$3.gL());
         }

         if (this.q()) {
            $$2.a(this.d());
            $$2.a(true, true);
            cyw $$4 = this.gJ();
            cyw $$5 = $$3.gJ();
            $$2.a(cyw.a($$0, $$4, $$5));
         }

         $$2.k(cmo.a(this.dX(), this.ae));
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.al.a(bO, $$0);
   }

   @Override
   public boolean a(cjk $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof cmm $$1)) {
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
   public boolean a(bxu $$0, bxu $$1) {
      if ($$0 instanceof cok || $$0 instanceof cot || $$0 instanceof cnr) {
         return false;
      } else if ($$0 instanceof cmm $$2) {
         return !$$2.q() || $$2.e() != $$1;
      } else {
         if ($$0 instanceof crx $$3 && $$1 instanceof crx $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof clt $$5 && $$5.gL()) {
            return false;
         }

         if ($$0 instanceof byq $$6 && $$6.q()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean w() {
      return !this.ae_();
   }

   @Override
   public ffq cT() {
      return new ffq(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   public static boolean c(bxc<cmm> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.a_($$3.e()).a(axe.cj) && a($$1, $$3);
   }

   class a<T extends bxu> extends cdx<T> {
      private final cmm j;

      public a(final cmm $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof clw ? !this.j.q() && this.a((clw)this.b) : false;
      }

      private boolean a(clw $$0) {
         return $$0.gy() >= cmm.this.ae.a(5);
      }

      @Override
      public void d() {
         cmm.this.g(null);
         super.d();
      }

      @Override
      public void a() {
         cmm.this.g(null);
         super.a();
      }
   }

   public static class b extends bwj.a {
      public final jf<cmp> a;

      public b(jf<cmp> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
