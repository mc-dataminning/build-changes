import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cjz extends cjk {
   private static final akl<Integer> bM = akp.a(cjz.class, akn.b);
   private static final akl<Byte> bN = akp.a(cjz.class, akn.a);
   private static final int bO = 1;
   public static final int bI = 4;
   public static final int bJ = 8;
   public static final int bK = 16;
   private static final int bP = 32;
   private static final int bQ = 64;
   private static final int bR = 128;
   private static final akl<Optional<bwz<bxu>>> bS = akp.a(cjz.class, akn.r);
   private static final akl<Optional<bwz<bxu>>> bT = akp.a(cjz.class, akn.r);
   static final Predicate<coc> bU = $$0 -> !$$0.o() && $$0.bJ();
   private static final Predicate<bwt> bV = $$0 -> !($$0 instanceof bxu $$1) ? false : $$1.eu() != null && $$1.ev() < $$1.af + 600;
   static final Predicate<bwt> bW = $$0 -> $$0 instanceof cjq || $$0 instanceof ckk;
   private static final Predicate<bwt> bX = $$0 -> !$$0.cf() && bxa.e.test($$0);
   private static final int bY = 600;
   private static final bww bZ = bxc.ab.n().a(0.5F).b(0.2975F);
   private static final Codec<List<bwz<bxu>>> ca = bwz.a().listOf();
   private static final boolean cb = false;
   private static final boolean cc = false;
   private static final boolean cd = false;
   private ceq ce;
   private ceq cf;
   private ceq cg;
   private float ch;
   private float ci;
   float cj;
   float ck;
   private int cl;

   public cjz(bxc<? extends cjz> $$0, djx $$1) {
      super($$0, $$1);
      this.bB = new cjz.k();
      this.bC = new cjz.m();
      this.a(eyf.p, 0.0F);
      this.a(eyf.q, 0.0F);
      this.a_(true);
      this.O().a(32.0F);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bS, Optional.empty());
      $$0.a(bT, Optional.empty());
      $$0.a(bM, cjz.v.c.a());
      $$0.a(bN, (byte)0);
   }

   @Override
   protected void D() {
      this.ce = new cgj<>(this, cjk.class, 10, false, false, ($$0, $$1) -> $$0 instanceof cjq || $$0 instanceof ckk);
      this.cf = new cgj<>(this, ckr.class, 10, false, false, ckr.bI);
      this.cg = new cgj<>(this, cjg.class, 20, false, false, ($$0, $$1) -> $$0 instanceof cji);
      this.bF.a(0, new cjz.g());
      this.bF.a(0, new cef(this, this.dV()));
      this.bF.a(1, new cjz.b());
      this.bF.a(2, new cjz.n(2.2));
      this.bF.a(3, new cjz.e(1.0));
      this.bF.a(4, new cdx<>(this, crx.class, 16.0F, 1.6, 1.4, $$0 -> bX.test($$0) && !this.j($$0) && !this.gJ()));
      this.bF.a(4, new cdx<>(this, cmm.class, 8.0F, 1.6, 1.4, $$0 -> !((cmm)$$0).q() && !this.gJ()));
      this.bF.a(4, new cdx<>(this, cki.class, 8.0F, 1.6, 1.4, $$0 -> !this.gJ()));
      this.bF.a(5, new cjz.u());
      this.bF.a(6, new cjz.o());
      this.bF.a(6, new cjz.s(1.25));
      this.bF.a(7, new cjz.l(1.2F, true));
      this.bF.a(7, new cjz.t());
      this.bF.a(8, new cjz.h(this, 1.25));
      this.bF.a(9, new cjz.q(32, 200));
      this.bF.a(10, new cjz.f(1.2F, 12, 1));
      this.bF.a(10, new cew(this, 0.4F));
      this.bF.a(11, new cgd(this, 1.0));
      this.bF.a(11, new cjz.p());
      this.bF.a(12, new cjz.j(this, crx.class, 24.0F));
      this.bF.a(13, new cjz.r());
      this.bG.a(3, new cjz.a(bxu.class, false, false, ($$0, $$1) -> bV.test($$0) && !this.j($$0)));
   }

   @Override
   public void k_() {
      if (!this.dV().C && this.bJ() && this.dj()) {
         this.cl++;
         czy $$0 = this.a(bxd.a);
         if (this.j($$0)) {
            if (this.cl > 600) {
               czy $$1 = $$0.a(this.dV(), this);
               if (!$$1.f()) {
                  this.a(bxd.a, $$1);
               }

               this.cl = 0;
            } else if (this.cl > 560 && this.ae.i() < 0.1F) {
               this.gA();
               this.dV().a(this, (byte)45);
            }
         }

         bxu $$2 = this.f();
         if ($$2 == null || !$$2.bJ()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fR() || this.fg()) {
         this.bf = false;
         this.bg = 0.0F;
         this.bi = 0.0F;
      }

      super.k_();
      if (this.gJ() && this.ae.i() < 0.05F) {
         this.a(awp.jJ, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fg() {
      return this.eH();
   }

   private boolean j(czy $$0) {
      return $$0.c(kk.v) && this.f() == null && this.aH() && !this.fR();
   }

   @Override
   protected void a(azx $$0, bup $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         czy $$3;
         if ($$2 < 0.05F) {
            $$3 = new czy(dac.po);
         } else if ($$2 < 0.2F) {
            $$3 = new czy(dac.rH);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new czy(dac.vO) : new czy(dac.vP);
         } else if ($$2 < 0.6F) {
            $$3 = new czy(dac.qk);
         } else if ($$2 < 0.8F) {
            $$3 = new czy(dac.rt);
         } else {
            $$3 = new czy(dac.qh);
         }

         this.a(bxd.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         czy $$1 = this.a(bxd.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ffq $$3 = new ffq(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dN() * (float) (Math.PI / 180.0))
                  .b(-this.dL() * (float) (Math.PI / 180.0));
               this.dV().a(new lu(ly.U, $$1), this.dA() + this.bS().d / 2.0, this.dC(), this.dG() + this.bS().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static byz.a q() {
      return cjk.gz().a(bza.v, 0.3F).a(bza.s, 10.0).a(bza.c, 2.0).a(bza.x, 5.0).a(bza.m, 32.0);
   }

   @Nullable
   public cjz b(ars $$0, bwj $$1) {
      cjz $$2 = bxc.ab.a($$0, bxb.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((cjz)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bxc<cjz> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.a_($$3.e()).a(axe.ci) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      jf<dla> $$4 = $$0.u(this.dv());
      cjz.v $$5 = cjz.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cjz.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cjz.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof ars) {
         this.gG();
      }

      this.a($$0.G_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gG() {
      if (this.t() == cjz.v.a) {
         this.bG.a(4, this.ce);
         this.bG.a(4, this.cf);
         this.bG.a(6, this.cg);
      } else {
         this.bG.a(4, this.cg);
         this.bG.a(6, this.ce);
         this.bG.a(6, this.cf);
      }
   }

   @Override
   protected void gA() {
      this.a(awp.jN, 1.0F, 1.0F);
   }

   @Override
   public bww e(byg $$0) {
      return this.n_() ? bZ : super.e($$0);
   }

   public cjz.v t() {
      return cjz.v.a(this.al.a(bM));
   }

   private void a(cjz.v $$0) {
      this.al.a(bM, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.az ? c((kj<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.az);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.az) {
         this.a(c(kk.az, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   Stream<bwz<bxu>> gH() {
      return Stream.concat(this.al.a(bS).stream(), this.al.a(bT).stream());
   }

   void i(bxu $$0) {
      this.a(new bwz<>($$0));
   }

   private void a(bwz<bxu> $$0) {
      if (this.al.a(bS).isPresent()) {
         this.al.a(bT, Optional.of($$0));
      } else {
         this.al.a(bS, Optional.of($$0));
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Trusted", ca, this.gH().toList());
      $$0.a("Sleeping", this.fR());
      $$0.a("Type", cjz.v.d, this.t());
      $$0.a("Sitting", this.x());
      $$0.a("Crouching", this.ch());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.gI();
      $$0.<List>a("Trusted", ca).orElse(List.of()).forEach(this::a);
      this.C($$0.b("Sleeping", false));
      this.a($$0.<cjz.v>a("Type", cjz.v.d).orElse(cjz.v.c));
      this.w($$0.b("Sitting", false));
      this.y($$0.b("Crouching", false));
      if (this.dV() instanceof ars) {
         this.gG();
      }
   }

   private void gI() {
      this.al.a(bS, Optional.empty());
      this.al.a(bT, Optional.empty());
   }

   public boolean x() {
      return this.s(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gu() {
      return this.s(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gJ() {
      return this.s(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fR() {
      return this.s(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(bN, (byte)(this.al.a(bN) | $$0));
      } else {
         this.al.a(bN, (byte)(this.al.a(bN) & ~$$0));
      }
   }

   private boolean s(int $$0) {
      return (this.al.a(bN) & $$0) != 0;
   }

   @Override
   protected boolean f(bxd $$0) {
      return $$0 == bxd.a && this.fN();
   }

   @Override
   public boolean g(czy $$0) {
      czy $$1 = this.a(bxd.a);
      return $$1.f() || this.cl > 0 && $$0.c(kk.v) && !$$1.c(kk.v);
   }

   private void k(czy $$0) {
      if (!$$0.f() && !this.dV().C) {
         coc $$1 = new coc(this.dV(), this.dA() + this.bS().d, this.dC() + 1.0, this.dG() + this.bS().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awp.jS, 1.0F, 1.0F);
         this.dV().b($$1);
      }
   }

   private void l(czy $$0) {
      coc $$1 = new coc(this.dV(), this.dA(), this.dC(), this.dG(), $$0);
      this.dV().b($$1);
   }

   @Override
   protected void a(ars $$0, coc $$1) {
      czy $$2 = $$1.f();
      if (this.g($$2)) {
         int $$3 = $$2.M();
         if ($$3 > 1) {
            this.l($$2.a($$3 - 1));
         }

         this.k(this.a(bxd.a));
         this.a($$1);
         this.a(bxd.a, $$2.a(1));
         this.g(bxd.a);
         this.a($$1, $$2.M());
         $$1.aq();
         this.cl = 0;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dj()) {
         boolean $$0 = this.bi();
         if ($$0 || this.f() != null || this.dV().ag()) {
            this.gK();
         }

         if ($$0 || this.fR()) {
            this.w(false);
         }

         if (this.gu() && this.dV().A.i() < 0.2F) {
            iv $$1 = this.dv();
            ebe $$2 = this.dV().a_($$1);
            this.dV().c(2001, $$1, dnc.j($$2));
         }
      }

      this.ci = this.ch;
      if (this.gy()) {
         this.ch = this.ch + (1.0F - this.ch) * 0.4F;
      } else {
         this.ch = this.ch + (0.0F - this.ch) * 0.4F;
      }

      this.ck = this.cj;
      if (this.ch()) {
         this.cj += 0.2F;
         if (this.cj > 3.0F) {
            this.cj = 3.0F;
         }
      } else {
         this.cj = 0.0F;
      }
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.ad);
   }

   @Override
   protected void a(crx $$0, bxw $$1) {
      ((cjz)$$1).i($$0);
   }

   public boolean gv() {
      return this.s(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gw() {
      return this.bf;
   }

   public boolean gx() {
      return this.cj == 3.0F;
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

   public boolean gy() {
      return this.s(8);
   }

   public float J(float $$0) {
      return azo.h($$0, this.ci, this.ch) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return azo.h($$0, this.ck, this.cj);
   }

   @Override
   public void g(@Nullable bxu $$0) {
      if (this.gJ() && $$0 == null) {
         this.B(false);
      }

      super.g($$0);
   }

   void gK() {
      this.C(false);
   }

   void gL() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gM() {
      return !this.fR() && !this.x() && !this.gu();
   }

   @Override
   public void T() {
      awo $$0 = this.u();
      if ($$0 == awp.jP) {
         this.a($$0, 2.0F, this.ff());
      } else {
         super.T();
      }
   }

   @Nullable
   @Override
   protected awo u() {
      if (this.fR()) {
         return awp.jQ;
      } else {
         if (!this.dV().V() && this.ae.i() < 0.1F) {
            List<crx> $$0 = this.dV().a(crx.class, this.cR().c(16.0, 16.0, 16.0), bxa.f);
            if ($$0.isEmpty()) {
               return awp.jP;
            }
         }

         return awp.jK;
      }
   }

   @Nullable
   @Override
   protected awo e(bvi $$0) {
      return awp.jO;
   }

   @Nullable
   @Override
   protected awo l_() {
      return awp.jM;
   }

   boolean j(bxu $$0) {
      return this.gH().anyMatch($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(ars $$0, bvi $$1) {
      czy $$2 = this.a(bxd.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(bxd.a, czy.k);
      }

      super.b($$0, $$1);
   }

   public static boolean a(cjz $$0, bxu $$1) {
      double $$2 = $$1.dG() - $$0.dG();
      double $$3 = $$1.dA() - $$0.dA();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dV().a_(iv.a($$0.dA() + $$8, $$0.dC() + (double)$$9, $$0.dG() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ffq cT() {
      return new ffq(0.0, (double)(0.55F * this.cS()), (double)(this.dq() * 0.4F));
   }

   class a extends cgj<bxu> {
      @Nullable
      private bxu j;
      @Nullable
      private bxu k;
      private int l;

      public a(final Class<bxu> $$0, final boolean $$1, final boolean $$2, @Nullable final cij.a $$3) {
         super(cjz.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dY().a(this.b) != 0) {
            return false;
         } else {
            ars $$0 = a(cjz.this.dV());

            for (bwz<bxu> $$1 : cjz.this.gH().toList()) {
               bxu $$2 = $$1.a($$0, bxu.class);
               if ($$2 != null) {
                  this.k = $$2;
                  this.j = $$2.er();
                  int $$3 = $$2.et();
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
            this.l = this.k.et();
         }

         cjz.this.a(awp.jJ, 1.0F, 1.0F);
         cjz.this.B(true);
         cjz.this.gK();
         super.d();
      }
   }

   class b extends ceq {
      int a;

      public b() {
         this.a(EnumSet.of(ceq.a.b, ceq.a.c, ceq.a.a));
      }

      @Override
      public boolean b() {
         return cjz.this.gu();
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
         cjz.this.A(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements cij.a {
      @Override
      public boolean test(bxu $$0, ars $$1) {
         if ($$0 instanceof cjz) {
            return false;
         } else if ($$0 instanceof cjq || $$0 instanceof ckk || $$0 instanceof coz) {
            return true;
         } else if ($$0 instanceof byq) {
            return !((byq)$$0).q();
         } else {
            if ($$0 instanceof crx $$2 && ($$2.Z_() || $$2.b())) {
               return false;
            }

            return cjz.this.j($$0) ? false : !$$0.fR() && !$$0.cf();
         }
      }
   }

   abstract class d extends ceq {
      private final cij b = cij.a().a(12.0).d().a(cjz.this.new c());

      protected boolean h() {
         iv $$0 = iv.a(cjz.this.dA(), cjz.this.cR().e, cjz.this.dG());
         return !cjz.this.dV().h($$0) && cjz.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(cjz.this.dV()).a(bxu.class, this.b, cjz.this, cjz.this.cR().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cec {
      public e(final double $$0) {
         super(cjz.this, $$0);
      }

      @Override
      public void d() {
         ((cjz)this.a).gL();
         ((cjz)this.c).gL();
         super.d();
      }

      @Override
      protected void g() {
         ars $$0 = this.b;
         cjz $$1 = (cjz)this.a.a($$0, (bwj)this.c);
         if ($$1 != null) {
            art $$2 = this.a.gD();
            art $$3 = this.c.gD();
            art $$4 = $$2;
            if ($$2 != null) {
               $$1.i($$2);
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.i($$3);
            }

            if ($$4 != null) {
               $$4.a(awz.P);
               aq.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gF();
            this.c.gF();
            $$1.c_(-24000);
            $$1.b(this.a.dA(), this.a.dC(), this.a.dG(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if ($$0.O().c(djt.g)) {
               this.b.b(new bxh(this.b, this.a.dA(), this.a.dC(), this.a.dG(), this.a.dY().a(7) + 1));
            }
         }
      }
   }

   public class f extends cfd {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cjz.this, $$1, $$2, $$3);
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
      protected boolean a(dka $$0, iv $$1) {
         ebe $$2 = $$0.a_($$1);
         return $$2.a(dne.oO) && $$2.c(dvp.c) >= 2 || doa.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cjz.this.ae.i() < 0.05F) {
            cjz.this.a(awp.jR, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(cjz.this.dV()).O().c(djt.d)) {
            ebe $$0 = cjz.this.dV().a_(this.e);
            if ($$0.a(dne.oO)) {
               this.b($$0);
            } else if (doa.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(ebe $$0) {
         doa.a(cjz.this, $$0, cjz.this.dV(), this.e);
      }

      private void b(ebe $$0) {
         int $$1 = $$0.c(dvp.c);
         $$0.b(dvp.c, Integer.valueOf(1));
         int $$2 = 1 + cjz.this.dV().A.a(2) + ($$1 == 3 ? 1 : 0);
         czy $$3 = cjz.this.a(bxd.a);
         if ($$3.f()) {
            cjz.this.a(bxd.a, new czy(dac.xG));
            $$2--;
         }

         if ($$2 > 0) {
            dnc.a(cjz.this.dV(), this.e, new czy(dac.xG, $$2));
         }

         cjz.this.a(awp.Aw, 1.0F, 1.0F);
         cjz.this.dV().a(this.e, $$0.b(dvp.c, Integer.valueOf(1)), 2);
         cjz.this.dV().a(ege.c, this.e, ege.a.a(cjz.this));
      }

      @Override
      public boolean b() {
         return !cjz.this.fR() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         cjz.this.w(false);
         super.d();
      }
   }

   class g extends cek {
      public g() {
         super(cjz.this);
      }

      @Override
      public void d() {
         super.d();
         cjz.this.gL();
      }

      @Override
      public boolean b() {
         return cjz.this.bi() && cjz.this.b(axj.a) > 0.25 || cjz.this.bv();
      }
   }

   static class h extends cep {
      private final cjz d;

      public h(cjz $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gJ() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gJ() && super.c();
      }

      @Override
      public void d() {
         this.d.gL();
         super.d();
      }
   }

   public static class i extends bwj.a {
      public final cjz.v a;

      public i(cjz.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cey {
      public j(final bxw $$0, final Class<? extends bxu> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !cjz.this.gu() && !cjz.this.gy();
      }

      @Override
      public boolean c() {
         return super.c() && !cjz.this.gu() && !cjz.this.gy();
      }
   }

   public class k extends cds {
      public k() {
         super(cjz.this);
      }

      @Override
      public void a() {
         if (!cjz.this.fR()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cjz.this.gv() && !cjz.this.ch() && !cjz.this.gy() && !cjz.this.gu();
      }
   }

   class l extends cfa {
      public l(final double $$0, final boolean $$1) {
         super(cjz.this, $$0, $$1);
      }

      @Override
      protected void a(bxu $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cjz.this.a(awp.jL, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         cjz.this.z(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !cjz.this.x() && !cjz.this.fR() && !cjz.this.ch() && !cjz.this.gu() && super.b();
      }
   }

   class m extends cdt {
      public m() {
         super(cjz.this);
      }

      @Override
      public void a() {
         if (cjz.this.gM()) {
            super.a();
         }
      }
   }

   class n extends cfj {
      public n(final double $$0) {
         super(cjz.this, $$0);
      }

      @Override
      public boolean h() {
         return !cjz.this.gJ() && super.h();
      }
   }

   public class o extends ceu {
      @Override
      public boolean b() {
         if (!cjz.this.gx()) {
            return false;
         } else {
            bxu $$0 = cjz.this.f();
            if ($$0 != null && $$0.bJ()) {
               if ($$0.cP() != $$0.cO()) {
                  return false;
               } else {
                  boolean $$1 = cjz.a(cjz.this, $$0);
                  if (!$$1) {
                     cjz.this.O().a($$0, 0);
                     cjz.this.y(false);
                     cjz.this.z(false);
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
         bxu $$0 = cjz.this.f();
         if ($$0 != null && $$0.bJ()) {
            double $$1 = cjz.this.dy().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cjz.this.dN()) < 15.0F) || !cjz.this.aH()) && !cjz.this.gu();
         } else {
            return false;
         }
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public void d() {
         cjz.this.s(true);
         cjz.this.x(true);
         cjz.this.z(false);
         bxu $$0 = cjz.this.f();
         if ($$0 != null) {
            cjz.this.J().a($$0, 60.0F, 30.0F);
            ffq $$1 = new ffq($$0.dA() - cjz.this.dA(), $$0.dC() - cjz.this.dC(), $$0.dG() - cjz.this.dG()).d();
            cjz.this.i(cjz.this.dy().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         cjz.this.O().m();
      }

      @Override
      public void e() {
         cjz.this.y(false);
         cjz.this.cj = 0.0F;
         cjz.this.ck = 0.0F;
         cjz.this.z(false);
         cjz.this.x(false);
      }

      @Override
      public void a() {
         bxu $$0 = cjz.this.f();
         if ($$0 != null) {
            cjz.this.J().a($$0, 60.0F, 30.0F);
         }

         if (!cjz.this.gu()) {
            ffq $$1 = cjz.this.dy();
            if ($$1.e * $$1.e < 0.03F && cjz.this.dN() != 0.0F) {
               cjz.this.x(azo.i(0.2F, cjz.this.dN(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               cjz.this.x((float)$$3);
            }
         }

         if ($$0 != null && cjz.this.f($$0) <= 2.0F) {
            cjz.this.c(a(cjz.this.dV()), $$0);
         } else if (cjz.this.dN() > 0.0F && cjz.this.aH() && (float)cjz.this.dy().e != 0.0F && cjz.this.dV().a_(cjz.this.dv()).a(dne.ed)) {
            cjz.this.x(60.0F);
            cjz.this.g(null);
            cjz.this.A(true);
         }
      }
   }

   class p extends ceq {
      public p() {
         this.a(EnumSet.of(ceq.a.a));
      }

      @Override
      public boolean b() {
         if (!cjz.this.a(bxd.a).f()) {
            return false;
         } else if (cjz.this.f() != null || cjz.this.er() != null) {
            return false;
         } else if (!cjz.this.gM()) {
            return false;
         } else if (cjz.this.dY().a(b(10)) != 0) {
            return false;
         } else {
            List<coc> $$0 = cjz.this.dV().a(coc.class, cjz.this.cR().c(8.0, 8.0, 8.0), cjz.bU);
            return !$$0.isEmpty() && cjz.this.a(bxd.a).f();
         }
      }

      @Override
      public void a() {
         List<coc> $$0 = cjz.this.dV().a(coc.class, cjz.this.cR().c(8.0, 8.0, 8.0), cjz.bU);
         czy $$1 = cjz.this.a(bxd.a);
         if ($$1.f() && !$$0.isEmpty()) {
            cjz.this.O().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<coc> $$0 = cjz.this.dV().a(coc.class, cjz.this.cR().c(8.0, 8.0, 8.0), cjz.bU);
         if (!$$0.isEmpty()) {
            cjz.this.O().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cfw {
      public q(final int $$0, final int $$1) {
         super(cjz.this, $$1);
      }

      @Override
      public void d() {
         cjz.this.gL();
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
         return !cjz.this.fR() && !cjz.this.x() && !cjz.this.gJ() && cjz.this.f() == null;
      }
   }

   class r extends cjz.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(ceq.a.a, ceq.a.b));
      }

      @Override
      public boolean b() {
         return cjz.this.er() == null
            && cjz.this.dY().i() < 0.02F
            && !cjz.this.fR()
            && cjz.this.f() == null
            && cjz.this.O().k()
            && !this.i()
            && !cjz.this.gv()
            && !cjz.this.ch();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + cjz.this.dY().a(3);
         cjz.this.w(true);
         cjz.this.O().m();
      }

      @Override
      public void e() {
         cjz.this.w(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cjz.this.J().a(cjz.this.dA() + this.c, cjz.this.dE(), cjz.this.dG() + this.d, (float)cjz.this.af(), (float)cjz.this.ad());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cjz.this.dY().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cjz.this.dY().a(20));
      }
   }

   class s extends cej {
      private int c = b(100);

      public s(final double $$0) {
         super(cjz.this, $$0);
      }

      @Override
      public boolean b() {
         if (!cjz.this.fR() && this.a.f() == null) {
            if (cjz.this.dV().ag() && cjz.this.dV().h(this.a.dv())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               iv $$0 = this.a.dv();
               return cjz.this.dV().V() && cjz.this.dV().h($$0) && !((ars)cjz.this.dV()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         cjz.this.gL();
         super.d();
      }
   }

   class t extends cjz.d {
      private static final int c = b(140);
      private int d = cjz.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(ceq.a.a, ceq.a.b, ceq.a.c));
      }

      @Override
      public boolean b() {
         return cjz.this.bg == 0.0F && cjz.this.bh == 0.0F && cjz.this.bi == 0.0F ? this.k() || cjz.this.fR() : false;
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
            return cjz.this.dV().V() && this.h() && !this.i() && !cjz.this.av;
         }
      }

      @Override
      public void e() {
         this.d = cjz.this.ae.a(c);
         cjz.this.gL();
      }

      @Override
      public void d() {
         cjz.this.w(false);
         cjz.this.y(false);
         cjz.this.z(false);
         cjz.this.s(false);
         cjz.this.C(true);
         cjz.this.O().m();
         cjz.this.L().a(cjz.this.dA(), cjz.this.dC(), cjz.this.dG(), 0.0);
      }
   }

   class u extends ceq {
      public u() {
         this.a(EnumSet.of(ceq.a.a, ceq.a.b));
      }

      @Override
      public boolean b() {
         if (cjz.this.fR()) {
            return false;
         } else {
            bxu $$0 = cjz.this.f();
            return $$0 != null && $$0.bJ() && cjz.bW.test($$0) && cjz.this.g((bwt)$$0) > 36.0 && !cjz.this.ch() && !cjz.this.gy() && !cjz.this.bf;
         }
      }

      @Override
      public void d() {
         cjz.this.w(false);
         cjz.this.A(false);
      }

      @Override
      public void e() {
         bxu $$0 = cjz.this.f();
         if ($$0 != null && cjz.a(cjz.this, $$0)) {
            cjz.this.z(true);
            cjz.this.y(true);
            cjz.this.O().m();
            cjz.this.J().a($$0, (float)cjz.this.af(), (float)cjz.this.ad());
         } else {
            cjz.this.z(false);
            cjz.this.y(false);
         }
      }

      @Override
      public void a() {
         bxu $$0 = cjz.this.f();
         if ($$0 != null) {
            cjz.this.J().a($$0, (float)cjz.this.af(), (float)cjz.this.ad());
            if (cjz.this.g((bwt)$$0) <= 36.0) {
               cjz.this.z(true);
               cjz.this.y(true);
               cjz.this.O().m();
            } else {
               cjz.this.O().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements bam {
      a(0, "red"),
      b(1, "snow");

      public static final cjz.v c = a;
      public static final bam.a<cjz.v> d = bam.a(cjz.v::values);
      private static final IntFunction<cjz.v> f = aye.a(cjz.v::a, values(), aye.a.a);
      public static final yy<ByteBuf, cjz.v> e = yw.a(f, cjz.v::a);
      private final int g;
      private final String h;

      private v(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      @Override
      public String c() {
         return this.h;
      }

      public int a() {
         return this.g;
      }

      public static cjz.v a(int $$0) {
         return f.apply($$0);
      }

      public static cjz.v a(jf<dla> $$0) {
         return $$0.a(axd.at) ? b : a;
      }
   }
}
