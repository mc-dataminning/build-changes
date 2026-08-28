import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgg extends buk implements btt, bun<ji<cgh>> {
   private static final akj<Boolean> cc = akn.a(cgg.class, akl.k);
   private static final akj<Integer> cd = akn.a(cgg.class, akl.b);
   private static final akj<Integer> ce = akn.a(cgg.class, akl.b);
   private static final akj<ji<cgh>> cf = akn.a(cgg.class, akl.y);
   public static final Predicate<btn> cb = $$0 -> {
      bsy<?> $$1 = $$0.ak();
      return $$1 == bsy.aJ || $$1 == bsy.aG || $$1 == bsy.Q;
   };
   private static final float cg = 8.0F;
   private static final float ch = 40.0F;
   private static final float ci = 0.125F;
   private float cj;
   private float ck;
   private boolean cl;
   private boolean cm;
   private float cn;
   private float co;
   private static final bqd cp = azx.a(20, 39);
   @Nullable
   private UUID cq;

   public cgg(bsy<? extends cgg> $$0, dbw $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(eok.f, -1.0F);
      this.a(eok.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bS.a(1, new caf(this));
      this.bS.a(1, new cgg.c(1.5));
      this.bS.a(2, new cbq(this));
      this.bS.a(3, new cgg.a<>(this, chk.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new car(this, 0.4F));
      this.bS.a(5, new cav(this, 1.0, true));
      this.bS.a(6, new caj(this, 1.0, 10.0F, 2.0F, false));
      this.bS.a(7, new bzx(this, 1.0));
      this.bS.a(8, new cby(this, 1.0));
      this.bS.a(9, new bzt(this, 8.0F));
      this.bS.a(10, new cat(this, cmv.class, 8.0F));
      this.bS.a(10, new cbg(this));
      this.bT.a(1, new cci(this));
      this.bT.a(2, new ccj(this));
      this.bT.a(3, new ccd(this).a());
      this.bT.a(4, new cce<>(this, cmv.class, 10, true, false, this::a_));
      this.bT.a(5, new cch<>(this, cfd.class, false, cb));
      this.bT.a(6, new cch<>(this, cge.class, false, cge.bY));
      this.bT.a(7, new cce<>(this, cjj.class, false));
      this.bT.a(8, new cck<>(this, true));
   }

   public ale gw() {
      cgh $$0 = this.gx().a();
      if (this.s()) {
         return $$0.b();
      } else {
         return this.Z_() ? $$0.c() : $$0.a();
      }
   }

   public ji<cgh> gx() {
      return this.ao.a(cf);
   }

   @Override
   public void i(ji<cgh> $$0) {
      this.ao.a(cf, $$0);
   }

   public static buu.a gy() {
      return btp.A().a(buv.r, 0.3F).a(buv.q, 8.0).a(buv.c, 4.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cf, this.dR().d(lq.m).g(cgi.a));
      $$0.a(cc, false);
      $$0.a(cd, ctg.o.a());
      $$0.a(ce, 0);
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.CP, 0.15F, 1.0F);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gB().a());
      $$0.a("variant", this.gx().e().orElse(cgi.a).a().toString());
      this.c($$0);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      Optional.ofNullable(ale.a($$0.l("variant"))).map($$0x -> ald.a(lq.m, $$0x)).flatMap($$0x -> this.dR().d(lq.m).b($$0x)).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(ctg.a($$0.h("CollarColor")));
      }

      this.a(this.dP(), $$0);
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      ji<dcv> $$4 = $$0.t(this.dp());
      ji<cgh> $$6;
      if ($$3 instanceof cgg.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cgi.a(this.dR(), $$4);
         $$3 = new cgg.b($$6);
      }

      this.i($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avy v() {
      if (this.Z_()) {
         return avz.CK;
      } else if (this.ah.a(3) == 0) {
         return this.s() && this.eA() < 20.0F ? avz.CQ : avz.CN;
      } else {
         return avz.CI;
      }
   }

   @Override
   protected avy d(brl $$0) {
      return this.h($$0) ? avz.CG : avz.CM;
   }

   @Override
   protected avy o_() {
      return avz.CJ;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B && this.cl && !this.cm && !this.gm() && this.aE()) {
         this.cm = true;
         this.cn = 0.0F;
         this.co = 0.0F;
         this.dP().a(this, (byte)8);
      }

      if (!this.dP().B) {
         this.a((are)this.dP(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bD()) {
         this.ck = this.cj;
         if (this.gD()) {
            this.cj = this.cj + (1.0F - this.cj) * 0.4F;
         } else {
            this.cj = this.cj + (0.0F - this.cj) * 0.4F;
         }

         if (this.bg()) {
            this.cl = true;
            if (this.cm && !this.dP().B) {
               this.dP().a(this, (byte)56);
               this.gE();
            }
         } else if ((this.cl || this.cm) && this.cm) {
            if (this.cn == 0.0F) {
               this.a(avz.CO, this.fe(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               this.a(dwt.u);
            }

            this.co = this.cn;
            this.cn += 0.05F;
            if (this.co >= 2.0F) {
               this.cl = false;
               this.cm = false;
               this.co = 0.0F;
               this.cn = 0.0F;
            }

            if (this.cn > 0.4F) {
               float $$0 = (float)this.dw();
               int $$1 = (int)(ayx.a((this.cn - 0.4F) * (float) Math.PI) * 7.0F);
               evp $$2 = this.ds();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ah.i() * 2.0F - 1.0F) * this.dj() * 0.5F;
                  float $$5 = (this.ah.i() * 2.0F - 1.0F) * this.dj() * 0.5F;
                  this.dP().a(li.am, this.du() + (double)$$4, (double)($$0 + 0.8F), this.dA() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gE() {
      this.cm = false;
      this.cn = 0.0F;
      this.co = 0.0F;
   }

   @Override
   public void a(brl $$0) {
      this.cl = false;
      this.cm = false;
      this.co = 0.0F;
      this.cn = 0.0F;
      super.a($$0);
   }

   public boolean gz() {
      return this.cl;
   }

   public float G(float $$0) {
      return Math.min(0.75F + ayx.i($$0, this.co, this.cn) / 2.0F * 0.25F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (ayx.i($$0, this.co, this.cn) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return ayx.a($$2 * (float) Math.PI) * ayx.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float H(float $$0) {
      return ayx.i($$0, this.ck, this.cj) * 0.15F * (float) Math.PI;
   }

   @Override
   public int aa() {
      return this.y() ? 20 : super.aa();
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dP().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void f(brl $$0, float $$1) {
      if (!this.h($$0)) {
         super.f($$0, $$1);
      } else {
         cun $$2 = this.fR();
         int $$3 = $$2.n();
         int $$4 = $$2.o();
         $$2.a(ayx.f($$1), this, bsz.g);
         if (bsq.b.a($$3, $$4) != bsq.b.a(this.fR())) {
            this.a(avz.CF);
            if (this.dP() instanceof are $$5) {
               $$5.a(new le(li.S, cuq.oq.w()), this.du(), this.dw() + 1.0, this.dA(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean h(brl $$0) {
      return this.gC() && !$$0.a(awq.D);
   }

   @Override
   public boolean C(bss $$0) {
      boolean $$1 = $$0.a(this.dQ().b((btn)this), (float)((int)this.g(buv.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   protected void u() {
      if (this.s()) {
         this.f(buv.q).a(40.0);
         this.t(40.0F);
      } else {
         this.f(buv.q).a(8.0);
      }
   }

   @Override
   protected void b(brl $$0, float $$1) {
      this.a($$0, $$1, new bsz[]{bsz.g});
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      cun $$2 = $$0.b($$1);
      cui $$3 = $$2.g();
      if (!this.dP().B || this.p_() && this.o($$2)) {
         if (this.s()) {
            if (this.o($$2) && this.eA() < this.eR()) {
               $$2.a(1, $$0);
               cpp $$5 = $$2.a(km.u);
               float $$6 = $$5 != null ? (float)$$5.b() : 1.0F;
               this.c(2.0F * $$6);
               return bqs.a(this.dP().x_());
            } else {
               if ($$3 instanceof cth $$7 && this.j($$0)) {
                  ctg $$8 = $$7.c();
                  if ($$8 != this.gB()) {
                     this.a($$8);
                     $$2.a(1, $$0);
                     return bqs.a;
                  }

                  return super.b($$0, $$1);
               }

               if ($$2.a(cuq.or) && this.j($$0) && !this.gC() && !this.p_()) {
                  this.m($$2.c(1));
                  $$2.a(1, $$0);
                  return bqs.a;
               } else if ($$2.a(cuq.rV) && this.j($$0) && this.gC() && (!czz.f(this.fR()) || $$0.f())) {
                  $$2.a(1, $$0, d($$1));
                  this.a(avz.az);
                  cun $$9 = this.fR();
                  this.m(cun.l);
                  this.b($$9);
                  return bqs.a;
               } else if (cse.h.a().d().get().a($$2) && this.y() && this.gC() && this.j($$0) && this.fR().m()) {
                  $$2.h(1);
                  this.a(avz.CH);
                  cun $$10 = this.fR();
                  int $$11 = (int)((float)$$10.o() * 0.125F);
                  $$10.b(Math.max(0, $$10.n() - $$11));
                  return bqs.a;
               } else {
                  bqs $$12 = super.b($$0, $$1);
                  if (!$$12.a() && this.j($$0)) {
                     this.y(!this.gq());
                     this.bn = false;
                     this.bR.n();
                     this.h(null);
                     return bqs.b;
                  } else {
                     return $$12;
                  }
               }
            }
         } else if ($$2.a(cuq.rz) && !this.Z_()) {
            $$2.a(1, $$0);
            this.h($$0);
            return bqs.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(cuq.rz) && !this.s() && !this.Z_();
         return $$4 ? bqs.c : bqs.e;
      }
   }

   private void h(cmv $$0) {
      if (this.ah.a(3) == 0) {
         this.f($$0);
         this.bR.n();
         this.h(null);
         this.y(true);
         this.dP().a(this, (byte)7);
      } else {
         this.dP().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.cm = true;
         this.cn = 0.0F;
         this.co = 0.0F;
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
         float $$0 = this.eR();
         float $$1 = ($$0 - this.eA()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean o(cun $$0) {
      return $$0.a(awx.ad);
   }

   @Override
   public int fQ() {
      return 8;
   }

   @Override
   public int a() {
      return this.ao.a(ce);
   }

   @Override
   public void a(int $$0) {
      this.ao.a(ce, $$0);
   }

   @Override
   public void c() {
      this.a(cp.a(this.ah));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cq;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cq = $$0;
   }

   public ctg gB() {
      return ctg.a(this.ao.a(cd));
   }

   public boolean gC() {
      return !this.fR().e();
   }

   private void a(ctg $$0) {
      this.ao.a(cd, $$0.a());
   }

   @Nullable
   public cgg b(are $$0, bsm $$1) {
      cgg $$2 = bsy.bs.a((dbw)$$0);
      if ($$2 != null && $$1 instanceof cgg $$3) {
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
      this.ao.a(cc, $$0);
   }

   @Override
   public boolean a(cfd $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.s()) {
         return false;
      } else if (!($$0 instanceof cgg $$1)) {
         return false;
      } else if (!$$1.s()) {
         return false;
      } else {
         return $$1.y() ? false : this.gu() && $$1.gu();
      }
   }

   public boolean gD() {
      return this.ao.a(cc);
   }

   @Override
   public boolean a(btn $$0, btn $$1) {
      if ($$0 instanceof cjn || $$0 instanceof cjv || $$0 instanceof civ) {
         return false;
      } else if ($$0 instanceof cgg $$2) {
         return !$$2.s() || $$2.P_() != $$1;
      } else {
         if ($$0 instanceof cmv $$3 && $$1 instanceof cmv $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof chh $$5 && $$5.gF()) {
            return false;
         }

         if ($$0 instanceof buk $$6 && $$6.s()) {
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
   public evp cM() {
      return new evp(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   public static boolean c(bsy<cgg> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      return $$1.a_($$3.d()).a(awo.cf) && a($$1, $$3);
   }

   class a<T extends btn> extends bzs<T> {
      private final cgg j;

      public a(final cgg $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof chk ? !this.j.s() && this.a((chk)this.b) : false;
      }

      private boolean a(chk $$0) {
         return $$0.gA() >= cgg.this.ah.a(5);
      }

      @Override
      public void c() {
         cgg.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         cgg.this.h(null);
         super.e();
      }
   }

   public static class b extends bsm.a {
      public final ji<cgh> a;

      public b(ji<cgh> $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class c extends cbe {
      public c(final double $$0) {
         super(cgg.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dE() || this.b.bQ();
      }
   }
}
