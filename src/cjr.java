import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjr extends ckb implements btr {
   private static final akq c = akq.b("attacking");
   private static final bus d = new bus(c, 0.15F, bus.a.a);
   private static final int e = 400;
   private static final int ca = 600;
   private static final ajv<Optional<dta>> cb = ajz.a(cjr.class, ajx.j);
   private static final ajv<Boolean> cc = ajz.a(cjr.class, ajx.k);
   private static final ajv<Boolean> cd = ajz.a(cjr.class, ajx.k);
   private int ce = Integer.MIN_VALUE;
   private int cf;
   private static final bqb cg = azo.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;

   public cjr(bsw<? extends cjr> $$0, dcu $$1) {
      super($$0, $$1);
      this.a(epp.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bU.a(0, new cae(this));
      this.bU.a(1, new cjr.a(this));
      this.bU.a(2, new cau(this, 1.0, false));
      this.bU.a(7, new cbx(this, 1.0, 0.0F));
      this.bU.a(8, new cas(this, cmv.class, 8.0F));
      this.bU.a(8, new cbf(this));
      this.bU.a(10, new cjr.b(this));
      this.bU.a(11, new cjr.d(this));
      this.bV.a(1, new cjr.c(this, this::a_));
      this.bV.a(2, new ccc(this));
      this.bV.a(3, new ccd<>(this, cjs.class, true, false));
      this.bV.a(4, new ccj<>(this, false));
   }

   public static but.a s() {
      return ckb.gs().a(buu.s, 40.0).a(buu.v, 0.3F).a(buu.c, 7.0).a(buu.m, 64.0).a(buu.B, 1.0);
   }

   @Override
   public void h(@Nullable btl $$0) {
      super.h($$0);
      buq $$1 = this.f(buu.v);
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
   protected void a(ajz.a $$0) {
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
            this.dQ().a(this.dv(), this.dz(), this.dB(), avo.in, this.df(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(ajv<?> $$0) {
      if (cc.equals($$0) && this.go() && this.dQ().B) {
         this.t();
      }

      super.a($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      dta $$1 = this.gm();
      if ($$1 != null) {
         $$0.a("carriedBlockState", up.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      dta $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = up.a(this.dQ().a(lu.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dQ(), $$0);
   }

   boolean g(cmv $$0) {
      cuo $$1 = $$0.fZ().i.get(3);
      if ($$1.a(dfy.ee.r())) {
         return false;
      } else {
         eww $$2 = $$0.g(1.0F).d();
         eww $$3 = new eww(this.dv() - $$0.dv(), this.dz() - $$0.dz(), this.dB() - $$0.dB());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.F(this) : false;
      }
   }

   @Override
   public void m_() {
      if (this.dQ().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dQ().a(lm.ac, this.d(0.5), this.dy() - 0.25, this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      }

      this.bn = false;
      if (!this.dQ().B) {
         this.a((aqt)this.dQ(), true);
      }

      super.m_();
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   protected void Z() {
      if (this.dQ().R() && this.ai >= this.cf + 600) {
         float $$0 = this.bu();
         if ($$0 > 0.5F && this.dQ().h(this.dq()) && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.x();
         }
      }

      super.Z();
   }

   protected boolean x() {
      if (!this.dQ().x_() && this.bE()) {
         double $$0 = this.dv() + (this.ah.j() - 0.5) * 64.0;
         double $$1 = this.dx() + (double)(this.ah.a(64) - 32);
         double $$2 = this.dB() + (this.ah.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bsq $$0) {
      eww $$1 = new eww(this.dv() - $$0.dv(), this.e(0.5) - $$0.dz(), this.dB() - $$0.dB());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dv() + (this.ah.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dx() + (double)(this.ah.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dB() + (this.ah.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      jd.a $$3 = new jd.a($$0, $$1, $$2);

      while ($$3.v() > this.dQ().I_() && !this.dQ().a_($$3).d()) {
         $$3.c(ji.a);
      }

      dta $$4 = this.dQ().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(awj.a);
      if ($$5 && !$$6) {
         eww $$7 = this.do();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dQ().a(dxw.R, $$7, dxw.a.a(this));
            if (!this.aX()) {
               this.dQ().a(null, this.L, this.M, this.N, avo.io, this.df(), 1.0F, 1.0F);
               this.a(avo.io, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected avn v() {
      return this.gn() ? avo.im : avo.ij;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.il;
   }

   @Override
   protected avn n_() {
      return avo.ik;
   }

   @Override
   protected void a(aqt $$0, brj $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dta $$3 = this.gm();
      if ($$3 != null) {
         cuo $$4 = new cuo(cur.pj);
         dac.a($$4, $$0.H_(), dbn.g, $$0.d_(this.dq()), this.dT());
         ero.a $$5 = new ero.a((aqt)this.dQ()).a(euh.f, this.do()).a(euh.i, $$4).b(euh.a, this);

         for (cuo $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void c(@Nullable dta $$0) {
      this.ao.a(cb, Optional.ofNullable($$0));
   }

   @Nullable
   public dta gm() {
      return this.ao.a(cb).orElse(null);
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cnz;
         if (!$$0.a(awf.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dQ().x_() && !($$0.d() instanceof btl) && this.ah.a(10) != 0) {
               this.x();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cnz)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.x()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(brj $$0, cnz $$1, float $$2) {
      cuo $$3 = $$1.p();
      cws $$4 = $$3.a(kq.G, cws.a);
      return $$4.a(cwt.a) ? super.a($$0, $$2) : false;
   }

   public boolean gn() {
      return this.ao.a(cc);
   }

   public boolean go() {
      return this.ao.a(cd);
   }

   public void gp() {
      this.ao.a(cd, true);
   }

   @Override
   public boolean W() {
      return super.W() || this.gm() != null;
   }

   static class a extends cak {
      private final cjr a;
      @Nullable
      private btl b;

      public a(cjr $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cak.a.c, cak.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.p();
         if (!(this.b instanceof cmv)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.g((cmv)this.b);
         }
      }

      @Override
      public void d() {
         this.a.J().n();
      }

      @Override
      public void a() {
         this.a.F().a(this.b.dv(), this.b.dz(), this.b.dB());
      }
   }

   static class b extends cak {
      private final cjr a;

      public b(cjr $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gm() == null) {
            return false;
         } else {
            return !this.a.dQ().ab().b(dcq.c) ? false : this.a.dT().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         ayv $$0 = this.a.dT();
         dcu $$1 = this.a.dQ();
         int $$2 = ayn.a(this.a.dv() - 1.0 + $$0.j() * 2.0);
         int $$3 = ayn.a(this.a.dx() + $$0.j() * 2.0);
         int $$4 = ayn.a(this.a.dB() - 1.0 + $$0.j() * 2.0);
         jd $$5 = new jd($$2, $$3, $$4);
         dta $$6 = $$1.a_($$5);
         jd $$7 = $$5.d();
         dta $$8 = $$1.a_($$7);
         dta $$9 = this.a.gm();
         if ($$9 != null) {
            $$9 = dfw.b($$9, this.a.dQ(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dxw.i, $$5, dxw.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dcu $$0, jd $$1, dta $$2, dta $$3, dta $$4, jd $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(dfy.F) && $$4.r($$0, $$5) && $$2.a((dcx)$$0, $$1) && $$0.a_(this.a, ewr.a(eww.a($$1))).isEmpty();
      }
   }

   static class c extends ccd<cmv> {
      private final cjr i;
      @Nullable
      private cmv j;
      private int k;
      private int l;
      private final ced m;
      private final ced n = ced.a().d();
      private final Predicate<btl> o;

      public c(cjr $$0, @Nullable Predicate<btl> $$1) {
         super($$0, cmv.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cmv)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = ced.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean b() {
         this.j = this.i.dQ().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void d() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gp();
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
               if (this.i.g((cmv)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.x();
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

   static class d extends cak {
      private final cjr a;

      public d(cjr $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gm() != null) {
            return false;
         } else {
            return !this.a.dQ().ab().b(dcq.c) ? false : this.a.dT().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         ayv $$0 = this.a.dT();
         dcu $$1 = this.a.dQ();
         int $$2 = ayn.a(this.a.dv() - 2.0 + $$0.j() * 4.0);
         int $$3 = ayn.a(this.a.dx() + $$0.j() * 3.0);
         int $$4 = ayn.a(this.a.dB() - 2.0 + $$0.j() * 4.0);
         jd $$5 = new jd($$2, $$3, $$4);
         dta $$6 = $$1.a_($$5);
         eww $$7 = new eww((double)this.a.du() + 0.5, (double)$$3 + 0.5, (double)this.a.dA() + 0.5);
         eww $$8 = new eww((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ews $$9 = $$1.a(new dcd($$7, $$8, dcd.a.b, dcd.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(awd.al) && $$10) {
            $$1.a($$5, false);
            $$1.a(dxw.f, $$5, dxw.a.a(this.a, $$6));
            this.a.c($$6.b().o());
         }
      }
   }
}
