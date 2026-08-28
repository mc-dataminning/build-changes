import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfy extends bvb implements bve<jn<cfz>> {
   public static final double cd = 0.6;
   public static final double ce = 0.8;
   public static final double cf = 1.33;
   private static final akg<jn<cfz>> cg = akk.a(cfy.class, aki.x);
   private static final akg<Boolean> ch = akk.a(cfy.class, aki.k);
   private static final akg<Boolean> ci = akk.a(cfy.class, aki.k);
   private static final akg<Integer> cj = akk.a(cfy.class, aki.b);
   private static final ala<cfz> ck = cfz.c;
   @Nullable
   private cfy.a<cnp> cl;
   @Nullable
   private cck cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private boolean cr;
   private float cs;
   private float ct;

   public cfy(btq<? extends cfy> $$0, dds $$1) {
      super($$0, $$1);
      this.gG();
   }

   @Override
   protected void D() {
      this.cm = new cfy.c(this, 0.6, $$0 -> $$0.a(axb.ae), true);
      this.bT.a(1, new caw(this));
      this.bT.a(1, new bvb.a(1.5));
      this.bT.a(2, new cch(this));
      this.bT.a(3, new cfy.b(this));
      this.bT.a(4, this.cm);
      this.bT.a(5, new cap(this, 1.1, 8));
      this.bT.a(6, new cba(this, 1.0, 10.0F, 5.0F));
      this.bT.a(7, new caq(this, 0.8));
      this.bT.a(8, new cbi(this, 0.3F));
      this.bT.a(9, new cbs(this));
      this.bT.a(10, new cao(this, 0.8));
      this.bT.a(11, new ccp(this, 0.8, 1.0000001E-5F));
      this.bT.a(12, new cbk(this, cnp.class, 10.0F));
      this.bU.a(1, new ccy<>(this, cgp.class, false, null));
      this.bU.a(1, new ccy<>(this, cgw.class, false, cgw.bZ));
   }

   public jn<cfz> gA() {
      return this.am.a(cg);
   }

   public void j(jn<cfz> $$0) {
      this.am.a(cg, $$0);
   }

   public void A(boolean $$0) {
      this.am.a(ch, $$0);
   }

   public boolean gB() {
      return this.am.a(ch);
   }

   void B(boolean $$0) {
      this.am.a(ci, $$0);
   }

   boolean gH() {
      return this.am.a(ci);
   }

   public cue gC() {
      return cue.a(this.am.a(cj));
   }

   private void a(cue $$0) {
      this.am.a(cj, $$0.a());
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cg, lu.ai.g(ck));
      $$0.a(ch, false);
      $$0.a(ci, false);
      $$0.a(cj, cue.o.a());
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("variant", this.gA().e().orElse(ck).a().toString());
      $$0.a("CollarColor", (byte)this.gC().a());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      Optional.ofNullable(alb.c($$0.l("variant"))).map($$0x -> ala.a(lv.l, $$0x)).flatMap(lu.ai::b).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cue.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void ad() {
      if (this.M().b()) {
         double $$0 = this.M().c();
         if ($$0 == 0.6) {
            this.b(bur.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bur.a);
            this.h(true);
         } else {
            this.b(bur.a);
            this.h(false);
         }
      } else {
         this.b(bur.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected awc w() {
      if (this.q()) {
         if (this.gy()) {
            return awd.dY;
         } else {
            return this.af.a(4) == 0 ? awd.dZ : awd.dR;
         }
      } else {
         return awd.dS;
      }
   }

   @Override
   public int T() {
      return 120;
   }

   public void gD() {
      this.b(awd.dV);
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.dX;
   }

   @Override
   protected awc n_() {
      return awd.dT;
   }

   public static bvl.a gE() {
      return cfv.gt().a(bvm.s, 10.0).a(bvm.v, 0.3F).a(bvm.c, 3.0);
   }

   @Override
   protected void gu() {
      this.a(awd.dU, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.cm != null && this.cm.i() && !this.q() && this.ag % 100 == 0) {
         this.a(awd.dW, 1.0F, 1.0F);
      }

      this.gI();
   }

   private void gI() {
      if ((this.gB() || this.gH()) && this.ag % 5 == 0) {
         this.a(awd.dY, 0.6F + 0.4F * (this.af.i() - this.af.i()), 1.0F);
      }

      this.gJ();
      this.gK();
      this.cr = false;
      if (this.gB()) {
         je $$0 = this.ds();

         for (cnp $$2 : this.dS().a(cnp.class, new exz($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fL()) {
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
      return azc.h($$0, this.co, this.cn);
   }

   public float K(float $$0) {
      return azc.h($$0, this.cq, this.cp);
   }

   public float L(float $$0) {
      return azc.h($$0, this.ct, this.cs);
   }

   @Nullable
   public cfy b(arg $$0, btc $$1) {
      cfy $$2 = btq.p.a($$0, btp.e);
      if ($$2 != null && $$1 instanceof cfy $$3) {
         if (this.af.h()) {
            $$2.j(this.gA());
         } else {
            $$2.j($$3.gA());
         }

         if (this.q()) {
            $$2.b(this.Z_());
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
   public boolean a(cfv $$0) {
      if (!this.q()) {
         return false;
      } else {
         return !($$0 instanceof cfy $$1) ? false : $$1.q() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ar() > 0.9F;
      axi<cfz> $$5 = $$4 ? awt.b : awt.a;
      lu.ai.a($$5, $$0.C_()).ifPresent(this::j);
      arg $$6 = $$0.E();
      if ($$6.a().a(this.ds(), axe.o).b()) {
         this.j(lu.ai.g(cfz.l));
         this.fV();
      }

      return $$3;
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      cvg $$3 = $$2.h();
      if (this.q()) {
         if (this.j($$0)) {
            if ($$3 instanceof cuf $$4) {
               cue $$5 = $$4.c();
               if ($$5 != this.gC()) {
                  if (!this.dS().w_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fV();
                  }

                  return brk.a;
               }
            } else if (this.p($$2) && this.eA() < this.eQ()) {
               if (!this.dS().w_()) {
                  this.a($$0, $$1, $$2);
                  cqn $$6 = $$2.a(kr.v);
                  this.c($$6 != null ? (float)$$6.b() : 1.0F);
                  this.gu();
               }

               return brk.a;
            }

            brk $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.z(!this.go());
               return brk.a;
            }

            return $$7;
         }
      } else if (this.p($$2)) {
         if (!this.dS().w_()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            this.fV();
            this.gu();
         }

         return brk.a;
      }

      brk $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fV();
      }

      return $$8;
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.ae);
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
      if (this.cl == null) {
         this.cl = new cfy.a<>(this, cnp.class, 16.0F, 0.8, 1.33);
      }

      this.bT.a(this.cl);
      if (!this.q()) {
         this.bT.a(4, this.cl);
      }
   }

   private void g(cnp $$0) {
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

   static class a<T extends buf> extends caj<T> {
      private final cfy i;

      public a(cfy $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bto.e::test);
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

   static class b extends cbc {
      private final cfy a;
      @Nullable
      private cnp b;
      @Nullable
      private je c;
      private int d;

      public b(cfy $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.q()) {
            return false;
         } else if (this.a.go()) {
            return false;
         } else {
            buf $$0 = this.a.R_();
            if ($$0 instanceof cnp) {
               this.b = (cnp)$$0;
               if (!$$0.fL()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               je $$1 = this.b.ds();
               dua $$2 = this.a.dS().a_($$1);
               if ($$2.a(aws.S)) {
                  this.c = $$2.d(dgo.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new je($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cfy $$1 : this.a.dS().a(cfy.class, new exz(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gB() || $$1.gH())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.q() && !this.a.go() && this.b != null && this.b.fL() && this.c != null && !this.h();
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
         azk $$0 = this.a.dV();
         je.a $$1 = new je.a();
         $$1.g(this.a.K_() ? this.a.C().ds() : this.a.ds());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.ds());
         esy $$2 = this.a.dS().o().bd().b(esp.as);
         esw $$3 = new esw.a((arg)this.a.dS()).a(evp.f, this.a.dq()).a(evp.a, this.a).a(evo.j);

         for (cvl $$5 : $$2.a($$3)) {
            this.a
               .dS()
               .b(
                  new cjz(
                     this.a.dS(),
                     (double)$$1.u() - (double)azc.a(this.a.aU * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)azc.b(this.a.aU * (float) (Math.PI / 180.0)),
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

   static class c extends cck {
      @Nullable
      private cnp c;
      private final cfy d;

      public c(cfy $$0, double $$1, Predicate<cvl> $$2, boolean $$3) {
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
