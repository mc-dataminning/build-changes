import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class buu extends buk implements bjx<buu.v> {
   private static final adz<Integer> bX = aec.a(buu.class, aeb.b);
   private static final adz<Byte> bY = aec.a(buu.class, aeb.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final adz<Optional<UUID>> cd = aec.a(buu.class, aeb.q);
   private static final adz<Optional<UUID>> ce = aec.a(buu.class, aeb.q);
   static final Predicate<byg> cf = $$0 -> !$$0.r() && $$0.bv();
   private static final Predicate<bii> cg = $$0 -> !($$0 instanceof biy $$1) ? false : $$1.eh() != null && $$1.ei() < $$1.ah + 600;
   static final Predicate<bii> ch = $$0 -> $$0 instanceof bup || $$0 instanceof bve;
   private static final Predicate<bii> ci = $$0 -> !$$0.bU() && bil.e.test($$0);
   private static final int cj = 600;
   private bpu ck;
   private bpu cl;
   private bpu cm;
   private float cn;
   private float co;
   float cp;
   float cq;
   private int cr;

   public buu(bim<? extends buu> $$0, cpm $$1) {
      super($$0, $$1);
      this.bK = new buu.k();
      this.bL = new buu.m();
      this.a(eao.p, 0.0F);
      this.a(eao.q, 0.0F);
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
      this.ck = new brn<>(this, buk.class, 10, false, false, $$0 -> $$0 instanceof bup || $$0 instanceof bve);
      this.cl = new brn<>(this, bvl.class, 10, false, false, bvl.bU);
      this.cm = new brn<>(this, buh.class, 20, false, false, $$0 -> $$0 instanceof buj);
      this.bO.a(0, new buu.g());
      this.bO.a(0, new bpj(this, this.dK()));
      this.bO.a(1, new buu.b());
      this.bO.a(2, new buu.n(2.2));
      this.bO.a(3, new buu.e(1.0));
      this.bO.a(4, new bpb<>(this, cbn.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cv()) && !this.gl()));
      this.bO.a(4, new bpb<>(this, bvn.class, 8.0F, 1.6, 1.4, $$0 -> !((bvn)$$0).p() && !this.gl()));
      this.bO.a(4, new bpb<>(this, bvc.class, 8.0F, 1.6, 1.4, $$0 -> !this.gl()));
      this.bO.a(5, new buu.u());
      this.bO.a(6, new buu.o());
      this.bO.a(6, new buu.s(1.25));
      this.bO.a(7, new buu.l(1.2F, true));
      this.bO.a(7, new buu.t());
      this.bO.a(8, new buu.h(this, 1.25));
      this.bO.a(9, new buu.q(32, 200));
      this.bO.a(10, new buu.f(1.2F, 12, 1));
      this.bO.a(10, new bqa(this, 0.4F));
      this.bO.a(11, new brh(this, 1.0));
      this.bO.a(11, new buu.p());
      this.bO.a(12, new buu.j(this, cbn.class, 24.0F));
      this.bO.a(13, new buu.r());
      this.bP.a(3, new buu.a(biy.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cv())));
   }

   @Override
   public aov d(ciy $$0) {
      return aow.ic;
   }

   @Override
   public void b_() {
      if (!this.dK().B && this.bv() && this.cX()) {
         this.cr++;
         ciy $$0 = this.c(bin.a);
         if (this.l($$0)) {
            if (this.cr > 600) {
               ciy $$1 = $$0.a(this.dK(), this);
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
      if (this.gl() && this.ag.i() < 0.05F) {
         this.a(aow.hY, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eW() {
      return this.eu();
   }

   private boolean l(ciy $$0) {
      return $$0.d().u() && this.j() == null && this.aA() && !this.fB();
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         ciy $$3;
         if ($$2 < 0.05F) {
            $$3 = new ciy(cjb.nL);
         } else if ($$2 < 0.2F) {
            $$3 = new ciy(cjb.qd);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new ciy(cjb.tJ) : new ciy(cjb.tK);
         } else if ($$2 < 0.6F) {
            $$3 = new ciy(cjb.oI);
         } else if ($$2 < 0.8F) {
            $$3 = new ciy(cjb.pP);
         } else {
            $$3 = new ciy(cjb.oF);
         }

         this.a(bin.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         ciy $$1 = this.c(bin.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ehe $$3 = new ehe(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dC() * (float) (Math.PI / 180.0))
                  .b(-this.dA() * (float) (Math.PI / 180.0));
               this.dK().a(new ir(iv.O, $$1), this.dp() + this.bE().c / 2.0, this.dr(), this.dv() + this.bE().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bke.a p() {
      return bja.x().a(bkf.d, 0.3F).a(bkf.a, 10.0).a(bkf.b, 32.0).a(bkf.f, 2.0);
   }

   @Nullable
   public buu b(akk $$0, bid $$1) {
      buu $$2 = bim.N.a((cpm)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.q() : ((buu)$$1).q());
      }

      return $$2;
   }

   public static boolean c(bim<buu> $$0, cpn $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.a_($$3.d()).a(apl.bW) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      he<cqk> $$5 = $$0.s(this.dk());
      buu.v $$6 = buu.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof buu.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new buu.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof akk) {
         this.gj();
      }

      this.a($$0.y_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void gj() {
      if (this.q() == buu.v.a) {
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
   protected void a(cbn $$0, bgp $$1, ciy $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return this.i_() ? $$1.b * 0.85F : 0.4F;
   }

   public buu.v q() {
      return buu.v.a(this.an.b(bX));
   }

   public void a(buu.v $$0) {
      this.an.b(bX, $$0.a());
   }

   List<UUID> gk() {
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
      List<UUID> $$1 = this.gk();
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
      this.a(buu.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dK() instanceof akk) {
         this.gj();
      }
   }

   public boolean t() {
      return this.t(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean fZ() {
      return this.t(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gl() {
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
   public boolean f(ciy $$0) {
      bin $$1 = bja.h($$0);
      return !this.c($$1).b() ? false : $$1 == bin.a && super.f($$0);
   }

   @Override
   public boolean j(ciy $$0) {
      cit $$1 = $$0.d();
      ciy $$2 = this.c(bin.a);
      return $$2.b() || this.cr > 0 && $$1.u() && !$$2.d().u();
   }

   private void n(ciy $$0) {
      if (!$$0.b() && !this.dK().B) {
         byg $$1 = new byg(this.dK(), this.dp() + this.bE().c, this.dr() + 1.0, this.dv() + this.bE().e, $$0);
         $$1.b(40);
         $$1.c(this.cv());
         this.a(aow.ih, 1.0F, 1.0F);
         this.dK().b($$1);
      }
   }

   private void o(ciy $$0) {
      byg $$1 = new byg(this.dK(), this.dp(), this.dr(), this.dv(), $$0);
      this.dK().b($$1);
   }

   @Override
   protected void b(byg $$0) {
      ciy $$1 = $$0.j();
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
            this.gm();
         }

         if ($$0 || this.fB()) {
            this.w(false);
         }

         if (this.fZ() && this.dK().z.i() < 0.2F) {
            gu $$1 = this.dk();
            dfa $$2 = this.dK().a_($$1);
            this.dK().c(2001, $$1, csm.i($$2));
         }
      }

      this.co = this.cn;
      if (this.gi()) {
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
   public boolean m(ciy $$0) {
      return $$0.a(apt.X);
   }

   @Override
   protected void a(cbn $$0, bja $$1) {
      ((buu)$$1).b($$0.cv());
   }

   public boolean gf() {
      return this.t(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gg() {
      return this.bj;
   }

   public boolean gh() {
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

   public boolean gi() {
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
      if (this.gl() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return arp.f(($$0 - 5.0F) * $$1);
   }

   void gm() {
      this.C(false);
   }

   void gn() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean go() {
      return !this.fB() && !this.t() && !this.fZ();
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
            List<cbn> $$0 = this.dK().a(cbn.class, this.cG().c(16.0, 16.0, 16.0), bil.f);
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
      return this.gk().contains($$0);
   }

   @Override
   protected void g(bhg $$0) {
      ciy $$1 = this.c(bin.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bin.a, ciy.b);
      }

      super.g($$0);
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + -0.0625F * $$2, -0.25F * $$2);
   }

   public static boolean a(buu $$0, biy $$1) {
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
   public ehe cI() {
      return new ehe(0.0, (double)(0.55F * this.cH()), (double)(this.df() * 0.4F));
   }

   class a extends brn<biy> {
      @Nullable
      private biy j;
      @Nullable
      private biy k;
      private int l;

      public a(Class<biy> $$0, boolean $$1, boolean $$2, @Nullable Predicate<biy> $$3) {
         super(buu.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ee().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : buu.this.gk()) {
               if ($$0 != null && buu.this.dK() instanceof akk && ((akk)buu.this.dK()).a($$0) instanceof biy $$2) {
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

         buu.this.a(aow.hY, 1.0F, 1.0F);
         buu.this.B(true);
         buu.this.gm();
         super.c();
      }
   }

   class b extends bpu {
      int a;

      public b() {
         this.a(EnumSet.of(bpu.a.b, bpu.a.c, bpu.a.a));
      }

      @Override
      public boolean a() {
         return buu.this.fZ();
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
         buu.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<biy> {
      public boolean a(biy $$0) {
         if ($$0 instanceof buu) {
            return false;
         } else if ($$0 instanceof bup || $$0 instanceof bve || $$0 instanceof bzb) {
            return true;
         } else if ($$0 instanceof bju) {
            return !((bju)$$0).p();
         } else if (!($$0 instanceof cbn) || !$$0.G_() && !((cbn)$$0).f()) {
            return buu.this.c($$0.cv()) ? false : !$$0.fB() && !$$0.bU();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bpu {
      private final btl b = btl.a().a(12.0).d().a(buu.this.new c());

      protected boolean h() {
         gu $$0 = gu.a(buu.this.dp(), buu.this.cG().e, buu.this.dv());
         return !buu.this.dK().g($$0) && buu.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !buu.this.dK().a(biy.class, this.b, buu.this, buu.this.cG().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bpg {
      public e(double $$0) {
         super(buu.this, $$0);
      }

      @Override
      public void c() {
         ((buu)this.a).gn();
         ((buu)this.c).gn();
         super.c();
      }

      @Override
      protected void g() {
         akk $$0 = (akk)this.b;
         buu $$1 = (buu)this.a.a($$0, (bid)this.c);
         if ($$1 != null) {
            akl $$2 = this.a.gc();
            akl $$3 = this.c.gc();
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
            this.a.ge();
            this.c.ge();
            $$1.c_(-24000);
            $$1.b(this.a.dp(), this.a.dr(), this.a.dv(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.X().b(cpi.f)) {
               this.b.b(new bio(this.b, this.a.dp(), this.a.dr(), this.a.dv(), this.a.ee().a(7) + 1));
            }
         }
      }
   }

   public class f extends bqh {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(buu.this, $$1, $$2, $$3);
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
      protected boolean a(cpp $$0, gu $$1) {
         dfa $$2 = $$0.a_($$1);
         return $$2.a(csn.oi) && $$2.c(daq.b) >= 2 || cth.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && buu.this.ag.i() < 0.05F) {
            buu.this.a(aow.ig, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (buu.this.dK().X().b(cpi.c)) {
            dfa $$0 = buu.this.dK().a_(this.e);
            if ($$0.a(csn.oi)) {
               this.b($$0);
            } else if (cth.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dfa $$0) {
         cth.a(buu.this, $$0, buu.this.dK(), this.e);
      }

      private void b(dfa $$0) {
         int $$1 = $$0.c(daq.b);
         $$0.a(daq.b, Integer.valueOf(1));
         int $$2 = 1 + buu.this.dK().z.a(2) + ($$1 == 3 ? 1 : 0);
         ciy $$3 = buu.this.c(bin.a);
         if ($$3.b()) {
            buu.this.a(bin.a, new ciy(cjb.vv));
            $$2--;
         }

         if ($$2 > 0) {
            csm.a(buu.this.dK(), this.e, new ciy(cjb.vv, $$2));
         }

         buu.this.a(aow.xA, 1.0F, 1.0F);
         buu.this.dK().a(this.e, $$0.a(daq.b, Integer.valueOf(1)), 2);
         buu.this.dK().a(djk.c, this.e, djk.a.a(buu.this));
      }

      @Override
      public boolean a() {
         return !buu.this.fB() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         buu.this.w(false);
         super.c();
      }
   }

   class g extends bpo {
      public g() {
         super(buu.this);
      }

      @Override
      public void c() {
         super.c();
         buu.this.gn();
      }

      @Override
      public boolean a() {
         return buu.this.aX() && buu.this.b(apq.a) > 0.25 || buu.this.bl();
      }
   }

   class h extends bpt {
      private final buu e;

      public h(buu $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gl() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gl() && super.b();
      }

      @Override
      public void c() {
         this.e.gn();
         super.c();
      }
   }

   public static class i extends bid.a {
      public final buu.v a;

      public i(buu.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bqc {
      public j(bja $$0, Class<? extends biy> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !buu.this.fZ() && !buu.this.gi();
      }

      @Override
      public boolean b() {
         return super.b() && !buu.this.fZ() && !buu.this.gi();
      }
   }

   public class k extends bow {
      public k() {
         super(buu.this);
      }

      @Override
      public void a() {
         if (!buu.this.fB()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !buu.this.gf() && !buu.this.bW() && !buu.this.gi() && !buu.this.fZ();
      }
   }

   class l extends bqe {
      public l(double $$0, boolean $$1) {
         super(buu.this, $$0, $$1);
      }

      @Override
      protected void a(biy $$0, double $$1) {
         double $$2 = this.a($$0);
         if ($$1 <= $$2 && this.i()) {
            this.h();
            this.a.C($$0);
            buu.this.a(aow.ia, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         buu.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !buu.this.t() && !buu.this.fB() && !buu.this.bW() && !buu.this.fZ() && super.a();
      }
   }

   class m extends box {
      public m() {
         super(buu.this);
      }

      @Override
      public void a() {
         if (buu.this.go()) {
            super.a();
         }
      }
   }

   class n extends bqn {
      public n(double $$0) {
         super(buu.this, $$0);
      }

      @Override
      public boolean h() {
         return !buu.this.gl() && super.h();
      }
   }

   public class o extends bpy {
      @Override
      public boolean a() {
         if (!buu.this.gh()) {
            return false;
         } else {
            biy $$0 = buu.this.j();
            if ($$0 != null && $$0.bv()) {
               if ($$0.cE() != $$0.cD()) {
                  return false;
               } else {
                  boolean $$1 = buu.a(buu.this, $$0);
                  if (!$$1) {
                     buu.this.H().a($$0, 0);
                     buu.this.y(false);
                     buu.this.z(false);
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
         biy $$0 = buu.this.j();
         if ($$0 != null && $$0.bv()) {
            double $$1 = buu.this.dn().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(buu.this.dC()) < 15.0F) || !buu.this.aA()) && !buu.this.fZ();
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
         buu.this.r(true);
         buu.this.x(true);
         buu.this.z(false);
         biy $$0 = buu.this.j();
         if ($$0 != null) {
            buu.this.D().a($$0, 60.0F, 30.0F);
            ehe $$1 = new ehe($$0.dp() - buu.this.dp(), $$0.dr() - buu.this.dr(), $$0.dv() - buu.this.dv()).d();
            buu.this.f(buu.this.dn().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         buu.this.H().n();
      }

      @Override
      public void d() {
         buu.this.y(false);
         buu.this.cp = 0.0F;
         buu.this.cq = 0.0F;
         buu.this.z(false);
         buu.this.x(false);
      }

      @Override
      public void e() {
         biy $$0 = buu.this.j();
         if ($$0 != null) {
            buu.this.D().a($$0, 60.0F, 30.0F);
         }

         if (!buu.this.fZ()) {
            ehe $$1 = buu.this.dn();
            if ($$1.d * $$1.d < 0.03F && buu.this.dC() != 0.0F) {
               buu.this.s(arp.j(0.2F, buu.this.dC(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               buu.this.s((float)$$3);
            }
         }

         if ($$0 != null && buu.this.e((bii)$$0) <= 2.0F) {
            buu.this.C($$0);
         } else if (buu.this.dC() > 0.0F && buu.this.aA() && (float)buu.this.dn().d != 0.0F && buu.this.dK().a_(buu.this.dk()).a(csn.dN)) {
            buu.this.s(60.0F);
            buu.this.h(null);
            buu.this.A(true);
         }
      }
   }

   class p extends bpu {
      public p() {
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public boolean a() {
         if (!buu.this.c(bin.a).b()) {
            return false;
         } else if (buu.this.j() != null || buu.this.ef() != null) {
            return false;
         } else if (!buu.this.go()) {
            return false;
         } else if (buu.this.ee().a(b(10)) != 0) {
            return false;
         } else {
            List<byg> $$0 = buu.this.dK().a(byg.class, buu.this.cG().c(8.0, 8.0, 8.0), buu.cf);
            return !$$0.isEmpty() && buu.this.c(bin.a).b();
         }
      }

      @Override
      public void e() {
         List<byg> $$0 = buu.this.dK().a(byg.class, buu.this.cG().c(8.0, 8.0, 8.0), buu.cf);
         ciy $$1 = buu.this.c(bin.a);
         if ($$1.b() && !$$0.isEmpty()) {
            buu.this.H().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<byg> $$0 = buu.this.dK().a(byg.class, buu.this.cG().c(8.0, 8.0, 8.0), buu.cf);
         if (!$$0.isEmpty()) {
            buu.this.H().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends bra {
      public q(int $$0, int $$1) {
         super(buu.this, $$1);
      }

      @Override
      public void c() {
         buu.this.gn();
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
         return !buu.this.fB() && !buu.this.t() && !buu.this.gl() && buu.this.j() == null;
      }
   }

   class r extends buu.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bpu.a.a, bpu.a.b));
      }

      @Override
      public boolean a() {
         return buu.this.ef() == null
            && buu.this.ee().i() < 0.02F
            && !buu.this.fB()
            && buu.this.j() == null
            && buu.this.H().l()
            && !this.i()
            && !buu.this.gf()
            && !buu.this.bW();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + buu.this.ee().a(3);
         buu.this.w(true);
         buu.this.H().n();
      }

      @Override
      public void d() {
         buu.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         buu.this.D().a(buu.this.dp() + this.c, buu.this.dt(), buu.this.dv() + this.d, (float)buu.this.X(), (float)buu.this.W());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * buu.this.ee().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + buu.this.ee().a(20));
      }
   }

   class s extends bpn {
      private int c = b(100);

      public s(double $$0) {
         super(buu.this, $$0);
      }

      @Override
      public boolean a() {
         if (!buu.this.fB() && this.a.j() == null) {
            if (buu.this.dK().Y() && buu.this.dK().g(this.a.dk())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               gu $$0 = this.a.dk();
               return buu.this.dK().N() && buu.this.dK().g($$0) && !((akk)buu.this.dK()).b($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         buu.this.gn();
         super.c();
      }
   }

   class t extends buu.d {
      private static final int c = b(140);
      private int d = buu.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(bpu.a.a, bpu.a.b, bpu.a.c));
      }

      @Override
      public boolean a() {
         return buu.this.bk == 0.0F && buu.this.bl == 0.0F && buu.this.bm == 0.0F ? this.k() || buu.this.fB() : false;
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
            return buu.this.dK().N() && this.h() && !this.i() && !buu.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = buu.this.ag.a(c);
         buu.this.gn();
      }

      @Override
      public void c() {
         buu.this.w(false);
         buu.this.y(false);
         buu.this.z(false);
         buu.this.r(false);
         buu.this.C(true);
         buu.this.H().n();
         buu.this.E().a(buu.this.dp(), buu.this.dr(), buu.this.dv(), 0.0);
      }
   }

   class u extends bpu {
      public u() {
         this.a(EnumSet.of(bpu.a.a, bpu.a.b));
      }

      @Override
      public boolean a() {
         if (buu.this.fB()) {
            return false;
         } else {
            biy $$0 = buu.this.j();
            return $$0 != null && $$0.bv() && buu.ch.test($$0) && buu.this.f($$0) > 36.0 && !buu.this.bW() && !buu.this.gi() && !buu.this.bj;
         }
      }

      @Override
      public void c() {
         buu.this.w(false);
         buu.this.A(false);
      }

      @Override
      public void d() {
         biy $$0 = buu.this.j();
         if ($$0 != null && buu.a(buu.this, $$0)) {
            buu.this.z(true);
            buu.this.y(true);
            buu.this.H().n();
            buu.this.D().a($$0, (float)buu.this.X(), (float)buu.this.W());
         } else {
            buu.this.z(false);
            buu.this.y(false);
         }
      }

      @Override
      public void e() {
         biy $$0 = buu.this.j();
         if ($$0 != null) {
            buu.this.D().a($$0, (float)buu.this.X(), (float)buu.this.W());
            if (buu.this.f($$0) <= 36.0) {
               buu.this.z(true);
               buu.this.y(true);
               buu.this.H().n();
            } else {
               buu.this.H().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements ash {
      a(0, "red"),
      b(1, "snow");

      public static final ash.a<buu.v> c = ash.a(buu.v::values);
      private static final IntFunction<buu.v> d = aqk.a(buu.v::a, values(), aqk.a.a);
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

      public static buu.v a(String $$0) {
         return c.a($$0, a);
      }

      public static buu.v a(int $$0) {
         return d.apply($$0);
      }

      public static buu.v a(he<cqk> $$0) {
         return $$0.a(apk.aq) ? b : a;
      }
   }
}
