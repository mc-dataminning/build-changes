import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfm extends cfc implements bum<cfm.v> {
   private static final ajv<Integer> ce = ajz.a(cfm.class, ajx.b);
   private static final ajv<Byte> cf = ajz.a(cfm.class, ajx.a);
   private static final int cg = 1;
   public static final int ca = 4;
   public static final int cb = 8;
   public static final int cc = 16;
   private static final int ch = 32;
   private static final int ci = 64;
   private static final int cj = 128;
   private static final ajv<Optional<UUID>> ck = ajz.a(cfm.class, ajx.r);
   private static final ajv<Optional<UUID>> cl = ajz.a(cfm.class, ajx.r);
   static final Predicate<cjf> cm = $$0 -> !$$0.y() && $$0.bE();
   private static final Predicate<bsq> cn = $$0 -> !($$0 instanceof btl $$1) ? false : $$1.el() != null && $$1.em() < $$1.ai + 600;
   static final Predicate<bsq> co = $$0 -> $$0 instanceof cfh || $$0 instanceof cfw;
   private static final Predicate<bsq> cp = $$0 -> !$$0.bZ() && bsv.e.test($$0);
   private static final int cq = 600;
   private static final bst cr = bsw.Q.n().a(0.5F).b(0.2975F);
   private cak cs;
   private cak ct;
   private cak cu;
   private float cv;
   private float cw;
   float cx;
   float cy;
   private int cz;

   public cfm(bsw<? extends cfm> $$0, dcu $$1) {
      super($$0, $$1);
      this.bQ = new cfm.k();
      this.bR = new cfm.m();
      this.a(epp.p, 0.0F);
      this.a(epp.q, 0.0F);
      this.a_(true);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ck, Optional.empty());
      $$0.a(cl, Optional.empty());
      $$0.a(ce, 0);
      $$0.a(cf, (byte)0);
   }

   @Override
   protected void z() {
      this.cs = new ccd<>(this, cfc.class, 10, false, false, $$0 -> $$0 instanceof cfh || $$0 instanceof cfw);
      this.ct = new ccd<>(this, cgd.class, 10, false, false, cgd.ca);
      this.cu = new ccd<>(this, cez.class, 20, false, false, $$0 -> $$0 instanceof cfb);
      this.bU.a(0, new cfm.g());
      this.bU.a(0, new bzz(this, this.dQ()));
      this.bU.a(1, new cfm.b());
      this.bU.a(2, new cfm.n(2.2));
      this.bU.a(3, new cfm.e(1.0));
      this.bU.a(4, new bzr<>(this, cmv.class, 16.0F, 1.6, 1.4, $$0 -> cp.test($$0) && !this.c($$0.cA()) && !this.gy()));
      this.bU.a(4, new bzr<>(this, cgf.class, 8.0F, 1.6, 1.4, $$0 -> !((cgf)$$0).s() && !this.gy()));
      this.bU.a(4, new bzr<>(this, cfu.class, 8.0F, 1.6, 1.4, $$0 -> !this.gy()));
      this.bU.a(5, new cfm.u());
      this.bU.a(6, new cfm.o());
      this.bU.a(6, new cfm.s(1.25));
      this.bU.a(7, new cfm.l(1.2F, true));
      this.bU.a(7, new cfm.t());
      this.bU.a(8, new cfm.h(this, 1.25));
      this.bU.a(9, new cfm.q(32, 200));
      this.bU.a(10, new cfm.f(1.2F, 12, 1));
      this.bU.a(10, new caq(this, 0.4F));
      this.bU.a(11, new cbx(this, 1.0));
      this.bU.a(11, new cfm.p());
      this.bU.a(12, new cfm.j(this, cmv.class, 24.0F));
      this.bU.a(13, new cfm.r());
      this.bV.a(3, new cfm.a(btl.class, false, false, $$0 -> cn.test($$0) && !this.c($$0.cA())));
   }

   @Override
   public avn d(cuo $$0) {
      return avo.jj;
   }

   @Override
   public void m_() {
      if (!this.dQ().B && this.bE() && this.dc()) {
         this.cz++;
         cuo $$0 = this.a(bsx.a);
         if (this.n($$0)) {
            if (this.cz > 600) {
               cuo $$1 = $$0.a(this.dQ(), this);
               if (!$$1.e()) {
                  this.a(bsx.a, $$1);
               }

               this.cz = 0;
            } else if (this.cz > 560 && this.ah.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dQ().a(this, (byte)45);
            }
         }

         btl $$2 = this.p();
         if ($$2 == null || !$$2.bE()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fI() || this.fd()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      }

      super.m_();
      if (this.gy() && this.ah.i() < 0.05F) {
         this.a(avo.jf, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fd() {
      return this.ey();
   }

   private boolean n(cuo $$0) {
      return $$0.b(kq.v) && this.p() == null && this.aF() && !this.fI();
   }

   @Override
   protected void a(ayv $$0, bqo $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cuo $$3;
         if ($$2 < 0.05F) {
            $$3 = new cuo(cur.oA);
         } else if ($$2 < 0.2F) {
            $$3 = new cuo(cur.qR);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cuo(cur.uD) : new cuo(cur.uE);
         } else if ($$2 < 0.6F) {
            $$3 = new cuo(cur.pw);
         } else if ($$2 < 0.8F) {
            $$3 = new cuo(cur.qD);
         } else {
            $$3 = new cuo(cur.pt);
         }

         this.a(bsx.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cuo $$1 = this.a(bsx.a);
         if (!$$1.e()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               eww $$3 = new eww(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dI() * (float) (Math.PI / 180.0))
                  .b(-this.dG() * (float) (Math.PI / 180.0));
               this.dQ().a(new li(lm.S, $$1), this.dv() + this.bM().c / 2.0, this.dx(), this.dB() + this.bM().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static but.a s() {
      return btn.A().a(buu.v, 0.3F).a(buu.s, 10.0).a(buu.m, 32.0).a(buu.c, 2.0).a(buu.x, 5.0);
   }

   @Nullable
   public cfm b(aqt $$0, bsk $$1) {
      cfm $$2 = bsw.Q.a((dcu)$$0);
      if ($$2 != null) {
         $$2.a(this.ah.h() ? this.t() : ((cfm)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bsw<cfm> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.a_($$3.d()).a(awd.ce) && a($$1, $$3);
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      jm<ddu> $$4 = $$0.t(this.dq());
      cfm.v $$5 = cfm.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cfm.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cfm.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof aqt) {
         this.gw();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gw() {
      if (this.t() == cfm.v.a) {
         this.bV.a(4, this.cs);
         this.bV.a(4, this.ct);
         this.bV.a(6, this.cu);
      } else {
         this.bV.a(4, this.cu);
         this.bV.a(6, this.cs);
         this.bV.a(6, this.ct);
      }
   }

   @Override
   protected void a(cmv $$0, bqp $$1, cuo $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bst e(bty $$0) {
      return this.o_() ? cr : super.e($$0);
   }

   public cfm.v t() {
      return cfm.v.a(this.ao.a(ce));
   }

   public void a(cfm.v $$0) {
      this.ao.a(ce, $$0.a());
   }

   List<UUID> gx() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.ao.a(ck).orElse(null));
      $$0.add(this.ao.a(cl).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.ao.a(ck).isPresent()) {
         this.ao.a(cl, Optional.ofNullable($$0));
      } else {
         this.ao.a(ck, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gx();
      ug $$2 = new ug();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(up.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fI());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.x());
      $$0.a("Crouching", this.cb());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);

      for (ux $$2 : $$0.c("Trusted", 11)) {
         this.b(up.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(cfm.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dQ() instanceof aqt) {
         this.gw();
      }
   }

   public boolean x() {
      return this.t(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gm() {
      return this.t(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gy() {
      return this.t(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fI() {
      return this.t(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.ao.a(cf, (byte)(this.ao.a(cf) | $$0));
      } else {
         this.ao.a(cf, (byte)(this.ao.a(cf) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.ao.a(cf) & $$0) != 0;
   }

   @Override
   public boolean f(cuo $$0) {
      bsx $$1 = this.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsx.a && super.f($$0);
   }

   @Override
   public boolean j(cuo $$0) {
      cuo $$1 = this.a(bsx.a);
      return $$1.e() || this.cz > 0 && $$0.b(kq.v) && !$$1.b(kq.v);
   }

   private void p(cuo $$0) {
      if (!$$0.e() && !this.dQ().B) {
         cjf $$1 = new cjf(this.dQ(), this.dv() + this.bM().c, this.dx() + 1.0, this.dB() + this.bM().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(avo.jo, 1.0F, 1.0F);
         this.dQ().b($$1);
      }
   }

   private void q(cuo $$0) {
      cjf $$1 = new cjf(this.dQ(), this.dv(), this.dx(), this.dB(), $$0);
      this.dQ().b($$1);
   }

   @Override
   protected void b(cjf $$0) {
      cuo $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.H();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.a(bsx.a));
         this.a($$0);
         this.a(bsx.a, $$1.a(1));
         this.e(bsx.a);
         this.a($$0, $$1.H());
         $$0.aq();
         this.cz = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dc()) {
         boolean $$0 = this.bf();
         if ($$0 || this.p() != null || this.dQ().ac()) {
            this.gz();
         }

         if ($$0 || this.fI()) {
            this.w(false);
         }

         if (this.gm() && this.dQ().z.i() < 0.2F) {
            jd $$1 = this.dq();
            dta $$2 = this.dQ().a_($$1);
            this.dQ().c(2001, $$1, dfw.i($$2));
         }
      }

      this.cw = this.cv;
      if (this.gq()) {
         this.cv = this.cv + (1.0F - this.cv) * 0.4F;
      } else {
         this.cv = this.cv + (0.0F - this.cv) * 0.4F;
      }

      this.cy = this.cx;
      if (this.cb()) {
         this.cx += 0.2F;
         if (this.cx > 3.0F) {
            this.cx = 3.0F;
         }
      } else {
         this.cx = 0.0F;
      }
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.Z);
   }

   @Override
   protected void a(cmv $$0, btn $$1) {
      ((cfm)$$1).b($$0.cA());
   }

   public boolean gn() {
      return this.t(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean go() {
      return this.bn;
   }

   public boolean gp() {
      return this.cx == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean cb() {
      return this.t(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gq() {
      return this.t(8);
   }

   public float H(float $$0) {
      return ayn.i($$0, this.cw, this.cv) * 0.11F * (float) Math.PI;
   }

   public float I(float $$0) {
      return ayn.i($$0, this.cy, this.cx);
   }

   @Override
   public void h(@Nullable btl $$0) {
      if (this.gy() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   void gz() {
      this.C(false);
   }

   void gA() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gB() {
      return !this.fI() && !this.x() && !this.gm();
   }

   @Override
   public void Q() {
      avn $$0 = this.v();
      if ($$0 == avo.jl) {
         this.a($$0, 2.0F, this.fc());
      } else {
         super.Q();
      }
   }

   @Nullable
   @Override
   protected avn v() {
      if (this.fI()) {
         return avo.jm;
      } else {
         if (!this.dQ().R() && this.ah.i() < 0.1F) {
            List<cmv> $$0 = this.dQ().a(cmv.class, this.cL().c(16.0, 16.0, 16.0), bsv.f);
            if ($$0.isEmpty()) {
               return avo.jl;
            }
         }

         return avo.jg;
      }
   }

   @Nullable
   @Override
   protected avn d(brj $$0) {
      return avo.jk;
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.ji;
   }

   boolean c(UUID $$0) {
      return this.gx().contains($$0);
   }

   @Override
   protected void a(aqt $$0, brj $$1) {
      cuo $$2 = this.a(bsx.a);
      if (!$$2.e()) {
         this.b($$2);
         this.a(bsx.a, cuo.l);
      }

      super.a($$0, $$1);
   }

   public static boolean a(cfm $$0, btl $$1) {
      double $$2 = $$1.dB() - $$0.dB();
      double $$3 = $$1.dv() - $$0.dv();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dQ().a_(jd.a($$0.dv() + $$8, $$0.dx() + (double)$$9, $$0.dB() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public eww cN() {
      return new eww(0.0, (double)(0.55F * this.cM()), (double)(this.dk() * 0.4F));
   }

   class a extends ccd<btl> {
      @Nullable
      private btl j;
      @Nullable
      private btl k;
      private int l;

      public a(final Class<btl> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<btl> $$3) {
         super(cfm.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dT().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cfm.this.gx()) {
               if ($$0 != null && cfm.this.dQ() instanceof aqt && ((aqt)cfm.this.dQ()).a($$0) instanceof btl $$2) {
                  this.k = $$2;
                  this.j = $$2.ej();
                  int $$3 = $$2.ek();
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
            this.l = this.k.ek();
         }

         cfm.this.a(avo.jf, 1.0F, 1.0F);
         cfm.this.B(true);
         cfm.this.gz();
         super.d();
      }
   }

   class b extends cak {
      int a;

      public b() {
         this.a(EnumSet.of(cak.a.b, cak.a.c, cak.a.a));
      }

      @Override
      public boolean b() {
         return cfm.this.gm();
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
         cfm.this.A(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements Predicate<btl> {
      public boolean a(btl $$0) {
         if ($$0 instanceof cfm) {
            return false;
         } else if ($$0 instanceof cfh || $$0 instanceof cfw || $$0 instanceof ckb) {
            return true;
         } else if ($$0 instanceof buj) {
            return !((buj)$$0).s();
         } else if (!($$0 instanceof cmv) || !$$0.N_() && !((cmv)$$0).f()) {
            return cfm.this.c($$0.cA()) ? false : !$$0.fI() && !$$0.bZ();
         } else {
            return false;
         }
      }
   }

   abstract class d extends cak {
      private final ced b = ced.a().a(12.0).d().a(cfm.this.new c());

      protected boolean h() {
         jd $$0 = jd.a(cfm.this.dv(), cfm.this.cL().e, cfm.this.dB());
         return !cfm.this.dQ().h($$0) && cfm.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cfm.this.dQ().a(btl.class, this.b, cfm.this, cfm.this.cL().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bzw {
      public e(final double $$0) {
         super(cfm.this, $$0);
      }

      @Override
      public void d() {
         ((cfm)this.a).gA();
         ((cfm)this.c).gA();
         super.d();
      }

      @Override
      protected void g() {
         aqt $$0 = (aqt)this.b;
         cfm $$1 = (cfm)this.a.a($$0, (bsk)this.c);
         if ($$1 != null) {
            aqu $$2 = this.a.gt();
            aqu $$3 = this.c.gt();
            aqu $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cA());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cA());
            }

            if ($$4 != null) {
               $$4.a(avy.P);
               an.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gv();
            this.c.gv();
            $$1.c_(-24000);
            $$1.b(this.a.dv(), this.a.dx(), this.a.dB(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.ab().b(dcq.f)) {
               this.b.b(new btb(this.b, this.a.dv(), this.a.dx(), this.a.dB(), this.a.dT().a(7) + 1));
            }
         }
      }
   }

   public class f extends cax {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cfm.this, $$1, $$2, $$3);
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
      protected boolean a(dcx $$0, jd $$1) {
         dta $$2 = $$0.a_($$1);
         return $$2.a(dfy.oi) && $$2.c(doa.c) >= 2 || dgs.h_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cfm.this.ah.i() < 0.05F) {
            cfm.this.a(avo.jn, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (cfm.this.dQ().ab().b(dcq.c)) {
            dta $$0 = cfm.this.dQ().a_(this.e);
            if ($$0.a(dfy.oi)) {
               this.b($$0);
            } else if (dgs.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dta $$0) {
         dgs.a(cfm.this, $$0, cfm.this.dQ(), this.e);
      }

      private void b(dta $$0) {
         int $$1 = $$0.c(doa.c);
         $$0.a(doa.c, Integer.valueOf(1));
         int $$2 = 1 + cfm.this.dQ().z.a(2) + ($$1 == 3 ? 1 : 0);
         cuo $$3 = cfm.this.a(bsx.a);
         if ($$3.e()) {
            cfm.this.a(bsx.a, new cuo(cur.wu));
            $$2--;
         }

         if ($$2 > 0) {
            dfw.a(cfm.this.dQ(), this.e, new cuo(cur.wu, $$2));
         }

         cfm.this.a(avo.zs, 1.0F, 1.0F);
         cfm.this.dQ().a(this.e, $$0.a(doa.c, Integer.valueOf(1)), 2);
         cfm.this.dQ().a(dxw.c, this.e, dxw.a.a(cfm.this));
      }

      @Override
      public boolean b() {
         return !cfm.this.fI() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         cfm.this.w(false);
         super.d();
      }
   }

   class g extends cae {
      public g() {
         super(cfm.this);
      }

      @Override
      public void d() {
         super.d();
         cfm.this.gA();
      }

      @Override
      public boolean b() {
         return cfm.this.bf() && cfm.this.b(awj.a) > 0.25 || cfm.this.bt();
      }
   }

   class h extends caj {
      private final cfm d;

      public h(final cfm $$0, final double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gy() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gy() && super.c();
      }

      @Override
      public void d() {
         this.d.gA();
         super.d();
      }
   }

   public static class i extends bsk.a {
      public final cfm.v a;

      public i(cfm.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cas {
      public j(final btn $$0, final Class<? extends btl> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !cfm.this.gm() && !cfm.this.gq();
      }

      @Override
      public boolean c() {
         return super.c() && !cfm.this.gm() && !cfm.this.gq();
      }
   }

   public class k extends bzm {
      public k() {
         super(cfm.this);
      }

      @Override
      public void a() {
         if (!cfm.this.fI()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cfm.this.gn() && !cfm.this.cb() && !cfm.this.gq() && !cfm.this.gm();
      }
   }

   class l extends cau {
      public l(final double $$0, final boolean $$1) {
         super(cfm.this, $$0, $$1);
      }

      @Override
      protected void a(btl $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.D($$0);
            cfm.this.a(avo.jh, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         cfm.this.z(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !cfm.this.x() && !cfm.this.fI() && !cfm.this.cb() && !cfm.this.gm() && super.b();
      }
   }

   class m extends bzn {
      public m() {
         super(cfm.this);
      }

      @Override
      public void a() {
         if (cfm.this.gB()) {
            super.a();
         }
      }
   }

   class n extends cbd {
      public n(final double $$0) {
         super(cfm.this, $$0);
      }

      @Override
      public boolean h() {
         return !cfm.this.gy() && super.h();
      }
   }

   public class o extends cao {
      @Override
      public boolean b() {
         if (!cfm.this.gp()) {
            return false;
         } else {
            btl $$0 = cfm.this.p();
            if ($$0 != null && $$0.bE()) {
               if ($$0.cJ() != $$0.cI()) {
                  return false;
               } else {
                  boolean $$1 = cfm.a(cfm.this, $$0);
                  if (!$$1) {
                     cfm.this.J().a($$0, 0);
                     cfm.this.y(false);
                     cfm.this.z(false);
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
         btl $$0 = cfm.this.p();
         if ($$0 != null && $$0.bE()) {
            double $$1 = cfm.this.dt().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cfm.this.dI()) < 15.0F) || !cfm.this.aF()) && !cfm.this.gm();
         } else {
            return false;
         }
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public void d() {
         cfm.this.t(true);
         cfm.this.x(true);
         cfm.this.z(false);
         btl $$0 = cfm.this.p();
         if ($$0 != null) {
            cfm.this.F().a($$0, 60.0F, 30.0F);
            eww $$1 = new eww($$0.dv() - cfm.this.dv(), $$0.dx() - cfm.this.dx(), $$0.dB() - cfm.this.dB()).d();
            cfm.this.i(cfm.this.dt().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cfm.this.J().n();
      }

      @Override
      public void e() {
         cfm.this.y(false);
         cfm.this.cx = 0.0F;
         cfm.this.cy = 0.0F;
         cfm.this.z(false);
         cfm.this.x(false);
      }

      @Override
      public void a() {
         btl $$0 = cfm.this.p();
         if ($$0 != null) {
            cfm.this.F().a($$0, 60.0F, 30.0F);
         }

         if (!cfm.this.gm()) {
            eww $$1 = cfm.this.dt();
            if ($$1.d * $$1.d < 0.03F && cfm.this.dI() != 0.0F) {
               cfm.this.t(ayn.j(0.2F, cfm.this.dI(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cfm.this.t((float)$$3);
            }
         }

         if ($$0 != null && cfm.this.f($$0) <= 2.0F) {
            cfm.this.D($$0);
         } else if (cfm.this.dI() > 0.0F && cfm.this.aF() && (float)cfm.this.dt().d != 0.0F && cfm.this.dQ().a_(cfm.this.dq()).a(dfy.dN)) {
            cfm.this.t(60.0F);
            cfm.this.h(null);
            cfm.this.A(true);
         }
      }
   }

   class p extends cak {
      public p() {
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean b() {
         if (!cfm.this.a(bsx.a).e()) {
            return false;
         } else if (cfm.this.p() != null || cfm.this.ej() != null) {
            return false;
         } else if (!cfm.this.gB()) {
            return false;
         } else if (cfm.this.dT().a(b(10)) != 0) {
            return false;
         } else {
            List<cjf> $$0 = cfm.this.dQ().a(cjf.class, cfm.this.cL().c(8.0, 8.0, 8.0), cfm.cm);
            return !$$0.isEmpty() && cfm.this.a(bsx.a).e();
         }
      }

      @Override
      public void a() {
         List<cjf> $$0 = cfm.this.dQ().a(cjf.class, cfm.this.cL().c(8.0, 8.0, 8.0), cfm.cm);
         cuo $$1 = cfm.this.a(bsx.a);
         if ($$1.e() && !$$0.isEmpty()) {
            cfm.this.J().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<cjf> $$0 = cfm.this.dQ().a(cjf.class, cfm.this.cL().c(8.0, 8.0, 8.0), cfm.cm);
         if (!$$0.isEmpty()) {
            cfm.this.J().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cbq {
      public q(final int $$0, final int $$1) {
         super(cfm.this, $$1);
      }

      @Override
      public void d() {
         cfm.this.gA();
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
         return !cfm.this.fI() && !cfm.this.x() && !cfm.this.gy() && cfm.this.p() == null;
      }
   }

   class r extends cfm.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cak.a.a, cak.a.b));
      }

      @Override
      public boolean b() {
         return cfm.this.ej() == null
            && cfm.this.dT().i() < 0.02F
            && !cfm.this.fI()
            && cfm.this.p() == null
            && cfm.this.J().l()
            && !this.i()
            && !cfm.this.gn()
            && !cfm.this.cb();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + cfm.this.dT().a(3);
         cfm.this.w(true);
         cfm.this.J().n();
      }

      @Override
      public void e() {
         cfm.this.w(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cfm.this.F().a(cfm.this.dv() + this.c, cfm.this.dz(), cfm.this.dB() + this.d, (float)cfm.this.ab(), (float)cfm.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cfm.this.dT().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cfm.this.dT().a(20));
      }
   }

   class s extends cad {
      private int c = b(100);

      public s(final double $$0) {
         super(cfm.this, $$0);
      }

      @Override
      public boolean b() {
         if (!cfm.this.fI() && this.a.p() == null) {
            if (cfm.this.dQ().ac() && cfm.this.dQ().h(this.a.dq())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               jd $$0 = this.a.dq();
               return cfm.this.dQ().R() && cfm.this.dQ().h($$0) && !((aqt)cfm.this.dQ()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         cfm.this.gA();
         super.d();
      }
   }

   class t extends cfm.d {
      private static final int c = b(140);
      private int d = cfm.this.ah.a(c);

      public t() {
         this.a(EnumSet.of(cak.a.a, cak.a.b, cak.a.c));
      }

      @Override
      public boolean b() {
         return cfm.this.bo == 0.0F && cfm.this.bp == 0.0F && cfm.this.bq == 0.0F ? this.k() || cfm.this.fI() : false;
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
            return cfm.this.dQ().R() && this.h() && !this.i() && !cfm.this.az;
         }
      }

      @Override
      public void e() {
         this.d = cfm.this.ah.a(c);
         cfm.this.gA();
      }

      @Override
      public void d() {
         cfm.this.w(false);
         cfm.this.y(false);
         cfm.this.z(false);
         cfm.this.t(false);
         cfm.this.C(true);
         cfm.this.J().n();
         cfm.this.H().a(cfm.this.dv(), cfm.this.dx(), cfm.this.dB(), 0.0);
      }
   }

   class u extends cak {
      public u() {
         this.a(EnumSet.of(cak.a.a, cak.a.b));
      }

      @Override
      public boolean b() {
         if (cfm.this.fI()) {
            return false;
         } else {
            btl $$0 = cfm.this.p();
            return $$0 != null && $$0.bE() && cfm.co.test($$0) && cfm.this.g((bsq)$$0) > 36.0 && !cfm.this.cb() && !cfm.this.gq() && !cfm.this.bn;
         }
      }

      @Override
      public void d() {
         cfm.this.w(false);
         cfm.this.A(false);
      }

      @Override
      public void e() {
         btl $$0 = cfm.this.p();
         if ($$0 != null && cfm.a(cfm.this, $$0)) {
            cfm.this.z(true);
            cfm.this.y(true);
            cfm.this.J().n();
            cfm.this.F().a($$0, (float)cfm.this.ab(), (float)cfm.this.aa());
         } else {
            cfm.this.z(false);
            cfm.this.y(false);
         }
      }

      @Override
      public void a() {
         btl $$0 = cfm.this.p();
         if ($$0 != null) {
            cfm.this.F().a($$0, (float)cfm.this.ab(), (float)cfm.this.aa());
            if (cfm.this.g((bsq)$$0) <= 36.0) {
               cfm.this.z(true);
               cfm.this.y(true);
               cfm.this.J().n();
            } else {
               cfm.this.J().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azj {
      a(0, "red"),
      b(1, "snow");

      public static final azj.a<cfm.v> c = azj.a(cfm.v::values);
      private static final IntFunction<cfm.v> d = axd.a(cfm.v::a, values(), axd.a.a);
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

      public static cfm.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cfm.v a(int $$0) {
         return d.apply($$0);
      }

      public static cfm.v a(jm<ddu> $$0) {
         return $$0.a(awc.ar) ? b : a;
      }
   }
}
