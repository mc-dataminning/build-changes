import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgj extends bun implements btw, buq<ji<cgk>> {
   private static final akk<Boolean> cc = ako.a(cgj.class, akm.k);
   private static final akk<Integer> cd = ako.a(cgj.class, akm.b);
   private static final akk<Integer> ce = ako.a(cgj.class, akm.b);
   private static final akk<ji<cgk>> cf = ako.a(cgj.class, akm.y);
   public static final Predicate<btq> cb = $$0 -> {
      btb<?> $$1 = $$0.ak();
      return $$1 == btb.aJ || $$1 == btb.aG || $$1 == btb.Q;
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
   private static final bqg cp = azz.a(20, 39);
   @Nullable
   private UUID cq;

   public cgj(btb<? extends cgj> $$0, dbz $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(eon.f, -1.0F);
      this.a(eon.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cai(this));
      this.bS.a(1, new cgj.c(1.5));
      this.bS.a(2, new cbt(this));
      this.bS.a(3, new cgj.a<>(this, chn.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new cau(this, 0.4F));
      this.bS.a(5, new cay(this, 1.0, true));
      this.bS.a(6, new cam(this, 1.0, 10.0F, 2.0F, false));
      this.bS.a(7, new caa(this, 1.0));
      this.bS.a(8, new ccb(this, 1.0));
      this.bS.a(9, new bzw(this, 8.0F));
      this.bS.a(10, new caw(this, cmy.class, 8.0F));
      this.bS.a(10, new cbj(this));
      this.bT.a(1, new ccl(this));
      this.bT.a(2, new ccm(this));
      this.bT.a(3, new ccg(this).a());
      this.bT.a(4, new cch<>(this, cmy.class, 10, true, false, this::a_));
      this.bT.a(5, new cck<>(this, cfg.class, false, cb));
      this.bT.a(6, new cck<>(this, cgh.class, false, cgh.bY));
      this.bT.a(7, new cch<>(this, cjm.class, false));
      this.bT.a(8, new ccn<>(this, true));
   }

   public alf gw() {
      cgk $$0 = this.gx().a();
      if (this.s()) {
         return $$0.b();
      } else {
         return this.Z_() ? $$0.c() : $$0.a();
      }
   }

   public ji<cgk> gx() {
      return this.ao.a(cf);
   }

   @Override
   public void i(ji<cgk> $$0) {
      this.ao.a(cf, $$0);
   }

   public static bux.a gy() {
      return bts.A().a(buy.r, 0.3F).a(buy.q, 8.0).a(buy.c, 4.0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cf, this.dR().d(lq.m).g(cgl.a));
      $$0.a(cc, false);
      $$0.a(cd, ctj.o.a());
      $$0.a(ce, 0);
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.CP, 0.15F, 1.0F);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gB().a());
      $$0.a("variant", this.gx().e().orElse(cgl.a).a().toString());
      this.c($$0);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      Optional.ofNullable(alf.a($$0.l("variant"))).map($$0x -> ale.a(lq.m, $$0x)).flatMap($$0x -> this.dR().d(lq.m).b($$0x)).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(ctj.a($$0.h("CollarColor")));
      }

      this.a(this.dP(), $$0);
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      ji<dcy> $$4 = $$0.t(this.dp());
      ji<cgk> $$6;
      if ($$3 instanceof cgj.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cgl.a(this.dR(), $$4);
         $$3 = new cgj.b($$6);
      }

      this.i($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avz v() {
      if (this.Z_()) {
         return awa.CK;
      } else if (this.ah.a(3) == 0) {
         return this.s() && this.eA() < 20.0F ? awa.CQ : awa.CN;
      } else {
         return awa.CI;
      }
   }

   @Override
   protected avz d(bro $$0) {
      return this.h($$0) ? awa.CG : awa.CM;
   }

   @Override
   protected avz o_() {
      return awa.CJ;
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
         this.a((arf)this.dP(), true);
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
               this.a(awa.CO, this.fe(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               this.a(dww.u);
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
               int $$1 = (int)(ayz.a((this.cn - 0.4F) * (float) Math.PI) * 7.0F);
               evs $$2 = this.ds();

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
   public void a(bro $$0) {
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
      return Math.min(0.75F + ayz.i($$0, this.co, this.cn) / 2.0F * 0.25F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (ayz.i($$0, this.co, this.cn) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return ayz.a($$2 * (float) Math.PI) * ayz.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float H(float $$0) {
      return ayz.i($$0, this.ck, this.cj) * 0.15F * (float) Math.PI;
   }

   @Override
   public int aa() {
      return this.y() ? 20 : super.aa();
   }

   @Override
   public boolean a(bro $$0, float $$1) {
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
   protected void f(bro $$0, float $$1) {
      if (!this.h($$0)) {
         super.f($$0, $$1);
      } else {
         cuq $$2 = this.fR();
         int $$3 = $$2.n();
         int $$4 = $$2.o();
         $$2.a(ayz.f($$1), this, btc.g);
         if (bst.b.a($$3, $$4) != bst.b.a(this.fR())) {
            this.a(awa.CF);
            if (this.dP() instanceof arf $$5) {
               $$5.a(new le(li.S, cut.oq.w()), this.du(), this.dw() + 1.0, this.dA(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean h(bro $$0) {
      return this.gC() && !$$0.a(awr.D);
   }

   @Override
   public boolean C(bsv $$0) {
      boolean $$1 = $$0.a(this.dQ().b((btq)this), (float)((int)this.g(buy.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   protected void u() {
      if (this.s()) {
         this.f(buy.q).a(40.0);
         this.t(40.0F);
      } else {
         this.f(buy.q).a(8.0);
      }
   }

   @Override
   protected void b(bro $$0, float $$1) {
      this.a($$0, $$1, new btc[]{btc.g});
   }

   @Override
   public bqv b(cmy $$0, bqu $$1) {
      cuq $$2 = $$0.b($$1);
      cul $$3 = $$2.g();
      if (!this.dP().B || this.p_() && this.o($$2)) {
         if (this.s()) {
            if (this.o($$2) && this.eA() < this.eR()) {
               $$2.a(1, $$0);
               cps $$5 = $$2.a(km.v);
               float $$6 = $$5 != null ? (float)$$5.b() : 1.0F;
               this.c(2.0F * $$6);
               return bqv.a(this.dP().x_());
            } else {
               if ($$3 instanceof ctk $$7 && this.j($$0)) {
                  ctj $$8 = $$7.c();
                  if ($$8 != this.gB()) {
                     this.a($$8);
                     $$2.a(1, $$0);
                     return bqv.a;
                  }

                  return super.b($$0, $$1);
               }

               if ($$2.a(cut.or) && this.j($$0) && !this.gC() && !this.p_()) {
                  this.m($$2.c(1));
                  $$2.a(1, $$0);
                  return bqv.a;
               } else if ($$2.a(cut.rV) && this.j($$0) && this.gC() && (!dac.f(this.fR()) || $$0.f())) {
                  $$2.a(1, $$0, d($$1));
                  this.a(awa.az);
                  cuq $$9 = this.fR();
                  this.m(cuq.l);
                  this.b($$9);
                  return bqv.a;
               } else if (csh.h.a().d().get().a($$2) && this.y() && this.gC() && this.j($$0) && this.fR().m()) {
                  $$2.h(1);
                  this.a(awa.CH);
                  cuq $$10 = this.fR();
                  int $$11 = (int)((float)$$10.o() * 0.125F);
                  $$10.b(Math.max(0, $$10.n() - $$11));
                  return bqv.a;
               } else {
                  bqv $$12 = super.b($$0, $$1);
                  if (!$$12.a() && this.j($$0)) {
                     this.y(!this.gq());
                     this.bn = false;
                     this.bR.n();
                     this.h(null);
                     return bqv.b;
                  } else {
                     return $$12;
                  }
               }
            }
         } else if ($$2.a(cut.rz) && !this.Z_()) {
            $$2.a(1, $$0);
            this.h($$0);
            return bqv.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(cut.rz) && !this.s() && !this.Z_();
         return $$4 ? bqv.c : bqv.e;
      }
   }

   private void h(cmy $$0) {
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
   public boolean o(cuq $$0) {
      return $$0.a(awy.ad);
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

   public ctj gB() {
      return ctj.a(this.ao.a(cd));
   }

   public boolean gC() {
      return !this.fR().e();
   }

   private void a(ctj $$0) {
      this.ao.a(cd, $$0.a());
   }

   @Nullable
   public cgj b(arf $$0, bsp $$1) {
      cgj $$2 = btb.bs.a((dbz)$$0);
      if ($$2 != null && $$1 instanceof cgj $$3) {
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
   public boolean a(cfg $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.s()) {
         return false;
      } else if (!($$0 instanceof cgj $$1)) {
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
   public boolean a(btq $$0, btq $$1) {
      if ($$0 instanceof cjq || $$0 instanceof cjy || $$0 instanceof ciy) {
         return false;
      } else if ($$0 instanceof cgj $$2) {
         return !$$2.s() || $$2.P_() != $$1;
      } else {
         if ($$0 instanceof cmy $$3 && $$1 instanceof cmy $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof chk $$5 && $$5.gF()) {
            return false;
         }

         if ($$0 instanceof bun $$6 && $$6.s()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean a(cmy $$0) {
      return !this.Z_() && super.a($$0);
   }

   @Override
   public evs cM() {
      return new evs(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   public static boolean c(btb<cgj> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.cf) && a($$1, $$3);
   }

   class a<T extends btq> extends bzv<T> {
      private final cgj j;

      public a(final cgj $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof chn ? !this.j.s() && this.a((chn)this.b) : false;
      }

      private boolean a(chn $$0) {
         return $$0.gA() >= cgj.this.ah.a(5);
      }

      @Override
      public void c() {
         cgj.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         cgj.this.h(null);
         super.e();
      }
   }

   public static class b extends bsp.a {
      public final ji<cgk> a;

      public b(ji<cgk> $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class c extends cbh {
      public c(final double $$0) {
         super(cgj.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dE() || this.b.bQ();
      }
   }
}
