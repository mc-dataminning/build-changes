import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chf extends cgv implements bwe<chf.v> {
   private static final ako<Integer> cc = aks.a(chf.class, akq.b);
   private static final ako<Byte> cd = aks.a(chf.class, akq.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int ca = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final ako<Optional<UUID>> ci = aks.a(chf.class, akq.r);
   private static final ako<Optional<UUID>> cj = aks.a(chf.class, akq.r);
   static final Predicate<ckz> ck = $$0 -> !$$0.w() && $$0.bN();
   private static final Predicate<bui> cl = $$0 -> !($$0 instanceof bve $$1) ? false : $$1.ev() != null && $$1.ew() < $$1.ag + 600;
   static final Predicate<bui> cm = $$0 -> $$0 instanceof cha || $$0 instanceof chp;
   private static final Predicate<bui> cn = $$0 -> !$$0.ci() && bun.e.test($$0);
   private static final int co = 600;
   private static final bul cp = bup.Q.n().a(0.5F).b(0.2975F);
   private ccc cq;
   private ccc cr;
   private ccc cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public chf(bup<? extends chf> $$0, dff $$1) {
      super($$0, $$1);
      this.bO = new chf.k();
      this.bP = new chf.m();
      this.a(esf.p, 0.0F);
      this.a(esf.q, 0.0F);
      this.a_(true);
      this.P().a(32.0F);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void D() {
      this.cq = new cdv<>(this, cgv.class, 10, false, false, $$0 -> $$0 instanceof cha || $$0 instanceof chp);
      this.cr = new cdv<>(this, chw.class, 10, false, false, chw.bY);
      this.cs = new cdv<>(this, cgr.class, 20, false, false, $$0 -> $$0 instanceof cgt);
      this.bS.a(0, new chf.g());
      this.bS.a(0, new cbr(this, this.dY()));
      this.bS.a(1, new chf.b());
      this.bS.a(2, new chf.n(2.2));
      this.bS.a(3, new chf.e(1.0));
      this.bS.a(4, new cbj<>(this, cor.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cI()) && !this.gJ()));
      this.bS.a(4, new cbj<>(this, chy.class, 8.0F, 1.6, 1.4, $$0 -> !((chy)$$0).q() && !this.gJ()));
      this.bS.a(4, new cbj<>(this, chn.class, 8.0F, 1.6, 1.4, $$0 -> !this.gJ()));
      this.bS.a(5, new chf.u());
      this.bS.a(6, new chf.o());
      this.bS.a(6, new chf.s(1.25));
      this.bS.a(7, new chf.l(1.2F, true));
      this.bS.a(7, new chf.t());
      this.bS.a(8, new chf.h(this, 1.25));
      this.bS.a(9, new chf.q(32, 200));
      this.bS.a(10, new chf.f(1.2F, 12, 1));
      this.bS.a(10, new cci(this, 0.4F));
      this.bS.a(11, new cdp(this, 1.0));
      this.bS.a(11, new chf.p());
      this.bS.a(12, new chf.j(this, cor.class, 24.0F));
      this.bS.a(13, new chf.r());
      this.bT.a(3, new chf.a(bve.class, false, false, $$0 -> cl.test($$0) && !this.c($$0.cI())));
   }

   @Override
   public void n_() {
      if (!this.dY().C && this.bN() && this.dl()) {
         this.cx++;
         cwf $$0 = this.a(buq.a);
         if (this.k($$0)) {
            if (this.cx > 600) {
               cwf $$1 = $$0.a(this.dY(), this);
               if (!$$1.f()) {
                  this.a(buq.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.af.i() < 0.1F) {
               this.gB();
               this.dY().a(this, (byte)45);
            }
         }

         bve $$2 = this.m();
         if ($$2 == null || !$$2.bN()) {
            this.z(false);
            this.A(false);
         }
      }

      if (this.fU() || this.fl()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      }

      super.n_();
      if (this.gJ() && this.af.i() < 0.05F) {
         this.a(awo.jg, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fl() {
      return this.eI();
   }

   private boolean k(cwf $$0) {
      return $$0.b(ku.w) && this.m() == null && this.aL() && !this.fU();
   }

   @Override
   protected void a(azv $$0, bsf $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cwf $$3;
         if ($$2 < 0.05F) {
            $$3 = new cwf(cwj.oB);
         } else if ($$2 < 0.2F) {
            $$3 = new cwf(cwj.qS);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cwf(cwj.uV) : new cwf(cwj.uW);
         } else if ($$2 < 0.6F) {
            $$3 = new cwf(cwj.px);
         } else if ($$2 < 0.8F) {
            $$3 = new cwf(cwj.qE);
         } else {
            $$3 = new cwf(cwj.pu);
         }

         this.a(buq.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cwf $$1 = this.a(buq.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ezr $$3 = new ezr(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dQ() * (float) (Math.PI / 180.0))
                  .b(-this.dO() * (float) (Math.PI / 180.0));
               this.dY().a(new lo(ls.S, $$1), this.dD() + this.bV().d / 2.0, this.dF(), this.dJ() + this.bV().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bwl.a q() {
      return cgv.gA().a(bwm.v, 0.3F).a(bwm.s, 10.0).a(bwm.c, 2.0).a(bwm.x, 5.0).a(bwm.m, 32.0);
   }

   @Nullable
   public chf b(arq $$0, btz $$1) {
      chf $$2 = bup.Q.a($$0, buo.e);
      if ($$2 != null) {
         $$2.a(this.af.h() ? this.t() : ((chf)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bup<chf> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axd.cf) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      jq<dgh> $$4 = $$0.t(this.dy());
      chf.v $$5 = chf.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof chf.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new chf.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof arq) {
         this.gH();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gH() {
      if (this.t() == chf.v.a) {
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
   protected void gB() {
      this.a(awo.jk, 1.0F, 1.0F);
   }

   @Override
   public bul e(bvq $$0) {
      return this.p_() ? cp : super.e($$0);
   }

   public chf.v t() {
      return chf.v.a(this.am.a(cc));
   }

   public void a(chf.v $$0) {
      this.am.a(cc, $$0.a());
   }

   List<UUID> gI() {
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
   public void b(un $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gI();
      ut $$2 = new ut();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(vc.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fU());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.ck());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);

      for (vk $$2 : $$0.c("Trusted", 11)) {
         this.b(vc.a($$2));
      }

      this.D($$0.q("Sleeping"));
      this.a(chf.v.a($$0.l("Type")));
      this.x($$0.q("Sitting"));
      this.z($$0.q("Crouching"));
      if (this.dY() instanceof arq) {
         this.gH();
      }
   }

   public boolean y() {
      return this.t(1);
   }

   public void x(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gv() {
      return this.t(64);
   }

   void B(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gJ() {
      return this.t(128);
   }

   void C(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fU() {
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
   protected boolean f(buq $$0) {
      return $$0 == buq.a && this.fQ();
   }

   @Override
   public boolean h(cwf $$0) {
      cwf $$1 = this.a(buq.a);
      return $$1.f() || this.cx > 0 && $$0.b(ku.w) && !$$1.b(ku.w);
   }

   private void m(cwf $$0) {
      if (!$$0.f() && !this.dY().C) {
         ckz $$1 = new ckz(this.dY(), this.dD() + this.bV().d, this.dF() + 1.0, this.dJ() + this.bV().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awo.jp, 1.0F, 1.0F);
         this.dY().b($$1);
      }
   }

   private void n(cwf $$0) {
      ckz $$1 = new ckz(this.dY(), this.dD(), this.dF(), this.dJ(), $$0);
      this.dY().b($$1);
   }

   @Override
   protected void b(ckz $$0) {
      cwf $$1 = $$0.m();
      if (this.h($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.n($$1.a($$2 - 1));
         }

         this.m(this.a(buq.a));
         this.a($$0);
         this.a(buq.a, $$1.a(1));
         this.g(buq.a);
         this.a($$0, $$1.L());
         $$0.av();
         this.cx = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dl()) {
         boolean $$0 = this.bl();
         if ($$0 || this.m() != null || this.dY().ad()) {
            this.gK();
         }

         if ($$0 || this.fU()) {
            this.x(false);
         }

         if (this.gv() && this.dY().A.i() < 0.2F) {
            jh $$1 = this.dy();
            dvo $$2 = this.dY().a_($$1);
            this.dY().c(2001, $$1, dij.j($$2));
         }
      }

      this.cu = this.ct;
      if (this.gz()) {
         this.ct = this.ct + (1.0F - this.ct) * 0.4F;
      } else {
         this.ct = this.ct + (0.0F - this.ct) * 0.4F;
      }

      this.cw = this.cv;
      if (this.ck()) {
         this.cv += 0.2F;
         if (this.cv > 3.0F) {
            this.cv = 3.0F;
         }
      } else {
         this.cv = 0.0F;
      }
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.ad);
   }

   @Override
   protected void a(cor $$0, bvg $$1) {
      ((chf)$$1).b($$0.cI());
   }

   public boolean gw() {
      return this.t(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gx() {
      return this.bn;
   }

   public boolean gy() {
      return this.cv == 3.0F;
   }

   public void z(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean ck() {
      return this.t(4);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gz() {
      return this.t(8);
   }

   public float J(float $$0) {
      return azn.h($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return azn.h($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable bve $$0) {
      if (this.gJ() && $$0 == null) {
         this.C(false);
      }

      super.h($$0);
   }

   void gK() {
      this.D(false);
   }

   void gL() {
      this.A(false);
      this.z(false);
      this.x(false);
      this.D(false);
      this.C(false);
      this.B(false);
   }

   boolean gM() {
      return !this.fU() && !this.y() && !this.gv();
   }

   @Override
   public void U() {
      awn $$0 = this.w();
      if ($$0 == awo.jm) {
         this.a($$0, 2.0F, this.fk());
      } else {
         super.U();
      }
   }

   @Nullable
   @Override
   protected awn w() {
      if (this.fU()) {
         return awo.jn;
      } else {
         if (!this.dY().S() && this.af.i() < 0.1F) {
            List<cor> $$0 = this.dY().a(cor.class, this.cT().c(16.0, 16.0, 16.0), bun.f);
            if ($$0.isEmpty()) {
               return awo.jm;
            }
         }

         return awo.jh;
      }
   }

   @Nullable
   @Override
   protected awn d(bsy $$0) {
      return awo.jl;
   }

   @Nullable
   @Override
   protected awn o_() {
      return awo.jj;
   }

   boolean c(UUID $$0) {
      return this.gI().contains($$0);
   }

   @Override
   protected void a(arq $$0, bsy $$1) {
      cwf $$2 = this.a(buq.a);
      if (!$$2.f()) {
         this.b($$2);
         this.a(buq.a, cwf.k);
      }

      super.a($$0, $$1);
   }

   public static boolean a(chf $$0, bve $$1) {
      double $$2 = $$1.dJ() - $$0.dJ();
      double $$3 = $$1.dD() - $$0.dD();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dY().a_(jh.a($$0.dD() + $$8, $$0.dF() + (double)$$9, $$0.dJ() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ezr cV() {
      return new ezr(0.0, (double)(0.55F * this.cU()), (double)(this.dt() * 0.4F));
   }

   class a extends cdv<bve> {
      @Nullable
      private bve j;
      @Nullable
      private bve k;
      private int l;

      public a(final Class<bve> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<bve> $$3) {
         super(chf.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.eb().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : chf.this.gI()) {
               if ($$0 != null && chf.this.dY() instanceof arq && ((arq)chf.this.dY()).a($$0) instanceof bve $$2) {
                  this.k = $$2;
                  this.j = $$2.et();
                  int $$3 = $$2.eu();
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
            this.l = this.k.eu();
         }

         chf.this.a(awo.jg, 1.0F, 1.0F);
         chf.this.C(true);
         chf.this.gK();
         super.d();
      }
   }

   class b extends ccc {
      int a;

      public b() {
         this.a(EnumSet.of(ccc.a.b, ccc.a.c, ccc.a.a));
      }

      @Override
      public boolean b() {
         return chf.this.gv();
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
         chf.this.B(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements Predicate<bve> {
      public boolean a(bve $$0) {
         if ($$0 instanceof chf) {
            return false;
         } else if ($$0 instanceof cha || $$0 instanceof chp || $$0 instanceof clv) {
            return true;
         } else if ($$0 instanceof bwb) {
            return !((bwb)$$0).q();
         } else if (!($$0 instanceof cor) || !$$0.R_() && !((cor)$$0).f()) {
            return chf.this.c($$0.cI()) ? false : !$$0.fU() && !$$0.ci();
         } else {
            return false;
         }
      }
   }

   abstract class d extends ccc {
      private final cfv b = cfv.a().a(12.0).d().a(chf.this.new c());

      protected boolean h() {
         jh $$0 = jh.a(chf.this.dD(), chf.this.cT().e, chf.this.dJ());
         return !chf.this.dY().h($$0) && chf.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !chf.this.dY().a(bve.class, this.b, chf.this, chf.this.cT().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cbo {
      public e(final double $$0) {
         super(chf.this, $$0);
      }

      @Override
      public void d() {
         ((chf)this.a).gL();
         ((chf)this.c).gL();
         super.d();
      }

      @Override
      protected void g() {
         arq $$0 = (arq)this.b;
         chf $$1 = (chf)this.a.a($$0, (btz)this.c);
         if ($$1 != null) {
            arr $$2 = this.a.gE();
            arr $$3 = this.c.gE();
            arr $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cI());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cI());
            }

            if ($$4 != null) {
               $$4.a(awy.P);
               ao.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gG();
            this.c.gG();
            $$1.c_(-24000);
            $$1.b(this.a.dD(), this.a.dF(), this.a.dJ(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.ac().b(dfb.f)) {
               this.b.b(new buu(this.b, this.a.dD(), this.a.dF(), this.a.dJ(), this.a.eb().a(7) + 1));
            }
         }
      }
   }

   public class f extends ccp {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(chf.this, $$1, $$2, $$3);
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
      protected boolean a(dfi $$0, jh $$1) {
         dvo $$2 = $$0.a_($$1);
         return $$2.a(dil.oi) && $$2.c(dqm.c) >= 2 || djf.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && chf.this.af.i() < 0.05F) {
            chf.this.a(awo.jo, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (chf.this.dY().ac().b(dfb.c)) {
            dvo $$0 = chf.this.dY().a_(this.e);
            if ($$0.a(dil.oi)) {
               this.b($$0);
            } else if (djf.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dvo $$0) {
         djf.a(chf.this, $$0, chf.this.dY(), this.e);
      }

      private void b(dvo $$0) {
         int $$1 = $$0.c(dqm.c);
         $$0.b(dqm.c, Integer.valueOf(1));
         int $$2 = 1 + chf.this.dY().A.a(2) + ($$1 == 3 ? 1 : 0);
         cwf $$3 = chf.this.a(buq.a);
         if ($$3.f()) {
            chf.this.a(buq.a, new cwf(cwj.wN));
            $$2--;
         }

         if ($$2 > 0) {
            dij.a(chf.this.dY(), this.e, new cwf(cwj.wN, $$2));
         }

         chf.this.a(awo.zw, 1.0F, 1.0F);
         chf.this.dY().a(this.e, $$0.b(dqm.c, Integer.valueOf(1)), 2);
         chf.this.dY().a(eak.c, this.e, eak.a.a(chf.this));
      }

      @Override
      public boolean b() {
         return !chf.this.fU() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         chf.this.x(false);
         super.d();
      }
   }

   class g extends cbw {
      public g() {
         super(chf.this);
      }

      @Override
      public void d() {
         super.d();
         chf.this.gL();
      }

      @Override
      public boolean b() {
         return chf.this.bl() && chf.this.b(axj.a) > 0.25 || chf.this.bz();
      }
   }

   class h extends ccb {
      private final chf d;

      public h(final chf $$0, final double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gJ() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gJ() && super.c();
      }

      @Override
      public void d() {
         this.d.gL();
         super.d();
      }
   }

   public static class i extends btz.a {
      public final chf.v a;

      public i(chf.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cck {
      public j(final bvg $$0, final Class<? extends bve> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !chf.this.gv() && !chf.this.gz();
      }

      @Override
      public boolean c() {
         return super.c() && !chf.this.gv() && !chf.this.gz();
      }
   }

   public class k extends cbe {
      public k() {
         super(chf.this);
      }

      @Override
      public void a() {
         if (!chf.this.fU()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !chf.this.gw() && !chf.this.ck() && !chf.this.gz() && !chf.this.gv();
      }
   }

   class l extends ccm {
      public l(final double $$0, final boolean $$1) {
         super(chf.this, $$0, $$1);
      }

      @Override
      protected void a(bve $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.E($$0);
            chf.this.a(awo.ji, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         chf.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !chf.this.y() && !chf.this.fU() && !chf.this.ck() && !chf.this.gv() && super.b();
      }
   }

   class m extends cbf {
      public m() {
         super(chf.this);
      }

      @Override
      public void a() {
         if (chf.this.gM()) {
            super.a();
         }
      }
   }

   class n extends ccv {
      public n(final double $$0) {
         super(chf.this, $$0);
      }

      @Override
      public boolean h() {
         return !chf.this.gJ() && super.h();
      }
   }

   public class o extends ccg {
      @Override
      public boolean b() {
         if (!chf.this.gy()) {
            return false;
         } else {
            bve $$0 = chf.this.m();
            if ($$0 != null && $$0.bN()) {
               if ($$0.cR() != $$0.cQ()) {
                  return false;
               } else {
                  boolean $$1 = chf.a(chf.this, $$0);
                  if (!$$1) {
                     chf.this.P().a($$0, 0);
                     chf.this.z(false);
                     chf.this.A(false);
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
         bve $$0 = chf.this.m();
         if ($$0 != null && $$0.bN()) {
            double $$1 = chf.this.dB().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(chf.this.dQ()) < 15.0F) || !chf.this.aL()) && !chf.this.gv();
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
         chf.this.t(true);
         chf.this.y(true);
         chf.this.A(false);
         bve $$0 = chf.this.m();
         if ($$0 != null) {
            chf.this.K().a($$0, 60.0F, 30.0F);
            ezr $$1 = new ezr($$0.dD() - chf.this.dD(), $$0.dF() - chf.this.dF(), $$0.dJ() - chf.this.dJ()).d();
            chf.this.h(chf.this.dB().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         chf.this.P().o();
      }

      @Override
      public void e() {
         chf.this.z(false);
         chf.this.cv = 0.0F;
         chf.this.cw = 0.0F;
         chf.this.A(false);
         chf.this.y(false);
      }

      @Override
      public void a() {
         bve $$0 = chf.this.m();
         if ($$0 != null) {
            chf.this.K().a($$0, 60.0F, 30.0F);
         }

         if (!chf.this.gv()) {
            ezr $$1 = chf.this.dB();
            if ($$1.e * $$1.e < 0.03F && chf.this.dQ() != 0.0F) {
               chf.this.w(azn.i(0.2F, chf.this.dQ(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               chf.this.w((float)$$3);
            }
         }

         if ($$0 != null && chf.this.f($$0) <= 2.0F) {
            chf.this.E($$0);
         } else if (chf.this.dQ() > 0.0F && chf.this.aL() && (float)chf.this.dB().e != 0.0F && chf.this.dY().a_(chf.this.dy()).a(dil.dN)) {
            chf.this.w(60.0F);
            chf.this.h(null);
            chf.this.B(true);
         }
      }
   }

   class p extends ccc {
      public p() {
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean b() {
         if (!chf.this.a(buq.a).f()) {
            return false;
         } else if (chf.this.m() != null || chf.this.et() != null) {
            return false;
         } else if (!chf.this.gM()) {
            return false;
         } else if (chf.this.eb().a(b(10)) != 0) {
            return false;
         } else {
            List<ckz> $$0 = chf.this.dY().a(ckz.class, chf.this.cT().c(8.0, 8.0, 8.0), chf.ck);
            return !$$0.isEmpty() && chf.this.a(buq.a).f();
         }
      }

      @Override
      public void a() {
         List<ckz> $$0 = chf.this.dY().a(ckz.class, chf.this.cT().c(8.0, 8.0, 8.0), chf.ck);
         cwf $$1 = chf.this.a(buq.a);
         if ($$1.f() && !$$0.isEmpty()) {
            chf.this.P().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<ckz> $$0 = chf.this.dY().a(ckz.class, chf.this.cT().c(8.0, 8.0, 8.0), chf.ck);
         if (!$$0.isEmpty()) {
            chf.this.P().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cdi {
      public q(final int $$0, final int $$1) {
         super(chf.this, $$1);
      }

      @Override
      public void d() {
         chf.this.gL();
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
         return !chf.this.fU() && !chf.this.y() && !chf.this.gJ() && chf.this.m() == null;
      }
   }

   class r extends chf.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(ccc.a.a, ccc.a.b));
      }

      @Override
      public boolean b() {
         return chf.this.et() == null
            && chf.this.eb().i() < 0.02F
            && !chf.this.fU()
            && chf.this.m() == null
            && chf.this.P().m()
            && !this.i()
            && !chf.this.gw()
            && !chf.this.ck();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + chf.this.eb().a(3);
         chf.this.x(true);
         chf.this.P().o();
      }

      @Override
      public void e() {
         chf.this.x(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         chf.this.K().a(chf.this.dD() + this.c, chf.this.dH(), chf.this.dJ() + this.d, (float)chf.this.ae(), (float)chf.this.ad());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * chf.this.eb().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + chf.this.eb().a(20));
      }
   }

   class s extends cbv {
      private int c = b(100);

      public s(final double $$0) {
         super(chf.this, $$0);
      }

      @Override
      public boolean b() {
         if (!chf.this.fU() && this.a.m() == null) {
            if (chf.this.dY().ad() && chf.this.dY().h(this.a.dy())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               jh $$0 = this.a.dy();
               return chf.this.dY().S() && chf.this.dY().h($$0) && !((arq)chf.this.dY()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         chf.this.gL();
         super.d();
      }
   }

   class t extends chf.d {
      private static final int c = b(140);
      private int d = chf.this.af.a(c);

      public t() {
         this.a(EnumSet.of(ccc.a.a, ccc.a.b, ccc.a.c));
      }

      @Override
      public boolean b() {
         return chf.this.bo == 0.0F && chf.this.bp == 0.0F && chf.this.bq == 0.0F ? this.k() || chf.this.fU() : false;
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
            return chf.this.dY().S() && this.h() && !this.i() && !chf.this.aw;
         }
      }

      @Override
      public void e() {
         this.d = chf.this.af.a(c);
         chf.this.gL();
      }

      @Override
      public void d() {
         chf.this.x(false);
         chf.this.z(false);
         chf.this.A(false);
         chf.this.t(false);
         chf.this.D(true);
         chf.this.P().o();
         chf.this.M().a(chf.this.dD(), chf.this.dF(), chf.this.dJ(), 0.0);
      }
   }

   class u extends ccc {
      public u() {
         this.a(EnumSet.of(ccc.a.a, ccc.a.b));
      }

      @Override
      public boolean b() {
         if (chf.this.fU()) {
            return false;
         } else {
            bve $$0 = chf.this.m();
            return $$0 != null && $$0.bN() && chf.cm.test($$0) && chf.this.g((bui)$$0) > 36.0 && !chf.this.ck() && !chf.this.gz() && !chf.this.bn;
         }
      }

      @Override
      public void d() {
         chf.this.x(false);
         chf.this.B(false);
      }

      @Override
      public void e() {
         bve $$0 = chf.this.m();
         if ($$0 != null && chf.a(chf.this, $$0)) {
            chf.this.A(true);
            chf.this.z(true);
            chf.this.P().o();
            chf.this.K().a($$0, (float)chf.this.ae(), (float)chf.this.ad());
         } else {
            chf.this.A(false);
            chf.this.z(false);
         }
      }

      @Override
      public void a() {
         bve $$0 = chf.this.m();
         if ($$0 != null) {
            chf.this.K().a($$0, (float)chf.this.ae(), (float)chf.this.ad());
            if (chf.this.g((bui)$$0) <= 36.0) {
               chf.this.A(true);
               chf.this.z(true);
               chf.this.P().o();
            } else {
               chf.this.P().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements baj {
      a(0, "red"),
      b(1, "snow");

      public static final baj.a<chf.v> c = baj.a(chf.v::values);
      private static final IntFunction<chf.v> d = aye.a(chf.v::a, values(), aye.a.a);
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

      public static chf.v a(String $$0) {
         return c.a($$0, a);
      }

      public static chf.v a(int $$0) {
         return d.apply($$0);
      }

      public static chf.v a(jq<dgh> $$0) {
         return $$0.a(axc.ar) ? b : a;
      }
   }
}
