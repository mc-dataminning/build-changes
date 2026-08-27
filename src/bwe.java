import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwe extends bvu implements blh<bwe.v> {
   private static final afc<Integer> bX = aff.a(bwe.class, afe.b);
   private static final afc<Byte> bY = aff.a(bwe.class, afe.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final afc<Optional<UUID>> cd = aff.a(bwe.class, afe.q);
   private static final afc<Optional<UUID>> ce = aff.a(bwe.class, afe.q);
   static final Predicate<bzq> cf = $$0 -> !$$0.y() && $$0.bv();
   private static final Predicate<bjt> cg = $$0 -> !($$0 instanceof bkj $$1) ? false : $$1.ei() != null && $$1.ej() < $$1.ah + 600;
   static final Predicate<bjt> ch = $$0 -> $$0 instanceof bvz || $$0 instanceof bwo;
   private static final Predicate<bjt> ci = $$0 -> !$$0.bU() && bjw.e.test($$0);
   private static final int cj = 600;
   private bre ck;
   private bre cl;
   private bre cm;
   private float cn;
   private float co;
   float cp;
   float cq;
   private int cr;

   public bwe(bjx<? extends bwe> $$0, cqz $$1) {
      super($$0, $$1);
      this.bK = new bwe.k();
      this.bL = new bwe.m();
      this.a(ebp.p, 0.0F);
      this.a(ebp.q, 0.0F);
      this.s(true);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(cd, Optional.empty());
      this.an.a(ce, Optional.empty());
      this.an.a(bX, 0);
      this.an.a(bY, (byte)0);
   }

   @Override
   protected void z() {
      this.ck = new bsx<>(this, bvu.class, 10, false, false, $$0 -> $$0 instanceof bvz || $$0 instanceof bwo);
      this.cl = new bsx<>(this, bwv.class, 10, false, false, bwv.bU);
      this.cm = new bsx<>(this, bvr.class, 20, false, false, $$0 -> $$0 instanceof bvt);
      this.bO.a(0, new bwe.g());
      this.bO.a(0, new bqt(this, this.dL()));
      this.bO.a(1, new bwe.b());
      this.bO.a(2, new bwe.n(2.2));
      this.bO.a(3, new bwe.e(1.0));
      this.bO.a(4, new bql<>(this, ccx.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cv()) && !this.gq()));
      this.bO.a(4, new bql<>(this, bwx.class, 8.0F, 1.6, 1.4, $$0 -> !((bwx)$$0).s() && !this.gq()));
      this.bO.a(4, new bql<>(this, bwm.class, 8.0F, 1.6, 1.4, $$0 -> !this.gq()));
      this.bO.a(5, new bwe.u());
      this.bO.a(6, new bwe.o());
      this.bO.a(6, new bwe.s(1.25));
      this.bO.a(7, new bwe.l(1.2F, true));
      this.bO.a(7, new bwe.t());
      this.bO.a(8, new bwe.h(this, 1.25));
      this.bO.a(9, new bwe.q(32, 200));
      this.bO.a(10, new bwe.f(1.2F, 12, 1));
      this.bO.a(10, new brk(this, 0.4F));
      this.bO.a(11, new bsr(this, 1.0));
      this.bO.a(11, new bwe.p());
      this.bO.a(12, new bwe.j(this, ccx.class, 24.0F));
      this.bO.a(13, new bwe.r());
      this.bP.a(3, new bwe.a(bkj.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cv())));
   }

   @Override
   public aqc d(ckj $$0) {
      return aqd.ie;
   }

   @Override
   public void c_() {
      if (!this.dL().B && this.bv() && this.cX()) {
         this.cr++;
         ckj $$0 = this.c(bjy.a);
         if (this.l($$0)) {
            if (this.cr > 600) {
               ckj $$1 = $$0.a(this.dL(), this);
               if (!$$1.b()) {
                  this.a(bjy.a, $$1);
               }

               this.cr = 0;
            } else if (this.cr > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dL().a(this, (byte)45);
            }
         }

         bkj $$2 = this.q();
         if ($$2 == null || !$$2.bv()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fD() || this.eX()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      }

      super.c_();
      if (this.gq() && this.ag.i() < 0.05F) {
         this.a(aqd.ia, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eX() {
      return this.ev();
   }

   private boolean l(ckj $$0) {
      return $$0.d().u() && this.q() == null && this.aA() && !this.fD();
   }

   @Override
   protected void a(ate $$0, bhz $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         ckj $$3;
         if ($$2 < 0.05F) {
            $$3 = new ckj(ckm.nL);
         } else if ($$2 < 0.2F) {
            $$3 = new ckj(ckm.qd);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new ckj(ckm.tJ) : new ckj(ckm.tK);
         } else if ($$2 < 0.6F) {
            $$3 = new ckj(ckm.oI);
         } else if ($$2 < 0.8F) {
            $$3 = new ckj(ckm.pP);
         } else {
            $$3 = new ckj(ckm.oF);
         }

         this.a(bjy.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         ckj $$1 = this.c(bjy.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               eif $$3 = new eif(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dD() * (float) (Math.PI / 180.0))
                  .b(-this.dB() * (float) (Math.PI / 180.0));
               this.dL().a(new jo(js.O, $$1), this.dq() + this.bE().c / 2.0, this.ds(), this.dw() + this.bE().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static blo.a s() {
      return bkl.A().a(blp.m, 0.3F).a(blp.l, 10.0).a(blp.g, 32.0).a(blp.c, 2.0);
   }

   @Nullable
   public bwe b(alq $$0, bjo $$1) {
      bwe $$2 = bjx.N.a((cqz)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.t() : ((bwe)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bjx<bwe> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.a_($$3.d()).a(aqs.bW) && a($$1, $$3);
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      ib<crx> $$5 = $$0.s(this.dl());
      bwe.v $$6 = bwe.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof bwe.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new bwe.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof alq) {
         this.go();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void go() {
      if (this.t() == bwe.v.a) {
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
   protected void a(ccx $$0, bia $$1, ckj $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return this.n_() ? $$1.b * 0.85F : 0.4F;
   }

   public bwe.v t() {
      return bwe.v.a(this.an.b(bX));
   }

   public void a(bwe.v $$0) {
      this.an.b(bX, $$0.a());
   }

   List<UUID> gp() {
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
   public void b(rt $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gp();
      rz $$2 = new rz();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(sg.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fD());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.bW());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);

      for (sn $$2 : $$0.c("Trusted", 11)) {
         this.b(sg.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(bwe.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dL() instanceof alq) {
         this.go();
      }
   }

   public boolean y() {
      return this.t(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean ge() {
      return this.t(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gq() {
      return this.t(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fD() {
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
   public boolean f(ckj $$0) {
      bjy $$1 = bkl.h($$0);
      return !this.c($$1).b() ? false : $$1 == bjy.a && super.f($$0);
   }

   @Override
   public boolean j(ckj $$0) {
      cke $$1 = $$0.d();
      ckj $$2 = this.c(bjy.a);
      return $$2.b() || this.cr > 0 && $$1.u() && !$$2.d().u();
   }

   private void n(ckj $$0) {
      if (!$$0.b() && !this.dL().B) {
         bzq $$1 = new bzq(this.dL(), this.dq() + this.bE().c, this.ds() + 1.0, this.dw() + this.bE().e, $$0);
         $$1.b(40);
         $$1.a(this);
         this.a(aqd.ij, 1.0F, 1.0F);
         this.dL().b($$1);
      }
   }

   private void o(ckj $$0) {
      bzq $$1 = new bzq(this.dL(), this.dq(), this.ds(), this.dw(), $$0);
      this.dL().b($$1);
   }

   @Override
   protected void b(bzq $$0) {
      ckj $$1 = $$0.q();
      if (this.j($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(bjy.a));
         this.a($$0);
         this.a(bjy.a, $$1.a(1));
         this.e(bjy.a);
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
            this.gr();
         }

         if ($$0 || this.fD()) {
            this.w(false);
         }

         if (this.ge() && this.dL().z.i() < 0.2F) {
            ht $$1 = this.dl();
            dgb $$2 = this.dL().a_($$1);
            this.dL().c(2001, $$1, cua.i($$2));
         }
      }

      this.co = this.cn;
      if (this.gn()) {
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
   public boolean m(ckj $$0) {
      return $$0.a(ara.X);
   }

   @Override
   protected void a(ccx $$0, bkl $$1) {
      ((bwe)$$1).b($$0.cv());
   }

   public boolean gk() {
      return this.t(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gl() {
      return this.bj;
   }

   public boolean gm() {
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

   public boolean gn() {
      return this.t(8);
   }

   public float E(float $$0) {
      return asy.i($$0, this.co, this.cn) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return asy.i($$0, this.cq, this.cp);
   }

   @Override
   public void h(@Nullable bkj $$0) {
      if (this.gq() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return asy.f(($$0 - 5.0F) * $$1);
   }

   void gr() {
      this.C(false);
   }

   void gs() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gt() {
      return !this.fD() && !this.y() && !this.ge();
   }

   @Override
   public void P() {
      aqc $$0 = this.w();
      if ($$0 == aqd.ig) {
         this.a($$0, 2.0F, this.eW());
      } else {
         super.P();
      }
   }

   @Nullable
   @Override
   protected aqc w() {
      if (this.fD()) {
         return aqd.ih;
      } else {
         if (!this.dL().N() && this.ag.i() < 0.1F) {
            List<ccx> $$0 = this.dL().a(ccx.class, this.cG().c(16.0, 16.0, 16.0), bjw.f);
            if ($$0.isEmpty()) {
               return aqd.ig;
            }
         }

         return aqd.ib;
      }
   }

   @Nullable
   @Override
   protected aqc d(bir $$0) {
      return aqd.if;
   }

   @Nullable
   @Override
   protected aqc m_() {
      return aqd.id;
   }

   boolean c(UUID $$0) {
      return this.gp().contains($$0);
   }

   @Override
   protected void g(bir $$0) {
      ckj $$1 = this.c(bjy.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bjy.a, ckj.b);
      }

      super.g($$0);
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + -0.0625F * $$2, -0.25F * $$2);
   }

   public static boolean a(bwe $$0, bkj $$1) {
      double $$2 = $$1.dw() - $$0.dw();
      double $$3 = $$1.dq() - $$0.dq();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dL().a_(ht.a($$0.dq() + $$8, $$0.ds() + (double)$$9, $$0.dw() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public eif cI() {
      return new eif(0.0, (double)(0.55F * this.cH()), (double)(this.df() * 0.4F));
   }

   class a extends bsx<bkj> {
      @Nullable
      private bkj j;
      @Nullable
      private bkj k;
      private int l;

      public a(Class<bkj> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bkj> $$3) {
         super(bwe.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ef().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : bwe.this.gp()) {
               if ($$0 != null && bwe.this.dL() instanceof alq && ((alq)bwe.this.dL()).a($$0) instanceof bkj $$2) {
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

         bwe.this.a(aqd.ia, 1.0F, 1.0F);
         bwe.this.B(true);
         bwe.this.gr();
         super.c();
      }
   }

   class b extends bre {
      int a;

      public b() {
         this.a(EnumSet.of(bre.a.b, bre.a.c, bre.a.a));
      }

      @Override
      public boolean a() {
         return bwe.this.ge();
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
         bwe.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bkj> {
      public boolean a(bkj $$0) {
         if ($$0 instanceof bwe) {
            return false;
         } else if ($$0 instanceof bvz || $$0 instanceof bwo || $$0 instanceof cal) {
            return true;
         } else if ($$0 instanceof ble) {
            return !((ble)$$0).s();
         } else if (!($$0 instanceof ccx) || !$$0.N_() && !((ccx)$$0).f()) {
            return bwe.this.c($$0.cv()) ? false : !$$0.fD() && !$$0.bU();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bre {
      private final buv b = buv.a().a(12.0).d().a(bwe.this.new c());

      protected boolean h() {
         ht $$0 = ht.a(bwe.this.dq(), bwe.this.cG().e, bwe.this.dw());
         return !bwe.this.dL().g($$0) && bwe.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !bwe.this.dL().a(bkj.class, this.b, bwe.this, bwe.this.cG().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bqq {
      public e(double $$0) {
         super(bwe.this, $$0);
      }

      @Override
      public void c() {
         ((bwe)this.a).gs();
         ((bwe)this.c).gs();
         super.c();
      }

      @Override
      protected void g() {
         alq $$0 = (alq)this.b;
         bwe $$1 = (bwe)this.a.a($$0, (bjo)this.c);
         if ($$1 != null) {
            alr $$2 = this.a.gh();
            alr $$3 = this.c.gh();
            alr $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cv());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cv());
            }

            if ($$4 != null) {
               $$4.a(aqn.P);
               al.o.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gj();
            this.c.gj();
            $$1.c_(-24000);
            $$1.b(this.a.dq(), this.a.ds(), this.a.dw(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.X().b(cqv.f)) {
               this.b.b(new bjz(this.b, this.a.dq(), this.a.ds(), this.a.dw(), this.a.ef().a(7) + 1));
            }
         }
      }
   }

   public class f extends brr {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(bwe.this, $$1, $$2, $$3);
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
      protected boolean a(crc $$0, ht $$1) {
         dgb $$2 = $$0.a_($$1);
         return $$2.a(cuc.oi) && $$2.c(dcb.c) >= 2 || cuw.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && bwe.this.ag.i() < 0.05F) {
            bwe.this.a(aqd.ii, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (bwe.this.dL().X().b(cqv.c)) {
            dgb $$0 = bwe.this.dL().a_(this.e);
            if ($$0.a(cuc.oi)) {
               this.b($$0);
            } else if (cuw.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dgb $$0) {
         cuw.a(bwe.this, $$0, bwe.this.dL(), this.e);
      }

      private void b(dgb $$0) {
         int $$1 = $$0.c(dcb.c);
         $$0.a(dcb.c, Integer.valueOf(1));
         int $$2 = 1 + bwe.this.dL().z.a(2) + ($$1 == 3 ? 1 : 0);
         ckj $$3 = bwe.this.c(bjy.a);
         if ($$3.b()) {
            bwe.this.a(bjy.a, new ckj(ckm.vv));
            $$2--;
         }

         if ($$2 > 0) {
            cua.a(bwe.this.dL(), this.e, new ckj(ckm.vv, $$2));
         }

         bwe.this.a(aqd.xH, 1.0F, 1.0F);
         bwe.this.dL().a(this.e, $$0.a(dcb.c, Integer.valueOf(1)), 2);
         bwe.this.dL().a(dkl.c, this.e, dkl.a.a(bwe.this));
      }

      @Override
      public boolean a() {
         return !bwe.this.fD() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         bwe.this.w(false);
         super.c();
      }
   }

   class g extends bqy {
      public g() {
         super(bwe.this);
      }

      @Override
      public void c() {
         super.c();
         bwe.this.gs();
      }

      @Override
      public boolean a() {
         return bwe.this.aX() && bwe.this.b(aqx.a) > 0.25 || bwe.this.bl();
      }
   }

   class h extends brd {
      private final bwe e;

      public h(bwe $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.gq() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.gq() && super.b();
      }

      @Override
      public void c() {
         this.e.gs();
         super.c();
      }
   }

   public static class i extends bjo.a {
      public final bwe.v a;

      public i(bwe.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends brm {
      public j(bkl $$0, Class<? extends bkj> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !bwe.this.ge() && !bwe.this.gn();
      }

      @Override
      public boolean b() {
         return super.b() && !bwe.this.ge() && !bwe.this.gn();
      }
   }

   public class k extends bqg {
      public k() {
         super(bwe.this);
      }

      @Override
      public void a() {
         if (!bwe.this.fD()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bwe.this.gk() && !bwe.this.bW() && !bwe.this.gn() && !bwe.this.ge();
      }
   }

   class l extends bro {
      public l(double $$0, boolean $$1) {
         super(bwe.this, $$0, $$1);
      }

      @Override
      protected void a(bkj $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bwe.this.a(aqd.ic, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         bwe.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !bwe.this.y() && !bwe.this.fD() && !bwe.this.bW() && !bwe.this.ge() && super.a();
      }
   }

   class m extends bqh {
      public m() {
         super(bwe.this);
      }

      @Override
      public void a() {
         if (bwe.this.gt()) {
            super.a();
         }
      }
   }

   class n extends brx {
      public n(double $$0) {
         super(bwe.this, $$0);
      }

      @Override
      public boolean h() {
         return !bwe.this.gq() && super.h();
      }
   }

   public class o extends bri {
      @Override
      public boolean a() {
         if (!bwe.this.gm()) {
            return false;
         } else {
            bkj $$0 = bwe.this.q();
            if ($$0 != null && $$0.bv()) {
               if ($$0.cE() != $$0.cD()) {
                  return false;
               } else {
                  boolean $$1 = bwe.a(bwe.this, $$0);
                  if (!$$1) {
                     bwe.this.L().a($$0, 0);
                     bwe.this.y(false);
                     bwe.this.z(false);
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
         bkj $$0 = bwe.this.q();
         if ($$0 != null && $$0.bv()) {
            double $$1 = bwe.this.do().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(bwe.this.dD()) < 15.0F) || !bwe.this.aA()) && !bwe.this.ge();
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
         bwe.this.r(true);
         bwe.this.x(true);
         bwe.this.z(false);
         bkj $$0 = bwe.this.q();
         if ($$0 != null) {
            bwe.this.G().a($$0, 60.0F, 30.0F);
            eif $$1 = new eif($$0.dq() - bwe.this.dq(), $$0.ds() - bwe.this.ds(), $$0.dw() - bwe.this.dw()).d();
            bwe.this.f(bwe.this.do().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         bwe.this.L().n();
      }

      @Override
      public void d() {
         bwe.this.y(false);
         bwe.this.cp = 0.0F;
         bwe.this.cq = 0.0F;
         bwe.this.z(false);
         bwe.this.x(false);
      }

      @Override
      public void e() {
         bkj $$0 = bwe.this.q();
         if ($$0 != null) {
            bwe.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!bwe.this.ge()) {
            eif $$1 = bwe.this.do();
            if ($$1.d * $$1.d < 0.03F && bwe.this.dD() != 0.0F) {
               bwe.this.s(asy.j(0.2F, bwe.this.dD(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               bwe.this.s((float)$$3);
            }
         }

         if ($$0 != null && bwe.this.e((bjt)$$0) <= 2.0F) {
            bwe.this.C($$0);
         } else if (bwe.this.dD() > 0.0F && bwe.this.aA() && (float)bwe.this.do().d != 0.0F && bwe.this.dL().a_(bwe.this.dl()).a(cuc.dN)) {
            bwe.this.s(60.0F);
            bwe.this.h(null);
            bwe.this.A(true);
         }
      }
   }

   class p extends bre {
      public p() {
         this.a(EnumSet.of(bre.a.a));
      }

      @Override
      public boolean a() {
         if (!bwe.this.c(bjy.a).b()) {
            return false;
         } else if (bwe.this.q() != null || bwe.this.eg() != null) {
            return false;
         } else if (!bwe.this.gt()) {
            return false;
         } else if (bwe.this.ef().a(b(10)) != 0) {
            return false;
         } else {
            List<bzq> $$0 = bwe.this.dL().a(bzq.class, bwe.this.cG().c(8.0, 8.0, 8.0), bwe.cf);
            return !$$0.isEmpty() && bwe.this.c(bjy.a).b();
         }
      }

      @Override
      public void e() {
         List<bzq> $$0 = bwe.this.dL().a(bzq.class, bwe.this.cG().c(8.0, 8.0, 8.0), bwe.cf);
         ckj $$1 = bwe.this.c(bjy.a);
         if ($$1.b() && !$$0.isEmpty()) {
            bwe.this.L().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<bzq> $$0 = bwe.this.dL().a(bzq.class, bwe.this.cG().c(8.0, 8.0, 8.0), bwe.cf);
         if (!$$0.isEmpty()) {
            bwe.this.L().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends bsk {
      public q(int $$0, int $$1) {
         super(bwe.this, $$1);
      }

      @Override
      public void c() {
         bwe.this.gs();
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
         return !bwe.this.fD() && !bwe.this.y() && !bwe.this.gq() && bwe.this.q() == null;
      }
   }

   class r extends bwe.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bre.a.a, bre.a.b));
      }

      @Override
      public boolean a() {
         return bwe.this.eg() == null
            && bwe.this.ef().i() < 0.02F
            && !bwe.this.fD()
            && bwe.this.q() == null
            && bwe.this.L().l()
            && !this.i()
            && !bwe.this.gk()
            && !bwe.this.bW();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + bwe.this.ef().a(3);
         bwe.this.w(true);
         bwe.this.L().n();
      }

      @Override
      public void d() {
         bwe.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         bwe.this.G().a(bwe.this.dq() + this.c, bwe.this.du(), bwe.this.dw() + this.d, (float)bwe.this.Z(), (float)bwe.this.Y());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * bwe.this.ef().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + bwe.this.ef().a(20));
      }
   }

   class s extends bqx {
      private int c = b(100);

      public s(double $$0) {
         super(bwe.this, $$0);
      }

      @Override
      public boolean a() {
         if (!bwe.this.fD() && this.a.q() == null) {
            if (bwe.this.dL().Y() && bwe.this.dL().g(this.a.dl())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ht $$0 = this.a.dl();
               return bwe.this.dL().N() && bwe.this.dL().g($$0) && !((alq)bwe.this.dL()).b($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         bwe.this.gs();
         super.c();
      }
   }

   class t extends bwe.d {
      private static final int c = b(140);
      private int d = bwe.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(bre.a.a, bre.a.b, bre.a.c));
      }

      @Override
      public boolean a() {
         return bwe.this.bk == 0.0F && bwe.this.bl == 0.0F && bwe.this.bm == 0.0F ? this.k() || bwe.this.fD() : false;
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
            return bwe.this.dL().N() && this.h() && !this.i() && !bwe.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = bwe.this.ag.a(c);
         bwe.this.gs();
      }

      @Override
      public void c() {
         bwe.this.w(false);
         bwe.this.y(false);
         bwe.this.z(false);
         bwe.this.r(false);
         bwe.this.C(true);
         bwe.this.L().n();
         bwe.this.I().a(bwe.this.dq(), bwe.this.ds(), bwe.this.dw(), 0.0);
      }
   }

   class u extends bre {
      public u() {
         this.a(EnumSet.of(bre.a.a, bre.a.b));
      }

      @Override
      public boolean a() {
         if (bwe.this.fD()) {
            return false;
         } else {
            bkj $$0 = bwe.this.q();
            return $$0 != null && $$0.bv() && bwe.ch.test($$0) && bwe.this.f($$0) > 36.0 && !bwe.this.bW() && !bwe.this.gn() && !bwe.this.bj;
         }
      }

      @Override
      public void c() {
         bwe.this.w(false);
         bwe.this.A(false);
      }

      @Override
      public void d() {
         bkj $$0 = bwe.this.q();
         if ($$0 != null && bwe.a(bwe.this, $$0)) {
            bwe.this.z(true);
            bwe.this.y(true);
            bwe.this.L().n();
            bwe.this.G().a($$0, (float)bwe.this.Z(), (float)bwe.this.Y());
         } else {
            bwe.this.z(false);
            bwe.this.y(false);
         }
      }

      @Override
      public void e() {
         bkj $$0 = bwe.this.q();
         if ($$0 != null) {
            bwe.this.G().a($$0, (float)bwe.this.Z(), (float)bwe.this.Y());
            if (bwe.this.f($$0) <= 36.0) {
               bwe.this.z(true);
               bwe.this.y(true);
               bwe.this.L().n();
            } else {
               bwe.this.L().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements atr {
      a(0, "red"),
      b(1, "snow");

      public static final atr.a<bwe.v> c = atr.a(bwe.v::values);
      private static final IntFunction<bwe.v> d = arr.a(bwe.v::a, values(), arr.a.a);
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

      public static bwe.v a(String $$0) {
         return c.a($$0, a);
      }

      public static bwe.v a(int $$0) {
         return d.apply($$0);
      }

      public static bwe.v a(ib<crx> $$0) {
         return $$0.a(aqr.aq) ? b : a;
      }
   }
}
