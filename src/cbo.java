import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbo extends cbe implements bqo<cbo.v> {
   private static final aim<Integer> cb = aiq.a(cbo.class, aio.b);
   private static final aim<Byte> cc = aiq.a(cbo.class, aio.a);
   private static final int cd = 1;
   public static final int bX = 4;
   public static final int bY = 8;
   public static final int ca = 16;
   private static final int ce = 32;
   private static final int cf = 64;
   private static final int cg = 128;
   private static final aim<Optional<UUID>> ch = aiq.a(cbo.class, aio.q);
   private static final aim<Optional<UUID>> ci = aiq.a(cbo.class, aio.q);
   static final Predicate<cfe> cj = $$0 -> !$$0.y() && $$0.bA();
   private static final Predicate<box> ck = $$0 -> !($$0 instanceof bpp $$1) ? false : $$1.el() != null && $$1.em() < $$1.ah + 600;
   static final Predicate<box> cl = $$0 -> $$0 instanceof cbj || $$0 instanceof cby;
   private static final Predicate<box> cm = $$0 -> !$$0.bV() && bpc.e.test($$0);
   private static final int cn = 600;
   private static final bpa co = bpd.R.n().a(0.5F).b(0.2975F);
   private bwm cp;
   private bwm cq;
   private bwm cr;
   private float cs;
   private float ct;
   float cu;
   float cv;
   private int cw;

   public cbo(bpd<? extends cbo> $$0, cxb $$1) {
      super($$0, $$1);
      this.bN = new cbo.k();
      this.bO = new cbo.m();
      this.a(ejg.p, 0.0F);
      this.a(ejg.q, 0.0F);
      this.s(true);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ch, Optional.empty());
      $$0.a(ci, Optional.empty());
      $$0.a(cb, 0);
      $$0.a(cc, (byte)0);
   }

   @Override
   protected void z() {
      this.cp = new byf<>(this, cbe.class, 10, false, false, $$0 -> $$0 instanceof cbj || $$0 instanceof cby);
      this.cq = new byf<>(this, ccf.class, 10, false, false, ccf.bY);
      this.cr = new byf<>(this, cbb.class, 20, false, false, $$0 -> $$0 instanceof cbd);
      this.bR.a(0, new cbo.g());
      this.bR.a(0, new bwb(this, this.dM()));
      this.bR.a(1, new cbo.b());
      this.bR.a(2, new cbo.n(2.2));
      this.bR.a(3, new cbo.e(1.0));
      this.bR.a(4, new bvt<>(this, ciu.class, 16.0F, 1.6, 1.4, $$0 -> cm.test($$0) && !this.c($$0.cw()) && !this.gz()));
      this.bR.a(4, new bvt<>(this, cch.class, 8.0F, 1.6, 1.4, $$0 -> !((cch)$$0).r() && !this.gz()));
      this.bR.a(4, new bvt<>(this, cbw.class, 8.0F, 1.6, 1.4, $$0 -> !this.gz()));
      this.bR.a(5, new cbo.u());
      this.bR.a(6, new cbo.o());
      this.bR.a(6, new cbo.s(1.25));
      this.bR.a(7, new cbo.l(1.2F, true));
      this.bR.a(7, new cbo.t());
      this.bR.a(8, new cbo.h(this, 1.25));
      this.bR.a(9, new cbo.q(32, 200));
      this.bR.a(10, new cbo.f(1.2F, 12, 1));
      this.bR.a(10, new bws(this, 0.4F));
      this.bR.a(11, new bxz(this, 1.0));
      this.bR.a(11, new cbo.p());
      this.bR.a(12, new cbo.j(this, ciu.class, 24.0F));
      this.bR.a(13, new cbo.r());
      this.bS.a(3, new cbo.a(bpp.class, false, false, $$0 -> ck.test($$0) && !this.c($$0.cw())));
   }

   @Override
   public atx d(cqm $$0) {
      return aty.jc;
   }

   @Override
   public void m_() {
      if (!this.dM().B && this.bA() && this.cY()) {
         this.cw++;
         cqm $$0 = this.d(bpe.a);
         if (this.n($$0)) {
            if (this.cw > 600) {
               cqm $$1 = $$0.a(this.dM(), this);
               if (!$$1.b()) {
                  this.a(bpe.a, $$1);
               }

               this.cw = 0;
            } else if (this.cw > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dM().a(this, (byte)45);
            }
         }

         bpp $$2 = this.p();
         if ($$2 == null || !$$2.bA()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fI() || this.fd()) {
         this.bm = false;
         this.bn = 0.0F;
         this.bp = 0.0F;
      }

      super.m_();
      if (this.gz() && this.ag.i() < 0.05F) {
         this.a(aty.iY, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fd() {
      return this.ey();
   }

   private boolean n(cqm $$0) {
      return $$0.d().v() && this.p() == null && this.aC() && !this.fI();
   }

   @Override
   protected void a(axd $$0, bnb $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cqm $$3;
         if ($$2 < 0.05F) {
            $$3 = new cqm(cqp.oy);
         } else if ($$2 < 0.2F) {
            $$3 = new cqm(cqp.qQ);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cqm(cqp.uB) : new cqm(cqp.uC);
         } else if ($$2 < 0.6F) {
            $$3 = new cqm(cqp.pv);
         } else if ($$2 < 0.8F) {
            $$3 = new cqm(cqp.qC);
         } else {
            $$3 = new cqm(cqp.ps);
         }

         this.a(bpe.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cqm $$1 = this.d(bpe.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ept $$3 = new ept(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dE() * (float) (Math.PI / 180.0))
                  .b(-this.dC() * (float) (Math.PI / 180.0));
               this.dM().a(new jy(kc.R, $$1), this.dr() + this.bI().c / 2.0, this.dt(), this.dx() + this.bI().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bqv.a r() {
      return bpr.A().a(bqw.r, 0.3F).a(bqw.q, 10.0).a(bqw.k, 32.0).a(bqw.c, 2.0);
   }

   @Nullable
   public cbo b(apf $$0, bos $$1) {
      cbo $$2 = bpd.R.a((cxb)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.s() : ((cbo)$$1).s());
      }

      return $$2;
   }

   public static boolean c(bpd<cbo> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      return $$1.a_($$3.d()).a(aun.bY) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      il<cya> $$4 = $$0.t(this.dm());
      cbo.v $$5 = cbo.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cbo.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cbo.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof apf) {
         this.gx();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gx() {
      if (this.s() == cbo.v.a) {
         this.bS.a(4, this.cp);
         this.bS.a(4, this.cq);
         this.bS.a(6, this.cr);
      } else {
         this.bS.a(4, this.cr);
         this.bS.a(6, this.cp);
         this.bS.a(6, this.cq);
      }
   }

   @Override
   protected void a(ciu $$0, bnc $$1, cqm $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bpa e(bqa $$0) {
      return this.o_() ? co : super.e($$0);
   }

   public cbo.v s() {
      return cbo.v.a(this.an.a(cb));
   }

   public void a(cbo.v $$0) {
      this.an.a(cb, $$0.a());
   }

   List<UUID> gy() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.an.a(ch).orElse(null));
      $$0.add(this.an.a(ci).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.an.a(ch).isPresent()) {
         this.an.a(ci, Optional.ofNullable($$0));
      } else {
         this.an.a(ch, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gy();
      tg $$2 = new tg();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(tp.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fI());
      $$0.a("Type", this.s().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.bX());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);

      for (tx $$2 : $$0.c("Trusted", 11)) {
         this.b(tp.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(cbo.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dM() instanceof apf) {
         this.gx();
      }
   }

   public boolean y() {
      return this.u(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gn() {
      return this.u(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gz() {
      return this.u(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fI() {
      return this.u(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.an.a(cc, (byte)(this.an.a(cc) | $$0));
      } else {
         this.an.a(cc, (byte)(this.an.a(cc) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.an.a(cc) & $$0) != 0;
   }

   @Override
   public boolean f(cqm $$0) {
      bpe $$1 = bpr.h($$0);
      return !this.d($$1).b() ? false : $$1 == bpe.a && super.f($$0);
   }

   @Override
   public boolean j(cqm $$0) {
      cqh $$1 = $$0.d();
      cqm $$2 = this.d(bpe.a);
      return $$2.b() || this.cw > 0 && $$1.v() && !$$2.d().v();
   }

   private void p(cqm $$0) {
      if (!$$0.b() && !this.dM().B) {
         cfe $$1 = new cfe(this.dM(), this.dr() + this.bI().c, this.dt() + 1.0, this.dx() + this.bI().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(aty.jh, 1.0F, 1.0F);
         this.dM().b($$1);
      }
   }

   private void q(cqm $$0) {
      cfe $$1 = new cfe(this.dM(), this.dr(), this.dt(), this.dx(), $$0);
      this.dM().b($$1);
   }

   @Override
   protected void b(cfe $$0) {
      cqm $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.M();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.d(bpe.a));
         this.a($$0);
         this.a(bpe.a, $$1.a(1));
         this.f(bpe.a);
         this.a($$0, $$1.M());
         $$0.am();
         this.cw = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.cY()) {
         boolean $$0 = this.bc();
         if ($$0 || this.p() != null || this.dM().aa()) {
            this.gA();
         }

         if ($$0 || this.fI()) {
            this.w(false);
         }

         if (this.gn() && this.dM().z.i() < 0.2F) {
            ib $$1 = this.dm();
            dnb $$2 = this.dM().a_($$1);
            this.dM().c(2001, $$1, dac.i($$2));
         }
      }

      this.ct = this.cs;
      if (this.gw()) {
         this.cs = this.cs + (1.0F - this.cs) * 0.4F;
      } else {
         this.cs = this.cs + (0.0F - this.cs) * 0.4F;
      }

      this.cv = this.cu;
      if (this.bX()) {
         this.cu += 0.2F;
         if (this.cu > 3.0F) {
            this.cu = 3.0F;
         }
      } else {
         this.cu = 0.0F;
      }
   }

   @Override
   public boolean o(cqm $$0) {
      return $$0.a(auv.X);
   }

   @Override
   protected void a(ciu $$0, bpr $$1) {
      ((cbo)$$1).b($$0.cw());
   }

   public boolean gt() {
      return this.u(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gu() {
      return this.bm;
   }

   public boolean gv() {
      return this.cu == 3.0F;
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

   public boolean gw() {
      return this.u(8);
   }

   public float G(float $$0) {
      return aww.i($$0, this.ct, this.cs) * 0.11F * (float) Math.PI;
   }

   public float H(float $$0) {
      return aww.i($$0, this.cv, this.cu);
   }

   @Override
   public void h(@Nullable bpp $$0) {
      if (this.gz() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return aww.f(($$0 - 5.0F) * $$1);
   }

   void gA() {
      this.C(false);
   }

   void gB() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gC() {
      return !this.fI() && !this.y() && !this.gn();
   }

   @Override
   public void P() {
      atx $$0 = this.v();
      if ($$0 == aty.je) {
         this.a($$0, 2.0F, this.fc());
      } else {
         super.P();
      }
   }

   @Nullable
   @Override
   protected atx v() {
      if (this.fI()) {
         return aty.jf;
      } else {
         if (!this.dM().P() && this.ag.i() < 0.1F) {
            List<ciu> $$0 = this.dM().a(ciu.class, this.cH().c(16.0, 16.0, 16.0), bpc.f);
            if ($$0.isEmpty()) {
               return aty.je;
            }
         }

         return aty.iZ;
      }
   }

   @Nullable
   @Override
   protected atx d(bnw $$0) {
      return aty.jd;
   }

   @Nullable
   @Override
   protected atx n_() {
      return aty.jb;
   }

   boolean c(UUID $$0) {
      return this.gy().contains($$0);
   }

   @Override
   protected void g(bnw $$0) {
      cqm $$1 = this.d(bpe.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bpe.a, cqm.h);
      }

      super.g($$0);
   }

   public static boolean a(cbo $$0, bpp $$1) {
      double $$2 = $$1.dx() - $$0.dx();
      double $$3 = $$1.dr() - $$0.dr();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dM().a_(ib.a($$0.dr() + $$8, $$0.dt() + (double)$$9, $$0.dx() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ept cJ() {
      return new ept(0.0, (double)(0.55F * this.cI()), (double)(this.dg() * 0.4F));
   }

   class a extends byf<bpp> {
      @Nullable
      private bpp j;
      @Nullable
      private bpp k;
      private int l;

      public a(Class<bpp> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bpp> $$3) {
         super(cbo.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ei().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cbo.this.gy()) {
               if ($$0 != null && cbo.this.dM() instanceof apf && ((apf)cbo.this.dM()).a($$0) instanceof bpp $$2) {
                  this.k = $$2;
                  this.j = $$2.ej();
                  int $$3 = $$2.ek();
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
            this.l = this.k.ek();
         }

         cbo.this.a(aty.iY, 1.0F, 1.0F);
         cbo.this.B(true);
         cbo.this.gA();
         super.c();
      }
   }

   class b extends bwm {
      int a;

      public b() {
         this.a(EnumSet.of(bwm.a.b, bwm.a.c, bwm.a.a));
      }

      @Override
      public boolean a() {
         return cbo.this.gn();
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
         cbo.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bpp> {
      public boolean a(bpp $$0) {
         if ($$0 instanceof cbo) {
            return false;
         } else if ($$0 instanceof cbj || $$0 instanceof cby || $$0 instanceof cga) {
            return true;
         } else if ($$0 instanceof bql) {
            return !((bql)$$0).r();
         } else if (!($$0 instanceof ciu) || !$$0.N_() && !((ciu)$$0).f()) {
            return cbo.this.c($$0.cw()) ? false : !$$0.fI() && !$$0.bV();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bwm {
      private final caf b = caf.a().a(12.0).d().a(cbo.this.new c());

      protected boolean h() {
         ib $$0 = ib.a(cbo.this.dr(), cbo.this.cH().e, cbo.this.dx());
         return !cbo.this.dM().h($$0) && cbo.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cbo.this.dM().a(bpp.class, this.b, cbo.this, cbo.this.cH().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bvy {
      public e(double $$0) {
         super(cbo.this, $$0);
      }

      @Override
      public void c() {
         ((cbo)this.a).gB();
         ((cbo)this.c).gB();
         super.c();
      }

      @Override
      protected void g() {
         apf $$0 = (apf)this.b;
         cbo $$1 = (cbo)this.a.a($$0, (bos)this.c);
         if ($$1 != null) {
            apg $$2 = this.a.gq();
            apg $$3 = this.c.gq();
            apg $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cw());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cw());
            }

            if ($$4 != null) {
               $$4.a(aui.P);
               am.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gs();
            this.c.gs();
            $$1.c_(-24000);
            $$1.b(this.a.dr(), this.a.dt(), this.a.dx(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.Z().b(cwx.f)) {
               this.b.b(new bpf(this.b, this.a.dr(), this.a.dt(), this.a.dx(), this.a.ei().a(7) + 1));
            }
         }
      }
   }

   public class f extends bwz {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(cbo.this, $$1, $$2, $$3);
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
      protected boolean a(cxe $$0, ib $$1) {
         dnb $$2 = $$0.a_($$1);
         return $$2.a(dae.oi) && $$2.c(die.c) >= 2 || day.i_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cbo.this.ag.i() < 0.05F) {
            cbo.this.a(aty.jg, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (cbo.this.dM().Z().b(cwx.c)) {
            dnb $$0 = cbo.this.dM().a_(this.e);
            if ($$0.a(dae.oi)) {
               this.b($$0);
            } else if (day.i_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dnb $$0) {
         day.a(cbo.this, $$0, cbo.this.dM(), this.e);
      }

      private void b(dnb $$0) {
         int $$1 = $$0.c(die.c);
         $$0.a(die.c, Integer.valueOf(1));
         int $$2 = 1 + cbo.this.dM().z.a(2) + ($$1 == 3 ? 1 : 0);
         cqm $$3 = cbo.this.d(bpe.a);
         if ($$3.b()) {
            cbo.this.a(bpe.a, new cqm(cqp.wn));
            $$2--;
         }

         if ($$2 > 0) {
            dac.a(cbo.this.dM(), this.e, new cqm(cqp.wn, $$2));
         }

         cbo.this.a(aty.yT, 1.0F, 1.0F);
         cbo.this.dM().a(this.e, $$0.a(die.c, Integer.valueOf(1)), 2);
         cbo.this.dM().a(drp.c, this.e, drp.a.a(cbo.this));
      }

      @Override
      public boolean a() {
         return !cbo.this.fI() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         cbo.this.w(false);
         super.c();
      }
   }

   class g extends bwg {
      public g() {
         super(cbo.this);
      }

      @Override
      public void c() {
         super.c();
         cbo.this.gB();
      }

      @Override
      public boolean a() {
         return cbo.this.bc() && cbo.this.b(aus.a) > 0.25 || cbo.this.bq();
      }
   }

   class h extends bwl {
      private final cbo e;

      public h(cbo $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gz() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gz() && super.b();
      }

      @Override
      public void c() {
         this.e.gB();
         super.c();
      }
   }

   public static class i extends bos.a {
      public final cbo.v a;

      public i(cbo.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bwu {
      public j(bpr $$0, Class<? extends bpp> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !cbo.this.gn() && !cbo.this.gw();
      }

      @Override
      public boolean b() {
         return super.b() && !cbo.this.gn() && !cbo.this.gw();
      }
   }

   public class k extends bvo {
      public k() {
         super(cbo.this);
      }

      @Override
      public void a() {
         if (!cbo.this.fI()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cbo.this.gt() && !cbo.this.bX() && !cbo.this.gw() && !cbo.this.gn();
      }
   }

   class l extends bww {
      public l(double $$0, boolean $$1) {
         super(cbo.this, $$0, $$1);
      }

      @Override
      protected void a(bpp $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cbo.this.a(aty.ja, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         cbo.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !cbo.this.y() && !cbo.this.fI() && !cbo.this.bX() && !cbo.this.gn() && super.a();
      }
   }

   class m extends bvp {
      public m() {
         super(cbo.this);
      }

      @Override
      public void a() {
         if (cbo.this.gC()) {
            super.a();
         }
      }
   }

   class n extends bxf {
      public n(double $$0) {
         super(cbo.this, $$0);
      }

      @Override
      public boolean h() {
         return !cbo.this.gz() && super.h();
      }
   }

   public class o extends bwq {
      @Override
      public boolean a() {
         if (!cbo.this.gv()) {
            return false;
         } else {
            bpp $$0 = cbo.this.p();
            if ($$0 != null && $$0.bA()) {
               if ($$0.cF() != $$0.cE()) {
                  return false;
               } else {
                  boolean $$1 = cbo.a(cbo.this, $$0);
                  if (!$$1) {
                     cbo.this.K().a($$0, 0);
                     cbo.this.y(false);
                     cbo.this.z(false);
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
         bpp $$0 = cbo.this.p();
         if ($$0 != null && $$0.bA()) {
            double $$1 = cbo.this.dp().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cbo.this.dE()) < 15.0F) || !cbo.this.aC()) && !cbo.this.gn();
         } else {
            return false;
         }
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public void c() {
         cbo.this.r(true);
         cbo.this.x(true);
         cbo.this.z(false);
         bpp $$0 = cbo.this.p();
         if ($$0 != null) {
            cbo.this.G().a($$0, 60.0F, 30.0F);
            ept $$1 = new ept($$0.dr() - cbo.this.dr(), $$0.dt() - cbo.this.dt(), $$0.dx() - cbo.this.dx()).d();
            cbo.this.g(cbo.this.dp().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cbo.this.K().n();
      }

      @Override
      public void d() {
         cbo.this.y(false);
         cbo.this.cu = 0.0F;
         cbo.this.cv = 0.0F;
         cbo.this.z(false);
         cbo.this.x(false);
      }

      @Override
      public void e() {
         bpp $$0 = cbo.this.p();
         if ($$0 != null) {
            cbo.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!cbo.this.gn()) {
            ept $$1 = cbo.this.dp();
            if ($$1.d * $$1.d < 0.03F && cbo.this.dE() != 0.0F) {
               cbo.this.s(aww.j(0.2F, cbo.this.dE(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cbo.this.s((float)$$3);
            }
         }

         if ($$0 != null && cbo.this.f($$0) <= 2.0F) {
            cbo.this.C($$0);
         } else if (cbo.this.dE() > 0.0F && cbo.this.aC() && (float)cbo.this.dp().d != 0.0F && cbo.this.dM().a_(cbo.this.dm()).a(dae.dN)) {
            cbo.this.s(60.0F);
            cbo.this.h(null);
            cbo.this.A(true);
         }
      }
   }

   class p extends bwm {
      public p() {
         this.a(EnumSet.of(bwm.a.a));
      }

      @Override
      public boolean a() {
         if (!cbo.this.d(bpe.a).b()) {
            return false;
         } else if (cbo.this.p() != null || cbo.this.ej() != null) {
            return false;
         } else if (!cbo.this.gC()) {
            return false;
         } else if (cbo.this.ei().a(b(10)) != 0) {
            return false;
         } else {
            List<cfe> $$0 = cbo.this.dM().a(cfe.class, cbo.this.cH().c(8.0, 8.0, 8.0), cbo.cj);
            return !$$0.isEmpty() && cbo.this.d(bpe.a).b();
         }
      }

      @Override
      public void e() {
         List<cfe> $$0 = cbo.this.dM().a(cfe.class, cbo.this.cH().c(8.0, 8.0, 8.0), cbo.cj);
         cqm $$1 = cbo.this.d(bpe.a);
         if ($$1.b() && !$$0.isEmpty()) {
            cbo.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cfe> $$0 = cbo.this.dM().a(cfe.class, cbo.this.cH().c(8.0, 8.0, 8.0), cbo.cj);
         if (!$$0.isEmpty()) {
            cbo.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends bxs {
      public q(int $$0, int $$1) {
         super(cbo.this, $$1);
      }

      @Override
      public void c() {
         cbo.this.gB();
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
         return !cbo.this.fI() && !cbo.this.y() && !cbo.this.gz() && cbo.this.p() == null;
      }
   }

   class r extends cbo.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bwm.a.a, bwm.a.b));
      }

      @Override
      public boolean a() {
         return cbo.this.ej() == null
            && cbo.this.ei().i() < 0.02F
            && !cbo.this.fI()
            && cbo.this.p() == null
            && cbo.this.K().l()
            && !this.i()
            && !cbo.this.gt()
            && !cbo.this.bX();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + cbo.this.ei().a(3);
         cbo.this.w(true);
         cbo.this.K().n();
      }

      @Override
      public void d() {
         cbo.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cbo.this.G().a(cbo.this.dr() + this.c, cbo.this.dv(), cbo.this.dx() + this.d, (float)cbo.this.aa(), (float)cbo.this.Z());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cbo.this.ei().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cbo.this.ei().a(20));
      }
   }

   class s extends bwf {
      private int c = b(100);

      public s(double $$0) {
         super(cbo.this, $$0);
      }

      @Override
      public boolean a() {
         if (!cbo.this.fI() && this.a.p() == null) {
            if (cbo.this.dM().aa() && cbo.this.dM().h(this.a.dm())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ib $$0 = this.a.dm();
               return cbo.this.dM().P() && cbo.this.dM().h($$0) && !((apf)cbo.this.dM()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         cbo.this.gB();
         super.c();
      }
   }

   class t extends cbo.d {
      private static final int c = b(140);
      private int d = cbo.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(bwm.a.a, bwm.a.b, bwm.a.c));
      }

      @Override
      public boolean a() {
         return cbo.this.bn == 0.0F && cbo.this.bo == 0.0F && cbo.this.bp == 0.0F ? this.k() || cbo.this.fI() : false;
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
            return cbo.this.dM().P() && this.h() && !this.i() && !cbo.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = cbo.this.ag.a(c);
         cbo.this.gB();
      }

      @Override
      public void c() {
         cbo.this.w(false);
         cbo.this.y(false);
         cbo.this.z(false);
         cbo.this.r(false);
         cbo.this.C(true);
         cbo.this.K().n();
         cbo.this.H().a(cbo.this.dr(), cbo.this.dt(), cbo.this.dx(), 0.0);
      }
   }

   class u extends bwm {
      public u() {
         this.a(EnumSet.of(bwm.a.a, bwm.a.b));
      }

      @Override
      public boolean a() {
         if (cbo.this.fI()) {
            return false;
         } else {
            bpp $$0 = cbo.this.p();
            return $$0 != null && $$0.bA() && cbo.cl.test($$0) && cbo.this.g($$0) > 36.0 && !cbo.this.bX() && !cbo.this.gw() && !cbo.this.bm;
         }
      }

      @Override
      public void c() {
         cbo.this.w(false);
         cbo.this.A(false);
      }

      @Override
      public void d() {
         bpp $$0 = cbo.this.p();
         if ($$0 != null && cbo.a(cbo.this, $$0)) {
            cbo.this.z(true);
            cbo.this.y(true);
            cbo.this.K().n();
            cbo.this.G().a($$0, (float)cbo.this.aa(), (float)cbo.this.Z());
         } else {
            cbo.this.z(false);
            cbo.this.y(false);
         }
      }

      @Override
      public void e() {
         bpp $$0 = cbo.this.p();
         if ($$0 != null) {
            cbo.this.G().a($$0, (float)cbo.this.aa(), (float)cbo.this.Z());
            if (cbo.this.g($$0) <= 36.0) {
               cbo.this.z(true);
               cbo.this.y(true);
               cbo.this.K().n();
            } else {
               cbo.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements axq {
      a(0, "red"),
      b(1, "snow");

      public static final axq.a<cbo.v> c = axq.a(cbo.v::values);
      private static final IntFunction<cbo.v> d = avn.a(cbo.v::a, values(), avn.a.a);
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

      public static cbo.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cbo.v a(int $$0) {
         return d.apply($$0);
      }

      public static cbo.v a(il<cya> $$0) {
         return $$0.a(aum.ar) ? b : a;
      }
   }
}
