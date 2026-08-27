import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzf extends bnj implements bmv {
   private static final UUID bY = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F296");
   private static final agn<Boolean> bZ = agq.a(bzf.class, agp.k);
   private static final agn<Integer> ca = agq.a(bzf.class, agp.b);
   private static final agn<Boolean> cb = agq.a(bzf.class, agp.k);
   private static final agn<Integer> cc = agq.a(bzf.class, agp.b);
   public static final Predicate<bmo> bX = $$0 -> {
      bmc<?> $$1 = $$0.ai();
      return $$1 == bmc.aH || $$1 == bmc.aE || $$1 == bmc.P;
   };
   private static final float cd = 8.0F;
   private static final float ce = 20.0F;
   private float cf;
   private float cg;
   private boolean ch;
   private boolean ci;
   private float cj;
   private float ck;
   private static final bjn cl = avq.a(20, 39);
   @Nullable
   private UUID cm;

   public bzf(bmc<? extends bzf> $$0, ctx $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(efk.f, -1.0F);
      this.a(efk.g, -1.0F);
   }

   @Override
   protected void B() {
      this.bP.a(1, new bte(this));
      this.bP.a(1, new bzf.b(1.5));
      this.bP.a(2, new bup(this));
      this.bP.a(3, new bzf.a<>(this, cah.class, 24.0F, 1.5, 1.5));
      this.bP.a(4, new btq(this, 0.4F));
      this.bP.a(5, new btu(this, 1.0, true));
      this.bP.a(6, new bti(this, 1.0, 10.0F, 2.0F, false));
      this.bP.a(7, new bsw(this, 1.0));
      this.bP.a(8, new bux(this, 1.0));
      this.bP.a(9, new bss(this, 8.0F));
      this.bP.a(10, new bts(this, cfq.class, 8.0F));
      this.bP.a(10, new buf(this));
      this.bQ.a(1, new bvh(this));
      this.bQ.a(2, new bvi(this));
      this.bQ.a(3, new bvc(this).a());
      this.bQ.a(4, new bvd<>(this, cfq.class, 10, true, false, this::a_));
      this.bQ.a(5, new bvg<>(this, byc.class, false, bX));
      this.bQ.a(6, new bvg<>(this, bzd.class, false, bzd.bV));
      this.bQ.a(7, new bvd<>(this, ccf.class, false));
      this.bQ.a(8, new bvj<>(this, true));
   }

   public static bnt.a gl() {
      return bmq.C().a(bnu.o, 0.3F).a(bnu.n, 8.0).a(bnu.c, 2.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bZ, false);
      this.an.a(ca, clv.o.a());
      this.an.a(cb, false);
      this.an.a(cc, 0);
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.BR, 0.15F, 1.0F);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.go().a());
      $$0.a("armor", this.gp());
      this.c($$0);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(clv.a($$0.h("CollarColor")));
      }

      if ($$0.b("armor", 1)) {
         this.A($$0.q("armor"));
      }

      this.a(this.dL(), $$0);
   }

   @Override
   protected ars y() {
      if (this.aa_()) {
         return art.BM;
      } else if (this.ag.a(3) == 0) {
         return this.u() && this.ev() < 10.0F ? art.BS : art.BP;
      } else {
         return art.BK;
      }
   }

   @Override
   protected ars d(bkv $$0) {
      return art.BO;
   }

   @Override
   protected ars n_() {
      return art.BL;
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dL().B && this.ch && !this.ci && !this.gb() && this.aC()) {
         this.ci = true;
         this.cj = 0.0F;
         this.ck = 0.0F;
         this.dL().a(this, (byte)8);
      }

      if (!this.dL().B) {
         this.a((ane)this.dL(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bx()) {
         this.cg = this.cf;
         if (this.gq()) {
            this.cf = this.cf + (1.0F - this.cf) * 0.4F;
         } else {
            this.cf = this.cf + (0.0F - this.cf) * 0.4F;
         }

         if (this.bb()) {
            this.ch = true;
            if (this.ci && !this.dL().B) {
               this.dL().a(this, (byte)56);
               this.gr();
            }
         } else if ((this.ch || this.ci) && this.ci) {
            if (this.cj == 0.0F) {
               this.a(art.BQ, this.eW(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.b(dnz.u);
            }

            this.ck = this.cj;
            this.cj += 0.05F;
            if (this.ck >= 2.0F) {
               this.ch = false;
               this.ci = false;
               this.ck = 0.0F;
               this.cj = 0.0F;
            }

            if (this.cj > 0.4F) {
               float $$0 = (float)this.ds();
               int $$1 = (int)(aup.a((this.cj - 0.4F) * (float) Math.PI) * 7.0F);
               emc $$2 = this.do();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.dg() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.dg() * 0.5F;
                  this.dL().a(jx.aj, this.dq() + (double)$$4, (double)($$0 + 0.8F), this.dw() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gr() {
      this.ci = false;
      this.cj = 0.0F;
      this.ck = 0.0F;
   }

   @Override
   public void a(bkv $$0) {
      this.ch = false;
      this.ci = false;
      this.ck = 0.0F;
      this.cj = 0.0F;
      super.a($$0);
   }

   public boolean gm() {
      return this.ch;
   }

   public float D(float $$0) {
      return Math.min(0.5F + aup.i($$0, this.ck, this.cj) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (aup.i($$0, this.ck, this.cj) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return aup.a($$2 * (float) Math.PI) * aup.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float E(float $$0) {
      return aup.i($$0, this.cg, this.cf) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ab() {
      return this.A() ? 20 : super.ab();
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         blw $$2 = $$0.d();
         if (!this.dL().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof cfq) && !($$2 instanceof cfw)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean B(blw $$0) {
      boolean $$1 = $$0.a(this.dM().b((bmo)this), (float)((int)this.g(bnu.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.f(bnu.n).a(20.0);
         this.c(20.0F);
      } else {
         this.f(bnu.n).a(8.0);
      }

      this.f(bnu.c).a(4.0);
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      cnb $$3 = $$2.d();
      if (this.dL().B) {
         boolean $$4 = this.j($$0) || this.u() || $$2.a(cnj.ry) && !this.u() && !this.aa_();
         return $$4 ? bkc.b : bkc.d;
      } else if (this.u()) {
         if (this.m($$2) && this.ev() < this.eM()) {
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            this.b((float)$$3.u().a());
            return bkc.a;
         } else {
            if ($$3 instanceof clw $$5 && this.j($$0)) {
               clv $$6 = $$5.d();
               if ($$6 != this.go()) {
                  this.a($$6);
                  if (!$$0.fT().d) {
                     $$2.h(1);
                  }

                  return bkc.a;
               }

               return super.b($$0, $$1);
            }

            if ($$2.a(cnj.oq) && this.j($$0) && !this.gp() && !this.o_()) {
               if (!$$0.fT().d) {
                  $$2.h(1);
               }

               this.A(true);
               this.dL().a(null, this, art.av, this.db(), 1.0F, 1.0F);
               this.a(dnz.v, $$0);
               return bkc.a;
            } else if ($$2.a(cnj.rU) && this.j($$0) && this.gp()) {
               if (!$$0.fT().d) {
                  $$2.a(1, $$0, $$1x -> $$1x.d($$1));
               }

               this.dL().a(null, this, art.aw, this.db(), 1.0F, 1.0F);
               this.A(false);
               this.a(cnj.oq);
               this.a(dnz.S, $$0);
               return bkc.a;
            } else {
               bkc $$7 = super.b($$0, $$1);
               if ((!$$7.a() || this.o_()) && this.j($$0)) {
                  this.z(!this.gf());
                  this.bj = false;
                  this.bO.n();
                  this.h(null);
                  return bkc.a;
               } else {
                  return $$7;
               }
            }
         }
      } else if ($$2.a(cnj.ry) && !this.aa_()) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         if (this.ag.a(3) == 0) {
            this.f($$0);
            this.bO.n();
            this.h(null);
            this.z(true);
            this.dL().a(this, (byte)7);
         } else {
            this.dL().a(this, (byte)6);
         }

         return bkc.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void ey() {
      super.ey();
      if (this.gp()) {
         this.a(cnj.oq);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.ci = true;
         this.cj = 0.0F;
         this.ck = 0.0F;
      } else if ($$0 == 56) {
         this.gr();
      } else {
         super.b($$0);
      }
   }

   public float gn() {
      if (this.aa_()) {
         return 1.5393804F;
      } else {
         return this.u() ? (0.55F - (this.eM() - this.ev()) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean m(cng $$0) {
      cnb $$1 = $$0.d();
      return $$1.t() && $$1.u().c();
   }

   @Override
   public int fJ() {
      return 8;
   }

   @Override
   public int a() {
      return this.an.b(cc);
   }

   @Override
   public void a(int $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   public void c() {
      this.a(cl.a(this.ag));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cm;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cm = $$0;
   }

   public clv go() {
      return clv.a(this.an.b(ca));
   }

   public boolean gp() {
      return this.an.b(cb);
   }

   public void a(clv $$0) {
      this.an.b(ca, $$0.a());
   }

   public void A(boolean $$0) {
      if (!this.dL().B && $$0 != this.gp()) {
         this.an.b(cb, $$0);
         this.f(bnu.a).b(bY);
         if ($$0) {
            int $$1 = ((ckq)cnj.oq).c();
            if ($$1 != 0) {
               this.f(bnu.a).c(new bns(bY, "Wolf armor bonus", (double)$$1, bns.a.a));
            }
         }
      }
   }

   @Nullable
   public bzf b(ane $$0, blr $$1) {
      bzf $$2 = bmc.bq.a((ctx)$$0);
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
      this.an.b(bZ, $$0);
   }

   @Override
   public boolean a(byc $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.u()) {
         return false;
      } else if (!($$0 instanceof bzf $$1)) {
         return false;
      } else if (!$$1.u()) {
         return false;
      } else {
         return $$1.A() ? false : this.gj() && $$1.gj();
      }
   }

   public boolean gq() {
      return this.an.b(bZ);
   }

   @Override
   public boolean a(bmo $$0, bmo $$1) {
      if ($$0 instanceof cci || $$0 instanceof ccq) {
         return false;
      } else if ($$0 instanceof bzf $$2) {
         return !$$2.u() || $$2.R_() != $$1;
      } else if ($$0 instanceof cfq && $$1 instanceof cfq && !((cfq)$$1).a((cfq)$$0)) {
         return false;
      } else {
         return $$0 instanceof cae && ((cae)$$0).gu() ? false : !($$0 instanceof bnj) || !((bnj)$$0).u();
      }
   }

   @Override
   public boolean a(cfq $$0) {
      return !this.aa_() && super.a($$0);
   }

   @Override
   public emc cJ() {
      return new emc(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   public static boolean c(bmc<bzf> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return $$1.a_($$3.d()).a(asi.bX) && a($$1, $$3);
   }

   class a<T extends bmo> extends bsr<T> {
      private final bzf j;

      public a(bzf $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof cah ? !this.j.u() && this.a((cah)this.b) : false;
      }

      private boolean a(cah $$0) {
         return $$0.gp() >= bzf.this.ag.a(5);
      }

      @Override
      public void c() {
         bzf.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         bzf.this.h(null);
         super.e();
      }
   }

   class b extends bud {
      public b(double $$0) {
         super(bzf.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dA() || this.b.bN();
      }
   }
}
