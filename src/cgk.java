import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgk extends cga implements bvj<cgk.v> {
   private static final akg<Integer> cc = akk.a(cgk.class, aki.b);
   private static final akg<Byte> cd = akk.a(cgk.class, aki.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int ca = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final akg<Optional<UUID>> ci = akk.a(cgk.class, aki.r);
   private static final akg<Optional<UUID>> cj = akk.a(cgk.class, aki.r);
   static final Predicate<cke> ck = $$0 -> !$$0.w() && $$0.bI();
   private static final Predicate<bto> cl = $$0 -> !($$0 instanceof buk $$1) ? false : $$1.eo() != null && $$1.ep() < $$1.ag + 600;
   static final Predicate<bto> cm = $$0 -> $$0 instanceof cgf || $$0 instanceof cgu;
   private static final Predicate<bto> cn = $$0 -> !$$0.cd() && btt.e.test($$0);
   private static final int co = 600;
   private static final btr cp = btv.Q.n().a(0.5F).b(0.2975F);
   private cbh cq;
   private cbh cr;
   private cbh cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public cgk(btv<? extends cgk> $$0, deg $$1) {
      super($$0, $$1);
      this.bO = new cgk.k();
      this.bP = new cgk.m();
      this.a(erg.p, 0.0F);
      this.a(erg.q, 0.0F);
      this.a_(true);
      this.P().a(32.0F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void D() {
      this.cq = new cda<>(this, cga.class, 10, false, false, $$0 -> $$0 instanceof cgf || $$0 instanceof cgu);
      this.cr = new cda<>(this, chb.class, 10, false, false, chb.bY);
      this.cs = new cda<>(this, cfw.class, 20, false, false, $$0 -> $$0 instanceof cfy);
      this.bS.a(0, new cgk.g());
      this.bS.a(0, new caw(this, this.dS()));
      this.bS.a(1, new cgk.b());
      this.bS.a(2, new cgk.n(2.2));
      this.bS.a(3, new cgk.e(1.0));
      this.bS.a(4, new cao<>(this, cnu.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cD()) && !this.gD()));
      this.bS.a(4, new cao<>(this, chd.class, 8.0F, 1.6, 1.4, $$0 -> !((chd)$$0).q() && !this.gD()));
      this.bS.a(4, new cao<>(this, cgs.class, 8.0F, 1.6, 1.4, $$0 -> !this.gD()));
      this.bS.a(5, new cgk.u());
      this.bS.a(6, new cgk.o());
      this.bS.a(6, new cgk.s(1.25));
      this.bS.a(7, new cgk.l(1.2F, true));
      this.bS.a(7, new cgk.t());
      this.bS.a(8, new cgk.h(this, 1.25));
      this.bS.a(9, new cgk.q(32, 200));
      this.bS.a(10, new cgk.f(1.2F, 12, 1));
      this.bS.a(10, new cbn(this, 0.4F));
      this.bS.a(11, new ccu(this, 1.0));
      this.bS.a(11, new cgk.p());
      this.bS.a(12, new cgk.j(this, cnu.class, 24.0F));
      this.bS.a(13, new cgk.r());
      this.bT.a(3, new cgk.a(buk.class, false, false, $$0 -> cl.test($$0) && !this.c($$0.cD())));
   }

   @Override
   public void m_() {
      if (!this.dS().B && this.bI() && this.df()) {
         this.cx++;
         cvp $$0 = this.a(btw.a);
         if (this.m($$0)) {
            if (this.cx > 600) {
               cvp $$1 = $$0.a(this.dS(), this);
               if (!$$1.f()) {
                  this.a(btw.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.af.i() < 0.1F) {
               this.gv();
               this.dS().a(this, (byte)45);
            }
         }

         buk $$2 = this.m();
         if ($$2 == null || !$$2.bI()) {
            this.z(false);
            this.A(false);
         }
      }

      if (this.fM() || this.ff()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      }

      super.m_();
      if (this.gD() && this.af.i() < 0.05F) {
         this.a(awe.jg, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean ff() {
      return this.eB();
   }

   private boolean m(cvp $$0) {
      return $$0.b(kr.v) && this.m() == null && this.aH() && !this.fM();
   }

   @Override
   protected void a(azl $$0, brn $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cvp $$3;
         if ($$2 < 0.05F) {
            $$3 = new cvp(cvt.oB);
         } else if ($$2 < 0.2F) {
            $$3 = new cvp(cvt.qS);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cvp(cvt.uF) : new cvp(cvt.uG);
         } else if ($$2 < 0.6F) {
            $$3 = new cvp(cvt.px);
         } else if ($$2 < 0.8F) {
            $$3 = new cvp(cvt.qE);
         } else {
            $$3 = new cvp(cvt.pu);
         }

         this.a(btw.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cvp $$1 = this.a(btw.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               eys $$3 = new eys(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dK() * (float) (Math.PI / 180.0))
                  .b(-this.dI() * (float) (Math.PI / 180.0));
               this.dS().a(new lj(ln.S, $$1), this.dx() + this.bQ().d / 2.0, this.dz(), this.dD() + this.bQ().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bvq.a q() {
      return cga.gu().a(bvr.v, 0.3F).a(bvr.s, 10.0).a(bvr.c, 2.0).a(bvr.x, 5.0).a(bvr.m, 32.0);
   }

   @Nullable
   public cgk b(arh $$0, bth $$1) {
      cgk $$2 = btv.Q.a($$0, btu.e);
      if ($$2 != null) {
         $$2.a(this.af.h() ? this.t() : ((cgk)$$1).t());
      }

      return $$2;
   }

   public static boolean c(btv<cgk> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return $$1.a_($$3.e()).a(awt.cf) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      jn<dfh> $$4 = $$0.t(this.ds());
      cgk.v $$5 = cgk.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cgk.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cgk.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof arh) {
         this.gB();
      }

      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gB() {
      if (this.t() == cgk.v.a) {
         this.bT.a(4, this.cq);
         this.bT.a(4, this.cr);
         this.bT.a(6, this.cs);
      } else {
         this.bT.a(4, this.cs);
         this.bT.a(6, this.cq);
         this.bT.a(6, this.cr);
      }
   }

   @Override
   protected void gv() {
      this.a(awe.jk, 1.0F, 1.0F);
   }

   @Override
   public btr e(buw $$0) {
      return this.o_() ? cp : super.e($$0);
   }

   public cgk.v t() {
      return cgk.v.a(this.am.a(cc));
   }

   public void a(cgk.v $$0) {
      this.am.a(cc, $$0.a());
   }

   List<UUID> gC() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.am.a(ci).orElse(null));
      $$0.add(this.am.a(cj).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.am.a(ci).isPresent()) {
         this.am.a(cj, Optional.ofNullable($$0));
      } else {
         this.am.a(ci, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gC();
      ul $$2 = new ul();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(uu.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fM());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.cf());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);

      for (vc $$2 : $$0.c("Trusted", 11)) {
         this.b(uu.a($$2));
      }

      this.D($$0.q("Sleeping"));
      this.a(cgk.v.a($$0.l("Type")));
      this.x($$0.q("Sitting"));
      this.z($$0.q("Crouching"));
      if (this.dS() instanceof arh) {
         this.gB();
      }
   }

   public boolean y() {
      return this.t(1);
   }

   public void x(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gp() {
      return this.t(64);
   }

   void B(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gD() {
      return this.t(128);
   }

   void C(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fM() {
      return this.t(32);
   }

   void D(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.am.a(cd, (byte)(this.am.a(cd) | $$0));
      } else {
         this.am.a(cd, (byte)(this.am.a(cd) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.am.a(cd) & $$0) != 0;
   }

   @Override
   public boolean e(cvp $$0) {
      btw $$1 = this.g($$0);
      return !this.a($$1).f() ? false : $$1 == btw.a && super.e($$0);
   }

   @Override
   public boolean i(cvp $$0) {
      cvp $$1 = this.a(btw.a);
      return $$1.f() || this.cx > 0 && $$0.b(kr.v) && !$$1.b(kr.v);
   }

   private void o(cvp $$0) {
      if (!$$0.f() && !this.dS().B) {
         cke $$1 = new cke(this.dS(), this.dx() + this.bQ().d, this.dz() + 1.0, this.dD() + this.bQ().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awe.jp, 1.0F, 1.0F);
         this.dS().b($$1);
      }
   }

   private void p(cvp $$0) {
      cke $$1 = new cke(this.dS(), this.dx(), this.dz(), this.dD(), $$0);
      this.dS().b($$1);
   }

   @Override
   protected void b(cke $$0) {
      cvp $$1 = $$0.m();
      if (this.i($$1)) {
         int $$2 = $$1.J();
         if ($$2 > 1) {
            this.p($$1.a($$2 - 1));
         }

         this.o(this.a(btw.a));
         this.a($$0);
         this.a(btw.a, $$1.a(1));
         this.f(btw.a);
         this.a($$0, $$1.J());
         $$0.as();
         this.cx = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.df()) {
         boolean $$0 = this.bi();
         if ($$0 || this.m() != null || this.dS().ad()) {
            this.gE();
         }

         if ($$0 || this.fM()) {
            this.x(false);
         }

         if (this.gp() && this.dS().z.i() < 0.2F) {
            je $$1 = this.ds();
            duo $$2 = this.dS().a_($$1);
            this.dS().c(2001, $$1, dhj.j($$2));
         }
      }

      this.cu = this.ct;
      if (this.gt()) {
         this.ct = this.ct + (1.0F - this.ct) * 0.4F;
      } else {
         this.ct = this.ct + (0.0F - this.ct) * 0.4F;
      }

      this.cw = this.cv;
      if (this.cf()) {
         this.cv += 0.2F;
         if (this.cv > 3.0F) {
            this.cv = 3.0F;
         }
      } else {
         this.cv = 0.0F;
      }
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.Z);
   }

   @Override
   protected void a(cnu $$0, bum $$1) {
      ((cgk)$$1).b($$0.cD());
   }

   public boolean gq() {
      return this.t(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gr() {
      return this.bj;
   }

   public boolean gs() {
      return this.cv == 3.0F;
   }

   public void z(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean cf() {
      return this.t(4);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gt() {
      return this.t(8);
   }

   public float J(float $$0) {
      return azd.h($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return azd.h($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable buk $$0) {
      if (this.gD() && $$0 == null) {
         this.C(false);
      }

      super.h($$0);
   }

   void gE() {
      this.D(false);
   }

   void gF() {
      this.A(false);
      this.z(false);
      this.x(false);
      this.D(false);
      this.C(false);
      this.B(false);
   }

   boolean gG() {
      return !this.fM() && !this.y() && !this.gp();
   }

   @Override
   public void U() {
      awd $$0 = this.w();
      if ($$0 == awe.jm) {
         this.a($$0, 2.0F, this.fe());
      } else {
         super.U();
      }
   }

   @Nullable
   @Override
   protected awd w() {
      if (this.fM()) {
         return awe.jn;
      } else {
         if (!this.dS().S() && this.af.i() < 0.1F) {
            List<cnu> $$0 = this.dS().a(cnu.class, this.cO().c(16.0, 16.0, 16.0), btt.f);
            if ($$0.isEmpty()) {
               return awe.jm;
            }
         }

         return awe.jh;
      }
   }

   @Nullable
   @Override
   protected awd d(bsg $$0) {
      return awe.jl;
   }

   @Nullable
   @Override
   protected awd n_() {
      return awe.jj;
   }

   boolean c(UUID $$0) {
      return this.gC().contains($$0);
   }

   @Override
   protected void a(arh $$0, bsg $$1) {
      cvp $$2 = this.a(btw.a);
      if (!$$2.f()) {
         this.b($$2);
         this.a(btw.a, cvp.k);
      }

      super.a($$0, $$1);
   }

   public static boolean a(cgk $$0, buk $$1) {
      double $$2 = $$1.dD() - $$0.dD();
      double $$3 = $$1.dx() - $$0.dx();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dS().a_(je.a($$0.dx() + $$8, $$0.dz() + (double)$$9, $$0.dD() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public eys cQ() {
      return new eys(0.0, (double)(0.55F * this.cP()), (double)(this.dn() * 0.4F));
   }

   class a extends cda<buk> {
      @Nullable
      private buk j;
      @Nullable
      private buk k;
      private int l;

      public a(final Class<buk> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<buk> $$3) {
         super(cgk.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dV().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cgk.this.gC()) {
               if ($$0 != null && cgk.this.dS() instanceof arh && ((arh)cgk.this.dS()).a($$0) instanceof buk $$2) {
                  this.k = $$2;
                  this.j = $$2.em();
                  int $$3 = $$2.en();
                  return $$3 != this.l && this.a(this.j, this.d);
               }
            }

            return false;
         }
      }

      @Override
      public void d() {
         this.a(this.j);
         this.c = this.j;
         if (this.k != null) {
            this.l = this.k.en();
         }

         cgk.this.a(awe.jg, 1.0F, 1.0F);
         cgk.this.C(true);
         cgk.this.gE();
         super.d();
      }
   }

   class b extends cbh {
      int a;

      public b() {
         this.a(EnumSet.of(cbh.a.b, cbh.a.c, cbh.a.a));
      }

      @Override
      public boolean b() {
         return cgk.this.gp();
      }

      @Override
      public boolean c() {
         return this.b() && this.a > 0;
      }

      @Override
      public void d() {
         this.a = this.a(40);
      }

      @Override
      public void e() {
         cgk.this.B(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements Predicate<buk> {
      public boolean a(buk $$0) {
         if ($$0 instanceof cgk) {
            return false;
         } else if ($$0 instanceof cgf || $$0 instanceof cgu || $$0 instanceof cla) {
            return true;
         } else if ($$0 instanceof bvg) {
            return !((bvg)$$0).q();
         } else if (!($$0 instanceof cnu) || !$$0.P_() && !((cnu)$$0).f()) {
            return cgk.this.c($$0.cD()) ? false : !$$0.fM() && !$$0.cd();
         } else {
            return false;
         }
      }
   }

   abstract class d extends cbh {
      private final cfa b = cfa.a().a(12.0).d().a(cgk.this.new c());

      protected boolean h() {
         je $$0 = je.a(cgk.this.dx(), cgk.this.cO().e, cgk.this.dD());
         return !cgk.this.dS().h($$0) && cgk.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cgk.this.dS().a(buk.class, this.b, cgk.this, cgk.this.cO().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cat {
      public e(final double $$0) {
         super(cgk.this, $$0);
      }

      @Override
      public void d() {
         ((cgk)this.a).gF();
         ((cgk)this.c).gF();
         super.d();
      }

      @Override
      protected void g() {
         arh $$0 = (arh)this.b;
         cgk $$1 = (cgk)this.a.a($$0, (bth)this.c);
         if ($$1 != null) {
            ari $$2 = this.a.gy();
            ari $$3 = this.c.gy();
            ari $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cD());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cD());
            }

            if ($$4 != null) {
               $$4.a(awo.P);
               an.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gA();
            this.c.gA();
            $$1.c_(-24000);
            $$1.b(this.a.dx(), this.a.dz(), this.a.dD(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.ac().b(dec.f)) {
               this.b.b(new bua(this.b, this.a.dx(), this.a.dz(), this.a.dD(), this.a.dV().a(7) + 1));
            }
         }
      }
   }

   public class f extends cbu {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cgk.this, $$1, $$2, $$3);
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
      protected boolean a(dej $$0, je $$1) {
         duo $$2 = $$0.a_($$1);
         return $$2.a(dhl.oi) && $$2.c(dpn.c) >= 2 || dif.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cgk.this.af.i() < 0.05F) {
            cgk.this.a(awe.jo, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (cgk.this.dS().ac().b(dec.c)) {
            duo $$0 = cgk.this.dS().a_(this.e);
            if ($$0.a(dhl.oi)) {
               this.b($$0);
            } else if (dif.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(duo $$0) {
         dif.a(cgk.this, $$0, cgk.this.dS(), this.e);
      }

      private void b(duo $$0) {
         int $$1 = $$0.c(dpn.c);
         $$0.b(dpn.c, Integer.valueOf(1));
         int $$2 = 1 + cgk.this.dS().z.a(2) + ($$1 == 3 ? 1 : 0);
         cvp $$3 = cgk.this.a(btw.a);
         if ($$3.f()) {
            cgk.this.a(btw.a, new cvp(cvt.wx));
            $$2--;
         }

         if ($$2 > 0) {
            dhj.a(cgk.this.dS(), this.e, new cvp(cvt.wx, $$2));
         }

         cgk.this.a(awe.zy, 1.0F, 1.0F);
         cgk.this.dS().a(this.e, $$0.b(dpn.c, Integer.valueOf(1)), 2);
         cgk.this.dS().a(dzl.c, this.e, dzl.a.a(cgk.this));
      }

      @Override
      public boolean b() {
         return !cgk.this.fM() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         cgk.this.x(false);
         super.d();
      }
   }

   class g extends cbb {
      public g() {
         super(cgk.this);
      }

      @Override
      public void d() {
         super.d();
         cgk.this.gF();
      }

      @Override
      public boolean b() {
         return cgk.this.bi() && cgk.this.b(awz.a) > 0.25 || cgk.this.bw();
      }
   }

   class h extends cbg {
      private final cgk d;

      public h(final cgk $$0, final double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gD() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gD() && super.c();
      }

      @Override
      public void d() {
         this.d.gF();
         super.d();
      }
   }

   public static class i extends bth.a {
      public final cgk.v a;

      public i(cgk.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cbp {
      public j(final bum $$0, final Class<? extends buk> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !cgk.this.gp() && !cgk.this.gt();
      }

      @Override
      public boolean c() {
         return super.c() && !cgk.this.gp() && !cgk.this.gt();
      }
   }

   public class k extends caj {
      public k() {
         super(cgk.this);
      }

      @Override
      public void a() {
         if (!cgk.this.fM()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cgk.this.gq() && !cgk.this.cf() && !cgk.this.gt() && !cgk.this.gp();
      }
   }

   class l extends cbr {
      public l(final double $$0, final boolean $$1) {
         super(cgk.this, $$0, $$1);
      }

      @Override
      protected void a(buk $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.E($$0);
            cgk.this.a(awe.ji, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         cgk.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !cgk.this.y() && !cgk.this.fM() && !cgk.this.cf() && !cgk.this.gp() && super.b();
      }
   }

   class m extends cak {
      public m() {
         super(cgk.this);
      }

      @Override
      public void a() {
         if (cgk.this.gG()) {
            super.a();
         }
      }
   }

   class n extends cca {
      public n(final double $$0) {
         super(cgk.this, $$0);
      }

      @Override
      public boolean h() {
         return !cgk.this.gD() && super.h();
      }
   }

   public class o extends cbl {
      @Override
      public boolean b() {
         if (!cgk.this.gs()) {
            return false;
         } else {
            buk $$0 = cgk.this.m();
            if ($$0 != null && $$0.bI()) {
               if ($$0.cM() != $$0.cL()) {
                  return false;
               } else {
                  boolean $$1 = cgk.a(cgk.this, $$0);
                  if (!$$1) {
                     cgk.this.P().a($$0, 0);
                     cgk.this.z(false);
                     cgk.this.A(false);
                  }

                  return $$1;
               }
            } else {
               return false;
            }
         }
      }

      @Override
      public boolean c() {
         buk $$0 = cgk.this.m();
         if ($$0 != null && $$0.bI()) {
            double $$1 = cgk.this.dv().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cgk.this.dK()) < 15.0F) || !cgk.this.aH()) && !cgk.this.gp();
         } else {
            return false;
         }
      }

      @Override
      public boolean S_() {
         return false;
      }

      @Override
      public void d() {
         cgk.this.t(true);
         cgk.this.y(true);
         cgk.this.A(false);
         buk $$0 = cgk.this.m();
         if ($$0 != null) {
            cgk.this.K().a($$0, 60.0F, 30.0F);
            eys $$1 = new eys($$0.dx() - cgk.this.dx(), $$0.dz() - cgk.this.dz(), $$0.dD() - cgk.this.dD()).d();
            cgk.this.h(cgk.this.dv().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         cgk.this.P().o();
      }

      @Override
      public void e() {
         cgk.this.z(false);
         cgk.this.cv = 0.0F;
         cgk.this.cw = 0.0F;
         cgk.this.A(false);
         cgk.this.y(false);
      }

      @Override
      public void a() {
         buk $$0 = cgk.this.m();
         if ($$0 != null) {
            cgk.this.K().a($$0, 60.0F, 30.0F);
         }

         if (!cgk.this.gp()) {
            eys $$1 = cgk.this.dv();
            if ($$1.e * $$1.e < 0.03F && cgk.this.dK() != 0.0F) {
               cgk.this.w(azd.i(0.2F, cgk.this.dK(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               cgk.this.w((float)$$3);
            }
         }

         if ($$0 != null && cgk.this.f((bto)$$0) <= 2.0F) {
            cgk.this.E($$0);
         } else if (cgk.this.dK() > 0.0F && cgk.this.aH() && (float)cgk.this.dv().e != 0.0F && cgk.this.dS().a_(cgk.this.ds()).a(dhl.dN)) {
            cgk.this.w(60.0F);
            cgk.this.h(null);
            cgk.this.B(true);
         }
      }
   }

   class p extends cbh {
      public p() {
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean b() {
         if (!cgk.this.a(btw.a).f()) {
            return false;
         } else if (cgk.this.m() != null || cgk.this.em() != null) {
            return false;
         } else if (!cgk.this.gG()) {
            return false;
         } else if (cgk.this.dV().a(b(10)) != 0) {
            return false;
         } else {
            List<cke> $$0 = cgk.this.dS().a(cke.class, cgk.this.cO().c(8.0, 8.0, 8.0), cgk.ck);
            return !$$0.isEmpty() && cgk.this.a(btw.a).f();
         }
      }

      @Override
      public void a() {
         List<cke> $$0 = cgk.this.dS().a(cke.class, cgk.this.cO().c(8.0, 8.0, 8.0), cgk.ck);
         cvp $$1 = cgk.this.a(btw.a);
         if ($$1.f() && !$$0.isEmpty()) {
            cgk.this.P().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<cke> $$0 = cgk.this.dS().a(cke.class, cgk.this.cO().c(8.0, 8.0, 8.0), cgk.ck);
         if (!$$0.isEmpty()) {
            cgk.this.P().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends ccn {
      public q(final int $$0, final int $$1) {
         super(cgk.this, $$1);
      }

      @Override
      public void d() {
         cgk.this.gF();
         super.d();
      }

      @Override
      public boolean b() {
         return super.b() && this.h();
      }

      @Override
      public boolean c() {
         return super.c() && this.h();
      }

      private boolean h() {
         return !cgk.this.fM() && !cgk.this.y() && !cgk.this.gD() && cgk.this.m() == null;
      }
   }

   class r extends cgk.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cbh.a.a, cbh.a.b));
      }

      @Override
      public boolean b() {
         return cgk.this.em() == null
            && cgk.this.dV().i() < 0.02F
            && !cgk.this.fM()
            && cgk.this.m() == null
            && cgk.this.P().m()
            && !this.i()
            && !cgk.this.gq()
            && !cgk.this.cf();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + cgk.this.dV().a(3);
         cgk.this.x(true);
         cgk.this.P().o();
      }

      @Override
      public void e() {
         cgk.this.x(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cgk.this.K().a(cgk.this.dx() + this.c, cgk.this.dB(), cgk.this.dD() + this.d, (float)cgk.this.ag(), (float)cgk.this.ae());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cgk.this.dV().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cgk.this.dV().a(20));
      }
   }

   class s extends cba {
      private int c = b(100);

      public s(final double $$0) {
         super(cgk.this, $$0);
      }

      @Override
      public boolean b() {
         if (!cgk.this.fM() && this.a.m() == null) {
            if (cgk.this.dS().ad() && cgk.this.dS().h(this.a.ds())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               je $$0 = this.a.ds();
               return cgk.this.dS().S() && cgk.this.dS().h($$0) && !((arh)cgk.this.dS()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         cgk.this.gF();
         super.d();
      }
   }

   class t extends cgk.d {
      private static final int c = b(140);
      private int d = cgk.this.af.a(c);

      public t() {
         this.a(EnumSet.of(cbh.a.a, cbh.a.b, cbh.a.c));
      }

      @Override
      public boolean b() {
         return cgk.this.bk == 0.0F && cgk.this.bl == 0.0F && cgk.this.bm == 0.0F ? this.k() || cgk.this.fM() : false;
      }

      @Override
      public boolean c() {
         return this.k();
      }

      private boolean k() {
         if (this.d > 0) {
            this.d--;
            return false;
         } else {
            return cgk.this.dS().S() && this.h() && !this.i() && !cgk.this.aw;
         }
      }

      @Override
      public void e() {
         this.d = cgk.this.af.a(c);
         cgk.this.gF();
      }

      @Override
      public void d() {
         cgk.this.x(false);
         cgk.this.z(false);
         cgk.this.A(false);
         cgk.this.t(false);
         cgk.this.D(true);
         cgk.this.P().o();
         cgk.this.M().a(cgk.this.dx(), cgk.this.dz(), cgk.this.dD(), 0.0);
      }
   }

   class u extends cbh {
      public u() {
         this.a(EnumSet.of(cbh.a.a, cbh.a.b));
      }

      @Override
      public boolean b() {
         if (cgk.this.fM()) {
            return false;
         } else {
            buk $$0 = cgk.this.m();
            return $$0 != null && $$0.bI() && cgk.cm.test($$0) && cgk.this.g((bto)$$0) > 36.0 && !cgk.this.cf() && !cgk.this.gt() && !cgk.this.bj;
         }
      }

      @Override
      public void d() {
         cgk.this.x(false);
         cgk.this.B(false);
      }

      @Override
      public void e() {
         buk $$0 = cgk.this.m();
         if ($$0 != null && cgk.a(cgk.this, $$0)) {
            cgk.this.A(true);
            cgk.this.z(true);
            cgk.this.P().o();
            cgk.this.K().a($$0, (float)cgk.this.ag(), (float)cgk.this.ae());
         } else {
            cgk.this.A(false);
            cgk.this.z(false);
         }
      }

      @Override
      public void a() {
         buk $$0 = cgk.this.m();
         if ($$0 != null) {
            cgk.this.K().a($$0, (float)cgk.this.ag(), (float)cgk.this.ae());
            if (cgk.this.g((bto)$$0) <= 36.0) {
               cgk.this.A(true);
               cgk.this.z(true);
               cgk.this.P().o();
            } else {
               cgk.this.P().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azz {
      a(0, "red"),
      b(1, "snow");

      public static final azz.a<cgk.v> c = azz.a(cgk.v::values);
      private static final IntFunction<cgk.v> d = axu.a(cgk.v::a, values(), axu.a.a);
      private final int e;
      private final String f;

      private v(final int $$0, final String $$1) {
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

      public static cgk.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cgk.v a(int $$0) {
         return d.apply($$0);
      }

      public static cgk.v a(jn<dfh> $$0) {
         return $$0.a(aws.ar) ? b : a;
      }
   }
}
