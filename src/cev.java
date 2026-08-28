import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cev extends btz implements buc<jj<cew>> {
   public static final double cd = 0.6;
   public static final double ce = 0.8;
   public static final double cf = 1.33;
   private static final ajp<jj<cew>> cg = ajt.a(cev.class, ajr.x);
   private static final ajp<Boolean> ch = ajt.a(cev.class, ajr.k);
   private static final ajp<Boolean> ci = ajt.a(cev.class, ajr.k);
   private static final ajp<Integer> cj = ajt.a(cev.class, ajr.b);
   private static final akj<cew> ck = cew.c;
   @Nullable
   private cev.a<cml> cl;
   @Nullable
   private cbi cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public cev(bsn<? extends cev> $$0, dcg $$1) {
      super($$0, $$1);
      this.gz();
   }

   public akk gt() {
      return this.gu().a().a();
   }

   @Override
   protected void z() {
      this.cm = new cev.c(this, 0.6, $$0 -> $$0.a(awf.ae), true);
      this.bU.a(1, new bzu(this));
      this.bU.a(1, new cat(this, 1.5));
      this.bU.a(2, new cbf(this));
      this.bU.a(3, new cev.b(this));
      this.bU.a(4, this.cm);
      this.bU.a(5, new bzn(this, 1.1, 8));
      this.bU.a(6, new bzy(this, 1.0, 10.0F, 5.0F, false));
      this.bU.a(7, new bzo(this, 0.8));
      this.bU.a(8, new cag(this, 0.3F));
      this.bU.a(9, new caq(this));
      this.bU.a(10, new bzm(this, 0.8));
      this.bU.a(11, new cbn(this, 0.8, 1.0000001E-5F));
      this.bU.a(12, new cai(this, cml.class, 10.0F));
      this.bV.a(1, new cbw<>(this, cfm.class, false, null));
      this.bV.a(1, new cbw<>(this, cft.class, false, cft.ca));
   }

   public jj<cew> gu() {
      return this.ao.a(cg);
   }

   @Override
   public void i(jj<cew> $$0) {
      this.ao.a(cg, $$0);
   }

   public void z(boolean $$0) {
      this.ao.a(ch, $$0);
   }

   public boolean gv() {
      return this.ao.a(ch);
   }

   void A(boolean $$0) {
      this.ao.a(ci, $$0);
   }

   boolean gA() {
      return this.ao.a(ci);
   }

   public csw gw() {
      return csw.a(this.ao.a(cj));
   }

   private void a(csw $$0) {
      this.ao.a(cj, $$0.a());
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cg, lq.ai.g(ck));
      $$0.a(ch, false);
      $$0.a(ci, false);
      $$0.a(cj, csw.o.a());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("variant", this.gu().e().orElse(ck).a().toString());
      $$0.a("CollarColor", (byte)this.gw().a());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      Optional.ofNullable(akk.a($$0.l("variant"))).map($$0x -> akj.a(lr.l, $$0x)).flatMap(lq.ai::b).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(csw.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Z() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bto.f);
            this.i(false);
         } else if ($$0 == 1.33) {
            this.b(bto.a);
            this.i(true);
         } else {
            this.b(bto.a);
            this.i(false);
         }
      } else {
         this.b(bto.a);
         this.i(false);
      }
   }

   @Nullable
   @Override
   protected avg v() {
      if (this.s()) {
         if (this.gr()) {
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

   public void gx() {
      this.b(avh.dU);
   }

   @Override
   protected avg d(bra $$0) {
      return avh.dW;
   }

   @Override
   protected avg n_() {
      return avh.dS;
   }

   public static buj.a gy() {
      return bte.A().a(buk.s, 10.0).a(buk.v, 0.3F).a(buk.c, 3.0);
   }

   @Override
   protected void a(cml $$0, bqg $$1, cud $$2) {
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

      this.gB();
   }

   private void gB() {
      if ((this.gv() || this.gA()) && this.ai % 5 == 0) {
         this.a(avh.dX, 0.6F + 0.4F * (this.ah.i() - this.ah.i()), 1.0F);
      }

      this.gC();
      this.gD();
   }

   private void gC() {
      this.co = this.cn;
      this.cq = this.cp;
      if (this.gv()) {
         this.cn = Math.min(1.0F, this.cn + 0.15F);
         this.cp = Math.min(1.0F, this.cp + 0.08F);
      } else {
         this.cn = Math.max(0.0F, this.cn - 0.22F);
         this.cp = Math.max(0.0F, this.cp - 0.13F);
      }
   }

   private void gD() {
      this.cs = this.cr;
      if (this.gA()) {
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
   public cev b(aqm $$0, bsb $$1) {
      cev $$2 = bsn.p.a((dcg)$$0);
      if ($$2 != null && $$1 instanceof cev $$3) {
         if (this.ah.h()) {
            $$2.i(this.gu());
         } else {
            $$2.i($$3.gu());
         }

         if (this.s()) {
            $$2.b(this.W_());
            $$2.b(true, true);
            if (this.ah.h()) {
               $$2.a(this.gw());
            } else {
               $$2.a($$3.gw());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(ces $$0) {
      if (!this.s()) {
         return false;
      } else {
         return !($$0 instanceof cev $$1) ? false : $$1.s() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.aq() > 0.9F;
      awm<cew> $$5 = $$4 ? avx.b : avx.a;
      lq.ai.a($$5, $$0.E_()).ifPresent(this::i);
      aqm $$6 = $$0.E();
      if ($$6.a().a(this.dr(), awi.o).b()) {
         this.i(lq.ai.g(cew.l));
         this.fQ();
      }

      return $$3;
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      cty $$3 = $$2.g();
      if (this.s()) {
         if (this.j($$0)) {
            if ($$3 instanceof csx $$4) {
               csw $$5 = $$4.c();
               if ($$5 != this.gw()) {
                  if (!this.dR().x_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fQ();
                  }

                  return bqh.a(this.dR().x_());
               }
            } else if (this.o($$2) && this.ey() < this.eP()) {
               if (!this.dR().x_()) {
                  this.a($$0, $$1, $$2);
                  cpf $$6 = $$2.a(kn.v);
                  this.c($$6 != null ? (float)$$6.b() : 1.0F);
               }

               return bqh.a(this.dR().x_());
            }

            bqh $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gn());
               return bqh.a(this.dR().x_());
            }

            return $$7;
         }
      } else if (this.o($$2)) {
         if (!this.dR().x_()) {
            this.a($$0, $$1, $$2);
            this.h($$0);
            this.fQ();
         }

         return bqh.a(this.dR().x_());
      }

      bqh $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fQ();
      }

      return $$8;
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.ae);
   }

   @Override
   public boolean h(double $$0) {
      return !this.s() && this.ai > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gz();
   }

   protected void gz() {
      if (this.cl == null) {
         this.cl = new cev.a<>(this, cml.class, 16.0F, 0.8, 1.33);
      }

      this.bU.a(this.cl);
      if (!this.s()) {
         this.bU.a(4, this.cl);
      }
   }

   private void h(cml $$0) {
      if (this.ah.a(3) == 0) {
         this.f($$0);
         this.y(true);
         this.dR().a(this, (byte)7);
      } else {
         this.dR().a(this, (byte)6);
      }
   }

   @Override
   public boolean bY() {
      return this.cc() || super.bY();
   }

   static class a<T extends btc> extends bzh<T> {
      private final cev i;

      public a(cev $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsm.e::test);
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

   static class b extends caa {
      private final cev a;
      @Nullable
      private cml b;
      @Nullable
      private ja c;
      private int d;

      public b(cev $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.s()) {
            return false;
         } else if (this.a.gn()) {
            return false;
         } else {
            btc $$0 = this.a.P_();
            if ($$0 instanceof cml) {
               this.b = (cml)$$0;
               if (!$$0.fJ()) {
                  return false;
               }

               if (this.a.g((bsh)this.b) > 100.0) {
                  return false;
               }

               ja $$1 = this.b.dr();
               dsl $$2 = this.a.dR().a_($$1);
               if ($$2.a(avw.R)) {
                  this.c = $$2.d(dfb.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new ja($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cev $$1 : this.a.dR().a(cev.class, new ewc(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gv() || $$1.gA())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.s() && !this.a.gn() && this.b != null && this.b.fJ() && this.c != null && !this.h();
      }

      @Override
      public void c() {
         if (this.c != null) {
            this.a.x(false);
            this.a.J().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void d() {
         this.a.z(false);
         float $$0 = this.a.dR().f(1.0F);
         if (this.b.ge() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dR().E_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.J().n();
      }

      private void i() {
         ayo $$0 = this.a.dU();
         ja.a $$1 = new ja.a();
         $$1.g(this.a.fZ() ? this.a.gb().dr() : this.a.dr());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dr());
         erb $$2 = this.a.dR().o().bf().b(eqs.aG);
         eqz $$3 = new eqz.a((aqm)this.a.dR()).a(ets.f, this.a.dp()).a(ets.a, this.a).a(etr.j);

         for (cud $$5 : $$2.a($$3)) {
            this.a
               .dR()
               .b(
                  new civ(
                     this.a.dR(),
                     (double)$$1.u() - (double)ayg.a(this.a.aZ * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)ayg.b(this.a.aZ * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void e() {
         if (this.b != null && this.c != null) {
            this.a.x(false);
            this.a.J().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g((bsh)this.b) < 2.5) {
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

   static class c extends cbi {
      @Nullable
      private cml c;
      private final cev d;

      public c(cev $$0, double $$1, Predicate<cud> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.dU().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dU().a(this.a(500)) == 0) {
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
