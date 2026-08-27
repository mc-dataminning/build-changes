import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bva extends bkh implements bkk<bvb> {
   public static final double bW = 0.6;
   public static final double bX = 0.8;
   public static final double bY = 1.33;
   private static final cmm bZ = cmm.a(cjo.ql, cjo.qm);
   private static final aef<bvb> ca = aei.a(bva.class, aeh.w);
   private static final aef<Boolean> cb = aei.a(bva.class, aeh.k);
   private static final aef<Boolean> cc = aei.a(bva.class, aeh.k);
   private static final aef<Integer> cd = aei.a(bva.class, aeh.b);
   private bva.a<cca> ce;
   @Nullable
   private brp cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;

   public bva(bja<? extends bva> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public aez gk() {
      return this.gl().a();
   }

   @Override
   protected void z() {
      this.cf = new bva.c(this, 0.6, bZ, true);
      this.bO.a(1, new bqb(this));
      this.bO.a(1, new bra(this, 1.5));
      this.bO.a(2, new brm(this));
      this.bO.a(3, new bva.b(this));
      this.bO.a(4, this.cf);
      this.bO.a(5, new bpu(this, 1.1, 8));
      this.bO.a(6, new bqf(this, 1.0, 10.0F, 5.0F, false));
      this.bO.a(7, new bpv(this, 0.8));
      this.bO.a(8, new bqn(this, 0.3F));
      this.bO.a(9, new bqx(this));
      this.bO.a(10, new bpt(this, 0.8));
      this.bO.a(11, new bru(this, 0.8, 1.0000001E-5F));
      this.bO.a(12, new bqp(this, cca.class, 10.0F));
      this.bP.a(1, new bsd<>(this, bvr.class, false, null));
      this.bP.a(1, new bsd<>(this, bvy.class, false, bvy.bU));
   }

   public bvb gl() {
      return this.an.b(ca);
   }

   public void a(bvb $$0) {
      this.an.b(ca, $$0);
   }

   public void A(boolean $$0) {
      this.an.b(cb, $$0);
   }

   public boolean gm() {
      return this.an.b(cb);
   }

   public void B(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public boolean gn() {
      return this.an.b(cc);
   }

   public chz go() {
      return chz.a(this.an.b(cd));
   }

   public void a(chz $$0) {
      this.an.b(cd, $$0.a());
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, jb.ak.e(bvb.b));
      this.an.a(cb, false);
      this.an.a(cc, false);
      this.an.a(cd, chz.o.a());
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("variant", jb.ak.b(this.gl()).toString());
      $$0.a("CollarColor", (byte)this.go().a());
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      bvb $$1 = jb.ak.a(aez.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(chz.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void X() {
      if (this.I().b()) {
         double $$0 = this.I().c();
         if ($$0 == 0.6) {
            this.b(bjy.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bjy.a);
            this.g(true);
         } else {
            this.b(bjy.a);
            this.g(false);
         }
      } else {
         this.b(bjy.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected apf w() {
      if (this.s()) {
         if (this.gi()) {
            return apg.dq;
         } else {
            return this.ag.a(4) == 0 ? apg.dr : apg.dj;
         }
      } else {
         return apg.dk;
      }
   }

   @Override
   public int O() {
      return 120;
   }

   public void gp() {
      this.a(apg.dn, this.eV(), this.eW());
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.dp;
   }

   @Override
   protected apf l_() {
      return apg.dl;
   }

   public static bkr.a gq() {
      return bjo.A().a(bks.l, 10.0).a(bks.m, 0.3F).a(bks.c, 3.0);
   }

   @Override
   protected void a(cca $$0, bhd $$1, cjl $$2) {
      if (this.m($$2)) {
         this.a(apg.dm, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gr() {
      return (float)this.b(bks.c);
   }

   @Override
   public boolean C(biw $$0) {
      return $$0.a(this.dM().b((bjm)this), this.gr());
   }

   @Override
   public void l() {
      super.l();
      if (this.cf != null && this.cf.i() && !this.s() && this.ah % 100 == 0) {
         this.a(apg.do, 1.0F, 1.0F);
      }

      this.gs();
   }

   private void gs() {
      if ((this.gm() || this.gn()) && this.ah % 5 == 0) {
         this.a(apg.dq, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
      }

      this.gt();
      this.gu();
   }

   private void gt() {
      this.ch = this.cg;
      this.cj = this.ci;
      if (this.gm()) {
         this.cg = Math.min(1.0F, this.cg + 0.15F);
         this.ci = Math.min(1.0F, this.ci + 0.08F);
      } else {
         this.cg = Math.max(0.0F, this.cg - 0.22F);
         this.ci = Math.max(0.0F, this.ci - 0.13F);
      }
   }

   private void gu() {
      this.cl = this.ck;
      if (this.gn()) {
         this.ck = Math.min(1.0F, this.ck + 0.1F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.13F);
      }
   }

   public float E(float $$0) {
      return asb.i($$0, this.ch, this.cg);
   }

   public float F(float $$0) {
      return asb.i($$0, this.cj, this.ci);
   }

   public float G(float $$0) {
      return asb.i($$0, this.cl, this.ck);
   }

   @Nullable
   public bva b(akt $$0, bir $$1) {
      bva $$2 = bja.m.a((cqb)$$0);
      if ($$2 != null && $$1 instanceof bva $$3) {
         if (this.ag.h()) {
            $$2.a(this.gl());
         } else {
            $$2.a($$3.gl());
         }

         if (this.s()) {
            $$2.b(this.d());
            $$2.x(true);
            if (this.ag.h()) {
               $$2.a(this.go());
            } else {
               $$2.a($$3.go());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(bux $$0) {
      if (!this.s()) {
         return false;
      } else {
         return !($$0 instanceof bva $$1) ? false : $$1.s() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      boolean $$5 = $$0.an() > 0.9F;
      aqk<bvb> $$6 = $$5 ? apw.b : apw.a;
      jb.ak.b($$6).flatMap($$1x -> $$1x.a($$0.D_())).ifPresent($$0x -> this.a((bvb)$$0x.a()));
      akt $$7 = $$0.C();
      if ($$7.a().a(this.dl(), aqg.n).b()) {
         this.a(jb.ak.e(bvb.k));
         this.fJ();
      }

      return $$3;
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      cjg $$3 = $$2.d();
      if (this.dL().B) {
         if (this.s() && this.j($$0)) {
            return bhe.a;
         } else {
            return !this.m($$2) || !(this.eu() < this.eL()) && this.s() ? bhe.d : bhe.a;
         }
      } else {
         if (this.s()) {
            if (this.j($$0)) {
               if (!($$3 instanceof cia)) {
                  if ($$3.u() && this.m($$2) && this.eu() < this.eL()) {
                     this.a($$0, $$1, $$2);
                     this.b((float)$$3.v().a());
                     return bhe.b;
                  }

                  bhe $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.m_()) {
                     this.z(!this.ge());
                  }

                  return $$5;
               }

               chz $$4 = ((cia)$$3).d();
               if ($$4 != this.go()) {
                  this.a($$4);
                  if (!$$0.fT().d) {
                     $$2.h(1);
                  }

                  this.fJ();
                  return bhe.b;
               }
            }
         } else if (this.m($$2)) {
            this.a($$0, $$1, $$2);
            if (this.ag.a(3) == 0) {
               this.f($$0);
               this.z(true);
               this.dL().a(this, (byte)7);
            } else {
               this.dL().a(this, (byte)6);
            }

            this.fJ();
            return bhe.b;
         }

         bhe $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fJ();
         }

         return $$6;
      }
   }

   @Override
   public boolean m(cjl $$0) {
      return bZ.a($$0);
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public boolean h(double $$0) {
      return !this.s() && this.ah > 2400;
   }

   @Override
   protected void t() {
      if (this.ce == null) {
         this.ce = new bva.a<>(this, cca.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.ce);
      if (!this.s()) {
         this.bO.a(4, this.ce);
      }
   }

   @Override
   public boolean bS() {
      return this.bW() || super.bS();
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }

   static class a<T extends bjm> extends bpo<T> {
      private final bva i;

      public a(bva $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, biz.e::test);
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

   static class b extends bqh {
      private final bva a;
      @Nullable
      private cca b;
      @Nullable
      private gw c;
      private int d;

      public b(bva $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.s()) {
            return false;
         } else if (this.a.ge()) {
            return false;
         } else {
            bjm $$0 = this.a.O_();
            if ($$0 instanceof cca) {
               this.b = (cca)$$0;
               if (!$$0.fD()) {
                  return false;
               }

               if (this.a.f((biw)this.b) > 100.0) {
                  return false;
               }

               gw $$1 = this.b.dl();
               dfd $$2 = this.a.dL().a_($$1);
               if ($$2.a(apv.R)) {
                  this.c = $$2.d(csv.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new gw($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (bva $$1 : this.a.dL().a(bva.class, new ehc(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gm() || $$1.gn())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.s() && !this.a.ge() && this.b != null && this.b.fD() && this.c != null && !this.h();
      }

      @Override
      public void c() {
         if (this.c != null) {
            this.a.y(false);
            this.a.L().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void d() {
         this.a.A(false);
         float $$0 = this.a.dL().f(1.0F);
         if (this.b.fW() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dL().D_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.L().n();
      }

      private void i() {
         ash $$0 = this.a.ef();
         gw.a $$1 = new gw.a();
         $$1.g(this.a.fS() ? this.a.fT().dl() : this.a.dl());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dl());
         ecs $$2 = this.a.dL().n().aH().getLootTable(eci.am);
         ecq $$3 = new ecq.a((akt)this.a.dL()).a(eev.f, this.a.dj()).a(eev.a, this.a).a(eeu.i);

         for (cjl $$5 : $$2.a($$3)) {
            this.a
               .dL()
               .b(
                  new byt(
                     this.a.dL(),
                     (double)$$1.u() - (double)asb.a(this.a.aU * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)asb.b(this.a.aU * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void e() {
         if (this.b != null && this.c != null) {
            this.a.y(false);
            this.a.L().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.f((biw)this.b) < 2.5) {
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

   static class c extends brp {
      @Nullable
      private cca c;
      private final bva d;

      public c(bva $$0, double $$1, cmm $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.ef().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.ef().a(this.a(500)) == 0) {
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
