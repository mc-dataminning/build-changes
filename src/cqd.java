import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class cqd extends cqp {
   private static final double e = 2.0;
   public static final int a = 7;
   private static final alc<Byte> f = alg.a(cqd.class, ale.a);
   private static final alc<Byte> g = alg.a(cqd.class, ale.a);
   private static final alc<Boolean> h = alg.a(cqd.class, ale.k);
   private static final int i = 1;
   private static final int j = 2;
   @Nullable
   private dxu k;
   protected int b;
   public cqd.a c = cqd.a.a;
   public int d;
   private int l;
   private double m = 2.0;
   private axe n = this.s();
   @Nullable
   private IntOpenHashSet o;
   @Nullable
   private List<bvj> p;
   private cxo q = this.v();
   @Nullable
   private cxo r = null;

   protected cqd(bvq<? extends cqd> $$0, dhh $$1) {
      super($$0, $$1);
   }

   protected cqd(bvq<? extends cqd> $$0, double $$1, double $$2, double $$3, dhh $$4, cxo $$5, @Nullable cxo $$6) {
      this($$0, $$4);
      this.q = $$5.v();
      this.b($$5.a(ku.g));
      bbk $$7 = $$5.c(ku.v);
      if ($$7 != null) {
         this.c = cqd.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof ash $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.r = $$6.v();
         int $$9 = dea.a($$8, $$6, this.q);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected cqd(bvq<? extends cqd> $$0, bwf $$1, dhh $$2, cxo $$3, @Nullable cxo $$4) {
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
      super.l($$0, $$1, $$2);
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
      fbx $$1 = this.dz();
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$2 = $$1.i();
         this.v((float)(bae.d($$1.d, $$1.f) * 180.0F / (float)Math.PI));
         this.w((float)(bae.d($$1.e, $$2) * 180.0F / (float)Math.PI));
         this.N = this.dM();
         this.O = this.dO();
      }

      jh $$3 = this.dw();
      dxu $$4 = this.dW().a_($$3);
      if (!$$4.l() && $$0) {
         fcr $$5 = $$4.g(this.dW(), $$3);
         if (!$$5.c()) {
            fbx $$6 = this.du();

            for (fbs $$7 : $$5.e()) {
               if ($$7.a($$3).d($$6)) {
                  this.a(true);
                  break;
               }
            }
         }
      }

      if (this.d > 0) {
         this.d--;
      }

      if (this.bk() || $$4.a(dkn.rk)) {
         this.aH();
      }

      if (this.l() && $$0) {
         if (!this.dW().B_()) {
            if (this.k != $$4 && this.G()) {
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
         fbx $$8 = this.du();
         if (this.bj()) {
            this.a($$8);
         }

         if (this.y()) {
            for (int $$9 = 0; $$9 < 4; $$9++) {
               this.dW()
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
         if (!$$0) {
            $$10 = (float)(bae.d(-$$1.d, -$$1.f) * 180.0F / (float)Math.PI);
         } else {
            $$10 = (float)(bae.d($$1.d, $$1.f) * 180.0F / (float)Math.PI);
         }

         float $$12 = (float)(bae.d($$1.e, $$1.i()) * 180.0F / (float)Math.PI);
         this.w(f(this.dO(), $$12));
         this.v(f(this.dM(), $$10));
         if ($$0) {
            fbt $$13 = this.dW().b(new dgp($$8, $$8.e($$1), dgp.a.a, dgp.b.a, this));
            this.b($$13);
         } else {
            this.b($$8.e($$1));
            this.aK();
         }

         this.D();
         if ($$0) {
            this.bf();
         }

         super.h();
      }
   }

   private void b(fbt $$0) {
      while (this.bL()) {
         fbx $$1 = this.du();
         fbu $$2 = this.c($$1, $$0.g());
         fbx $$3 = Objects.requireNonNullElse($$2, $$0).g();
         this.b($$3);
         this.a($$1, $$3);
         if (this.as != null && this.as.e()) {
            this.bW();
         }

         if ($$2 == null) {
            if (this.bL() && $$0.d() != fbv.a.a) {
               this.b((fbv)$$0);
               this.ar = true;
            }
            break;
         } else if (this.bL() && !this.ad) {
            cqq $$4 = this.b($$2);
            this.ar = true;
            if (this.z() > 0 && $$4 == cqq.a) {
               continue;
            }
            break;
         }
      }
   }

   private void D() {
      fbx $$0 = this.dz();
      float $$1 = 0.99F;
      if (this.bj()) {
         $$1 = this.A();
      }

      this.h($$0.c((double)$$1));
   }

   private void a(fbx $$0) {
      fbx $$1 = this.dz();

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
      return this.l() && this.dW().b(new fbs(this.du(), this.du()).g(0.06));
   }

   private void H() {
      this.a(false);
      fbx $$0 = this.dz();
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
   public void a(bwj $$0, fbx $$1) {
      super.a($$0, $$1);
      if ($$0 != bwj.a && this.G()) {
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
   protected void b(cxk $$0) {
      this.r = null;
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      bvj $$1 = $$0.a();
      float $$2 = (float)this.dz().g();
      double $$3 = this.m;
      bvj $$4 = this.p();
      btz $$5 = this.dX().a(this, (bvj)($$4 != null ? $$4 : this));
      if (this.ea() != null && this.dW() instanceof ash $$6) {
         $$3 = (double)dea.a($$6, this.ea(), $$1, $$5, (float)$$3);
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

      if ($$4 instanceof bwf $$9) {
         $$9.B($$1);
      }

      boolean $$10 = $$1.aq() == bvq.O;
      int $$11 = $$1.aG();
      if (this.bY() && !$$10) {
         $$1.d(5.0F);
      }

      if ($$1.b($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof bwf $$12) {
            if (!this.dW().C && this.z() <= 0) {
               $$12.o($$12.eU() + 1);
            }

            this.a($$12, $$5);
            if (this.dW() instanceof ash $$13) {
               dea.a($$13, $$12, $$5, this.ea());
            }

            this.a($$12);
            if ($$12 != $$4 && $$12 instanceof cpw && $$4 instanceof asi && !this.bb()) {
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
         this.a(cqq.b, $$1, this.p(), false);
         this.h(this.dz().c(0.2));
         if (this.dW() instanceof ash $$15 && this.dz().h() < 1.0E-7) {
            if (this.c == cqd.a.b) {
               this.a($$15, this.u(), 0.1F);
            }

            this.at();
         }
      }
   }

   protected void a(bwf $$0, btz $$1) {
      double $$3 = (double)(this.r != null && this.dW() instanceof ash $$2 ? dea.d($$2, this.r, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(bxn.p));
         fbx $$5 = this.dz().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.j($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(fbt $$0) {
      this.k = this.dW().a_($$0.b());
      super.a($$0);
      cxo $$1 = this.ea();
      if (this.dW() instanceof ash $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      fbx $$3 = this.dz();
      fbx $$4 = new fbx(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      fbx $$5 = $$4.c(0.05F);
      this.b(this.du().d($$5));
      this.h(fbx.c);
      this.a(this.t(), 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
      this.a(true);
      this.d = 7;
      this.b(false);
      this.a((byte)0);
      this.b(axf.aE);
      this.I();
   }

   protected void a(ash $$0, fbt $$1, cxo $$2) {
      fbx $$3 = $$1.b().a($$1.g());
      dea.a($$0, $$2, this.p() instanceof bwf $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.r = null);
   }

   @Override
   public cxo ea() {
      return this.r;
   }

   protected axe s() {
      return axf.aE;
   }

   protected final axe t() {
      return this.n;
   }

   protected void a(bwf $$0) {
   }

   @Nullable
   protected fbu c(fbx $$0, fbx $$1) {
      return cqr.a(this.dW(), this, $$0, $$1, this.cR().b(this.dz()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bvj $$0) {
      return $$0 instanceof cpw && this.p() instanceof cpw $$1 && !$$1.a((cpw)$$0) ? false : super.b($$0) && (this.o == null || !this.o.contains($$0.ar()));
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

      this.c = cqd.a.a($$0.f("pickup"));
      this.b($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.n = ma.b.b(alz.a($$0.l("SoundEvent"))).orElse(this.s());
      }

      if ($$0.b("item", 10)) {
         this.a(cxo.a(this.dY(), (vu)$$0.p("item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }

      if ($$0.b("weapon", 10)) {
         this.r = cxo.a(this.dY(), (vu)$$0.p("weapon")).orElse(null);
      } else {
         this.r = null;
      }
   }

   @Override
   public void c(@Nullable bvj $$0) {
      super.c($$0);

      this.c = switch ($$0) {
         case null, default -> this.c;
         case cpw $$1 when this.c == cqd.a.a -> cqd.a.b;
         case bwl $$2 -> cqd.a.a;
      };
   }

   @Override
   public void a_(cpw $$0) {
      if (!this.dW().C && (this.l() || this.B()) && this.d <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.at();
         }
      }
   }

   protected boolean a(cpw $$0) {
      return switch (this.c) {
         case a -> false;
         case b -> $$0.gi().f(this.u());
         case c -> $$0.fV();
      };
   }

   protected cxo u() {
      return this.q.v();
   }

   protected abstract cxo v();

   @Override
   protected bvj.c bg() {
      return bvj.c.a;
   }

   public cxo w() {
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

   protected void a(cxo $$0) {
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
   public bwx a_(int $$0) {
      return $$0 == 0 ? bwx.a(this::w, this::a) : super.a_($$0);
   }

   @Override
   protected boolean C() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public static cqd.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
