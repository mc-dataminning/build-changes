import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ciq extends cig {
   private static final akg<Integer> bI = akk.a(ciq.class, aki.b);
   private static final akg<Byte> bJ = akk.a(ciq.class, aki.a);
   private static final int bK = 1;
   public static final int bE = 4;
   public static final int bF = 8;
   public static final int bG = 16;
   private static final int bL = 32;
   private static final int bM = 64;
   private static final int bN = 128;
   private static final akg<Optional<bvy<bwr>>> bO = akk.a(ciq.class, aki.r);
   private static final akg<Optional<bvy<bwr>>> bP = akk.a(ciq.class, aki.r);
   static final Predicate<cmn> bQ = $$0 -> !$$0.o() && $$0.bK();
   private static final Predicate<bvs> bR = $$0 -> !($$0 instanceof bwr $$1) ? false : $$1.et() != null && $$1.eu() < $$1.af + 600;
   static final Predicate<bvs> bS = $$0 -> $$0 instanceof cil || $$0 instanceof cjc;
   private static final Predicate<bvs> bT = $$0 -> !$$0.cg() && bvz.e.test($$0);
   private static final int bU = 600;
   private static final bvv bV = bwb.aa.n().a(0.5F).b(0.2975F);
   private cdn bW;
   private cdn bX;
   private cdn bY;
   private float bZ;
   private float ca;
   float cb;
   float cc;
   private int cd;

   public ciq(bwb<? extends ciq> $$0, dhp $$1) {
      super($$0, $$1);
      this.bx = new ciq.k();
      this.by = new ciq.m();
      this.a(evk.p, 0.0F);
      this.a(evk.q, 0.0F);
      this.a_(true);
      this.O().a(32.0F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bO, Optional.empty());
      $$0.a(bP, Optional.empty());
      $$0.a(bI, 0);
      $$0.a(bJ, (byte)0);
   }

   @Override
   protected void D() {
      this.bW = new cfg<>(this, cig.class, 10, false, false, ($$0, $$1) -> $$0 instanceof cil || $$0 instanceof cjc);
      this.bX = new cfg<>(this, cjk.class, 10, false, false, cjk.bE);
      this.bY = new cfg<>(this, cic.class, 20, false, false, ($$0, $$1) -> $$0 instanceof cie);
      this.bB.a(0, new ciq.g());
      this.bB.a(0, new cdc(this, this.dV()));
      this.bB.a(1, new ciq.b());
      this.bB.a(2, new ciq.n(2.2));
      this.bB.a(3, new ciq.e(1.0));
      this.bB.a(4, new ccu<>(this, cqi.class, 16.0F, 1.6, 1.4, $$0 -> bT.test($$0) && !this.k($$0) && !this.gE()));
      this.bB.a(4, new ccu<>(this, cjm.class, 8.0F, 1.6, 1.4, $$0 -> !((cjm)$$0).q() && !this.gE()));
      this.bB.a(4, new ccu<>(this, cja.class, 8.0F, 1.6, 1.4, $$0 -> !this.gE()));
      this.bB.a(5, new ciq.u());
      this.bB.a(6, new ciq.o());
      this.bB.a(6, new ciq.s(1.25));
      this.bB.a(7, new ciq.l(1.2F, true));
      this.bB.a(7, new ciq.t());
      this.bB.a(8, new ciq.h(this, 1.25));
      this.bB.a(9, new ciq.q(32, 200));
      this.bB.a(10, new ciq.f(1.2F, 12, 1));
      this.bB.a(10, new cdt(this, 0.4F));
      this.bB.a(11, new cfa(this, 1.0));
      this.bB.a(11, new ciq.p());
      this.bB.a(12, new ciq.j(this, cqi.class, 24.0F));
      this.bB.a(13, new ciq.r());
      this.bC.a(3, new ciq.a(bwr.class, false, false, ($$0, $$1) -> bR.test($$0) && !this.k($$0)));
   }

   @Override
   public void k_() {
      if (!this.dV().C && this.bK() && this.dj()) {
         this.cd++;
         cxy $$0 = this.a(bwc.a);
         if (this.j($$0)) {
            if (this.cd > 600) {
               cxy $$1 = $$0.a(this.dV(), this);
               if (!$$1.f()) {
                  this.a(bwc.a, $$1);
               }

               this.cd = 0;
            } else if (this.cd > 560 && this.ae.i() < 0.1F) {
               this.gw();
               this.dV().a(this, (byte)45);
            }
         }

         bwr $$2 = this.f();
         if ($$2 == null || !$$2.bK()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fQ() || this.ff()) {
         this.be = false;
         this.bf = 0.0F;
         this.bh = 0.0F;
      }

      super.k_();
      if (this.gE() && this.ae.i() < 0.05F) {
         this.a(awk.jF, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean ff() {
      return this.eG();
   }

   private boolean j(cxy $$0) {
      return $$0.c(kx.w) && this.f() == null && this.aJ() && !this.fQ();
   }

   @Override
   protected void a(azs $$0, bto $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cxy $$3;
         if ($$2 < 0.05F) {
            $$3 = new cxy(cyc.pj);
         } else if ($$2 < 0.2F) {
            $$3 = new cxy(cyc.rC);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cxy(cyc.vH) : new cxy(cyc.vI);
         } else if ($$2 < 0.6F) {
            $$3 = new cxy(cyc.qf);
         } else if ($$2 < 0.8F) {
            $$3 = new cxy(cyc.ro);
         } else {
            $$3 = new cxy(cyc.qc);
         }

         this.a(bwc.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cxy $$1 = this.a(bwc.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               fcu $$3 = new fcu(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dN() * (float) (Math.PI / 180.0))
                  .b(-this.dL() * (float) (Math.PI / 180.0));
               this.dV().a(new lr(lv.U, $$1), this.dA() + this.bT().d / 2.0, this.dC(), this.dG() + this.bT().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bxw.a q() {
      return cig.gv().a(bxx.v, 0.3F).a(bxx.s, 10.0).a(bxx.c, 2.0).a(bxx.x, 5.0).a(bxx.m, 32.0);
   }

   @Nullable
   public ciq b(arn $$0, bvi $$1) {
      ciq $$2 = bwb.aa.a($$0, bwa.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((ciq)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bwb<ciq> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.a_($$3.e()).a(awz.ch) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      js<dis> $$4 = $$0.t(this.dv());
      ciq.v $$5 = ciq.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof ciq.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new ciq.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof arn) {
         this.gC();
      }

      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gC() {
      if (this.t() == ciq.v.a) {
         this.bC.a(4, this.bW);
         this.bC.a(4, this.bX);
         this.bC.a(6, this.bY);
      } else {
         this.bC.a(4, this.bY);
         this.bC.a(6, this.bW);
         this.bC.a(6, this.bX);
      }
   }

   @Override
   protected void gw() {
      this.a(awk.jJ, 1.0F, 1.0F);
   }

   @Override
   public bvv e(bxd $$0) {
      return this.n_() ? bV : super.e($$0);
   }

   public ciq.v t() {
      return ciq.v.a(this.al.a(bI));
   }

   private void a(ciq.v $$0) {
      this.al.a(bI, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      return $$0 == kx.av ? b((kw<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.av) {
         this.a(b(kx.av, $$1));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   Stream<bvy<bwr>> gD() {
      return Stream.concat(this.al.a(bO).stream(), this.al.a(bP).stream());
   }

   void j(bwr $$0) {
      this.a(new bvy<>($$0));
   }

   private void a(bvy<bwr> $$0) {
      if (this.al.a(bO).isPresent()) {
         this.al.a(bP, Optional.of($$0));
      } else {
         this.al.a(bO, Optional.of($$0));
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      Stream<UUID> $$1 = this.gD().map(bvy::c);
      uc $$2 = new uc();
      $$1.forEach($$1x -> $$2.add(ul.a($$1x)));
      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fQ());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.x());
      $$0.a("Crouching", this.ci());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);

      for (ut $$2 : $$0.c("Trusted", 11)) {
         this.a(new bvy<>(ul.a($$2)));
      }

      this.C($$0.q("Sleeping"));
      this.a(ciq.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dV() instanceof arn) {
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
         this.al.a(bJ, (byte)(this.al.a(bJ) | $$0));
      } else {
         this.al.a(bJ, (byte)(this.al.a(bJ) & ~$$0));
      }
   }

   private boolean s(int $$0) {
      return (this.al.a(bJ) & $$0) != 0;
   }

   @Override
   protected boolean f(bwc $$0) {
      return $$0 == bwc.a && this.fM();
   }

   @Override
   public boolean h(cxy $$0) {
      cxy $$1 = this.a(bwc.a);
      return $$1.f() || this.cd > 0 && $$0.c(kx.w) && !$$1.c(kx.w);
   }

   private void l(cxy $$0) {
      if (!$$0.f() && !this.dV().C) {
         cmn $$1 = new cmn(this.dV(), this.dA() + this.bT().d, this.dC() + 1.0, this.dG() + this.bT().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awk.jO, 1.0F, 1.0F);
         this.dV().b($$1);
      }
   }

   private void m(cxy $$0) {
      cmn $$1 = new cmn(this.dV(), this.dA(), this.dC(), this.dG(), $$0);
      this.dV().b($$1);
   }

   @Override
   protected void a(arn $$0, cmn $$1) {
      cxy $$2 = $$1.f();
      if (this.h($$2)) {
         int $$3 = $$2.M();
         if ($$3 > 1) {
            this.m($$2.a($$3 - 1));
         }

         this.l(this.a(bwc.a));
         this.a($$1);
         this.a(bwc.a, $$2.a(1));
         this.g(bwc.a);
         this.a($$1, $$2.M());
         $$1.at();
         this.cd = 0;
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
            jj $$1 = this.dv();
            dym $$2 = this.dV().a_($$1);
            this.dV().c(2001, $$1, dku.j($$2));
         }
      }

      this.ca = this.bZ;
      if (this.gu()) {
         this.bZ = this.bZ + (1.0F - this.bZ) * 0.4F;
      } else {
         this.bZ = this.bZ + (0.0F - this.bZ) * 0.4F;
      }

      this.cc = this.cb;
      if (this.ci()) {
         this.cb += 0.2F;
         if (this.cb > 3.0F) {
            this.cb = 3.0F;
         }
      } else {
         this.cb = 0.0F;
      }
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.ac);
   }

   @Override
   protected void a(cqi $$0, bwt $$1) {
      ((ciq)$$1).j($$0);
   }

   public boolean gr() {
      return this.s(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gs() {
      return this.be;
   }

   public boolean gt() {
      return this.cb == 3.0F;
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

   public float K(float $$0) {
      return azk.h($$0, this.ca, this.bZ) * 0.11F * (float) Math.PI;
   }

   public float L(float $$0) {
      return azk.h($$0, this.cc, this.cb);
   }

   @Override
   public void h(@Nullable bwr $$0) {
      if (this.gE() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
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
      awj $$0 = this.u();
      if ($$0 == awk.jL) {
         this.a($$0, 2.0F, this.fe());
      } else {
         super.T();
      }
   }

   @Nullable
   @Override
   protected awj u() {
      if (this.fQ()) {
         return awk.jM;
      } else {
         if (!this.dV().V() && this.ae.i() < 0.1F) {
            List<cqi> $$0 = this.dV().a(cqi.class, this.cR().c(16.0, 16.0, 16.0), bvz.f);
            if ($$0.isEmpty()) {
               return awk.jL;
            }
         }

         return awk.jG;
      }
   }

   @Nullable
   @Override
   protected awj e(buh $$0) {
      return awk.jK;
   }

   @Nullable
   @Override
   protected awj l_() {
      return awk.jI;
   }

   boolean k(bwr $$0) {
      return this.gD().anyMatch($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(arn $$0, buh $$1) {
      cxy $$2 = this.a(bwc.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(bwc.a, cxy.k);
      }

      super.b($$0, $$1);
   }

   public static boolean a(ciq $$0, bwr $$1) {
      double $$2 = $$1.dG() - $$0.dG();
      double $$3 = $$1.dA() - $$0.dA();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dV().a_(jj.a($$0.dA() + $$8, $$0.dC() + (double)$$9, $$0.dG() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public fcu cT() {
      return new fcu(0.0, (double)(0.55F * this.cS()), (double)(this.dq() * 0.4F));
   }

   class a extends cfg<bwr> {
      @Nullable
      private bwr j;
      @Nullable
      private bwr k;
      private int l;

      public a(final Class<bwr> $$0, final boolean $$1, final boolean $$2, @Nullable final chg.a $$3) {
         super(ciq.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dY().a(this.b) != 0) {
            return false;
         } else {
            arn $$0 = a(ciq.this.dV());

            for (bvy<bwr> $$1 : ciq.this.gD().toList()) {
               bwr $$2 = $$1.a($$0, bwr.class);
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

         ciq.this.a(awk.jF, 1.0F, 1.0F);
         ciq.this.B(true);
         ciq.this.gF();
         super.d();
      }
   }

   class b extends cdn {
      int a;

      public b() {
         this.a(EnumSet.of(cdn.a.b, cdn.a.c, cdn.a.a));
      }

      @Override
      public boolean b() {
         return ciq.this.gq();
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
         ciq.this.A(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements chg.a {
      @Override
      public boolean test(bwr $$0, arn $$1) {
         if ($$0 instanceof ciq) {
            return false;
         } else if ($$0 instanceof cil || $$0 instanceof cjc || $$0 instanceof cnj) {
            return true;
         } else if ($$0 instanceof bxn) {
            return !((bxn)$$0).q();
         } else {
            if ($$0 instanceof cqi $$2 && ($$2.U_() || $$2.b())) {
               return false;
            }

            return ciq.this.k($$0) ? false : !$$0.fQ() && !$$0.cg();
         }
      }
   }

   abstract class d extends cdn {
      private final chg b = chg.a().a(12.0).d().a(ciq.this.new c());

      protected boolean h() {
         jj $$0 = jj.a(ciq.this.dA(), ciq.this.cR().e, ciq.this.dG());
         return !ciq.this.dV().h($$0) && ciq.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(ciq.this.dV()).a(bwr.class, this.b, ciq.this, ciq.this.cR().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends ccz {
      public e(final double $$0) {
         super(ciq.this, $$0);
      }

      @Override
      public void d() {
         ((ciq)this.a).gG();
         ((ciq)this.c).gG();
         super.d();
      }

      @Override
      protected void g() {
         arn $$0 = this.b;
         ciq $$1 = (ciq)this.a.a($$0, (bvi)this.c);
         if ($$1 != null) {
            aro $$2 = this.a.gz();
            aro $$3 = this.c.gz();
            aro $$4 = $$2;
            if ($$2 != null) {
               $$1.j($$2);
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.j($$3);
            }

            if ($$4 != null) {
               $$4.a(awu.P);
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
            if ($$0.O().c(dhl.f)) {
               this.b.b(new bwg(this.b, this.a.dA(), this.a.dC(), this.a.dG(), this.a.dY().a(7) + 1));
            }
         }
      }
   }

   public class f extends cea {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(ciq.this, $$1, $$2, $$3);
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
      protected boolean a(dhs $$0, jj $$1) {
         dym $$2 = $$0.a_($$1);
         return $$2.a(dkw.oK) && $$2.c(dtd.c) >= 2 || dlr.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && ciq.this.ae.i() < 0.05F) {
            ciq.this.a(awk.jN, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(ciq.this.dV()).O().c(dhl.c)) {
            dym $$0 = ciq.this.dV().a_(this.e);
            if ($$0.a(dkw.oK)) {
               this.b($$0);
            } else if (dlr.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dym $$0) {
         dlr.a(ciq.this, $$0, ciq.this.dV(), this.e);
      }

      private void b(dym $$0) {
         int $$1 = $$0.c(dtd.c);
         $$0.b(dtd.c, Integer.valueOf(1));
         int $$2 = 1 + ciq.this.dV().A.a(2) + ($$1 == 3 ? 1 : 0);
         cxy $$3 = ciq.this.a(bwc.a);
         if ($$3.f()) {
            ciq.this.a(bwc.a, new cxy(cyc.xz));
            $$2--;
         }

         if ($$2 > 0) {
            dku.a(ciq.this.dV(), this.e, new cxy(cyc.xz, $$2));
         }

         ciq.this.a(awk.Aq, 1.0F, 1.0F);
         ciq.this.dV().a(this.e, $$0.b(dtd.c, Integer.valueOf(1)), 2);
         ciq.this.dV().a(edm.c, this.e, edm.a.a(ciq.this));
      }

      @Override
      public boolean b() {
         return !ciq.this.fQ() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         ciq.this.w(false);
         super.d();
      }
   }

   class g extends cdh {
      public g() {
         super(ciq.this);
      }

      @Override
      public void d() {
         super.d();
         ciq.this.gG();
      }

      @Override
      public boolean b() {
         return ciq.this.bj() && ciq.this.b(axf.a) > 0.25 || ciq.this.bw();
      }
   }

   static class h extends cdm {
      private final ciq d;

      public h(ciq $$0, double $$1) {
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

   public static class i extends bvi.a {
      public final ciq.v a;

      public i(ciq.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cdv {
      public j(final bwt $$0, final Class<? extends bwr> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !ciq.this.gq() && !ciq.this.gu();
      }

      @Override
      public boolean c() {
         return super.c() && !ciq.this.gq() && !ciq.this.gu();
      }
   }

   public class k extends ccp {
      public k() {
         super(ciq.this);
      }

      @Override
      public void a() {
         if (!ciq.this.fQ()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !ciq.this.gr() && !ciq.this.ci() && !ciq.this.gu() && !ciq.this.gq();
      }
   }

   class l extends cdx {
      public l(final double $$0, final boolean $$1) {
         super(ciq.this, $$0, $$1);
      }

      @Override
      protected void a(bwr $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            ciq.this.a(awk.jH, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         ciq.this.z(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !ciq.this.x() && !ciq.this.fQ() && !ciq.this.ci() && !ciq.this.gq() && super.b();
      }
   }

   class m extends ccq {
      public m() {
         super(ciq.this);
      }

      @Override
      public void a() {
         if (ciq.this.gH()) {
            super.a();
         }
      }
   }

   class n extends ceg {
      public n(final double $$0) {
         super(ciq.this, $$0);
      }

      @Override
      public boolean h() {
         return !ciq.this.gE() && super.h();
      }
   }

   public class o extends cdr {
      @Override
      public boolean b() {
         if (!ciq.this.gt()) {
            return false;
         } else {
            bwr $$0 = ciq.this.f();
            if ($$0 != null && $$0.bK()) {
               if ($$0.cP() != $$0.cO()) {
                  return false;
               } else {
                  boolean $$1 = ciq.a(ciq.this, $$0);
                  if (!$$1) {
                     ciq.this.O().a($$0, 0);
                     ciq.this.y(false);
                     ciq.this.z(false);
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
         bwr $$0 = ciq.this.f();
         if ($$0 != null && $$0.bK()) {
            double $$1 = ciq.this.dy().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(ciq.this.dN()) < 15.0F) || !ciq.this.aJ()) && !ciq.this.gq();
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
         ciq.this.s(true);
         ciq.this.x(true);
         ciq.this.z(false);
         bwr $$0 = ciq.this.f();
         if ($$0 != null) {
            ciq.this.J().a($$0, 60.0F, 30.0F);
            fcu $$1 = new fcu($$0.dA() - ciq.this.dA(), $$0.dC() - ciq.this.dC(), $$0.dG() - ciq.this.dG()).d();
            ciq.this.i(ciq.this.dy().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         ciq.this.O().m();
      }

      @Override
      public void e() {
         ciq.this.y(false);
         ciq.this.cb = 0.0F;
         ciq.this.cc = 0.0F;
         ciq.this.z(false);
         ciq.this.x(false);
      }

      @Override
      public void a() {
         bwr $$0 = ciq.this.f();
         if ($$0 != null) {
            ciq.this.J().a($$0, 60.0F, 30.0F);
         }

         if (!ciq.this.gq()) {
            fcu $$1 = ciq.this.dy();
            if ($$1.e * $$1.e < 0.03F && ciq.this.dN() != 0.0F) {
               ciq.this.x(azk.i(0.2F, ciq.this.dN(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               ciq.this.x((float)$$3);
            }
         }

         if ($$0 != null && ciq.this.f($$0) <= 2.0F) {
            ciq.this.c(a(ciq.this.dV()), $$0);
         } else if (ciq.this.dN() > 0.0F && ciq.this.aJ() && (float)ciq.this.dy().e != 0.0F && ciq.this.dV().a_(ciq.this.dv()).a(dkw.ea)) {
            ciq.this.x(60.0F);
            ciq.this.h(null);
            ciq.this.A(true);
         }
      }
   }

   class p extends cdn {
      public p() {
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public boolean b() {
         if (!ciq.this.a(bwc.a).f()) {
            return false;
         } else if (ciq.this.f() != null || ciq.this.eq() != null) {
            return false;
         } else if (!ciq.this.gH()) {
            return false;
         } else if (ciq.this.dY().a(b(10)) != 0) {
            return false;
         } else {
            List<cmn> $$0 = ciq.this.dV().a(cmn.class, ciq.this.cR().c(8.0, 8.0, 8.0), ciq.bQ);
            return !$$0.isEmpty() && ciq.this.a(bwc.a).f();
         }
      }

      @Override
      public void a() {
         List<cmn> $$0 = ciq.this.dV().a(cmn.class, ciq.this.cR().c(8.0, 8.0, 8.0), ciq.bQ);
         cxy $$1 = ciq.this.a(bwc.a);
         if ($$1.f() && !$$0.isEmpty()) {
            ciq.this.O().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<cmn> $$0 = ciq.this.dV().a(cmn.class, ciq.this.cR().c(8.0, 8.0, 8.0), ciq.bQ);
         if (!$$0.isEmpty()) {
            ciq.this.O().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cet {
      public q(final int $$0, final int $$1) {
         super(ciq.this, $$1);
      }

      @Override
      public void d() {
         ciq.this.gG();
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
         return !ciq.this.fQ() && !ciq.this.x() && !ciq.this.gE() && ciq.this.f() == null;
      }
   }

   class r extends ciq.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cdn.a.a, cdn.a.b));
      }

      @Override
      public boolean b() {
         return ciq.this.eq() == null
            && ciq.this.dY().i() < 0.02F
            && !ciq.this.fQ()
            && ciq.this.f() == null
            && ciq.this.O().k()
            && !this.i()
            && !ciq.this.gr()
            && !ciq.this.ci();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + ciq.this.dY().a(3);
         ciq.this.w(true);
         ciq.this.O().m();
      }

      @Override
      public void e() {
         ciq.this.w(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         ciq.this.J().a(ciq.this.dA() + this.c, ciq.this.dE(), ciq.this.dG() + this.d, (float)ciq.this.ad(), (float)ciq.this.ac());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * ciq.this.dY().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + ciq.this.dY().a(20));
      }
   }

   class s extends cdg {
      private int c = b(100);

      public s(final double $$0) {
         super(ciq.this, $$0);
      }

      @Override
      public boolean b() {
         if (!ciq.this.fQ() && this.a.f() == null) {
            if (ciq.this.dV().ag() && ciq.this.dV().h(this.a.dv())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               jj $$0 = this.a.dv();
               return ciq.this.dV().V() && ciq.this.dV().h($$0) && !((arn)ciq.this.dV()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         ciq.this.gG();
         super.d();
      }
   }

   class t extends ciq.d {
      private static final int c = b(140);
      private int d = ciq.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(cdn.a.a, cdn.a.b, cdn.a.c));
      }

      @Override
      public boolean b() {
         return ciq.this.bf == 0.0F && ciq.this.bg == 0.0F && ciq.this.bh == 0.0F ? this.k() || ciq.this.fQ() : false;
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
            return ciq.this.dV().V() && this.h() && !this.i() && !ciq.this.av;
         }
      }

      @Override
      public void e() {
         this.d = ciq.this.ae.a(c);
         ciq.this.gG();
      }

      @Override
      public void d() {
         ciq.this.w(false);
         ciq.this.y(false);
         ciq.this.z(false);
         ciq.this.s(false);
         ciq.this.C(true);
         ciq.this.O().m();
         ciq.this.L().a(ciq.this.dA(), ciq.this.dC(), ciq.this.dG(), 0.0);
      }
   }

   class u extends cdn {
      public u() {
         this.a(EnumSet.of(cdn.a.a, cdn.a.b));
      }

      @Override
      public boolean b() {
         if (ciq.this.fQ()) {
            return false;
         } else {
            bwr $$0 = ciq.this.f();
            return $$0 != null && $$0.bK() && ciq.bS.test($$0) && ciq.this.g((bvs)$$0) > 36.0 && !ciq.this.ci() && !ciq.this.gu() && !ciq.this.be;
         }
      }

      @Override
      public void d() {
         ciq.this.w(false);
         ciq.this.A(false);
      }

      @Override
      public void e() {
         bwr $$0 = ciq.this.f();
         if ($$0 != null && ciq.a(ciq.this, $$0)) {
            ciq.this.z(true);
            ciq.this.y(true);
            ciq.this.O().m();
            ciq.this.J().a($$0, (float)ciq.this.ad(), (float)ciq.this.ac());
         } else {
            ciq.this.z(false);
            ciq.this.y(false);
         }
      }

      @Override
      public void a() {
         bwr $$0 = ciq.this.f();
         if ($$0 != null) {
            ciq.this.J().a($$0, (float)ciq.this.ad(), (float)ciq.this.ac());
            if (ciq.this.g((bvs)$$0) <= 36.0) {
               ciq.this.z(true);
               ciq.this.y(true);
               ciq.this.O().m();
            } else {
               ciq.this.O().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements bag {
      a(0, "red"),
      b(1, "snow");

      public static final bag.a<ciq.v> c = bag.a(ciq.v::values);
      private static final IntFunction<ciq.v> e = aya.a(ciq.v::a, values(), aya.a.a);
      public static final yt<ByteBuf, ciq.v> d = yr.a(e, ciq.v::a);
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

      public static ciq.v a(String $$0) {
         return c.a($$0, a);
      }

      public static ciq.v a(int $$0) {
         return e.apply($$0);
      }

      public static ciq.v a(js<dis> $$0) {
         return $$0.a(awy.at) ? b : a;
      }
   }
}
