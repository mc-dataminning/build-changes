import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgf extends buj implements btr, bum<jm<cgg>> {
   private static final ajv<Boolean> cf = ajz.a(cgf.class, ajx.k);
   private static final ajv<Integer> cg = ajz.a(cgf.class, ajx.b);
   private static final ajv<Integer> ch = ajz.a(cgf.class, ajx.b);
   private static final ajv<jm<cgg>> ci = ajz.a(cgf.class, ajx.y);
   public static final Predicate<btl> ce = $$0 -> {
      bsw<?> $$1 = $$0.am();
      return $$1 == bsw.aJ || $$1 == bsw.aG || $$1 == bsw.Q;
   };
   private static final float cj = 8.0F;
   private static final float ck = 40.0F;
   private static final float cl = 0.125F;
   private float cm;
   private float cn;
   private boolean co;
   private boolean cp;
   private float cq;
   private float cr;
   private static final bqb cs = azo.a(20, 39);
   @Nullable
   private UUID ct;

   public cgf(bsw<? extends cgf> $$0, dcu $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(epp.f, -1.0F);
      this.a(epp.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cae(this));
      this.bU.a(1, new buj.a(1.5, awf.G));
      this.bU.a(2, new cbp(this));
      this.bU.a(3, new cgf.a<>(this, chj.class, 24.0F, 1.5, 1.5));
      this.bU.a(4, new caq(this, 0.4F));
      this.bU.a(5, new cau(this, 1.0, true));
      this.bU.a(6, new cai(this, 1.0, 10.0F, 2.0F));
      this.bU.a(7, new bzw(this, 1.0));
      this.bU.a(8, new cbx(this, 1.0));
      this.bU.a(9, new bzs(this, 8.0F));
      this.bU.a(10, new cas(this, cmv.class, 8.0F));
      this.bU.a(10, new cbf(this));
      this.bV.a(1, new cch(this));
      this.bV.a(2, new cci(this));
      this.bV.a(3, new ccc(this).a());
      this.bV.a(4, new ccd<>(this, cmv.class, 10, true, false, this::a_));
      this.bV.a(5, new ccg<>(this, cfc.class, false, ce));
      this.bV.a(6, new ccg<>(this, cgd.class, false, cgd.ca));
      this.bV.a(7, new ccd<>(this, cjj.class, false));
      this.bV.a(8, new ccj<>(this, true));
   }

   public akq gw() {
      cgg $$0 = this.gx().a();
      if (this.s()) {
         return $$0.b();
      } else {
         return this.Z_() ? $$0.c() : $$0.a();
      }
   }

   public jm<cgg> gx() {
      return this.ao.a(ci);
   }

   @Override
   public void i(jm<cgg> $$0) {
      this.ao.a(ci, $$0);
   }

   public static but.a gy() {
      return btn.A().a(buu.v, 0.3F).a(buu.s, 8.0).a(buu.c, 4.0);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      ka $$1 = this.dS();
      jz<cgg> $$2 = $$1.d(lu.m);
      $$0.a(ci, $$2.b(cgh.j).or($$2::a).orElseThrow());
      $$0.a(cf, false);
      $$0.a(cg, ctg.o.a());
      $$0.a(ch, 0);
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.CT, 0.15F, 1.0F);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gB().a());
      this.gx().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.c($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      Optional.ofNullable(akq.c($$0.l("variant"))).map($$0x -> akp.a(lu.m, $$0x)).flatMap($$0x -> this.dS().d(lu.m).b($$0x)).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(ctg.a($$0.h("CollarColor")));
      }

      this.a(this.dQ(), $$0);
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      jm<ddu> $$4 = $$0.t(this.dq());
      jm<cgg> $$6;
      if ($$3 instanceof cgf.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cgh.a(this.dS(), $$4);
         $$3 = new cgf.b($$6);
      }

      this.i($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avn v() {
      if (this.Z_()) {
         return avo.CO;
      } else if (this.ah.a(3) == 0) {
         return this.s() && this.ex() < 20.0F ? avo.CU : avo.CR;
      } else {
         return avo.CM;
      }
   }

   @Override
   protected avn d(brj $$0) {
      return this.g($$0) ? avo.CK : avo.CQ;
   }

   @Override
   protected avn n_() {
      return avo.CN;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dQ().B && this.co && !this.cp && !this.gi() && this.aF()) {
         this.cp = true;
         this.cq = 0.0F;
         this.cr = 0.0F;
         this.dQ().a(this, (byte)8);
      }

      if (!this.dQ().B) {
         this.a((aqt)this.dQ(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bE()) {
         this.cn = this.cm;
         if (this.gD()) {
            this.cm = this.cm + (1.0F - this.cm) * 0.4F;
         } else {
            this.cm = this.cm + (0.0F - this.cm) * 0.4F;
         }

         if (this.bh()) {
            this.co = true;
            if (this.cp && !this.dQ().B) {
               this.dQ().a(this, (byte)56);
               this.gE();
            }
         } else if ((this.co || this.cp) && this.cp) {
            if (this.cq == 0.0F) {
               this.a(avo.CS, this.fb(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               this.a(dxw.u);
            }

            this.cr = this.cq;
            this.cq += 0.05F;
            if (this.cr >= 2.0F) {
               this.co = false;
               this.cp = false;
               this.cr = 0.0F;
               this.cq = 0.0F;
            }

            if (this.cq > 0.4F) {
               float $$0 = (float)this.dx();
               int $$1 = (int)(ayn.a((this.cq - 0.4F) * (float) Math.PI) * 7.0F);
               eww $$2 = this.dt();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ah.i() * 2.0F - 1.0F) * this.dk() * 0.5F;
                  float $$5 = (this.ah.i() * 2.0F - 1.0F) * this.dk() * 0.5F;
                  this.dQ().a(lm.am, this.dv() + (double)$$4, (double)($$0 + 0.8F), this.dB() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gE() {
      this.cp = false;
      this.cq = 0.0F;
      this.cr = 0.0F;
   }

   @Override
   public void a(brj $$0) {
      this.co = false;
      this.cp = false;
      this.cr = 0.0F;
      this.cq = 0.0F;
      super.a($$0);
   }

   public boolean gz() {
      return this.co;
   }

   public float H(float $$0) {
      return Math.min(0.75F + ayn.i($$0, this.cr, this.cq) / 2.0F * 0.25F, 1.0F);
   }

   public float g(float $$0, float $$1) {
      float $$2 = (ayn.i($$0, this.cr, this.cq) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return ayn.a($$2 * (float) Math.PI) * ayn.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float I(float $$0) {
      return ayn.i($$0, this.cn, this.cm) * 0.15F * (float) Math.PI;
   }

   @Override
   public int aa() {
      return this.x() ? 20 : super.aa();
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dQ().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean d(bsx $$0) {
      return true;
   }

   @Override
   protected void f(brj $$0, float $$1) {
      if (!this.g($$0)) {
         super.f($$0, $$1);
      } else {
         cuo $$2 = this.fN();
         int $$3 = $$2.n();
         int $$4 = $$2.o();
         $$2.a(ayn.f($$1), this, bsx.g);
         if (bso.b.a($$3, $$4) != bso.b.a(this.fN())) {
            this.a(avo.CJ);
            if (this.dQ() instanceof aqt $$5) {
               $$5.a(new li(lm.S, cur.oq.w()), this.dv(), this.dx() + 1.0, this.dB(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean g(brj $$0) {
      return this.gC() && !$$0.a(awf.C);
   }

   @Override
   protected void t() {
      if (this.s()) {
         this.f(buu.s).a(40.0);
         this.u(40.0F);
      } else {
         this.f(buu.s).a(8.0);
      }
   }

   @Override
   protected void b(brj $$0, float $$1) {
      this.a($$0, $$1, new bsx[]{bsx.g});
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      cuj $$3 = $$2.g();
      if (!this.dQ().B || this.o_() && this.o($$2)) {
         if (this.s()) {
            if (this.o($$2) && this.ex() < this.eO()) {
               $$2.a(1, $$0);
               cpp $$5 = $$2.a(kq.v);
               float $$6 = $$5 != null ? (float)$$5.b() : 1.0F;
               this.c(2.0F * $$6);
               return bqq.a(this.dQ().x_());
            } else {
               if ($$3 instanceof cth $$7 && this.j($$0)) {
                  ctg $$8 = $$7.c();
                  if ($$8 != this.gB()) {
                     this.a($$8);
                     $$2.a(1, $$0);
                     return bqq.a;
                  }

                  return super.b($$0, $$1);
               }

               if ($$2.a(cur.or) && this.j($$0) && this.fN().e() && !this.o_()) {
                  this.m($$2.c(1));
                  $$2.a(1, $$0);
                  return bqq.a;
               } else if ($$2.a(cur.rV) && this.j($$0) && this.gC() && (!dac.a(this.fN(), dab.E) || $$0.f())) {
                  $$2.a(1, $$0, d($$1));
                  this.a(avo.az);
                  cuo $$9 = this.fN();
                  this.m(cuo.l);
                  this.b($$9);
                  return bqq.a;
               } else if (csf.h.a().d().get().a($$2) && this.x() && this.gC() && this.j($$0) && this.fN().m()) {
                  $$2.h(1);
                  this.a(avo.CL);
                  cuo $$10 = this.fN();
                  int $$11 = (int)((float)$$10.o() * 0.125F);
                  $$10.b(Math.max(0, $$10.n() - $$11));
                  return bqq.a;
               } else {
                  bqq $$12 = super.b($$0, $$1);
                  if (!$$12.a() && this.j($$0)) {
                     this.y(!this.gm());
                     this.bn = false;
                     this.bT.n();
                     this.h(null);
                     return bqq.b;
                  } else {
                     return $$12;
                  }
               }
            }
         } else if ($$2.a(cur.rz) && !this.Z_()) {
            $$2.a(1, $$0);
            this.h($$0);
            return bqq.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(cur.rz) && !this.s() && !this.Z_();
         return $$4 ? bqq.c : bqq.e;
      }
   }

   private void h(cmv $$0) {
      if (this.ah.a(3) == 0) {
         this.f($$0);
         this.bT.n();
         this.h(null);
         this.y(true);
         this.dQ().a(this, (byte)7);
      } else {
         this.dQ().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.cp = true;
         this.cq = 0.0F;
         this.cr = 0.0F;
      } else if ($$0 == 56) {
         this.gE();
      } else {
         super.b($$0);
      }
   }

   public float gA() {
      if (this.Z_()) {
         return 1.5393804F;
      } else if (this.s()) {
         float $$0 = this.eO();
         float $$1 = ($$0 - this.ex()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.ad);
   }

   @Override
   public int af() {
      return 8;
   }

   @Override
   public int a() {
      return this.ao.a(ch);
   }

   @Override
   public void a(int $$0) {
      this.ao.a(ch, $$0);
   }

   @Override
   public void c() {
      this.a(cs.a(this.ah));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ct;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ct = $$0;
   }

   public ctg gB() {
      return ctg.a(this.ao.a(cg));
   }

   public boolean gC() {
      return this.fN().a(cur.or);
   }

   private void a(ctg $$0) {
      this.ao.a(cg, $$0.a());
   }

   @Nullable
   public cgf b(aqt $$0, bsk $$1) {
      cgf $$2 = bsw.bs.a((dcu)$$0);
      if ($$2 != null && $$1 instanceof cgf $$3) {
         if (this.ah.h()) {
            $$2.i(this.gx());
         } else {
            $$2.i($$3.gx());
         }

         if (this.s()) {
            $$2.b(this.W_());
            $$2.b(true, true);
            if (this.ah.h()) {
               $$2.a(this.gB());
            } else {
               $$2.a($$3.gB());
            }
         }
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.ao.a(cf, $$0);
   }

   @Override
   public boolean a(cfc $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.s()) {
         return false;
      } else if (!($$0 instanceof cgf $$1)) {
         return false;
      } else if (!$$1.s()) {
         return false;
      } else {
         return $$1.x() ? false : this.gu() && $$1.gu();
      }
   }

   public boolean gD() {
      return this.ao.a(cf);
   }

   @Override
   public boolean a(btl $$0, btl $$1) {
      if ($$0 instanceof cjn || $$0 instanceof cjv || $$0 instanceof ciu) {
         return false;
      } else if ($$0 instanceof cgf $$2) {
         return !$$2.s() || $$2.P_() != $$1;
      } else {
         if ($$0 instanceof cmv $$3 && $$1 instanceof cmv $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof chg $$5 && $$5.gB()) {
            return false;
         }

         if ($$0 instanceof buj $$6 && $$6.s()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean a(cmv $$0) {
      return !this.Z_() && super.a($$0);
   }

   @Override
   public eww cN() {
      return new eww(0.0, (double)(0.6F * this.cM()), (double)(this.dk() * 0.4F));
   }

   public static boolean c(bsw<cgf> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.a_($$3.d()).a(awd.cf) && a($$1, $$3);
   }

   class a<T extends btl> extends bzr<T> {
      private final cgf j;

      public a(final cgf $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof chj ? !this.j.s() && this.a((chj)this.b) : false;
      }

      private boolean a(chj $$0) {
         return $$0.gw() >= cgf.this.ah.a(5);
      }

      @Override
      public void d() {
         cgf.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         cgf.this.h(null);
         super.a();
      }
   }

   public static class b extends bsk.a {
      public final jm<cgg> a;

      public b(jm<cgg> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
