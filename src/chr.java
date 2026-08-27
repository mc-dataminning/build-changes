import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class chr extends cid {
   private static final double g = 2.0;
   private static final aie<Byte> h = aih.a(chr.class, aig.a);
   private static final aie<Byte> i = aih.a(chr.class, aig.a);
   private static final int j = 1;
   private static final int k = 2;
   private static final int l = 4;
   @Nullable
   private dlj m;
   protected boolean b;
   protected int c;
   public chr.a d = chr.a.a;
   public int e;
   private int n;
   private double o = 2.0;
   private int p;
   private atk q = this.s();
   @Nullable
   private IntOpenHashSet r;
   @Nullable
   private List<bnq> s;
   private cpd t;

   protected chr(bnw<? extends chr> $$0, cvr $$1, cpd $$2) {
      super($$0, $$1);
      this.t = $$2.q();
      if ($$2.B()) {
         this.b($$2.z());
      }
   }

   protected chr(bnw<? extends chr> $$0, double $$1, double $$2, double $$3, cvr $$4, cpd $$5) {
      this($$0, $$4, $$5);
      this.a_($$1, $$2, $$3);
   }

   protected chr(bnw<? extends chr> $$0, boi $$1, cvr $$2, cpd $$3) {
      this($$0, $$1.dr(), $$1.dv() - 0.1F, $$1.dx(), $$2, $$3);
      this.b($$1);
      if ($$1 instanceof chl) {
         this.d = chr.a.b;
      }
   }

   public void b(atk $$0) {
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
   protected void c_() {
      this.am.a(h, (byte)0);
      this.am.a(i, (byte)0);
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
      enz $$1 = this.dp();
      if (this.N == 0.0F && this.M == 0.0F) {
         double $$2 = $$1.h();
         this.r((float)(awi.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.s((float)(awi.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.M = this.dC();
         this.N = this.dE();
      }

      hz $$3 = this.dm();
      dlj $$4 = this.dM().a_($$3);
      if (!$$4.i() && !$$0) {
         eos $$5 = $$4.k(this.dM(), $$3);
         if (!$$5.c()) {
            enz $$6 = this.dk();

            for (enu $$7 : $$5.e()) {
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

      if (this.ba() || $$4.a(cyu.qP)) {
         this.aA();
      }

      if (this.b && !$$0) {
         if (this.m != $$4 && this.H()) {
            this.K();
         } else if (!this.dM().B) {
            this.q();
         }

         this.c++;
      } else {
         this.c = 0;
         enz $$8 = this.dk();
         enz $$9 = $$8.e($$1);
         enx $$10 = this.dM().a(new cva($$8, $$9, cva.a.a, cva.b.a, this));
         if ($$10.c() != enx.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dH() && !this.f) {
            enw $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == enx.a.c) {
               bnq $$12 = ((enw)$$10).a();
               bnq $$13 = this.w();
               if ($$12 instanceof chl && $$13 instanceof chl && !((chl)$$13).a((chl)$$12)) {
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

         this.f = false;
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
            this.r((float)(awi.d(-$$14, -$$16) * 180.0F / (float)Math.PI));
         } else {
            this.r((float)(awi.d($$14, $$16) * 180.0F / (float)Math.PI));
         }

         this.s((float)(awi.d($$15, $$21) * 180.0F / (float)Math.PI));
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
            enz $$26 = this.dp();
            this.o($$26.c, $$26.d - 0.05F, $$26.e);
         }

         this.a_($$18, $$19, $$20);
         this.aQ();
      }
   }

   private boolean H() {
      return this.b && this.dM().b(new enu(this.dk(), this.dk()).g(0.06));
   }

   private void K() {
      this.b = false;
      enz $$0 = this.dp();
      this.g($$0.d((double)(this.af.i() * 0.2F), (double)(this.af.i() * 0.2F), (double)(this.af.i() * 0.2F)));
      this.n = 0;
   }

   @Override
   public void a(bon $$0, enz $$1) {
      super.a($$0, $$1);
      if ($$0 != bon.a && this.H()) {
         this.K();
      }
   }

   protected void q() {
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
   protected void a(enw $$0) {
      super.a($$0);
      bnq $$1 = $$0.a();
      float $$2 = (float)this.dp().f();
      int $$3 = awi.c(awi.a((double)$$2 * this.o, 0.0, 2.147483647E9));
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
         long $$4 = (long)this.af.a($$3 / 2 + 2);
         $$3 = (int)Math.min($$4 + (long)$$3, 2147483647L);
      }

      bnq $$5 = this.w();
      bmp $$6;
      if ($$5 == null) {
         $$6 = this.dN().a(this, this);
      } else {
         $$6 = this.dN().a(this, $$5);
         if ($$5 instanceof boi) {
            ((boi)$$5).z($$1);
         }
      }

      boolean $$8 = $$1.ai() == bnw.G;
      int $$9 = $$1.az();
      if (this.bN() && !$$8) {
         $$1.g(5);
      }

      if ($$1.a($$6, (float)$$3)) {
         if ($$8) {
            return;
         }

         if ($$1 instanceof boi $$10) {
            if (!this.dM().B && this.D() <= 0) {
               $$10.q($$10.eP() + 1);
            }

            if (this.p > 0) {
               double $$11 = Math.max(0.0, 1.0 - $$10.g(bpp.k));
               enz $$12 = this.dp().d(1.0, 0.0, 1.0).d().a((double)this.p * 0.6 * $$11);
               if ($$12.g() > 0.0) {
                  $$10.j($$12.c, 0.1, $$12.e);
               }
            }

            if (!this.dM().B && $$5 instanceof boi) {
               ctn.a($$10, $$5);
               ctn.b((boi)$$5, $$10);
            }

            this.a($$10);
            if ($$5 != null && $$10 != $$5 && $$10 instanceof chl && $$5 instanceof aox && !this.aU()) {
               ((aox)$$5).d.b(new abm(abm.h, 0.0F));
            }

            if (!$$1.bx() && this.s != null) {
               this.s.add($$10);
            }

            if (!this.dM().B && $$5 instanceof aox $$13) {
               if (this.s != null && this.C()) {
                  am.H.a($$13, this.s);
               } else if (!$$1.bx() && this.C()) {
                  am.H.a($$13, Arrays.asList($$1));
               }
            }
         }

         this.a(this.q, 1.0F, 1.2F / (this.af.i() * 0.2F + 0.9F));
         if (this.D() <= 0) {
            this.am();
         }
      } else {
         $$1.i($$9);
         this.g(this.dp().a(-0.1));
         this.r(this.dC() + 180.0F);
         this.M += 180.0F;
         if (!this.dM().B && this.dp().g() < 1.0E-7) {
            if (this.d == chr.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.am();
         }
      }
   }

   @Override
   protected void a(env $$0) {
      this.m = this.dM().a_($$0.a());
      super.a($$0);
      enz $$1 = $$0.e().a(this.dr(), this.dt(), this.dx());
      this.g($$1);
      enz $$2 = $$1.d().a(0.05F);
      this.p(this.dr() - $$2.c, this.dt() - $$2.d, this.dx() - $$2.e);
      this.a(this.u(), 1.0F, 1.2F / (this.af.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(atl.aC);
      this.q(false);
      this.M();
   }

   protected atk s() {
      return atl.aC;
   }

   protected final atk u() {
      return this.q;
   }

   protected void a(boi $$0) {
   }

   @Nullable
   protected enw a(enz $$0, enz $$1) {
      return cif.a(this.dM(), this, $$0, $$1, this.cH().b(this.dp()).g(1.0), this::a);
   }

   @Override
   protected boolean a(bnq $$0) {
      return super.a($$0) && (this.r == null || !this.r.contains($$0.aj()));
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("life", (short)this.n);
      if (this.m != null) {
         $$0.a("inBlockState", tl.a(this.m));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.o);
      $$0.a("crit", this.B());
      $$0.a("PierceLevel", this.D());
      $$0.a("SoundEvent", kf.b.b(this.q).toString());
      $$0.a("ShotFromCrossbow", this.C());
      $$0.a("item", this.t.b(new sw()));
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.n = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.m = tl.a(this.dM().a(kg.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.o = $$0.k("damage");
      }

      this.d = chr.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.q = kf.b.b(new aiy($$0.l("SoundEvent"))).orElse(this.s());
      }

      this.q($$0.q("ShotFromCrossbow"));
      if ($$0.b("item", 10)) {
         this.t = cpd.a($$0.p("item"));
      }
   }

   @Override
   public void b(@Nullable bnq $$0) {
      super.b($$0);
      if ($$0 instanceof chl) {
         this.d = ((chl)$$0).fU().d ? chr.a.c : chr.a.b;
      }
   }

   @Override
   public void b_(chl $$0) {
      if (!this.dM().B && (this.b || this.G()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.am();
         }
      }
   }

   protected boolean a(chl $$0) {
      switch (this.d) {
         case b:
            return $$0.fT().e(this.x());
         case c:
            return $$0.fU().d;
         default:
            return false;
      }
   }

   protected cpd x() {
      return this.t.q();
   }

   @Override
   protected bnq.b aW() {
      return bnq.b.a;
   }

   public cpd y() {
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
   public boolean cq() {
      return false;
   }

   public void a(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(byte $$0) {
      this.am.b(i, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.am.b(h);
      if ($$1) {
         this.am.b(h, (byte)($$2 | $$0));
      } else {
         this.am.b(h, (byte)($$2 & ~$$0));
      }
   }

   public boolean B() {
      byte $$0 = this.am.b(h);
      return ($$0 & 1) != 0;
   }

   public boolean C() {
      byte $$0 = this.am.b(h);
      return ($$0 & 4) != 0;
   }

   public byte D() {
      return this.am.b(i);
   }

   public void a(boi $$0, float $$1) {
      int $$2 = ctn.a(ctp.y, $$0);
      int $$3 = ctn.a(ctp.z, $$0);
      this.h((double)($$1 * 2.0F) + this.af.a((double)this.dM().aj().a() * 0.11, 0.57425));
      if ($$2 > 0) {
         this.h(this.z() + (double)$$2 * 0.5 + 0.5);
      }

      if ($$3 > 0) {
         this.b($$3);
      }

      if (ctn.a(ctp.A, $$0) > 0) {
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
      return !this.dM().B ? this.ae : (this.am.b(h) & 2) != 0;
   }

   public void q(boolean $$0) {
      this.a(4, $$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static chr.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
