import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgz extends bwc implements bwf<jr<cha>> {
   public static final double cc = 0.6;
   public static final double cd = 0.8;
   public static final double ce = 1.33;
   private static final ajx<jr<cha>> cf = akb.a(cgz.class, ajz.x);
   private static final ajx<Boolean> cg = akb.a(cgz.class, ajz.k);
   private static final ajx<Boolean> ch = akb.a(cgz.class, ajz.k);
   private static final ajx<Integer> ci = akb.a(cgz.class, ajz.b);
   private static final akt<cha> cj = cha.c;
   @Nullable
   private cgz.a<cov> ck;
   @Nullable
   private cdl cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private boolean cq;
   private float cr;
   private float cs;

   public cgz(buq<? extends cgz> $$0, dgg $$1) {
      super($$0, $$1);
      this.gH();
   }

   @Override
   protected void B() {
      this.cl = new cgz.c(this, 0.6, $$0 -> $$0.a(awx.ah), true);
      this.bS.a(1, new cbx(this));
      this.bS.a(1, new bwc.a(1.5));
      this.bS.a(2, new cdi(this));
      this.bS.a(3, new cgz.b(this));
      this.bS.a(4, this.cl);
      this.bS.a(5, new cbq(this, 1.1, 8));
      this.bS.a(6, new ccb(this, 1.0, 10.0F, 5.0F));
      this.bS.a(7, new cbr(this, 0.8));
      this.bS.a(8, new ccj(this, 0.3F));
      this.bS.a(9, new cct(this));
      this.bS.a(10, new cbp(this, 0.8));
      this.bS.a(11, new cdq(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new ccl(this, cov.class, 10.0F));
      this.bT.a(1, new cdz<>(this, chq.class, false, null));
      this.bT.a(1, new cdz<>(this, chx.class, false, chx.bY));
   }

   public jr<cha> gB() {
      return this.al.a(cf);
   }

   public void j(jr<cha> $$0) {
      this.al.a(cf, $$0);
   }

   public void A(boolean $$0) {
      this.al.a(cg, $$0);
   }

   public boolean gC() {
      return this.al.a(cg);
   }

   void B(boolean $$0) {
      this.al.a(ch, $$0);
   }

   boolean gI() {
      return this.al.a(ch);
   }

   public cvk gD() {
      return cvk.a(this.al.a(ci));
   }

   private void a(cvk $$0) {
      this.al.a(ci, $$0.a());
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cf, mb.ai.b(cj));
      $$0.a(cg, false);
      $$0.a(ch, false);
      $$0.a(ci, cvk.o.a());
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("variant", this.gB().e().orElse(cj).a().toString());
      $$0.a("CollarColor", (byte)this.gD().a());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      Optional.ofNullable(aku.c($$0.l("variant"))).map($$0x -> akt.a(mc.l, $$0x)).flatMap(mb.ai::a).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cvk.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void a(arc $$0) {
      if (this.I().b()) {
         double $$1 = this.I().c();
         if ($$1 == 0.6) {
            this.b(bvr.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bvr.a);
            this.h(true);
         } else {
            this.b(bvr.a);
            this.h(false);
         }
      } else {
         this.b(bvr.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected avy u() {
      if (this.p()) {
         if (this.gz()) {
            return avz.dZ;
         } else {
            return this.ae.a(4) == 0 ? avz.ea : avz.dS;
         }
      } else {
         return avz.dT;
      }
   }

   @Override
   public int Q() {
      return 120;
   }

   public void gE() {
      this.b(avz.dW);
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.dY;
   }

   @Override
   protected avy o_() {
      return avz.dU;
   }

   public static bwm.a gF() {
      return cgw.gu().a(bwn.s, 10.0).a(bwn.v, 0.3F).a(bwn.c, 3.0);
   }

   @Override
   protected void gv() {
      this.a(avz.dV, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.cl != null && this.cl.i() && !this.p() && this.af % 100 == 0) {
         this.a(avz.dX, 1.0F, 1.0F);
      }

      this.gJ();
   }

   private void gJ() {
      if ((this.gC() || this.gI()) && this.af % 5 == 0) {
         this.a(avz.dZ, 0.6F + 0.4F * (this.ae.i() - this.ae.i()), 1.0F);
      }

      this.gK();
      this.gL();
      this.cq = false;
      if (this.gC()) {
         ji $$0 = this.dw();

         for (cov $$2 : this.dW().a(cov.class, new fat($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fR()) {
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
      return ayy.h($$0, this.cn, this.cm);
   }

   public float K(float $$0) {
      return ayy.h($$0, this.cp, this.co);
   }

   public float L(float $$0) {
      return ayy.h($$0, this.cs, this.cr);
   }

   @Nullable
   public cgz b(arc $$0, bua $$1) {
      cgz $$2 = buq.u.a($$0, bup.e);
      if ($$2 != null && $$1 instanceof cgz $$3) {
         if (this.ae.h()) {
            $$2.j(this.gB());
         } else {
            $$2.j($$3.gB());
         }

         if (this.p()) {
            $$2.b(this.aa_());
            $$2.b(true, true);
            cvk $$4 = this.gD();
            cvk $$5 = $$3.gD();
            $$2.a(cvk.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cgw $$0) {
      if (!this.p()) {
         return false;
      } else {
         return !($$0 instanceof cgz $$1) ? false : $$1.p() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ar() > 0.9F;
      axe<cha> $$5 = $$4 ? awp.b : awp.a;
      mb.ai.a($$5, $$0.H_()).ifPresent(this::j);
      arc $$6 = $$0.a();
      if ($$6.b().a(this.dw(), axa.o).b()) {
         this.j(mb.ai.b(cha.l));
         this.aj();
      }

      return $$3;
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      cwj $$3 = $$2.h();
      if (this.p()) {
         if (this.j($$0)) {
            if ($$3 instanceof cvl $$4) {
               cvk $$5 = $$4.b();
               if ($$5 != this.gD()) {
                  if (!this.dW().B_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.aj();
                  }

                  return bsi.a;
               }
            } else if (this.j($$2) && this.eE() < this.eS()) {
               if (!this.dW().B_()) {
                  this.a($$0, $$1, $$2);
                  crx $$6 = $$2.a(kv.w);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gv();
               }

               return bsi.a;
            }

            bsi $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.z(!this.gp());
               return bsi.a;
            }

            return $$7;
         }
      } else if (this.j($$2)) {
         if (!this.dW().B_()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            this.aj();
            this.gv();
         }

         return bsi.a;
      }

      bsi $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.aj();
      }

      return $$8;
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.ah);
   }

   @Override
   public boolean h(double $$0) {
      return !this.p() && this.af > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gH();
   }

   protected void gH() {
      if (this.ck == null) {
         this.ck = new cgz.a<>(this, cov.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.ck);
      if (!this.p()) {
         this.bS.a(4, this.ck);
      }
   }

   private void g(cov $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.z(true);
         this.dW().a(this, (byte)7);
      } else {
         this.dW().a(this, (byte)6);
      }
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bvf> extends cbk<T> {
      private final cgz i;

      public a(cgz $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, buo.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.p() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.p() && super.c();
      }
   }

   static class b extends ccd {
      private final cgz a;
      @Nullable
      private cov b;
      @Nullable
      private ji c;
      private int d;

      public b(cgz $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.p()) {
            return false;
         } else if (this.a.gp()) {
            return false;
         } else {
            bvf $$0 = this.a.ag_();
            if ($$0 instanceof cov) {
               this.b = (cov)$$0;
               if (!$$0.fR()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               ji $$1 = this.b.dw();
               dwv $$2 = this.a.dW().a_($$1);
               if ($$2.a(awo.T)) {
                  this.c = $$2.d(djd.aF).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new ji($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cgz $$1 : this.a.dW().a(cgz.class, new fat(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gC() || $$1.gI())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.p() && !this.a.gp() && this.b != null && this.b.fR() && this.c != null && !this.h();
      }

      @Override
      public void d() {
         if (this.c != null) {
            this.a.y(false);
            this.a.L().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void e() {
         this.a.A(false);
         float $$0 = this.a.dW().f(1.0F);
         if (this.b.gn() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dW().H_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.L().m();
      }

      private void i() {
         azg $$0 = this.a.dZ();
         ji.a $$1 = new ji.a();
         $$1.g(this.a.P_() ? this.a.A().dw() : this.a.dw());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dw());
         this.a
            .a(
               a(this.a),
               evl.aq,
               ($$1x, $$2) -> $$1x.b(
                     new cla(
                        $$1x,
                        (double)$$1.u() - (double)ayy.a(this.a.aX * (float) (Math.PI / 180.0)),
                        (double)$$1.v(),
                        (double)$$1.w() + (double)ayy.b(this.a.aX * (float) (Math.PI / 180.0)),
                        $$2
                     )
                  )
            );
      }

      @Override
      public void a() {
         if (this.b != null && this.c != null) {
            this.a.y(false);
            this.a.L().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
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

   static class c extends cdl {
      @Nullable
      private cov c;
      private final cgz d;

      public c(cgz $$0, double $$1, Predicate<cwn> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.c == null && this.a.dZ().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dZ().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.p();
      }
   }
}
