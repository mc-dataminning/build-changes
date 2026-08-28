import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chz extends bxc implements bxf<jq<cia>> {
   public static final double cd = 0.6;
   public static final double ce = 0.8;
   public static final double cf = 1.33;
   private static final alc<jq<cia>> cg = alg.a(chz.class, ale.x);
   private static final alc<Boolean> ch = alg.a(chz.class, ale.k);
   private static final alc<Boolean> ci = alg.a(chz.class, ale.k);
   private static final alc<Integer> cj = alg.a(chz.class, ale.b);
   private static final aly<cia> ck = cia.c;
   @Nullable
   private chz.a<cpw> cl;
   @Nullable
   private cel cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private boolean cr;
   private float cs;
   private float ct;

   public chz(bvq<? extends chz> $$0, dhh $$1) {
      super($$0, $$1);
      this.gE();
   }

   @Override
   protected void B() {
      this.cm = new chz.c(this, 0.6, $$0 -> $$0.a(ayd.aj), true);
      this.bT.a(1, new ccx(this));
      this.bT.a(1, new bxc.a(1.5));
      this.bT.a(2, new cei(this));
      this.bT.a(3, new chz.b(this));
      this.bT.a(4, this.cm);
      this.bT.a(5, new ccq(this, 1.1, 8));
      this.bT.a(6, new cdb(this, 1.0, 10.0F, 5.0F));
      this.bT.a(7, new ccr(this, 0.8));
      this.bT.a(8, new cdj(this, 0.3F));
      this.bT.a(9, new cdt(this));
      this.bT.a(10, new ccp(this, 0.8));
      this.bT.a(11, new ceq(this, 0.8, 1.0000001E-5F));
      this.bT.a(12, new cdl(this, cpw.class, 10.0F));
      this.bU.a(1, new cez<>(this, ciq.class, false, null));
      this.bU.a(1, new cez<>(this, cix.class, false, cix.bZ));
   }

   public jq<cia> gy() {
      return this.al.a(cg);
   }

   public void j(jq<cia> $$0) {
      this.al.a(cg, $$0);
   }

   public void A(boolean $$0) {
      this.al.a(ch, $$0);
   }

   public boolean gz() {
      return this.al.a(ch);
   }

   void B(boolean $$0) {
      this.al.a(ci, $$0);
   }

   boolean gF() {
      return this.al.a(ci);
   }

   public cwl gA() {
      return cwl.a(this.al.a(cj));
   }

   private void a(cwl $$0) {
      this.al.a(cj, $$0.a());
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cg, ma.ai.b(ck));
      $$0.a(ch, false);
      $$0.a(ci, false);
      $$0.a(cj, cwl.o.a());
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("variant", this.gy().e().orElse(ck).a().toString());
      $$0.a("CollarColor", (byte)this.gA().a());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      Optional.ofNullable(alz.c($$0.l("variant"))).map($$0x -> aly.a(mb.l, $$0x)).flatMap(ma.ai::a).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cwl.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void a(ash $$0) {
      if (this.I().b()) {
         double $$1 = this.I().c();
         if ($$1 == 0.6) {
            this.b(bwr.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bwr.a);
            this.h(true);
         } else {
            this.b(bwr.a);
            this.h(false);
         }
      } else {
         this.b(bwr.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected axe u() {
      if (this.p()) {
         if (this.gw()) {
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

   public void gB() {
      this.b(axf.dW);
   }

   @Override
   protected axe e(btz $$0) {
      return axf.dY;
   }

   @Override
   protected axe o_() {
      return axf.dU;
   }

   public static bxm.a gC() {
      return chw.gr().a(bxn.s, 10.0).a(bxn.v, 0.3F).a(bxn.c, 3.0);
   }

   @Override
   protected void gs() {
      this.a(axf.dV, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.cm != null && this.cm.i() && !this.p() && this.af % 100 == 0) {
         this.a(axf.dX, 1.0F, 1.0F);
      }

      this.gG();
   }

   private void gG() {
      if ((this.gz() || this.gF()) && this.af % 5 == 0) {
         this.a(axf.dZ, 0.6F + 0.4F * (this.ae.i() - this.ae.i()), 1.0F);
      }

      this.gH();
      this.gI();
      this.cr = false;
      if (this.gz()) {
         jh $$0 = this.dv();

         for (cpw $$2 : this.dV().a(cpw.class, new fbs($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fP()) {
               this.cr = true;
               break;
            }
         }
      }
   }

   public boolean gD() {
      return this.cr;
   }

   private void gH() {
      this.co = this.cn;
      this.cq = this.cp;
      if (this.gz()) {
         this.cn = Math.min(1.0F, this.cn + 0.15F);
         this.cp = Math.min(1.0F, this.cp + 0.08F);
      } else {
         this.cn = Math.max(0.0F, this.cn - 0.22F);
         this.cp = Math.max(0.0F, this.cp - 0.13F);
      }
   }

   private void gI() {
      this.ct = this.cs;
      if (this.gF()) {
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
   public chz b(ash $$0, bva $$1) {
      chz $$2 = bvq.u.a($$0, bvp.e);
      if ($$2 != null && $$1 instanceof chz $$3) {
         if (this.ae.h()) {
            $$2.j(this.gy());
         } else {
            $$2.j($$3.gy());
         }

         if (this.p()) {
            $$2.b(this.ab_());
            $$2.b(true, true);
            if (this.ae.h()) {
               $$2.a(this.gA());
            } else {
               $$2.a($$3.gA());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(chw $$0) {
      if (!this.p()) {
         return false;
      } else {
         return !($$0 instanceof chz $$1) ? false : $$1.p() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.aq() > 0.9F;
      ayk<cia> $$5 = $$4 ? axv.b : axv.a;
      ma.ai.a($$5, $$0.H_()).ifPresent(this::j);
      ash $$6 = $$0.a();
      if ($$6.b().a(this.dv(), ayg.o).b()) {
         this.j(ma.ai.b(cia.l));
         this.ai();
      }

      return $$3;
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      cxk $$3 = $$2.h();
      if (this.p()) {
         if (this.j($$0)) {
            if ($$3 instanceof cwm $$4) {
               cwl $$5 = $$4.b();
               if ($$5 != this.gA()) {
                  if (!this.dV().B_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.ai();
                  }

                  return bti.a;
               }
            } else if (this.j($$2) && this.eD() < this.eR()) {
               if (!this.dV().B_()) {
                  this.a($$0, $$1, $$2);
                  csy $$6 = $$2.a(ku.w);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gs();
               }

               return bti.a;
            }

            bti $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.z(!this.gm());
               return bti.a;
            }

            return $$7;
         }
      } else if (this.j($$2)) {
         if (!this.dV().B_()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            this.ai();
            this.gs();
         }

         return bti.a;
      }

      bti $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.ai();
      }

      return $$8;
   }

   @Override
   public boolean j(cxo $$0) {
      return $$0.a(ayd.aj);
   }

   @Override
   public boolean h(double $$0) {
      return !this.p() && this.af > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gE();
   }

   protected void gE() {
      if (this.cl == null) {
         this.cl = new chz.a<>(this, cpw.class, 16.0F, 0.8, 1.33);
      }

      this.bT.a(this.cl);
      if (!this.p()) {
         this.bT.a(4, this.cl);
      }
   }

   private void g(cpw $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.z(true);
         this.dV().a(this, (byte)7);
      } else {
         this.dV().a(this, (byte)6);
      }
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bwf> extends cck<T> {
      private final chz i;

      public a(chz $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bvo.e::test);
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

   static class b extends cdd {
      private final chz a;
      @Nullable
      private cpw b;
      @Nullable
      private jh c;
      private int d;

      public b(chz $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.p()) {
            return false;
         } else if (this.a.gm()) {
            return false;
         } else {
            bwf $$0 = this.a.ah_();
            if ($$0 instanceof cpw) {
               this.b = (cpw)$$0;
               if (!$$0.fP()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               jh $$1 = this.b.dv();
               dxu $$2 = this.a.dV().a_($$1);
               if ($$2.a(axu.T)) {
                  this.c = $$2.d(dke.aF).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new jh($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (chz $$1 : this.a.dV().a(chz.class, new fbs(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gz() || $$1.gF())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.p() && !this.a.gm() && this.b != null && this.b.fP() && this.c != null && !this.h();
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
         float $$0 = this.a.dV().f(1.0F);
         if (this.b.gl() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dV().H_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.L().o();
      }

      private void i() {
         bam $$0 = this.a.dY();
         jh.a $$1 = new jh.a();
         $$1.g(this.a.P_() ? this.a.A().dv() : this.a.dv());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dv());
         this.a
            .a(
               a(this.a),
               ewk.aq,
               ($$1x, $$2) -> $$1x.b(
                     new cma(
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

   static class c extends cel {
      @Nullable
      private cpw c;
      private final chz d;

      public c(chz $$0, double $$1, Predicate<cxo> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.c == null && this.a.dY().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dY().a(this.a(500)) == 0) {
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
