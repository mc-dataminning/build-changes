import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cmq extends cnc {
   private static final double f = 2.0;
   private static final ajp<Byte> g = ajt.a(cmq.class, ajr.a);
   private static final ajp<Byte> h = ajt.a(cmq.class, ajr.a);
   private static final int i = 1;
   private static final int j = 2;
   @Nullable
   private dsk k;
   protected boolean b;
   protected int c;
   public cmq.a d = cmq.a.a;
   public int e;
   private int l;
   private double m = 2.0;
   private avg n = this.v();
   @Nullable
   private IntOpenHashSet o;
   @Nullable
   private List<bsg> p;
   private cuc q = this.y();
   @Nullable
   private cuc r = null;

   protected cmq(bsm<? extends cmq> $$0, dcf $$1) {
      super($$0, $$1);
   }

   protected cmq(bsm<? extends cmq> $$0, double $$1, double $$2, double $$3, dcf $$4, cuc $$5, @Nullable cuc $$6) {
      this($$0, $$4);
      this.q = $$5.s();
      this.b($$5.a(kn.g));
      azk $$7 = $$5.c(kn.u);
      if ($$7 != null) {
         this.d = cmq.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof aqm $$8) {
         this.r = $$6.s();
         int $$9 = czn.a($$8, $$6, this.q);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }

         czn.a($$8, $$6, this, () -> this.r = null);
      }
   }

   protected cmq(bsm<? extends cmq> $$0, btb $$1, dcf $$2, cuc $$3, @Nullable cuc $$4) {
      this($$0, $$1.dv(), $$1.dz() - 0.1F, $$1.dB(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(avg $$0) {
      this.n = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cL().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cE();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(ajt.a $$0) {
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
      boolean $$0 = this.G();
      ewf $$1 = this.dt();
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$2 = $$1.h();
         this.s((float)(ayg.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.t((float)(ayg.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dG();
         this.P = this.dI();
      }

      ja $$3 = this.dq();
      dsk $$4 = this.dQ().a_($$3);
      if (!$$4.i() && !$$0) {
         ewy $$5 = $$4.k(this.dQ(), $$3);
         if (!$$5.c()) {
            ewf $$6 = this.do();

            for (ewa $$7 : $$5.e()) {
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

      if (this.bg() || $$4.a(dfj.qP)) {
         this.aD();
      }

      if (this.b && !$$0) {
         if (this.k != $$4 && this.H()) {
            this.K();
         } else if (!this.dQ().B) {
            this.p();
         }

         this.c++;
      } else {
         this.c = 0;
         ewf $$8 = this.do();
         ewf $$9 = $$8.e($$1);
         ewd $$10 = this.dQ().a(new dbo($$8, $$9, dbo.a.a, dbo.b.a, this));
         if ($$10.c() != ewd.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dL()) {
            ewc $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == ewd.a.c) {
               bsg $$12 = ((ewc)$$10).a();
               bsg $$13 = this.s();
               if ($$12 instanceof cmk && $$13 instanceof cmk && !((cmk)$$13).a((cmk)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               cnd $$14 = this.b($$10);
               this.av = true;
               if ($$14 != cnd.a) {
                  break;
               }
            }

            if ($$11 == null || this.D() <= 0) {
               break;
            }

            $$10 = null;
         }

         $$1 = this.dt();
         double $$15 = $$1.c;
         double $$16 = $$1.d;
         double $$17 = $$1.e;
         if (this.B()) {
            for (int $$18 = 0; $$18 < 4; $$18++) {
               this.dQ()
                  .a(
                     lj.f,
                     this.dv() + $$15 * (double)$$18 / 4.0,
                     this.dx() + $$16 * (double)$$18 / 4.0,
                     this.dB() + $$17 * (double)$$18 / 4.0,
                     -$$15,
                     -$$16 + 0.2,
                     -$$17
                  );
            }
         }

         double $$19 = this.dv() + $$15;
         double $$20 = this.dx() + $$16;
         double $$21 = this.dB() + $$17;
         double $$22 = $$1.h();
         if ($$0) {
            this.s((float)(ayg.d(-$$15, -$$17) * 180.0F / (float)Math.PI));
         } else {
            this.s((float)(ayg.d($$15, $$17) * 180.0F / (float)Math.PI));
         }

         this.t((float)(ayg.d($$16, $$22) * 180.0F / (float)Math.PI));
         this.t(d(this.P, this.dI()));
         this.s(d(this.O, this.dG()));
         float $$23 = 0.99F;
         if (this.bf()) {
            for (int $$24 = 0; $$24 < 4; $$24++) {
               float $$25 = 0.25F;
               this.dQ().a(lj.d, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$21 - $$17 * 0.25, $$15, $$16, $$17);
            }

            $$23 = this.E();
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

   private boolean H() {
      return this.b && this.dQ().b(new ewa(this.do(), this.do()).g(0.06));
   }

   private void K() {
      this.b = false;
      ewf $$0 = this.dt();
      this.i($$0.d((double)(this.ah.i() * 0.2F), (double)(this.ah.i() * 0.2F), (double)(this.ah.i() * 0.2F)));
      this.l = 0;
   }

   @Override
   public void a(btg $$0, ewf $$1) {
      super.a($$0, $$1);
      if ($$0 != btg.a && this.H()) {
         this.K();
      }
   }

   protected void p() {
      this.l++;
      if (this.l >= 1200) {
         this.ap();
      }
   }

   private void M() {
      if (this.p != null) {
         this.p.clear();
      }

      if (this.o != null) {
         this.o.clear();
      }
   }

   @Override
   protected void a(ewc $$0) {
      super.a($$0);
      bsg $$1 = $$0.a();
      float $$2 = (float)this.dt().f();
      double $$3 = this.m;
      bsg $$4 = this.s();
      bqz $$5 = this.dR().a(this, (bsg)($$4 != null ? $$4 : this));
      if (this.r != null && this.dQ() instanceof aqm $$6) {
         $$3 = (double)czn.a($$6, this.r, $$1, $$5, (float)$$3);
      }

      int $$7 = ayg.c(ayg.a((double)$$2 * $$3, 0.0, 2.147483647E9));
      if (this.D() > 0) {
         if (this.o == null) {
            this.o = new IntOpenHashSet(5);
         }

         if (this.p == null) {
            this.p = Lists.newArrayListWithCapacity(5);
         }

         if (this.o.size() >= this.D() + 1) {
            this.ap();
            return;
         }

         this.o.add($$1.am());
      }

      if (this.B()) {
         long $$8 = (long)this.ah.a($$7 / 2 + 2);
         $$7 = (int)Math.min($$8 + (long)$$7, 2147483647L);
      }

      if ($$4 instanceof btb $$9) {
         $$9.A($$1);
      }

      boolean $$10 = $$1.al() == bsm.H;
      int $$11 = $$1.aC();
      if (this.bR() && !$$10) {
         $$1.d(5.0F);
      }

      if ($$1.a($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof btb $$12) {
            if (!this.dQ().B && this.D() <= 0) {
               $$12.p($$12.eQ() + 1);
            }

            this.a($$12, $$5);
            if (this.dQ() instanceof aqm $$13) {
               czn.a($$13, (bsg)$$12, $$5);
            }

            this.a($$12);
            if ($$12 != $$4 && $$12 instanceof cmk && $$4 instanceof aqn && !this.aX()) {
               ((aqn)$$4).c.b(new acu(acu.h, 0.0F));
            }

            if (!$$1.bE() && this.p != null) {
               this.p.add($$12);
            }

            if (!this.dQ().B && $$4 instanceof aqn $$14) {
               if (this.p != null && this.C()) {
                  am.H.a($$14, this.p);
               } else if (!$$1.bE() && this.C()) {
                  am.H.a($$14, Arrays.asList($$1));
               }
            }
         }

         this.a(this.n, 1.0F, 1.2F / (this.ah.i() * 0.2F + 0.9F));
         if (this.D() <= 0) {
            this.ap();
         }
      } else {
         $$1.h($$11);
         this.a(cnd.b, $$1, this.s(), false);
         this.i(this.dt().a(0.2));
         if (!this.dQ().B && this.dt().g() < 1.0E-7) {
            if (this.d == cmq.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.ap();
         }
      }
   }

   protected void a(btb $$0, bqz $$1) {
      double $$3 = (double)(this.r != null && this.dQ() instanceof aqm $$2 ? czn.d($$2, this.r, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.g(buj.p));
         ewf $$5 = this.dt().d(1.0, 0.0, 1.0).d().a($$3 * 0.6 * $$4);
         if ($$5.g() > 0.0) {
            $$0.j($$5.c, 0.1, $$5.e);
         }
      }
   }

   @Override
   protected void a(ewb $$0) {
      this.k = this.dQ().a_($$0.a());
      super.a($$0);
      ewf $$1 = $$0.e().a(this.dv(), this.dx(), this.dB());
      this.i($$1);
      cuc $$2 = this.u();
      if (this.dQ() instanceof aqm $$3 && $$2 != null) {
         this.a($$3, $$0, $$2);
      }

      ewf $$4 = $$1.d().a(0.05F);
      this.p(this.dv() - $$4.c, this.dx() - $$4.d, this.dB() - $$4.e);
      this.a(this.w(), 1.0F, 1.2F / (this.ah.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(avh.aE);
      this.M();
   }

   protected void a(aqm $$0, ewb $$1, cuc $$2) {
      czn.a($$0, $$2, this.s() instanceof btb $$3 ? $$3 : null, this, null, $$1.e(), () -> {
      });
   }

   @Nullable
   protected cuc u() {
      return this.r;
   }

   protected avg v() {
      return avh.aE;
   }

   protected final avg w() {
      return this.n;
   }

   protected void a(btb $$0) {
   }

   @Nullable
   protected ewc a(ewf $$0, ewf $$1) {
      return cne.a(this.dQ(), this, $$0, $$1, this.cL().b(this.dt()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bsg $$0) {
      return super.b($$0) && (this.o == null || !this.o.contains($$0.am()));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("life", (short)this.l);
      if (this.k != null) {
         $$0.a("inBlockState", um.a(this.k));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.m);
      $$0.a("crit", this.B());
      $$0.a("PierceLevel", this.D());
      $$0.a("SoundEvent", lq.b.b(this.n).toString());
      $$0.a("item", this.q.a(this.dS()));
      if (this.r != null) {
         $$0.a("weapon", this.r.b(this.dS(), new tx()));
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.l = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.k = um.a(this.dQ().a(lr.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.m = $$0.k("damage");
      }

      this.d = cmq.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.n = lq.b.b(new akk($$0.l("SoundEvent"))).orElse(this.v());
      }

      if ($$0.b("item", 10)) {
         this.a(cuc.a(this.dS(), (uu)$$0.p("item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }

      if ($$0.b("weapon", 10)) {
         this.r = cuc.a(this.dS(), (uu)$$0.p("weapon")).orElse(null);
      } else {
         this.r = null;
      }
   }

   @Override
   public void c(@Nullable bsg $$0) {
      super.c($$0);

      this.d = switch ($$0) {
         case null, default -> this.d;
         case cmk $$1 when this.d == cmq.a.a -> cmq.a.b;
         case bti $$2 -> cmq.a.a;
      };
   }

   @Override
   public void b_(cmk $$0) {
      if (!this.dQ().B && (this.b || this.G()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.ap();
         }
      }
   }

   protected boolean a(cmk $$0) {
      return switch (this.d) {
         case a -> false;
         case b -> $$0.fZ().f(this.x());
         case c -> $$0.fM();
      };
   }

   protected cuc x() {
      return this.q.s();
   }

   protected abstract cuc y();

   @Override
   protected bsg.b bc() {
      return bsg.b.a;
   }

   public cuc z() {
      return this.q;
   }

   public void h(double $$0) {
      this.m = $$0;
   }

   public double A() {
      return this.m;
   }

   @Override
   public boolean cu() {
      return this.al().a(awa.H);
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

   protected void a(cuc $$0) {
      if (!$$0.e()) {
         this.q = $$0;
      } else {
         this.q = this.y();
      }
   }

   public boolean B() {
      byte $$0 = this.ao.a(g);
      return ($$0 & 1) != 0;
   }

   public boolean C() {
      return this.r != null && this.r.a(cuf.vW);
   }

   public byte D() {
      return this.ao.a(h);
   }

   public void a(float $$0) {
      this.h((double)($$0 * 2.0F) + this.ah.a((double)this.dQ().al().a() * 0.11, 0.57425));
   }

   protected float E() {
      return 0.6F;
   }

   public void b(boolean $$0) {
      this.ag = $$0;
      this.a(2, $$0);
   }

   public boolean G() {
      return !this.dQ().B ? this.ag : (this.ao.a(g) & 2) != 0;
   }

   @Override
   public boolean bA() {
      return super.bA() && !this.b;
   }

   @Override
   public btt a_(int $$0) {
      return $$0 == 0 ? btt.a(this::z, this::a) : super.a_($$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static cmq.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
