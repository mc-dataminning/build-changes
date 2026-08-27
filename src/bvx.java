import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvx extends ble implements blh<bvy> {
   public static final double bW = 0.6;
   public static final double bX = 0.8;
   public static final double bY = 1.33;
   private static final cnk bZ = cnk.a(ckm.ql, ckm.qm);
   private static final afc<bvy> ca = aff.a(bvx.class, afe.w);
   private static final afc<Boolean> cb = aff.a(bvx.class, afe.k);
   private static final afc<Boolean> cc = aff.a(bvx.class, afe.k);
   private static final afc<Integer> cd = aff.a(bvx.class, afe.b);
   private bvx.a<ccx> ce;
   @Nullable
   private bsm cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;

   public bvx(bjx<? extends bvx> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public afw gk() {
      return this.gl().a();
   }

   @Override
   protected void z() {
      this.cf = new bvx.c(this, 0.6, bZ, true);
      this.bO.a(1, new bqy(this));
      this.bO.a(1, new brx(this, 1.5));
      this.bO.a(2, new bsj(this));
      this.bO.a(3, new bvx.b(this));
      this.bO.a(4, this.cf);
      this.bO.a(5, new bqr(this, 1.1, 8));
      this.bO.a(6, new brc(this, 1.0, 10.0F, 5.0F, false));
      this.bO.a(7, new bqs(this, 0.8));
      this.bO.a(8, new brk(this, 0.3F));
      this.bO.a(9, new bru(this));
      this.bO.a(10, new bqq(this, 0.8));
      this.bO.a(11, new bsr(this, 0.8, 1.0000001E-5F));
      this.bO.a(12, new brm(this, ccx.class, 10.0F));
      this.bP.a(1, new bta<>(this, bwo.class, false, null));
      this.bP.a(1, new bta<>(this, bwv.class, false, bwv.bU));
   }

   public bvy gl() {
      return this.an.b(ca);
   }

   public void a(bvy $$0) {
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

   public cix go() {
      return cix.a(this.an.b(cd));
   }

   public void a(cix $$0) {
      this.an.b(cd, $$0.a());
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(ca, jy.ak.e(bvy.b));
      this.an.a(cb, false);
      this.an.a(cc, false);
      this.an.a(cd, cix.o.a());
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("variant", jy.ak.b(this.gl()).toString());
      $$0.a("CollarColor", (byte)this.go().a());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      bvy $$1 = jy.ak.a(afw.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(cix.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void X() {
      if (this.I().b()) {
         double $$0 = this.I().c();
         if ($$0 == 0.6) {
            this.b(bkv.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bkv.a);
            this.g(true);
         } else {
            this.b(bkv.a);
            this.g(false);
         }
      } else {
         this.b(bkv.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected aqc w() {
      if (this.s()) {
         if (this.gi()) {
            return aqd.dq;
         } else {
            return this.ag.a(4) == 0 ? aqd.dr : aqd.dj;
         }
      } else {
         return aqd.dk;
      }
   }

   @Override
   public int O() {
      return 120;
   }

   public void gp() {
      this.a(aqd.dn, this.eV(), this.eW());
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.dp;
   }

   @Override
   protected aqc m_() {
      return aqd.dl;
   }

   public static blo.a gq() {
      return bkl.A().a(blp.l, 10.0).a(blp.m, 0.3F).a(blp.c, 3.0);
   }

   @Override
   protected void a(ccx $$0, bia $$1, ckj $$2) {
      if (this.m($$2)) {
         this.a(aqd.dm, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gr() {
      return (float)this.b(blp.c);
   }

   @Override
   public boolean C(bjt $$0) {
      return $$0.a(this.dM().b((bkj)this), this.gr());
   }

   @Override
   public void l() {
      super.l();
      if (this.cf != null && this.cf.i() && !this.s() && this.ah % 100 == 0) {
         this.a(aqd.do, 1.0F, 1.0F);
      }

      this.gs();
   }

   private void gs() {
      if ((this.gm() || this.gn()) && this.ah % 5 == 0) {
         this.a(aqd.dq, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
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
      return asy.i($$0, this.ch, this.cg);
   }

   public float F(float $$0) {
      return asy.i($$0, this.cj, this.ci);
   }

   public float G(float $$0) {
      return asy.i($$0, this.cl, this.ck);
   }

   @Nullable
   public bvx b(alq $$0, bjo $$1) {
      bvx $$2 = bjx.m.a((cqz)$$0);
      if ($$2 != null && $$1 instanceof bvx $$3) {
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
   public boolean a(bvu $$0) {
      if (!this.s()) {
         return false;
      } else {
         return !($$0 instanceof bvx $$1) ? false : $$1.s() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      boolean $$5 = $$0.an() > 0.9F;
      arh<bvy> $$6 = $$5 ? aqt.b : aqt.a;
      jy.ak.b($$6).flatMap($$1x -> $$1x.a($$0.E_())).ifPresent($$0x -> this.a((bvy)$$0x.a()));
      alq $$7 = $$0.C();
      if ($$7.a().a(this.dl(), ard.n).b()) {
         this.a(jy.ak.e(bvy.k));
         this.fJ();
      }

      return $$3;
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      cke $$3 = $$2.d();
      if (this.dL().B) {
         if (this.s() && this.j($$0)) {
            return bib.a;
         } else {
            return !this.m($$2) || !(this.eu() < this.eL()) && this.s() ? bib.d : bib.a;
         }
      } else {
         if (this.s()) {
            if (this.j($$0)) {
               if (!($$3 instanceof ciy)) {
                  if ($$3.u() && this.m($$2) && this.eu() < this.eL()) {
                     this.a($$0, $$1, $$2);
                     this.b((float)$$3.v().a());
                     return bib.b;
                  }

                  bib $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.n_()) {
                     this.z(!this.ge());
                  }

                  return $$5;
               }

               cix $$4 = ((ciy)$$3).d();
               if ($$4 != this.go()) {
                  this.a($$4);
                  if (!$$0.fT().d) {
                     $$2.h(1);
                  }

                  this.fJ();
                  return bib.b;
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
            return bib.b;
         }

         bib $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fJ();
         }

         return $$6;
      }
   }

   @Override
   public boolean m(ckj $$0) {
      return bZ.a($$0);
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public boolean h(double $$0) {
      return !this.s() && this.ah > 2400;
   }

   @Override
   protected void t() {
      if (this.ce == null) {
         this.ce = new bvx.a<>(this, ccx.class, 16.0F, 0.8, 1.33);
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
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }

   static class a<T extends bkj> extends bql<T> {
      private final bvx i;

      public a(bvx $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bjw.e::test);
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

   static class b extends bre {
      private final bvx a;
      @Nullable
      private ccx b;
      @Nullable
      private ht c;
      private int d;

      public b(bvx $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.s()) {
            return false;
         } else if (this.a.ge()) {
            return false;
         } else {
            bkj $$0 = this.a.P_();
            if ($$0 instanceof ccx) {
               this.b = (ccx)$$0;
               if (!$$0.fD()) {
                  return false;
               }

               if (this.a.f((bjt)this.b) > 100.0) {
                  return false;
               }

               ht $$1 = this.b.dl();
               dgb $$2 = this.a.dL().a_($$1);
               if ($$2.a(aqs.R)) {
                  this.c = $$2.d(ctt.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new ht($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (bvx $$1 : this.a.dL().a(bvx.class, new eia(this.c).g(2.0))) {
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
         if (this.b.fW() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dL().E_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.L().n();
      }

      private void i() {
         ate $$0 = this.a.ef();
         ht.a $$1 = new ht.a();
         $$1.g(this.a.fS() ? this.a.fT().dl() : this.a.dl());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dl());
         edq $$2 = this.a.dL().n().aH().getLootTable(edg.am);
         edo $$3 = new edo.a((alq)this.a.dL()).a(eft.f, this.a.dj()).a(eft.a, this.a).a(efs.i);

         for (ckj $$5 : $$2.a($$3)) {
            this.a
               .dL()
               .b(
                  new bzq(
                     this.a.dL(),
                     (double)$$1.u() - (double)asy.a(this.a.aU * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)asy.b(this.a.aU * (float) (Math.PI / 180.0)),
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
            if (this.a.f((bjt)this.b) < 2.5) {
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

   static class c extends bsm {
      @Nullable
      private ccx c;
      private final bvx d;

      public c(bvx $$0, double $$1, cnk $$2, boolean $$3) {
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
