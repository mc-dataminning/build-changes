import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceu extends bty implements bub<jj<cev>> {
   public static final double cd = 0.6;
   public static final double ce = 0.8;
   public static final double cf = 1.33;
   private static final ajp<jj<cev>> cg = ajt.a(ceu.class, ajr.x);
   private static final ajp<Boolean> ch = ajt.a(ceu.class, ajr.k);
   private static final ajp<Boolean> ci = ajt.a(ceu.class, ajr.k);
   private static final ajp<Integer> cj = ajt.a(ceu.class, ajr.b);
   private static final akj<cev> ck = cev.b;
   @Nullable
   private ceu.a<cmk> cl;
   @Nullable
   private cbh cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public ceu(bsm<? extends ceu> $$0, dcf $$1) {
      super($$0, $$1);
      this.gA();
   }

   public akk gu() {
      return this.gv().a().a();
   }

   @Override
   protected void z() {
      this.cm = new ceu.c(this, 0.6, $$0 -> $$0.a(awf.ae), true);
      this.bU.a(1, new bzt(this));
      this.bU.a(1, new cas(this, 1.5));
      this.bU.a(2, new cbe(this));
      this.bU.a(3, new ceu.b(this));
      this.bU.a(4, this.cm);
      this.bU.a(5, new bzm(this, 1.1, 8));
      this.bU.a(6, new bzx(this, 1.0, 10.0F, 5.0F, false));
      this.bU.a(7, new bzn(this, 0.8));
      this.bU.a(8, new caf(this, 0.3F));
      this.bU.a(9, new cap(this));
      this.bU.a(10, new bzl(this, 0.8));
      this.bU.a(11, new cbm(this, 0.8, 1.0000001E-5F));
      this.bU.a(12, new cah(this, cmk.class, 10.0F));
      this.bV.a(1, new cbv<>(this, cfl.class, false, null));
      this.bV.a(1, new cbv<>(this, cfs.class, false, cfs.ca));
   }

   public jj<cev> gv() {
      return this.ao.a(cg);
   }

   @Override
   public void i(jj<cev> $$0) {
      this.ao.a(cg, $$0);
   }

   public void z(boolean $$0) {
      this.ao.a(ch, $$0);
   }

   public boolean gw() {
      return this.ao.a(ch);
   }

   void A(boolean $$0) {
      this.ao.a(ci, $$0);
   }

   boolean gB() {
      return this.ao.a(ci);
   }

   public csv gx() {
      return csv.a(this.ao.a(cj));
   }

   private void a(csv $$0) {
      this.ao.a(cj, $$0.a());
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cg, lq.ai.g(ck));
      $$0.a(ch, false);
      $$0.a(ci, false);
      $$0.a(cj, csv.o.a());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("variant", this.gv().e().orElse(ck).a().toString());
      $$0.a("CollarColor", (byte)this.gx().a());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      Optional.ofNullable(akk.a($$0.l("variant"))).map($$0x -> akj.a(lr.l, $$0x)).flatMap(lq.ai::b).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(csv.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Z() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(btn.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(btn.a);
            this.h(true);
         } else {
            this.b(btn.a);
            this.h(false);
         }
      } else {
         this.b(btn.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected avg v() {
      if (this.s()) {
         if (this.gs()) {
            return avh.dX;
         } else {
            return this.ah.a(4) == 0 ? avh.dY : avh.dQ;
         }
      } else {
         return avh.dR;
      }
   }

   @Override
   public int P() {
      return 120;
   }

   public void gy() {
      this.b(avh.dU);
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.dW;
   }

   @Override
   protected avg o_() {
      return avh.dS;
   }

   public static bui.a gz() {
      return btd.A().a(buj.s, 10.0).a(buj.v, 0.3F).a(buj.c, 3.0);
   }

   @Override
   protected void a(cmk $$0, bqf $$1, cuc $$2) {
      if (this.o($$2)) {
         this.a(avh.dT, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public void l() {
      super.l();
      if (this.cm != null && this.cm.i() && !this.s() && this.ai % 100 == 0) {
         this.a(avh.dV, 1.0F, 1.0F);
      }

      this.gC();
   }

   private void gC() {
      if ((this.gw() || this.gB()) && this.ai % 5 == 0) {
         this.a(avh.dX, 0.6F + 0.4F * (this.ah.i() - this.ah.i()), 1.0F);
      }

      this.gD();
      this.gE();
   }

   private void gD() {
      this.co = this.cn;
      this.cq = this.cp;
      if (this.gw()) {
         this.cn = Math.min(1.0F, this.cn + 0.15F);
         this.cp = Math.min(1.0F, this.cp + 0.08F);
      } else {
         this.cn = Math.max(0.0F, this.cn - 0.22F);
         this.cp = Math.max(0.0F, this.cp - 0.13F);
      }
   }

   private void gE() {
      this.cs = this.cr;
      if (this.gB()) {
         this.cr = Math.min(1.0F, this.cr + 0.1F);
      } else {
         this.cr = Math.max(0.0F, this.cr - 0.13F);
      }
   }

   public float H(float $$0) {
      return ayg.i($$0, this.co, this.cn);
   }

   public float I(float $$0) {
      return ayg.i($$0, this.cq, this.cp);
   }

   public float J(float $$0) {
      return ayg.i($$0, this.cs, this.cr);
   }

   @Nullable
   public ceu b(aqm $$0, bsa $$1) {
      ceu $$2 = bsm.p.a((dcf)$$0);
      if ($$2 != null && $$1 instanceof ceu $$3) {
         if (this.ah.h()) {
            $$2.i(this.gv());
         } else {
            $$2.i($$3.gv());
         }

         if (this.s()) {
            $$2.b(this.W_());
            $$2.b(true, true);
            if (this.ah.h()) {
               $$2.a(this.gx());
            } else {
               $$2.a($$3.gx());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cer $$0) {
      if (!this.s()) {
         return false;
      } else {
         return !($$0 instanceof ceu $$1) ? false : $$1.s() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.aq() > 0.9F;
      awm<cev> $$5 = $$4 ? avx.b : avx.a;
      lq.ai.a($$5, $$0.E_()).ifPresent(this::i);
      aqm $$6 = $$0.E();
      if ($$6.a().a(this.dq(), awi.o).b()) {
         this.i(lq.ai.g(cev.k));
         this.fR();
      }

      return $$3;
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      ctx $$3 = $$2.g();
      if (this.s()) {
         if (this.j($$0)) {
            if ($$3 instanceof csw $$4) {
               csv $$5 = $$4.c();
               if ($$5 != this.gx()) {
                  if (!this.dQ().x_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fR();
                  }

                  return bqg.a(this.dQ().x_());
               }
            } else if (this.o($$2) && this.ex() < this.eO()) {
               if (!this.dQ().x_()) {
                  this.a($$0, $$1, $$2);
                  cpe $$6 = $$2.a(kn.v);
                  this.c($$6 != null ? (float)$$6.b() : 1.0F);
               }

               return bqg.a(this.dQ().x_());
            }

            bqg $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.go());
               return bqg.a(this.dQ().x_());
            }

            return $$7;
         }
      } else if (this.o($$2)) {
         if (!this.dQ().x_()) {
            this.a($$0, $$1, $$2);
            this.h($$0);
            this.fR();
         }

         return bqg.a(this.dQ().x_());
      }

      bqg $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fR();
      }

      return $$8;
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.ae);
   }

   @Override
   public boolean h(double $$0) {
      return !this.s() && this.ai > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gA();
   }

   protected void gA() {
      if (this.cl == null) {
         this.cl = new ceu.a<>(this, cmk.class, 16.0F, 0.8, 1.33);
      }

      this.bU.a(this.cl);
      if (!this.s()) {
         this.bU.a(4, this.cl);
      }
   }

   private void h(cmk $$0) {
      if (this.ah.a(3) == 0) {
         this.f($$0);
         this.y(true);
         this.dQ().a(this, (byte)7);
      } else {
         this.dQ().a(this, (byte)6);
      }
   }

   @Override
   public boolean bX() {
      return this.cb() || super.bX();
   }

   static class a<T extends btb> extends bzg<T> {
      private final ceu i;

      public a(ceu $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsl.e::test);
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

   static class b extends bzz {
      private final ceu a;
      @Nullable
      private cmk b;
      @Nullable
      private ja c;
      private int d;

      public b(ceu $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.s()) {
            return false;
         } else if (this.a.go()) {
            return false;
         } else {
            btb $$0 = this.a.P_();
            if ($$0 instanceof cmk) {
               this.b = (cmk)$$0;
               if (!$$0.fI()) {
                  return false;
               }

               if (this.a.g((bsg)this.b) > 100.0) {
                  return false;
               }

               ja $$1 = this.b.dq();
               dsk $$2 = this.a.dQ().a_($$1);
               if ($$2.a(avw.R)) {
                  this.c = $$2.d(dfa.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new ja($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (ceu $$1 : this.a.dQ().a(ceu.class, new ewa(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gw() || $$1.gB())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.s() && !this.a.go() && this.b != null && this.b.fI() && this.c != null && !this.h();
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
         float $$0 = this.a.dQ().f(1.0F);
         if (this.b.gd() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dQ().E_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.K().n();
      }

      private void i() {
         ayo $$0 = this.a.dT();
         ja.a $$1 = new ja.a();
         $$1.g(this.a.ga() ? this.a.gc().dq() : this.a.dq());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dq());
         eqz $$2 = this.a.dQ().o().bf().b(eqq.aG);
         eqx $$3 = new eqx.a((aqm)this.a.dQ()).a(etq.f, this.a.do()).a(etq.a, this.a).a(etp.j);

         for (cuc $$5 : $$2.a($$3)) {
            this.a
               .dQ()
               .b(
                  new ciu(
                     this.a.dQ(),
                     (double)$$1.u() - (double)ayg.a(this.a.aY * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)ayg.b(this.a.aY * (float) (Math.PI / 180.0)),
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
            if (this.a.g((bsg)this.b) < 2.5) {
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

   static class c extends cbh {
      @Nullable
      private cmk c;
      private final ceu d;

      public c(ceu $$0, double $$1, Predicate<cuc> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.dT().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dT().a(this.a(500)) == 0) {
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
