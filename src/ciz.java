import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ciz extends cio {
   private static final akh<Integer> bJ = akl.a(ciz.class, akj.b);
   private static final akh<Byte> bK = akl.a(ciz.class, akj.a);
   private static final int bL = 1;
   public static final int bF = 4;
   public static final int bG = 8;
   public static final int bH = 16;
   private static final int bM = 32;
   private static final int bN = 64;
   private static final int bO = 128;
   private static final akh<Optional<bwg<bwz>>> bP = akl.a(ciz.class, akj.r);
   private static final akh<Optional<bwg<bwz>>> bQ = akl.a(ciz.class, akj.r);
   static final Predicate<cmx> bR = $$0 -> !$$0.o() && $$0.bK();
   private static final Predicate<bwa> bS = $$0 -> !($$0 instanceof bwz $$1) ? false : $$1.et() != null && $$1.eu() < $$1.af + 600;
   static final Predicate<bwa> bT = $$0 -> $$0 instanceof ciu || $$0 instanceof cjk;
   private static final Predicate<bwa> bU = $$0 -> !$$0.cg() && bwh.e.test($$0);
   private static final int bV = 600;
   private static final bwd bW = bwj.aa.n().a(0.5F).b(0.2975F);
   private cdv bX;
   private cdv bY;
   private cdv bZ;
   private float ca;
   private float cb;
   float cc;
   float cd;
   private int ce;

   public ciz(bwj<? extends ciz> $$0, dip $$1) {
      super($$0, $$1);
      this.by = new ciz.k();
      this.bz = new ciz.m();
      this.a(ewm.p, 0.0F);
      this.a(ewm.q, 0.0F);
      this.a_(true);
      this.O().a(32.0F);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bP, Optional.empty());
      $$0.a(bQ, Optional.empty());
      $$0.a(bJ, 0);
      $$0.a(bK, (byte)0);
   }

   @Override
   protected void D() {
      this.bX = new cfo<>(this, cio.class, 10, false, false, ($$0, $$1) -> $$0 instanceof ciu || $$0 instanceof cjk);
      this.bY = new cfo<>(this, cjs.class, 10, false, false, cjs.bF);
      this.bZ = new cfo<>(this, cik.class, 20, false, false, ($$0, $$1) -> $$0 instanceof cim);
      this.bC.a(0, new ciz.g());
      this.bC.a(0, new cdk(this, this.dV()));
      this.bC.a(1, new ciz.b());
      this.bC.a(2, new ciz.n(2.2));
      this.bC.a(3, new ciz.e(1.0));
      this.bC.a(4, new cdc<>(this, cqs.class, 16.0F, 1.6, 1.4, $$0 -> bU.test($$0) && !this.j($$0) && !this.gE()));
      this.bC.a(4, new cdc<>(this, cju.class, 8.0F, 1.6, 1.4, $$0 -> !((cju)$$0).q() && !this.gE()));
      this.bC.a(4, new cdc<>(this, cji.class, 8.0F, 1.6, 1.4, $$0 -> !this.gE()));
      this.bC.a(5, new ciz.u());
      this.bC.a(6, new ciz.o());
      this.bC.a(6, new ciz.s(1.25));
      this.bC.a(7, new ciz.l(1.2F, true));
      this.bC.a(7, new ciz.t());
      this.bC.a(8, new ciz.h(this, 1.25));
      this.bC.a(9, new ciz.q(32, 200));
      this.bC.a(10, new ciz.f(1.2F, 12, 1));
      this.bC.a(10, new ceb(this, 0.4F));
      this.bC.a(11, new cfi(this, 1.0));
      this.bC.a(11, new ciz.p());
      this.bC.a(12, new ciz.j(this, cqs.class, 24.0F));
      this.bC.a(13, new ciz.r());
      this.bD.a(3, new ciz.a(bwz.class, false, false, ($$0, $$1) -> bS.test($$0) && !this.j($$0)));
   }

   @Override
   public void k_() {
      if (!this.dV().C && this.bK() && this.dj()) {
         this.ce++;
         cys $$0 = this.a(bwk.a);
         if (this.j($$0)) {
            if (this.ce > 600) {
               cys $$1 = $$0.a(this.dV(), this);
               if (!$$1.f()) {
                  this.a(bwk.a, $$1);
               }

               this.ce = 0;
            } else if (this.ce > 560 && this.ae.i() < 0.1F) {
               this.gw();
               this.dV().a(this, (byte)45);
            }
         }

         bwz $$2 = this.f();
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
         this.a(awl.jF, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean ff() {
      return this.eG();
   }

   private boolean j(cys $$0) {
      return $$0.c(kj.v) && this.f() == null && this.aJ() && !this.fQ();
   }

   @Override
   protected void a(azt $$0, btw $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cys $$3;
         if ($$2 < 0.05F) {
            $$3 = new cys(cyw.pj);
         } else if ($$2 < 0.2F) {
            $$3 = new cys(cyw.rC);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cys(cyw.vH) : new cys(cyw.vI);
         } else if ($$2 < 0.6F) {
            $$3 = new cys(cyw.qf);
         } else if ($$2 < 0.8F) {
            $$3 = new cys(cyw.ro);
         } else {
            $$3 = new cys(cyw.qc);
         }

         this.a(bwk.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cys $$1 = this.a(bwk.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               fdw $$3 = new fdw(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dN() * (float) (Math.PI / 180.0))
                  .b(-this.dL() * (float) (Math.PI / 180.0));
               this.dV().a(new lt(lx.U, $$1), this.dA() + this.bT().d / 2.0, this.dC(), this.dG() + this.bT().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bye.a q() {
      return cio.gv().a(byf.v, 0.3F).a(byf.s, 10.0).a(byf.c, 2.0).a(byf.x, 5.0).a(byf.m, 32.0);
   }

   @Nullable
   public ciz b(aro $$0, bvq $$1) {
      ciz $$2 = bwj.aa.a($$0, bwi.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((ciz)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bwj<ciz> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return $$1.a_($$3.e()).a(axa.ch) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      je<djs> $$4 = $$0.u(this.dv());
      ciz.v $$5 = ciz.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof ciz.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new ciz.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof aro) {
         this.gC();
      }

      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gC() {
      if (this.t() == ciz.v.a) {
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
      this.a(awl.jJ, 1.0F, 1.0F);
   }

   @Override
   public bwd e(bxl $$0) {
      return this.n_() ? bW : super.e($$0);
   }

   public ciz.v t() {
      return ciz.v.a(this.al.a(bJ));
   }

   private void a(ciz.v $$0) {
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

   Stream<bwg<bwz>> gD() {
      return Stream.concat(this.al.a(bP).stream(), this.al.a(bQ).stream());
   }

   void i(bwz $$0) {
      this.a(new bwg<>($$0));
   }

   private void a(bwg<bwz> $$0) {
      if (this.al.a(bP).isPresent()) {
         this.al.a(bQ, Optional.of($$0));
      } else {
         this.al.a(bP, Optional.of($$0));
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      Stream<UUID> $$1 = this.gD().map(bwg::c);
      ud $$2 = new ud();
      $$1.forEach($$1x -> $$2.add(um.a($$1x)));
      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fQ());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.x());
      $$0.a("Crouching", this.ci());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);

      for (uu $$2 : $$0.c("Trusted", 11)) {
         this.a(new bwg<>(um.a($$2)));
      }

      this.C($$0.q("Sleeping"));
      this.a(ciz.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dV() instanceof aro) {
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
   protected boolean f(bwk $$0) {
      return $$0 == bwk.a && this.fM();
   }

   @Override
   public boolean h(cys $$0) {
      cys $$1 = this.a(bwk.a);
      return $$1.f() || this.ce > 0 && $$0.c(kj.v) && !$$1.c(kj.v);
   }

   private void l(cys $$0) {
      if (!$$0.f() && !this.dV().C) {
         cmx $$1 = new cmx(this.dV(), this.dA() + this.bT().d, this.dC() + 1.0, this.dG() + this.bT().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awl.jO, 1.0F, 1.0F);
         this.dV().b($$1);
      }
   }

   private void m(cys $$0) {
      cmx $$1 = new cmx(this.dV(), this.dA(), this.dC(), this.dG(), $$0);
      this.dV().b($$1);
   }

   @Override
   protected void a(aro $$0, cmx $$1) {
      cys $$2 = $$1.f();
      if (this.h($$2)) {
         int $$3 = $$2.M();
         if ($$3 > 1) {
            this.m($$2.a($$3 - 1));
         }

         this.l(this.a(bwk.a));
         this.a($$1);
         this.a(bwk.a, $$2.a(1));
         this.g(bwk.a);
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
            dzo $$2 = this.dV().a_($$1);
            this.dV().c(2001, $$1, dlu.j($$2));
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
   public boolean k(cys $$0) {
      return $$0.a(axi.ac);
   }

   @Override
   protected void a(cqs $$0, bxb $$1) {
      ((ciz)$$1).i($$0);
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
      return azk.h($$0, this.cb, this.ca) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return azk.h($$0, this.cd, this.cc);
   }

   @Override
   public void g(@Nullable bwz $$0) {
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
      awk $$0 = this.u();
      if ($$0 == awl.jL) {
         this.a($$0, 2.0F, this.fe());
      } else {
         super.T();
      }
   }

   @Nullable
   @Override
   protected awk u() {
      if (this.fQ()) {
         return awl.jM;
      } else {
         if (!this.dV().V() && this.ae.i() < 0.1F) {
            List<cqs> $$0 = this.dV().a(cqs.class, this.cR().c(16.0, 16.0, 16.0), bwh.f);
            if ($$0.isEmpty()) {
               return awl.jL;
            }
         }

         return awl.jG;
      }
   }

   @Nullable
   @Override
   protected awk e(bup $$0) {
      return awl.jK;
   }

   @Nullable
   @Override
   protected awk l_() {
      return awl.jI;
   }

   boolean j(bwz $$0) {
      return this.gD().anyMatch($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(aro $$0, bup $$1) {
      cys $$2 = this.a(bwk.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(bwk.a, cys.k);
      }

      super.b($$0, $$1);
   }

   public static boolean a(ciz $$0, bwz $$1) {
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
   public fdw cT() {
      return new fdw(0.0, (double)(0.55F * this.cS()), (double)(this.dq() * 0.4F));
   }

   class a extends cfo<bwz> {
      @Nullable
      private bwz j;
      @Nullable
      private bwz k;
      private int l;

      public a(final Class<bwz> $$0, final boolean $$1, final boolean $$2, @Nullable final cho.a $$3) {
         super(ciz.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dY().a(this.b) != 0) {
            return false;
         } else {
            aro $$0 = a(ciz.this.dV());

            for (bwg<bwz> $$1 : ciz.this.gD().toList()) {
               bwz $$2 = $$1.a($$0, bwz.class);
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

         ciz.this.a(awl.jF, 1.0F, 1.0F);
         ciz.this.B(true);
         ciz.this.gF();
         super.d();
      }
   }

   class b extends cdv {
      int a;

      public b() {
         this.a(EnumSet.of(cdv.a.b, cdv.a.c, cdv.a.a));
      }

      @Override
      public boolean b() {
         return ciz.this.gq();
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
         ciz.this.A(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements cho.a {
      @Override
      public boolean test(bwz $$0, aro $$1) {
         if ($$0 instanceof ciz) {
            return false;
         } else if ($$0 instanceof ciu || $$0 instanceof cjk || $$0 instanceof cnt) {
            return true;
         } else if ($$0 instanceof bxv) {
            return !((bxv)$$0).q();
         } else {
            if ($$0 instanceof cqs $$2 && ($$2.U_() || $$2.b())) {
               return false;
            }

            return ciz.this.j($$0) ? false : !$$0.fQ() && !$$0.cg();
         }
      }
   }

   abstract class d extends cdv {
      private final cho b = cho.a().a(12.0).d().a(ciz.this.new c());

      protected boolean h() {
         iu $$0 = iu.a(ciz.this.dA(), ciz.this.cR().e, ciz.this.dG());
         return !ciz.this.dV().h($$0) && ciz.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(ciz.this.dV()).a(bwz.class, this.b, ciz.this, ciz.this.cR().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cdh {
      public e(final double $$0) {
         super(ciz.this, $$0);
      }

      @Override
      public void d() {
         ((ciz)this.a).gG();
         ((ciz)this.c).gG();
         super.d();
      }

      @Override
      protected void g() {
         aro $$0 = this.b;
         ciz $$1 = (ciz)this.a.a($$0, (bvq)this.c);
         if ($$1 != null) {
            arp $$2 = this.a.gz();
            arp $$3 = this.c.gz();
            arp $$4 = $$2;
            if ($$2 != null) {
               $$1.i($$2);
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.i($$3);
            }

            if ($$4 != null) {
               $$4.a(awv.P);
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
            if ($$0.O().c(dil.f)) {
               this.b.b(new bwo(this.b, this.a.dA(), this.a.dC(), this.a.dG(), this.a.dY().a(7) + 1));
            }
         }
      }
   }

   public class f extends cei {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(ciz.this, $$1, $$2, $$3);
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
      protected boolean a(dis $$0, iu $$1) {
         dzo $$2 = $$0.a_($$1);
         return $$2.a(dlw.oK) && $$2.c(dud.c) >= 2 || dmr.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && ciz.this.ae.i() < 0.05F) {
            ciz.this.a(awl.jN, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(ciz.this.dV()).O().c(dil.c)) {
            dzo $$0 = ciz.this.dV().a_(this.e);
            if ($$0.a(dlw.oK)) {
               this.b($$0);
            } else if (dmr.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dzo $$0) {
         dmr.a(ciz.this, $$0, ciz.this.dV(), this.e);
      }

      private void b(dzo $$0) {
         int $$1 = $$0.c(dud.c);
         $$0.b(dud.c, Integer.valueOf(1));
         int $$2 = 1 + ciz.this.dV().A.a(2) + ($$1 == 3 ? 1 : 0);
         cys $$3 = ciz.this.a(bwk.a);
         if ($$3.f()) {
            ciz.this.a(bwk.a, new cys(cyw.xz));
            $$2--;
         }

         if ($$2 > 0) {
            dlu.a(ciz.this.dV(), this.e, new cys(cyw.xz, $$2));
         }

         ciz.this.a(awl.Aq, 1.0F, 1.0F);
         ciz.this.dV().a(this.e, $$0.b(dud.c, Integer.valueOf(1)), 2);
         ciz.this.dV().a(eeo.c, this.e, eeo.a.a(ciz.this));
      }

      @Override
      public boolean b() {
         return !ciz.this.fQ() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         ciz.this.w(false);
         super.d();
      }
   }

   class g extends cdp {
      public g() {
         super(ciz.this);
      }

      @Override
      public void d() {
         super.d();
         ciz.this.gG();
      }

      @Override
      public boolean b() {
         return ciz.this.bj() && ciz.this.b(axf.a) > 0.25 || ciz.this.bw();
      }
   }

   static class h extends cdu {
      private final ciz d;

      public h(ciz $$0, double $$1) {
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

   public static class i extends bvq.a {
      public final ciz.v a;

      public i(ciz.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends ced {
      public j(final bxb $$0, final Class<? extends bwz> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !ciz.this.gq() && !ciz.this.gu();
      }

      @Override
      public boolean c() {
         return super.c() && !ciz.this.gq() && !ciz.this.gu();
      }
   }

   public class k extends ccx {
      public k() {
         super(ciz.this);
      }

      @Override
      public void a() {
         if (!ciz.this.fQ()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !ciz.this.gr() && !ciz.this.ci() && !ciz.this.gu() && !ciz.this.gq();
      }
   }

   class l extends cef {
      public l(final double $$0, final boolean $$1) {
         super(ciz.this, $$0, $$1);
      }

      @Override
      protected void a(bwz $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            ciz.this.a(awl.jH, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         ciz.this.z(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !ciz.this.x() && !ciz.this.fQ() && !ciz.this.ci() && !ciz.this.gq() && super.b();
      }
   }

   class m extends ccy {
      public m() {
         super(ciz.this);
      }

      @Override
      public void a() {
         if (ciz.this.gH()) {
            super.a();
         }
      }
   }

   class n extends ceo {
      public n(final double $$0) {
         super(ciz.this, $$0);
      }

      @Override
      public boolean h() {
         return !ciz.this.gE() && super.h();
      }
   }

   public class o extends cdz {
      @Override
      public boolean b() {
         if (!ciz.this.gt()) {
            return false;
         } else {
            bwz $$0 = ciz.this.f();
            if ($$0 != null && $$0.bK()) {
               if ($$0.cP() != $$0.cO()) {
                  return false;
               } else {
                  boolean $$1 = ciz.a(ciz.this, $$0);
                  if (!$$1) {
                     ciz.this.O().a($$0, 0);
                     ciz.this.y(false);
                     ciz.this.z(false);
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
         bwz $$0 = ciz.this.f();
         if ($$0 != null && $$0.bK()) {
            double $$1 = ciz.this.dy().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(ciz.this.dN()) < 15.0F) || !ciz.this.aJ()) && !ciz.this.gq();
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
         ciz.this.s(true);
         ciz.this.x(true);
         ciz.this.z(false);
         bwz $$0 = ciz.this.f();
         if ($$0 != null) {
            ciz.this.J().a($$0, 60.0F, 30.0F);
            fdw $$1 = new fdw($$0.dA() - ciz.this.dA(), $$0.dC() - ciz.this.dC(), $$0.dG() - ciz.this.dG()).d();
            ciz.this.i(ciz.this.dy().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         ciz.this.O().m();
      }

      @Override
      public void e() {
         ciz.this.y(false);
         ciz.this.cc = 0.0F;
         ciz.this.cd = 0.0F;
         ciz.this.z(false);
         ciz.this.x(false);
      }

      @Override
      public void a() {
         bwz $$0 = ciz.this.f();
         if ($$0 != null) {
            ciz.this.J().a($$0, 60.0F, 30.0F);
         }

         if (!ciz.this.gq()) {
            fdw $$1 = ciz.this.dy();
            if ($$1.e * $$1.e < 0.03F && ciz.this.dN() != 0.0F) {
               ciz.this.x(azk.i(0.2F, ciz.this.dN(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               ciz.this.x((float)$$3);
            }
         }

         if ($$0 != null && ciz.this.f($$0) <= 2.0F) {
            ciz.this.c(a(ciz.this.dV()), $$0);
         } else if (ciz.this.dN() > 0.0F && ciz.this.aJ() && (float)ciz.this.dy().e != 0.0F && ciz.this.dV().a_(ciz.this.dv()).a(dlw.ea)) {
            ciz.this.x(60.0F);
            ciz.this.g(null);
            ciz.this.A(true);
         }
      }
   }

   class p extends cdv {
      public p() {
         this.a(EnumSet.of(cdv.a.a));
      }

      @Override
      public boolean b() {
         if (!ciz.this.a(bwk.a).f()) {
            return false;
         } else if (ciz.this.f() != null || ciz.this.eq() != null) {
            return false;
         } else if (!ciz.this.gH()) {
            return false;
         } else if (ciz.this.dY().a(b(10)) != 0) {
            return false;
         } else {
            List<cmx> $$0 = ciz.this.dV().a(cmx.class, ciz.this.cR().c(8.0, 8.0, 8.0), ciz.bR);
            return !$$0.isEmpty() && ciz.this.a(bwk.a).f();
         }
      }

      @Override
      public void a() {
         List<cmx> $$0 = ciz.this.dV().a(cmx.class, ciz.this.cR().c(8.0, 8.0, 8.0), ciz.bR);
         cys $$1 = ciz.this.a(bwk.a);
         if ($$1.f() && !$$0.isEmpty()) {
            ciz.this.O().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<cmx> $$0 = ciz.this.dV().a(cmx.class, ciz.this.cR().c(8.0, 8.0, 8.0), ciz.bR);
         if (!$$0.isEmpty()) {
            ciz.this.O().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cfb {
      public q(final int $$0, final int $$1) {
         super(ciz.this, $$1);
      }

      @Override
      public void d() {
         ciz.this.gG();
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
         return !ciz.this.fQ() && !ciz.this.x() && !ciz.this.gE() && ciz.this.f() == null;
      }
   }

   class r extends ciz.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cdv.a.a, cdv.a.b));
      }

      @Override
      public boolean b() {
         return ciz.this.eq() == null
            && ciz.this.dY().i() < 0.02F
            && !ciz.this.fQ()
            && ciz.this.f() == null
            && ciz.this.O().k()
            && !this.i()
            && !ciz.this.gr()
            && !ciz.this.ci();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + ciz.this.dY().a(3);
         ciz.this.w(true);
         ciz.this.O().m();
      }

      @Override
      public void e() {
         ciz.this.w(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         ciz.this.J().a(ciz.this.dA() + this.c, ciz.this.dE(), ciz.this.dG() + this.d, (float)ciz.this.ad(), (float)ciz.this.ac());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * ciz.this.dY().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + ciz.this.dY().a(20));
      }
   }

   class s extends cdo {
      private int c = b(100);

      public s(final double $$0) {
         super(ciz.this, $$0);
      }

      @Override
      public boolean b() {
         if (!ciz.this.fQ() && this.a.f() == null) {
            if (ciz.this.dV().ag() && ciz.this.dV().h(this.a.dv())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               iu $$0 = this.a.dv();
               return ciz.this.dV().V() && ciz.this.dV().h($$0) && !((aro)ciz.this.dV()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         ciz.this.gG();
         super.d();
      }
   }

   class t extends ciz.d {
      private static final int c = b(140);
      private int d = ciz.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(cdv.a.a, cdv.a.b, cdv.a.c));
      }

      @Override
      public boolean b() {
         return ciz.this.bg == 0.0F && ciz.this.bh == 0.0F && ciz.this.bi == 0.0F ? this.k() || ciz.this.fQ() : false;
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
            return ciz.this.dV().V() && this.h() && !this.i() && !ciz.this.av;
         }
      }

      @Override
      public void e() {
         this.d = ciz.this.ae.a(c);
         ciz.this.gG();
      }

      @Override
      public void d() {
         ciz.this.w(false);
         ciz.this.y(false);
         ciz.this.z(false);
         ciz.this.s(false);
         ciz.this.C(true);
         ciz.this.O().m();
         ciz.this.L().a(ciz.this.dA(), ciz.this.dC(), ciz.this.dG(), 0.0);
      }
   }

   class u extends cdv {
      public u() {
         this.a(EnumSet.of(cdv.a.a, cdv.a.b));
      }

      @Override
      public boolean b() {
         if (ciz.this.fQ()) {
            return false;
         } else {
            bwz $$0 = ciz.this.f();
            return $$0 != null && $$0.bK() && ciz.bT.test($$0) && ciz.this.g($$0) > 36.0 && !ciz.this.ci() && !ciz.this.gu() && !ciz.this.bf;
         }
      }

      @Override
      public void d() {
         ciz.this.w(false);
         ciz.this.A(false);
      }

      @Override
      public void e() {
         bwz $$0 = ciz.this.f();
         if ($$0 != null && ciz.a(ciz.this, $$0)) {
            ciz.this.z(true);
            ciz.this.y(true);
            ciz.this.O().m();
            ciz.this.J().a($$0, (float)ciz.this.ad(), (float)ciz.this.ac());
         } else {
            ciz.this.z(false);
            ciz.this.y(false);
         }
      }

      @Override
      public void a() {
         bwz $$0 = ciz.this.f();
         if ($$0 != null) {
            ciz.this.J().a($$0, (float)ciz.this.ad(), (float)ciz.this.ac());
            if (ciz.this.g($$0) <= 36.0) {
               ciz.this.z(true);
               ciz.this.y(true);
               ciz.this.O().m();
            } else {
               ciz.this.O().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements bai {
      a(0, "red"),
      b(1, "snow");

      public static final bai.a<ciz.v> c = bai.a(ciz.v::values);
      private static final IntFunction<ciz.v> e = aya.a(ciz.v::a, values(), aya.a.a);
      public static final yu<ByteBuf, ciz.v> d = ys.a(e, ciz.v::a);
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

      public static ciz.v a(String $$0) {
         return c.a($$0, a);
      }

      public static ciz.v a(int $$0) {
         return e.apply($$0);
      }

      public static ciz.v a(je<djs> $$0) {
         return $$0.a(awz.at) ? b : a;
      }
   }
}
