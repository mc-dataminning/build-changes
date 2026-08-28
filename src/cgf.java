import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgf extends cfv implements bve<cgf.v> {
   private static final akg<Integer> cd = akk.a(cgf.class, aki.b);
   private static final akg<Byte> ce = akk.a(cgf.class, aki.a);
   private static final int cf = 1;
   public static final int bZ = 4;
   public static final int ca = 8;
   public static final int cb = 16;
   private static final int cg = 32;
   private static final int ch = 64;
   private static final int ci = 128;
   private static final akg<Optional<UUID>> cj = akk.a(cgf.class, aki.r);
   private static final akg<Optional<UUID>> ck = akk.a(cgf.class, aki.r);
   static final Predicate<cjz> cl = $$0 -> !$$0.w() && $$0.bI();
   private static final Predicate<btj> cm = $$0 -> !($$0 instanceof buf $$1) ? false : $$1.eo() != null && $$1.ep() < $$1.ag + 600;
   static final Predicate<btj> cn = $$0 -> $$0 instanceof cga || $$0 instanceof cgp;
   private static final Predicate<btj> co = $$0 -> !$$0.cd() && bto.e.test($$0);
   private static final int cp = 600;
   private static final btm cq = btq.Q.n().a(0.5F).b(0.2975F);
   private cbc cr;
   private cbc cs;
   private cbc ct;
   private float cu;
   private float cv;
   float cw;
   float cx;
   private int cy;

   public cgf(btq<? extends cgf> $$0, dds $$1) {
      super($$0, $$1);
      this.bP = new cgf.k();
      this.bQ = new cgf.m();
      this.a(eqs.p, 0.0F);
      this.a(eqs.q, 0.0F);
      this.a_(true);
      this.P().a(32.0F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cj, Optional.empty());
      $$0.a(ck, Optional.empty());
      $$0.a(cd, 0);
      $$0.a(ce, (byte)0);
   }

   @Override
   protected void D() {
      this.cr = new ccv<>(this, cfv.class, 10, false, false, $$0 -> $$0 instanceof cga || $$0 instanceof cgp);
      this.cs = new ccv<>(this, cgw.class, 10, false, false, cgw.bZ);
      this.ct = new ccv<>(this, cfr.class, 20, false, false, $$0 -> $$0 instanceof cft);
      this.bT.a(0, new cgf.g());
      this.bT.a(0, new car(this, this.dS()));
      this.bT.a(1, new cgf.b());
      this.bT.a(2, new cgf.n(2.2));
      this.bT.a(3, new cgf.e(1.0));
      this.bT.a(4, new caj<>(this, cnp.class, 16.0F, 1.6, 1.4, $$0 -> co.test($$0) && !this.c($$0.cD()) && !this.gC()));
      this.bT.a(4, new caj<>(this, cgy.class, 8.0F, 1.6, 1.4, $$0 -> !((cgy)$$0).q() && !this.gC()));
      this.bT.a(4, new caj<>(this, cgn.class, 8.0F, 1.6, 1.4, $$0 -> !this.gC()));
      this.bT.a(5, new cgf.u());
      this.bT.a(6, new cgf.o());
      this.bT.a(6, new cgf.s(1.25));
      this.bT.a(7, new cgf.l(1.2F, true));
      this.bT.a(7, new cgf.t());
      this.bT.a(8, new cgf.h(this, 1.25));
      this.bT.a(9, new cgf.q(32, 200));
      this.bT.a(10, new cgf.f(1.2F, 12, 1));
      this.bT.a(10, new cbi(this, 0.4F));
      this.bT.a(11, new ccp(this, 1.0));
      this.bT.a(11, new cgf.p());
      this.bT.a(12, new cgf.j(this, cnp.class, 24.0F));
      this.bT.a(13, new cgf.r());
      this.bU.a(3, new cgf.a(buf.class, false, false, $$0 -> cm.test($$0) && !this.c($$0.cD())));
   }

   @Override
   public void m_() {
      if (!this.dS().B && this.bI() && this.df()) {
         this.cy++;
         cvl $$0 = this.a(btr.a);
         if (this.o($$0)) {
            if (this.cy > 600) {
               cvl $$1 = $$0.a(this.dS(), this);
               if (!$$1.f()) {
                  this.a(btr.a, $$1);
               }

               this.cy = 0;
            } else if (this.cy > 560 && this.af.i() < 0.1F) {
               this.gu();
               this.dS().a(this, (byte)45);
            }
         }

         buf $$2 = this.m();
         if ($$2 == null || !$$2.bI()) {
            this.z(false);
            this.A(false);
         }
      }

      if (this.fL() || this.ff()) {
         this.bk = false;
         this.bl = 0.0F;
         this.bn = 0.0F;
      }

      super.m_();
      if (this.gC() && this.af.i() < 0.05F) {
         this.a(awd.jg, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean ff() {
      return this.eB();
   }

   private boolean o(cvl $$0) {
      return $$0.b(kr.v) && this.m() == null && this.aH() && !this.fL();
   }

   @Override
   protected void a(azk $$0, bri $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cvl $$3;
         if ($$2 < 0.05F) {
            $$3 = new cvl(cvo.oB);
         } else if ($$2 < 0.2F) {
            $$3 = new cvl(cvo.qS);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cvl(cvo.uF) : new cvl(cvo.uG);
         } else if ($$2 < 0.6F) {
            $$3 = new cvl(cvo.px);
         } else if ($$2 < 0.8F) {
            $$3 = new cvl(cvo.qE);
         } else {
            $$3 = new cvl(cvo.pu);
         }

         this.a(btr.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cvl $$1 = this.a(btr.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               eye $$3 = new eye(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dK() * (float) (Math.PI / 180.0))
                  .b(-this.dI() * (float) (Math.PI / 180.0));
               this.dS().a(new lj(ln.S, $$1), this.dx() + this.bQ().d / 2.0, this.dz(), this.dD() + this.bQ().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bvl.a q() {
      return cfv.gt().a(bvm.v, 0.3F).a(bvm.s, 10.0).a(bvm.c, 2.0).a(bvm.x, 5.0).a(bvm.m, 32.0);
   }

   @Nullable
   public cgf b(arg $$0, btc $$1) {
      cgf $$2 = btq.Q.a($$0, btp.e);
      if ($$2 != null) {
         $$2.a(this.af.h() ? this.t() : ((cgf)$$1).t());
      }

      return $$2;
   }

   public static boolean c(btq<cgf> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$1.a_($$3.e()).a(aws.cf) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      jn<det> $$4 = $$0.t(this.ds());
      cgf.v $$5 = cgf.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cgf.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cgf.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof arg) {
         this.gA();
      }

      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gA() {
      if (this.t() == cgf.v.a) {
         this.bU.a(4, this.cr);
         this.bU.a(4, this.cs);
         this.bU.a(6, this.ct);
      } else {
         this.bU.a(4, this.ct);
         this.bU.a(6, this.cr);
         this.bU.a(6, this.cs);
      }
   }

   @Override
   protected void gu() {
      this.a(awd.jk, 1.0F, 1.0F);
   }

   @Override
   public btm e(bur $$0) {
      return this.o_() ? cq : super.e($$0);
   }

   public cgf.v t() {
      return cgf.v.a(this.am.a(cd));
   }

   public void a(cgf.v $$0) {
      this.am.a(cd, $$0.a());
   }

   List<UUID> gB() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.am.a(cj).orElse(null));
      $$0.add(this.am.a(ck).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.am.a(cj).isPresent()) {
         this.am.a(ck, Optional.ofNullable($$0));
      } else {
         this.am.a(cj, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gB();
      ul $$2 = new ul();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(uu.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fL());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.cf());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);

      for (vc $$2 : $$0.c("Trusted", 11)) {
         this.b(uu.a($$2));
      }

      this.D($$0.q("Sleeping"));
      this.a(cgf.v.a($$0.l("Type")));
      this.x($$0.q("Sitting"));
      this.z($$0.q("Crouching"));
      if (this.dS() instanceof arg) {
         this.gA();
      }
   }

   public boolean y() {
      return this.t(1);
   }

   public void x(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean go() {
      return this.t(64);
   }

   void B(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gC() {
      return this.t(128);
   }

   void C(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fL() {
      return this.t(32);
   }

   void D(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.am.a(ce, (byte)(this.am.a(ce) | $$0));
      } else {
         this.am.a(ce, (byte)(this.am.a(ce) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.am.a(ce) & $$0) != 0;
   }

   @Override
   public boolean g(cvl $$0) {
      btr $$1 = this.i($$0);
      return !this.a($$1).f() ? false : $$1 == btr.a && super.g($$0);
   }

   @Override
   public boolean k(cvl $$0) {
      cvl $$1 = this.a(btr.a);
      return $$1.f() || this.cy > 0 && $$0.b(kr.v) && !$$1.b(kr.v);
   }

   private void q(cvl $$0) {
      if (!$$0.f() && !this.dS().B) {
         cjz $$1 = new cjz(this.dS(), this.dx() + this.bQ().d, this.dz() + 1.0, this.dD() + this.bQ().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awd.jp, 1.0F, 1.0F);
         this.dS().b($$1);
      }
   }

   private void r(cvl $$0) {
      cjz $$1 = new cjz(this.dS(), this.dx(), this.dz(), this.dD(), $$0);
      this.dS().b($$1);
   }

   @Override
   protected void b(cjz $$0) {
      cvl $$1 = $$0.m();
      if (this.k($$1)) {
         int $$2 = $$1.J();
         if ($$2 > 1) {
            this.r($$1.a($$2 - 1));
         }

         this.q(this.a(btr.a));
         this.a($$0);
         this.a(btr.a, $$1.a(1));
         this.f(btr.a);
         this.a($$0, $$1.J());
         $$0.as();
         this.cy = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.df()) {
         boolean $$0 = this.bi();
         if ($$0 || this.m() != null || this.dS().ad()) {
            this.gD();
         }

         if ($$0 || this.fL()) {
            this.x(false);
         }

         if (this.go() && this.dS().z.i() < 0.2F) {
            je $$1 = this.ds();
            dua $$2 = this.dS().a_($$1);
            this.dS().c(2001, $$1, dgv.j($$2));
         }
      }

      this.cv = this.cu;
      if (this.gs()) {
         this.cu = this.cu + (1.0F - this.cu) * 0.4F;
      } else {
         this.cu = this.cu + (0.0F - this.cu) * 0.4F;
      }

      this.cx = this.cw;
      if (this.cf()) {
         this.cw += 0.2F;
         if (this.cw > 3.0F) {
            this.cw = 3.0F;
         }
      } else {
         this.cw = 0.0F;
      }
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.Z);
   }

   @Override
   protected void a(cnp $$0, buh $$1) {
      ((cgf)$$1).b($$0.cD());
   }

   public boolean gp() {
      return this.t(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gq() {
      return this.bk;
   }

   public boolean gr() {
      return this.cw == 3.0F;
   }

   public void z(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean cf() {
      return this.t(4);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gs() {
      return this.t(8);
   }

   public float J(float $$0) {
      return azc.h($$0, this.cv, this.cu) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return azc.h($$0, this.cx, this.cw);
   }

   @Override
   public void h(@Nullable buf $$0) {
      if (this.gC() && $$0 == null) {
         this.C(false);
      }

      super.h($$0);
   }

   void gD() {
      this.D(false);
   }

   void gE() {
      this.A(false);
      this.z(false);
      this.x(false);
      this.D(false);
      this.C(false);
      this.B(false);
   }

   boolean gF() {
      return !this.fL() && !this.y() && !this.go();
   }

   @Override
   public void U() {
      awc $$0 = this.w();
      if ($$0 == awd.jm) {
         this.a($$0, 2.0F, this.fe());
      } else {
         super.U();
      }
   }

   @Nullable
   @Override
   protected awc w() {
      if (this.fL()) {
         return awd.jn;
      } else {
         if (!this.dS().S() && this.af.i() < 0.1F) {
            List<cnp> $$0 = this.dS().a(cnp.class, this.cO().c(16.0, 16.0, 16.0), bto.f);
            if ($$0.isEmpty()) {
               return awd.jm;
            }
         }

         return awd.jh;
      }
   }

   @Nullable
   @Override
   protected awc d(bsb $$0) {
      return awd.jl;
   }

   @Nullable
   @Override
   protected awc n_() {
      return awd.jj;
   }

   boolean c(UUID $$0) {
      return this.gB().contains($$0);
   }

   @Override
   protected void a(arg $$0, bsb $$1) {
      cvl $$2 = this.a(btr.a);
      if (!$$2.f()) {
         this.b($$2);
         this.a(btr.a, cvl.k);
      }

      super.a($$0, $$1);
   }

   public static boolean a(cgf $$0, buf $$1) {
      double $$2 = $$1.dD() - $$0.dD();
      double $$3 = $$1.dx() - $$0.dx();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dS().a_(je.a($$0.dx() + $$8, $$0.dz() + (double)$$9, $$0.dD() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public eye cQ() {
      return new eye(0.0, (double)(0.55F * this.cP()), (double)(this.dn() * 0.4F));
   }

   class a extends ccv<buf> {
      @Nullable
      private buf j;
      @Nullable
      private buf k;
      private int l;

      public a(final Class<buf> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<buf> $$3) {
         super(cgf.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dV().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cgf.this.gB()) {
               if ($$0 != null && cgf.this.dS() instanceof arg && ((arg)cgf.this.dS()).a($$0) instanceof buf $$2) {
                  this.k = $$2;
                  this.j = $$2.em();
                  int $$3 = $$2.en();
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
            this.l = this.k.en();
         }

         cgf.this.a(awd.jg, 1.0F, 1.0F);
         cgf.this.C(true);
         cgf.this.gD();
         super.d();
      }
   }

   class b extends cbc {
      int a;

      public b() {
         this.a(EnumSet.of(cbc.a.b, cbc.a.c, cbc.a.a));
      }

      @Override
      public boolean b() {
         return cgf.this.go();
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
         cgf.this.B(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements Predicate<buf> {
      public boolean a(buf $$0) {
         if ($$0 instanceof cgf) {
            return false;
         } else if ($$0 instanceof cga || $$0 instanceof cgp || $$0 instanceof ckv) {
            return true;
         } else if ($$0 instanceof bvb) {
            return !((bvb)$$0).q();
         } else if (!($$0 instanceof cnp) || !$$0.P_() && !((cnp)$$0).f()) {
            return cgf.this.c($$0.cD()) ? false : !$$0.fL() && !$$0.cd();
         } else {
            return false;
         }
      }
   }

   abstract class d extends cbc {
      private final cev b = cev.a().a(12.0).d().a(cgf.this.new c());

      protected boolean h() {
         je $$0 = je.a(cgf.this.dx(), cgf.this.cO().e, cgf.this.dD());
         return !cgf.this.dS().h($$0) && cgf.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cgf.this.dS().a(buf.class, this.b, cgf.this, cgf.this.cO().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cao {
      public e(final double $$0) {
         super(cgf.this, $$0);
      }

      @Override
      public void d() {
         ((cgf)this.a).gE();
         ((cgf)this.c).gE();
         super.d();
      }

      @Override
      protected void g() {
         arg $$0 = (arg)this.b;
         cgf $$1 = (cgf)this.a.a($$0, (btc)this.c);
         if ($$1 != null) {
            arh $$2 = this.a.gx();
            arh $$3 = this.c.gx();
            arh $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cD());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cD());
            }

            if ($$4 != null) {
               $$4.a(awn.P);
               an.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gz();
            this.c.gz();
            $$1.c_(-24000);
            $$1.b(this.a.dx(), this.a.dz(), this.a.dD(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.ac().b(ddo.f)) {
               this.b.b(new btv(this.b, this.a.dx(), this.a.dz(), this.a.dD(), this.a.dV().a(7) + 1));
            }
         }
      }
   }

   public class f extends cbp {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cgf.this, $$1, $$2, $$3);
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
      protected boolean a(ddv $$0, je $$1) {
         dua $$2 = $$0.a_($$1);
         return $$2.a(dgx.oi) && $$2.c(doz.c) >= 2 || dhr.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cgf.this.af.i() < 0.05F) {
            cgf.this.a(awd.jo, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (cgf.this.dS().ac().b(ddo.c)) {
            dua $$0 = cgf.this.dS().a_(this.e);
            if ($$0.a(dgx.oi)) {
               this.b($$0);
            } else if (dhr.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dua $$0) {
         dhr.a(cgf.this, $$0, cgf.this.dS(), this.e);
      }

      private void b(dua $$0) {
         int $$1 = $$0.c(doz.c);
         $$0.b(doz.c, Integer.valueOf(1));
         int $$2 = 1 + cgf.this.dS().z.a(2) + ($$1 == 3 ? 1 : 0);
         cvl $$3 = cgf.this.a(btr.a);
         if ($$3.f()) {
            cgf.this.a(btr.a, new cvl(cvo.wx));
            $$2--;
         }

         if ($$2 > 0) {
            dgv.a(cgf.this.dS(), this.e, new cvl(cvo.wx, $$2));
         }

         cgf.this.a(awd.zy, 1.0F, 1.0F);
         cgf.this.dS().a(this.e, $$0.b(doz.c, Integer.valueOf(1)), 2);
         cgf.this.dS().a(dyx.c, this.e, dyx.a.a(cgf.this));
      }

      @Override
      public boolean b() {
         return !cgf.this.fL() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         cgf.this.x(false);
         super.d();
      }
   }

   class g extends caw {
      public g() {
         super(cgf.this);
      }

      @Override
      public void d() {
         super.d();
         cgf.this.gE();
      }

      @Override
      public boolean b() {
         return cgf.this.bi() && cgf.this.b(awy.a) > 0.25 || cgf.this.bw();
      }
   }

   class h extends cbb {
      private final cgf d;

      public h(final cgf $$0, final double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gC() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gC() && super.c();
      }

      @Override
      public void d() {
         this.d.gE();
         super.d();
      }
   }

   public static class i extends btc.a {
      public final cgf.v a;

      public i(cgf.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cbk {
      public j(final buh $$0, final Class<? extends buf> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !cgf.this.go() && !cgf.this.gs();
      }

      @Override
      public boolean c() {
         return super.c() && !cgf.this.go() && !cgf.this.gs();
      }
   }

   public class k extends cae {
      public k() {
         super(cgf.this);
      }

      @Override
      public void a() {
         if (!cgf.this.fL()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cgf.this.gp() && !cgf.this.cf() && !cgf.this.gs() && !cgf.this.go();
      }
   }

   class l extends cbm {
      public l(final double $$0, final boolean $$1) {
         super(cgf.this, $$0, $$1);
      }

      @Override
      protected void a(buf $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.E($$0);
            cgf.this.a(awd.ji, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         cgf.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !cgf.this.y() && !cgf.this.fL() && !cgf.this.cf() && !cgf.this.go() && super.b();
      }
   }

   class m extends caf {
      public m() {
         super(cgf.this);
      }

      @Override
      public void a() {
         if (cgf.this.gF()) {
            super.a();
         }
      }
   }

   class n extends cbv {
      public n(final double $$0) {
         super(cgf.this, $$0);
      }

      @Override
      public boolean h() {
         return !cgf.this.gC() && super.h();
      }
   }

   public class o extends cbg {
      @Override
      public boolean b() {
         if (!cgf.this.gr()) {
            return false;
         } else {
            buf $$0 = cgf.this.m();
            if ($$0 != null && $$0.bI()) {
               if ($$0.cM() != $$0.cL()) {
                  return false;
               } else {
                  boolean $$1 = cgf.a(cgf.this, $$0);
                  if (!$$1) {
                     cgf.this.P().a($$0, 0);
                     cgf.this.z(false);
                     cgf.this.A(false);
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
         buf $$0 = cgf.this.m();
         if ($$0 != null && $$0.bI()) {
            double $$1 = cgf.this.dv().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cgf.this.dK()) < 15.0F) || !cgf.this.aH()) && !cgf.this.go();
         } else {
            return false;
         }
      }

      @Override
      public boolean S_() {
         return false;
      }

      @Override
      public void d() {
         cgf.this.t(true);
         cgf.this.y(true);
         cgf.this.A(false);
         buf $$0 = cgf.this.m();
         if ($$0 != null) {
            cgf.this.K().a($$0, 60.0F, 30.0F);
            eye $$1 = new eye($$0.dx() - cgf.this.dx(), $$0.dz() - cgf.this.dz(), $$0.dD() - cgf.this.dD()).d();
            cgf.this.h(cgf.this.dv().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         cgf.this.P().o();
      }

      @Override
      public void e() {
         cgf.this.z(false);
         cgf.this.cw = 0.0F;
         cgf.this.cx = 0.0F;
         cgf.this.A(false);
         cgf.this.y(false);
      }

      @Override
      public void a() {
         buf $$0 = cgf.this.m();
         if ($$0 != null) {
            cgf.this.K().a($$0, 60.0F, 30.0F);
         }

         if (!cgf.this.go()) {
            eye $$1 = cgf.this.dv();
            if ($$1.e * $$1.e < 0.03F && cgf.this.dK() != 0.0F) {
               cgf.this.w(azc.i(0.2F, cgf.this.dK(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               cgf.this.w((float)$$3);
            }
         }

         if ($$0 != null && cgf.this.f((btj)$$0) <= 2.0F) {
            cgf.this.E($$0);
         } else if (cgf.this.dK() > 0.0F && cgf.this.aH() && (float)cgf.this.dv().e != 0.0F && cgf.this.dS().a_(cgf.this.ds()).a(dgx.dN)) {
            cgf.this.w(60.0F);
            cgf.this.h(null);
            cgf.this.B(true);
         }
      }
   }

   class p extends cbc {
      public p() {
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean b() {
         if (!cgf.this.a(btr.a).f()) {
            return false;
         } else if (cgf.this.m() != null || cgf.this.em() != null) {
            return false;
         } else if (!cgf.this.gF()) {
            return false;
         } else if (cgf.this.dV().a(b(10)) != 0) {
            return false;
         } else {
            List<cjz> $$0 = cgf.this.dS().a(cjz.class, cgf.this.cO().c(8.0, 8.0, 8.0), cgf.cl);
            return !$$0.isEmpty() && cgf.this.a(btr.a).f();
         }
      }

      @Override
      public void a() {
         List<cjz> $$0 = cgf.this.dS().a(cjz.class, cgf.this.cO().c(8.0, 8.0, 8.0), cgf.cl);
         cvl $$1 = cgf.this.a(btr.a);
         if ($$1.f() && !$$0.isEmpty()) {
            cgf.this.P().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<cjz> $$0 = cgf.this.dS().a(cjz.class, cgf.this.cO().c(8.0, 8.0, 8.0), cgf.cl);
         if (!$$0.isEmpty()) {
            cgf.this.P().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cci {
      public q(final int $$0, final int $$1) {
         super(cgf.this, $$1);
      }

      @Override
      public void d() {
         cgf.this.gE();
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
         return !cgf.this.fL() && !cgf.this.y() && !cgf.this.gC() && cgf.this.m() == null;
      }
   }

   class r extends cgf.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cbc.a.a, cbc.a.b));
      }

      @Override
      public boolean b() {
         return cgf.this.em() == null
            && cgf.this.dV().i() < 0.02F
            && !cgf.this.fL()
            && cgf.this.m() == null
            && cgf.this.P().m()
            && !this.i()
            && !cgf.this.gp()
            && !cgf.this.cf();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + cgf.this.dV().a(3);
         cgf.this.x(true);
         cgf.this.P().o();
      }

      @Override
      public void e() {
         cgf.this.x(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cgf.this.K().a(cgf.this.dx() + this.c, cgf.this.dB(), cgf.this.dD() + this.d, (float)cgf.this.ag(), (float)cgf.this.ae());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cgf.this.dV().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cgf.this.dV().a(20));
      }
   }

   class s extends cav {
      private int c = b(100);

      public s(final double $$0) {
         super(cgf.this, $$0);
      }

      @Override
      public boolean b() {
         if (!cgf.this.fL() && this.a.m() == null) {
            if (cgf.this.dS().ad() && cgf.this.dS().h(this.a.ds())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               je $$0 = this.a.ds();
               return cgf.this.dS().S() && cgf.this.dS().h($$0) && !((arg)cgf.this.dS()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         cgf.this.gE();
         super.d();
      }
   }

   class t extends cgf.d {
      private static final int c = b(140);
      private int d = cgf.this.af.a(c);

      public t() {
         this.a(EnumSet.of(cbc.a.a, cbc.a.b, cbc.a.c));
      }

      @Override
      public boolean b() {
         return cgf.this.bl == 0.0F && cgf.this.bm == 0.0F && cgf.this.bn == 0.0F ? this.k() || cgf.this.fL() : false;
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
            return cgf.this.dS().S() && this.h() && !this.i() && !cgf.this.aw;
         }
      }

      @Override
      public void e() {
         this.d = cgf.this.af.a(c);
         cgf.this.gE();
      }

      @Override
      public void d() {
         cgf.this.x(false);
         cgf.this.z(false);
         cgf.this.A(false);
         cgf.this.t(false);
         cgf.this.D(true);
         cgf.this.P().o();
         cgf.this.M().a(cgf.this.dx(), cgf.this.dz(), cgf.this.dD(), 0.0);
      }
   }

   class u extends cbc {
      public u() {
         this.a(EnumSet.of(cbc.a.a, cbc.a.b));
      }

      @Override
      public boolean b() {
         if (cgf.this.fL()) {
            return false;
         } else {
            buf $$0 = cgf.this.m();
            return $$0 != null && $$0.bI() && cgf.cn.test($$0) && cgf.this.g($$0) > 36.0 && !cgf.this.cf() && !cgf.this.gs() && !cgf.this.bk;
         }
      }

      @Override
      public void d() {
         cgf.this.x(false);
         cgf.this.B(false);
      }

      @Override
      public void e() {
         buf $$0 = cgf.this.m();
         if ($$0 != null && cgf.a(cgf.this, $$0)) {
            cgf.this.A(true);
            cgf.this.z(true);
            cgf.this.P().o();
            cgf.this.K().a($$0, (float)cgf.this.ag(), (float)cgf.this.ae());
         } else {
            cgf.this.A(false);
            cgf.this.z(false);
         }
      }

      @Override
      public void a() {
         buf $$0 = cgf.this.m();
         if ($$0 != null) {
            cgf.this.K().a($$0, (float)cgf.this.ag(), (float)cgf.this.ae());
            if (cgf.this.g($$0) <= 36.0) {
               cgf.this.A(true);
               cgf.this.z(true);
               cgf.this.P().o();
            } else {
               cgf.this.P().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azy {
      a(0, "red"),
      b(1, "snow");

      public static final azy.a<cgf.v> c = azy.a(cgf.v::values);
      private static final IntFunction<cgf.v> d = axt.a(cgf.v::a, values(), axt.a.a);
      private final int e;
      private final String f;

      private v(final int $$0, final String $$1) {
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

      public static cgf.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cgf.v a(int $$0) {
         return d.apply($$0);
      }

      public static cgf.v a(jn<det> $$0) {
         return $$0.a(awr.ar) ? b : a;
      }
   }
}
