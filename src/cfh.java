import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfh extends bul implements buo<jm<cfi>> {
   public static final double ce = 0.6;
   public static final double cf = 0.8;
   public static final double cg = 1.33;
   private static final ajw<jm<cfi>> ch = aka.a(cfh.class, ajy.x);
   private static final ajw<Boolean> ci = aka.a(cfh.class, ajy.k);
   private static final ajw<Boolean> cj = aka.a(cfh.class, ajy.k);
   private static final ajw<Integer> ck = aka.a(cfh.class, ajy.b);
   private static final akq<cfi> cl = cfi.c;
   @Nullable
   private cfh.a<cmx> cm;
   @Nullable
   private cbu cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;
   private float ct;

   public cfh(bsx<? extends cfh> $$0, dcw $$1) {
      super($$0, $$1);
      this.gB();
   }

   public akr gv() {
      return this.gw().a().a();
   }

   @Override
   protected void B() {
      this.cn = new cfh.c(this, 0.6, $$0 -> $$0.a(awn.ae), true);
      this.bU.a(1, new cag(this));
      this.bU.a(1, new bul.a(1.5));
      this.bU.a(2, new cbr(this));
      this.bU.a(3, new cfh.b(this));
      this.bU.a(4, this.cn);
      this.bU.a(5, new bzz(this, 1.1, 8));
      this.bU.a(6, new cak(this, 1.0, 10.0F, 5.0F));
      this.bU.a(7, new caa(this, 0.8));
      this.bU.a(8, new cas(this, 0.3F));
      this.bU.a(9, new cbc(this));
      this.bU.a(10, new bzy(this, 0.8));
      this.bU.a(11, new cbz(this, 0.8, 1.0000001E-5F));
      this.bU.a(12, new cau(this, cmx.class, 10.0F));
      this.bV.a(1, new cci<>(this, cfy.class, false, null));
      this.bV.a(1, new cci<>(this, cgf.class, false, cgf.ca));
   }

   public jm<cfi> gw() {
      return this.ao.a(ch);
   }

   @Override
   public void i(jm<cfi> $$0) {
      this.ao.a(ch, $$0);
   }

   public void z(boolean $$0) {
      this.ao.a(ci, $$0);
   }

   public boolean gx() {
      return this.ao.a(ci);
   }

   void A(boolean $$0) {
      this.ao.a(cj, $$0);
   }

   boolean gC() {
      return this.ao.a(cj);
   }

   public cti gy() {
      return cti.a(this.ao.a(ck));
   }

   private void a(cti $$0) {
      this.ao.a(ck, $$0.a());
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(ch, lt.ai.g(cl));
      $$0.a(ci, false);
      $$0.a(cj, false);
      $$0.a(ck, cti.o.a());
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("variant", this.gw().e().orElse(cl).a().toString());
      $$0.a("CollarColor", (byte)this.gy().a());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      Optional.ofNullable(akr.c($$0.l("variant"))).map($$0x -> akq.a(lu.l, $$0x)).flatMap(lt.ai::b).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(cti.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void ab() {
      if (this.J().b()) {
         double $$0 = this.J().c();
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
   protected avo v() {
      if (this.s()) {
         if (this.gt()) {
            return avp.dX;
         } else {
            return this.ah.a(4) == 0 ? avp.dY : avp.dQ;
         }
      } else {
         return avp.dR;
      }
   }

   @Override
   public int R() {
      return 120;
   }

   public void gz() {
      this.b(avp.dU);
   }

   @Override
   protected avo d(brk $$0) {
      return avp.dW;
   }

   @Override
   protected avo n_() {
      return avp.dS;
   }

   public static buv.a gA() {
      return btp.C().a(buw.s, 10.0).a(buw.v, 0.3F).a(buw.c, 3.0);
   }

   @Override
   protected void a(cmx $$0, bqq $$1, cuq $$2) {
      if (this.o($$2)) {
         this.a(avp.dT, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public void l() {
      super.l();
      if (this.cn != null && this.cn.i() && !this.s() && this.ai % 100 == 0) {
         this.a(avp.dV, 1.0F, 1.0F);
      }

      this.gD();
   }

   private void gD() {
      if ((this.gx() || this.gC()) && this.ai % 5 == 0) {
         this.a(avp.dX, 0.6F + 0.4F * (this.ah.i() - this.ah.i()), 1.0F);
      }

      this.gE();
      this.gF();
   }

   private void gE() {
      this.cp = this.co;
      this.cr = this.cq;
      if (this.gx()) {
         this.co = Math.min(1.0F, this.co + 0.15F);
         this.cq = Math.min(1.0F, this.cq + 0.08F);
      } else {
         this.co = Math.max(0.0F, this.co - 0.22F);
         this.cq = Math.max(0.0F, this.cq - 0.13F);
      }
   }

   private void gF() {
      this.ct = this.cs;
      if (this.gC()) {
         this.cs = Math.min(1.0F, this.cs + 0.1F);
      } else {
         this.cs = Math.max(0.0F, this.cs - 0.13F);
      }
   }

   public float H(float $$0) {
      return ayo.i($$0, this.cp, this.co);
   }

   public float I(float $$0) {
      return ayo.i($$0, this.cr, this.cq);
   }

   public float J(float $$0) {
      return ayo.i($$0, this.ct, this.cs);
   }

   @Nullable
   public cfh b(aqu $$0, bsl $$1) {
      cfh $$2 = bsx.p.a((dcw)$$0);
      if ($$2 != null && $$1 instanceof cfh $$3) {
         if (this.ah.h()) {
            $$2.i(this.gw());
         } else {
            $$2.i($$3.gw());
         }

         if (this.s()) {
            $$2.b(this.aa_());
            $$2.b(true, true);
            if (this.ah.h()) {
               $$2.a(this.gy());
            } else {
               $$2.a($$3.gy());
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
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.aq() > 0.9F;
      awu<cfi> $$5 = $$4 ? awf.b : awf.a;
      lt.ai.a($$5, $$0.E_()).ifPresent(this::i);
      aqu $$6 = $$0.E();
      if ($$6.a().a(this.dp(), awq.o).b()) {
         this.i(lt.ai.g(cfi.l));
         this.fS();
      }

      return $$3;
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      cul $$3 = $$2.g();
      if (this.s()) {
         if (this.j($$0)) {
            if ($$3 instanceof ctj $$4) {
               cti $$5 = $$4.c();
               if ($$5 != this.gy()) {
                  if (!this.dP().x_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fS();
                  }

                  return bqr.a(this.dP().x_());
               }
            } else if (this.o($$2) && this.ex() < this.eO()) {
               if (!this.dP().x_()) {
                  this.a($$0, $$1, $$2);
                  cpr $$6 = $$2.a(kq.v);
                  this.c($$6 != null ? (float)$$6.b() : 1.0F);
               }

               return bqr.a(this.dP().x_());
            }

            bqr $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gl());
               return bqr.a(this.dP().x_());
            }

            return $$7;
         }
      } else if (this.o($$2)) {
         if (!this.dP().x_()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            this.fS();
         }

         return bqr.a(this.dP().x_());
      }

      bqr $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fS();
      }

      return $$8;
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.ae);
   }

   @Override
   public boolean h(double $$0) {
      return !this.s() && this.ai > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gB();
   }

   protected void gB() {
      if (this.cm == null) {
         this.cm = new cfh.a<>(this, cmx.class, 16.0F, 0.8, 1.33);
      }

      this.bU.a(this.cm);
      if (!this.s()) {
         this.bU.a(4, this.cm);
      }
   }

   private void g(cmx $$0) {
      if (this.ah.a(3) == 0) {
         this.a($$0);
         this.y(true);
         this.dP().a(this, (byte)7);
      } else {
         this.dP().a(this, (byte)6);
      }
   }

   @Override
   public boolean bX() {
      return this.cb() || super.bX();
   }

   static class a<T extends btn> extends bzt<T> {
      private final cfh i;

      public a(cfh $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsw.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.s() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.s() && super.c();
      }
   }

   static class b extends cam {
      private final cfh a;
      @Nullable
      private cmx b;
      @Nullable
      private jd c;
      private int d;

      public b(cfh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.s()) {
            return false;
         } else if (this.a.gl()) {
            return false;
         } else {
            btn $$0 = this.a.T_();
            if ($$0 instanceof cmx) {
               this.b = (cmx)$$0;
               if (!$$0.fI()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               jd $$1 = this.b.dp();
               dtc $$2 = this.a.dP().a_($$1);
               if ($$2.a(awe.R)) {
                  this.c = $$2.d(dfr.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new jd($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cfh $$1 : this.a.dP().a(cfh.class, new ewv(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gx() || $$1.gC())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.s() && !this.a.gl() && this.b != null && this.b.fI() && this.c != null && !this.h();
      }

      @Override
      public void d() {
         if (this.c != null) {
            this.a.x(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void e() {
         this.a.z(false);
         float $$0 = this.a.dP().f(1.0F);
         if (this.b.gd() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dP().E_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.N().n();
      }

      private void i() {
         ayw $$0 = this.a.dS();
         jd.a $$1 = new jd.a();
         $$1.g(this.a.N_() ? this.a.A().dp() : this.a.dp());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dp());
         eru $$2 = this.a.dP().o().be().b(erl.aG);
         ers $$3 = new ers.a((aqu)this.a.dP()).a(eul.f, this.a.dn()).a(eul.a, this.a).a(euk.j);

         for (cuq $$5 : $$2.a($$3)) {
            this.a
               .dP()
               .b(
                  new cjh(
                     this.a.dP(),
                     (double)$$1.u() - (double)ayo.a(this.a.aY * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)ayo.b(this.a.aY * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void a() {
         if (this.b != null && this.c != null) {
            this.a.x(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g(this.b) < 2.5) {
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
      private cmx c;
      private final cfh d;

      public c(cfh $$0, double $$1, Predicate<cuq> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.c == null && this.a.dS().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dS().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.s();
      }
   }
}
