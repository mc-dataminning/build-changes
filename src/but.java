import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class but extends buj implements bjw<but.v> {
   private static final adz<Integer> bX = aec.a(but.class, aeb.b);
   private static final adz<Byte> bY = aec.a(but.class, aeb.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final adz<Optional<UUID>> cd = aec.a(but.class, aeb.q);
   private static final adz<Optional<UUID>> ce = aec.a(but.class, aeb.q);
   static final Predicate<byf> cf = $$0 -> !$$0.r() && $$0.bv();
   private static final Predicate<bii> cg = $$0 -> !($$0 instanceof biy $$1) ? false : $$1.eh() != null && $$1.ei() < $$1.ah + 600;
   static final Predicate<bii> ch = $$0 -> $$0 instanceof buo || $$0 instanceof bvd;
   private static final Predicate<bii> ci = $$0 -> !$$0.bU() && bil.e.test($$0);
   private static final int cj = 600;
   private bpt ck;
   private bpt cl;
   private bpt cm;
   private float cn;
   private float co;
   float cp;
   float cq;
   private int cr;

   public but(bim<? extends but> $$0, cpl $$1) {
      super($$0, $$1);
      this.bK = new but.k();
      this.bL = new but.m();
      this.a(ean.p, 0.0F);
      this.a(ean.q, 0.0F);
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
      this.ck = new brm<>(this, buj.class, 10, false, false, $$0 -> $$0 instanceof buo || $$0 instanceof bvd);
      this.cl = new brm<>(this, bvk.class, 10, false, false, bvk.bU);
      this.cm = new brm<>(this, bug.class, 20, false, false, $$0 -> $$0 instanceof bui);
      this.bO.a(0, new but.g());
      this.bO.a(0, new bpi(this, this.dK()));
      this.bO.a(1, new but.b());
      this.bO.a(2, new but.n(2.2));
      this.bO.a(3, new but.e(1.0));
      this.bO.a(4, new bpa<>(this, cbm.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cv()) && !this.gm()));
      this.bO.a(4, new bpa<>(this, bvm.class, 8.0F, 1.6, 1.4, $$0 -> !((bvm)$$0).p() && !this.gm()));
      this.bO.a(4, new bpa<>(this, bvb.class, 8.0F, 1.6, 1.4, $$0 -> !this.gm()));
      this.bO.a(5, new but.u());
      this.bO.a(6, new but.o());
      this.bO.a(6, new but.s(1.25));
      this.bO.a(7, new but.l(1.2F, true));
      this.bO.a(7, new but.t());
      this.bO.a(8, new but.h(this, 1.25));
      this.bO.a(9, new but.q(32, 200));
      this.bO.a(10, new but.f(1.2F, 12, 1));
      this.bO.a(10, new bpz(this, 0.4F));
      this.bO.a(11, new brg(this, 1.0));
      this.bO.a(11, new but.p());
      this.bO.a(12, new but.j(this, cbm.class, 24.0F));
      this.bO.a(13, new but.r());
      this.bP.a(3, new but.a(biy.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cv())));
   }

   @Override
   public aov d(cix $$0) {
      return aow.ic;
   }

   @Override
   public void b_() {
      if (!this.dK().B && this.bv() && this.cX()) {
         this.cr++;
         cix $$0 = this.c(bin.a);
         if (this.l($$0)) {
            if (this.cr > 600) {
               cix $$1 = $$0.a(this.dK(), this);
               if (!$$1.b()) {
                  this.a(bin.a, $$1);
               }

               this.cr = 0;
            } else if (this.cr > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dK().a(this, (byte)45);
            }
         }

         biy $$2 = this.j();
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
         this.a(aow.hY, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eW() {
      return this.eu();
   }

   private boolean l(cix $$0) {
      return $$0.d().u() && this.j() == null && this.aA() && !this.fB();
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cix $$3;
         if ($$2 < 0.05F) {
            $$3 = new cix(cja.nL);
         } else if ($$2 < 0.2F) {
            $$3 = new cix(cja.qd);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cix(cja.tJ) : new cix(cja.tK);
         } else if ($$2 < 0.6F) {
            $$3 = new cix(cja.oI);
         } else if ($$2 < 0.8F) {
            $$3 = new cix(cja.pP);
         } else {
            $$3 = new cix(cja.oF);
         }

         this.a(bin.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cix $$1 = this.c(bin.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ehd $$3 = new ehd(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dC() * (float) (Math.PI / 180.0))
                  .b(-this.dA() * (float) (Math.PI / 180.0));
               this.dK().a(new ir(iv.O, $$1), this.dp() + this.bE().c / 2.0, this.dr(), this.dv() + this.bE().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bkd.a p() {
      return bja.x().a(bke.d, 0.3F).a(bke.a, 10.0).a(bke.b, 32.0).a(bke.f, 2.0);
   }

   @Nullable
   public but b(akk $$0, bid $$1) {
      but $$2 = bim.N.a((cpl)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.q() : ((but)$$1).q());
      }

      return $$2;
   }

   public static boolean c(bim<but> $$0, cpm $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.a_($$3.d()).a(apl.bW) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      he<cqj> $$5 = $$0.s(this.dk());
      but.v $$6 = but.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof but.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new but.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof akk) {
         this.gk();
      }

      this.a($$0.y_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void gk() {
      if (this.q() == but.v.a) {
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
   protected void a(cbm $$0, bgp $$1, cix $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return this.i_() ? $$1.b * 0.85F : 0.4F;
   }

   public but.v q() {
      return but.v.a(this.an.b(bX));
   }

   public void a(but.v $$0) {
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
   public void b(qr $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gl();
      qx $$2 = new qx();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(rd.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fB());
      $$0.a("Type", this.q().c());
      $$0.a("Sitting", this.t());
      $$0.a("Crouching", this.bW());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);

      for (rk $$2 : $$0.c("Trusted", 11)) {
         this.b(rd.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(but.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dK() instanceof akk) {
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
   public boolean f(cix $$0) {
      bin $$1 = bja.h($$0);
      return !this.c($$1).b() ? false : $$1 == bin.a && super.f($$0);
   }

   @Override
   public boolean j(cix $$0) {
      cis $$1 = $$0.d();
      cix $$2 = this.c(bin.a);
      return $$2.b() || this.cr > 0 && $$1.u() && !$$2.d().u();
   }

   private void n(cix $$0) {
      if (!$$0.b() && !this.dK().B) {
         byf $$1 = new byf(this.dK(), this.dp() + this.bE().c, this.dr() + 1.0, this.dv() + this.bE().e, $$0);
         $$1.b(40);
         $$1.c(this.cv());
         this.a(aow.ih, 1.0F, 1.0F);
         this.dK().b($$1);
      }
   }

   private void o(cix $$0) {
      byf $$1 = new byf(this.dK(), this.dp(), this.dr(), this.dv(), $$0);
      this.dK().b($$1);
   }

   @Override
   protected void b(byf $$0) {
      cix $$1 = $$0.j();
      if (this.j($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(bin.a));
         this.a($$0);
         this.a(bin.a, $$1.a(1));
         this.e(bin.a);
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
            gu $$1 = this.dk();
            dez $$2 = this.dK().a_($$1);
            this.dK().c(2001, $$1, csl.i($$2));
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
   public boolean m(cix $$0) {
      return $$0.a(apt.X);
   }

   @Override
   protected void a(cbm $$0, bja $$1) {
      ((but)$$1).b($$0.cv());
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
      return arp.i($$0, this.co, this.cn) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return arp.i($$0, this.cq, this.cp);
   }

   @Override
   public void h(@Nullable biy $$0) {
      if (this.gm() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return arp.f(($$0 - 5.0F) * $$1);
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
      aov $$0 = this.r();
      if ($$0 == aow.ie) {
         this.a($$0, 2.0F, this.eV());
      } else {
         super.M();
      }
   }

   @Nullable
   @Override
   protected aov r() {
      if (this.fB()) {
         return aow.if;
      } else {
         if (!this.dK().N() && this.ag.i() < 0.1F) {
            List<cbm> $$0 = this.dK().a(cbm.class, this.cG().c(16.0, 16.0, 16.0), bil.f);
            if ($$0.isEmpty()) {
               return aow.ie;
            }
         }

         return aow.hZ;
      }
   }

   @Nullable
   @Override
   protected aov d(bhg $$0) {
      return aow.id;
   }

   @Nullable
   @Override
   protected aov h_() {
      return aow.ib;
   }

   boolean c(UUID $$0) {
      return this.gl().contains($$0);
   }

   @Override
   protected void g(bhg $$0) {
      cix $$1 = this.c(bin.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bin.a, cix.b);
      }

      super.g($$0);
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + -0.0625F * $$2, -0.25F * $$2);
   }

   public static boolean a(but $$0, biy $$1) {
      double $$2 = $$1.dv() - $$0.dv();
      double $$3 = $$1.dp() - $$0.dp();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dK().a_(gu.a($$0.dp() + $$8, $$0.dr() + (double)$$9, $$0.dv() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ehd cI() {
      return new ehd(0.0, (double)(0.55F * this.cH()), (double)(this.df() * 0.4F));
   }

   class a extends brm<biy> {
      @Nullable
      private biy j;
      @Nullable
      private biy k;
      private int l;

      public a(Class<biy> $$0, boolean $$1, boolean $$2, @Nullable Predicate<biy> $$3) {
         super(but.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ee().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : but.this.gl()) {
               if ($$0 != null && but.this.dK() instanceof akk && ((akk)but.this.dK()).a($$0) instanceof biy $$2) {
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

         but.this.a(aow.hY, 1.0F, 1.0F);
         but.this.B(true);
         but.this.gn();
         super.c();
      }
   }

   class b extends bpt {
      int a;

      public b() {
         this.a(EnumSet.of(bpt.a.b, bpt.a.c, bpt.a.a));
      }

      @Override
      public boolean a() {
         return but.this.ga();
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
         but.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<biy> {
      public boolean a(biy $$0) {
         if ($$0 instanceof but) {
            return false;
         } else if ($$0 instanceof buo || $$0 instanceof bvd || $$0 instanceof bza) {
            return true;
         } else if ($$0 instanceof bjt) {
            return !((bjt)$$0).p();
         } else if (!($$0 instanceof cbm) || !$$0.G_() && !((cbm)$$0).f()) {
            return but.this.c($$0.cv()) ? false : !$$0.fB() && !$$0.bU();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bpt {
      private final btk b = btk.a().a(12.0).d().a(but.this.new c());

      protected boolean h() {
         gu $$0 = gu.a(but.this.dp(), but.this.cG().e, but.this.dv());
         return !but.this.dK().g($$0) && but.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !but.this.dK().a(biy.class, this.b, but.this, but.this.cG().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bpf {
      public e(double $$0) {
         super(but.this, $$0);
      }

      @Override
      public void c() {
         ((but)this.a).go();
         ((but)this.c).go();
         super.c();
      }

      @Override
      protected void g() {
         akk $$0 = (akk)this.b;
         but $$1 = (but)this.a.a($$0, (bid)this.c);
         if ($$1 != null) {
            akl $$2 = this.a.gd();
            akl $$3 = this.c.gd();
            akl $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cv());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cv());
            }

            if ($$4 != null) {
               $$4.a(apg.P);
               ai.o.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gf();
            this.c.gf();
            $$1.c_(-24000);
            $$1.b(this.a.dp(), this.a.dr(), this.a.dv(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.X().b(cph.f)) {
               this.b.b(new bio(this.b, this.a.dp(), this.a.dr(), this.a.dv(), this.a.ee().a(7) + 1));
            }
         }
      }
   }

   public class f extends bqg {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(but.this, $$1, $$2, $$3);
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
      protected boolean a(cpo $$0, gu $$1) {
         dez $$2 = $$0.a_($$1);
         return $$2.a(csm.oi) && $$2.c(dap.b) >= 2 || ctg.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && but.this.ag.i() < 0.05F) {
            but.this.a(aow.ig, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (but.this.dK().X().b(cph.c)) {
            dez $$0 = but.this.dK().a_(this.e);
            if ($$0.a(csm.oi)) {
               this.b($$0);
            } else if (ctg.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dez $$0) {
         ctg.a(but.this, $$0, but.this.dK(), this.e);
      }

      private void b(dez $$0) {
         int $$1 = $$0.c(dap.b);
         $$0.a(dap.b, Integer.valueOf(1));
         int $$2 = 1 + but.this.dK().z.a(2) + ($$1 == 3 ? 1 : 0);
         cix $$3 = but.this.c(bin.a);
         if ($$3.b()) {
            but.this.a(bin.a, new cix(cja.vv));
            $$2--;
         }

         if ($$2 > 0) {
            csl.a(but.this.dK(), this.e, new cix(cja.vv, $$2));
         }

         but.this.a(aow.xF, 1.0F, 1.0F);
         but.this.dK().a(this.e, $$0.a(dap.b, Integer.valueOf(1)), 2);
         but.this.dK().a(djj.c, this.e, djj.a.a(but.this));
      }

      @Override
      public boolean a() {
         return !but.this.fB() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         but.this.w(false);
         super.c();
      }
   }

   class g extends bpn {
      public g() {
         super(but.this);
      }

      @Override
      public void c() {
         super.c();
         but.this.go();
      }

      @Override
      public boolean a() {
         return but.this.aX() && but.this.b(apq.a) > 0.25 || but.this.bl();
      }
   }

   class h extends bps {
      private final but e;

      public h(but $$0, double $$1) {
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

   public static class i extends bid.a {
      public final but.v a;

      public i(but.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bqb {
      public j(bja $$0, Class<? extends biy> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !but.this.ga() && !but.this.gj();
      }

      @Override
      public boolean b() {
         return super.b() && !but.this.ga() && !but.this.gj();
      }
   }

   public class k extends bov {
      public k() {
         super(but.this);
      }

      @Override
      public void a() {
         if (!but.this.fB()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !but.this.gg() && !but.this.bW() && !but.this.gj() && !but.this.ga();
      }
   }

   class l extends bqd {
      public l(double $$0, boolean $$1) {
         super(but.this, $$0, $$1);
      }

      @Override
      protected void a(biy $$0) {
         if (this.i() && this.a.i($$0)) {
            this.h();
            this.a.C($$0);
            but.this.a(aow.ia, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         but.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !but.this.t() && !but.this.fB() && !but.this.bW() && !but.this.ga() && super.a();
      }
   }

   class m extends bow {
      public m() {
         super(but.this);
      }

      @Override
      public void a() {
         if (but.this.gp()) {
            super.a();
         }
      }
   }

   class n extends bqm {
      public n(double $$0) {
         super(but.this, $$0);
      }

      @Override
      public boolean h() {
         return !but.this.gm() && super.h();
      }
   }

   public class o extends bpx {
      @Override
      public boolean a() {
         if (!but.this.gi()) {
            return false;
         } else {
            biy $$0 = but.this.j();
            if ($$0 != null && $$0.bv()) {
               if ($$0.cE() != $$0.cD()) {
                  return false;
               } else {
                  boolean $$1 = but.a(but.this, $$0);
                  if (!$$1) {
                     but.this.H().a($$0, 0);
                     but.this.y(false);
                     but.this.z(false);
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
         biy $$0 = but.this.j();
         if ($$0 != null && $$0.bv()) {
            double $$1 = but.this.dn().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(but.this.dC()) < 15.0F) || !but.this.aA()) && !but.this.ga();
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
         but.this.r(true);
         but.this.x(true);
         but.this.z(false);
         biy $$0 = but.this.j();
         if ($$0 != null) {
            but.this.D().a($$0, 60.0F, 30.0F);
            ehd $$1 = new ehd($$0.dp() - but.this.dp(), $$0.dr() - but.this.dr(), $$0.dv() - but.this.dv()).d();
            but.this.f(but.this.dn().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         but.this.H().n();
      }

      @Override
      public void d() {
         but.this.y(false);
         but.this.cp = 0.0F;
         but.this.cq = 0.0F;
         but.this.z(false);
         but.this.x(false);
      }

      @Override
      public void e() {
         biy $$0 = but.this.j();
         if ($$0 != null) {
            but.this.D().a($$0, 60.0F, 30.0F);
         }

         if (!but.this.ga()) {
            ehd $$1 = but.this.dn();
            if ($$1.d * $$1.d < 0.03F && but.this.dC() != 0.0F) {
               but.this.s(arp.j(0.2F, but.this.dC(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               but.this.s((float)$$3);
            }
         }

         if ($$0 != null && but.this.e((bii)$$0) <= 2.0F) {
            but.this.C($$0);
         } else if (but.this.dC() > 0.0F && but.this.aA() && (float)but.this.dn().d != 0.0F && but.this.dK().a_(but.this.dk()).a(csm.dN)) {
            but.this.s(60.0F);
            but.this.h(null);
            but.this.A(true);
         }
      }
   }

   class p extends bpt {
      public p() {
         this.a(EnumSet.of(bpt.a.a));
      }

      @Override
      public boolean a() {
         if (!but.this.c(bin.a).b()) {
            return false;
         } else if (but.this.j() != null || but.this.ef() != null) {
            return false;
         } else if (!but.this.gp()) {
            return false;
         } else if (but.this.ee().a(b(10)) != 0) {
            return false;
         } else {
            List<byf> $$0 = but.this.dK().a(byf.class, but.this.cG().c(8.0, 8.0, 8.0), but.cf);
            return !$$0.isEmpty() && but.this.c(bin.a).b();
         }
      }

      @Override
      public void e() {
         List<byf> $$0 = but.this.dK().a(byf.class, but.this.cG().c(8.0, 8.0, 8.0), but.cf);
         cix $$1 = but.this.c(bin.a);
         if ($$1.b() && !$$0.isEmpty()) {
            but.this.H().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<byf> $$0 = but.this.dK().a(byf.class, but.this.cG().c(8.0, 8.0, 8.0), but.cf);
         if (!$$0.isEmpty()) {
            but.this.H().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends bqz {
      public q(int $$0, int $$1) {
         super(but.this, $$1);
      }

      @Override
      public void c() {
         but.this.go();
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
         return !but.this.fB() && !but.this.t() && !but.this.gm() && but.this.j() == null;
      }
   }

   class r extends but.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bpt.a.a, bpt.a.b));
      }

      @Override
      public boolean a() {
         return but.this.ef() == null
            && but.this.ee().i() < 0.02F
            && !but.this.fB()
            && but.this.j() == null
            && but.this.H().l()
            && !this.i()
            && !but.this.gg()
            && !but.this.bW();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + but.this.ee().a(3);
         but.this.w(true);
         but.this.H().n();
      }

      @Override
      public void d() {
         but.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         but.this.D().a(but.this.dp() + this.c, but.this.dt(), but.this.dv() + this.d, (float)but.this.X(), (float)but.this.W());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * but.this.ee().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + but.this.ee().a(20));
      }
   }

   class s extends bpm {
      private int c = b(100);

      public s(double $$0) {
         super(but.this, $$0);
      }

      @Override
      public boolean a() {
         if (!but.this.fB() && this.a.j() == null) {
            if (but.this.dK().Y() && but.this.dK().g(this.a.dk())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               gu $$0 = this.a.dk();
               return but.this.dK().N() && but.this.dK().g($$0) && !((akk)but.this.dK()).b($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         but.this.go();
         super.c();
      }
   }

   class t extends but.d {
      private static final int c = b(140);
      private int d = but.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(bpt.a.a, bpt.a.b, bpt.a.c));
      }

      @Override
      public boolean a() {
         return but.this.bk == 0.0F && but.this.bl == 0.0F && but.this.bm == 0.0F ? this.k() || but.this.fB() : false;
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
            return but.this.dK().N() && this.h() && !this.i() && !but.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = but.this.ag.a(c);
         but.this.go();
      }

      @Override
      public void c() {
         but.this.w(false);
         but.this.y(false);
         but.this.z(false);
         but.this.r(false);
         but.this.C(true);
         but.this.H().n();
         but.this.E().a(but.this.dp(), but.this.dr(), but.this.dv(), 0.0);
      }
   }

   class u extends bpt {
      public u() {
         this.a(EnumSet.of(bpt.a.a, bpt.a.b));
      }

      @Override
      public boolean a() {
         if (but.this.fB()) {
            return false;
         } else {
            biy $$0 = but.this.j();
            return $$0 != null && $$0.bv() && but.ch.test($$0) && but.this.f($$0) > 36.0 && !but.this.bW() && !but.this.gj() && !but.this.bj;
         }
      }

      @Override
      public void c() {
         but.this.w(false);
         but.this.A(false);
      }

      @Override
      public void d() {
         biy $$0 = but.this.j();
         if ($$0 != null && but.a(but.this, $$0)) {
            but.this.z(true);
            but.this.y(true);
            but.this.H().n();
            but.this.D().a($$0, (float)but.this.X(), (float)but.this.W());
         } else {
            but.this.z(false);
            but.this.y(false);
         }
      }

      @Override
      public void e() {
         biy $$0 = but.this.j();
         if ($$0 != null) {
            but.this.D().a($$0, (float)but.this.X(), (float)but.this.W());
            if (but.this.f($$0) <= 36.0) {
               but.this.z(true);
               but.this.y(true);
               but.this.H().n();
            } else {
               but.this.H().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements ash {
      a(0, "red"),
      b(1, "snow");

      public static final ash.a<but.v> c = ash.a(but.v::values);
      private static final IntFunction<but.v> d = aqk.a(but.v::a, values(), aqk.a.a);
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

      public static but.v a(String $$0) {
         return c.a($$0, a);
      }

      public static but.v a(int $$0) {
         return d.apply($$0);
      }

      public static but.v a(he<cqj> $$0) {
         return $$0.a(apk.aq) ? b : a;
      }
   }
}
