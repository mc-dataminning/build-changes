import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgd extends buh implements btq, buk<ji<cge>> {
   private static final akg<Boolean> cc = akk.a(cgd.class, aki.k);
   private static final akg<Integer> cd = akk.a(cgd.class, aki.b);
   private static final akg<Integer> ce = akk.a(cgd.class, aki.b);
   private static final akg<ji<cge>> cf = akk.a(cgd.class, aki.y);
   public static final Predicate<btk> cb = $$0 -> {
      bsv<?> $$1 = $$0.ak();
      return $$1 == bsv.aJ || $$1 == bsv.aG || $$1 == bsv.Q;
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
   private static final bqa cp = azu.a(20, 39);
   @Nullable
   private UUID cq;

   public cgd(bsv<? extends cgd> $$0, dbt $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(eoh.f, -1.0F);
      this.a(eoh.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cac(this));
      this.bS.a(1, new cgd.c(1.5));
      this.bS.a(2, new cbn(this));
      this.bS.a(3, new cgd.a<>(this, chh.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new cao(this, 0.4F));
      this.bS.a(5, new cas(this, 1.0, true));
      this.bS.a(6, new cag(this, 1.0, 10.0F, 2.0F, false));
      this.bS.a(7, new bzu(this, 1.0));
      this.bS.a(8, new cbv(this, 1.0));
      this.bS.a(9, new bzq(this, 8.0F));
      this.bS.a(10, new caq(this, cms.class, 8.0F));
      this.bS.a(10, new cbd(this));
      this.bT.a(1, new ccf(this));
      this.bT.a(2, new ccg(this));
      this.bT.a(3, new cca(this).a());
      this.bT.a(4, new ccb<>(this, cms.class, 10, true, false, this::a_));
      this.bT.a(5, new cce<>(this, cfa.class, false, cb));
      this.bT.a(6, new cce<>(this, cgb.class, false, cgb.bY));
      this.bT.a(7, new ccb<>(this, cjg.class, false));
      this.bT.a(8, new cch<>(this, true));
   }

   public alb gw() {
      cge $$0 = this.gx().a();
      if (this.s()) {
         return $$0.b();
      } else {
         return this.Z_() ? $$0.c() : $$0.a();
      }
   }

   public ji<cge> gx() {
      return this.ao.a(cf);
   }

   @Override
   public void i(ji<cge> $$0) {
      this.ao.a(cf, $$0);
   }

   public static bur.a gy() {
      return btm.A().a(bus.r, 0.3F).a(bus.q, 8.0).a(bus.c, 4.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cf, this.dR().d(lq.m).g(cgf.a));
      $$0.a(cc, false);
      $$0.a(cd, ctd.o.a());
      $$0.a(ce, 0);
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.CP, 0.15F, 1.0F);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gB().a());
      $$0.a("variant", this.gx().e().orElse(cgf.a).a().toString());
      this.c($$0);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      Optional.ofNullable(alb.a($$0.l("variant"))).map($$0x -> ala.a(lq.m, $$0x)).flatMap($$0x -> this.dR().d(lq.m).b($$0x)).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(ctd.a($$0.h("CollarColor")));
      }

      this.a(this.dP(), $$0);
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      ji<dcs> $$4 = $$0.t(this.dp());
      ji<cge> $$6;
      if ($$3 instanceof cgd.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cgf.a(this.dR(), $$4);
         $$3 = new cgd.b($$6);
      }

      this.i($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avv v() {
      if (this.Z_()) {
         return avw.CK;
      } else if (this.ah.a(3) == 0) {
         return this.s() && this.eA() < 20.0F ? avw.CQ : avw.CN;
      } else {
         return avw.CI;
      }
   }

   @Override
   protected avv d(bri $$0) {
      return this.h($$0) ? avw.CG : avw.CM;
   }

   @Override
   protected avv o_() {
      return avw.CJ;
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
         this.a((arb)this.dP(), true);
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
               this.a(avw.CO, this.fe(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               this.a(dwq.u);
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
               int $$1 = (int)(ayu.a((this.cn - 0.4F) * (float) Math.PI) * 7.0F);
               evm $$2 = this.ds();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ah.i() * 2.0F - 1.0F) * this.dj() * 0.5F;
                  float $$5 = (this.ah.i() * 2.0F - 1.0F) * this.dj() * 0.5F;
                  this.dP().a(lj.am, this.du() + (double)$$4, (double)($$0 + 0.8F), this.dA() + (double)$$5, $$2.c, $$2.d, $$2.e);
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
   public void a(bri $$0) {
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
      return Math.min(0.5F + ayu.i($$0, this.co, this.cn) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (ayu.i($$0, this.co, this.cn) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return ayu.a($$2 * (float) Math.PI) * ayu.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float H(float $$0) {
      return ayu.i($$0, this.ck, this.cj) * 0.15F * (float) Math.PI;
   }

   @Override
   public int aa() {
      return this.y() ? 20 : super.aa();
   }

   @Override
   public boolean a(bri $$0, float $$1) {
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
   protected void f(bri $$0, float $$1) {
      if (!this.h($$0)) {
         super.f($$0, $$1);
      } else {
         cuk $$2 = this.fR();
         int $$3 = $$2.n();
         int $$4 = $$2.o();
         $$2.a(ayu.f($$1), this, bsw.g);
         if (bsn.b.a($$3, $$4) != bsn.b.a(this.fR())) {
            this.a(avw.CF);
            if (this.dP() instanceof arb $$5) {
               $$5.a(new lf(lj.S, cun.oq.w()), this.du(), this.dw() + 1.0, this.dA(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean h(bri $$0) {
      return this.gC() && !$$0.a(awn.D);
   }

   @Override
   public boolean C(bsp $$0) {
      boolean $$1 = $$0.a(this.dQ().b((btk)this), (float)((int)this.g(bus.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   protected void u() {
      if (this.s()) {
         this.f(bus.q).a(40.0);
         this.t(40.0F);
      } else {
         this.f(bus.q).a(8.0);
      }
   }

   @Override
   protected void b(bri $$0, float $$1) {
      this.a($$0, $$1, new bsw[]{bsw.g});
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      cuf $$3 = $$2.g();
      if (!this.dP().B || this.p_() && this.o($$2)) {
         if (this.s()) {
            if (this.o($$2) && this.eA() < this.eR()) {
               $$2.a(1, $$0);
               cpm $$5 = $$2.a(km.u);
               float $$6 = $$5 != null ? (float)$$5.b() : 1.0F;
               this.c(2.0F * $$6);
               return bqp.a(this.dP().x_());
            } else {
               if ($$3 instanceof cte $$7 && this.j($$0)) {
                  ctd $$8 = $$7.c();
                  if ($$8 != this.gB()) {
                     this.a($$8);
                     $$2.a(1, $$0);
                     return bqp.a;
                  }

                  return super.b($$0, $$1);
               }

               if ($$2.a(cun.or) && this.j($$0) && !this.gC() && !this.p_()) {
                  this.m($$2.c(1));
                  $$2.a(1, $$0);
                  return bqp.a;
               } else if ($$2.a(cun.rV) && this.j($$0) && this.gC() && !czw.f(this.fR())) {
                  $$2.a(1, $$0, d($$1));
                  this.a(avw.az);
                  cuk $$9 = this.fR();
                  this.m(cuk.l);
                  this.b($$9);
                  return bqp.a;
               } else if (csb.h.a().d().get().a($$2) && this.y() && this.gC() && this.j($$0) && this.fR().m()) {
                  $$2.h(1);
                  this.a(avw.CH);
                  cuk $$10 = this.fR();
                  int $$11 = (int)((float)$$10.o() * 0.125F);
                  $$10.b(Math.max(0, $$10.n() - $$11));
                  return bqp.a;
               } else {
                  bqp $$12 = super.b($$0, $$1);
                  if (!$$12.a() && this.j($$0)) {
                     this.y(!this.gq());
                     this.bn = false;
                     this.bR.n();
                     this.h(null);
                     return bqp.b;
                  } else {
                     return $$12;
                  }
               }
            }
         } else if ($$2.a(cun.rz) && !this.Z_()) {
            $$2.a(1, $$0);
            this.h($$0);
            return bqp.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(cun.rz) && !this.s() && !this.Z_();
         return $$4 ? bqp.c : bqp.e;
      }
   }

   private void h(cms $$0) {
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
   public boolean o(cuk $$0) {
      return $$0.a(awu.ad);
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

   public ctd gB() {
      return ctd.a(this.ao.a(cd));
   }

   public boolean gC() {
      return !this.fR().e();
   }

   private void a(ctd $$0) {
      this.ao.a(cd, $$0.a());
   }

   @Nullable
   public cgd b(arb $$0, bsj $$1) {
      cgd $$2 = bsv.bs.a((dbt)$$0);
      if ($$2 != null && $$1 instanceof cgd $$3) {
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
   public boolean a(cfa $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.s()) {
         return false;
      } else if (!($$0 instanceof cgd $$1)) {
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
   public boolean a(btk $$0, btk $$1) {
      if ($$0 instanceof cjk || $$0 instanceof cjs || $$0 instanceof cis) {
         return false;
      } else if ($$0 instanceof cgd $$2) {
         return !$$2.s() || $$2.P_() != $$1;
      } else {
         if ($$0 instanceof cms $$3 && $$1 instanceof cms $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof che $$5 && $$5.gF()) {
            return false;
         }

         if ($$0 instanceof buh $$6 && $$6.s()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean a(cms $$0) {
      return !this.Z_() && super.a($$0);
   }

   @Override
   public evm cM() {
      return new evm(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   public static boolean c(bsv<cgd> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return $$1.a_($$3.d()).a(awl.cf) && a($$1, $$3);
   }

   class a<T extends btk> extends bzp<T> {
      private final cgd j;

      public a(final cgd $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof chh ? !this.j.s() && this.a((chh)this.b) : false;
      }

      private boolean a(chh $$0) {
         return $$0.gA() >= cgd.this.ah.a(5);
      }

      @Override
      public void c() {
         cgd.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         cgd.this.h(null);
         super.e();
      }
   }

   public static class b extends bsj.a {
      public final ji<cge> a;

      public b(ji<cge> $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class c extends cbb {
      public c(final double $$0) {
         super(cgd.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dE() || this.b.bQ();
      }
   }
}
