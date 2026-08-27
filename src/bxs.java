import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxs extends bxi implements bmt<bxs.v> {
   private static final afz<Integer> bX = agc.a(bxs.class, agb.b);
   private static final afz<Byte> bY = agc.a(bxs.class, agb.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final afz<Optional<UUID>> cd = agc.a(bxs.class, agb.q);
   private static final afz<Optional<UUID>> ce = agc.a(bxs.class, agb.q);
   static final Predicate<cbe> cf = $$0 -> !$$0.z() && $$0.bx();
   private static final Predicate<blf> cg = $$0 -> !($$0 instanceof blv $$1) ? false : $$1.ej() != null && $$1.ek() < $$1.ah + 600;
   static final Predicate<blf> ch = $$0 -> $$0 instanceof bxn || $$0 instanceof byc;
   private static final Predicate<blf> ci = $$0 -> !$$0.bV() && bli.e.test($$0);
   private static final int cj = 600;
   private bsr ck;
   private bsr cl;
   private bsr cm;
   private float cn;
   private float co;
   float cp;
   float cq;
   private int cr;

   public bxs(blj<? extends bxs> $$0, csy $$1) {
      super($$0, $$1);
      this.bK = new bxs.k();
      this.bL = new bxs.m();
      this.a(eek.p, 0.0F);
      this.a(eek.q, 0.0F);
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
      this.ck = new buk<>(this, bxi.class, 10, false, false, $$0 -> $$0 instanceof bxn || $$0 instanceof byc);
      this.cl = new buk<>(this, byj.class, 10, false, false, byj.bU);
      this.cm = new buk<>(this, bxf.class, 20, false, false, $$0 -> $$0 instanceof bxh);
      this.bO.a(0, new bxs.g());
      this.bO.a(0, new bsg(this, this.dM()));
      this.bO.a(1, new bxs.b());
      this.bO.a(2, new bxs.n(2.2));
      this.bO.a(3, new bxs.e(1.0));
      this.bO.a(4, new bry<>(this, cer.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cw()) && !this.gq()));
      this.bO.a(4, new bry<>(this, byl.class, 8.0F, 1.6, 1.4, $$0 -> !((byl)$$0).u() && !this.gq()));
      this.bO.a(4, new bry<>(this, bya.class, 8.0F, 1.6, 1.4, $$0 -> !this.gq()));
      this.bO.a(5, new bxs.u());
      this.bO.a(6, new bxs.o());
      this.bO.a(6, new bxs.s(1.25));
      this.bO.a(7, new bxs.l(1.2F, true));
      this.bO.a(7, new bxs.t());
      this.bO.a(8, new bxs.h(this, 1.25));
      this.bO.a(9, new bxs.q(32, 200));
      this.bO.a(10, new bxs.f(1.2F, 12, 1));
      this.bO.a(10, new bsx(this, 0.4F));
      this.bO.a(11, new bue(this, 1.0));
      this.bO.a(11, new bxs.p());
      this.bO.a(12, new bxs.j(this, cer.class, 24.0F));
      this.bO.a(13, new bxs.r());
      this.bP.a(3, new bxs.a(blv.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cw())));
   }

   @Override
   public arb d(cmh $$0) {
      return arc.iF;
   }

   @Override
   public void d_() {
      if (!this.dM().B && this.bx() && this.cY()) {
         this.cr++;
         cmh $$0 = this.c(blk.a);
         if (this.l($$0)) {
            if (this.cr > 600) {
               cmh $$1 = $$0.a(this.dM(), this);
               if (!$$1.b()) {
                  this.a(blk.a, $$1);
               }

               this.cr = 0;
            } else if (this.cr > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dM().a(this, (byte)45);
            }
         }

         blv $$2 = this.q();
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
         this.a(arc.iB, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eY() {
      return this.ew();
   }

   private boolean l(cmh $$0) {
      return $$0.d().u() && this.q() == null && this.aC() && !this.fD();
   }

   @Override
   protected void a(auf $$0, bjj $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cmh $$3;
         if ($$2 < 0.05F) {
            $$3 = new cmh(cmk.ow);
         } else if ($$2 < 0.2F) {
            $$3 = new cmh(cmk.qO);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cmh(cmk.uw) : new cmh(cmk.ux);
         } else if ($$2 < 0.6F) {
            $$3 = new cmh(cmk.pt);
         } else if ($$2 < 0.8F) {
            $$3 = new cmh(cmk.qA);
         } else {
            $$3 = new cmh(cmk.pq);
         }

         this.a(blk.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cmh $$1 = this.c(blk.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               elb $$3 = new elb(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dE() * (float) (Math.PI / 180.0))
                  .b(-this.dC() * (float) (Math.PI / 180.0));
               this.dM().a(new jr(jv.Q, $$1), this.dr() + this.bF().c / 2.0, this.dt(), this.dx() + this.bF().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bna.a u() {
      return blx.C().a(bnb.m, 0.3F).a(bnb.l, 10.0).a(bnb.g, 32.0).a(bnb.c, 2.0);
   }

   @Nullable
   public bxs b(amp $$0, bla $$1) {
      bxs $$2 = blj.O.a((csy)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.w() : ((bxs)$$1).w());
      }

      return $$2;
   }

   public static boolean c(blj<bxs> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return $$1.a_($$3.d()).a(arr.bW) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      ie<ctx> $$5 = $$0.s(this.dm());
      bxs.v $$6 = bxs.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof bxs.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new bxs.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof amp) {
         this.go();
      }

      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void go() {
      if (this.w() == bxs.v.a) {
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
   protected void a(cer $$0, bjk $$1, cmh $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return this.o_() ? $$1.b * 0.85F : 0.4F;
   }

   public bxs.v w() {
      return bxs.v.a(this.an.b(bX));
   }

   public void a(bxs.v $$0) {
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
   public void b(sj $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gp();
      sp $$2 = new sp();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(sy.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fD());
      $$0.a("Type", this.w().c());
      $$0.a("Sitting", this.A());
      $$0.a("Crouching", this.bX());
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);

      for (tg $$2 : $$0.c("Trusted", 11)) {
         this.b(sy.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(bxs.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dM() instanceof amp) {
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
   public boolean f(cmh $$0) {
      blk $$1 = blx.h($$0);
      return !this.c($$1).b() ? false : $$1 == blk.a && super.f($$0);
   }

   @Override
   public boolean j(cmh $$0) {
      cmc $$1 = $$0.d();
      cmh $$2 = this.c(blk.a);
      return $$2.b() || this.cr > 0 && $$1.u() && !$$2.d().u();
   }

   private void n(cmh $$0) {
      if (!$$0.b() && !this.dM().B) {
         cbe $$1 = new cbe(this.dM(), this.dr() + this.bF().c, this.dt() + 1.0, this.dx() + this.bF().e, $$0);
         $$1.b(40);
         $$1.a(this);
         this.a(arc.iK, 1.0F, 1.0F);
         this.dM().b($$1);
      }
   }

   private void o(cmh $$0) {
      cbe $$1 = new cbe(this.dM(), this.dr(), this.dt(), this.dx(), $$0);
      this.dM().b($$1);
   }

   @Override
   protected void b(cbe $$0) {
      cmh $$1 = $$0.q();
      if (this.j($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(blk.a));
         this.a($$0);
         this.a(blk.a, $$1.a(1));
         this.e(blk.a);
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
         if ($$0 || this.q() != null || this.dM().Z()) {
            this.gr();
         }

         if ($$0 || this.fD()) {
            this.w(false);
         }

         if (this.ge() && this.dM().z.i() < 0.2F) {
            hv $$1 = this.dm();
            dip $$2 = this.dM().a_($$1);
            this.dM().c(2001, $$1, cvz.i($$2));
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
   public boolean m(cmh $$0) {
      return $$0.a(arz.X);
   }

   @Override
   protected void a(cer $$0, blx $$1) {
      ((bxs)$$1).b($$0.cw());
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
      return aty.i($$0, this.co, this.cn) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return aty.i($$0, this.cq, this.cp);
   }

   @Override
   public void h(@Nullable blv $$0) {
      if (this.gq() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return aty.f(($$0 - 5.0F) * $$1);
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
      arb $$0 = this.y();
      if ($$0 == arc.iH) {
         this.a($$0, 2.0F, this.eX());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected arb y() {
      if (this.fD()) {
         return arc.iI;
      } else {
         if (!this.dM().O() && this.ag.i() < 0.1F) {
            List<cer> $$0 = this.dM().a(cer.class, this.cH().c(16.0, 16.0, 16.0), bli.f);
            if ($$0.isEmpty()) {
               return arc.iH;
            }
         }

         return arc.iC;
      }
   }

   @Nullable
   @Override
   protected arb d(bkd $$0) {
      return arc.iG;
   }

   @Nullable
   @Override
   protected arb n_() {
      return arc.iE;
   }

   boolean c(UUID $$0) {
      return this.gp().contains($$0);
   }

   @Override
   protected void g(bkd $$0) {
      cmh $$1 = this.c(blk.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(blk.a, cmh.f);
      }

      super.g($$0);
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + -0.0625F * $$2, -0.25F * $$2);
   }

   public static boolean a(bxs $$0, blv $$1) {
      double $$2 = $$1.dx() - $$0.dx();
      double $$3 = $$1.dr() - $$0.dr();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dM().a_(hv.a($$0.dr() + $$8, $$0.dt() + (double)$$9, $$0.dx() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public elb cJ() {
      return new elb(0.0, (double)(0.55F * this.cI()), (double)(this.dg() * 0.4F));
   }

   class a extends buk<blv> {
      @Nullable
      private blv j;
      @Nullable
      private blv k;
      private int l;

      public a(Class<blv> $$0, boolean $$1, boolean $$2, @Nullable Predicate<blv> $$3) {
         super(bxs.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.eg().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : bxs.this.gp()) {
               if ($$0 != null && bxs.this.dM() instanceof amp && ((amp)bxs.this.dM()).a($$0) instanceof blv $$2) {
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

         bxs.this.a(arc.iB, 1.0F, 1.0F);
         bxs.this.B(true);
         bxs.this.gr();
         super.c();
      }
   }

   class b extends bsr {
      int a;

      public b() {
         this.a(EnumSet.of(bsr.a.b, bsr.a.c, bsr.a.a));
      }

      @Override
      public boolean a() {
         return bxs.this.ge();
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
         bxs.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<blv> {
      public boolean a(blv $$0) {
         if ($$0 instanceof bxs) {
            return false;
         } else if ($$0 instanceof bxn || $$0 instanceof byc || $$0 instanceof cbz) {
            return true;
         } else if ($$0 instanceof bmq) {
            return !((bmq)$$0).u();
         } else if (!($$0 instanceof cer) || !$$0.P_() && !((cer)$$0).f()) {
            return bxs.this.c($$0.cw()) ? false : !$$0.fD() && !$$0.bV();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bsr {
      private final bwj b = bwj.a().a(12.0).d().a(bxs.this.new c());

      protected boolean h() {
         hv $$0 = hv.a(bxs.this.dr(), bxs.this.cH().e, bxs.this.dx());
         return !bxs.this.dM().g($$0) && bxs.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !bxs.this.dM().a(blv.class, this.b, bxs.this, bxs.this.cH().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bsd {
      public e(double $$0) {
         super(bxs.this, $$0);
      }

      @Override
      public void c() {
         ((bxs)this.a).gs();
         ((bxs)this.c).gs();
         super.c();
      }

      @Override
      protected void g() {
         amp $$0 = (amp)this.b;
         bxs $$1 = (bxs)this.a.a($$0, (bla)this.c);
         if ($$1 != null) {
            amq $$2 = this.a.gh();
            amq $$3 = this.c.gh();
            amq $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cw());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cw());
            }

            if ($$4 != null) {
               $$4.a(arm.P);
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
            if (this.b.Y().b(csu.f)) {
               this.b.b(new bll(this.b, this.a.dr(), this.a.dt(), this.a.dx(), this.a.eg().a(7) + 1));
            }
         }
      }
   }

   public class f extends bte {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(bxs.this, $$1, $$2, $$3);
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
      protected boolean a(ctb $$0, hv $$1) {
         dip $$2 = $$0.a_($$1);
         return $$2.a(cwb.oi) && $$2.c(deb.c) >= 2 || cwv.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && bxs.this.ag.i() < 0.05F) {
            bxs.this.a(arc.iJ, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (bxs.this.dM().Y().b(csu.c)) {
            dip $$0 = bxs.this.dM().a_(this.e);
            if ($$0.a(cwb.oi)) {
               this.b($$0);
            } else if (cwv.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dip $$0) {
         cwv.a(bxs.this, $$0, bxs.this.dM(), this.e);
      }

      private void b(dip $$0) {
         int $$1 = $$0.c(deb.c);
         $$0.a(deb.c, Integer.valueOf(1));
         int $$2 = 1 + bxs.this.dM().z.a(2) + ($$1 == 3 ? 1 : 0);
         cmh $$3 = bxs.this.c(blk.a);
         if ($$3.b()) {
            bxs.this.a(blk.a, new cmh(cmk.wi));
            $$2--;
         }

         if ($$2 > 0) {
            cvz.a(bxs.this.dM(), this.e, new cmh(cmk.wi, $$2));
         }

         bxs.this.a(arc.yv, 1.0F, 1.0F);
         bxs.this.dM().a(this.e, $$0.a(deb.c, Integer.valueOf(1)), 2);
         bxs.this.dM().a(dmz.c, this.e, dmz.a.a(bxs.this));
      }

      @Override
      public boolean a() {
         return !bxs.this.fD() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         bxs.this.w(false);
         super.c();
      }
   }

   class g extends bsl {
      public g() {
         super(bxs.this);
      }

      @Override
      public void c() {
         super.c();
         bxs.this.gs();
      }

      @Override
      public boolean a() {
         return bxs.this.aZ() && bxs.this.b(arw.a) > 0.25 || bxs.this.bn();
      }
   }

   class h extends bsq {
      private final bxs e;

      public h(bxs $$0, double $$1) {
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

   public static class i extends bla.a {
      public final bxs.v a;

      public i(bxs.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bsz {
      public j(blx $$0, Class<? extends blv> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !bxs.this.ge() && !bxs.this.gn();
      }

      @Override
      public boolean b() {
         return super.b() && !bxs.this.ge() && !bxs.this.gn();
      }
   }

   public class k extends brt {
      public k() {
         super(bxs.this);
      }

      @Override
      public void a() {
         if (!bxs.this.fD()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bxs.this.gk() && !bxs.this.bX() && !bxs.this.gn() && !bxs.this.ge();
      }
   }

   class l extends btb {
      public l(double $$0, boolean $$1) {
         super(bxs.this, $$0, $$1);
      }

      @Override
      protected void a(blv $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bxs.this.a(arc.iD, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         bxs.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !bxs.this.A() && !bxs.this.fD() && !bxs.this.bX() && !bxs.this.ge() && super.a();
      }
   }

   class m extends bru {
      public m() {
         super(bxs.this);
      }

      @Override
      public void a() {
         if (bxs.this.gt()) {
            super.a();
         }
      }
   }

   class n extends btk {
      public n(double $$0) {
         super(bxs.this, $$0);
      }

      @Override
      public boolean h() {
         return !bxs.this.gq() && super.h();
      }
   }

   public class o extends bsv {
      @Override
      public boolean a() {
         if (!bxs.this.gm()) {
            return false;
         } else {
            blv $$0 = bxs.this.q();
            if ($$0 != null && $$0.bx()) {
               if ($$0.cF() != $$0.cE()) {
                  return false;
               } else {
                  boolean $$1 = bxs.a(bxs.this, $$0);
                  if (!$$1) {
                     bxs.this.N().a($$0, 0);
                     bxs.this.y(false);
                     bxs.this.z(false);
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
         blv $$0 = bxs.this.q();
         if ($$0 != null && $$0.bx()) {
            double $$1 = bxs.this.dp().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(bxs.this.dE()) < 15.0F) || !bxs.this.aC()) && !bxs.this.ge();
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
         bxs.this.r(true);
         bxs.this.x(true);
         bxs.this.z(false);
         blv $$0 = bxs.this.q();
         if ($$0 != null) {
            bxs.this.I().a($$0, 60.0F, 30.0F);
            elb $$1 = new elb($$0.dr() - bxs.this.dr(), $$0.dt() - bxs.this.dt(), $$0.dx() - bxs.this.dx()).d();
            bxs.this.g(bxs.this.dp().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         bxs.this.N().n();
      }

      @Override
      public void d() {
         bxs.this.y(false);
         bxs.this.cp = 0.0F;
         bxs.this.cq = 0.0F;
         bxs.this.z(false);
         bxs.this.x(false);
      }

      @Override
      public void e() {
         blv $$0 = bxs.this.q();
         if ($$0 != null) {
            bxs.this.I().a($$0, 60.0F, 30.0F);
         }

         if (!bxs.this.ge()) {
            elb $$1 = bxs.this.dp();
            if ($$1.d * $$1.d < 0.03F && bxs.this.dE() != 0.0F) {
               bxs.this.s(aty.j(0.2F, bxs.this.dE(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               bxs.this.s((float)$$3);
            }
         }

         if ($$0 != null && bxs.this.e((blf)$$0) <= 2.0F) {
            bxs.this.C($$0);
         } else if (bxs.this.dE() > 0.0F && bxs.this.aC() && (float)bxs.this.dp().d != 0.0F && bxs.this.dM().a_(bxs.this.dm()).a(cwb.dN)) {
            bxs.this.s(60.0F);
            bxs.this.h(null);
            bxs.this.A(true);
         }
      }
   }

   class p extends bsr {
      public p() {
         this.a(EnumSet.of(bsr.a.a));
      }

      @Override
      public boolean a() {
         if (!bxs.this.c(blk.a).b()) {
            return false;
         } else if (bxs.this.q() != null || bxs.this.eh() != null) {
            return false;
         } else if (!bxs.this.gt()) {
            return false;
         } else if (bxs.this.eg().a(b(10)) != 0) {
            return false;
         } else {
            List<cbe> $$0 = bxs.this.dM().a(cbe.class, bxs.this.cH().c(8.0, 8.0, 8.0), bxs.cf);
            return !$$0.isEmpty() && bxs.this.c(blk.a).b();
         }
      }

      @Override
      public void e() {
         List<cbe> $$0 = bxs.this.dM().a(cbe.class, bxs.this.cH().c(8.0, 8.0, 8.0), bxs.cf);
         cmh $$1 = bxs.this.c(blk.a);
         if ($$1.b() && !$$0.isEmpty()) {
            bxs.this.N().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cbe> $$0 = bxs.this.dM().a(cbe.class, bxs.this.cH().c(8.0, 8.0, 8.0), bxs.cf);
         if (!$$0.isEmpty()) {
            bxs.this.N().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends btx {
      public q(int $$0, int $$1) {
         super(bxs.this, $$1);
      }

      @Override
      public void c() {
         bxs.this.gs();
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
         return !bxs.this.fD() && !bxs.this.A() && !bxs.this.gq() && bxs.this.q() == null;
      }
   }

   class r extends bxs.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bsr.a.a, bsr.a.b));
      }

      @Override
      public boolean a() {
         return bxs.this.eh() == null
            && bxs.this.eg().i() < 0.02F
            && !bxs.this.fD()
            && bxs.this.q() == null
            && bxs.this.N().l()
            && !this.i()
            && !bxs.this.gk()
            && !bxs.this.bX();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + bxs.this.eg().a(3);
         bxs.this.w(true);
         bxs.this.N().n();
      }

      @Override
      public void d() {
         bxs.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         bxs.this.I().a(bxs.this.dr() + this.c, bxs.this.dv(), bxs.this.dx() + this.d, (float)bxs.this.ab(), (float)bxs.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * bxs.this.eg().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + bxs.this.eg().a(20));
      }
   }

   class s extends bsk {
      private int c = b(100);

      public s(double $$0) {
         super(bxs.this, $$0);
      }

      @Override
      public boolean a() {
         if (!bxs.this.fD() && this.a.q() == null) {
            if (bxs.this.dM().Z() && bxs.this.dM().g(this.a.dm())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               hv $$0 = this.a.dm();
               return bxs.this.dM().O() && bxs.this.dM().g($$0) && !((amp)bxs.this.dM()).b($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         bxs.this.gs();
         super.c();
      }
   }

   class t extends bxs.d {
      private static final int c = b(140);
      private int d = bxs.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(bsr.a.a, bsr.a.b, bsr.a.c));
      }

      @Override
      public boolean a() {
         return bxs.this.bk == 0.0F && bxs.this.bl == 0.0F && bxs.this.bm == 0.0F ? this.k() || bxs.this.fD() : false;
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
            return bxs.this.dM().O() && this.h() && !this.i() && !bxs.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = bxs.this.ag.a(c);
         bxs.this.gs();
      }

      @Override
      public void c() {
         bxs.this.w(false);
         bxs.this.y(false);
         bxs.this.z(false);
         bxs.this.r(false);
         bxs.this.C(true);
         bxs.this.N().n();
         bxs.this.K().a(bxs.this.dr(), bxs.this.dt(), bxs.this.dx(), 0.0);
      }
   }

   class u extends bsr {
      public u() {
         this.a(EnumSet.of(bsr.a.a, bsr.a.b));
      }

      @Override
      public boolean a() {
         if (bxs.this.fD()) {
            return false;
         } else {
            blv $$0 = bxs.this.q();
            return $$0 != null && $$0.bx() && bxs.ch.test($$0) && bxs.this.f($$0) > 36.0 && !bxs.this.bX() && !bxs.this.gn() && !bxs.this.bj;
         }
      }

      @Override
      public void c() {
         bxs.this.w(false);
         bxs.this.A(false);
      }

      @Override
      public void d() {
         blv $$0 = bxs.this.q();
         if ($$0 != null && bxs.a(bxs.this, $$0)) {
            bxs.this.z(true);
            bxs.this.y(true);
            bxs.this.N().n();
            bxs.this.I().a($$0, (float)bxs.this.ab(), (float)bxs.this.aa());
         } else {
            bxs.this.z(false);
            bxs.this.y(false);
         }
      }

      @Override
      public void e() {
         blv $$0 = bxs.this.q();
         if ($$0 != null) {
            bxs.this.I().a($$0, (float)bxs.this.ab(), (float)bxs.this.aa());
            if (bxs.this.f($$0) <= 36.0) {
               bxs.this.z(true);
               bxs.this.y(true);
               bxs.this.N().n();
            } else {
               bxs.this.N().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements aut {
      a(0, "red"),
      b(1, "snow");

      public static final aut.a<bxs.v> c = aut.a(bxs.v::values);
      private static final IntFunction<bxs.v> d = asq.a(bxs.v::a, values(), asq.a.a);
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

      public static bxs.v a(String $$0) {
         return c.a($$0, a);
      }

      public static bxs.v a(int $$0) {
         return d.apply($$0);
      }

      public static bxs.v a(ie<ctx> $$0) {
         return $$0.a(arq.ar) ? b : a;
      }
   }
}
