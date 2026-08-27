import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdg extends brk implements bqu {
   private static final aiy<Boolean> cb = ajc.a(cdg.class, aja.k);
   private static final aiy<Integer> cc = ajc.a(cdg.class, aja.b);
   private static final aiy<Integer> cd = ajc.a(cdg.class, aja.b);
   public static final Predicate<bqo> ca = $$0 -> {
      bqb<?> $$1 = $$0.ai();
      return $$1 == bqb.aI || $$1 == bqb.aF || $$1 == bqb.Q;
   };
   private static final float ce = 8.0F;
   private static final float cf = 40.0F;
   private static final float cg = 0.125F;
   private float ch;
   private float ci;
   private boolean cj;
   private boolean ck;
   private float cl;
   private float cm;
   private static final bnl cn = ayj.a(20, 39);
   @Nullable
   private UUID co;

   public cdg(bqb<? extends cdg> $$0, cyx $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(elj.f, -1.0F);
      this.a(elj.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxf(this));
      this.bR.a(1, new cdg.b(1.5));
      this.bR.a(2, new byq(this));
      this.bR.a(3, new cdg.a<>(this, cei.class, 24.0F, 1.5, 1.5));
      this.bR.a(4, new bxr(this, 0.4F));
      this.bR.a(5, new bxv(this, 1.0, true));
      this.bR.a(6, new bxj(this, 1.0, 10.0F, 2.0F, false));
      this.bR.a(7, new bwx(this, 1.0));
      this.bR.a(8, new byy(this, 1.0));
      this.bR.a(9, new bwt(this, 8.0F));
      this.bR.a(10, new bxt(this, cjt.class, 8.0F));
      this.bR.a(10, new byg(this));
      this.bS.a(1, new bzi(this));
      this.bS.a(2, new bzj(this));
      this.bS.a(3, new bzd(this).a());
      this.bS.a(4, new bze<>(this, cjt.class, 10, true, false, this::a_));
      this.bS.a(5, new bzh<>(this, ccd.class, false, ca));
      this.bS.a(6, new bzh<>(this, cde.class, false, cde.bY));
      this.bS.a(7, new bze<>(this, cgh.class, false));
      this.bS.a(8, new bzk<>(this, true));
   }

   public static bru.a gt() {
      return bqq.A().a(brv.r, 0.3F).a(brv.q, 8.0).a(brv.c, 4.0);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
      $$0.a(cc, cqc.o.a());
      $$0.a(cd, 0);
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.Cw, 0.15F, 1.0F);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gw().a());
      this.c($$0);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(cqc.a($$0.h("CollarColor")));
      }

      this.a(this.dM(), $$0);
   }

   @Override
   protected aul v() {
      if (this.Y_()) {
         return aum.Cr;
      } else if (this.ag.a(3) == 0) {
         return this.r() && this.ex() < 20.0F ? aum.Cx : aum.Cu;
      } else {
         return aum.Cp;
      }
   }

   @Override
   protected aul d(bot $$0) {
      return this.h($$0) ? aum.Cn : aum.Ct;
   }

   @Override
   protected aul o_() {
      return aum.Cq;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dM().B && this.cj && !this.ck && !this.gj() && this.aC()) {
         this.ck = true;
         this.cl = 0.0F;
         this.cm = 0.0F;
         this.dM().a(this, (byte)8);
      }

      if (!this.dM().B) {
         this.a((aps)this.dM(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bA()) {
         this.ci = this.ch;
         if (this.gy()) {
            this.ch = this.ch + (1.0F - this.ch) * 0.4F;
         } else {
            this.ch = this.ch + (0.0F - this.ch) * 0.4F;
         }

         if (this.be()) {
            this.cj = true;
            if (this.ck && !this.dM().B) {
               this.dM().a(this, (byte)56);
               this.gz();
            }
         } else if ((this.cj || this.ck) && this.ck) {
            if (this.cl == 0.0F) {
               this.a(aum.Cv, this.fb(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.a(dts.u);
            }

            this.cm = this.cl;
            this.cl += 0.05F;
            if (this.cm >= 2.0F) {
               this.cj = false;
               this.ck = false;
               this.cm = 0.0F;
               this.cl = 0.0F;
            }

            if (this.cl > 0.4F) {
               float $$0 = (float)this.dt();
               int $$1 = (int)(axk.a((this.cl - 0.4F) * (float) Math.PI) * 7.0F);
               esa $$2 = this.dp();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.dg() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.dg() * 0.5F;
                  this.dM().a(kl.ak, this.dr() + (double)$$4, (double)($$0 + 0.8F), this.dx() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gz() {
      this.ck = false;
      this.cl = 0.0F;
      this.cm = 0.0F;
   }

   @Override
   public void a(bot $$0) {
      this.cj = false;
      this.ck = false;
      this.cm = 0.0F;
      this.cl = 0.0F;
      super.a($$0);
   }

   public boolean gu() {
      return this.cj;
   }

   public float G(float $$0) {
      return Math.min(0.5F + axk.i($$0, this.cm, this.cl) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (axk.i($$0, this.cm, this.cl) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return axk.a($$2 * (float) Math.PI) * axk.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float H(float $$0) {
      return axk.i($$0, this.ci, this.ch) * 0.15F * (float) Math.PI;
   }

   @Override
   public int Z() {
      return this.y() ? 20 : super.Z();
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void f(bot $$0, float $$1) {
      if (!this.h($$0)) {
         super.f($$0, $$1);
      } else {
         crj $$2 = this.fP();
         int $$3 = $$2.m();
         int $$4 = $$2.n();
         $$2.a(axk.f($$1), this, bqc.g);
         if (bpt.b.a($$3, $$4) != bpt.b.a(this.fP())) {
            this.a(aum.Cm);
            if (this.dM() instanceof aps $$5) {
               $$5.a(new kh(kl.R, crm.op.x()), this.dr(), this.dt() + 1.0, this.dx(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean h(bot $$0) {
      return this.gx() && !$$0.a(ave.D);
   }

   @Override
   public boolean C(bpv $$0) {
      boolean $$1 = $$0.a(this.dN().b((bqo)this), (float)((int)this.g(brv.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   protected void u() {
      if (this.r()) {
         this.f(brv.q).a(40.0);
         this.t(40.0F);
      } else {
         this.f(brv.q).a(8.0);
      }
   }

   @Override
   protected void b(bot $$0, float $$1) {
      this.a($$0, $$1, new bqc[]{bqc.g});
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      cre $$3 = $$2.f();
      if (this.dM().B) {
         boolean $$4 = this.j($$0) || this.r() || $$2.a(crm.ry) && !this.r() && !this.Y_();
         return $$4 ? boa.b : boa.d;
      } else if (this.r()) {
         if (this.o($$2) && this.ex() < this.eO()) {
            $$2.a(1, $$0);
            this.c(2.0F * (float)$$3.z().a());
            return boa.a;
         } else {
            if ($$3 instanceof cqd $$5 && this.j($$0)) {
               cqc $$6 = $$5.c();
               if ($$6 != this.gw()) {
                  this.a($$6);
                  $$2.a(1, $$0);
                  return boa.a;
               }

               return super.b($$0, $$1);
            }

            if ($$2.a(crm.oq) && this.j($$0) && !this.gx() && !this.p_()) {
               this.m($$2.c(1));
               $$2.a(1, $$0);
               return boa.a;
            } else if ($$2.a(crm.rU) && this.j($$0) && this.gx() && !cwr.e(this.fP())) {
               $$2.a(1, $$0, d($$1));
               this.a(aum.az);
               crj $$7 = this.fP();
               this.m(crj.i);
               this.b($$7);
               return boa.a;
            } else if (cpa.h.a().d().get().a($$2) && this.y() && this.gx() && this.j($$0) && this.fP().l()) {
               $$2.g(1);
               this.a(aum.Co);
               crj $$8 = this.fP();
               int $$9 = (int)((float)$$8.n() * 0.125F);
               $$8.b(Math.max(0, $$8.m() - $$9));
               return boa.a;
            } else {
               boa $$10 = super.b($$0, $$1);
               if ((!$$10.a() || this.p_()) && this.j($$0)) {
                  this.y(!this.gn());
                  this.bm = false;
                  this.bQ.n();
                  this.h(null);
                  return boa.a;
               } else {
                  return $$10;
               }
            }
         }
      } else if ($$2.a(crm.ry) && !this.Y_()) {
         $$2.a(1, $$0);
         if (this.ag.a(3) == 0) {
            this.f($$0);
            this.bQ.n();
            this.h(null);
            this.y(true);
            this.dM().a(this, (byte)7);
         } else {
            this.dM().a(this, (byte)6);
         }

         return boa.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.ck = true;
         this.cl = 0.0F;
         this.cm = 0.0F;
      } else if ($$0 == 56) {
         this.gz();
      } else {
         super.b($$0);
      }
   }

   public float gv() {
      if (this.Y_()) {
         return 1.5393804F;
      } else if (this.r()) {
         float $$0 = this.eO();
         float $$1 = ($$0 - this.ex()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean o(crj $$0) {
      cre $$1 = $$0.f();
      return $$1.y() && $$1.z().c();
   }

   @Override
   public int fO() {
      return 8;
   }

   @Override
   public int a() {
      return this.an.a(cd);
   }

   @Override
   public void a(int $$0) {
      this.an.a(cd, $$0);
   }

   @Override
   public void c() {
      this.a(cn.a(this.ag));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.co;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.co = $$0;
   }

   public cqc gw() {
      return cqc.a(this.an.a(cc));
   }

   public boolean gx() {
      return !this.fP().d();
   }

   public void a(cqc $$0) {
      this.an.a(cc, $$0.a());
   }

   @Nullable
   public cdg b(aps $$0, bpp $$1) {
      cdg $$2 = bqb.br.a((cyx)$$0);
      if ($$2 != null) {
         UUID $$3 = this.d();
         if ($$3 != null) {
            $$2.b($$3);
            $$2.b(true, true);
         }
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.an.a(cb, $$0);
   }

   @Override
   public boolean a(ccd $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.r()) {
         return false;
      } else if (!($$0 instanceof cdg $$1)) {
         return false;
      } else if (!$$1.r()) {
         return false;
      } else {
         return $$1.y() ? false : this.gr() && $$1.gr();
      }
   }

   public boolean gy() {
      return this.an.a(cb);
   }

   @Override
   public boolean a(bqo $$0, bqo $$1) {
      if ($$0 instanceof cgl || $$0 instanceof cgt) {
         return false;
      } else if ($$0 instanceof cdg $$2) {
         return !$$2.r() || $$2.P_() != $$1;
      } else if ($$0 instanceof cjt && $$1 instanceof cjt && !((cjt)$$1).a((cjt)$$0)) {
         return false;
      } else {
         return $$0 instanceof cef && ((cef)$$0).gC() ? false : !($$0 instanceof brk) || !((brk)$$0).r();
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return !this.Y_() && super.a($$0);
   }

   @Override
   public esa cJ() {
      return new esa(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   public static boolean c(bqb<cdg> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.a_($$3.d()).a(avc.bZ) && a($$1, $$3);
   }

   class a<T extends bqo> extends bws<T> {
      private final cdg j;

      public a(cdg $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof cei ? !this.j.r() && this.a((cei)this.b) : false;
      }

      private boolean a(cei $$0) {
         return $$0.gx() >= cdg.this.ag.a(5);
      }

      @Override
      public void c() {
         cdg.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         cdg.this.h(null);
         super.e();
      }
   }

   class b extends bye {
      public b(double $$0) {
         super(cdg.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dB() || this.b.bN();
      }
   }
}
