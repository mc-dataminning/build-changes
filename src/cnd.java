import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cnd extends cnp {
   private static final double f = 2.0;
   private static final ajw<Byte> g = aka.a(cnd.class, ajy.a);
   private static final ajw<Byte> h = aka.a(cnd.class, ajy.a);
   private static final int i = 1;
   private static final int j = 2;
   @Nullable
   private dtc k;
   protected boolean b;
   protected int c;
   public cnd.a d = cnd.a.a;
   public int e;
   private int l;
   private double m = 2.0;
   private avo n = this.t();
   @Nullable
   private IntOpenHashSet o;
   @Nullable
   private List<bsr> p;
   private cuq q = this.x();
   @Nullable
   private cuq r = null;

   protected cnd(bsx<? extends cnd> $$0, dcw $$1) {
      super($$0, $$1);
   }

   protected cnd(bsx<? extends cnd> $$0, double $$1, double $$2, double $$3, dcw $$4, cuq $$5, @Nullable cuq $$6) {
      this($$0, $$4);
      this.q = $$5.s();
      this.b($$5.a(kq.g));
      azs $$7 = $$5.c(kq.u);
      if ($$7 != null) {
         this.d = cnd.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof aqu $$8) {
         if ($$6.e()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.r = $$6.s();
         int $$9 = dae.a($$8, $$6, this.q);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }

         dae.a($$8, $$6, this, $$0x -> this.r = null);
      }
   }

   protected cnd(bsx<? extends cnd> $$0, btn $$1, dcw $$2, cuq $$3, @Nullable cuq $$4) {
      this($$0, $$1.dt(), $$1.dx() - 0.1F, $$1.dz(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(avo $$0) {
      this.n = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cK().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cD();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(g, (byte)0);
      $$0.a(h, (byte)0);
   }

   @Override
   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      super.c($$0, $$1, $$2, $$3, $$4);
      this.l = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      super.l($$0, $$1, $$2);
      this.l = 0;
   }

   @Override
   public void l() {
      super.l();
      boolean $$0 = this.E();
      exc $$1 = this.dr();
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$2 = $$1.h();
         this.t((float)(ayo.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.u((float)(ayo.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dE();
         this.P = this.dG();
      }

      jd $$3 = this.do();
      dtc $$4 = this.dO().a_($$3);
      if (!$$4.i() && !$$0) {
         exv $$5 = $$4.k(this.dO(), $$3);
         if (!$$5.c()) {
            exc $$6 = this.dm();

            for (ewx $$7 : $$5.e()) {
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

      if (this.bg() || $$4.a(dga.qP)) {
         this.aD();
      }

      if (this.b && !$$0) {
         if (this.k != $$4 && this.F()) {
            this.J();
         } else if (!this.dO().B) {
            this.p();
         }

         this.c++;
      } else {
         this.c = 0;
         exc $$8 = this.dm();
         exc $$9 = $$8.e($$1);
         exa $$10 = this.dO().a(new dcf($$8, $$9, dcf.a.a, dcf.b.a, this));
         if ($$10.c() != exa.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dJ()) {
            ewz $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == exa.a.c) {
               bsr $$12 = ((ewz)$$10).a();
               bsr $$13 = this.s();
               if ($$12 instanceof cmx && $$13 instanceof cmx && !((cmx)$$13).a((cmx)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               cnq $$14 = this.b($$10);
               this.av = true;
               if ($$14 != cnq.a) {
                  break;
               }
            }

            if ($$11 == null || this.C() <= 0) {
               break;
            }

            $$10 = null;
         }

         $$1 = this.dr();
         double $$15 = $$1.c;
         double $$16 = $$1.d;
         double $$17 = $$1.e;
         if (this.A()) {
            for (int $$18 = 0; $$18 < 4; $$18++) {
               this.dO()
                  .a(
                     lm.f,
                     this.dt() + $$15 * (double)$$18 / 4.0,
                     this.dv() + $$16 * (double)$$18 / 4.0,
                     this.dz() + $$17 * (double)$$18 / 4.0,
                     -$$15,
                     -$$16 + 0.2,
                     -$$17
                  );
            }
         }

         double $$19 = this.dt() + $$15;
         double $$20 = this.dv() + $$16;
         double $$21 = this.dz() + $$17;
         double $$22 = $$1.h();
         if ($$0) {
            this.t((float)(ayo.d(-$$15, -$$17) * 180.0F / (float)Math.PI));
         } else {
            this.t((float)(ayo.d($$15, $$17) * 180.0F / (float)Math.PI));
         }

         this.u((float)(ayo.d($$16, $$22) * 180.0F / (float)Math.PI));
         this.u(e(this.P, this.dG()));
         this.t(e(this.O, this.dE()));
         float $$23 = 0.99F;
         if (this.bf()) {
            for (int $$24 = 0; $$24 < 4; $$24++) {
               float $$25 = 0.25F;
               this.dO().a(lm.d, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$21 - $$17 * 0.25, $$15, $$16, $$17);
            }

            $$23 = this.D();
         }

         this.i($$1.a((double)$$23));
         if (!$$0) {
            this.bb();
         }

         this.a_($$19, $$20, $$21);
         this.aT();
      }
   }

   @Override
   protected double aZ() {
      return 0.05;
   }

   private boolean F() {
      return this.b && this.dO().b(new ewx(this.dm(), this.dm()).g(0.06));
   }

   private void J() {
      this.b = false;
      exc $$0 = this.dr();
      this.i($$0.d((double)(this.ah.i() * 0.2F), (double)(this.ah.i() * 0.2F), (double)(this.ah.i() * 0.2F)));
      this.l = 0;
   }

   @Override
   public void a(bts $$0, exc $$1) {
      super.a($$0, $$1);
      if ($$0 != bts.a && this.F()) {
         this.J();
      }
   }

   protected void p() {
      this.l++;
      if (this.l >= 1200) {
         this.aq();
      }
   }

   private void K() {
      if (this.p != null) {
         this.p.clear();
      }

      if (this.o != null) {
         this.o.clear();
      }
   }

   @Override
   protected void a(ewz $$0) {
      super.a($$0);
      bsr $$1 = $$0.a();
      float $$2 = (float)this.dr().f();
      double $$3 = this.m;
      bsr $$4 = this.s();
      brk $$5 = this.dP().a(this, (bsr)($$4 != null ? $$4 : this));
      if (this.dS() != null && this.dO() instanceof aqu $$6) {
         $$3 = (double)dae.a($$6, this.dS(), $$1, $$5, (float)$$3);
      }

      int $$7 = ayo.c(ayo.a((double)$$2 * $$3, 0.0, 2.147483647E9));
      if (this.C() > 0) {
         if (this.o == null) {
            this.o = new IntOpenHashSet(5);
         }

         if (this.p == null) {
            this.p = Lists.newArrayListWithCapacity(5);
         }

         if (this.o.size() >= this.C() + 1) {
            this.aq();
            return;
         }

         this.o.add($$1.an());
      }

      if (this.A()) {
         long $$8 = (long)this.ah.a($$7 / 2 + 2);
         $$7 = (int)Math.min($$8 + (long)$$7, 2147483647L);
      }

      if ($$4 instanceof btn $$9) {
         $$9.A($$1);
      }

      boolean $$10 = $$1.am() == bsx.H;
      int $$11 = $$1.aC();
      if (this.bR() && !$$10) {
         $$1.d(5.0F);
      }

      if ($$1.a($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof btn $$12) {
            if (!this.dO().B && this.C() <= 0) {
               $$12.p($$12.eP() + 1);
            }

            this.a($$12, $$5);
            if (this.dO() instanceof aqu $$13) {
               dae.a($$13, $$12, $$5, this.dS());
            }

            this.a($$12);
            if ($$12 != $$4 && $$12 instanceof cmx && $$4 instanceof aqv && !this.aX()) {
               ((aqv)$$4).c.b(new adb(adb.h, 0.0F));
            }

            if (!$$1.bE() && this.p != null) {
               this.p.add($$12);
            }

            if (!this.dO().B && $$4 instanceof aqv $$14) {
               if (this.p != null && this.B()) {
                  an.H.a($$14, this.p);
               } else if (!$$1.bE() && this.B()) {
                  an.H.a($$14, Arrays.asList($$1));
               }
            }
         }

         this.a(this.n, 1.0F, 1.2F / (this.ah.i() * 0.2F + 0.9F));
         if (this.C() <= 0) {
            this.aq();
         }
      } else {
         $$1.h($$11);
         this.a(cnq.b, $$1, this.s(), false);
         this.i(this.dr().a(0.2));
         if (!this.dO().B && this.dr().g() < 1.0E-7) {
            if (this.d == cnd.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.aq();
         }
      }
   }

   protected void a(btn $$0, brk $$1) {
      double $$3 = (double)(this.r != null && this.dO() instanceof aqu $$2 ? dae.d($$2, this.r, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.g(buw.p));
         exc $$5 = this.dr().d(1.0, 0.0, 1.0).d().a($$3 * 0.6 * $$4);
         if ($$5.g() > 0.0) {
            $$0.j($$5.c, 0.1, $$5.e);
         }
      }
   }

   @Override
   protected void a(ewy $$0) {
      this.k = this.dO().a_($$0.a());
      super.a($$0);
      exc $$1 = $$0.e().a(this.dt(), this.dv(), this.dz());
      this.i($$1);
      cuq $$2 = this.dS();
      if (this.dO() instanceof aqu $$3 && $$2 != null) {
         this.a($$3, $$0, $$2);
      }

      exc $$4 = $$1.d().a(0.05F);
      this.o(this.dt() - $$4.c, this.dv() - $$4.d, this.dz() - $$4.e);
      this.a(this.v(), 1.0F, 1.2F / (this.ah.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(avp.aE);
      this.K();
   }

   protected void a(aqu $$0, ewy $$1, cuq $$2) {
      exc $$3 = $$1.a().a($$1.e());
      dae.a($$0, $$2, this.s() instanceof btn $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.a()), $$0x -> this.r = null);
   }

   @Override
   public cuq dS() {
      return this.r;
   }

   protected avo t() {
      return avp.aE;
   }

   protected final avo v() {
      return this.n;
   }

   protected void a(btn $$0) {
   }

   @Nullable
   protected ewz a(exc $$0, exc $$1) {
      return cnr.a(this.dO(), this, $$0, $$1, this.cK().b(this.dr()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bsr $$0) {
      return super.b($$0) && (this.o == null || !this.o.contains($$0.an()));
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("life", (short)this.l);
      if (this.k != null) {
         $$0.a("inBlockState", uq.a(this.k));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.m);
      $$0.a("crit", this.A());
      $$0.a("PierceLevel", this.C());
      $$0.a("SoundEvent", lt.b.b(this.n).toString());
      $$0.a("item", this.q.a(this.dQ()));
      if (this.r != null) {
         $$0.a("weapon", this.r.b(this.dQ(), new ub()));
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.l = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.k = uq.a(this.dO().a(lu.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.m = $$0.k("damage");
      }

      this.d = cnd.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.n = lt.b.b(akr.a($$0.l("SoundEvent"))).orElse(this.t());
      }

      if ($$0.b("item", 10)) {
         this.a(cuq.a(this.dQ(), (uy)$$0.p("item")).orElse(this.x()));
      } else {
         this.a(this.x());
      }

      if ($$0.b("weapon", 10)) {
         this.r = cuq.a(this.dQ(), (uy)$$0.p("weapon")).orElse(null);
      } else {
         this.r = null;
      }
   }

   @Override
   public void c(@Nullable bsr $$0) {
      super.c($$0);

      this.d = switch ($$0) {
         case null, default -> this.d;
         case cmx $$1 when this.d == cnd.a.a -> cnd.a.b;
         case btu $$2 -> cnd.a.a;
      };
   }

   @Override
   public void b_(cmx $$0) {
      if (!this.dO().B && (this.b || this.E()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.aq();
         }
      }
   }

   protected boolean a(cmx $$0) {
      return switch (this.d) {
         case a -> false;
         case b -> $$0.fY().f(this.w());
         case c -> $$0.fL();
      };
   }

   protected cuq w() {
      return this.q.s();
   }

   protected abstract cuq x();

   @Override
   protected bsr.b bc() {
      return bsr.b.a;
   }

   public cuq y() {
      return this.q;
   }

   public void h(double $$0) {
      this.m = $$0;
   }

   public double z() {
      return this.m;
   }

   @Override
   public boolean cu() {
      return this.am().a(awi.H);
   }

   public void a(boolean $$0) {
      this.a(1, $$0);
   }

   private void a(byte $$0) {
      this.ao.a(h, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.ao.a(g);
      if ($$1) {
         this.ao.a(g, (byte)($$2 | $$0));
      } else {
         this.ao.a(g, (byte)($$2 & ~$$0));
      }
   }

   protected void a(cuq $$0) {
      if (!$$0.e()) {
         this.q = $$0;
      } else {
         this.q = this.x();
      }
   }

   public boolean A() {
      byte $$0 = this.ao.a(g);
      return ($$0 & 1) != 0;
   }

   public boolean B() {
      return this.r != null && this.r.a(cut.vW);
   }

   public byte C() {
      return this.ao.a(h);
   }

   public void a(float $$0) {
      this.h((double)($$0 * 2.0F) + this.ah.a((double)this.dO().al().a() * 0.11, 0.57425));
   }

   protected float D() {
      return 0.6F;
   }

   public void b(boolean $$0) {
      this.ag = $$0;
      this.a(2, $$0);
   }

   public boolean E() {
      return !this.dO().B ? this.ag : (this.ao.a(g) & 2) != 0;
   }

   @Override
   public boolean bA() {
      return super.bA() && !this.b;
   }

   @Override
   public bug a_(int $$0) {
      return $$0 == 0 ? bug.a(this::y, this::a) : super.a_($$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static cnd.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
