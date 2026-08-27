import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class ckr extends cld {
   private static final double g = 2.0;
   private static final ajk<Byte> h = ajo.a(ckr.class, ajm.a);
   private static final ajk<Byte> i = ajo.a(ckr.class, ajm.a);
   private static final int j = 1;
   private static final int k = 2;
   private static final int l = 4;
   @Nullable
   private dpy m;
   protected boolean b;
   protected int c;
   public ckr.a d = ckr.a.a;
   public int e;
   private int n;
   private double o = 2.0;
   private int p;
   private auy q = this.r();
   @Nullable
   private IntOpenHashSet r;
   @Nullable
   private List<bql> s;
   private csd t = this.x();

   protected ckr(bqr<? extends ckr> $$0, czu $$1) {
      super($$0, $$1);
   }

   protected ckr(bqr<? extends ckr> $$0, czu $$1, csd $$2) {
      this($$0, $$1);
      this.t = $$2.r();
      this.b($$2.a(jz.d));
      ayy $$3 = $$2.c(jz.o);
      if ($$3 != null) {
         this.d = ckr.a.c;
      }
   }

   protected ckr(bqr<? extends ckr> $$0, double $$1, double $$2, double $$3, czu $$4, csd $$5) {
      this($$0, $$4, $$5);
      this.a_($$1, $$2, $$3);
   }

   protected ckr(bqr<? extends ckr> $$0, bre $$1, czu $$2, csd $$3) {
      this($$0, $$1.ds(), $$1.dw() - 0.1F, $$1.dy(), $$2, $$3);
      this.c($$1);
   }

   public void b(auy $$0) {
      this.q = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cI().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cB();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(ajo.a $$0) {
      $$0.a(h, (byte)0);
      $$0.a(i, (byte)0);
   }

   @Override
   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      super.c($$0, $$1, $$2, $$3, $$4);
      this.n = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      super.l($$0, $$1, $$2);
      this.n = 0;
   }

   @Override
   public void l() {
      super.l();
      boolean $$0 = this.G();
      etf $$1 = this.dq();
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$2 = $$1.h();
         this.r((float)(axw.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.s((float)(axw.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dD();
         this.P = this.dF();
      }

      im $$3 = this.dn();
      dpy $$4 = this.dN().a_($$3);
      if (!$$4.i() && !$$0) {
         ety $$5 = $$4.k(this.dN(), $$3);
         if (!$$5.c()) {
            etf $$6 = this.dl();

            for (eta $$7 : $$5.e()) {
               if ($$7.a($$3).d($$6)) {
                  this.b = true;
                  break;
               }
            }
         }
      }

      if (this.e > 0) {
         this.e--;
      }

      if (this.bd() || $$4.a(dcx.qP)) {
         this.aA();
      }

      if (this.b && !$$0) {
         if (this.m != $$4 && this.H()) {
            this.K();
         } else if (!this.dN().B) {
            this.p();
         }

         this.c++;
      } else {
         this.c = 0;
         etf $$8 = this.dl();
         etf $$9 = $$8.e($$1);
         etd $$10 = this.dN().a(new czd($$8, $$9, czd.a.a, czd.b.a, this));
         if ($$10.c() != etd.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dI() && !this.f) {
            etc $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == etd.a.c) {
               bql $$12 = ((etc)$$10).a();
               bql $$13 = this.u();
               if ($$12 instanceof ckl && $$13 instanceof ckl && !((ckl)$$13).a((ckl)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               this.a($$10);
               this.av = true;
            }

            if ($$11 == null || this.D() <= 0) {
               break;
            }

            $$10 = null;
         }

         this.f = false;
         $$1 = this.dq();
         double $$14 = $$1.c;
         double $$15 = $$1.d;
         double $$16 = $$1.e;
         if (this.B()) {
            for (int $$17 = 0; $$17 < 4; $$17++) {
               this.dN()
                  .a(
                     kw.f,
                     this.ds() + $$14 * (double)$$17 / 4.0,
                     this.du() + $$15 * (double)$$17 / 4.0,
                     this.dy() + $$16 * (double)$$17 / 4.0,
                     -$$14,
                     -$$15 + 0.2,
                     -$$16
                  );
            }
         }

         double $$18 = this.ds() + $$14;
         double $$19 = this.du() + $$15;
         double $$20 = this.dy() + $$16;
         double $$21 = $$1.h();
         if ($$0) {
            this.r((float)(axw.d(-$$14, -$$16) * 180.0F / (float)Math.PI));
         } else {
            this.r((float)(axw.d($$14, $$16) * 180.0F / (float)Math.PI));
         }

         this.s((float)(axw.d($$15, $$21) * 180.0F / (float)Math.PI));
         this.s(d(this.P, this.dF()));
         this.r(d(this.O, this.dD()));
         float $$22 = 0.99F;
         if (this.bc()) {
            for (int $$23 = 0; $$23 < 4; $$23++) {
               float $$24 = 0.25F;
               this.dN().a(kw.d, $$18 - $$14 * 0.25, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$14, $$15, $$16);
            }

            $$22 = this.E();
         }

         this.g($$1.a((double)$$22));
         if (!$$0) {
            this.aY();
         }

         this.a_($$18, $$19, $$20);
         this.aQ();
      }
   }

   @Override
   protected double aW() {
      return 0.05;
   }

   private boolean H() {
      return this.b && this.dN().b(new eta(this.dl(), this.dl()).g(0.06));
   }

   private void K() {
      this.b = false;
      etf $$0 = this.dq();
      this.g($$0.d((double)(this.ah.i() * 0.2F), (double)(this.ah.i() * 0.2F), (double)(this.ah.i() * 0.2F)));
      this.n = 0;
   }

   @Override
   public void a(brj $$0, etf $$1) {
      super.a($$0, $$1);
      if ($$0 != brj.a && this.H()) {
         this.K();
      }
   }

   protected void p() {
      this.n++;
      if (this.n >= 1200) {
         this.am();
      }
   }

   private void M() {
      if (this.s != null) {
         this.s.clear();
      }

      if (this.r != null) {
         this.r.clear();
      }
   }

   @Override
   protected void a(etc $$0) {
      super.a($$0);
      bql $$1 = $$0.a();
      float $$2 = (float)this.dq().f();
      int $$3 = axw.c(axw.a((double)$$2 * this.o, 0.0, 2.147483647E9));
      if (this.D() > 0) {
         if (this.r == null) {
            this.r = new IntOpenHashSet(5);
         }

         if (this.s == null) {
            this.s = Lists.newArrayListWithCapacity(5);
         }

         if (this.r.size() >= this.D() + 1) {
            this.am();
            return;
         }

         this.r.add($$1.aj());
      }

      if (this.B()) {
         long $$4 = (long)this.ah.a($$3 / 2 + 2);
         $$3 = (int)Math.min($$4 + (long)$$3, 2147483647L);
      }

      bql $$5 = this.u();
      bpj $$6;
      if ($$5 == null) {
         $$6 = this.dO().a(this, this);
      } else {
         $$6 = this.dO().a(this, $$5);
         if ($$5 instanceof bre) {
            ((bre)$$5).A($$1);
         }
      }

      boolean $$8 = $$1.ai() == bqr.H;
      int $$9 = $$1.az();
      if (this.bO() && !$$8) {
         $$1.g(5);
      }

      if ($$1.a($$6, (float)$$3)) {
         if ($$8) {
            return;
         }

         if ($$1 instanceof bre $$10) {
            if (!this.dN().B && this.D() <= 0) {
               $$10.q($$10.eR() + 1);
            }

            if (this.p > 0) {
               double $$11 = Math.max(0.0, 1.0 - $$10.g(bsl.n));
               etf $$12 = this.dq().d(1.0, 0.0, 1.0).d().a((double)this.p * 0.6 * $$11);
               if ($$12.g() > 0.0) {
                  $$10.j($$12.c, 0.1, $$12.e);
               }
            }

            if (!this.dN().B && $$5 instanceof bre) {
               cxo.a($$10, $$5);
               cxo.b((bre)$$5, $$10);
            }

            this.a($$10);
            if ($$5 != null && $$10 != $$5 && $$10 instanceof ckl && $$5 instanceof aqf && !this.aU()) {
               ((aqf)$$5).d.b(new acr(acr.h, 0.0F));
            }

            if (!$$1.bB() && this.s != null) {
               this.s.add($$10);
            }

            if (!this.dN().B && $$5 instanceof aqf $$13) {
               if (this.s != null && this.C()) {
                  am.H.a($$13, this.s);
               } else if (!$$1.bB() && this.C()) {
                  am.H.a($$13, Arrays.asList($$1));
               }
            }
         }

         this.a(this.q, 1.0F, 1.2F / (this.ah.i() * 0.2F + 0.9F));
         if (this.D() <= 0) {
            this.am();
         }
      } else {
         $$1.i($$9);
         this.g(this.dq().a(-0.1));
         this.r(this.dD() + 180.0F);
         this.O += 180.0F;
         if (!this.dN().B && this.dq().g() < 1.0E-7) {
            if (this.d == ckr.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.am();
         }
      }
   }

   @Override
   protected void a(etb $$0) {
      this.m = this.dN().a_($$0.a());
      super.a($$0);
      etf $$1 = $$0.e().a(this.ds(), this.du(), this.dy());
      this.g($$1);
      etf $$2 = $$1.d().a(0.05F);
      this.p(this.ds() - $$2.c, this.du() - $$2.d, this.dy() - $$2.e);
      this.a(this.v(), 1.0F, 1.2F / (this.ah.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(auz.aE);
      this.q(false);
      this.M();
   }

   protected auy r() {
      return auz.aE;
   }

   protected final auy v() {
      return this.q;
   }

   protected void a(bre $$0) {
   }

   @Nullable
   protected etc a(etf $$0, etf $$1) {
      return clf.a(this.dN(), this, $$0, $$1, this.cI().b(this.dq()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bql $$0) {
      return super.b($$0) && (this.r == null || !this.r.contains($$0.aj()));
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("life", (short)this.n);
      if (this.m != null) {
         $$0.a("inBlockState", un.a(this.m));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.o);
      $$0.a("crit", this.B());
      $$0.a("PierceLevel", this.D());
      $$0.a("SoundEvent", lc.b.b(this.q).toString());
      $$0.a("ShotFromCrossbow", this.C());
      $$0.a("item", this.t.a(this.dP()));
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.n = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.m = un.a(this.dN().a(ld.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.o = $$0.k("damage");
      }

      this.d = ckr.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.q = lc.b.b(new akf($$0.l("SoundEvent"))).orElse(this.r());
      }

      this.q($$0.q("ShotFromCrossbow"));
      if ($$0.b("item", 10)) {
         this.a(csd.a(this.dP(), (uv)$$0.p("item")).orElse(this.x()));
      } else {
         this.a(this.t);
      }
   }

   @Override
   public void c(@Nullable bql $$0) {
      super.c($$0);
      if ($$0 instanceof ckl && this.d == ckr.a.a) {
         this.d = ckr.a.b;
      }
   }

   @Override
   public void b_(ckl $$0) {
      if (!this.dN().B && (this.b || this.G()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.am();
         }
      }
   }

   protected boolean a(ckl $$0) {
      return switch (this.d) {
         case a -> false;
         case b -> $$0.ga().e(this.w());
         case c -> $$0.fN();
      };
   }

   protected csd w() {
      return this.t.r();
   }

   protected abstract csd x();

   @Override
   protected bql.b aZ() {
      return bql.b.a;
   }

   public csd y() {
      return this.t;
   }

   public void h(double $$0) {
      this.o = $$0;
   }

   public double z() {
      return this.o;
   }

   public void b(int $$0) {
      this.p = $$0;
   }

   public int A() {
      return this.p;
   }

   @Override
   public boolean cr() {
      return false;
   }

   public void a(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(byte $$0) {
      this.ao.a(i, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.ao.a(h);
      if ($$1) {
         this.ao.a(h, (byte)($$2 | $$0));
      } else {
         this.ao.a(h, (byte)($$2 & ~$$0));
      }
   }

   protected void a(csd $$0) {
      this.t = $$0;
   }

   public boolean B() {
      byte $$0 = this.ao.a(h);
      return ($$0 & 1) != 0;
   }

   public boolean C() {
      byte $$0 = this.ao.a(h);
      return ($$0 & 4) != 0;
   }

   public byte D() {
      return this.ao.a(i);
   }

   public void a(bre $$0, float $$1) {
      int $$2 = cxo.a(cxq.y, $$0);
      int $$3 = cxo.a(cxq.z, $$0);
      this.h((double)($$1 * 2.0F) + this.ah.a((double)this.dN().ak().a() * 0.11, 0.57425));
      if ($$2 > 0) {
         this.h(this.z() + (double)$$2 * 0.5 + 0.5);
      }

      if ($$3 > 0) {
         this.b($$3);
      }

      if (cxo.a(cxq.A, $$0) > 0) {
         this.g(100);
      }
   }

   protected float E() {
      return 0.6F;
   }

   public void b(boolean $$0) {
      this.ag = $$0;
      this.a(2, $$0);
   }

   public boolean G() {
      return !this.dN().B ? this.ag : (this.ao.a(h) & 2) != 0;
   }

   public void q(boolean $$0) {
      this.a(4, $$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static ckr.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
