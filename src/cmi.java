import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import javax.annotation.Nullable;

public class cmi extends cms implements bwg {
   private static final alz c = alz.b("attacking");
   private static final bxh d = new bxh(c, 0.15F, bxh.a.a);
   private static final int bZ = 400;
   private static final int ca = 600;
   private static final alc<Optional<dxn>> cb = alg.a(cmi.class, ale.j);
   private static final alc<Boolean> cc = alg.a(cmi.class, ale.k);
   private static final alc<Boolean> cd = alg.a(cmi.class, ale.k);
   private int ce = Integer.MIN_VALUE;
   private int cf;
   private static final bsp cg = bbg.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;

   public cmi(bvm<? extends cmi> $$0, dha $$1) {
      super($$0, $$1);
      this.a(eug.j, -1.0F);
   }

   @Override
   protected void B() {
      this.bT.a(0, new cct(this));
      this.bT.a(1, new cmi.a(this));
      this.bT.a(2, new cdj(this, 1.0, false));
      this.bT.a(7, new cem(this, 1.0, 0.0F));
      this.bT.a(8, new cdh(this, cps.class, 8.0F));
      this.bT.a(8, new cdu(this));
      this.bT.a(10, new cmi.b(this));
      this.bT.a(11, new cmi.d(this));
      this.bU.a(1, new cmi.c(this, this::a));
      this.bU.a(2, new cer(this));
      this.bU.a(3, new ces<>(this, cmj.class, true, false));
      this.bU.a(4, new cey<>(this, false));
   }

   public static bxi.a m() {
      return cms.gr().a(bxj.s, 40.0).a(bxj.v, 0.3F).a(bxj.c, 7.0).a(bxj.m, 64.0).a(bxj.B, 1.0);
   }

   @Override
   public void h(@Nullable bwb $$0) {
      super.h($$0);
      bxf $$1 = this.g(bxj.v);
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
            this.dV().a(this.dA(), this.dE(), this.dG(), axf.iG, this.dm(), 2.5F, 1.0F, false);
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
      dxn $$1 = this.x();
      if ($$1 != null) {
         $$0.a("carriedBlockState", vm.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      dxn $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = vm.a(this.dV().a(mb.f), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dV(), $$0);
   }

   boolean a(cps $$0) {
      return this.a($$0, 0.025, true, false, bwb.aH, new DoubleSupplier[]{this::dE});
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

   boolean b(bvf $$0) {
      fbs $$1 = new fbs(this.dA() - $$0.dA(), this.e(0.5) - $$0.dE(), this.dG() - $$0.dG());
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

      dxn $$4 = this.dV().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(aya.a);
      if ($$5 && !$$6) {
         fbs $$7 = this.dt();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dV().a(ecj.R, $$7, ecj.a.a(this));
            if (!this.bb()) {
               this.dV().a(null, this.K, this.L, this.M, axf.iH, this.dm(), 1.0F, 1.0F);
               this.a(axf.iH, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected axe u() {
      return this.gm() ? axf.iF : axf.iC;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.iE;
   }

   @Override
   protected axe o_() {
      return axf.iD;
   }

   @Override
   protected void a(ash $$0, btv $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dxn $$3 = this.x();
      if ($$3 != null) {
         cxk $$4 = new cxk(cxo.pF);
         ddt.a($$4, $$0.K_(), dff.g, $$0.d_(this.dv()), this.dY());
         ewk.a $$5 = new ewk.a((ash)this.dV()).a(ezd.f, this.dt()).a(ezd.i, $$4).b(ezd.a, this);

         for (cxk $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable dxn $$0) {
      this.al.a(cb, Optional.ofNullable($$0));
   }

   @Nullable
   public dxn x() {
      return this.al.a(cb).orElse(null);
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         boolean $$3 = $$1.c() instanceof cqx;
         if (!$$1.a(axw.j) && !$$3) {
            boolean $$6 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof bwb) && this.ae.a(10) != 0) {
               this.t();
            }

            return $$6;
         } else {
            boolean $$4 = $$3 && this.a($$0, $$1, (cqx)$$1.c(), $$2);

            for (int $$5 = 0; $$5 < 64; $$5++) {
               if (this.t()) {
                  return true;
               }
            }

            return $$4;
         }
      }
   }

   private boolean a(ash $$0, btv $$1, cqx $$2, float $$3) {
      cxk $$4 = $$2.l();
      czj $$5 = $$4.a(ku.Q, czj.a);
      return $$5.a(czk.a) ? super.a($$0, $$1, $$3) : false;
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

   static class a extends ccz {
      private final cmi a;
      @Nullable
      private bwb b;

      public a(cmi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccz.a.c, ccz.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.O_();
         if (!(this.b instanceof cps)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.a((cps)this.b);
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

   static class b extends ccz {
      private final cmi a;

      public b(cmi $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.x() == null) {
            return false;
         } else {
            return !a(this.a).N().b(dgw.c) ? false : this.a.dY().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         bam $$0 = this.a.dY();
         dha $$1 = this.a.dV();
         int $$2 = bae.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         int $$3 = bae.a(this.a.dC() + $$0.j() * 2.0);
         int $$4 = bae.a(this.a.dG() - 1.0 + $$0.j() * 2.0);
         jh $$5 = new jh($$2, $$3, $$4);
         dxn $$6 = $$1.a_($$5);
         jh $$7 = $$5.e();
         dxn $$8 = $$1.a_($$7);
         dxn $$9 = this.a.x();
         if ($$9 != null) {
            $$9 = dke.b($$9, this.a.dV(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(ecj.i, $$5, ecj.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dha $$0, jh $$1, dxn $$2, dxn $$3, dxn $$4, jh $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dkg.I) && $$4.m($$0, $$5) && $$2.a((dhd)$$0, $$1) && $$0.a_(this.a, fbn.a(fbs.a($$1))).isEmpty();
      }
   }

   static class c extends ces<cps> {
      private final cmi i;
      @Nullable
      private cps j;
      private int k;
      private int l;
      private final cgs m;
      private final cgs n = cgs.a().d();
      private final cgs.a o;

      public c(cmi $$0, @Nullable cgs.a $$1) {
         super($$0, cps.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((cps)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = cgs.a().a(this.l()).a(this.o);
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
               if (this.i.a((cps)this.c)) {
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

   static class d extends ccz {
      private final cmi a;

      public d(cmi $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.x() != null) {
            return false;
         } else {
            return !a(this.a).N().b(dgw.c) ? false : this.a.dY().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         bam $$0 = this.a.dY();
         dha $$1 = this.a.dV();
         int $$2 = bae.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         int $$3 = bae.a(this.a.dC() + $$0.j() * 3.0);
         int $$4 = bae.a(this.a.dG() - 2.0 + $$0.j() * 4.0);
         jh $$5 = new jh($$2, $$3, $$4);
         dxn $$6 = $$1.a_($$5);
         fbs $$7 = new fbs((double)this.a.dz() + 0.5, (double)$$3 + 0.5, (double)this.a.dF() + 0.5);
         fbs $$8 = new fbs((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         fbo $$9 = $$1.a(new dgi($$7, $$8, dgi.a.b, dgi.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(axu.ao) && $$10) {
            $$1.a($$5, false);
            $$1.a(ecj.f, $$5, ecj.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
