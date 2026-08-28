import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cmo extends bys implements byb {
   private static final akn<Boolean> bO = akr.a(cmo.class, akp.k);
   private static final akn<Integer> bP = akr.a(cmo.class, akp.b);
   private static final akn<Integer> bQ = akr.a(cmo.class, akp.b);
   private static final akn<jg<cmr>> bR = akr.a(cmo.class, akp.A);
   private static final akn<jg<cmp>> bS = akr.a(cmo.class, akp.B);
   public static final cil.a bM = ($$0, $$1) -> {
      bxe<?> $$2 = $$0.an();
      return $$2 == bxe.bc || $$2 == bxe.aZ || $$2 == bxe.ab;
   };
   private static final float bT = 8.0F;
   private static final float bU = 40.0F;
   private static final float bV = 0.125F;
   public static final float bN = (float) (Math.PI / 5);
   private static final cyy bW = cyy.o;
   private float bX;
   private float bY;
   private boolean bZ;
   private boolean ca;
   private float cb;
   private float cc;
   private static final bue cd = bau.a(20, 39);
   @Nullable
   private UUID ce;

   public cmo(bxe<? extends cmo> $$0, djz $$1) {
      super($$0, $$1);
      this.a(false, false);
      this.a(eyh.f, -1.0F);
      this.a(eyh.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cem(this));
      this.bF.a(1, new bys.a(1.5, axh.G));
      this.bF.a(2, new cfx(this));
      this.bF.a(3, new cmo.a<>(this, cly.class, 24.0F, 1.5, 1.5));
      this.bF.a(4, new cey(this, 0.4F));
      this.bF.a(5, new cfc(this, 1.0, true));
      this.bF.a(6, new ceq(this, 1.0, 10.0F, 2.0F));
      this.bF.a(7, new cee(this, 1.0));
      this.bF.a(8, new cgf(this, 1.0));
      this.bF.a(9, new cea(this, 8.0F));
      this.bF.a(10, new cfa(this, crz.class, 8.0F));
      this.bF.a(10, new cfn(this));
      this.bG.a(1, new cgp(this));
      this.bG.a(2, new cgq(this));
      this.bG.a(3, new cgk(this).a());
      this.bG.a(4, new cgl<>(this, crz.class, 10, true, false, this::a));
      this.bG.a(5, new cgo<>(this, cjm.class, false, bM));
      this.bG.a(6, new cgo<>(this, ckt.class, false, ckt.bI));
      this.bG.a(7, new cgl<>(this, coi.class, false));
      this.bG.a(8, new cgr<>(this, true));
   }

   public alk gG() {
      cmr $$0 = this.gL().a();
      if (this.q()) {
         return $$0.b().b().b();
      } else {
         return this.ae_() ? $$0.b().c().b() : $$0.b().a().b();
      }
   }

   private jg<cmr> gL() {
      return this.al.a(bR);
   }

   private void j(jg<cmr> $$0) {
      this.al.a(bR, $$0);
   }

   private jg<cmp> gM() {
      return this.al.a(bS);
   }

   private void k(jg<cmp> $$0) {
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

   public static bzb.a gH() {
      return cjm.gz().a(bzc.v, 0.3F).a(bzc.s, 8.0).a(bzc.c, 4.0);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      jt<cmp> $$1 = this.dX().f(mi.bn);
      $$0.a(bR, cui.a(this.dX(), cms.j));
      $$0.a(bS, $$1.a(cmq.a).or($$1::a).orElseThrow());
      $$0.a(bO, false);
      $$0.a(bP, bW.a());
      $$0.a(bQ, 0);
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.DR, 0.15F, 1.0F);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("CollarColor", cyy.s, this.gJ());
      cui.a($$0, this.gL());
      this.a_($$0);
      this.gM().e().ifPresent($$1 -> $$0.a("sound_variant", alj.a(mi.bn), $$1));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      cui.a($$0, this.dX(), mi.bm).ifPresent(this::j);
      this.a($$0.<cyy>a("CollarColor", cyy.s).orElse(bW));
      this.a(this.dV(), $$0);
      $$0.<alj>a("sound_variant", alj.a(mi.bn)).flatMap($$0x -> this.dX().f(mi.bn).a($$0x)).ifPresent(this::k);
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      if ($$3 instanceof cmo.b $$4) {
         this.j($$4.a);
      } else {
         Optional<? extends jg<cmr>> $$5 = cms.a(this.ae, this.dX(), cuf.a($$0, this.dv()));
         if ($$5.isPresent()) {
            this.j((jg<cmr>)$$5.get());
            $$3 = new cmo.b((jg<cmr>)$$5.get());
         }
      }

      this.k(cmq.a(this.dX(), this.ae));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awq u() {
      if (this.ae_()) {
         return this.gM().a().c().a();
      } else if (this.ae.a(3) == 0) {
         return this.q() && this.eG() < 20.0F ? this.gM().a().f().a() : this.gM().a().e().a();
      } else {
         return this.gM().a().a().a();
      }
   }

   @Override
   protected awq e(bvk $$0) {
      return this.i($$0) ? awr.DO : this.gM().a().d().a();
   }

   @Override
   protected awq l_() {
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
         this.a((aru)this.dV(), true);
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
               this.a(awr.DQ, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(egg.u);
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
               int $$1 = (int)(azq.a((this.cb - 0.4F) * (float) Math.PI) * 7.0F);
               ffs $$2 = this.dy();

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
   public void a(bvk $$0) {
      this.bZ = false;
      this.ca = false;
      this.cc = 0.0F;
      this.cb = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.bZ ? 1.0F : Math.min(0.75F + azq.h($$0, this.cc, this.cb) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azq.h($$0, this.cc, this.cb);
   }

   public float L(float $$0) {
      return azq.h($$0, this.bY, this.bX) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ad() {
      return this.x() ? 20 : super.ad();
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(aru $$0, bvk $$1, float $$2) {
      if (!this.i($$1)) {
         super.c($$0, $$1, $$2);
      } else {
         daa $$3 = this.fY();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(azq.f($$2), this, bxf.g);
         if (bwr.b.a($$4, $$5) != bwr.b.a(this.fY())) {
            this.a(awr.DN);
            $$0.a(new lv(lz.U, dae.pe.m()), this.dA(), this.dC() + 1.0, this.dG(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean i(bvk $$0) {
      return this.fY().a(dae.pf) && !$$0.a(axh.C);
   }

   @Override
   protected void t() {
      if (this.q()) {
         this.g(bzc.s).a(40.0);
         this.d(40.0F);
      } else {
         this.g(bzc.s).a(8.0);
      }
   }

   @Override
   protected void c(bvk $$0, float $$1) {
      this.a($$0, $$1, new bxf[]{bxf.g});
   }

   @Override
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      czw $$3 = $$2.h();
      if (this.q()) {
         if (this.i($$2) && this.eG() < this.eU()) {
            this.a($$0, $$1, $$2);
            cvp $$4 = $$2.a(kl.v);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return but.a;
         } else {
            if ($$3 instanceof cyz $$6 && this.j($$0)) {
               cyy $$7 = $$6.a();
               if ($$7 != this.gJ()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return but.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bxf.g) && !this.ga() && this.j($$0) && !this.n_()) {
               this.h($$2.c(1));
               $$2.a(1, $$0);
               return but.a;
            } else if ($$2.a(dae.td) && this.j($$0) && this.ga() && (!dgp.a(this.fY(), dgo.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(awr.az);
               daa $$8 = this.fY();
               this.h(daa.k);
               if (this.dV() instanceof aru $$9) {
                  this.a($$9, $$8);
               }

               return but.a;
            } else if (this.x() && this.ga() && this.j($$0) && this.fY().n() && this.fY().c($$2)) {
               $$2.h(1);
               this.a(awr.DP);
               daa $$10 = this.fY();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return but.a;
            } else {
               but $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.j($$0)) {
                  this.y(!this.gu());
                  this.bf = false;
                  this.bE.m();
                  this.g(null);
                  return but.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dV().C && $$2.a(dae.sH) && !this.ae_()) {
         $$2.a(1, $$0);
         this.f($$0);
         return but.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void f(crz $$0) {
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
   public boolean i(daa $$0) {
      return $$0.a(axo.ai);
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

   public cyy gJ() {
      return cyy.a(this.al.a(bP));
   }

   private void a(cyy $$0) {
      this.al.a(bP, $$0.a());
   }

   @Nullable
   public cmo b(aru $$0, bwl $$1) {
      cmo $$2 = bxe.bN.a($$0, bxd.e);
      if ($$2 != null && $$1 instanceof cmo $$3) {
         if (this.ae.h()) {
            $$2.j(this.gL());
         } else {
            $$2.j($$3.gL());
         }

         if (this.q()) {
            $$2.a(this.d());
            $$2.a(true, true);
            cyy $$4 = this.gJ();
            cyy $$5 = $$3.gJ();
            $$2.a(cyy.a($$0, $$4, $$5));
         }

         $$2.k(cmq.a(this.dX(), this.ae));
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.al.a(bO, $$0);
   }

   @Override
   public boolean a(cjm $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof cmo $$1)) {
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
   public boolean a(bxw $$0, bxw $$1) {
      if ($$0 instanceof com || $$0 instanceof cov || $$0 instanceof cnt) {
         return false;
      } else if ($$0 instanceof cmo $$2) {
         return !$$2.q() || $$2.e() != $$1;
      } else {
         if ($$0 instanceof crz $$3 && $$1 instanceof crz $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof clv $$5 && $$5.gL()) {
            return false;
         }

         if ($$0 instanceof bys $$6 && $$6.q()) {
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
   public ffs cT() {
      return new ffs(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   public static boolean c(bxe<cmo> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.a_($$3.e()).a(axg.cj) && a($$1, $$3);
   }

   class a<T extends bxw> extends cdz<T> {
      private final cmo j;

      public a(final cmo $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cly ? !this.j.q() && this.a((cly)this.b) : false;
      }

      private boolean a(cly $$0) {
         return $$0.gy() >= cmo.this.ae.a(5);
      }

      @Override
      public void d() {
         cmo.this.g(null);
         super.d();
      }

      @Override
      public void a() {
         cmo.this.g(null);
         super.a();
      }
   }

   public static class b extends bwl.a {
      public final jg<cmr> a;

      public b(jg<cmr> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
