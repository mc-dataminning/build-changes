import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvd extends but implements bkg<bvd.v> {
   private static final aeg<Integer> bX = aej.a(bvd.class, aei.b);
   private static final aeg<Byte> bY = aej.a(bvd.class, aei.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final aeg<Optional<UUID>> cd = aej.a(bvd.class, aei.q);
   private static final aeg<Optional<UUID>> ce = aej.a(bvd.class, aei.q);
   static final Predicate<byp> cf = $$0 -> !$$0.y() && $$0.bv();
   private static final Predicate<bis> cg = $$0 -> !($$0 instanceof bji $$1) ? false : $$1.ei() != null && $$1.ej() < $$1.ah + 600;
   static final Predicate<bis> ch = $$0 -> $$0 instanceof buy || $$0 instanceof bvn;
   private static final Predicate<bis> ci = $$0 -> !$$0.bU() && biv.e.test($$0);
   private static final int cj = 600;
   private bqd ck;
   private bqd cl;
   private bqd cm;
   private float cn;
   private float co;
   float cp;
   float cq;
   private int cr;

   public bvd(biw<? extends bvd> $$0, cpx $$1) {
      super($$0, $$1);
      this.bK = new bvd.k();
      this.bL = new bvd.m();
      this.a(eaz.p, 0.0F);
      this.a(eaz.q, 0.0F);
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
   protected void z() {
      this.ck = new brw<>(this, but.class, 10, false, false, $$0 -> $$0 instanceof buy || $$0 instanceof bvn);
      this.cl = new brw<>(this, bvu.class, 10, false, false, bvu.bU);
      this.cm = new brw<>(this, buq.class, 20, false, false, $$0 -> $$0 instanceof bus);
      this.bO.a(0, new bvd.g());
      this.bO.a(0, new bps(this, this.dL()));
      this.bO.a(1, new bvd.b());
      this.bO.a(2, new bvd.n(2.2));
      this.bO.a(3, new bvd.e(1.0));
      this.bO.a(4, new bpk<>(this, cbw.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cv()) && !this.gp()));
      this.bO.a(4, new bpk<>(this, bvw.class, 8.0F, 1.6, 1.4, $$0 -> !((bvw)$$0).s() && !this.gp()));
      this.bO.a(4, new bpk<>(this, bvl.class, 8.0F, 1.6, 1.4, $$0 -> !this.gp()));
      this.bO.a(5, new bvd.u());
      this.bO.a(6, new bvd.o());
      this.bO.a(6, new bvd.s(1.25));
      this.bO.a(7, new bvd.l(1.2F, true));
      this.bO.a(7, new bvd.t());
      this.bO.a(8, new bvd.h(this, 1.25));
      this.bO.a(9, new bvd.q(32, 200));
      this.bO.a(10, new bvd.f(1.2F, 12, 1));
      this.bO.a(10, new bqj(this, 0.4F));
      this.bO.a(11, new brq(this, 1.0));
      this.bO.a(11, new bvd.p());
      this.bO.a(12, new bvd.j(this, cbw.class, 24.0F));
      this.bO.a(13, new bvd.r());
      this.bP.a(3, new bvd.a(bji.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cv())));
   }

   @Override
   public ape d(cjh $$0) {
      return apf.ic;
   }

   @Override
   public void b_() {
      if (!this.dL().B && this.bv() && this.cX()) {
         this.cr++;
         cjh $$0 = this.c(bix.a);
         if (this.l($$0)) {
            if (this.cr > 600) {
               cjh $$1 = $$0.a(this.dL(), this);
               if (!$$1.b()) {
                  this.a(bix.a, $$1);
               }

               this.cr = 0;
            } else if (this.cr > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dL().a(this, (byte)45);
            }
         }

         bji $$2 = this.q();
         if ($$2 == null || !$$2.bv()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fC() || this.eX()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      }

      super.b_();
      if (this.gp() && this.ag.i() < 0.05F) {
         this.a(apf.hY, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eX() {
      return this.ev();
   }

   private boolean l(cjh $$0) {
      return $$0.d().u() && this.q() == null && this.aA() && !this.fC();
   }

   @Override
   protected void a(ase $$0, bgy $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cjh $$3;
         if ($$2 < 0.05F) {
            $$3 = new cjh(cjk.nL);
         } else if ($$2 < 0.2F) {
            $$3 = new cjh(cjk.qd);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cjh(cjk.tJ) : new cjh(cjk.tK);
         } else if ($$2 < 0.6F) {
            $$3 = new cjh(cjk.oI);
         } else if ($$2 < 0.8F) {
            $$3 = new cjh(cjk.pP);
         } else {
            $$3 = new cjh(cjk.oF);
         }

         this.a(bix.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cjh $$1 = this.c(bix.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ehp $$3 = new ehp(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dD() * (float) (Math.PI / 180.0))
                  .b(-this.dB() * (float) (Math.PI / 180.0));
               this.dL().a(new it(ix.O, $$1), this.dq() + this.bE().c / 2.0, this.ds(), this.dw() + this.bE().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bkn.a s() {
      return bjk.A().a(bko.d, 0.3F).a(bko.a, 10.0).a(bko.b, 32.0).a(bko.f, 2.0);
   }

   @Nullable
   public bvd b(aks $$0, bin $$1) {
      bvd $$2 = biw.N.a((cpx)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.t() : ((bvd)$$1).t());
      }

      return $$2;
   }

   public static boolean c(biw<bvd> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return $$1.a_($$3.d()).a(apu.bW) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      hg<cqv> $$5 = $$0.s(this.dl());
      bvd.v $$6 = bvd.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof bvd.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new bvd.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof aks) {
         this.gn();
      }

      this.a($$0.D_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void gn() {
      if (this.t() == bvd.v.a) {
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
   protected void a(cbw $$0, bgz $$1, cjh $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return this.m_() ? $$1.b * 0.85F : 0.4F;
   }

   public bvd.v t() {
      return bvd.v.a(this.an.b(bX));
   }

   public void a(bvd.v $$0) {
      this.an.b(bX, $$0.a());
   }

   List<UUID> go() {
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
   public void b(qy $$0) {
      super.b($$0);
      List<UUID> $$1 = this.go();
      re $$2 = new re();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(rl.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fC());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.bW());
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);

      for (rs $$2 : $$0.c("Trusted", 11)) {
         this.b(rl.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(bvd.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dL() instanceof aks) {
         this.gn();
      }
   }

   public boolean y() {
      return this.t(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gd() {
      return this.t(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gp() {
      return this.t(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fC() {
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
   public boolean f(cjh $$0) {
      bix $$1 = bjk.h($$0);
      return !this.c($$1).b() ? false : $$1 == bix.a && super.f($$0);
   }

   @Override
   public boolean j(cjh $$0) {
      cjc $$1 = $$0.d();
      cjh $$2 = this.c(bix.a);
      return $$2.b() || this.cr > 0 && $$1.u() && !$$2.d().u();
   }

   private void n(cjh $$0) {
      if (!$$0.b() && !this.dL().B) {
         byp $$1 = new byp(this.dL(), this.dq() + this.bE().c, this.ds() + 1.0, this.dw() + this.bE().e, $$0);
         $$1.b(40);
         $$1.c(this.cv());
         this.a(apf.ih, 1.0F, 1.0F);
         this.dL().b($$1);
      }
   }

   private void o(cjh $$0) {
      byp $$1 = new byp(this.dL(), this.dq(), this.ds(), this.dw(), $$0);
      this.dL().b($$1);
   }

   @Override
   protected void b(byp $$0) {
      cjh $$1 = $$0.q();
      if (this.j($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(bix.a));
         this.a($$0);
         this.a(bix.a, $$1.a(1));
         this.e(bix.a);
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
         if ($$0 || this.q() != null || this.dL().Y()) {
            this.gq();
         }

         if ($$0 || this.fC()) {
            this.w(false);
         }

         if (this.gd() && this.dL().z.i() < 0.2F) {
            gw $$1 = this.dl();
            dfl $$2 = this.dL().a_($$1);
            this.dL().c(2001, $$1, csx.i($$2));
         }
      }

      this.co = this.cn;
      if (this.gm()) {
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
   public boolean m(cjh $$0) {
      return $$0.a(aqc.X);
   }

   @Override
   protected void a(cbw $$0, bjk $$1) {
      ((bvd)$$1).b($$0.cv());
   }

   public boolean gj() {
      return this.t(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gk() {
      return this.bj;
   }

   public boolean gl() {
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

   public boolean gm() {
      return this.t(8);
   }

   public float E(float $$0) {
      return ary.i($$0, this.co, this.cn) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return ary.i($$0, this.cq, this.cp);
   }

   @Override
   public void h(@Nullable bji $$0) {
      if (this.gp() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return ary.f(($$0 - 5.0F) * $$1);
   }

   void gq() {
      this.C(false);
   }

   void gr() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gs() {
      return !this.fC() && !this.y() && !this.gd();
   }

   @Override
   public void P() {
      ape $$0 = this.w();
      if ($$0 == apf.ie) {
         this.a($$0, 2.0F, this.eW());
      } else {
         super.P();
      }
   }

   @Nullable
   @Override
   protected ape w() {
      if (this.fC()) {
         return apf.if;
      } else {
         if (!this.dL().N() && this.ag.i() < 0.1F) {
            List<cbw> $$0 = this.dL().a(cbw.class, this.cG().c(16.0, 16.0, 16.0), biv.f);
            if ($$0.isEmpty()) {
               return apf.ie;
            }
         }

         return apf.hZ;
      }
   }

   @Nullable
   @Override
   protected ape d(bhq $$0) {
      return apf.id;
   }

   @Nullable
   @Override
   protected ape l_() {
      return apf.ib;
   }

   boolean c(UUID $$0) {
      return this.go().contains($$0);
   }

   @Override
   protected void g(bhq $$0) {
      cjh $$1 = this.c(bix.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bix.a, cjh.b);
      }

      super.g($$0);
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + -0.0625F * $$2, -0.25F * $$2);
   }

   public static boolean a(bvd $$0, bji $$1) {
      double $$2 = $$1.dw() - $$0.dw();
      double $$3 = $$1.dq() - $$0.dq();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dL().a_(gw.a($$0.dq() + $$8, $$0.ds() + (double)$$9, $$0.dw() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ehp cI() {
      return new ehp(0.0, (double)(0.55F * this.cH()), (double)(this.df() * 0.4F));
   }

   class a extends brw<bji> {
      @Nullable
      private bji j;
      @Nullable
      private bji k;
      private int l;

      public a(Class<bji> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bji> $$3) {
         super(bvd.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ef().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : bvd.this.go()) {
               if ($$0 != null && bvd.this.dL() instanceof aks && ((aks)bvd.this.dL()).a($$0) instanceof bji $$2) {
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

         bvd.this.a(apf.hY, 1.0F, 1.0F);
         bvd.this.B(true);
         bvd.this.gq();
         super.c();
      }
   }

   class b extends bqd {
      int a;

      public b() {
         this.a(EnumSet.of(bqd.a.b, bqd.a.c, bqd.a.a));
      }

      @Override
      public boolean a() {
         return bvd.this.gd();
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
         bvd.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bji> {
      public boolean a(bji $$0) {
         if ($$0 instanceof bvd) {
            return false;
         } else if ($$0 instanceof buy || $$0 instanceof bvn || $$0 instanceof bzk) {
            return true;
         } else if ($$0 instanceof bkd) {
            return !((bkd)$$0).s();
         } else if (!($$0 instanceof cbw) || !$$0.M_() && !((cbw)$$0).f()) {
            return bvd.this.c($$0.cv()) ? false : !$$0.fC() && !$$0.bU();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bqd {
      private final btu b = btu.a().a(12.0).d().a(bvd.this.new c());

      protected boolean h() {
         gw $$0 = gw.a(bvd.this.dq(), bvd.this.cG().e, bvd.this.dw());
         return !bvd.this.dL().g($$0) && bvd.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !bvd.this.dL().a(bji.class, this.b, bvd.this, bvd.this.cG().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bpp {
      public e(double $$0) {
         super(bvd.this, $$0);
      }

      @Override
      public void c() {
         ((bvd)this.a).gr();
         ((bvd)this.c).gr();
         super.c();
      }

      @Override
      protected void g() {
         aks $$0 = (aks)this.b;
         bvd $$1 = (bvd)this.a.a($$0, (bin)this.c);
         if ($$1 != null) {
            akt $$2 = this.a.gg();
            akt $$3 = this.c.gg();
            akt $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cv());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cv());
            }

            if ($$4 != null) {
               $$4.a(app.P);
               al.o.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gi();
            this.c.gi();
            $$1.c_(-24000);
            $$1.b(this.a.dq(), this.a.ds(), this.a.dw(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.X().b(cpt.f)) {
               this.b.b(new biy(this.b, this.a.dq(), this.a.ds(), this.a.dw(), this.a.ef().a(7) + 1));
            }
         }
      }
   }

   public class f extends bqq {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(bvd.this, $$1, $$2, $$3);
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
      protected boolean a(cqa $$0, gw $$1) {
         dfl $$2 = $$0.a_($$1);
         return $$2.a(csy.oi) && $$2.c(dbb.b) >= 2 || cts.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && bvd.this.ag.i() < 0.05F) {
            bvd.this.a(apf.ig, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (bvd.this.dL().X().b(cpt.c)) {
            dfl $$0 = bvd.this.dL().a_(this.e);
            if ($$0.a(csy.oi)) {
               this.b($$0);
            } else if (cts.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dfl $$0) {
         cts.a(bvd.this, $$0, bvd.this.dL(), this.e);
      }

      private void b(dfl $$0) {
         int $$1 = $$0.c(dbb.b);
         $$0.a(dbb.b, Integer.valueOf(1));
         int $$2 = 1 + bvd.this.dL().z.a(2) + ($$1 == 3 ? 1 : 0);
         cjh $$3 = bvd.this.c(bix.a);
         if ($$3.b()) {
            bvd.this.a(bix.a, new cjh(cjk.vv));
            $$2--;
         }

         if ($$2 > 0) {
            csx.a(bvd.this.dL(), this.e, new cjh(cjk.vv, $$2));
         }

         bvd.this.a(apf.xF, 1.0F, 1.0F);
         bvd.this.dL().a(this.e, $$0.a(dbb.b, Integer.valueOf(1)), 2);
         bvd.this.dL().a(djv.c, this.e, djv.a.a(bvd.this));
      }

      @Override
      public boolean a() {
         return !bvd.this.fC() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         bvd.this.w(false);
         super.c();
      }
   }

   class g extends bpx {
      public g() {
         super(bvd.this);
      }

      @Override
      public void c() {
         super.c();
         bvd.this.gr();
      }

      @Override
      public boolean a() {
         return bvd.this.aX() && bvd.this.b(apz.a) > 0.25 || bvd.this.bl();
      }
   }

   class h extends bqc {
      private final bvd e;

      public h(bvd $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gp() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gp() && super.b();
      }

      @Override
      public void c() {
         this.e.gr();
         super.c();
      }
   }

   public static class i extends bin.a {
      public final bvd.v a;

      public i(bvd.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bql {
      public j(bjk $$0, Class<? extends bji> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !bvd.this.gd() && !bvd.this.gm();
      }

      @Override
      public boolean b() {
         return super.b() && !bvd.this.gd() && !bvd.this.gm();
      }
   }

   public class k extends bpf {
      public k() {
         super(bvd.this);
      }

      @Override
      public void a() {
         if (!bvd.this.fC()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bvd.this.gj() && !bvd.this.bW() && !bvd.this.gm() && !bvd.this.gd();
      }
   }

   class l extends bqn {
      public l(double $$0, boolean $$1) {
         super(bvd.this, $$0, $$1);
      }

      @Override
      protected void a(bji $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bvd.this.a(apf.ia, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         bvd.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !bvd.this.y() && !bvd.this.fC() && !bvd.this.bW() && !bvd.this.gd() && super.a();
      }
   }

   class m extends bpg {
      public m() {
         super(bvd.this);
      }

      @Override
      public void a() {
         if (bvd.this.gs()) {
            super.a();
         }
      }
   }

   class n extends bqw {
      public n(double $$0) {
         super(bvd.this, $$0);
      }

      @Override
      public boolean h() {
         return !bvd.this.gp() && super.h();
      }
   }

   public class o extends bqh {
      @Override
      public boolean a() {
         if (!bvd.this.gl()) {
            return false;
         } else {
            bji $$0 = bvd.this.q();
            if ($$0 != null && $$0.bv()) {
               if ($$0.cE() != $$0.cD()) {
                  return false;
               } else {
                  boolean $$1 = bvd.a(bvd.this, $$0);
                  if (!$$1) {
                     bvd.this.L().a($$0, 0);
                     bvd.this.y(false);
                     bvd.this.z(false);
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
         bji $$0 = bvd.this.q();
         if ($$0 != null && $$0.bv()) {
            double $$1 = bvd.this.do().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(bvd.this.dD()) < 15.0F) || !bvd.this.aA()) && !bvd.this.gd();
         } else {
            return false;
         }
      }

      @Override
      public boolean P_() {
         return false;
      }

      @Override
      public void c() {
         bvd.this.r(true);
         bvd.this.x(true);
         bvd.this.z(false);
         bji $$0 = bvd.this.q();
         if ($$0 != null) {
            bvd.this.G().a($$0, 60.0F, 30.0F);
            ehp $$1 = new ehp($$0.dq() - bvd.this.dq(), $$0.ds() - bvd.this.ds(), $$0.dw() - bvd.this.dw()).d();
            bvd.this.f(bvd.this.do().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         bvd.this.L().n();
      }

      @Override
      public void d() {
         bvd.this.y(false);
         bvd.this.cp = 0.0F;
         bvd.this.cq = 0.0F;
         bvd.this.z(false);
         bvd.this.x(false);
      }

      @Override
      public void e() {
         bji $$0 = bvd.this.q();
         if ($$0 != null) {
            bvd.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!bvd.this.gd()) {
            ehp $$1 = bvd.this.do();
            if ($$1.d * $$1.d < 0.03F && bvd.this.dD() != 0.0F) {
               bvd.this.s(ary.j(0.2F, bvd.this.dD(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               bvd.this.s((float)$$3);
            }
         }

         if ($$0 != null && bvd.this.e((bis)$$0) <= 2.0F) {
            bvd.this.C($$0);
         } else if (bvd.this.dD() > 0.0F && bvd.this.aA() && (float)bvd.this.do().d != 0.0F && bvd.this.dL().a_(bvd.this.dl()).a(csy.dN)) {
            bvd.this.s(60.0F);
            bvd.this.h(null);
            bvd.this.A(true);
         }
      }
   }

   class p extends bqd {
      public p() {
         this.a(EnumSet.of(bqd.a.a));
      }

      @Override
      public boolean a() {
         if (!bvd.this.c(bix.a).b()) {
            return false;
         } else if (bvd.this.q() != null || bvd.this.eg() != null) {
            return false;
         } else if (!bvd.this.gs()) {
            return false;
         } else if (bvd.this.ef().a(b(10)) != 0) {
            return false;
         } else {
            List<byp> $$0 = bvd.this.dL().a(byp.class, bvd.this.cG().c(8.0, 8.0, 8.0), bvd.cf);
            return !$$0.isEmpty() && bvd.this.c(bix.a).b();
         }
      }

      @Override
      public void e() {
         List<byp> $$0 = bvd.this.dL().a(byp.class, bvd.this.cG().c(8.0, 8.0, 8.0), bvd.cf);
         cjh $$1 = bvd.this.c(bix.a);
         if ($$1.b() && !$$0.isEmpty()) {
            bvd.this.L().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<byp> $$0 = bvd.this.dL().a(byp.class, bvd.this.cG().c(8.0, 8.0, 8.0), bvd.cf);
         if (!$$0.isEmpty()) {
            bvd.this.L().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends brj {
      public q(int $$0, int $$1) {
         super(bvd.this, $$1);
      }

      @Override
      public void c() {
         bvd.this.gr();
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
         return !bvd.this.fC() && !bvd.this.y() && !bvd.this.gp() && bvd.this.q() == null;
      }
   }

   class r extends bvd.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bqd.a.a, bqd.a.b));
      }

      @Override
      public boolean a() {
         return bvd.this.eg() == null
            && bvd.this.ef().i() < 0.02F
            && !bvd.this.fC()
            && bvd.this.q() == null
            && bvd.this.L().l()
            && !this.i()
            && !bvd.this.gj()
            && !bvd.this.bW();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + bvd.this.ef().a(3);
         bvd.this.w(true);
         bvd.this.L().n();
      }

      @Override
      public void d() {
         bvd.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         bvd.this.G().a(bvd.this.dq() + this.c, bvd.this.du(), bvd.this.dw() + this.d, (float)bvd.this.Z(), (float)bvd.this.Y());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * bvd.this.ef().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + bvd.this.ef().a(20));
      }
   }

   class s extends bpw {
      private int c = b(100);

      public s(double $$0) {
         super(bvd.this, $$0);
      }

      @Override
      public boolean a() {
         if (!bvd.this.fC() && this.a.q() == null) {
            if (bvd.this.dL().Y() && bvd.this.dL().g(this.a.dl())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               gw $$0 = this.a.dl();
               return bvd.this.dL().N() && bvd.this.dL().g($$0) && !((aks)bvd.this.dL()).b($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         bvd.this.gr();
         super.c();
      }
   }

   class t extends bvd.d {
      private static final int c = b(140);
      private int d = bvd.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(bqd.a.a, bqd.a.b, bqd.a.c));
      }

      @Override
      public boolean a() {
         return bvd.this.bk == 0.0F && bvd.this.bl == 0.0F && bvd.this.bm == 0.0F ? this.k() || bvd.this.fC() : false;
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
            return bvd.this.dL().N() && this.h() && !this.i() && !bvd.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = bvd.this.ag.a(c);
         bvd.this.gr();
      }

      @Override
      public void c() {
         bvd.this.w(false);
         bvd.this.y(false);
         bvd.this.z(false);
         bvd.this.r(false);
         bvd.this.C(true);
         bvd.this.L().n();
         bvd.this.I().a(bvd.this.dq(), bvd.this.ds(), bvd.this.dw(), 0.0);
      }
   }

   class u extends bqd {
      public u() {
         this.a(EnumSet.of(bqd.a.a, bqd.a.b));
      }

      @Override
      public boolean a() {
         if (bvd.this.fC()) {
            return false;
         } else {
            bji $$0 = bvd.this.q();
            return $$0 != null && $$0.bv() && bvd.ch.test($$0) && bvd.this.f($$0) > 36.0 && !bvd.this.bW() && !bvd.this.gm() && !bvd.this.bj;
         }
      }

      @Override
      public void c() {
         bvd.this.w(false);
         bvd.this.A(false);
      }

      @Override
      public void d() {
         bji $$0 = bvd.this.q();
         if ($$0 != null && bvd.a(bvd.this, $$0)) {
            bvd.this.z(true);
            bvd.this.y(true);
            bvd.this.L().n();
            bvd.this.G().a($$0, (float)bvd.this.Z(), (float)bvd.this.Y());
         } else {
            bvd.this.z(false);
            bvd.this.y(false);
         }
      }

      @Override
      public void e() {
         bji $$0 = bvd.this.q();
         if ($$0 != null) {
            bvd.this.G().a($$0, (float)bvd.this.Z(), (float)bvd.this.Y());
            if (bvd.this.f($$0) <= 36.0) {
               bvd.this.z(true);
               bvd.this.y(true);
               bvd.this.L().n();
            } else {
               bvd.this.L().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements asr {
      a(0, "red"),
      b(1, "snow");

      public static final asr.a<bvd.v> c = asr.a(bvd.v::values);
      private static final IntFunction<bvd.v> d = aqt.a(bvd.v::a, values(), aqt.a.a);
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

      public static bvd.v a(String $$0) {
         return c.a($$0, a);
      }

      public static bvd.v a(int $$0) {
         return d.apply($$0);
      }

      public static bvd.v a(hg<cqv> $$0) {
         return $$0.a(apt.aq) ? b : a;
      }
   }
}
