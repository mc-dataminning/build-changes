import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class csf extends css {
   private static final double d = 2.0;
   private static final int e = 7;
   private static final float f = 0.6F;
   private static final float g = 0.99F;
   private static final short h = 0;
   private static final byte i = 0;
   private static final boolean j = false;
   private static final boolean k = false;
   private static final byte l = 0;
   private static final akl<Byte> m = akp.a(csf.class, akn.a);
   private static final akl<Byte> n = akp.a(csf.class, akn.a);
   private static final akl<Boolean> o = akp.a(csf.class, akn.k);
   private static final int p = 1;
   private static final int q = 2;
   @Nullable
   private ebe r;
   protected int a;
   public csf.a b = csf.a.a;
   public int c = 0;
   private int s = 0;
   private double t = 2.0;
   private awo u = this.j();
   @Nullable
   private IntOpenHashSet ay;
   @Nullable
   private List<bwt> az;
   private czy aA = this.o();
   @Nullable
   private czy aB = null;

   protected csf(bxc<? extends csf> $$0, djx $$1) {
      super($$0, $$1);
   }

   protected csf(bxc<? extends csf> $$0, double $$1, double $$2, double $$3, djx $$4, czy $$5, @Nullable czy $$6) {
      this($$0, $$4);
      this.aA = $$5.v();
      this.c($$5);
      baw $$7 = $$5.e(kk.u);
      if ($$7 != null) {
         this.b = csf.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof ars $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.aB = $$6.v();
         int $$9 = dgn.a($$8, $$6, this.aA);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected csf(bxc<? extends csf> $$0, bxu $$1, djx $$2, czy $$3, @Nullable czy $$4) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(awo $$0) {
      this.u = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cR().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cK();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(m, (byte)0);
      $$0.a(n, (byte)0);
      $$0.a(o, false);
   }

   @Override
   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      super.c($$0, $$1, $$2, $$3, $$4);
      this.s = 0;
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      super.k($$0, $$1, $$2);
      this.s = 0;
      if (this.f() && azo.f($$0, $$1, $$2) > 0.0) {
         this.a(false);
      }
   }

   @Override
   public void a(akl<?> $$0) {
      super.a($$0);
      if (!this.ak && this.c <= 0 && $$0.equals(o) && this.f()) {
         this.c = 7;
      }
   }

   @Override
   public void h() {
      boolean $$0 = !this.w();
      ffq $$1 = this.dy();
      iv $$2 = this.dv();
      ebe $$3 = this.dV().a_($$2);
      if (!$$3.l() && $$0) {
         fgk $$4 = $$3.g(this.dV(), $$2);
         if (!$$4.c()) {
            ffq $$5 = this.dt();

            for (ffl $$6 : $$4.e()) {
               if ($$6.a($$2).d($$5)) {
                  this.i(ffq.c);
                  this.a(true);
                  break;
               }
            }
         }
      }

      if (this.c > 0) {
         this.c--;
      }

      if (this.bk() || $$3.a(dne.rx)) {
         this.aF();
      }

      if (this.f() && $$0) {
         if (!this.dV().A_()) {
            if (this.r != $$3 && this.y()) {
               this.B();
            } else {
               this.g();
            }
         }

         this.a++;
         if (this.bJ()) {
            this.aI();
         }

         if (!this.dV().C) {
            this.c(this.aE() > 0);
         }
      } else {
         this.a = 0;
         ffq $$7 = this.dt();
         if (this.bi()) {
            this.b(this.v());
            this.a($$7);
         }

         if (this.t()) {
            for (int $$8 = 0; $$8 < 4; $$8++) {
               this.dV()
                  .a(
                     ly.f,
                     $$7.d + $$1.d * (double)$$8 / 4.0,
                     $$7.e + $$1.e * (double)$$8 / 4.0,
                     $$7.f + $$1.f * (double)$$8 / 4.0,
                     -$$1.d,
                     -$$1.e + 0.2,
                     -$$1.f
                  );
            }
         }

         float $$9;
         if (!$$0) {
            $$9 = (float)(azo.d(-$$1.d, -$$1.f) * 180.0F / (float)Math.PI);
         } else {
            $$9 = (float)(azo.d($$1.d, $$1.f) * 180.0F / (float)Math.PI);
         }

         float $$11 = (float)(azo.d($$1.e, $$1.i()) * 180.0F / (float)Math.PI);
         this.x(f(this.dN(), $$11));
         this.w(f(this.dL(), $$9));
         if ($$0) {
            ffm $$12 = this.dV().b(new dje($$7, $$7.e($$1), dje.a.a, dje.b.a, this));
            this.b($$12);
         } else {
            this.b($$7.e($$1));
            this.aI();
         }

         if (!this.bi()) {
            this.b(0.99F);
         }

         if ($$0 && !this.f()) {
            this.be();
         }

         super.h();
      }
   }

   private void b(ffm $$0) {
      while (this.bJ()) {
         ffq $$1 = this.dt();
         ffn $$2 = this.b($$1, $$0.g());
         ffq $$3 = Objects.requireNonNullElse($$2, $$0).g();
         this.b($$3);
         this.a($$1, $$3);
         if (this.as != null && this.as.e()) {
            this.bV();
         }

         if ($$2 == null) {
            if (this.bJ() && $$0.d() != ffo.a.a) {
               this.b((ffo)$$0);
               this.ar = true;
            }
            break;
         } else if (this.bJ() && !this.ad) {
            cst $$4 = this.b($$2);
            this.ar = true;
            if (this.u() > 0 && $$4 == cst.a) {
               continue;
            }
            break;
         }
      }
   }

   private void b(float $$0) {
      ffq $$1 = this.dy();
      this.i($$1.c((double)$$0));
   }

   private void a(ffq $$0) {
      ffq $$1 = this.dy();

      for (int $$2 = 0; $$2 < 4; $$2++) {
         float $$3 = 0.25F;
         this.dV().a(ly.d, $$0.d - $$1.d * 0.25, $$0.e - $$1.e * 0.25, $$0.f - $$1.f * 0.25, $$1.d, $$1.e, $$1.f);
      }
   }

   @Override
   protected double bc() {
      return 0.05;
   }

   private boolean y() {
      return this.f() && this.dV().b(new ffl(this.dt(), this.dt()).g(0.06));
   }

   private void B() {
      this.a(false);
      ffq $$0 = this.dy();
      this.i($$0.d((double)(this.ae.i() * 0.2F), (double)(this.ae.i() * 0.2F), (double)(this.ae.i() * 0.2F)));
      this.s = 0;
   }

   protected boolean f() {
      return this.al.a(o);
   }

   protected void a(boolean $$0) {
      this.al.a(o, $$0);
   }

   @Override
   public boolean cJ() {
      return !this.f();
   }

   @Override
   public void a(bxy $$0, ffq $$1) {
      super.a($$0, $$1);
      if ($$0 != bxy.a && this.y()) {
         this.B();
      }
   }

   protected void g() {
      this.s++;
      if (this.s >= 1200) {
         this.aq();
      }
   }

   private void C() {
      if (this.az != null) {
         this.az.clear();
      }

      if (this.ay != null) {
         this.ay.clear();
      }
   }

   @Override
   protected void b(czu $$0) {
      this.aB = null;
   }

   @Override
   public void a(boolean $$0, iv $$1) {
      if (!this.f()) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void l(boolean $$0) {
      if (!this.f()) {
         super.l($$0);
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (!this.f()) {
         super.i($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(ffn $$0) {
      super.a($$0);
      bwt $$1 = $$0.a();
      float $$2 = (float)this.dy().g();
      double $$3 = this.t;
      bwt $$4 = this.q();
      bvi $$5 = this.dW().a(this, (bwt)($$4 != null ? $$4 : this));
      if (this.dZ() != null && this.dV() instanceof ars $$6) {
         $$3 = (double)dgn.a($$6, this.dZ(), $$1, $$5, (float)$$3);
      }

      int $$7 = azo.c(azo.a((double)$$2 * $$3, 0.0, 2.147483647E9));
      if (this.u() > 0) {
         if (this.ay == null) {
            this.ay = new IntOpenHashSet(5);
         }

         if (this.az == null) {
            this.az = Lists.newArrayListWithCapacity(5);
         }

         if (this.ay.size() >= this.u() + 1) {
            this.aq();
            return;
         }

         this.ay.add($$1.ao());
      }

      if (this.t()) {
         long $$8 = (long)this.ae.a($$7 / 2 + 2);
         $$7 = (int)Math.min($$8 + (long)$$7, 2147483647L);
      }

      if ($$4 instanceof bxu $$9) {
         $$9.B($$1);
      }

      boolean $$10 = $$1.an() == bxc.O;
      int $$11 = $$1.aE();
      if (this.bX() && !$$10) {
         $$1.e(5.0F);
      }

      if ($$1.b($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof bxu $$12) {
            if (!this.dV().C && this.u() <= 0) {
               $$12.o($$12.eW() + 1);
            }

            this.a($$12, $$5);
            if (this.dV() instanceof ars $$13) {
               dgn.a($$13, $$12, $$5, this.dZ());
            }

            this.a($$12);
            if ($$12 instanceof crx && $$4 instanceof art $$14 && !this.ba() && $$12 != $$14) {
               $$14.f.b(new add(add.h, 0.0F));
            }

            if (!$$1.bJ() && this.az != null) {
               this.az.add($$12);
            }

            if (!this.dV().C && $$4 instanceof art $$15) {
               if (this.az != null) {
                  aq.H.a($$15, this.az, this.aB);
               } else if (!$$1.bJ()) {
                  aq.H.a($$15, List.of($$1), this.aB);
               }
            }
         }

         this.a(this.u, 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
         if (this.u() <= 0) {
            this.aq();
         }
      } else {
         $$1.h($$11);
         this.a(cst.b, $$1, this.q(), false);
         this.i(this.dy().c(0.2));
         if (this.dV() instanceof ars $$16 && this.dy().h() < 1.0E-7) {
            if (this.b == csf.a.b) {
               this.a($$16, this.n(), 0.1F);
            }

            this.aq();
         }
      }
   }

   protected void a(bxu $$0, bvi $$1) {
      double $$3 = (double)(this.aB != null && this.dV() instanceof ars $$2 ? dgn.d($$2, this.aB, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(bza.p));
         ffq $$5 = this.dy().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.i($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(ffm $$0) {
      this.r = this.dV().a_($$0.b());
      super.a($$0);
      czy $$1 = this.dZ();
      if (this.dV() instanceof ars $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      ffq $$3 = this.dy();
      ffq $$4 = new ffq(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      ffq $$5 = $$4.c(0.05F);
      this.b(this.dt().d($$5));
      this.i(ffq.c);
      this.a(this.m(), 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
      this.a(true);
      this.c = 7;
      this.b(false);
      this.a((byte)0);
      this.b(awp.aE);
      this.C();
   }

   protected void a(ars $$0, ffm $$1, czy $$2) {
      ffq $$3 = $$1.b().a($$1.g());
      dgn.a($$0, $$2, this.q() instanceof bxu $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.aB = null);
   }

   @Override
   public czy dZ() {
      return this.aB;
   }

   protected awo j() {
      return awp.aE;
   }

   protected final awo m() {
      return this.u;
   }

   protected void a(bxu $$0) {
   }

   @Nullable
   protected ffn b(ffq $$0, ffq $$1) {
      return csu.a(this.dV(), this, $$0, $$1, this.cR().b(this.dy()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bwt $$0) {
      return $$0 instanceof crx && this.q() instanceof crx $$1 && !$$1.a((crx)$$0) ? false : super.b($$0) && (this.ay == null || !this.ay.contains($$0.ao()));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      alg<uy> $$1 = this.dX().a(un.a);
      $$0.a("life", (short)this.s);
      $$0.b("inBlockState", ebe.a, $$1, this.r);
      $$0.a("shake", (byte)this.c);
      $$0.a("inGround", this.f());
      $$0.a("pickup", csf.a.d, this.b);
      $$0.a("damage", this.t);
      $$0.a("crit", this.t());
      $$0.a("PierceLevel", this.u());
      $$0.a("SoundEvent", mg.b.q(), this.u);
      $$0.a("item", czy.b, $$1, this.aA);
      $$0.b("weapon", czy.b, $$1, this.aB);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      alg<uy> $$1 = this.dX().a(un.a);
      this.s = $$0.b("life", (short)0);
      this.r = $$0.<ebe>a("inBlockState", ebe.a, $$1).orElse(null);
      this.c = $$0.b("shake", (byte)0) & 255;
      this.a($$0.b("inGround", false));
      this.t = $$0.b("damage", 2.0);
      this.b = $$0.<csf.a>a("pickup", csf.a.d).orElse(csf.a.a);
      this.b($$0.b("crit", false));
      this.a($$0.b("PierceLevel", (byte)0));
      this.u = $$0.<awo>a("SoundEvent", mg.b.q()).orElse(this.j());
      this.a($$0.<czy>a("item", czy.b, $$1).orElse(this.o()));
      this.aB = $$0.<czy>a("weapon", czy.b, $$1).orElse(null);
   }

   @Override
   public void c(@Nullable bwt $$0) {
      super.c($$0);

      this.b = switch ($$0) {
         case null, default -> this.b;
         case crx $$1 when this.b == csf.a.a -> csf.a.b;
         case bya $$2 -> csf.a.a;
      };
   }

   @Override
   public void a_(crx $$0) {
      if (!this.dV().C && (this.f() || this.w()) && this.c <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.aq();
         }
      }
   }

   protected boolean a(crx $$0) {
      return switch (this.b) {
         case a -> false;
         case b -> $$0.gj().g(this.n());
         case c -> $$0.fV();
      };
   }

   protected czy n() {
      return this.aA.v();
   }

   protected abstract czy o();

   @Override
   protected bwt.c bf() {
      return bwt.c.a;
   }

   public czy s() {
      return this.aA;
   }

   public void h(double $$0) {
      this.t = $$0;
   }

   @Override
   public boolean cB() {
      return this.an().a(axh.H);
   }

   public void b(boolean $$0) {
      this.a(1, $$0);
   }

   private void a(byte $$0) {
      this.al.a(n, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.al.a(m);
      if ($$1) {
         this.al.a(m, (byte)($$2 | $$0));
      } else {
         this.al.a(m, (byte)($$2 & ~$$0));
      }
   }

   protected void a(czy $$0) {
      if (!$$0.f()) {
         this.aA = $$0;
      } else {
         this.aA = this.o();
      }
   }

   public boolean t() {
      byte $$0 = this.al.a(m);
      return ($$0 & 1) != 0;
   }

   public byte u() {
      return this.al.a(n);
   }

   public void a(float $$0) {
      this.h((double)($$0 * 2.0F) + this.ae.a((double)this.dV().an().a() * 0.11, 0.57425));
   }

   protected float v() {
      return 0.6F;
   }

   public void q(boolean $$0) {
      this.ad = $$0;
      this.a(2, $$0);
   }

   public boolean w() {
      return !this.dV().C ? this.ad : (this.al.a(m) & 2) != 0;
   }

   @Override
   public boolean bF() {
      return super.bF() && !this.f();
   }

   @Override
   public byl a_(int $$0) {
      return $$0 == 0 ? byl.a(this::s, this::a) : super.a_($$0);
   }

   @Override
   protected boolean x() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public static final Codec<csf.a> d = Codec.BYTE.xmap(csf.a::a, $$0 -> (byte)$$0.ordinal());

      public static csf.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
