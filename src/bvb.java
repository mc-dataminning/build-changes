import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvb extends bur implements bke<bvb.v> {
   private static final aee<Integer> bX = aeh.a(bvb.class, aeg.b);
   private static final aee<Byte> bY = aeh.a(bvb.class, aeg.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final aee<Optional<UUID>> cd = aeh.a(bvb.class, aeg.q);
   private static final aee<Optional<UUID>> ce = aeh.a(bvb.class, aeg.q);
   static final Predicate<byn> cf = $$0 -> !$$0.y() && $$0.bv();
   private static final Predicate<biq> cg = $$0 -> !($$0 instanceof bjg $$1) ? false : $$1.ei() != null && $$1.ej() < $$1.ah + 600;
   static final Predicate<biq> ch = $$0 -> $$0 instanceof buw || $$0 instanceof bvl;
   private static final Predicate<biq> ci = $$0 -> !$$0.bU() && bit.e.test($$0);
   private static final int cj = 600;
   private bqb ck;
   private bqb cl;
   private bqb cm;
   private float cn;
   private float co;
   float cp;
   float cq;
   private int cr;

   public bvb(biu<? extends bvb> $$0, cpv $$1) {
      super($$0, $$1);
      this.bK = new bvb.k();
      this.bL = new bvb.m();
      this.a(eax.p, 0.0F);
      this.a(eax.q, 0.0F);
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
      this.ck = new bru<>(this, bur.class, 10, false, false, $$0 -> $$0 instanceof buw || $$0 instanceof bvl);
      this.cl = new bru<>(this, bvs.class, 10, false, false, bvs.bU);
      this.cm = new bru<>(this, buo.class, 20, false, false, $$0 -> $$0 instanceof buq);
      this.bO.a(0, new bvb.g());
      this.bO.a(0, new bpq(this, this.dL()));
      this.bO.a(1, new bvb.b());
      this.bO.a(2, new bvb.n(2.2));
      this.bO.a(3, new bvb.e(1.0));
      this.bO.a(4, new bpi<>(this, cbu.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cv()) && !this.gp()));
      this.bO.a(4, new bpi<>(this, bvu.class, 8.0F, 1.6, 1.4, $$0 -> !((bvu)$$0).s() && !this.gp()));
      this.bO.a(4, new bpi<>(this, bvj.class, 8.0F, 1.6, 1.4, $$0 -> !this.gp()));
      this.bO.a(5, new bvb.u());
      this.bO.a(6, new bvb.o());
      this.bO.a(6, new bvb.s(1.25));
      this.bO.a(7, new bvb.l(1.2F, true));
      this.bO.a(7, new bvb.t());
      this.bO.a(8, new bvb.h(this, 1.25));
      this.bO.a(9, new bvb.q(32, 200));
      this.bO.a(10, new bvb.f(1.2F, 12, 1));
      this.bO.a(10, new bqh(this, 0.4F));
      this.bO.a(11, new bro(this, 1.0));
      this.bO.a(11, new bvb.p());
      this.bO.a(12, new bvb.j(this, cbu.class, 24.0F));
      this.bO.a(13, new bvb.r());
      this.bP.a(3, new bvb.a(bjg.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cv())));
   }

   @Override
   public apc d(cjf $$0) {
      return apd.ic;
   }

   @Override
   public void b_() {
      if (!this.dL().B && this.bv() && this.cX()) {
         this.cr++;
         cjf $$0 = this.c(biv.a);
         if (this.l($$0)) {
            if (this.cr > 600) {
               cjf $$1 = $$0.a(this.dL(), this);
               if (!$$1.b()) {
                  this.a(biv.a, $$1);
               }

               this.cr = 0;
            } else if (this.cr > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dL().a(this, (byte)45);
            }
         }

         bjg $$2 = this.q();
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
         this.a(apd.hY, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eX() {
      return this.ev();
   }

   private boolean l(cjf $$0) {
      return $$0.d().u() && this.q() == null && this.aA() && !this.fC();
   }

   @Override
   protected void a(asc $$0, bgw $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cjf $$3;
         if ($$2 < 0.05F) {
            $$3 = new cjf(cji.nL);
         } else if ($$2 < 0.2F) {
            $$3 = new cjf(cji.qd);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cjf(cji.tJ) : new cjf(cji.tK);
         } else if ($$2 < 0.6F) {
            $$3 = new cjf(cji.oI);
         } else if ($$2 < 0.8F) {
            $$3 = new cjf(cji.pP);
         } else {
            $$3 = new cjf(cji.oF);
         }

         this.a(biv.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cjf $$1 = this.c(biv.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ehn $$3 = new ehn(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dD() * (float) (Math.PI / 180.0))
                  .b(-this.dB() * (float) (Math.PI / 180.0));
               this.dL().a(new ir(iv.O, $$1), this.dq() + this.bE().c / 2.0, this.ds(), this.dw() + this.bE().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bkl.a s() {
      return bji.A().a(bkm.d, 0.3F).a(bkm.a, 10.0).a(bkm.b, 32.0).a(bkm.f, 2.0);
   }

   @Nullable
   public bvb b(akq $$0, bil $$1) {
      bvb $$2 = biu.N.a((cpv)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.t() : ((bvb)$$1).t());
      }

      return $$2;
   }

   public static boolean c(biu<bvb> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return $$1.a_($$3.d()).a(aps.bW) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qw $$4) {
      he<cqt> $$5 = $$0.s(this.dl());
      bvb.v $$6 = bvb.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof bvb.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new bvb.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof akq) {
         this.gn();
      }

      this.a($$0.D_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void gn() {
      if (this.t() == bvb.v.a) {
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
   protected void a(cbu $$0, bgx $$1, cjf $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return this.m_() ? $$1.b * 0.85F : 0.4F;
   }

   public bvb.v t() {
      return bvb.v.a(this.an.b(bX));
   }

   public void a(bvb.v $$0) {
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
   public void b(qw $$0) {
      super.b($$0);
      List<UUID> $$1 = this.go();
      rc $$2 = new rc();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(rj.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fC());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.bW());
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);

      for (rq $$2 : $$0.c("Trusted", 11)) {
         this.b(rj.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(bvb.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dL() instanceof akq) {
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
   public boolean f(cjf $$0) {
      biv $$1 = bji.h($$0);
      return !this.c($$1).b() ? false : $$1 == biv.a && super.f($$0);
   }

   @Override
   public boolean j(cjf $$0) {
      cja $$1 = $$0.d();
      cjf $$2 = this.c(biv.a);
      return $$2.b() || this.cr > 0 && $$1.u() && !$$2.d().u();
   }

   private void n(cjf $$0) {
      if (!$$0.b() && !this.dL().B) {
         byn $$1 = new byn(this.dL(), this.dq() + this.bE().c, this.ds() + 1.0, this.dw() + this.bE().e, $$0);
         $$1.b(40);
         $$1.c(this.cv());
         this.a(apd.ih, 1.0F, 1.0F);
         this.dL().b($$1);
      }
   }

   private void o(cjf $$0) {
      byn $$1 = new byn(this.dL(), this.dq(), this.ds(), this.dw(), $$0);
      this.dL().b($$1);
   }

   @Override
   protected void b(byn $$0) {
      cjf $$1 = $$0.q();
      if (this.j($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(biv.a));
         this.a($$0);
         this.a(biv.a, $$1.a(1));
         this.e(biv.a);
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
            dfj $$2 = this.dL().a_($$1);
            this.dL().c(2001, $$1, csv.i($$2));
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
   public boolean m(cjf $$0) {
      return $$0.a(aqa.X);
   }

   @Override
   protected void a(cbu $$0, bji $$1) {
      ((bvb)$$1).b($$0.cv());
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
      return arw.i($$0, this.co, this.cn) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return arw.i($$0, this.cq, this.cp);
   }

   @Override
   public void h(@Nullable bjg $$0) {
      if (this.gp() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return arw.f(($$0 - 5.0F) * $$1);
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
      apc $$0 = this.w();
      if ($$0 == apd.ie) {
         this.a($$0, 2.0F, this.eW());
      } else {
         super.P();
      }
   }

   @Nullable
   @Override
   protected apc w() {
      if (this.fC()) {
         return apd.if;
      } else {
         if (!this.dL().N() && this.ag.i() < 0.1F) {
            List<cbu> $$0 = this.dL().a(cbu.class, this.cG().c(16.0, 16.0, 16.0), bit.f);
            if ($$0.isEmpty()) {
               return apd.ie;
            }
         }

         return apd.hZ;
      }
   }

   @Nullable
   @Override
   protected apc d(bho $$0) {
      return apd.id;
   }

   @Nullable
   @Override
   protected apc l_() {
      return apd.ib;
   }

   boolean c(UUID $$0) {
      return this.go().contains($$0);
   }

   @Override
   protected void g(bho $$0) {
      cjf $$1 = this.c(biv.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(biv.a, cjf.b);
      }

      super.g($$0);
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + -0.0625F * $$2, -0.25F * $$2);
   }

   public static boolean a(bvb $$0, bjg $$1) {
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
   public ehn cI() {
      return new ehn(0.0, (double)(0.55F * this.cH()), (double)(this.df() * 0.4F));
   }

   class a extends bru<bjg> {
      @Nullable
      private bjg j;
      @Nullable
      private bjg k;
      private int l;

      public a(Class<bjg> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bjg> $$3) {
         super(bvb.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ef().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : bvb.this.go()) {
               if ($$0 != null && bvb.this.dL() instanceof akq && ((akq)bvb.this.dL()).a($$0) instanceof bjg $$2) {
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

         bvb.this.a(apd.hY, 1.0F, 1.0F);
         bvb.this.B(true);
         bvb.this.gq();
         super.c();
      }
   }

   class b extends bqb {
      int a;

      public b() {
         this.a(EnumSet.of(bqb.a.b, bqb.a.c, bqb.a.a));
      }

      @Override
      public boolean a() {
         return bvb.this.gd();
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
         bvb.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bjg> {
      public boolean a(bjg $$0) {
         if ($$0 instanceof bvb) {
            return false;
         } else if ($$0 instanceof buw || $$0 instanceof bvl || $$0 instanceof bzi) {
            return true;
         } else if ($$0 instanceof bkb) {
            return !((bkb)$$0).s();
         } else if (!($$0 instanceof cbu) || !$$0.M_() && !((cbu)$$0).f()) {
            return bvb.this.c($$0.cv()) ? false : !$$0.fC() && !$$0.bU();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bqb {
      private final bts b = bts.a().a(12.0).d().a(bvb.this.new c());

      protected boolean h() {
         gw $$0 = gw.a(bvb.this.dq(), bvb.this.cG().e, bvb.this.dw());
         return !bvb.this.dL().g($$0) && bvb.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !bvb.this.dL().a(bjg.class, this.b, bvb.this, bvb.this.cG().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bpn {
      public e(double $$0) {
         super(bvb.this, $$0);
      }

      @Override
      public void c() {
         ((bvb)this.a).gr();
         ((bvb)this.c).gr();
         super.c();
      }

      @Override
      protected void g() {
         akq $$0 = (akq)this.b;
         bvb $$1 = (bvb)this.a.a($$0, (bil)this.c);
         if ($$1 != null) {
            akr $$2 = this.a.gg();
            akr $$3 = this.c.gg();
            akr $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cv());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cv());
            }

            if ($$4 != null) {
               $$4.a(apn.P);
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
            if (this.b.X().b(cpr.f)) {
               this.b.b(new biw(this.b, this.a.dq(), this.a.ds(), this.a.dw(), this.a.ef().a(7) + 1));
            }
         }
      }
   }

   public class f extends bqo {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(bvb.this, $$1, $$2, $$3);
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
      protected boolean a(cpy $$0, gw $$1) {
         dfj $$2 = $$0.a_($$1);
         return $$2.a(csw.oi) && $$2.c(daz.b) >= 2 || ctq.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && bvb.this.ag.i() < 0.05F) {
            bvb.this.a(apd.ig, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (bvb.this.dL().X().b(cpr.c)) {
            dfj $$0 = bvb.this.dL().a_(this.e);
            if ($$0.a(csw.oi)) {
               this.b($$0);
            } else if (ctq.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dfj $$0) {
         ctq.a(bvb.this, $$0, bvb.this.dL(), this.e);
      }

      private void b(dfj $$0) {
         int $$1 = $$0.c(daz.b);
         $$0.a(daz.b, Integer.valueOf(1));
         int $$2 = 1 + bvb.this.dL().z.a(2) + ($$1 == 3 ? 1 : 0);
         cjf $$3 = bvb.this.c(biv.a);
         if ($$3.b()) {
            bvb.this.a(biv.a, new cjf(cji.vv));
            $$2--;
         }

         if ($$2 > 0) {
            csv.a(bvb.this.dL(), this.e, new cjf(cji.vv, $$2));
         }

         bvb.this.a(apd.xF, 1.0F, 1.0F);
         bvb.this.dL().a(this.e, $$0.a(daz.b, Integer.valueOf(1)), 2);
         bvb.this.dL().a(djt.c, this.e, djt.a.a(bvb.this));
      }

      @Override
      public boolean a() {
         return !bvb.this.fC() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         bvb.this.w(false);
         super.c();
      }
   }

   class g extends bpv {
      public g() {
         super(bvb.this);
      }

      @Override
      public void c() {
         super.c();
         bvb.this.gr();
      }

      @Override
      public boolean a() {
         return bvb.this.aX() && bvb.this.b(apx.a) > 0.25 || bvb.this.bl();
      }
   }

   class h extends bqa {
      private final bvb e;

      public h(bvb $$0, double $$1) {
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

   public static class i extends bil.a {
      public final bvb.v a;

      public i(bvb.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bqj {
      public j(bji $$0, Class<? extends bjg> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !bvb.this.gd() && !bvb.this.gm();
      }

      @Override
      public boolean b() {
         return super.b() && !bvb.this.gd() && !bvb.this.gm();
      }
   }

   public class k extends bpd {
      public k() {
         super(bvb.this);
      }

      @Override
      public void a() {
         if (!bvb.this.fC()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bvb.this.gj() && !bvb.this.bW() && !bvb.this.gm() && !bvb.this.gd();
      }
   }

   class l extends bql {
      public l(double $$0, boolean $$1) {
         super(bvb.this, $$0, $$1);
      }

      @Override
      protected void a(bjg $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bvb.this.a(apd.ia, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         bvb.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !bvb.this.y() && !bvb.this.fC() && !bvb.this.bW() && !bvb.this.gd() && super.a();
      }
   }

   class m extends bpe {
      public m() {
         super(bvb.this);
      }

      @Override
      public void a() {
         if (bvb.this.gs()) {
            super.a();
         }
      }
   }

   class n extends bqu {
      public n(double $$0) {
         super(bvb.this, $$0);
      }

      @Override
      public boolean h() {
         return !bvb.this.gp() && super.h();
      }
   }

   public class o extends bqf {
      @Override
      public boolean a() {
         if (!bvb.this.gl()) {
            return false;
         } else {
            bjg $$0 = bvb.this.q();
            if ($$0 != null && $$0.bv()) {
               if ($$0.cE() != $$0.cD()) {
                  return false;
               } else {
                  boolean $$1 = bvb.a(bvb.this, $$0);
                  if (!$$1) {
                     bvb.this.L().a($$0, 0);
                     bvb.this.y(false);
                     bvb.this.z(false);
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
         bjg $$0 = bvb.this.q();
         if ($$0 != null && $$0.bv()) {
            double $$1 = bvb.this.do().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(bvb.this.dD()) < 15.0F) || !bvb.this.aA()) && !bvb.this.gd();
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
         bvb.this.r(true);
         bvb.this.x(true);
         bvb.this.z(false);
         bjg $$0 = bvb.this.q();
         if ($$0 != null) {
            bvb.this.G().a($$0, 60.0F, 30.0F);
            ehn $$1 = new ehn($$0.dq() - bvb.this.dq(), $$0.ds() - bvb.this.ds(), $$0.dw() - bvb.this.dw()).d();
            bvb.this.f(bvb.this.do().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         bvb.this.L().n();
      }

      @Override
      public void d() {
         bvb.this.y(false);
         bvb.this.cp = 0.0F;
         bvb.this.cq = 0.0F;
         bvb.this.z(false);
         bvb.this.x(false);
      }

      @Override
      public void e() {
         bjg $$0 = bvb.this.q();
         if ($$0 != null) {
            bvb.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!bvb.this.gd()) {
            ehn $$1 = bvb.this.do();
            if ($$1.d * $$1.d < 0.03F && bvb.this.dD() != 0.0F) {
               bvb.this.s(arw.j(0.2F, bvb.this.dD(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               bvb.this.s((float)$$3);
            }
         }

         if ($$0 != null && bvb.this.e((biq)$$0) <= 2.0F) {
            bvb.this.C($$0);
         } else if (bvb.this.dD() > 0.0F && bvb.this.aA() && (float)bvb.this.do().d != 0.0F && bvb.this.dL().a_(bvb.this.dl()).a(csw.dN)) {
            bvb.this.s(60.0F);
            bvb.this.h(null);
            bvb.this.A(true);
         }
      }
   }

   class p extends bqb {
      public p() {
         this.a(EnumSet.of(bqb.a.a));
      }

      @Override
      public boolean a() {
         if (!bvb.this.c(biv.a).b()) {
            return false;
         } else if (bvb.this.q() != null || bvb.this.eg() != null) {
            return false;
         } else if (!bvb.this.gs()) {
            return false;
         } else if (bvb.this.ef().a(b(10)) != 0) {
            return false;
         } else {
            List<byn> $$0 = bvb.this.dL().a(byn.class, bvb.this.cG().c(8.0, 8.0, 8.0), bvb.cf);
            return !$$0.isEmpty() && bvb.this.c(biv.a).b();
         }
      }

      @Override
      public void e() {
         List<byn> $$0 = bvb.this.dL().a(byn.class, bvb.this.cG().c(8.0, 8.0, 8.0), bvb.cf);
         cjf $$1 = bvb.this.c(biv.a);
         if ($$1.b() && !$$0.isEmpty()) {
            bvb.this.L().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<byn> $$0 = bvb.this.dL().a(byn.class, bvb.this.cG().c(8.0, 8.0, 8.0), bvb.cf);
         if (!$$0.isEmpty()) {
            bvb.this.L().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends brh {
      public q(int $$0, int $$1) {
         super(bvb.this, $$1);
      }

      @Override
      public void c() {
         bvb.this.gr();
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
         return !bvb.this.fC() && !bvb.this.y() && !bvb.this.gp() && bvb.this.q() == null;
      }
   }

   class r extends bvb.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bqb.a.a, bqb.a.b));
      }

      @Override
      public boolean a() {
         return bvb.this.eg() == null
            && bvb.this.ef().i() < 0.02F
            && !bvb.this.fC()
            && bvb.this.q() == null
            && bvb.this.L().l()
            && !this.i()
            && !bvb.this.gj()
            && !bvb.this.bW();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + bvb.this.ef().a(3);
         bvb.this.w(true);
         bvb.this.L().n();
      }

      @Override
      public void d() {
         bvb.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         bvb.this.G().a(bvb.this.dq() + this.c, bvb.this.du(), bvb.this.dw() + this.d, (float)bvb.this.Z(), (float)bvb.this.Y());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * bvb.this.ef().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + bvb.this.ef().a(20));
      }
   }

   class s extends bpu {
      private int c = b(100);

      public s(double $$0) {
         super(bvb.this, $$0);
      }

      @Override
      public boolean a() {
         if (!bvb.this.fC() && this.a.q() == null) {
            if (bvb.this.dL().Y() && bvb.this.dL().g(this.a.dl())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               gw $$0 = this.a.dl();
               return bvb.this.dL().N() && bvb.this.dL().g($$0) && !((akq)bvb.this.dL()).b($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         bvb.this.gr();
         super.c();
      }
   }

   class t extends bvb.d {
      private static final int c = b(140);
      private int d = bvb.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(bqb.a.a, bqb.a.b, bqb.a.c));
      }

      @Override
      public boolean a() {
         return bvb.this.bk == 0.0F && bvb.this.bl == 0.0F && bvb.this.bm == 0.0F ? this.k() || bvb.this.fC() : false;
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
            return bvb.this.dL().N() && this.h() && !this.i() && !bvb.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = bvb.this.ag.a(c);
         bvb.this.gr();
      }

      @Override
      public void c() {
         bvb.this.w(false);
         bvb.this.y(false);
         bvb.this.z(false);
         bvb.this.r(false);
         bvb.this.C(true);
         bvb.this.L().n();
         bvb.this.I().a(bvb.this.dq(), bvb.this.ds(), bvb.this.dw(), 0.0);
      }
   }

   class u extends bqb {
      public u() {
         this.a(EnumSet.of(bqb.a.a, bqb.a.b));
      }

      @Override
      public boolean a() {
         if (bvb.this.fC()) {
            return false;
         } else {
            bjg $$0 = bvb.this.q();
            return $$0 != null && $$0.bv() && bvb.ch.test($$0) && bvb.this.f($$0) > 36.0 && !bvb.this.bW() && !bvb.this.gm() && !bvb.this.bj;
         }
      }

      @Override
      public void c() {
         bvb.this.w(false);
         bvb.this.A(false);
      }

      @Override
      public void d() {
         bjg $$0 = bvb.this.q();
         if ($$0 != null && bvb.a(bvb.this, $$0)) {
            bvb.this.z(true);
            bvb.this.y(true);
            bvb.this.L().n();
            bvb.this.G().a($$0, (float)bvb.this.Z(), (float)bvb.this.Y());
         } else {
            bvb.this.z(false);
            bvb.this.y(false);
         }
      }

      @Override
      public void e() {
         bjg $$0 = bvb.this.q();
         if ($$0 != null) {
            bvb.this.G().a($$0, (float)bvb.this.Z(), (float)bvb.this.Y());
            if (bvb.this.f($$0) <= 36.0) {
               bvb.this.z(true);
               bvb.this.y(true);
               bvb.this.L().n();
            } else {
               bvb.this.L().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements asp {
      a(0, "red"),
      b(1, "snow");

      public static final asp.a<bvb.v> c = asp.a(bvb.v::values);
      private static final IntFunction<bvb.v> d = aqr.a(bvb.v::a, values(), aqr.a.a);
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

      public static bvb.v a(String $$0) {
         return c.a($$0, a);
      }

      public static bvb.v a(int $$0) {
         return d.apply($$0);
      }

      public static bvb.v a(he<cqt> $$0) {
         return $$0.a(apr.aq) ? b : a;
      }
   }
}
