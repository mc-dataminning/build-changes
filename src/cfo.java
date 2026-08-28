import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfo extends cfe implements buo<cfo.v> {
   private static final ajw<Integer> ce = aka.a(cfo.class, ajy.b);
   private static final ajw<Byte> cf = aka.a(cfo.class, ajy.a);
   private static final int cg = 1;
   public static final int ca = 4;
   public static final int cb = 8;
   public static final int cc = 16;
   private static final int ch = 32;
   private static final int ci = 64;
   private static final int cj = 128;
   private static final ajw<Optional<UUID>> ck = aka.a(cfo.class, ajy.r);
   private static final ajw<Optional<UUID>> cl = aka.a(cfo.class, ajy.r);
   static final Predicate<cjh> cm = $$0 -> !$$0.y() && $$0.bE();
   private static final Predicate<bsr> cn = $$0 -> !($$0 instanceof btn $$1) ? false : $$1.ek() != null && $$1.el() < $$1.ai + 600;
   static final Predicate<bsr> co = $$0 -> $$0 instanceof cfj || $$0 instanceof cfy;
   private static final Predicate<bsr> cp = $$0 -> !$$0.bZ() && bsw.e.test($$0);
   private static final int cq = 600;
   private static final bsu cr = bsx.Q.n().a(0.5F).b(0.2975F);
   private cam cs;
   private cam ct;
   private cam cu;
   private float cv;
   private float cw;
   float cx;
   float cy;
   private int cz;

   public cfo(bsx<? extends cfo> $$0, dcw $$1) {
      super($$0, $$1);
      this.bQ = new cfo.k();
      this.bR = new cfo.m();
      this.a(epv.p, 0.0F);
      this.a(epv.q, 0.0F);
      this.a_(true);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(ck, Optional.empty());
      $$0.a(cl, Optional.empty());
      $$0.a(ce, 0);
      $$0.a(cf, (byte)0);
   }

   @Override
   protected void B() {
      this.cs = new ccf<>(this, cfe.class, 10, false, false, $$0 -> $$0 instanceof cfj || $$0 instanceof cfy);
      this.ct = new ccf<>(this, cgf.class, 10, false, false, cgf.ca);
      this.cu = new ccf<>(this, cfb.class, 20, false, false, $$0 -> $$0 instanceof cfd);
      this.bU.a(0, new cfo.g());
      this.bU.a(0, new cab(this, this.dO()));
      this.bU.a(1, new cfo.b());
      this.bU.a(2, new cfo.n(2.2));
      this.bU.a(3, new cfo.e(1.0));
      this.bU.a(4, new bzt<>(this, cmx.class, 16.0F, 1.6, 1.4, $$0 -> cp.test($$0) && !this.c($$0.cz()) && !this.gw()));
      this.bU.a(4, new bzt<>(this, cgh.class, 8.0F, 1.6, 1.4, $$0 -> !((cgh)$$0).s() && !this.gw()));
      this.bU.a(4, new bzt<>(this, cfw.class, 8.0F, 1.6, 1.4, $$0 -> !this.gw()));
      this.bU.a(5, new cfo.u());
      this.bU.a(6, new cfo.o());
      this.bU.a(6, new cfo.s(1.25));
      this.bU.a(7, new cfo.l(1.2F, true));
      this.bU.a(7, new cfo.t());
      this.bU.a(8, new cfo.h(this, 1.25));
      this.bU.a(9, new cfo.q(32, 200));
      this.bU.a(10, new cfo.f(1.2F, 12, 1));
      this.bU.a(10, new cas(this, 0.4F));
      this.bU.a(11, new cbz(this, 1.0));
      this.bU.a(11, new cfo.p());
      this.bU.a(12, new cfo.j(this, cmx.class, 24.0F));
      this.bU.a(13, new cfo.r());
      this.bV.a(3, new cfo.a(btn.class, false, false, $$0 -> cn.test($$0) && !this.c($$0.cz())));
   }

   @Override
   public avo d(cuq $$0) {
      return avp.jj;
   }

   @Override
   public void m_() {
      if (!this.dO().B && this.bE() && this.db()) {
         this.cz++;
         cuq $$0 = this.a(bsy.a);
         if (this.n($$0)) {
            if (this.cz > 600) {
               cuq $$1 = $$0.a(this.dO(), this);
               if (!$$1.e()) {
                  this.a(bsy.a, $$1);
               }

               this.cz = 0;
            } else if (this.cz > 560 && this.ah.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dO().a(this, (byte)45);
            }
         }

         btn $$2 = this.p();
         if ($$2 == null || !$$2.bE()) {
            this.z(false);
            this.A(false);
         }
      }

      if (this.fH() || this.fc()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      }

      super.m_();
      if (this.gw() && this.ah.i() < 0.05F) {
         this.a(avp.jf, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fc() {
      return this.ex();
   }

   private boolean n(cuq $$0) {
      return $$0.b(kq.v) && this.p() == null && this.aF() && !this.fH();
   }

   @Override
   protected void a(ayw $$0, bqp $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cuq $$3;
         if ($$2 < 0.05F) {
            $$3 = new cuq(cut.oA);
         } else if ($$2 < 0.2F) {
            $$3 = new cuq(cut.qR);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cuq(cut.uD) : new cuq(cut.uE);
         } else if ($$2 < 0.6F) {
            $$3 = new cuq(cut.pw);
         } else if ($$2 < 0.8F) {
            $$3 = new cuq(cut.qD);
         } else {
            $$3 = new cuq(cut.pt);
         }

         this.a(bsy.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cuq $$1 = this.a(bsy.a);
         if (!$$1.e()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               exc $$3 = new exc(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dG() * (float) (Math.PI / 180.0))
                  .b(-this.dE() * (float) (Math.PI / 180.0));
               this.dO().a(new li(lm.S, $$1), this.dt() + this.bM().c / 2.0, this.dv(), this.dz() + this.bM().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static buv.a s() {
      return btp.C().a(buw.v, 0.3F).a(buw.s, 10.0).a(buw.m, 32.0).a(buw.c, 2.0).a(buw.x, 5.0);
   }

   @Nullable
   public cfo b(aqu $$0, bsl $$1) {
      cfo $$2 = bsx.Q.a((dcw)$$0);
      if ($$2 != null) {
         $$2.a(this.ah.h() ? this.t() : ((cfo)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bsx<cfo> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.a_($$3.e()).a(awe.cf) && a($$1, $$3);
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      jm<ddw> $$4 = $$0.t(this.do());
      cfo.v $$5 = cfo.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cfo.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cfo.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof aqu) {
         this.gu();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gu() {
      if (this.t() == cfo.v.a) {
         this.bV.a(4, this.cs);
         this.bV.a(4, this.ct);
         this.bV.a(6, this.cu);
      } else {
         this.bV.a(4, this.cu);
         this.bV.a(6, this.cs);
         this.bV.a(6, this.ct);
      }
   }

   @Override
   protected void a(cmx $$0, bqq $$1, cuq $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bsu e(bua $$0) {
      return this.o_() ? cr : super.e($$0);
   }

   public cfo.v t() {
      return cfo.v.a(this.ao.a(ce));
   }

   public void a(cfo.v $$0) {
      this.ao.a(ce, $$0.a());
   }

   List<UUID> gv() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.ao.a(ck).orElse(null));
      $$0.add(this.ao.a(cl).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.ao.a(ck).isPresent()) {
         this.ao.a(cl, Optional.ofNullable($$0));
      } else {
         this.ao.a(ck, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gv();
      uh $$2 = new uh();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(uq.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fH());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.x());
      $$0.a("Crouching", this.cb());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);

      for (uy $$2 : $$0.c("Trusted", 11)) {
         this.b(uq.a($$2));
      }

      this.D($$0.q("Sleeping"));
      this.a(cfo.v.a($$0.l("Type")));
      this.x($$0.q("Sitting"));
      this.z($$0.q("Crouching"));
      if (this.dO() instanceof aqu) {
         this.gu();
      }
   }

   public boolean x() {
      return this.t(1);
   }

   public void x(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gk() {
      return this.t(64);
   }

   void B(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gw() {
      return this.t(128);
   }

   void C(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fH() {
      return this.t(32);
   }

   void D(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.ao.a(cf, (byte)(this.ao.a(cf) | $$0));
      } else {
         this.ao.a(cf, (byte)(this.ao.a(cf) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.ao.a(cf) & $$0) != 0;
   }

   @Override
   public boolean f(cuq $$0) {
      bsy $$1 = this.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsy.a && super.f($$0);
   }

   @Override
   public boolean j(cuq $$0) {
      cuq $$1 = this.a(bsy.a);
      return $$1.e() || this.cz > 0 && $$0.b(kq.v) && !$$1.b(kq.v);
   }

   private void p(cuq $$0) {
      if (!$$0.e() && !this.dO().B) {
         cjh $$1 = new cjh(this.dO(), this.dt() + this.bM().c, this.dv() + 1.0, this.dz() + this.bM().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(avp.jo, 1.0F, 1.0F);
         this.dO().b($$1);
      }
   }

   private void q(cuq $$0) {
      cjh $$1 = new cjh(this.dO(), this.dt(), this.dv(), this.dz(), $$0);
      this.dO().b($$1);
   }

   @Override
   protected void b(cjh $$0) {
      cuq $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.H();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.a(bsy.a));
         this.a($$0);
         this.a(bsy.a, $$1.a(1));
         this.e(bsy.a);
         this.a($$0, $$1.H());
         $$0.aq();
         this.cz = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.db()) {
         boolean $$0 = this.bf();
         if ($$0 || this.p() != null || this.dO().ac()) {
            this.gx();
         }

         if ($$0 || this.fH()) {
            this.x(false);
         }

         if (this.gk() && this.dO().z.i() < 0.2F) {
            jd $$1 = this.do();
            dtc $$2 = this.dO().a_($$1);
            this.dO().c(2001, $$1, dfy.i($$2));
         }
      }

      this.cw = this.cv;
      if (this.go()) {
         this.cv = this.cv + (1.0F - this.cv) * 0.4F;
      } else {
         this.cv = this.cv + (0.0F - this.cv) * 0.4F;
      }

      this.cy = this.cx;
      if (this.cb()) {
         this.cx += 0.2F;
         if (this.cx > 3.0F) {
            this.cx = 3.0F;
         }
      } else {
         this.cx = 0.0F;
      }
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.Z);
   }

   @Override
   protected void a(cmx $$0, btp $$1) {
      ((cfo)$$1).b($$0.cz());
   }

   public boolean gl() {
      return this.t(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gm() {
      return this.bn;
   }

   public boolean gn() {
      return this.cx == 3.0F;
   }

   public void z(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean cb() {
      return this.t(4);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean go() {
      return this.t(8);
   }

   public float H(float $$0) {
      return ayo.i($$0, this.cw, this.cv) * 0.11F * (float) Math.PI;
   }

   public float I(float $$0) {
      return ayo.i($$0, this.cy, this.cx);
   }

   @Override
   public void h(@Nullable btn $$0) {
      if (this.gw() && $$0 == null) {
         this.C(false);
      }

      super.h($$0);
   }

   void gx() {
      this.D(false);
   }

   void gy() {
      this.A(false);
      this.z(false);
      this.x(false);
      this.D(false);
      this.C(false);
      this.B(false);
   }

   boolean gz() {
      return !this.fH() && !this.x() && !this.gk();
   }

   @Override
   public void S() {
      avo $$0 = this.v();
      if ($$0 == avp.jl) {
         this.a($$0, 2.0F, this.fb());
      } else {
         super.S();
      }
   }

   @Nullable
   @Override
   protected avo v() {
      if (this.fH()) {
         return avp.jm;
      } else {
         if (!this.dO().R() && this.ah.i() < 0.1F) {
            List<cmx> $$0 = this.dO().a(cmx.class, this.cK().c(16.0, 16.0, 16.0), bsw.f);
            if ($$0.isEmpty()) {
               return avp.jl;
            }
         }

         return avp.jg;
      }
   }

   @Nullable
   @Override
   protected avo d(brk $$0) {
      return avp.jk;
   }

   @Nullable
   @Override
   protected avo n_() {
      return avp.ji;
   }

   boolean c(UUID $$0) {
      return this.gv().contains($$0);
   }

   @Override
   protected void a(aqu $$0, brk $$1) {
      cuq $$2 = this.a(bsy.a);
      if (!$$2.e()) {
         this.b($$2);
         this.a(bsy.a, cuq.l);
      }

      super.a($$0, $$1);
   }

   public static boolean a(cfo $$0, btn $$1) {
      double $$2 = $$1.dz() - $$0.dz();
      double $$3 = $$1.dt() - $$0.dt();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dO().a_(jd.a($$0.dt() + $$8, $$0.dv() + (double)$$9, $$0.dz() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public exc cM() {
      return new exc(0.0, (double)(0.55F * this.cL()), (double)(this.dj() * 0.4F));
   }

   class a extends ccf<btn> {
      @Nullable
      private btn j;
      @Nullable
      private btn k;
      private int l;

      public a(final Class<btn> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<btn> $$3) {
         super(cfo.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dR().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cfo.this.gv()) {
               if ($$0 != null && cfo.this.dO() instanceof aqu && ((aqu)cfo.this.dO()).a($$0) instanceof btn $$2) {
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
      public void d() {
         this.a(this.j);
         this.c = this.j;
         if (this.k != null) {
            this.l = this.k.ej();
         }

         cfo.this.a(avp.jf, 1.0F, 1.0F);
         cfo.this.C(true);
         cfo.this.gx();
         super.d();
      }
   }

   class b extends cam {
      int a;

      public b() {
         this.a(EnumSet.of(cam.a.b, cam.a.c, cam.a.a));
      }

      @Override
      public boolean b() {
         return cfo.this.gk();
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
         cfo.this.B(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements Predicate<btn> {
      public boolean a(btn $$0) {
         if ($$0 instanceof cfo) {
            return false;
         } else if ($$0 instanceof cfj || $$0 instanceof cfy || $$0 instanceof ckd) {
            return true;
         } else if ($$0 instanceof bul) {
            return !((bul)$$0).s();
         } else if (!($$0 instanceof cmx) || !$$0.R_() && !((cmx)$$0).f()) {
            return cfo.this.c($$0.cz()) ? false : !$$0.fH() && !$$0.bZ();
         } else {
            return false;
         }
      }
   }

   abstract class d extends cam {
      private final cef b = cef.a().a(12.0).d().a(cfo.this.new c());

      protected boolean h() {
         jd $$0 = jd.a(cfo.this.dt(), cfo.this.cK().e, cfo.this.dz());
         return !cfo.this.dO().h($$0) && cfo.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cfo.this.dO().a(btn.class, this.b, cfo.this, cfo.this.cK().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bzy {
      public e(final double $$0) {
         super(cfo.this, $$0);
      }

      @Override
      public void d() {
         ((cfo)this.a).gy();
         ((cfo)this.c).gy();
         super.d();
      }

      @Override
      protected void g() {
         aqu $$0 = (aqu)this.b;
         cfo $$1 = (cfo)this.a.a($$0, (bsl)this.c);
         if ($$1 != null) {
            aqv $$2 = this.a.gr();
            aqv $$3 = this.c.gr();
            aqv $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cz());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cz());
            }

            if ($$4 != null) {
               $$4.a(avz.P);
               an.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gt();
            this.c.gt();
            $$1.c_(-24000);
            $$1.b(this.a.dt(), this.a.dv(), this.a.dz(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.ab().b(dcs.f)) {
               this.b.b(new btc(this.b, this.a.dt(), this.a.dv(), this.a.dz(), this.a.dR().a(7) + 1));
            }
         }
      }
   }

   public class f extends caz {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cfo.this, $$1, $$2, $$3);
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
      protected boolean a(dcz $$0, jd $$1) {
         dtc $$2 = $$0.a_($$1);
         return $$2.a(dga.oi) && $$2.c(doc.c) >= 2 || dgu.h_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cfo.this.ah.i() < 0.05F) {
            cfo.this.a(avp.jn, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (cfo.this.dO().ab().b(dcs.c)) {
            dtc $$0 = cfo.this.dO().a_(this.e);
            if ($$0.a(dga.oi)) {
               this.b($$0);
            } else if (dgu.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dtc $$0) {
         dgu.a(cfo.this, $$0, cfo.this.dO(), this.e);
      }

      private void b(dtc $$0) {
         int $$1 = $$0.c(doc.c);
         $$0.a(doc.c, Integer.valueOf(1));
         int $$2 = 1 + cfo.this.dO().z.a(2) + ($$1 == 3 ? 1 : 0);
         cuq $$3 = cfo.this.a(bsy.a);
         if ($$3.e()) {
            cfo.this.a(bsy.a, new cuq(cut.wu));
            $$2--;
         }

         if ($$2 > 0) {
            dfy.a(cfo.this.dO(), this.e, new cuq(cut.wu, $$2));
         }

         cfo.this.a(avp.zs, 1.0F, 1.0F);
         cfo.this.dO().a(this.e, $$0.a(doc.c, Integer.valueOf(1)), 2);
         cfo.this.dO().a(dxz.c, this.e, dxz.a.a(cfo.this));
      }

      @Override
      public boolean b() {
         return !cfo.this.fH() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         cfo.this.x(false);
         super.d();
      }
   }

   class g extends cag {
      public g() {
         super(cfo.this);
      }

      @Override
      public void d() {
         super.d();
         cfo.this.gy();
      }

      @Override
      public boolean b() {
         return cfo.this.bf() && cfo.this.b(awk.a) > 0.25 || cfo.this.bt();
      }
   }

   class h extends cal {
      private final cfo d;

      public h(final cfo $$0, final double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gw() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gw() && super.c();
      }

      @Override
      public void d() {
         this.d.gy();
         super.d();
      }
   }

   public static class i extends bsl.a {
      public final cfo.v a;

      public i(cfo.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cau {
      public j(final btp $$0, final Class<? extends btn> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !cfo.this.gk() && !cfo.this.go();
      }

      @Override
      public boolean c() {
         return super.c() && !cfo.this.gk() && !cfo.this.go();
      }
   }

   public class k extends bzo {
      public k() {
         super(cfo.this);
      }

      @Override
      public void a() {
         if (!cfo.this.fH()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cfo.this.gl() && !cfo.this.cb() && !cfo.this.go() && !cfo.this.gk();
      }
   }

   class l extends caw {
      public l(final double $$0, final boolean $$1) {
         super(cfo.this, $$0, $$1);
      }

      @Override
      protected void a(btn $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.D($$0);
            cfo.this.a(avp.jh, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         cfo.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !cfo.this.x() && !cfo.this.fH() && !cfo.this.cb() && !cfo.this.gk() && super.b();
      }
   }

   class m extends bzp {
      public m() {
         super(cfo.this);
      }

      @Override
      public void a() {
         if (cfo.this.gz()) {
            super.a();
         }
      }
   }

   class n extends cbf {
      public n(final double $$0) {
         super(cfo.this, $$0);
      }

      @Override
      public boolean h() {
         return !cfo.this.gw() && super.h();
      }
   }

   public class o extends caq {
      @Override
      public boolean b() {
         if (!cfo.this.gn()) {
            return false;
         } else {
            btn $$0 = cfo.this.p();
            if ($$0 != null && $$0.bE()) {
               if ($$0.cI() != $$0.cH()) {
                  return false;
               } else {
                  boolean $$1 = cfo.a(cfo.this, $$0);
                  if (!$$1) {
                     cfo.this.N().a($$0, 0);
                     cfo.this.z(false);
                     cfo.this.A(false);
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
         btn $$0 = cfo.this.p();
         if ($$0 != null && $$0.bE()) {
            double $$1 = cfo.this.dr().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cfo.this.dG()) < 15.0F) || !cfo.this.aF()) && !cfo.this.gk();
         } else {
            return false;
         }
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public void d() {
         cfo.this.t(true);
         cfo.this.y(true);
         cfo.this.A(false);
         btn $$0 = cfo.this.p();
         if ($$0 != null) {
            cfo.this.I().a($$0, 60.0F, 30.0F);
            exc $$1 = new exc($$0.dt() - cfo.this.dt(), $$0.dv() - cfo.this.dv(), $$0.dz() - cfo.this.dz()).d();
            cfo.this.i(cfo.this.dr().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cfo.this.N().n();
      }

      @Override
      public void e() {
         cfo.this.z(false);
         cfo.this.cx = 0.0F;
         cfo.this.cy = 0.0F;
         cfo.this.A(false);
         cfo.this.y(false);
      }

      @Override
      public void a() {
         btn $$0 = cfo.this.p();
         if ($$0 != null) {
            cfo.this.I().a($$0, 60.0F, 30.0F);
         }

         if (!cfo.this.gk()) {
            exc $$1 = cfo.this.dr();
            if ($$1.d * $$1.d < 0.03F && cfo.this.dG() != 0.0F) {
               cfo.this.u(ayo.j(0.2F, cfo.this.dG(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cfo.this.u((float)$$3);
            }
         }

         if ($$0 != null && cfo.this.f($$0) <= 2.0F) {
            cfo.this.D($$0);
         } else if (cfo.this.dG() > 0.0F && cfo.this.aF() && (float)cfo.this.dr().d != 0.0F && cfo.this.dO().a_(cfo.this.do()).a(dga.dN)) {
            cfo.this.u(60.0F);
            cfo.this.h(null);
            cfo.this.B(true);
         }
      }
   }

   class p extends cam {
      public p() {
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         if (!cfo.this.a(bsy.a).e()) {
            return false;
         } else if (cfo.this.p() != null || cfo.this.ei() != null) {
            return false;
         } else if (!cfo.this.gz()) {
            return false;
         } else if (cfo.this.dR().a(b(10)) != 0) {
            return false;
         } else {
            List<cjh> $$0 = cfo.this.dO().a(cjh.class, cfo.this.cK().c(8.0, 8.0, 8.0), cfo.cm);
            return !$$0.isEmpty() && cfo.this.a(bsy.a).e();
         }
      }

      @Override
      public void a() {
         List<cjh> $$0 = cfo.this.dO().a(cjh.class, cfo.this.cK().c(8.0, 8.0, 8.0), cfo.cm);
         cuq $$1 = cfo.this.a(bsy.a);
         if ($$1.e() && !$$0.isEmpty()) {
            cfo.this.N().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<cjh> $$0 = cfo.this.dO().a(cjh.class, cfo.this.cK().c(8.0, 8.0, 8.0), cfo.cm);
         if (!$$0.isEmpty()) {
            cfo.this.N().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cbs {
      public q(final int $$0, final int $$1) {
         super(cfo.this, $$1);
      }

      @Override
      public void d() {
         cfo.this.gy();
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
         return !cfo.this.fH() && !cfo.this.x() && !cfo.this.gw() && cfo.this.p() == null;
      }
   }

   class r extends cfo.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cam.a.a, cam.a.b));
      }

      @Override
      public boolean b() {
         return cfo.this.ei() == null
            && cfo.this.dR().i() < 0.02F
            && !cfo.this.fH()
            && cfo.this.p() == null
            && cfo.this.N().l()
            && !this.i()
            && !cfo.this.gl()
            && !cfo.this.cb();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + cfo.this.dR().a(3);
         cfo.this.x(true);
         cfo.this.N().n();
      }

      @Override
      public void e() {
         cfo.this.x(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cfo.this.I().a(cfo.this.dt() + this.c, cfo.this.dx(), cfo.this.dz() + this.d, (float)cfo.this.ae(), (float)cfo.this.ac());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cfo.this.dR().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cfo.this.dR().a(20));
      }
   }

   class s extends caf {
      private int c = b(100);

      public s(final double $$0) {
         super(cfo.this, $$0);
      }

      @Override
      public boolean b() {
         if (!cfo.this.fH() && this.a.p() == null) {
            if (cfo.this.dO().ac() && cfo.this.dO().h(this.a.do())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               jd $$0 = this.a.do();
               return cfo.this.dO().R() && cfo.this.dO().h($$0) && !((aqu)cfo.this.dO()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         cfo.this.gy();
         super.d();
      }
   }

   class t extends cfo.d {
      private static final int c = b(140);
      private int d = cfo.this.ah.a(c);

      public t() {
         this.a(EnumSet.of(cam.a.a, cam.a.b, cam.a.c));
      }

      @Override
      public boolean b() {
         return cfo.this.bo == 0.0F && cfo.this.bp == 0.0F && cfo.this.bq == 0.0F ? this.k() || cfo.this.fH() : false;
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
            return cfo.this.dO().R() && this.h() && !this.i() && !cfo.this.az;
         }
      }

      @Override
      public void e() {
         this.d = cfo.this.ah.a(c);
         cfo.this.gy();
      }

      @Override
      public void d() {
         cfo.this.x(false);
         cfo.this.z(false);
         cfo.this.A(false);
         cfo.this.t(false);
         cfo.this.D(true);
         cfo.this.N().n();
         cfo.this.J().a(cfo.this.dt(), cfo.this.dv(), cfo.this.dz(), 0.0);
      }
   }

   class u extends cam {
      public u() {
         this.a(EnumSet.of(cam.a.a, cam.a.b));
      }

      @Override
      public boolean b() {
         if (cfo.this.fH()) {
            return false;
         } else {
            btn $$0 = cfo.this.p();
            return $$0 != null && $$0.bE() && cfo.co.test($$0) && cfo.this.g((bsr)$$0) > 36.0 && !cfo.this.cb() && !cfo.this.go() && !cfo.this.bn;
         }
      }

      @Override
      public void d() {
         cfo.this.x(false);
         cfo.this.B(false);
      }

      @Override
      public void e() {
         btn $$0 = cfo.this.p();
         if ($$0 != null && cfo.a(cfo.this, $$0)) {
            cfo.this.A(true);
            cfo.this.z(true);
            cfo.this.N().n();
            cfo.this.I().a($$0, (float)cfo.this.ae(), (float)cfo.this.ac());
         } else {
            cfo.this.A(false);
            cfo.this.z(false);
         }
      }

      @Override
      public void a() {
         btn $$0 = cfo.this.p();
         if ($$0 != null) {
            cfo.this.I().a($$0, (float)cfo.this.ae(), (float)cfo.this.ac());
            if (cfo.this.g((bsr)$$0) <= 36.0) {
               cfo.this.A(true);
               cfo.this.z(true);
               cfo.this.N().n();
            } else {
               cfo.this.N().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azk {
      a(0, "red"),
      b(1, "snow");

      public static final azk.a<cfo.v> c = azk.a(cfo.v::values);
      private static final IntFunction<cfo.v> d = axe.a(cfo.v::a, values(), axe.a.a);
      private final int e;
      private final String f;

      private v(final int $$0, final String $$1) {
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

      public static cfo.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cfo.v a(int $$0) {
         return d.apply($$0);
      }

      public static cfo.v a(jm<ddw> $$0) {
         return $$0.a(awd.ar) ? b : a;
      }
   }
}
