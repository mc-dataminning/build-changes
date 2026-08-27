import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class buw extends bum implements bjz<buw.v> {
   private static final aec<Integer> bX = aef.a(buw.class, aee.b);
   private static final aec<Byte> bY = aef.a(buw.class, aee.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final aec<Optional<UUID>> cd = aef.a(buw.class, aee.q);
   private static final aec<Optional<UUID>> ce = aef.a(buw.class, aee.q);
   static final Predicate<byi> cf = $$0 -> !$$0.r() && $$0.bv();
   private static final Predicate<bil> cg = $$0 -> !($$0 instanceof bjb $$1) ? false : $$1.eh() != null && $$1.ei() < $$1.ah + 600;
   static final Predicate<bil> ch = $$0 -> $$0 instanceof bur || $$0 instanceof bvg;
   private static final Predicate<bil> ci = $$0 -> !$$0.bU() && bio.e.test($$0);
   private static final int cj = 600;
   private bpw ck;
   private bpw cl;
   private bpw cm;
   private float cn;
   private float co;
   float cp;
   float cq;
   private int cr;

   public buw(bip<? extends buw> $$0, cpq $$1) {
      super($$0, $$1);
      this.bK = new buw.k();
      this.bL = new buw.m();
      this.a(eas.p, 0.0F);
      this.a(eas.q, 0.0F);
      this.s(true);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cd, Optional.empty());
      this.an.a(ce, Optional.empty());
      this.an.a(bX, 0);
      this.an.a(bY, (byte)0);
   }

   @Override
   protected void w() {
      this.ck = new brp<>(this, bum.class, 10, false, false, $$0 -> $$0 instanceof bur || $$0 instanceof bvg);
      this.cl = new brp<>(this, bvn.class, 10, false, false, bvn.bU);
      this.cm = new brp<>(this, buj.class, 20, false, false, $$0 -> $$0 instanceof bul);
      this.bO.a(0, new buw.g());
      this.bO.a(0, new bpl(this, this.dK()));
      this.bO.a(1, new buw.b());
      this.bO.a(2, new buw.n(2.2));
      this.bO.a(3, new buw.e(1.0));
      this.bO.a(4, new bpd<>(this, cbp.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cv()) && !this.gm()));
      this.bO.a(4, new bpd<>(this, bvp.class, 8.0F, 1.6, 1.4, $$0 -> !((bvp)$$0).p() && !this.gm()));
      this.bO.a(4, new bpd<>(this, bve.class, 8.0F, 1.6, 1.4, $$0 -> !this.gm()));
      this.bO.a(5, new buw.u());
      this.bO.a(6, new buw.o());
      this.bO.a(6, new buw.s(1.25));
      this.bO.a(7, new buw.l(1.2F, true));
      this.bO.a(7, new buw.t());
      this.bO.a(8, new buw.h(this, 1.25));
      this.bO.a(9, new buw.q(32, 200));
      this.bO.a(10, new buw.f(1.2F, 12, 1));
      this.bO.a(10, new bqc(this, 0.4F));
      this.bO.a(11, new brj(this, 1.0));
      this.bO.a(11, new buw.p());
      this.bO.a(12, new buw.j(this, cbp.class, 24.0F));
      this.bO.a(13, new buw.r());
      this.bP.a(3, new buw.a(bjb.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cv())));
   }

   @Override
   public aoy d(cja $$0) {
      return aoz.ic;
   }

   @Override
   public void b_() {
      if (!this.dK().B && this.bv() && this.cX()) {
         this.cr++;
         cja $$0 = this.c(biq.a);
         if (this.l($$0)) {
            if (this.cr > 600) {
               cja $$1 = $$0.a(this.dK(), this);
               if (!$$1.b()) {
                  this.a(biq.a, $$1);
               }

               this.cr = 0;
            } else if (this.cr > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dK().a(this, (byte)45);
            }
         }

         bjb $$2 = this.j();
         if ($$2 == null || !$$2.bv()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fB() || this.eW()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      }

      super.b_();
      if (this.gm() && this.ag.i() < 0.05F) {
         this.a(aoz.hY, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eW() {
      return this.eu();
   }

   private boolean l(cja $$0) {
      return $$0.d().u() && this.j() == null && this.aA() && !this.fB();
   }

   @Override
   protected void a(arx $$0, bgr $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cja $$3;
         if ($$2 < 0.05F) {
            $$3 = new cja(cjd.nL);
         } else if ($$2 < 0.2F) {
            $$3 = new cja(cjd.qd);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cja(cjd.tJ) : new cja(cjd.tK);
         } else if ($$2 < 0.6F) {
            $$3 = new cja(cjd.oI);
         } else if ($$2 < 0.8F) {
            $$3 = new cja(cjd.pP);
         } else {
            $$3 = new cja(cjd.oF);
         }

         this.a(biq.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cja $$1 = this.c(biq.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ehi $$3 = new ehi(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dC() * (float) (Math.PI / 180.0))
                  .b(-this.dA() * (float) (Math.PI / 180.0));
               this.dK().a(new it(ix.O, $$1), this.dp() + this.bE().c / 2.0, this.dr(), this.dv() + this.bE().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bkg.a p() {
      return bjd.x().a(bkh.d, 0.3F).a(bkh.a, 10.0).a(bkh.b, 32.0).a(bkh.f, 2.0);
   }

   @Nullable
   public buw b(akn $$0, big $$1) {
      buw $$2 = bip.N.a((cpq)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.q() : ((buw)$$1).q());
      }

      return $$2;
   }

   public static boolean c(bip<buw> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return $$1.a_($$3.d()).a(apo.bW) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      hg<cqo> $$5 = $$0.s(this.dk());
      buw.v $$6 = buw.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof buw.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new buw.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof akn) {
         this.gk();
      }

      this.a($$0.y_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void gk() {
      if (this.q() == buw.v.a) {
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
   protected void a(cbp $$0, bgs $$1, cja $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return this.i_() ? $$1.b * 0.85F : 0.4F;
   }

   public buw.v q() {
      return buw.v.a(this.an.b(bX));
   }

   public void a(buw.v $$0) {
      this.an.b(bX, $$0.a());
   }

   List<UUID> gl() {
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
   public void b(qu $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gl();
      ra $$2 = new ra();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(rg.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fB());
      $$0.a("Type", this.q().c());
      $$0.a("Sitting", this.t());
      $$0.a("Crouching", this.bW());
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);

      for (rn $$2 : $$0.c("Trusted", 11)) {
         this.b(rg.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(buw.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dK() instanceof akn) {
         this.gk();
      }
   }

   public boolean t() {
      return this.t(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean ga() {
      return this.t(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gm() {
      return this.t(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fB() {
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
   public boolean f(cja $$0) {
      biq $$1 = bjd.h($$0);
      return !this.c($$1).b() ? false : $$1 == biq.a && super.f($$0);
   }

   @Override
   public boolean j(cja $$0) {
      civ $$1 = $$0.d();
      cja $$2 = this.c(biq.a);
      return $$2.b() || this.cr > 0 && $$1.u() && !$$2.d().u();
   }

   private void n(cja $$0) {
      if (!$$0.b() && !this.dK().B) {
         byi $$1 = new byi(this.dK(), this.dp() + this.bE().c, this.dr() + 1.0, this.dv() + this.bE().e, $$0);
         $$1.b(40);
         $$1.c(this.cv());
         this.a(aoz.ih, 1.0F, 1.0F);
         this.dK().b($$1);
      }
   }

   private void o(cja $$0) {
      byi $$1 = new byi(this.dK(), this.dp(), this.dr(), this.dv(), $$0);
      this.dK().b($$1);
   }

   @Override
   protected void b(byi $$0) {
      cja $$1 = $$0.j();
      if (this.j($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(biq.a));
         this.a($$0);
         this.a(biq.a, $$1.a(1));
         this.e(biq.a);
         this.a($$0, $$1.L());
         $$0.ak();
         this.cr = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.cX()) {
         boolean $$0 = this.aX();
         if ($$0 || this.j() != null || this.dK().Y()) {
            this.gn();
         }

         if ($$0 || this.fB()) {
            this.w(false);
         }

         if (this.ga() && this.dK().z.i() < 0.2F) {
            gw $$1 = this.dk();
            dfe $$2 = this.dK().a_($$1);
            this.dK().c(2001, $$1, csq.i($$2));
         }
      }

      this.co = this.cn;
      if (this.gj()) {
         this.cn = this.cn + (1.0F - this.cn) * 0.4F;
      } else {
         this.cn = this.cn + (0.0F - this.cn) * 0.4F;
      }

      this.cq = this.cp;
      if (this.bW()) {
         this.cp += 0.2F;
         if (this.cp > 3.0F) {
            this.cp = 3.0F;
         }
      } else {
         this.cp = 0.0F;
      }
   }

   @Override
   public boolean m(cja $$0) {
      return $$0.a(apw.X);
   }

   @Override
   protected void a(cbp $$0, bjd $$1) {
      ((buw)$$1).b($$0.cv());
   }

   public boolean gg() {
      return this.t(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gh() {
      return this.bj;
   }

   public boolean gi() {
      return this.cp == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean bW() {
      return this.t(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gj() {
      return this.t(8);
   }

   public float E(float $$0) {
      return ars.i($$0, this.co, this.cn) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return ars.i($$0, this.cq, this.cp);
   }

   @Override
   public void h(@Nullable bjb $$0) {
      if (this.gm() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return ars.f(($$0 - 5.0F) * $$1);
   }

   void gn() {
      this.C(false);
   }

   void go() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gp() {
      return !this.fB() && !this.t() && !this.ga();
   }

   @Override
   public void M() {
      aoy $$0 = this.r();
      if ($$0 == aoz.ie) {
         this.a($$0, 2.0F, this.eV());
      } else {
         super.M();
      }
   }

   @Nullable
   @Override
   protected aoy r() {
      if (this.fB()) {
         return aoz.if;
      } else {
         if (!this.dK().N() && this.ag.i() < 0.1F) {
            List<cbp> $$0 = this.dK().a(cbp.class, this.cG().c(16.0, 16.0, 16.0), bio.f);
            if ($$0.isEmpty()) {
               return aoz.ie;
            }
         }

         return aoz.hZ;
      }
   }

   @Nullable
   @Override
   protected aoy d(bhj $$0) {
      return aoz.id;
   }

   @Nullable
   @Override
   protected aoy h_() {
      return aoz.ib;
   }

   boolean c(UUID $$0) {
      return this.gl().contains($$0);
   }

   @Override
   protected void g(bhj $$0) {
      cja $$1 = this.c(biq.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(biq.a, cja.b);
      }

      super.g($$0);
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + -0.0625F * $$2, -0.25F * $$2);
   }

   public static boolean a(buw $$0, bjb $$1) {
      double $$2 = $$1.dv() - $$0.dv();
      double $$3 = $$1.dp() - $$0.dp();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dK().a_(gw.a($$0.dp() + $$8, $$0.dr() + (double)$$9, $$0.dv() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ehi cI() {
      return new ehi(0.0, (double)(0.55F * this.cH()), (double)(this.df() * 0.4F));
   }

   class a extends brp<bjb> {
      @Nullable
      private bjb j;
      @Nullable
      private bjb k;
      private int l;

      public a(Class<bjb> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bjb> $$3) {
         super(buw.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ee().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : buw.this.gl()) {
               if ($$0 != null && buw.this.dK() instanceof akn && ((akn)buw.this.dK()).a($$0) instanceof bjb $$2) {
                  this.k = $$2;
                  this.j = $$2.ef();
                  int $$3 = $$2.eg();
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
            this.l = this.k.eg();
         }

         buw.this.a(aoz.hY, 1.0F, 1.0F);
         buw.this.B(true);
         buw.this.gn();
         super.c();
      }
   }

   class b extends bpw {
      int a;

      public b() {
         this.a(EnumSet.of(bpw.a.b, bpw.a.c, bpw.a.a));
      }

      @Override
      public boolean a() {
         return buw.this.ga();
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
         buw.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bjb> {
      public boolean a(bjb $$0) {
         if ($$0 instanceof buw) {
            return false;
         } else if ($$0 instanceof bur || $$0 instanceof bvg || $$0 instanceof bzd) {
            return true;
         } else if ($$0 instanceof bjw) {
            return !((bjw)$$0).p();
         } else if (!($$0 instanceof cbp) || !$$0.G_() && !((cbp)$$0).f()) {
            return buw.this.c($$0.cv()) ? false : !$$0.fB() && !$$0.bU();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bpw {
      private final btn b = btn.a().a(12.0).d().a(buw.this.new c());

      protected boolean h() {
         gw $$0 = gw.a(buw.this.dp(), buw.this.cG().e, buw.this.dv());
         return !buw.this.dK().g($$0) && buw.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !buw.this.dK().a(bjb.class, this.b, buw.this, buw.this.cG().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bpi {
      public e(double $$0) {
         super(buw.this, $$0);
      }

      @Override
      public void c() {
         ((buw)this.a).go();
         ((buw)this.c).go();
         super.c();
      }

      @Override
      protected void g() {
         akn $$0 = (akn)this.b;
         buw $$1 = (buw)this.a.a($$0, (big)this.c);
         if ($$1 != null) {
            ako $$2 = this.a.gd();
            ako $$3 = this.c.gd();
            ako $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cv());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cv());
            }

            if ($$4 != null) {
               $$4.a(apj.P);
               al.o.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gf();
            this.c.gf();
            $$1.c_(-24000);
            $$1.b(this.a.dp(), this.a.dr(), this.a.dv(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.X().b(cpm.f)) {
               this.b.b(new bir(this.b, this.a.dp(), this.a.dr(), this.a.dv(), this.a.ee().a(7) + 1));
            }
         }
      }
   }

   public class f extends bqj {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(buw.this, $$1, $$2, $$3);
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
      protected boolean a(cpt $$0, gw $$1) {
         dfe $$2 = $$0.a_($$1);
         return $$2.a(csr.oi) && $$2.c(dau.b) >= 2 || ctl.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && buw.this.ag.i() < 0.05F) {
            buw.this.a(aoz.ig, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (buw.this.dK().X().b(cpm.c)) {
            dfe $$0 = buw.this.dK().a_(this.e);
            if ($$0.a(csr.oi)) {
               this.b($$0);
            } else if (ctl.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dfe $$0) {
         ctl.a(buw.this, $$0, buw.this.dK(), this.e);
      }

      private void b(dfe $$0) {
         int $$1 = $$0.c(dau.b);
         $$0.a(dau.b, Integer.valueOf(1));
         int $$2 = 1 + buw.this.dK().z.a(2) + ($$1 == 3 ? 1 : 0);
         cja $$3 = buw.this.c(biq.a);
         if ($$3.b()) {
            buw.this.a(biq.a, new cja(cjd.vv));
            $$2--;
         }

         if ($$2 > 0) {
            csq.a(buw.this.dK(), this.e, new cja(cjd.vv, $$2));
         }

         buw.this.a(aoz.xF, 1.0F, 1.0F);
         buw.this.dK().a(this.e, $$0.a(dau.b, Integer.valueOf(1)), 2);
         buw.this.dK().a(djo.c, this.e, djo.a.a(buw.this));
      }

      @Override
      public boolean a() {
         return !buw.this.fB() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         buw.this.w(false);
         super.c();
      }
   }

   class g extends bpq {
      public g() {
         super(buw.this);
      }

      @Override
      public void c() {
         super.c();
         buw.this.go();
      }

      @Override
      public boolean a() {
         return buw.this.aX() && buw.this.b(apt.a) > 0.25 || buw.this.bl();
      }
   }

   class h extends bpv {
      private final buw e;

      public h(buw $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gm() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gm() && super.b();
      }

      @Override
      public void c() {
         this.e.go();
         super.c();
      }
   }

   public static class i extends big.a {
      public final buw.v a;

      public i(buw.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bqe {
      public j(bjd $$0, Class<? extends bjb> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !buw.this.ga() && !buw.this.gj();
      }

      @Override
      public boolean b() {
         return super.b() && !buw.this.ga() && !buw.this.gj();
      }
   }

   public class k extends boy {
      public k() {
         super(buw.this);
      }

      @Override
      public void a() {
         if (!buw.this.fB()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !buw.this.gg() && !buw.this.bW() && !buw.this.gj() && !buw.this.ga();
      }
   }

   class l extends bqg {
      public l(double $$0, boolean $$1) {
         super(buw.this, $$0, $$1);
      }

      @Override
      protected void a(bjb $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            buw.this.a(aoz.ia, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         buw.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !buw.this.t() && !buw.this.fB() && !buw.this.bW() && !buw.this.ga() && super.a();
      }
   }

   class m extends boz {
      public m() {
         super(buw.this);
      }

      @Override
      public void a() {
         if (buw.this.gp()) {
            super.a();
         }
      }
   }

   class n extends bqp {
      public n(double $$0) {
         super(buw.this, $$0);
      }

      @Override
      public boolean h() {
         return !buw.this.gm() && super.h();
      }
   }

   public class o extends bqa {
      @Override
      public boolean a() {
         if (!buw.this.gi()) {
            return false;
         } else {
            bjb $$0 = buw.this.j();
            if ($$0 != null && $$0.bv()) {
               if ($$0.cE() != $$0.cD()) {
                  return false;
               } else {
                  boolean $$1 = buw.a(buw.this, $$0);
                  if (!$$1) {
                     buw.this.H().a($$0, 0);
                     buw.this.y(false);
                     buw.this.z(false);
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
         bjb $$0 = buw.this.j();
         if ($$0 != null && $$0.bv()) {
            double $$1 = buw.this.dn().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(buw.this.dC()) < 15.0F) || !buw.this.aA()) && !buw.this.ga();
         } else {
            return false;
         }
      }

      @Override
      public boolean J_() {
         return false;
      }

      @Override
      public void c() {
         buw.this.r(true);
         buw.this.x(true);
         buw.this.z(false);
         bjb $$0 = buw.this.j();
         if ($$0 != null) {
            buw.this.D().a($$0, 60.0F, 30.0F);
            ehi $$1 = new ehi($$0.dp() - buw.this.dp(), $$0.dr() - buw.this.dr(), $$0.dv() - buw.this.dv()).d();
            buw.this.f(buw.this.dn().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         buw.this.H().n();
      }

      @Override
      public void d() {
         buw.this.y(false);
         buw.this.cp = 0.0F;
         buw.this.cq = 0.0F;
         buw.this.z(false);
         buw.this.x(false);
      }

      @Override
      public void e() {
         bjb $$0 = buw.this.j();
         if ($$0 != null) {
            buw.this.D().a($$0, 60.0F, 30.0F);
         }

         if (!buw.this.ga()) {
            ehi $$1 = buw.this.dn();
            if ($$1.d * $$1.d < 0.03F && buw.this.dC() != 0.0F) {
               buw.this.s(ars.j(0.2F, buw.this.dC(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               buw.this.s((float)$$3);
            }
         }

         if ($$0 != null && buw.this.e((bil)$$0) <= 2.0F) {
            buw.this.C($$0);
         } else if (buw.this.dC() > 0.0F && buw.this.aA() && (float)buw.this.dn().d != 0.0F && buw.this.dK().a_(buw.this.dk()).a(csr.dN)) {
            buw.this.s(60.0F);
            buw.this.h(null);
            buw.this.A(true);
         }
      }
   }

   class p extends bpw {
      public p() {
         this.a(EnumSet.of(bpw.a.a));
      }

      @Override
      public boolean a() {
         if (!buw.this.c(biq.a).b()) {
            return false;
         } else if (buw.this.j() != null || buw.this.ef() != null) {
            return false;
         } else if (!buw.this.gp()) {
            return false;
         } else if (buw.this.ee().a(b(10)) != 0) {
            return false;
         } else {
            List<byi> $$0 = buw.this.dK().a(byi.class, buw.this.cG().c(8.0, 8.0, 8.0), buw.cf);
            return !$$0.isEmpty() && buw.this.c(biq.a).b();
         }
      }

      @Override
      public void e() {
         List<byi> $$0 = buw.this.dK().a(byi.class, buw.this.cG().c(8.0, 8.0, 8.0), buw.cf);
         cja $$1 = buw.this.c(biq.a);
         if ($$1.b() && !$$0.isEmpty()) {
            buw.this.H().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<byi> $$0 = buw.this.dK().a(byi.class, buw.this.cG().c(8.0, 8.0, 8.0), buw.cf);
         if (!$$0.isEmpty()) {
            buw.this.H().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends brc {
      public q(int $$0, int $$1) {
         super(buw.this, $$1);
      }

      @Override
      public void c() {
         buw.this.go();
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
         return !buw.this.fB() && !buw.this.t() && !buw.this.gm() && buw.this.j() == null;
      }
   }

   class r extends buw.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bpw.a.a, bpw.a.b));
      }

      @Override
      public boolean a() {
         return buw.this.ef() == null
            && buw.this.ee().i() < 0.02F
            && !buw.this.fB()
            && buw.this.j() == null
            && buw.this.H().l()
            && !this.i()
            && !buw.this.gg()
            && !buw.this.bW();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + buw.this.ee().a(3);
         buw.this.w(true);
         buw.this.H().n();
      }

      @Override
      public void d() {
         buw.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         buw.this.D().a(buw.this.dp() + this.c, buw.this.dt(), buw.this.dv() + this.d, (float)buw.this.X(), (float)buw.this.W());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * buw.this.ee().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + buw.this.ee().a(20));
      }
   }

   class s extends bpp {
      private int c = b(100);

      public s(double $$0) {
         super(buw.this, $$0);
      }

      @Override
      public boolean a() {
         if (!buw.this.fB() && this.a.j() == null) {
            if (buw.this.dK().Y() && buw.this.dK().g(this.a.dk())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               gw $$0 = this.a.dk();
               return buw.this.dK().N() && buw.this.dK().g($$0) && !((akn)buw.this.dK()).b($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         buw.this.go();
         super.c();
      }
   }

   class t extends buw.d {
      private static final int c = b(140);
      private int d = buw.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(bpw.a.a, bpw.a.b, bpw.a.c));
      }

      @Override
      public boolean a() {
         return buw.this.bk == 0.0F && buw.this.bl == 0.0F && buw.this.bm == 0.0F ? this.k() || buw.this.fB() : false;
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
            return buw.this.dK().N() && this.h() && !this.i() && !buw.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = buw.this.ag.a(c);
         buw.this.go();
      }

      @Override
      public void c() {
         buw.this.w(false);
         buw.this.y(false);
         buw.this.z(false);
         buw.this.r(false);
         buw.this.C(true);
         buw.this.H().n();
         buw.this.E().a(buw.this.dp(), buw.this.dr(), buw.this.dv(), 0.0);
      }
   }

   class u extends bpw {
      public u() {
         this.a(EnumSet.of(bpw.a.a, bpw.a.b));
      }

      @Override
      public boolean a() {
         if (buw.this.fB()) {
            return false;
         } else {
            bjb $$0 = buw.this.j();
            return $$0 != null && $$0.bv() && buw.ch.test($$0) && buw.this.f($$0) > 36.0 && !buw.this.bW() && !buw.this.gj() && !buw.this.bj;
         }
      }

      @Override
      public void c() {
         buw.this.w(false);
         buw.this.A(false);
      }

      @Override
      public void d() {
         bjb $$0 = buw.this.j();
         if ($$0 != null && buw.a(buw.this, $$0)) {
            buw.this.z(true);
            buw.this.y(true);
            buw.this.H().n();
            buw.this.D().a($$0, (float)buw.this.X(), (float)buw.this.W());
         } else {
            buw.this.z(false);
            buw.this.y(false);
         }
      }

      @Override
      public void e() {
         bjb $$0 = buw.this.j();
         if ($$0 != null) {
            buw.this.D().a($$0, (float)buw.this.X(), (float)buw.this.W());
            if (buw.this.f($$0) <= 36.0) {
               buw.this.z(true);
               buw.this.y(true);
               buw.this.H().n();
            } else {
               buw.this.H().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements ask {
      a(0, "red"),
      b(1, "snow");

      public static final ask.a<buw.v> c = ask.a(buw.v::values);
      private static final IntFunction<buw.v> d = aqn.a(buw.v::a, values(), aqn.a.a);
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

      public static buw.v a(String $$0) {
         return c.a($$0, a);
      }

      public static buw.v a(int $$0) {
         return d.apply($$0);
      }

      public static buw.v a(hg<cqo> $$0) {
         return $$0.a(apn.aq) ? b : a;
      }
   }
}
