import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bul extends bjs implements bjv<bum> {
   public static final double bW = 0.6;
   public static final double bX = 0.8;
   public static final double bY = 1.33;
   private static final clw bZ = clw.a(ciz.ql, ciz.qm);
   private static final adx<bum> ca = aea.a(bul.class, adz.w);
   private static final adx<Boolean> cb = aea.a(bul.class, adz.k);
   private static final adx<Boolean> cc = aea.a(bul.class, adz.k);
   private static final adx<Integer> cd = aea.a(bul.class, adz.b);
   private bul.a<cbl> ce;
   @Nullable
   private bra cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;

   public bul(bik<? extends bul> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public aep gf() {
      return this.gg().a();
   }

   @Override
   protected void w() {
      this.cf = new bul.c(this, 0.6, bZ, true);
      this.bO.a(1, new bpm(this));
      this.bO.a(1, new bql(this, 1.5));
      this.bO.a(2, new bqx(this));
      this.bO.a(3, new bul.b(this));
      this.bO.a(4, this.cf);
      this.bO.a(5, new bpf(this, 1.1, 8));
      this.bO.a(6, new bpq(this, 1.0, 10.0F, 5.0F, false));
      this.bO.a(7, new bpg(this, 0.8));
      this.bO.a(8, new bpy(this, 0.3F));
      this.bO.a(9, new bqi(this));
      this.bO.a(10, new bpe(this, 0.8));
      this.bO.a(11, new brf(this, 0.8, 1.0000001E-5F));
      this.bO.a(12, new bqa(this, cbl.class, 10.0F));
      this.bP.a(1, new bro<>(this, bvc.class, false, null));
      this.bP.a(1, new bro<>(this, bvj.class, false, bvj.bU));
   }

   public bum gg() {
      return this.an.b(ca);
   }

   public void a(bum $$0) {
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

   public chk gj() {
      return chk.a(this.an.b(cd));
   }

   public void a(chk $$0) {
      this.an.b(cd, $$0.a());
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, jc.aj.e(bum.b));
      this.an.a(cb, false);
      this.an.a(cc, false);
      this.an.a(cd, chk.o.a());
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("variant", jc.aj.b(this.gg()).toString());
      $$0.a("CollarColor", (byte)this.gj().a());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      bum $$1 = jc.aj.a(aep.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(chk.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void V() {
      if (this.E().b()) {
         double $$0 = this.E().c();
         if ($$0 == 0.6) {
            this.b(bji.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bji.a);
            this.g(true);
         } else {
            this.b(bji.a);
            this.g(false);
         }
      } else {
         this.b(bji.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected aot r() {
      if (this.p()) {
         if (this.gd()) {
            return aou.dq;
         } else {
            return this.ag.a(4) == 0 ? aou.dr : aou.dj;
         }
      } else {
         return aou.dk;
      }
   }

   @Override
   public int L() {
      return 120;
   }

   public void gk() {
      this.a(aou.dn, this.eU(), this.eV());
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.dp;
   }

   @Override
   protected aot h_() {
      return aou.dl;
   }

   public static bkc.a gl() {
      return biy.x().a(bkd.a, 10.0).a(bkd.d, 0.3F).a(bkd.f, 3.0);
   }

   @Override
   protected void a(cbl $$0, bgn $$1, ciw $$2) {
      if (this.m($$2)) {
         this.a(aou.dm, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gm() {
      return (float)this.b(bkd.f);
   }

   @Override
   public boolean C(big $$0) {
      return $$0.a(this.dL().b((biw)this), this.gm());
   }

   @Override
   public void l() {
      super.l();
      if (this.cf != null && this.cf.i() && !this.p() && this.ah % 100 == 0) {
         this.a(aou.do, 1.0F, 1.0F);
      }

      this.gn();
   }

   private void gn() {
      if ((this.gh() || this.gi()) && this.ah % 5 == 0) {
         this.a(aou.dq, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
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
      return aro.i($$0, this.ch, this.cg);
   }

   public float F(float $$0) {
      return aro.i($$0, this.cj, this.ci);
   }

   public float G(float $$0) {
      return aro.i($$0, this.cl, this.ck);
   }

   @Nullable
   public bul b(aki $$0, bib $$1) {
      bul $$2 = bik.m.a((cpk)$$0);
      if ($$2 != null && $$1 instanceof bul $$3) {
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
   public boolean a(bui $$0) {
      if (!this.p()) {
         return false;
      } else {
         return !($$0 instanceof bul $$1) ? false : $$1.p() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      boolean $$5 = $$0.an() > 0.9F;
      apy<bum> $$6 = $$5 ? apk.b : apk.a;
      jc.aj.b($$6).flatMap($$1x -> $$1x.a($$0.y_())).ifPresent($$0x -> this.a((bum)$$0x.a()));
      aki $$7 = $$0.C();
      if ($$7.a().a(this.dk(), apu.g).b()) {
         this.a(jc.aj.e(bum.k));
         this.fF();
      }

      return $$3;
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      cir $$3 = $$2.d();
      if (this.dK().B) {
         if (this.p() && this.l($$0)) {
            return bgo.a;
         } else {
            return !this.m($$2) || !(this.et() < this.eK()) && this.p() ? bgo.d : bgo.a;
         }
      } else {
         if (this.p()) {
            if (this.l($$0)) {
               if (!($$3 instanceof chl)) {
                  if ($$3.u() && this.m($$2) && this.et() < this.eK()) {
                     this.a($$0, $$1, $$2);
                     this.b((float)$$3.v().a());
                     return bgo.b;
                  }

                  bgo $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.i_()) {
                     this.z(!this.fZ());
                  }

                  return $$5;
               }

               chk $$4 = ((chl)$$3).d();
               if ($$4 != this.gj()) {
                  this.a($$4);
                  if (!$$0.fR().d) {
                     $$2.h(1);
                  }

                  this.fF();
                  return bgo.b;
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
            return bgo.b;
         }

         bgo $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fF();
         }

         return $$6;
      }
   }

   @Override
   public boolean m(ciw $$0) {
      return bZ.a($$0);
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public boolean h(double $$0) {
      return !this.p() && this.ah > 2400;
   }

   @Override
   protected void q() {
      if (this.ce == null) {
         this.ce = new bul.a<>(this, cbl.class, 16.0F, 0.8, 1.33);
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
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }

   static class a<T extends biw> extends boz<T> {
      private final bul i;

      public a(bul $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bij.e::test);
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

   static class b extends bps {
      private final bul a;
      @Nullable
      private cbl b;
      @Nullable
      private gv c;
      private int d;

      public b(bul $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.p()) {
            return false;
         } else if (this.a.fZ()) {
            return false;
         } else {
            biw $$0 = this.a.I_();
            if ($$0 instanceof cbl) {
               this.b = (cbl)$$0;
               if (!$$0.fB()) {
                  return false;
               }

               if (this.a.f((big)this.b) > 100.0) {
                  return false;
               }

               gv $$1 = this.b.dk();
               dey $$2 = this.a.dK().a_($$1);
               if ($$2.a(apj.R)) {
                  this.c = $$2.d(csd.aC).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new gv($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (bul $$1 : this.a.dK().a(bul.class, new eha(this.c).g(2.0))) {
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
         art $$0 = this.a.ee();
         gv.a $$1 = new gv.a();
         $$1.g(this.a.fO() ? this.a.fP().dk() : this.a.dk());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dk());
         ecp $$2 = this.a.dK().n().aH().getLootTable(ecd.am);
         ecn $$3 = new ecn.a((aki)this.a.dK()).a(eet.f, this.a.di()).a(eet.a, this.a).a(ees.h);

         for (ciw $$5 : $$2.a($$3)) {
            this.a
               .dK()
               .b(
                  new bye(
                     this.a.dK(),
                     (double)$$1.u() - (double)aro.a(this.a.aU * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)aro.b(this.a.aU * (float) (Math.PI / 180.0)),
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
            if (this.a.f((big)this.b) < 2.5) {
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

   static class c extends bra {
      @Nullable
      private cbl c;
      private final bul d;

      public c(bul $$0, double $$1, clw $$2, boolean $$3) {
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
