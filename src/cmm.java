import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import javax.annotation.Nullable;

public class cmm extends cmw implements bwk {
   private static final alz c = alz.b("attacking");
   private static final bxl d = new bxl(c, 0.15F, bxl.a.a);
   private static final int bZ = 400;
   private static final int ca = 600;
   private static final alc<Optional<dxu>> cb = alg.a(cmm.class, ale.j);
   private static final alc<Boolean> cc = alg.a(cmm.class, ale.k);
   private static final alc<Boolean> cd = alg.a(cmm.class, ale.k);
   private int ce = Integer.MIN_VALUE;
   private int cf;
   private static final bst cg = bbg.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;

   public cmm(bvq<? extends cmm> $$0, dhh $$1) {
      super($$0, $$1);
      this.a(eun.j, -1.0F);
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccx(this));
      this.bT.a(1, new cmm.a(this));
      this.bT.a(2, new cdn(this, 1.0, false));
      this.bT.a(7, new ceq(this, 1.0, 0.0F));
      this.bT.a(8, new cdl(this, cpw.class, 8.0F));
      this.bT.a(8, new cdy(this));
      this.bT.a(10, new cmm.b(this));
      this.bT.a(11, new cmm.d(this));
      this.bU.a(1, new cmm.c(this, this::a));
      this.bU.a(2, new cev(this));
      this.bU.a(3, new cew<>(this, cmn.class, true, false));
      this.bU.a(4, new cfc<>(this, false));
   }

   public static bxm.a m() {
      return cmw.gr().a(bxn.s, 40.0).a(bxn.v, 0.3F).a(bxn.c, 7.0).a(bxn.m, 64.0).a(bxn.B, 1.0);
   }

   @Override
   public void h(@Nullable bwf $$0) {
      super.h($$0);
      bxj $$1 = this.g(bxn.v);
      if ($$0 == null) {
         this.cf = 0;
         this.al.a(cc, false);
         this.al.a(cd, false);
         $$1.c(c);
      } else {
         this.cf = this.af;
         this.al.a(cc, true);
         if (!$$1.b(c)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cb, Optional.empty());
      $$0.a(cc, false);
      $$0.a(cd, false);
   }

   @Override
   public void c() {
      this.a(cg.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.ch = $$0;
   }

   @Override
   public int a() {
      return this.ch;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ci = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ci;
   }

   public void p() {
      if (this.af >= this.ce + 400) {
         this.ce = this.af;
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), axf.iH, this.dm(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(alc<?> $$0) {
      if (cc.equals($$0) && this.gn() && this.dV().C) {
         this.p();
      }

      super.a($$0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      dxu $$1 = this.x();
      if ($$1 != null) {
         $$0.a("carriedBlockState", vm.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      dxu $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = vm.a(this.dV().a(mb.f), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dV(), $$0);
   }

   boolean a(cpw $$0) {
      return this.a($$0, 0.025, true, false, bwf.aH, new DoubleSupplier[]{this::dE});
   }

   @Override
   public void d_() {
      if (this.dV().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dV().a(ls.ad, this.d(0.5), this.dD() - 0.25, this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      }

      this.bn = false;
      if (!this.dV().C) {
         this.a((ash)this.dV(), true);
      }

      super.d_();
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   protected void a(ash $$0) {
      if ($$0.U() && this.af >= this.cf + 600) {
         float $$1 = this.by();
         if ($$1 > 0.5F && $$0.h(this.dv()) && this.ae.i() * 30.0F < ($$1 - 0.4F) * 2.0F) {
            this.h(null);
            this.t();
         }
      }

      super.a($$0);
   }

   protected boolean t() {
      if (!this.dV().B_() && this.bL()) {
         double $$0 = this.dA() + (this.ae.j() - 0.5) * 64.0;
         double $$1 = this.dC() + (double)(this.ae.a(64) - 32);
         double $$2 = this.dG() + (this.ae.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bvj $$0) {
      fbx $$1 = new fbx(this.dA() - $$0.dA(), this.e(0.5) - $$0.dE(), this.dG() - $$0.dG());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dA() + (this.ae.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dC() + (double)(this.ae.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dG() + (this.ae.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      jh.a $$3 = new jh.a($$0, $$1, $$2);

      while ($$3.v() > this.dV().L_() && !this.dV().a_($$3).d()) {
         $$3.c(jm.a);
      }

      dxu $$4 = this.dV().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(aya.a);
      if ($$5 && !$$6) {
         fbx $$7 = this.dt();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dV().a(ecq.R, $$7, ecq.a.a(this));
            if (!this.bb()) {
               this.dV().a(null, this.K, this.L, this.M, axf.iI, this.dm(), 1.0F, 1.0F);
               this.a(axf.iI, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected axe u() {
      return this.gm() ? axf.iG : axf.iD;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.iF;
   }

   @Override
   protected axe o_() {
      return axf.iE;
   }

   @Override
   protected void a(ash $$0, btz $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dxu $$3 = this.x();
      if ($$3 != null) {
         cxo $$4 = new cxo(cxs.pF);
         dea.a($$4, $$0.K_(), dfm.g, $$0.d_(this.dv()), this.dY());
         ewr.a $$5 = new ewr.a((ash)this.dV()).a(ezi.f, this.dt()).a(ezi.i, $$4).b(ezi.a, this);

         for (cxo $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable dxu $$0) {
      this.al.a(cb, Optional.ofNullable($$0));
   }

   @Nullable
   public dxu x() {
      return this.al.a(cb).orElse(null);
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         boolean $$3 = $$1.c() instanceof crb;
         if (!$$1.a(axw.j) && !$$3) {
            boolean $$6 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof bwf) && this.ae.a(10) != 0) {
               this.t();
            }

            return $$6;
         } else {
            boolean $$4 = $$3 && this.a($$0, $$1, (crb)$$1.c(), $$2);

            for (int $$5 = 0; $$5 < 64; $$5++) {
               if (this.t()) {
                  return true;
               }
            }

            return $$4;
         }
      }
   }

   private boolean a(ash $$0, btz $$1, crb $$2, float $$3) {
      cxo $$4 = $$2.l();
      czn $$5 = $$4.a(ku.Q, czn.a);
      return $$5.a(czo.a) ? super.a($$0, $$1, $$3) : false;
   }

   public boolean gm() {
      return this.al.a(cc);
   }

   public boolean gn() {
      return this.al.a(cd);
   }

   public void go() {
      this.al.a(cd, true);
   }

   @Override
   public boolean W() {
      return super.W() || this.x() != null;
   }

   static class a extends cdd {
      private final cmm a;
      @Nullable
      private bwf b;

      public a(cmm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdd.a.c, cdd.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.O_();
         if (!(this.b instanceof cpw)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.a((cpw)this.b);
         }
      }

      @Override
      public void d() {
         this.a.L().o();
      }

      @Override
      public void a() {
         this.a.H().a(this.b.dA(), this.b.dE(), this.b.dG());
      }
   }

   static class b extends cdd {
      private final cmm a;

      public b(cmm $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.x() == null) {
            return false;
         } else {
            return !a(this.a).N().b(dhd.c) ? false : this.a.dY().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         bam $$0 = this.a.dY();
         dhh $$1 = this.a.dV();
         int $$2 = bae.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         int $$3 = bae.a(this.a.dC() + $$0.j() * 2.0);
         int $$4 = bae.a(this.a.dG() - 1.0 + $$0.j() * 2.0);
         jh $$5 = new jh($$2, $$3, $$4);
         dxu $$6 = $$1.a_($$5);
         jh $$7 = $$5.e();
         dxu $$8 = $$1.a_($$7);
         dxu $$9 = this.a.x();
         if ($$9 != null) {
            $$9 = dkl.b($$9, this.a.dV(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(ecq.i, $$5, ecq.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dhh $$0, jh $$1, dxu $$2, dxu $$3, dxu $$4, jh $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dkn.I) && $$4.m($$0, $$5) && $$2.a((dhk)$$0, $$1) && $$0.a_(this.a, fbs.a(fbx.a($$1))).isEmpty();
      }
   }

   static class c extends cew<cpw> {
      private final cmm i;
      @Nullable
      private cpw j;
      private int k;
      private int l;
      private final cgw m;
      private final cgw n = cgw.a().d();
      private final cgw.a o;

      public c(cmm $$0, @Nullable cgw.a $$1) {
         super($$0, cpw.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((cpw)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = cgw.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean b() {
         this.j = a(this.i).a(this.m.a(this.l()), this.i);
         return this.j != null;
      }

      @Override
      public void d() {
         this.k = this.a(5);
         this.l = 0;
         this.i.go();
      }

      @Override
      public void e() {
         this.j = null;
         super.e();
      }

      @Override
      public boolean c() {
         if (this.j != null) {
            if (!this.o.test(this.j, a(this.i))) {
               return false;
            } else {
               this.i.a(this.j, 10.0F, 10.0F);
               return true;
            }
         } else {
            if (this.c != null) {
               if (this.i.A(this.c)) {
                  return false;
               }

               if (this.n.a(a(this.i), this.i, this.c)) {
                  return true;
               }
            }

            return super.c();
         }
      }

      @Override
      public void a() {
         if (this.i.O_() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.d();
            }
         } else {
            if (this.c != null && !this.i.bZ()) {
               if (this.i.a((cpw)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.t();
                  }

                  this.l = 0;
               } else if (this.c.g(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.b(this.c)) {
                  this.l = 0;
               }
            }

            super.a();
         }
      }
   }

   static class d extends cdd {
      private final cmm a;

      public d(cmm $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.x() != null) {
            return false;
         } else {
            return !a(this.a).N().b(dhd.c) ? false : this.a.dY().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         bam $$0 = this.a.dY();
         dhh $$1 = this.a.dV();
         int $$2 = bae.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         int $$3 = bae.a(this.a.dC() + $$0.j() * 3.0);
         int $$4 = bae.a(this.a.dG() - 2.0 + $$0.j() * 4.0);
         jh $$5 = new jh($$2, $$3, $$4);
         dxu $$6 = $$1.a_($$5);
         fbx $$7 = new fbx((double)this.a.dz() + 0.5, (double)$$3 + 0.5, (double)this.a.dF() + 0.5);
         fbx $$8 = new fbx((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         fbt $$9 = $$1.a(new dgp($$7, $$8, dgp.a.b, dgp.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(axu.ao) && $$10) {
            $$1.a($$5, false);
            $$1.a(ecq.f, $$5, ecq.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
