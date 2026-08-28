import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cey extends ceo implements bty<cey.v> {
   private static final ajp<Integer> ce = ajt.a(cey.class, ajr.b);
   private static final ajp<Byte> cf = ajt.a(cey.class, ajr.a);
   private static final int cg = 1;
   public static final int ca = 4;
   public static final int cb = 8;
   public static final int cd = 16;
   private static final int ch = 32;
   private static final int ci = 64;
   private static final int cj = 128;
   private static final ajp<Optional<UUID>> ck = ajt.a(cey.class, ajr.r);
   private static final ajp<Optional<UUID>> cl = ajt.a(cey.class, ajr.r);
   static final Predicate<cir> cm = $$0 -> !$$0.y() && $$0.bD();
   private static final Predicate<bsd> cn = $$0 -> !($$0 instanceof bsy $$1) ? false : $$1.ek() != null && $$1.el() < $$1.ai + 600;
   static final Predicate<bsd> co = $$0 -> $$0 instanceof cet || $$0 instanceof cfi;
   private static final Predicate<bsd> cp = $$0 -> !$$0.bY() && bsi.e.test($$0);
   private static final int cq = 600;
   private static final bsg cr = bsj.Q.n().a(0.5F).b(0.2975F);
   private bzw cs;
   private bzw ct;
   private bzw cu;
   private float cv;
   private float cw;
   float cx;
   float cy;
   private int cz;

   public cey(bsj<? extends cey> $$0, dcd $$1) {
      super($$0, $$1);
      this.bQ = new cey.k();
      this.bR = new cey.m();
      this.a(eos.p, 0.0F);
      this.a(eos.q, 0.0F);
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
      this.cs = new cbp<>(this, ceo.class, 10, false, false, $$0 -> $$0 instanceof cet || $$0 instanceof cfi);
      this.ct = new cbp<>(this, cfp.class, 10, false, false, cfp.ca);
      this.cu = new cbp<>(this, cel.class, 20, false, false, $$0 -> $$0 instanceof cen);
      this.bU.a(0, new cey.g());
      this.bU.a(0, new bzl(this, this.dP()));
      this.bU.a(1, new cey.b());
      this.bU.a(2, new cey.n(2.2));
      this.bU.a(3, new cey.e(1.0));
      this.bU.a(4, new bzd<>(this, cmh.class, 16.0F, 1.6, 1.4, $$0 -> cp.test($$0) && !this.c($$0.cz()) && !this.gz()));
      this.bU.a(4, new bzd<>(this, cfr.class, 8.0F, 1.6, 1.4, $$0 -> !((cfr)$$0).s() && !this.gz()));
      this.bU.a(4, new bzd<>(this, cfg.class, 8.0F, 1.6, 1.4, $$0 -> !this.gz()));
      this.bU.a(5, new cey.u());
      this.bU.a(6, new cey.o());
      this.bU.a(6, new cey.s(1.25));
      this.bU.a(7, new cey.l(1.2F, true));
      this.bU.a(7, new cey.t());
      this.bU.a(8, new cey.h(this, 1.25));
      this.bU.a(9, new cey.q(32, 200));
      this.bU.a(10, new cey.f(1.2F, 12, 1));
      this.bU.a(10, new cac(this, 0.4F));
      this.bU.a(11, new cbj(this, 1.0));
      this.bU.a(11, new cey.p());
      this.bU.a(12, new cey.j(this, cmh.class, 24.0F));
      this.bU.a(13, new cey.r());
      this.bV.a(3, new cey.a(bsy.class, false, false, $$0 -> cn.test($$0) && !this.c($$0.cz())));
   }

   @Override
   public ave d(cua $$0) {
      return avf.jj;
   }

   @Override
   public void n_() {
      if (!this.dP().B && this.bD() && this.db()) {
         this.cz++;
         cua $$0 = this.a(bsk.a);
         if (this.n($$0)) {
            if (this.cz > 600) {
               cua $$1 = $$0.a(this.dP(), this);
               if (!$$1.e()) {
                  this.a(bsk.a, $$1);
               }

               this.cz = 0;
            } else if (this.cz > 560 && this.ah.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dP().a(this, (byte)45);
            }
         }

         bsy $$2 = this.p();
         if ($$2 == null || !$$2.bD()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fH() || this.fc()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      }

      super.n_();
      if (this.gz() && this.ah.i() < 0.05F) {
         this.a(avf.jf, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fc() {
      return this.ex();
   }

   private boolean n(cua $$0) {
      return $$0.b(kn.v) && this.p() == null && this.aE() && !this.fH();
   }

   @Override
   protected void a(aym $$0, bqb $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cua $$3;
         if ($$2 < 0.05F) {
            $$3 = new cua(cud.oz);
         } else if ($$2 < 0.2F) {
            $$3 = new cua(cud.qR);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cua(cud.uD) : new cua(cud.uE);
         } else if ($$2 < 0.6F) {
            $$3 = new cua(cud.pw);
         } else if ($$2 < 0.8F) {
            $$3 = new cua(cud.qD);
         } else {
            $$3 = new cua(cud.pt);
         }

         this.a(bsk.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cua $$1 = this.a(bsk.a);
         if (!$$1.e()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               evz $$3 = new evz(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dH() * (float) (Math.PI / 180.0))
                  .b(-this.dF() * (float) (Math.PI / 180.0));
               this.dP().a(new lf(lj.S, $$1), this.du() + this.bL().c / 2.0, this.dw(), this.dA() + this.bL().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static buf.a s() {
      return bta.A().a(bug.v, 0.3F).a(bug.s, 10.0).a(bug.m, 32.0).a(bug.c, 2.0).a(bug.x, 5.0);
   }

   @Nullable
   public cey b(aqk $$0, brx $$1) {
      cey $$2 = bsj.Q.a((dcd)$$0);
      if ($$2 != null) {
         $$2.a(this.ah.h() ? this.u() : ((cey)$$1).u());
      }

      return $$2;
   }

   public static boolean c(bsj<cey> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avu.ce) && a($$1, $$3);
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      jj<ddd> $$4 = $$0.t(this.dp());
      cey.v $$5 = cey.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cey.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cey.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof aqk) {
         this.gx();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gx() {
      if (this.u() == cey.v.a) {
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
   protected void a(cmh $$0, bqc $$1, cua $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bsg e(btk $$0) {
      return this.p_() ? cr : super.e($$0);
   }

   public cey.v u() {
      return cey.v.a(this.ao.a(ce));
   }

   public void a(cey.v $$0) {
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
      $$0.a("Sleeping", this.fH());
      $$0.a("Type", this.u().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.ca());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);

      for (uu $$2 : $$0.c("Trusted", 11)) {
         this.b(um.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(cey.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dP() instanceof aqk) {
         this.gx();
      }
   }

   public boolean y() {
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
   public boolean fH() {
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
   public boolean f(cua $$0) {
      bsk $$1 = bta.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsk.a && super.f($$0);
   }

   @Override
   public boolean j(cua $$0) {
      cua $$1 = this.a(bsk.a);
      return $$1.e() || this.cz > 0 && $$0.b(kn.v) && !$$1.b(kn.v);
   }

   private void p(cua $$0) {
      if (!$$0.e() && !this.dP().B) {
         cir $$1 = new cir(this.dP(), this.du() + this.bL().c, this.dw() + 1.0, this.dA() + this.bL().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(avf.jo, 1.0F, 1.0F);
         this.dP().b($$1);
      }
   }

   private void q(cua $$0) {
      cir $$1 = new cir(this.dP(), this.du(), this.dw(), this.dA(), $$0);
      this.dP().b($$1);
   }

   @Override
   protected void b(cir $$0) {
      cua $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.H();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.a(bsk.a));
         this.a($$0);
         this.a(bsk.a, $$1.a(1));
         this.f(bsk.a);
         this.a($$0, $$1.H());
         $$0.ao();
         this.cz = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.db()) {
         boolean $$0 = this.be();
         if ($$0 || this.p() != null || this.dP().ac()) {
            this.gA();
         }

         if ($$0 || this.fH()) {
            this.w(false);
         }

         if (this.gn() && this.dP().z.i() < 0.2F) {
            ja $$1 = this.dp();
            dsh $$2 = this.dP().a_($$1);
            this.dP().c(2001, $$1, dff.i($$2));
         }
      }

      this.cw = this.cv;
      if (this.gw()) {
         this.cv = this.cv + (1.0F - this.cv) * 0.4F;
      } else {
         this.cv = this.cv + (0.0F - this.cv) * 0.4F;
      }

      this.cy = this.cx;
      if (this.ca()) {
         this.cx += 0.2F;
         if (this.cx > 3.0F) {
            this.cx = 3.0F;
         }
      } else {
         this.cx = 0.0F;
      }
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.Z);
   }

   @Override
   protected void a(cmh $$0, bta $$1) {
      ((cey)$$1).b($$0.cz());
   }

   public boolean gt() {
      return this.t(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gu() {
      return this.bn;
   }

   public boolean gv() {
      return this.cx == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean ca() {
      return this.t(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gw() {
      return this.t(8);
   }

   public float H(float $$0) {
      return aye.i($$0, this.cw, this.cv) * 0.11F * (float) Math.PI;
   }

   public float I(float $$0) {
      return aye.i($$0, this.cy, this.cx);
   }

   @Override
   public void h(@Nullable bsy $$0) {
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
      return !this.fH() && !this.y() && !this.gn();
   }

   @Override
   public void Q() {
      ave $$0 = this.v();
      if ($$0 == avf.jl) {
         this.a($$0, 2.0F, this.fb());
      } else {
         super.Q();
      }
   }

   @Nullable
   @Override
   protected ave v() {
      if (this.fH()) {
         return avf.jm;
      } else {
         if (!this.dP().R() && this.ah.i() < 0.1F) {
            List<cmh> $$0 = this.dP().a(cmh.class, this.cK().c(16.0, 16.0, 16.0), bsi.f);
            if ($$0.isEmpty()) {
               return avf.jl;
            }
         }

         return avf.jg;
      }
   }

   @Nullable
   @Override
   protected ave d(bqw $$0) {
      return avf.jk;
   }

   @Nullable
   @Override
   protected ave o_() {
      return avf.ji;
   }

   boolean c(UUID $$0) {
      return this.gy().contains($$0);
   }

   @Override
   protected void g(bqw $$0) {
      cua $$1 = this.a(bsk.a);
      if (!$$1.e()) {
         this.b($$1);
         this.a(bsk.a, cua.l);
      }

      super.g($$0);
   }

   public static boolean a(cey $$0, bsy $$1) {
      double $$2 = $$1.dA() - $$0.dA();
      double $$3 = $$1.du() - $$0.du();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dP().a_(ja.a($$0.du() + $$8, $$0.dw() + (double)$$9, $$0.dA() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public evz cM() {
      return new evz(0.0, (double)(0.55F * this.cL()), (double)(this.dj() * 0.4F));
   }

   class a extends cbp<bsy> {
      @Nullable
      private bsy j;
      @Nullable
      private bsy k;
      private int l;

      public a(final Class<bsy> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<bsy> $$3) {
         super(cey.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.dS().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cey.this.gy()) {
               if ($$0 != null && cey.this.dP() instanceof aqk && ((aqk)cey.this.dP()).a($$0) instanceof bsy $$2) {
                  this.k = $$2;
                  this.j = $$2.ei();
                  int $$3 = $$2.ej();
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
            this.l = this.k.ej();
         }

         cey.this.a(avf.jf, 1.0F, 1.0F);
         cey.this.B(true);
         cey.this.gA();
         super.c();
      }
   }

   class b extends bzw {
      int a;

      public b() {
         this.a(EnumSet.of(bzw.a.b, bzw.a.c, bzw.a.a));
      }

      @Override
      public boolean a() {
         return cey.this.gn();
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
         cey.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bsy> {
      public boolean a(bsy $$0) {
         if ($$0 instanceof cey) {
            return false;
         } else if ($$0 instanceof cet || $$0 instanceof cfi || $$0 instanceof cjn) {
            return true;
         } else if ($$0 instanceof btv) {
            return !((btv)$$0).s();
         } else if (!($$0 instanceof cmh) || !$$0.N_() && !((cmh)$$0).f()) {
            return cey.this.c($$0.cz()) ? false : !$$0.fH() && !$$0.bY();
         } else {
            return false;
         }
      }
   }

   abstract class d extends bzw {
      private final cdp b = cdp.a().a(12.0).d().a(cey.this.new c());

      protected boolean h() {
         ja $$0 = ja.a(cey.this.du(), cey.this.cK().e, cey.this.dA());
         return !cey.this.dP().h($$0) && cey.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cey.this.dP().a(bsy.class, this.b, cey.this, cey.this.cK().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bzi {
      public e(final double $$0) {
         super(cey.this, $$0);
      }

      @Override
      public void c() {
         ((cey)this.a).gB();
         ((cey)this.c).gB();
         super.c();
      }

      @Override
      protected void g() {
         aqk $$0 = (aqk)this.b;
         cey $$1 = (cey)this.a.a($$0, (brx)this.c);
         if ($$1 != null) {
            aql $$2 = this.a.gq();
            aql $$3 = this.c.gq();
            aql $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cz());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cz());
            }

            if ($$4 != null) {
               $$4.a(avp.P);
               am.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gs();
            this.c.gs();
            $$1.c_(-24000);
            $$1.b(this.a.du(), this.a.dw(), this.a.dA(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.ab().b(dbz.f)) {
               this.b.b(new bso(this.b, this.a.du(), this.a.dw(), this.a.dA(), this.a.dS().a(7) + 1));
            }
         }
      }
   }

   public class f extends caj {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cey.this, $$1, $$2, $$3);
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
      protected boolean a(dcg $$0, ja $$1) {
         dsh $$2 = $$0.a_($$1);
         return $$2.a(dfh.oi) && $$2.c(dni.c) >= 2 || dgb.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cey.this.ah.i() < 0.05F) {
            cey.this.a(avf.jn, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (cey.this.dP().ab().b(dbz.c)) {
            dsh $$0 = cey.this.dP().a_(this.e);
            if ($$0.a(dfh.oi)) {
               this.b($$0);
            } else if (dgb.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dsh $$0) {
         dgb.a(cey.this, $$0, cey.this.dP(), this.e);
      }

      private void b(dsh $$0) {
         int $$1 = $$0.c(dni.c);
         $$0.a(dni.c, Integer.valueOf(1));
         int $$2 = 1 + cey.this.dP().z.a(2) + ($$1 == 3 ? 1 : 0);
         cua $$3 = cey.this.a(bsk.a);
         if ($$3.e()) {
            cey.this.a(bsk.a, new cua(cud.wu));
            $$2--;
         }

         if ($$2 > 0) {
            dff.a(cey.this.dP(), this.e, new cua(cud.wu, $$2));
         }

         cey.this.a(avf.zs, 1.0F, 1.0F);
         cey.this.dP().a(this.e, $$0.a(dni.c, Integer.valueOf(1)), 2);
         cey.this.dP().a(dxa.c, this.e, dxa.a.a(cey.this));
      }

      @Override
      public boolean a() {
         return !cey.this.fH() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         cey.this.w(false);
         super.c();
      }
   }

   class g extends bzq {
      public g() {
         super(cey.this);
      }

      @Override
      public void c() {
         super.c();
         cey.this.gB();
      }

      @Override
      public boolean a() {
         return cey.this.be() && cey.this.b(awa.a) > 0.25 || cey.this.bs();
      }
   }

   class h extends bzv {
      private final cey d;

      public h(final cey $$0, final double $$1) {
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

   public static class i extends brx.a {
      public final cey.v a;

      public i(cey.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cae {
      public j(final bta $$0, final Class<? extends bsy> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !cey.this.gn() && !cey.this.gw();
      }

      @Override
      public boolean b() {
         return super.b() && !cey.this.gn() && !cey.this.gw();
      }
   }

   public class k extends byy {
      public k() {
         super(cey.this);
      }

      @Override
      public void a() {
         if (!cey.this.fH()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cey.this.gt() && !cey.this.ca() && !cey.this.gw() && !cey.this.gn();
      }
   }

   class l extends cag {
      public l(final double $$0, final boolean $$1) {
         super(cey.this, $$0, $$1);
      }

      @Override
      protected void a(bsy $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.D($$0);
            cey.this.a(avf.jh, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         cey.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !cey.this.y() && !cey.this.fH() && !cey.this.ca() && !cey.this.gn() && super.a();
      }
   }

   class m extends byz {
      public m() {
         super(cey.this);
      }

      @Override
      public void a() {
         if (cey.this.gC()) {
            super.a();
         }
      }
   }

   class n extends cap {
      public n(final double $$0) {
         super(cey.this, $$0);
      }

      @Override
      public boolean h() {
         return !cey.this.gz() && super.h();
      }
   }

   public class o extends caa {
      @Override
      public boolean a() {
         if (!cey.this.gv()) {
            return false;
         } else {
            bsy $$0 = cey.this.p();
            if ($$0 != null && $$0.bD()) {
               if ($$0.cI() != $$0.cH()) {
                  return false;
               } else {
                  boolean $$1 = cey.a(cey.this, $$0);
                  if (!$$1) {
                     cey.this.K().a($$0, 0);
                     cey.this.y(false);
                     cey.this.z(false);
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
         bsy $$0 = cey.this.p();
         if ($$0 != null && $$0.bD()) {
            double $$1 = cey.this.ds().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cey.this.dH()) < 15.0F) || !cey.this.aE()) && !cey.this.gn();
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
         cey.this.s(true);
         cey.this.x(true);
         cey.this.z(false);
         bsy $$0 = cey.this.p();
         if ($$0 != null) {
            cey.this.G().a($$0, 60.0F, 30.0F);
            evz $$1 = new evz($$0.du() - cey.this.du(), $$0.dw() - cey.this.dw(), $$0.dA() - cey.this.dA()).d();
            cey.this.h(cey.this.ds().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cey.this.K().n();
      }

      @Override
      public void d() {
         cey.this.y(false);
         cey.this.cx = 0.0F;
         cey.this.cy = 0.0F;
         cey.this.z(false);
         cey.this.x(false);
      }

      @Override
      public void e() {
         bsy $$0 = cey.this.p();
         if ($$0 != null) {
            cey.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!cey.this.gn()) {
            evz $$1 = cey.this.ds();
            if ($$1.d * $$1.d < 0.03F && cey.this.dH() != 0.0F) {
               cey.this.t(aye.j(0.2F, cey.this.dH(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cey.this.t((float)$$3);
            }
         }

         if ($$0 != null && cey.this.f($$0) <= 2.0F) {
            cey.this.D($$0);
         } else if (cey.this.dH() > 0.0F && cey.this.aE() && (float)cey.this.ds().d != 0.0F && cey.this.dP().a_(cey.this.dp()).a(dfh.dN)) {
            cey.this.t(60.0F);
            cey.this.h(null);
            cey.this.A(true);
         }
      }
   }

   class p extends bzw {
      public p() {
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean a() {
         if (!cey.this.a(bsk.a).e()) {
            return false;
         } else if (cey.this.p() != null || cey.this.ei() != null) {
            return false;
         } else if (!cey.this.gC()) {
            return false;
         } else if (cey.this.dS().a(b(10)) != 0) {
            return false;
         } else {
            List<cir> $$0 = cey.this.dP().a(cir.class, cey.this.cK().c(8.0, 8.0, 8.0), cey.cm);
            return !$$0.isEmpty() && cey.this.a(bsk.a).e();
         }
      }

      @Override
      public void e() {
         List<cir> $$0 = cey.this.dP().a(cir.class, cey.this.cK().c(8.0, 8.0, 8.0), cey.cm);
         cua $$1 = cey.this.a(bsk.a);
         if ($$1.e() && !$$0.isEmpty()) {
            cey.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cir> $$0 = cey.this.dP().a(cir.class, cey.this.cK().c(8.0, 8.0, 8.0), cey.cm);
         if (!$$0.isEmpty()) {
            cey.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cbc {
      public q(final int $$0, final int $$1) {
         super(cey.this, $$1);
      }

      @Override
      public void c() {
         cey.this.gB();
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
         return !cey.this.fH() && !cey.this.y() && !cey.this.gz() && cey.this.p() == null;
      }
   }

   class r extends cey.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bzw.a.a, bzw.a.b));
      }

      @Override
      public boolean a() {
         return cey.this.ei() == null
            && cey.this.dS().i() < 0.02F
            && !cey.this.fH()
            && cey.this.p() == null
            && cey.this.K().l()
            && !this.i()
            && !cey.this.gt()
            && !cey.this.ca();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + cey.this.dS().a(3);
         cey.this.w(true);
         cey.this.K().n();
      }

      @Override
      public void d() {
         cey.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cey.this.G().a(cey.this.du() + this.c, cey.this.dy(), cey.this.dA() + this.d, (float)cey.this.ab(), (float)cey.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cey.this.dS().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cey.this.dS().a(20));
      }
   }

   class s extends bzp {
      private int c = b(100);

      public s(final double $$0) {
         super(cey.this, $$0);
      }

      @Override
      public boolean a() {
         if (!cey.this.fH() && this.a.p() == null) {
            if (cey.this.dP().ac() && cey.this.dP().h(this.a.dp())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               ja $$0 = this.a.dp();
               return cey.this.dP().R() && cey.this.dP().h($$0) && !((aqk)cey.this.dP()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         cey.this.gB();
         super.c();
      }
   }

   class t extends cey.d {
      private static final int c = b(140);
      private int d = cey.this.ah.a(c);

      public t() {
         this.a(EnumSet.of(bzw.a.a, bzw.a.b, bzw.a.c));
      }

      @Override
      public boolean a() {
         return cey.this.bo == 0.0F && cey.this.bp == 0.0F && cey.this.bq == 0.0F ? this.k() || cey.this.fH() : false;
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
            return cey.this.dP().R() && this.h() && !this.i() && !cey.this.aB;
         }
      }

      @Override
      public void d() {
         this.d = cey.this.ah.a(c);
         cey.this.gB();
      }

      @Override
      public void c() {
         cey.this.w(false);
         cey.this.y(false);
         cey.this.z(false);
         cey.this.s(false);
         cey.this.C(true);
         cey.this.K().n();
         cey.this.H().a(cey.this.du(), cey.this.dw(), cey.this.dA(), 0.0);
      }
   }

   class u extends bzw {
      public u() {
         this.a(EnumSet.of(bzw.a.a, bzw.a.b));
      }

      @Override
      public boolean a() {
         if (cey.this.fH()) {
            return false;
         } else {
            bsy $$0 = cey.this.p();
            return $$0 != null && $$0.bD() && cey.co.test($$0) && cey.this.g($$0) > 36.0 && !cey.this.ca() && !cey.this.gw() && !cey.this.bn;
         }
      }

      @Override
      public void c() {
         cey.this.w(false);
         cey.this.A(false);
      }

      @Override
      public void d() {
         bsy $$0 = cey.this.p();
         if ($$0 != null && cey.a(cey.this, $$0)) {
            cey.this.z(true);
            cey.this.y(true);
            cey.this.K().n();
            cey.this.G().a($$0, (float)cey.this.ab(), (float)cey.this.aa());
         } else {
            cey.this.z(false);
            cey.this.y(false);
         }
      }

      @Override
      public void e() {
         bsy $$0 = cey.this.p();
         if ($$0 != null) {
            cey.this.G().a($$0, (float)cey.this.ab(), (float)cey.this.aa());
            if (cey.this.g($$0) <= 36.0) {
               cey.this.z(true);
               cey.this.y(true);
               cey.this.K().n();
            } else {
               cey.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements ayz {
      a(0, "red"),
      b(1, "snow");

      public static final ayz.a<cey.v> c = ayz.a(cey.v::values);
      private static final IntFunction<cey.v> d = awu.a(cey.v::a, values(), awu.a.a);
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

      public static cey.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cey.v a(int $$0) {
         return d.apply($$0);
      }

      public static cey.v a(jj<ddd> $$0) {
         return $$0.a(avt.ar) ? b : a;
      }
   }
}
