import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfk extends buo implements bur<ji<cfl>> {
   public static final double cb = 0.6;
   public static final double cc = 0.8;
   public static final double cd = 1.33;
   private static final akk<ji<cfl>> ce = ako.a(cfk.class, akm.x);
   private static final akk<Boolean> cf = ako.a(cfk.class, akm.k);
   private static final akk<Boolean> cg = ako.a(cfk.class, akm.k);
   private static final akk<Integer> ch = ako.a(cfk.class, akm.b);
   private static final ale<cfl> ci = cfl.b;
   @Nullable
   private cfk.a<cmz> cj;
   @Nullable
   private cbx ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;

   public cfk(btc<? extends cfk> $$0, dca $$1) {
      super($$0, $$1);
      this.gC();
   }

   public alf gw() {
      return this.gx().a().a();
   }

   @Override
   protected void z() {
      this.ck = new cfk.c(this, 0.6, $$0 -> $$0.a(awy.ae), true);
      this.bS.a(1, new caj(this));
      this.bS.a(1, new cbi(this, 1.5));
      this.bS.a(2, new cbu(this));
      this.bS.a(3, new cfk.b(this));
      this.bS.a(4, this.ck);
      this.bS.a(5, new cac(this, 1.1, 8));
      this.bS.a(6, new can(this, 1.0, 10.0F, 5.0F, false));
      this.bS.a(7, new cad(this, 0.8));
      this.bS.a(8, new cav(this, 0.3F));
      this.bS.a(9, new cbf(this));
      this.bS.a(10, new cab(this, 0.8));
      this.bS.a(11, new ccc(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new cax(this, cmz.class, 10.0F));
      this.bT.a(1, new ccl<>(this, cgb.class, false, null));
      this.bT.a(1, new ccl<>(this, cgi.class, false, cgi.bY));
   }

   public ji<cfl> gx() {
      return this.ao.a(ce);
   }

   @Override
   public void i(ji<cfl> $$0) {
      this.ao.a(ce, $$0);
   }

   public void z(boolean $$0) {
      this.ao.a(cf, $$0);
   }

   public boolean gy() {
      return this.ao.a(cf);
   }

   void A(boolean $$0) {
      this.ao.a(cg, $$0);
   }

   boolean gD() {
      return this.ao.a(cg);
   }

   public ctk gz() {
      return ctk.a(this.ao.a(ch));
   }

   private void a(ctk $$0) {
      this.ao.a(ch, $$0.a());
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(ce, lp.ak.g(ci));
      $$0.a(cf, false);
      $$0.a(cg, false);
      $$0.a(ch, ctk.o.a());
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("variant", this.gx().e().orElse(ci).a().toString());
      $$0.a("CollarColor", (byte)this.gz().a());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      Optional.ofNullable(alf.a($$0.l("variant"))).map($$0x -> ale.a(lq.l, $$0x)).flatMap(lp.ak::b).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(ctk.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Z() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bud.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bud.a);
            this.h(true);
         } else {
            this.b(bud.a);
            this.h(false);
         }
      } else {
         this.b(bud.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected avz v() {
      if (this.s()) {
         if (this.gu()) {
            return awa.dX;
         } else {
            return this.ah.a(4) == 0 ? awa.dY : awa.dQ;
         }
      } else {
         return awa.dR;
      }
   }

   @Override
   public int P() {
      return 120;
   }

   public void gA() {
      this.b(awa.dU);
   }

   @Override
   protected avz d(brp $$0) {
      return awa.dW;
   }

   @Override
   protected avz o_() {
      return awa.dS;
   }

   public static buy.a gB() {
      return btt.A().a(buz.q, 10.0).a(buz.r, 0.3F).a(buz.c, 3.0);
   }

   @Override
   protected void a(cmz $$0, bqv $$1, cur $$2) {
      if (this.o($$2)) {
         this.a(awa.dT, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gE() {
      return (float)this.g(buz.c);
   }

   @Override
   public boolean C(bsw $$0) {
      return $$0.a(this.dQ().b((btr)this), this.gE());
   }

   @Override
   public void l() {
      super.l();
      if (this.ck != null && this.ck.i() && !this.s() && this.ai % 100 == 0) {
         this.a(awa.dV, 1.0F, 1.0F);
      }

      this.gF();
   }

   private void gF() {
      if ((this.gy() || this.gD()) && this.ai % 5 == 0) {
         this.a(awa.dX, 0.6F + 0.4F * (this.ah.i() - this.ah.i()), 1.0F);
      }

      this.gG();
      this.gH();
   }

   private void gG() {
      this.cm = this.cl;
      this.co = this.cn;
      if (this.gy()) {
         this.cl = Math.min(1.0F, this.cl + 0.15F);
         this.cn = Math.min(1.0F, this.cn + 0.08F);
      } else {
         this.cl = Math.max(0.0F, this.cl - 0.22F);
         this.cn = Math.max(0.0F, this.cn - 0.13F);
      }
   }

   private void gH() {
      this.cq = this.cp;
      if (this.gD()) {
         this.cp = Math.min(1.0F, this.cp + 0.1F);
      } else {
         this.cp = Math.max(0.0F, this.cp - 0.13F);
      }
   }

   public float G(float $$0) {
      return ayz.i($$0, this.cm, this.cl);
   }

   public float H(float $$0) {
      return ayz.i($$0, this.co, this.cn);
   }

   public float I(float $$0) {
      return ayz.i($$0, this.cq, this.cp);
   }

   @Nullable
   public cfk b(arf $$0, bsq $$1) {
      cfk $$2 = btc.p.a((dca)$$0);
      if ($$2 != null && $$1 instanceof cfk $$3) {
         if (this.ah.h()) {
            $$2.i(this.gx());
         } else {
            $$2.i($$3.gx());
         }

         if (this.s()) {
            $$2.b(this.W_());
            $$2.b(true, true);
            if (this.ah.h()) {
               $$2.a(this.gz());
            } else {
               $$2.a($$3.gz());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cfh $$0) {
      if (!this.s()) {
         return false;
      } else {
         return !($$0 instanceof cfk $$1) ? false : $$1.s() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.aq() > 0.9F;
      axf<cfl> $$5 = $$4 ? awq.b : awq.a;
      lp.ak.a($$5, $$0.E_()).ifPresent(this::i);
      arf $$6 = $$0.E();
      if ($$6.a().a(this.dp(), axb.o).b()) {
         this.i(lp.ak.g(cfl.k));
         this.fU();
      }

      return $$3;
   }

   @Override
   public bqw b(cmz $$0, bqv $$1) {
      cur $$2 = $$0.b($$1);
      cum $$3 = $$2.g();
      if (this.s()) {
         if (this.j($$0)) {
            if ($$3 instanceof ctl $$4) {
               ctk $$5 = $$4.c();
               if ($$5 != this.gz()) {
                  if (!this.dP().x_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fU();
                  }

                  return bqw.a(this.dP().x_());
               }
            } else if (this.o($$2) && this.eA() < this.eR()) {
               if (!this.dP().x_()) {
                  this.a($$0, $$1, $$2);
                  cpt $$6 = $$2.a(km.v);
                  this.c($$6 != null ? (float)$$6.b() : 1.0F);
               }

               return bqw.a(this.dP().x_());
            }

            bqw $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gq());
               return bqw.a(this.dP().x_());
            }

            return $$7;
         }
      } else if (this.o($$2)) {
         if (!this.dP().x_()) {
            this.a($$0, $$1, $$2);
            this.h($$0);
            this.fU();
         }

         return bqw.a(this.dP().x_());
      }

      bqw $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fU();
      }

      return $$8;
   }

   @Override
   public boolean o(cur $$0) {
      return $$0.a(awy.ae);
   }

   @Override
   public boolean h(double $$0) {
      return !this.s() && this.ai > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gC();
   }

   protected void gC() {
      if (this.cj == null) {
         this.cj = new cfk.a<>(this, cmz.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cj);
      if (!this.s()) {
         this.bS.a(4, this.cj);
      }
   }

   private void h(cmz $$0) {
      if (this.ah.a(3) == 0) {
         this.f($$0);
         this.y(true);
         this.dP().a(this, (byte)7);
      } else {
         this.dP().a(this, (byte)6);
      }
   }

   @Override
   public boolean bW() {
      return this.ca() || super.bW();
   }

   static class a<T extends btr> extends bzw<T> {
      private final cfk i;

      public a(cfk $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, btb.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.s() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.s() && super.b();
      }
   }

   static class b extends cap {
      private final cfk a;
      @Nullable
      private cmz b;
      @Nullable
      private iz c;
      private int d;

      public b(cfk $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.s()) {
            return false;
         } else if (this.a.gq()) {
            return false;
         } else {
            btr $$0 = this.a.P_();
            if ($$0 instanceof cmz) {
               this.b = (cmz)$$0;
               if (!$$0.fL()) {
                  return false;
               }

               if (this.a.g((bsw)this.b) > 100.0) {
                  return false;
               }

               iz $$1 = this.b.dp();
               dse $$2 = this.a.dP().a_($$1);
               if ($$2.a(awp.R)) {
                  this.c = $$2.d(deu.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new iz($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cfk $$1 : this.a.dP().a(cfk.class, new evo(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gy() || $$1.gD())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.s() && !this.a.gq() && this.b != null && this.b.fL() && this.c != null && !this.h();
      }

      @Override
      public void c() {
         if (this.c != null) {
            this.a.x(false);
            this.a.K().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void d() {
         this.a.z(false);
         float $$0 = this.a.dP().f(1.0F);
         if (this.b.gg() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dP().E_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.K().n();
      }

      private void i() {
         azh $$0 = this.a.el();
         iz.a $$1 = new iz.a();
         $$1.g(this.a.gd() ? this.a.gf().dp() : this.a.dp());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dp());
         eqp $$2 = this.a.dP().o().be().b(eqg.aG);
         eqn $$3 = new eqn.a((arf)this.a.dP()).a(etg.f, this.a.dn()).a(etg.a, this.a).a(etf.j);

         for (cur $$5 : $$2.a($$3)) {
            this.a
               .dP()
               .b(
                  new cjj(
                     this.a.dP(),
                     (double)$$1.u() - (double)ayz.a(this.a.aY * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)ayz.b(this.a.aY * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void e() {
         if (this.b != null && this.c != null) {
            this.a.x(false);
            this.a.K().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g((bsw)this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.z(true);
                  this.a.A(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.A(true);
               }
            } else {
               this.a.z(false);
            }
         }
      }
   }

   static class c extends cbx {
      @Nullable
      private cmz c;
      private final cfk d;

      public c(cfk $$0, double $$1, Predicate<cur> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.el().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.el().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.s();
      }
   }
}
