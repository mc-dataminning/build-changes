import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cah extends bzx implements bph<cah.v> {
   private static final aie<Integer> bX = aih.a(cah.class, aig.b);
   private static final aie<Byte> bY = aih.a(cah.class, aig.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final aie<Optional<UUID>> cd = aih.a(cah.class, aig.q);
   private static final aie<Optional<UUID>> ce = aih.a(cah.class, aig.q);
   static final Predicate<cdw> cf = $$0 -> !$$0.z() && $$0.bx();
   private static final Predicate<bnq> cg = $$0 -> !($$0 instanceof boi $$1) ? false : $$1.ek() != null && $$1.el() < $$1.ag + 600;
   static final Predicate<bnq> ch = $$0 -> $$0 instanceof cac || $$0 instanceof car;
   private static final Predicate<bnq> ci = $$0 -> !$$0.bV() && bnv.e.test($$0);
   private static final int cj = 600;
   private static final bnt ck = bnw.P.n().a(0.5F).b(0.2975F);
   private bvf cl;
   private bvf cm;
   private bvf cn;
   private float co;
   private float cp;
   float cq;
   float cr;
   private int cs;

   public cah(bnw<? extends cah> $$0, cvr $$1) {
      super($$0, $$1);
      this.bK = new cah.k();
      this.bL = new cah.m();
      this.a(ehh.p, 0.0F);
      this.a(ehh.q, 0.0F);
      this.s(true);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cd, Optional.empty());
      this.am.a(ce, Optional.empty());
      this.am.a(bX, 0);
      this.am.a(bY, (byte)0);
   }

   @Override
   protected void B() {
      this.cl = new bwy<>(this, bzx.class, 10, false, false, $$0 -> $$0 instanceof cac || $$0 instanceof car);
      this.cm = new bwy<>(this, cay.class, 10, false, false, cay.bU);
      this.cn = new bwy<>(this, bzu.class, 20, false, false, $$0 -> $$0 instanceof bzw);
      this.bO.a(0, new cah.g());
      this.bO.a(0, new buu(this, this.dM()));
      this.bO.a(1, new cah.b());
      this.bO.a(2, new cah.n(2.2));
      this.bO.a(3, new cah.e(1.0));
      this.bO.a(4, new bum<>(this, chl.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cw()) && !this.gs()));
      this.bO.a(4, new bum<>(this, cba.class, 8.0F, 1.6, 1.4, $$0 -> !((cba)$$0).u() && !this.gs()));
      this.bO.a(4, new bum<>(this, cap.class, 8.0F, 1.6, 1.4, $$0 -> !this.gs()));
      this.bO.a(5, new cah.u());
      this.bO.a(6, new cah.o());
      this.bO.a(6, new cah.s(1.25));
      this.bO.a(7, new cah.l(1.2F, true));
      this.bO.a(7, new cah.t());
      this.bO.a(8, new cah.h(this, 1.25));
      this.bO.a(9, new cah.q(32, 200));
      this.bO.a(10, new cah.f(1.2F, 12, 1));
      this.bO.a(10, new bvl(this, 0.4F));
      this.bO.a(11, new bws(this, 1.0));
      this.bO.a(11, new cah.p());
      this.bO.a(12, new cah.j(this, chl.class, 24.0F));
      this.bO.a(13, new cah.r());
      this.bP.a(3, new cah.a(boi.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cw())));
   }

   @Override
   public atk d(cpd $$0) {
      return atl.iV;
   }

   @Override
   public void d_() {
      if (!this.dM().B && this.bx() && this.cY()) {
         this.cs++;
         cpd $$0 = this.c(bnx.a);
         if (this.l($$0)) {
            if (this.cs > 600) {
               cpd $$1 = $$0.a(this.dM(), this);
               if (!$$1.b()) {
                  this.a(bnx.a, $$1);
               }

               this.cs = 0;
            } else if (this.cs > 560 && this.af.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dM().a(this, (byte)45);
            }
         }

         boi $$2 = this.q();
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
      if (this.gs() && this.af.i() < 0.05F) {
         this.a(atl.iR, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eY() {
      return this.ex();
   }

   private boolean l(cpd $$0) {
      return $$0.d().t() && this.q() == null && this.aC() && !this.fD();
   }

   @Override
   protected void a(awp $$0, blu $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cpd $$3;
         if ($$2 < 0.05F) {
            $$3 = new cpd(cpg.oy);
         } else if ($$2 < 0.2F) {
            $$3 = new cpd(cpg.qQ);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cpd(cpg.uz) : new cpd(cpg.uA);
         } else if ($$2 < 0.6F) {
            $$3 = new cpd(cpg.pv);
         } else if ($$2 < 0.8F) {
            $$3 = new cpd(cpg.qC);
         } else {
            $$3 = new cpd(cpg.ps);
         }

         this.a(bnx.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cpd $$1 = this.c(bnx.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               enz $$3 = new enz(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dE() * (float) (Math.PI / 180.0))
                  .b(-this.dC() * (float) (Math.PI / 180.0));
               this.dM().a(new jv(jz.Q, $$1), this.dr() + this.bF().c / 2.0, this.dt(), this.dx() + this.bF().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bpo.a u() {
      return bok.C().a(bpp.o, 0.3F).a(bpp.n, 10.0).a(bpp.i, 32.0).a(bpp.c, 2.0);
   }

   @Nullable
   public cah b(aow $$0, bnl $$1) {
      cah $$2 = bnw.P.a((cvr)$$0);
      if ($$2 != null) {
         $$2.a(this.af.h() ? this.w() : ((cah)$$1).w());
      }

      return $$2;
   }

   public static boolean c(bnw<cah> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return $$1.a_($$3.d()).a(aua.bX) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      ij<cwq> $$5 = $$0.t(this.dm());
      cah.v $$6 = cah.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof cah.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new cah.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof aow) {
         this.gq();
      }

      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void gq() {
      if (this.w() == cah.v.a) {
         this.bP.a(4, this.cl);
         this.bP.a(4, this.cm);
         this.bP.a(6, this.cn);
      } else {
         this.bP.a(4, this.cn);
         this.bP.a(6, this.cl);
         this.bP.a(6, this.cm);
      }
   }

   @Override
   protected void a(chl $$0, blv $$1, cpd $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bnt e(bot $$0) {
      return this.o_() ? ck : super.e($$0);
   }

   public cah.v w() {
      return cah.v.a(this.am.b(bX));
   }

   public void a(cah.v $$0) {
      this.am.b(bX, $$0.a());
   }

   List<UUID> gr() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.am.b(cd).orElse(null));
      $$0.add(this.am.b(ce).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.am.b(cd).isPresent()) {
         this.am.b(ce, Optional.ofNullable($$0));
      } else {
         this.am.b(cd, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gr();
      tc $$2 = new tc();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(tl.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fD());
      $$0.a("Type", this.w().c());
      $$0.a("Sitting", this.A());
      $$0.a("Crouching", this.bX());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);

      for (tt $$2 : $$0.c("Trusted", 11)) {
         this.b(tl.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(cah.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dM() instanceof aow) {
         this.gq();
      }
   }

   public boolean A() {
      return this.u(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gg() {
      return this.u(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gs() {
      return this.u(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fD() {
      return this.u(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.am.b(bY, (byte)(this.am.b(bY) | $$0));
      } else {
         this.am.b(bY, (byte)(this.am.b(bY) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.am.b(bY) & $$0) != 0;
   }

   @Override
   public boolean f(cpd $$0) {
      bnx $$1 = bok.h($$0);
      return !this.c($$1).b() ? false : $$1 == bnx.a && super.f($$0);
   }

   @Override
   public boolean j(cpd $$0) {
      coy $$1 = $$0.d();
      cpd $$2 = this.c(bnx.a);
      return $$2.b() || this.cs > 0 && $$1.t() && !$$2.d().t();
   }

   private void n(cpd $$0) {
      if (!$$0.b() && !this.dM().B) {
         cdw $$1 = new cdw(this.dM(), this.dr() + this.bF().c, this.dt() + 1.0, this.dx() + this.bF().e, $$0);
         $$1.b(40);
         $$1.a(this);
         this.a(atl.ja, 1.0F, 1.0F);
         this.dM().b($$1);
      }
   }

   private void o(cpd $$0) {
      cdw $$1 = new cdw(this.dM(), this.dr(), this.dt(), this.dx(), $$0);
      this.dM().b($$1);
   }

   @Override
   protected void b(cdw $$0) {
      cpd $$1 = $$0.q();
      if (this.j($$1)) {
         int $$2 = $$1.M();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(bnx.a));
         this.a($$0);
         this.a(bnx.a, $$1.a(1));
         this.e(bnx.a);
         this.a($$0, $$1.M());
         $$0.am();
         this.cs = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.cY()) {
         boolean $$0 = this.aZ();
         if ($$0 || this.q() != null || this.dM().aa()) {
            this.gt();
         }

         if ($$0 || this.fD()) {
            this.w(false);
         }

         if (this.gg() && this.dM().z.i() < 0.2F) {
            hz $$1 = this.dm();
            dlj $$2 = this.dM().a_($$1);
            this.dM().c(2001, $$1, cys.i($$2));
         }
      }

      this.cp = this.co;
      if (this.gp()) {
         this.co = this.co + (1.0F - this.co) * 0.4F;
      } else {
         this.co = this.co + (0.0F - this.co) * 0.4F;
      }

      this.cr = this.cq;
      if (this.bX()) {
         this.cq += 0.2F;
         if (this.cq > 3.0F) {
            this.cq = 3.0F;
         }
      } else {
         this.cq = 0.0F;
      }
   }

   @Override
   public boolean m(cpd $$0) {
      return $$0.a(aui.X);
   }

   @Override
   protected void a(chl $$0, bok $$1) {
      ((cah)$$1).b($$0.cw());
   }

   public boolean gm() {
      return this.u(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gn() {
      return this.bj;
   }

   public boolean go() {
      return this.cq == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean bX() {
      return this.u(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gp() {
      return this.u(8);
   }

   public float E(float $$0) {
      return awi.i($$0, this.cp, this.co) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return awi.i($$0, this.cr, this.cq);
   }

   @Override
   public void h(@Nullable boi $$0) {
      if (this.gs() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return awi.f(($$0 - 5.0F) * $$1);
   }

   void gt() {
      this.C(false);
   }

   void gu() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gv() {
      return !this.fD() && !this.A() && !this.gg();
   }

   @Override
   public void R() {
      atk $$0 = this.y();
      if ($$0 == atl.iX) {
         this.a($$0, 2.0F, this.eX());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected atk y() {
      if (this.fD()) {
         return atl.iY;
      } else {
         if (!this.dM().P() && this.af.i() < 0.1F) {
            List<chl> $$0 = this.dM().a(chl.class, this.cH().c(16.0, 16.0, 16.0), bnv.f);
            if ($$0.isEmpty()) {
               return atl.iX;
            }
         }

         return atl.iS;
      }
   }

   @Nullable
   @Override
   protected atk d(bmp $$0) {
      return atl.iW;
   }

   @Nullable
   @Override
   protected atk n_() {
      return atl.iU;
   }

   boolean c(UUID $$0) {
      return this.gr().contains($$0);
   }

   @Override
   protected void g(bmp $$0) {
      cpd $$1 = this.c(bnx.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bnx.a, cpd.h);
      }

      super.g($$0);
   }

   public static boolean a(cah $$0, boi $$1) {
      double $$2 = $$1.dx() - $$0.dx();
      double $$3 = $$1.dr() - $$0.dr();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dM().a_(hz.a($$0.dr() + $$8, $$0.dt() + (double)$$9, $$0.dx() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public enz cJ() {
      return new enz(0.0, (double)(0.55F * this.cI()), (double)(this.dg() * 0.4F));
   }

   class a extends bwy<boi> {
      @Nullable
      private boi j;
      @Nullable
      private boi k;
      private int l;

      public a(Class<boi> $$0, boolean $$1, boolean $$2, @Nullable Predicate<boi> $$3) {
         super(cah.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.eh().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cah.this.gr()) {
               if ($$0 != null && cah.this.dM() instanceof aow && ((aow)cah.this.dM()).a($$0) instanceof boi $$2) {
                  this.k = $$2;
                  this.j = $$2.ei();
                  int $$3 = $$2.ej();
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
            this.l = this.k.ej();
         }

         cah.this.a(atl.iR, 1.0F, 1.0F);
         cah.this.B(true);
         cah.this.gt();
         super.c();
      }
   }

   class b extends bvf {
      int a;

      public b() {
         this.a(EnumSet.of(bvf.a.b, bvf.a.c, bvf.a.a));
      }

      @Override
      public boolean a() {
         return cah.this.gg();
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
         cah.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<boi> {
      public boolean a(boi $$0) {
         if ($$0 instanceof cah) {
            return false;
         } else if ($$0 instanceof cac || $$0 instanceof car || $$0 instanceof cer) {
            return true;
         } else if ($$0 instanceof bpe) {
            return !((bpe)$$0).u();
         } else if (!($$0 instanceof chl) || !$$0.P_() && !((chl)$$0).f()) {
            return cah.this.c($$0.cw()) ? false : !$$0.fD() && !$$0.bV();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bvf {
      private final byy b = byy.a().a(12.0).d().a(cah.this.new c());

      protected boolean h() {
         hz $$0 = hz.a(cah.this.dr(), cah.this.cH().e, cah.this.dx());
         return !cah.this.dM().h($$0) && cah.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cah.this.dM().a(boi.class, this.b, cah.this, cah.this.cH().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bur {
      public e(double $$0) {
         super(cah.this, $$0);
      }

      @Override
      public void c() {
         ((cah)this.a).gu();
         ((cah)this.c).gu();
         super.c();
      }

      @Override
      protected void g() {
         aow $$0 = (aow)this.b;
         cah $$1 = (cah)this.a.a($$0, (bnl)this.c);
         if ($$1 != null) {
            aox $$2 = this.a.gj();
            aox $$3 = this.c.gj();
            aox $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cw());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cw());
            }

            if ($$4 != null) {
               $$4.a(atv.P);
               am.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gl();
            this.c.gl();
            $$1.c_(-24000);
            $$1.b(this.a.dr(), this.a.dt(), this.a.dx(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.Z().b(cvn.f)) {
               this.b.b(new bny(this.b, this.a.dr(), this.a.dt(), this.a.dx(), this.a.eh().a(7) + 1));
            }
         }
      }
   }

   public class f extends bvs {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(cah.this, $$1, $$2, $$3);
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
      protected boolean a(cvu $$0, hz $$1) {
         dlj $$2 = $$0.a_($$1);
         return $$2.a(cyu.oi) && $$2.c(dgu.c) >= 2 || czo.i_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cah.this.af.i() < 0.05F) {
            cah.this.a(atl.iZ, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (cah.this.dM().Z().b(cvn.c)) {
            dlj $$0 = cah.this.dM().a_(this.e);
            if ($$0.a(cyu.oi)) {
               this.b($$0);
            } else if (czo.i_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dlj $$0) {
         czo.a(cah.this, $$0, cah.this.dM(), this.e);
      }

      private void b(dlj $$0) {
         int $$1 = $$0.c(dgu.c);
         $$0.a(dgu.c, Integer.valueOf(1));
         int $$2 = 1 + cah.this.dM().z.a(2) + ($$1 == 3 ? 1 : 0);
         cpd $$3 = cah.this.c(bnx.a);
         if ($$3.b()) {
            cah.this.a(bnx.a, new cpd(cpg.wl));
            $$2--;
         }

         if ($$2 > 0) {
            cys.a(cah.this.dM(), this.e, new cpd(cpg.wl, $$2));
         }

         cah.this.a(atl.yL, 1.0F, 1.0F);
         cah.this.dM().a(this.e, $$0.a(dgu.c, Integer.valueOf(1)), 2);
         cah.this.dM().a(dpw.c, this.e, dpw.a.a(cah.this));
      }

      @Override
      public boolean a() {
         return !cah.this.fD() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         cah.this.w(false);
         super.c();
      }
   }

   class g extends buz {
      public g() {
         super(cah.this);
      }

      @Override
      public void c() {
         super.c();
         cah.this.gu();
      }

      @Override
      public boolean a() {
         return cah.this.aZ() && cah.this.b(auf.a) > 0.25 || cah.this.bn();
      }
   }

   class h extends bve {
      private final cah e;

      public h(cah $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gs() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gs() && super.b();
      }

      @Override
      public void c() {
         this.e.gu();
         super.c();
      }
   }

   public static class i extends bnl.a {
      public final cah.v a;

      public i(cah.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bvn {
      public j(bok $$0, Class<? extends boi> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !cah.this.gg() && !cah.this.gp();
      }

      @Override
      public boolean b() {
         return super.b() && !cah.this.gg() && !cah.this.gp();
      }
   }

   public class k extends buh {
      public k() {
         super(cah.this);
      }

      @Override
      public void a() {
         if (!cah.this.fD()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cah.this.gm() && !cah.this.bX() && !cah.this.gp() && !cah.this.gg();
      }
   }

   class l extends bvp {
      public l(double $$0, boolean $$1) {
         super(cah.this, $$0, $$1);
      }

      @Override
      protected void a(boi $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.B($$0);
            cah.this.a(atl.iT, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         cah.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !cah.this.A() && !cah.this.fD() && !cah.this.bX() && !cah.this.gg() && super.a();
      }
   }

   class m extends bui {
      public m() {
         super(cah.this);
      }

      @Override
      public void a() {
         if (cah.this.gv()) {
            super.a();
         }
      }
   }

   class n extends bvy {
      public n(double $$0) {
         super(cah.this, $$0);
      }

      @Override
      public boolean h() {
         return !cah.this.gs() && super.h();
      }
   }

   public class o extends bvj {
      @Override
      public boolean a() {
         if (!cah.this.go()) {
            return false;
         } else {
            boi $$0 = cah.this.q();
            if ($$0 != null && $$0.bx()) {
               if ($$0.cF() != $$0.cE()) {
                  return false;
               } else {
                  boolean $$1 = cah.a(cah.this, $$0);
                  if (!$$1) {
                     cah.this.N().a($$0, 0);
                     cah.this.y(false);
                     cah.this.z(false);
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
         boi $$0 = cah.this.q();
         if ($$0 != null && $$0.bx()) {
            double $$1 = cah.this.dp().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cah.this.dE()) < 15.0F) || !cah.this.aC()) && !cah.this.gg();
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
         cah.this.r(true);
         cah.this.x(true);
         cah.this.z(false);
         boi $$0 = cah.this.q();
         if ($$0 != null) {
            cah.this.I().a($$0, 60.0F, 30.0F);
            enz $$1 = new enz($$0.dr() - cah.this.dr(), $$0.dt() - cah.this.dt(), $$0.dx() - cah.this.dx()).d();
            cah.this.g(cah.this.dp().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cah.this.N().n();
      }

      @Override
      public void d() {
         cah.this.y(false);
         cah.this.cq = 0.0F;
         cah.this.cr = 0.0F;
         cah.this.z(false);
         cah.this.x(false);
      }

      @Override
      public void e() {
         boi $$0 = cah.this.q();
         if ($$0 != null) {
            cah.this.I().a($$0, 60.0F, 30.0F);
         }

         if (!cah.this.gg()) {
            enz $$1 = cah.this.dp();
            if ($$1.d * $$1.d < 0.03F && cah.this.dE() != 0.0F) {
               cah.this.s(awi.j(0.2F, cah.this.dE(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cah.this.s((float)$$3);
            }
         }

         if ($$0 != null && cah.this.e($$0) <= 2.0F) {
            cah.this.B($$0);
         } else if (cah.this.dE() > 0.0F && cah.this.aC() && (float)cah.this.dp().d != 0.0F && cah.this.dM().a_(cah.this.dm()).a(cyu.dN)) {
            cah.this.s(60.0F);
            cah.this.h(null);
            cah.this.A(true);
         }
      }
   }

   class p extends bvf {
      public p() {
         this.a(EnumSet.of(bvf.a.a));
      }

      @Override
      public boolean a() {
         if (!cah.this.c(bnx.a).b()) {
            return false;
         } else if (cah.this.q() != null || cah.this.ei() != null) {
            return false;
         } else if (!cah.this.gv()) {
            return false;
         } else if (cah.this.eh().a(b(10)) != 0) {
            return false;
         } else {
            List<cdw> $$0 = cah.this.dM().a(cdw.class, cah.this.cH().c(8.0, 8.0, 8.0), cah.cf);
            return !$$0.isEmpty() && cah.this.c(bnx.a).b();
         }
      }

      @Override
      public void e() {
         List<cdw> $$0 = cah.this.dM().a(cdw.class, cah.this.cH().c(8.0, 8.0, 8.0), cah.cf);
         cpd $$1 = cah.this.c(bnx.a);
         if ($$1.b() && !$$0.isEmpty()) {
            cah.this.N().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cdw> $$0 = cah.this.dM().a(cdw.class, cah.this.cH().c(8.0, 8.0, 8.0), cah.cf);
         if (!$$0.isEmpty()) {
            cah.this.N().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends bwl {
      public q(int $$0, int $$1) {
         super(cah.this, $$1);
      }

      @Override
      public void c() {
         cah.this.gu();
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
         return !cah.this.fD() && !cah.this.A() && !cah.this.gs() && cah.this.q() == null;
      }
   }

   class r extends cah.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bvf.a.a, bvf.a.b));
      }

      @Override
      public boolean a() {
         return cah.this.ei() == null
            && cah.this.eh().i() < 0.02F
            && !cah.this.fD()
            && cah.this.q() == null
            && cah.this.N().l()
            && !this.i()
            && !cah.this.gm()
            && !cah.this.bX();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + cah.this.eh().a(3);
         cah.this.w(true);
         cah.this.N().n();
      }

      @Override
      public void d() {
         cah.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cah.this.I().a(cah.this.dr() + this.c, cah.this.dv(), cah.this.dx() + this.d, (float)cah.this.fH(), (float)cah.this.ab());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cah.this.eh().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cah.this.eh().a(20));
      }
   }

   class s extends buy {
      private int c = b(100);

      public s(double $$0) {
         super(cah.this, $$0);
      }

      @Override
      public boolean a() {
         if (!cah.this.fD() && this.a.q() == null) {
            if (cah.this.dM().aa() && cah.this.dM().h(this.a.dm())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               hz $$0 = this.a.dm();
               return cah.this.dM().P() && cah.this.dM().h($$0) && !((aow)cah.this.dM()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         cah.this.gu();
         super.c();
      }
   }

   class t extends cah.d {
      private static final int c = b(140);
      private int d = cah.this.af.a(c);

      public t() {
         this.a(EnumSet.of(bvf.a.a, bvf.a.b, bvf.a.c));
      }

      @Override
      public boolean a() {
         return cah.this.bk == 0.0F && cah.this.bl == 0.0F && cah.this.bm == 0.0F ? this.k() || cah.this.fD() : false;
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
            return cah.this.dM().P() && this.h() && !this.i() && !cah.this.az;
         }
      }

      @Override
      public void d() {
         this.d = cah.this.af.a(c);
         cah.this.gu();
      }

      @Override
      public void c() {
         cah.this.w(false);
         cah.this.y(false);
         cah.this.z(false);
         cah.this.r(false);
         cah.this.C(true);
         cah.this.N().n();
         cah.this.K().a(cah.this.dr(), cah.this.dt(), cah.this.dx(), 0.0);
      }
   }

   class u extends bvf {
      public u() {
         this.a(EnumSet.of(bvf.a.a, bvf.a.b));
      }

      @Override
      public boolean a() {
         if (cah.this.fD()) {
            return false;
         } else {
            boi $$0 = cah.this.q();
            return $$0 != null && $$0.bx() && cah.ch.test($$0) && cah.this.f($$0) > 36.0 && !cah.this.bX() && !cah.this.gp() && !cah.this.bj;
         }
      }

      @Override
      public void c() {
         cah.this.w(false);
         cah.this.A(false);
      }

      @Override
      public void d() {
         boi $$0 = cah.this.q();
         if ($$0 != null && cah.a(cah.this, $$0)) {
            cah.this.z(true);
            cah.this.y(true);
            cah.this.N().n();
            cah.this.I().a($$0, (float)cah.this.fH(), (float)cah.this.ab());
         } else {
            cah.this.z(false);
            cah.this.y(false);
         }
      }

      @Override
      public void e() {
         boi $$0 = cah.this.q();
         if ($$0 != null) {
            cah.this.I().a($$0, (float)cah.this.fH(), (float)cah.this.ab());
            if (cah.this.f($$0) <= 36.0) {
               cah.this.z(true);
               cah.this.y(true);
               cah.this.N().n();
            } else {
               cah.this.N().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements axc {
      a(0, "red"),
      b(1, "snow");

      public static final axc.a<cah.v> c = axc.a(cah.v::values);
      private static final IntFunction<cah.v> d = ava.a(cah.v::a, values(), ava.a.a);
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

      public static cah.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cah.v a(int $$0) {
         return d.apply($$0);
      }

      public static cah.v a(ij<cwq> $$0) {
         return $$0.a(atz.ar) ? b : a;
      }
   }
}
