import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bym extends byc implements bnm<bym.v> {
   private static final agn<Integer> bY = agq.a(bym.class, agp.b);
   private static final agn<Byte> bZ = agq.a(bym.class, agp.a);
   private static final int ca = 1;
   public static final int bU = 4;
   public static final int bV = 8;
   public static final int bX = 16;
   private static final int cb = 32;
   private static final int cc = 64;
   private static final int cd = 128;
   private static final agn<Optional<UUID>> ce = agq.a(bym.class, agp.q);
   private static final agn<Optional<UUID>> cf = agq.a(bym.class, agp.q);
   static final Predicate<ccb> cg = $$0 -> !$$0.z() && $$0.bx();
   private static final Predicate<blw> ch = $$0 -> !($$0 instanceof bmo $$1) ? false : $$1.ej() != null && $$1.ek() < $$1.ah + 600;
   static final Predicate<blw> ci = $$0 -> $$0 instanceof byh || $$0 instanceof byw;
   private static final Predicate<blw> cj = $$0 -> !$$0.bV() && bmb.e.test($$0);
   private static final int ck = 600;
   private static final blz cl = bmc.P.n().a(0.5F).b(0.2975F);
   private btk cm;
   private btk cn;
   private btk co;
   private float cp;
   private float cq;
   float cr;
   float cs;
   private int ct;

   public bym(bmc<? extends bym> $$0, ctx $$1) {
      super($$0, $$1);
      this.bL = new bym.k();
      this.bM = new bym.m();
      this.a(efk.p, 0.0F);
      this.a(efk.q, 0.0F);
      this.s(true);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ce, Optional.empty());
      this.an.a(cf, Optional.empty());
      this.an.a(bY, 0);
      this.an.a(bZ, (byte)0);
   }

   @Override
   protected void B() {
      this.cm = new bvd<>(this, byc.class, 10, false, false, $$0 -> $$0 instanceof byh || $$0 instanceof byw);
      this.cn = new bvd<>(this, bzd.class, 10, false, false, bzd.bV);
      this.co = new bvd<>(this, bxz.class, 20, false, false, $$0 -> $$0 instanceof byb);
      this.bP.a(0, new bym.g());
      this.bP.a(0, new bsz(this, this.dL()));
      this.bP.a(1, new bym.b());
      this.bP.a(2, new bym.n(2.2));
      this.bP.a(3, new bym.e(1.0));
      this.bP.a(4, new bsr<>(this, cfq.class, 16.0F, 1.6, 1.4, $$0 -> cj.test($$0) && !this.c($$0.cw()) && !this.gr()));
      this.bP.a(4, new bsr<>(this, bzf.class, 8.0F, 1.6, 1.4, $$0 -> !((bzf)$$0).u() && !this.gr()));
      this.bP.a(4, new bsr<>(this, byu.class, 8.0F, 1.6, 1.4, $$0 -> !this.gr()));
      this.bP.a(5, new bym.u());
      this.bP.a(6, new bym.o());
      this.bP.a(6, new bym.s(1.25));
      this.bP.a(7, new bym.l(1.2F, true));
      this.bP.a(7, new bym.t());
      this.bP.a(8, new bym.h(this, 1.25));
      this.bP.a(9, new bym.q(32, 200));
      this.bP.a(10, new bym.f(1.2F, 12, 1));
      this.bP.a(10, new btq(this, 0.4F));
      this.bP.a(11, new bux(this, 1.0));
      this.bP.a(11, new bym.p());
      this.bP.a(12, new bym.j(this, cfq.class, 24.0F));
      this.bP.a(13, new bym.r());
      this.bQ.a(3, new bym.a(bmo.class, false, false, $$0 -> ch.test($$0) && !this.c($$0.cw())));
   }

   @Override
   public ars d(cng $$0) {
      return art.iU;
   }

   @Override
   public void d_() {
      if (!this.dL().B && this.bx() && this.cY()) {
         this.ct++;
         cng $$0 = this.c(bmd.a);
         if (this.l($$0)) {
            if (this.ct > 600) {
               cng $$1 = $$0.a(this.dL(), this);
               if (!$$1.b()) {
                  this.a(bmd.a, $$1);
               }

               this.ct = 0;
            } else if (this.ct > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dL().a(this, (byte)45);
            }
         }

         bmo $$2 = this.q();
         if ($$2 == null || !$$2.bx()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fD() || this.eY()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      }

      super.d_();
      if (this.gr() && this.ag.i() < 0.05F) {
         this.a(art.iQ, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eY() {
      return this.ew();
   }

   private boolean l(cng $$0) {
      return $$0.d().t() && this.q() == null && this.aC() && !this.fD();
   }

   @Override
   protected void a(auw $$0, bka $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cng $$3;
         if ($$2 < 0.05F) {
            $$3 = new cng(cnj.oy);
         } else if ($$2 < 0.2F) {
            $$3 = new cng(cnj.qQ);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cng(cnj.uz) : new cng(cnj.uA);
         } else if ($$2 < 0.6F) {
            $$3 = new cng(cnj.pv);
         } else if ($$2 < 0.8F) {
            $$3 = new cng(cnj.qC);
         } else {
            $$3 = new cng(cnj.ps);
         }

         this.a(bmd.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cng $$1 = this.c(bmd.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               emc $$3 = new emc(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dD() * (float) (Math.PI / 180.0))
                  .b(-this.dB() * (float) (Math.PI / 180.0));
               this.dL().a(new jt(jx.Q, $$1), this.dq() + this.bF().c / 2.0, this.ds(), this.dw() + this.bF().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bnt.a u() {
      return bmq.C().a(bnu.o, 0.3F).a(bnu.n, 10.0).a(bnu.i, 32.0).a(bnu.c, 2.0);
   }

   @Nullable
   public bym b(ane $$0, blr $$1) {
      bym $$2 = bmc.P.a((ctx)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.w() : ((bym)$$1).w());
      }

      return $$2;
   }

   public static boolean c(bmc<bym> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return $$1.a_($$3.d()).a(asi.bW) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      ih<cuw> $$5 = $$0.t(this.dl());
      bym.v $$6 = bym.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof bym.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new bym.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof ane) {
         this.gp();
      }

      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void gp() {
      if (this.w() == bym.v.a) {
         this.bQ.a(4, this.cm);
         this.bQ.a(4, this.cn);
         this.bQ.a(6, this.co);
      } else {
         this.bQ.a(4, this.co);
         this.bQ.a(6, this.cm);
         this.bQ.a(6, this.cn);
      }
   }

   @Override
   protected void a(cfq $$0, bkb $$1, cng $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public blz e(bna $$0) {
      return this.o_() ? cl : super.e($$0);
   }

   public bym.v w() {
      return bym.v.a(this.an.b(bY));
   }

   public void a(bym.v $$0) {
      this.an.b(bY, $$0.a());
   }

   List<UUID> gq() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.an.b(ce).orElse(null));
      $$0.add(this.an.b(cf).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.an.b(ce).isPresent()) {
         this.an.b(cf, Optional.ofNullable($$0));
      } else {
         this.an.b(ce, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gq();
      su $$2 = new su();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(td.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fD());
      $$0.a("Type", this.w().c());
      $$0.a("Sitting", this.A());
      $$0.a("Crouching", this.bX());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);

      for (tl $$2 : $$0.c("Trusted", 11)) {
         this.b(td.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(bym.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dL() instanceof ane) {
         this.gp();
      }
   }

   public boolean A() {
      return this.t(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gf() {
      return this.t(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gr() {
      return this.t(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fD() {
      return this.t(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.an.b(bZ, (byte)(this.an.b(bZ) | $$0));
      } else {
         this.an.b(bZ, (byte)(this.an.b(bZ) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.an.b(bZ) & $$0) != 0;
   }

   @Override
   public boolean f(cng $$0) {
      bmd $$1 = bmq.h($$0);
      return !this.c($$1).b() ? false : $$1 == bmd.a && super.f($$0);
   }

   @Override
   public boolean j(cng $$0) {
      cnb $$1 = $$0.d();
      cng $$2 = this.c(bmd.a);
      return $$2.b() || this.ct > 0 && $$1.t() && !$$2.d().t();
   }

   private void n(cng $$0) {
      if (!$$0.b() && !this.dL().B) {
         ccb $$1 = new ccb(this.dL(), this.dq() + this.bF().c, this.ds() + 1.0, this.dw() + this.bF().e, $$0);
         $$1.b(40);
         $$1.a(this);
         this.a(art.iZ, 1.0F, 1.0F);
         this.dL().b($$1);
      }
   }

   private void o(cng $$0) {
      ccb $$1 = new ccb(this.dL(), this.dq(), this.ds(), this.dw(), $$0);
      this.dL().b($$1);
   }

   @Override
   protected void b(ccb $$0) {
      cng $$1 = $$0.q();
      if (this.j($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(bmd.a));
         this.a($$0);
         this.a(bmd.a, $$1.a(1));
         this.e(bmd.a);
         this.a($$0, $$1.L());
         $$0.am();
         this.ct = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.cY()) {
         boolean $$0 = this.aZ();
         if ($$0 || this.q() != null || this.dL().aa()) {
            this.gs();
         }

         if ($$0 || this.fD()) {
            this.w(false);
         }

         if (this.gf() && this.dL().z.i() < 0.2F) {
            hx $$1 = this.dl();
            djp $$2 = this.dL().a_($$1);
            this.dL().c(2001, $$1, cwy.i($$2));
         }
      }

      this.cq = this.cp;
      if (this.go()) {
         this.cp = this.cp + (1.0F - this.cp) * 0.4F;
      } else {
         this.cp = this.cp + (0.0F - this.cp) * 0.4F;
      }

      this.cs = this.cr;
      if (this.bX()) {
         this.cr += 0.2F;
         if (this.cr > 3.0F) {
            this.cr = 3.0F;
         }
      } else {
         this.cr = 0.0F;
      }
   }

   @Override
   public boolean m(cng $$0) {
      return $$0.a(asq.X);
   }

   @Override
   protected void a(cfq $$0, bmq $$1) {
      ((bym)$$1).b($$0.cw());
   }

   public boolean gl() {
      return this.t(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gm() {
      return this.bj;
   }

   public boolean gn() {
      return this.cr == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean bX() {
      return this.t(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean go() {
      return this.t(8);
   }

   public float D(float $$0) {
      return aup.i($$0, this.cq, this.cp) * 0.11F * (float) Math.PI;
   }

   public float E(float $$0) {
      return aup.i($$0, this.cs, this.cr);
   }

   @Override
   public void h(@Nullable bmo $$0) {
      if (this.gr() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return aup.f(($$0 - 5.0F) * $$1);
   }

   void gs() {
      this.C(false);
   }

   void gt() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gu() {
      return !this.fD() && !this.A() && !this.gf();
   }

   @Override
   public void R() {
      ars $$0 = this.y();
      if ($$0 == art.iW) {
         this.a($$0, 2.0F, this.eX());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected ars y() {
      if (this.fD()) {
         return art.iX;
      } else {
         if (!this.dL().P() && this.ag.i() < 0.1F) {
            List<cfq> $$0 = this.dL().a(cfq.class, this.cH().c(16.0, 16.0, 16.0), bmb.f);
            if ($$0.isEmpty()) {
               return art.iW;
            }
         }

         return art.iR;
      }
   }

   @Nullable
   @Override
   protected ars d(bkv $$0) {
      return art.iV;
   }

   @Nullable
   @Override
   protected ars n_() {
      return art.iT;
   }

   boolean c(UUID $$0) {
      return this.gq().contains($$0);
   }

   @Override
   protected void g(bkv $$0) {
      cng $$1 = this.c(bmd.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bmd.a, cng.f);
      }

      super.g($$0);
   }

   public static boolean a(bym $$0, bmo $$1) {
      double $$2 = $$1.dw() - $$0.dw();
      double $$3 = $$1.dq() - $$0.dq();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dL().a_(hx.a($$0.dq() + $$8, $$0.ds() + (double)$$9, $$0.dw() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public emc cJ() {
      return new emc(0.0, (double)(0.55F * this.cI()), (double)(this.dg() * 0.4F));
   }

   class a extends bvd<bmo> {
      @Nullable
      private bmo j;
      @Nullable
      private bmo k;
      private int l;

      public a(Class<bmo> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bmo> $$3) {
         super(bym.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.eg().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : bym.this.gq()) {
               if ($$0 != null && bym.this.dL() instanceof ane && ((ane)bym.this.dL()).a($$0) instanceof bmo $$2) {
                  this.k = $$2;
                  this.j = $$2.eh();
                  int $$3 = $$2.ei();
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
            this.l = this.k.ei();
         }

         bym.this.a(art.iQ, 1.0F, 1.0F);
         bym.this.B(true);
         bym.this.gs();
         super.c();
      }
   }

   class b extends btk {
      int a;

      public b() {
         this.a(EnumSet.of(btk.a.b, btk.a.c, btk.a.a));
      }

      @Override
      public boolean a() {
         return bym.this.gf();
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
         bym.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bmo> {
      public boolean a(bmo $$0) {
         if ($$0 instanceof bym) {
            return false;
         } else if ($$0 instanceof byh || $$0 instanceof byw || $$0 instanceof ccw) {
            return true;
         } else if ($$0 instanceof bnj) {
            return !((bnj)$$0).u();
         } else if (!($$0 instanceof cfq) || !$$0.P_() && !((cfq)$$0).f()) {
            return bym.this.c($$0.cw()) ? false : !$$0.fD() && !$$0.bV();
         } else {
            return false;
         }
      }
   }

   abstract class d extends btk {
      private final bxd b = bxd.a().a(12.0).d().a(bym.this.new c());

      protected boolean h() {
         hx $$0 = hx.a(bym.this.dq(), bym.this.cH().e, bym.this.dw());
         return !bym.this.dL().h($$0) && bym.this.d($$0) >= 0.0F;
      }

      protected boolean i() {
         return !bym.this.dL().a(bmo.class, this.b, bym.this, bym.this.cH().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bsw {
      public e(double $$0) {
         super(bym.this, $$0);
      }

      @Override
      public void c() {
         ((bym)this.a).gt();
         ((bym)this.c).gt();
         super.c();
      }

      @Override
      protected void g() {
         ane $$0 = (ane)this.b;
         bym $$1 = (bym)this.a.a($$0, (blr)this.c);
         if ($$1 != null) {
            anf $$2 = this.a.gi();
            anf $$3 = this.c.gi();
            anf $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cw());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cw());
            }

            if ($$4 != null) {
               $$4.a(asd.P);
               am.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gk();
            this.c.gk();
            $$1.c_(-24000);
            $$1.b(this.a.dq(), this.a.ds(), this.a.dw(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.Z().b(ctt.f)) {
               this.b.b(new bme(this.b, this.a.dq(), this.a.ds(), this.a.dw(), this.a.eg().a(7) + 1));
            }
         }
      }
   }

   public class f extends btx {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(bym.this, $$1, $$2, $$3);
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
      protected boolean a(cua $$0, hx $$1) {
         djp $$2 = $$0.a_($$1);
         return $$2.a(cxa.oi) && $$2.c(dfa.c) >= 2 || cxu.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && bym.this.ag.i() < 0.05F) {
            bym.this.a(art.iY, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (bym.this.dL().Z().b(ctt.c)) {
            djp $$0 = bym.this.dL().a_(this.e);
            if ($$0.a(cxa.oi)) {
               this.b($$0);
            } else if (cxu.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(djp $$0) {
         cxu.a(bym.this, $$0, bym.this.dL(), this.e);
      }

      private void b(djp $$0) {
         int $$1 = $$0.c(dfa.c);
         $$0.a(dfa.c, Integer.valueOf(1));
         int $$2 = 1 + bym.this.dL().z.a(2) + ($$1 == 3 ? 1 : 0);
         cng $$3 = bym.this.c(bmd.a);
         if ($$3.b()) {
            bym.this.a(bmd.a, new cng(cnj.wl));
            $$2--;
         }

         if ($$2 > 0) {
            cwy.a(bym.this.dL(), this.e, new cng(cnj.wl, $$2));
         }

         bym.this.a(art.yK, 1.0F, 1.0F);
         bym.this.dL().a(this.e, $$0.a(dfa.c, Integer.valueOf(1)), 2);
         bym.this.dL().a(dnz.c, this.e, dnz.a.a(bym.this));
      }

      @Override
      public boolean a() {
         return !bym.this.fD() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         bym.this.w(false);
         super.c();
      }
   }

   class g extends bte {
      public g() {
         super(bym.this);
      }

      @Override
      public void c() {
         super.c();
         bym.this.gt();
      }

      @Override
      public boolean a() {
         return bym.this.aZ() && bym.this.b(asn.a) > 0.25 || bym.this.bn();
      }
   }

   class h extends btj {
      private final bym e;

      public h(bym $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gr() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gr() && super.b();
      }

      @Override
      public void c() {
         this.e.gt();
         super.c();
      }
   }

   public static class i extends blr.a {
      public final bym.v a;

      public i(bym.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bts {
      public j(bmq $$0, Class<? extends bmo> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !bym.this.gf() && !bym.this.go();
      }

      @Override
      public boolean b() {
         return super.b() && !bym.this.gf() && !bym.this.go();
      }
   }

   public class k extends bsm {
      public k() {
         super(bym.this);
      }

      @Override
      public void a() {
         if (!bym.this.fD()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bym.this.gl() && !bym.this.bX() && !bym.this.go() && !bym.this.gf();
      }
   }

   class l extends btu {
      public l(double $$0, boolean $$1) {
         super(bym.this, $$0, $$1);
      }

      @Override
      protected void a(bmo $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.B($$0);
            bym.this.a(art.iS, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         bym.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !bym.this.A() && !bym.this.fD() && !bym.this.bX() && !bym.this.gf() && super.a();
      }
   }

   class m extends bsn {
      public m() {
         super(bym.this);
      }

      @Override
      public void a() {
         if (bym.this.gu()) {
            super.a();
         }
      }
   }

   class n extends bud {
      public n(double $$0) {
         super(bym.this, $$0);
      }

      @Override
      public boolean h() {
         return !bym.this.gr() && super.h();
      }
   }

   public class o extends bto {
      @Override
      public boolean a() {
         if (!bym.this.gn()) {
            return false;
         } else {
            bmo $$0 = bym.this.q();
            if ($$0 != null && $$0.bx()) {
               if ($$0.cF() != $$0.cE()) {
                  return false;
               } else {
                  boolean $$1 = bym.a(bym.this, $$0);
                  if (!$$1) {
                     bym.this.N().a($$0, 0);
                     bym.this.y(false);
                     bym.this.z(false);
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
         bmo $$0 = bym.this.q();
         if ($$0 != null && $$0.bx()) {
            double $$1 = bym.this.do().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(bym.this.dD()) < 15.0F) || !bym.this.aC()) && !bym.this.gf();
         } else {
            return false;
         }
      }

      @Override
      public boolean S_() {
         return false;
      }

      @Override
      public void c() {
         bym.this.r(true);
         bym.this.x(true);
         bym.this.z(false);
         bmo $$0 = bym.this.q();
         if ($$0 != null) {
            bym.this.I().a($$0, 60.0F, 30.0F);
            emc $$1 = new emc($$0.dq() - bym.this.dq(), $$0.ds() - bym.this.ds(), $$0.dw() - bym.this.dw()).d();
            bym.this.g(bym.this.do().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         bym.this.N().n();
      }

      @Override
      public void d() {
         bym.this.y(false);
         bym.this.cr = 0.0F;
         bym.this.cs = 0.0F;
         bym.this.z(false);
         bym.this.x(false);
      }

      @Override
      public void e() {
         bmo $$0 = bym.this.q();
         if ($$0 != null) {
            bym.this.I().a($$0, 60.0F, 30.0F);
         }

         if (!bym.this.gf()) {
            emc $$1 = bym.this.do();
            if ($$1.d * $$1.d < 0.03F && bym.this.dD() != 0.0F) {
               bym.this.s(aup.j(0.2F, bym.this.dD(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               bym.this.s((float)$$3);
            }
         }

         if ($$0 != null && bym.this.e($$0) <= 2.0F) {
            bym.this.B($$0);
         } else if (bym.this.dD() > 0.0F && bym.this.aC() && (float)bym.this.do().d != 0.0F && bym.this.dL().a_(bym.this.dl()).a(cxa.dN)) {
            bym.this.s(60.0F);
            bym.this.h(null);
            bym.this.A(true);
         }
      }
   }

   class p extends btk {
      public p() {
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean a() {
         if (!bym.this.c(bmd.a).b()) {
            return false;
         } else if (bym.this.q() != null || bym.this.eh() != null) {
            return false;
         } else if (!bym.this.gu()) {
            return false;
         } else if (bym.this.eg().a(b(10)) != 0) {
            return false;
         } else {
            List<ccb> $$0 = bym.this.dL().a(ccb.class, bym.this.cH().c(8.0, 8.0, 8.0), bym.cg);
            return !$$0.isEmpty() && bym.this.c(bmd.a).b();
         }
      }

      @Override
      public void e() {
         List<ccb> $$0 = bym.this.dL().a(ccb.class, bym.this.cH().c(8.0, 8.0, 8.0), bym.cg);
         cng $$1 = bym.this.c(bmd.a);
         if ($$1.b() && !$$0.isEmpty()) {
            bym.this.N().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<ccb> $$0 = bym.this.dL().a(ccb.class, bym.this.cH().c(8.0, 8.0, 8.0), bym.cg);
         if (!$$0.isEmpty()) {
            bym.this.N().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends buq {
      public q(int $$0, int $$1) {
         super(bym.this, $$1);
      }

      @Override
      public void c() {
         bym.this.gt();
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
         return !bym.this.fD() && !bym.this.A() && !bym.this.gr() && bym.this.q() == null;
      }
   }

   class r extends bym.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(btk.a.a, btk.a.b));
      }

      @Override
      public boolean a() {
         return bym.this.eh() == null
            && bym.this.eg().i() < 0.02F
            && !bym.this.fD()
            && bym.this.q() == null
            && bym.this.N().l()
            && !this.i()
            && !bym.this.gl()
            && !bym.this.bX();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + bym.this.eg().a(3);
         bym.this.w(true);
         bym.this.N().n();
      }

      @Override
      public void d() {
         bym.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         bym.this.I().a(bym.this.dq() + this.c, bym.this.du(), bym.this.dw() + this.d, (float)bym.this.fH(), (float)bym.this.ab());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * bym.this.eg().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + bym.this.eg().a(20));
      }
   }

   class s extends btd {
      private int c = b(100);

      public s(double $$0) {
         super(bym.this, $$0);
      }

      @Override
      public boolean a() {
         if (!bym.this.fD() && this.a.q() == null) {
            if (bym.this.dL().aa() && bym.this.dL().h(this.a.dl())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               hx $$0 = this.a.dl();
               return bym.this.dL().P() && bym.this.dL().h($$0) && !((ane)bym.this.dL()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         bym.this.gt();
         super.c();
      }
   }

   class t extends bym.d {
      private static final int c = b(140);
      private int d = bym.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(btk.a.a, btk.a.b, btk.a.c));
      }

      @Override
      public boolean a() {
         return bym.this.bk == 0.0F && bym.this.bl == 0.0F && bym.this.bm == 0.0F ? this.k() || bym.this.fD() : false;
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
            return bym.this.dL().P() && this.h() && !this.i() && !bym.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = bym.this.ag.a(c);
         bym.this.gt();
      }

      @Override
      public void c() {
         bym.this.w(false);
         bym.this.y(false);
         bym.this.z(false);
         bym.this.r(false);
         bym.this.C(true);
         bym.this.N().n();
         bym.this.K().a(bym.this.dq(), bym.this.ds(), bym.this.dw(), 0.0);
      }
   }

   class u extends btk {
      public u() {
         this.a(EnumSet.of(btk.a.a, btk.a.b));
      }

      @Override
      public boolean a() {
         if (bym.this.fD()) {
            return false;
         } else {
            bmo $$0 = bym.this.q();
            return $$0 != null && $$0.bx() && bym.ci.test($$0) && bym.this.f($$0) > 36.0 && !bym.this.bX() && !bym.this.go() && !bym.this.bj;
         }
      }

      @Override
      public void c() {
         bym.this.w(false);
         bym.this.A(false);
      }

      @Override
      public void d() {
         bmo $$0 = bym.this.q();
         if ($$0 != null && bym.a(bym.this, $$0)) {
            bym.this.z(true);
            bym.this.y(true);
            bym.this.N().n();
            bym.this.I().a($$0, (float)bym.this.fH(), (float)bym.this.ab());
         } else {
            bym.this.z(false);
            bym.this.y(false);
         }
      }

      @Override
      public void e() {
         bmo $$0 = bym.this.q();
         if ($$0 != null) {
            bym.this.I().a($$0, (float)bym.this.fH(), (float)bym.this.ab());
            if (bym.this.f($$0) <= 36.0) {
               bym.this.z(true);
               bym.this.y(true);
               bym.this.N().n();
            } else {
               bym.this.N().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements avl {
      a(0, "red"),
      b(1, "snow");

      public static final avl.a<bym.v> c = avl.a(bym.v::values);
      private static final IntFunction<bym.v> d = ath.a(bym.v::a, values(), ath.a.a);
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

      public static bym.v a(String $$0) {
         return c.a($$0, a);
      }

      public static bym.v a(int $$0) {
         return d.apply($$0);
      }

      public static bym.v a(ih<cuw> $$0) {
         return $$0.a(ash.ar) ? b : a;
      }
   }
}
