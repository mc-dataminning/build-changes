import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class csq extends ctd {
   private static final double d = 2.0;
   private static final int e = 7;
   private static final float f = 0.6F;
   private static final float g = 0.99F;
   private static final short h = 0;
   private static final byte i = 0;
   private static final boolean j = false;
   private static final boolean k = false;
   private static final byte l = 0;
   private static final aku<Byte> m = aky.a(csq.class, akw.a);
   private static final aku<Byte> n = aky.a(csq.class, akw.a);
   private static final aku<Boolean> o = aky.a(csq.class, akw.k);
   private static final int p = 1;
   private static final int q = 2;
   @Nullable
   private ebq r;
   protected int a;
   public csq.a b = csq.a.a;
   public int c = 0;
   private int s = 0;
   private double t = 2.0;
   private awx u = this.j();
   @Nullable
   private IntOpenHashSet ay;
   @Nullable
   private List<bxe> az;
   private dak aA = this.o();
   @Nullable
   private dak aB = null;

   protected csq(bxn<? extends csq> $$0, dkj $$1) {
      super($$0, $$1);
   }

   protected csq(bxn<? extends csq> $$0, double $$1, double $$2, double $$3, dkj $$4, dak $$5, @Nullable dak $$6) {
      this($$0, $$4);
      this.aA = $$5.v();
      this.c($$5);
      bbh $$7 = $$5.e(kl.u);
      if ($$7 != null) {
         this.b = csq.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof asb $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.aB = $$6.v();
         int $$9 = dgz.a($$8, $$6, this.aA);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected csq(bxn<? extends csq> $$0, byf $$1, dkj $$2, dak $$3, @Nullable dak $$4) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(awx $$0) {
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
   protected void a(aky.a $$0) {
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
      if (this.f() && azz.f($$0, $$1, $$2) > 0.0) {
         this.a(false);
      }
   }

   @Override
   public void a(aku<?> $$0) {
      super.a($$0);
      if (!this.ak && this.c <= 0 && $$0.equals(o) && this.f()) {
         this.c = 7;
      }
   }

   @Override
   public void h() {
      boolean $$0 = !this.w();
      fgc $$1 = this.dy();
      iw $$2 = this.dv();
      ebq $$3 = this.dV().a_($$2);
      if (!$$3.l() && $$0) {
         fgw $$4 = $$3.g(this.dV(), $$2);
         if (!$$4.c()) {
            fgc $$5 = this.dt();

            for (ffx $$6 : $$4.e()) {
               if ($$6.a($$2).d($$5)) {
                  this.i(fgc.c);
                  this.a(true);
                  break;
               }
            }
         }
      }

      if (this.c > 0) {
         this.c--;
      }

      if (this.bk() || $$3.a(dnq.rx)) {
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
         fgc $$7 = this.dt();
         if (this.bi()) {
            this.b(this.v());
            this.a($$7);
         }

         if (this.t()) {
            for (int $$8 = 0; $$8 < 4; $$8++) {
               this.dV()
                  .a(
                     lz.f,
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
            $$9 = (float)(azz.d(-$$1.d, -$$1.f) * 180.0F / (float)Math.PI);
         } else {
            $$9 = (float)(azz.d($$1.d, $$1.f) * 180.0F / (float)Math.PI);
         }

         float $$11 = (float)(azz.d($$1.e, $$1.i()) * 180.0F / (float)Math.PI);
         this.x(f(this.dN(), $$11));
         this.w(f(this.dL(), $$9));
         if ($$0) {
            ffy $$12 = this.dV().b(new djq($$7, $$7.e($$1), djq.a.a, djq.b.a, this));
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

   private void b(ffy $$0) {
      while (this.bJ()) {
         fgc $$1 = this.dt();
         ffz $$2 = this.b($$1, $$0.g());
         fgc $$3 = Objects.requireNonNullElse($$2, $$0).g();
         this.b($$3);
         this.a($$1, $$3);
         if (this.as != null && this.as.e()) {
            this.bV();
         }

         if ($$2 == null) {
            if (this.bJ() && $$0.d() != fga.a.a) {
               this.b((fga)$$0);
               this.ar = true;
            }
            break;
         } else if (this.bJ() && !this.ad) {
            cte $$4 = this.b($$2);
            this.ar = true;
            if (this.u() > 0 && $$4 == cte.a) {
               continue;
            }
            break;
         }
      }
   }

   private void b(float $$0) {
      fgc $$1 = this.dy();
      this.i($$1.c((double)$$0));
   }

   private void a(fgc $$0) {
      fgc $$1 = this.dy();

      for (int $$2 = 0; $$2 < 4; $$2++) {
         float $$3 = 0.25F;
         this.dV().a(lz.d, $$0.d - $$1.d * 0.25, $$0.e - $$1.e * 0.25, $$0.f - $$1.f * 0.25, $$1.d, $$1.e, $$1.f);
      }
   }

   @Override
   protected double bc() {
      return 0.05;
   }

   private boolean y() {
      return this.f() && this.dV().b(new ffx(this.dt(), this.dt()).g(0.06));
   }

   private void B() {
      this.a(false);
      fgc $$0 = this.dy();
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
   public void a(byj $$0, fgc $$1) {
      super.a($$0, $$1);
      if ($$0 != byj.a && this.y()) {
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
   protected void b(dag $$0) {
      this.aB = null;
   }

   @Override
   public void a(boolean $$0, iw $$1) {
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
   protected void a(ffz $$0) {
      super.a($$0);
      bxe $$1 = $$0.a();
      float $$2 = (float)this.dy().g();
      double $$3 = this.t;
      bxe $$4 = this.q();
      bvt $$5 = this.dW().a(this, (bxe)($$4 != null ? $$4 : this));
      if (this.dZ() != null && this.dV() instanceof asb $$6) {
         $$3 = (double)dgz.a($$6, this.dZ(), $$1, $$5, (float)$$3);
      }

      int $$7 = azz.c(azz.a((double)$$2 * $$3, 0.0, 2.147483647E9));
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

      if ($$4 instanceof byf $$9) {
         $$9.B($$1);
      }

      boolean $$10 = $$1.an() == bxn.O;
      int $$11 = $$1.aE();
      if (this.bX() && !$$10) {
         $$1.e(5.0F);
      }

      if ($$1.b($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof byf $$12) {
            if (!this.dV().C && this.u() <= 0) {
               $$12.o($$12.eW() + 1);
            }

            this.a($$12, $$5);
            if (this.dV() instanceof asb $$13) {
               dgz.a($$13, $$12, $$5, this.dZ());
            }

            this.a($$12);
            if ($$12 instanceof csi && $$4 instanceof asc $$14 && !this.ba() && $$12 != $$14) {
               $$14.f.b(new adm(adm.h, 0.0F));
            }

            if (!$$1.bJ() && this.az != null) {
               this.az.add($$12);
            }

            if (!this.dV().C && $$4 instanceof asc $$15) {
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
         this.a(cte.b, $$1, this.q(), false);
         this.i(this.dy().c(0.2));
         if (this.dV() instanceof asb $$16 && this.dy().h() < 1.0E-7) {
            if (this.b == csq.a.b) {
               this.a($$16, this.n(), 0.1F);
            }

            this.aq();
         }
      }
   }

   protected void a(byf $$0, bvt $$1) {
      double $$3 = (double)(this.aB != null && this.dV() instanceof asb $$2 ? dgz.d($$2, this.aB, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(bzl.p));
         fgc $$5 = this.dy().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.i($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(ffy $$0) {
      this.r = this.dV().a_($$0.b());
      super.a($$0);
      dak $$1 = this.dZ();
      if (this.dV() instanceof asb $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      fgc $$3 = this.dy();
      fgc $$4 = new fgc(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      fgc $$5 = $$4.c(0.05F);
      this.b(this.dt().d($$5));
      this.i(fgc.c);
      this.a(this.m(), 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
      this.a(true);
      this.c = 7;
      this.b(false);
      this.a((byte)0);
      this.b(awy.aE);
      this.C();
   }

   protected void a(asb $$0, ffy $$1, dak $$2) {
      fgc $$3 = $$1.b().a($$1.g());
      dgz.a($$0, $$2, this.q() instanceof byf $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.aB = null);
   }

   @Override
   public dak dZ() {
      return this.aB;
   }

   protected awx j() {
      return awy.aE;
   }

   protected final awx m() {
      return this.u;
   }

   protected void a(byf $$0) {
   }

   @Nullable
   protected ffz b(fgc $$0, fgc $$1) {
      return ctf.a(this.dV(), this, $$0, $$1, this.cR().b(this.dy()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bxe $$0) {
      return $$0 instanceof csi && this.q() instanceof csi $$1 && !$$1.a((csi)$$0) ? false : super.b($$0) && (this.ay == null || !this.ay.contains($$0.ao()));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      alp<va> $$1 = this.dX().a(uo.a);
      $$0.a("life", (short)this.s);
      $$0.b("inBlockState", ebq.a, $$1, this.r);
      $$0.a("shake", (byte)this.c);
      $$0.a("inGround", this.f());
      $$0.a("pickup", csq.a.d, this.b);
      $$0.a("damage", this.t);
      $$0.a("crit", this.t());
      $$0.a("PierceLevel", this.u());
      $$0.a("SoundEvent", mh.b.q(), this.u);
      $$0.a("item", dak.b, $$1, this.aA);
      $$0.b("weapon", dak.b, $$1, this.aB);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      alp<va> $$1 = this.dX().a(uo.a);
      this.s = $$0.b("life", (short)0);
      this.r = $$0.<ebq>a("inBlockState", ebq.a, $$1).orElse(null);
      this.c = $$0.b("shake", (byte)0) & 255;
      this.a($$0.b("inGround", false));
      this.t = $$0.b("damage", 2.0);
      this.b = $$0.<csq.a>a("pickup", csq.a.d).orElse(csq.a.a);
      this.b($$0.b("crit", false));
      this.a($$0.b("PierceLevel", (byte)0));
      this.u = $$0.<awx>a("SoundEvent", mh.b.q()).orElse(this.j());
      this.a($$0.<dak>a("item", dak.b, $$1).orElse(this.o()));
      this.aB = $$0.<dak>a("weapon", dak.b, $$1).orElse(null);
   }

   @Override
   public void c(@Nullable bxe $$0) {
      super.c($$0);

      this.b = switch ($$0) {
         case null, default -> this.b;
         case csi $$1 when this.b == csq.a.a -> csq.a.b;
         case byl $$2 -> csq.a.a;
      };
   }

   @Override
   public void a_(csi $$0) {
      if (!this.dV().C && (this.f() || this.w()) && this.c <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.aq();
         }
      }
   }

   protected boolean a(csi $$0) {
      return switch (this.b) {
         case a -> false;
         case b -> $$0.gj().g(this.n());
         case c -> $$0.fV();
      };
   }

   protected dak n() {
      return this.aA.v();
   }

   protected abstract dak o();

   @Override
   protected bxe.c bf() {
      return bxe.c.a;
   }

   public dak s() {
      return this.aA;
   }

   public void h(double $$0) {
      this.t = $$0;
   }

   @Override
   public boolean cB() {
      return this.an().a(axq.H);
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

   protected void a(dak $$0) {
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
   public byw a_(int $$0) {
      return $$0 == 0 ? byw.a(this::s, this::a) : super.a_($$0);
   }

   @Override
   protected boolean x() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public static final Codec<csq.a> d = Codec.BYTE.xmap(csq.a::a, $$0 -> (byte)$$0.ordinal());

      public static csq.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
