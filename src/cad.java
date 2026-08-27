import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cad extends bzt implements bpd<cad.v> {
   private static final aie<Integer> bX = aih.a(cad.class, aig.b);
   private static final aie<Byte> bY = aih.a(cad.class, aig.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final aie<Optional<UUID>> cd = aih.a(cad.class, aig.q);
   private static final aie<Optional<UUID>> ce = aih.a(cad.class, aig.q);
   static final Predicate<cds> cf = $$0 -> !$$0.z() && $$0.bx();
   private static final Predicate<bno> cg = $$0 -> !($$0 instanceof bog $$1) ? false : $$1.ek() != null && $$1.el() < $$1.ag + 600;
   static final Predicate<bno> ch = $$0 -> $$0 instanceof bzy || $$0 instanceof can;
   private static final Predicate<bno> ci = $$0 -> !$$0.bV() && bnt.e.test($$0);
   private static final int cj = 600;
   private static final bnr ck = bnu.P.n().a(0.5F).b(0.2975F);
   private bvb cl;
   private bvb cm;
   private bvb cn;
   private float co;
   private float cp;
   float cq;
   float cr;
   private int cs;

   public cad(bnu<? extends cad> $$0, cvn $$1) {
      super($$0, $$1);
      this.bK = new cad.k();
      this.bL = new cad.m();
      this.a(eha.p, 0.0F);
      this.a(eha.q, 0.0F);
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
      this.cl = new bwu<>(this, bzt.class, 10, false, false, $$0 -> $$0 instanceof bzy || $$0 instanceof can);
      this.cm = new bwu<>(this, cau.class, 10, false, false, cau.bU);
      this.cn = new bwu<>(this, bzq.class, 20, false, false, $$0 -> $$0 instanceof bzs);
      this.bO.a(0, new cad.g());
      this.bO.a(0, new buq(this, this.dM()));
      this.bO.a(1, new cad.b());
      this.bO.a(2, new cad.n(2.2));
      this.bO.a(3, new cad.e(1.0));
      this.bO.a(4, new bui<>(this, chh.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cw()) && !this.gs()));
      this.bO.a(4, new bui<>(this, caw.class, 8.0F, 1.6, 1.4, $$0 -> !((caw)$$0).u() && !this.gs()));
      this.bO.a(4, new bui<>(this, cal.class, 8.0F, 1.6, 1.4, $$0 -> !this.gs()));
      this.bO.a(5, new cad.u());
      this.bO.a(6, new cad.o());
      this.bO.a(6, new cad.s(1.25));
      this.bO.a(7, new cad.l(1.2F, true));
      this.bO.a(7, new cad.t());
      this.bO.a(8, new cad.h(this, 1.25));
      this.bO.a(9, new cad.q(32, 200));
      this.bO.a(10, new cad.f(1.2F, 12, 1));
      this.bO.a(10, new bvh(this, 0.4F));
      this.bO.a(11, new bwo(this, 1.0));
      this.bO.a(11, new cad.p());
      this.bO.a(12, new cad.j(this, chh.class, 24.0F));
      this.bO.a(13, new cad.r());
      this.bP.a(3, new cad.a(bog.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cw())));
   }

   @Override
   public atj d(coz $$0) {
      return atk.iU;
   }

   @Override
   public void d_() {
      if (!this.dM().B && this.bx() && this.cY()) {
         this.cs++;
         coz $$0 = this.c(bnv.a);
         if (this.l($$0)) {
            if (this.cs > 600) {
               coz $$1 = $$0.a(this.dM(), this);
               if (!$$1.b()) {
                  this.a(bnv.a, $$1);
               }

               this.cs = 0;
            } else if (this.cs > 560 && this.af.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dM().a(this, (byte)45);
            }
         }

         bog $$2 = this.q();
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
         this.a(atk.iQ, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eY() {
      return this.ex();
   }

   private boolean l(coz $$0) {
      return $$0.d().t() && this.q() == null && this.aC() && !this.fD();
   }

   @Override
   protected void a(awo $$0, bls $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         coz $$3;
         if ($$2 < 0.05F) {
            $$3 = new coz(cpc.oy);
         } else if ($$2 < 0.2F) {
            $$3 = new coz(cpc.qQ);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new coz(cpc.uz) : new coz(cpc.uA);
         } else if ($$2 < 0.6F) {
            $$3 = new coz(cpc.pv);
         } else if ($$2 < 0.8F) {
            $$3 = new coz(cpc.qC);
         } else {
            $$3 = new coz(cpc.ps);
         }

         this.a(bnv.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         coz $$1 = this.c(bnv.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ens $$3 = new ens(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dE() * (float) (Math.PI / 180.0))
                  .b(-this.dC() * (float) (Math.PI / 180.0));
               this.dM().a(new jv(jz.Q, $$1), this.dr() + this.bF().c / 2.0, this.dt(), this.dx() + this.bF().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bpk.a u() {
      return boi.C().a(bpl.o, 0.3F).a(bpl.n, 10.0).a(bpl.i, 32.0).a(bpl.c, 2.0);
   }

   @Nullable
   public cad b(aov $$0, bnj $$1) {
      cad $$2 = bnu.P.a((cvn)$$0);
      if ($$2 != null) {
         $$2.a(this.af.h() ? this.w() : ((cad)$$1).w());
      }

      return $$2;
   }

   public static boolean c(bnu<cad> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return $$1.a_($$3.d()).a(atz.bX) && a($$1, $$3);
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      ij<cwm> $$5 = $$0.t(this.dm());
      cad.v $$6 = cad.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof cad.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new cad.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof aov) {
         this.gq();
      }

      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void gq() {
      if (this.w() == cad.v.a) {
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
   protected void a(chh $$0, blt $$1, coz $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bnr e(bor $$0) {
      return this.o_() ? ck : super.e($$0);
   }

   public cad.v w() {
      return cad.v.a(this.am.b(bX));
   }

   public void a(cad.v $$0) {
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
      this.a(cad.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dM() instanceof aov) {
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
   public boolean f(coz $$0) {
      bnv $$1 = boi.h($$0);
      return !this.c($$1).b() ? false : $$1 == bnv.a && super.f($$0);
   }

   @Override
   public boolean j(coz $$0) {
      cou $$1 = $$0.d();
      coz $$2 = this.c(bnv.a);
      return $$2.b() || this.cs > 0 && $$1.t() && !$$2.d().t();
   }

   private void n(coz $$0) {
      if (!$$0.b() && !this.dM().B) {
         cds $$1 = new cds(this.dM(), this.dr() + this.bF().c, this.dt() + 1.0, this.dx() + this.bF().e, $$0);
         $$1.b(40);
         $$1.a(this);
         this.a(atk.iZ, 1.0F, 1.0F);
         this.dM().b($$1);
      }
   }

   private void o(coz $$0) {
      cds $$1 = new cds(this.dM(), this.dr(), this.dt(), this.dx(), $$0);
      this.dM().b($$1);
   }

   @Override
   protected void b(cds $$0) {
      coz $$1 = $$0.q();
      if (this.j($$1)) {
         int $$2 = $$1.M();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(bnv.a));
         this.a($$0);
         this.a(bnv.a, $$1.a(1));
         this.e(bnv.a);
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
            dlf $$2 = this.dM().a_($$1);
            this.dM().c(2001, $$1, cyo.i($$2));
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
   public boolean m(coz $$0) {
      return $$0.a(auh.X);
   }

   @Override
   protected void a(chh $$0, boi $$1) {
      ((cad)$$1).b($$0.cw());
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
      return awh.i($$0, this.cp, this.co) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return awh.i($$0, this.cr, this.cq);
   }

   @Override
   public void h(@Nullable bog $$0) {
      if (this.gs() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return awh.f(($$0 - 5.0F) * $$1);
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
      atj $$0 = this.y();
      if ($$0 == atk.iW) {
         this.a($$0, 2.0F, this.eX());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected atj y() {
      if (this.fD()) {
         return atk.iX;
      } else {
         if (!this.dM().P() && this.af.i() < 0.1F) {
            List<chh> $$0 = this.dM().a(chh.class, this.cH().c(16.0, 16.0, 16.0), bnt.f);
            if ($$0.isEmpty()) {
               return atk.iW;
            }
         }

         return atk.iR;
      }
   }

   @Nullable
   @Override
   protected atj d(bmn $$0) {
      return atk.iV;
   }

   @Nullable
   @Override
   protected atj n_() {
      return atk.iT;
   }

   boolean c(UUID $$0) {
      return this.gr().contains($$0);
   }

   @Override
   protected void g(bmn $$0) {
      coz $$1 = this.c(bnv.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bnv.a, coz.h);
      }

      super.g($$0);
   }

   public static boolean a(cad $$0, bog $$1) {
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
   public ens cJ() {
      return new ens(0.0, (double)(0.55F * this.cI()), (double)(this.dg() * 0.4F));
   }

   class a extends bwu<bog> {
      @Nullable
      private bog j;
      @Nullable
      private bog k;
      private int l;

      public a(Class<bog> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bog> $$3) {
         super(cad.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.eh().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cad.this.gr()) {
               if ($$0 != null && cad.this.dM() instanceof aov && ((aov)cad.this.dM()).a($$0) instanceof bog $$2) {
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

         cad.this.a(atk.iQ, 1.0F, 1.0F);
         cad.this.B(true);
         cad.this.gt();
         super.c();
      }
   }

   class b extends bvb {
      int a;

      public b() {
         this.a(EnumSet.of(bvb.a.b, bvb.a.c, bvb.a.a));
      }

      @Override
      public boolean a() {
         return cad.this.gg();
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
         cad.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bog> {
      public boolean a(bog $$0) {
         if ($$0 instanceof cad) {
            return false;
         } else if ($$0 instanceof bzy || $$0 instanceof can || $$0 instanceof cen) {
            return true;
         } else if ($$0 instanceof bpa) {
            return !((bpa)$$0).u();
         } else if (!($$0 instanceof chh) || !$$0.P_() && !((chh)$$0).f()) {
            return cad.this.c($$0.cw()) ? false : !$$0.fD() && !$$0.bV();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bvb {
      private final byu b = byu.a().a(12.0).d().a(cad.this.new c());

      protected boolean h() {
         hz $$0 = hz.a(cad.this.dr(), cad.this.cH().e, cad.this.dx());
         return !cad.this.dM().h($$0) && cad.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cad.this.dM().a(bog.class, this.b, cad.this, cad.this.cH().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bun {
      public e(double $$0) {
         super(cad.this, $$0);
      }

      @Override
      public void c() {
         ((cad)this.a).gu();
         ((cad)this.c).gu();
         super.c();
      }

      @Override
      protected void g() {
         aov $$0 = (aov)this.b;
         cad $$1 = (cad)this.a.a($$0, (bnj)this.c);
         if ($$1 != null) {
            aow $$2 = this.a.gj();
            aow $$3 = this.c.gj();
            aow $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cw());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cw());
            }

            if ($$4 != null) {
               $$4.a(atu.P);
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
            if (this.b.Z().b(cvj.f)) {
               this.b.b(new bnw(this.b, this.a.dr(), this.a.dt(), this.a.dx(), this.a.eh().a(7) + 1));
            }
         }
      }
   }

   public class f extends bvo {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(cad.this, $$1, $$2, $$3);
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
      protected boolean a(cvq $$0, hz $$1) {
         dlf $$2 = $$0.a_($$1);
         return $$2.a(cyq.oi) && $$2.c(dgq.c) >= 2 || czk.i_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cad.this.af.i() < 0.05F) {
            cad.this.a(atk.iY, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (cad.this.dM().Z().b(cvj.c)) {
            dlf $$0 = cad.this.dM().a_(this.e);
            if ($$0.a(cyq.oi)) {
               this.b($$0);
            } else if (czk.i_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dlf $$0) {
         czk.a(cad.this, $$0, cad.this.dM(), this.e);
      }

      private void b(dlf $$0) {
         int $$1 = $$0.c(dgq.c);
         $$0.a(dgq.c, Integer.valueOf(1));
         int $$2 = 1 + cad.this.dM().z.a(2) + ($$1 == 3 ? 1 : 0);
         coz $$3 = cad.this.c(bnv.a);
         if ($$3.b()) {
            cad.this.a(bnv.a, new coz(cpc.wl));
            $$2--;
         }

         if ($$2 > 0) {
            cyo.a(cad.this.dM(), this.e, new coz(cpc.wl, $$2));
         }

         cad.this.a(atk.yK, 1.0F, 1.0F);
         cad.this.dM().a(this.e, $$0.a(dgq.c, Integer.valueOf(1)), 2);
         cad.this.dM().a(dpp.c, this.e, dpp.a.a(cad.this));
      }

      @Override
      public boolean a() {
         return !cad.this.fD() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         cad.this.w(false);
         super.c();
      }
   }

   class g extends buv {
      public g() {
         super(cad.this);
      }

      @Override
      public void c() {
         super.c();
         cad.this.gu();
      }

      @Override
      public boolean a() {
         return cad.this.aZ() && cad.this.b(aue.a) > 0.25 || cad.this.bn();
      }
   }

   class h extends bva {
      private final cad e;

      public h(cad $$0, double $$1) {
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

   public static class i extends bnj.a {
      public final cad.v a;

      public i(cad.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bvj {
      public j(boi $$0, Class<? extends bog> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !cad.this.gg() && !cad.this.gp();
      }

      @Override
      public boolean b() {
         return super.b() && !cad.this.gg() && !cad.this.gp();
      }
   }

   public class k extends bud {
      public k() {
         super(cad.this);
      }

      @Override
      public void a() {
         if (!cad.this.fD()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cad.this.gm() && !cad.this.bX() && !cad.this.gp() && !cad.this.gg();
      }
   }

   class l extends bvl {
      public l(double $$0, boolean $$1) {
         super(cad.this, $$0, $$1);
      }

      @Override
      protected void a(bog $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.B($$0);
            cad.this.a(atk.iS, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         cad.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !cad.this.A() && !cad.this.fD() && !cad.this.bX() && !cad.this.gg() && super.a();
      }
   }

   class m extends bue {
      public m() {
         super(cad.this);
      }

      @Override
      public void a() {
         if (cad.this.gv()) {
            super.a();
         }
      }
   }

   class n extends bvu {
      public n(double $$0) {
         super(cad.this, $$0);
      }

      @Override
      public boolean h() {
         return !cad.this.gs() && super.h();
      }
   }

   public class o extends bvf {
      @Override
      public boolean a() {
         if (!cad.this.go()) {
            return false;
         } else {
            bog $$0 = cad.this.q();
            if ($$0 != null && $$0.bx()) {
               if ($$0.cF() != $$0.cE()) {
                  return false;
               } else {
                  boolean $$1 = cad.a(cad.this, $$0);
                  if (!$$1) {
                     cad.this.N().a($$0, 0);
                     cad.this.y(false);
                     cad.this.z(false);
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
         bog $$0 = cad.this.q();
         if ($$0 != null && $$0.bx()) {
            double $$1 = cad.this.dp().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cad.this.dE()) < 15.0F) || !cad.this.aC()) && !cad.this.gg();
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
         cad.this.r(true);
         cad.this.x(true);
         cad.this.z(false);
         bog $$0 = cad.this.q();
         if ($$0 != null) {
            cad.this.I().a($$0, 60.0F, 30.0F);
            ens $$1 = new ens($$0.dr() - cad.this.dr(), $$0.dt() - cad.this.dt(), $$0.dx() - cad.this.dx()).d();
            cad.this.g(cad.this.dp().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cad.this.N().n();
      }

      @Override
      public void d() {
         cad.this.y(false);
         cad.this.cq = 0.0F;
         cad.this.cr = 0.0F;
         cad.this.z(false);
         cad.this.x(false);
      }

      @Override
      public void e() {
         bog $$0 = cad.this.q();
         if ($$0 != null) {
            cad.this.I().a($$0, 60.0F, 30.0F);
         }

         if (!cad.this.gg()) {
            ens $$1 = cad.this.dp();
            if ($$1.d * $$1.d < 0.03F && cad.this.dE() != 0.0F) {
               cad.this.s(awh.j(0.2F, cad.this.dE(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cad.this.s((float)$$3);
            }
         }

         if ($$0 != null && cad.this.e($$0) <= 2.0F) {
            cad.this.B($$0);
         } else if (cad.this.dE() > 0.0F && cad.this.aC() && (float)cad.this.dp().d != 0.0F && cad.this.dM().a_(cad.this.dm()).a(cyq.dN)) {
            cad.this.s(60.0F);
            cad.this.h(null);
            cad.this.A(true);
         }
      }
   }

   class p extends bvb {
      public p() {
         this.a(EnumSet.of(bvb.a.a));
      }

      @Override
      public boolean a() {
         if (!cad.this.c(bnv.a).b()) {
            return false;
         } else if (cad.this.q() != null || cad.this.ei() != null) {
            return false;
         } else if (!cad.this.gv()) {
            return false;
         } else if (cad.this.eh().a(b(10)) != 0) {
            return false;
         } else {
            List<cds> $$0 = cad.this.dM().a(cds.class, cad.this.cH().c(8.0, 8.0, 8.0), cad.cf);
            return !$$0.isEmpty() && cad.this.c(bnv.a).b();
         }
      }

      @Override
      public void e() {
         List<cds> $$0 = cad.this.dM().a(cds.class, cad.this.cH().c(8.0, 8.0, 8.0), cad.cf);
         coz $$1 = cad.this.c(bnv.a);
         if ($$1.b() && !$$0.isEmpty()) {
            cad.this.N().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cds> $$0 = cad.this.dM().a(cds.class, cad.this.cH().c(8.0, 8.0, 8.0), cad.cf);
         if (!$$0.isEmpty()) {
            cad.this.N().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends bwh {
      public q(int $$0, int $$1) {
         super(cad.this, $$1);
      }

      @Override
      public void c() {
         cad.this.gu();
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
         return !cad.this.fD() && !cad.this.A() && !cad.this.gs() && cad.this.q() == null;
      }
   }

   class r extends cad.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bvb.a.a, bvb.a.b));
      }

      @Override
      public boolean a() {
         return cad.this.ei() == null
            && cad.this.eh().i() < 0.02F
            && !cad.this.fD()
            && cad.this.q() == null
            && cad.this.N().l()
            && !this.i()
            && !cad.this.gm()
            && !cad.this.bX();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + cad.this.eh().a(3);
         cad.this.w(true);
         cad.this.N().n();
      }

      @Override
      public void d() {
         cad.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cad.this.I().a(cad.this.dr() + this.c, cad.this.dv(), cad.this.dx() + this.d, (float)cad.this.fH(), (float)cad.this.ab());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cad.this.eh().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cad.this.eh().a(20));
      }
   }

   class s extends buu {
      private int c = b(100);

      public s(double $$0) {
         super(cad.this, $$0);
      }

      @Override
      public boolean a() {
         if (!cad.this.fD() && this.a.q() == null) {
            if (cad.this.dM().aa() && cad.this.dM().h(this.a.dm())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               hz $$0 = this.a.dm();
               return cad.this.dM().P() && cad.this.dM().h($$0) && !((aov)cad.this.dM()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         cad.this.gu();
         super.c();
      }
   }

   class t extends cad.d {
      private static final int c = b(140);
      private int d = cad.this.af.a(c);

      public t() {
         this.a(EnumSet.of(bvb.a.a, bvb.a.b, bvb.a.c));
      }

      @Override
      public boolean a() {
         return cad.this.bk == 0.0F && cad.this.bl == 0.0F && cad.this.bm == 0.0F ? this.k() || cad.this.fD() : false;
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
            return cad.this.dM().P() && this.h() && !this.i() && !cad.this.az;
         }
      }

      @Override
      public void d() {
         this.d = cad.this.af.a(c);
         cad.this.gu();
      }

      @Override
      public void c() {
         cad.this.w(false);
         cad.this.y(false);
         cad.this.z(false);
         cad.this.r(false);
         cad.this.C(true);
         cad.this.N().n();
         cad.this.K().a(cad.this.dr(), cad.this.dt(), cad.this.dx(), 0.0);
      }
   }

   class u extends bvb {
      public u() {
         this.a(EnumSet.of(bvb.a.a, bvb.a.b));
      }

      @Override
      public boolean a() {
         if (cad.this.fD()) {
            return false;
         } else {
            bog $$0 = cad.this.q();
            return $$0 != null && $$0.bx() && cad.ch.test($$0) && cad.this.f($$0) > 36.0 && !cad.this.bX() && !cad.this.gp() && !cad.this.bj;
         }
      }

      @Override
      public void c() {
         cad.this.w(false);
         cad.this.A(false);
      }

      @Override
      public void d() {
         bog $$0 = cad.this.q();
         if ($$0 != null && cad.a(cad.this, $$0)) {
            cad.this.z(true);
            cad.this.y(true);
            cad.this.N().n();
            cad.this.I().a($$0, (float)cad.this.fH(), (float)cad.this.ab());
         } else {
            cad.this.z(false);
            cad.this.y(false);
         }
      }

      @Override
      public void e() {
         bog $$0 = cad.this.q();
         if ($$0 != null) {
            cad.this.I().a($$0, (float)cad.this.fH(), (float)cad.this.ab());
            if (cad.this.f($$0) <= 36.0) {
               cad.this.z(true);
               cad.this.y(true);
               cad.this.N().n();
            } else {
               cad.this.N().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements axc {
      a(0, "red"),
      b(1, "snow");

      public static final axc.a<cad.v> c = axc.a(cad.v::values);
      private static final IntFunction<cad.v> d = auz.a(cad.v::a, values(), auz.a.a);
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

      public static cad.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cad.v a(int $$0) {
         return d.apply($$0);
      }

      public static cad.v a(ij<cwm> $$0) {
         return $$0.a(aty.ar) ? b : a;
      }
   }
}
