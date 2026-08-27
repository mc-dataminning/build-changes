import javax.annotation.Nullable;
import org.joml.Vector3f;

public class buu extends bkb implements bke<buv> {
   public static final double bW = 0.6;
   public static final double bX = 0.8;
   public static final double bY = 1.33;
   private static final cmg bZ = cmg.a(cji.ql, cji.qm);
   private static final aef<buv> ca = aei.a(buu.class, aeh.w);
   private static final aef<Boolean> cb = aei.a(buu.class, aeh.k);
   private static final aef<Boolean> cc = aei.a(buu.class, aeh.k);
   private static final aef<Integer> cd = aei.a(buu.class, aeh.b);
   private buu.a<cbu> ce;
   @Nullable
   private brj cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;

   public buu(biu<? extends buu> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public aex gj() {
      return this.gk().a();
   }

   @Override
   protected void z() {
      this.cf = new buu.c(this, 0.6, bZ, true);
      this.bO.a(1, new bpv(this));
      this.bO.a(1, new bqu(this, 1.5));
      this.bO.a(2, new brg(this));
      this.bO.a(3, new buu.b(this));
      this.bO.a(4, this.cf);
      this.bO.a(5, new bpo(this, 1.1, 8));
      this.bO.a(6, new bpz(this, 1.0, 10.0F, 5.0F, false));
      this.bO.a(7, new bpp(this, 0.8));
      this.bO.a(8, new bqh(this, 0.3F));
      this.bO.a(9, new bqr(this));
      this.bO.a(10, new bpn(this, 0.8));
      this.bO.a(11, new bro(this, 0.8, 1.0000001E-5F));
      this.bO.a(12, new bqj(this, cbu.class, 10.0F));
      this.bP.a(1, new brx<>(this, bvl.class, false, null));
      this.bP.a(1, new brx<>(this, bvs.class, false, bvs.bU));
   }

   public buv gk() {
      return this.an.b(ca);
   }

   public void a(buv $$0) {
      this.an.b(ca, $$0);
   }

   public void A(boolean $$0) {
      this.an.b(cb, $$0);
   }

   public boolean gl() {
      return this.an.b(cb);
   }

   public void B(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public boolean gm() {
      return this.an.b(cc);
   }

   public cht gn() {
      return cht.a(this.an.b(cd));
   }

   public void a(cht $$0) {
      this.an.b(cd, $$0.a());
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, jd.aj.e(buv.b));
      this.an.a(cb, false);
      this.an.a(cc, false);
      this.an.a(cd, cht.o.a());
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("variant", jd.aj.b(this.gk()).toString());
      $$0.a("CollarColor", (byte)this.gn().a());
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      buv $$1 = jd.aj.a(aex.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(cht.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void X() {
      if (this.I().b()) {
         double $$0 = this.I().c();
         if ($$0 == 0.6) {
            this.b(bjs.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bjs.a);
            this.g(true);
         } else {
            this.b(bjs.a);
            this.g(false);
         }
      } else {
         this.b(bjs.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected apd w() {
      if (this.s()) {
         if (this.gh()) {
            return ape.dq;
         } else {
            return this.ag.a(4) == 0 ? ape.dr : ape.dj;
         }
      } else {
         return ape.dk;
      }
   }

   @Override
   public int O() {
      return 120;
   }

   public void go() {
      this.a(ape.dn, this.eV(), this.eW());
   }

   @Override
   protected apd d(bho $$0) {
      return ape.dp;
   }

   @Override
   protected apd l_() {
      return ape.dl;
   }

   public static bkl.a gp() {
      return bji.A().a(bkm.a, 10.0).a(bkm.d, 0.3F).a(bkm.f, 3.0);
   }

   @Override
   protected void a(cbu $$0, bgx $$1, cjf $$2) {
      if (this.m($$2)) {
         this.a(ape.dm, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gq() {
      return (float)this.b(bkm.f);
   }

   @Override
   public boolean C(biq $$0) {
      return $$0.a(this.dM().b((bjg)this), this.gq());
   }

   @Override
   public void l() {
      super.l();
      if (this.cf != null && this.cf.i() && !this.s() && this.ah % 100 == 0) {
         this.a(ape.do, 1.0F, 1.0F);
      }

      this.gr();
   }

   private void gr() {
      if ((this.gl() || this.gm()) && this.ah % 5 == 0) {
         this.a(ape.dq, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
      }

      this.gs();
      this.gt();
   }

   private void gs() {
      this.ch = this.cg;
      this.cj = this.ci;
      if (this.gl()) {
         this.cg = Math.min(1.0F, this.cg + 0.15F);
         this.ci = Math.min(1.0F, this.ci + 0.08F);
      } else {
         this.cg = Math.max(0.0F, this.cg - 0.22F);
         this.ci = Math.max(0.0F, this.ci - 0.13F);
      }
   }

   private void gt() {
      this.cl = this.ck;
      if (this.gm()) {
         this.ck = Math.min(1.0F, this.ck + 0.1F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.13F);
      }
   }

   public float E(float $$0) {
      return arx.i($$0, this.ch, this.cg);
   }

   public float F(float $$0) {
      return arx.i($$0, this.cj, this.ci);
   }

   public float G(float $$0) {
      return arx.i($$0, this.cl, this.ck);
   }

   @Nullable
   public buu b(akr $$0, bil $$1) {
      buu $$2 = biu.m.a((cpv)$$0);
      if ($$2 != null && $$1 instanceof buu $$3) {
         if (this.ag.h()) {
            $$2.a(this.gk());
         } else {
            $$2.a($$3.gk());
         }

         if (this.s()) {
            $$2.b(this.d());
            $$2.x(true);
            if (this.ag.h()) {
               $$2.a(this.gn());
            } else {
               $$2.a($$3.gn());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(bur $$0) {
      if (!this.s()) {
         return false;
      } else {
         return !($$0 instanceof buu $$1) ? false : $$1.s() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qy $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      boolean $$5 = $$0.an() > 0.9F;
      aqi<buv> $$6 = $$5 ? apu.b : apu.a;
      jd.aj.b($$6).flatMap($$1x -> $$1x.a($$0.D_())).ifPresent($$0x -> this.a((buv)$$0x.a()));
      akr $$7 = $$0.C();
      if ($$7.a().a(this.dl(), aqe.n).b()) {
         this.a(jd.aj.e(buv.k));
         this.fI();
      }

      return $$3;
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      cja $$3 = $$2.d();
      if (this.dL().B) {
         if (this.s() && this.j($$0)) {
            return bgy.a;
         } else {
            return !this.m($$2) || !(this.eu() < this.eL()) && this.s() ? bgy.d : bgy.a;
         }
      } else {
         if (this.s()) {
            if (this.j($$0)) {
               if (!($$3 instanceof chu)) {
                  if ($$3.u() && this.m($$2) && this.eu() < this.eL()) {
                     this.a($$0, $$1, $$2);
                     this.b((float)$$3.v().a());
                     return bgy.b;
                  }

                  bgy $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.m_()) {
                     this.z(!this.gd());
                  }

                  return $$5;
               }

               cht $$4 = ((chu)$$3).d();
               if ($$4 != this.gn()) {
                  this.a($$4);
                  if (!$$0.fS().d) {
                     $$2.h(1);
                  }

                  this.fI();
                  return bgy.b;
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

            this.fI();
            return bgy.b;
         }

         bgy $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fI();
         }

         return $$6;
      }
   }

   @Override
   public boolean m(cjf $$0) {
      return bZ.a($$0);
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public boolean h(double $$0) {
      return !this.s() && this.ah > 2400;
   }

   @Override
   protected void t() {
      if (this.ce == null) {
         this.ce = new buu.a<>(this, cbu.class, 16.0F, 0.8, 1.33);
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
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }

   static class a<T extends bjg> extends bpi<T> {
      private final buu i;

      public a(buu $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bit.e::test);
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

   static class b extends bqb {
      private final buu a;
      @Nullable
      private cbu b;
      @Nullable
      private gw c;
      private int d;

      public b(buu $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.s()) {
            return false;
         } else if (this.a.gd()) {
            return false;
         } else {
            bjg $$0 = this.a.O_();
            if ($$0 instanceof cbu) {
               this.b = (cbu)$$0;
               if (!$$0.fC()) {
                  return false;
               }

               if (this.a.f((biq)this.b) > 100.0) {
                  return false;
               }

               gw $$1 = this.b.dl();
               dfj $$2 = this.a.dL().a_($$1);
               if ($$2.a(apt.R)) {
                  this.c = $$2.d(cso.aC).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new gw($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (buu $$1 : this.a.dL().a(buu.class, new ehi(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gl() || $$1.gm())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.s() && !this.a.gd() && this.b != null && this.b.fC() && this.c != null && !this.h();
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
         if (this.b.fV() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dL().D_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.L().n();
      }

      private void i() {
         asc $$0 = this.a.ef();
         gw.a $$1 = new gw.a();
         $$1.g(this.a.fR() ? this.a.fS().dl() : this.a.dl());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dl());
         ecy $$2 = this.a.dL().n().aH().getLootTable(eco.am);
         ecw $$3 = new ecw.a((akr)this.a.dL()).a(efb.f, this.a.dj()).a(efb.a, this.a).a(efa.i);

         for (cjf $$5 : $$2.a($$3)) {
            this.a
               .dL()
               .b(
                  new byn(
                     this.a.dL(),
                     (double)$$1.u() - (double)arx.a(this.a.aU * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)arx.b(this.a.aU * (float) (Math.PI / 180.0)),
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
            if (this.a.f((biq)this.b) < 2.5) {
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

   static class c extends brj {
      @Nullable
      private cbu c;
      private final buu d;

      public c(buu $$0, double $$1, cmg $$2, boolean $$3) {
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
