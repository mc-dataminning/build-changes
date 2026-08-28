import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cia extends bwd implements bvl, bwg<jr<cib>> {
   private static final ajx<Boolean> ce = akb.a(cia.class, ajz.k);
   private static final ajx<Integer> cf = akb.a(cia.class, ajz.b);
   private static final ajx<Integer> cg = akb.a(cia.class, ajz.b);
   private static final ajx<jr<cib>> ch = akb.a(cia.class, ajz.y);
   public static final cfx.a cc = ($$0, $$1) -> {
      bur<?> $$2 = $$0.aq();
      return $$2 == bur.bb || $$2 == bur.aY || $$2 == bur.ab;
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

   public cia(bur<? extends cia> $$0, dgi $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(etq.f, -1.0F);
      this.a(etq.g, -1.0F);
   }

   @Override
   protected void B() {
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
      this.bS.a(10, new ccm(this, cox.class, 8.0F));
      this.bS.a(10, new ccz(this));
      this.bT.a(1, new ceb(this));
      this.bT.a(2, new cec(this));
      this.bT.a(3, new cdw(this).a());
      this.bT.a(4, new cdx<>(this, cox.class, 10, true, false, this::a));
      this.bT.a(5, new cea<>(this, cgx.class, false, cc));
      this.bT.a(6, new cea<>(this, chy.class, false, chy.bY));
      this.bT.a(7, new cdx<>(this, clf.class, false));
      this.bT.a(8, new ced<>(this, true));
   }

   public aku gB() {
      cib $$0 = this.gC().a();
      if (this.p()) {
         return $$0.b();
      } else {
         return this.ac_() ? $$0.c() : $$0.a();
      }
   }

   public jr<cib> gC() {
      return this.al.a(ch);
   }

   public void j(jr<cib> $$0) {
      this.al.a(ch, $$0);
   }

   public static bwn.a gD() {
      return cgx.gu().a(bwo.v, 0.3F).a(bwo.s, 8.0).a(bwo.c, 4.0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      kf $$1 = this.dY();
      ke<cib> $$2 = $$1.e(mc.m);
      $$0.a(ch, $$2.a(cic.j).or($$2::a).orElseThrow());
      $$0.a(ce, false);
      $$0.a(cf, cvm.o.a());
      $$0.a(cg, 0);
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.DI, 0.15F, 1.0F);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gF().a());
      this.gC().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      Optional.ofNullable(aku.c($$0.l("variant"))).map($$0x -> akt.a(mc.m, $$0x)).flatMap($$0x -> this.dY().e(mc.m).a($$0x)).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cvm.a($$0.h("CollarColor")));
      }

      this.a(this.dW(), $$0);
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      jr<dhk> $$4 = $$0.t(this.dw());
      jr<cib> $$6;
      if ($$3 instanceof cia.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cic.a(this.dY(), $$4);
         $$3 = new cia.b($$6);
      }

      this.j($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avz u() {
      if (this.ac_()) {
         return awa.DD;
      } else if (this.ae.a(3) == 0) {
         return this.p() && this.eE() < 20.0F ? awa.DJ : awa.DG;
      } else {
         return awa.DB;
      }
   }

   @Override
   protected avz e(bta $$0) {
      return this.i($$0) ? awa.Dz : awa.DF;
   }

   @Override
   protected avz o_() {
      return awa.DC;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C && this.cn && !this.co && !this.gl() && this.aJ()) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
         this.dW().a(this, (byte)8);
      }

      if (!this.dW().C) {
         this.a((arc)this.dW(), true);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.bL()) {
         this.cm = this.cl;
         if (this.gG()) {
            this.cl = this.cl + (1.0F - this.cl) * 0.4F;
         } else {
            this.cl = this.cl + (0.0F - this.cl) * 0.4F;
         }

         if (this.bl()) {
            this.cn = true;
            if (this.co && !this.dW().C) {
               this.dW().a(this, (byte)56);
               this.gH();
            }
         } else if ((this.cn || this.co) && this.co) {
            if (this.cp == 0.0F) {
               this.a(awa.DH, this.fg(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(ebt.u);
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
               float $$0 = (float)this.dD();
               int $$1 = (int)(ayz.a((this.cp - 0.4F) * (float) Math.PI) * 7.0F);
               fba $$2 = this.dz();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dr() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dr() * 0.5F;
                  this.dW().a(lt.ao, this.dB() + (double)$$4, (double)($$0 + 0.8F), this.dH() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gH() {
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
   public int aa() {
      return this.x() ? 20 : super.aa();
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
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
   protected void b(arc $$0, bta $$1, float $$2) {
      if (!this.i($$1)) {
         super.b($$0, $$1, $$2);
      } else {
         cwp $$3 = this.ag();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(ayz.f($$2), this, bus.g);
         if (buh.b.a($$4, $$5) != buh.b.a(this.ag())) {
            this.a(awa.Dy);
            $$0.a(new lp(lt.T, cwt.oV.n()), this.dB(), this.dD() + 1.0, this.dH(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean i(bta $$0) {
      return this.ag().a(cwt.oW) && !$$0.a(awr.C);
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
   public bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      cwl $$3 = $$2.h();
      if (this.p()) {
         if (this.j($$2) && this.eE() < this.eS()) {
            this.a($$0, $$1, $$2);
            crz $$4 = $$2.a(kv.w);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bsj.a;
         } else {
            if ($$3 instanceof cvn $$6 && this.j($$0)) {
               cvm $$7 = $$6.b();
               if ($$7 != this.gF()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bsj.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bus.g) && !this.ai() && this.j($$0) && !this.e_()) {
               this.h($$2.c(1));
               $$2.a(1, $$0);
               return bsj.a;
            } else if ($$2.a(cwt.sS) && this.j($$0) && this.ai() && (!ddb.a(this.ag(), dda.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(awa.az);
               cwp $$8 = this.ag();
               this.h(cwp.j);
               if (this.dW() instanceof arc $$9) {
                  this.a($$9, $$8);
               }

               return bsj.a;
            } else if (this.x() && this.ai() && this.j($$0) && this.ag().n() && this.ag().b($$2)) {
               $$2.h(1);
               this.a(awa.DA);
               cwp $$10 = this.ag();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return bsj.a;
            } else {
               bsj $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.j($$0)) {
                  this.z(!this.gp());
                  this.bm = false;
                  this.bR.m();
                  this.h(null);
                  return bsj.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dW().C && $$2.a(cwt.sw) && !this.ac_()) {
         $$2.a(1, $$0);
         this.g($$0);
         return bsj.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void g(cox $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.bR.m();
         this.h(null);
         this.z(true);
         this.dW().a(this, (byte)7);
      } else {
         this.dW().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
      } else if ($$0 == 56) {
         this.gH();
      } else {
         super.b($$0);
      }
   }

   public float gE() {
      if (this.ac_()) {
         return 1.5393804F;
      } else if (this.p()) {
         float $$0 = this.eS();
         float $$1 = ($$0 - this.eE()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.ag);
   }

   @Override
   public int af() {
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

   public cvm gF() {
      return cvm.a(this.al.a(cf));
   }

   private void a(cvm $$0) {
      this.al.a(cf, $$0.a());
   }

   @Nullable
   public cia b(arc $$0, bub $$1) {
      cia $$2 = bur.bM.a($$0, buq.e);
      if ($$2 != null && $$1 instanceof cia $$3) {
         if (this.ae.h()) {
            $$2.j(this.gC());
         } else {
            $$2.j($$3.gC());
         }

         if (this.p()) {
            $$2.b(this.aa_());
            $$2.b(true, true);
            cvm $$4 = this.gF();
            cvm $$5 = $$3.gF();
            $$2.a(cvm.a($$0, $$4, $$5));
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
         return $$1.x() ? false : this.gz() && $$1.gz();
      }
   }

   public boolean gG() {
      return this.al.a(ce);
   }

   @Override
   public boolean a(bvg $$0, bvg $$1) {
      if ($$0 instanceof clj || $$0 instanceof clr || $$0 instanceof ckq) {
         return false;
      } else if ($$0 instanceof cia $$2) {
         return !$$2.p() || $$2.ag_() != $$1;
      } else {
         if ($$0 instanceof cox $$3 && $$1 instanceof cox $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cjb $$5 && $$5.gG()) {
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
   public fba cT() {
      return new fba(0.0, (double)(0.6F * this.cS()), (double)(this.dr() * 0.4F));
   }

   public static boolean c(bur<cia> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
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
         return $$0.gt() >= cia.this.ae.a(5);
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
