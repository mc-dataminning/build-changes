import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfh extends bul implements buo<ji<cfi>> {
   public static final double cb = 0.6;
   public static final double cc = 0.8;
   public static final double cd = 1.33;
   private static final akj<ji<cfi>> ce = akn.a(cfh.class, akl.x);
   private static final akj<Boolean> cf = akn.a(cfh.class, akl.k);
   private static final akj<Boolean> cg = akn.a(cfh.class, akl.k);
   private static final akj<Integer> ch = akn.a(cfh.class, akl.b);
   private static final ald<cfi> ci = cfi.b;
   @Nullable
   private cfh.a<cmw> cj;
   @Nullable
   private cbu ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;

   public cfh(bsz<? extends cfh> $$0, dbx $$1) {
      super($$0, $$1);
      this.gC();
   }

   public ale gw() {
      return this.gx().a().a();
   }

   @Override
   protected void z() {
      this.ck = new cfh.c(this, 0.6, $$0 -> $$0.a(awx.ae), true);
      this.bS.a(1, new cag(this));
      this.bS.a(1, new cbf(this, 1.5));
      this.bS.a(2, new cbr(this));
      this.bS.a(3, new cfh.b(this));
      this.bS.a(4, this.ck);
      this.bS.a(5, new bzz(this, 1.1, 8));
      this.bS.a(6, new cak(this, 1.0, 10.0F, 5.0F, false));
      this.bS.a(7, new caa(this, 0.8));
      this.bS.a(8, new cas(this, 0.3F));
      this.bS.a(9, new cbc(this));
      this.bS.a(10, new bzy(this, 0.8));
      this.bS.a(11, new cbz(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new cau(this, cmw.class, 10.0F));
      this.bT.a(1, new cci<>(this, cfy.class, false, null));
      this.bT.a(1, new cci<>(this, cgf.class, false, cgf.bY));
   }

   public ji<cfi> gx() {
      return this.ao.a(ce);
   }

   @Override
   public void i(ji<cfi> $$0) {
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

   public cth gz() {
      return cth.a(this.ao.a(ch));
   }

   private void a(cth $$0) {
      this.ao.a(ch, $$0.a());
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(ce, lp.ak.g(ci));
      $$0.a(cf, false);
      $$0.a(cg, false);
      $$0.a(ch, cth.o.a());
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("variant", this.gx().e().orElse(ci).a().toString());
      $$0.a("CollarColor", (byte)this.gz().a());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      Optional.ofNullable(ale.a($$0.l("variant"))).map($$0x -> ald.a(lq.l, $$0x)).flatMap(lp.ak::b).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(cth.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Z() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bua.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bua.a);
            this.h(true);
         } else {
            this.b(bua.a);
            this.h(false);
         }
      } else {
         this.b(bua.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected avy v() {
      if (this.s()) {
         if (this.gu()) {
            return avz.dX;
         } else {
            return this.ah.a(4) == 0 ? avz.dY : avz.dQ;
         }
      } else {
         return avz.dR;
      }
   }

   @Override
   public int P() {
      return 120;
   }

   public void gA() {
      this.b(avz.dU);
   }

   @Override
   protected avy d(brm $$0) {
      return avz.dW;
   }

   @Override
   protected avy o_() {
      return avz.dS;
   }

   public static buv.a gB() {
      return btq.A().a(buw.q, 10.0).a(buw.r, 0.3F).a(buw.c, 3.0);
   }

   @Override
   protected void a(cmw $$0, bqs $$1, cuo $$2) {
      if (this.o($$2)) {
         this.a(avz.dT, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gE() {
      return (float)this.g(buw.c);
   }

   @Override
   public boolean C(bst $$0) {
      return $$0.a(this.dQ().b((bto)this), this.gE());
   }

   @Override
   public void l() {
      super.l();
      if (this.ck != null && this.ck.i() && !this.s() && this.ai % 100 == 0) {
         this.a(avz.dV, 1.0F, 1.0F);
      }

      this.gF();
   }

   private void gF() {
      if ((this.gy() || this.gD()) && this.ai % 5 == 0) {
         this.a(avz.dX, 0.6F + 0.4F * (this.ah.i() - this.ah.i()), 1.0F);
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
      return ayy.i($$0, this.cm, this.cl);
   }

   public float H(float $$0) {
      return ayy.i($$0, this.co, this.cn);
   }

   public float I(float $$0) {
      return ayy.i($$0, this.cq, this.cp);
   }

   @Nullable
   public cfh b(are $$0, bsn $$1) {
      cfh $$2 = bsz.p.a((dbx)$$0);
      if ($$2 != null && $$1 instanceof cfh $$3) {
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
   public boolean a(cfe $$0) {
      if (!this.s()) {
         return false;
      } else {
         return !($$0 instanceof cfh $$1) ? false : $$1.s() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.aq() > 0.9F;
      axe<cfi> $$5 = $$4 ? awp.b : awp.a;
      lp.ak.a($$5, $$0.E_()).ifPresent(this::i);
      are $$6 = $$0.E();
      if ($$6.a().a(this.dp(), axa.o).b()) {
         this.i(lp.ak.g(cfi.k));
         this.fU();
      }

      return $$3;
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      cuj $$3 = $$2.g();
      if (this.s()) {
         if (this.j($$0)) {
            if ($$3 instanceof cti $$4) {
               cth $$5 = $$4.c();
               if ($$5 != this.gz()) {
                  if (!this.dP().x_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fU();
                  }

                  return bqt.a(this.dP().x_());
               }
            } else if (this.o($$2) && this.eA() < this.eR()) {
               if (!this.dP().x_()) {
                  this.a($$0, $$1, $$2);
                  cpq $$6 = $$2.a(km.v);
                  this.c($$6 != null ? (float)$$6.b() : 1.0F);
               }

               return bqt.a(this.dP().x_());
            }

            bqt $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gq());
               return bqt.a(this.dP().x_());
            }

            return $$7;
         }
      } else if (this.o($$2)) {
         if (!this.dP().x_()) {
            this.a($$0, $$1, $$2);
            this.h($$0);
            this.fU();
         }

         return bqt.a(this.dP().x_());
      }

      bqt $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fU();
      }

      return $$8;
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awx.ae);
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
         this.cj = new cfh.a<>(this, cmw.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cj);
      if (!this.s()) {
         this.bS.a(4, this.cj);
      }
   }

   private void h(cmw $$0) {
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

   static class a<T extends bto> extends bzt<T> {
      private final cfh i;

      public a(cfh $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsy.e::test);
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

   static class b extends cam {
      private final cfh a;
      @Nullable
      private cmw b;
      @Nullable
      private iz c;
      private int d;

      public b(cfh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.s()) {
            return false;
         } else if (this.a.gq()) {
            return false;
         } else {
            bto $$0 = this.a.P_();
            if ($$0 instanceof cmw) {
               this.b = (cmw)$$0;
               if (!$$0.fL()) {
                  return false;
               }

               if (this.a.g((bst)this.b) > 100.0) {
                  return false;
               }

               iz $$1 = this.b.dp();
               dsb $$2 = this.a.dP().a_($$1);
               if ($$2.a(awo.R)) {
                  this.c = $$2.d(der.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new iz($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cfh $$1 : this.a.dP().a(cfh.class, new evl(this.c).g(2.0))) {
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
         azg $$0 = this.a.el();
         iz.a $$1 = new iz.a();
         $$1.g(this.a.gd() ? this.a.gf().dp() : this.a.dp());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dp());
         eqm $$2 = this.a.dP().o().be().b(eqd.aG);
         eqk $$3 = new eqk.a((are)this.a.dP()).a(etd.f, this.a.dn()).a(etd.a, this.a).a(etc.j);

         for (cuo $$5 : $$2.a($$3)) {
            this.a
               .dP()
               .b(
                  new cjg(
                     this.a.dP(),
                     (double)$$1.u() - (double)ayy.a(this.a.aY * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)ayy.b(this.a.aY * (float) (Math.PI / 180.0)),
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
            if (this.a.g((bst)this.b) < 2.5) {
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

   static class c extends cbu {
      @Nullable
      private cmw c;
      private final cfh d;

      public c(cfh $$0, double $$1, Predicate<cuo> $$2, boolean $$3) {
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
