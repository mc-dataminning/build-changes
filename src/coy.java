import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class coy extends cpk {
   private static final double f = 2.0;
   private static final ako<Byte> g = aks.a(coy.class, akq.a);
   private static final ako<Byte> h = aks.a(coy.class, akq.a);
   private static final int i = 1;
   private static final int j = 2;
   @Nullable
   private dvo k;
   protected boolean b;
   protected int c;
   public coy.a d = coy.a.a;
   public int e;
   private int l;
   private double m = 2.0;
   private awn n = this.o();
   @Nullable
   private IntOpenHashSet o;
   @Nullable
   private List<bui> p;
   private cwf q = this.v();
   @Nullable
   private cwf r = null;

   protected coy(bup<? extends coy> $$0, dff $$1) {
      super($$0, $$1);
   }

   protected coy(bup<? extends coy> $$0, double $$1, double $$2, double $$3, dff $$4, cwf $$5, @Nullable cwf $$6) {
      this($$0, $$4);
      this.q = $$5.v();
      this.b($$5.a(ku.g));
      bat $$7 = $$5.c(ku.v);
      if ($$7 != null) {
         this.d = coy.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof arq $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.r = $$6.v();
         int $$9 = dby.a($$8, $$6, this.q);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected coy(bup<? extends coy> $$0, bve $$1, dff $$2, cwf $$3, @Nullable cwf $$4) {
      this($$0, $$1.dD(), $$1.dH() - 0.1F, $$1.dJ(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(awn $$0) {
      this.n = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cT().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cM();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(aks.a $$0) {
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
      ezr $$1 = this.dB();
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$2 = $$1.i();
         this.v((float)(azn.d($$1.d, $$1.f) * 180.0F / (float)Math.PI));
         this.w((float)(azn.d($$1.e, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dO();
         this.P = this.dQ();
      }

      jh $$3 = this.dy();
      dvo $$4 = this.dY().a_($$3);
      if (!$$4.l() && !$$0) {
         fal $$5 = $$4.g(this.dY(), $$3);
         if (!$$5.c()) {
            ezr $$6 = this.dw();

            for (ezm $$7 : $$5.e()) {
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

      if (this.bm() || $$4.a(dil.qP)) {
         this.aJ();
      }

      if (this.b && !$$0) {
         if (this.k != $$4 && this.G()) {
            this.I();
         } else if (!this.dY().C) {
            this.m();
         }

         this.c++;
      } else {
         this.c = 0;
         ezr $$8 = this.dw();
         if (this.y()) {
            for (int $$9 = 0; $$9 < 4; $$9++) {
               this.dY()
                  .a(
                     ls.f,
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
            $$10 = (float)(azn.d(-$$1.d, -$$1.f) * 180.0F / (float)Math.PI);
         } else {
            $$10 = (float)(azn.d($$1.d, $$1.f) * 180.0F / (float)Math.PI);
         }

         float $$12 = (float)(azn.d($$1.e, $$1.i()) * 180.0F / (float)Math.PI);
         this.w(e(this.dQ(), $$12));
         this.v(e(this.dO(), $$10));
         if (!$$0) {
            ezn $$13 = this.dY().b(new den($$8, $$8.e($$1), den.a.a, den.b.a, this));
            this.b($$13);
         } else {
            this.b($$8.e($$1));
            this.aM();
            if (this.at != null && this.at.e()) {
               this.bY();
            }
         }

         super.l();
         this.D();
         if (!$$0) {
            this.bh();
         }
      }
   }

   private void b(ezn $$0) {
      while (this.bN()) {
         ezr $$1 = this.dw();
         ezo $$2 = this.c($$1, $$0.g());
         ezr $$3 = Objects.requireNonNullElse($$2, $$0).g();
         this.b($$3);
         this.a($$1, $$3);
         if (this.at != null && this.at.e()) {
            this.bY();
         }

         if ($$2 == null) {
            if (this.bN() && $$0.d() != ezp.a.a) {
               this.b((ezp)$$0);
               this.as = true;
            }
            break;
         } else if (this.bN() && !this.ae) {
            cpl $$4 = this.b($$2);
            this.as = true;
            if (this.z() > 0 && $$4 == cpl.a) {
               continue;
            }
            break;
         }
      }
   }

   private void D() {
      ezr $$0 = this.dB();
      ezr $$1 = this.dw();
      float $$2 = 0.99F;
      if (this.bl()) {
         for (int $$3 = 0; $$3 < 4; $$3++) {
            float $$4 = 0.25F;
            this.dY().a(ls.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$2 = this.A();
      }

      this.h($$0.c((double)$$2));
   }

   @Override
   protected double bf() {
      return 0.05;
   }

   private boolean G() {
      return this.b && this.dY().b(new ezm(this.dw(), this.dw()).g(0.06));
   }

   private void I() {
      this.b = false;
      ezr $$0 = this.dB();
      this.h($$0.d((double)(this.af.i() * 0.2F), (double)(this.af.i() * 0.2F), (double)(this.af.i() * 0.2F)));
      this.l = 0;
   }

   @Override
   public void a(bvi $$0, ezr $$1) {
      super.a($$0, $$1);
      if ($$0 != bvi.a && this.G()) {
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
   protected void b(cwb $$0) {
      this.r = null;
   }

   @Override
   protected void a(ezo $$0) {
      super.a($$0);
      bui $$1 = $$0.a();
      float $$2 = (float)this.dB().g();
      double $$3 = this.m;
      bui $$4 = this.s();
      bsy $$5 = this.dZ().a(this, (bui)($$4 != null ? $$4 : this));
      if (this.ec() != null && this.dY() instanceof arq $$6) {
         $$3 = (double)dby.a($$6, this.ec(), $$1, $$5, (float)$$3);
      }

      int $$7 = azn.c(azn.a((double)$$2 * $$3, 0.0, 2.147483647E9));
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

      if ($$4 instanceof bve $$9) {
         $$9.B($$1);
      }

      boolean $$10 = $$1.ar() == bup.H;
      int $$11 = $$1.aI();
      if (this.ca() && !$$10) {
         $$1.d(5.0F);
      }

      if ($$1.a($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof bve $$12) {
            if (!this.dY().C && this.z() <= 0) {
               $$12.p($$12.eY() + 1);
            }

            this.a($$12, $$5);
            if (this.dY() instanceof arq $$13) {
               dby.a($$13, $$12, $$5, this.ec());
            }

            this.a($$12);
            if ($$12 != $$4 && $$12 instanceof cor && $$4 instanceof arr && !this.bd()) {
               ((arr)$$4).g.b(new ado(ado.h, 0.0F));
            }

            if (!$$1.bN() && this.p != null) {
               this.p.add($$12);
            }

            if (!this.dY().C && $$4 instanceof arr $$14) {
               if (this.p != null) {
                  ao.H.a($$14, this.p, this.r);
               } else if (!$$1.bN()) {
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
         this.a(cpl.b, $$1, this.s(), false);
         this.h(this.dB().c(0.2));
         if (!this.dY().C && this.dB().h() < 1.0E-7) {
            if (this.d == coy.a.b) {
               this.a(this.t(), 0.1F);
            }

            this.av();
         }
      }
   }

   protected void a(bve $$0, bsy $$1) {
      double $$3 = (double)(this.r != null && this.dY() instanceof arq $$2 ? dby.d($$2, this.r, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(bwm.p));
         ezr $$5 = this.dB().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.j($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(ezn $$0) {
      this.k = this.dY().a_($$0.b());
      super.a($$0);
      cwf $$1 = this.ec();
      if (this.dY() instanceof arq $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      ezr $$3 = this.dB();
      ezr $$4 = new ezr(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      ezr $$5 = $$4.c(0.05F);
      this.b(this.dw().d($$5));
      this.h(ezr.c);
      this.a(this.q(), 1.0F, 1.2F / (this.af.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(awo.aE);
      this.J();
   }

   protected void a(arq $$0, ezn $$1, cwf $$2) {
      ezr $$3 = $$1.b().a($$1.g());
      dby.a($$0, $$2, this.s() instanceof bve $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.r = null);
   }

   @Override
   public cwf ec() {
      return this.r;
   }

   protected awn o() {
      return awo.aE;
   }

   protected final awn q() {
      return this.n;
   }

   protected void a(bve $$0) {
   }

   @Nullable
   protected ezo c(ezr $$0, ezr $$1) {
      return cpm.a(this.dY(), this, $$0, $$1, this.cT().b(this.dB()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bui $$0) {
      return $$0 instanceof cor && this.s() instanceof cor $$1 && !$$1.a((cor)$$0) ? false : super.b($$0) && (this.o == null || !this.o.contains($$0.as()));
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("life", (short)this.l);
      if (this.k != null) {
         $$0.a("inBlockState", vc.a(this.k));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.m);
      $$0.a("crit", this.y());
      $$0.a("PierceLevel", this.z());
      $$0.a("SoundEvent", lz.b.b(this.n).toString());
      $$0.a("item", this.q.a(this.ea()));
      if (this.r != null) {
         $$0.a("weapon", this.r.b(this.ea(), new un()));
      }
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.l = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.k = vc.a(this.dY().a(ma.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.m = $$0.k("damage");
      }

      this.d = coy.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.n = lz.b.b(all.a($$0.l("SoundEvent"))).orElse(this.o());
      }

      if ($$0.b("item", 10)) {
         this.a(cwf.a(this.ea(), (vk)$$0.p("item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }

      if ($$0.b("weapon", 10)) {
         this.r = cwf.a(this.ea(), (vk)$$0.p("weapon")).orElse(null);
      } else {
         this.r = null;
      }
   }

   @Override
   public void c(@Nullable bui $$0) {
      super.c($$0);

      this.d = switch ($$0) {
         case null, default -> this.d;
         case cor $$1 when this.d == coy.a.a -> coy.a.b;
         case bvk $$2 -> coy.a.a;
      };
   }

   @Override
   public void b_(cor $$0) {
      if (!this.dY().C && (this.b || this.B()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.av();
         }
      }
   }

   protected boolean a(cor $$0) {
      return switch (this.d) {
         case a -> false;
         case b -> $$0.gl().f(this.t());
         case c -> $$0.fY();
      };
   }

   protected cwf t() {
      return this.q.v();
   }

   protected abstract cwf v();

   @Override
   protected bui.b bi() {
      return bui.b.a;
   }

   public cwf w() {
      return this.q;
   }

   public void h(double $$0) {
      this.m = $$0;
   }

   public double x() {
      return this.m;
   }

   @Override
   public boolean cD() {
      return this.ar().a(axh.H);
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

   protected void a(cwf $$0) {
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
      this.h((double)($$0 * 2.0F) + this.af.a((double)this.dY().ak().a() * 0.11, 0.57425));
   }

   protected float A() {
      return 0.6F;
   }

   public void b(boolean $$0) {
      this.ae = $$0;
      this.a(2, $$0);
   }

   public boolean B() {
      return !this.dY().C ? this.ae : (this.am.a(g) & 2) != 0;
   }

   @Override
   public boolean bJ() {
      return super.bJ() && !this.b;
   }

   @Override
   public bvw a_(int $$0) {
      return $$0 == 0 ? bvw.a(this::w, this::a) : super.a_($$0);
   }

   @Override
   protected boolean C() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public static coy.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
