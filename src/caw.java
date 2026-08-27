import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class caw extends bpa implements bom {
   private static final UUID bX = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F296");
   private static final aie<Boolean> bY = aih.a(caw.class, aig.k);
   private static final aie<Integer> bZ = aih.a(caw.class, aig.b);
   private static final aie<Boolean> ca = aih.a(caw.class, aig.k);
   private static final aie<Integer> cb = aih.a(caw.class, aig.b);
   public static final Predicate<bog> bW = $$0 -> {
      bnu<?> $$1 = $$0.ai();
      return $$1 == bnu.aH || $$1 == bnu.aE || $$1 == bnu.P;
   };
   private static final float cc = 8.0F;
   private static final float cd = 20.0F;
   private float ce;
   private float cf;
   private boolean cg;
   private boolean ch;
   private float ci;
   private float cj;
   private static final blf ck = axh.a(20, 39);
   @Nullable
   private UUID cl;

   public caw(bnu<? extends caw> $$0, cvn $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(eha.f, -1.0F);
      this.a(eha.g, -1.0F);
   }

   @Override
   protected void B() {
      this.bO.a(1, new buv(this));
      this.bO.a(1, new caw.b(1.5));
      this.bO.a(2, new bwg(this));
      this.bO.a(3, new caw.a<>(this, cby.class, 24.0F, 1.5, 1.5));
      this.bO.a(4, new bvh(this, 0.4F));
      this.bO.a(5, new bvl(this, 1.0, true));
      this.bO.a(6, new buz(this, 1.0, 10.0F, 2.0F, false));
      this.bO.a(7, new bun(this, 1.0));
      this.bO.a(8, new bwo(this, 1.0));
      this.bO.a(9, new buj(this, 8.0F));
      this.bO.a(10, new bvj(this, chh.class, 8.0F));
      this.bO.a(10, new bvw(this));
      this.bP.a(1, new bwy(this));
      this.bP.a(2, new bwz(this));
      this.bP.a(3, new bwt(this).a());
      this.bP.a(4, new bwu<>(this, chh.class, 10, true, false, this::a_));
      this.bP.a(5, new bwx<>(this, bzt.class, false, bW));
      this.bP.a(6, new bwx<>(this, cau.class, false, cau.bU));
      this.bP.a(7, new bwu<>(this, cdw.class, false));
      this.bP.a(8, new bxa<>(this, true));
   }

   public static bpk.a gm() {
      return boi.C().a(bpl.o, 0.3F).a(bpl.n, 8.0).a(bpl.c, 2.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bY, false);
      this.am.a(bZ, cnn.o.a());
      this.am.a(ca, false);
      this.am.a(cb, 0);
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.BR, 0.15F, 1.0F);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gp().a());
      $$0.a("armor", this.gq());
      this.c($$0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(cnn.a($$0.h("CollarColor")));
      }

      if ($$0.b("armor", 1)) {
         this.A($$0.q("armor"));
      }

      this.a(this.dM(), $$0);
   }

   @Override
   protected atj y() {
      if (this.aa_()) {
         return atk.BM;
      } else if (this.af.a(3) == 0) {
         return this.u() && this.ew() < 10.0F ? atk.BS : atk.BP;
      } else {
         return atk.BK;
      }
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.BO;
   }

   @Override
   protected atj n_() {
      return atk.BL;
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B && this.cg && !this.ch && !this.gc() && this.aC()) {
         this.ch = true;
         this.ci = 0.0F;
         this.cj = 0.0F;
         this.dM().a(this, (byte)8);
      }

      if (!this.dM().B) {
         this.a((aov)this.dM(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bx()) {
         this.cf = this.ce;
         if (this.gr()) {
            this.ce = this.ce + (1.0F - this.ce) * 0.4F;
         } else {
            this.ce = this.ce + (0.0F - this.ce) * 0.4F;
         }

         if (this.bb()) {
            this.cg = true;
            if (this.ch && !this.dM().B) {
               this.dM().a(this, (byte)56);
               this.gs();
            }
         } else if ((this.cg || this.ch) && this.ch) {
            if (this.ci == 0.0F) {
               this.a(atk.BQ, this.eW(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
               this.b(dpp.u);
            }

            this.cj = this.ci;
            this.ci += 0.05F;
            if (this.cj >= 2.0F) {
               this.cg = false;
               this.ch = false;
               this.cj = 0.0F;
               this.ci = 0.0F;
            }

            if (this.ci > 0.4F) {
               float $$0 = (float)this.dt();
               int $$1 = (int)(awh.a((this.ci - 0.4F) * (float) Math.PI) * 7.0F);
               ens $$2 = this.dp();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.af.i() * 2.0F - 1.0F) * this.dg() * 0.5F;
                  float $$5 = (this.af.i() * 2.0F - 1.0F) * this.dg() * 0.5F;
                  this.dM().a(jz.aj, this.dr() + (double)$$4, (double)($$0 + 0.8F), this.dx() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gs() {
      this.ch = false;
      this.ci = 0.0F;
      this.cj = 0.0F;
   }

   @Override
   public void a(bmn $$0) {
      this.cg = false;
      this.ch = false;
      this.cj = 0.0F;
      this.ci = 0.0F;
      super.a($$0);
   }

   public boolean gn() {
      return this.cg;
   }

   public float E(float $$0) {
      return Math.min(0.5F + awh.i($$0, this.cj, this.ci) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (awh.i($$0, this.cj, this.ci) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return awh.a($$2 * (float) Math.PI) * awh.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float F(float $$0) {
      return awh.i($$0, this.cf, this.ce) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ab() {
      return this.A() ? 20 : super.ab();
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         bno $$2 = $$0.d();
         if (!this.dM().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof chh) && !($$2 instanceof chn)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean B(bno $$0) {
      boolean $$1 = $$0.a(this.dN().b((bog)this), (float)((int)this.g(bpl.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.f(bpl.n).a(20.0);
         this.t(20.0F);
      } else {
         this.f(bpl.n).a(8.0);
      }

      this.f(bpl.c).a(4.0);
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      cou $$3 = $$2.d();
      if (this.dM().B) {
         boolean $$4 = this.j($$0) || this.u() || $$2.a(cpc.ry) && !this.u() && !this.aa_();
         return $$4 ? blu.b : blu.d;
      } else if (this.u()) {
         if (this.m($$2) && this.ew() < this.eN()) {
            if (!$$0.fU().d) {
               $$2.h(1);
            }

            this.c((float)$$3.u().a());
            return blu.a;
         } else {
            if ($$3 instanceof cno $$5 && this.j($$0)) {
               cnn $$6 = $$5.d();
               if ($$6 != this.gp()) {
                  this.a($$6);
                  if (!$$0.fU().d) {
                     $$2.h(1);
                  }

                  return blu.a;
               }

               return super.b($$0, $$1);
            }

            if ($$2.a(cpc.oq) && this.j($$0) && !this.gq() && !this.o_()) {
               if (!$$0.fU().d) {
                  $$2.h(1);
               }

               this.A(true);
               this.dM().a(null, this, atk.av, this.db(), 1.0F, 1.0F);
               this.a(dpp.v, $$0);
               return blu.a;
            } else if ($$2.a(cpc.rU) && this.j($$0) && this.gq()) {
               if (!$$0.fU().d) {
                  $$2.a(1, $$0, d($$1));
               }

               this.dM().a(null, this, atk.aw, this.db(), 1.0F, 1.0F);
               this.A(false);
               this.a(cpc.oq);
               this.a(dpp.S, $$0);
               return blu.a;
            } else {
               blu $$7 = super.b($$0, $$1);
               if ((!$$7.a() || this.o_()) && this.j($$0)) {
                  this.z(!this.gg());
                  this.bj = false;
                  this.bN.n();
                  this.h(null);
                  return blu.a;
               } else {
                  return $$7;
               }
            }
         }
      } else if ($$2.a(cpc.ry) && !this.aa_()) {
         if (!$$0.fU().d) {
            $$2.h(1);
         }

         if (this.af.a(3) == 0) {
            this.f($$0);
            this.bN.n();
            this.h(null);
            this.z(true);
            this.dM().a(this, (byte)7);
         } else {
            this.dM().a(this, (byte)6);
         }

         return blu.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.gq()) {
         this.a(cpc.oq);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.ch = true;
         this.ci = 0.0F;
         this.cj = 0.0F;
      } else if ($$0 == 56) {
         this.gs();
      } else {
         super.b($$0);
      }
   }

   public float go() {
      if (this.aa_()) {
         return 1.5393804F;
      } else {
         return this.u() ? (0.55F - (this.eN() - this.ew()) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean m(coz $$0) {
      cou $$1 = $$0.d();
      return $$1.t() && $$1.u().c();
   }

   @Override
   public int fK() {
      return 8;
   }

   @Override
   public int a() {
      return this.am.b(cb);
   }

   @Override
   public void a(int $$0) {
      this.am.b(cb, $$0);
   }

   @Override
   public void c() {
      this.a(ck.a(this.af));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cl;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cl = $$0;
   }

   public cnn gp() {
      return cnn.a(this.am.b(bZ));
   }

   public boolean gq() {
      return this.am.b(ca);
   }

   public void a(cnn $$0) {
      this.am.b(bZ, $$0.a());
   }

   public void A(boolean $$0) {
      if (!this.dM().B && $$0 != this.gq()) {
         this.am.b(ca, $$0);
         this.f(bpl.a).b(bX);
         if ($$0) {
            int $$1 = ((cmi)cpc.oq).c();
            if ($$1 != 0) {
               this.f(bpl.a).c(new bpj(bX, "Wolf armor bonus", (double)$$1, bpj.a.a));
            }
         }
      }
   }

   @Nullable
   public caw b(aov $$0, bnj $$1) {
      caw $$2 = bnu.bq.a((cvn)$$0);
      if ($$2 != null) {
         UUID $$3 = this.d();
         if ($$3 != null) {
            $$2.b($$3);
            $$2.x(true);
         }
      }

      return $$2;
   }

   public void B(boolean $$0) {
      this.am.b(bY, $$0);
   }

   @Override
   public boolean a(bzt $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.u()) {
         return false;
      } else if (!($$0 instanceof caw $$1)) {
         return false;
      } else if (!$$1.u()) {
         return false;
      } else {
         return $$1.A() ? false : this.gk() && $$1.gk();
      }
   }

   public boolean gr() {
      return this.am.b(bY);
   }

   @Override
   public boolean a(bog $$0, bog $$1) {
      if ($$0 instanceof cdz || $$0 instanceof ceh) {
         return false;
      } else if ($$0 instanceof caw $$2) {
         return !$$2.u() || $$2.R_() != $$1;
      } else if ($$0 instanceof chh && $$1 instanceof chh && !((chh)$$1).a((chh)$$0)) {
         return false;
      } else {
         return $$0 instanceof cbv && ((cbv)$$0).gv() ? false : !($$0 instanceof bpa) || !((bpa)$$0).u();
      }
   }

   @Override
   public boolean a(chh $$0) {
      return !this.aa_() && super.a($$0);
   }

   @Override
   public ens cJ() {
      return new ens(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   public static boolean c(bnu<caw> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return $$1.a_($$3.d()).a(atz.bY) && a($$1, $$3);
   }

   class a<T extends bog> extends bui<T> {
      private final caw j;

      public a(caw $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof cby ? !this.j.u() && this.a((cby)this.b) : false;
      }

      private boolean a(cby $$0) {
         return $$0.gq() >= caw.this.af.a(5);
      }

      @Override
      public void c() {
         caw.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         caw.this.h(null);
         super.e();
      }
   }

   class b extends bvu {
      public b(double $$0) {
         super(caw.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dB() || this.b.bN();
      }
   }
}
