import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class clm extends clw implements bvk {
   private static final aku c = aku.b("attacking");
   private static final bwl d = new bwl(c, 0.15F, bwl.a.a);
   private static final int bY = 400;
   private static final int bZ = 600;
   private static final ajx<Optional<dwv>> ca = akb.a(clm.class, ajz.j);
   private static final ajx<Boolean> cb = akb.a(clm.class, ajz.k);
   private static final ajx<Boolean> cc = akb.a(clm.class, ajz.k);
   private int cd = Integer.MIN_VALUE;
   private int ce;
   private static final brt cf = baa.a(20, 39);
   private int cg;
   @Nullable
   private UUID ch;

   public clm(buq<? extends clm> $$0, dgg $$1) {
      super($$0, $$1);
      this.a(eto.j, -1.0F);
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbx(this));
      this.bS.a(1, new clm.a(this));
      this.bS.a(2, new ccn(this, 1.0, false));
      this.bS.a(7, new cdq(this, 1.0, 0.0F));
      this.bS.a(8, new ccl(this, cov.class, 8.0F));
      this.bS.a(8, new ccy(this));
      this.bS.a(10, new clm.b(this));
      this.bS.a(11, new clm.d(this));
      this.bT.a(1, new clm.c(this, this::a));
      this.bT.a(2, new cdv(this));
      this.bT.a(3, new cdw<>(this, cln.class, true, false));
      this.bT.a(4, new cec<>(this, false));
   }

   public static bwm.a m() {
      return clw.gu().a(bwn.s, 40.0).a(bwn.v, 0.3F).a(bwn.c, 7.0).a(bwn.m, 64.0).a(bwn.B, 1.0);
   }

   @Override
   public void h(@Nullable bvf $$0) {
      super.h($$0);
      bwj $$1 = this.g(bwn.v);
      if ($$0 == null) {
         this.ce = 0;
         this.al.a(cb, false);
         this.al.a(cc, false);
         $$1.c(c);
      } else {
         this.ce = this.af;
         this.al.a(cb, true);
         if (!$$1.b(c)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(ca, Optional.empty());
      $$0.a(cb, false);
      $$0.a(cc, false);
   }

   @Override
   public void c() {
      this.a(cf.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.cg = $$0;
   }

   @Override
   public int a() {
      return this.cg;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ch;
   }

   public void p() {
      if (this.af >= this.cd + 400) {
         this.cd = this.af;
         if (!this.bb()) {
            this.dW().a(this.dB(), this.dF(), this.dH(), avz.iI, this.dn(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(ajx<?> $$0) {
      if (cb.equals($$0) && this.gq() && this.dW().C) {
         this.p();
      }

      super.a($$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      dwv $$1 = this.x();
      if ($$1 != null) {
         $$0.a("carriedBlockState", uf.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      dwv $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = uf.a(this.dW().a(mc.f), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dW(), $$0);
   }

   boolean a(cov $$0) {
      return !bvf.aH.test($$0) ? false : this.a($$0, 0.025, true, false, new double[]{this.dF()});
   }

   @Override
   public void d_() {
      if (this.dW().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dW().a(lt.ae, this.d(0.5), this.dE() - 0.25, this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      }

      this.bm = false;
      if (!this.dW().C) {
         this.a((arc)this.dW(), true);
      }

      super.d_();
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   protected void a(arc $$0) {
      if ($$0.V() && this.af >= this.ce + 600) {
         float $$1 = this.by();
         if ($$1 > 0.5F && $$0.h(this.dw()) && this.ae.i() * 30.0F < ($$1 - 0.4F) * 2.0F) {
            this.h(null);
            this.t();
         }
      }

      super.a($$0);
   }

   protected boolean t() {
      if (!this.dW().B_() && this.bL()) {
         double $$0 = this.dB() + (this.ae.j() - 0.5) * 64.0;
         double $$1 = this.dD() + (double)(this.ae.a(64) - 32);
         double $$2 = this.dH() + (this.ae.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(buj $$0) {
      fay $$1 = new fay(this.dB() - $$0.dB(), this.e(0.5) - $$0.dF(), this.dH() - $$0.dH());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dB() + (this.ae.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dD() + (double)(this.ae.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dH() + (this.ae.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      ji.a $$3 = new ji.a($$0, $$1, $$2);

      while ($$3.v() > this.dW().L_() && !this.dW().a_($$3).d()) {
         $$3.c(jn.a);
      }

      dwv $$4 = this.dW().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(awu.a);
      if ($$5 && !$$6) {
         fay $$7 = this.du();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dW().a(ebr.R, $$7, ebr.a.a(this));
            if (!this.bb()) {
               this.dW().a(null, this.K, this.L, this.M, avz.iJ, this.dn(), 1.0F, 1.0F);
               this.a(avz.iJ, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected avy u() {
      return this.gp() ? avz.iH : avz.iE;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.iG;
   }

   @Override
   protected avy o_() {
      return avz.iF;
   }

   @Override
   protected void a(arc $$0, bsz $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dwv $$3 = this.x();
      if ($$3 != null) {
         cwn $$4 = new cwn(cwr.pO);
         dcz.a($$4, $$0.K_(), del.g, $$0.d_(this.dw()), this.dZ());
         evs.a $$5 = new evs.a((arc)this.dW()).a(eyj.f, this.du()).a(eyj.i, $$4).b(eyj.a, this);

         for (cwn $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable dwv $$0) {
      this.al.a(ca, Optional.ofNullable($$0));
   }

   @Nullable
   public dwv x() {
      return this.al.a(ca).orElse(null);
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         boolean $$3 = $$1.c() instanceof cqa;
         if (!$$1.a(awq.j) && !$$3) {
            boolean $$6 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof bvf) && this.ae.a(10) != 0) {
               this.t();
            }

            return $$6;
         } else {
            boolean $$4 = $$3 && this.a($$0, $$1, (cqa)$$1.c(), $$2);

            for (int $$5 = 0; $$5 < 64; $$5++) {
               if (this.t()) {
                  return true;
               }
            }

            return $$4;
         }
      }
   }

   private boolean a(arc $$0, bsz $$1, cqa $$2, float $$3) {
      cwn $$4 = $$2.l();
      cym $$5 = $$4.a(kv.Q, cym.a);
      return $$5.a(cyn.a) ? super.a($$0, $$1, $$3) : false;
   }

   public boolean gp() {
      return this.al.a(cb);
   }

   public boolean gq() {
      return this.al.a(cc);
   }

   public void gr() {
      this.al.a(cc, true);
   }

   @Override
   public boolean X() {
      return super.X() || this.x() != null;
   }

   static class a extends ccd {
      private final clm a;
      @Nullable
      private bvf b;

      public a(clm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccd.a.c, ccd.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.O_();
         if (!(this.b instanceof cov)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.a((cov)this.b);
         }
      }

      @Override
      public void d() {
         this.a.L().m();
      }

      @Override
      public void a() {
         this.a.H().a(this.b.dB(), this.b.dF(), this.b.dH());
      }
   }

   static class b extends ccd {
      private final clm a;

      public b(clm $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.x() == null) {
            return false;
         } else {
            return !a(this.a).O().b(dgc.c) ? false : this.a.dZ().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azg $$0 = this.a.dZ();
         dgg $$1 = this.a.dW();
         int $$2 = ayy.a(this.a.dB() - 1.0 + $$0.j() * 2.0);
         int $$3 = ayy.a(this.a.dD() + $$0.j() * 2.0);
         int $$4 = ayy.a(this.a.dH() - 1.0 + $$0.j() * 2.0);
         ji $$5 = new ji($$2, $$3, $$4);
         dwv $$6 = $$1.a_($$5);
         ji $$7 = $$5.e();
         dwv $$8 = $$1.a_($$7);
         dwv $$9 = this.a.x();
         if ($$9 != null) {
            $$9 = djk.b($$9, this.a.dW(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(ebr.i, $$5, ebr.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dgg $$0, ji $$1, dwv $$2, dwv $$3, dwv $$4, ji $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(djm.I) && $$4.m($$0, $$5) && $$2.a((dgj)$$0, $$1) && $$0.a_(this.a, fat.a(fay.a($$1))).isEmpty();
      }
   }

   static class c extends cdw<cov> {
      private final clm i;
      @Nullable
      private cov j;
      private int k;
      private int l;
      private final cfw m;
      private final cfw n = cfw.a().d();
      private final cfw.a o;

      public c(clm $$0, @Nullable cfw.a $$1) {
         super($$0, cov.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((cov)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = cfw.a().a(this.l()).a(this.o);
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
         this.i.gr();
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
               if (this.i.a((cov)this.c)) {
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

   static class d extends ccd {
      private final clm a;

      public d(clm $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.x() != null) {
            return false;
         } else {
            return !a(this.a).O().b(dgc.c) ? false : this.a.dZ().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azg $$0 = this.a.dZ();
         dgg $$1 = this.a.dW();
         int $$2 = ayy.a(this.a.dB() - 2.0 + $$0.j() * 4.0);
         int $$3 = ayy.a(this.a.dD() + $$0.j() * 3.0);
         int $$4 = ayy.a(this.a.dH() - 2.0 + $$0.j() * 4.0);
         ji $$5 = new ji($$2, $$3, $$4);
         dwv $$6 = $$1.a_($$5);
         fay $$7 = new fay((double)this.a.dA() + 0.5, (double)$$3 + 0.5, (double)this.a.dG() + 0.5);
         fay $$8 = new fay((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         fau $$9 = $$1.a(new dfo($$7, $$8, dfo.a.b, dfo.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(awo.ao) && $$10) {
            $$1.a($$5, false);
            $$1.a(ebr.f, $$5, ebr.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
