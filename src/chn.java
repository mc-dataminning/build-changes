import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class chn extends chz {
   private static final double f = 2.0;
   private static final aie<Byte> g = aih.a(chn.class, aig.a);
   private static final aie<Byte> h = aih.a(chn.class, aig.a);
   private static final int i = 1;
   private static final int j = 2;
   private static final int k = 4;
   @Nullable
   private dlf l;
   protected boolean b;
   protected int c;
   public chn.a d = chn.a.a;
   public int e;
   private int m;
   private double n = 2.0;
   private int o;
   private atj p = this.s();
   @Nullable
   private IntOpenHashSet q;
   @Nullable
   private List<bno> r;
   private coz s;

   protected chn(bnu<? extends chn> $$0, cvn $$1, coz $$2) {
      super($$0, $$1);
      this.s = $$2.q();
      if ($$2.B()) {
         this.b($$2.z());
      }
   }

   protected chn(bnu<? extends chn> $$0, double $$1, double $$2, double $$3, cvn $$4, coz $$5) {
      this($$0, $$4, $$5);
      this.a_($$1, $$2, $$3);
   }

   protected chn(bnu<? extends chn> $$0, bog $$1, cvn $$2, coz $$3) {
      this($$0, $$1.dr(), $$1.dv() - 0.1F, $$1.dx(), $$2, $$3);
      this.b($$1);
      if ($$1 instanceof chh) {
         this.d = chn.a.b;
      }
   }

   public void b(atj $$0) {
      this.p = $$0;
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
   protected void c_() {
      this.am.a(g, (byte)0);
      this.am.a(h, (byte)0);
   }

   @Override
   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      super.c($$0, $$1, $$2, $$3, $$4);
      this.m = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      super.l($$0, $$1, $$2);
      this.m = 0;
   }

   @Override
   public void l() {
      super.l();
      boolean $$0 = this.G();
      ens $$1 = this.dp();
      if (this.N == 0.0F && this.M == 0.0F) {
         double $$2 = $$1.h();
         this.r((float)(awh.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.s((float)(awh.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.M = this.dC();
         this.N = this.dE();
      }

      hz $$3 = this.dm();
      dlf $$4 = this.dM().a_($$3);
      if (!$$4.i() && !$$0) {
         eol $$5 = $$4.k(this.dM(), $$3);
         if (!$$5.c()) {
            ens $$6 = this.dk();

            for (enn $$7 : $$5.e()) {
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

      if (this.ba() || $$4.a(cyq.qP)) {
         this.aA();
      }

      if (this.b && !$$0) {
         if (this.l != $$4 && this.H()) {
            this.K();
         } else if (!this.dM().B) {
            this.q();
         }

         this.c++;
      } else {
         this.c = 0;
         ens $$8 = this.dk();
         ens $$9 = $$8.e($$1);
         enq $$10 = this.dM().a(new cuw($$8, $$9, cuw.a.a, cuw.b.a, this));
         if ($$10.c() != enq.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dH()) {
            enp $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == enq.a.c) {
               bno $$12 = ((enp)$$10).a();
               bno $$13 = this.w();
               if ($$12 instanceof chh && $$13 instanceof chh && !((chh)$$13).a((chh)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               this.a($$10);
               this.at = true;
            }

            if ($$11 == null || this.D() <= 0) {
               break;
            }

            $$10 = null;
         }

         $$1 = this.dp();
         double $$14 = $$1.c;
         double $$15 = $$1.d;
         double $$16 = $$1.e;
         if (this.B()) {
            for (int $$17 = 0; $$17 < 4; $$17++) {
               this.dM()
                  .a(
                     jz.g,
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
            this.r((float)(awh.d(-$$14, -$$16) * 180.0F / (float)Math.PI));
         } else {
            this.r((float)(awh.d($$14, $$16) * 180.0F / (float)Math.PI));
         }

         this.s((float)(awh.d($$15, $$21) * 180.0F / (float)Math.PI));
         this.s(d(this.N, this.dE()));
         this.r(d(this.M, this.dC()));
         float $$22 = 0.99F;
         float $$23 = 0.05F;
         if (this.aZ()) {
            for (int $$24 = 0; $$24 < 4; $$24++) {
               float $$25 = 0.25F;
               this.dM().a(jz.e, $$18 - $$14 * 0.25, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$14, $$15, $$16);
            }

            $$22 = this.E();
         }

         this.g($$1.a((double)$$22));
         if (!this.aV() && !$$0) {
            ens $$26 = this.dp();
            this.o($$26.c, $$26.d - 0.05F, $$26.e);
         }

         this.a_($$18, $$19, $$20);
         this.aQ();
      }
   }

   private boolean H() {
      return this.b && this.dM().b(new enn(this.dk(), this.dk()).g(0.06));
   }

   private void K() {
      this.b = false;
      ens $$0 = this.dp();
      this.g($$0.d((double)(this.af.i() * 0.2F), (double)(this.af.i() * 0.2F), (double)(this.af.i() * 0.2F)));
      this.m = 0;
   }

   @Override
   public void a(bol $$0, ens $$1) {
      super.a($$0, $$1);
      if ($$0 != bol.a && this.H()) {
         this.K();
      }
   }

   protected void q() {
      this.m++;
      if (this.m >= 1200) {
         this.am();
      }
   }

   private void M() {
      if (this.r != null) {
         this.r.clear();
      }

      if (this.q != null) {
         this.q.clear();
      }
   }

   @Override
   protected void a(enp $$0) {
      super.a($$0);
      bno $$1 = $$0.a();
      float $$2 = (float)this.dp().f();
      int $$3 = awh.c(awh.a((double)$$2 * this.n, 0.0, 2.147483647E9));
      if (this.D() > 0) {
         if (this.q == null) {
            this.q = new IntOpenHashSet(5);
         }

         if (this.r == null) {
            this.r = Lists.newArrayListWithCapacity(5);
         }

         if (this.q.size() >= this.D() + 1) {
            this.am();
            return;
         }

         this.q.add($$1.aj());
      }

      if (this.B()) {
         long $$4 = (long)this.af.a($$3 / 2 + 2);
         $$3 = (int)Math.min($$4 + (long)$$3, 2147483647L);
      }

      bno $$5 = this.w();
      bmn $$6;
      if ($$5 == null) {
         $$6 = this.dN().a(this, this);
      } else {
         $$6 = this.dN().a(this, $$5);
         if ($$5 instanceof bog) {
            ((bog)$$5).z($$1);
         }
      }

      boolean $$8 = $$1.ai() == bnu.G;
      int $$9 = $$1.az();
      if (this.bN() && !$$8) {
         $$1.g(5);
      }

      if ($$1.a($$6, (float)$$3)) {
         if ($$8) {
            return;
         }

         if ($$1 instanceof bog $$10) {
            if (!this.dM().B && this.D() <= 0) {
               $$10.q($$10.eP() + 1);
            }

            if (this.o > 0) {
               double $$11 = Math.max(0.0, 1.0 - $$10.g(bpl.k));
               ens $$12 = this.dp().d(1.0, 0.0, 1.0).d().a((double)this.o * 0.6 * $$11);
               if ($$12.g() > 0.0) {
                  $$10.j($$12.c, 0.1, $$12.e);
               }
            }

            if (!this.dM().B && $$5 instanceof bog) {
               ctj.a($$10, $$5);
               ctj.b((bog)$$5, $$10);
            }

            this.a($$10);
            if ($$5 != null && $$10 != $$5 && $$10 instanceof chh && $$5 instanceof aow && !this.aU()) {
               ((aow)$$5).d.b(new abm(abm.h, 0.0F));
            }

            if (!$$1.bx() && this.r != null) {
               this.r.add($$10);
            }

            if (!this.dM().B && $$5 instanceof aow $$13) {
               if (this.r != null && this.C()) {
                  am.H.a($$13, this.r);
               } else if (!$$1.bx() && this.C()) {
                  am.H.a($$13, Arrays.asList($$1));
               }
            }
         }

         this.a(this.p, 1.0F, 1.2F / (this.af.i() * 0.2F + 0.9F));
         if (this.D() <= 0) {
            this.am();
         }
      } else {
         $$1.i($$9);
         this.g(this.dp().a(-0.1));
         this.r(this.dC() + 180.0F);
         this.M += 180.0F;
         if (!this.dM().B && this.dp().g() < 1.0E-7) {
            if (this.d == chn.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.am();
         }
      }
   }

   @Override
   protected void a(eno $$0) {
      this.l = this.dM().a_($$0.a());
      super.a($$0);
      ens $$1 = $$0.e().a(this.dr(), this.dt(), this.dx());
      this.g($$1);
      ens $$2 = $$1.d().a(0.05F);
      this.p(this.dr() - $$2.c, this.dt() - $$2.d, this.dx() - $$2.e);
      this.a(this.u(), 1.0F, 1.2F / (this.af.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(atk.aB);
      this.q(false);
      this.M();
   }

   protected atj s() {
      return atk.aB;
   }

   protected final atj u() {
      return this.p;
   }

   protected void a(bog $$0) {
   }

   @Nullable
   protected enp a(ens $$0, ens $$1) {
      return cib.a(this.dM(), this, $$0, $$1, this.cH().b(this.dp()).g(1.0), this::a);
   }

   @Override
   protected boolean a(bno $$0) {
      return super.a($$0) && (this.q == null || !this.q.contains($$0.aj()));
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("life", (short)this.m);
      if (this.l != null) {
         $$0.a("inBlockState", tl.a(this.l));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.n);
      $$0.a("crit", this.B());
      $$0.a("PierceLevel", this.D());
      $$0.a("SoundEvent", kf.b.b(this.p).toString());
      $$0.a("ShotFromCrossbow", this.C());
      $$0.a("item", this.s.b(new sw()));
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.m = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.l = tl.a(this.dM().a(kg.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.n = $$0.k("damage");
      }

      this.d = chn.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.p = kf.b.b(new aiy($$0.l("SoundEvent"))).orElse(this.s());
      }

      this.q($$0.q("ShotFromCrossbow"));
      if ($$0.b("item", 10)) {
         this.s = coz.a($$0.p("item"));
      }
   }

   @Override
   public void b(@Nullable bno $$0) {
      super.b($$0);
      if ($$0 instanceof chh) {
         this.d = ((chh)$$0).fU().d ? chn.a.c : chn.a.b;
      }
   }

   @Override
   public void b_(chh $$0) {
      if (!this.dM().B && (this.b || this.G()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.am();
         }
      }
   }

   protected boolean a(chh $$0) {
      switch (this.d) {
         case b:
            return $$0.fT().e(this.x());
         case c:
            return $$0.fU().d;
         default:
            return false;
      }
   }

   protected coz x() {
      return this.s.q();
   }

   @Override
   protected bno.b aW() {
      return bno.b.a;
   }

   public coz y() {
      return this.s;
   }

   public void h(double $$0) {
      this.n = $$0;
   }

   public double z() {
      return this.n;
   }

   public void b(int $$0) {
      this.o = $$0;
   }

   public int A() {
      return this.o;
   }

   @Override
   public boolean cq() {
      return false;
   }

   public void a(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(byte $$0) {
      this.am.b(h, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.am.b(g);
      if ($$1) {
         this.am.b(g, (byte)($$2 | $$0));
      } else {
         this.am.b(g, (byte)($$2 & ~$$0));
      }
   }

   public boolean B() {
      byte $$0 = this.am.b(g);
      return ($$0 & 1) != 0;
   }

   public boolean C() {
      byte $$0 = this.am.b(g);
      return ($$0 & 4) != 0;
   }

   public byte D() {
      return this.am.b(h);
   }

   public void a(bog $$0, float $$1) {
      int $$2 = ctj.a(ctl.y, $$0);
      int $$3 = ctj.a(ctl.z, $$0);
      this.h((double)($$1 * 2.0F) + this.af.a((double)this.dM().ak().a() * 0.11, 0.57425));
      if ($$2 > 0) {
         this.h(this.z() + (double)$$2 * 0.5 + 0.5);
      }

      if ($$3 > 0) {
         this.b($$3);
      }

      if (ctj.a(ctl.A, $$0) > 0) {
         this.g(100);
      }
   }

   protected float E() {
      return 0.6F;
   }

   public void p(boolean $$0) {
      this.ae = $$0;
      this.a(2, $$0);
   }

   public boolean G() {
      return !this.dM().B ? this.ae : (this.am.b(g) & 2) != 0;
   }

   public void q(boolean $$0) {
      this.a(4, $$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static chn.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
