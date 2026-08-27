import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwt extends bwj implements blw<bwt.v> {
   private static final afm<Integer> bX = afp.a(bwt.class, afo.b);
   private static final afm<Byte> bY = afp.a(bwt.class, afo.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final afm<Optional<UUID>> cd = afp.a(bwt.class, afo.q);
   private static final afm<Optional<UUID>> ce = afp.a(bwt.class, afo.q);
   static final Predicate<caf> cf = $$0 -> !$$0.y() && $$0.bv();
   private static final Predicate<bki> cg = $$0 -> !($$0 instanceof bky $$1) ? false : $$1.ei() != null && $$1.ej() < $$1.ah + 600;
   static final Predicate<bki> ch = $$0 -> $$0 instanceof bwo || $$0 instanceof bxd;
   private static final Predicate<bki> ci = $$0 -> !$$0.bU() && bkl.e.test($$0);
   private static final int cj = 600;
   private brt ck;
   private brt cl;
   private brt cm;
   private float cn;
   private float co;
   float cp;
   float cq;
   private int cr;

   public bwt(bkm<? extends bwt> $$0, crs $$1) {
      super($$0, $$1);
      this.bK = new bwt.k();
      this.bL = new bwt.m();
      this.a(ecr.p, 0.0F);
      this.a(ecr.q, 0.0F);
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
      this.ck = new btm<>(this, bwj.class, 10, false, false, $$0 -> $$0 instanceof bwo || $$0 instanceof bxd);
      this.cl = new btm<>(this, bxk.class, 10, false, false, bxk.bU);
      this.cm = new btm<>(this, bwg.class, 20, false, false, $$0 -> $$0 instanceof bwi);
      this.bO.a(0, new bwt.g());
      this.bO.a(0, new bri(this, this.dL()));
      this.bO.a(1, new bwt.b());
      this.bO.a(2, new bwt.n(2.2));
      this.bO.a(3, new bwt.e(1.0));
      this.bO.a(4, new bra<>(this, cdm.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cv()) && !this.gq()));
      this.bO.a(4, new bra<>(this, bxm.class, 8.0F, 1.6, 1.4, $$0 -> !((bxm)$$0).s() && !this.gq()));
      this.bO.a(4, new bra<>(this, bxb.class, 8.0F, 1.6, 1.4, $$0 -> !this.gq()));
      this.bO.a(5, new bwt.u());
      this.bO.a(6, new bwt.o());
      this.bO.a(6, new bwt.s(1.25));
      this.bO.a(7, new bwt.l(1.2F, true));
      this.bO.a(7, new bwt.t());
      this.bO.a(8, new bwt.h(this, 1.25));
      this.bO.a(9, new bwt.q(32, 200));
      this.bO.a(10, new bwt.f(1.2F, 12, 1));
      this.bO.a(10, new brz(this, 0.4F));
      this.bO.a(11, new btg(this, 1.0));
      this.bO.a(11, new bwt.p());
      this.bO.a(12, new bwt.j(this, cdm.class, 24.0F));
      this.bO.a(13, new bwt.r());
      this.bP.a(3, new bwt.a(bky.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cv())));
   }

   @Override
   public aqm d(clb $$0) {
      return aqn.ig;
   }

   @Override
   public void c_() {
      if (!this.dL().B && this.bv() && this.cX()) {
         this.cr++;
         clb $$0 = this.c(bkn.a);
         if (this.l($$0)) {
            if (this.cr > 600) {
               clb $$1 = $$0.a(this.dL(), this);
               if (!$$1.b()) {
                  this.a(bkn.a, $$1);
               }

               this.cr = 0;
            } else if (this.cr > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dL().a(this, (byte)45);
            }
         }

         bky $$2 = this.q();
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
         this.a(aqn.ic, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eX() {
      return this.ev();
   }

   private boolean l(clb $$0) {
      return $$0.d().u() && this.q() == null && this.aA() && !this.fD();
   }

   @Override
   protected void a(ato $$0, bio $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         clb $$3;
         if ($$2 < 0.05F) {
            $$3 = new clb(cle.nL);
         } else if ($$2 < 0.2F) {
            $$3 = new clb(cle.qd);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new clb(cle.tK) : new clb(cle.tL);
         } else if ($$2 < 0.6F) {
            $$3 = new clb(cle.oI);
         } else if ($$2 < 0.8F) {
            $$3 = new clb(cle.pP);
         } else {
            $$3 = new clb(cle.oF);
         }

         this.a(bkn.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         clb $$1 = this.c(bkn.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               eji $$3 = new eji(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dD() * (float) (Math.PI / 180.0))
                  .b(-this.dB() * (float) (Math.PI / 180.0));
               this.dL().a(new jo(js.O, $$1), this.dq() + this.bE().c / 2.0, this.ds(), this.dw() + this.bE().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bmd.a s() {
      return bla.A().a(bme.m, 0.3F).a(bme.l, 10.0).a(bme.g, 32.0).a(bme.c, 2.0);
   }

   @Nullable
   public bwt b(ama $$0, bkd $$1) {
      bwt $$2 = bkm.N.a((crs)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.t() : ((bwt)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bkm<bwt> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return $$1.a_($$3.d()).a(arc.bW) && a($$1, $$3);
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      ib<csq> $$5 = $$0.s(this.dl());
      bwt.v $$6 = bwt.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof bwt.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new bwt.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof ama) {
         this.go();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void go() {
      if (this.t() == bwt.v.a) {
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
   protected void a(cdm $$0, bip $$1, clb $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return this.n_() ? $$1.b * 0.85F : 0.4F;
   }

   public bwt.v t() {
      return bwt.v.a(this.an.b(bX));
   }

   public void a(bwt.v $$0) {
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
   public void b(rz $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gp();
      sf $$2 = new sf();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(so.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fD());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.bW());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);

      for (sw $$2 : $$0.c("Trusted", 11)) {
         this.b(so.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(bwt.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dL() instanceof ama) {
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
   public boolean f(clb $$0) {
      bkn $$1 = bla.h($$0);
      return !this.c($$1).b() ? false : $$1 == bkn.a && super.f($$0);
   }

   @Override
   public boolean j(clb $$0) {
      ckw $$1 = $$0.d();
      clb $$2 = this.c(bkn.a);
      return $$2.b() || this.cr > 0 && $$1.u() && !$$2.d().u();
   }

   private void n(clb $$0) {
      if (!$$0.b() && !this.dL().B) {
         caf $$1 = new caf(this.dL(), this.dq() + this.bE().c, this.ds() + 1.0, this.dw() + this.bE().e, $$0);
         $$1.b(40);
         $$1.a(this);
         this.a(aqn.il, 1.0F, 1.0F);
         this.dL().b($$1);
      }
   }

   private void o(clb $$0) {
      caf $$1 = new caf(this.dL(), this.dq(), this.ds(), this.dw(), $$0);
      this.dL().b($$1);
   }

   @Override
   protected void b(caf $$0) {
      clb $$1 = $$0.q();
      if (this.j($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(bkn.a));
         this.a($$0);
         this.a(bkn.a, $$1.a(1));
         this.e(bkn.a);
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
            dgw $$2 = this.dL().a_($$1);
            this.dL().c(2001, $$1, cut.i($$2));
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
   public boolean m(clb $$0) {
      return $$0.a(ark.X);
   }

   @Override
   protected void a(cdm $$0, bla $$1) {
      ((bwt)$$1).b($$0.cv());
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
      return ati.i($$0, this.co, this.cn) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return ati.i($$0, this.cq, this.cp);
   }

   @Override
   public void h(@Nullable bky $$0) {
      if (this.gq() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return ati.f(($$0 - 5.0F) * $$1);
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
      aqm $$0 = this.w();
      if ($$0 == aqn.ii) {
         this.a($$0, 2.0F, this.eW());
      } else {
         super.P();
      }
   }

   @Nullable
   @Override
   protected aqm w() {
      if (this.fD()) {
         return aqn.ij;
      } else {
         if (!this.dL().N() && this.ag.i() < 0.1F) {
            List<cdm> $$0 = this.dL().a(cdm.class, this.cG().c(16.0, 16.0, 16.0), bkl.f);
            if ($$0.isEmpty()) {
               return aqn.ii;
            }
         }

         return aqn.id;
      }
   }

   @Nullable
   @Override
   protected aqm d(bjg $$0) {
      return aqn.ih;
   }

   @Nullable
   @Override
   protected aqm m_() {
      return aqn.if;
   }

   boolean c(UUID $$0) {
      return this.gp().contains($$0);
   }

   @Override
   protected void g(bjg $$0) {
      clb $$1 = this.c(bkn.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bkn.a, clb.b);
      }

      super.g($$0);
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + -0.0625F * $$2, -0.25F * $$2);
   }

   public static boolean a(bwt $$0, bky $$1) {
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
   public eji cI() {
      return new eji(0.0, (double)(0.55F * this.cH()), (double)(this.df() * 0.4F));
   }

   class a extends btm<bky> {
      @Nullable
      private bky j;
      @Nullable
      private bky k;
      private int l;

      public a(Class<bky> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bky> $$3) {
         super(bwt.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.ef().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : bwt.this.gp()) {
               if ($$0 != null && bwt.this.dL() instanceof ama && ((ama)bwt.this.dL()).a($$0) instanceof bky $$2) {
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

         bwt.this.a(aqn.ic, 1.0F, 1.0F);
         bwt.this.B(true);
         bwt.this.gr();
         super.c();
      }
   }

   class b extends brt {
      int a;

      public b() {
         this.a(EnumSet.of(brt.a.b, brt.a.c, brt.a.a));
      }

      @Override
      public boolean a() {
         return bwt.this.ge();
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
         bwt.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bky> {
      public boolean a(bky $$0) {
         if ($$0 instanceof bwt) {
            return false;
         } else if ($$0 instanceof bwo || $$0 instanceof bxd || $$0 instanceof cba) {
            return true;
         } else if ($$0 instanceof blt) {
            return !((blt)$$0).s();
         } else if (!($$0 instanceof cdm) || !$$0.N_() && !((cdm)$$0).f()) {
            return bwt.this.c($$0.cv()) ? false : !$$0.fD() && !$$0.bU();
         } else {
            return false;
         }
      }
   }

   abstract class d extends brt {
      private final bvk b = bvk.a().a(12.0).d().a(bwt.this.new c());

      protected boolean h() {
         ht $$0 = ht.a(bwt.this.dq(), bwt.this.cG().e, bwt.this.dw());
         return !bwt.this.dL().g($$0) && bwt.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !bwt.this.dL().a(bky.class, this.b, bwt.this, bwt.this.cG().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends brf {
      public e(double $$0) {
         super(bwt.this, $$0);
      }

      @Override
      public void c() {
         ((bwt)this.a).gs();
         ((bwt)this.c).gs();
         super.c();
      }

      @Override
      protected void g() {
         ama $$0 = (ama)this.b;
         bwt $$1 = (bwt)this.a.a($$0, (bkd)this.c);
         if ($$1 != null) {
            amb $$2 = this.a.gh();
            amb $$3 = this.c.gh();
            amb $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cv());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cv());
            }

            if ($$4 != null) {
               $$4.a(aqx.P);
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
            if (this.b.X().b(cro.f)) {
               this.b.b(new bko(this.b, this.a.dq(), this.a.ds(), this.a.dw(), this.a.ef().a(7) + 1));
            }
         }
      }
   }

   public class f extends bsg {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(bwt.this, $$1, $$2, $$3);
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
      protected boolean a(crv $$0, ht $$1) {
         dgw $$2 = $$0.a_($$1);
         return $$2.a(cuv.oi) && $$2.c(dcv.c) >= 2 || cvp.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && bwt.this.ag.i() < 0.05F) {
            bwt.this.a(aqn.ik, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (bwt.this.dL().X().b(cro.c)) {
            dgw $$0 = bwt.this.dL().a_(this.e);
            if ($$0.a(cuv.oi)) {
               this.b($$0);
            } else if (cvp.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dgw $$0) {
         cvp.a(bwt.this, $$0, bwt.this.dL(), this.e);
      }

      private void b(dgw $$0) {
         int $$1 = $$0.c(dcv.c);
         $$0.a(dcv.c, Integer.valueOf(1));
         int $$2 = 1 + bwt.this.dL().z.a(2) + ($$1 == 3 ? 1 : 0);
         clb $$3 = bwt.this.c(bkn.a);
         if ($$3.b()) {
            bwt.this.a(bkn.a, new clb(cle.vw));
            $$2--;
         }

         if ($$2 > 0) {
            cut.a(bwt.this.dL(), this.e, new clb(cle.vw, $$2));
         }

         bwt.this.a(aqn.xJ, 1.0F, 1.0F);
         bwt.this.dL().a(this.e, $$0.a(dcv.c, Integer.valueOf(1)), 2);
         bwt.this.dL().a(dlg.c, this.e, dlg.a.a(bwt.this));
      }

      @Override
      public boolean a() {
         return !bwt.this.fD() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         bwt.this.w(false);
         super.c();
      }
   }

   class g extends brn {
      public g() {
         super(bwt.this);
      }

      @Override
      public void c() {
         super.c();
         bwt.this.gs();
      }

      @Override
      public boolean a() {
         return bwt.this.aX() && bwt.this.b(arh.a) > 0.25 || bwt.this.bl();
      }
   }

   class h extends brs {
      private final bwt e;

      public h(bwt $$0, double $$1) {
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

   public static class i extends bkd.a {
      public final bwt.v a;

      public i(bwt.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bsb {
      public j(bla $$0, Class<? extends bky> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !bwt.this.ge() && !bwt.this.gn();
      }

      @Override
      public boolean b() {
         return super.b() && !bwt.this.ge() && !bwt.this.gn();
      }
   }

   public class k extends bqv {
      public k() {
         super(bwt.this);
      }

      @Override
      public void a() {
         if (!bwt.this.fD()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bwt.this.gk() && !bwt.this.bW() && !bwt.this.gn() && !bwt.this.ge();
      }
   }

   class l extends bsd {
      public l(double $$0, boolean $$1) {
         super(bwt.this, $$0, $$1);
      }

      @Override
      protected void a(bky $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bwt.this.a(aqn.ie, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         bwt.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !bwt.this.y() && !bwt.this.fD() && !bwt.this.bW() && !bwt.this.ge() && super.a();
      }
   }

   class m extends bqw {
      public m() {
         super(bwt.this);
      }

      @Override
      public void a() {
         if (bwt.this.gt()) {
            super.a();
         }
      }
   }

   class n extends bsm {
      public n(double $$0) {
         super(bwt.this, $$0);
      }

      @Override
      public boolean h() {
         return !bwt.this.gq() && super.h();
      }
   }

   public class o extends brx {
      @Override
      public boolean a() {
         if (!bwt.this.gm()) {
            return false;
         } else {
            bky $$0 = bwt.this.q();
            if ($$0 != null && $$0.bv()) {
               if ($$0.cE() != $$0.cD()) {
                  return false;
               } else {
                  boolean $$1 = bwt.a(bwt.this, $$0);
                  if (!$$1) {
                     bwt.this.L().a($$0, 0);
                     bwt.this.y(false);
                     bwt.this.z(false);
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
         bky $$0 = bwt.this.q();
         if ($$0 != null && $$0.bv()) {
            double $$1 = bwt.this.do().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(bwt.this.dD()) < 15.0F) || !bwt.this.aA()) && !bwt.this.ge();
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
         bwt.this.r(true);
         bwt.this.x(true);
         bwt.this.z(false);
         bky $$0 = bwt.this.q();
         if ($$0 != null) {
            bwt.this.G().a($$0, 60.0F, 30.0F);
            eji $$1 = new eji($$0.dq() - bwt.this.dq(), $$0.ds() - bwt.this.ds(), $$0.dw() - bwt.this.dw()).d();
            bwt.this.f(bwt.this.do().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         bwt.this.L().n();
      }

      @Override
      public void d() {
         bwt.this.y(false);
         bwt.this.cp = 0.0F;
         bwt.this.cq = 0.0F;
         bwt.this.z(false);
         bwt.this.x(false);
      }

      @Override
      public void e() {
         bky $$0 = bwt.this.q();
         if ($$0 != null) {
            bwt.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!bwt.this.ge()) {
            eji $$1 = bwt.this.do();
            if ($$1.d * $$1.d < 0.03F && bwt.this.dD() != 0.0F) {
               bwt.this.s(ati.j(0.2F, bwt.this.dD(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               bwt.this.s((float)$$3);
            }
         }

         if ($$0 != null && bwt.this.e((bki)$$0) <= 2.0F) {
            bwt.this.C($$0);
         } else if (bwt.this.dD() > 0.0F && bwt.this.aA() && (float)bwt.this.do().d != 0.0F && bwt.this.dL().a_(bwt.this.dl()).a(cuv.dN)) {
            bwt.this.s(60.0F);
            bwt.this.h(null);
            bwt.this.A(true);
         }
      }
   }

   class p extends brt {
      public p() {
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public boolean a() {
         if (!bwt.this.c(bkn.a).b()) {
            return false;
         } else if (bwt.this.q() != null || bwt.this.eg() != null) {
            return false;
         } else if (!bwt.this.gt()) {
            return false;
         } else if (bwt.this.ef().a(b(10)) != 0) {
            return false;
         } else {
            List<caf> $$0 = bwt.this.dL().a(caf.class, bwt.this.cG().c(8.0, 8.0, 8.0), bwt.cf);
            return !$$0.isEmpty() && bwt.this.c(bkn.a).b();
         }
      }

      @Override
      public void e() {
         List<caf> $$0 = bwt.this.dL().a(caf.class, bwt.this.cG().c(8.0, 8.0, 8.0), bwt.cf);
         clb $$1 = bwt.this.c(bkn.a);
         if ($$1.b() && !$$0.isEmpty()) {
            bwt.this.L().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<caf> $$0 = bwt.this.dL().a(caf.class, bwt.this.cG().c(8.0, 8.0, 8.0), bwt.cf);
         if (!$$0.isEmpty()) {
            bwt.this.L().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends bsz {
      public q(int $$0, int $$1) {
         super(bwt.this, $$1);
      }

      @Override
      public void c() {
         bwt.this.gs();
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
         return !bwt.this.fD() && !bwt.this.y() && !bwt.this.gq() && bwt.this.q() == null;
      }
   }

   class r extends bwt.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(brt.a.a, brt.a.b));
      }

      @Override
      public boolean a() {
         return bwt.this.eg() == null
            && bwt.this.ef().i() < 0.02F
            && !bwt.this.fD()
            && bwt.this.q() == null
            && bwt.this.L().l()
            && !this.i()
            && !bwt.this.gk()
            && !bwt.this.bW();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + bwt.this.ef().a(3);
         bwt.this.w(true);
         bwt.this.L().n();
      }

      @Override
      public void d() {
         bwt.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         bwt.this.G().a(bwt.this.dq() + this.c, bwt.this.du(), bwt.this.dw() + this.d, (float)bwt.this.Z(), (float)bwt.this.Y());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * bwt.this.ef().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + bwt.this.ef().a(20));
      }
   }

   class s extends brm {
      private int c = b(100);

      public s(double $$0) {
         super(bwt.this, $$0);
      }

      @Override
      public boolean a() {
         if (!bwt.this.fD() && this.a.q() == null) {
            if (bwt.this.dL().Y() && bwt.this.dL().g(this.a.dl())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ht $$0 = this.a.dl();
               return bwt.this.dL().N() && bwt.this.dL().g($$0) && !((ama)bwt.this.dL()).b($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         bwt.this.gs();
         super.c();
      }
   }

   class t extends bwt.d {
      private static final int c = b(140);
      private int d = bwt.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(brt.a.a, brt.a.b, brt.a.c));
      }

      @Override
      public boolean a() {
         return bwt.this.bk == 0.0F && bwt.this.bl == 0.0F && bwt.this.bm == 0.0F ? this.k() || bwt.this.fD() : false;
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
            return bwt.this.dL().N() && this.h() && !this.i() && !bwt.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = bwt.this.ag.a(c);
         bwt.this.gs();
      }

      @Override
      public void c() {
         bwt.this.w(false);
         bwt.this.y(false);
         bwt.this.z(false);
         bwt.this.r(false);
         bwt.this.C(true);
         bwt.this.L().n();
         bwt.this.I().a(bwt.this.dq(), bwt.this.ds(), bwt.this.dw(), 0.0);
      }
   }

   class u extends brt {
      public u() {
         this.a(EnumSet.of(brt.a.a, brt.a.b));
      }

      @Override
      public boolean a() {
         if (bwt.this.fD()) {
            return false;
         } else {
            bky $$0 = bwt.this.q();
            return $$0 != null && $$0.bv() && bwt.ch.test($$0) && bwt.this.f($$0) > 36.0 && !bwt.this.bW() && !bwt.this.gn() && !bwt.this.bj;
         }
      }

      @Override
      public void c() {
         bwt.this.w(false);
         bwt.this.A(false);
      }

      @Override
      public void d() {
         bky $$0 = bwt.this.q();
         if ($$0 != null && bwt.a(bwt.this, $$0)) {
            bwt.this.z(true);
            bwt.this.y(true);
            bwt.this.L().n();
            bwt.this.G().a($$0, (float)bwt.this.Z(), (float)bwt.this.Y());
         } else {
            bwt.this.z(false);
            bwt.this.y(false);
         }
      }

      @Override
      public void e() {
         bky $$0 = bwt.this.q();
         if ($$0 != null) {
            bwt.this.G().a($$0, (float)bwt.this.Z(), (float)bwt.this.Y());
            if (bwt.this.f($$0) <= 36.0) {
               bwt.this.z(true);
               bwt.this.y(true);
               bwt.this.L().n();
            } else {
               bwt.this.L().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements aub {
      a(0, "red"),
      b(1, "snow");

      public static final aub.a<bwt.v> c = aub.a(bwt.v::values);
      private static final IntFunction<bwt.v> d = asb.a(bwt.v::a, values(), asb.a.a);
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

      public static bwt.v a(String $$0) {
         return c.a($$0, a);
      }

      public static bwt.v a(int $$0) {
         return d.apply($$0);
      }

      public static bwt.v a(ib<csq> $$0) {
         return $$0.a(arb.aq) ? b : a;
      }
   }
}
