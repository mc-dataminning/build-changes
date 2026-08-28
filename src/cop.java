import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class cop extends cpb {
   private static final double f = 2.0;
   private static final akk<Byte> g = ako.a(cop.class, akm.a);
   private static final akk<Byte> h = ako.a(cop.class, akm.a);
   private static final int i = 1;
   private static final int j = 2;
   @Nullable
   private dvd k;
   protected boolean b;
   protected int c;
   public cop.a d = cop.a.a;
   public int e;
   private int l;
   private double m = 2.0;
   private awj n = this.o();
   @Nullable
   private IntOpenHashSet o;
   @Nullable
   private List<btz> p;
   private cvx q = this.v();
   @Nullable
   private cvx r = null;

   protected cop(bug<? extends cop> $$0, dev $$1) {
      super($$0, $$1);
   }

   protected cop(bug<? extends cop> $$0, double $$1, double $$2, double $$3, dev $$4, cvx $$5, @Nullable cvx $$6) {
      this($$0, $$4);
      this.q = $$5.v();
      this.b($$5.a(kt.g));
      bao $$7 = $$5.c(kt.v);
      if ($$7 != null) {
         this.d = cop.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof arm $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.r = $$6.v();
         int $$9 = dbo.a($$8, $$6, this.q);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected cop(bug<? extends cop> $$0, buv $$1, dev $$2, cvx $$3, @Nullable cvx $$4) {
      this($$0, $$1.dC(), $$1.dG() - 0.1F, $$1.dI(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(awj $$0) {
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
   protected void a(ako.a $$0) {
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
      boolean $$0 = this.C();
      ezh $$1 = this.dA();
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$2 = $$1.i();
         this.v((float)(azj.d($$1.d, $$1.f) * 180.0F / (float)Math.PI));
         this.w((float)(azj.d($$1.e, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dN();
         this.P = this.dP();
      }

      jg $$3 = this.dx();
      dvd $$4 = this.dX().a_($$3);
      if (!$$4.l() && !$$0) {
         fab $$5 = $$4.g(this.dX(), $$3);
         if (!$$5.c()) {
            ezh $$6 = this.dv();

            for (ezc $$7 : $$5.e()) {
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

      if (this.bl() || $$4.a(dia.qP)) {
         this.aH();
      }

      if (this.b && !$$0) {
         if (this.k != $$4 && this.I()) {
            this.J();
         } else if (!this.dX().C) {
            this.m();
         }

         this.c++;
      } else {
         this.c = 0;
         ezh $$8 = this.dv();
         if (this.y()) {
            for (int $$9 = 0; $$9 < 4; $$9++) {
               this.dX()
                  .a(
                     lq.f,
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
            $$10 = (float)(azj.d(-$$1.d, -$$1.f) * 180.0F / (float)Math.PI);
         } else {
            $$10 = (float)(azj.d($$1.d, $$1.f) * 180.0F / (float)Math.PI);
         }

         float $$12 = (float)(azj.d($$1.e, $$1.i()) * 180.0F / (float)Math.PI);
         this.w(e(this.dP(), $$12));
         this.v(e(this.dN(), $$10));
         ezd $$13 = this.dX().b(new ded($$8, $$8.e($$1), ded.a.a, ded.b.a, this));
         this.b($$13);
         super.l();
         this.E();
         if (!$$0) {
            this.bg();
         }
      }
   }

   private void b(ezd $$0) {
      while (this.bM()) {
         eze $$1 = this.a(this.dv(), $$0.g());
         ezh $$2 = Objects.requireNonNullElse($$1, $$0).g();
         this.bB();
         this.b($$2);
         this.aK();
         if (this.at != null && this.at.e()) {
            this.bX();
         }

         if ($$1 == null) {
            if (this.bM() && $$0.d() != ezf.a.a) {
               this.b((ezf)$$0);
            }
            break;
         } else if (this.bM() && !this.ae) {
            cpc $$3 = this.b($$1);
            this.as = true;
            if ($$3 == cpc.a) {
               continue;
            }
            break;
         }
      }
   }

   private void E() {
      ezh $$0 = this.dA();
      ezh $$1 = this.dv();
      float $$2 = 0.99F;
      if (this.bk()) {
         for (int $$3 = 0; $$3 < 4; $$3++) {
            float $$4 = 0.25F;
            this.dX().a(lq.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$2 = this.B();
      }

      this.h($$0.c((double)$$2));
   }

   @Override
   protected double be() {
      return 0.05;
   }

   private boolean I() {
      return this.b && this.dX().b(new ezc(this.dv(), this.dv()).g(0.06));
   }

   private void J() {
      this.b = false;
      ezh $$0 = this.dA();
      this.h($$0.d((double)(this.af.i() * 0.2F), (double)(this.af.i() * 0.2F), (double)(this.af.i() * 0.2F)));
      this.l = 0;
   }

   @Override
   public void a(buz $$0, ezh $$1) {
      super.a($$0, $$1);
      if ($$0 != buz.a && this.I()) {
         this.J();
      }
   }

   protected void m() {
      this.l++;
      if (this.l >= 1200) {
         this.au();
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
   protected void b(cvt $$0) {
      this.r = null;
   }

   @Override
   protected void a(eze $$0) {
      super.a($$0);
      btz $$1 = $$0.a();
      float $$2 = (float)this.dA().g();
      double $$3 = this.m;
      btz $$4 = this.s();
      bsp $$5 = this.dY().a(this, (btz)($$4 != null ? $$4 : this));
      if (this.eb() != null && this.dX() instanceof arm $$6) {
         $$3 = (double)dbo.a($$6, this.eb(), $$1, $$5, (float)$$3);
      }

      int $$7 = azj.c(azj.a((double)$$2 * $$3, 0.0, 2.147483647E9));
      if (this.A() > 0) {
         if (this.o == null) {
            this.o = new IntOpenHashSet(5);
         }

         if (this.p == null) {
            this.p = Lists.newArrayListWithCapacity(5);
         }

         if (this.o.size() >= this.A() + 1) {
            this.au();
            return;
         }

         this.o.add($$1.ar());
      }

      if (this.y()) {
         long $$8 = (long)this.af.a($$7 / 2 + 2);
         $$7 = (int)Math.min($$8 + (long)$$7, 2147483647L);
      }

      if ($$4 instanceof buv $$9) {
         $$9.B($$1);
      }

      boolean $$10 = $$1.aq() == bug.H;
      int $$11 = $$1.aG();
      if (this.bZ() && !$$10) {
         $$1.d(5.0F);
      }

      if ($$1.a($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof buv $$12) {
            if (!this.dX().C && this.A() <= 0) {
               $$12.p($$12.eX() + 1);
            }

            this.a($$12, $$5);
            if (this.dX() instanceof arm $$13) {
               dbo.a($$13, $$12, $$5, this.eb());
            }

            this.a($$12);
            if ($$12 != $$4 && $$12 instanceof coh && $$4 instanceof arn && !this.bc()) {
               ((arn)$$4).d.b(new adk(adk.h, 0.0F));
            }

            if (!$$1.bM() && this.p != null) {
               this.p.add($$12);
            }

            if (!this.dX().C && $$4 instanceof arn $$14) {
               if (this.p != null && this.z()) {
                  an.H.a($$14, this.p);
               } else if (!$$1.bM() && this.z()) {
                  an.H.a($$14, Arrays.asList($$1));
               }
            }
         }

         this.a(this.n, 1.0F, 1.2F / (this.af.i() * 0.2F + 0.9F));
         if (this.A() <= 0) {
            this.au();
         }
      } else {
         $$1.h($$11);
         this.a(cpc.b, $$1, this.s(), false);
         this.h(this.dA().c(0.2));
         if (!this.dX().C && this.dA().h() < 1.0E-7) {
            if (this.d == cop.a.b) {
               this.a(this.t(), 0.1F);
            }

            this.au();
         }
      }
   }

   protected void a(buv $$0, bsp $$1) {
      double $$3 = (double)(this.r != null && this.dX() instanceof arm $$2 ? dbo.d($$2, this.r, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(bwd.p));
         ezh $$5 = this.dA().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.j($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(ezd $$0) {
      this.k = this.dX().a_($$0.b());
      super.a($$0);
      cvx $$1 = this.eb();
      if (this.dX() instanceof arm $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      ezh $$3 = this.dA();
      ezh $$4 = new ezh(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      ezh $$5 = $$4.c(0.05F);
      this.b(this.dv().d($$5));
      this.a(this.q(), 1.0F, 1.2F / (this.af.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(awk.aE);
      this.K();
   }

   protected void a(arm $$0, ezd $$1, cvx $$2) {
      ezh $$3 = $$1.b().a($$1.g());
      dbo.a($$0, $$2, this.s() instanceof buv $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.r = null);
   }

   @Override
   public cvx eb() {
      return this.r;
   }

   protected awj o() {
      return awk.aE;
   }

   protected final awj q() {
      return this.n;
   }

   protected void a(buv $$0) {
   }

   @Nullable
   protected eze a(ezh $$0, ezh $$1) {
      return cpd.a(this.dX(), this, $$0, $$1, this.cS().b(this.dA()).g(1.0), this::b);
   }

   @Override
   protected boolean b(btz $$0) {
      return $$0 instanceof coh && this.s() instanceof coh $$1 && !$$1.a((coh)$$0) ? false : super.b($$0) && (this.o == null || !this.o.contains($$0.ar()));
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("life", (short)this.l);
      if (this.k != null) {
         $$0.a("inBlockState", uy.a(this.k));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.m);
      $$0.a("crit", this.y());
      $$0.a("PierceLevel", this.A());
      $$0.a("SoundEvent", lx.b.b(this.n).toString());
      $$0.a("item", this.q.a(this.dZ()));
      if (this.r != null) {
         $$0.a("weapon", this.r.b(this.dZ(), new uj()));
      }
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.l = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.k = uy.a(this.dX().a(ly.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.m = $$0.k("damage");
      }

      this.d = cop.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.n = lx.b.b(alh.a($$0.l("SoundEvent"))).orElse(this.o());
      }

      if ($$0.b("item", 10)) {
         this.a(cvx.a(this.dZ(), (vg)$$0.p("item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }

      if ($$0.b("weapon", 10)) {
         this.r = cvx.a(this.dZ(), (vg)$$0.p("weapon")).orElse(null);
      } else {
         this.r = null;
      }
   }

   @Override
   public void c(@Nullable btz $$0) {
      super.c($$0);

      this.d = switch ($$0) {
         case null, default -> this.d;
         case coh $$1 when this.d == cop.a.a -> cop.a.b;
         case bvb $$2 -> cop.a.a;
      };
   }

   @Override
   public void b_(coh $$0) {
      if (!this.dX().C && (this.b || this.C()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.au();
         }
      }
   }

   protected boolean a(coh $$0) {
      return switch (this.d) {
         case a -> false;
         case b -> $$0.gk().f(this.t());
         case c -> $$0.fX();
      };
   }

   protected cvx t() {
      return this.q.v();
   }

   protected abstract cvx v();

   @Override
   protected btz.b bh() {
      return btz.b.a;
   }

   public cvx w() {
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
      return this.aq().a(axd.H);
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

   protected void a(cvx $$0) {
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

   public boolean z() {
      return this.r != null && this.r.a(cwb.vX);
   }

   public byte A() {
      return this.am.a(h);
   }

   public void a(float $$0) {
      this.h((double)($$0 * 2.0F) + this.af.a((double)this.dX().am().a() * 0.11, 0.57425));
   }

   protected float B() {
      return 0.6F;
   }

   public void b(boolean $$0) {
      this.ae = $$0;
      this.a(2, $$0);
   }

   public boolean C() {
      return !this.dX().C ? this.ae : (this.am.a(g) & 2) != 0;
   }

   @Override
   public boolean bI() {
      return super.bI() && !this.b;
   }

   @Override
   public bvn a_(int $$0) {
      return $$0 == 0 ? bvn.a(this::w, this::a) : super.a_($$0);
   }

   @Override
   protected boolean D() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public static cop.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
