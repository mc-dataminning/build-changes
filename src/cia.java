import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cia extends bxd implements bxg<jq<cib>> {
   public static final double cd = 0.6;
   public static final double ce = 0.8;
   public static final double cf = 1.33;
   private static final alc<jq<cib>> cg = alg.a(cia.class, ale.x);
   private static final alc<Boolean> ch = alg.a(cia.class, ale.k);
   private static final alc<Boolean> ci = alg.a(cia.class, ale.k);
   private static final alc<Integer> cj = alg.a(cia.class, ale.b);
   private static final aly<cib> ck = cib.c;
   @Nullable
   private cia.a<cpx> cl;
   @Nullable
   private cem cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private boolean cr;
   private float cs;
   private float ct;

   public cia(bvr<? extends cia> $$0, dhi $$1) {
      super($$0, $$1);
      this.gG();
   }

   @Override
   protected void B() {
      this.cm = new cia.c(this, 0.6, $$0 -> $$0.a(ayd.aj), true);
      this.bT.a(1, new ccy(this));
      this.bT.a(1, new bxd.a(1.5));
      this.bT.a(2, new cej(this));
      this.bT.a(3, new cia.b(this));
      this.bT.a(4, this.cm);
      this.bT.a(5, new ccr(this, 1.1, 8));
      this.bT.a(6, new cdc(this, 1.0, 10.0F, 5.0F));
      this.bT.a(7, new ccs(this, 0.8));
      this.bT.a(8, new cdk(this, 0.3F));
      this.bT.a(9, new cdu(this));
      this.bT.a(10, new ccq(this, 0.8));
      this.bT.a(11, new cer(this, 0.8, 1.0000001E-5F));
      this.bT.a(12, new cdm(this, cpx.class, 10.0F));
      this.bU.a(1, new cfa<>(this, cir.class, false, null));
      this.bU.a(1, new cfa<>(this, ciy.class, false, ciy.bZ));
   }

   public jq<cib> gA() {
      return this.al.a(cg);
   }

   public void j(jq<cib> $$0) {
      this.al.a(cg, $$0);
   }

   public void A(boolean $$0) {
      this.al.a(ch, $$0);
   }

   public boolean gB() {
      return this.al.a(ch);
   }

   void B(boolean $$0) {
      this.al.a(ci, $$0);
   }

   boolean gH() {
      return this.al.a(ci);
   }

   public cwm gC() {
      return cwm.a(this.al.a(cj));
   }

   private void a(cwm $$0) {
      this.al.a(cj, $$0.a());
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cg, ma.ai.b(ck));
      $$0.a(ch, false);
      $$0.a(ci, false);
      $$0.a(cj, cwm.o.a());
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("variant", this.gA().e().orElse(ck).a().toString());
      $$0.a("CollarColor", (byte)this.gC().a());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      Optional.ofNullable(alz.c($$0.l("variant"))).map($$0x -> aly.a(mb.l, $$0x)).flatMap(ma.ai::a).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cwm.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void a(ash $$0) {
      if (this.I().b()) {
         double $$1 = this.I().c();
         if ($$1 == 0.6) {
            this.b(bws.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bws.a);
            this.h(true);
         } else {
            this.b(bws.a);
            this.h(false);
         }
      } else {
         this.b(bws.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected axe u() {
      if (this.p()) {
         if (this.gy()) {
            return axf.dZ;
         } else {
            return this.ae.a(4) == 0 ? axf.ea : axf.dS;
         }
      } else {
         return axf.dT;
      }
   }

   @Override
   public int Q() {
      return 120;
   }

   public void gD() {
      this.b(axf.dW);
   }

   @Override
   protected axe e(bua $$0) {
      return axf.dY;
   }

   @Override
   protected axe o_() {
      return axf.dU;
   }

   public static bxn.a gE() {
      return chx.gt().a(bxo.s, 10.0).a(bxo.v, 0.3F).a(bxo.c, 3.0);
   }

   @Override
   protected void gu() {
      this.a(axf.dV, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.cm != null && this.cm.i() && !this.p() && this.af % 100 == 0) {
         this.a(axf.dX, 1.0F, 1.0F);
      }

      this.gI();
   }

   private void gI() {
      if ((this.gB() || this.gH()) && this.af % 5 == 0) {
         this.a(axf.dZ, 0.6F + 0.4F * (this.ae.i() - this.ae.i()), 1.0F);
      }

      this.gJ();
      this.gK();
      this.cr = false;
      if (this.gB()) {
         jh $$0 = this.dw();

         for (cpx $$2 : this.dW().a(cpx.class, new fbt($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fR()) {
               this.cr = true;
               break;
            }
         }
      }
   }

   public boolean gF() {
      return this.cr;
   }

   private void gJ() {
      this.co = this.cn;
      this.cq = this.cp;
      if (this.gB()) {
         this.cn = Math.min(1.0F, this.cn + 0.15F);
         this.cp = Math.min(1.0F, this.cp + 0.08F);
      } else {
         this.cn = Math.max(0.0F, this.cn - 0.22F);
         this.cp = Math.max(0.0F, this.cp - 0.13F);
      }
   }

   private void gK() {
      this.ct = this.cs;
      if (this.gH()) {
         this.cs = Math.min(1.0F, this.cs + 0.1F);
      } else {
         this.cs = Math.max(0.0F, this.cs - 0.13F);
      }
   }

   public float J(float $$0) {
      return bae.h($$0, this.co, this.cn);
   }

   public float K(float $$0) {
      return bae.h($$0, this.cq, this.cp);
   }

   public float L(float $$0) {
      return bae.h($$0, this.ct, this.cs);
   }

   @Nullable
   public cia b(ash $$0, bvb $$1) {
      cia $$2 = bvr.u.a($$0, bvq.e);
      if ($$2 != null && $$1 instanceof cia $$3) {
         if (this.ae.h()) {
            $$2.j(this.gA());
         } else {
            $$2.j($$3.gA());
         }

         if (this.p()) {
            $$2.b(this.ab_());
            $$2.b(true, true);
            if (this.ae.h()) {
               $$2.a(this.gC());
            } else {
               $$2.a($$3.gC());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(chx $$0) {
      if (!this.p()) {
         return false;
      } else {
         return !($$0 instanceof cia $$1) ? false : $$1.p() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.aq() > 0.9F;
      ayk<cib> $$5 = $$4 ? axv.b : axv.a;
      ma.ai.a($$5, $$0.H_()).ifPresent(this::j);
      ash $$6 = $$0.a();
      if ($$6.b().a(this.dw(), ayg.o).b()) {
         this.j(ma.ai.b(cib.l));
         this.ai();
      }

      return $$3;
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      cxl $$3 = $$2.h();
      if (this.p()) {
         if (this.j($$0)) {
            if ($$3 instanceof cwn $$4) {
               cwm $$5 = $$4.b();
               if ($$5 != this.gC()) {
                  if (!this.dW().B_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.ai();
                  }

                  return btj.a;
               }
            } else if (this.j($$2) && this.eE() < this.eS()) {
               if (!this.dW().B_()) {
                  this.a($$0, $$1, $$2);
                  csz $$6 = $$2.a(ku.w);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gu();
               }

               return btj.a;
            }

            btj $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.z(!this.go());
               return btj.a;
            }

            return $$7;
         }
      } else if (this.j($$2)) {
         if (!this.dW().B_()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            this.ai();
            this.gu();
         }

         return btj.a;
      }

      btj $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.ai();
      }

      return $$8;
   }

   @Override
   public boolean j(cxp $$0) {
      return $$0.a(ayd.aj);
   }

   @Override
   public boolean h(double $$0) {
      return !this.p() && this.af > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gG();
   }

   protected void gG() {
      if (this.cl == null) {
         this.cl = new cia.a<>(this, cpx.class, 16.0F, 0.8, 1.33);
      }

      this.bT.a(this.cl);
      if (!this.p()) {
         this.bT.a(4, this.cl);
      }
   }

   private void g(cpx $$0) {
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

   static class a<T extends bwg> extends ccl<T> {
      private final cia i;

      public a(cia $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bvp.e::test);
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

   static class b extends cde {
      private final cia a;
      @Nullable
      private cpx b;
      @Nullable
      private jh c;
      private int d;

      public b(cia $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.p()) {
            return false;
         } else if (this.a.go()) {
            return false;
         } else {
            bwg $$0 = this.a.ah_();
            if ($$0 instanceof cpx) {
               this.b = (cpx)$$0;
               if (!$$0.fR()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               jh $$1 = this.b.dw();
               dxv $$2 = this.a.dW().a_($$1);
               if ($$2.a(axu.T)) {
                  this.c = $$2.d(dkf.aF).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new jh($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cia $$1 : this.a.dW().a(cia.class, new fbt(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gB() || $$1.gH())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.p() && !this.a.go() && this.b != null && this.b.fR() && this.c != null && !this.h();
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
         this.a.L().o();
      }

      private void i() {
         bam $$0 = this.a.dZ();
         jh.a $$1 = new jh.a();
         $$1.g(this.a.P_() ? this.a.A().dw() : this.a.dw());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dw());
         this.a
            .a(
               a(this.a),
               ewl.aq,
               ($$1x, $$2) -> $$1x.b(
                     new cmb(
                        $$1x,
                        (double)$$1.u() - (double)bae.a(this.a.aX * (float) (Math.PI / 180.0)),
                        (double)$$1.v(),
                        (double)$$1.w() + (double)bae.b(this.a.aX * (float) (Math.PI / 180.0)),
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

   static class c extends cem {
      @Nullable
      private cpx c;
      private final cia d;

      public c(cia $$0, double $$1, Predicate<cxp> $$2, boolean $$3) {
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
