import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class cou extends cpg {
   private static final double f = 2.0;
   private static final akl<Byte> g = akp.a(cou.class, akn.a);
   private static final akl<Byte> h = akp.a(cou.class, akn.a);
   private static final int i = 1;
   private static final int j = 2;
   @Nullable
   private dvj k;
   protected boolean b;
   protected int c;
   public cou.a d = cou.a.a;
   public int e;
   private int l;
   private double m = 2.0;
   private awk n = this.o();
   @Nullable
   private IntOpenHashSet o;
   @Nullable
   private List<bue> p;
   private cwb q = this.v();
   @Nullable
   private cwb r = null;

   protected cou(bul<? extends cou> $$0, dfb $$1) {
      super($$0, $$1);
   }

   protected cou(bul<? extends cou> $$0, double $$1, double $$2, double $$3, dfb $$4, cwb $$5, @Nullable cwb $$6) {
      this($$0, $$4);
      this.q = $$5.v();
      this.b($$5.a(ku.g));
      bap $$7 = $$5.c(ku.v);
      if ($$7 != null) {
         this.d = cou.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof arn $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.r = $$6.v();
         int $$9 = dbu.a($$8, $$6, this.q);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected cou(bul<? extends cou> $$0, bva $$1, dfb $$2, cwb $$3, @Nullable cwb $$4) {
      this($$0, $$1.dC(), $$1.dG() - 0.1F, $$1.dI(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(awk $$0) {
      this.n = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cS().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cL();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(akp.a $$0) {
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
      boolean $$0 = this.B();
      ezn $$1 = this.dA();
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$2 = $$1.i();
         this.v((float)(azk.d($$1.d, $$1.f) * 180.0F / (float)Math.PI));
         this.w((float)(azk.d($$1.e, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dN();
         this.P = this.dP();
      }

      jh $$3 = this.dx();
      dvj $$4 = this.dX().a_($$3);
      if (!$$4.l() && !$$0) {
         fah $$5 = $$4.g(this.dX(), $$3);
         if (!$$5.c()) {
            ezn $$6 = this.dv();

            for (ezi $$7 : $$5.e()) {
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

      if (this.bl() || $$4.a(dig.qP)) {
         this.aI();
      }

      if (this.b && !$$0) {
         if (this.k != $$4 && this.G()) {
            this.I();
         } else if (!this.dX().C) {
            this.m();
         }

         this.c++;
      } else {
         this.c = 0;
         ezn $$8 = this.dv();
         if (this.y()) {
            for (int $$9 = 0; $$9 < 4; $$9++) {
               this.dX()
                  .a(
                     lr.f,
                     $$8.d + $$1.d * (double)$$9 / 4.0,
                     $$8.e + $$1.e * (double)$$9 / 4.0,
                     $$8.f + $$1.f * (double)$$9 / 4.0,
                     -$$1.d,
                     -$$1.e + 0.2,
                     -$$1.f
                  );
            }
         }

         float $$10;
         if ($$0) {
            $$10 = (float)(azk.d(-$$1.d, -$$1.f) * 180.0F / (float)Math.PI);
         } else {
            $$10 = (float)(azk.d($$1.d, $$1.f) * 180.0F / (float)Math.PI);
         }

         float $$12 = (float)(azk.d($$1.e, $$1.i()) * 180.0F / (float)Math.PI);
         this.w(e(this.dP(), $$12));
         this.v(e(this.dN(), $$10));
         if (!$$0) {
            ezj $$13 = this.dX().b(new dej($$8, $$8.e($$1), dej.a.a, dej.b.a, this));
            this.b($$13);
         } else {
            this.b($$8.e($$1));
            this.aL();
            if (this.at != null && this.at.e()) {
               this.bX();
            }
         }

         super.l();
         this.D();
         if (!$$0) {
            this.bg();
         }
      }
   }

   private void b(ezj $$0) {
      while (this.bM()) {
         ezn $$1 = this.dv();
         ezk $$2 = this.c($$1, $$0.g());
         ezn $$3 = Objects.requireNonNullElse($$2, $$0).g();
         this.b($$3);
         this.a($$1, $$3);
         if (this.at != null && this.at.e()) {
            this.bX();
         }

         if ($$2 == null) {
            if (this.bM() && $$0.d() != ezl.a.a) {
               this.b((ezl)$$0);
               this.as = true;
            }
            break;
         } else if (this.bM() && !this.ae) {
            cph $$4 = this.b($$2);
            this.as = true;
            if (this.z() > 0 && $$4 == cph.a) {
               continue;
            }
            break;
         }
      }
   }

   private void D() {
      ezn $$0 = this.dA();
      ezn $$1 = this.dv();
      float $$2 = 0.99F;
      if (this.bk()) {
         for (int $$3 = 0; $$3 < 4; $$3++) {
            float $$4 = 0.25F;
            this.dX().a(lr.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$2 = this.A();
      }

      this.h($$0.c((double)$$2));
   }

   @Override
   protected double be() {
      return 0.05;
   }

   private boolean G() {
      return this.b && this.dX().b(new ezi(this.dv(), this.dv()).g(0.06));
   }

   private void I() {
      this.b = false;
      ezn $$0 = this.dA();
      this.h($$0.d((double)(this.af.i() * 0.2F), (double)(this.af.i() * 0.2F), (double)(this.af.i() * 0.2F)));
      this.l = 0;
   }

   @Override
   public void a(bve $$0, ezn $$1) {
      super.a($$0, $$1);
      if ($$0 != bve.a && this.G()) {
         this.I();
      }
   }

   protected void m() {
      this.l++;
      if (this.l >= 1200) {
         this.av();
      }
   }

   private void J() {
      if (this.p != null) {
         this.p.clear();
      }

      if (this.o != null) {
         this.o.clear();
      }
   }

   @Override
   protected void b(cvx $$0) {
      this.r = null;
   }

   @Override
   protected void a(ezk $$0) {
      super.a($$0);
      bue $$1 = $$0.a();
      float $$2 = (float)this.dA().g();
      double $$3 = this.m;
      bue $$4 = this.s();
      bsu $$5 = this.dY().a(this, (bue)($$4 != null ? $$4 : this));
      if (this.eb() != null && this.dX() instanceof arn $$6) {
         $$3 = (double)dbu.a($$6, this.eb(), $$1, $$5, (float)$$3);
      }

      int $$7 = azk.c(azk.a((double)$$2 * $$3, 0.0, 2.147483647E9));
      if (this.z() > 0) {
         if (this.o == null) {
            this.o = new IntOpenHashSet(5);
         }

         if (this.p == null) {
            this.p = Lists.newArrayListWithCapacity(5);
         }

         if (this.o.size() >= this.z() + 1) {
            this.av();
            return;
         }

         this.o.add($$1.as());
      }

      if (this.y()) {
         long $$8 = (long)this.af.a($$7 / 2 + 2);
         $$7 = (int)Math.min($$8 + (long)$$7, 2147483647L);
      }

      if ($$4 instanceof bva $$9) {
         $$9.B($$1);
      }

      boolean $$10 = $$1.ar() == bul.H;
      int $$11 = $$1.aH();
      if (this.bZ() && !$$10) {
         $$1.d(5.0F);
      }

      if ($$1.a($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof bva $$12) {
            if (!this.dX().C && this.z() <= 0) {
               $$12.p($$12.eX() + 1);
            }

            this.a($$12, $$5);
            if (this.dX() instanceof arn $$13) {
               dbu.a($$13, $$12, $$5, this.eb());
            }

            this.a($$12);
            if ($$12 != $$4 && $$12 instanceof com && $$4 instanceof aro && !this.bc()) {
               ((aro)$$4).g.b(new adl(adl.h, 0.0F));
            }

            if (!$$1.bM() && this.p != null) {
               this.p.add($$12);
            }

            if (!this.dX().C && $$4 instanceof aro $$14) {
               if (this.p != null) {
                  ao.H.a($$14, this.p, this.r);
               } else if (!$$1.bM()) {
                  ao.H.a($$14, List.of($$1), this.r);
               }
            }
         }

         this.a(this.n, 1.0F, 1.2F / (this.af.i() * 0.2F + 0.9F));
         if (this.z() <= 0) {
            this.av();
         }
      } else {
         $$1.h($$11);
         this.a(cph.b, $$1, this.s(), false);
         this.h(this.dA().c(0.2));
         if (!this.dX().C && this.dA().h() < 1.0E-7) {
            if (this.d == cou.a.b) {
               this.a(this.t(), 0.1F);
            }

            this.av();
         }
      }
   }

   protected void a(bva $$0, bsu $$1) {
      double $$3 = (double)(this.r != null && this.dX() instanceof arn $$2 ? dbu.d($$2, this.r, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(bwi.p));
         ezn $$5 = this.dA().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.j($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(ezj $$0) {
      this.k = this.dX().a_($$0.b());
      super.a($$0);
      cwb $$1 = this.eb();
      if (this.dX() instanceof arn $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      ezn $$3 = this.dA();
      ezn $$4 = new ezn(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      ezn $$5 = $$4.c(0.05F);
      this.b(this.dv().d($$5));
      this.h(ezn.c);
      this.a(this.q(), 1.0F, 1.2F / (this.af.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(awl.aE);
      this.J();
   }

   protected void a(arn $$0, ezj $$1, cwb $$2) {
      ezn $$3 = $$1.b().a($$1.g());
      dbu.a($$0, $$2, this.s() instanceof bva $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.r = null);
   }

   @Override
   public cwb eb() {
      return this.r;
   }

   protected awk o() {
      return awl.aE;
   }

   protected final awk q() {
      return this.n;
   }

   protected void a(bva $$0) {
   }

   @Nullable
   protected ezk c(ezn $$0, ezn $$1) {
      return cpi.a(this.dX(), this, $$0, $$1, this.cS().b(this.dA()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bue $$0) {
      return $$0 instanceof com && this.s() instanceof com $$1 && !$$1.a((com)$$0) ? false : super.b($$0) && (this.o == null || !this.o.contains($$0.as()));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("life", (short)this.l);
      if (this.k != null) {
         $$0.a("inBlockState", uz.a(this.k));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.m);
      $$0.a("crit", this.y());
      $$0.a("PierceLevel", this.z());
      $$0.a("SoundEvent", ly.b.b(this.n).toString());
      $$0.a("item", this.q.a(this.dZ()));
      if (this.r != null) {
         $$0.a("weapon", this.r.b(this.dZ(), new uk()));
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.l = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.k = uz.a(this.dX().a(lz.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.m = $$0.k("damage");
      }

      this.d = cou.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.n = ly.b.b(ali.a($$0.l("SoundEvent"))).orElse(this.o());
      }

      if ($$0.b("item", 10)) {
         this.a(cwb.a(this.dZ(), (vh)$$0.p("item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }

      if ($$0.b("weapon", 10)) {
         this.r = cwb.a(this.dZ(), (vh)$$0.p("weapon")).orElse(null);
      } else {
         this.r = null;
      }
   }

   @Override
   public void c(@Nullable bue $$0) {
      super.c($$0);

      this.d = switch ($$0) {
         case null, default -> this.d;
         case com $$1 when this.d == cou.a.a -> cou.a.b;
         case bvg $$2 -> cou.a.a;
      };
   }

   @Override
   public void b_(com $$0) {
      if (!this.dX().C && (this.b || this.B()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.av();
         }
      }
   }

   protected boolean a(com $$0) {
      return switch (this.d) {
         case a -> false;
         case b -> $$0.gk().f(this.t());
         case c -> $$0.fX();
      };
   }

   protected cwb t() {
      return this.q.v();
   }

   protected abstract cwb v();

   @Override
   protected bue.b bh() {
      return bue.b.a;
   }

   public cwb w() {
      return this.q;
   }

   public void h(double $$0) {
      this.m = $$0;
   }

   public double x() {
      return this.m;
   }

   @Override
   public boolean cC() {
      return this.ar().a(axe.H);
   }

   public void a(boolean $$0) {
      this.a(1, $$0);
   }

   private void a(byte $$0) {
      this.am.a(h, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.am.a(g);
      if ($$1) {
         this.am.a(g, (byte)($$2 | $$0));
      } else {
         this.am.a(g, (byte)($$2 & ~$$0));
      }
   }

   protected void a(cwb $$0) {
      if (!$$0.f()) {
         this.q = $$0;
      } else {
         this.q = this.v();
      }
   }

   public boolean y() {
      byte $$0 = this.am.a(g);
      return ($$0 & 1) != 0;
   }

   public byte z() {
      return this.am.a(h);
   }

   public void a(float $$0) {
      this.h((double)($$0 * 2.0F) + this.af.a((double)this.dX().ak().a() * 0.11, 0.57425));
   }

   protected float A() {
      return 0.6F;
   }

   public void b(boolean $$0) {
      this.ae = $$0;
      this.a(2, $$0);
   }

   public boolean B() {
      return !this.dX().C ? this.ae : (this.am.a(g) & 2) != 0;
   }

   @Override
   public boolean bI() {
      return super.bI() && !this.b;
   }

   @Override
   public bvs a_(int $$0) {
      return $$0 == 0 ? bvs.a(this::w, this::a) : super.a_($$0);
   }

   @Override
   protected boolean C() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public static cou.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
