import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfc extends ces implements buc<cfc.v> {
   private static final ajp<Integer> ce = ajt.a(cfc.class, ajr.b);
   private static final ajp<Byte> cf = ajt.a(cfc.class, ajr.a);
   private static final int cg = 1;
   public static final int ca = 4;
   public static final int cb = 8;
   public static final int cd = 16;
   private static final int ch = 32;
   private static final int ci = 64;
   private static final int cj = 128;
   private static final ajp<Optional<UUID>> ck = ajt.a(cfc.class, ajr.r);
   private static final ajp<Optional<UUID>> cl = ajt.a(cfc.class, ajr.r);
   static final Predicate<civ> cm = $$0 -> !$$0.y() && $$0.bF();
   private static final Predicate<bsh> cn = $$0 -> !($$0 instanceof btc $$1) ? false : $$1.em() != null && $$1.en() < $$1.ai + 600;
   static final Predicate<bsh> co = $$0 -> $$0 instanceof cex || $$0 instanceof cfm;
   private static final Predicate<bsh> cp = $$0 -> !$$0.ca() && bsm.e.test($$0);
   private static final int cq = 600;
   private static final bsk cr = bsn.Q.n().a(0.5F).b(0.2975F);
   private caa cs;
   private caa ct;
   private caa cu;
   private float cv;
   private float cw;
   float cx;
   float cy;
   private int cz;

   public cfc(bsn<? extends cfc> $$0, dcg $$1) {
      super($$0, $$1);
      this.bQ = new cfc.k();
      this.bR = new cfc.m();
      this.a(epa.p, 0.0F);
      this.a(epa.q, 0.0F);
      this.a_(true);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ck, Optional.empty());
      $$0.a(cl, Optional.empty());
      $$0.a(ce, 0);
      $$0.a(cf, (byte)0);
   }

   @Override
   protected void z() {
      this.cs = new cbt<>(this, ces.class, 10, false, false, $$0 -> $$0 instanceof cex || $$0 instanceof cfm);
      this.ct = new cbt<>(this, cft.class, 10, false, false, cft.ca);
      this.cu = new cbt<>(this, cep.class, 20, false, false, $$0 -> $$0 instanceof cer);
      this.bU.a(0, new cfc.g());
      this.bU.a(0, new bzp(this, this.dR()));
      this.bU.a(1, new cfc.b());
      this.bU.a(2, new cfc.n(2.2));
      this.bU.a(3, new cfc.e(1.0));
      this.bU.a(4, new bzh<>(this, cml.class, 16.0F, 1.6, 1.4, $$0 -> cp.test($$0) && !this.c($$0.cB()) && !this.gz()));
      this.bU.a(4, new bzh<>(this, cfv.class, 8.0F, 1.6, 1.4, $$0 -> !((cfv)$$0).s() && !this.gz()));
      this.bU.a(4, new bzh<>(this, cfk.class, 8.0F, 1.6, 1.4, $$0 -> !this.gz()));
      this.bU.a(5, new cfc.u());
      this.bU.a(6, new cfc.o());
      this.bU.a(6, new cfc.s(1.25));
      this.bU.a(7, new cfc.l(1.2F, true));
      this.bU.a(7, new cfc.t());
      this.bU.a(8, new cfc.h(this, 1.25));
      this.bU.a(9, new cfc.q(32, 200));
      this.bU.a(10, new cfc.f(1.2F, 12, 1));
      this.bU.a(10, new cag(this, 0.4F));
      this.bU.a(11, new cbn(this, 1.0));
      this.bU.a(11, new cfc.p());
      this.bU.a(12, new cfc.j(this, cml.class, 24.0F));
      this.bU.a(13, new cfc.r());
      this.bV.a(3, new cfc.a(btc.class, false, false, $$0 -> cn.test($$0) && !this.c($$0.cB())));
   }

   @Override
   public avg d(cud $$0) {
      return avh.jj;
   }

   @Override
   public void m_() {
      if (!this.dR().B && this.bF() && this.dd()) {
         this.cz++;
         cud $$0 = this.a(bso.a);
         if (this.n($$0)) {
            if (this.cz > 600) {
               cud $$1 = $$0.a(this.dR(), this);
               if (!$$1.e()) {
                  this.a(bso.a, $$1);
               }

               this.cz = 0;
            } else if (this.cz > 560 && this.ah.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dR().a(this, (byte)45);
            }
         }

         btc $$2 = this.p();
         if ($$2 == null || !$$2.bF()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fJ() || this.fe()) {
         this.bo = false;
         this.bp = 0.0F;
         this.br = 0.0F;
      }

      super.m_();
      if (this.gz() && this.ah.i() < 0.05F) {
         this.a(avh.jf, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fe() {
      return this.ez();
   }

   private boolean n(cud $$0) {
      return $$0.b(kn.v) && this.p() == null && this.aG() && !this.fJ();
   }

   @Override
   protected void a(ayo $$0, bqf $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cud $$3;
         if ($$2 < 0.05F) {
            $$3 = new cud(cug.oA);
         } else if ($$2 < 0.2F) {
            $$3 = new cud(cug.qR);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cud(cug.uD) : new cud(cug.uE);
         } else if ($$2 < 0.6F) {
            $$3 = new cud(cug.pw);
         } else if ($$2 < 0.8F) {
            $$3 = new cud(cug.qD);
         } else {
            $$3 = new cud(cug.pt);
         }

         this.a(bso.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cud $$1 = this.a(bso.a);
         if (!$$1.e()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               ewh $$3 = new ewh(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dJ() * (float) (Math.PI / 180.0))
                  .b(-this.dH() * (float) (Math.PI / 180.0));
               this.dR().a(new lf(lj.S, $$1), this.dw() + this.bN().c / 2.0, this.dy(), this.dC() + this.bN().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static buj.a s() {
      return bte.A().a(buk.v, 0.3F).a(buk.s, 10.0).a(buk.m, 32.0).a(buk.c, 2.0).a(buk.x, 5.0);
   }

   @Nullable
   public cfc b(aqm $$0, bsb $$1) {
      cfc $$2 = bsn.Q.a((dcg)$$0);
      if ($$2 != null) {
         $$2.a(this.ah.h() ? this.t() : ((cfc)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bsn<cfc> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.ce) && a($$1, $$3);
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      jj<ddg> $$4 = $$0.t(this.dr());
      cfc.v $$5 = cfc.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cfc.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cfc.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof aqm) {
         this.gx();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gx() {
      if (this.t() == cfc.v.a) {
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
   protected void a(cml $$0, bqg $$1, cud $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bsk e(bto $$0) {
      return this.o_() ? cr : super.e($$0);
   }

   public cfc.v t() {
      return cfc.v.a(this.ao.a(ce));
   }

   public void a(cfc.v $$0) {
      this.ao.a(ce, $$0.a());
   }

   List<UUID> gy() {
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
   public void b(tx $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gy();
      ud $$2 = new ud();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(um.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fJ());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.x());
      $$0.a("Crouching", this.cc());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);

      for (uu $$2 : $$0.c("Trusted", 11)) {
         this.b(um.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(cfc.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dR() instanceof aqm) {
         this.gx();
      }
   }

   public boolean x() {
      return this.t(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gn() {
      return this.t(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gz() {
      return this.t(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fJ() {
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
   public boolean f(cud $$0) {
      bso $$1 = this.h($$0);
      return !this.a($$1).e() ? false : $$1 == bso.a && super.f($$0);
   }

   @Override
   public boolean j(cud $$0) {
      cud $$1 = this.a(bso.a);
      return $$1.e() || this.cz > 0 && $$0.b(kn.v) && !$$1.b(kn.v);
   }

   private void p(cud $$0) {
      if (!$$0.e() && !this.dR().B) {
         civ $$1 = new civ(this.dR(), this.dw() + this.bN().c, this.dy() + 1.0, this.dC() + this.bN().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(avh.jo, 1.0F, 1.0F);
         this.dR().b($$1);
      }
   }

   private void q(cud $$0) {
      civ $$1 = new civ(this.dR(), this.dw(), this.dy(), this.dC(), $$0);
      this.dR().b($$1);
   }

   @Override
   protected void b(civ $$0) {
      cud $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.H();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.a(bso.a));
         this.a($$0);
         this.a(bso.a, $$1.a(1));
         this.e(bso.a);
         this.a($$0, $$1.H());
         $$0.aq();
         this.cz = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dd()) {
         boolean $$0 = this.bg();
         if ($$0 || this.p() != null || this.dR().ac()) {
            this.gA();
         }

         if ($$0 || this.fJ()) {
            this.w(false);
         }

         if (this.gn() && this.dR().z.i() < 0.2F) {
            ja $$1 = this.dr();
            dsl $$2 = this.dR().a_($$1);
            this.dR().c(2001, $$1, dfi.i($$2));
         }
      }

      this.cw = this.cv;
      if (this.gw()) {
         this.cv = this.cv + (1.0F - this.cv) * 0.4F;
      } else {
         this.cv = this.cv + (0.0F - this.cv) * 0.4F;
      }

      this.cy = this.cx;
      if (this.cc()) {
         this.cx += 0.2F;
         if (this.cx > 3.0F) {
            this.cx = 3.0F;
         }
      } else {
         this.cx = 0.0F;
      }
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.Z);
   }

   @Override
   protected void a(cml $$0, bte $$1) {
      ((cfc)$$1).b($$0.cB());
   }

   public boolean gt() {
      return this.t(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gu() {
      return this.bo;
   }

   public boolean gv() {
      return this.cx == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean cc() {
      return this.t(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gw() {
      return this.t(8);
   }

   public float H(float $$0) {
      return ayg.i($$0, this.cw, this.cv) * 0.11F * (float) Math.PI;
   }

   public float I(float $$0) {
      return ayg.i($$0, this.cy, this.cx);
   }

   @Override
   public void h(@Nullable btc $$0) {
      if (this.gz() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   void gA() {
      this.C(false);
   }

   void gB() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gC() {
      return !this.fJ() && !this.x() && !this.gn();
   }

   @Override
   public void Q() {
      avg $$0 = this.v();
      if ($$0 == avh.jl) {
         this.a($$0, 2.0F, this.fd());
      } else {
         super.Q();
      }
   }

   @Nullable
   @Override
   protected avg v() {
      if (this.fJ()) {
         return avh.jm;
      } else {
         if (!this.dR().R() && this.ah.i() < 0.1F) {
            List<cml> $$0 = this.dR().a(cml.class, this.cM().c(16.0, 16.0, 16.0), bsm.f);
            if ($$0.isEmpty()) {
               return avh.jl;
            }
         }

         return avh.jg;
      }
   }

   @Nullable
   @Override
   protected avg d(bra $$0) {
      return avh.jk;
   }

   @Nullable
   @Override
   protected avg n_() {
      return avh.ji;
   }

   boolean c(UUID $$0) {
      return this.gy().contains($$0);
   }

   @Override
   protected void a(aqm $$0, bra $$1) {
      cud $$2 = this.a(bso.a);
      if (!$$2.e()) {
         this.b($$2);
         this.a(bso.a, cud.l);
      }

      super.a($$0, $$1);
   }

   public static boolean a(cfc $$0, btc $$1) {
      double $$2 = $$1.dC() - $$0.dC();
      double $$3 = $$1.dw() - $$0.dw();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dR().a_(ja.a($$0.dw() + $$8, $$0.dy() + (double)$$9, $$0.dC() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public ewh cO() {
      return new ewh(0.0, (double)(0.55F * this.cN()), (double)(this.dl() * 0.4F));
   }

   class a extends cbt<btc> {
      @Nullable
      private btc j;
      @Nullable
      private btc k;
      private int l;

      public a(final Class<btc> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<btc> $$3) {
         super(cfc.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.dU().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cfc.this.gy()) {
               if ($$0 != null && cfc.this.dR() instanceof aqm && ((aqm)cfc.this.dR()).a($$0) instanceof btc $$2) {
                  this.k = $$2;
                  this.j = $$2.ek();
                  int $$3 = $$2.el();
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
            this.l = this.k.el();
         }

         cfc.this.a(avh.jf, 1.0F, 1.0F);
         cfc.this.B(true);
         cfc.this.gA();
         super.c();
      }
   }

   class b extends caa {
      int a;

      public b() {
         this.a(EnumSet.of(caa.a.b, caa.a.c, caa.a.a));
      }

      @Override
      public boolean a() {
         return cfc.this.gn();
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
         cfc.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<btc> {
      public boolean a(btc $$0) {
         if ($$0 instanceof cfc) {
            return false;
         } else if ($$0 instanceof cex || $$0 instanceof cfm || $$0 instanceof cjr) {
            return true;
         } else if ($$0 instanceof btz) {
            return !((btz)$$0).s();
         } else if (!($$0 instanceof cml) || !$$0.N_() && !((cml)$$0).f()) {
            return cfc.this.c($$0.cB()) ? false : !$$0.fJ() && !$$0.ca();
         } else {
            return false;
         }
      }
   }

   abstract class d extends caa {
      private final cdt b = cdt.a().a(12.0).d().a(cfc.this.new c());

      protected boolean h() {
         ja $$0 = ja.a(cfc.this.dw(), cfc.this.cM().e, cfc.this.dC());
         return !cfc.this.dR().h($$0) && cfc.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cfc.this.dR().a(btc.class, this.b, cfc.this, cfc.this.cM().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bzm {
      public e(final double $$0) {
         super(cfc.this, $$0);
      }

      @Override
      public void c() {
         ((cfc)this.a).gB();
         ((cfc)this.c).gB();
         super.c();
      }

      @Override
      protected void g() {
         aqm $$0 = (aqm)this.b;
         cfc $$1 = (cfc)this.a.a($$0, (bsb)this.c);
         if ($$1 != null) {
            aqn $$2 = this.a.gq();
            aqn $$3 = this.c.gq();
            aqn $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cB());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cB());
            }

            if ($$4 != null) {
               $$4.a(avr.P);
               am.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gs();
            this.c.gs();
            $$1.c_(-24000);
            $$1.b(this.a.dw(), this.a.dy(), this.a.dC(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.ab().b(dcc.f)) {
               this.b.b(new bss(this.b, this.a.dw(), this.a.dy(), this.a.dC(), this.a.dU().a(7) + 1));
            }
         }
      }
   }

   public class f extends can {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cfc.this, $$1, $$2, $$3);
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
      protected boolean a(dcj $$0, ja $$1) {
         dsl $$2 = $$0.a_($$1);
         return $$2.a(dfk.oi) && $$2.c(dnl.c) >= 2 || dge.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cfc.this.ah.i() < 0.05F) {
            cfc.this.a(avh.jn, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (cfc.this.dR().ab().b(dcc.c)) {
            dsl $$0 = cfc.this.dR().a_(this.e);
            if ($$0.a(dfk.oi)) {
               this.b($$0);
            } else if (dge.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dsl $$0) {
         dge.a(cfc.this, $$0, cfc.this.dR(), this.e);
      }

      private void b(dsl $$0) {
         int $$1 = $$0.c(dnl.c);
         $$0.a(dnl.c, Integer.valueOf(1));
         int $$2 = 1 + cfc.this.dR().z.a(2) + ($$1 == 3 ? 1 : 0);
         cud $$3 = cfc.this.a(bso.a);
         if ($$3.e()) {
            cfc.this.a(bso.a, new cud(cug.wu));
            $$2--;
         }

         if ($$2 > 0) {
            dfi.a(cfc.this.dR(), this.e, new cud(cug.wu, $$2));
         }

         cfc.this.a(avh.zs, 1.0F, 1.0F);
         cfc.this.dR().a(this.e, $$0.a(dnl.c, Integer.valueOf(1)), 2);
         cfc.this.dR().a(dxh.c, this.e, dxh.a.a(cfc.this));
      }

      @Override
      public boolean a() {
         return !cfc.this.fJ() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         cfc.this.w(false);
         super.c();
      }
   }

   class g extends bzu {
      public g() {
         super(cfc.this);
      }

      @Override
      public void c() {
         super.c();
         cfc.this.gB();
      }

      @Override
      public boolean a() {
         return cfc.this.bg() && cfc.this.b(awc.a) > 0.25 || cfc.this.bu();
      }
   }

   class h extends bzz {
      private final cfc d;

      public h(final cfc $$0, final double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return !this.d.gz() && super.a();
      }

      @Override
      public boolean b() {
         return !this.d.gz() && super.b();
      }

      @Override
      public void c() {
         this.d.gB();
         super.c();
      }
   }

   public static class i extends bsb.a {
      public final cfc.v a;

      public i(cfc.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cai {
      public j(final bte $$0, final Class<? extends btc> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !cfc.this.gn() && !cfc.this.gw();
      }

      @Override
      public boolean b() {
         return super.b() && !cfc.this.gn() && !cfc.this.gw();
      }
   }

   public class k extends bzc {
      public k() {
         super(cfc.this);
      }

      @Override
      public void a() {
         if (!cfc.this.fJ()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cfc.this.gt() && !cfc.this.cc() && !cfc.this.gw() && !cfc.this.gn();
      }
   }

   class l extends cak {
      public l(final double $$0, final boolean $$1) {
         super(cfc.this, $$0, $$1);
      }

      @Override
      protected void a(btc $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.D($$0);
            cfc.this.a(avh.jh, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         cfc.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !cfc.this.x() && !cfc.this.fJ() && !cfc.this.cc() && !cfc.this.gn() && super.a();
      }
   }

   class m extends bzd {
      public m() {
         super(cfc.this);
      }

      @Override
      public void a() {
         if (cfc.this.gC()) {
            super.a();
         }
      }
   }

   class n extends cat {
      public n(final double $$0) {
         super(cfc.this, $$0);
      }

      @Override
      public boolean h() {
         return !cfc.this.gz() && super.h();
      }
   }

   public class o extends cae {
      @Override
      public boolean a() {
         if (!cfc.this.gv()) {
            return false;
         } else {
            btc $$0 = cfc.this.p();
            if ($$0 != null && $$0.bF()) {
               if ($$0.cK() != $$0.cJ()) {
                  return false;
               } else {
                  boolean $$1 = cfc.a(cfc.this, $$0);
                  if (!$$1) {
                     cfc.this.J().a($$0, 0);
                     cfc.this.y(false);
                     cfc.this.z(false);
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
         btc $$0 = cfc.this.p();
         if ($$0 != null && $$0.bF()) {
            double $$1 = cfc.this.du().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cfc.this.dJ()) < 15.0F) || !cfc.this.aG()) && !cfc.this.gn();
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
         cfc.this.t(true);
         cfc.this.x(true);
         cfc.this.z(false);
         btc $$0 = cfc.this.p();
         if ($$0 != null) {
            cfc.this.F().a($$0, 60.0F, 30.0F);
            ewh $$1 = new ewh($$0.dw() - cfc.this.dw(), $$0.dy() - cfc.this.dy(), $$0.dC() - cfc.this.dC()).d();
            cfc.this.j(cfc.this.du().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cfc.this.J().n();
      }

      @Override
      public void d() {
         cfc.this.y(false);
         cfc.this.cx = 0.0F;
         cfc.this.cy = 0.0F;
         cfc.this.z(false);
         cfc.this.x(false);
      }

      @Override
      public void e() {
         btc $$0 = cfc.this.p();
         if ($$0 != null) {
            cfc.this.F().a($$0, 60.0F, 30.0F);
         }

         if (!cfc.this.gn()) {
            ewh $$1 = cfc.this.du();
            if ($$1.d * $$1.d < 0.03F && cfc.this.dJ() != 0.0F) {
               cfc.this.t(ayg.j(0.2F, cfc.this.dJ(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cfc.this.t((float)$$3);
            }
         }

         if ($$0 != null && cfc.this.f($$0) <= 2.0F) {
            cfc.this.D($$0);
         } else if (cfc.this.dJ() > 0.0F && cfc.this.aG() && (float)cfc.this.du().d != 0.0F && cfc.this.dR().a_(cfc.this.dr()).a(dfk.dN)) {
            cfc.this.t(60.0F);
            cfc.this.h(null);
            cfc.this.A(true);
         }
      }
   }

   class p extends caa {
      public p() {
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public boolean a() {
         if (!cfc.this.a(bso.a).e()) {
            return false;
         } else if (cfc.this.p() != null || cfc.this.ek() != null) {
            return false;
         } else if (!cfc.this.gC()) {
            return false;
         } else if (cfc.this.dU().a(b(10)) != 0) {
            return false;
         } else {
            List<civ> $$0 = cfc.this.dR().a(civ.class, cfc.this.cM().c(8.0, 8.0, 8.0), cfc.cm);
            return !$$0.isEmpty() && cfc.this.a(bso.a).e();
         }
      }

      @Override
      public void e() {
         List<civ> $$0 = cfc.this.dR().a(civ.class, cfc.this.cM().c(8.0, 8.0, 8.0), cfc.cm);
         cud $$1 = cfc.this.a(bso.a);
         if ($$1.e() && !$$0.isEmpty()) {
            cfc.this.J().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<civ> $$0 = cfc.this.dR().a(civ.class, cfc.this.cM().c(8.0, 8.0, 8.0), cfc.cm);
         if (!$$0.isEmpty()) {
            cfc.this.J().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cbg {
      public q(final int $$0, final int $$1) {
         super(cfc.this, $$1);
      }

      @Override
      public void c() {
         cfc.this.gB();
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
         return !cfc.this.fJ() && !cfc.this.x() && !cfc.this.gz() && cfc.this.p() == null;
      }
   }

   class r extends cfc.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(caa.a.a, caa.a.b));
      }

      @Override
      public boolean a() {
         return cfc.this.ek() == null
            && cfc.this.dU().i() < 0.02F
            && !cfc.this.fJ()
            && cfc.this.p() == null
            && cfc.this.J().l()
            && !this.i()
            && !cfc.this.gt()
            && !cfc.this.cc();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + cfc.this.dU().a(3);
         cfc.this.w(true);
         cfc.this.J().n();
      }

      @Override
      public void d() {
         cfc.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cfc.this.F().a(cfc.this.dw() + this.c, cfc.this.dA(), cfc.this.dC() + this.d, (float)cfc.this.ab(), (float)cfc.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cfc.this.dU().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cfc.this.dU().a(20));
      }
   }

   class s extends bzt {
      private int c = b(100);

      public s(final double $$0) {
         super(cfc.this, $$0);
      }

      @Override
      public boolean a() {
         if (!cfc.this.fJ() && this.a.p() == null) {
            if (cfc.this.dR().ac() && cfc.this.dR().h(this.a.dr())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ja $$0 = this.a.dr();
               return cfc.this.dR().R() && cfc.this.dR().h($$0) && !((aqm)cfc.this.dR()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         cfc.this.gB();
         super.c();
      }
   }

   class t extends cfc.d {
      private static final int c = b(140);
      private int d = cfc.this.ah.a(c);

      public t() {
         this.a(EnumSet.of(caa.a.a, caa.a.b, caa.a.c));
      }

      @Override
      public boolean a() {
         return cfc.this.bp == 0.0F && cfc.this.bq == 0.0F && cfc.this.br == 0.0F ? this.k() || cfc.this.fJ() : false;
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
            return cfc.this.dR().R() && this.h() && !this.i() && !cfc.this.aB;
         }
      }

      @Override
      public void d() {
         this.d = cfc.this.ah.a(c);
         cfc.this.gB();
      }

      @Override
      public void c() {
         cfc.this.w(false);
         cfc.this.y(false);
         cfc.this.z(false);
         cfc.this.t(false);
         cfc.this.C(true);
         cfc.this.J().n();
         cfc.this.H().a(cfc.this.dw(), cfc.this.dy(), cfc.this.dC(), 0.0);
      }
   }

   class u extends caa {
      public u() {
         this.a(EnumSet.of(caa.a.a, caa.a.b));
      }

      @Override
      public boolean a() {
         if (cfc.this.fJ()) {
            return false;
         } else {
            btc $$0 = cfc.this.p();
            return $$0 != null && $$0.bF() && cfc.co.test($$0) && cfc.this.g((bsh)$$0) > 36.0 && !cfc.this.cc() && !cfc.this.gw() && !cfc.this.bo;
         }
      }

      @Override
      public void c() {
         cfc.this.w(false);
         cfc.this.A(false);
      }

      @Override
      public void d() {
         btc $$0 = cfc.this.p();
         if ($$0 != null && cfc.a(cfc.this, $$0)) {
            cfc.this.z(true);
            cfc.this.y(true);
            cfc.this.J().n();
            cfc.this.F().a($$0, (float)cfc.this.ab(), (float)cfc.this.aa());
         } else {
            cfc.this.z(false);
            cfc.this.y(false);
         }
      }

      @Override
      public void e() {
         btc $$0 = cfc.this.p();
         if ($$0 != null) {
            cfc.this.F().a($$0, (float)cfc.this.ab(), (float)cfc.this.aa());
            if (cfc.this.g((bsh)$$0) <= 36.0) {
               cfc.this.z(true);
               cfc.this.y(true);
               cfc.this.J().n();
            } else {
               cfc.this.J().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azc {
      a(0, "red"),
      b(1, "snow");

      public static final azc.a<cfc.v> c = azc.a(cfc.v::values);
      private static final IntFunction<cfc.v> d = aww.a(cfc.v::a, values(), aww.a.a);
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

      public static cfc.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cfc.v a(int $$0) {
         return d.apply($$0);
      }

      public static cfc.v a(jj<ddg> $$0) {
         return $$0.a(avv.ar) ? b : a;
      }
   }
}
