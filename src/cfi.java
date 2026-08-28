import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfi extends bum implements bup<ji<cfj>> {
   public static final double cb = 0.6;
   public static final double cc = 0.8;
   public static final double cd = 1.33;
   private static final akk<ji<cfj>> ce = ako.a(cfi.class, akm.x);
   private static final akk<Boolean> cf = ako.a(cfi.class, akm.k);
   private static final akk<Boolean> cg = ako.a(cfi.class, akm.k);
   private static final akk<Integer> ch = ako.a(cfi.class, akm.b);
   private static final ale<cfj> ci = cfj.b;
   @Nullable
   private cfi.a<cmx> cj;
   @Nullable
   private cbv ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;

   public cfi(bta<? extends cfi> $$0, dby $$1) {
      super($$0, $$1);
      this.gC();
   }

   public alf gw() {
      return this.gx().a().a();
   }

   @Override
   protected void z() {
      this.ck = new cfi.c(this, 0.6, $$0 -> $$0.a(awy.ae), true);
      this.bS.a(1, new cah(this));
      this.bS.a(1, new cbg(this, 1.5));
      this.bS.a(2, new cbs(this));
      this.bS.a(3, new cfi.b(this));
      this.bS.a(4, this.ck);
      this.bS.a(5, new caa(this, 1.1, 8));
      this.bS.a(6, new cal(this, 1.0, 10.0F, 5.0F, false));
      this.bS.a(7, new cab(this, 0.8));
      this.bS.a(8, new cat(this, 0.3F));
      this.bS.a(9, new cbd(this));
      this.bS.a(10, new bzz(this, 0.8));
      this.bS.a(11, new cca(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new cav(this, cmx.class, 10.0F));
      this.bT.a(1, new ccj<>(this, cfz.class, false, null));
      this.bT.a(1, new ccj<>(this, cgg.class, false, cgg.bY));
   }

   public ji<cfj> gx() {
      return this.ao.a(ce);
   }

   @Override
   public void i(ji<cfj> $$0) {
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

   public cti gz() {
      return cti.a(this.ao.a(ch));
   }

   private void a(cti $$0) {
      this.ao.a(ch, $$0.a());
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(ce, lp.ak.g(ci));
      $$0.a(cf, false);
      $$0.a(cg, false);
      $$0.a(ch, cti.o.a());
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
         this.a(cti.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Z() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bub.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bub.a);
            this.h(true);
         } else {
            this.b(bub.a);
            this.h(false);
         }
      } else {
         this.b(bub.a);
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
   protected avz d(brn $$0) {
      return awa.dW;
   }

   @Override
   protected avz o_() {
      return awa.dS;
   }

   public static buw.a gB() {
      return btr.A().a(bux.q, 10.0).a(bux.r, 0.3F).a(bux.c, 3.0);
   }

   @Override
   protected void a(cmx $$0, bqt $$1, cup $$2) {
      if (this.o($$2)) {
         this.a(awa.dT, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gE() {
      return (float)this.g(bux.c);
   }

   @Override
   public boolean C(bsu $$0) {
      return $$0.a(this.dQ().b((btp)this), this.gE());
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
   public cfi b(arf $$0, bso $$1) {
      cfi $$2 = bta.p.a((dby)$$0);
      if ($$2 != null && $$1 instanceof cfi $$3) {
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
   public boolean a(cff $$0) {
      if (!this.s()) {
         return false;
      } else {
         return !($$0 instanceof cfi $$1) ? false : $$1.s() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.aq() > 0.9F;
      axf<cfj> $$5 = $$4 ? awq.b : awq.a;
      lp.ak.a($$5, $$0.E_()).ifPresent(this::i);
      arf $$6 = $$0.E();
      if ($$6.a().a(this.dp(), axb.o).b()) {
         this.i(lp.ak.g(cfj.k));
         this.fU();
      }

      return $$3;
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      cup $$2 = $$0.b($$1);
      cuk $$3 = $$2.g();
      if (this.s()) {
         if (this.j($$0)) {
            if ($$3 instanceof ctj $$4) {
               cti $$5 = $$4.c();
               if ($$5 != this.gz()) {
                  if (!this.dP().x_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fU();
                  }

                  return bqu.a(this.dP().x_());
               }
            } else if (this.o($$2) && this.eA() < this.eR()) {
               if (!this.dP().x_()) {
                  this.a($$0, $$1, $$2);
                  cpr $$6 = $$2.a(km.v);
                  this.c($$6 != null ? (float)$$6.b() : 1.0F);
               }

               return bqu.a(this.dP().x_());
            }

            bqu $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gq());
               return bqu.a(this.dP().x_());
            }

            return $$7;
         }
      } else if (this.o($$2)) {
         if (!this.dP().x_()) {
            this.a($$0, $$1, $$2);
            this.h($$0);
            this.fU();
         }

         return bqu.a(this.dP().x_());
      }

      bqu $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fU();
      }

      return $$8;
   }

   @Override
   public boolean o(cup $$0) {
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
         this.cj = new cfi.a<>(this, cmx.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cj);
      if (!this.s()) {
         this.bS.a(4, this.cj);
      }
   }

   private void h(cmx $$0) {
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

   static class a<T extends btp> extends bzu<T> {
      private final cfi i;

      public a(cfi $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsz.e::test);
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

   static class b extends can {
      private final cfi a;
      @Nullable
      private cmx b;
      @Nullable
      private iz c;
      private int d;

      public b(cfi $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.s()) {
            return false;
         } else if (this.a.gq()) {
            return false;
         } else {
            btp $$0 = this.a.P_();
            if ($$0 instanceof cmx) {
               this.b = (cmx)$$0;
               if (!$$0.fL()) {
                  return false;
               }

               if (this.a.g((bsu)this.b) > 100.0) {
                  return false;
               }

               iz $$1 = this.b.dp();
               dsc $$2 = this.a.dP().a_($$1);
               if ($$2.a(awp.R)) {
                  this.c = $$2.d(des.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new iz($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cfi $$1 : this.a.dP().a(cfi.class, new evm(this.c).g(2.0))) {
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
         eqn $$2 = this.a.dP().o().be().b(eqe.aG);
         eql $$3 = new eql.a((arf)this.a.dP()).a(ete.f, this.a.dn()).a(ete.a, this.a).a(etd.j);

         for (cup $$5 : $$2.a($$3)) {
            this.a
               .dP()
               .b(
                  new cjh(
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
            if (this.a.g((bsu)this.b) < 2.5) {
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

   static class c extends cbv {
      @Nullable
      private cmx c;
      private final cfi d;

      public c(cfi $$0, double $$1, Predicate<cup> $$2, boolean $$3) {
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
