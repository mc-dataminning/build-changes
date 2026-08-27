import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byc extends bxs implements bnd<byc.v> {
   private static final agj<Integer> bX = agm.a(byc.class, agl.b);
   private static final agj<Byte> bY = agm.a(byc.class, agl.a);
   private static final int bZ = 1;
   public static final int bT = 4;
   public static final int bU = 8;
   public static final int bW = 16;
   private static final int ca = 32;
   private static final int cb = 64;
   private static final int cc = 128;
   private static final agj<Optional<UUID>> cd = agm.a(byc.class, agl.q);
   private static final agj<Optional<UUID>> ce = agm.a(byc.class, agl.q);
   static final Predicate<cbo> cf = $$0 -> !$$0.z() && $$0.bx();
   private static final Predicate<blp> cg = $$0 -> !($$0 instanceof bmf $$1) ? false : $$1.ej() != null && $$1.ek() < $$1.ah + 600;
   static final Predicate<blp> ch = $$0 -> $$0 instanceof bxx || $$0 instanceof bym;
   private static final Predicate<blp> ci = $$0 -> !$$0.bV() && bls.e.test($$0);
   private static final int cj = 600;
   private btb ck;
   private btb cl;
   private btb cm;
   private float cn;
   private float co;
   float cp;
   float cq;
   private int cr;

   public byc(blt<? extends byc> $$0, cti $$1) {
      super($$0, $$1);
      this.bK = new byc.k();
      this.bL = new byc.m();
      this.a(eev.p, 0.0F);
      this.a(eev.q, 0.0F);
      this.s(true);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cd, Optional.empty());
      this.an.a(ce, Optional.empty());
      this.an.a(bX, 0);
      this.an.a(bY, (byte)0);
   }

   @Override
   protected void B() {
      this.ck = new buu<>(this, bxs.class, 10, false, false, $$0 -> $$0 instanceof bxx || $$0 instanceof bym);
      this.cl = new buu<>(this, byt.class, 10, false, false, byt.bU);
      this.cm = new buu<>(this, bxp.class, 20, false, false, $$0 -> $$0 instanceof bxr);
      this.bO.a(0, new byc.g());
      this.bO.a(0, new bsq(this, this.dM()));
      this.bO.a(1, new byc.b());
      this.bO.a(2, new byc.n(2.2));
      this.bO.a(3, new byc.e(1.0));
      this.bO.a(4, new bsi<>(this, cfb.class, 16.0F, 1.6, 1.4, $$0 -> ci.test($$0) && !this.c($$0.cw()) && !this.gq()));
      this.bO.a(4, new bsi<>(this, byv.class, 8.0F, 1.6, 1.4, $$0 -> !((byv)$$0).u() && !this.gq()));
      this.bO.a(4, new bsi<>(this, byk.class, 8.0F, 1.6, 1.4, $$0 -> !this.gq()));
      this.bO.a(5, new byc.u());
      this.bO.a(6, new byc.o());
      this.bO.a(6, new byc.s(1.25));
      this.bO.a(7, new byc.l(1.2F, true));
      this.bO.a(7, new byc.t());
      this.bO.a(8, new byc.h(this, 1.25));
      this.bO.a(9, new byc.q(32, 200));
      this.bO.a(10, new byc.f(1.2F, 12, 1));
      this.bO.a(10, new bth(this, 0.4F));
      this.bO.a(11, new buo(this, 1.0));
      this.bO.a(11, new byc.p());
      this.bO.a(12, new byc.j(this, cfb.class, 24.0F));
      this.bO.a(13, new byc.r());
      this.bP.a(3, new byc.a(bmf.class, false, false, $$0 -> cg.test($$0) && !this.c($$0.cw())));
   }

   @Override
   public arl d(cmr $$0) {
      return arm.iF;
   }

   @Override
   public void d_() {
      if (!this.dM().B && this.bx() && this.cY()) {
         this.cr++;
         cmr $$0 = this.c(blu.a);
         if (this.l($$0)) {
            if (this.cr > 600) {
               cmr $$1 = $$0.a(this.dM(), this);
               if (!$$1.b()) {
                  this.a(blu.a, $$1);
               }

               this.cr = 0;
            } else if (this.cr > 560 && this.ag.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dM().a(this, (byte)45);
            }
         }

         bmf $$2 = this.q();
         if ($$2 == null || !$$2.bx()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fD() || this.eY()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      }

      super.d_();
      if (this.gq() && this.ag.i() < 0.05F) {
         this.a(arm.iB, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean eY() {
      return this.ew();
   }

   private boolean l(cmr $$0) {
      return $$0.d().u() && this.q() == null && this.aC() && !this.fD();
   }

   @Override
   protected void a(aup $$0, bjt $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cmr $$3;
         if ($$2 < 0.05F) {
            $$3 = new cmr(cmu.ow);
         } else if ($$2 < 0.2F) {
            $$3 = new cmr(cmu.qO);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cmr(cmu.uw) : new cmr(cmu.ux);
         } else if ($$2 < 0.6F) {
            $$3 = new cmr(cmu.pt);
         } else if ($$2 < 0.8F) {
            $$3 = new cmr(cmu.qA);
         } else {
            $$3 = new cmr(cmu.pq);
         }

         this.a(blu.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cmr $$1 = this.c(blu.a);
         if (!$$1.b()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               elm $$3 = new elm(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dE() * (float) (Math.PI / 180.0))
                  .b(-this.dC() * (float) (Math.PI / 180.0));
               this.dM().a(new jt(jx.Q, $$1), this.dr() + this.bF().c / 2.0, this.dt(), this.dx() + this.bF().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bnk.a u() {
      return bmh.C().a(bnl.m, 0.3F).a(bnl.l, 10.0).a(bnl.g, 32.0).a(bnl.c, 2.0);
   }

   @Nullable
   public byc b(amz $$0, blk $$1) {
      byc $$2 = blt.O.a((cti)$$0);
      if ($$2 != null) {
         $$2.a(this.ag.h() ? this.w() : ((byc)$$1).w());
      }

      return $$2;
   }

   public static boolean c(blt<byc> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return $$1.a_($$3.d()).a(asb.bW) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      ih<cuh> $$5 = $$0.t(this.dm());
      byc.v $$6 = byc.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof byc.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new byc.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.c_(-24000);
      }

      if ($$0 instanceof amz) {
         this.go();
      }

      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void go() {
      if (this.w() == byc.v.a) {
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
   protected void a(cfb $$0, bju $$1, cmr $$2) {
      if (this.m($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return this.o_() ? $$1.b * 0.85F : 0.4F;
   }

   public byc.v w() {
      return byc.v.a(this.an.b(bX));
   }

   public void a(byc.v $$0) {
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
   public void b(sl $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gp();
      sr $$2 = new sr();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(ta.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fD());
      $$0.a("Type", this.w().c());
      $$0.a("Sitting", this.A());
      $$0.a("Crouching", this.bX());
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);

      for (ti $$2 : $$0.c("Trusted", 11)) {
         this.b(ta.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(byc.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dM() instanceof amz) {
         this.go();
      }
   }

   public boolean A() {
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
   public boolean f(cmr $$0) {
      blu $$1 = bmh.h($$0);
      return !this.c($$1).b() ? false : $$1 == blu.a && super.f($$0);
   }

   @Override
   public boolean j(cmr $$0) {
      cmm $$1 = $$0.d();
      cmr $$2 = this.c(blu.a);
      return $$2.b() || this.cr > 0 && $$1.u() && !$$2.d().u();
   }

   private void n(cmr $$0) {
      if (!$$0.b() && !this.dM().B) {
         cbo $$1 = new cbo(this.dM(), this.dr() + this.bF().c, this.dt() + 1.0, this.dx() + this.bF().e, $$0);
         $$1.b(40);
         $$1.a(this);
         this.a(arm.iK, 1.0F, 1.0F);
         this.dM().b($$1);
      }
   }

   private void o(cmr $$0) {
      cbo $$1 = new cbo(this.dM(), this.dr(), this.dt(), this.dx(), $$0);
      this.dM().b($$1);
   }

   @Override
   protected void b(cbo $$0) {
      cmr $$1 = $$0.q();
      if (this.j($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.o($$1.a($$2 - 1));
         }

         this.n(this.c(blu.a));
         this.a($$0);
         this.a(blu.a, $$1.a(1));
         this.e(blu.a);
         this.a($$0, $$1.L());
         $$0.am();
         this.cr = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.cY()) {
         boolean $$0 = this.aZ();
         if ($$0 || this.q() != null || this.dM().aa()) {
            this.gr();
         }

         if ($$0 || this.fD()) {
            this.w(false);
         }

         if (this.ge() && this.dM().z.i() < 0.2F) {
            hx $$1 = this.dm();
            dja $$2 = this.dM().a_($$1);
            this.dM().c(2001, $$1, cwj.i($$2));
         }
      }

      this.co = this.cn;
      if (this.gn()) {
         this.cn = this.cn + (1.0F - this.cn) * 0.4F;
      } else {
         this.cn = this.cn + (0.0F - this.cn) * 0.4F;
      }

      this.cq = this.cp;
      if (this.bX()) {
         this.cp += 0.2F;
         if (this.cp > 3.0F) {
            this.cp = 3.0F;
         }
      } else {
         this.cp = 0.0F;
      }
   }

   @Override
   public boolean m(cmr $$0) {
      return $$0.a(asj.X);
   }

   @Override
   protected void a(cfb $$0, bmh $$1) {
      ((byc)$$1).b($$0.cw());
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
   public boolean bX() {
      return this.t(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gn() {
      return this.t(8);
   }

   public float E(float $$0) {
      return aui.i($$0, this.co, this.cn) * 0.11F * (float) Math.PI;
   }

   public float F(float $$0) {
      return aui.i($$0, this.cq, this.cp);
   }

   @Override
   public void h(@Nullable bmf $$0) {
      if (this.gq() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return aui.f(($$0 - 5.0F) * $$1);
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
      return !this.fD() && !this.A() && !this.ge();
   }

   @Override
   public void R() {
      arl $$0 = this.y();
      if ($$0 == arm.iH) {
         this.a($$0, 2.0F, this.eX());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected arl y() {
      if (this.fD()) {
         return arm.iI;
      } else {
         if (!this.dM().P() && this.ag.i() < 0.1F) {
            List<cfb> $$0 = this.dM().a(cfb.class, this.cH().c(16.0, 16.0, 16.0), bls.f);
            if ($$0.isEmpty()) {
               return arm.iH;
            }
         }

         return arm.iC;
      }
   }

   @Nullable
   @Override
   protected arl d(bkn $$0) {
      return arm.iG;
   }

   @Nullable
   @Override
   protected arl n_() {
      return arm.iE;
   }

   boolean c(UUID $$0) {
      return this.gp().contains($$0);
   }

   @Override
   protected void g(bkn $$0) {
      cmr $$1 = this.c(blu.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(blu.a, cmr.f);
      }

      super.g($$0);
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + -0.0625F * $$2, -0.25F * $$2);
   }

   public static boolean a(byc $$0, bmf $$1) {
      double $$2 = $$1.dx() - $$0.dx();
      double $$3 = $$1.dr() - $$0.dr();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dM().a_(hx.a($$0.dr() + $$8, $$0.dt() + (double)$$9, $$0.dx() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public elm cJ() {
      return new elm(0.0, (double)(0.55F * this.cI()), (double)(this.dg() * 0.4F));
   }

   class a extends buu<bmf> {
      @Nullable
      private bmf j;
      @Nullable
      private bmf k;
      private int l;

      public a(Class<bmf> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bmf> $$3) {
         super(byc.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.eg().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : byc.this.gp()) {
               if ($$0 != null && byc.this.dM() instanceof amz && ((amz)byc.this.dM()).a($$0) instanceof bmf $$2) {
                  this.k = $$2;
                  this.j = $$2.eh();
                  int $$3 = $$2.ei();
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
            this.l = this.k.ei();
         }

         byc.this.a(arm.iB, 1.0F, 1.0F);
         byc.this.B(true);
         byc.this.gr();
         super.c();
      }
   }

   class b extends btb {
      int a;

      public b() {
         this.a(EnumSet.of(btb.a.b, btb.a.c, btb.a.a));
      }

      @Override
      public boolean a() {
         return byc.this.ge();
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
         byc.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bmf> {
      public boolean a(bmf $$0) {
         if ($$0 instanceof byc) {
            return false;
         } else if ($$0 instanceof bxx || $$0 instanceof bym || $$0 instanceof ccj) {
            return true;
         } else if ($$0 instanceof bna) {
            return !((bna)$$0).u();
         } else if (!($$0 instanceof cfb) || !$$0.P_() && !((cfb)$$0).f()) {
            return byc.this.c($$0.cw()) ? false : !$$0.fD() && !$$0.bV();
         } else {
            return false;
         }
      }
   }

   abstract class d extends btb {
      private final bwt b = bwt.a().a(12.0).d().a(byc.this.new c());

      protected boolean h() {
         hx $$0 = hx.a(byc.this.dr(), byc.this.cH().e, byc.this.dx());
         return !byc.this.dM().h($$0) && byc.this.h($$0) >= 0.0F;
      }

      protected boolean i() {
         return !byc.this.dM().a(bmf.class, this.b, byc.this, byc.this.cH().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bsn {
      public e(double $$0) {
         super(byc.this, $$0);
      }

      @Override
      public void c() {
         ((byc)this.a).gs();
         ((byc)this.c).gs();
         super.c();
      }

      @Override
      protected void g() {
         amz $$0 = (amz)this.b;
         byc $$1 = (byc)this.a.a($$0, (blk)this.c);
         if ($$1 != null) {
            ana $$2 = this.a.gh();
            ana $$3 = this.c.gh();
            ana $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cw());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cw());
            }

            if ($$4 != null) {
               $$4.a(arw.P);
               am.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gj();
            this.c.gj();
            $$1.c_(-24000);
            $$1.b(this.a.dr(), this.a.dt(), this.a.dx(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.Z().b(cte.f)) {
               this.b.b(new blv(this.b, this.a.dr(), this.a.dt(), this.a.dx(), this.a.eg().a(7) + 1));
            }
         }
      }
   }

   public class f extends bto {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(byc.this, $$1, $$2, $$3);
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
      protected boolean a(ctl $$0, hx $$1) {
         dja $$2 = $$0.a_($$1);
         return $$2.a(cwl.oi) && $$2.c(del.c) >= 2 || cxf.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && byc.this.ag.i() < 0.05F) {
            byc.this.a(arm.iJ, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (byc.this.dM().Z().b(cte.c)) {
            dja $$0 = byc.this.dM().a_(this.e);
            if ($$0.a(cwl.oi)) {
               this.b($$0);
            } else if (cxf.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dja $$0) {
         cxf.a(byc.this, $$0, byc.this.dM(), this.e);
      }

      private void b(dja $$0) {
         int $$1 = $$0.c(del.c);
         $$0.a(del.c, Integer.valueOf(1));
         int $$2 = 1 + byc.this.dM().z.a(2) + ($$1 == 3 ? 1 : 0);
         cmr $$3 = byc.this.c(blu.a);
         if ($$3.b()) {
            byc.this.a(blu.a, new cmr(cmu.wi));
            $$2--;
         }

         if ($$2 > 0) {
            cwj.a(byc.this.dM(), this.e, new cmr(cmu.wi, $$2));
         }

         byc.this.a(arm.yv, 1.0F, 1.0F);
         byc.this.dM().a(this.e, $$0.a(del.c, Integer.valueOf(1)), 2);
         byc.this.dM().a(dnk.c, this.e, dnk.a.a(byc.this));
      }

      @Override
      public boolean a() {
         return !byc.this.fD() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         byc.this.w(false);
         super.c();
      }
   }

   class g extends bsv {
      public g() {
         super(byc.this);
      }

      @Override
      public void c() {
         super.c();
         byc.this.gs();
      }

      @Override
      public boolean a() {
         return byc.this.aZ() && byc.this.b(asg.a) > 0.25 || byc.this.bn();
      }
   }

   class h extends bta {
      private final byc e;

      public h(byc $$0, double $$1) {
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

   public static class i extends blk.a {
      public final byc.v a;

      public i(byc.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends btj {
      public j(bmh $$0, Class<? extends bmf> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !byc.this.ge() && !byc.this.gn();
      }

      @Override
      public boolean b() {
         return super.b() && !byc.this.ge() && !byc.this.gn();
      }
   }

   public class k extends bsd {
      public k() {
         super(byc.this);
      }

      @Override
      public void a() {
         if (!byc.this.fD()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !byc.this.gk() && !byc.this.bX() && !byc.this.gn() && !byc.this.ge();
      }
   }

   class l extends btl {
      public l(double $$0, boolean $$1) {
         super(byc.this, $$0, $$1);
      }

      @Override
      protected void a(bmf $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            byc.this.a(arm.iD, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         byc.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !byc.this.A() && !byc.this.fD() && !byc.this.bX() && !byc.this.ge() && super.a();
      }
   }

   class m extends bse {
      public m() {
         super(byc.this);
      }

      @Override
      public void a() {
         if (byc.this.gt()) {
            super.a();
         }
      }
   }

   class n extends btu {
      public n(double $$0) {
         super(byc.this, $$0);
      }

      @Override
      public boolean h() {
         return !byc.this.gq() && super.h();
      }
   }

   public class o extends btf {
      @Override
      public boolean a() {
         if (!byc.this.gm()) {
            return false;
         } else {
            bmf $$0 = byc.this.q();
            if ($$0 != null && $$0.bx()) {
               if ($$0.cF() != $$0.cE()) {
                  return false;
               } else {
                  boolean $$1 = byc.a(byc.this, $$0);
                  if (!$$1) {
                     byc.this.N().a($$0, 0);
                     byc.this.y(false);
                     byc.this.z(false);
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
         bmf $$0 = byc.this.q();
         if ($$0 != null && $$0.bx()) {
            double $$1 = byc.this.dp().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(byc.this.dE()) < 15.0F) || !byc.this.aC()) && !byc.this.ge();
         } else {
            return false;
         }
      }

      @Override
      public boolean S_() {
         return false;
      }

      @Override
      public void c() {
         byc.this.r(true);
         byc.this.x(true);
         byc.this.z(false);
         bmf $$0 = byc.this.q();
         if ($$0 != null) {
            byc.this.I().a($$0, 60.0F, 30.0F);
            elm $$1 = new elm($$0.dr() - byc.this.dr(), $$0.dt() - byc.this.dt(), $$0.dx() - byc.this.dx()).d();
            byc.this.g(byc.this.dp().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         byc.this.N().n();
      }

      @Override
      public void d() {
         byc.this.y(false);
         byc.this.cp = 0.0F;
         byc.this.cq = 0.0F;
         byc.this.z(false);
         byc.this.x(false);
      }

      @Override
      public void e() {
         bmf $$0 = byc.this.q();
         if ($$0 != null) {
            byc.this.I().a($$0, 60.0F, 30.0F);
         }

         if (!byc.this.ge()) {
            elm $$1 = byc.this.dp();
            if ($$1.d * $$1.d < 0.03F && byc.this.dE() != 0.0F) {
               byc.this.s(aui.j(0.2F, byc.this.dE(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               byc.this.s((float)$$3);
            }
         }

         if ($$0 != null && byc.this.e((blp)$$0) <= 2.0F) {
            byc.this.C($$0);
         } else if (byc.this.dE() > 0.0F && byc.this.aC() && (float)byc.this.dp().d != 0.0F && byc.this.dM().a_(byc.this.dm()).a(cwl.dN)) {
            byc.this.s(60.0F);
            byc.this.h(null);
            byc.this.A(true);
         }
      }
   }

   class p extends btb {
      public p() {
         this.a(EnumSet.of(btb.a.a));
      }

      @Override
      public boolean a() {
         if (!byc.this.c(blu.a).b()) {
            return false;
         } else if (byc.this.q() != null || byc.this.eh() != null) {
            return false;
         } else if (!byc.this.gt()) {
            return false;
         } else if (byc.this.eg().a(b(10)) != 0) {
            return false;
         } else {
            List<cbo> $$0 = byc.this.dM().a(cbo.class, byc.this.cH().c(8.0, 8.0, 8.0), byc.cf);
            return !$$0.isEmpty() && byc.this.c(blu.a).b();
         }
      }

      @Override
      public void e() {
         List<cbo> $$0 = byc.this.dM().a(cbo.class, byc.this.cH().c(8.0, 8.0, 8.0), byc.cf);
         cmr $$1 = byc.this.c(blu.a);
         if ($$1.b() && !$$0.isEmpty()) {
            byc.this.N().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cbo> $$0 = byc.this.dM().a(cbo.class, byc.this.cH().c(8.0, 8.0, 8.0), byc.cf);
         if (!$$0.isEmpty()) {
            byc.this.N().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends buh {
      public q(int $$0, int $$1) {
         super(byc.this, $$1);
      }

      @Override
      public void c() {
         byc.this.gs();
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
         return !byc.this.fD() && !byc.this.A() && !byc.this.gq() && byc.this.q() == null;
      }
   }

   class r extends byc.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(btb.a.a, btb.a.b));
      }

      @Override
      public boolean a() {
         return byc.this.eh() == null
            && byc.this.eg().i() < 0.02F
            && !byc.this.fD()
            && byc.this.q() == null
            && byc.this.N().l()
            && !this.i()
            && !byc.this.gk()
            && !byc.this.bX();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + byc.this.eg().a(3);
         byc.this.w(true);
         byc.this.N().n();
      }

      @Override
      public void d() {
         byc.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         byc.this.I().a(byc.this.dr() + this.c, byc.this.dv(), byc.this.dx() + this.d, (float)byc.this.ab(), (float)byc.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * byc.this.eg().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + byc.this.eg().a(20));
      }
   }

   class s extends bsu {
      private int c = b(100);

      public s(double $$0) {
         super(byc.this, $$0);
      }

      @Override
      public boolean a() {
         if (!byc.this.fD() && this.a.q() == null) {
            if (byc.this.dM().aa() && byc.this.dM().h(this.a.dm())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               hx $$0 = this.a.dm();
               return byc.this.dM().P() && byc.this.dM().h($$0) && !((amz)byc.this.dM()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         byc.this.gs();
         super.c();
      }
   }

   class t extends byc.d {
      private static final int c = b(140);
      private int d = byc.this.ag.a(c);

      public t() {
         this.a(EnumSet.of(btb.a.a, btb.a.b, btb.a.c));
      }

      @Override
      public boolean a() {
         return byc.this.bk == 0.0F && byc.this.bl == 0.0F && byc.this.bm == 0.0F ? this.k() || byc.this.fD() : false;
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
            return byc.this.dM().P() && this.h() && !this.i() && !byc.this.aA;
         }
      }

      @Override
      public void d() {
         this.d = byc.this.ag.a(c);
         byc.this.gs();
      }

      @Override
      public void c() {
         byc.this.w(false);
         byc.this.y(false);
         byc.this.z(false);
         byc.this.r(false);
         byc.this.C(true);
         byc.this.N().n();
         byc.this.K().a(byc.this.dr(), byc.this.dt(), byc.this.dx(), 0.0);
      }
   }

   class u extends btb {
      public u() {
         this.a(EnumSet.of(btb.a.a, btb.a.b));
      }

      @Override
      public boolean a() {
         if (byc.this.fD()) {
            return false;
         } else {
            bmf $$0 = byc.this.q();
            return $$0 != null && $$0.bx() && byc.ch.test($$0) && byc.this.f($$0) > 36.0 && !byc.this.bX() && !byc.this.gn() && !byc.this.bj;
         }
      }

      @Override
      public void c() {
         byc.this.w(false);
         byc.this.A(false);
      }

      @Override
      public void d() {
         bmf $$0 = byc.this.q();
         if ($$0 != null && byc.a(byc.this, $$0)) {
            byc.this.z(true);
            byc.this.y(true);
            byc.this.N().n();
            byc.this.I().a($$0, (float)byc.this.ab(), (float)byc.this.aa());
         } else {
            byc.this.z(false);
            byc.this.y(false);
         }
      }

      @Override
      public void e() {
         bmf $$0 = byc.this.q();
         if ($$0 != null) {
            byc.this.I().a($$0, (float)byc.this.ab(), (float)byc.this.aa());
            if (byc.this.f($$0) <= 36.0) {
               byc.this.z(true);
               byc.this.y(true);
               byc.this.N().n();
            } else {
               byc.this.N().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements ave {
      a(0, "red"),
      b(1, "snow");

      public static final ave.a<byc.v> c = ave.a(byc.v::values);
      private static final IntFunction<byc.v> d = ata.a(byc.v::a, values(), ata.a.a);
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

      public static byc.v a(String $$0) {
         return c.a($$0, a);
      }

      public static byc.v a(int $$0) {
         return d.apply($$0);
      }

      public static byc.v a(ih<cuh> $$0) {
         return $$0.a(asa.ar) ? b : a;
      }
   }
}
