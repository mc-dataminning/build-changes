import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cch extends bql implements bpv {
   private static final aim<Boolean> cb = aiq.a(cch.class, aio.k);
   private static final aim<Integer> cc = aiq.a(cch.class, aio.b);
   private static final aim<Integer> cd = aiq.a(cch.class, aio.b);
   public static final Predicate<bpp> ca = $$0 -> {
      bpd<?> $$1 = $$0.ai();
      return $$1 == bpd.aJ || $$1 == bpd.aG || $$1 == bpd.R;
   };
   private static final float ce = 8.0F;
   private static final float cf = 40.0F;
   private float cg;
   private float ch;
   private boolean ci;
   private boolean cj;
   private float ck;
   private float cl;
   private static final bmo cm = axv.a(20, 39);
   @Nullable
   private UUID cn;

   public cch(bpd<? extends cch> $$0, cxb $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(ejg.f, -1.0F);
      this.a(ejg.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bwg(this));
      this.bR.a(1, new cch.b(1.5));
      this.bR.a(2, new bxr(this));
      this.bR.a(3, new cch.a<>(this, cdj.class, 24.0F, 1.5, 1.5));
      this.bR.a(4, new bws(this, 0.4F));
      this.bR.a(5, new bww(this, 1.0, true));
      this.bR.a(6, new bwk(this, 1.0, 10.0F, 2.0F, false));
      this.bR.a(7, new bvy(this, 1.0));
      this.bR.a(8, new bxz(this, 1.0));
      this.bR.a(9, new bvu(this, 8.0F));
      this.bR.a(10, new bwu(this, ciu.class, 8.0F));
      this.bR.a(10, new bxh(this));
      this.bS.a(1, new byj(this));
      this.bS.a(2, new byk(this));
      this.bS.a(3, new bye(this).a());
      this.bS.a(4, new byf<>(this, ciu.class, 10, true, false, this::a_));
      this.bS.a(5, new byi<>(this, cbe.class, false, ca));
      this.bS.a(6, new byi<>(this, ccf.class, false, ccf.bY));
      this.bS.a(7, new byf<>(this, cfi.class, false));
      this.bS.a(8, new byl<>(this, true));
   }

   public static bqv.a gt() {
      return bpr.A().a(bqw.r, 0.3F).a(bqw.q, 8.0).a(bqw.c, 4.0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
      $$0.a(cc, cpd.o.a());
      $$0.a(cd, 0);
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.Co, 0.15F, 1.0F);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gw().a());
      this.c($$0);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(cpd.a($$0.h("CollarColor")));
      }

      this.a(this.dM(), $$0);
   }

   @Override
   protected atx v() {
      if (this.Y_()) {
         return aty.Cj;
      } else if (this.ag.a(3) == 0) {
         return this.r() && this.ex() < 20.0F ? aty.Cp : aty.Cm;
      } else {
         return aty.Ch;
      }
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.Cl;
   }

   @Override
   protected atx n_() {
      return aty.Ci;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dM().B && this.ci && !this.cj && !this.gj() && this.aC()) {
         this.cj = true;
         this.ck = 0.0F;
         this.cl = 0.0F;
         this.dM().a(this, (byte)8);
      }

      if (!this.dM().B) {
         this.a((apf)this.dM(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bA()) {
         this.ch = this.cg;
         if (this.gy()) {
            this.cg = this.cg + (1.0F - this.cg) * 0.4F;
         } else {
            this.cg = this.cg + (0.0F - this.cg) * 0.4F;
         }

         if (this.be()) {
            this.ci = true;
            if (this.cj && !this.dM().B) {
               this.dM().a(this, (byte)56);
               this.gz();
            }
         } else if ((this.ci || this.cj) && this.cj) {
            if (this.ck == 0.0F) {
               this.a(aty.Cn, this.fb(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.b(drp.u);
            }

            this.cl = this.ck;
            this.ck += 0.05F;
            if (this.cl >= 2.0F) {
               this.ci = false;
               this.cj = false;
               this.cl = 0.0F;
               this.ck = 0.0F;
            }

            if (this.ck > 0.4F) {
               float $$0 = (float)this.dt();
               int $$1 = (int)(aww.a((this.ck - 0.4F) * (float) Math.PI) * 7.0F);
               ept $$2 = this.dp();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.dg() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.dg() * 0.5F;
                  this.dM().a(kc.ak, this.dr() + (double)$$4, (double)($$0 + 0.8F), this.dx() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gz() {
      this.cj = false;
      this.ck = 0.0F;
      this.cl = 0.0F;
   }

   @Override
   public void a(bnw $$0) {
      this.ci = false;
      this.cj = false;
      this.cl = 0.0F;
      this.ck = 0.0F;
      super.a($$0);
   }

   public boolean gu() {
      return this.ci;
   }

   public float G(float $$0) {
      return Math.min(0.5F + aww.i($$0, this.cl, this.ck) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (aww.i($$0, this.cl, this.ck) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return aww.a($$2 * (float) Math.PI) * aww.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float H(float $$0) {
      return aww.i($$0, this.ch, this.cg) * 0.15F * (float) Math.PI;
   }

   @Override
   public int Z() {
      return this.y() ? 20 : super.Z();
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
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
   public boolean C(box $$0) {
      boolean $$1 = $$0.a(this.dN().b((bpp)this), (float)((int)this.g(bqw.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   protected void s() {
      if (this.r()) {
         this.f(bqw.q).a(40.0);
         this.t(40.0F);
      } else {
         this.f(bqw.q).a(8.0);
      }
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      cqh $$3 = $$2.d();
      if (this.dM().B) {
         boolean $$4 = this.j($$0) || this.r() || $$2.a(cqp.ry) && !this.r() && !this.Y_();
         return $$4 ? bnd.b : bnd.d;
      } else if (this.r()) {
         if (this.o($$2) && this.ex() < this.eO()) {
            $$2.a(1, $$0);
            this.c(2.0F * (float)$$3.w().a());
            return bnd.a;
         } else {
            if ($$3 instanceof cpe $$5 && this.j($$0)) {
               cpd $$6 = $$5.c();
               if ($$6 != this.gw()) {
                  this.a($$6);
                  $$2.a(1, $$0);
                  return bnd.a;
               }

               return super.b($$0, $$1);
            }

            if ($$2.a(cqp.oq) && this.j($$0) && !this.gx() && !this.o_()) {
               this.m($$2.c(1));
               $$2.a(1, $$0);
               return bnd.a;
            } else if ($$2.a(cqp.rU) && this.j($$0) && this.gx()) {
               $$2.a(1, $$0, d($$1));
               this.a(aty.az);
               cqm $$7 = this.fP();
               this.m(cqm.h);
               this.b($$7);
               return bnd.a;
            } else {
               bnd $$8 = super.b($$0, $$1);
               if ((!$$8.a() || this.o_()) && this.j($$0)) {
                  this.y(!this.gn());
                  this.bm = false;
                  this.bQ.n();
                  this.h(null);
                  return bnd.a;
               } else {
                  return $$8;
               }
            }
         }
      } else if ($$2.a(cqp.ry) && !this.Y_()) {
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

         return bnd.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.cj = true;
         this.ck = 0.0F;
         this.cl = 0.0F;
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
   public boolean o(cqm $$0) {
      cqh $$1 = $$0.d();
      return $$1.v() && $$1.w().c();
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
      this.a(cm.a(this.ag));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cn;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cn = $$0;
   }

   public cpd gw() {
      return cpd.a(this.an.a(cc));
   }

   public boolean gx() {
      return !this.fP().b();
   }

   public void a(cpd $$0) {
      this.an.a(cc, $$0.a());
   }

   @Nullable
   public cch b(apf $$0, bos $$1) {
      cch $$2 = bpd.bs.a((cxb)$$0);
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
   public boolean a(cbe $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.r()) {
         return false;
      } else if (!($$0 instanceof cch $$1)) {
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
   public boolean a(bpp $$0, bpp $$1) {
      if ($$0 instanceof cfm || $$0 instanceof cfu) {
         return false;
      } else if ($$0 instanceof cch $$2) {
         return !$$2.r() || $$2.P_() != $$1;
      } else if ($$0 instanceof ciu && $$1 instanceof ciu && !((ciu)$$1).a((ciu)$$0)) {
         return false;
      } else {
         return $$0 instanceof cdg && ((cdg)$$0).gC() ? false : !($$0 instanceof bql) || !((bql)$$0).r();
      }
   }

   @Override
   public boolean a(ciu $$0) {
      return !this.Y_() && super.a($$0);
   }

   @Override
   public ept cJ() {
      return new ept(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   public static boolean c(bpd<cch> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      return $$1.a_($$3.d()).a(aun.bZ) && a($$1, $$3);
   }

   class a<T extends bpp> extends bvt<T> {
      private final cch j;

      public a(cch $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof cdj ? !this.j.r() && this.a((cdj)this.b) : false;
      }

      private boolean a(cdj $$0) {
         return $$0.gx() >= cch.this.ag.a(5);
      }

      @Override
      public void c() {
         cch.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         cch.this.h(null);
         super.e();
      }
   }

   class b extends bxf {
      public b(double $$0) {
         super(cch.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dB() || this.b.bN();
      }
   }
}
