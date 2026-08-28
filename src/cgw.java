import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgw extends cgm implements bvv<cgw.v> {
   private static final akk<Integer> cc = ako.a(cgw.class, akm.b);
   private static final akk<Byte> cd = ako.a(cgw.class, akm.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int ca = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final akk<Optional<UUID>> ci = ako.a(cgw.class, akm.r);
   private static final akk<Optional<UUID>> cj = ako.a(cgw.class, akm.r);
   static final Predicate<ckq> ck = $$0 -> !$$0.w() && $$0.bM();
   private static final Predicate<btz> cl = $$0 -> !($$0 instanceof buv $$1) ? false : $$1.eu() != null && $$1.ev() < $$1.ag + 600;
   static final Predicate<btz> cm = $$0 -> $$0 instanceof cgr || $$0 instanceof chg;
   private static final Predicate<btz> cn = $$0 -> !$$0.ch() && bue.e.test($$0);
   private static final int co = 600;
   private static final buc cp = bug.Q.n().a(0.5F).b(0.2975F);
   private cbt cq;
   private cbt cr;
   private cbt cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public cgw(bug<? extends cgw> $$0, dev $$1) {
      super($$0, $$1);
      this.bO = new cgw.k();
      this.bP = new cgw.m();
      this.a(erv.p, 0.0F);
      this.a(erv.q, 0.0F);
      this.a_(true);
      this.P().a(32.0F);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void D() {
      this.cq = new cdm<>(this, cgm.class, 10, false, false, $$0 -> $$0 instanceof cgr || $$0 instanceof chg);
      this.cr = new cdm<>(this, chn.class, 10, false, false, chn.bY);
      this.cs = new cdm<>(this, cgi.class, 20, false, false, $$0 -> $$0 instanceof cgk);
      this.bS.a(0, new cgw.g());
      this.bS.a(0, new cbi(this, this.dX()));
      this.bS.a(1, new cgw.b());
      this.bS.a(2, new cgw.n(2.2));
      this.bS.a(3, new cgw.e(1.0));
      this.bS.a(4, new cba<>(this, coh.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cH()) && !this.gJ()));
      this.bS.a(4, new cba<>(this, chp.class, 8.0F, 1.6, 1.4, $$0 -> !((chp)$$0).q() && !this.gJ()));
      this.bS.a(4, new cba<>(this, che.class, 8.0F, 1.6, 1.4, $$0 -> !this.gJ()));
      this.bS.a(5, new cgw.u());
      this.bS.a(6, new cgw.o());
      this.bS.a(6, new cgw.s(1.25));
      this.bS.a(7, new cgw.l(1.2F, true));
      this.bS.a(7, new cgw.t());
      this.bS.a(8, new cgw.h(this, 1.25));
      this.bS.a(9, new cgw.q(32, 200));
      this.bS.a(10, new cgw.f(1.2F, 12, 1));
      this.bS.a(10, new cbz(this, 0.4F));
      this.bS.a(11, new cdg(this, 1.0));
      this.bS.a(11, new cgw.p());
      this.bS.a(12, new cgw.j(this, coh.class, 24.0F));
      this.bS.a(13, new cgw.r());
      this.bT.a(3, new cgw.a(buv.class, false, false, $$0 -> cl.test($$0) && !this.c($$0.cH())));
   }

   @Override
   public void n_() {
      if (!this.dX().C && this.bM() && this.dk()) {
         this.cx++;
         cvx $$0 = this.a(buh.a);
         if (this.k($$0)) {
            if (this.cx > 600) {
               cvx $$1 = $$0.a(this.dX(), this);
               if (!$$1.f()) {
                  this.a(buh.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.af.i() < 0.1F) {
               this.gB();
               this.dX().a(this, (byte)45);
            }
         }

         buv $$2 = this.m();
         if ($$2 == null || !$$2.bM()) {
            this.z(false);
            this.A(false);
         }
      }

      if (this.fT() || this.fk()) {
         this.bk = false;
         this.bl = 0.0F;
         this.bn = 0.0F;
      }

      super.n_();
      if (this.gJ() && this.af.i() < 0.05F) {
         this.a(awk.jg, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fk() {
      return this.eH();
   }

   private boolean k(cvx $$0) {
      return $$0.b(kt.w) && this.m() == null && this.aJ() && !this.fT();
   }

   @Override
   protected void a(azr $$0, brw $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cvx $$3;
         if ($$2 < 0.05F) {
            $$3 = new cvx(cwb.oB);
         } else if ($$2 < 0.2F) {
            $$3 = new cvx(cwb.qS);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cvx(cwb.uF) : new cvx(cwb.uG);
         } else if ($$2 < 0.6F) {
            $$3 = new cvx(cwb.px);
         } else if ($$2 < 0.8F) {
            $$3 = new cvx(cwb.qE);
         } else {
            $$3 = new cvx(cwb.pu);
         }

         this.a(buh.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cvx $$1 = this.a(buh.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ezh $$3 = new ezh(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dP() * (float) (Math.PI / 180.0))
                  .b(-this.dN() * (float) (Math.PI / 180.0));
               this.dX().a(new lm(lq.S, $$1), this.dC() + this.bU().d / 2.0, this.dE(), this.dI() + this.bU().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bwc.a q() {
      return cgm.gA().a(bwd.v, 0.3F).a(bwd.s, 10.0).a(bwd.c, 2.0).a(bwd.x, 5.0).a(bwd.m, 32.0);
   }

   @Nullable
   public cgw b(arm $$0, btq $$1) {
      cgw $$2 = bug.Q.a($$0, buf.e);
      if ($$2 != null) {
         $$2.a(this.af.h() ? this.t() : ((cgw)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bug<cgw> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return $$1.a_($$3.e()).a(awz.cf) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      jp<dfw> $$4 = $$0.t(this.dx());
      cgw.v $$5 = cgw.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cgw.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cgw.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof arm) {
         this.gH();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gH() {
      if (this.t() == cgw.v.a) {
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
      this.a(awk.jk, 1.0F, 1.0F);
   }

   @Override
   public buc e(bvh $$0) {
      return this.p_() ? cp : super.e($$0);
   }

   public cgw.v t() {
      return cgw.v.a(this.am.a(cc));
   }

   public void a(cgw.v $$0) {
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
   public void b(uj $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gI();
      up $$2 = new up();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(uy.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fT());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.cj());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);

      for (vg $$2 : $$0.c("Trusted", 11)) {
         this.b(uy.a($$2));
      }

      this.D($$0.q("Sleeping"));
      this.a(cgw.v.a($$0.l("Type")));
      this.x($$0.q("Sitting"));
      this.z($$0.q("Crouching"));
      if (this.dX() instanceof arm) {
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
   protected boolean f(buh $$0) {
      return $$0 == buh.a && this.fP();
   }

   @Override
   public boolean h(cvx $$0) {
      cvx $$1 = this.a(buh.a);
      return $$1.f() || this.cx > 0 && $$0.b(kt.w) && !$$1.b(kt.w);
   }

   private void m(cvx $$0) {
      if (!$$0.f() && !this.dX().C) {
         ckq $$1 = new ckq(this.dX(), this.dC() + this.bU().d, this.dE() + 1.0, this.dI() + this.bU().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awk.jp, 1.0F, 1.0F);
         this.dX().b($$1);
      }
   }

   private void n(cvx $$0) {
      ckq $$1 = new ckq(this.dX(), this.dC(), this.dE(), this.dI(), $$0);
      this.dX().b($$1);
   }

   @Override
   protected void b(ckq $$0) {
      cvx $$1 = $$0.m();
      if (this.h($$1)) {
         int $$2 = $$1.L();
         if ($$2 > 1) {
            this.n($$1.a($$2 - 1));
         }

         this.m(this.a(buh.a));
         this.a($$0);
         this.a(buh.a, $$1.a(1));
         this.g(buh.a);
         this.a($$0, $$1.L());
         $$0.au();
         this.cx = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dk()) {
         boolean $$0 = this.bk();
         if ($$0 || this.m() != null || this.dX().ad()) {
            this.gK();
         }

         if ($$0 || this.fT()) {
            this.x(false);
         }

         if (this.gv() && this.dX().A.i() < 0.2F) {
            jg $$1 = this.dx();
            dvd $$2 = this.dX().a_($$1);
            this.dX().c(2001, $$1, dhy.j($$2));
         }
      }

      this.cu = this.ct;
      if (this.gz()) {
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
   public boolean l(cvx $$0) {
      return $$0.a(axi.aa);
   }

   @Override
   protected void a(coh $$0, bux $$1) {
      ((cgw)$$1).b($$0.cH());
   }

   public boolean gw() {
      return this.t(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gx() {
      return this.bk;
   }

   public boolean gy() {
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

   public boolean gz() {
      return this.t(8);
   }

   public float J(float $$0) {
      return azj.h($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return azj.h($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable buv $$0) {
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
      return !this.fT() && !this.y() && !this.gv();
   }

   @Override
   public void U() {
      awj $$0 = this.w();
      if ($$0 == awk.jm) {
         this.a($$0, 2.0F, this.fj());
      } else {
         super.U();
      }
   }

   @Nullable
   @Override
   protected awj w() {
      if (this.fT()) {
         return awk.jn;
      } else {
         if (!this.dX().S() && this.af.i() < 0.1F) {
            List<coh> $$0 = this.dX().a(coh.class, this.cS().c(16.0, 16.0, 16.0), bue.f);
            if ($$0.isEmpty()) {
               return awk.jm;
            }
         }

         return awk.jh;
      }
   }

   @Nullable
   @Override
   protected awj d(bsp $$0) {
      return awk.jl;
   }

   @Nullable
   @Override
   protected awj o_() {
      return awk.jj;
   }

   boolean c(UUID $$0) {
      return this.gI().contains($$0);
   }

   @Override
   protected void a(arm $$0, bsp $$1) {
      cvx $$2 = this.a(buh.a);
      if (!$$2.f()) {
         this.b($$2);
         this.a(buh.a, cvx.k);
      }

      super.a($$0, $$1);
   }

   public static boolean a(cgw $$0, buv $$1) {
      double $$2 = $$1.dI() - $$0.dI();
      double $$3 = $$1.dC() - $$0.dC();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dX().a_(jg.a($$0.dC() + $$8, $$0.dE() + (double)$$9, $$0.dI() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ezh cU() {
      return new ezh(0.0, (double)(0.55F * this.cT()), (double)(this.ds() * 0.4F));
   }

   class a extends cdm<buv> {
      @Nullable
      private buv j;
      @Nullable
      private buv k;
      private int l;

      public a(final Class<buv> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<buv> $$3) {
         super(cgw.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.ea().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cgw.this.gI()) {
               if ($$0 != null && cgw.this.dX() instanceof arm && ((arm)cgw.this.dX()).a($$0) instanceof buv $$2) {
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

         cgw.this.a(awk.jg, 1.0F, 1.0F);
         cgw.this.C(true);
         cgw.this.gK();
         super.d();
      }
   }

   class b extends cbt {
      int a;

      public b() {
         this.a(EnumSet.of(cbt.a.b, cbt.a.c, cbt.a.a));
      }

      @Override
      public boolean b() {
         return cgw.this.gv();
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
         cgw.this.B(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements Predicate<buv> {
      public boolean a(buv $$0) {
         if ($$0 instanceof cgw) {
            return false;
         } else if ($$0 instanceof cgr || $$0 instanceof chg || $$0 instanceof clm) {
            return true;
         } else if ($$0 instanceof bvs) {
            return !((bvs)$$0).q();
         } else if (!($$0 instanceof coh) || !$$0.R_() && !((coh)$$0).f()) {
            return cgw.this.c($$0.cH()) ? false : !$$0.fT() && !$$0.ch();
         } else {
            return false;
         }
      }
   }

   abstract class d extends cbt {
      private final cfm b = cfm.a().a(12.0).d().a(cgw.this.new c());

      protected boolean h() {
         jg $$0 = jg.a(cgw.this.dC(), cgw.this.cS().e, cgw.this.dI());
         return !cgw.this.dX().h($$0) && cgw.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cgw.this.dX().a(buv.class, this.b, cgw.this, cgw.this.cS().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cbf {
      public e(final double $$0) {
         super(cgw.this, $$0);
      }

      @Override
      public void d() {
         ((cgw)this.a).gL();
         ((cgw)this.c).gL();
         super.d();
      }

      @Override
      protected void g() {
         arm $$0 = (arm)this.b;
         cgw $$1 = (cgw)this.a.a($$0, (btq)this.c);
         if ($$1 != null) {
            arn $$2 = this.a.gE();
            arn $$3 = this.c.gE();
            arn $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cH());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cH());
            }

            if ($$4 != null) {
               $$4.a(awu.P);
               an.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gG();
            this.c.gG();
            $$1.c_(-24000);
            $$1.b(this.a.dC(), this.a.dE(), this.a.dI(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.ac().b(der.f)) {
               this.b.b(new bul(this.b, this.a.dC(), this.a.dE(), this.a.dI(), this.a.ea().a(7) + 1));
            }
         }
      }
   }

   public class f extends ccg {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cgw.this, $$1, $$2, $$3);
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
      protected boolean a(dey $$0, jg $$1) {
         dvd $$2 = $$0.a_($$1);
         return $$2.a(dia.oi) && $$2.c(dqb.c) >= 2 || diu.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cgw.this.af.i() < 0.05F) {
            cgw.this.a(awk.jo, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (cgw.this.dX().ac().b(der.c)) {
            dvd $$0 = cgw.this.dX().a_(this.e);
            if ($$0.a(dia.oi)) {
               this.b($$0);
            } else if (diu.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dvd $$0) {
         diu.a(cgw.this, $$0, cgw.this.dX(), this.e);
      }

      private void b(dvd $$0) {
         int $$1 = $$0.c(dqb.c);
         $$0.b(dqb.c, Integer.valueOf(1));
         int $$2 = 1 + cgw.this.dX().A.a(2) + ($$1 == 3 ? 1 : 0);
         cvx $$3 = cgw.this.a(buh.a);
         if ($$3.f()) {
            cgw.this.a(buh.a, new cvx(cwb.wx));
            $$2--;
         }

         if ($$2 > 0) {
            dhy.a(cgw.this.dX(), this.e, new cvx(cwb.wx, $$2));
         }

         cgw.this.a(awk.zw, 1.0F, 1.0F);
         cgw.this.dX().a(this.e, $$0.b(dqb.c, Integer.valueOf(1)), 2);
         cgw.this.dX().a(eaa.c, this.e, eaa.a.a(cgw.this));
      }

      @Override
      public boolean b() {
         return !cgw.this.fT() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         cgw.this.x(false);
         super.d();
      }
   }

   class g extends cbn {
      public g() {
         super(cgw.this);
      }

      @Override
      public void d() {
         super.d();
         cgw.this.gL();
      }

      @Override
      public boolean b() {
         return cgw.this.bk() && cgw.this.b(axf.a) > 0.25 || cgw.this.by();
      }
   }

   class h extends cbs {
      private final cgw d;

      public h(final cgw $$0, final double $$1) {
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

   public static class i extends btq.a {
      public final cgw.v a;

      public i(cgw.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends ccb {
      public j(final bux $$0, final Class<? extends buv> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !cgw.this.gv() && !cgw.this.gz();
      }

      @Override
      public boolean c() {
         return super.c() && !cgw.this.gv() && !cgw.this.gz();
      }
   }

   public class k extends cav {
      public k() {
         super(cgw.this);
      }

      @Override
      public void a() {
         if (!cgw.this.fT()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cgw.this.gw() && !cgw.this.cj() && !cgw.this.gz() && !cgw.this.gv();
      }
   }

   class l extends ccd {
      public l(final double $$0, final boolean $$1) {
         super(cgw.this, $$0, $$1);
      }

      @Override
      protected void a(buv $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.E($$0);
            cgw.this.a(awk.ji, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         cgw.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !cgw.this.y() && !cgw.this.fT() && !cgw.this.cj() && !cgw.this.gv() && super.b();
      }
   }

   class m extends caw {
      public m() {
         super(cgw.this);
      }

      @Override
      public void a() {
         if (cgw.this.gM()) {
            super.a();
         }
      }
   }

   class n extends ccm {
      public n(final double $$0) {
         super(cgw.this, $$0);
      }

      @Override
      public boolean h() {
         return !cgw.this.gJ() && super.h();
      }
   }

   public class o extends cbx {
      @Override
      public boolean b() {
         if (!cgw.this.gy()) {
            return false;
         } else {
            buv $$0 = cgw.this.m();
            if ($$0 != null && $$0.bM()) {
               if ($$0.cQ() != $$0.cP()) {
                  return false;
               } else {
                  boolean $$1 = cgw.a(cgw.this, $$0);
                  if (!$$1) {
                     cgw.this.P().a($$0, 0);
                     cgw.this.z(false);
                     cgw.this.A(false);
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
         buv $$0 = cgw.this.m();
         if ($$0 != null && $$0.bM()) {
            double $$1 = cgw.this.dA().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cgw.this.dP()) < 15.0F) || !cgw.this.aJ()) && !cgw.this.gv();
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
         cgw.this.t(true);
         cgw.this.y(true);
         cgw.this.A(false);
         buv $$0 = cgw.this.m();
         if ($$0 != null) {
            cgw.this.K().a($$0, 60.0F, 30.0F);
            ezh $$1 = new ezh($$0.dC() - cgw.this.dC(), $$0.dE() - cgw.this.dE(), $$0.dI() - cgw.this.dI()).d();
            cgw.this.h(cgw.this.dA().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         cgw.this.P().o();
      }

      @Override
      public void e() {
         cgw.this.z(false);
         cgw.this.cv = 0.0F;
         cgw.this.cw = 0.0F;
         cgw.this.A(false);
         cgw.this.y(false);
      }

      @Override
      public void a() {
         buv $$0 = cgw.this.m();
         if ($$0 != null) {
            cgw.this.K().a($$0, 60.0F, 30.0F);
         }

         if (!cgw.this.gv()) {
            ezh $$1 = cgw.this.dA();
            if ($$1.e * $$1.e < 0.03F && cgw.this.dP() != 0.0F) {
               cgw.this.w(azj.i(0.2F, cgw.this.dP(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               cgw.this.w((float)$$3);
            }
         }

         if ($$0 != null && cgw.this.f($$0) <= 2.0F) {
            cgw.this.E($$0);
         } else if (cgw.this.dP() > 0.0F && cgw.this.aJ() && (float)cgw.this.dA().e != 0.0F && cgw.this.dX().a_(cgw.this.dx()).a(dia.dN)) {
            cgw.this.w(60.0F);
            cgw.this.h(null);
            cgw.this.B(true);
         }
      }
   }

   class p extends cbt {
      public p() {
         this.a(EnumSet.of(cbt.a.a));
      }

      @Override
      public boolean b() {
         if (!cgw.this.a(buh.a).f()) {
            return false;
         } else if (cgw.this.m() != null || cgw.this.es() != null) {
            return false;
         } else if (!cgw.this.gM()) {
            return false;
         } else if (cgw.this.ea().a(b(10)) != 0) {
            return false;
         } else {
            List<ckq> $$0 = cgw.this.dX().a(ckq.class, cgw.this.cS().c(8.0, 8.0, 8.0), cgw.ck);
            return !$$0.isEmpty() && cgw.this.a(buh.a).f();
         }
      }

      @Override
      public void a() {
         List<ckq> $$0 = cgw.this.dX().a(ckq.class, cgw.this.cS().c(8.0, 8.0, 8.0), cgw.ck);
         cvx $$1 = cgw.this.a(buh.a);
         if ($$1.f() && !$$0.isEmpty()) {
            cgw.this.P().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<ckq> $$0 = cgw.this.dX().a(ckq.class, cgw.this.cS().c(8.0, 8.0, 8.0), cgw.ck);
         if (!$$0.isEmpty()) {
            cgw.this.P().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends ccz {
      public q(final int $$0, final int $$1) {
         super(cgw.this, $$1);
      }

      @Override
      public void d() {
         cgw.this.gL();
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
         return !cgw.this.fT() && !cgw.this.y() && !cgw.this.gJ() && cgw.this.m() == null;
      }
   }

   class r extends cgw.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cbt.a.a, cbt.a.b));
      }

      @Override
      public boolean b() {
         return cgw.this.es() == null
            && cgw.this.ea().i() < 0.02F
            && !cgw.this.fT()
            && cgw.this.m() == null
            && cgw.this.P().m()
            && !this.i()
            && !cgw.this.gw()
            && !cgw.this.cj();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + cgw.this.ea().a(3);
         cgw.this.x(true);
         cgw.this.P().o();
      }

      @Override
      public void e() {
         cgw.this.x(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cgw.this.K().a(cgw.this.dC() + this.c, cgw.this.dG(), cgw.this.dI() + this.d, (float)cgw.this.ae(), (float)cgw.this.ad());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cgw.this.ea().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cgw.this.ea().a(20));
      }
   }

   class s extends cbm {
      private int c = b(100);

      public s(final double $$0) {
         super(cgw.this, $$0);
      }

      @Override
      public boolean b() {
         if (!cgw.this.fT() && this.a.m() == null) {
            if (cgw.this.dX().ad() && cgw.this.dX().h(this.a.dx())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               jg $$0 = this.a.dx();
               return cgw.this.dX().S() && cgw.this.dX().h($$0) && !((arm)cgw.this.dX()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         cgw.this.gL();
         super.d();
      }
   }

   class t extends cgw.d {
      private static final int c = b(140);
      private int d = cgw.this.af.a(c);

      public t() {
         this.a(EnumSet.of(cbt.a.a, cbt.a.b, cbt.a.c));
      }

      @Override
      public boolean b() {
         return cgw.this.bl == 0.0F && cgw.this.bm == 0.0F && cgw.this.bn == 0.0F ? this.k() || cgw.this.fT() : false;
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
            return cgw.this.dX().S() && this.h() && !this.i() && !cgw.this.aw;
         }
      }

      @Override
      public void e() {
         this.d = cgw.this.af.a(c);
         cgw.this.gL();
      }

      @Override
      public void d() {
         cgw.this.x(false);
         cgw.this.z(false);
         cgw.this.A(false);
         cgw.this.t(false);
         cgw.this.D(true);
         cgw.this.P().o();
         cgw.this.M().a(cgw.this.dC(), cgw.this.dE(), cgw.this.dI(), 0.0);
      }
   }

   class u extends cbt {
      public u() {
         this.a(EnumSet.of(cbt.a.a, cbt.a.b));
      }

      @Override
      public boolean b() {
         if (cgw.this.fT()) {
            return false;
         } else {
            buv $$0 = cgw.this.m();
            return $$0 != null && $$0.bM() && cgw.cm.test($$0) && cgw.this.g((btz)$$0) > 36.0 && !cgw.this.cj() && !cgw.this.gz() && !cgw.this.bk;
         }
      }

      @Override
      public void d() {
         cgw.this.x(false);
         cgw.this.B(false);
      }

      @Override
      public void e() {
         buv $$0 = cgw.this.m();
         if ($$0 != null && cgw.a(cgw.this, $$0)) {
            cgw.this.A(true);
            cgw.this.z(true);
            cgw.this.P().o();
            cgw.this.K().a($$0, (float)cgw.this.ae(), (float)cgw.this.ad());
         } else {
            cgw.this.A(false);
            cgw.this.z(false);
         }
      }

      @Override
      public void a() {
         buv $$0 = cgw.this.m();
         if ($$0 != null) {
            cgw.this.K().a($$0, (float)cgw.this.ae(), (float)cgw.this.ad());
            if (cgw.this.g((btz)$$0) <= 36.0) {
               cgw.this.A(true);
               cgw.this.z(true);
               cgw.this.P().o();
            } else {
               cgw.this.P().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements baf {
      a(0, "red"),
      b(1, "snow");

      public static final baf.a<cgw.v> c = baf.a(cgw.v::values);
      private static final IntFunction<cgw.v> d = aya.a(cgw.v::a, values(), aya.a.a);
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

      public static cgw.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cgw.v a(int $$0) {
         return d.apply($$0);
      }

      public static cgw.v a(jp<dfw> $$0) {
         return $$0.a(awy.ar) ? b : a;
      }
   }
}
