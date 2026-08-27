import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class ciy extends cjk {
   private static final double g = 2.0;
   private static final aim<Byte> h = aiq.a(ciy.class, aio.a);
   private static final aim<Byte> i = aiq.a(ciy.class, aio.a);
   private static final int j = 1;
   private static final int k = 2;
   private static final int l = 4;
   @Nullable
   private dmz m;
   protected boolean b;
   protected int c;
   public ciy.a d = ciy.a.a;
   public int e;
   private int n;
   private double o = 2.0;
   private int p;
   private atx q = this.r();
   @Nullable
   private IntOpenHashSet r;
   @Nullable
   private List<bow> s;
   private cqk t;

   protected ciy(bpc<? extends ciy> $$0, cwz $$1, cqk $$2) {
      super($$0, $$1);
      this.t = $$2.q();
      if ($$2.B()) {
         this.b($$2.z());
      }
   }

   protected ciy(bpc<? extends ciy> $$0, double $$1, double $$2, double $$3, cwz $$4, cqk $$5) {
      this($$0, $$4, $$5);
      this.a_($$1, $$2, $$3);
   }

   protected ciy(bpc<? extends ciy> $$0, bpo $$1, cwz $$2, cqk $$3) {
      this($$0, $$1.dr(), $$1.dv() - 0.1F, $$1.dx(), $$2, $$3);
      this.c($$1);
      if ($$1 instanceof cis) {
         this.d = ciy.a.b;
      }
   }

   public void b(atx $$0) {
      this.q = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cH().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cA();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(aiq.a $$0) {
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
      boolean $$0 = this.E();
      epr $$1 = this.dp();
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$2 = $$1.h();
         this.r((float)(aww.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.s((float)(aww.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.N = this.dC();
         this.O = this.dE();
      }

      ib $$3 = this.dm();
      dmz $$4 = this.dM().a_($$3);
      if (!$$4.i() && !$$0) {
         eqk $$5 = $$4.k(this.dM(), $$3);
         if (!$$5.c()) {
            epr $$6 = this.dk();

            for (epm $$7 : $$5.e()) {
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

      if (this.bd() || $$4.a(dac.qP)) {
         this.aA();
      }

      if (this.b && !$$0) {
         if (this.m != $$4 && this.G()) {
            this.J();
         } else if (!this.dM().B) {
            this.p();
         }

         this.c++;
      } else {
         this.c = 0;
         epr $$8 = this.dk();
         epr $$9 = $$8.e($$1);
         epp $$10 = this.dM().a(new cwi($$8, $$9, cwi.a.a, cwi.b.a, this));
         if ($$10.c() != epp.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dH() && !this.f) {
            epo $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == epp.a.c) {
               bow $$12 = ((epo)$$10).a();
               bow $$13 = this.af_();
               if ($$12 instanceof cis && $$13 instanceof cis && !((cis)$$13).a((cis)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               this.a($$10);
               this.au = true;
            }

            if ($$11 == null || this.C() <= 0) {
               break;
            }

            $$10 = null;
         }

         this.f = false;
         $$1 = this.dp();
         double $$14 = $$1.c;
         double $$15 = $$1.d;
         double $$16 = $$1.e;
         if (this.A()) {
            for (int $$17 = 0; $$17 < 4; $$17++) {
               this.dM()
                  .a(
                     kc.g,
                     this.dr() + $$14 * (double)$$17 / 4.0,
                     this.dt() + $$15 * (double)$$17 / 4.0,
                     this.dx() + $$16 * (double)$$17 / 4.0,
                     -$$14,
                     -$$15 + 0.2,
                     -$$16
                  );
            }
         }

         double $$18 = this.dr() + $$14;
         double $$19 = this.dt() + $$15;
         double $$20 = this.dx() + $$16;
         double $$21 = $$1.h();
         if ($$0) {
            this.r((float)(aww.d(-$$14, -$$16) * 180.0F / (float)Math.PI));
         } else {
            this.r((float)(aww.d($$14, $$16) * 180.0F / (float)Math.PI));
         }

         this.s((float)(aww.d($$15, $$21) * 180.0F / (float)Math.PI));
         this.s(d(this.O, this.dE()));
         this.r(d(this.N, this.dC()));
         float $$22 = 0.99F;
         if (this.bc()) {
            for (int $$23 = 0; $$23 < 4; $$23++) {
               float $$24 = 0.25F;
               this.dM().a(kc.e, $$18 - $$14 * 0.25, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$14, $$15, $$16);
            }

            $$22 = this.D();
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

   private boolean G() {
      return this.b && this.dM().b(new epm(this.dk(), this.dk()).g(0.06));
   }

   private void J() {
      this.b = false;
      epr $$0 = this.dp();
      this.g($$0.d((double)(this.ag.i() * 0.2F), (double)(this.ag.i() * 0.2F), (double)(this.ag.i() * 0.2F)));
      this.n = 0;
   }

   @Override
   public void a(bpt $$0, epr $$1) {
      super.a($$0, $$1);
      if ($$0 != bpt.a && this.G()) {
         this.J();
      }
   }

   protected void p() {
      this.n++;
      if (this.n >= 1200) {
         this.am();
      }
   }

   private void K() {
      if (this.s != null) {
         this.s.clear();
      }

      if (this.r != null) {
         this.r.clear();
      }
   }

   @Override
   protected void a(epo $$0) {
      super.a($$0);
      bow $$1 = $$0.a();
      float $$2 = (float)this.dp().f();
      int $$3 = aww.c(aww.a((double)$$2 * this.o, 0.0, 2.147483647E9));
      if (this.C() > 0) {
         if (this.r == null) {
            this.r = new IntOpenHashSet(5);
         }

         if (this.s == null) {
            this.s = Lists.newArrayListWithCapacity(5);
         }

         if (this.r.size() >= this.C() + 1) {
            this.am();
            return;
         }

         this.r.add($$1.aj());
      }

      if (this.A()) {
         long $$4 = (long)this.ag.a($$3 / 2 + 2);
         $$3 = (int)Math.min($$4 + (long)$$3, 2147483647L);
      }

      bow $$5 = this.af_();
      bnv $$6;
      if ($$5 == null) {
         $$6 = this.dN().a(this, this);
      } else {
         $$6 = this.dN().a(this, $$5);
         if ($$5 instanceof bpo) {
            ((bpo)$$5).A($$1);
         }
      }

      boolean $$8 = $$1.ai() == bpc.H;
      int $$9 = $$1.az();
      if (this.bN() && !$$8) {
         $$1.g(5);
      }

      if ($$1.a($$6, (float)$$3)) {
         if ($$8) {
            return;
         }

         if ($$1 instanceof bpo $$10) {
            if (!this.dM().B && this.C() <= 0) {
               $$10.q($$10.eQ() + 1);
            }

            if (this.p > 0) {
               double $$11 = Math.max(0.0, 1.0 - $$10.g(bqv.n));
               epr $$12 = this.dp().d(1.0, 0.0, 1.0).d().a((double)this.p * 0.6 * $$11);
               if ($$12.g() > 0.0) {
                  $$10.j($$12.c, 0.1, $$12.e);
               }
            }

            if (!this.dM().B && $$5 instanceof bpo) {
               cuv.a($$10, $$5);
               cuv.b((bpo)$$5, $$10);
            }

            this.a($$10);
            if ($$5 != null && $$10 != $$5 && $$10 instanceof cis && $$5 instanceof apg && !this.aU()) {
               ((apg)$$5).d.b(new abt(abt.h, 0.0F));
            }

            if (!$$1.bA() && this.s != null) {
               this.s.add($$10);
            }

            if (!this.dM().B && $$5 instanceof apg $$13) {
               if (this.s != null && this.B()) {
                  am.H.a($$13, this.s);
               } else if (!$$1.bA() && this.B()) {
                  am.H.a($$13, Arrays.asList($$1));
               }
            }
         }

         this.a(this.q, 1.0F, 1.2F / (this.ag.i() * 0.2F + 0.9F));
         if (this.C() <= 0) {
            this.am();
         }
      } else {
         $$1.i($$9);
         this.g(this.dp().a(-0.1));
         this.r(this.dC() + 180.0F);
         this.N += 180.0F;
         if (!this.dM().B && this.dp().g() < 1.0E-7) {
            if (this.d == ciy.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.am();
         }
      }
   }

   @Override
   protected void a(epn $$0) {
      this.m = this.dM().a_($$0.a());
      super.a($$0);
      epr $$1 = $$0.e().a(this.dr(), this.dt(), this.dx());
      this.g($$1);
      epr $$2 = $$1.d().a(0.05F);
      this.p(this.dr() - $$2.c, this.dt() - $$2.d, this.dx() - $$2.e);
      this.a(this.s(), 1.0F, 1.2F / (this.ag.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(aty.aE);
      this.q(false);
      this.K();
   }

   protected atx r() {
      return aty.aE;
   }

   protected final atx s() {
      return this.q;
   }

   protected void a(bpo $$0) {
   }

   @Nullable
   protected epo a(epr $$0, epr $$1) {
      return cjm.a(this.dM(), this, $$0, $$1, this.cH().b(this.dp()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bow $$0) {
      return super.b($$0) && (this.r == null || !this.r.contains($$0.aj()));
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("life", (short)this.n);
      if (this.m != null) {
         $$0.a("inBlockState", tp.a(this.m));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.o);
      $$0.a("crit", this.A());
      $$0.a("PierceLevel", this.C());
      $$0.a("SoundEvent", ki.b.b(this.q).toString());
      $$0.a("ShotFromCrossbow", this.B());
      $$0.a("item", this.t.b(new ta()));
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.n = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.m = tp.a(this.dM().a(kj.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.o = $$0.k("damage");
      }

      this.d = ciy.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.q = ki.b.b(new ajh($$0.l("SoundEvent"))).orElse(this.r());
      }

      this.q($$0.q("ShotFromCrossbow"));
      if ($$0.b("item", 10)) {
         this.t = cqk.a($$0.p("item"));
      }
   }

   @Override
   public void c(@Nullable bow $$0) {
      super.c($$0);
      if ($$0 instanceof cis $$1) {
         this.d = $$1.fM() ? ciy.a.c : ciy.a.b;
      }
   }

   @Override
   public void b_(cis $$0) {
      if (!this.dM().B && (this.b || this.E()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.am();
         }
      }
   }

   protected boolean a(cis $$0) {
      switch (this.d) {
         case b:
            return $$0.fZ().e(this.w());
         case c:
            return $$0.fM();
         default:
            return false;
      }
   }

   protected cqk w() {
      return this.t.q();
   }

   @Override
   protected bow.b aZ() {
      return bow.b.a;
   }

   public cqk x() {
      return this.t;
   }

   public void h(double $$0) {
      this.o = $$0;
   }

   public double y() {
      return this.o;
   }

   public void b(int $$0) {
      this.p = $$0;
   }

   public int z() {
      return this.p;
   }

   @Override
   public boolean cq() {
      return false;
   }

   public void a(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(byte $$0) {
      this.an.a(i, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.an.a(h);
      if ($$1) {
         this.an.a(h, (byte)($$2 | $$0));
      } else {
         this.an.a(h, (byte)($$2 & ~$$0));
      }
   }

   public boolean A() {
      byte $$0 = this.an.a(h);
      return ($$0 & 1) != 0;
   }

   public boolean B() {
      byte $$0 = this.an.a(h);
      return ($$0 & 4) != 0;
   }

   public byte C() {
      return this.an.a(i);
   }

   public void a(bpo $$0, float $$1) {
      int $$2 = cuv.a(cux.y, $$0);
      int $$3 = cuv.a(cux.z, $$0);
      this.h((double)($$1 * 2.0F) + this.ag.a((double)this.dM().aj().a() * 0.11, 0.57425));
      if ($$2 > 0) {
         this.h(this.y() + (double)$$2 * 0.5 + 0.5);
      }

      if ($$3 > 0) {
         this.b($$3);
      }

      if (cuv.a(cux.A, $$0) > 0) {
         this.g(100);
      }
   }

   protected float D() {
      return 0.6F;
   }

   public void p(boolean $$0) {
      this.af = $$0;
      this.a(2, $$0);
   }

   public boolean E() {
      return !this.dM().B ? this.af : (this.an.a(h) & 2) != 0;
   }

   public void q(boolean $$0) {
      this.a(4, $$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static ciy.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
