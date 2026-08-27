import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byh extends bxx implements bni<byh.v> {
   private static final agm<Integer> bX = agp.a(byh.class, ago.b);
   private static final agm<Byte> bY = agp.a(byh.class, ago.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final agm<Optional<UUID>> cd = agp.a(byh.class, ago.q);
   private static final agm<Optional<UUID>> ce = agp.a(byh.class, ago.q);
   static final Predicate<cbt> cf = $$0 -> !$$0.z() && $$0.bx();
   private static final Predicate<blu> cg = $$0 -> !($$0 instanceof bmk $$1) ? false : $$1.ej() != null && $$1.ek() < $$1.ah + 600;
   static final Predicate<blu> ch = $$0 -> $$0 instanceof byc || $$0 instanceof byr;
   private static final Predicate<blu> ci = $$0 -> !$$0.bV() && blx.e.test($$0);
   private static final int cj = 600;
   private btg ck;
   private btg cl;
   private btg cm;
   private float cn;
   private float co;
   float cp;
   float cq;
   private int cr;

   public byh(bly<? extends byh> $$0, cto $$1) {
      super($$0, $$1);
      this.bK = new byh.k();
      this.bL = new byh.m();
      this.a(efb.p, 0.0F);
      this.a(efb.q, 0.0F);
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
      this.ck = new buz<>(this, bxx.class, 10, false, false, $$0 -> $$0 instanceof byc || $$0 instanceof byr);
      this.cl = new buz<>(this, byy.class, 10, false, false, byy.bU);
      this.cm = new buz<>(this, bxu.class, 20, false, false, $$0 -> $$0 instanceof bxw);
      this.bO.a(0, new byh.g());
      this.bO.a(0, new bsv(this, this.dM()));
      this.bO.a(1, new byh.b());
      this.bO.a(2, new byh.n(2.2));
      this.bO.a(3, new byh.e(1.0));
      this.bO.a(4, new bsn<>(this, cfh.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cw()) && !this.gq()));
      this.bO.a(4, new bsn<>(this, bza.class, 8.0F, 1.6, 1.4, $$0 -> !((bza)$$0).u() && !this.gq()));
      this.bO.a(4, new bsn<>(this, byp.class, 8.0F, 1.6, 1.4, $$0 -> !this.gq()));
      this.bO.a(5, new byh.u());
      this.bO.a(6, new byh.o());
      this.bO.a(6, new byh.s(1.25));
      this.bO.a(7, new byh.l(1.2F, true));
      this.bO.a(7, new byh.t());
      this.bO.a(8, new byh.h(this, 1.25));
      this.bO.a(9, new byh.q(32, 200));
      this.bO.a(10, new byh.f(1.2F, 12, 1));
      this.bO.a(10, new btm(this, 0.4F));
      this.bO.a(11, new but(this, 1.0));
      this.bO.a(11, new byh.p());
      this.bO.a(12, new byh.j(this, cfh.class, 24.0F));
      this.bO.a(13, new byh.r());
      this.bP.a(3, new byh.a(bmk.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cw())));
   }

   @Override
   public arq d(cmx $$0) {
      return arr.iF;
   }

   @Override
   public void d_() {
      if (!this.dM().B && this.bx() && this.cY()) {
         this.cr++;
         cmx $$0 = this.c(blz.a);
         if (this.l($$0)) {
            if (this.cr > 600) {
               cmx $$1 = $$0.a(this.dM(), this);
               if (!$$1.b()) {
                  this.a(blz.a, $$1);
               }

               this.cr = 0;
            } else if (this.cr > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dM().a(this, (byte)45);
            }
         }

         bmk $$2 = this.q();
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
         this.a(arr.iB, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eY() {
      return this.ew();
   }

   private boolean l(cmx $$0) {
      return $$0.d().u() && this.q() == null && this.aC() && !this.fD();
   }

   @Override
   protected void a(auu $$0, bjy $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cmx $$3;
         if ($$2 < 0.05F) {
            $$3 = new cmx(cna.ow);
         } else if ($$2 < 0.2F) {
            $$3 = new cmx(cna.qO);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cmx(cna.uw) : new cmx(cna.ux);
         } else if ($$2 < 0.6F) {
            $$3 = new cmx(cna.pt);
         } else if ($$2 < 0.8F) {
            $$3 = new cmx(cna.qA);
         } else {
            $$3 = new cmx(cna.pq);
         }

         this.a(blz.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cmx $$1 = this.c(blz.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               els $$3 = new els(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dE() * (float) (Math.PI / 180.0))
                  .b(-this.dC() * (float) (Math.PI / 180.0));
               this.dM().a(new jt(jx.Q, $$1), this.dr() + this.bF().c / 2.0, this.dt(), this.dx() + this.bF().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bnp.a u() {
      return bmm.C().a(bnq.m, 0.3F).a(bnq.l, 10.0).a(bnq.g, 32.0).a(bnq.c, 2.0);
   }

   @Nullable
   public byh b(and $$0, blp $$1) {
      byh $$2 = bly.O.a((cto)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.w() : ((byh)$$1).w());
      }

      return $$2;
   }

   public static boolean c(bly<byh> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return $$1.a_($$3.d()).a(asg.bW) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      ih<cun> $$5 = $$0.t(this.dm());
      byh.v $$6 = byh.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof byh.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new byh.i($$6);
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
      if (this.w() == byh.v.a) {
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
   protected void a(cfh $$0, bjz $$1, cmx $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return this.o_() ? $$1.b * 0.85F : 0.4F;
   }

   public byh.v w() {
      return byh.v.a(this.an.b(bX));
   }

   public void a(byh.v $$0) {
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
      this.a(byh.v.a($$0.l("Type")));
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
   public boolean f(cmx $$0) {
      blz $$1 = bmm.h($$0);
      return !this.c($$1).b() ? false : $$1 == blz.a && super.f($$0);
   }

   @Override
   public boolean j(cmx $$0) {
      cms $$1 = $$0.d();
      cmx $$2 = this.c(blz.a);
      return $$2.b() || this.cr > 0 && $$1.u() && !$$2.d().u();
   }

   private void n(cmx $$0) {
      if (!$$0.b() && !this.dM().B) {
         cbt $$1 = new cbt(this.dM(), this.dr() + this.bF().c, this.dt() + 1.0, this.dx() + this.bF().e, $$0);
         $$1.b(40);
         $$1.a(this);
         this.a(arr.iK, 1.0F, 1.0F);
         this.dM().b($$1);
      }
   }

   private void o(cmx $$0) {
      cbt $$1 = new cbt(this.dM(), this.dr(), this.dt(), this.dx(), $$0);
      this.dM().b($$1);
   }

   @Override
   protected void b(cbt $$0) {
      cmx $$1 = $$0.q();
      if (this.j($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(blz.a));
         this.a($$0);
         this.a(blz.a, $$1.a(1));
         this.e(blz.a);
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
            djg $$2 = this.dM().a_($$1);
            this.dM().c(2001, $$1, cwp.i($$2));
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
   public boolean m(cmx $$0) {
      return $$0.a(aso.X);
   }

   @Override
   protected void a(cfh $$0, bmm $$1) {
      ((byh)$$1).b($$0.cw());
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
      return aun.i($$0, this.co, this.cn) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return aun.i($$0, this.cq, this.cp);
   }

   @Override
   public void h(@Nullable bmk $$0) {
      if (this.gq() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return aun.f(($$0 - 5.0F) * $$1);
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
      arq $$0 = this.y();
      if ($$0 == arr.iH) {
         this.a($$0, 2.0F, this.eX());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected arq y() {
      if (this.fD()) {
         return arr.iI;
      } else {
         if (!this.dM().P() && this.ag.i() < 0.1F) {
            List<cfh> $$0 = this.dM().a(cfh.class, this.cH().c(16.0, 16.0, 16.0), blx.f);
            if ($$0.isEmpty()) {
               return arr.iH;
            }
         }

         return arr.iC;
      }
   }

   @Nullable
   @Override
   protected arq d(bks $$0) {
      return arr.iG;
   }

   @Nullable
   @Override
   protected arq n_() {
      return arr.iE;
   }

   boolean c(UUID $$0) {
      return this.gp().contains($$0);
   }

   @Override
   protected void g(bks $$0) {
      cmx $$1 = this.c(blz.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(blz.a, cmx.f);
      }

      super.g($$0);
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + -0.0625F * $$2, -0.25F * $$2);
   }

   public static boolean a(byh $$0, bmk $$1) {
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
   public els cJ() {
      return new els(0.0, (double)(0.55F * this.cI()), (double)(this.dg() * 0.4F));
   }

   class a extends buz<bmk> {
      @Nullable
      private bmk j;
      @Nullable
      private bmk k;
      private int l;

      public a(Class<bmk> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bmk> $$3) {
         super(byh.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.eg().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : byh.this.gp()) {
               if ($$0 != null && byh.this.dM() instanceof and && ((and)byh.this.dM()).a($$0) instanceof bmk $$2) {
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

         byh.this.a(arr.iB, 1.0F, 1.0F);
         byh.this.B(true);
         byh.this.gr();
         super.c();
      }
   }

   class b extends btg {
      int a;

      public b() {
         this.a(EnumSet.of(btg.a.b, btg.a.c, btg.a.a));
      }

      @Override
      public boolean a() {
         return byh.this.ge();
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
         byh.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bmk> {
      public boolean a(bmk $$0) {
         if ($$0 instanceof byh) {
            return false;
         } else if ($$0 instanceof byc || $$0 instanceof byr || $$0 instanceof cco) {
            return true;
         } else if ($$0 instanceof bnf) {
            return !((bnf)$$0).u();
         } else if (!($$0 instanceof cfh) || !$$0.P_() && !((cfh)$$0).f()) {
            return byh.this.c($$0.cw()) ? false : !$$0.fD() && !$$0.bV();
         } else {
            return false;
         }
      }
   }

   abstract class d extends btg {
      private final bwy b = bwy.a().a(12.0).d().a(byh.this.new c());

      protected boolean h() {
         hx $$0 = hx.a(byh.this.dr(), byh.this.cH().e, byh.this.dx());
         return !byh.this.dM().h($$0) && byh.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !byh.this.dM().a(bmk.class, this.b, byh.this, byh.this.cH().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bss {
      public e(double $$0) {
         super(byh.this, $$0);
      }

      @Override
      public void c() {
         ((byh)this.a).gs();
         ((byh)this.c).gs();
         super.c();
      }

      @Override
      protected void g() {
         and $$0 = (and)this.b;
         byh $$1 = (byh)this.a.a($$0, (blp)this.c);
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
               $$4.a(asb.P);
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
            if (this.b.Z().b(ctk.f)) {
               this.b.b(new bma(this.b, this.a.dr(), this.a.dt(), this.a.dx(), this.a.eg().a(7) + 1));
            }
         }
      }
   }

   public class f extends btt {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(byh.this, $$1, $$2, $$3);
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
      protected boolean a(ctr $$0, hx $$1) {
         djg $$2 = $$0.a_($$1);
         return $$2.a(cwr.oi) && $$2.c(der.c) >= 2 || cxl.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && byh.this.ag.i() < 0.05F) {
            byh.this.a(arr.iJ, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (byh.this.dM().Z().b(ctk.c)) {
            djg $$0 = byh.this.dM().a_(this.e);
            if ($$0.a(cwr.oi)) {
               this.b($$0);
            } else if (cxl.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(djg $$0) {
         cxl.a(byh.this, $$0, byh.this.dM(), this.e);
      }

      private void b(djg $$0) {
         int $$1 = $$0.c(der.c);
         $$0.a(der.c, Integer.valueOf(1));
         int $$2 = 1 + byh.this.dM().z.a(2) + ($$1 == 3 ? 1 : 0);
         cmx $$3 = byh.this.c(blz.a);
         if ($$3.b()) {
            byh.this.a(blz.a, new cmx(cna.wi));
            $$2--;
         }

         if ($$2 > 0) {
            cwp.a(byh.this.dM(), this.e, new cmx(cna.wi, $$2));
         }

         byh.this.a(arr.yv, 1.0F, 1.0F);
         byh.this.dM().a(this.e, $$0.a(der.c, Integer.valueOf(1)), 2);
         byh.this.dM().a(dnq.c, this.e, dnq.a.a(byh.this));
      }

      @Override
      public boolean a() {
         return !byh.this.fD() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         byh.this.w(false);
         super.c();
      }
   }

   class g extends bta {
      public g() {
         super(byh.this);
      }

      @Override
      public void c() {
         super.c();
         byh.this.gs();
      }

      @Override
      public boolean a() {
         return byh.this.aZ() && byh.this.b(asl.a) > 0.25 || byh.this.bn();
      }
   }

   class h extends btf {
      private final byh e;

      public h(byh $$0, double $$1) {
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

   public static class i extends blp.a {
      public final byh.v a;

      public i(byh.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bto {
      public j(bmm $$0, Class<? extends bmk> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !byh.this.ge() && !byh.this.gn();
      }

      @Override
      public boolean b() {
         return super.b() && !byh.this.ge() && !byh.this.gn();
      }
   }

   public class k extends bsi {
      public k() {
         super(byh.this);
      }

      @Override
      public void a() {
         if (!byh.this.fD()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !byh.this.gk() && !byh.this.bX() && !byh.this.gn() && !byh.this.ge();
      }
   }

   class l extends btq {
      public l(double $$0, boolean $$1) {
         super(byh.this, $$0, $$1);
      }

      @Override
      protected void a(bmk $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            byh.this.a(arr.iD, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         byh.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !byh.this.A() && !byh.this.fD() && !byh.this.bX() && !byh.this.ge() && super.a();
      }
   }

   class m extends bsj {
      public m() {
         super(byh.this);
      }

      @Override
      public void a() {
         if (byh.this.gt()) {
            super.a();
         }
      }
   }

   class n extends btz {
      public n(double $$0) {
         super(byh.this, $$0);
      }

      @Override
      public boolean h() {
         return !byh.this.gq() && super.h();
      }
   }

   public class o extends btk {
      @Override
      public boolean a() {
         if (!byh.this.gm()) {
            return false;
         } else {
            bmk $$0 = byh.this.q();
            if ($$0 != null && $$0.bx()) {
               if ($$0.cF() != $$0.cE()) {
                  return false;
               } else {
                  boolean $$1 = byh.a(byh.this, $$0);
                  if (!$$1) {
                     byh.this.N().a($$0, 0);
                     byh.this.y(false);
                     byh.this.z(false);
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
         bmk $$0 = byh.this.q();
         if ($$0 != null && $$0.bx()) {
            double $$1 = byh.this.dp().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(byh.this.dE()) < 15.0F) || !byh.this.aC()) && !byh.this.ge();
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
         byh.this.r(true);
         byh.this.x(true);
         byh.this.z(false);
         bmk $$0 = byh.this.q();
         if ($$0 != null) {
            byh.this.I().a($$0, 60.0F, 30.0F);
            els $$1 = new els($$0.dr() - byh.this.dr(), $$0.dt() - byh.this.dt(), $$0.dx() - byh.this.dx()).d();
            byh.this.g(byh.this.dp().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         byh.this.N().n();
      }

      @Override
      public void d() {
         byh.this.y(false);
         byh.this.cp = 0.0F;
         byh.this.cq = 0.0F;
         byh.this.z(false);
         byh.this.x(false);
      }

      @Override
      public void e() {
         bmk $$0 = byh.this.q();
         if ($$0 != null) {
            byh.this.I().a($$0, 60.0F, 30.0F);
         }

         if (!byh.this.ge()) {
            els $$1 = byh.this.dp();
            if ($$1.d * $$1.d < 0.03F && byh.this.dE() != 0.0F) {
               byh.this.s(aun.j(0.2F, byh.this.dE(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               byh.this.s((float)$$3);
            }
         }

         if ($$0 != null && byh.this.e((blu)$$0) <= 2.0F) {
            byh.this.C($$0);
         } else if (byh.this.dE() > 0.0F && byh.this.aC() && (float)byh.this.dp().d != 0.0F && byh.this.dM().a_(byh.this.dm()).a(cwr.dN)) {
            byh.this.s(60.0F);
            byh.this.h(null);
            byh.this.A(true);
         }
      }
   }

   class p extends btg {
      public p() {
         this.a(EnumSet.of(btg.a.a));
      }

      @Override
      public boolean a() {
         if (!byh.this.c(blz.a).b()) {
            return false;
         } else if (byh.this.q() != null || byh.this.eh() != null) {
            return false;
         } else if (!byh.this.gt()) {
            return false;
         } else if (byh.this.eg().a(b(10)) != 0) {
            return false;
         } else {
            List<cbt> $$0 = byh.this.dM().a(cbt.class, byh.this.cH().c(8.0, 8.0, 8.0), byh.cf);
            return !$$0.isEmpty() && byh.this.c(blz.a).b();
         }
      }

      @Override
      public void e() {
         List<cbt> $$0 = byh.this.dM().a(cbt.class, byh.this.cH().c(8.0, 8.0, 8.0), byh.cf);
         cmx $$1 = byh.this.c(blz.a);
         if ($$1.b() && !$$0.isEmpty()) {
            byh.this.N().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cbt> $$0 = byh.this.dM().a(cbt.class, byh.this.cH().c(8.0, 8.0, 8.0), byh.cf);
         if (!$$0.isEmpty()) {
            byh.this.N().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends bum {
      public q(int $$0, int $$1) {
         super(byh.this, $$1);
      }

      @Override
      public void c() {
         byh.this.gs();
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
         return !byh.this.fD() && !byh.this.A() && !byh.this.gq() && byh.this.q() == null;
      }
   }

   class r extends byh.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(btg.a.a, btg.a.b));
      }

      @Override
      public boolean a() {
         return byh.this.eh() == null
            && byh.this.eg().i() < 0.02F
            && !byh.this.fD()
            && byh.this.q() == null
            && byh.this.N().l()
            && !this.i()
            && !byh.this.gk()
            && !byh.this.bX();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + byh.this.eg().a(3);
         byh.this.w(true);
         byh.this.N().n();
      }

      @Override
      public void d() {
         byh.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         byh.this.I().a(byh.this.dr() + this.c, byh.this.dv(), byh.this.dx() + this.d, (float)byh.this.ab(), (float)byh.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * byh.this.eg().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + byh.this.eg().a(20));
      }
   }

   class s extends bsz {
      private int c = b(100);

      public s(double $$0) {
         super(byh.this, $$0);
      }

      @Override
      public boolean a() {
         if (!byh.this.fD() && this.a.q() == null) {
            if (byh.this.dM().aa() && byh.this.dM().h(this.a.dm())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               hx $$0 = this.a.dm();
               return byh.this.dM().P() && byh.this.dM().h($$0) && !((and)byh.this.dM()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         byh.this.gs();
         super.c();
      }
   }

   class t extends byh.d {
      private static final int c = b(140);
      private int d = byh.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(btg.a.a, btg.a.b, btg.a.c));
      }

      @Override
      public boolean a() {
         return byh.this.bk == 0.0F && byh.this.bl == 0.0F && byh.this.bm == 0.0F ? this.k() || byh.this.fD() : false;
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
            return byh.this.dM().P() && this.h() && !this.i() && !byh.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = byh.this.ag.a(c);
         byh.this.gs();
      }

      @Override
      public void c() {
         byh.this.w(false);
         byh.this.y(false);
         byh.this.z(false);
         byh.this.r(false);
         byh.this.C(true);
         byh.this.N().n();
         byh.this.K().a(byh.this.dr(), byh.this.dt(), byh.this.dx(), 0.0);
      }
   }

   class u extends btg {
      public u() {
         this.a(EnumSet.of(btg.a.a, btg.a.b));
      }

      @Override
      public boolean a() {
         if (byh.this.fD()) {
            return false;
         } else {
            bmk $$0 = byh.this.q();
            return $$0 != null && $$0.bx() && byh.ch.test($$0) && byh.this.f($$0) > 36.0 && !byh.this.bX() && !byh.this.gn() && !byh.this.bj;
         }
      }

      @Override
      public void c() {
         byh.this.w(false);
         byh.this.A(false);
      }

      @Override
      public void d() {
         bmk $$0 = byh.this.q();
         if ($$0 != null && byh.a(byh.this, $$0)) {
            byh.this.z(true);
            byh.this.y(true);
            byh.this.N().n();
            byh.this.I().a($$0, (float)byh.this.ab(), (float)byh.this.aa());
         } else {
            byh.this.z(false);
            byh.this.y(false);
         }
      }

      @Override
      public void e() {
         bmk $$0 = byh.this.q();
         if ($$0 != null) {
            byh.this.I().a($$0, (float)byh.this.ab(), (float)byh.this.aa());
            if (byh.this.f($$0) <= 36.0) {
               byh.this.z(true);
               byh.this.y(true);
               byh.this.N().n();
            } else {
               byh.this.N().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements avj {
      a(0, "red"),
      b(1, "snow");

      public static final avj.a<byh.v> c = avj.a(byh.v::values);
      private static final IntFunction<byh.v> d = atf.a(byh.v::a, values(), atf.a.a);
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

      public static byh.v a(String $$0) {
         return c.a($$0, a);
      }

      public static byh.v a(int $$0) {
         return d.apply($$0);
      }

      public static byh.v a(ih<cun> $$0) {
         return $$0.a(asf.ar) ? b : a;
      }
   }
}
