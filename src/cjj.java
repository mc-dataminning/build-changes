import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cjj extends ciu {
   private static final akj<Integer> bK = akn.a(cjj.class, akl.b);
   private static final akj<Byte> bL = akn.a(cjj.class, akl.a);
   private static final int bM = 1;
   public static final int bG = 4;
   public static final int bH = 8;
   public static final int bI = 16;
   private static final int bN = 32;
   private static final int bO = 64;
   private static final int bP = 128;
   private static final akj<Optional<bwl<bxe>>> bQ = akn.a(cjj.class, akl.r);
   private static final akj<Optional<bwl<bxe>>> bR = akn.a(cjj.class, akl.r);
   static final Predicate<cnh> bS = $$0 -> !$$0.o() && $$0.bK();
   private static final Predicate<bwf> bT = $$0 -> !($$0 instanceof bxe $$1) ? false : $$1.eu() != null && $$1.ev() < $$1.af + 600;
   static final Predicate<bwf> bU = $$0 -> $$0 instanceof cja || $$0 instanceof cju;
   private static final Predicate<bwf> bV = $$0 -> !$$0.cg() && bwm.e.test($$0);
   private static final int bW = 600;
   private static final bwi bX = bwo.aa.n().a(0.5F).b(0.2975F);
   private cea bY;
   private cea bZ;
   private cea ca;
   private float cb;
   private float cc;
   float cd;
   float ce;
   private int cf;

   public cjj(bwo<? extends cjj> $$0, dja $$1) {
      super($$0, $$1);
      this.bz = new cjj.k();
      this.bA = new cjj.m();
      this.a(exf.p, 0.0F);
      this.a(exf.q, 0.0F);
      this.a_(true);
      this.O().a(32.0F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bQ, Optional.empty());
      $$0.a(bR, Optional.empty());
      $$0.a(bK, 0);
      $$0.a(bL, (byte)0);
   }

   @Override
   protected void D() {
      this.bY = new cft<>(this, ciu.class, 10, false, false, ($$0, $$1) -> $$0 instanceof cja || $$0 instanceof cju);
      this.bZ = new cft<>(this, ckc.class, 10, false, false, ckc.bG);
      this.ca = new cft<>(this, ciq.class, 20, false, false, ($$0, $$1) -> $$0 instanceof cis);
      this.bD.a(0, new cjj.g());
      this.bD.a(0, new cdp(this, this.dV()));
      this.bD.a(1, new cjj.b());
      this.bD.a(2, new cjj.n(2.2));
      this.bD.a(3, new cjj.e(1.0));
      this.bD.a(4, new cdh<>(this, crc.class, 16.0F, 1.6, 1.4, $$0 -> bV.test($$0) && !this.j($$0) && !this.gF()));
      this.bD.a(4, new cdh<>(this, cke.class, 8.0F, 1.6, 1.4, $$0 -> !((cke)$$0).q() && !this.gF()));
      this.bD.a(4, new cdh<>(this, cjs.class, 8.0F, 1.6, 1.4, $$0 -> !this.gF()));
      this.bD.a(5, new cjj.u());
      this.bD.a(6, new cjj.o());
      this.bD.a(6, new cjj.s(1.25));
      this.bD.a(7, new cjj.l(1.2F, true));
      this.bD.a(7, new cjj.t());
      this.bD.a(8, new cjj.h(this, 1.25));
      this.bD.a(9, new cjj.q(32, 200));
      this.bD.a(10, new cjj.f(1.2F, 12, 1));
      this.bD.a(10, new ceg(this, 0.4F));
      this.bD.a(11, new cfn(this, 1.0));
      this.bD.a(11, new cjj.p());
      this.bD.a(12, new cjj.j(this, crc.class, 24.0F));
      this.bD.a(13, new cjj.r());
      this.bE.a(3, new cjj.a(bxe.class, false, false, ($$0, $$1) -> bT.test($$0) && !this.j($$0)));
   }

   @Override
   public void k_() {
      if (!this.dV().C && this.bK() && this.dj()) {
         this.cf++;
         czd $$0 = this.a(bwp.a);
         if (this.j($$0)) {
            if (this.cf > 600) {
               czd $$1 = $$0.a(this.dV(), this);
               if (!$$1.f()) {
                  this.a(bwp.a, $$1);
               }

               this.cf = 0;
            } else if (this.cf > 560 && this.ae.i() < 0.1F) {
               this.gx();
               this.dV().a(this, (byte)45);
            }
         }

         bxe $$2 = this.f();
         if ($$2 == null || !$$2.bK()) {
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
      if (this.gF() && this.ae.i() < 0.05F) {
         this.a(awn.jJ, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fg() {
      return this.eH();
   }

   private boolean j(czd $$0) {
      return $$0.c(kj.v) && this.f() == null && this.aJ() && !this.fR();
   }

   @Override
   protected void a(azv $$0, bub $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         czd $$3;
         if ($$2 < 0.05F) {
            $$3 = new czd(czh.po);
         } else if ($$2 < 0.2F) {
            $$3 = new czd(czh.rH);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new czd(czh.vO) : new czd(czh.vP);
         } else if ($$2 < 0.6F) {
            $$3 = new czd(czh.qk);
         } else if ($$2 < 0.8F) {
            $$3 = new czd(czh.rt);
         } else {
            $$3 = new czd(czh.qh);
         }

         this.a(bwp.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         czd $$1 = this.a(bwp.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               feq $$3 = new feq(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dN() * (float) (Math.PI / 180.0))
                  .b(-this.dL() * (float) (Math.PI / 180.0));
               this.dV().a(new lt(lx.U, $$1), this.dA() + this.bT().d / 2.0, this.dC(), this.dG() + this.bT().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static byj.a q() {
      return ciu.gw().a(byk.v, 0.3F).a(byk.s, 10.0).a(byk.c, 2.0).a(byk.x, 5.0).a(byk.m, 32.0);
   }

   @Nullable
   public cjj b(arq $$0, bvv $$1) {
      cjj $$2 = bwo.aa.a($$0, bwn.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((cjj)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bwo<cjj> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.ci) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      je<dkd> $$4 = $$0.u(this.dv());
      cjj.v $$5 = cjj.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cjj.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cjj.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof arq) {
         this.gD();
      }

      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gD() {
      if (this.t() == cjj.v.a) {
         this.bE.a(4, this.bY);
         this.bE.a(4, this.bZ);
         this.bE.a(6, this.ca);
      } else {
         this.bE.a(4, this.ca);
         this.bE.a(6, this.bY);
         this.bE.a(6, this.bZ);
      }
   }

   @Override
   protected void gx() {
      this.a(awn.jN, 1.0F, 1.0F);
   }

   @Override
   public bwi e(bxq $$0) {
      return this.n_() ? bX : super.e($$0);
   }

   public cjj.v t() {
      return cjj.v.a(this.al.a(bK));
   }

   private void a(cjj.v $$0) {
      this.al.a(bK, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.ay ? c((ki<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.ay);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.ay) {
         this.a(c(kj.ay, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   Stream<bwl<bxe>> gE() {
      return Stream.concat(this.al.a(bQ).stream(), this.al.a(bR).stream());
   }

   void i(bxe $$0) {
      this.a(new bwl<>($$0));
   }

   private void a(bwl<bxe> $$0) {
      if (this.al.a(bQ).isPresent()) {
         this.al.a(bR, Optional.of($$0));
      } else {
         this.al.a(bQ, Optional.of($$0));
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      Stream<UUID> $$1 = this.gE().map(bwl::c);
      uf $$2 = new uf();
      $$1.forEach($$1x -> $$2.add(uo.a($$1x)));
      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fR());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.x());
      $$0.a("Crouching", this.ci());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);

      for (uw $$2 : $$0.c("Trusted", 11)) {
         this.a(new bwl<>(uo.a($$2)));
      }

      this.C($$0.q("Sleeping"));
      this.a(cjj.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dV() instanceof arq) {
         this.gD();
      }
   }

   public boolean x() {
      return this.s(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gr() {
      return this.s(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gF() {
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
         this.al.a(bL, (byte)(this.al.a(bL) | $$0));
      } else {
         this.al.a(bL, (byte)(this.al.a(bL) & ~$$0));
      }
   }

   private boolean s(int $$0) {
      return (this.al.a(bL) & $$0) != 0;
   }

   @Override
   protected boolean f(bwp $$0) {
      return $$0 == bwp.a && this.fN();
   }

   @Override
   public boolean g(czd $$0) {
      czd $$1 = this.a(bwp.a);
      return $$1.f() || this.cf > 0 && $$0.c(kj.v) && !$$1.c(kj.v);
   }

   private void k(czd $$0) {
      if (!$$0.f() && !this.dV().C) {
         cnh $$1 = new cnh(this.dV(), this.dA() + this.bT().d, this.dC() + 1.0, this.dG() + this.bT().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awn.jS, 1.0F, 1.0F);
         this.dV().b($$1);
      }
   }

   private void l(czd $$0) {
      cnh $$1 = new cnh(this.dV(), this.dA(), this.dC(), this.dG(), $$0);
      this.dV().b($$1);
   }

   @Override
   protected void a(arq $$0, cnh $$1) {
      czd $$2 = $$1.f();
      if (this.g($$2)) {
         int $$3 = $$2.M();
         if ($$3 > 1) {
            this.l($$2.a($$3 - 1));
         }

         this.k(this.a(bwp.a));
         this.a($$1);
         this.a(bwp.a, $$2.a(1));
         this.g(bwp.a);
         this.a($$1, $$2.M());
         $$1.at();
         this.cf = 0;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dj()) {
         boolean $$0 = this.bj();
         if ($$0 || this.f() != null || this.dV().ag()) {
            this.gG();
         }

         if ($$0 || this.fR()) {
            this.w(false);
         }

         if (this.gr() && this.dV().A.i() < 0.2F) {
            iu $$1 = this.dv();
            eah $$2 = this.dV().a_($$1);
            this.dV().c(2001, $$1, dmf.j($$2));
         }
      }

      this.cc = this.cb;
      if (this.gv()) {
         this.cb = this.cb + (1.0F - this.cb) * 0.4F;
      } else {
         this.cb = this.cb + (0.0F - this.cb) * 0.4F;
      }

      this.ce = this.cd;
      if (this.ci()) {
         this.cd += 0.2F;
         if (this.cd > 3.0F) {
            this.cd = 3.0F;
         }
      } else {
         this.cd = 0.0F;
      }
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.ad);
   }

   @Override
   protected void a(crc $$0, bxg $$1) {
      ((cjj)$$1).i($$0);
   }

   public boolean gs() {
      return this.s(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gt() {
      return this.bf;
   }

   public boolean gu() {
      return this.cd == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean ci() {
      return this.s(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gv() {
      return this.s(8);
   }

   public float J(float $$0) {
      return azm.h($$0, this.cc, this.cb) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return azm.h($$0, this.ce, this.cd);
   }

   @Override
   public void g(@Nullable bxe $$0) {
      if (this.gF() && $$0 == null) {
         this.B(false);
      }

      super.g($$0);
   }

   void gG() {
      this.C(false);
   }

   void gH() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gI() {
      return !this.fR() && !this.x() && !this.gr();
   }

   @Override
   public void T() {
      awm $$0 = this.u();
      if ($$0 == awn.jP) {
         this.a($$0, 2.0F, this.ff());
      } else {
         super.T();
      }
   }

   @Nullable
   @Override
   protected awm u() {
      if (this.fR()) {
         return awn.jQ;
      } else {
         if (!this.dV().V() && this.ae.i() < 0.1F) {
            List<crc> $$0 = this.dV().a(crc.class, this.cR().c(16.0, 16.0, 16.0), bwm.f);
            if ($$0.isEmpty()) {
               return awn.jP;
            }
         }

         return awn.jK;
      }
   }

   @Nullable
   @Override
   protected awm e(buu $$0) {
      return awn.jO;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.jM;
   }

   boolean j(bxe $$0) {
      return this.gE().anyMatch($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(arq $$0, buu $$1) {
      czd $$2 = this.a(bwp.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(bwp.a, czd.k);
      }

      super.b($$0, $$1);
   }

   public static boolean a(cjj $$0, bxe $$1) {
      double $$2 = $$1.dG() - $$0.dG();
      double $$3 = $$1.dA() - $$0.dA();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dV().a_(iu.a($$0.dA() + $$8, $$0.dC() + (double)$$9, $$0.dG() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public feq cT() {
      return new feq(0.0, (double)(0.55F * this.cS()), (double)(this.dq() * 0.4F));
   }

   class a extends cft<bxe> {
      @Nullable
      private bxe j;
      @Nullable
      private bxe k;
      private int l;

      public a(final Class<bxe> $$0, final boolean $$1, final boolean $$2, @Nullable final cht.a $$3) {
         super(cjj.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dY().a(this.b) != 0) {
            return false;
         } else {
            arq $$0 = a(cjj.this.dV());

            for (bwl<bxe> $$1 : cjj.this.gE().toList()) {
               bxe $$2 = $$1.a($$0, bxe.class);
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

         cjj.this.a(awn.jJ, 1.0F, 1.0F);
         cjj.this.B(true);
         cjj.this.gG();
         super.d();
      }
   }

   class b extends cea {
      int a;

      public b() {
         this.a(EnumSet.of(cea.a.b, cea.a.c, cea.a.a));
      }

      @Override
      public boolean b() {
         return cjj.this.gr();
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
         cjj.this.A(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements cht.a {
      @Override
      public boolean test(bxe $$0, arq $$1) {
         if ($$0 instanceof cjj) {
            return false;
         } else if ($$0 instanceof cja || $$0 instanceof cju || $$0 instanceof cod) {
            return true;
         } else if ($$0 instanceof bya) {
            return !((bya)$$0).q();
         } else {
            if ($$0 instanceof crc $$2 && ($$2.V_() || $$2.b())) {
               return false;
            }

            return cjj.this.j($$0) ? false : !$$0.fR() && !$$0.cg();
         }
      }
   }

   abstract class d extends cea {
      private final cht b = cht.a().a(12.0).d().a(cjj.this.new c());

      protected boolean h() {
         iu $$0 = iu.a(cjj.this.dA(), cjj.this.cR().e, cjj.this.dG());
         return !cjj.this.dV().h($$0) && cjj.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(cjj.this.dV()).a(bxe.class, this.b, cjj.this, cjj.this.cR().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cdm {
      public e(final double $$0) {
         super(cjj.this, $$0);
      }

      @Override
      public void d() {
         ((cjj)this.a).gH();
         ((cjj)this.c).gH();
         super.d();
      }

      @Override
      protected void g() {
         arq $$0 = this.b;
         cjj $$1 = (cjj)this.a.a($$0, (bvv)this.c);
         if ($$1 != null) {
            arr $$2 = this.a.gA();
            arr $$3 = this.c.gA();
            arr $$4 = $$2;
            if ($$2 != null) {
               $$1.i($$2);
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.i($$3);
            }

            if ($$4 != null) {
               $$4.a(awx.P);
               ap.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gC();
            this.c.gC();
            $$1.c_(-24000);
            $$1.b(this.a.dA(), this.a.dC(), this.a.dG(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if ($$0.O().c(diw.g)) {
               this.b.b(new bwt(this.b, this.a.dA(), this.a.dC(), this.a.dG(), this.a.dY().a(7) + 1));
            }
         }
      }
   }

   public class f extends cen {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cjj.this, $$1, $$2, $$3);
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
      protected boolean a(djd $$0, iu $$1) {
         eah $$2 = $$0.a_($$1);
         return $$2.a(dmh.oO) && $$2.c(dus.c) >= 2 || dnd.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cjj.this.ae.i() < 0.05F) {
            cjj.this.a(awn.jR, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(cjj.this.dV()).O().c(diw.d)) {
            eah $$0 = cjj.this.dV().a_(this.e);
            if ($$0.a(dmh.oO)) {
               this.b($$0);
            } else if (dnd.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(eah $$0) {
         dnd.a(cjj.this, $$0, cjj.this.dV(), this.e);
      }

      private void b(eah $$0) {
         int $$1 = $$0.c(dus.c);
         $$0.b(dus.c, Integer.valueOf(1));
         int $$2 = 1 + cjj.this.dV().A.a(2) + ($$1 == 3 ? 1 : 0);
         czd $$3 = cjj.this.a(bwp.a);
         if ($$3.f()) {
            cjj.this.a(bwp.a, new czd(czh.xG));
            $$2--;
         }

         if ($$2 > 0) {
            dmf.a(cjj.this.dV(), this.e, new czd(czh.xG, $$2));
         }

         cjj.this.a(awn.Aw, 1.0F, 1.0F);
         cjj.this.dV().a(this.e, $$0.b(dus.c, Integer.valueOf(1)), 2);
         cjj.this.dV().a(efh.c, this.e, efh.a.a(cjj.this));
      }

      @Override
      public boolean b() {
         return !cjj.this.fR() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         cjj.this.w(false);
         super.d();
      }
   }

   class g extends cdu {
      public g() {
         super(cjj.this);
      }

      @Override
      public void d() {
         super.d();
         cjj.this.gH();
      }

      @Override
      public boolean b() {
         return cjj.this.bj() && cjj.this.b(axh.a) > 0.25 || cjj.this.bw();
      }
   }

   static class h extends cdz {
      private final cjj d;

      public h(cjj $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gF() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gF() && super.c();
      }

      @Override
      public void d() {
         this.d.gH();
         super.d();
      }
   }

   public static class i extends bvv.a {
      public final cjj.v a;

      public i(cjj.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cei {
      public j(final bxg $$0, final Class<? extends bxe> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !cjj.this.gr() && !cjj.this.gv();
      }

      @Override
      public boolean c() {
         return super.c() && !cjj.this.gr() && !cjj.this.gv();
      }
   }

   public class k extends cdc {
      public k() {
         super(cjj.this);
      }

      @Override
      public void a() {
         if (!cjj.this.fR()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cjj.this.gs() && !cjj.this.ci() && !cjj.this.gv() && !cjj.this.gr();
      }
   }

   class l extends cek {
      public l(final double $$0, final boolean $$1) {
         super(cjj.this, $$0, $$1);
      }

      @Override
      protected void a(bxe $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cjj.this.a(awn.jL, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         cjj.this.z(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !cjj.this.x() && !cjj.this.fR() && !cjj.this.ci() && !cjj.this.gr() && super.b();
      }
   }

   class m extends cdd {
      public m() {
         super(cjj.this);
      }

      @Override
      public void a() {
         if (cjj.this.gI()) {
            super.a();
         }
      }
   }

   class n extends cet {
      public n(final double $$0) {
         super(cjj.this, $$0);
      }

      @Override
      public boolean h() {
         return !cjj.this.gF() && super.h();
      }
   }

   public class o extends cee {
      @Override
      public boolean b() {
         if (!cjj.this.gu()) {
            return false;
         } else {
            bxe $$0 = cjj.this.f();
            if ($$0 != null && $$0.bK()) {
               if ($$0.cP() != $$0.cO()) {
                  return false;
               } else {
                  boolean $$1 = cjj.a(cjj.this, $$0);
                  if (!$$1) {
                     cjj.this.O().a($$0, 0);
                     cjj.this.y(false);
                     cjj.this.z(false);
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
         bxe $$0 = cjj.this.f();
         if ($$0 != null && $$0.bK()) {
            double $$1 = cjj.this.dy().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cjj.this.dN()) < 15.0F) || !cjj.this.aJ()) && !cjj.this.gr();
         } else {
            return false;
         }
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public void d() {
         cjj.this.s(true);
         cjj.this.x(true);
         cjj.this.z(false);
         bxe $$0 = cjj.this.f();
         if ($$0 != null) {
            cjj.this.J().a($$0, 60.0F, 30.0F);
            feq $$1 = new feq($$0.dA() - cjj.this.dA(), $$0.dC() - cjj.this.dC(), $$0.dG() - cjj.this.dG()).d();
            cjj.this.i(cjj.this.dy().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         cjj.this.O().m();
      }

      @Override
      public void e() {
         cjj.this.y(false);
         cjj.this.cd = 0.0F;
         cjj.this.ce = 0.0F;
         cjj.this.z(false);
         cjj.this.x(false);
      }

      @Override
      public void a() {
         bxe $$0 = cjj.this.f();
         if ($$0 != null) {
            cjj.this.J().a($$0, 60.0F, 30.0F);
         }

         if (!cjj.this.gr()) {
            feq $$1 = cjj.this.dy();
            if ($$1.e * $$1.e < 0.03F && cjj.this.dN() != 0.0F) {
               cjj.this.x(azm.i(0.2F, cjj.this.dN(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               cjj.this.x((float)$$3);
            }
         }

         if ($$0 != null && cjj.this.f($$0) <= 2.0F) {
            cjj.this.c(a(cjj.this.dV()), $$0);
         } else if (cjj.this.dN() > 0.0F && cjj.this.aJ() && (float)cjj.this.dy().e != 0.0F && cjj.this.dV().a_(cjj.this.dv()).a(dmh.ed)) {
            cjj.this.x(60.0F);
            cjj.this.g(null);
            cjj.this.A(true);
         }
      }
   }

   class p extends cea {
      public p() {
         this.a(EnumSet.of(cea.a.a));
      }

      @Override
      public boolean b() {
         if (!cjj.this.a(bwp.a).f()) {
            return false;
         } else if (cjj.this.f() != null || cjj.this.er() != null) {
            return false;
         } else if (!cjj.this.gI()) {
            return false;
         } else if (cjj.this.dY().a(b(10)) != 0) {
            return false;
         } else {
            List<cnh> $$0 = cjj.this.dV().a(cnh.class, cjj.this.cR().c(8.0, 8.0, 8.0), cjj.bS);
            return !$$0.isEmpty() && cjj.this.a(bwp.a).f();
         }
      }

      @Override
      public void a() {
         List<cnh> $$0 = cjj.this.dV().a(cnh.class, cjj.this.cR().c(8.0, 8.0, 8.0), cjj.bS);
         czd $$1 = cjj.this.a(bwp.a);
         if ($$1.f() && !$$0.isEmpty()) {
            cjj.this.O().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<cnh> $$0 = cjj.this.dV().a(cnh.class, cjj.this.cR().c(8.0, 8.0, 8.0), cjj.bS);
         if (!$$0.isEmpty()) {
            cjj.this.O().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cfg {
      public q(final int $$0, final int $$1) {
         super(cjj.this, $$1);
      }

      @Override
      public void d() {
         cjj.this.gH();
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
         return !cjj.this.fR() && !cjj.this.x() && !cjj.this.gF() && cjj.this.f() == null;
      }
   }

   class r extends cjj.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cea.a.a, cea.a.b));
      }

      @Override
      public boolean b() {
         return cjj.this.er() == null
            && cjj.this.dY().i() < 0.02F
            && !cjj.this.fR()
            && cjj.this.f() == null
            && cjj.this.O().k()
            && !this.i()
            && !cjj.this.gs()
            && !cjj.this.ci();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + cjj.this.dY().a(3);
         cjj.this.w(true);
         cjj.this.O().m();
      }

      @Override
      public void e() {
         cjj.this.w(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cjj.this.J().a(cjj.this.dA() + this.c, cjj.this.dE(), cjj.this.dG() + this.d, (float)cjj.this.ad(), (float)cjj.this.ac());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cjj.this.dY().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cjj.this.dY().a(20));
      }
   }

   class s extends cdt {
      private int c = b(100);

      public s(final double $$0) {
         super(cjj.this, $$0);
      }

      @Override
      public boolean b() {
         if (!cjj.this.fR() && this.a.f() == null) {
            if (cjj.this.dV().ag() && cjj.this.dV().h(this.a.dv())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               iu $$0 = this.a.dv();
               return cjj.this.dV().V() && cjj.this.dV().h($$0) && !((arq)cjj.this.dV()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         cjj.this.gH();
         super.d();
      }
   }

   class t extends cjj.d {
      private static final int c = b(140);
      private int d = cjj.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(cea.a.a, cea.a.b, cea.a.c));
      }

      @Override
      public boolean b() {
         return cjj.this.bg == 0.0F && cjj.this.bh == 0.0F && cjj.this.bi == 0.0F ? this.k() || cjj.this.fR() : false;
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
            return cjj.this.dV().V() && this.h() && !this.i() && !cjj.this.av;
         }
      }

      @Override
      public void e() {
         this.d = cjj.this.ae.a(c);
         cjj.this.gH();
      }

      @Override
      public void d() {
         cjj.this.w(false);
         cjj.this.y(false);
         cjj.this.z(false);
         cjj.this.s(false);
         cjj.this.C(true);
         cjj.this.O().m();
         cjj.this.L().a(cjj.this.dA(), cjj.this.dC(), cjj.this.dG(), 0.0);
      }
   }

   class u extends cea {
      public u() {
         this.a(EnumSet.of(cea.a.a, cea.a.b));
      }

      @Override
      public boolean b() {
         if (cjj.this.fR()) {
            return false;
         } else {
            bxe $$0 = cjj.this.f();
            return $$0 != null && $$0.bK() && cjj.bU.test($$0) && cjj.this.g((bwf)$$0) > 36.0 && !cjj.this.ci() && !cjj.this.gv() && !cjj.this.bf;
         }
      }

      @Override
      public void d() {
         cjj.this.w(false);
         cjj.this.A(false);
      }

      @Override
      public void e() {
         bxe $$0 = cjj.this.f();
         if ($$0 != null && cjj.a(cjj.this, $$0)) {
            cjj.this.z(true);
            cjj.this.y(true);
            cjj.this.O().m();
            cjj.this.J().a($$0, (float)cjj.this.ad(), (float)cjj.this.ac());
         } else {
            cjj.this.z(false);
            cjj.this.y(false);
         }
      }

      @Override
      public void a() {
         bxe $$0 = cjj.this.f();
         if ($$0 != null) {
            cjj.this.J().a($$0, (float)cjj.this.ad(), (float)cjj.this.ac());
            if (cjj.this.g((bwf)$$0) <= 36.0) {
               cjj.this.z(true);
               cjj.this.y(true);
               cjj.this.O().m();
            } else {
               cjj.this.O().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements bak {
      a(0, "red"),
      b(1, "snow");

      public static final bak.a<cjj.v> c = bak.a(cjj.v::values);
      private static final IntFunction<cjj.v> e = ayc.a(cjj.v::a, values(), ayc.a.a);
      public static final yw<ByteBuf, cjj.v> d = yu.a(e, cjj.v::a);
      private final int f;
      private final String g;

      private v(final int $$0, final String $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.g;
      }

      public int a() {
         return this.f;
      }

      public static cjj.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cjj.v a(int $$0) {
         return e.apply($$0);
      }

      public static cjj.v a(je<dkd> $$0) {
         return $$0.a(axb.at) ? b : a;
      }
   }
}
