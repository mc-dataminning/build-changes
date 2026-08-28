import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgn extends cgd implements bvm<cgn.v> {
   private static final akh<Integer> cc = akl.a(cgn.class, akj.b);
   private static final akh<Byte> cd = akl.a(cgn.class, akj.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int ca = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final akh<Optional<UUID>> ci = akl.a(cgn.class, akj.r);
   private static final akh<Optional<UUID>> cj = akl.a(cgn.class, akj.r);
   static final Predicate<ckh> ck = $$0 -> !$$0.w() && $$0.bI();
   private static final Predicate<btr> cl = $$0 -> !($$0 instanceof bun $$1) ? false : $$1.ep() != null && $$1.eq() < $$1.ag + 600;
   static final Predicate<btr> cm = $$0 -> $$0 instanceof cgi || $$0 instanceof cgx;
   private static final Predicate<btr> cn = $$0 -> !$$0.cd() && btw.e.test($$0);
   private static final int co = 600;
   private static final btu cp = bty.Q.n().a(0.5F).b(0.2975F);
   private cbk cq;
   private cbk cr;
   private cbk cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public cgn(bty<? extends cgn> $$0, dej $$1) {
      super($$0, $$1);
      this.bO = new cgn.k();
      this.bP = new cgn.m();
      this.a(erk.p, 0.0F);
      this.a(erk.q, 0.0F);
      this.a_(true);
      this.P().a(32.0F);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void D() {
      this.cq = new cdd<>(this, cgd.class, 10, false, false, $$0 -> $$0 instanceof cgi || $$0 instanceof cgx);
      this.cr = new cdd<>(this, che.class, 10, false, false, che.bY);
      this.cs = new cdd<>(this, cfz.class, 20, false, false, $$0 -> $$0 instanceof cgb);
      this.bS.a(0, new cgn.g());
      this.bS.a(0, new caz(this, this.dS()));
      this.bS.a(1, new cgn.b());
      this.bS.a(2, new cgn.n(2.2));
      this.bS.a(3, new cgn.e(1.0));
      this.bS.a(4, new car<>(this, cnx.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cD()) && !this.gC()));
      this.bS.a(4, new car<>(this, chg.class, 8.0F, 1.6, 1.4, $$0 -> !((chg)$$0).q() && !this.gC()));
      this.bS.a(4, new car<>(this, cgv.class, 8.0F, 1.6, 1.4, $$0 -> !this.gC()));
      this.bS.a(5, new cgn.u());
      this.bS.a(6, new cgn.o());
      this.bS.a(6, new cgn.s(1.25));
      this.bS.a(7, new cgn.l(1.2F, true));
      this.bS.a(7, new cgn.t());
      this.bS.a(8, new cgn.h(this, 1.25));
      this.bS.a(9, new cgn.q(32, 200));
      this.bS.a(10, new cgn.f(1.2F, 12, 1));
      this.bS.a(10, new cbq(this, 0.4F));
      this.bS.a(11, new ccx(this, 1.0));
      this.bS.a(11, new cgn.p());
      this.bS.a(12, new cgn.j(this, cnx.class, 24.0F));
      this.bS.a(13, new cgn.r());
      this.bT.a(3, new cgn.a(bun.class, false, false, $$0 -> cl.test($$0) && !this.c($$0.cD())));
   }

   @Override
   public void n_() {
      if (!this.dS().B && this.bI() && this.df()) {
         this.cx++;
         cvs $$0 = this.a(btz.a);
         if (this.m($$0)) {
            if (this.cx > 600) {
               cvs $$1 = $$0.a(this.dS(), this);
               if (!$$1.f()) {
                  this.a(btz.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.af.i() < 0.1F) {
               this.gu();
               this.dS().a(this, (byte)45);
            }
         }

         bun $$2 = this.m();
         if ($$2 == null || !$$2.bI()) {
            this.z(false);
            this.A(false);
         }
      }

      if (this.fN() || this.ff()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      }

      super.n_();
      if (this.gC() && this.af.i() < 0.05F) {
         this.a(awg.jg, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean ff() {
      return this.eC();
   }

   private boolean m(cvs $$0) {
      return $$0.b(ks.v) && this.m() == null && this.aH() && !this.fN();
   }

   @Override
   protected void a(azn $$0, brq $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cvs $$3;
         if ($$2 < 0.05F) {
            $$3 = new cvs(cvw.oB);
         } else if ($$2 < 0.2F) {
            $$3 = new cvs(cvw.qS);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cvs(cvw.uF) : new cvs(cvw.uG);
         } else if ($$2 < 0.6F) {
            $$3 = new cvs(cvw.px);
         } else if ($$2 < 0.8F) {
            $$3 = new cvs(cvw.qE);
         } else {
            $$3 = new cvs(cvw.pu);
         }

         this.a(btz.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cvs $$1 = this.a(btz.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               eyw $$3 = new eyw(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dK() * (float) (Math.PI / 180.0))
                  .b(-this.dI() * (float) (Math.PI / 180.0));
               this.dS().a(new lk(lo.S, $$1), this.dx() + this.bQ().d / 2.0, this.dz(), this.dD() + this.bQ().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bvt.a q() {
      return cgd.gt().a(bvu.v, 0.3F).a(bvu.s, 10.0).a(bvu.c, 2.0).a(bvu.x, 5.0).a(bvu.m, 32.0);
   }

   @Nullable
   public cgn b(arj $$0, btk $$1) {
      cgn $$2 = bty.Q.a($$0, btx.e);
      if ($$2 != null) {
         $$2.a(this.af.h() ? this.t() : ((cgn)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bty<cgn> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return $$1.a_($$3.e()).a(awv.cf) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      jo<dfk> $$4 = $$0.t(this.ds());
      cgn.v $$5 = cgn.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cgn.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cgn.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof arj) {
         this.gA();
      }

      this.a($$0.D_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gA() {
      if (this.t() == cgn.v.a) {
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
   protected void gu() {
      this.a(awg.jk, 1.0F, 1.0F);
   }

   @Override
   public btu e(buz $$0) {
      return this.p_() ? cp : super.e($$0);
   }

   public cgn.v t() {
      return cgn.v.a(this.am.a(cc));
   }

   public void a(cgn.v $$0) {
      this.am.a(cc, $$0.a());
   }

   List<UUID> gB() {
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
   public void b(ug $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gB();
      um $$2 = new um();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(uv.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fN());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.cf());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);

      for (vd $$2 : $$0.c("Trusted", 11)) {
         this.b(uv.a($$2));
      }

      this.D($$0.q("Sleeping"));
      this.a(cgn.v.a($$0.l("Type")));
      this.x($$0.q("Sitting"));
      this.z($$0.q("Crouching"));
      if (this.dS() instanceof arj) {
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
   public boolean fN() {
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
   public boolean e(cvs $$0) {
      btz $$1 = this.g($$0);
      return !this.a($$1).f() ? false : $$1 == btz.a && super.e($$0);
   }

   @Override
   public boolean i(cvs $$0) {
      cvs $$1 = this.a(btz.a);
      return $$1.f() || this.cx > 0 && $$0.b(ks.v) && !$$1.b(ks.v);
   }

   private void o(cvs $$0) {
      if (!$$0.f() && !this.dS().B) {
         ckh $$1 = new ckh(this.dS(), this.dx() + this.bQ().d, this.dz() + 1.0, this.dD() + this.bQ().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(awg.jp, 1.0F, 1.0F);
         this.dS().b($$1);
      }
   }

   private void p(cvs $$0) {
      ckh $$1 = new ckh(this.dS(), this.dx(), this.dz(), this.dD(), $$0);
      this.dS().b($$1);
   }

   @Override
   protected void b(ckh $$0) {
      cvs $$1 = $$0.m();
      if (this.i($$1)) {
         int $$2 = $$1.K();
         if ($$2 > 1) {
            this.p($$1.a($$2 - 1));
         }

         this.o(this.a(btz.a));
         this.a($$0);
         this.a(btz.a, $$1.a(1));
         this.f(btz.a);
         this.a($$0, $$1.K());
         $$0.as();
         this.cx = 0;
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

         if ($$0 || this.fN()) {
            this.x(false);
         }

         if (this.go() && this.dS().z.i() < 0.2F) {
            jf $$1 = this.ds();
            dus $$2 = this.dS().a_($$1);
            this.dS().c(2001, $$1, dhm.j($$2));
         }
      }

      this.cu = this.ct;
      if (this.gs()) {
         this.ct = this.ct + (1.0F - this.ct) * 0.4F;
      } else {
         this.ct = this.ct + (0.0F - this.ct) * 0.4F;
      }

      this.cw = this.cv;
      if (this.cf()) {
         this.cv += 0.2F;
         if (this.cv > 3.0F) {
            this.cv = 3.0F;
         }
      } else {
         this.cv = 0.0F;
      }
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.Z);
   }

   @Override
   protected void a(cnx $$0, bup $$1) {
      ((cgn)$$1).b($$0.cD());
   }

   public boolean gp() {
      return this.t(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gq() {
      return this.bj;
   }

   public boolean gr() {
      return this.cv == 3.0F;
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
      return azf.h($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return azf.h($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable bun $$0) {
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
      return !this.fN() && !this.y() && !this.go();
   }

   @Override
   public void U() {
      awf $$0 = this.w();
      if ($$0 == awg.jm) {
         this.a($$0, 2.0F, this.fe());
      } else {
         super.U();
      }
   }

   @Nullable
   @Override
   protected awf w() {
      if (this.fN()) {
         return awg.jn;
      } else {
         if (!this.dS().S() && this.af.i() < 0.1F) {
            List<cnx> $$0 = this.dS().a(cnx.class, this.cO().c(16.0, 16.0, 16.0), btw.f);
            if ($$0.isEmpty()) {
               return awg.jm;
            }
         }

         return awg.jh;
      }
   }

   @Nullable
   @Override
   protected awf d(bsj $$0) {
      return awg.jl;
   }

   @Nullable
   @Override
   protected awf o_() {
      return awg.jj;
   }

   boolean c(UUID $$0) {
      return this.gB().contains($$0);
   }

   @Override
   protected void a(arj $$0, bsj $$1) {
      cvs $$2 = this.a(btz.a);
      if (!$$2.f()) {
         this.b($$2);
         this.a(btz.a, cvs.k);
      }

      super.a($$0, $$1);
   }

   public static boolean a(cgn $$0, bun $$1) {
      double $$2 = $$1.dD() - $$0.dD();
      double $$3 = $$1.dx() - $$0.dx();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dS().a_(jf.a($$0.dx() + $$8, $$0.dz() + (double)$$9, $$0.dD() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public eyw cQ() {
      return new eyw(0.0, (double)(0.55F * this.cP()), (double)(this.dn() * 0.4F));
   }

   class a extends cdd<bun> {
      @Nullable
      private bun j;
      @Nullable
      private bun k;
      private int l;

      public a(final Class<bun> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<bun> $$3) {
         super(cgn.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dV().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cgn.this.gB()) {
               if ($$0 != null && cgn.this.dS() instanceof arj && ((arj)cgn.this.dS()).a($$0) instanceof bun $$2) {
                  this.k = $$2;
                  this.j = $$2.en();
                  int $$3 = $$2.eo();
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
            this.l = this.k.eo();
         }

         cgn.this.a(awg.jg, 1.0F, 1.0F);
         cgn.this.C(true);
         cgn.this.gD();
         super.d();
      }
   }

   class b extends cbk {
      int a;

      public b() {
         this.a(EnumSet.of(cbk.a.b, cbk.a.c, cbk.a.a));
      }

      @Override
      public boolean b() {
         return cgn.this.go();
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
         cgn.this.B(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements Predicate<bun> {
      public boolean a(bun $$0) {
         if ($$0 instanceof cgn) {
            return false;
         } else if ($$0 instanceof cgi || $$0 instanceof cgx || $$0 instanceof cld) {
            return true;
         } else if ($$0 instanceof bvj) {
            return !((bvj)$$0).q();
         } else if (!($$0 instanceof cnx) || !$$0.Q_() && !((cnx)$$0).f()) {
            return cgn.this.c($$0.cD()) ? false : !$$0.fN() && !$$0.cd();
         } else {
            return false;
         }
      }
   }

   abstract class d extends cbk {
      private final cfd b = cfd.a().a(12.0).d().a(cgn.this.new c());

      protected boolean h() {
         jf $$0 = jf.a(cgn.this.dx(), cgn.this.cO().e, cgn.this.dD());
         return !cgn.this.dS().h($$0) && cgn.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cgn.this.dS().a(bun.class, this.b, cgn.this, cgn.this.cO().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends caw {
      public e(final double $$0) {
         super(cgn.this, $$0);
      }

      @Override
      public void d() {
         ((cgn)this.a).gE();
         ((cgn)this.c).gE();
         super.d();
      }

      @Override
      protected void g() {
         arj $$0 = (arj)this.b;
         cgn $$1 = (cgn)this.a.a($$0, (btk)this.c);
         if ($$1 != null) {
            ark $$2 = this.a.gx();
            ark $$3 = this.c.gx();
            ark $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cD());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cD());
            }

            if ($$4 != null) {
               $$4.a(awq.P);
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
            if (this.b.ac().b(def.f)) {
               this.b.b(new bud(this.b, this.a.dx(), this.a.dz(), this.a.dD(), this.a.dV().a(7) + 1));
            }
         }
      }
   }

   public class f extends cbx {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cgn.this, $$1, $$2, $$3);
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
      protected boolean a(dem $$0, jf $$1) {
         dus $$2 = $$0.a_($$1);
         return $$2.a(dho.oi) && $$2.c(dpq.c) >= 2 || dii.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cgn.this.af.i() < 0.05F) {
            cgn.this.a(awg.jo, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (cgn.this.dS().ac().b(def.c)) {
            dus $$0 = cgn.this.dS().a_(this.e);
            if ($$0.a(dho.oi)) {
               this.b($$0);
            } else if (dii.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dus $$0) {
         dii.a(cgn.this, $$0, cgn.this.dS(), this.e);
      }

      private void b(dus $$0) {
         int $$1 = $$0.c(dpq.c);
         $$0.b(dpq.c, Integer.valueOf(1));
         int $$2 = 1 + cgn.this.dS().z.a(2) + ($$1 == 3 ? 1 : 0);
         cvs $$3 = cgn.this.a(btz.a);
         if ($$3.f()) {
            cgn.this.a(btz.a, new cvs(cvw.wx));
            $$2--;
         }

         if ($$2 > 0) {
            dhm.a(cgn.this.dS(), this.e, new cvs(cvw.wx, $$2));
         }

         cgn.this.a(awg.zy, 1.0F, 1.0F);
         cgn.this.dS().a(this.e, $$0.b(dpq.c, Integer.valueOf(1)), 2);
         cgn.this.dS().a(dzp.c, this.e, dzp.a.a(cgn.this));
      }

      @Override
      public boolean b() {
         return !cgn.this.fN() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         cgn.this.x(false);
         super.d();
      }
   }

   class g extends cbe {
      public g() {
         super(cgn.this);
      }

      @Override
      public void d() {
         super.d();
         cgn.this.gE();
      }

      @Override
      public boolean b() {
         return cgn.this.bi() && cgn.this.b(axb.a) > 0.25 || cgn.this.bw();
      }
   }

   class h extends cbj {
      private final cgn d;

      public h(final cgn $$0, final double $$1) {
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

   public static class i extends btk.a {
      public final cgn.v a;

      public i(cgn.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cbs {
      public j(final bup $$0, final Class<? extends bun> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !cgn.this.go() && !cgn.this.gs();
      }

      @Override
      public boolean c() {
         return super.c() && !cgn.this.go() && !cgn.this.gs();
      }
   }

   public class k extends cam {
      public k() {
         super(cgn.this);
      }

      @Override
      public void a() {
         if (!cgn.this.fN()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cgn.this.gp() && !cgn.this.cf() && !cgn.this.gs() && !cgn.this.go();
      }
   }

   class l extends cbu {
      public l(final double $$0, final boolean $$1) {
         super(cgn.this, $$0, $$1);
      }

      @Override
      protected void a(bun $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.E($$0);
            cgn.this.a(awg.ji, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         cgn.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !cgn.this.y() && !cgn.this.fN() && !cgn.this.cf() && !cgn.this.go() && super.b();
      }
   }

   class m extends can {
      public m() {
         super(cgn.this);
      }

      @Override
      public void a() {
         if (cgn.this.gF()) {
            super.a();
         }
      }
   }

   class n extends ccd {
      public n(final double $$0) {
         super(cgn.this, $$0);
      }

      @Override
      public boolean h() {
         return !cgn.this.gC() && super.h();
      }
   }

   public class o extends cbo {
      @Override
      public boolean b() {
         if (!cgn.this.gr()) {
            return false;
         } else {
            bun $$0 = cgn.this.m();
            if ($$0 != null && $$0.bI()) {
               if ($$0.cM() != $$0.cL()) {
                  return false;
               } else {
                  boolean $$1 = cgn.a(cgn.this, $$0);
                  if (!$$1) {
                     cgn.this.P().a($$0, 0);
                     cgn.this.z(false);
                     cgn.this.A(false);
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
         bun $$0 = cgn.this.m();
         if ($$0 != null && $$0.bI()) {
            double $$1 = cgn.this.dv().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cgn.this.dK()) < 15.0F) || !cgn.this.aH()) && !cgn.this.go();
         } else {
            return false;
         }
      }

      @Override
      public boolean T_() {
         return false;
      }

      @Override
      public void d() {
         cgn.this.t(true);
         cgn.this.y(true);
         cgn.this.A(false);
         bun $$0 = cgn.this.m();
         if ($$0 != null) {
            cgn.this.K().a($$0, 60.0F, 30.0F);
            eyw $$1 = new eyw($$0.dx() - cgn.this.dx(), $$0.dz() - cgn.this.dz(), $$0.dD() - cgn.this.dD()).d();
            cgn.this.h(cgn.this.dv().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         cgn.this.P().o();
      }

      @Override
      public void e() {
         cgn.this.z(false);
         cgn.this.cv = 0.0F;
         cgn.this.cw = 0.0F;
         cgn.this.A(false);
         cgn.this.y(false);
      }

      @Override
      public void a() {
         bun $$0 = cgn.this.m();
         if ($$0 != null) {
            cgn.this.K().a($$0, 60.0F, 30.0F);
         }

         if (!cgn.this.go()) {
            eyw $$1 = cgn.this.dv();
            if ($$1.e * $$1.e < 0.03F && cgn.this.dK() != 0.0F) {
               cgn.this.w(azf.i(0.2F, cgn.this.dK(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               cgn.this.w((float)$$3);
            }
         }

         if ($$0 != null && cgn.this.f((btr)$$0) <= 2.0F) {
            cgn.this.E($$0);
         } else if (cgn.this.dK() > 0.0F && cgn.this.aH() && (float)cgn.this.dv().e != 0.0F && cgn.this.dS().a_(cgn.this.ds()).a(dho.dN)) {
            cgn.this.w(60.0F);
            cgn.this.h(null);
            cgn.this.B(true);
         }
      }
   }

   class p extends cbk {
      public p() {
         this.a(EnumSet.of(cbk.a.a));
      }

      @Override
      public boolean b() {
         if (!cgn.this.a(btz.a).f()) {
            return false;
         } else if (cgn.this.m() != null || cgn.this.en() != null) {
            return false;
         } else if (!cgn.this.gF()) {
            return false;
         } else if (cgn.this.dV().a(b(10)) != 0) {
            return false;
         } else {
            List<ckh> $$0 = cgn.this.dS().a(ckh.class, cgn.this.cO().c(8.0, 8.0, 8.0), cgn.ck);
            return !$$0.isEmpty() && cgn.this.a(btz.a).f();
         }
      }

      @Override
      public void a() {
         List<ckh> $$0 = cgn.this.dS().a(ckh.class, cgn.this.cO().c(8.0, 8.0, 8.0), cgn.ck);
         cvs $$1 = cgn.this.a(btz.a);
         if ($$1.f() && !$$0.isEmpty()) {
            cgn.this.P().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<ckh> $$0 = cgn.this.dS().a(ckh.class, cgn.this.cO().c(8.0, 8.0, 8.0), cgn.ck);
         if (!$$0.isEmpty()) {
            cgn.this.P().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends ccq {
      public q(final int $$0, final int $$1) {
         super(cgn.this, $$1);
      }

      @Override
      public void d() {
         cgn.this.gE();
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
         return !cgn.this.fN() && !cgn.this.y() && !cgn.this.gC() && cgn.this.m() == null;
      }
   }

   class r extends cgn.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cbk.a.a, cbk.a.b));
      }

      @Override
      public boolean b() {
         return cgn.this.en() == null
            && cgn.this.dV().i() < 0.02F
            && !cgn.this.fN()
            && cgn.this.m() == null
            && cgn.this.P().m()
            && !this.i()
            && !cgn.this.gp()
            && !cgn.this.cf();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + cgn.this.dV().a(3);
         cgn.this.x(true);
         cgn.this.P().o();
      }

      @Override
      public void e() {
         cgn.this.x(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cgn.this.K().a(cgn.this.dx() + this.c, cgn.this.dB(), cgn.this.dD() + this.d, (float)cgn.this.ae(), (float)cgn.this.ad());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cgn.this.dV().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cgn.this.dV().a(20));
      }
   }

   class s extends cbd {
      private int c = b(100);

      public s(final double $$0) {
         super(cgn.this, $$0);
      }

      @Override
      public boolean b() {
         if (!cgn.this.fN() && this.a.m() == null) {
            if (cgn.this.dS().ad() && cgn.this.dS().h(this.a.ds())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               jf $$0 = this.a.ds();
               return cgn.this.dS().S() && cgn.this.dS().h($$0) && !((arj)cgn.this.dS()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         cgn.this.gE();
         super.d();
      }
   }

   class t extends cgn.d {
      private static final int c = b(140);
      private int d = cgn.this.af.a(c);

      public t() {
         this.a(EnumSet.of(cbk.a.a, cbk.a.b, cbk.a.c));
      }

      @Override
      public boolean b() {
         return cgn.this.bk == 0.0F && cgn.this.bl == 0.0F && cgn.this.bm == 0.0F ? this.k() || cgn.this.fN() : false;
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
            return cgn.this.dS().S() && this.h() && !this.i() && !cgn.this.aw;
         }
      }

      @Override
      public void e() {
         this.d = cgn.this.af.a(c);
         cgn.this.gE();
      }

      @Override
      public void d() {
         cgn.this.x(false);
         cgn.this.z(false);
         cgn.this.A(false);
         cgn.this.t(false);
         cgn.this.D(true);
         cgn.this.P().o();
         cgn.this.M().a(cgn.this.dx(), cgn.this.dz(), cgn.this.dD(), 0.0);
      }
   }

   class u extends cbk {
      public u() {
         this.a(EnumSet.of(cbk.a.a, cbk.a.b));
      }

      @Override
      public boolean b() {
         if (cgn.this.fN()) {
            return false;
         } else {
            bun $$0 = cgn.this.m();
            return $$0 != null && $$0.bI() && cgn.cm.test($$0) && cgn.this.g((btr)$$0) > 36.0 && !cgn.this.cf() && !cgn.this.gs() && !cgn.this.bj;
         }
      }

      @Override
      public void d() {
         cgn.this.x(false);
         cgn.this.B(false);
      }

      @Override
      public void e() {
         bun $$0 = cgn.this.m();
         if ($$0 != null && cgn.a(cgn.this, $$0)) {
            cgn.this.A(true);
            cgn.this.z(true);
            cgn.this.P().o();
            cgn.this.K().a($$0, (float)cgn.this.ae(), (float)cgn.this.ad());
         } else {
            cgn.this.A(false);
            cgn.this.z(false);
         }
      }

      @Override
      public void a() {
         bun $$0 = cgn.this.m();
         if ($$0 != null) {
            cgn.this.K().a($$0, (float)cgn.this.ae(), (float)cgn.this.ad());
            if (cgn.this.g((btr)$$0) <= 36.0) {
               cgn.this.A(true);
               cgn.this.z(true);
               cgn.this.P().o();
            } else {
               cgn.this.P().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements bab {
      a(0, "red"),
      b(1, "snow");

      public static final bab.a<cgn.v> c = bab.a(cgn.v::values);
      private static final IntFunction<cgn.v> d = axw.a(cgn.v::a, values(), axw.a.a);
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

      public static cgn.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cgn.v a(int $$0) {
         return d.apply($$0);
      }

      public static cgn.v a(jo<dfk> $$0) {
         return $$0.a(awu.ar) ? b : a;
      }
   }
}
