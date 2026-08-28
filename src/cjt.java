import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjt extends ckd implements btt {
   private static final akr c = akr.b("attacking");
   private static final buu d = new buu(c, 0.15F, buu.a.a);
   private static final int e = 400;
   private static final int ca = 600;
   private static final ajw<Optional<dtc>> cb = aka.a(cjt.class, ajy.j);
   private static final ajw<Boolean> cc = aka.a(cjt.class, ajy.k);
   private static final ajw<Boolean> cd = aka.a(cjt.class, ajy.k);
   private int ce = Integer.MIN_VALUE;
   private int cf;
   private static final bqc cg = azp.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;

   public cjt(bsx<? extends cjt> $$0, dcw $$1) {
      super($$0, $$1);
      this.a(epv.j, -1.0F);
   }

   @Override
   protected void B() {
      this.bU.a(0, new cag(this));
      this.bU.a(1, new cjt.a(this));
      this.bU.a(2, new caw(this, 1.0, false));
      this.bU.a(7, new cbz(this, 1.0, 0.0F));
      this.bU.a(8, new cau(this, cmx.class, 8.0F));
      this.bU.a(8, new cbh(this));
      this.bU.a(10, new cjt.b(this));
      this.bU.a(11, new cjt.d(this));
      this.bV.a(1, new cjt.c(this, this::a_));
      this.bV.a(2, new cce(this));
      this.bV.a(3, new ccf<>(this, cju.class, true, false));
      this.bV.a(4, new ccl<>(this, false));
   }

   public static buv.a s() {
      return ckd.gq().a(buw.s, 40.0).a(buw.v, 0.3F).a(buw.c, 7.0).a(buw.m, 64.0).a(buw.B, 1.0);
   }

   @Override
   public void h(@Nullable btn $$0) {
      super.h($$0);
      bus $$1 = this.f(buw.v);
      if ($$0 == null) {
         this.cf = 0;
         this.ao.a(cc, false);
         this.ao.a(cd, false);
         $$1.c(c);
      } else {
         this.cf = this.ai;
         this.ao.a(cc, true);
         if (!$$1.b(c)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cb, Optional.empty());
      $$0.a(cc, false);
      $$0.a(cd, false);
   }

   @Override
   public void c() {
      this.a(cg.a(this.ah));
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

   public void t() {
      if (this.ai >= this.ce + 400) {
         this.ce = this.ai;
         if (!this.aX()) {
            this.dO().a(this.dt(), this.dx(), this.dz(), avp.in, this.de(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(ajw<?> $$0) {
      if (cc.equals($$0) && this.gm() && this.dO().B) {
         this.t();
      }

      super.a($$0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      dtc $$1 = this.gk();
      if ($$1 != null) {
         $$0.a("carriedBlockState", uq.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      dtc $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = uq.a(this.dO().a(lu.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dO(), $$0);
   }

   boolean f(cmx $$0) {
      cuq $$1 = $$0.fY().i.get(3);
      if ($$1.a(dga.ee.r())) {
         return false;
      } else {
         exc $$2 = $$0.g(1.0F).d();
         exc $$3 = new exc(this.dt() - $$0.dt(), this.dx() - $$0.dx(), this.dz() - $$0.dz());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.F(this) : false;
      }
   }

   @Override
   public void m_() {
      if (this.dO().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dO().a(lm.ac, this.d(0.5), this.dw() - 0.25, this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      }

      this.bn = false;
      if (!this.dO().B) {
         this.a((aqu)this.dO(), true);
      }

      super.m_();
   }

   @Override
   public boolean fl() {
      return true;
   }

   @Override
   protected void ab() {
      if (this.dO().R() && this.ai >= this.cf + 600) {
         float $$0 = this.bu();
         if ($$0 > 0.5F && this.dO().h(this.do()) && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.x();
         }
      }

      super.ab();
   }

   protected boolean x() {
      if (!this.dO().x_() && this.bE()) {
         double $$0 = this.dt() + (this.ah.j() - 0.5) * 64.0;
         double $$1 = this.dv() + (double)(this.ah.a(64) - 32);
         double $$2 = this.dz() + (this.ah.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean c(bsr $$0) {
      exc $$1 = new exc(this.dt() - $$0.dt(), this.e(0.5) - $$0.dx(), this.dz() - $$0.dz());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dt() + (this.ah.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dv() + (double)(this.ah.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dz() + (this.ah.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      jd.a $$3 = new jd.a($$0, $$1, $$2);

      while ($$3.v() > this.dO().I_() && !this.dO().a_($$3).d()) {
         $$3.c(ji.a);
      }

      dtc $$4 = this.dO().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(awk.a);
      if ($$5 && !$$6) {
         exc $$7 = this.dm();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dO().a(dxz.R, $$7, dxz.a.a(this));
            if (!this.aX()) {
               this.dO().a(null, this.L, this.M, this.N, avp.io, this.de(), 1.0F, 1.0F);
               this.a(avp.io, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected avo v() {
      return this.gl() ? avp.im : avp.ij;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.il;
   }

   @Override
   protected avo n_() {
      return avp.ik;
   }

   @Override
   protected void a(aqu $$0, brk $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dtc $$3 = this.gk();
      if ($$3 != null) {
         cuq $$4 = new cuq(cut.pj);
         dae.a($$4, $$0.H_(), dbp.g, $$0.d_(this.do()), this.dR());
         eru.a $$5 = new eru.a((aqu)this.dO()).a(eun.f, this.dm()).a(eun.i, $$4).b(eun.a, this);

         for (cuq $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void c(@Nullable dtc $$0) {
      this.ao.a(cb, Optional.ofNullable($$0));
   }

   @Nullable
   public dtc gk() {
      return this.ao.a(cb).orElse(null);
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cob;
         if (!$$0.a(awg.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dO().x_() && !($$0.d() instanceof btn) && this.ah.a(10) != 0) {
               this.x();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cob)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.x()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(brk $$0, cob $$1, float $$2) {
      cuq $$3 = $$1.p();
      cwu $$4 = $$3.a(kq.G, cwu.a);
      return $$4.a(cwv.a) ? super.a($$0, $$2) : false;
   }

   public boolean gl() {
      return this.ao.a(cc);
   }

   public boolean gm() {
      return this.ao.a(cd);
   }

   public void gn() {
      this.ao.a(cd, true);
   }

   @Override
   public boolean Y() {
      return super.Y() || this.gk() != null;
   }

   static class a extends cam {
      private final cjt a;
      @Nullable
      private btn b;

      public a(cjt $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cam.a.c, cam.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.p();
         if (!(this.b instanceof cmx)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.f((cmx)this.b);
         }
      }

      @Override
      public void d() {
         this.a.N().n();
      }

      @Override
      public void a() {
         this.a.I().a(this.b.dt(), this.b.dx(), this.b.dz());
      }
   }

   static class b extends cam {
      private final cjt a;

      public b(cjt $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gk() == null) {
            return false;
         } else {
            return !this.a.dO().ab().b(dcs.c) ? false : this.a.dR().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         ayw $$0 = this.a.dR();
         dcw $$1 = this.a.dO();
         int $$2 = ayo.a(this.a.dt() - 1.0 + $$0.j() * 2.0);
         int $$3 = ayo.a(this.a.dv() + $$0.j() * 2.0);
         int $$4 = ayo.a(this.a.dz() - 1.0 + $$0.j() * 2.0);
         jd $$5 = new jd($$2, $$3, $$4);
         dtc $$6 = $$1.a_($$5);
         jd $$7 = $$5.e();
         dtc $$8 = $$1.a_($$7);
         dtc $$9 = this.a.gk();
         if ($$9 != null) {
            $$9 = dfy.b($$9, this.a.dO(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dxz.i, $$5, dxz.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dcw $$0, jd $$1, dtc $$2, dtc $$3, dtc $$4, jd $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(dga.F) && $$4.r($$0, $$5) && $$2.a((dcz)$$0, $$1) && $$0.a_(this.a, ewx.a(exc.a($$1))).isEmpty();
      }
   }

   static class c extends ccf<cmx> {
      private final cjt i;
      @Nullable
      private cmx j;
      private int k;
      private int l;
      private final cef m;
      private final cef n = cef.a().d();
      private final Predicate<btn> o;

      public c(cjt $$0, @Nullable Predicate<btn> $$1) {
         super($$0, cmx.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.f((cmx)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = cef.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean b() {
         this.j = this.i.dO().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void d() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gn();
      }

      @Override
      public void e() {
         this.j = null;
         super.e();
      }

      @Override
      public boolean c() {
         if (this.j != null) {
            if (!this.o.test(this.j)) {
               return false;
            } else {
               this.i.a(this.j, 10.0F, 10.0F);
               return true;
            }
         } else {
            if (this.c != null) {
               if (this.i.z(this.c)) {
                  return false;
               }

               if (this.n.a(this.i, this.c)) {
                  return true;
               }
            }

            return super.c();
         }
      }

      @Override
      public void a() {
         if (this.i.p() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.d();
            }
         } else {
            if (this.c != null && !this.i.bS()) {
               if (this.i.f((cmx)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.x();
                  }

                  this.l = 0;
               } else if (this.c.g(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.c(this.c)) {
                  this.l = 0;
               }
            }

            super.a();
         }
      }
   }

   static class d extends cam {
      private final cjt a;

      public d(cjt $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gk() != null) {
            return false;
         } else {
            return !this.a.dO().ab().b(dcs.c) ? false : this.a.dR().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         ayw $$0 = this.a.dR();
         dcw $$1 = this.a.dO();
         int $$2 = ayo.a(this.a.dt() - 2.0 + $$0.j() * 4.0);
         int $$3 = ayo.a(this.a.dv() + $$0.j() * 3.0);
         int $$4 = ayo.a(this.a.dz() - 2.0 + $$0.j() * 4.0);
         jd $$5 = new jd($$2, $$3, $$4);
         dtc $$6 = $$1.a_($$5);
         exc $$7 = new exc((double)this.a.ds() + 0.5, (double)$$3 + 0.5, (double)this.a.dy() + 0.5);
         exc $$8 = new exc((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ewy $$9 = $$1.a(new dcf($$7, $$8, dcf.a.b, dcf.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(awe.am) && $$10) {
            $$1.a($$5, false);
            $$1.a(dxz.f, $$5, dxz.a.a(this.a, $$6));
            this.a.c($$6.b().o());
         }
      }
   }
}
