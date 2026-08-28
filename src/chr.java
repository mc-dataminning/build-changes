import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chr extends bwu implements bwx<jq<chs>> {
   public static final double cd = 0.6;
   public static final double ce = 0.8;
   public static final double cf = 1.33;
   private static final aks<jq<chs>> cg = akw.a(chr.class, aku.x);
   private static final aks<Boolean> ch = akw.a(chr.class, aku.k);
   private static final aks<Boolean> ci = akw.a(chr.class, aku.k);
   private static final aks<Integer> cj = akw.a(chr.class, aku.b);
   private static final alo<chs> ck = chs.c;
   @Nullable
   private chr.a<cpo> cl;
   @Nullable
   private ced cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private boolean cr;
   private float cs;
   private float ct;

   public chr(bvi<? extends chr> $$0, dgz $$1) {
      super($$0, $$1);
      this.gG();
   }

   @Override
   protected void B() {
      this.cm = new chr.c(this, 0.6, $$0 -> $$0.a(axt.aj), true);
      this.bT.a(1, new ccp(this));
      this.bT.a(1, new bwu.a(1.5));
      this.bT.a(2, new cea(this));
      this.bT.a(3, new chr.b(this));
      this.bT.a(4, this.cm);
      this.bT.a(5, new cci(this, 1.1, 8));
      this.bT.a(6, new cct(this, 1.0, 10.0F, 5.0F));
      this.bT.a(7, new ccj(this, 0.8));
      this.bT.a(8, new cdb(this, 0.3F));
      this.bT.a(9, new cdl(this));
      this.bT.a(10, new cch(this, 0.8));
      this.bT.a(11, new cei(this, 0.8, 1.0000001E-5F));
      this.bT.a(12, new cdd(this, cpo.class, 10.0F));
      this.bU.a(1, new cer<>(this, cii.class, false, null));
      this.bU.a(1, new cer<>(this, cip.class, false, cip.bZ));
   }

   public jq<chs> gA() {
      return this.al.a(cg);
   }

   public void j(jq<chs> $$0) {
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

   public cwd gC() {
      return cwd.a(this.al.a(cj));
   }

   private void a(cwd $$0) {
      this.al.a(cj, $$0.a());
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(cg, ma.ai.b(ck));
      $$0.a(ch, false);
      $$0.a(ci, false);
      $$0.a(cj, cwd.o.a());
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("variant", this.gA().e().orElse(ck).a().toString());
      $$0.a("CollarColor", (byte)this.gC().a());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      Optional.ofNullable(alp.c($$0.l("variant"))).map($$0x -> alo.a(mb.l, $$0x)).flatMap(ma.ai::a).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cwd.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void a(arx $$0) {
      if (this.I().b()) {
         double $$1 = this.I().c();
         if ($$1 == 0.6) {
            this.b(bwj.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bwj.a);
            this.h(true);
         } else {
            this.b(bwj.a);
            this.h(false);
         }
      } else {
         this.b(bwj.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected awu u() {
      if (this.p()) {
         if (this.gy()) {
            return awv.dZ;
         } else {
            return this.ae.a(4) == 0 ? awv.ea : awv.dS;
         }
      } else {
         return awv.dT;
      }
   }

   @Override
   public int Q() {
      return 120;
   }

   public void gD() {
      this.b(awv.dW);
   }

   @Override
   protected awu e(btr $$0) {
      return awv.dY;
   }

   @Override
   protected awu o_() {
      return awv.dU;
   }

   public static bxe.a gE() {
      return cho.gt().a(bxf.s, 10.0).a(bxf.v, 0.3F).a(bxf.c, 3.0);
   }

   @Override
   protected void gu() {
      this.a(awv.dV, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.cm != null && this.cm.i() && !this.p() && this.af % 100 == 0) {
         this.a(awv.dX, 1.0F, 1.0F);
      }

      this.gI();
   }

   private void gI() {
      if ((this.gB() || this.gH()) && this.af % 5 == 0) {
         this.a(awv.dZ, 0.6F + 0.4F * (this.ae.i() - this.ae.i()), 1.0F);
      }

      this.gJ();
      this.gK();
      this.cr = false;
      if (this.gB()) {
         jh $$0 = this.dw();

         for (cpo $$2 : this.dW().a(cpo.class, new fbm($$0).c(2.0, 2.0, 2.0))) {
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
      return azu.h($$0, this.co, this.cn);
   }

   public float K(float $$0) {
      return azu.h($$0, this.cq, this.cp);
   }

   public float L(float $$0) {
      return azu.h($$0, this.ct, this.cs);
   }

   @Nullable
   public chr b(arx $$0, bus $$1) {
      chr $$2 = bvi.u.a($$0, bvh.e);
      if ($$2 != null && $$1 instanceof chr $$3) {
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
   public boolean a(cho $$0) {
      if (!this.p()) {
         return false;
      } else {
         return !($$0 instanceof chr $$1) ? false : $$1.p() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ar() > 0.9F;
      aya<chs> $$5 = $$4 ? axl.b : axl.a;
      ma.ai.a($$5, $$0.H_()).ifPresent(this::j);
      arx $$6 = $$0.a();
      if ($$6.b().a(this.dw(), axw.o).b()) {
         this.j(ma.ai.b(chs.l));
         this.ai();
      }

      return $$3;
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      cxc $$3 = $$2.h();
      if (this.p()) {
         if (this.j($$0)) {
            if ($$3 instanceof cwe $$4) {
               cwd $$5 = $$4.b();
               if ($$5 != this.gC()) {
                  if (!this.dW().B_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.ai();
                  }

                  return bta.a;
               }
            } else if (this.j($$2) && this.eE() < this.eS()) {
               if (!this.dW().B_()) {
                  this.a($$0, $$1, $$2);
                  csq $$6 = $$2.a(ku.w);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gu();
               }

               return bta.a;
            }

            bta $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.z(!this.go());
               return bta.a;
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

         return bta.a;
      }

      bta $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.ai();
      }

      return $$8;
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.aj);
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
         this.cl = new chr.a<>(this, cpo.class, 16.0F, 0.8, 1.33);
      }

      this.bT.a(this.cl);
      if (!this.p()) {
         this.bT.a(4, this.cl);
      }
   }

   private void g(cpo $$0) {
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

   static class a<T extends bvx> extends ccc<T> {
      private final chr i;

      public a(chr $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bvg.e::test);
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

   static class b extends ccv {
      private final chr a;
      @Nullable
      private cpo b;
      @Nullable
      private jh c;
      private int d;

      public b(chr $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.p()) {
            return false;
         } else if (this.a.go()) {
            return false;
         } else {
            bvx $$0 = this.a.ah_();
            if ($$0 instanceof cpo) {
               this.b = (cpo)$$0;
               if (!$$0.fR()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               jh $$1 = this.b.dw();
               dxo $$2 = this.a.dW().a_($$1);
               if ($$2.a(axk.T)) {
                  this.c = $$2.d(djw.aF).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new jh($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (chr $$1 : this.a.dW().a(chr.class, new fbm(this.c).g(2.0))) {
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
         bac $$0 = this.a.dZ();
         jh.a $$1 = new jh.a();
         $$1.g(this.a.P_() ? this.a.A().dw() : this.a.dw());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dw());
         this.a
            .a(
               a(this.a),
               ewe.aq,
               ($$1x, $$2) -> $$1x.b(
                     new cls(
                        $$1x,
                        (double)$$1.u() - (double)azu.a(this.a.aX * (float) (Math.PI / 180.0)),
                        (double)$$1.v(),
                        (double)$$1.w() + (double)azu.b(this.a.aX * (float) (Math.PI / 180.0)),
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

   static class c extends ced {
      @Nullable
      private cpo c;
      private final chr d;

      public c(chr $$0, double $$1, Predicate<cxg> $$2, boolean $$3) {
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
