import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cic extends bwf implements bvn, bwi<jr<cid>> {
   private static final ajy<Boolean> ce = akc.a(cic.class, aka.k);
   private static final ajy<Integer> cf = akc.a(cic.class, aka.b);
   private static final ajy<Integer> cg = akc.a(cic.class, aka.b);
   private static final ajy<jr<cid>> ch = akc.a(cic.class, aka.y);
   public static final cfz.a cc = ($$0, $$1) -> {
      but<?> $$2 = $$0.aq();
      return $$2 == but.ba || $$2 == but.aX || $$2 == but.aa;
   };
   private static final float ci = 8.0F;
   private static final float cj = 40.0F;
   private static final float ck = 0.125F;
   public static final float cd = (float) (Math.PI / 5);
   private float cl;
   private float cm;
   private boolean cn;
   private boolean co;
   private float cp;
   private float cq;
   private static final brw cr = bab.a(20, 39);
   @Nullable
   private UUID cs;

   public cic(but<? extends cic> $$0, dgj $$1) {
      super($$0, $$1);
      this.a(false, false);
      this.a(etr.f, -1.0F);
      this.a(etr.g, -1.0F);
   }

   @Override
   protected void E() {
      this.bS.a(1, new cca(this));
      this.bS.a(1, new bwf.a(1.5, awr.G));
      this.bS.a(2, new cdl(this));
      this.bS.a(3, new cic.a<>(this, cjg.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new ccm(this, 0.4F));
      this.bS.a(5, new ccq(this, 1.0, true));
      this.bS.a(6, new cce(this, 1.0, 10.0F, 2.0F));
      this.bS.a(7, new cbs(this, 1.0));
      this.bS.a(8, new cdt(this, 1.0));
      this.bS.a(9, new cbo(this, 8.0F));
      this.bS.a(10, new cco(this, coy.class, 8.0F));
      this.bS.a(10, new cdb(this));
      this.bT.a(1, new ced(this));
      this.bT.a(2, new cee(this));
      this.bT.a(3, new cdy(this).a());
      this.bT.a(4, new cdz<>(this, coy.class, 10, true, false, this::a));
      this.bT.a(5, new cec<>(this, cgz.class, false, cc));
      this.bT.a(6, new cec<>(this, cia.class, false, cia.bY));
      this.bT.a(7, new cdz<>(this, clh.class, false));
      this.bT.a(8, new cef<>(this, true));
   }

   public akv gE() {
      cid $$0 = this.gF().a();
      if (this.p()) {
         return $$0.b();
      } else {
         return this.ac_() ? $$0.c() : $$0.a();
      }
   }

   public jr<cid> gF() {
      return this.al.a(ch);
   }

   public void j(jr<cid> $$0) {
      this.al.a(ch, $$0);
   }

   public static bwp.a gG() {
      return cgz.gx().a(bwq.v, 0.3F).a(bwq.s, 8.0).a(bwq.c, 4.0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      kf $$1 = this.dX();
      ke<cid> $$2 = $$1.e(mc.m);
      $$0.a(ch, $$2.a(cie.j).or($$2::a).orElseThrow());
      $$0.a(ce, false);
      $$0.a(cf, cvn.o.a());
      $$0.a(cg, 0);
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.DH, 0.15F, 1.0F);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gI().a());
      this.gF().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      Optional.ofNullable(akv.c($$0.l("variant"))).map($$0x -> aku.a(mc.m, $$0x)).flatMap($$0x -> this.dX().e(mc.m).a($$0x)).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cvn.a($$0.h("CollarColor")));
      }

      this.a(this.dV(), $$0);
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      jr<dhl> $$4 = $$0.t(this.dv());
      jr<cid> $$6;
      if ($$3 instanceof cic.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cie.a(this.dX(), $$4);
         $$3 = new cic.b($$6);
      }

      this.j($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avz u() {
      if (this.ac_()) {
         return awa.DC;
      } else if (this.ae.a(3) == 0) {
         return this.p() && this.eD() < 20.0F ? awa.DI : awa.DF;
      } else {
         return awa.DA;
      }
   }

   @Override
   protected avz e(btc $$0) {
      return this.j($$0) ? awa.Dy : awa.DE;
   }

   @Override
   protected avz o_() {
      return awa.DB;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C && this.cn && !this.co && !this.go() && this.aJ()) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
         this.dV().a(this, (byte)8);
      }

      if (!this.dV().C) {
         this.a((ard)this.dV(), true);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.bL()) {
         this.cm = this.cl;
         if (this.gJ()) {
            this.cl = this.cl + (1.0F - this.cl) * 0.4F;
         } else {
            this.cl = this.cl + (0.0F - this.cl) * 0.4F;
         }

         if (this.bl()) {
            this.cn = true;
            if (this.co && !this.dV().C) {
               this.dV().a(this, (byte)56);
               this.gK();
            }
         } else if ((this.cn || this.co) && this.co) {
            if (this.cp == 0.0F) {
               this.a(awa.DG, this.fg(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(ebu.u);
            }

            this.cq = this.cp;
            this.cp += 0.05F;
            if (this.cq >= 2.0F) {
               this.cn = false;
               this.co = false;
               this.cq = 0.0F;
               this.cp = 0.0F;
            }

            if (this.cp > 0.4F) {
               float $$0 = (float)this.dC();
               int $$1 = (int)(ayz.a((this.cp - 0.4F) * (float) Math.PI) * 7.0F);
               fbb $$2 = this.dy();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  this.dV().a(lt.ao, this.dA() + (double)$$4, (double)($$0 + 0.8F), this.dG() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gK() {
      this.co = false;
      this.cp = 0.0F;
      this.cq = 0.0F;
   }

   @Override
   public void a(btc $$0) {
      this.cn = false;
      this.co = false;
      this.cq = 0.0F;
      this.cp = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.cn ? 1.0F : Math.min(0.75F + ayz.h($$0, this.cq, this.cp) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return ayz.h($$0, this.cq, this.cp);
   }

   public float L(float $$0) {
      return ayz.h($$0, this.cm, this.cl) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ad() {
      return this.x() ? 20 : super.ad();
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean e(buu $$0) {
      return true;
   }

   @Override
   protected void b(ard $$0, btc $$1, float $$2) {
      if (!this.j($$1)) {
         super.b($$0, $$1, $$2);
      } else {
         cwq $$3 = this.ak();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(ayz.f($$2), this, buu.g);
         if (buj.b.a($$4, $$5) != buj.b.a(this.ak())) {
            this.a(awa.Dx);
            $$0.a(new lp(lt.T, cwu.oV.n()), this.dA(), this.dC() + 1.0, this.dG(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean j(btc $$0) {
      return this.ak().a(cwu.oW) && !$$0.a(awr.C);
   }

   @Override
   protected void t() {
      if (this.p()) {
         this.g(bwq.s).a(40.0);
         this.x(40.0F);
      } else {
         this.g(bwq.s).a(8.0);
      }
   }

   @Override
   protected void c(btc $$0, float $$1) {
      this.a($$0, $$1, new buu[]{buu.g});
   }

   @Override
   public bsl b(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      cwm $$3 = $$2.h();
      if (this.p()) {
         if (this.j($$2) && this.eD() < this.eS()) {
            this.a($$0, $$1, $$2);
            csa $$4 = $$2.a(kv.w);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bsl.a;
         } else {
            if ($$3 instanceof cvo $$6 && this.j($$0)) {
               cvn $$7 = $$6.b();
               if ($$7 != this.gI()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bsl.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, buu.g) && !this.fX() && this.j($$0) && !this.e_()) {
               this.h($$2.c(1));
               $$2.a(1, $$0);
               return bsl.a;
            } else if ($$2.a(cwu.sS) && this.j($$0) && this.fX() && (!ddc.a(this.ak(), ddb.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(awa.az);
               cwq $$8 = this.ak();
               this.h(cwq.j);
               if (this.dV() instanceof ard $$9) {
                  this.a($$9, $$8);
               }

               return bsl.a;
            } else if (this.x() && this.fX() && this.j($$0) && this.ak().n() && this.ak().b($$2)) {
               $$2.h(1);
               this.a(awa.Dz);
               cwq $$10 = this.ak();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return bsl.a;
            } else {
               bsl $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.j($$0)) {
                  this.z(!this.gs());
                  this.bm = false;
                  this.bR.m();
                  this.h(null);
                  return bsl.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dV().C && $$2.a(cwu.sw) && !this.ac_()) {
         $$2.a(1, $$0);
         this.g($$0);
         return bsl.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void g(coy $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.bR.m();
         this.h(null);
         this.z(true);
         this.dV().a(this, (byte)7);
      } else {
         this.dV().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
      } else if ($$0 == 56) {
         this.gK();
      } else {
         super.b($$0);
      }
   }

   public float gH() {
      if (this.ac_()) {
         return 1.5393804F;
      } else if (this.p()) {
         float $$0 = this.eS();
         float $$1 = ($$0 - this.eD()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean j(cwq $$0) {
      return $$0.a(awy.ag);
   }

   @Override
   public int aj() {
      return 8;
   }

   @Override
   public int a() {
      return this.al.a(cg);
   }

   @Override
   public void a(int $$0) {
      this.al.a(cg, $$0);
   }

   @Override
   public void c() {
      this.a(cr.a(this.ae));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cs;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cs = $$0;
   }

   public cvn gI() {
      return cvn.a(this.al.a(cf));
   }

   private void a(cvn $$0) {
      this.al.a(cf, $$0.a());
   }

   @Nullable
   public cic b(ard $$0, bud $$1) {
      cic $$2 = but.bL.a($$0, bus.e);
      if ($$2 != null && $$1 instanceof cic $$3) {
         if (this.ae.h()) {
            $$2.j(this.gF());
         } else {
            $$2.j($$3.gF());
         }

         if (this.p()) {
            $$2.b(this.aa_());
            $$2.a(true, true);
            cvn $$4 = this.gI();
            cvn $$5 = $$3.gI();
            $$2.a(cvn.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.al.a(ce, $$0);
   }

   @Override
   public boolean a(cgz $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.p()) {
         return false;
      } else if (!($$0 instanceof cic $$1)) {
         return false;
      } else if (!$$1.p()) {
         return false;
      } else {
         return $$1.x() ? false : this.gC() && $$1.gC();
      }
   }

   public boolean gJ() {
      return this.al.a(ce);
   }

   @Override
   public boolean a(bvi $$0, bvi $$1) {
      if ($$0 instanceof cll || $$0 instanceof clt || $$0 instanceof cks) {
         return false;
      } else if ($$0 instanceof cic $$2) {
         return !$$2.p() || $$2.ag_() != $$1;
      } else {
         if ($$0 instanceof coy $$3 && $$1 instanceof coy $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cjd $$5 && $$5.gJ()) {
            return false;
         }

         if ($$0 instanceof bwf $$6 && $$6.p()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean y() {
      return !this.ac_();
   }

   @Override
   public fbb cT() {
      return new fbb(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   public static boolean c(but<cic> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.ch) && a($$1, $$3);
   }

   class a<T extends bvi> extends cbn<T> {
      private final cic j;

      public a(final cic $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cjg ? !this.j.p() && this.a((cjg)this.b) : false;
      }

      private boolean a(cjg $$0) {
         return $$0.gw() >= cic.this.ae.a(5);
      }

      @Override
      public void d() {
         cic.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         cic.this.h(null);
         super.a();
      }
   }

   public static class b extends bud.a {
      public final jr<cid> a;

      public b(jr<cid> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
