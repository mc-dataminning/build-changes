import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cme extends cms {
   private static final double g = 2.0;
   private static final ajy<Byte> h = akc.a(cme.class, aka.a);
   private static final ajy<Byte> i = akc.a(cme.class, aka.a);
   private static final int j = 1;
   private static final int k = 2;
   private static final int l = 4;
   @Nullable
   private dtc m;
   protected boolean b;
   protected int c;
   public cme.a d = cme.a.a;
   public int e;
   private int n;
   private double o = 2.0;
   private int p;
   private avn q = this.r();
   @Nullable
   private IntOpenHashSet r;
   @Nullable
   private List<brv> s;
   private cuh t = this.x();

   protected cme(bsb<? extends cme> $$0, dca $$1) {
      super($$0, $$1);
   }

   protected cme(bsb<? extends cme> $$0, dca $$1, cuh $$2) {
      this($$0, $$1);
      this.t = $$2.r();
      this.b($$2.a(ke.f));
      azo $$3 = $$2.c(ke.s);
      if ($$3 != null) {
         this.d = cme.a.c;
      }
   }

   protected cme(bsb<? extends cme> $$0, double $$1, double $$2, double $$3, dca $$4, cuh $$5) {
      this($$0, $$4, $$5);
      this.a_($$1, $$2, $$3);
   }

   protected cme(bsb<? extends cme> $$0, bso $$1, dca $$2, cuh $$3) {
      this($$0, $$1.dz(), $$1.dD() - 0.1F, $$1.dF(), $$2, $$3);
      this.c($$1);
   }

   public void b(avn $$0) {
      this.q = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cP().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cI();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(akc.a $$0) {
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
      boolean $$0 = this.F();
      ewu $$1 = this.dx();
      if (this.Q == 0.0F && this.P == 0.0F) {
         double $$2 = $$1.h();
         this.r((float)(aym.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.s((float)(aym.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dK();
         this.Q = this.dM();
      }

      ir $$3 = this.du();
      dtc $$4 = this.dU().a_($$3);
      if (!$$4.i() && !$$0) {
         exn $$5 = $$4.k(this.dU(), $$3);
         if (!$$5.c()) {
            ewu $$6 = this.ds();

            for (ewp $$7 : $$5.e()) {
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

      if (this.bj() || $$4.a(dfe.sa)) {
         this.aC();
      }

      if (this.b && !$$0) {
         if (this.m != $$4 && this.G()) {
            this.K();
         } else if (!this.dU().C) {
            this.p();
         }

         this.c++;
      } else {
         this.c = 0;
         ewu $$8 = this.ds();
         ewu $$9 = $$8.e($$1);
         ews $$10 = this.dU().a(new dbj($$8, $$9, dbj.a.a, dbj.b.a, this));
         if ($$10.c() != ews.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dP() && !this.f) {
            ewr $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == ews.a.c) {
               brv $$12 = ((ewr)$$10).a();
               brv $$13 = this.t();
               if ($$12 instanceof cly && $$13 instanceof cly && !((cly)$$13).a((cly)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               this.a($$10);
               this.az = true;
            }

            if ($$11 == null || this.D() <= 0) {
               break;
            }

            $$10 = null;
         }

         this.f = false;
         $$1 = this.dx();
         double $$14 = $$1.c;
         double $$15 = $$1.d;
         double $$16 = $$1.e;
         if (this.B()) {
            for (int $$17 = 0; $$17 < 4; $$17++) {
               this.dU()
                  .a(
                     lb.f,
                     this.dz() + $$14 * (double)$$17 / 4.0,
                     this.dB() + $$15 * (double)$$17 / 4.0,
                     this.dF() + $$16 * (double)$$17 / 4.0,
                     -$$14,
                     -$$15 + 0.2,
                     -$$16
                  );
            }
         }

         double $$18 = this.dz() + $$14;
         double $$19 = this.dB() + $$15;
         double $$20 = this.dF() + $$16;
         double $$21 = $$1.h();
         if ($$0) {
            this.r((float)(aym.d(-$$14, -$$16) * 180.0F / (float)Math.PI));
         } else {
            this.r((float)(aym.d($$14, $$16) * 180.0F / (float)Math.PI));
         }

         this.s((float)(aym.d($$15, $$21) * 180.0F / (float)Math.PI));
         this.s(d(this.Q, this.dM()));
         this.r(d(this.P, this.dK()));
         float $$22 = 0.99F;
         if (this.bi()) {
            for (int $$23 = 0; $$23 < 4; $$23++) {
               float $$24 = 0.25F;
               this.dU().a(lb.d, $$18 - $$14 * 0.25, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$14, $$15, $$16);
            }

            $$22 = this.E();
         }

         this.g($$1.a((double)$$22));
         if (!$$0) {
            this.be();
         }

         this.a_($$18, $$19, $$20);
         this.aW();
      }
   }

   @Override
   protected double bc() {
      return 0.05;
   }

   private boolean G() {
      return this.b && this.dU().b(new ewp(this.ds(), this.ds()).g(0.06));
   }

   private void K() {
      this.b = false;
      ewu $$0 = this.dx();
      this.g($$0.d((double)(this.al.i() * 0.2F), (double)(this.al.i() * 0.2F), (double)(this.al.i() * 0.2F)));
      this.n = 0;
   }

   @Override
   public void a(bst $$0, ewu $$1) {
      super.a($$0, $$1);
      if ($$0 != bst.a && this.G()) {
         this.K();
      }
   }

   protected void p() {
      this.n++;
      if (this.n >= 1200) {
         this.ao();
      }
   }

   private void L() {
      if (this.s != null) {
         this.s.clear();
      }

      if (this.r != null) {
         this.r.clear();
      }
   }

   @Override
   protected void a(ewr $$0) {
      super.a($$0);
      brv $$1 = $$0.a();
      float $$2 = (float)this.dx().f();
      int $$3 = aym.c(aym.a((double)$$2 * this.o, 0.0, 2.147483647E9));
      if (this.D() > 0) {
         if (this.r == null) {
            this.r = new IntOpenHashSet(5);
         }

         if (this.s == null) {
            this.s = Lists.newArrayListWithCapacity(5);
         }

         if (this.r.size() >= this.D() + 1) {
            this.ao();
            return;
         }

         this.r.add($$1.al());
      }

      if (this.B()) {
         long $$4 = (long)this.al.a($$3 / 2 + 2);
         $$3 = (int)Math.min($$4 + (long)$$3, 2147483647L);
      }

      brv $$5 = this.t();
      bqt $$6;
      if ($$5 == null) {
         $$6 = this.dX().a(this, this);
      } else {
         $$6 = this.dX().a(this, $$5);
         if ($$5 instanceof bso) {
            ((bso)$$5).A($$1);
         }
      }

      boolean $$8 = $$1.ak() == bsb.J;
      int $$9 = $$1.aB();
      if (this.bV() && !$$8) {
         $$1.g(5);
      }

      if ($$1.a($$6, (float)$$3)) {
         if ($$8) {
            return;
         }

         if ($$1 instanceof bso $$10) {
            if (!this.dU().C && this.D() <= 0) {
               $$10.q($$10.fb() + 1);
            }

            if (this.p > 0) {
               double $$11 = Math.max(0.0, 1.0 - $$10.g(btv.n));
               ewu $$12 = this.dx().d(1.0, 0.0, 1.0).d().a((double)this.p * 0.6 * $$11);
               if ($$12.g() > 0.0) {
                  $$10.j($$12.c, 0.1, $$12.e);
               }
            }

            if (!this.dU().C && $$5 instanceof bso) {
               dae.a($$10, $$5);
               dae.b((bso)$$5, $$10);
            }

            this.a($$10);
            if ($$5 != null && $$10 != $$5 && $$10 instanceof cly && $$5 instanceof aqu && !this.ba()) {
               ((aqu)$$5).d.b(new ade(ade.h, 0.0F));
            }

            if (!$$1.bI() && this.s != null) {
               this.s.add($$10);
            }

            if (!this.dU().C && $$5 instanceof aqu $$13) {
               if (this.s != null && this.C()) {
                  an.H.a($$13, this.s);
               } else if (!$$1.bI() && this.C()) {
                  an.H.a($$13, Arrays.asList($$1));
               }
            }
         }

         this.a(this.q, 1.0F, 1.2F / (this.al.i() * 0.2F + 0.9F));
         if (this.D() <= 0) {
            this.ao();
         }
      } else {
         $$1.i($$9);
         this.g(this.dx().a(-0.1));
         this.r(this.dK() + 180.0F);
         this.P += 180.0F;
         if (!this.dU().C && this.dx().g() < 1.0E-7) {
            if (this.d == cme.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ao();
         }
      }
   }

   @Override
   protected void a(ewq $$0) {
      this.m = this.dU().a_($$0.a());
      super.a($$0);
      ewu $$1 = $$0.e().a(this.dz(), this.dB(), this.dF());
      this.g($$1);
      ewu $$2 = $$1.d().a(0.05F);
      this.p(this.dz() - $$2.c, this.dB() - $$2.d, this.dF() - $$2.e);
      this.a(this.u(), 1.0F, 1.2F / (this.al.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(avo.aJ);
      this.q(false);
      this.L();
   }

   protected avn r() {
      return avo.aJ;
   }

   protected final avn u() {
      return this.q;
   }

   protected void a(bso $$0) {
   }

   @Nullable
   protected ewr a(ewu $$0, ewu $$1) {
      return cmu.a(this.dU(), this, $$0, $$1, this.cP().b(this.dx()).g(1.0), this::b);
   }

   @Override
   protected boolean b(brv $$0) {
      return super.b($$0) && (this.r == null || !this.r.contains($$0.al()));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("life", (short)this.n);
      if (this.m != null) {
         $$0.a("inBlockState", uz.a(this.m));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.o);
      $$0.a("crit", this.B());
      $$0.a("PierceLevel", this.D());
      $$0.a("SoundEvent", lh.b.b(this.q).toString());
      $$0.a("ShotFromCrossbow", this.C());
      $$0.a("item", this.t.a(this.dY()));
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.n = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.m = uz.a(this.dU().a(li.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.o = $$0.k("damage");
      }

      this.d = cme.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.q = lh.b.b(new akt($$0.l("SoundEvent"))).orElse(this.r());
      }

      this.q($$0.q("ShotFromCrossbow"));
      if ($$0.b("item", 10)) {
         this.a(cuh.a(this.dY(), (vh)$$0.p("item")).orElse(this.x()));
      } else {
         this.a(this.t);
      }
   }

   @Override
   public void c(@Nullable brv $$0) {
      super.c($$0);
      if ($$0 instanceof cly && this.d == cme.a.a) {
         this.d = cme.a.b;
      }
   }

   @Override
   public void b_(cly $$0) {
      if (!this.dU().C && (this.b || this.F()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.ao();
         }
      }
   }

   protected boolean a(cly $$0) {
      return switch (this.d) {
         case a -> false;
         case b -> $$0.gl().f(this.w());
         case c -> $$0.fY();
      };
   }

   protected cuh w() {
      return this.t.r();
   }

   protected abstract cuh x();

   @Override
   protected brv.c bf() {
      return brv.c.a;
   }

   public cuh y() {
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
   public boolean cy() {
      return false;
   }

   public void a(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(byte $$0) {
      this.as.a(i, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.as.a(h);
      if ($$1) {
         this.as.a(h, (byte)($$2 | $$0));
      } else {
         this.as.a(h, (byte)($$2 & ~$$0));
      }
   }

   protected void a(cuh $$0) {
      this.t = $$0;
   }

   public boolean B() {
      byte $$0 = this.as.a(h);
      return ($$0 & 1) != 0;
   }

   public boolean C() {
      byte $$0 = this.as.a(h);
      return ($$0 & 4) != 0;
   }

   public byte D() {
      return this.as.a(i);
   }

   public void a(bso $$0, float $$1) {
      int $$2 = dae.a(dag.z, $$0);
      int $$3 = dae.a(dag.A, $$0);
      this.h((double)($$1 * 2.0F) + this.al.a((double)this.dU().al().a() * 0.11, 0.57425));
      if ($$2 > 0) {
         this.h(this.z() + (double)$$2 * 0.5 + 0.5);
      }

      if ($$3 > 0) {
         this.b($$3);
      }

      if (dae.a(dag.B, $$0) > 0) {
         this.g(100);
      }
   }

   protected float E() {
      return 0.6F;
   }

   public void b(boolean $$0) {
      this.ah = $$0;
      this.a(2, $$0);
   }

   public boolean F() {
      return !this.dU().C ? this.ah : (this.as.a(h) & 2) != 0;
   }

   public void q(boolean $$0) {
      this.a(4, $$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static cme.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
