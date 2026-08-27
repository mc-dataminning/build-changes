import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byb extends bng implements bnj<byc> {
   public static final double bW = 0.6;
   public static final double bX = 0.8;
   public static final double bY = 1.33;
   private static final cpz bZ = cpz.a(cnb.qW, cnb.qX);
   private static final agm<byc> ca = agp.a(byb.class, ago.w);
   private static final agm<Boolean> cb = agp.a(byb.class, ago.k);
   private static final agm<Boolean> cc = agp.a(byb.class, ago.k);
   private static final agm<Integer> cd = agp.a(byb.class, ago.b);
   private byb.a<cfi> ce;
   @Nullable
   private bup cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;

   public byb(blz<? extends byb> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public ahg gk() {
      return this.gl().a();
   }

   @Override
   protected void B() {
      this.cf = new byb.c(this, 0.6, bZ, true);
      this.bO.a(1, new btb(this));
      this.bO.a(1, new bua(this, 1.5));
      this.bO.a(2, new bum(this));
      this.bO.a(3, new byb.b(this));
      this.bO.a(4, this.cf);
      this.bO.a(5, new bsu(this, 1.1, 8));
      this.bO.a(6, new btf(this, 1.0, 10.0F, 5.0F, false));
      this.bO.a(7, new bsv(this, 0.8));
      this.bO.a(8, new btn(this, 0.3F));
      this.bO.a(9, new btx(this));
      this.bO.a(10, new bst(this, 0.8));
      this.bO.a(11, new buu(this, 0.8, 1.0000001E-5F));
      this.bO.a(12, new btp(this, cfi.class, 10.0F));
      this.bP.a(1, new bvd<>(this, bys.class, false, null));
      this.bP.a(1, new bvd<>(this, byz.class, false, byz.bU));
   }

   public byc gl() {
      return this.an.b(ca);
   }

   public void a(byc $$0) {
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

   public clm go() {
      return clm.a(this.an.b(cd));
   }

   public void a(clm $$0) {
      this.an.b(cd, $$0.a());
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, kd.ak.e(byc.b));
      this.an.a(cb, false);
      this.an.a(cc, false);
      this.an.a(cd, clm.o.a());
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("variant", kd.ak.b(this.gl()).toString());
      $$0.a("CollarColor", (byte)this.go().a());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      byc $$1 = kd.ak.a(ahg.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(clm.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Z() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(bmx.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bmx.a);
            this.g(true);
         } else {
            this.b(bmx.a);
            this.g(false);
         }
      } else {
         this.b(bmx.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected arr y() {
      if (this.u()) {
         if (this.gi()) {
            return ars.dz;
         } else {
            return this.ag.a(4) == 0 ? ars.dA : ars.ds;
         }
      } else {
         return ars.dt;
      }
   }

   @Override
   public int Q() {
      return 120;
   }

   public void gp() {
      this.a(ars.dw, this.eW(), this.eX());
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.dy;
   }

   @Override
   protected arr n_() {
      return ars.du;
   }

   public static bnq.a gq() {
      return bmn.C().a(bnr.l, 10.0).a(bnr.m, 0.3F).a(bnr.c, 3.0);
   }

   @Override
   protected void a(cfi $$0, bka $$1, cmy $$2) {
      if (this.m($$2)) {
         this.a(ars.dv, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gr() {
      return (float)this.b(bnr.c);
   }

   @Override
   public boolean C(blv $$0) {
      return $$0.a(this.dN().b((bml)this), this.gr());
   }

   @Override
   public void l() {
      super.l();
      if (this.cf != null && this.cf.i() && !this.u() && this.ah % 100 == 0) {
         this.a(ars.dx, 1.0F, 1.0F);
      }

      this.gs();
   }

   private void gs() {
      if ((this.gm() || this.gn()) && this.ah % 5 == 0) {
         this.a(ars.dz, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
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
      return auo.i($$0, this.ch, this.cg);
   }

   public float F(float $$0) {
      return auo.i($$0, this.cj, this.ci);
   }

   public float G(float $$0) {
      return auo.i($$0, this.cl, this.ck);
   }

   @Nullable
   public byb b(and $$0, blq $$1) {
      byb $$2 = blz.n.a((ctp)$$0);
      if ($$2 != null && $$1 instanceof byb $$3) {
         if (this.ag.h()) {
            $$2.a(this.gl());
         } else {
            $$2.a($$3.gl());
         }

         if (this.u()) {
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
   public boolean a(bxy $$0) {
      if (!this.u()) {
         return false;
      } else {
         return !($$0 instanceof byb $$1) ? false : $$1.u() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      boolean $$5 = $$0.ap() > 0.9F;
      asw<byc> $$6 = $$5 ? asi.b : asi.a;
      kd.ak.b($$6).flatMap($$1x -> $$1x.a($$0.F_())).ifPresent($$0x -> this.a((byc)$$0x.a()));
      and $$7 = $$0.E();
      if ($$7.a().a(this.dm(), ass.n).b()) {
         this.a(kd.ak.e(byc.k));
         this.fJ();
      }

      return $$3;
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      cmt $$3 = $$2.d();
      if (this.dM().B) {
         if (this.u() && this.j($$0)) {
            return bkb.a;
         } else {
            return !this.m($$2) || !(this.ev() < this.eM()) && this.u() ? bkb.d : bkb.a;
         }
      } else {
         if (this.u()) {
            if (this.j($$0)) {
               if (!($$3 instanceof cln)) {
                  if ($$3.u() && this.m($$2) && this.ev() < this.eM()) {
                     this.a($$0, $$1, $$2);
                     this.b((float)$$3.v().a());
                     return bkb.b;
                  }

                  bkb $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.o_()) {
                     this.z(!this.ge());
                  }

                  return $$5;
               }

               clm $$4 = ((cln)$$3).d();
               if ($$4 != this.go()) {
                  this.a($$4);
                  if (!$$0.fT().d) {
                     $$2.h(1);
                  }

                  this.fJ();
                  return bkb.b;
               }
            }
         } else if (this.m($$2)) {
            this.a($$0, $$1, $$2);
            if (this.ag.a(3) == 0) {
               this.f($$0);
               this.z(true);
               this.dM().a(this, (byte)7);
            } else {
               this.dM().a(this, (byte)6);
            }

            this.fJ();
            return bkb.b;
         }

         bkb $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fJ();
         }

         return $$6;
      }
   }

   @Override
   public boolean m(cmy $$0) {
      return bZ.a($$0);
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && this.ah > 2400;
   }

   @Override
   protected void w() {
      if (this.ce == null) {
         this.ce = new byb.a<>(this, cfi.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.ce);
      if (!this.u()) {
         this.bO.a(4, this.ce);
      }
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }

   static class a<T extends bml> extends bso<T> {
      private final byb i;

      public a(byb $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bly.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.u() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.u() && super.b();
      }
   }

   static class b extends bth {
      private final byb a;
      @Nullable
      private cfi b;
      @Nullable
      private hx c;
      private int d;

      public b(byb $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.u()) {
            return false;
         } else if (this.a.ge()) {
            return false;
         } else {
            bml $$0 = this.a.R_();
            if ($$0 instanceof cfi) {
               this.b = (cfi)$$0;
               if (!$$0.fD()) {
                  return false;
               }

               if (this.a.f((blv)this.b) > 100.0) {
                  return false;
               }

               hx $$1 = this.b.dm();
               djh $$2 = this.a.dM().a_($$1);
               if ($$2.a(ash.R)) {
                  this.c = $$2.d(cwj.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new hx($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (byb $$1 : this.a.dM().a(byb.class, new elo(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gm() || $$1.gn())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.u() && !this.a.ge() && this.b != null && this.b.fD() && this.c != null && !this.h();
      }

      @Override
      public void c() {
         if (this.c != null) {
            this.a.y(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void d() {
         this.a.A(false);
         float $$0 = this.a.dM().f(1.0F);
         if (this.b.fW() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dM().F_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.N().n();
      }

      private void i() {
         auv $$0 = this.a.eg();
         hx.a $$1 = new hx.a();
         $$1.g(this.a.fS() ? this.a.fT().dm() : this.a.dm());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dm());
         ehe $$2 = this.a.dM().o().aJ().getLootTable(egu.aw);
         ehc $$3 = new ehc.a((and)this.a.dM()).a(ejh.f, this.a.dk()).a(ejh.a, this.a).a(ejg.i);

         for (cmy $$5 : $$2.a($$3)) {
            this.a
               .dM()
               .b(
                  new cbu(
                     this.a.dM(),
                     (double)$$1.u() - (double)auo.a(this.a.aU * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)auo.b(this.a.aU * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void e() {
         if (this.b != null && this.c != null) {
            this.a.y(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.f((blv)this.b) < 2.5) {
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

   static class c extends bup {
      @Nullable
      private cfi c;
      private final byb d;

      public c(byb $$0, double $$1, cpz $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.eg().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.eg().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.u();
      }
   }
}
