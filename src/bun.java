import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bun extends bju implements bjx<buo> {
   public static final double bW = 0.6;
   public static final double bX = 0.8;
   public static final double bY = 1.33;
   private static final cly bZ = cly.a(cjb.ql, cjb.qm);
   private static final adz<buo> ca = aec.a(bun.class, aeb.w);
   private static final adz<Boolean> cb = aec.a(bun.class, aeb.k);
   private static final adz<Boolean> cc = aec.a(bun.class, aeb.k);
   private static final adz<Integer> cd = aec.a(bun.class, aeb.b);
   private bun.a<cbn> ce;
   @Nullable
   private brc cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;

   public bun(bim<? extends bun> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public aer gf() {
      return this.gg().a();
   }

   @Override
   protected void w() {
      this.cf = new bun.c(this, 0.6, bZ, true);
      this.bO.a(1, new bpo(this));
      this.bO.a(1, new bqn(this, 1.5));
      this.bO.a(2, new bqz(this));
      this.bO.a(3, new bun.b(this));
      this.bO.a(4, this.cf);
      this.bO.a(5, new bph(this, 1.1, 8));
      this.bO.a(6, new bps(this, 1.0, 10.0F, 5.0F, false));
      this.bO.a(7, new bpi(this, 0.8));
      this.bO.a(8, new bqa(this, 0.3F));
      this.bO.a(9, new bqk(this));
      this.bO.a(10, new bpg(this, 0.8));
      this.bO.a(11, new brh(this, 0.8, 1.0000001E-5F));
      this.bO.a(12, new bqc(this, cbn.class, 10.0F));
      this.bP.a(1, new brq<>(this, bve.class, false, null));
      this.bP.a(1, new brq<>(this, bvl.class, false, bvl.bU));
   }

   public buo gg() {
      return this.an.b(ca);
   }

   public void a(buo $$0) {
      this.an.b(ca, $$0);
   }

   public void A(boolean $$0) {
      this.an.b(cb, $$0);
   }

   public boolean gh() {
      return this.an.b(cb);
   }

   public void B(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public boolean gi() {
      return this.an.b(cc);
   }

   public chm gj() {
      return chm.a(this.an.b(cd));
   }

   public void a(chm $$0) {
      this.an.b(cd, $$0.a());
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, jb.aj.e(buo.b));
      this.an.a(cb, false);
      this.an.a(cc, false);
      this.an.a(cd, chm.o.a());
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("variant", jb.aj.b(this.gg()).toString());
      $$0.a("CollarColor", (byte)this.gj().a());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      buo $$1 = jb.aj.a(aer.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(chm.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void V() {
      if (this.E().b()) {
         double $$0 = this.E().c();
         if ($$0 == 0.6) {
            this.b(bjk.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bjk.a);
            this.g(true);
         } else {
            this.b(bjk.a);
            this.g(false);
         }
      } else {
         this.b(bjk.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected aov r() {
      if (this.p()) {
         if (this.gd()) {
            return aow.dq;
         } else {
            return this.ag.a(4) == 0 ? aow.dr : aow.dj;
         }
      } else {
         return aow.dk;
      }
   }

   @Override
   public int L() {
      return 120;
   }

   public void gk() {
      this.a(aow.dn, this.eU(), this.eV());
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.dp;
   }

   @Override
   protected aov h_() {
      return aow.dl;
   }

   public static bke.a gl() {
      return bja.x().a(bkf.a, 10.0).a(bkf.d, 0.3F).a(bkf.f, 3.0);
   }

   @Override
   protected void a(cbn $$0, bgp $$1, ciy $$2) {
      if (this.m($$2)) {
         this.a(aow.dm, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gm() {
      return (float)this.b(bkf.f);
   }

   @Override
   public boolean C(bii $$0) {
      return $$0.a(this.dL().b((biy)this), this.gm());
   }

   @Override
   public void l() {
      super.l();
      if (this.cf != null && this.cf.i() && !this.p() && this.ah % 100 == 0) {
         this.a(aow.do, 1.0F, 1.0F);
      }

      this.gn();
   }

   private void gn() {
      if ((this.gh() || this.gi()) && this.ah % 5 == 0) {
         this.a(aow.dq, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
      }

      this.go();
      this.gp();
   }

   private void go() {
      this.ch = this.cg;
      this.cj = this.ci;
      if (this.gh()) {
         this.cg = Math.min(1.0F, this.cg + 0.15F);
         this.ci = Math.min(1.0F, this.ci + 0.08F);
      } else {
         this.cg = Math.max(0.0F, this.cg - 0.22F);
         this.ci = Math.max(0.0F, this.ci - 0.13F);
      }
   }

   private void gp() {
      this.cl = this.ck;
      if (this.gi()) {
         this.ck = Math.min(1.0F, this.ck + 0.1F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.13F);
      }
   }

   public float E(float $$0) {
      return arp.i($$0, this.ch, this.cg);
   }

   public float F(float $$0) {
      return arp.i($$0, this.cj, this.ci);
   }

   public float G(float $$0) {
      return arp.i($$0, this.cl, this.ck);
   }

   @Nullable
   public bun b(akk $$0, bid $$1) {
      bun $$2 = bim.m.a((cpm)$$0);
      if ($$2 != null && $$1 instanceof bun $$3) {
         if (this.ag.h()) {
            $$2.a(this.gg());
         } else {
            $$2.a($$3.gg());
         }

         if (this.p()) {
            $$2.b(this.U_());
            $$2.x(true);
            if (this.ag.h()) {
               $$2.a(this.gj());
            } else {
               $$2.a($$3.gj());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(buk $$0) {
      if (!this.p()) {
         return false;
      } else {
         return !($$0 instanceof bun $$1) ? false : $$1.p() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      boolean $$5 = $$0.an() > 0.9F;
      aqa<buo> $$6 = $$5 ? apm.b : apm.a;
      jb.aj.b($$6).flatMap($$1x -> $$1x.a($$0.y_())).ifPresent($$0x -> this.a((buo)$$0x.a()));
      akk $$7 = $$0.C();
      if ($$7.a().a(this.dk(), apw.g).b()) {
         this.a(jb.aj.e(buo.k));
         this.fF();
      }

      return $$3;
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      cit $$3 = $$2.d();
      if (this.dK().B) {
         if (this.p() && this.l($$0)) {
            return bgq.a;
         } else {
            return !this.m($$2) || !(this.et() < this.eK()) && this.p() ? bgq.d : bgq.a;
         }
      } else {
         if (this.p()) {
            if (this.l($$0)) {
               if (!($$3 instanceof chn)) {
                  if ($$3.u() && this.m($$2) && this.et() < this.eK()) {
                     this.a($$0, $$1, $$2);
                     this.b((float)$$3.v().a());
                     return bgq.b;
                  }

                  bgq $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.i_()) {
                     this.z(!this.fZ());
                  }

                  return $$5;
               }

               chm $$4 = ((chn)$$3).d();
               if ($$4 != this.gj()) {
                  this.a($$4);
                  if (!$$0.fR().d) {
                     $$2.h(1);
                  }

                  this.fF();
                  return bgq.b;
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
            return bgq.b;
         }

         bgq $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fF();
         }

         return $$6;
      }
   }

   @Override
   public boolean m(ciy $$0) {
      return bZ.a($$0);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public boolean h(double $$0) {
      return !this.p() && this.ah > 2400;
   }

   @Override
   protected void q() {
      if (this.ce == null) {
         this.ce = new bun.a<>(this, cbn.class, 16.0F, 0.8, 1.33);
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
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }

   static class a<T extends biy> extends bpb<T> {
      private final bun i;

      public a(bun $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bil.e::test);
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

   static class b extends bpu {
      private final bun a;
      @Nullable
      private cbn b;
      @Nullable
      private gu c;
      private int d;

      public b(bun $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.p()) {
            return false;
         } else if (this.a.fZ()) {
            return false;
         } else {
            biy $$0 = this.a.I_();
            if ($$0 instanceof cbn) {
               this.b = (cbn)$$0;
               if (!$$0.fB()) {
                  return false;
               }

               if (this.a.f((bii)this.b) > 100.0) {
                  return false;
               }

               gu $$1 = this.b.dk();
               dfa $$2 = this.a.dK().a_($$1);
               if ($$2.a(apl.R)) {
                  this.c = $$2.d(csf.aC).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new gu($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (bun $$1 : this.a.dK().a(bun.class, new egz(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gh() || $$1.gi())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.p() && !this.a.fZ() && this.b != null && this.b.fB() && this.c != null && !this.h();
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
         aru $$0 = this.a.ee();
         gu.a $$1 = new gu.a();
         $$1.g(this.a.fO() ? this.a.fP().dk() : this.a.dk());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dk());
         ecp $$2 = this.a.dK().n().aH().getLootTable(ecf.am);
         ecn $$3 = new ecn.a((akk)this.a.dK()).a(ees.f, this.a.di()).a(ees.a, this.a).a(eer.i);

         for (ciy $$5 : $$2.a($$3)) {
            this.a
               .dK()
               .b(
                  new byg(
                     this.a.dK(),
                     (double)$$1.u() - (double)arp.a(this.a.aU * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)arp.b(this.a.aU * (float) (Math.PI / 180.0)),
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
            if (this.a.f((bii)this.b) < 2.5) {
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

   static class c extends brc {
      @Nullable
      private cbn c;
      private final bun d;

      public c(bun $$0, double $$1, cly $$2, boolean $$3) {
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
