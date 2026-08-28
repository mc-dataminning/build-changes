import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cjf extends cis {
   private static final akj<Integer> bJ = akn.a(cjf.class, akl.b);
   private static final akj<Byte> bK = akn.a(cjf.class, akl.a);
   private static final int bL = 1;
   public static final int bF = 4;
   public static final int bG = 8;
   public static final int bH = 16;
   private static final int bM = 32;
   private static final int bN = 64;
   private static final int bO = 128;
   private static final akj<Optional<bwj<bxc>>> bP = akn.a(cjf.class, akl.r);
   private static final akj<Optional<bwj<bxc>>> bQ = akn.a(cjf.class, akl.r);
   static final Predicate<cnd> bR = $$0 -> !$$0.o() && $$0.bK();
   private static final Predicate<bwd> bS = $$0 -> !($$0 instanceof bxc $$1) ? false : $$1.et() != null && $$1.eu() < $$1.af + 600;
   static final Predicate<bwd> bT = $$0 -> $$0 instanceof ciy || $$0 instanceof cjq;
   private static final Predicate<bwd> bU = $$0 -> !$$0.cg() && bwk.e.test($$0);
   private static final int bV = 600;
   private static final bwg bW = bwm.aa.n().a(0.5F).b(0.2975F);
   private cdy bX;
   private cdy bY;
   private cdy bZ;
   private float ca;
   private float cb;
   float cc;
   float cd;
   private int ce;

   public cjf(bwm<? extends cjf> $$0, div $$1) {
      super($$0, $$1);
      this.by = new cjf.k();
      this.bz = new cjf.m();
      this.a(ewx.p, 0.0F);
      this.a(ewx.q, 0.0F);
      this.a_(true);
      this.O().a(32.0F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bP, Optional.empty());
      $$0.a(bQ, Optional.empty());
      $$0.a(bJ, 0);
      $$0.a(bK, (byte)0);
   }

   @Override
   protected void D() {
      this.bX = new cfr<>(this, cis.class, 10, false, false, ($$0, $$1) -> $$0 instanceof ciy || $$0 instanceof cjq);
      this.bY = new cfr<>(this, cjy.class, 10, false, false, cjy.bF);
      this.bZ = new cfr<>(this, cio.class, 20, false, false, ($$0, $$1) -> $$0 instanceof ciq);
      this.bC.a(0, new cjf.g());
      this.bC.a(0, new cdn(this, this.dV()));
      this.bC.a(1, new cjf.b());
      this.bC.a(2, new cjf.n(2.2));
      this.bC.a(3, new cjf.e(1.0));
      this.bC.a(4, new cdf<>(this, cqy.class, 16.0F, 1.6, 1.4, $$0 -> bU.test($$0) && !this.j($$0) && !this.gE()));
      this.bC.a(4, new cdf<>(this, cka.class, 8.0F, 1.6, 1.4, $$0 -> !((cka)$$0).q() && !this.gE()));
      this.bC.a(4, new cdf<>(this, cjo.class, 8.0F, 1.6, 1.4, $$0 -> !this.gE()));
      this.bC.a(5, new cjf.u());
      this.bC.a(6, new cjf.o());
      this.bC.a(6, new cjf.s(1.25));
      this.bC.a(7, new cjf.l(1.2F, true));
      this.bC.a(7, new cjf.t());
      this.bC.a(8, new cjf.h(this, 1.25));
      this.bC.a(9, new cjf.q(32, 200));
      this.bC.a(10, new cjf.f(1.2F, 12, 1));
      this.bC.a(10, new cee(this, 0.4F));
      this.bC.a(11, new cfl(this, 1.0));
      this.bC.a(11, new cjf.p());
      this.bC.a(12, new cjf.j(this, cqy.class, 24.0F));
      this.bC.a(13, new cjf.r());
      this.bD.a(3, new cjf.a(bxc.class, false, false, ($$0, $$1) -> bS.test($$0) && !this.j($$0)));
   }

   @Override
   public void k_() {
      if (!this.dV().C && this.bK() && this.dj()) {
         this.ce++;
         cyy $$0 = this.a(bwn.a);
         if (this.k($$0)) {
            if (this.ce > 600) {
               cyy $$1 = $$0.a(this.dV(), this);
               if (!$$1.f()) {
                  this.a(bwn.a, $$1);
               }

               this.ce = 0;
            } else if (this.ce > 560 && this.ae.i() < 0.1F) {
               this.gw();
               this.dV().a(this, (byte)45);
            }
         }

         bxc $$2 = this.f();
         if ($$2 == null || !$$2.bK()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fQ() || this.ff()) {
         this.bf = false;
         this.bg = 0.0F;
         this.bi = 0.0F;
      }

      super.k_();
      if (this.gE() && this.ae.i() < 0.05F) {
         this.a(awn.jG, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean ff() {
      return this.eG();
   }

   private boolean k(cyy $$0) {
      return $$0.c(kj.v) && this.f() == null && this.aJ() && !this.fQ();
   }

   @Override
   protected void a(azv $$0, btz $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cyy $$3;
         if ($$2 < 0.05F) {
            $$3 = new cyy(czc.pl);
         } else if ($$2 < 0.2F) {
            $$3 = new cyy(czc.rE);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cyy(czc.vJ) : new cyy(czc.vK);
         } else if ($$2 < 0.6F) {
            $$3 = new cyy(czc.qh);
         } else if ($$2 < 0.8F) {
            $$3 = new cyy(czc.rq);
         } else {
            $$3 = new cyy(czc.qe);
         }

         this.a(bwn.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cyy $$1 = this.a(bwn.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               fei $$3 = new fei(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dN() * (float) (Math.PI / 180.0))
                  .b(-this.dL() * (float) (Math.PI / 180.0));
               this.dV().a(new lt(lx.U, $$1), this.dA() + this.bT().d / 2.0, this.dC(), this.dG() + this.bT().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static byh.a q() {
      return cis.gv().a(byi.v, 0.3F).a(byi.s, 10.0).a(byi.c, 2.0).a(byi.x, 5.0).a(byi.m, 32.0);
   }

   @Nullable
   public cjf b(arq $$0, bvt $$1) {
      cjf $$2 = bwm.aa.a($$0, bwl.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((cjf)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bwm<cjf> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.ch) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      je<djy> $$4 = $$0.u(this.dv());
      cjf.v $$5 = cjf.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cjf.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cjf.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof arq) {
         this.gC();
      }

      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gC() {
      if (this.t() == cjf.v.a) {
         this.bD.a(4, this.bX);
         this.bD.a(4, this.bY);
         this.bD.a(6, this.bZ);
      } else {
         this.bD.a(4, this.bZ);
         this.bD.a(6, this.bX);
         this.bD.a(6, this.bY);
      }
   }

   @Override
   protected void gw() {
      this.a(awn.jK, 1.0F, 1.0F);
   }

   @Override
   public bwg e(bxo $$0) {
      return this.n_() ? bW : super.e($$0);
   }

   public cjf.v t() {
      return cjf.v.a(this.al.a(bJ));
   }

   private void a(cjf.v $$0) {
      this.al.a(bJ, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.ay ? c((ki<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.ay);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.ay) {
         this.a(c(kj.ay, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   Stream<bwj<bxc>> gD() {
      return Stream.concat(this.al.a(bP).stream(), this.al.a(bQ).stream());
   }

   void i(bxc $$0) {
      this.a(new bwj<>($$0));
   }

   private void a(bwj<bxc> $$0) {
      if (this.al.a(bP).isPresent()) {
         this.al.a(bQ, Optional.of($$0));
      } else {
         this.al.a(bP, Optional.of($$0));
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      Stream<UUID> $$1 = this.gD().map(bwj::c);
      uf $$2 = new uf();
      $$1.forEach($$1x -> $$2.add(uo.a($$1x)));
      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fQ());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.x());
      $$0.a("Crouching", this.ci());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);

      for (uw $$2 : $$0.c("Trusted", 11)) {
         this.a(new bwj<>(uo.a($$2)));
      }

      this.C($$0.q("Sleeping"));
      this.a(cjf.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dV() instanceof arq) {
         this.gC();
      }
   }

   public boolean x() {
      return this.s(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gq() {
      return this.s(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gE() {
      return this.s(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fQ() {
      return this.s(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(bK, (byte)(this.al.a(bK) | $$0));
      } else {
         this.al.a(bK, (byte)(this.al.a(bK) & ~$$0));
      }
   }

   private boolean s(int $$0) {
      return (this.al.a(bK) & $$0) != 0;
   }

   @Override
   protected boolean f(bwn $$0) {
      return $$0 == bwn.a && this.fM();
   }

   @Override
   public boolean h(cyy $$0) {
      cyy $$1 = this.a(bwn.a);
      return $$1.f() || this.ce > 0 && $$0.c(kj.v) && !$$1.c(kj.v);
   }

   private void l(cyy $$0) {
      if (!$$0.f() && !this.dV().C) {
         cnd $$1 = new cnd(this.dV(), this.dA() + this.bT().d, this.dC() + 1.0, this.dG() + this.bT().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awn.jP, 1.0F, 1.0F);
         this.dV().b($$1);
      }
   }

   private void m(cyy $$0) {
      cnd $$1 = new cnd(this.dV(), this.dA(), this.dC(), this.dG(), $$0);
      this.dV().b($$1);
   }

   @Override
   protected void a(arq $$0, cnd $$1) {
      cyy $$2 = $$1.f();
      if (this.h($$2)) {
         int $$3 = $$2.M();
         if ($$3 > 1) {
            this.m($$2.a($$3 - 1));
         }

         this.l(this.a(bwn.a));
         this.a($$1);
         this.a(bwn.a, $$2.a(1));
         this.g(bwn.a);
         this.a($$1, $$2.M());
         $$1.at();
         this.ce = 0;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dj()) {
         boolean $$0 = this.bj();
         if ($$0 || this.f() != null || this.dV().ag()) {
            this.gF();
         }

         if ($$0 || this.fQ()) {
            this.w(false);
         }

         if (this.gq() && this.dV().A.i() < 0.2F) {
            iu $$1 = this.dv();
            dzz $$2 = this.dV().a_($$1);
            this.dV().c(2001, $$1, dma.j($$2));
         }
      }

      this.cb = this.ca;
      if (this.gu()) {
         this.ca = this.ca + (1.0F - this.ca) * 0.4F;
      } else {
         this.ca = this.ca + (0.0F - this.ca) * 0.4F;
      }

      this.cd = this.cc;
      if (this.ci()) {
         this.cc += 0.2F;
         if (this.cc > 3.0F) {
            this.cc = 3.0F;
         }
      } else {
         this.cc = 0.0F;
      }
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.ac);
   }

   @Override
   protected void a(cqy $$0, bxe $$1) {
      ((cjf)$$1).i($$0);
   }

   public boolean gr() {
      return this.s(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gs() {
      return this.bf;
   }

   public boolean gt() {
      return this.cc == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean ci() {
      return this.s(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gu() {
      return this.s(8);
   }

   public float J(float $$0) {
      return azm.h($$0, this.cb, this.ca) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return azm.h($$0, this.cd, this.cc);
   }

   @Override
   public void g(@Nullable bxc $$0) {
      if (this.gE() && $$0 == null) {
         this.B(false);
      }

      super.g($$0);
   }

   void gF() {
      this.C(false);
   }

   void gG() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gH() {
      return !this.fQ() && !this.x() && !this.gq();
   }

   @Override
   public void T() {
      awm $$0 = this.u();
      if ($$0 == awn.jM) {
         this.a($$0, 2.0F, this.fe());
      } else {
         super.T();
      }
   }

   @Nullable
   @Override
   protected awm u() {
      if (this.fQ()) {
         return awn.jN;
      } else {
         if (!this.dV().V() && this.ae.i() < 0.1F) {
            List<cqy> $$0 = this.dV().a(cqy.class, this.cR().c(16.0, 16.0, 16.0), bwk.f);
            if ($$0.isEmpty()) {
               return awn.jM;
            }
         }

         return awn.jH;
      }
   }

   @Nullable
   @Override
   protected awm e(bus $$0) {
      return awn.jL;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.jJ;
   }

   boolean j(bxc $$0) {
      return this.gD().anyMatch($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(arq $$0, bus $$1) {
      cyy $$2 = this.a(bwn.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(bwn.a, cyy.k);
      }

      super.b($$0, $$1);
   }

   public static boolean a(cjf $$0, bxc $$1) {
      double $$2 = $$1.dG() - $$0.dG();
      double $$3 = $$1.dA() - $$0.dA();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dV().a_(iu.a($$0.dA() + $$8, $$0.dC() + (double)$$9, $$0.dG() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public fei cT() {
      return new fei(0.0, (double)(0.55F * this.cS()), (double)(this.dq() * 0.4F));
   }

   class a extends cfr<bxc> {
      @Nullable
      private bxc j;
      @Nullable
      private bxc k;
      private int l;

      public a(final Class<bxc> $$0, final boolean $$1, final boolean $$2, @Nullable final chr.a $$3) {
         super(cjf.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dY().a(this.b) != 0) {
            return false;
         } else {
            arq $$0 = a(cjf.this.dV());

            for (bwj<bxc> $$1 : cjf.this.gD().toList()) {
               bxc $$2 = $$1.a($$0, bxc.class);
               if ($$2 != null) {
                  this.k = $$2;
                  this.j = $$2.eq();
                  int $$3 = $$2.es();
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
            this.l = this.k.es();
         }

         cjf.this.a(awn.jG, 1.0F, 1.0F);
         cjf.this.B(true);
         cjf.this.gF();
         super.d();
      }
   }

   class b extends cdy {
      int a;

      public b() {
         this.a(EnumSet.of(cdy.a.b, cdy.a.c, cdy.a.a));
      }

      @Override
      public boolean b() {
         return cjf.this.gq();
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
         cjf.this.A(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements chr.a {
      @Override
      public boolean test(bxc $$0, arq $$1) {
         if ($$0 instanceof cjf) {
            return false;
         } else if ($$0 instanceof ciy || $$0 instanceof cjq || $$0 instanceof cnz) {
            return true;
         } else if ($$0 instanceof bxy) {
            return !((bxy)$$0).q();
         } else {
            if ($$0 instanceof cqy $$2 && ($$2.U_() || $$2.b())) {
               return false;
            }

            return cjf.this.j($$0) ? false : !$$0.fQ() && !$$0.cg();
         }
      }
   }

   abstract class d extends cdy {
      private final chr b = chr.a().a(12.0).d().a(cjf.this.new c());

      protected boolean h() {
         iu $$0 = iu.a(cjf.this.dA(), cjf.this.cR().e, cjf.this.dG());
         return !cjf.this.dV().h($$0) && cjf.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(cjf.this.dV()).a(bxc.class, this.b, cjf.this, cjf.this.cR().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cdk {
      public e(final double $$0) {
         super(cjf.this, $$0);
      }

      @Override
      public void d() {
         ((cjf)this.a).gG();
         ((cjf)this.c).gG();
         super.d();
      }

      @Override
      protected void g() {
         arq $$0 = this.b;
         cjf $$1 = (cjf)this.a.a($$0, (bvt)this.c);
         if ($$1 != null) {
            arr $$2 = this.a.gz();
            arr $$3 = this.c.gz();
            arr $$4 = $$2;
            if ($$2 != null) {
               $$1.i($$2);
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.i($$3);
            }

            if ($$4 != null) {
               $$4.a(awx.P);
               ap.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gB();
            this.c.gB();
            $$1.c_(-24000);
            $$1.b(this.a.dA(), this.a.dC(), this.a.dG(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if ($$0.O().c(dir.f)) {
               this.b.b(new bwr(this.b, this.a.dA(), this.a.dC(), this.a.dG(), this.a.dY().a(7) + 1));
            }
         }
      }
   }

   public class f extends cel {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cjf.this, $$1, $$2, $$3);
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
      protected boolean a(diy $$0, iu $$1) {
         dzz $$2 = $$0.a_($$1);
         return $$2.a(dmc.oL) && $$2.c(dul.c) >= 2 || dmx.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cjf.this.ae.i() < 0.05F) {
            cjf.this.a(awn.jO, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(cjf.this.dV()).O().c(dir.c)) {
            dzz $$0 = cjf.this.dV().a_(this.e);
            if ($$0.a(dmc.oL)) {
               this.b($$0);
            } else if (dmx.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dzz $$0) {
         dmx.a(cjf.this, $$0, cjf.this.dV(), this.e);
      }

      private void b(dzz $$0) {
         int $$1 = $$0.c(dul.c);
         $$0.b(dul.c, Integer.valueOf(1));
         int $$2 = 1 + cjf.this.dV().A.a(2) + ($$1 == 3 ? 1 : 0);
         cyy $$3 = cjf.this.a(bwn.a);
         if ($$3.f()) {
            cjf.this.a(bwn.a, new cyy(czc.xB));
            $$2--;
         }

         if ($$2 > 0) {
            dma.a(cjf.this.dV(), this.e, new cyy(czc.xB, $$2));
         }

         cjf.this.a(awn.At, 1.0F, 1.0F);
         cjf.this.dV().a(this.e, $$0.b(dul.c, Integer.valueOf(1)), 2);
         cjf.this.dV().a(eez.c, this.e, eez.a.a(cjf.this));
      }

      @Override
      public boolean b() {
         return !cjf.this.fQ() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         cjf.this.w(false);
         super.d();
      }
   }

   class g extends cds {
      public g() {
         super(cjf.this);
      }

      @Override
      public void d() {
         super.d();
         cjf.this.gG();
      }

      @Override
      public boolean b() {
         return cjf.this.bj() && cjf.this.b(axh.a) > 0.25 || cjf.this.bw();
      }
   }

   static class h extends cdx {
      private final cjf d;

      public h(cjf $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gE() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gE() && super.c();
      }

      @Override
      public void d() {
         this.d.gG();
         super.d();
      }
   }

   public static class i extends bvt.a {
      public final cjf.v a;

      public i(cjf.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends ceg {
      public j(final bxe $$0, final Class<? extends bxc> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !cjf.this.gq() && !cjf.this.gu();
      }

      @Override
      public boolean c() {
         return super.c() && !cjf.this.gq() && !cjf.this.gu();
      }
   }

   public class k extends cda {
      public k() {
         super(cjf.this);
      }

      @Override
      public void a() {
         if (!cjf.this.fQ()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cjf.this.gr() && !cjf.this.ci() && !cjf.this.gu() && !cjf.this.gq();
      }
   }

   class l extends cei {
      public l(final double $$0, final boolean $$1) {
         super(cjf.this, $$0, $$1);
      }

      @Override
      protected void a(bxc $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cjf.this.a(awn.jI, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         cjf.this.z(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !cjf.this.x() && !cjf.this.fQ() && !cjf.this.ci() && !cjf.this.gq() && super.b();
      }
   }

   class m extends cdb {
      public m() {
         super(cjf.this);
      }

      @Override
      public void a() {
         if (cjf.this.gH()) {
            super.a();
         }
      }
   }

   class n extends cer {
      public n(final double $$0) {
         super(cjf.this, $$0);
      }

      @Override
      public boolean h() {
         return !cjf.this.gE() && super.h();
      }
   }

   public class o extends cec {
      @Override
      public boolean b() {
         if (!cjf.this.gt()) {
            return false;
         } else {
            bxc $$0 = cjf.this.f();
            if ($$0 != null && $$0.bK()) {
               if ($$0.cP() != $$0.cO()) {
                  return false;
               } else {
                  boolean $$1 = cjf.a(cjf.this, $$0);
                  if (!$$1) {
                     cjf.this.O().a($$0, 0);
                     cjf.this.y(false);
                     cjf.this.z(false);
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
         bxc $$0 = cjf.this.f();
         if ($$0 != null && $$0.bK()) {
            double $$1 = cjf.this.dy().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cjf.this.dN()) < 15.0F) || !cjf.this.aJ()) && !cjf.this.gq();
         } else {
            return false;
         }
      }

      @Override
      public boolean P_() {
         return false;
      }

      @Override
      public void d() {
         cjf.this.s(true);
         cjf.this.x(true);
         cjf.this.z(false);
         bxc $$0 = cjf.this.f();
         if ($$0 != null) {
            cjf.this.J().a($$0, 60.0F, 30.0F);
            fei $$1 = new fei($$0.dA() - cjf.this.dA(), $$0.dC() - cjf.this.dC(), $$0.dG() - cjf.this.dG()).d();
            cjf.this.i(cjf.this.dy().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         cjf.this.O().m();
      }

      @Override
      public void e() {
         cjf.this.y(false);
         cjf.this.cc = 0.0F;
         cjf.this.cd = 0.0F;
         cjf.this.z(false);
         cjf.this.x(false);
      }

      @Override
      public void a() {
         bxc $$0 = cjf.this.f();
         if ($$0 != null) {
            cjf.this.J().a($$0, 60.0F, 30.0F);
         }

         if (!cjf.this.gq()) {
            fei $$1 = cjf.this.dy();
            if ($$1.e * $$1.e < 0.03F && cjf.this.dN() != 0.0F) {
               cjf.this.x(azm.i(0.2F, cjf.this.dN(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               cjf.this.x((float)$$3);
            }
         }

         if ($$0 != null && cjf.this.f($$0) <= 2.0F) {
            cjf.this.c(a(cjf.this.dV()), $$0);
         } else if (cjf.this.dN() > 0.0F && cjf.this.aJ() && (float)cjf.this.dy().e != 0.0F && cjf.this.dV().a_(cjf.this.dv()).a(dmc.eb)) {
            cjf.this.x(60.0F);
            cjf.this.g(null);
            cjf.this.A(true);
         }
      }
   }

   class p extends cdy {
      public p() {
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public boolean b() {
         if (!cjf.this.a(bwn.a).f()) {
            return false;
         } else if (cjf.this.f() != null || cjf.this.eq() != null) {
            return false;
         } else if (!cjf.this.gH()) {
            return false;
         } else if (cjf.this.dY().a(b(10)) != 0) {
            return false;
         } else {
            List<cnd> $$0 = cjf.this.dV().a(cnd.class, cjf.this.cR().c(8.0, 8.0, 8.0), cjf.bR);
            return !$$0.isEmpty() && cjf.this.a(bwn.a).f();
         }
      }

      @Override
      public void a() {
         List<cnd> $$0 = cjf.this.dV().a(cnd.class, cjf.this.cR().c(8.0, 8.0, 8.0), cjf.bR);
         cyy $$1 = cjf.this.a(bwn.a);
         if ($$1.f() && !$$0.isEmpty()) {
            cjf.this.O().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<cnd> $$0 = cjf.this.dV().a(cnd.class, cjf.this.cR().c(8.0, 8.0, 8.0), cjf.bR);
         if (!$$0.isEmpty()) {
            cjf.this.O().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cfe {
      public q(final int $$0, final int $$1) {
         super(cjf.this, $$1);
      }

      @Override
      public void d() {
         cjf.this.gG();
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
         return !cjf.this.fQ() && !cjf.this.x() && !cjf.this.gE() && cjf.this.f() == null;
      }
   }

   class r extends cjf.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cdy.a.a, cdy.a.b));
      }

      @Override
      public boolean b() {
         return cjf.this.eq() == null
            && cjf.this.dY().i() < 0.02F
            && !cjf.this.fQ()
            && cjf.this.f() == null
            && cjf.this.O().k()
            && !this.i()
            && !cjf.this.gr()
            && !cjf.this.ci();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + cjf.this.dY().a(3);
         cjf.this.w(true);
         cjf.this.O().m();
      }

      @Override
      public void e() {
         cjf.this.w(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cjf.this.J().a(cjf.this.dA() + this.c, cjf.this.dE(), cjf.this.dG() + this.d, (float)cjf.this.ad(), (float)cjf.this.ac());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cjf.this.dY().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cjf.this.dY().a(20));
      }
   }

   class s extends cdr {
      private int c = b(100);

      public s(final double $$0) {
         super(cjf.this, $$0);
      }

      @Override
      public boolean b() {
         if (!cjf.this.fQ() && this.a.f() == null) {
            if (cjf.this.dV().ag() && cjf.this.dV().h(this.a.dv())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               iu $$0 = this.a.dv();
               return cjf.this.dV().V() && cjf.this.dV().h($$0) && !((arq)cjf.this.dV()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         cjf.this.gG();
         super.d();
      }
   }

   class t extends cjf.d {
      private static final int c = b(140);
      private int d = cjf.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(cdy.a.a, cdy.a.b, cdy.a.c));
      }

      @Override
      public boolean b() {
         return cjf.this.bg == 0.0F && cjf.this.bh == 0.0F && cjf.this.bi == 0.0F ? this.k() || cjf.this.fQ() : false;
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
            return cjf.this.dV().V() && this.h() && !this.i() && !cjf.this.av;
         }
      }

      @Override
      public void e() {
         this.d = cjf.this.ae.a(c);
         cjf.this.gG();
      }

      @Override
      public void d() {
         cjf.this.w(false);
         cjf.this.y(false);
         cjf.this.z(false);
         cjf.this.s(false);
         cjf.this.C(true);
         cjf.this.O().m();
         cjf.this.L().a(cjf.this.dA(), cjf.this.dC(), cjf.this.dG(), 0.0);
      }
   }

   class u extends cdy {
      public u() {
         this.a(EnumSet.of(cdy.a.a, cdy.a.b));
      }

      @Override
      public boolean b() {
         if (cjf.this.fQ()) {
            return false;
         } else {
            bxc $$0 = cjf.this.f();
            return $$0 != null && $$0.bK() && cjf.bT.test($$0) && cjf.this.g($$0) > 36.0 && !cjf.this.ci() && !cjf.this.gu() && !cjf.this.bf;
         }
      }

      @Override
      public void d() {
         cjf.this.w(false);
         cjf.this.A(false);
      }

      @Override
      public void e() {
         bxc $$0 = cjf.this.f();
         if ($$0 != null && cjf.a(cjf.this, $$0)) {
            cjf.this.z(true);
            cjf.this.y(true);
            cjf.this.O().m();
            cjf.this.J().a($$0, (float)cjf.this.ad(), (float)cjf.this.ac());
         } else {
            cjf.this.z(false);
            cjf.this.y(false);
         }
      }

      @Override
      public void a() {
         bxc $$0 = cjf.this.f();
         if ($$0 != null) {
            cjf.this.J().a($$0, (float)cjf.this.ad(), (float)cjf.this.ac());
            if (cjf.this.g($$0) <= 36.0) {
               cjf.this.z(true);
               cjf.this.y(true);
               cjf.this.O().m();
            } else {
               cjf.this.O().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements bak {
      a(0, "red"),
      b(1, "snow");

      public static final bak.a<cjf.v> c = bak.a(cjf.v::values);
      private static final IntFunction<cjf.v> e = ayc.a(cjf.v::a, values(), ayc.a.a);
      public static final yw<ByteBuf, cjf.v> d = yu.a(e, cjf.v::a);
      private final int f;
      private final String g;

      private v(final int $$0, final String $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.g;
      }

      public int a() {
         return this.f;
      }

      public static cjf.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cjf.v a(int $$0) {
         return e.apply($$0);
      }

      public static cjf.v a(je<djy> $$0) {
         return $$0.a(axb.at) ? b : a;
      }
   }
}
