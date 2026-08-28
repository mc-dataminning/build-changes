import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class cqe extends cqq {
   private static final double e = 2.0;
   public static final int a = 7;
   private static final alc<Byte> f = alg.a(cqe.class, ale.a);
   private static final alc<Byte> g = alg.a(cqe.class, ale.a);
   private static final alc<Boolean> h = alg.a(cqe.class, ale.k);
   private static final int i = 1;
   private static final int j = 2;
   @Nullable
   private dxv k;
   protected int b;
   public cqe.a c = cqe.a.a;
   public int d;
   private int l;
   private double m = 2.0;
   private axe n = this.s();
   @Nullable
   private IntOpenHashSet o;
   @Nullable
   private List<bvk> p;
   private cxp q = this.v();
   @Nullable
   private cxp r = null;

   protected cqe(bvr<? extends cqe> $$0, dhi $$1) {
      super($$0, $$1);
   }

   protected cqe(bvr<? extends cqe> $$0, double $$1, double $$2, double $$3, dhi $$4, cxp $$5, @Nullable cxp $$6) {
      this($$0, $$4);
      this.q = $$5.v();
      this.b($$5.a(ku.g));
      bbk $$7 = $$5.c(ku.v);
      if ($$7 != null) {
         this.c = cqe.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof ash $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.r = $$6.v();
         int $$9 = deb.a($$8, $$6, this.q);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected cqe(bvr<? extends cqe> $$0, bwg $$1, dhi $$2, cxp $$3, @Nullable cxp $$4) {
      this($$0, $$1.dB(), $$1.dF() - 0.1F, $$1.dH(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(axe $$0) {
      this.n = $$0;
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
   protected void a(alg.a $$0) {
      $$0.a(f, (byte)0);
      $$0.a(g, (byte)0);
      $$0.a(h, false);
   }

   @Override
   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      super.c($$0, $$1, $$2, $$3, $$4);
      this.l = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.b($$3, $$4);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      this.l = 0;
      if (this.l() && bae.f($$0, $$1, $$2) > 0.0) {
         this.a(false);
      }
   }

   @Override
   public void a(alc<?> $$0) {
      super.a($$0);
      if (!this.ak && this.d <= 0 && $$0.equals(h) && this.l()) {
         this.d = 7;
      }
   }

   @Override
   public void h() {
      boolean $$0 = !this.B();
      fby $$1 = this.dz();
      jh $$2 = this.dw();
      dxv $$3 = this.dW().a_($$2);
      if (!$$3.l() && $$0) {
         fcs $$4 = $$3.g(this.dW(), $$2);
         if (!$$4.c()) {
            fby $$5 = this.du();

            for (fbt $$6 : $$4.e()) {
               if ($$6.a($$2).d($$5)) {
                  this.a(true);
                  break;
               }
            }
         }
      }

      if (this.d > 0) {
         this.d--;
      }

      if (this.bk() || $$3.a(dko.rk)) {
         this.aH();
      }

      if (this.l() && $$0) {
         if (!this.dW().B_()) {
            if (this.k != $$3 && this.G()) {
               this.H();
            } else {
               this.m();
            }
         }

         this.b++;
         if (this.bL()) {
            this.aK();
         }
      } else {
         this.b = 0;
         fby $$7 = this.du();
         if (this.bj()) {
            this.a($$7);
         }

         if (this.y()) {
            for (int $$8 = 0; $$8 < 4; $$8++) {
               this.dW()
                  .a(
                     ls.f,
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
            $$9 = (float)(bae.d(-$$1.d, -$$1.f) * 180.0F / (float)Math.PI);
         } else {
            $$9 = (float)(bae.d($$1.d, $$1.f) * 180.0F / (float)Math.PI);
         }

         float $$11 = (float)(bae.d($$1.e, $$1.i()) * 180.0F / (float)Math.PI);
         this.w(f(this.dO(), $$11));
         this.v(f(this.dM(), $$9));
         if ($$0) {
            fbu $$12 = this.dW().b(new dgq($$7, $$7.e($$1), dgq.a.a, dgq.b.a, this));
            this.b($$12);
         } else {
            this.b($$7.e($$1));
            this.aK();
         }

         this.D();
         if ($$0 && !this.l()) {
            this.bf();
         }

         super.h();
      }
   }

   private void b(fbu $$0) {
      while (this.bL()) {
         fby $$1 = this.du();
         fbv $$2 = this.c($$1, $$0.g());
         fby $$3 = Objects.requireNonNullElse($$2, $$0).g();
         this.b($$3);
         this.a($$1, $$3);
         if (this.as != null && this.as.e()) {
            this.bW();
         }

         if ($$2 == null) {
            if (this.bL() && $$0.d() != fbw.a.a) {
               this.b((fbw)$$0);
               this.ar = true;
            }
            break;
         } else if (this.bL() && !this.ad) {
            cqr $$4 = this.b($$2);
            this.ar = true;
            if (this.z() > 0 && $$4 == cqr.a) {
               continue;
            }
            break;
         }
      }
   }

   private void D() {
      fby $$0 = this.dz();
      float $$1 = 0.99F;
      if (this.bj()) {
         $$1 = this.A();
      }

      this.h($$0.c((double)$$1));
   }

   private void a(fby $$0) {
      fby $$1 = this.dz();

      for (int $$2 = 0; $$2 < 4; $$2++) {
         float $$3 = 0.25F;
         this.dW().a(ls.d, $$0.d - $$1.d * 0.25, $$0.e - $$1.e * 0.25, $$0.f - $$1.f * 0.25, $$1.d, $$1.e, $$1.f);
      }
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   private boolean G() {
      return this.l() && this.dW().b(new fbt(this.du(), this.du()).g(0.06));
   }

   private void H() {
      this.a(false);
      fby $$0 = this.dz();
      this.h($$0.d((double)(this.ae.i() * 0.2F), (double)(this.ae.i() * 0.2F), (double)(this.ae.i() * 0.2F)));
      this.l = 0;
   }

   protected boolean l() {
      return this.al.a(h);
   }

   protected void a(boolean $$0) {
      this.al.a(h, $$0);
   }

   @Override
   public void a(bwk $$0, fby $$1) {
      super.a($$0, $$1);
      if ($$0 != bwk.a && this.G()) {
         this.H();
      }
   }

   @Override
   protected void m() {
      this.l++;
      if (this.l >= 1200) {
         this.at();
      }
   }

   private void I() {
      if (this.p != null) {
         this.p.clear();
      }

      if (this.o != null) {
         this.o.clear();
      }
   }

   @Override
   protected void b(cxl $$0) {
      this.r = null;
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      bvk $$1 = $$0.a();
      float $$2 = (float)this.dz().g();
      double $$3 = this.m;
      bvk $$4 = this.p();
      bua $$5 = this.dX().a(this, (bvk)($$4 != null ? $$4 : this));
      if (this.ea() != null && this.dW() instanceof ash $$6) {
         $$3 = (double)deb.a($$6, this.ea(), $$1, $$5, (float)$$3);
      }

      int $$7 = bae.c(bae.a((double)$$2 * $$3, 0.0, 2.147483647E9));
      if (this.z() > 0) {
         if (this.o == null) {
            this.o = new IntOpenHashSet(5);
         }

         if (this.p == null) {
            this.p = Lists.newArrayListWithCapacity(5);
         }

         if (this.o.size() >= this.z() + 1) {
            this.at();
            return;
         }

         this.o.add($$1.ar());
      }

      if (this.y()) {
         long $$8 = (long)this.ae.a($$7 / 2 + 2);
         $$7 = (int)Math.min($$8 + (long)$$7, 2147483647L);
      }

      if ($$4 instanceof bwg $$9) {
         $$9.B($$1);
      }

      boolean $$10 = $$1.aq() == bvr.O;
      int $$11 = $$1.aG();
      if (this.bY() && !$$10) {
         $$1.d(5.0F);
      }

      if ($$1.b($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof bwg $$12) {
            if (!this.dW().C && this.z() <= 0) {
               $$12.o($$12.eU() + 1);
            }

            this.a($$12, $$5);
            if (this.dW() instanceof ash $$13) {
               deb.a($$13, $$12, $$5, this.ea());
            }

            this.a($$12);
            if ($$12 != $$4 && $$12 instanceof cpx && $$4 instanceof asi && !this.bb()) {
               ((asi)$$4).f.b(new adz(adz.h, 0.0F));
            }

            if (!$$1.bL() && this.p != null) {
               this.p.add($$12);
            }

            if (!this.dW().C && $$4 instanceof asi $$14) {
               if (this.p != null) {
                  ao.H.a($$14, this.p, this.r);
               } else if (!$$1.bL()) {
                  ao.H.a($$14, List.of($$1), this.r);
               }
            }
         }

         this.a(this.n, 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
         if (this.z() <= 0) {
            this.at();
         }
      } else {
         $$1.h($$11);
         this.a(cqr.b, $$1, this.p(), false);
         this.h(this.dz().c(0.2));
         if (this.dW() instanceof ash $$15 && this.dz().h() < 1.0E-7) {
            if (this.c == cqe.a.b) {
               this.a($$15, this.u(), 0.1F);
            }

            this.at();
         }
      }
   }

   protected void a(bwg $$0, bua $$1) {
      double $$3 = (double)(this.r != null && this.dW() instanceof ash $$2 ? deb.d($$2, this.r, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(bxo.p));
         fby $$5 = this.dz().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.j($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(fbu $$0) {
      this.k = this.dW().a_($$0.b());
      super.a($$0);
      cxp $$1 = this.ea();
      if (this.dW() instanceof ash $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      fby $$3 = this.dz();
      fby $$4 = new fby(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      fby $$5 = $$4.c(0.05F);
      this.b(this.du().d($$5));
      this.h(fby.c);
      this.a(this.t(), 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
      this.a(true);
      this.d = 7;
      this.b(false);
      this.a((byte)0);
      this.b(axf.aE);
      this.I();
   }

   protected void a(ash $$0, fbu $$1, cxp $$2) {
      fby $$3 = $$1.b().a($$1.g());
      deb.a($$0, $$2, this.p() instanceof bwg $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.r = null);
   }

   @Override
   public cxp ea() {
      return this.r;
   }

   protected axe s() {
      return axf.aE;
   }

   protected final axe t() {
      return this.n;
   }

   protected void a(bwg $$0) {
   }

   @Nullable
   protected fbv c(fby $$0, fby $$1) {
      return cqs.a(this.dW(), this, $$0, $$1, this.cR().b(this.dz()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bvk $$0) {
      return $$0 instanceof cpx && this.p() instanceof cpx $$1 && !$$1.a((cpx)$$0) ? false : super.b($$0) && (this.o == null || !this.o.contains($$0.ar()));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("life", (short)this.l);
      if (this.k != null) {
         $$0.a("inBlockState", vm.a(this.k));
      }

      $$0.a("shake", (byte)this.d);
      $$0.a("inGround", this.l());
      $$0.a("pickup", (byte)this.c.ordinal());
      $$0.a("damage", this.m);
      $$0.a("crit", this.y());
      $$0.a("PierceLevel", this.z());
      $$0.a("SoundEvent", ma.b.b(this.n).toString());
      $$0.a("item", this.q.a(this.dY()));
      if (this.r != null) {
         $$0.a("weapon", this.r.b(this.dY(), new ux()));
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.l = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.k = vm.a(this.dW().a(mb.f), $$0.p("inBlockState"));
      }

      this.d = $$0.f("shake") & 255;
      this.a($$0.q("inGround"));
      if ($$0.b("damage", 99)) {
         this.m = $$0.k("damage");
      }

      this.c = cqe.a.a($$0.f("pickup"));
      this.b($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.n = ma.b.b(alz.a($$0.l("SoundEvent"))).orElse(this.s());
      }

      if ($$0.b("item", 10)) {
         this.a(cxp.a(this.dY(), (vu)$$0.p("item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }

      if ($$0.b("weapon", 10)) {
         this.r = cxp.a(this.dY(), (vu)$$0.p("weapon")).orElse(null);
      } else {
         this.r = null;
      }
   }

   @Override
   public void c(@Nullable bvk $$0) {
      super.c($$0);

      this.c = switch ($$0) {
         case null, default -> this.c;
         case cpx $$1 when this.c == cqe.a.a -> cqe.a.b;
         case bwm $$2 -> cqe.a.a;
      };
   }

   @Override
   public void a_(cpx $$0) {
      if (!this.dW().C && (this.l() || this.B()) && this.d <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.at();
         }
      }
   }

   protected boolean a(cpx $$0) {
      return switch (this.c) {
         case a -> false;
         case b -> $$0.gi().f(this.u());
         case c -> $$0.fV();
      };
   }

   protected cxp u() {
      return this.q.v();
   }

   protected abstract cxp v();

   @Override
   protected bvk.c bg() {
      return bvk.c.a;
   }

   public cxp w() {
      return this.q;
   }

   public void h(double $$0) {
      this.m = $$0;
   }

   public double x() {
      return this.m;
   }

   @Override
   public boolean cB() {
      return this.aq().a(axy.H);
   }

   public void b(boolean $$0) {
      this.a(1, $$0);
   }

   private void a(byte $$0) {
      this.al.a(g, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.al.a(f);
      if ($$1) {
         this.al.a(f, (byte)($$2 | $$0));
      } else {
         this.al.a(f, (byte)($$2 & ~$$0));
      }
   }

   protected void a(cxp $$0) {
      if (!$$0.f()) {
         this.q = $$0;
      } else {
         this.q = this.v();
      }
   }

   public boolean y() {
      byte $$0 = this.al.a(f);
      return ($$0 & 1) != 0;
   }

   public byte z() {
      return this.al.a(g);
   }

   public void a(float $$0) {
      this.h((double)($$0 * 2.0F) + this.ae.a((double)this.dW().al().a() * 0.11, 0.57425));
   }

   protected float A() {
      return 0.6F;
   }

   public void r(boolean $$0) {
      this.ad = $$0;
      this.a(2, $$0);
   }

   public boolean B() {
      return !this.dW().C ? this.ad : (this.al.a(f) & 2) != 0;
   }

   @Override
   public boolean bH() {
      return super.bH() && !this.l();
   }

   @Override
   public bwy a_(int $$0) {
      return $$0 == 0 ? bwy.a(this::w, this::a) : super.a_($$0);
   }

   @Override
   protected boolean C() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public static cqe.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
