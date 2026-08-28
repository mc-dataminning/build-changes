import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ckk extends cjv {
   private static final aku<Integer> bM = aky.a(ckk.class, akw.b);
   private static final aku<Byte> bN = aky.a(ckk.class, akw.a);
   private static final int bO = 1;
   public static final int bI = 4;
   public static final int bJ = 8;
   public static final int bK = 16;
   private static final int bP = 32;
   private static final int bQ = 64;
   private static final int bR = 128;
   private static final aku<Optional<bxk<byf>>> bS = aky.a(ckk.class, akw.r);
   private static final aku<Optional<bxk<byf>>> bT = aky.a(ckk.class, akw.r);
   static final Predicate<coo> bU = $$0 -> !$$0.o() && $$0.bJ();
   private static final Predicate<bxe> bV = $$0 -> !($$0 instanceof byf $$1) ? false : $$1.eu() != null && $$1.ev() < $$1.af + 600;
   static final Predicate<bxe> bW = $$0 -> $$0 instanceof ckb || $$0 instanceof ckv;
   private static final Predicate<bxe> bX = $$0 -> !$$0.cf() && bxl.e.test($$0);
   private static final int bY = 600;
   private static final bxh bZ = bxn.ab.n().a(0.5F).b(0.2975F);
   private static final Codec<List<bxk<byf>>> ca = bxk.a().listOf();
   private static final boolean cb = false;
   private static final boolean cc = false;
   private static final boolean cd = false;
   private cfb ce;
   private cfb cf;
   private cfb cg;
   private float ch;
   private float ci;
   float cj;
   float ck;
   private int cl;

   public ckk(bxn<? extends ckk> $$0, dkj $$1) {
      super($$0, $$1);
      this.bB = new ckk.k();
      this.bC = new ckk.m();
      this.a(eyr.p, 0.0F);
      this.a(eyr.q, 0.0F);
      this.a_(true);
      this.O().a(32.0F);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bS, Optional.empty());
      $$0.a(bT, Optional.empty());
      $$0.a(bM, ckk.v.c.a());
      $$0.a(bN, (byte)0);
   }

   @Override
   protected void D() {
      this.ce = new cgu<>(this, cjv.class, 10, false, false, ($$0, $$1) -> $$0 instanceof ckb || $$0 instanceof ckv);
      this.cf = new cgu<>(this, clc.class, 10, false, false, clc.bI);
      this.cg = new cgu<>(this, cjr.class, 20, false, false, ($$0, $$1) -> $$0 instanceof cjt);
      this.bF.a(0, new ckk.g());
      this.bF.a(0, new ceq(this, this.dV()));
      this.bF.a(1, new ckk.b());
      this.bF.a(2, new ckk.n(2.2));
      this.bF.a(3, new ckk.e(1.0));
      this.bF.a(4, new cei<>(this, csi.class, 16.0F, 1.6, 1.4, $$0 -> bX.test($$0) && !this.j($$0) && !this.gJ()));
      this.bF.a(4, new cei<>(this, cmx.class, 8.0F, 1.6, 1.4, $$0 -> !((cmx)$$0).q() && !this.gJ()));
      this.bF.a(4, new cei<>(this, ckt.class, 8.0F, 1.6, 1.4, $$0 -> !this.gJ()));
      this.bF.a(5, new ckk.u());
      this.bF.a(6, new ckk.o());
      this.bF.a(6, new ckk.s(1.25));
      this.bF.a(7, new ckk.l(1.2F, true));
      this.bF.a(7, new ckk.t());
      this.bF.a(8, new ckk.h(this, 1.25));
      this.bF.a(9, new ckk.q(32, 200));
      this.bF.a(10, new ckk.f(1.2F, 12, 1));
      this.bF.a(10, new cfh(this, 0.4F));
      this.bF.a(11, new cgo(this, 1.0));
      this.bF.a(11, new ckk.p());
      this.bF.a(12, new ckk.j(this, csi.class, 24.0F));
      this.bF.a(13, new ckk.r());
      this.bG.a(3, new ckk.a(byf.class, false, false, ($$0, $$1) -> bV.test($$0) && !this.j($$0)));
   }

   @Override
   public void k_() {
      if (!this.dV().C && this.bJ() && this.dj()) {
         this.cl++;
         dak $$0 = this.a(bxo.a);
         if (this.j($$0)) {
            if (this.cl > 600) {
               dak $$1 = $$0.a(this.dV(), this);
               if (!$$1.f()) {
                  this.a(bxo.a, $$1);
               }

               this.cl = 0;
            } else if (this.cl > 560 && this.ae.i() < 0.1F) {
               this.gA();
               this.dV().a(this, (byte)45);
            }
         }

         byf $$2 = this.f();
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
         this.a(awy.jJ, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fg() {
      return this.eH();
   }

   private boolean j(dak $$0) {
      return $$0.c(kl.v) && this.f() == null && this.aH() && !this.fR();
   }

   @Override
   protected void a(bai $$0, bva $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         dak $$3;
         if ($$2 < 0.05F) {
            $$3 = new dak(dao.po);
         } else if ($$2 < 0.2F) {
            $$3 = new dak(dao.rH);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new dak(dao.vO) : new dak(dao.vP);
         } else if ($$2 < 0.6F) {
            $$3 = new dak(dao.qk);
         } else if ($$2 < 0.8F) {
            $$3 = new dak(dao.rt);
         } else {
            $$3 = new dak(dao.qh);
         }

         this.a(bxo.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         dak $$1 = this.a(bxo.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               fgc $$3 = new fgc(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dN() * (float) (Math.PI / 180.0))
                  .b(-this.dL() * (float) (Math.PI / 180.0));
               this.dV().a(new lv(lz.U, $$1), this.dA() + this.bS().d / 2.0, this.dC(), this.dG() + this.bS().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bzk.a q() {
      return cjv.gz().a(bzl.v, 0.3F).a(bzl.s, 10.0).a(bzl.c, 2.0).a(bzl.x, 5.0).a(bzl.m, 32.0);
   }

   @Nullable
   public ckk b(asb $$0, bwu $$1) {
      ckk $$2 = bxn.ab.a($$0, bxm.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((ckk)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bxn<ckk> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.a_($$3.e()).a(axn.ci) && a($$1, $$3);
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      jg<dlm> $$4 = $$0.u(this.dv());
      ckk.v $$5 = ckk.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof ckk.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new ckk.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof asb) {
         this.gG();
      }

      this.a($$0.G_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gG() {
      if (this.t() == ckk.v.a) {
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
      this.a(awy.jN, 1.0F, 1.0F);
   }

   @Override
   public bxh e(byr $$0) {
      return this.n_() ? bZ : super.e($$0);
   }

   public ckk.v t() {
      return ckk.v.a(this.al.a(bM));
   }

   private void a(ckk.v $$0) {
      this.al.a(bM, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.az ? c((kk<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.az);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.az) {
         this.a(c(kl.az, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   Stream<bxk<byf>> gH() {
      return Stream.concat(this.al.a(bS).stream(), this.al.a(bT).stream());
   }

   void i(byf $$0) {
      this.a(new bxk<>($$0));
   }

   private void a(bxk<byf> $$0) {
      if (this.al.a(bS).isPresent()) {
         this.al.a(bT, Optional.of($$0));
      } else {
         this.al.a(bS, Optional.of($$0));
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Trusted", ca, this.gH().toList());
      $$0.a("Sleeping", this.fR());
      $$0.a("Type", ckk.v.d, this.t());
      $$0.a("Sitting", this.x());
      $$0.a("Crouching", this.ch());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.gI();
      $$0.<List>a("Trusted", ca).orElse(List.of()).forEach(this::a);
      this.C($$0.b("Sleeping", false));
      this.a($$0.<ckk.v>a("Type", ckk.v.d).orElse(ckk.v.c));
      this.w($$0.b("Sitting", false));
      this.y($$0.b("Crouching", false));
      if (this.dV() instanceof asb) {
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
   protected boolean f(bxo $$0) {
      return $$0 == bxo.a && this.fN();
   }

   @Override
   public boolean g(dak $$0) {
      dak $$1 = this.a(bxo.a);
      return $$1.f() || this.cl > 0 && $$0.c(kl.v) && !$$1.c(kl.v);
   }

   private void k(dak $$0) {
      if (!$$0.f() && !this.dV().C) {
         coo $$1 = new coo(this.dV(), this.dA() + this.bS().d, this.dC() + 1.0, this.dG() + this.bS().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awy.jS, 1.0F, 1.0F);
         this.dV().b($$1);
      }
   }

   private void l(dak $$0) {
      coo $$1 = new coo(this.dV(), this.dA(), this.dC(), this.dG(), $$0);
      this.dV().b($$1);
   }

   @Override
   protected void a(asb $$0, coo $$1) {
      dak $$2 = $$1.f();
      if (this.g($$2)) {
         int $$3 = $$2.M();
         if ($$3 > 1) {
            this.l($$2.a($$3 - 1));
         }

         this.k(this.a(bxo.a));
         this.a($$1);
         this.a(bxo.a, $$2.a(1));
         this.g(bxo.a);
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
            iw $$1 = this.dv();
            ebq $$2 = this.dV().a_($$1);
            this.dV().c(2001, $$1, dno.j($$2));
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
   public boolean i(dak $$0) {
      return $$0.a(axv.ae);
   }

   @Override
   protected void a(csi $$0, byh $$1) {
      ((ckk)$$1).i($$0);
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
      return azz.h($$0, this.ci, this.ch) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return azz.h($$0, this.ck, this.cj);
   }

   @Override
   public void g(@Nullable byf $$0) {
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
      awx $$0 = this.u();
      if ($$0 == awy.jP) {
         this.a($$0, 2.0F, this.ff());
      } else {
         super.T();
      }
   }

   @Nullable
   @Override
   protected awx u() {
      if (this.fR()) {
         return awy.jQ;
      } else {
         if (!this.dV().V() && this.ae.i() < 0.1F) {
            List<csi> $$0 = this.dV().a(csi.class, this.cR().c(16.0, 16.0, 16.0), bxl.f);
            if ($$0.isEmpty()) {
               return awy.jP;
            }
         }

         return awy.jK;
      }
   }

   @Nullable
   @Override
   protected awx e(bvt $$0) {
      return awy.jO;
   }

   @Nullable
   @Override
   protected awx l_() {
      return awy.jM;
   }

   boolean j(byf $$0) {
      return this.gH().anyMatch($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(asb $$0, bvt $$1) {
      dak $$2 = this.a(bxo.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(bxo.a, dak.l);
      }

      super.b($$0, $$1);
   }

   public static boolean a(ckk $$0, byf $$1) {
      double $$2 = $$1.dG() - $$0.dG();
      double $$3 = $$1.dA() - $$0.dA();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dV().a_(iw.a($$0.dA() + $$8, $$0.dC() + (double)$$9, $$0.dG() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public fgc cT() {
      return new fgc(0.0, (double)(0.55F * this.cS()), (double)(this.dq() * 0.4F));
   }

   class a extends cgu<byf> {
      @Nullable
      private byf j;
      @Nullable
      private byf k;
      private int l;

      public a(final Class<byf> $$0, final boolean $$1, final boolean $$2, @Nullable final ciu.a $$3) {
         super(ckk.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dY().a(this.b) != 0) {
            return false;
         } else {
            asb $$0 = a(ckk.this.dV());

            for (bxk<byf> $$1 : ckk.this.gH().toList()) {
               byf $$2 = $$1.a($$0, byf.class);
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

         ckk.this.a(awy.jJ, 1.0F, 1.0F);
         ckk.this.B(true);
         ckk.this.gK();
         super.d();
      }
   }

   class b extends cfb {
      int a;

      public b() {
         this.a(EnumSet.of(cfb.a.b, cfb.a.c, cfb.a.a));
      }

      @Override
      public boolean b() {
         return ckk.this.gu();
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
         ckk.this.A(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements ciu.a {
      @Override
      public boolean test(byf $$0, asb $$1) {
         if ($$0 instanceof ckk) {
            return false;
         } else if ($$0 instanceof ckb || $$0 instanceof ckv || $$0 instanceof cpk) {
            return true;
         } else if ($$0 instanceof bzb) {
            return !((bzb)$$0).q();
         } else {
            if ($$0 instanceof csi $$2 && ($$2.aa_() || $$2.b())) {
               return false;
            }

            return ckk.this.j($$0) ? false : !$$0.fR() && !$$0.cf();
         }
      }
   }

   abstract class d extends cfb {
      private final ciu b = ciu.a().a(12.0).d().a(ckk.this.new c());

      protected boolean h() {
         iw $$0 = iw.a(ckk.this.dA(), ckk.this.cR().e, ckk.this.dG());
         return !ckk.this.dV().h($$0) && ckk.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(ckk.this.dV()).a(byf.class, this.b, ckk.this, ckk.this.cR().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cen {
      public e(final double $$0) {
         super(ckk.this, $$0);
      }

      @Override
      public void d() {
         ((ckk)this.a).gL();
         ((ckk)this.c).gL();
         super.d();
      }

      @Override
      protected void g() {
         asb $$0 = this.b;
         ckk $$1 = (ckk)this.a.a($$0, (bwu)this.c);
         if ($$1 != null) {
            asc $$2 = this.a.gD();
            asc $$3 = this.c.gD();
            asc $$4 = $$2;
            if ($$2 != null) {
               $$1.i($$2);
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.i($$3);
            }

            if ($$4 != null) {
               $$4.a(axi.P);
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
            if ($$0.O().c(dkf.g)) {
               this.b.b(new bxs(this.b, this.a.dA(), this.a.dC(), this.a.dG(), this.a.dY().a(7) + 1));
            }
         }
      }
   }

   public class f extends cfo {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(ckk.this, $$1, $$2, $$3);
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
      protected boolean a(dkm $$0, iw $$1) {
         ebq $$2 = $$0.a_($$1);
         return $$2.a(dnq.oO) && $$2.c(dwb.c) >= 2 || dom.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && ckk.this.ae.i() < 0.05F) {
            ckk.this.a(awy.jR, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(ckk.this.dV()).O().c(dkf.d)) {
            ebq $$0 = ckk.this.dV().a_(this.e);
            if ($$0.a(dnq.oO)) {
               this.b($$0);
            } else if (dom.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(ebq $$0) {
         dom.a(ckk.this, $$0, ckk.this.dV(), this.e);
      }

      private void b(ebq $$0) {
         int $$1 = $$0.c(dwb.c);
         $$0.b(dwb.c, Integer.valueOf(1));
         int $$2 = 1 + ckk.this.dV().A.a(2) + ($$1 == 3 ? 1 : 0);
         dak $$3 = ckk.this.a(bxo.a);
         if ($$3.f()) {
            ckk.this.a(bxo.a, new dak(dao.xG));
            $$2--;
         }

         if ($$2 > 0) {
            dno.a(ckk.this.dV(), this.e, new dak(dao.xG, $$2));
         }

         ckk.this.a(awy.Aw, 1.0F, 1.0F);
         ckk.this.dV().a(this.e, $$0.b(dwb.c, Integer.valueOf(1)), 2);
         ckk.this.dV().a(egq.c, this.e, egq.a.a(ckk.this));
      }

      @Override
      public boolean b() {
         return !ckk.this.fR() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         ckk.this.w(false);
         super.d();
      }
   }

   class g extends cev {
      public g() {
         super(ckk.this);
      }

      @Override
      public void d() {
         super.d();
         ckk.this.gL();
      }

      @Override
      public boolean b() {
         return ckk.this.bi() && ckk.this.b(axs.a) > 0.25 || ckk.this.bv();
      }
   }

   static class h extends cfa {
      private final ckk d;

      public h(ckk $$0, double $$1) {
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

   public static class i extends bwu.a {
      public final ckk.v a;

      public i(ckk.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cfj {
      public j(final byh $$0, final Class<? extends byf> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !ckk.this.gu() && !ckk.this.gy();
      }

      @Override
      public boolean c() {
         return super.c() && !ckk.this.gu() && !ckk.this.gy();
      }
   }

   public class k extends ced {
      public k() {
         super(ckk.this);
      }

      @Override
      public void a() {
         if (!ckk.this.fR()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !ckk.this.gv() && !ckk.this.ch() && !ckk.this.gy() && !ckk.this.gu();
      }
   }

   class l extends cfl {
      public l(final double $$0, final boolean $$1) {
         super(ckk.this, $$0, $$1);
      }

      @Override
      protected void a(byf $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            ckk.this.a(awy.jL, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         ckk.this.z(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !ckk.this.x() && !ckk.this.fR() && !ckk.this.ch() && !ckk.this.gu() && super.b();
      }
   }

   class m extends cee {
      public m() {
         super(ckk.this);
      }

      @Override
      public void a() {
         if (ckk.this.gM()) {
            super.a();
         }
      }
   }

   class n extends cfu {
      public n(final double $$0) {
         super(ckk.this, $$0);
      }

      @Override
      public boolean h() {
         return !ckk.this.gJ() && super.h();
      }
   }

   public class o extends cff {
      @Override
      public boolean b() {
         if (!ckk.this.gx()) {
            return false;
         } else {
            byf $$0 = ckk.this.f();
            if ($$0 != null && $$0.bJ()) {
               if ($$0.cP() != $$0.cO()) {
                  return false;
               } else {
                  boolean $$1 = ckk.a(ckk.this, $$0);
                  if (!$$1) {
                     ckk.this.O().a($$0, 0);
                     ckk.this.y(false);
                     ckk.this.z(false);
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
         byf $$0 = ckk.this.f();
         if ($$0 != null && $$0.bJ()) {
            double $$1 = ckk.this.dy().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(ckk.this.dN()) < 15.0F) || !ckk.this.aH()) && !ckk.this.gu();
         } else {
            return false;
         }
      }

      @Override
      public boolean V_() {
         return false;
      }

      @Override
      public void d() {
         ckk.this.s(true);
         ckk.this.x(true);
         ckk.this.z(false);
         byf $$0 = ckk.this.f();
         if ($$0 != null) {
            ckk.this.J().a($$0, 60.0F, 30.0F);
            fgc $$1 = new fgc($$0.dA() - ckk.this.dA(), $$0.dC() - ckk.this.dC(), $$0.dG() - ckk.this.dG()).d();
            ckk.this.i(ckk.this.dy().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         ckk.this.O().m();
      }

      @Override
      public void e() {
         ckk.this.y(false);
         ckk.this.cj = 0.0F;
         ckk.this.ck = 0.0F;
         ckk.this.z(false);
         ckk.this.x(false);
      }

      @Override
      public void a() {
         byf $$0 = ckk.this.f();
         if ($$0 != null) {
            ckk.this.J().a($$0, 60.0F, 30.0F);
         }

         if (!ckk.this.gu()) {
            fgc $$1 = ckk.this.dy();
            if ($$1.e * $$1.e < 0.03F && ckk.this.dN() != 0.0F) {
               ckk.this.x(azz.i(0.2F, ckk.this.dN(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               ckk.this.x((float)$$3);
            }
         }

         if ($$0 != null && ckk.this.f($$0) <= 2.0F) {
            ckk.this.c(a(ckk.this.dV()), $$0);
         } else if (ckk.this.dN() > 0.0F && ckk.this.aH() && (float)ckk.this.dy().e != 0.0F && ckk.this.dV().a_(ckk.this.dv()).a(dnq.ed)) {
            ckk.this.x(60.0F);
            ckk.this.g(null);
            ckk.this.A(true);
         }
      }
   }

   class p extends cfb {
      public p() {
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean b() {
         if (!ckk.this.a(bxo.a).f()) {
            return false;
         } else if (ckk.this.f() != null || ckk.this.er() != null) {
            return false;
         } else if (!ckk.this.gM()) {
            return false;
         } else if (ckk.this.dY().a(b(10)) != 0) {
            return false;
         } else {
            List<coo> $$0 = ckk.this.dV().a(coo.class, ckk.this.cR().c(8.0, 8.0, 8.0), ckk.bU);
            return !$$0.isEmpty() && ckk.this.a(bxo.a).f();
         }
      }

      @Override
      public void a() {
         List<coo> $$0 = ckk.this.dV().a(coo.class, ckk.this.cR().c(8.0, 8.0, 8.0), ckk.bU);
         dak $$1 = ckk.this.a(bxo.a);
         if ($$1.f() && !$$0.isEmpty()) {
            ckk.this.O().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<coo> $$0 = ckk.this.dV().a(coo.class, ckk.this.cR().c(8.0, 8.0, 8.0), ckk.bU);
         if (!$$0.isEmpty()) {
            ckk.this.O().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cgh {
      public q(final int $$0, final int $$1) {
         super(ckk.this, $$1);
      }

      @Override
      public void d() {
         ckk.this.gL();
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
         return !ckk.this.fR() && !ckk.this.x() && !ckk.this.gJ() && ckk.this.f() == null;
      }
   }

   class r extends ckk.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cfb.a.a, cfb.a.b));
      }

      @Override
      public boolean b() {
         return ckk.this.er() == null
            && ckk.this.dY().i() < 0.02F
            && !ckk.this.fR()
            && ckk.this.f() == null
            && ckk.this.O().k()
            && !this.i()
            && !ckk.this.gv()
            && !ckk.this.ch();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + ckk.this.dY().a(3);
         ckk.this.w(true);
         ckk.this.O().m();
      }

      @Override
      public void e() {
         ckk.this.w(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         ckk.this.J().a(ckk.this.dA() + this.c, ckk.this.dE(), ckk.this.dG() + this.d, (float)ckk.this.af(), (float)ckk.this.ad());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * ckk.this.dY().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + ckk.this.dY().a(20));
      }
   }

   class s extends ceu {
      private int c = b(100);

      public s(final double $$0) {
         super(ckk.this, $$0);
      }

      @Override
      public boolean b() {
         if (!ckk.this.fR() && this.a.f() == null) {
            if (ckk.this.dV().ag() && ckk.this.dV().h(this.a.dv())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               iw $$0 = this.a.dv();
               return ckk.this.dV().V() && ckk.this.dV().h($$0) && !((asb)ckk.this.dV()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         ckk.this.gL();
         super.d();
      }
   }

   class t extends ckk.d {
      private static final int c = b(140);
      private int d = ckk.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(cfb.a.a, cfb.a.b, cfb.a.c));
      }

      @Override
      public boolean b() {
         return ckk.this.bg == 0.0F && ckk.this.bh == 0.0F && ckk.this.bi == 0.0F ? this.k() || ckk.this.fR() : false;
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
            return ckk.this.dV().V() && this.h() && !this.i() && !ckk.this.av;
         }
      }

      @Override
      public void e() {
         this.d = ckk.this.ae.a(c);
         ckk.this.gL();
      }

      @Override
      public void d() {
         ckk.this.w(false);
         ckk.this.y(false);
         ckk.this.z(false);
         ckk.this.s(false);
         ckk.this.C(true);
         ckk.this.O().m();
         ckk.this.L().a(ckk.this.dA(), ckk.this.dC(), ckk.this.dG(), 0.0);
      }
   }

   class u extends cfb {
      public u() {
         this.a(EnumSet.of(cfb.a.a, cfb.a.b));
      }

      @Override
      public boolean b() {
         if (ckk.this.fR()) {
            return false;
         } else {
            byf $$0 = ckk.this.f();
            return $$0 != null && $$0.bJ() && ckk.bW.test($$0) && ckk.this.g((bxe)$$0) > 36.0 && !ckk.this.ch() && !ckk.this.gy() && !ckk.this.bf;
         }
      }

      @Override
      public void d() {
         ckk.this.w(false);
         ckk.this.A(false);
      }

      @Override
      public void e() {
         byf $$0 = ckk.this.f();
         if ($$0 != null && ckk.a(ckk.this, $$0)) {
            ckk.this.z(true);
            ckk.this.y(true);
            ckk.this.O().m();
            ckk.this.J().a($$0, (float)ckk.this.af(), (float)ckk.this.ad());
         } else {
            ckk.this.z(false);
            ckk.this.y(false);
         }
      }

      @Override
      public void a() {
         byf $$0 = ckk.this.f();
         if ($$0 != null) {
            ckk.this.J().a($$0, (float)ckk.this.af(), (float)ckk.this.ad());
            if (ckk.this.g((bxe)$$0) <= 36.0) {
               ckk.this.z(true);
               ckk.this.y(true);
               ckk.this.O().m();
            } else {
               ckk.this.O().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements bax {
      a(0, "red"),
      b(1, "snow");

      public static final ckk.v c = a;
      public static final bax.a<ckk.v> d = bax.a(ckk.v::values);
      private static final IntFunction<ckk.v> f = ayo.a(ckk.v::a, values(), ayo.a.a);
      public static final ze<ByteBuf, ckk.v> e = zc.a(f, ckk.v::a);
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

      public static ckk.v a(int $$0) {
         return f.apply($$0);
      }

      public static ckk.v a(jg<dlm> $$0) {
         return $$0.a(axm.at) ? b : a;
      }
   }
}
