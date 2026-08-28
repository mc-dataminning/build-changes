import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgg extends bvj implements bvm<jo<cgh>> {
   public static final double cc = 0.6;
   public static final double cd = 0.8;
   public static final double ce = 1.33;
   private static final akh<jo<cgh>> cf = akl.a(cgg.class, akj.x);
   private static final akh<Boolean> cg = akl.a(cgg.class, akj.k);
   private static final akh<Boolean> ch = akl.a(cgg.class, akj.k);
   private static final akh<Integer> ci = akl.a(cgg.class, akj.b);
   private static final ald<cgh> cj = cgh.c;
   @Nullable
   private cgg.a<cnx> ck;
   @Nullable
   private ccs cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private boolean cq;
   private float cr;
   private float cs;

   public cgg(bty<? extends cgg> $$0, dej $$1) {
      super($$0, $$1);
      this.gG();
   }

   @Override
   protected void D() {
      this.cl = new cgg.c(this, 0.6, $$0 -> $$0.a(axe.ae), true);
      this.bS.a(1, new cbe(this));
      this.bS.a(1, new bvj.a(1.5));
      this.bS.a(2, new ccp(this));
      this.bS.a(3, new cgg.b(this));
      this.bS.a(4, this.cl);
      this.bS.a(5, new cax(this, 1.1, 8));
      this.bS.a(6, new cbi(this, 1.0, 10.0F, 5.0F));
      this.bS.a(7, new cay(this, 0.8));
      this.bS.a(8, new cbq(this, 0.3F));
      this.bS.a(9, new cca(this));
      this.bS.a(10, new caw(this, 0.8));
      this.bS.a(11, new ccx(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new cbs(this, cnx.class, 10.0F));
      this.bT.a(1, new cdg<>(this, cgx.class, false, null));
      this.bT.a(1, new cdg<>(this, che.class, false, che.bY));
   }

   public jo<cgh> gA() {
      return this.am.a(cf);
   }

   public void j(jo<cgh> $$0) {
      this.am.a(cf, $$0);
   }

   public void A(boolean $$0) {
      this.am.a(cg, $$0);
   }

   public boolean gB() {
      return this.am.a(cg);
   }

   void B(boolean $$0) {
      this.am.a(ch, $$0);
   }

   boolean gH() {
      return this.am.a(ch);
   }

   public cum gC() {
      return cum.a(this.am.a(ci));
   }

   private void a(cum $$0) {
      this.am.a(ci, $$0.a());
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(cf, lv.ai.b(cj));
      $$0.a(cg, false);
      $$0.a(ch, false);
      $$0.a(ci, cum.o.a());
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("variant", this.gA().e().orElse(cj).a().toString());
      $$0.a("CollarColor", (byte)this.gC().a());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      Optional.ofNullable(ale.c($$0.l("variant"))).map($$0x -> ald.a(lw.l, $$0x)).flatMap(lv.ai::a).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cum.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void ac() {
      if (this.M().b()) {
         double $$0 = this.M().c();
         if ($$0 == 0.6) {
            this.b(buz.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(buz.a);
            this.h(true);
         } else {
            this.b(buz.a);
            this.h(false);
         }
      } else {
         this.b(buz.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected awf w() {
      if (this.q()) {
         if (this.gy()) {
            return awg.dY;
         } else {
            return this.af.a(4) == 0 ? awg.dZ : awg.dR;
         }
      } else {
         return awg.dS;
      }
   }

   @Override
   public int T() {
      return 120;
   }

   public void gD() {
      this.b(awg.dV);
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.dX;
   }

   @Override
   protected awf o_() {
      return awg.dT;
   }

   public static bvt.a gE() {
      return cgd.gt().a(bvu.s, 10.0).a(bvu.v, 0.3F).a(bvu.c, 3.0);
   }

   @Override
   protected void gu() {
      this.a(awg.dU, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.cl != null && this.cl.i() && !this.q() && this.ag % 100 == 0) {
         this.a(awg.dW, 1.0F, 1.0F);
      }

      this.gI();
   }

   private void gI() {
      if ((this.gB() || this.gH()) && this.ag % 5 == 0) {
         this.a(awg.dY, 0.6F + 0.4F * (this.af.i() - this.af.i()), 1.0F);
      }

      this.gJ();
      this.gK();
      this.cq = false;
      if (this.gB()) {
         jf $$0 = this.ds();

         for (cnx $$2 : this.dS().a(cnx.class, new eyr($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fN()) {
               this.cq = true;
               break;
            }
         }
      }
   }

   public boolean gF() {
      return this.cq;
   }

   private void gJ() {
      this.cn = this.cm;
      this.cp = this.co;
      if (this.gB()) {
         this.cm = Math.min(1.0F, this.cm + 0.15F);
         this.co = Math.min(1.0F, this.co + 0.08F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.22F);
         this.co = Math.max(0.0F, this.co - 0.13F);
      }
   }

   private void gK() {
      this.cs = this.cr;
      if (this.gH()) {
         this.cr = Math.min(1.0F, this.cr + 0.1F);
      } else {
         this.cr = Math.max(0.0F, this.cr - 0.13F);
      }
   }

   public float J(float $$0) {
      return azf.h($$0, this.cn, this.cm);
   }

   public float K(float $$0) {
      return azf.h($$0, this.cp, this.co);
   }

   public float L(float $$0) {
      return azf.h($$0, this.cs, this.cr);
   }

   @Nullable
   public cgg b(arj $$0, btk $$1) {
      cgg $$2 = bty.p.a($$0, btx.e);
      if ($$2 != null && $$1 instanceof cgg $$3) {
         if (this.af.h()) {
            $$2.j(this.gA());
         } else {
            $$2.j($$3.gA());
         }

         if (this.q()) {
            $$2.b(this.aa_());
            $$2.b(true, true);
            if (this.af.h()) {
               $$2.a(this.gC());
            } else {
               $$2.a($$3.gC());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cgd $$0) {
      if (!this.q()) {
         return false;
      } else {
         return !($$0 instanceof cgg $$1) ? false : $$1.q() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ar() > 0.9F;
      axl<cgh> $$5 = $$4 ? aww.b : aww.a;
      lv.ai.a($$5, $$0.D_()).ifPresent(this::j);
      arj $$6 = $$0.E();
      if ($$6.a().a(this.ds(), axh.o).b()) {
         this.j(lv.ai.b(cgh.l));
         this.fW();
      }

      return $$3;
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      cvn $$3 = $$2.h();
      if (this.q()) {
         if (this.j($$0)) {
            if ($$3 instanceof cun $$4) {
               cum $$5 = $$4.c();
               if ($$5 != this.gC()) {
                  if (!this.dS().x_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fW();
                  }

                  return brs.a;
               }
            } else if (this.n($$2) && this.eB() < this.eQ()) {
               if (!this.dS().x_()) {
                  this.a($$0, $$1, $$2);
                  cqw $$6 = $$2.a(ks.v);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gu();
               }

               return brs.a;
            }

            brs $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.z(!this.go());
               return brs.a;
            }

            return $$7;
         }
      } else if (this.n($$2)) {
         if (!this.dS().x_()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            this.fW();
            this.gu();
         }

         return brs.a;
      }

      brs $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fW();
      }

      return $$8;
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.ae);
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && this.ag > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gG();
   }

   protected void gG() {
      if (this.ck == null) {
         this.ck = new cgg.a<>(this, cnx.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.ck);
      if (!this.q()) {
         this.bS.a(4, this.ck);
      }
   }

   private void g(cnx $$0) {
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

   static class a<T extends bun> extends car<T> {
      private final cgg i;

      public a(cgg $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, btw.e::test);
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

   static class b extends cbk {
      private final cgg a;
      @Nullable
      private cnx b;
      @Nullable
      private jf c;
      private int d;

      public b(cgg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.q()) {
            return false;
         } else if (this.a.go()) {
            return false;
         } else {
            bun $$0 = this.a.S_();
            if ($$0 instanceof cnx) {
               this.b = (cnx)$$0;
               if (!$$0.fN()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               jf $$1 = this.b.ds();
               dus $$2 = this.a.dS().a_($$1);
               if ($$2.a(awv.S)) {
                  this.c = $$2.d(dhf.aF).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new jf($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cgg $$1 : this.a.dS().a(cgg.class, new eyr(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gB() || $$1.gH())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.q() && !this.a.go() && this.b != null && this.b.fN() && this.c != null && !this.h();
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
         if (this.b.gh() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dS().D_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.P().o();
      }

      private void i() {
         azn $$0 = this.a.dV();
         jf.a $$1 = new jf.a();
         $$1.g(this.a.L_() ? this.a.C().ds() : this.a.ds());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.ds());
         etq $$2 = this.a.dS().o().bd().b(eth.aq);
         eto $$3 = new eto.a((arj)this.a.dS()).a(ewh.f, this.a.dq()).a(ewh.a, this.a).a(ewg.j);

         for (cvs $$5 : $$2.a($$3)) {
            this.a
               .dS()
               .b(
                  new ckh(
                     this.a.dS(),
                     (double)$$1.u() - (double)azf.a(this.a.aT * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)azf.b(this.a.aT * (float) (Math.PI / 180.0)),
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

   static class c extends ccs {
      @Nullable
      private cnx c;
      private final cgg d;

      public c(cgg $$0, double $$1, Predicate<cvs> $$2, boolean $$3) {
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
