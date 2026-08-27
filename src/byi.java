import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byi extends bxy implements bnj<byi.v> {
   private static final agm<Integer> bX = agp.a(byi.class, ago.b);
   private static final agm<Byte> bY = agp.a(byi.class, ago.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final agm<Optional<UUID>> cd = agp.a(byi.class, ago.q);
   private static final agm<Optional<UUID>> ce = agp.a(byi.class, ago.q);
   static final Predicate<cbu> cf = $$0 -> !$$0.z() && $$0.bx();
   private static final Predicate<blv> cg = $$0 -> !($$0 instanceof bml $$1) ? false : $$1.ej() != null && $$1.ek() < $$1.ah + 600;
   static final Predicate<blv> ch = $$0 -> $$0 instanceof byd || $$0 instanceof bys;
   private static final Predicate<blv> ci = $$0 -> !$$0.bV() && bly.e.test($$0);
   private static final int cj = 600;
   private bth ck;
   private bth cl;
   private bth cm;
   private float cn;
   private float co;
   float cp;
   float cq;
   private int cr;

   public byi(blz<? extends byi> $$0, ctp $$1) {
      super($$0, $$1);
      this.bK = new byi.k();
      this.bL = new byi.m();
      this.a(efc.p, 0.0F);
      this.a(efc.q, 0.0F);
      this.s(true);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cd, Optional.empty());
      this.an.a(ce, Optional.empty());
      this.an.a(bX, 0);
      this.an.a(bY, (byte)0);
   }

   @Override
   protected void B() {
      this.ck = new bva<>(this, bxy.class, 10, false, false, $$0 -> $$0 instanceof byd || $$0 instanceof bys);
      this.cl = new bva<>(this, byz.class, 10, false, false, byz.bU);
      this.cm = new bva<>(this, bxv.class, 20, false, false, $$0 -> $$0 instanceof bxx);
      this.bO.a(0, new byi.g());
      this.bO.a(0, new bsw(this, this.dM()));
      this.bO.a(1, new byi.b());
      this.bO.a(2, new byi.n(2.2));
      this.bO.a(3, new byi.e(1.0));
      this.bO.a(4, new bso<>(this, cfi.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cw()) && !this.gq()));
      this.bO.a(4, new bso<>(this, bzb.class, 8.0F, 1.6, 1.4, $$0 -> !((bzb)$$0).u() && !this.gq()));
      this.bO.a(4, new bso<>(this, byq.class, 8.0F, 1.6, 1.4, $$0 -> !this.gq()));
      this.bO.a(5, new byi.u());
      this.bO.a(6, new byi.o());
      this.bO.a(6, new byi.s(1.25));
      this.bO.a(7, new byi.l(1.2F, true));
      this.bO.a(7, new byi.t());
      this.bO.a(8, new byi.h(this, 1.25));
      this.bO.a(9, new byi.q(32, 200));
      this.bO.a(10, new byi.f(1.2F, 12, 1));
      this.bO.a(10, new btn(this, 0.4F));
      this.bO.a(11, new buu(this, 1.0));
      this.bO.a(11, new byi.p());
      this.bO.a(12, new byi.j(this, cfi.class, 24.0F));
      this.bO.a(13, new byi.r());
      this.bP.a(3, new byi.a(bml.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cw())));
   }

   @Override
   public arr d(cmy $$0) {
      return ars.iF;
   }

   @Override
   public void d_() {
      if (!this.dM().B && this.bx() && this.cY()) {
         this.cr++;
         cmy $$0 = this.c(bma.a);
         if (this.l($$0)) {
            if (this.cr > 600) {
               cmy $$1 = $$0.a(this.dM(), this);
               if (!$$1.b()) {
                  this.a(bma.a, $$1);
               }

               this.cr = 0;
            } else if (this.cr > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dM().a(this, (byte)45);
            }
         }

         bml $$2 = this.q();
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
      if (this.gq() && this.ag.i() < 0.05F) {
         this.a(ars.iB, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eY() {
      return this.ew();
   }

   private boolean l(cmy $$0) {
      return $$0.d().u() && this.q() == null && this.aC() && !this.fD();
   }

   @Override
   protected void a(auv $$0, bjz $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cmy $$3;
         if ($$2 < 0.05F) {
            $$3 = new cmy(cnb.ow);
         } else if ($$2 < 0.2F) {
            $$3 = new cmy(cnb.qO);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cmy(cnb.uw) : new cmy(cnb.ux);
         } else if ($$2 < 0.6F) {
            $$3 = new cmy(cnb.pt);
         } else if ($$2 < 0.8F) {
            $$3 = new cmy(cnb.qA);
         } else {
            $$3 = new cmy(cnb.pq);
         }

         this.a(bma.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cmy $$1 = this.c(bma.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               elt $$3 = new elt(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dE() * (float) (Math.PI / 180.0))
                  .b(-this.dC() * (float) (Math.PI / 180.0));
               this.dM().a(new jt(jx.Q, $$1), this.dr() + this.bF().c / 2.0, this.dt(), this.dx() + this.bF().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bnq.a u() {
      return bmn.C().a(bnr.m, 0.3F).a(bnr.l, 10.0).a(bnr.g, 32.0).a(bnr.c, 2.0);
   }

   @Nullable
   public byi b(and $$0, blq $$1) {
      byi $$2 = blz.O.a((ctp)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.w() : ((byi)$$1).w());
      }

      return $$2;
   }

   public static boolean c(blz<byi> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return $$1.a_($$3.d()).a(ash.bW) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      ih<cuo> $$5 = $$0.t(this.dm());
      byi.v $$6 = byi.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof byi.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new byi.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof and) {
         this.go();
      }

      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void go() {
      if (this.w() == byi.v.a) {
         this.bP.a(4, this.ck);
         this.bP.a(4, this.cl);
         this.bP.a(6, this.cm);
      } else {
         this.bP.a(4, this.cm);
         this.bP.a(6, this.ck);
         this.bP.a(6, this.cl);
      }
   }

   @Override
   protected void a(cfi $$0, bka $$1, cmy $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return this.o_() ? $$1.b * 0.85F : 0.4F;
   }

   public byi.v w() {
      return byi.v.a(this.an.b(bX));
   }

   public void a(byi.v $$0) {
      this.an.b(bX, $$0.a());
   }

   List<UUID> gp() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.an.b(cd).orElse(null));
      $$0.add(this.an.b(ce).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.an.b(cd).isPresent()) {
         this.an.b(ce, Optional.ofNullable($$0));
      } else {
         this.an.b(cd, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gp();
      st $$2 = new st();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(tc.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fD());
      $$0.a("Type", this.w().c());
      $$0.a("Sitting", this.A());
      $$0.a("Crouching", this.bX());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);

      for (tk $$2 : $$0.c("Trusted", 11)) {
         this.b(tc.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(byi.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dM() instanceof and) {
         this.go();
      }
   }

   public boolean A() {
      return this.t(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean ge() {
      return this.t(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gq() {
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
         this.an.b(bY, (byte)(this.an.b(bY) | $$0));
      } else {
         this.an.b(bY, (byte)(this.an.b(bY) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.an.b(bY) & $$0) != 0;
   }

   @Override
   public boolean f(cmy $$0) {
      bma $$1 = bmn.h($$0);
      return !this.c($$1).b() ? false : $$1 == bma.a && super.f($$0);
   }

   @Override
   public boolean j(cmy $$0) {
      cmt $$1 = $$0.d();
      cmy $$2 = this.c(bma.a);
      return $$2.b() || this.cr > 0 && $$1.u() && !$$2.d().u();
   }

   private void n(cmy $$0) {
      if (!$$0.b() && !this.dM().B) {
         cbu $$1 = new cbu(this.dM(), this.dr() + this.bF().c, this.dt() + 1.0, this.dx() + this.bF().e, $$0);
         $$1.b(40);
         $$1.a(this);
         this.a(ars.iK, 1.0F, 1.0F);
         this.dM().b($$1);
      }
   }

   private void o(cmy $$0) {
      cbu $$1 = new cbu(this.dM(), this.dr(), this.dt(), this.dx(), $$0);
      this.dM().b($$1);
   }

   @Override
   protected void b(cbu $$0) {
      cmy $$1 = $$0.q();
      if (this.j($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(bma.a));
         this.a($$0);
         this.a(bma.a, $$1.a(1));
         this.e(bma.a);
         this.a($$0, $$1.L());
         $$0.am();
         this.cr = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.cY()) {
         boolean $$0 = this.aZ();
         if ($$0 || this.q() != null || this.dM().aa()) {
            this.gr();
         }

         if ($$0 || this.fD()) {
            this.w(false);
         }

         if (this.ge() && this.dM().z.i() < 0.2F) {
            hx $$1 = this.dm();
            djh $$2 = this.dM().a_($$1);
            this.dM().c(2001, $$1, cwq.i($$2));
         }
      }

      this.co = this.cn;
      if (this.gn()) {
         this.cn = this.cn + (1.0F - this.cn) * 0.4F;
      } else {
         this.cn = this.cn + (0.0F - this.cn) * 0.4F;
      }

      this.cq = this.cp;
      if (this.bX()) {
         this.cp += 0.2F;
         if (this.cp > 3.0F) {
            this.cp = 3.0F;
         }
      } else {
         this.cp = 0.0F;
      }
   }

   @Override
   public boolean m(cmy $$0) {
      return $$0.a(asp.X);
   }

   @Override
   protected void a(cfi $$0, bmn $$1) {
      ((byi)$$1).b($$0.cw());
   }

   public boolean gk() {
      return this.t(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gl() {
      return this.bj;
   }

   public boolean gm() {
      return this.cp == 3.0F;
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

   public boolean gn() {
      return this.t(8);
   }

   public float E(float $$0) {
      return auo.i($$0, this.co, this.cn) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return auo.i($$0, this.cq, this.cp);
   }

   @Override
   public void h(@Nullable bml $$0) {
      if (this.gq() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return auo.f(($$0 - 5.0F) * $$1);
   }

   void gr() {
      this.C(false);
   }

   void gs() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gt() {
      return !this.fD() && !this.A() && !this.ge();
   }

   @Override
   public void R() {
      arr $$0 = this.y();
      if ($$0 == ars.iH) {
         this.a($$0, 2.0F, this.eX());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected arr y() {
      if (this.fD()) {
         return ars.iI;
      } else {
         if (!this.dM().P() && this.ag.i() < 0.1F) {
            List<cfi> $$0 = this.dM().a(cfi.class, this.cH().c(16.0, 16.0, 16.0), bly.f);
            if ($$0.isEmpty()) {
               return ars.iH;
            }
         }

         return ars.iC;
      }
   }

   @Nullable
   @Override
   protected arr d(bkt $$0) {
      return ars.iG;
   }

   @Nullable
   @Override
   protected arr n_() {
      return ars.iE;
   }

   boolean c(UUID $$0) {
      return this.gp().contains($$0);
   }

   @Override
   protected void g(bkt $$0) {
      cmy $$1 = this.c(bma.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bma.a, cmy.f);
      }

      super.g($$0);
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + -0.0625F * $$2, -0.25F * $$2);
   }

   public static boolean a(byi $$0, bml $$1) {
      double $$2 = $$1.dx() - $$0.dx();
      double $$3 = $$1.dr() - $$0.dr();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dM().a_(hx.a($$0.dr() + $$8, $$0.dt() + (double)$$9, $$0.dx() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public elt cJ() {
      return new elt(0.0, (double)(0.55F * this.cI()), (double)(this.dg() * 0.4F));
   }

   class a extends bva<bml> {
      @Nullable
      private bml j;
      @Nullable
      private bml k;
      private int l;

      public a(Class<bml> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bml> $$3) {
         super(byi.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.eg().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : byi.this.gp()) {
               if ($$0 != null && byi.this.dM() instanceof and && ((and)byi.this.dM()).a($$0) instanceof bml $$2) {
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

         byi.this.a(ars.iB, 1.0F, 1.0F);
         byi.this.B(true);
         byi.this.gr();
         super.c();
      }
   }

   class b extends bth {
      int a;

      public b() {
         this.a(EnumSet.of(bth.a.b, bth.a.c, bth.a.a));
      }

      @Override
      public boolean a() {
         return byi.this.ge();
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
         byi.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bml> {
      public boolean a(bml $$0) {
         if ($$0 instanceof byi) {
            return false;
         } else if ($$0 instanceof byd || $$0 instanceof bys || $$0 instanceof ccp) {
            return true;
         } else if ($$0 instanceof bng) {
            return !((bng)$$0).u();
         } else if (!($$0 instanceof cfi) || !$$0.P_() && !((cfi)$$0).f()) {
            return byi.this.c($$0.cw()) ? false : !$$0.fD() && !$$0.bV();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bth {
      private final bwz b = bwz.a().a(12.0).d().a(byi.this.new c());

      protected boolean h() {
         hx $$0 = hx.a(byi.this.dr(), byi.this.cH().e, byi.this.dx());
         return !byi.this.dM().h($$0) && byi.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !byi.this.dM().a(bml.class, this.b, byi.this, byi.this.cH().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bst {
      public e(double $$0) {
         super(byi.this, $$0);
      }

      @Override
      public void c() {
         ((byi)this.a).gs();
         ((byi)this.c).gs();
         super.c();
      }

      @Override
      protected void g() {
         and $$0 = (and)this.b;
         byi $$1 = (byi)this.a.a($$0, (blq)this.c);
         if ($$1 != null) {
            ane $$2 = this.a.gh();
            ane $$3 = this.c.gh();
            ane $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cw());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cw());
            }

            if ($$4 != null) {
               $$4.a(asc.P);
               am.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gj();
            this.c.gj();
            $$1.c_(-24000);
            $$1.b(this.a.dr(), this.a.dt(), this.a.dx(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.Z().b(ctl.f)) {
               this.b.b(new bmb(this.b, this.a.dr(), this.a.dt(), this.a.dx(), this.a.eg().a(7) + 1));
            }
         }
      }
   }

   public class f extends btu {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(byi.this, $$1, $$2, $$3);
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
      protected boolean a(cts $$0, hx $$1) {
         djh $$2 = $$0.a_($$1);
         return $$2.a(cws.oi) && $$2.c(des.c) >= 2 || cxm.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && byi.this.ag.i() < 0.05F) {
            byi.this.a(ars.iJ, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (byi.this.dM().Z().b(ctl.c)) {
            djh $$0 = byi.this.dM().a_(this.e);
            if ($$0.a(cws.oi)) {
               this.b($$0);
            } else if (cxm.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(djh $$0) {
         cxm.a(byi.this, $$0, byi.this.dM(), this.e);
      }

      private void b(djh $$0) {
         int $$1 = $$0.c(des.c);
         $$0.a(des.c, Integer.valueOf(1));
         int $$2 = 1 + byi.this.dM().z.a(2) + ($$1 == 3 ? 1 : 0);
         cmy $$3 = byi.this.c(bma.a);
         if ($$3.b()) {
            byi.this.a(bma.a, new cmy(cnb.wi));
            $$2--;
         }

         if ($$2 > 0) {
            cwq.a(byi.this.dM(), this.e, new cmy(cnb.wi, $$2));
         }

         byi.this.a(ars.yv, 1.0F, 1.0F);
         byi.this.dM().a(this.e, $$0.a(des.c, Integer.valueOf(1)), 2);
         byi.this.dM().a(dnr.c, this.e, dnr.a.a(byi.this));
      }

      @Override
      public boolean a() {
         return !byi.this.fD() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         byi.this.w(false);
         super.c();
      }
   }

   class g extends btb {
      public g() {
         super(byi.this);
      }

      @Override
      public void c() {
         super.c();
         byi.this.gs();
      }

      @Override
      public boolean a() {
         return byi.this.aZ() && byi.this.b(asm.a) > 0.25 || byi.this.bn();
      }
   }

   class h extends btg {
      private final byi e;

      public h(byi $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gq() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gq() && super.b();
      }

      @Override
      public void c() {
         this.e.gs();
         super.c();
      }
   }

   public static class i extends blq.a {
      public final byi.v a;

      public i(byi.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends btp {
      public j(bmn $$0, Class<? extends bml> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !byi.this.ge() && !byi.this.gn();
      }

      @Override
      public boolean b() {
         return super.b() && !byi.this.ge() && !byi.this.gn();
      }
   }

   public class k extends bsj {
      public k() {
         super(byi.this);
      }

      @Override
      public void a() {
         if (!byi.this.fD()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !byi.this.gk() && !byi.this.bX() && !byi.this.gn() && !byi.this.ge();
      }
   }

   class l extends btr {
      public l(double $$0, boolean $$1) {
         super(byi.this, $$0, $$1);
      }

      @Override
      protected void a(bml $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            byi.this.a(ars.iD, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         byi.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !byi.this.A() && !byi.this.fD() && !byi.this.bX() && !byi.this.ge() && super.a();
      }
   }

   class m extends bsk {
      public m() {
         super(byi.this);
      }

      @Override
      public void a() {
         if (byi.this.gt()) {
            super.a();
         }
      }
   }

   class n extends bua {
      public n(double $$0) {
         super(byi.this, $$0);
      }

      @Override
      public boolean h() {
         return !byi.this.gq() && super.h();
      }
   }

   public class o extends btl {
      @Override
      public boolean a() {
         if (!byi.this.gm()) {
            return false;
         } else {
            bml $$0 = byi.this.q();
            if ($$0 != null && $$0.bx()) {
               if ($$0.cF() != $$0.cE()) {
                  return false;
               } else {
                  boolean $$1 = byi.a(byi.this, $$0);
                  if (!$$1) {
                     byi.this.N().a($$0, 0);
                     byi.this.y(false);
                     byi.this.z(false);
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
         bml $$0 = byi.this.q();
         if ($$0 != null && $$0.bx()) {
            double $$1 = byi.this.dp().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(byi.this.dE()) < 15.0F) || !byi.this.aC()) && !byi.this.ge();
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
         byi.this.r(true);
         byi.this.x(true);
         byi.this.z(false);
         bml $$0 = byi.this.q();
         if ($$0 != null) {
            byi.this.I().a($$0, 60.0F, 30.0F);
            elt $$1 = new elt($$0.dr() - byi.this.dr(), $$0.dt() - byi.this.dt(), $$0.dx() - byi.this.dx()).d();
            byi.this.g(byi.this.dp().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         byi.this.N().n();
      }

      @Override
      public void d() {
         byi.this.y(false);
         byi.this.cp = 0.0F;
         byi.this.cq = 0.0F;
         byi.this.z(false);
         byi.this.x(false);
      }

      @Override
      public void e() {
         bml $$0 = byi.this.q();
         if ($$0 != null) {
            byi.this.I().a($$0, 60.0F, 30.0F);
         }

         if (!byi.this.ge()) {
            elt $$1 = byi.this.dp();
            if ($$1.d * $$1.d < 0.03F && byi.this.dE() != 0.0F) {
               byi.this.s(auo.j(0.2F, byi.this.dE(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               byi.this.s((float)$$3);
            }
         }

         if ($$0 != null && byi.this.e((blv)$$0) <= 2.0F) {
            byi.this.C($$0);
         } else if (byi.this.dE() > 0.0F && byi.this.aC() && (float)byi.this.dp().d != 0.0F && byi.this.dM().a_(byi.this.dm()).a(cws.dN)) {
            byi.this.s(60.0F);
            byi.this.h(null);
            byi.this.A(true);
         }
      }
   }

   class p extends bth {
      public p() {
         this.a(EnumSet.of(bth.a.a));
      }

      @Override
      public boolean a() {
         if (!byi.this.c(bma.a).b()) {
            return false;
         } else if (byi.this.q() != null || byi.this.eh() != null) {
            return false;
         } else if (!byi.this.gt()) {
            return false;
         } else if (byi.this.eg().a(b(10)) != 0) {
            return false;
         } else {
            List<cbu> $$0 = byi.this.dM().a(cbu.class, byi.this.cH().c(8.0, 8.0, 8.0), byi.cf);
            return !$$0.isEmpty() && byi.this.c(bma.a).b();
         }
      }

      @Override
      public void e() {
         List<cbu> $$0 = byi.this.dM().a(cbu.class, byi.this.cH().c(8.0, 8.0, 8.0), byi.cf);
         cmy $$1 = byi.this.c(bma.a);
         if ($$1.b() && !$$0.isEmpty()) {
            byi.this.N().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cbu> $$0 = byi.this.dM().a(cbu.class, byi.this.cH().c(8.0, 8.0, 8.0), byi.cf);
         if (!$$0.isEmpty()) {
            byi.this.N().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends bun {
      public q(int $$0, int $$1) {
         super(byi.this, $$1);
      }

      @Override
      public void c() {
         byi.this.gs();
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
         return !byi.this.fD() && !byi.this.A() && !byi.this.gq() && byi.this.q() == null;
      }
   }

   class r extends byi.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bth.a.a, bth.a.b));
      }

      @Override
      public boolean a() {
         return byi.this.eh() == null
            && byi.this.eg().i() < 0.02F
            && !byi.this.fD()
            && byi.this.q() == null
            && byi.this.N().l()
            && !this.i()
            && !byi.this.gk()
            && !byi.this.bX();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + byi.this.eg().a(3);
         byi.this.w(true);
         byi.this.N().n();
      }

      @Override
      public void d() {
         byi.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         byi.this.I().a(byi.this.dr() + this.c, byi.this.dv(), byi.this.dx() + this.d, (float)byi.this.ab(), (float)byi.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * byi.this.eg().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + byi.this.eg().a(20));
      }
   }

   class s extends bta {
      private int c = b(100);

      public s(double $$0) {
         super(byi.this, $$0);
      }

      @Override
      public boolean a() {
         if (!byi.this.fD() && this.a.q() == null) {
            if (byi.this.dM().aa() && byi.this.dM().h(this.a.dm())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               hx $$0 = this.a.dm();
               return byi.this.dM().P() && byi.this.dM().h($$0) && !((and)byi.this.dM()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         byi.this.gs();
         super.c();
      }
   }

   class t extends byi.d {
      private static final int c = b(140);
      private int d = byi.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(bth.a.a, bth.a.b, bth.a.c));
      }

      @Override
      public boolean a() {
         return byi.this.bk == 0.0F && byi.this.bl == 0.0F && byi.this.bm == 0.0F ? this.k() || byi.this.fD() : false;
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
            return byi.this.dM().P() && this.h() && !this.i() && !byi.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = byi.this.ag.a(c);
         byi.this.gs();
      }

      @Override
      public void c() {
         byi.this.w(false);
         byi.this.y(false);
         byi.this.z(false);
         byi.this.r(false);
         byi.this.C(true);
         byi.this.N().n();
         byi.this.K().a(byi.this.dr(), byi.this.dt(), byi.this.dx(), 0.0);
      }
   }

   class u extends bth {
      public u() {
         this.a(EnumSet.of(bth.a.a, bth.a.b));
      }

      @Override
      public boolean a() {
         if (byi.this.fD()) {
            return false;
         } else {
            bml $$0 = byi.this.q();
            return $$0 != null && $$0.bx() && byi.ch.test($$0) && byi.this.f($$0) > 36.0 && !byi.this.bX() && !byi.this.gn() && !byi.this.bj;
         }
      }

      @Override
      public void c() {
         byi.this.w(false);
         byi.this.A(false);
      }

      @Override
      public void d() {
         bml $$0 = byi.this.q();
         if ($$0 != null && byi.a(byi.this, $$0)) {
            byi.this.z(true);
            byi.this.y(true);
            byi.this.N().n();
            byi.this.I().a($$0, (float)byi.this.ab(), (float)byi.this.aa());
         } else {
            byi.this.z(false);
            byi.this.y(false);
         }
      }

      @Override
      public void e() {
         bml $$0 = byi.this.q();
         if ($$0 != null) {
            byi.this.I().a($$0, (float)byi.this.ab(), (float)byi.this.aa());
            if (byi.this.f($$0) <= 36.0) {
               byi.this.z(true);
               byi.this.y(true);
               byi.this.N().n();
            } else {
               byi.this.N().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements avk {
      a(0, "red"),
      b(1, "snow");

      public static final avk.a<byi.v> c = avk.a(byi.v::values);
      private static final IntFunction<byi.v> d = atg.a(byi.v::a, values(), atg.a.a);
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

      public static byi.v a(String $$0) {
         return c.a($$0, a);
      }

      public static byi.v a(int $$0) {
         return d.apply($$0);
      }

      public static byi.v a(ih<cuo> $$0) {
         return $$0.a(asg.ar) ? b : a;
      }
   }
}
