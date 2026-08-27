import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class caw extends cam implements bpw<caw.v> {
   private static final aii<Integer> bZ = ail.a(caw.class, aik.b);
   private static final aii<Byte> ca = ail.a(caw.class, aik.a);
   private static final int cb = 1;
   public static final int bV = 4;
   public static final int bW = 8;
   public static final int bY = 16;
   private static final int cc = 32;
   private static final int cd = 64;
   private static final int ce = 128;
   private static final aii<Optional<UUID>> cf = ail.a(caw.class, aik.q);
   private static final aii<Optional<UUID>> cg = ail.a(caw.class, aik.q);
   static final Predicate<cel> ch = $$0 -> !$$0.z() && $$0.bx();
   private static final Predicate<bof> ci = $$0 -> !($$0 instanceof box $$1) ? false : $$1.ei() != null && $$1.ej() < $$1.ag + 600;
   static final Predicate<bof> cj = $$0 -> $$0 instanceof car || $$0 instanceof cbg;
   private static final Predicate<bof> ck = $$0 -> !$$0.bS() && bok.e.test($$0);
   private static final int cl = 600;
   private static final boi cm = bol.P.n().a(0.5F).b(0.2975F);
   private bvu cn;
   private bvu co;
   private bvu cp;
   private float cq;
   private float cr;
   float cs;
   float ct;
   private int cu;

   public caw(bol<? extends caw> $$0, cwe $$1) {
      super($$0, $$1);
      this.bL = new caw.k();
      this.bM = new caw.m();
      this.a(eic.p, 0.0F);
      this.a(eic.q, 0.0F);
      this.s(true);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cf, Optional.empty());
      this.am.a(cg, Optional.empty());
      this.am.a(bZ, 0);
      this.am.a(ca, (byte)0);
   }

   @Override
   protected void B() {
      this.cn = new bxn<>(this, cam.class, 10, false, false, $$0 -> $$0 instanceof car || $$0 instanceof cbg);
      this.co = new bxn<>(this, cbn.class, 10, false, false, cbn.bW);
      this.cp = new bxn<>(this, caj.class, 20, false, false, $$0 -> $$0 instanceof cal);
      this.bP.a(0, new caw.g());
      this.bP.a(0, new bvj(this, this.dJ()));
      this.bP.a(1, new caw.b());
      this.bP.a(2, new caw.n(2.2));
      this.bP.a(3, new caw.e(1.0));
      this.bP.a(4, new bvb<>(this, cia.class, 16.0F, 1.6, 1.4, $$0 -> ck.test($$0) && !this.c($$0.ct()) && !this.gx()));
      this.bP.a(4, new bvb<>(this, cbp.class, 8.0F, 1.6, 1.4, $$0 -> !((cbp)$$0).u() && !this.gx()));
      this.bP.a(4, new bvb<>(this, cbe.class, 8.0F, 1.6, 1.4, $$0 -> !this.gx()));
      this.bP.a(5, new caw.u());
      this.bP.a(6, new caw.o());
      this.bP.a(6, new caw.s(1.25));
      this.bP.a(7, new caw.l(1.2F, true));
      this.bP.a(7, new caw.t());
      this.bP.a(8, new caw.h(this, 1.25));
      this.bP.a(9, new caw.q(32, 200));
      this.bP.a(10, new caw.f(1.2F, 12, 1));
      this.bP.a(10, new bwa(this, 0.4F));
      this.bP.a(11, new bxh(this, 1.0));
      this.bP.a(11, new caw.p());
      this.bP.a(12, new caw.j(this, cia.class, 24.0F));
      this.bP.a(13, new caw.r());
      this.bQ.a(3, new caw.a(box.class, false, false, $$0 -> ci.test($$0) && !this.c($$0.ct())));
   }

   @Override
   public ato d(cpq $$0) {
      return atp.iV;
   }

   @Override
   public void d_() {
      if (!this.dJ().B && this.bx() && this.cV()) {
         this.cu++;
         cpq $$0 = this.c(bom.a);
         if (this.n($$0)) {
            if (this.cu > 600) {
               cpq $$1 = $$0.a(this.dJ(), this);
               if (!$$1.b()) {
                  this.a(bom.a, $$1);
               }

               this.cu = 0;
            } else if (this.cu > 560 && this.af.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dJ().a(this, (byte)45);
            }
         }

         box $$2 = this.q();
         if ($$2 == null || !$$2.bx()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fF() || this.fa()) {
         this.bk = false;
         this.bl = 0.0F;
         this.bn = 0.0F;
      }

      super.d_();
      if (this.gx() && this.af.i() < 0.05F) {
         this.a(atp.iR, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fa() {
      return this.ev();
   }

   private boolean n(cpq $$0) {
      return $$0.d().v() && this.q() == null && this.aC() && !this.fF();
   }

   @Override
   protected void a(awt $$0, bmj $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cpq $$3;
         if ($$2 < 0.05F) {
            $$3 = new cpq(cpt.oy);
         } else if ($$2 < 0.2F) {
            $$3 = new cpq(cpt.qQ);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cpq(cpt.uz) : new cpq(cpt.uA);
         } else if ($$2 < 0.6F) {
            $$3 = new cpq(cpt.pv);
         } else if ($$2 < 0.8F) {
            $$3 = new cpq(cpt.qC);
         } else {
            $$3 = new cpq(cpt.ps);
         }

         this.a(bom.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cpq $$1 = this.c(bom.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               eov $$3 = new eov(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dB() * (float) (Math.PI / 180.0))
                  .b(-this.dz() * (float) (Math.PI / 180.0));
               this.dJ().a(new jx(kb.Q, $$1), this.do() + this.bF().c / 2.0, this.dq(), this.du() + this.bF().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bqd.a u() {
      return boz.C().a(bqe.o, 0.3F).a(bqe.n, 10.0).a(bqe.i, 32.0).a(bqe.c, 2.0);
   }

   @Nullable
   public caw b(apa $$0, boa $$1) {
      caw $$2 = bol.P.a((cwe)$$0);
      if ($$2 != null) {
         $$2.a(this.af.h() ? this.w() : ((caw)$$1).w());
      }

      return $$2;
   }

   public static boolean c(bol<caw> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.a_($$3.d()).a(aue.bX) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      il<cxd> $$4 = $$0.t(this.dj());
      caw.v $$5 = caw.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof caw.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new caw.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof apa) {
         this.gv();
      }

      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gv() {
      if (this.w() == caw.v.a) {
         this.bQ.a(4, this.cn);
         this.bQ.a(4, this.co);
         this.bQ.a(6, this.cp);
      } else {
         this.bQ.a(4, this.cp);
         this.bQ.a(6, this.cn);
         this.bQ.a(6, this.co);
      }
   }

   @Override
   protected void a(cia $$0, bmk $$1, cpq $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public boi e(bpi $$0) {
      return this.o_() ? cm : super.e($$0);
   }

   public caw.v w() {
      return caw.v.a(this.am.b(bZ));
   }

   public void a(caw.v $$0) {
      this.am.b(bZ, $$0.a());
   }

   List<UUID> gw() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.am.b(cf).orElse(null));
      $$0.add(this.am.b(cg).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.am.b(cf).isPresent()) {
         this.am.b(cg, Optional.ofNullable($$0));
      } else {
         this.am.b(cf, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gw();
      te $$2 = new te();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(tn.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fF());
      $$0.a("Type", this.w().c());
      $$0.a("Sitting", this.A());
      $$0.a("Crouching", this.bU());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);

      for (tv $$2 : $$0.c("Trusted", 11)) {
         this.b(tn.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(caw.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dJ() instanceof apa) {
         this.gv();
      }
   }

   public boolean A() {
      return this.u(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gl() {
      return this.u(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gx() {
      return this.u(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fF() {
      return this.u(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.am.b(ca, (byte)(this.am.b(ca) | $$0));
      } else {
         this.am.b(ca, (byte)(this.am.b(ca) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.am.b(ca) & $$0) != 0;
   }

   @Override
   public boolean f(cpq $$0) {
      bom $$1 = boz.h($$0);
      return !this.c($$1).b() ? false : $$1 == bom.a && super.f($$0);
   }

   @Override
   public boolean j(cpq $$0) {
      cpl $$1 = $$0.d();
      cpq $$2 = this.c(bom.a);
      return $$2.b() || this.cu > 0 && $$1.v() && !$$2.d().v();
   }

   private void p(cpq $$0) {
      if (!$$0.b() && !this.dJ().B) {
         cel $$1 = new cel(this.dJ(), this.do() + this.bF().c, this.dq() + 1.0, this.du() + this.bF().e, $$0);
         $$1.b(40);
         $$1.a(this);
         this.a(atp.ja, 1.0F, 1.0F);
         this.dJ().b($$1);
      }
   }

   private void q(cpq $$0) {
      cel $$1 = new cel(this.dJ(), this.do(), this.dq(), this.du(), $$0);
      this.dJ().b($$1);
   }

   @Override
   protected void b(cel $$0) {
      cpq $$1 = $$0.q();
      if (this.j($$1)) {
         int $$2 = $$1.M();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.c(bom.a));
         this.a($$0);
         this.a(bom.a, $$1.a(1));
         this.e(bom.a);
         this.a($$0, $$1.M());
         $$0.am();
         this.cu = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.cV()) {
         boolean $$0 = this.aZ();
         if ($$0 || this.q() != null || this.dJ().aa()) {
            this.gy();
         }

         if ($$0 || this.fF()) {
            this.w(false);
         }

         if (this.gl() && this.dJ().z.i() < 0.2F) {
            ib $$1 = this.dj();
            dme $$2 = this.dJ().a_($$1);
            this.dJ().c(2001, $$1, czf.i($$2));
         }
      }

      this.cr = this.cq;
      if (this.gu()) {
         this.cq = this.cq + (1.0F - this.cq) * 0.4F;
      } else {
         this.cq = this.cq + (0.0F - this.cq) * 0.4F;
      }

      this.ct = this.cs;
      if (this.bU()) {
         this.cs += 0.2F;
         if (this.cs > 3.0F) {
            this.cs = 3.0F;
         }
      } else {
         this.cs = 0.0F;
      }
   }

   @Override
   public boolean o(cpq $$0) {
      return $$0.a(aum.X);
   }

   @Override
   protected void a(cia $$0, boz $$1) {
      ((caw)$$1).b($$0.ct());
   }

   public boolean gr() {
      return this.u(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gs() {
      return this.bk;
   }

   public boolean gt() {
      return this.cs == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean bU() {
      return this.u(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gu() {
      return this.u(8);
   }

   public float E(float $$0) {
      return awm.i($$0, this.cr, this.cq) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return awm.i($$0, this.ct, this.cs);
   }

   @Override
   public void h(@Nullable box $$0) {
      if (this.gx() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return awm.f(($$0 - 5.0F) * $$1);
   }

   void gy() {
      this.C(false);
   }

   void gz() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gA() {
      return !this.fF() && !this.A() && !this.gl();
   }

   @Override
   public void R() {
      ato $$0 = this.y();
      if ($$0 == atp.iX) {
         this.a($$0, 2.0F, this.eZ());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected ato y() {
      if (this.fF()) {
         return atp.iY;
      } else {
         if (!this.dJ().P() && this.af.i() < 0.1F) {
            List<cia> $$0 = this.dJ().a(cia.class, this.cE().c(16.0, 16.0, 16.0), bok.f);
            if ($$0.isEmpty()) {
               return atp.iX;
            }
         }

         return atp.iS;
      }
   }

   @Nullable
   @Override
   protected ato d(bne $$0) {
      return atp.iW;
   }

   @Nullable
   @Override
   protected ato n_() {
      return atp.iU;
   }

   boolean c(UUID $$0) {
      return this.gw().contains($$0);
   }

   @Override
   protected void g(bne $$0) {
      cpq $$1 = this.c(bom.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bom.a, cpq.h);
      }

      super.g($$0);
   }

   public static boolean a(caw $$0, box $$1) {
      double $$2 = $$1.du() - $$0.du();
      double $$3 = $$1.do() - $$0.do();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dJ().a_(ib.a($$0.do() + $$8, $$0.dq() + (double)$$9, $$0.du() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public eov cG() {
      return new eov(0.0, (double)(0.55F * this.cF()), (double)(this.dd() * 0.4F));
   }

   class a extends bxn<box> {
      @Nullable
      private box j;
      @Nullable
      private box k;
      private int l;

      public a(Class<box> $$0, boolean $$1, boolean $$2, @Nullable Predicate<box> $$3) {
         super(caw.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ef().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : caw.this.gw()) {
               if ($$0 != null && caw.this.dJ() instanceof apa && ((apa)caw.this.dJ()).a($$0) instanceof box $$2) {
                  this.k = $$2;
                  this.j = $$2.eg();
                  int $$3 = $$2.eh();
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
            this.l = this.k.eh();
         }

         caw.this.a(atp.iR, 1.0F, 1.0F);
         caw.this.B(true);
         caw.this.gy();
         super.c();
      }
   }

   class b extends bvu {
      int a;

      public b() {
         this.a(EnumSet.of(bvu.a.b, bvu.a.c, bvu.a.a));
      }

      @Override
      public boolean a() {
         return caw.this.gl();
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
         caw.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<box> {
      public boolean a(box $$0) {
         if ($$0 instanceof caw) {
            return false;
         } else if ($$0 instanceof car || $$0 instanceof cbg || $$0 instanceof cfg) {
            return true;
         } else if ($$0 instanceof bpt) {
            return !((bpt)$$0).u();
         } else if (!($$0 instanceof cia) || !$$0.P_() && !((cia)$$0).f()) {
            return caw.this.c($$0.ct()) ? false : !$$0.fF() && !$$0.bS();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bvu {
      private final bzn b = bzn.a().a(12.0).d().a(caw.this.new c());

      protected boolean h() {
         ib $$0 = ib.a(caw.this.do(), caw.this.cE().e, caw.this.du());
         return !caw.this.dJ().h($$0) && caw.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !caw.this.dJ().a(box.class, this.b, caw.this, caw.this.cE().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bvg {
      public e(double $$0) {
         super(caw.this, $$0);
      }

      @Override
      public void c() {
         ((caw)this.a).gz();
         ((caw)this.c).gz();
         super.c();
      }

      @Override
      protected void g() {
         apa $$0 = (apa)this.b;
         caw $$1 = (caw)this.a.a($$0, (boa)this.c);
         if ($$1 != null) {
            apb $$2 = this.a.go();
            apb $$3 = this.c.go();
            apb $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.ct());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.ct());
            }

            if ($$4 != null) {
               $$4.a(atz.P);
               am.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gq();
            this.c.gq();
            $$1.c_(-24000);
            $$1.b(this.a.do(), this.a.dq(), this.a.du(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.Z().b(cwa.f)) {
               this.b.b(new bon(this.b, this.a.do(), this.a.dq(), this.a.du(), this.a.ef().a(7) + 1));
            }
         }
      }
   }

   public class f extends bwh {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(caw.this, $$1, $$2, $$3);
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
      protected boolean a(cwh $$0, ib $$1) {
         dme $$2 = $$0.a_($$1);
         return $$2.a(czh.oi) && $$2.c(dhh.c) >= 2 || dab.i_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && caw.this.af.i() < 0.05F) {
            caw.this.a(atp.iZ, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (caw.this.dJ().Z().b(cwa.c)) {
            dme $$0 = caw.this.dJ().a_(this.e);
            if ($$0.a(czh.oi)) {
               this.b($$0);
            } else if (dab.i_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dme $$0) {
         dab.a(caw.this, $$0, caw.this.dJ(), this.e);
      }

      private void b(dme $$0) {
         int $$1 = $$0.c(dhh.c);
         $$0.a(dhh.c, Integer.valueOf(1));
         int $$2 = 1 + caw.this.dJ().z.a(2) + ($$1 == 3 ? 1 : 0);
         cpq $$3 = caw.this.c(bom.a);
         if ($$3.b()) {
            caw.this.a(bom.a, new cpq(cpt.wl));
            $$2--;
         }

         if ($$2 > 0) {
            czf.a(caw.this.dJ(), this.e, new cpq(cpt.wl, $$2));
         }

         caw.this.a(atp.yL, 1.0F, 1.0F);
         caw.this.dJ().a(this.e, $$0.a(dhh.c, Integer.valueOf(1)), 2);
         caw.this.dJ().a(dqr.c, this.e, dqr.a.a(caw.this));
      }

      @Override
      public boolean a() {
         return !caw.this.fF() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         caw.this.w(false);
         super.c();
      }
   }

   class g extends bvo {
      public g() {
         super(caw.this);
      }

      @Override
      public void c() {
         super.c();
         caw.this.gz();
      }

      @Override
      public boolean a() {
         return caw.this.aZ() && caw.this.b(auj.a) > 0.25 || caw.this.bn();
      }
   }

   class h extends bvt {
      private final caw e;

      public h(caw $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gx() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gx() && super.b();
      }

      @Override
      public void c() {
         this.e.gz();
         super.c();
      }
   }

   public static class i extends boa.a {
      public final caw.v a;

      public i(caw.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bwc {
      public j(boz $$0, Class<? extends box> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !caw.this.gl() && !caw.this.gu();
      }

      @Override
      public boolean b() {
         return super.b() && !caw.this.gl() && !caw.this.gu();
      }
   }

   public class k extends buw {
      public k() {
         super(caw.this);
      }

      @Override
      public void a() {
         if (!caw.this.fF()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !caw.this.gr() && !caw.this.bU() && !caw.this.gu() && !caw.this.gl();
      }
   }

   class l extends bwe {
      public l(double $$0, boolean $$1) {
         super(caw.this, $$0, $$1);
      }

      @Override
      protected void a(box $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.B($$0);
            caw.this.a(atp.iT, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         caw.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !caw.this.A() && !caw.this.fF() && !caw.this.bU() && !caw.this.gl() && super.a();
      }
   }

   class m extends bux {
      public m() {
         super(caw.this);
      }

      @Override
      public void a() {
         if (caw.this.gA()) {
            super.a();
         }
      }
   }

   class n extends bwn {
      public n(double $$0) {
         super(caw.this, $$0);
      }

      @Override
      public boolean h() {
         return !caw.this.gx() && super.h();
      }
   }

   public class o extends bvy {
      @Override
      public boolean a() {
         if (!caw.this.gt()) {
            return false;
         } else {
            box $$0 = caw.this.q();
            if ($$0 != null && $$0.bx()) {
               if ($$0.cC() != $$0.cB()) {
                  return false;
               } else {
                  boolean $$1 = caw.a(caw.this, $$0);
                  if (!$$1) {
                     caw.this.N().a($$0, 0);
                     caw.this.y(false);
                     caw.this.z(false);
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
         box $$0 = caw.this.q();
         if ($$0 != null && $$0.bx()) {
            double $$1 = caw.this.dm().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(caw.this.dB()) < 15.0F) || !caw.this.aC()) && !caw.this.gl();
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
         caw.this.r(true);
         caw.this.x(true);
         caw.this.z(false);
         box $$0 = caw.this.q();
         if ($$0 != null) {
            caw.this.I().a($$0, 60.0F, 30.0F);
            eov $$1 = new eov($$0.do() - caw.this.do(), $$0.dq() - caw.this.dq(), $$0.du() - caw.this.du()).d();
            caw.this.g(caw.this.dm().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         caw.this.N().n();
      }

      @Override
      public void d() {
         caw.this.y(false);
         caw.this.cs = 0.0F;
         caw.this.ct = 0.0F;
         caw.this.z(false);
         caw.this.x(false);
      }

      @Override
      public void e() {
         box $$0 = caw.this.q();
         if ($$0 != null) {
            caw.this.I().a($$0, 60.0F, 30.0F);
         }

         if (!caw.this.gl()) {
            eov $$1 = caw.this.dm();
            if ($$1.d * $$1.d < 0.03F && caw.this.dB() != 0.0F) {
               caw.this.s(awm.j(0.2F, caw.this.dB(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               caw.this.s((float)$$3);
            }
         }

         if ($$0 != null && caw.this.e($$0) <= 2.0F) {
            caw.this.B($$0);
         } else if (caw.this.dB() > 0.0F && caw.this.aC() && (float)caw.this.dm().d != 0.0F && caw.this.dJ().a_(caw.this.dj()).a(czh.dN)) {
            caw.this.s(60.0F);
            caw.this.h(null);
            caw.this.A(true);
         }
      }
   }

   class p extends bvu {
      public p() {
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean a() {
         if (!caw.this.c(bom.a).b()) {
            return false;
         } else if (caw.this.q() != null || caw.this.eg() != null) {
            return false;
         } else if (!caw.this.gA()) {
            return false;
         } else if (caw.this.ef().a(b(10)) != 0) {
            return false;
         } else {
            List<cel> $$0 = caw.this.dJ().a(cel.class, caw.this.cE().c(8.0, 8.0, 8.0), caw.ch);
            return !$$0.isEmpty() && caw.this.c(bom.a).b();
         }
      }

      @Override
      public void e() {
         List<cel> $$0 = caw.this.dJ().a(cel.class, caw.this.cE().c(8.0, 8.0, 8.0), caw.ch);
         cpq $$1 = caw.this.c(bom.a);
         if ($$1.b() && !$$0.isEmpty()) {
            caw.this.N().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cel> $$0 = caw.this.dJ().a(cel.class, caw.this.cE().c(8.0, 8.0, 8.0), caw.ch);
         if (!$$0.isEmpty()) {
            caw.this.N().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends bxa {
      public q(int $$0, int $$1) {
         super(caw.this, $$1);
      }

      @Override
      public void c() {
         caw.this.gz();
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
         return !caw.this.fF() && !caw.this.A() && !caw.this.gx() && caw.this.q() == null;
      }
   }

   class r extends caw.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bvu.a.a, bvu.a.b));
      }

      @Override
      public boolean a() {
         return caw.this.eg() == null
            && caw.this.ef().i() < 0.02F
            && !caw.this.fF()
            && caw.this.q() == null
            && caw.this.N().l()
            && !this.i()
            && !caw.this.gr()
            && !caw.this.bU();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + caw.this.ef().a(3);
         caw.this.w(true);
         caw.this.N().n();
      }

      @Override
      public void d() {
         caw.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         caw.this.I().a(caw.this.do() + this.c, caw.this.ds(), caw.this.du() + this.d, (float)caw.this.fJ(), (float)caw.this.ab());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * caw.this.ef().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + caw.this.ef().a(20));
      }
   }

   class s extends bvn {
      private int c = b(100);

      public s(double $$0) {
         super(caw.this, $$0);
      }

      @Override
      public boolean a() {
         if (!caw.this.fF() && this.a.q() == null) {
            if (caw.this.dJ().aa() && caw.this.dJ().h(this.a.dj())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ib $$0 = this.a.dj();
               return caw.this.dJ().P() && caw.this.dJ().h($$0) && !((apa)caw.this.dJ()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         caw.this.gz();
         super.c();
      }
   }

   class t extends caw.d {
      private static final int c = b(140);
      private int d = caw.this.af.a(c);

      public t() {
         this.a(EnumSet.of(bvu.a.a, bvu.a.b, bvu.a.c));
      }

      @Override
      public boolean a() {
         return caw.this.bl == 0.0F && caw.this.bm == 0.0F && caw.this.bn == 0.0F ? this.k() || caw.this.fF() : false;
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
            return caw.this.dJ().P() && this.h() && !this.i() && !caw.this.az;
         }
      }

      @Override
      public void d() {
         this.d = caw.this.af.a(c);
         caw.this.gz();
      }

      @Override
      public void c() {
         caw.this.w(false);
         caw.this.y(false);
         caw.this.z(false);
         caw.this.r(false);
         caw.this.C(true);
         caw.this.N().n();
         caw.this.K().a(caw.this.do(), caw.this.dq(), caw.this.du(), 0.0);
      }
   }

   class u extends bvu {
      public u() {
         this.a(EnumSet.of(bvu.a.a, bvu.a.b));
      }

      @Override
      public boolean a() {
         if (caw.this.fF()) {
            return false;
         } else {
            box $$0 = caw.this.q();
            return $$0 != null && $$0.bx() && caw.cj.test($$0) && caw.this.f($$0) > 36.0 && !caw.this.bU() && !caw.this.gu() && !caw.this.bk;
         }
      }

      @Override
      public void c() {
         caw.this.w(false);
         caw.this.A(false);
      }

      @Override
      public void d() {
         box $$0 = caw.this.q();
         if ($$0 != null && caw.a(caw.this, $$0)) {
            caw.this.z(true);
            caw.this.y(true);
            caw.this.N().n();
            caw.this.I().a($$0, (float)caw.this.fJ(), (float)caw.this.ab());
         } else {
            caw.this.z(false);
            caw.this.y(false);
         }
      }

      @Override
      public void e() {
         box $$0 = caw.this.q();
         if ($$0 != null) {
            caw.this.I().a($$0, (float)caw.this.fJ(), (float)caw.this.ab());
            if (caw.this.f($$0) <= 36.0) {
               caw.this.z(true);
               caw.this.y(true);
               caw.this.N().n();
            } else {
               caw.this.N().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements axg {
      a(0, "red"),
      b(1, "snow");

      public static final axg.a<caw.v> c = axg.a(caw.v::values);
      private static final IntFunction<caw.v> d = ave.a(caw.v::a, values(), ave.a.a);
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

      public static caw.v a(String $$0) {
         return c.a($$0, a);
      }

      public static caw.v a(int $$0) {
         return d.apply($$0);
      }

      public static caw.v a(il<cxd> $$0) {
         return $$0.a(aud.ar) ? b : a;
      }
   }
}
