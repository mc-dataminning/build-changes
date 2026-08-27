import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceo extends cee implements btn<ceo.v> {
   private static final ajy<Integer> cl = akc.a(ceo.class, aka.b);
   private static final ajy<Byte> cm = akc.a(ceo.class, aka.a);
   private static final int cn = 1;
   public static final int ch = 4;
   public static final int ci = 8;
   public static final int ck = 16;
   private static final int co = 32;
   private static final int cp = 64;
   private static final int cq = 128;
   private static final ajy<Optional<UUID>> cr = akc.a(ceo.class, aka.r);
   private static final ajy<Optional<UUID>> cs = akc.a(ceo.class, aka.r);
   static final Predicate<cig> ct = $$0 -> !$$0.y() && $$0.bI();
   private static final Predicate<brv> cu = $$0 -> !($$0 instanceof bso $$1) ? false : $$1.ew() != null && $$1.ex() < $$1.am + 600;
   static final Predicate<brv> cv = $$0 -> $$0 instanceof cej || $$0 instanceof cey;
   private static final Predicate<brv> cw = $$0 -> !$$0.cd() && bsa.e.test($$0);
   private static final int cx = 600;
   private static final bry cy = bsb.S.n().a(0.5F).b(0.2975F);
   private bzl cz;
   private bzl cA;
   private bzl cB;
   private float cC;
   private float cD;
   float cE;
   float cF;
   private int cG;

   public ceo(bsb<? extends ceo> $$0, dca $$1) {
      super($$0, $$1);
      this.bX = new ceo.k();
      this.bY = new ceo.m();
      this.a(epv.p, 0.0F);
      this.a(epv.q, 0.0F);
      this.a_(true);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cr, Optional.empty());
      $$0.a(cs, Optional.empty());
      $$0.a(cl, 0);
      $$0.a(cm, (byte)0);
   }

   @Override
   protected void y() {
      this.cz = new cbe<>(this, cee.class, 10, false, false, $$0 -> $$0 instanceof cej || $$0 instanceof cey);
      this.cA = new cbe<>(this, cff.class, 10, false, false, cff.ch);
      this.cB = new cbe<>(this, ceb.class, 20, false, false, $$0 -> $$0 instanceof ced);
      this.cb.a(0, new ceo.g());
      this.cb.a(0, new bza(this, this.dU()));
      this.cb.a(1, new ceo.b());
      this.cb.a(2, new ceo.n(2.2));
      this.cb.a(3, new ceo.e(1.0));
      this.cb.a(4, new bys<>(this, cly.class, 16.0F, 1.6, 1.4, $$0 -> cw.test($$0) && !this.c($$0.cE()) && !this.gK()));
      this.cb.a(4, new bys<>(this, cfh.class, 8.0F, 1.6, 1.4, $$0 -> !((cfh)$$0).r() && !this.gK()));
      this.cb.a(4, new bys<>(this, cew.class, 8.0F, 1.6, 1.4, $$0 -> !this.gK()));
      this.cb.a(5, new ceo.u());
      this.cb.a(6, new ceo.o());
      this.cb.a(6, new ceo.s(1.25));
      this.cb.a(7, new ceo.l(1.2F, true));
      this.cb.a(7, new ceo.t());
      this.cb.a(8, new ceo.h(this, 1.25));
      this.cb.a(9, new ceo.q(32, 200));
      this.cb.a(10, new ceo.f(1.2F, 12, 1));
      this.cb.a(10, new bzr(this, 0.4F));
      this.cb.a(11, new cay(this, 1.0));
      this.cb.a(11, new ceo.p());
      this.cb.a(12, new ceo.j(this, cly.class, 24.0F));
      this.cb.a(13, new ceo.r());
      this.cc.a(3, new ceo.a(bso.class, false, false, $$0 -> cu.test($$0) && !this.c($$0.cE())));
   }

   @Override
   public avn d(cuh $$0) {
      return avo.jw;
   }

   @Override
   public void m_() {
      if (!this.dU().C && this.bI() && this.dg()) {
         this.cG++;
         cuh $$0 = this.d(bsc.a);
         if (this.n($$0)) {
            if (this.cG > 600) {
               cuh $$1 = $$0.a(this.dU(), this);
               if (!$$1.d()) {
                  this.a(bsc.a, $$1);
               }

               this.cG = 0;
            } else if (this.cG > 560 && this.al.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dU().a(this, (byte)45);
            }
         }

         bso $$2 = this.p();
         if ($$2 == null || !$$2.bI()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fU() || this.fp()) {
         this.by = false;
         this.bz = 0.0F;
         this.bB = 0.0F;
      }

      super.m_();
      if (this.gK() && this.al.i() < 0.05F) {
         this.a(avo.js, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fp() {
      return this.eJ();
   }

   private boolean n(cuh $$0) {
      return $$0.b(ke.t) && this.p() == null && this.aE() && !this.fU();
   }

   @Override
   protected void a(ayt $$0, bpy $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cuh $$3;
         if ($$2 < 0.05F) {
            $$3 = new cuh(cuk.pP);
         } else if ($$2 < 0.2F) {
            $$3 = new cuh(cuk.so);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cuh(cuk.wo) : new cuh(cuk.wp);
         } else if ($$2 < 0.6F) {
            $$3 = new cuh(cuk.qP);
         } else if ($$2 < 0.8F) {
            $$3 = new cuh(cuk.sa);
         } else {
            $$3 = new cuh(cuk.qM);
         }

         this.a(bsc.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cuh $$1 = this.d(bsc.a);
         if (!$$1.d()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ewu $$3 = new ewu(((double)this.al.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dM() * (float) (Math.PI / 180.0))
                  .b(-this.dK() * (float) (Math.PI / 180.0));
               this.dU().a(new kx(lb.Q, $$1), this.dz() + this.bQ().c / 2.0, this.dB(), this.dF() + this.bQ().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static btu.a r() {
      return bsq.A().a(btv.r, 0.3F).a(btv.q, 10.0).a(btv.k, 32.0).a(btv.c, 2.0);
   }

   @Nullable
   public ceo b(aqt $$0, brp $$1) {
      ceo $$2 = bsb.S.a((dca)$$0);
      if ($$2 != null) {
         $$2.a(this.al.h() ? this.t() : ((ceo)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bsb<ceo> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.a_($$3.d()).a(awe.ch) && a($$1, $$3);
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      ja<dcz> $$4 = $$0.t(this.du());
      ceo.v $$5 = ceo.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof ceo.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new ceo.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof aqt) {
         this.gI();
      }

      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gI() {
      if (this.t() == ceo.v.a) {
         this.cc.a(4, this.cz);
         this.cc.a(4, this.cA);
         this.cc.a(6, this.cB);
      } else {
         this.cc.a(4, this.cB);
         this.cc.a(6, this.cz);
         this.cc.a(6, this.cA);
      }
   }

   @Override
   protected void a(cly $$0, bpz $$1, cuh $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bry e(bsz $$0) {
      return this.o_() ? cy : super.e($$0);
   }

   public ceo.v t() {
      return ceo.v.a(this.as.a(cl));
   }

   public void a(ceo.v $$0) {
      this.as.a(cl, $$0.a());
   }

   List<UUID> gJ() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.as.a(cr).orElse(null));
      $$0.add(this.as.a(cs).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.as.a(cr).isPresent()) {
         this.as.a(cs, Optional.ofNullable($$0));
      } else {
         this.as.a(cr, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gJ();
      uq $$2 = new uq();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(uz.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fU());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.x());
      $$0.a("Crouching", this.cf());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);

      for (vh $$2 : $$0.c("Trusted", 11)) {
         this.b(uz.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(ceo.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dU() instanceof aqt) {
         this.gI();
      }
   }

   public boolean x() {
      return this.v(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gy() {
      return this.v(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gK() {
      return this.v(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fU() {
      return this.v(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.as.a(cm, (byte)(this.as.a(cm) | $$0));
      } else {
         this.as.a(cm, (byte)(this.as.a(cm) & ~$$0));
      }
   }

   private boolean v(int $$0) {
      return (this.as.a(cm) & $$0) != 0;
   }

   @Override
   public boolean f(cuh $$0) {
      bsc $$1 = bsq.h($$0);
      return !this.d($$1).d() ? false : $$1 == bsc.a && super.f($$0);
   }

   @Override
   public boolean j(cuh $$0) {
      cuh $$1 = this.d(bsc.a);
      return $$1.d() || this.cG > 0 && $$0.b(ke.t) && !$$1.b(ke.t);
   }

   private void p(cuh $$0) {
      if (!$$0.d() && !this.dU().C) {
         cig $$1 = new cig(this.dU(), this.dz() + this.bQ().c, this.dB() + 1.0, this.dF() + this.bQ().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(avo.jB, 1.0F, 1.0F);
         this.dU().b($$1);
      }
   }

   private void q(cuh $$0) {
      cig $$1 = new cig(this.dU(), this.dz(), this.dB(), this.dF(), $$0);
      this.dU().b($$1);
   }

   @Override
   protected void b(cig $$0) {
      cuh $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.G();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.d(bsc.a));
         this.a($$0);
         this.a(bsc.a, $$1.a(1));
         this.f(bsc.a);
         this.a($$0, $$1.G());
         $$0.ao();
         this.cG = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dg()) {
         boolean $$0 = this.bi();
         if ($$0 || this.p() != null || this.dU().ac()) {
            this.gL();
         }

         if ($$0 || this.fU()) {
            this.w(false);
         }

         if (this.gy() && this.dU().A.i() < 0.2F) {
            ir $$1 = this.du();
            dtc $$2 = this.dU().a_($$1);
            this.dU().c(2001, $$1, dfc.i($$2));
         }
      }

      this.cD = this.cC;
      if (this.gH()) {
         this.cC = this.cC + (1.0F - this.cC) * 0.4F;
      } else {
         this.cC = this.cC + (0.0F - this.cC) * 0.4F;
      }

      this.cF = this.cE;
      if (this.cf()) {
         this.cE += 0.2F;
         if (this.cE > 3.0F) {
            this.cE = 3.0F;
         }
      } else {
         this.cE = 0.0F;
      }
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.Z);
   }

   @Override
   protected void a(cly $$0, bsq $$1) {
      ((ceo)$$1).b($$0.cE());
   }

   public boolean gE() {
      return this.v(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gF() {
      return this.by;
   }

   public boolean gG() {
      return this.cE == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean cf() {
      return this.v(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gH() {
      return this.v(8);
   }

   public float G(float $$0) {
      return aym.i($$0, this.cD, this.cC) * 0.11F * (float) Math.PI;
   }

   public float H(float $$0) {
      return aym.i($$0, this.cF, this.cE);
   }

   @Override
   public void h(@Nullable bso $$0) {
      if (this.gK() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return aym.f(($$0 - 5.0F) * $$1);
   }

   void gL() {
      this.C(false);
   }

   void gM() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gN() {
      return !this.fU() && !this.x() && !this.gy();
   }

   @Override
   public void P() {
      avn $$0 = this.u();
      if ($$0 == avo.jy) {
         this.a($$0, 2.0F, this.fo());
      } else {
         super.P();
      }
   }

   @Nullable
   @Override
   protected avn u() {
      if (this.fU()) {
         return avo.jz;
      } else {
         if (!this.dU().R() && this.al.i() < 0.1F) {
            List<cly> $$0 = this.dU().a(cly.class, this.cP().c(16.0, 16.0, 16.0), bsa.f);
            if ($$0.isEmpty()) {
               return avo.jy;
            }
         }

         return avo.jt;
      }
   }

   @Nullable
   @Override
   protected avn d(bqt $$0) {
      return avo.jx;
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.jv;
   }

   boolean c(UUID $$0) {
      return this.gJ().contains($$0);
   }

   @Override
   protected void g(bqt $$0) {
      cuh $$1 = this.d(bsc.a);
      if (!$$1.d()) {
         this.b($$1);
         this.a(bsc.a, cuh.i);
      }

      super.g($$0);
   }

   public static boolean a(ceo $$0, bso $$1) {
      double $$2 = $$1.dF() - $$0.dF();
      double $$3 = $$1.dz() - $$0.dz();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dU().a_(ir.a($$0.dz() + $$8, $$0.dB() + (double)$$9, $$0.dF() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ewu cR() {
      return new ewu(0.0, (double)(0.55F * this.cQ()), (double)(this.do() * 0.4F));
   }

   class a extends cbe<bso> {
      @Nullable
      private bso j;
      @Nullable
      private bso k;
      private int l;

      public a(Class<bso> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bso> $$3) {
         super(ceo.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.et().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : ceo.this.gJ()) {
               if ($$0 != null && ceo.this.dU() instanceof aqt && ((aqt)ceo.this.dU()).a($$0) instanceof bso $$2) {
                  this.k = $$2;
                  this.j = $$2.eu();
                  int $$3 = $$2.ev();
                  return $$3 != this.l && this.a(this.j, this.d);
               }
            }

            return false;
         }
      }

      @Override
      public void c() {
         this.a(this.j);
         this.c = this.j;
         if (this.k != null) {
            this.l = this.k.ev();
         }

         ceo.this.a(avo.js, 1.0F, 1.0F);
         ceo.this.B(true);
         ceo.this.gL();
         super.c();
      }
   }

   class b extends bzl {
      int a;

      public b() {
         this.a(EnumSet.of(bzl.a.b, bzl.a.c, bzl.a.a));
      }

      @Override
      public boolean a() {
         return ceo.this.gy();
      }

      @Override
      public boolean b() {
         return this.a() && this.a > 0;
      }

      @Override
      public void c() {
         this.a = this.a(40);
      }

      @Override
      public void d() {
         ceo.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bso> {
      public boolean a(bso $$0) {
         if ($$0 instanceof ceo) {
            return false;
         } else if ($$0 instanceof cej || $$0 instanceof cey || $$0 instanceof cjd) {
            return true;
         } else if ($$0 instanceof btk) {
            return !((btk)$$0).r();
         } else if (!($$0 instanceof cly) || !$$0.O_() && !((cly)$$0).f()) {
            return ceo.this.c($$0.cE()) ? false : !$$0.fU() && !$$0.cd();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bzl {
      private final cde b = cde.a().a(12.0).d().a(ceo.this.new c());

      protected boolean h() {
         ir $$0 = ir.a(ceo.this.dz(), ceo.this.cP().e, ceo.this.dF());
         return !ceo.this.dU().h($$0) && ceo.this.d($$0) >= 0.0F;
      }

      protected boolean i() {
         return !ceo.this.dU().a(bso.class, this.b, ceo.this, ceo.this.cP().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends byx {
      public e(double $$0) {
         super(ceo.this, $$0);
      }

      @Override
      public void c() {
         ((ceo)this.a).gM();
         ((ceo)this.c).gM();
         super.c();
      }

      @Override
      protected void g() {
         aqt $$0 = (aqt)this.b;
         ceo $$1 = (ceo)this.a.a($$0, (brp)this.c);
         if ($$1 != null) {
            aqu $$2 = this.a.gB();
            aqu $$3 = this.c.gB();
            aqu $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cE());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cE());
            }

            if ($$4 != null) {
               $$4.a(avz.P);
               an.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gD();
            this.c.gD();
            $$1.c_(-24000);
            $$1.b(this.a.dz(), this.a.dB(), this.a.dF(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.ab().b(dbw.f)) {
               this.b.b(new bse(this.b, this.a.dz(), this.a.dB(), this.a.dF(), this.a.et().a(7) + 1));
            }
         }
      }
   }

   public class f extends bzy {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(ceo.this, $$1, $$2, $$3);
      }

      @Override
      public double i() {
         return 2.0;
      }

      @Override
      public boolean l() {
         return this.d % 100 == 0;
      }

      @Override
      protected boolean a(dcd $$0, ir $$1) {
         dtc $$2 = $$0.a_($$1);
         return $$2.a(dfe.pi) && $$2.c(dnu.c) >= 2 || dfy.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && ceo.this.al.i() < 0.05F) {
            ceo.this.a(avo.jA, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (ceo.this.dU().ab().b(dbw.c)) {
            dtc $$0 = ceo.this.dU().a_(this.e);
            if ($$0.a(dfe.pi)) {
               this.b($$0);
            } else if (dfy.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dtc $$0) {
         dfy.a(ceo.this, $$0, ceo.this.dU(), this.e);
      }

      private void b(dtc $$0) {
         int $$1 = $$0.c(dnu.c);
         $$0.a(dnu.c, Integer.valueOf(1));
         int $$2 = 1 + ceo.this.dU().A.a(2) + ($$1 == 3 ? 1 : 0);
         cuh $$3 = ceo.this.d(bsc.a);
         if ($$3.d()) {
            ceo.this.a(bsc.a, new cuh(cuk.yd));
            $$2--;
         }

         if ($$2 > 0) {
            dfc.a(ceo.this.dU(), this.e, new cuh(cuk.yd, $$2));
         }

         ceo.this.a(avo.zN, 1.0F, 1.0F);
         ceo.this.dU().a(this.e, $$0.a(dnu.c, Integer.valueOf(1)), 2);
         ceo.this.dU().a(dxv.c, this.e, dxv.a.a(ceo.this));
      }

      @Override
      public boolean a() {
         return !ceo.this.fU() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         ceo.this.w(false);
         super.c();
      }
   }

   class g extends bzf {
      public g() {
         super(ceo.this);
      }

      @Override
      public void c() {
         super.c();
         ceo.this.gM();
      }

      @Override
      public boolean a() {
         return ceo.this.bi() && ceo.this.b(awj.a) > 0.25 || ceo.this.bx();
      }
   }

   class h extends bzk {
      private final ceo e;

      public h(ceo $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gK() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gK() && super.b();
      }

      @Override
      public void c() {
         this.e.gM();
         super.c();
      }
   }

   public static class i extends brp.a {
      public final ceo.v a;

      public i(ceo.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bzt {
      public j(bsq $$0, Class<? extends bso> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !ceo.this.gy() && !ceo.this.gH();
      }

      @Override
      public boolean b() {
         return super.b() && !ceo.this.gy() && !ceo.this.gH();
      }
   }

   public class k extends byn {
      public k() {
         super(ceo.this);
      }

      @Override
      public void a() {
         if (!ceo.this.fU()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !ceo.this.gE() && !ceo.this.cf() && !ceo.this.gH() && !ceo.this.gy();
      }
   }

   class l extends bzv {
      public l(double $$0, boolean $$1) {
         super(ceo.this, $$0, $$1);
      }

      @Override
      protected void a(bso $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            ceo.this.a(avo.ju, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         ceo.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !ceo.this.x() && !ceo.this.fU() && !ceo.this.cf() && !ceo.this.gy() && super.a();
      }
   }

   class m extends byo {
      public m() {
         super(ceo.this);
      }

      @Override
      public void a() {
         if (ceo.this.gN()) {
            super.a();
         }
      }
   }

   class n extends cae {
      public n(double $$0) {
         super(ceo.this, $$0);
      }

      @Override
      public boolean h() {
         return !ceo.this.gK() && super.h();
      }
   }

   public class o extends bzp {
      @Override
      public boolean a() {
         if (!ceo.this.gG()) {
            return false;
         } else {
            bso $$0 = ceo.this.p();
            if ($$0 != null && $$0.bI()) {
               if ($$0.cN() != $$0.cM()) {
                  return false;
               } else {
                  boolean $$1 = ceo.a(ceo.this, $$0);
                  if (!$$1) {
                     ceo.this.J().a($$0, 0);
                     ceo.this.y(false);
                     ceo.this.z(false);
                  }

                  return $$1;
               }
            } else {
               return false;
            }
         }
      }

      @Override
      public boolean b() {
         bso $$0 = ceo.this.p();
         if ($$0 != null && $$0.bI()) {
            double $$1 = ceo.this.dx().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(ceo.this.dM()) < 15.0F) || !ceo.this.aE()) && !ceo.this.gy();
         } else {
            return false;
         }
      }

      @Override
      public boolean R_() {
         return false;
      }

      @Override
      public void c() {
         ceo.this.s(true);
         ceo.this.x(true);
         ceo.this.z(false);
         bso $$0 = ceo.this.p();
         if ($$0 != null) {
            ceo.this.F().a($$0, 60.0F, 30.0F);
            ewu $$1 = new ewu($$0.dz() - ceo.this.dz(), $$0.dB() - ceo.this.dB(), $$0.dF() - ceo.this.dF()).d();
            ceo.this.g(ceo.this.dx().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         ceo.this.J().n();
      }

      @Override
      public void d() {
         ceo.this.y(false);
         ceo.this.cE = 0.0F;
         ceo.this.cF = 0.0F;
         ceo.this.z(false);
         ceo.this.x(false);
      }

      @Override
      public void e() {
         bso $$0 = ceo.this.p();
         if ($$0 != null) {
            ceo.this.F().a($$0, 60.0F, 30.0F);
         }

         if (!ceo.this.gy()) {
            ewu $$1 = ceo.this.dx();
            if ($$1.d * $$1.d < 0.03F && ceo.this.dM() != 0.0F) {
               ceo.this.s(aym.j(0.2F, ceo.this.dM(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               ceo.this.s((float)$$3);
            }
         }

         if ($$0 != null && ceo.this.f($$0) <= 2.0F) {
            ceo.this.C($$0);
         } else if (ceo.this.dM() > 0.0F && ceo.this.aE() && (float)ceo.this.dx().d != 0.0F && ceo.this.dU().a_(ceo.this.du()).a(dfe.eB)) {
            ceo.this.s(60.0F);
            ceo.this.h(null);
            ceo.this.A(true);
         }
      }
   }

   class p extends bzl {
      public p() {
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean a() {
         if (!ceo.this.d(bsc.a).d()) {
            return false;
         } else if (ceo.this.p() != null || ceo.this.eu() != null) {
            return false;
         } else if (!ceo.this.gN()) {
            return false;
         } else if (ceo.this.et().a(b(10)) != 0) {
            return false;
         } else {
            List<cig> $$0 = ceo.this.dU().a(cig.class, ceo.this.cP().c(8.0, 8.0, 8.0), ceo.ct);
            return !$$0.isEmpty() && ceo.this.d(bsc.a).d();
         }
      }

      @Override
      public void e() {
         List<cig> $$0 = ceo.this.dU().a(cig.class, ceo.this.cP().c(8.0, 8.0, 8.0), ceo.ct);
         cuh $$1 = ceo.this.d(bsc.a);
         if ($$1.d() && !$$0.isEmpty()) {
            ceo.this.J().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cig> $$0 = ceo.this.dU().a(cig.class, ceo.this.cP().c(8.0, 8.0, 8.0), ceo.ct);
         if (!$$0.isEmpty()) {
            ceo.this.J().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends car {
      public q(int $$0, int $$1) {
         super(ceo.this, $$1);
      }

      @Override
      public void c() {
         ceo.this.gM();
         super.c();
      }

      @Override
      public boolean a() {
         return super.a() && this.h();
      }

      @Override
      public boolean b() {
         return super.b() && this.h();
      }

      private boolean h() {
         return !ceo.this.fU() && !ceo.this.x() && !ceo.this.gK() && ceo.this.p() == null;
      }
   }

   class r extends ceo.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bzl.a.a, bzl.a.b));
      }

      @Override
      public boolean a() {
         return ceo.this.eu() == null
            && ceo.this.et().i() < 0.02F
            && !ceo.this.fU()
            && ceo.this.p() == null
            && ceo.this.J().l()
            && !this.i()
            && !ceo.this.gE()
            && !ceo.this.cf();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + ceo.this.et().a(3);
         ceo.this.w(true);
         ceo.this.J().n();
      }

      @Override
      public void d() {
         ceo.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         ceo.this.F().a(ceo.this.dz() + this.c, ceo.this.dD(), ceo.this.dF() + this.d, (float)ceo.this.aa(), (float)ceo.this.Z());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * ceo.this.et().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + ceo.this.et().a(20));
      }
   }

   class s extends bze {
      private int c = b(100);

      public s(double $$0) {
         super(ceo.this, $$0);
      }

      @Override
      public boolean a() {
         if (!ceo.this.fU() && this.a.p() == null) {
            if (ceo.this.dU().ac() && ceo.this.dU().h(this.a.du())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ir $$0 = this.a.du();
               return ceo.this.dU().R() && ceo.this.dU().h($$0) && !((aqt)ceo.this.dU()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         ceo.this.gM();
         super.c();
      }
   }

   class t extends ceo.d {
      private static final int c = b(140);
      private int d = ceo.this.al.a(c);

      public t() {
         this.a(EnumSet.of(bzl.a.a, bzl.a.b, bzl.a.c));
      }

      @Override
      public boolean a() {
         return ceo.this.bz == 0.0F && ceo.this.bA == 0.0F && ceo.this.bB == 0.0F ? this.k() || ceo.this.fU() : false;
      }

      @Override
      public boolean b() {
         return this.k();
      }

      private boolean k() {
         if (this.d > 0) {
            this.d--;
            return false;
         } else {
            return ceo.this.dU().R() && this.h() && !this.i() && !ceo.this.aF;
         }
      }

      @Override
      public void d() {
         this.d = ceo.this.al.a(c);
         ceo.this.gM();
      }

      @Override
      public void c() {
         ceo.this.w(false);
         ceo.this.y(false);
         ceo.this.z(false);
         ceo.this.s(false);
         ceo.this.C(true);
         ceo.this.J().n();
         ceo.this.G().a(ceo.this.dz(), ceo.this.dB(), ceo.this.dF(), 0.0);
      }
   }

   class u extends bzl {
      public u() {
         this.a(EnumSet.of(bzl.a.a, bzl.a.b));
      }

      @Override
      public boolean a() {
         if (ceo.this.fU()) {
            return false;
         } else {
            bso $$0 = ceo.this.p();
            return $$0 != null && $$0.bI() && ceo.cv.test($$0) && ceo.this.g($$0) > 36.0 && !ceo.this.cf() && !ceo.this.gH() && !ceo.this.by;
         }
      }

      @Override
      public void c() {
         ceo.this.w(false);
         ceo.this.A(false);
      }

      @Override
      public void d() {
         bso $$0 = ceo.this.p();
         if ($$0 != null && ceo.a(ceo.this, $$0)) {
            ceo.this.z(true);
            ceo.this.y(true);
            ceo.this.J().n();
            ceo.this.F().a($$0, (float)ceo.this.aa(), (float)ceo.this.Z());
         } else {
            ceo.this.z(false);
            ceo.this.y(false);
         }
      }

      @Override
      public void e() {
         bso $$0 = ceo.this.p();
         if ($$0 != null) {
            ceo.this.F().a($$0, (float)ceo.this.aa(), (float)ceo.this.Z());
            if (ceo.this.g($$0) <= 36.0) {
               ceo.this.z(true);
               ceo.this.y(true);
               ceo.this.J().n();
            } else {
               ceo.this.J().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azg {
      a(0, "red"),
      b(1, "snow");

      public static final azg.a<ceo.v> c = azg.a(ceo.v::values);
      private static final IntFunction<ceo.v> d = axd.a(ceo.v::a, values(), axd.a.a);
      private final int e;
      private final String f;

      private v(int $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }

      public int a() {
         return this.e;
      }

      public static ceo.v a(String $$0) {
         return c.a($$0, a);
      }

      public static ceo.v a(int $$0) {
         return d.apply($$0);
      }

      public static ceo.v a(ja<dcz> $$0) {
         return $$0.a(awd.av) ? b : a;
      }
   }
}
