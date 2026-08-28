import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cia extends bwd implements bvl, bwg<jr<cib>> {
   private static final ajy<Boolean> ce = akc.a(cia.class, aka.k);
   private static final ajy<Integer> cf = akc.a(cia.class, aka.b);
   private static final ajy<Integer> cg = akc.a(cia.class, aka.b);
   private static final ajy<jr<cib>> ch = akc.a(cia.class, aka.y);
   public static final cfx.a cc = ($$0, $$1) -> {
      bur<?> $$2 = $$0.aq();
      return $$2 == bur.ba || $$2 == bur.aX || $$2 == bur.aa;
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
   private static final bru cr = bab.a(20, 39);
   @Nullable
   private UUID cs;

   public cia(bur<? extends cia> $$0, dgh $$1) {
      super($$0, $$1);
      this.a(false, false);
      this.a(etp.f, -1.0F);
      this.a(etp.g, -1.0F);
   }

   @Override
   protected void E() {
      this.bS.a(1, new cby(this));
      this.bS.a(1, new bwd.a(1.5, awr.G));
      this.bS.a(2, new cdj(this));
      this.bS.a(3, new cia.a<>(this, cje.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new cck(this, 0.4F));
      this.bS.a(5, new cco(this, 1.0, true));
      this.bS.a(6, new ccc(this, 1.0, 10.0F, 2.0F));
      this.bS.a(7, new cbq(this, 1.0));
      this.bS.a(8, new cdr(this, 1.0));
      this.bS.a(9, new cbm(this, 8.0F));
      this.bS.a(10, new ccm(this, cow.class, 8.0F));
      this.bS.a(10, new ccz(this));
      this.bT.a(1, new ceb(this));
      this.bT.a(2, new cec(this));
      this.bT.a(3, new cdw(this).a());
      this.bT.a(4, new cdx<>(this, cow.class, 10, true, false, this::a));
      this.bT.a(5, new cea<>(this, cgx.class, false, cc));
      this.bT.a(6, new cea<>(this, chy.class, false, chy.bY));
      this.bT.a(7, new cdx<>(this, clf.class, false));
      this.bT.a(8, new ced<>(this, true));
   }

   public akv gE() {
      cib $$0 = this.gF().a();
      if (this.p()) {
         return $$0.b();
      } else {
         return this.ac_() ? $$0.c() : $$0.a();
      }
   }

   public jr<cib> gF() {
      return this.al.a(ch);
   }

   public void j(jr<cib> $$0) {
      this.al.a(ch, $$0);
   }

   public static bwn.a gG() {
      return cgx.gx().a(bwo.v, 0.3F).a(bwo.s, 8.0).a(bwo.c, 4.0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      kf $$1 = this.dX();
      ke<cib> $$2 = $$1.e(mc.m);
      $$0.a(ch, $$2.a(cic.j).or($$2::a).orElseThrow());
      $$0.a(ce, false);
      $$0.a(cf, cvl.o.a());
      $$0.a(cg, 0);
   }

   @Override
   protected void b(ji $$0, dww $$1) {
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
         this.a(cvl.a($$0.h("CollarColor")));
      }

      this.a(this.dV(), $$0);
   }

   @Nullable
   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      jr<dhj> $$4 = $$0.t(this.dv());
      jr<cib> $$6;
      if ($$3 instanceof cia.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cic.a(this.dX(), $$4);
         $$3 = new cia.b($$6);
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
   protected avz e(bta $$0) {
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
               this.a(ebs.u);
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
               faz $$2 = this.dy();

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
   public void a(bta $$0) {
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
   public boolean a(ard $$0, bta $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean e(bus $$0) {
      return true;
   }

   @Override
   protected void b(ard $$0, bta $$1, float $$2) {
      if (!this.j($$1)) {
         super.b($$0, $$1, $$2);
      } else {
         cwo $$3 = this.ak();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(ayz.f($$2), this, bus.g);
         if (buh.b.a($$4, $$5) != buh.b.a(this.ak())) {
            this.a(awa.Dx);
            $$0.a(new lp(lt.T, cws.oV.n()), this.dA(), this.dC() + 1.0, this.dG(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean j(bta $$0) {
      return this.ak().a(cws.oW) && !$$0.a(awr.C);
   }

   @Override
   protected void t() {
      if (this.p()) {
         this.g(bwo.s).a(40.0);
         this.x(40.0F);
      } else {
         this.g(bwo.s).a(8.0);
      }
   }

   @Override
   protected void c(bta $$0, float $$1) {
      this.a($$0, $$1, new bus[]{bus.g});
   }

   @Override
   public bsj b(cow $$0, bsi $$1) {
      cwo $$2 = $$0.b($$1);
      cwk $$3 = $$2.h();
      if (this.p()) {
         if (this.j($$2) && this.eD() < this.eS()) {
            this.a($$0, $$1, $$2);
            cry $$4 = $$2.a(kv.w);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bsj.a;
         } else {
            if ($$3 instanceof cvm $$6 && this.j($$0)) {
               cvl $$7 = $$6.b();
               if ($$7 != this.gI()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bsj.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bus.g) && !this.fX() && this.j($$0) && !this.e_()) {
               this.h($$2.c(1));
               $$2.a(1, $$0);
               return bsj.a;
            } else if ($$2.a(cws.sS) && this.j($$0) && this.fX() && (!dda.a(this.ak(), dcz.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(awa.az);
               cwo $$8 = this.ak();
               this.h(cwo.j);
               if (this.dV() instanceof ard $$9) {
                  this.a($$9, $$8);
               }

               return bsj.a;
            } else if (this.x() && this.fX() && this.j($$0) && this.ak().n() && this.ak().b($$2)) {
               $$2.h(1);
               this.a(awa.Dz);
               cwo $$10 = this.ak();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return bsj.a;
            } else {
               bsj $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.j($$0)) {
                  this.z(!this.gs());
                  this.bm = false;
                  this.bR.m();
                  this.h(null);
                  return bsj.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dV().C && $$2.a(cws.sw) && !this.ac_()) {
         $$2.a(1, $$0);
         this.g($$0);
         return bsj.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void g(cow $$0) {
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
   public boolean j(cwo $$0) {
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

   public cvl gI() {
      return cvl.a(this.al.a(cf));
   }

   private void a(cvl $$0) {
      this.al.a(cf, $$0.a());
   }

   @Nullable
   public cia b(ard $$0, bub $$1) {
      cia $$2 = bur.bL.a($$0, buq.e);
      if ($$2 != null && $$1 instanceof cia $$3) {
         if (this.ae.h()) {
            $$2.j(this.gF());
         } else {
            $$2.j($$3.gF());
         }

         if (this.p()) {
            $$2.b(this.aa_());
            $$2.a(true, true);
            cvl $$4 = this.gI();
            cvl $$5 = $$3.gI();
            $$2.a(cvl.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.al.a(ce, $$0);
   }

   @Override
   public boolean a(cgx $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.p()) {
         return false;
      } else if (!($$0 instanceof cia $$1)) {
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
   public boolean a(bvg $$0, bvg $$1) {
      if ($$0 instanceof clj || $$0 instanceof clr || $$0 instanceof ckq) {
         return false;
      } else if ($$0 instanceof cia $$2) {
         return !$$2.p() || $$2.ag_() != $$1;
      } else {
         if ($$0 instanceof cow $$3 && $$1 instanceof cow $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cjb $$5 && $$5.gJ()) {
            return false;
         }

         if ($$0 instanceof bwd $$6 && $$6.p()) {
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
   public faz cT() {
      return new faz(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   public static boolean c(bur<cia> $$0, dgi $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.ch) && a($$1, $$3);
   }

   class a<T extends bvg> extends cbl<T> {
      private final cia j;

      public a(final cia $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cje ? !this.j.p() && this.a((cje)this.b) : false;
      }

      private boolean a(cje $$0) {
         return $$0.gw() >= cia.this.ae.a(5);
      }

      @Override
      public void d() {
         cia.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         cia.this.h(null);
         super.a();
      }
   }

   public static class b extends bub.a {
      public final jr<cib> a;

      public b(jr<cib> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
