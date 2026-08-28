import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class chz extends chp implements bwy<chz.v> {
   private static final ajx<Integer> bJ = akb.a(chz.class, ajz.b);
   private static final ajx<Byte> bK = akb.a(chz.class, ajz.a);
   private static final int bL = 1;
   public static final int bF = 4;
   public static final int bG = 8;
   public static final int bH = 16;
   private static final int bM = 32;
   private static final int bN = 64;
   private static final int bO = 128;
   private static final ajx<Optional<bvf<bvy>>> bP = akb.a(chz.class, ajz.r);
   private static final ajx<Optional<bvf<bvy>>> bQ = akb.a(chz.class, ajz.r);
   static final Predicate<clw> bR = $$0 -> !$$0.o() && $$0.bJ();
   private static final Predicate<bva> bS = $$0 -> !($$0 instanceof bvy $$1) ? false : $$1.es() != null && $$1.et() < $$1.af + 600;
   static final Predicate<bva> bT = $$0 -> $$0 instanceof chu || $$0 instanceof cil;
   private static final Predicate<bva> bU = $$0 -> !$$0.cf() && bvg.e.test($$0);
   private static final int bV = 600;
   private static final bvd bW = bvi.aa.n().a(0.5F).b(0.2975F);
   private ccw bX;
   private ccw bY;
   private ccw bZ;
   private float ca;
   private float cb;
   float cc;
   float cd;
   private int ce;

   public chz(bvi<? extends chz> $$0, dgz $$1) {
      super($$0, $$1);
      this.by = new chz.k();
      this.bz = new chz.m();
      this.a(eun.p, 0.0F);
      this.a(eun.q, 0.0F);
      this.a_(true);
      this.O().a(32.0F);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bP, Optional.empty());
      $$0.a(bQ, Optional.empty());
      $$0.a(bJ, 0);
      $$0.a(bK, (byte)0);
   }

   @Override
   protected void D() {
      this.bX = new cep<>(this, chp.class, 10, false, false, ($$0, $$1) -> $$0 instanceof chu || $$0 instanceof cil);
      this.bY = new cep<>(this, cit.class, 10, false, false, cit.bF);
      this.bZ = new cep<>(this, chl.class, 20, false, false, ($$0, $$1) -> $$0 instanceof chn);
      this.bC.a(0, new chz.g());
      this.bC.a(0, new ccl(this, this.dU()));
      this.bC.a(1, new chz.b());
      this.bC.a(2, new chz.n(2.2));
      this.bC.a(3, new chz.e(1.0));
      this.bC.a(4, new ccd<>(this, cpr.class, 16.0F, 1.6, 1.4, $$0 -> bU.test($$0) && !this.k($$0) && !this.gG()));
      this.bC.a(4, new ccd<>(this, civ.class, 8.0F, 1.6, 1.4, $$0 -> !((civ)$$0).q() && !this.gG()));
      this.bC.a(4, new ccd<>(this, cij.class, 8.0F, 1.6, 1.4, $$0 -> !this.gG()));
      this.bC.a(5, new chz.u());
      this.bC.a(6, new chz.o());
      this.bC.a(6, new chz.s(1.25));
      this.bC.a(7, new chz.l(1.2F, true));
      this.bC.a(7, new chz.t());
      this.bC.a(8, new chz.h(this, 1.25));
      this.bC.a(9, new chz.q(32, 200));
      this.bC.a(10, new chz.f(1.2F, 12, 1));
      this.bC.a(10, new cdc(this, 0.4F));
      this.bC.a(11, new cej(this, 1.0));
      this.bC.a(11, new chz.p());
      this.bC.a(12, new chz.j(this, cpr.class, 24.0F));
      this.bC.a(13, new chz.r());
      this.bD.a(3, new chz.a(bvy.class, false, false, ($$0, $$1) -> bS.test($$0) && !this.k($$0)));
   }

   @Override
   public void k_() {
      if (!this.dU().C && this.bJ() && this.di()) {
         this.ce++;
         cxh $$0 = this.a(bvj.a);
         if (this.i($$0)) {
            if (this.ce > 600) {
               cxh $$1 = $$0.a(this.dU(), this);
               if (!$$1.f()) {
                  this.a(bvj.a, $$1);
               }

               this.ce = 0;
            } else if (this.ce > 560 && this.ae.i() < 0.1F) {
               this.gy();
               this.dU().a(this, (byte)45);
            }
         }

         bvy $$2 = this.f();
         if ($$2 == null || !$$2.bJ()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fT() || this.fi()) {
         this.bf = false;
         this.bg = 0.0F;
         this.bi = 0.0F;
      }

      super.k_();
      if (this.gG() && this.ae.i() < 0.05F) {
         this.a(awa.jF, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fi() {
      return this.eF();
   }

   private boolean i(cxh $$0) {
      return $$0.b(kv.w) && this.f() == null && this.aJ() && !this.fT();
   }

   @Override
   protected void a(azh $$0, bsw $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cxh $$3;
         if ($$2 < 0.05F) {
            $$3 = new cxh(cxl.ph);
         } else if ($$2 < 0.2F) {
            $$3 = new cxh(cxl.rA);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cxh(cxl.vF) : new cxh(cxl.vG);
         } else if ($$2 < 0.6F) {
            $$3 = new cxh(cxl.qd);
         } else if ($$2 < 0.8F) {
            $$3 = new cxh(cxl.rm);
         } else {
            $$3 = new cxh(cxl.qa);
         }

         this.a(bvj.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cxh $$1 = this.a(bvj.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               fbx $$3 = new fbx(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dM() * (float) (Math.PI / 180.0))
                  .b(-this.dK() * (float) (Math.PI / 180.0));
               this.dU().a(new lp(lt.U, $$1), this.dz() + this.bS().d / 2.0, this.dB(), this.dF() + this.bS().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bxf.a q() {
      return chp.gx().a(bxg.v, 0.3F).a(bxg.s, 10.0).a(bxg.c, 2.0).a(bxg.x, 5.0).a(bxg.m, 32.0);
   }

   @Nullable
   public chz b(ard $$0, buq $$1) {
      chz $$2 = bvi.aa.a($$0, bvh.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((chz)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bvi<chz> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.ch) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      jr<dic> $$4 = $$0.t(this.du());
      chz.v $$5 = chz.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof chz.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new chz.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof ard) {
         this.gE();
      }

      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gE() {
      if (this.t() == chz.v.a) {
         this.bD.a(4, this.bX);
         this.bD.a(4, this.bY);
         this.bD.a(6, this.bZ);
      } else {
         this.bD.a(4, this.bZ);
         this.bD.a(6, this.bX);
         this.bD.a(6, this.bY);
      }
   }

   @Override
   protected void gy() {
      this.a(awa.jJ, 1.0F, 1.0F);
   }

   @Override
   public bvd e(bwk $$0) {
      return this.n_() ? bW : super.e($$0);
   }

   public chz.v t() {
      return chz.v.a(this.al.a(bJ));
   }

   public void a(chz.v $$0) {
      this.al.a(bJ, $$0.a());
   }

   Stream<bvf<bvy>> gF() {
      return Stream.concat(this.al.a(bP).stream(), this.al.a(bQ).stream());
   }

   void j(bvy $$0) {
      this.a(new bvf<>($$0));
   }

   private void a(bvf<bvy> $$0) {
      if (this.al.a(bP).isPresent()) {
         this.al.a(bQ, Optional.of($$0));
      } else {
         this.al.a(bP, Optional.of($$0));
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      Stream<UUID> $$1 = this.gF().map(bvf::c);
      tw $$2 = new tw();
      $$1.forEach($$1x -> $$2.add(uf.a($$1x)));
      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fT());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.x());
      $$0.a("Crouching", this.ch());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);

      for (un $$2 : $$0.c("Trusted", 11)) {
         this.a(new bvf<>(uf.a($$2)));
      }

      this.C($$0.q("Sleeping"));
      this.a(chz.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dU() instanceof ard) {
         this.gE();
      }
   }

   public boolean x() {
      return this.s(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gs() {
      return this.s(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gG() {
      return this.s(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fT() {
      return this.s(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(bK, (byte)(this.al.a(bK) | $$0));
      } else {
         this.al.a(bK, (byte)(this.al.a(bK) & ~$$0));
      }
   }

   private boolean s(int $$0) {
      return (this.al.a(bK) & $$0) != 0;
   }

   @Override
   protected boolean f(bvj $$0) {
      return $$0 == bvj.a && this.fP();
   }

   @Override
   public boolean g(cxh $$0) {
      cxh $$1 = this.a(bvj.a);
      return $$1.f() || this.ce > 0 && $$0.b(kv.w) && !$$1.b(kv.w);
   }

   private void k(cxh $$0) {
      if (!$$0.f() && !this.dU().C) {
         clw $$1 = new clw(this.dU(), this.dz() + this.bS().d, this.dB() + 1.0, this.dF() + this.bS().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awa.jO, 1.0F, 1.0F);
         this.dU().b($$1);
      }
   }

   private void l(cxh $$0) {
      clw $$1 = new clw(this.dU(), this.dz(), this.dB(), this.dF(), $$0);
      this.dU().b($$1);
   }

   @Override
   protected void a(ard $$0, clw $$1) {
      cxh $$2 = $$1.f();
      if (this.g($$2)) {
         int $$3 = $$2.M();
         if ($$3 > 1) {
            this.l($$2.a($$3 - 1));
         }

         this.k(this.a(bvj.a));
         this.a($$1);
         this.a(bvj.a, $$2.a(1));
         this.g(bvj.a);
         this.a($$1, $$2.M());
         $$1.at();
         this.ce = 0;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.di()) {
         boolean $$0 = this.bj();
         if ($$0 || this.f() != null || this.dU().ag()) {
            this.gH();
         }

         if ($$0 || this.fT()) {
            this.w(false);
         }

         if (this.gs() && this.dU().A.i() < 0.2F) {
            ji $$1 = this.du();
            dxq $$2 = this.dU().a_($$1);
            this.dU().c(2001, $$1, dke.j($$2));
         }
      }

      this.cb = this.ca;
      if (this.gw()) {
         this.ca = this.ca + (1.0F - this.ca) * 0.4F;
      } else {
         this.ca = this.ca + (0.0F - this.ca) * 0.4F;
      }

      this.cd = this.cc;
      if (this.ch()) {
         this.cc += 0.2F;
         if (this.cc > 3.0F) {
            this.cc = 3.0F;
         }
      } else {
         this.cc = 0.0F;
      }
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.ac);
   }

   @Override
   protected void a(cpr $$0, bwa $$1) {
      ((chz)$$1).j($$0);
   }

   public boolean gt() {
      return this.s(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gu() {
      return this.bf;
   }

   public boolean gv() {
      return this.cc == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean ch() {
      return this.s(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gw() {
      return this.s(8);
   }

   public float K(float $$0) {
      return ayz.h($$0, this.cb, this.ca) * 0.11F * (float) Math.PI;
   }

   public float L(float $$0) {
      return ayz.h($$0, this.cd, this.cc);
   }

   @Override
   public void h(@Nullable bvy $$0) {
      if (this.gG() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   void gH() {
      this.C(false);
   }

   void gI() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gJ() {
      return !this.fT() && !this.x() && !this.gs();
   }

   @Override
   public void T() {
      avz $$0 = this.u();
      if ($$0 == awa.jL) {
         this.a($$0, 2.0F, this.fh());
      } else {
         super.T();
      }
   }

   @Nullable
   @Override
   protected avz u() {
      if (this.fT()) {
         return awa.jM;
      } else {
         if (!this.dU().V() && this.ae.i() < 0.1F) {
            List<cpr> $$0 = this.dU().a(cpr.class, this.cQ().c(16.0, 16.0, 16.0), bvg.f);
            if ($$0.isEmpty()) {
               return awa.jL;
            }
         }

         return awa.jG;
      }
   }

   @Nullable
   @Override
   protected avz e(btp $$0) {
      return awa.jK;
   }

   @Nullable
   @Override
   protected avz l_() {
      return awa.jI;
   }

   boolean k(bvy $$0) {
      return this.gF().anyMatch($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(ard $$0, btp $$1) {
      cxh $$2 = this.a(bvj.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(bvj.a, cxh.k);
      }

      super.b($$0, $$1);
   }

   public static boolean a(chz $$0, bvy $$1) {
      double $$2 = $$1.dF() - $$0.dF();
      double $$3 = $$1.dz() - $$0.dz();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dU().a_(ji.a($$0.dz() + $$8, $$0.dB() + (double)$$9, $$0.dF() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public fbx cS() {
      return new fbx(0.0, (double)(0.55F * this.cR()), (double)(this.dp() * 0.4F));
   }

   class a extends cep<bvy> {
      @Nullable
      private bvy j;
      @Nullable
      private bvy k;
      private int l;

      public a(final Class<bvy> $$0, final boolean $$1, final boolean $$2, @Nullable final cgp.a $$3) {
         super(chz.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dX().a(this.b) != 0) {
            return false;
         } else {
            ard $$0 = a(chz.this.dU());

            for (bvf<bvy> $$1 : chz.this.gF().toList()) {
               bvy $$2 = $$1.a($$0, bvy.class);
               if ($$2 != null) {
                  this.k = $$2;
                  this.j = $$2.ep();
                  int $$3 = $$2.er();
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
            this.l = this.k.er();
         }

         chz.this.a(awa.jF, 1.0F, 1.0F);
         chz.this.B(true);
         chz.this.gH();
         super.d();
      }
   }

   class b extends ccw {
      int a;

      public b() {
         this.a(EnumSet.of(ccw.a.b, ccw.a.c, ccw.a.a));
      }

      @Override
      public boolean b() {
         return chz.this.gs();
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
         chz.this.A(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements cgp.a {
      @Override
      public boolean test(bvy $$0, ard $$1) {
         if ($$0 instanceof chz) {
            return false;
         } else if ($$0 instanceof chu || $$0 instanceof cil || $$0 instanceof cms) {
            return true;
         } else if ($$0 instanceof bwv) {
            return !((bwv)$$0).q();
         } else {
            if ($$0 instanceof cpr $$2 && ($$2.U_() || $$2.b())) {
               return false;
            }

            return chz.this.k($$0) ? false : !$$0.fT() && !$$0.cf();
         }
      }
   }

   abstract class d extends ccw {
      private final cgp b = cgp.a().a(12.0).d().a(chz.this.new c());

      protected boolean h() {
         ji $$0 = ji.a(chz.this.dz(), chz.this.cQ().e, chz.this.dF());
         return !chz.this.dU().h($$0) && chz.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(chz.this.dU()).a(bvy.class, this.b, chz.this, chz.this.cQ().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cci {
      public e(final double $$0) {
         super(chz.this, $$0);
      }

      @Override
      public void d() {
         ((chz)this.a).gI();
         ((chz)this.c).gI();
         super.d();
      }

      @Override
      protected void g() {
         ard $$0 = this.b;
         chz $$1 = (chz)this.a.a($$0, (buq)this.c);
         if ($$1 != null) {
            are $$2 = this.a.gB();
            are $$3 = this.c.gB();
            are $$4 = $$2;
            if ($$2 != null) {
               $$1.j($$2);
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.j($$3);
            }

            if ($$4 != null) {
               $$4.a(awk.P);
               ap.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gD();
            this.c.gD();
            $$1.c_(-24000);
            $$1.b(this.a.dz(), this.a.dB(), this.a.dF(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if ($$0.O().b(dgv.f)) {
               this.b.b(new bvn(this.b, this.a.dz(), this.a.dB(), this.a.dF(), this.a.dX().a(7) + 1));
            }
         }
      }
   }

   public class f extends cdj {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(chz.this, $$1, $$2, $$3);
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
      protected boolean a(dhc $$0, ji $$1) {
         dxq $$2 = $$0.a_($$1);
         return $$2.a(dkg.oK) && $$2.c(dsn.c) >= 2 || dlb.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && chz.this.ae.i() < 0.05F) {
            chz.this.a(awa.jN, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(chz.this.dU()).O().b(dgv.c)) {
            dxq $$0 = chz.this.dU().a_(this.e);
            if ($$0.a(dkg.oK)) {
               this.b($$0);
            } else if (dlb.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dxq $$0) {
         dlb.a(chz.this, $$0, chz.this.dU(), this.e);
      }

      private void b(dxq $$0) {
         int $$1 = $$0.c(dsn.c);
         $$0.b(dsn.c, Integer.valueOf(1));
         int $$2 = 1 + chz.this.dU().A.a(2) + ($$1 == 3 ? 1 : 0);
         cxh $$3 = chz.this.a(bvj.a);
         if ($$3.f()) {
            chz.this.a(bvj.a, new cxh(cxl.xx));
            $$2--;
         }

         if ($$2 > 0) {
            dke.a(chz.this.dU(), this.e, new cxh(cxl.xx, $$2));
         }

         chz.this.a(awa.Aq, 1.0F, 1.0F);
         chz.this.dU().a(this.e, $$0.b(dsn.c, Integer.valueOf(1)), 2);
         chz.this.dU().a(ecp.c, this.e, ecp.a.a(chz.this));
      }

      @Override
      public boolean b() {
         return !chz.this.fT() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         chz.this.w(false);
         super.d();
      }
   }

   class g extends ccq {
      public g() {
         super(chz.this);
      }

      @Override
      public void d() {
         super.d();
         chz.this.gI();
      }

      @Override
      public boolean b() {
         return chz.this.bj() && chz.this.b(awv.a) > 0.25 || chz.this.bv();
      }
   }

   static class h extends ccv {
      private final chz d;

      public h(chz $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gG() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gG() && super.c();
      }

      @Override
      public void d() {
         this.d.gI();
         super.d();
      }
   }

   public static class i extends buq.a {
      public final chz.v a;

      public i(chz.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cde {
      public j(final bwa $$0, final Class<? extends bvy> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !chz.this.gs() && !chz.this.gw();
      }

      @Override
      public boolean c() {
         return super.c() && !chz.this.gs() && !chz.this.gw();
      }
   }

   public class k extends cby {
      public k() {
         super(chz.this);
      }

      @Override
      public void a() {
         if (!chz.this.fT()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !chz.this.gt() && !chz.this.ch() && !chz.this.gw() && !chz.this.gs();
      }
   }

   class l extends cdg {
      public l(final double $$0, final boolean $$1) {
         super(chz.this, $$0, $$1);
      }

      @Override
      protected void a(bvy $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            chz.this.a(awa.jH, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         chz.this.z(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !chz.this.x() && !chz.this.fT() && !chz.this.ch() && !chz.this.gs() && super.b();
      }
   }

   class m extends cbz {
      public m() {
         super(chz.this);
      }

      @Override
      public void a() {
         if (chz.this.gJ()) {
            super.a();
         }
      }
   }

   class n extends cdp {
      public n(final double $$0) {
         super(chz.this, $$0);
      }

      @Override
      public boolean h() {
         return !chz.this.gG() && super.h();
      }
   }

   public class o extends cda {
      @Override
      public boolean b() {
         if (!chz.this.gv()) {
            return false;
         } else {
            bvy $$0 = chz.this.f();
            if ($$0 != null && $$0.bJ()) {
               if ($$0.cO() != $$0.cN()) {
                  return false;
               } else {
                  boolean $$1 = chz.a(chz.this, $$0);
                  if (!$$1) {
                     chz.this.O().a($$0, 0);
                     chz.this.y(false);
                     chz.this.z(false);
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
         bvy $$0 = chz.this.f();
         if ($$0 != null && $$0.bJ()) {
            double $$1 = chz.this.dx().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(chz.this.dM()) < 15.0F) || !chz.this.aJ()) && !chz.this.gs();
         } else {
            return false;
         }
      }

      @Override
      public boolean P_() {
         return false;
      }

      @Override
      public void d() {
         chz.this.s(true);
         chz.this.x(true);
         chz.this.z(false);
         bvy $$0 = chz.this.f();
         if ($$0 != null) {
            chz.this.J().a($$0, 60.0F, 30.0F);
            fbx $$1 = new fbx($$0.dz() - chz.this.dz(), $$0.dB() - chz.this.dB(), $$0.dF() - chz.this.dF()).d();
            chz.this.i(chz.this.dx().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         chz.this.O().m();
      }

      @Override
      public void e() {
         chz.this.y(false);
         chz.this.cc = 0.0F;
         chz.this.cd = 0.0F;
         chz.this.z(false);
         chz.this.x(false);
      }

      @Override
      public void a() {
         bvy $$0 = chz.this.f();
         if ($$0 != null) {
            chz.this.J().a($$0, 60.0F, 30.0F);
         }

         if (!chz.this.gs()) {
            fbx $$1 = chz.this.dx();
            if ($$1.e * $$1.e < 0.03F && chz.this.dM() != 0.0F) {
               chz.this.x(ayz.i(0.2F, chz.this.dM(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               chz.this.x((float)$$3);
            }
         }

         if ($$0 != null && chz.this.f($$0) <= 2.0F) {
            chz.this.c(a(chz.this.dU()), $$0);
         } else if (chz.this.dM() > 0.0F && chz.this.aJ() && (float)chz.this.dx().e != 0.0F && chz.this.dU().a_(chz.this.du()).a(dkg.ea)) {
            chz.this.x(60.0F);
            chz.this.h(null);
            chz.this.A(true);
         }
      }
   }

   class p extends ccw {
      public p() {
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean b() {
         if (!chz.this.a(bvj.a).f()) {
            return false;
         } else if (chz.this.f() != null || chz.this.ep() != null) {
            return false;
         } else if (!chz.this.gJ()) {
            return false;
         } else if (chz.this.dX().a(b(10)) != 0) {
            return false;
         } else {
            List<clw> $$0 = chz.this.dU().a(clw.class, chz.this.cQ().c(8.0, 8.0, 8.0), chz.bR);
            return !$$0.isEmpty() && chz.this.a(bvj.a).f();
         }
      }

      @Override
      public void a() {
         List<clw> $$0 = chz.this.dU().a(clw.class, chz.this.cQ().c(8.0, 8.0, 8.0), chz.bR);
         cxh $$1 = chz.this.a(bvj.a);
         if ($$1.f() && !$$0.isEmpty()) {
            chz.this.O().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<clw> $$0 = chz.this.dU().a(clw.class, chz.this.cQ().c(8.0, 8.0, 8.0), chz.bR);
         if (!$$0.isEmpty()) {
            chz.this.O().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cec {
      public q(final int $$0, final int $$1) {
         super(chz.this, $$1);
      }

      @Override
      public void d() {
         chz.this.gI();
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
         return !chz.this.fT() && !chz.this.x() && !chz.this.gG() && chz.this.f() == null;
      }
   }

   class r extends chz.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(ccw.a.a, ccw.a.b));
      }

      @Override
      public boolean b() {
         return chz.this.ep() == null
            && chz.this.dX().i() < 0.02F
            && !chz.this.fT()
            && chz.this.f() == null
            && chz.this.O().k()
            && !this.i()
            && !chz.this.gt()
            && !chz.this.ch();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + chz.this.dX().a(3);
         chz.this.w(true);
         chz.this.O().m();
      }

      @Override
      public void e() {
         chz.this.w(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         chz.this.J().a(chz.this.dz() + this.c, chz.this.dD(), chz.this.dF() + this.d, (float)chz.this.ad(), (float)chz.this.ac());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * chz.this.dX().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + chz.this.dX().a(20));
      }
   }

   class s extends ccp {
      private int c = b(100);

      public s(final double $$0) {
         super(chz.this, $$0);
      }

      @Override
      public boolean b() {
         if (!chz.this.fT() && this.a.f() == null) {
            if (chz.this.dU().ag() && chz.this.dU().h(this.a.du())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ji $$0 = this.a.du();
               return chz.this.dU().V() && chz.this.dU().h($$0) && !((ard)chz.this.dU()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         chz.this.gI();
         super.d();
      }
   }

   class t extends chz.d {
      private static final int c = b(140);
      private int d = chz.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(ccw.a.a, ccw.a.b, ccw.a.c));
      }

      @Override
      public boolean b() {
         return chz.this.bg == 0.0F && chz.this.bh == 0.0F && chz.this.bi == 0.0F ? this.k() || chz.this.fT() : false;
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
            return chz.this.dU().V() && this.h() && !this.i() && !chz.this.av;
         }
      }

      @Override
      public void e() {
         this.d = chz.this.ae.a(c);
         chz.this.gI();
      }

      @Override
      public void d() {
         chz.this.w(false);
         chz.this.y(false);
         chz.this.z(false);
         chz.this.s(false);
         chz.this.C(true);
         chz.this.O().m();
         chz.this.L().a(chz.this.dz(), chz.this.dB(), chz.this.dF(), 0.0);
      }
   }

   class u extends ccw {
      public u() {
         this.a(EnumSet.of(ccw.a.a, ccw.a.b));
      }

      @Override
      public boolean b() {
         if (chz.this.fT()) {
            return false;
         } else {
            bvy $$0 = chz.this.f();
            return $$0 != null && $$0.bJ() && chz.bT.test($$0) && chz.this.g($$0) > 36.0 && !chz.this.ch() && !chz.this.gw() && !chz.this.bf;
         }
      }

      @Override
      public void d() {
         chz.this.w(false);
         chz.this.A(false);
      }

      @Override
      public void e() {
         bvy $$0 = chz.this.f();
         if ($$0 != null && chz.a(chz.this, $$0)) {
            chz.this.z(true);
            chz.this.y(true);
            chz.this.O().m();
            chz.this.J().a($$0, (float)chz.this.ad(), (float)chz.this.ac());
         } else {
            chz.this.z(false);
            chz.this.y(false);
         }
      }

      @Override
      public void a() {
         bvy $$0 = chz.this.f();
         if ($$0 != null) {
            chz.this.J().a($$0, (float)chz.this.ad(), (float)chz.this.ac());
            if (chz.this.g($$0) <= 36.0) {
               chz.this.z(true);
               chz.this.y(true);
               chz.this.O().m();
            } else {
               chz.this.O().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azv {
      a(0, "red"),
      b(1, "snow");

      public static final azv.a<chz.v> c = azv.a(chz.v::values);
      private static final IntFunction<chz.v> d = axq.a(chz.v::a, values(), axq.a.a);
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

      public static chz.v a(String $$0) {
         return c.a($$0, a);
      }

      public static chz.v a(int $$0) {
         return d.apply($$0);
      }

      public static chz.v a(jr<dic> $$0) {
         return $$0.a(awo.at) ? b : a;
      }
   }
}
