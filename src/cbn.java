import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbn extends cbd implements bqn<cbn.v> {
   private static final aim<Integer> cb = aiq.a(cbn.class, aio.b);
   private static final aim<Byte> cc = aiq.a(cbn.class, aio.a);
   private static final int cd = 1;
   public static final int bX = 4;
   public static final int bY = 8;
   public static final int ca = 16;
   private static final int ce = 32;
   private static final int cf = 64;
   private static final int cg = 128;
   private static final aim<Optional<UUID>> ch = aiq.a(cbn.class, aio.q);
   private static final aim<Optional<UUID>> ci = aiq.a(cbn.class, aio.q);
   static final Predicate<cfd> cj = $$0 -> !$$0.y() && $$0.bA();
   private static final Predicate<bow> ck = $$0 -> !($$0 instanceof bpo $$1) ? false : $$1.el() != null && $$1.em() < $$1.ah + 600;
   static final Predicate<bow> cl = $$0 -> $$0 instanceof cbi || $$0 instanceof cbx;
   private static final Predicate<bow> cm = $$0 -> !$$0.bV() && bpb.e.test($$0);
   private static final int cn = 600;
   private static final boz co = bpc.Q.n().a(0.5F).b(0.2975F);
   private bwl cp;
   private bwl cq;
   private bwl cr;
   private float cs;
   private float ct;
   float cu;
   float cv;
   private int cw;

   public cbn(bpc<? extends cbn> $$0, cwz $$1) {
      super($$0, $$1);
      this.bN = new cbn.k();
      this.bO = new cbn.m();
      this.a(eiy.p, 0.0F);
      this.a(eiy.q, 0.0F);
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
      this.cp = new bye<>(this, cbd.class, 10, false, false, $$0 -> $$0 instanceof cbi || $$0 instanceof cbx);
      this.cq = new bye<>(this, cce.class, 10, false, false, cce.bY);
      this.cr = new bye<>(this, cba.class, 20, false, false, $$0 -> $$0 instanceof cbc);
      this.bR.a(0, new cbn.g());
      this.bR.a(0, new bwa(this, this.dM()));
      this.bR.a(1, new cbn.b());
      this.bR.a(2, new cbn.n(2.2));
      this.bR.a(3, new cbn.e(1.0));
      this.bR.a(4, new bvs<>(this, cis.class, 16.0F, 1.6, 1.4, $$0 -> cm.test($$0) && !this.c($$0.cw()) && !this.gz()));
      this.bR.a(4, new bvs<>(this, ccg.class, 8.0F, 1.6, 1.4, $$0 -> !((ccg)$$0).r() && !this.gz()));
      this.bR.a(4, new bvs<>(this, cbv.class, 8.0F, 1.6, 1.4, $$0 -> !this.gz()));
      this.bR.a(5, new cbn.u());
      this.bR.a(6, new cbn.o());
      this.bR.a(6, new cbn.s(1.25));
      this.bR.a(7, new cbn.l(1.2F, true));
      this.bR.a(7, new cbn.t());
      this.bR.a(8, new cbn.h(this, 1.25));
      this.bR.a(9, new cbn.q(32, 200));
      this.bR.a(10, new cbn.f(1.2F, 12, 1));
      this.bR.a(10, new bwr(this, 0.4F));
      this.bR.a(11, new bxy(this, 1.0));
      this.bR.a(11, new cbn.p());
      this.bR.a(12, new cbn.j(this, cis.class, 24.0F));
      this.bR.a(13, new cbn.r());
      this.bS.a(3, new cbn.a(bpo.class, false, false, $$0 -> ck.test($$0) && !this.c($$0.cw())));
   }

   @Override
   public atx d(cqk $$0) {
      return aty.iY;
   }

   @Override
   public void m_() {
      if (!this.dM().B && this.bA() && this.cY()) {
         this.cw++;
         cqk $$0 = this.d(bpd.a);
         if (this.n($$0)) {
            if (this.cw > 600) {
               cqk $$1 = $$0.a(this.dM(), this);
               if (!$$1.b()) {
                  this.a(bpd.a, $$1);
               }

               this.cw = 0;
            } else if (this.cw > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dM().a(this, (byte)45);
            }
         }

         bpo $$2 = this.p();
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
         this.a(aty.iU, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fd() {
      return this.ey();
   }

   private boolean n(cqk $$0) {
      return $$0.d().v() && this.p() == null && this.aC() && !this.fI();
   }

   @Override
   protected void a(axd $$0, bna $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cqk $$3;
         if ($$2 < 0.05F) {
            $$3 = new cqk(cqn.oy);
         } else if ($$2 < 0.2F) {
            $$3 = new cqk(cqn.qQ);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cqk(cqn.uA) : new cqk(cqn.uB);
         } else if ($$2 < 0.6F) {
            $$3 = new cqk(cqn.pv);
         } else if ($$2 < 0.8F) {
            $$3 = new cqk(cqn.qC);
         } else {
            $$3 = new cqk(cqn.ps);
         }

         this.a(bpd.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cqk $$1 = this.d(bpd.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               epr $$3 = new epr(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dE() * (float) (Math.PI / 180.0))
                  .b(-this.dC() * (float) (Math.PI / 180.0));
               this.dM().a(new jy(kc.R, $$1), this.dr() + this.bI().c / 2.0, this.dt(), this.dx() + this.bI().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bqu.a r() {
      return bpq.A().a(bqv.r, 0.3F).a(bqv.q, 10.0).a(bqv.k, 32.0).a(bqv.c, 2.0);
   }

   @Nullable
   public cbn b(apf $$0, bor $$1) {
      cbn $$2 = bpc.Q.a((cwz)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.s() : ((cbn)$$1).s());
      }

      return $$2;
   }

   public static boolean c(bpc<cbn> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      return $$1.a_($$3.d()).a(aun.bY) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      il<cxy> $$4 = $$0.t(this.dm());
      cbn.v $$5 = cbn.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cbn.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cbn.i($$5);
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
      if (this.s() == cbn.v.a) {
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
   protected void a(cis $$0, bnb $$1, cqk $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public boz e(bpz $$0) {
      return this.o_() ? co : super.e($$0);
   }

   public cbn.v s() {
      return cbn.v.a(this.an.a(cb));
   }

   public void a(cbn.v $$0) {
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
      this.a(cbn.v.a($$0.l("Type")));
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
   public boolean f(cqk $$0) {
      bpd $$1 = bpq.h($$0);
      return !this.d($$1).b() ? false : $$1 == bpd.a && super.f($$0);
   }

   @Override
   public boolean j(cqk $$0) {
      cqf $$1 = $$0.d();
      cqk $$2 = this.d(bpd.a);
      return $$2.b() || this.cw > 0 && $$1.v() && !$$2.d().v();
   }

   private void p(cqk $$0) {
      if (!$$0.b() && !this.dM().B) {
         cfd $$1 = new cfd(this.dM(), this.dr() + this.bI().c, this.dt() + 1.0, this.dx() + this.bI().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(aty.jd, 1.0F, 1.0F);
         this.dM().b($$1);
      }
   }

   private void q(cqk $$0) {
      cfd $$1 = new cfd(this.dM(), this.dr(), this.dt(), this.dx(), $$0);
      this.dM().b($$1);
   }

   @Override
   protected void b(cfd $$0) {
      cqk $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.M();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.d(bpd.a));
         this.a($$0);
         this.a(bpd.a, $$1.a(1));
         this.f(bpd.a);
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
            dmz $$2 = this.dM().a_($$1);
            this.dM().c(2001, $$1, daa.i($$2));
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
   public boolean o(cqk $$0) {
      return $$0.a(auv.X);
   }

   @Override
   protected void a(cis $$0, bpq $$1) {
      ((cbn)$$1).b($$0.cw());
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
   public void h(@Nullable bpo $$0) {
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
      if ($$0 == aty.ja) {
         this.a($$0, 2.0F, this.fc());
      } else {
         super.P();
      }
   }

   @Nullable
   @Override
   protected atx v() {
      if (this.fI()) {
         return aty.jb;
      } else {
         if (!this.dM().P() && this.ag.i() < 0.1F) {
            List<cis> $$0 = this.dM().a(cis.class, this.cH().c(16.0, 16.0, 16.0), bpb.f);
            if ($$0.isEmpty()) {
               return aty.ja;
            }
         }

         return aty.iV;
      }
   }

   @Nullable
   @Override
   protected atx d(bnv $$0) {
      return aty.iZ;
   }

   @Nullable
   @Override
   protected atx n_() {
      return aty.iX;
   }

   boolean c(UUID $$0) {
      return this.gy().contains($$0);
   }

   @Override
   protected void g(bnv $$0) {
      cqk $$1 = this.d(bpd.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bpd.a, cqk.h);
      }

      super.g($$0);
   }

   public static boolean a(cbn $$0, bpo $$1) {
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
   public epr cJ() {
      return new epr(0.0, (double)(0.55F * this.cI()), (double)(this.dg() * 0.4F));
   }

   class a extends bye<bpo> {
      @Nullable
      private bpo j;
      @Nullable
      private bpo k;
      private int l;

      public a(Class<bpo> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bpo> $$3) {
         super(cbn.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ei().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cbn.this.gy()) {
               if ($$0 != null && cbn.this.dM() instanceof apf && ((apf)cbn.this.dM()).a($$0) instanceof bpo $$2) {
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

         cbn.this.a(aty.iU, 1.0F, 1.0F);
         cbn.this.B(true);
         cbn.this.gA();
         super.c();
      }
   }

   class b extends bwl {
      int a;

      public b() {
         this.a(EnumSet.of(bwl.a.b, bwl.a.c, bwl.a.a));
      }

      @Override
      public boolean a() {
         return cbn.this.gn();
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
         cbn.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bpo> {
      public boolean a(bpo $$0) {
         if ($$0 instanceof cbn) {
            return false;
         } else if ($$0 instanceof cbi || $$0 instanceof cbx || $$0 instanceof cfy) {
            return true;
         } else if ($$0 instanceof bqk) {
            return !((bqk)$$0).r();
         } else if (!($$0 instanceof cis) || !$$0.N_() && !((cis)$$0).f()) {
            return cbn.this.c($$0.cw()) ? false : !$$0.fI() && !$$0.bV();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bwl {
      private final cae b = cae.a().a(12.0).d().a(cbn.this.new c());

      protected boolean h() {
         ib $$0 = ib.a(cbn.this.dr(), cbn.this.cH().e, cbn.this.dx());
         return !cbn.this.dM().h($$0) && cbn.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cbn.this.dM().a(bpo.class, this.b, cbn.this, cbn.this.cH().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bvx {
      public e(double $$0) {
         super(cbn.this, $$0);
      }

      @Override
      public void c() {
         ((cbn)this.a).gB();
         ((cbn)this.c).gB();
         super.c();
      }

      @Override
      protected void g() {
         apf $$0 = (apf)this.b;
         cbn $$1 = (cbn)this.a.a($$0, (bor)this.c);
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
            if (this.b.Z().b(cwv.f)) {
               this.b.b(new bpe(this.b, this.a.dr(), this.a.dt(), this.a.dx(), this.a.ei().a(7) + 1));
            }
         }
      }
   }

   public class f extends bwy {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(cbn.this, $$1, $$2, $$3);
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
      protected boolean a(cxc $$0, ib $$1) {
         dmz $$2 = $$0.a_($$1);
         return $$2.a(dac.oi) && $$2.c(dic.c) >= 2 || daw.i_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cbn.this.ag.i() < 0.05F) {
            cbn.this.a(aty.jc, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (cbn.this.dM().Z().b(cwv.c)) {
            dmz $$0 = cbn.this.dM().a_(this.e);
            if ($$0.a(dac.oi)) {
               this.b($$0);
            } else if (daw.i_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dmz $$0) {
         daw.a(cbn.this, $$0, cbn.this.dM(), this.e);
      }

      private void b(dmz $$0) {
         int $$1 = $$0.c(dic.c);
         $$0.a(dic.c, Integer.valueOf(1));
         int $$2 = 1 + cbn.this.dM().z.a(2) + ($$1 == 3 ? 1 : 0);
         cqk $$3 = cbn.this.d(bpd.a);
         if ($$3.b()) {
            cbn.this.a(bpd.a, new cqk(cqn.wm));
            $$2--;
         }

         if ($$2 > 0) {
            daa.a(cbn.this.dM(), this.e, new cqk(cqn.wm, $$2));
         }

         cbn.this.a(aty.yO, 1.0F, 1.0F);
         cbn.this.dM().a(this.e, $$0.a(dic.c, Integer.valueOf(1)), 2);
         cbn.this.dM().a(drn.c, this.e, drn.a.a(cbn.this));
      }

      @Override
      public boolean a() {
         return !cbn.this.fI() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         cbn.this.w(false);
         super.c();
      }
   }

   class g extends bwf {
      public g() {
         super(cbn.this);
      }

      @Override
      public void c() {
         super.c();
         cbn.this.gB();
      }

      @Override
      public boolean a() {
         return cbn.this.bc() && cbn.this.b(aus.a) > 0.25 || cbn.this.bq();
      }
   }

   class h extends bwk {
      private final cbn e;

      public h(cbn $$0, double $$1) {
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

   public static class i extends bor.a {
      public final cbn.v a;

      public i(cbn.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bwt {
      public j(bpq $$0, Class<? extends bpo> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !cbn.this.gn() && !cbn.this.gw();
      }

      @Override
      public boolean b() {
         return super.b() && !cbn.this.gn() && !cbn.this.gw();
      }
   }

   public class k extends bvn {
      public k() {
         super(cbn.this);
      }

      @Override
      public void a() {
         if (!cbn.this.fI()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cbn.this.gt() && !cbn.this.bX() && !cbn.this.gw() && !cbn.this.gn();
      }
   }

   class l extends bwv {
      public l(double $$0, boolean $$1) {
         super(cbn.this, $$0, $$1);
      }

      @Override
      protected void a(bpo $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cbn.this.a(aty.iW, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         cbn.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !cbn.this.y() && !cbn.this.fI() && !cbn.this.bX() && !cbn.this.gn() && super.a();
      }
   }

   class m extends bvo {
      public m() {
         super(cbn.this);
      }

      @Override
      public void a() {
         if (cbn.this.gC()) {
            super.a();
         }
      }
   }

   class n extends bxe {
      public n(double $$0) {
         super(cbn.this, $$0);
      }

      @Override
      public boolean h() {
         return !cbn.this.gz() && super.h();
      }
   }

   public class o extends bwp {
      @Override
      public boolean a() {
         if (!cbn.this.gv()) {
            return false;
         } else {
            bpo $$0 = cbn.this.p();
            if ($$0 != null && $$0.bA()) {
               if ($$0.cF() != $$0.cE()) {
                  return false;
               } else {
                  boolean $$1 = cbn.a(cbn.this, $$0);
                  if (!$$1) {
                     cbn.this.K().a($$0, 0);
                     cbn.this.y(false);
                     cbn.this.z(false);
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
         bpo $$0 = cbn.this.p();
         if ($$0 != null && $$0.bA()) {
            double $$1 = cbn.this.dp().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cbn.this.dE()) < 15.0F) || !cbn.this.aC()) && !cbn.this.gn();
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
         cbn.this.r(true);
         cbn.this.x(true);
         cbn.this.z(false);
         bpo $$0 = cbn.this.p();
         if ($$0 != null) {
            cbn.this.G().a($$0, 60.0F, 30.0F);
            epr $$1 = new epr($$0.dr() - cbn.this.dr(), $$0.dt() - cbn.this.dt(), $$0.dx() - cbn.this.dx()).d();
            cbn.this.g(cbn.this.dp().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cbn.this.K().n();
      }

      @Override
      public void d() {
         cbn.this.y(false);
         cbn.this.cu = 0.0F;
         cbn.this.cv = 0.0F;
         cbn.this.z(false);
         cbn.this.x(false);
      }

      @Override
      public void e() {
         bpo $$0 = cbn.this.p();
         if ($$0 != null) {
            cbn.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!cbn.this.gn()) {
            epr $$1 = cbn.this.dp();
            if ($$1.d * $$1.d < 0.03F && cbn.this.dE() != 0.0F) {
               cbn.this.s(aww.j(0.2F, cbn.this.dE(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cbn.this.s((float)$$3);
            }
         }

         if ($$0 != null && cbn.this.f($$0) <= 2.0F) {
            cbn.this.C($$0);
         } else if (cbn.this.dE() > 0.0F && cbn.this.aC() && (float)cbn.this.dp().d != 0.0F && cbn.this.dM().a_(cbn.this.dm()).a(dac.dN)) {
            cbn.this.s(60.0F);
            cbn.this.h(null);
            cbn.this.A(true);
         }
      }
   }

   class p extends bwl {
      public p() {
         this.a(EnumSet.of(bwl.a.a));
      }

      @Override
      public boolean a() {
         if (!cbn.this.d(bpd.a).b()) {
            return false;
         } else if (cbn.this.p() != null || cbn.this.ej() != null) {
            return false;
         } else if (!cbn.this.gC()) {
            return false;
         } else if (cbn.this.ei().a(b(10)) != 0) {
            return false;
         } else {
            List<cfd> $$0 = cbn.this.dM().a(cfd.class, cbn.this.cH().c(8.0, 8.0, 8.0), cbn.cj);
            return !$$0.isEmpty() && cbn.this.d(bpd.a).b();
         }
      }

      @Override
      public void e() {
         List<cfd> $$0 = cbn.this.dM().a(cfd.class, cbn.this.cH().c(8.0, 8.0, 8.0), cbn.cj);
         cqk $$1 = cbn.this.d(bpd.a);
         if ($$1.b() && !$$0.isEmpty()) {
            cbn.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cfd> $$0 = cbn.this.dM().a(cfd.class, cbn.this.cH().c(8.0, 8.0, 8.0), cbn.cj);
         if (!$$0.isEmpty()) {
            cbn.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends bxr {
      public q(int $$0, int $$1) {
         super(cbn.this, $$1);
      }

      @Override
      public void c() {
         cbn.this.gB();
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
         return !cbn.this.fI() && !cbn.this.y() && !cbn.this.gz() && cbn.this.p() == null;
      }
   }

   class r extends cbn.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bwl.a.a, bwl.a.b));
      }

      @Override
      public boolean a() {
         return cbn.this.ej() == null
            && cbn.this.ei().i() < 0.02F
            && !cbn.this.fI()
            && cbn.this.p() == null
            && cbn.this.K().l()
            && !this.i()
            && !cbn.this.gt()
            && !cbn.this.bX();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + cbn.this.ei().a(3);
         cbn.this.w(true);
         cbn.this.K().n();
      }

      @Override
      public void d() {
         cbn.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cbn.this.G().a(cbn.this.dr() + this.c, cbn.this.dv(), cbn.this.dx() + this.d, (float)cbn.this.aa(), (float)cbn.this.Z());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cbn.this.ei().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cbn.this.ei().a(20));
      }
   }

   class s extends bwe {
      private int c = b(100);

      public s(double $$0) {
         super(cbn.this, $$0);
      }

      @Override
      public boolean a() {
         if (!cbn.this.fI() && this.a.p() == null) {
            if (cbn.this.dM().aa() && cbn.this.dM().h(this.a.dm())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ib $$0 = this.a.dm();
               return cbn.this.dM().P() && cbn.this.dM().h($$0) && !((apf)cbn.this.dM()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         cbn.this.gB();
         super.c();
      }
   }

   class t extends cbn.d {
      private static final int c = b(140);
      private int d = cbn.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(bwl.a.a, bwl.a.b, bwl.a.c));
      }

      @Override
      public boolean a() {
         return cbn.this.bn == 0.0F && cbn.this.bo == 0.0F && cbn.this.bp == 0.0F ? this.k() || cbn.this.fI() : false;
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
            return cbn.this.dM().P() && this.h() && !this.i() && !cbn.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = cbn.this.ag.a(c);
         cbn.this.gB();
      }

      @Override
      public void c() {
         cbn.this.w(false);
         cbn.this.y(false);
         cbn.this.z(false);
         cbn.this.r(false);
         cbn.this.C(true);
         cbn.this.K().n();
         cbn.this.H().a(cbn.this.dr(), cbn.this.dt(), cbn.this.dx(), 0.0);
      }
   }

   class u extends bwl {
      public u() {
         this.a(EnumSet.of(bwl.a.a, bwl.a.b));
      }

      @Override
      public boolean a() {
         if (cbn.this.fI()) {
            return false;
         } else {
            bpo $$0 = cbn.this.p();
            return $$0 != null && $$0.bA() && cbn.cl.test($$0) && cbn.this.g($$0) > 36.0 && !cbn.this.bX() && !cbn.this.gw() && !cbn.this.bm;
         }
      }

      @Override
      public void c() {
         cbn.this.w(false);
         cbn.this.A(false);
      }

      @Override
      public void d() {
         bpo $$0 = cbn.this.p();
         if ($$0 != null && cbn.a(cbn.this, $$0)) {
            cbn.this.z(true);
            cbn.this.y(true);
            cbn.this.K().n();
            cbn.this.G().a($$0, (float)cbn.this.aa(), (float)cbn.this.Z());
         } else {
            cbn.this.z(false);
            cbn.this.y(false);
         }
      }

      @Override
      public void e() {
         bpo $$0 = cbn.this.p();
         if ($$0 != null) {
            cbn.this.G().a($$0, (float)cbn.this.aa(), (float)cbn.this.Z());
            if (cbn.this.g($$0) <= 36.0) {
               cbn.this.z(true);
               cbn.this.y(true);
               cbn.this.K().n();
            } else {
               cbn.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements axq {
      a(0, "red"),
      b(1, "snow");

      public static final axq.a<cbn.v> c = axq.a(cbn.v::values);
      private static final IntFunction<cbn.v> d = avn.a(cbn.v::a, values(), avn.a.a);
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

      public static cbn.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cbn.v a(int $$0) {
         return d.apply($$0);
      }

      public static cbn.v a(il<cxy> $$0) {
         return $$0.a(aum.ar) ? b : a;
      }
   }
}
