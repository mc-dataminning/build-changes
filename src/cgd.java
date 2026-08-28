import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgd extends bvg implements bvj<jn<cge>> {
   public static final double cc = 0.6;
   public static final double cd = 0.8;
   public static final double ce = 1.33;
   private static final akg<jn<cge>> cf = akk.a(cgd.class, aki.x);
   private static final akg<Boolean> cg = akk.a(cgd.class, aki.k);
   private static final akg<Boolean> ch = akk.a(cgd.class, aki.k);
   private static final akg<Integer> ci = akk.a(cgd.class, aki.b);
   private static final alb<cge> cj = cge.c;
   @Nullable
   private cgd.a<cnu> ck;
   @Nullable
   private ccp cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private boolean cq;
   private float cr;
   private float cs;

   public cgd(btv<? extends cgd> $$0, deg $$1) {
      super($$0, $$1);
      this.gH();
   }

   @Override
   protected void D() {
      this.cl = new cgd.c(this, 0.6, $$0 -> $$0.a(axc.ae), true);
      this.bS.a(1, new cbb(this));
      this.bS.a(1, new bvg.a(1.5));
      this.bS.a(2, new ccm(this));
      this.bS.a(3, new cgd.b(this));
      this.bS.a(4, this.cl);
      this.bS.a(5, new cau(this, 1.1, 8));
      this.bS.a(6, new cbf(this, 1.0, 10.0F, 5.0F));
      this.bS.a(7, new cav(this, 0.8));
      this.bS.a(8, new cbn(this, 0.3F));
      this.bS.a(9, new cbx(this));
      this.bS.a(10, new cat(this, 0.8));
      this.bS.a(11, new ccu(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new cbp(this, cnu.class, 10.0F));
      this.bT.a(1, new cdd<>(this, cgu.class, false, null));
      this.bT.a(1, new cdd<>(this, chb.class, false, chb.bY));
   }

   public jn<cge> gB() {
      return this.am.a(cf);
   }

   public void j(jn<cge> $$0) {
      this.am.a(cf, $$0);
   }

   public void A(boolean $$0) {
      this.am.a(cg, $$0);
   }

   public boolean gC() {
      return this.am.a(cg);
   }

   void B(boolean $$0) {
      this.am.a(ch, $$0);
   }

   boolean gI() {
      return this.am.a(ch);
   }

   public cuj gD() {
      return cuj.a(this.am.a(ci));
   }

   private void a(cuj $$0) {
      this.am.a(ci, $$0.a());
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cf, lu.ai.g(cj));
      $$0.a(cg, false);
      $$0.a(ch, false);
      $$0.a(ci, cuj.o.a());
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("variant", this.gB().e().orElse(cj).a().toString());
      $$0.a("CollarColor", (byte)this.gD().a());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      Optional.ofNullable(alc.c($$0.l("variant"))).map($$0x -> alb.a(lv.l, $$0x)).flatMap(lu.ai::b).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cuj.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void ad() {
      if (this.M().b()) {
         double $$0 = this.M().c();
         if ($$0 == 0.6) {
            this.b(buw.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(buw.a);
            this.h(true);
         } else {
            this.b(buw.a);
            this.h(false);
         }
      } else {
         this.b(buw.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected awd w() {
      if (this.q()) {
         if (this.gz()) {
            return awe.dY;
         } else {
            return this.af.a(4) == 0 ? awe.dZ : awe.dR;
         }
      } else {
         return awe.dS;
      }
   }

   @Override
   public int T() {
      return 120;
   }

   public void gE() {
      this.b(awe.dV);
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.dX;
   }

   @Override
   protected awd n_() {
      return awe.dT;
   }

   public static bvq.a gF() {
      return cga.gu().a(bvr.s, 10.0).a(bvr.v, 0.3F).a(bvr.c, 3.0);
   }

   @Override
   protected void gv() {
      this.a(awe.dU, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.cl != null && this.cl.i() && !this.q() && this.ag % 100 == 0) {
         this.a(awe.dW, 1.0F, 1.0F);
      }

      this.gJ();
   }

   private void gJ() {
      if ((this.gC() || this.gI()) && this.ag % 5 == 0) {
         this.a(awe.dY, 0.6F + 0.4F * (this.af.i() - this.af.i()), 1.0F);
      }

      this.gK();
      this.gL();
      this.cq = false;
      if (this.gC()) {
         je $$0 = this.ds();

         for (cnu $$2 : this.dS().a(cnu.class, new eyn($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fM()) {
               this.cq = true;
               break;
            }
         }
      }
   }

   public boolean gG() {
      return this.cq;
   }

   private void gK() {
      this.cn = this.cm;
      this.cp = this.co;
      if (this.gC()) {
         this.cm = Math.min(1.0F, this.cm + 0.15F);
         this.co = Math.min(1.0F, this.co + 0.08F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.22F);
         this.co = Math.max(0.0F, this.co - 0.13F);
      }
   }

   private void gL() {
      this.cs = this.cr;
      if (this.gI()) {
         this.cr = Math.min(1.0F, this.cr + 0.1F);
      } else {
         this.cr = Math.max(0.0F, this.cr - 0.13F);
      }
   }

   public float J(float $$0) {
      return azd.h($$0, this.cn, this.cm);
   }

   public float K(float $$0) {
      return azd.h($$0, this.cp, this.co);
   }

   public float L(float $$0) {
      return azd.h($$0, this.cs, this.cr);
   }

   @Nullable
   public cgd b(arh $$0, bth $$1) {
      cgd $$2 = btv.p.a($$0, btu.e);
      if ($$2 != null && $$1 instanceof cgd $$3) {
         if (this.af.h()) {
            $$2.j(this.gB());
         } else {
            $$2.j($$3.gB());
         }

         if (this.q()) {
            $$2.b(this.Z_());
            $$2.b(true, true);
            if (this.af.h()) {
               $$2.a(this.gD());
            } else {
               $$2.a($$3.gD());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cga $$0) {
      if (!this.q()) {
         return false;
      } else {
         return !($$0 instanceof cgd $$1) ? false : $$1.q() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ar() > 0.9F;
      axj<cge> $$5 = $$4 ? awu.b : awu.a;
      lu.ai.a($$5, $$0.C_()).ifPresent(this::j);
      arh $$6 = $$0.E();
      if ($$6.a().a(this.ds(), axf.o).b()) {
         this.j(lu.ai.g(cge.l));
         this.fW();
      }

      return $$3;
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      cvk $$3 = $$2.h();
      if (this.q()) {
         if (this.j($$0)) {
            if ($$3 instanceof cuk $$4) {
               cuj $$5 = $$4.c();
               if ($$5 != this.gD()) {
                  if (!this.dS().w_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fW();
                  }

                  return brp.a;
               }
            } else if (this.n($$2) && this.eA() < this.eQ()) {
               if (!this.dS().w_()) {
                  this.a($$0, $$1, $$2);
                  cqt $$6 = $$2.a(kr.v);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gv();
               }

               return brp.a;
            }

            brp $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.z(!this.gp());
               return brp.a;
            }

            return $$7;
         }
      } else if (this.n($$2)) {
         if (!this.dS().w_()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            this.fW();
            this.gv();
         }

         return brp.a;
      }

      brp $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fW();
      }

      return $$8;
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.ae);
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && this.ag > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gH();
   }

   protected void gH() {
      if (this.ck == null) {
         this.ck = new cgd.a<>(this, cnu.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.ck);
      if (!this.q()) {
         this.bS.a(4, this.ck);
      }
   }

   private void g(cnu $$0) {
      if (this.af.a(3) == 0) {
         this.a($$0);
         this.z(true);
         this.dS().a(this, (byte)7);
      } else {
         this.dS().a(this, (byte)6);
      }
   }

   @Override
   public boolean cb() {
      return this.cf() || super.cb();
   }

   static class a<T extends buk> extends cao<T> {
      private final cgd i;

      public a(cgd $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, btt.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.q() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.q() && super.c();
      }
   }

   static class b extends cbh {
      private final cgd a;
      @Nullable
      private cnu b;
      @Nullable
      private je c;
      private int d;

      public b(cgd $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.q()) {
            return false;
         } else if (this.a.gp()) {
            return false;
         } else {
            buk $$0 = this.a.R_();
            if ($$0 instanceof cnu) {
               this.b = (cnu)$$0;
               if (!$$0.fM()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               je $$1 = this.b.ds();
               duo $$2 = this.a.dS().a_($$1);
               if ($$2.a(awt.S)) {
                  this.c = $$2.d(dhc.aF).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new je($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cgd $$1 : this.a.dS().a(cgd.class, new eyn(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gC() || $$1.gI())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.q() && !this.a.gp() && this.b != null && this.b.fM() && this.c != null && !this.h();
      }

      @Override
      public void d() {
         if (this.c != null) {
            this.a.y(false);
            this.a.P().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void e() {
         this.a.A(false);
         float $$0 = this.a.dS().f(1.0F);
         if (this.b.gg() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dS().C_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.P().o();
      }

      private void i() {
         azl $$0 = this.a.dV();
         je.a $$1 = new je.a();
         $$1.g(this.a.K_() ? this.a.C().ds() : this.a.ds());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.ds());
         etm $$2 = this.a.dS().o().bd().b(etd.as);
         etk $$3 = new etk.a((arh)this.a.dS()).a(ewd.f, this.a.dq()).a(ewd.a, this.a).a(ewc.j);

         for (cvp $$5 : $$2.a($$3)) {
            this.a
               .dS()
               .b(
                  new cke(
                     this.a.dS(),
                     (double)$$1.u() - (double)azd.a(this.a.aT * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)azd.b(this.a.aT * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void a() {
         if (this.b != null && this.c != null) {
            this.a.y(false);
            this.a.P().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g(this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.A(true);
                  this.a.B(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.B(true);
               }
            } else {
               this.a.A(false);
            }
         }
      }
   }

   static class c extends ccp {
      @Nullable
      private cnu c;
      private final cgd d;

      public c(cgd $$0, double $$1, Predicate<cvp> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.c == null && this.a.dV().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dV().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }
   }
}
