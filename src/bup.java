import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bup extends bjw implements bjz<buq> {
   public static final double bW = 0.6;
   public static final double bX = 0.8;
   public static final double bY = 1.33;
   private static final cmb bZ = cmb.a(cjd.ql, cjd.qm);
   private static final aec<buq> ca = aef.a(bup.class, aee.w);
   private static final aec<Boolean> cb = aef.a(bup.class, aee.k);
   private static final aec<Boolean> cc = aef.a(bup.class, aee.k);
   private static final aec<Integer> cd = aef.a(bup.class, aee.b);
   private bup.a<cbp> ce;
   @Nullable
   private bre cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;

   public bup(bip<? extends bup> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public aeu gg() {
      return this.gh().a();
   }

   @Override
   protected void w() {
      this.cf = new bup.c(this, 0.6, bZ, true);
      this.bO.a(1, new bpq(this));
      this.bO.a(1, new bqp(this, 1.5));
      this.bO.a(2, new brb(this));
      this.bO.a(3, new bup.b(this));
      this.bO.a(4, this.cf);
      this.bO.a(5, new bpj(this, 1.1, 8));
      this.bO.a(6, new bpu(this, 1.0, 10.0F, 5.0F, false));
      this.bO.a(7, new bpk(this, 0.8));
      this.bO.a(8, new bqc(this, 0.3F));
      this.bO.a(9, new bqm(this));
      this.bO.a(10, new bpi(this, 0.8));
      this.bO.a(11, new brj(this, 0.8, 1.0000001E-5F));
      this.bO.a(12, new bqe(this, cbp.class, 10.0F));
      this.bP.a(1, new brs<>(this, bvg.class, false, null));
      this.bP.a(1, new brs<>(this, bvn.class, false, bvn.bU));
   }

   public buq gh() {
      return this.an.b(ca);
   }

   public void a(buq $$0) {
      this.an.b(ca, $$0);
   }

   public void A(boolean $$0) {
      this.an.b(cb, $$0);
   }

   public boolean gi() {
      return this.an.b(cb);
   }

   public void B(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public boolean gj() {
      return this.an.b(cc);
   }

   public cho gk() {
      return cho.a(this.an.b(cd));
   }

   public void a(cho $$0) {
      this.an.b(cd, $$0.a());
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, jd.aj.e(buq.b));
      this.an.a(cb, false);
      this.an.a(cc, false);
      this.an.a(cd, cho.o.a());
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("variant", jd.aj.b(this.gh()).toString());
      $$0.a("CollarColor", (byte)this.gk().a());
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      buq $$1 = jd.aj.a(aeu.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(cho.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void V() {
      if (this.E().b()) {
         double $$0 = this.E().c();
         if ($$0 == 0.6) {
            this.b(bjn.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bjn.a);
            this.g(true);
         } else {
            this.b(bjn.a);
            this.g(false);
         }
      } else {
         this.b(bjn.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected aoy r() {
      if (this.p()) {
         if (this.ge()) {
            return aoz.dq;
         } else {
            return this.ag.a(4) == 0 ? aoz.dr : aoz.dj;
         }
      } else {
         return aoz.dk;
      }
   }

   @Override
   public int L() {
      return 120;
   }

   public void gl() {
      this.a(aoz.dn, this.eU(), this.eV());
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.dp;
   }

   @Override
   protected aoy h_() {
      return aoz.dl;
   }

   public static bkg.a gm() {
      return bjd.x().a(bkh.a, 10.0).a(bkh.d, 0.3F).a(bkh.f, 3.0);
   }

   @Override
   protected void a(cbp $$0, bgs $$1, cja $$2) {
      if (this.m($$2)) {
         this.a(aoz.dm, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gn() {
      return (float)this.b(bkh.f);
   }

   @Override
   public boolean C(bil $$0) {
      return $$0.a(this.dL().b((bjb)this), this.gn());
   }

   @Override
   public void l() {
      super.l();
      if (this.cf != null && this.cf.i() && !this.p() && this.ah % 100 == 0) {
         this.a(aoz.do, 1.0F, 1.0F);
      }

      this.go();
   }

   private void go() {
      if ((this.gi() || this.gj()) && this.ah % 5 == 0) {
         this.a(aoz.dq, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
      }

      this.gp();
      this.gq();
   }

   private void gp() {
      this.ch = this.cg;
      this.cj = this.ci;
      if (this.gi()) {
         this.cg = Math.min(1.0F, this.cg + 0.15F);
         this.ci = Math.min(1.0F, this.ci + 0.08F);
      } else {
         this.cg = Math.max(0.0F, this.cg - 0.22F);
         this.ci = Math.max(0.0F, this.ci - 0.13F);
      }
   }

   private void gq() {
      this.cl = this.ck;
      if (this.gj()) {
         this.ck = Math.min(1.0F, this.ck + 0.1F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.13F);
      }
   }

   public float E(float $$0) {
      return ars.i($$0, this.ch, this.cg);
   }

   public float F(float $$0) {
      return ars.i($$0, this.cj, this.ci);
   }

   public float G(float $$0) {
      return ars.i($$0, this.cl, this.ck);
   }

   @Nullable
   public bup b(akn $$0, big $$1) {
      bup $$2 = bip.m.a((cpq)$$0);
      if ($$2 != null && $$1 instanceof bup $$3) {
         if (this.ag.h()) {
            $$2.a(this.gh());
         } else {
            $$2.a($$3.gh());
         }

         if (this.p()) {
            $$2.b(this.d());
            $$2.x(true);
            if (this.ag.h()) {
               $$2.a(this.gk());
            } else {
               $$2.a($$3.gk());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(bum $$0) {
      if (!this.p()) {
         return false;
      } else {
         return !($$0 instanceof bup $$1) ? false : $$1.p() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      boolean $$5 = $$0.an() > 0.9F;
      aqd<buq> $$6 = $$5 ? app.b : app.a;
      jd.aj.b($$6).flatMap($$1x -> $$1x.a($$0.y_())).ifPresent($$0x -> this.a((buq)$$0x.a()));
      akn $$7 = $$0.C();
      if ($$7.a().a(this.dk(), apz.g).b()) {
         this.a(jd.aj.e(buq.k));
         this.fF();
      }

      return $$3;
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      civ $$3 = $$2.d();
      if (this.dK().B) {
         if (this.p() && this.j($$0)) {
            return bgt.a;
         } else {
            return !this.m($$2) || !(this.et() < this.eK()) && this.p() ? bgt.d : bgt.a;
         }
      } else {
         if (this.p()) {
            if (this.j($$0)) {
               if (!($$3 instanceof chp)) {
                  if ($$3.u() && this.m($$2) && this.et() < this.eK()) {
                     this.a($$0, $$1, $$2);
                     this.b((float)$$3.v().a());
                     return bgt.b;
                  }

                  bgt $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.i_()) {
                     this.z(!this.ga());
                  }

                  return $$5;
               }

               cho $$4 = ((chp)$$3).d();
               if ($$4 != this.gk()) {
                  this.a($$4);
                  if (!$$0.fR().d) {
                     $$2.h(1);
                  }

                  this.fF();
                  return bgt.b;
               }
            }
         } else if (this.m($$2)) {
            this.a($$0, $$1, $$2);
            if (this.ag.a(3) == 0) {
               this.f($$0);
               this.z(true);
               this.dK().a(this, (byte)7);
            } else {
               this.dK().a(this, (byte)6);
            }

            this.fF();
            return bgt.b;
         }

         bgt $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fF();
         }

         return $$6;
      }
   }

   @Override
   public boolean m(cja $$0) {
      return bZ.a($$0);
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public boolean h(double $$0) {
      return !this.p() && this.ah > 2400;
   }

   @Override
   protected void q() {
      if (this.ce == null) {
         this.ce = new bup.a<>(this, cbp.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.ce);
      if (!this.p()) {
         this.bO.a(4, this.ce);
      }
   }

   @Override
   public boolean bS() {
      return this.bW() || super.bS();
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }

   static class a<T extends bjb> extends bpd<T> {
      private final bup i;

      public a(bup $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bio.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.p() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.p() && super.b();
      }
   }

   static class b extends bpw {
      private final bup a;
      @Nullable
      private cbp b;
      @Nullable
      private gw c;
      private int d;

      public b(bup $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.p()) {
            return false;
         } else if (this.a.ga()) {
            return false;
         } else {
            bjb $$0 = this.a.I_();
            if ($$0 instanceof cbp) {
               this.b = (cbp)$$0;
               if (!$$0.fB()) {
                  return false;
               }

               if (this.a.f((bil)this.b) > 100.0) {
                  return false;
               }

               gw $$1 = this.b.dk();
               dfe $$2 = this.a.dK().a_($$1);
               if ($$2.a(apo.R)) {
                  this.c = $$2.d(csj.aC).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new gw($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (bup $$1 : this.a.dK().a(bup.class, new ehd(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gi() || $$1.gj())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.p() && !this.a.ga() && this.b != null && this.b.fB() && this.c != null && !this.h();
      }

      @Override
      public void c() {
         if (this.c != null) {
            this.a.y(false);
            this.a.H().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void d() {
         this.a.A(false);
         float $$0 = this.a.dK().f(1.0F);
         if (this.b.fU() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dK().y_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.H().n();
      }

      private void i() {
         arx $$0 = this.a.ee();
         gw.a $$1 = new gw.a();
         $$1.g(this.a.fO() ? this.a.fP().dk() : this.a.dk());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dk());
         ect $$2 = this.a.dK().n().aH().getLootTable(ecj.am);
         ecr $$3 = new ecr.a((akn)this.a.dK()).a(eew.f, this.a.di()).a(eew.a, this.a).a(eev.i);

         for (cja $$5 : $$2.a($$3)) {
            this.a
               .dK()
               .b(
                  new byi(
                     this.a.dK(),
                     (double)$$1.u() - (double)ars.a(this.a.aU * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)ars.b(this.a.aU * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void e() {
         if (this.b != null && this.c != null) {
            this.a.y(false);
            this.a.H().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.f((bil)this.b) < 2.5) {
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

   static class c extends bre {
      @Nullable
      private cbp c;
      private final bup d;

      public c(bup $$0, double $$1, cmb $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.ee().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.ee().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.p();
      }
   }
}
