import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chb extends cgr implements bwa<chb.v> {
   private static final akl<Integer> cc = akp.a(chb.class, akn.b);
   private static final akl<Byte> cd = akp.a(chb.class, akn.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int ca = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final akl<Optional<UUID>> ci = akp.a(chb.class, akn.r);
   private static final akl<Optional<UUID>> cj = akp.a(chb.class, akn.r);
   static final Predicate<ckv> ck = $$0 -> !$$0.w() && $$0.bM();
   private static final Predicate<bue> cl = $$0 -> !($$0 instanceof bva $$1) ? false : $$1.eu() != null && $$1.ev() < $$1.ag + 600;
   static final Predicate<bue> cm = $$0 -> $$0 instanceof cgw || $$0 instanceof chl;
   private static final Predicate<bue> cn = $$0 -> !$$0.ch() && buj.e.test($$0);
   private static final int co = 600;
   private static final buh cp = bul.Q.n().a(0.5F).b(0.2975F);
   private cby cq;
   private cby cr;
   private cby cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public chb(bul<? extends chb> $$0, dfb $$1) {
      super($$0, $$1);
      this.bO = new chb.k();
      this.bP = new chb.m();
      this.a(esb.p, 0.0F);
      this.a(esb.q, 0.0F);
      this.a_(true);
      this.P().a(32.0F);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void D() {
      this.cq = new cdr<>(this, cgr.class, 10, false, false, $$0 -> $$0 instanceof cgw || $$0 instanceof chl);
      this.cr = new cdr<>(this, chs.class, 10, false, false, chs.bY);
      this.cs = new cdr<>(this, cgn.class, 20, false, false, $$0 -> $$0 instanceof cgp);
      this.bS.a(0, new chb.g());
      this.bS.a(0, new cbn(this, this.dX()));
      this.bS.a(1, new chb.b());
      this.bS.a(2, new chb.n(2.2));
      this.bS.a(3, new chb.e(1.0));
      this.bS.a(4, new cbf<>(this, com.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cH()) && !this.gI()));
      this.bS.a(4, new cbf<>(this, chu.class, 8.0F, 1.6, 1.4, $$0 -> !((chu)$$0).q() && !this.gI()));
      this.bS.a(4, new cbf<>(this, chj.class, 8.0F, 1.6, 1.4, $$0 -> !this.gI()));
      this.bS.a(5, new chb.u());
      this.bS.a(6, new chb.o());
      this.bS.a(6, new chb.s(1.25));
      this.bS.a(7, new chb.l(1.2F, true));
      this.bS.a(7, new chb.t());
      this.bS.a(8, new chb.h(this, 1.25));
      this.bS.a(9, new chb.q(32, 200));
      this.bS.a(10, new chb.f(1.2F, 12, 1));
      this.bS.a(10, new cce(this, 0.4F));
      this.bS.a(11, new cdl(this, 1.0));
      this.bS.a(11, new chb.p());
      this.bS.a(12, new chb.j(this, com.class, 24.0F));
      this.bS.a(13, new chb.r());
      this.bT.a(3, new chb.a(bva.class, false, false, $$0 -> cl.test($$0) && !this.c($$0.cH())));
   }

   @Override
   public void n_() {
      if (!this.dX().C && this.bM() && this.dk()) {
         this.cx++;
         cwb $$0 = this.a(bum.a);
         if (this.k($$0)) {
            if (this.cx > 600) {
               cwb $$1 = $$0.a(this.dX(), this);
               if (!$$1.f()) {
                  this.a(bum.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.af.i() < 0.1F) {
               this.gA();
               this.dX().a(this, (byte)45);
            }
         }

         bva $$2 = this.m();
         if ($$2 == null || !$$2.bM()) {
            this.z(false);
            this.A(false);
         }
      }

      if (this.fT() || this.fk()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      }

      super.n_();
      if (this.gI() && this.af.i() < 0.05F) {
         this.a(awl.jg, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fk() {
      return this.eH();
   }

   private boolean k(cwb $$0) {
      return $$0.b(ku.w) && this.m() == null && this.aK() && !this.fT();
   }

   @Override
   protected void a(azs $$0, bsb $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cwb $$3;
         if ($$2 < 0.05F) {
            $$3 = new cwb(cwf.oB);
         } else if ($$2 < 0.2F) {
            $$3 = new cwb(cwf.qS);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cwb(cwf.uF) : new cwb(cwf.uG);
         } else if ($$2 < 0.6F) {
            $$3 = new cwb(cwf.px);
         } else if ($$2 < 0.8F) {
            $$3 = new cwb(cwf.qE);
         } else {
            $$3 = new cwb(cwf.pu);
         }

         this.a(bum.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cwb $$1 = this.a(bum.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ezn $$3 = new ezn(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dP() * (float) (Math.PI / 180.0))
                  .b(-this.dN() * (float) (Math.PI / 180.0));
               this.dX().a(new ln(lr.S, $$1), this.dC() + this.bU().d / 2.0, this.dE(), this.dI() + this.bU().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bwh.a q() {
      return cgr.gz().a(bwi.v, 0.3F).a(bwi.s, 10.0).a(bwi.c, 2.0).a(bwi.x, 5.0).a(bwi.m, 32.0);
   }

   @Nullable
   public chb b(arn $$0, btv $$1) {
      chb $$2 = bul.Q.a($$0, buk.e);
      if ($$2 != null) {
         $$2.a(this.af.h() ? this.t() : ((chb)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bul<chb> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.a_($$3.e()).a(axa.cf) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      jq<dgc> $$4 = $$0.t(this.dx());
      chb.v $$5 = chb.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof chb.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new chb.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof arn) {
         this.gG();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gG() {
      if (this.t() == chb.v.a) {
         this.bT.a(4, this.cq);
         this.bT.a(4, this.cr);
         this.bT.a(6, this.cs);
      } else {
         this.bT.a(4, this.cs);
         this.bT.a(6, this.cq);
         this.bT.a(6, this.cr);
      }
   }

   @Override
   protected void gA() {
      this.a(awl.jk, 1.0F, 1.0F);
   }

   @Override
   public buh e(bvm $$0) {
      return this.p_() ? cp : super.e($$0);
   }

   public chb.v t() {
      return chb.v.a(this.am.a(cc));
   }

   public void a(chb.v $$0) {
      this.am.a(cc, $$0.a());
   }

   List<UUID> gH() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.am.a(ci).orElse(null));
      $$0.add(this.am.a(cj).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.am.a(ci).isPresent()) {
         this.am.a(cj, Optional.ofNullable($$0));
      } else {
         this.am.a(ci, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gH();
      uq $$2 = new uq();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(uz.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fT());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.cj());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);

      for (vh $$2 : $$0.c("Trusted", 11)) {
         this.b(uz.a($$2));
      }

      this.D($$0.q("Sleeping"));
      this.a(chb.v.a($$0.l("Type")));
      this.x($$0.q("Sitting"));
      this.z($$0.q("Crouching"));
      if (this.dX() instanceof arn) {
         this.gG();
      }
   }

   public boolean y() {
      return this.t(1);
   }

   public void x(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gu() {
      return this.t(64);
   }

   void B(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gI() {
      return this.t(128);
   }

   void C(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fT() {
      return this.t(32);
   }

   void D(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.am.a(cd, (byte)(this.am.a(cd) | $$0));
      } else {
         this.am.a(cd, (byte)(this.am.a(cd) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.am.a(cd) & $$0) != 0;
   }

   @Override
   protected boolean f(bum $$0) {
      return $$0 == bum.a && this.fP();
   }

   @Override
   public boolean h(cwb $$0) {
      cwb $$1 = this.a(bum.a);
      return $$1.f() || this.cx > 0 && $$0.b(ku.w) && !$$1.b(ku.w);
   }

   private void m(cwb $$0) {
      if (!$$0.f() && !this.dX().C) {
         ckv $$1 = new ckv(this.dX(), this.dC() + this.bU().d, this.dE() + 1.0, this.dI() + this.bU().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awl.jp, 1.0F, 1.0F);
         this.dX().b($$1);
      }
   }

   private void n(cwb $$0) {
      ckv $$1 = new ckv(this.dX(), this.dC(), this.dE(), this.dI(), $$0);
      this.dX().b($$1);
   }

   @Override
   protected void b(ckv $$0) {
      cwb $$1 = $$0.m();
      if (this.h($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.n($$1.a($$2 - 1));
         }

         this.m(this.a(bum.a));
         this.a($$0);
         this.a(bum.a, $$1.a(1));
         this.g(bum.a);
         this.a($$0, $$1.L());
         $$0.av();
         this.cx = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dk()) {
         boolean $$0 = this.bk();
         if ($$0 || this.m() != null || this.dX().ad()) {
            this.gJ();
         }

         if ($$0 || this.fT()) {
            this.x(false);
         }

         if (this.gu() && this.dX().A.i() < 0.2F) {
            jh $$1 = this.dx();
            dvj $$2 = this.dX().a_($$1);
            this.dX().c(2001, $$1, die.j($$2));
         }
      }

      this.cu = this.ct;
      if (this.gy()) {
         this.ct = this.ct + (1.0F - this.ct) * 0.4F;
      } else {
         this.ct = this.ct + (0.0F - this.ct) * 0.4F;
      }

      this.cw = this.cv;
      if (this.cj()) {
         this.cv += 0.2F;
         if (this.cv > 3.0F) {
            this.cv = 3.0F;
         }
      } else {
         this.cv = 0.0F;
      }
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.ac);
   }

   @Override
   protected void a(com $$0, bvc $$1) {
      ((chb)$$1).b($$0.cH());
   }

   public boolean gv() {
      return this.t(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gw() {
      return this.bn;
   }

   public boolean gx() {
      return this.cv == 3.0F;
   }

   public void z(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean cj() {
      return this.t(4);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gy() {
      return this.t(8);
   }

   public float J(float $$0) {
      return azk.h($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return azk.h($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable bva $$0) {
      if (this.gI() && $$0 == null) {
         this.C(false);
      }

      super.h($$0);
   }

   void gJ() {
      this.D(false);
   }

   void gK() {
      this.A(false);
      this.z(false);
      this.x(false);
      this.D(false);
      this.C(false);
      this.B(false);
   }

   boolean gL() {
      return !this.fT() && !this.y() && !this.gu();
   }

   @Override
   public void U() {
      awk $$0 = this.w();
      if ($$0 == awl.jm) {
         this.a($$0, 2.0F, this.fj());
      } else {
         super.U();
      }
   }

   @Nullable
   @Override
   protected awk w() {
      if (this.fT()) {
         return awl.jn;
      } else {
         if (!this.dX().S() && this.af.i() < 0.1F) {
            List<com> $$0 = this.dX().a(com.class, this.cS().c(16.0, 16.0, 16.0), buj.f);
            if ($$0.isEmpty()) {
               return awl.jm;
            }
         }

         return awl.jh;
      }
   }

   @Nullable
   @Override
   protected awk d(bsu $$0) {
      return awl.jl;
   }

   @Nullable
   @Override
   protected awk o_() {
      return awl.jj;
   }

   boolean c(UUID $$0) {
      return this.gH().contains($$0);
   }

   @Override
   protected void a(arn $$0, bsu $$1) {
      cwb $$2 = this.a(bum.a);
      if (!$$2.f()) {
         this.b($$2);
         this.a(bum.a, cwb.k);
      }

      super.a($$0, $$1);
   }

   public static boolean a(chb $$0, bva $$1) {
      double $$2 = $$1.dI() - $$0.dI();
      double $$3 = $$1.dC() - $$0.dC();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dX().a_(jh.a($$0.dC() + $$8, $$0.dE() + (double)$$9, $$0.dI() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ezn cU() {
      return new ezn(0.0, (double)(0.55F * this.cT()), (double)(this.ds() * 0.4F));
   }

   class a extends cdr<bva> {
      @Nullable
      private bva j;
      @Nullable
      private bva k;
      private int l;

      public a(final Class<bva> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<bva> $$3) {
         super(chb.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.ea().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : chb.this.gH()) {
               if ($$0 != null && chb.this.dX() instanceof arn && ((arn)chb.this.dX()).a($$0) instanceof bva $$2) {
                  this.k = $$2;
                  this.j = $$2.es();
                  int $$3 = $$2.et();
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
            this.l = this.k.et();
         }

         chb.this.a(awl.jg, 1.0F, 1.0F);
         chb.this.C(true);
         chb.this.gJ();
         super.d();
      }
   }

   class b extends cby {
      int a;

      public b() {
         this.a(EnumSet.of(cby.a.b, cby.a.c, cby.a.a));
      }

      @Override
      public boolean b() {
         return chb.this.gu();
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
         chb.this.B(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements Predicate<bva> {
      public boolean a(bva $$0) {
         if ($$0 instanceof chb) {
            return false;
         } else if ($$0 instanceof cgw || $$0 instanceof chl || $$0 instanceof clr) {
            return true;
         } else if ($$0 instanceof bvx) {
            return !((bvx)$$0).q();
         } else if (!($$0 instanceof com) || !$$0.R_() && !((com)$$0).f()) {
            return chb.this.c($$0.cH()) ? false : !$$0.fT() && !$$0.ch();
         } else {
            return false;
         }
      }
   }

   abstract class d extends cby {
      private final cfr b = cfr.a().a(12.0).d().a(chb.this.new c());

      protected boolean h() {
         jh $$0 = jh.a(chb.this.dC(), chb.this.cS().e, chb.this.dI());
         return !chb.this.dX().h($$0) && chb.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !chb.this.dX().a(bva.class, this.b, chb.this, chb.this.cS().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cbk {
      public e(final double $$0) {
         super(chb.this, $$0);
      }

      @Override
      public void d() {
         ((chb)this.a).gK();
         ((chb)this.c).gK();
         super.d();
      }

      @Override
      protected void g() {
         arn $$0 = (arn)this.b;
         chb $$1 = (chb)this.a.a($$0, (btv)this.c);
         if ($$1 != null) {
            aro $$2 = this.a.gD();
            aro $$3 = this.c.gD();
            aro $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cH());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cH());
            }

            if ($$4 != null) {
               $$4.a(awv.P);
               ao.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gF();
            this.c.gF();
            $$1.c_(-24000);
            $$1.b(this.a.dC(), this.a.dE(), this.a.dI(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.ac().b(dex.f)) {
               this.b.b(new buq(this.b, this.a.dC(), this.a.dE(), this.a.dI(), this.a.ea().a(7) + 1));
            }
         }
      }
   }

   public class f extends ccl {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(chb.this, $$1, $$2, $$3);
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
      protected boolean a(dfe $$0, jh $$1) {
         dvj $$2 = $$0.a_($$1);
         return $$2.a(dig.oi) && $$2.c(dqh.c) >= 2 || dja.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && chb.this.af.i() < 0.05F) {
            chb.this.a(awl.jo, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (chb.this.dX().ac().b(dex.c)) {
            dvj $$0 = chb.this.dX().a_(this.e);
            if ($$0.a(dig.oi)) {
               this.b($$0);
            } else if (dja.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dvj $$0) {
         dja.a(chb.this, $$0, chb.this.dX(), this.e);
      }

      private void b(dvj $$0) {
         int $$1 = $$0.c(dqh.c);
         $$0.b(dqh.c, Integer.valueOf(1));
         int $$2 = 1 + chb.this.dX().A.a(2) + ($$1 == 3 ? 1 : 0);
         cwb $$3 = chb.this.a(bum.a);
         if ($$3.f()) {
            chb.this.a(bum.a, new cwb(cwf.wx));
            $$2--;
         }

         if ($$2 > 0) {
            die.a(chb.this.dX(), this.e, new cwb(cwf.wx, $$2));
         }

         chb.this.a(awl.zw, 1.0F, 1.0F);
         chb.this.dX().a(this.e, $$0.b(dqh.c, Integer.valueOf(1)), 2);
         chb.this.dX().a(eag.c, this.e, eag.a.a(chb.this));
      }

      @Override
      public boolean b() {
         return !chb.this.fT() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         chb.this.x(false);
         super.d();
      }
   }

   class g extends cbs {
      public g() {
         super(chb.this);
      }

      @Override
      public void d() {
         super.d();
         chb.this.gK();
      }

      @Override
      public boolean b() {
         return chb.this.bk() && chb.this.b(axg.a) > 0.25 || chb.this.by();
      }
   }

   class h extends cbx {
      private final chb d;

      public h(final chb $$0, final double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gI() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gI() && super.c();
      }

      @Override
      public void d() {
         this.d.gK();
         super.d();
      }
   }

   public static class i extends btv.a {
      public final chb.v a;

      public i(chb.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends ccg {
      public j(final bvc $$0, final Class<? extends bva> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !chb.this.gu() && !chb.this.gy();
      }

      @Override
      public boolean c() {
         return super.c() && !chb.this.gu() && !chb.this.gy();
      }
   }

   public class k extends cba {
      public k() {
         super(chb.this);
      }

      @Override
      public void a() {
         if (!chb.this.fT()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !chb.this.gv() && !chb.this.cj() && !chb.this.gy() && !chb.this.gu();
      }
   }

   class l extends cci {
      public l(final double $$0, final boolean $$1) {
         super(chb.this, $$0, $$1);
      }

      @Override
      protected void a(bva $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.E($$0);
            chb.this.a(awl.ji, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         chb.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !chb.this.y() && !chb.this.fT() && !chb.this.cj() && !chb.this.gu() && super.b();
      }
   }

   class m extends cbb {
      public m() {
         super(chb.this);
      }

      @Override
      public void a() {
         if (chb.this.gL()) {
            super.a();
         }
      }
   }

   class n extends ccr {
      public n(final double $$0) {
         super(chb.this, $$0);
      }

      @Override
      public boolean h() {
         return !chb.this.gI() && super.h();
      }
   }

   public class o extends ccc {
      @Override
      public boolean b() {
         if (!chb.this.gx()) {
            return false;
         } else {
            bva $$0 = chb.this.m();
            if ($$0 != null && $$0.bM()) {
               if ($$0.cQ() != $$0.cP()) {
                  return false;
               } else {
                  boolean $$1 = chb.a(chb.this, $$0);
                  if (!$$1) {
                     chb.this.P().a($$0, 0);
                     chb.this.z(false);
                     chb.this.A(false);
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
         bva $$0 = chb.this.m();
         if ($$0 != null && $$0.bM()) {
            double $$1 = chb.this.dA().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(chb.this.dP()) < 15.0F) || !chb.this.aK()) && !chb.this.gu();
         } else {
            return false;
         }
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public void d() {
         chb.this.t(true);
         chb.this.y(true);
         chb.this.A(false);
         bva $$0 = chb.this.m();
         if ($$0 != null) {
            chb.this.K().a($$0, 60.0F, 30.0F);
            ezn $$1 = new ezn($$0.dC() - chb.this.dC(), $$0.dE() - chb.this.dE(), $$0.dI() - chb.this.dI()).d();
            chb.this.h(chb.this.dA().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         chb.this.P().o();
      }

      @Override
      public void e() {
         chb.this.z(false);
         chb.this.cv = 0.0F;
         chb.this.cw = 0.0F;
         chb.this.A(false);
         chb.this.y(false);
      }

      @Override
      public void a() {
         bva $$0 = chb.this.m();
         if ($$0 != null) {
            chb.this.K().a($$0, 60.0F, 30.0F);
         }

         if (!chb.this.gu()) {
            ezn $$1 = chb.this.dA();
            if ($$1.e * $$1.e < 0.03F && chb.this.dP() != 0.0F) {
               chb.this.w(azk.i(0.2F, chb.this.dP(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               chb.this.w((float)$$3);
            }
         }

         if ($$0 != null && chb.this.f($$0) <= 2.0F) {
            chb.this.E($$0);
         } else if (chb.this.dP() > 0.0F && chb.this.aK() && (float)chb.this.dA().e != 0.0F && chb.this.dX().a_(chb.this.dx()).a(dig.dN)) {
            chb.this.w(60.0F);
            chb.this.h(null);
            chb.this.B(true);
         }
      }
   }

   class p extends cby {
      public p() {
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean b() {
         if (!chb.this.a(bum.a).f()) {
            return false;
         } else if (chb.this.m() != null || chb.this.es() != null) {
            return false;
         } else if (!chb.this.gL()) {
            return false;
         } else if (chb.this.ea().a(b(10)) != 0) {
            return false;
         } else {
            List<ckv> $$0 = chb.this.dX().a(ckv.class, chb.this.cS().c(8.0, 8.0, 8.0), chb.ck);
            return !$$0.isEmpty() && chb.this.a(bum.a).f();
         }
      }

      @Override
      public void a() {
         List<ckv> $$0 = chb.this.dX().a(ckv.class, chb.this.cS().c(8.0, 8.0, 8.0), chb.ck);
         cwb $$1 = chb.this.a(bum.a);
         if ($$1.f() && !$$0.isEmpty()) {
            chb.this.P().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<ckv> $$0 = chb.this.dX().a(ckv.class, chb.this.cS().c(8.0, 8.0, 8.0), chb.ck);
         if (!$$0.isEmpty()) {
            chb.this.P().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cde {
      public q(final int $$0, final int $$1) {
         super(chb.this, $$1);
      }

      @Override
      public void d() {
         chb.this.gK();
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
         return !chb.this.fT() && !chb.this.y() && !chb.this.gI() && chb.this.m() == null;
      }
   }

   class r extends chb.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cby.a.a, cby.a.b));
      }

      @Override
      public boolean b() {
         return chb.this.es() == null
            && chb.this.ea().i() < 0.02F
            && !chb.this.fT()
            && chb.this.m() == null
            && chb.this.P().m()
            && !this.i()
            && !chb.this.gv()
            && !chb.this.cj();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + chb.this.ea().a(3);
         chb.this.x(true);
         chb.this.P().o();
      }

      @Override
      public void e() {
         chb.this.x(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         chb.this.K().a(chb.this.dC() + this.c, chb.this.dG(), chb.this.dI() + this.d, (float)chb.this.ae(), (float)chb.this.ad());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * chb.this.ea().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + chb.this.ea().a(20));
      }
   }

   class s extends cbr {
      private int c = b(100);

      public s(final double $$0) {
         super(chb.this, $$0);
      }

      @Override
      public boolean b() {
         if (!chb.this.fT() && this.a.m() == null) {
            if (chb.this.dX().ad() && chb.this.dX().h(this.a.dx())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               jh $$0 = this.a.dx();
               return chb.this.dX().S() && chb.this.dX().h($$0) && !((arn)chb.this.dX()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         chb.this.gK();
         super.d();
      }
   }

   class t extends chb.d {
      private static final int c = b(140);
      private int d = chb.this.af.a(c);

      public t() {
         this.a(EnumSet.of(cby.a.a, cby.a.b, cby.a.c));
      }

      @Override
      public boolean b() {
         return chb.this.bo == 0.0F && chb.this.bp == 0.0F && chb.this.bq == 0.0F ? this.k() || chb.this.fT() : false;
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
            return chb.this.dX().S() && this.h() && !this.i() && !chb.this.aw;
         }
      }

      @Override
      public void e() {
         this.d = chb.this.af.a(c);
         chb.this.gK();
      }

      @Override
      public void d() {
         chb.this.x(false);
         chb.this.z(false);
         chb.this.A(false);
         chb.this.t(false);
         chb.this.D(true);
         chb.this.P().o();
         chb.this.M().a(chb.this.dC(), chb.this.dE(), chb.this.dI(), 0.0);
      }
   }

   class u extends cby {
      public u() {
         this.a(EnumSet.of(cby.a.a, cby.a.b));
      }

      @Override
      public boolean b() {
         if (chb.this.fT()) {
            return false;
         } else {
            bva $$0 = chb.this.m();
            return $$0 != null && $$0.bM() && chb.cm.test($$0) && chb.this.g((bue)$$0) > 36.0 && !chb.this.cj() && !chb.this.gy() && !chb.this.bn;
         }
      }

      @Override
      public void d() {
         chb.this.x(false);
         chb.this.B(false);
      }

      @Override
      public void e() {
         bva $$0 = chb.this.m();
         if ($$0 != null && chb.a(chb.this, $$0)) {
            chb.this.A(true);
            chb.this.z(true);
            chb.this.P().o();
            chb.this.K().a($$0, (float)chb.this.ae(), (float)chb.this.ad());
         } else {
            chb.this.A(false);
            chb.this.z(false);
         }
      }

      @Override
      public void a() {
         bva $$0 = chb.this.m();
         if ($$0 != null) {
            chb.this.K().a($$0, (float)chb.this.ae(), (float)chb.this.ad());
            if (chb.this.g((bue)$$0) <= 36.0) {
               chb.this.A(true);
               chb.this.z(true);
               chb.this.P().o();
            } else {
               chb.this.P().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements bag {
      a(0, "red"),
      b(1, "snow");

      public static final bag.a<chb.v> c = bag.a(chb.v::values);
      private static final IntFunction<chb.v> d = ayb.a(chb.v::a, values(), ayb.a.a);
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

      public static chb.v a(String $$0) {
         return c.a($$0, a);
      }

      public static chb.v a(int $$0) {
         return d.apply($$0);
      }

      public static chb.v a(jq<dgc> $$0) {
         return $$0.a(awz.ar) ? b : a;
      }
   }
}
