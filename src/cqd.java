import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class cqd extends cqp {
   private static final double e = 2.0;
   private static final alc<Byte> f = alg.a(cqd.class, ale.a);
   private static final alc<Byte> g = alg.a(cqd.class, ale.a);
   private static final int h = 1;
   private static final int i = 2;
   @Nullable
   private dxu j;
   protected boolean a;
   protected int b;
   public cqd.a c = cqd.a.a;
   public int d;
   private int k;
   private double l = 2.0;
   private axe m = this.m();
   @Nullable
   private IntOpenHashSet n;
   @Nullable
   private List<bvj> o;
   private cxo p = this.u();
   @Nullable
   private cxo q = null;

   protected cqd(bvq<? extends cqd> $$0, dhh $$1) {
      super($$0, $$1);
   }

   protected cqd(bvq<? extends cqd> $$0, double $$1, double $$2, double $$3, dhh $$4, cxo $$5, @Nullable cxo $$6) {
      this($$0, $$4);
      this.p = $$5.v();
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

         this.q = $$6.v();
         int $$9 = dea.a($$8, $$6, this.p);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected cqd(bvq<? extends cqd> $$0, bwf $$1, dhh $$2, cxo $$3, @Nullable cxo $$4) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(axe $$0) {
      this.m = $$0;
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
   }

   @Override
   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      super.c($$0, $$1, $$2, $$3, $$4);
      this.k = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.b($$3, $$4);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      super.l($$0, $$1, $$2);
      this.k = 0;
   }

   @Override
   public void h() {
      boolean $$0 = !this.A();
      if ($$0) {
         this.bf();
      }

      this.C();
      fbx $$1 = this.dy();
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$2 = $$1.i();
         this.v((float)(bae.d($$1.d, $$1.f) * 180.0F / (float)Math.PI));
         this.w((float)(bae.d($$1.e, $$2) * 180.0F / (float)Math.PI));
         this.N = this.dL();
         this.O = this.dN();
      }

      jh $$3 = this.dv();
      dxu $$4 = this.dV().a_($$3);
      if (!$$4.l() && $$0) {
         fcr $$5 = $$4.g(this.dV(), $$3);
         if (!$$5.c()) {
            fbx $$6 = this.dt();

            for (fbs $$7 : $$5.e()) {
               if ($$7.a($$3).d($$6)) {
                  this.a = true;
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

      if (this.a && $$0) {
         if (this.j != $$4 && this.F()) {
            this.G();
         } else if (!this.dV().C) {
            this.l();
         }

         this.b++;
         if (this.bL()) {
            this.aK();
         }
      } else {
         this.b = 0;
         fbx $$8 = this.dt();
         if (this.bj()) {
            this.a($$8);
         }

         if (this.x()) {
            for (int $$9 = 0; $$9 < 4; $$9++) {
               this.dV()
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
         this.w(f(this.dN(), $$12));
         this.v(f(this.dL(), $$10));
         if ($$0) {
            fbt $$13 = this.dV().b(new dgp($$8, $$8.e($$1), dgp.a.a, dgp.b.a, this));
            this.b($$13);
         } else {
            this.b($$8.e($$1));
            this.aK();
         }

         super.h();
      }
   }

   private void b(fbt $$0) {
      while (this.bL()) {
         fbx $$1 = this.dt();
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
            if (this.y() > 0 && $$4 == cqq.a) {
               continue;
            }
            break;
         }
      }
   }

   private void C() {
      fbx $$0 = this.dy();
      float $$1 = 0.99F;
      if (this.bj()) {
         $$1 = this.z();
      }

      this.h($$0.c((double)$$1));
   }

   private void a(fbx $$0) {
      fbx $$1 = this.dy();

      for (int $$2 = 0; $$2 < 4; $$2++) {
         float $$3 = 0.25F;
         this.dV().a(ls.d, $$0.d - $$1.d * 0.25, $$0.e - $$1.e * 0.25, $$0.f - $$1.f * 0.25, $$1.d, $$1.e, $$1.f);
      }
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   private boolean F() {
      return this.a && this.dV().b(new fbs(this.dt(), this.dt()).g(0.06));
   }

   private void G() {
      this.a = false;
      fbx $$0 = this.dy();
      this.h($$0.d((double)(this.ae.i() * 0.2F), (double)(this.ae.i() * 0.2F), (double)(this.ae.i() * 0.2F)));
      this.k = 0;
   }

   @Override
   public void a(bwj $$0, fbx $$1) {
      super.a($$0, $$1);
      if ($$0 != bwj.a && this.F()) {
         this.G();
      }
   }

   protected void l() {
      this.k++;
      if (this.k >= 1200) {
         this.at();
      }
   }

   private void H() {
      if (this.o != null) {
         this.o.clear();
      }

      if (this.n != null) {
         this.n.clear();
      }
   }

   @Override
   protected void b(cxk $$0) {
      this.q = null;
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      bvj $$1 = $$0.a();
      float $$2 = (float)this.dy().g();
      double $$3 = this.l;
      bvj $$4 = this.p();
      btz $$5 = this.dW().a(this, (bvj)($$4 != null ? $$4 : this));
      if (this.dZ() != null && this.dV() instanceof ash $$6) {
         $$3 = (double)dea.a($$6, this.dZ(), $$1, $$5, (float)$$3);
      }

      int $$7 = bae.c(bae.a((double)$$2 * $$3, 0.0, 2.147483647E9));
      if (this.y() > 0) {
         if (this.n == null) {
            this.n = new IntOpenHashSet(5);
         }

         if (this.o == null) {
            this.o = Lists.newArrayListWithCapacity(5);
         }

         if (this.n.size() >= this.y() + 1) {
            this.at();
            return;
         }

         this.n.add($$1.ar());
      }

      if (this.x()) {
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
            if (!this.dV().C && this.y() <= 0) {
               $$12.o($$12.eT() + 1);
            }

            this.a($$12, $$5);
            if (this.dV() instanceof ash $$13) {
               dea.a($$13, $$12, $$5, this.dZ());
            }

            this.a($$12);
            if ($$12 != $$4 && $$12 instanceof cpw && $$4 instanceof asi && !this.bb()) {
               ((asi)$$4).f.b(new adz(adz.h, 0.0F));
            }

            if (!$$1.bL() && this.o != null) {
               this.o.add($$12);
            }

            if (!this.dV().C && $$4 instanceof asi $$14) {
               if (this.o != null) {
                  ao.H.a($$14, this.o, this.q);
               } else if (!$$1.bL()) {
                  ao.H.a($$14, List.of($$1), this.q);
               }
            }
         }

         this.a(this.m, 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
         if (this.y() <= 0) {
            this.at();
         }
      } else {
         $$1.h($$11);
         this.a(cqq.b, $$1, this.p(), false);
         this.h(this.dy().c(0.2));
         if (this.dV() instanceof ash $$15 && this.dy().h() < 1.0E-7) {
            if (this.c == cqd.a.b) {
               this.a($$15, this.t(), 0.1F);
            }

            this.at();
         }
      }
   }

   protected void a(bwf $$0, btz $$1) {
      double $$3 = (double)(this.q != null && this.dV() instanceof ash $$2 ? dea.d($$2, this.q, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(bxn.p));
         fbx $$5 = this.dy().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.j($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(fbt $$0) {
      this.j = this.dV().a_($$0.b());
      super.a($$0);
      cxo $$1 = this.dZ();
      if (this.dV() instanceof ash $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      fbx $$3 = this.dy();
      fbx $$4 = new fbx(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      fbx $$5 = $$4.c(0.05F);
      this.b(this.dt().d($$5));
      this.h(fbx.c);
      this.a(this.s(), 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
      this.a = true;
      this.d = 7;
      this.a(false);
      this.a((byte)0);
      this.b(axf.aE);
      this.H();
   }

   protected void a(ash $$0, fbt $$1, cxo $$2) {
      fbx $$3 = $$1.b().a($$1.g());
      dea.a($$0, $$2, this.p() instanceof bwf $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.q = null);
   }

   @Override
   public cxo dZ() {
      return this.q;
   }

   protected axe m() {
      return axf.aE;
   }

   protected final axe s() {
      return this.m;
   }

   protected void a(bwf $$0) {
   }

   @Nullable
   protected fbu c(fbx $$0, fbx $$1) {
      return cqr.a(this.dV(), this, $$0, $$1, this.cR().b(this.dy()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bvj $$0) {
      return $$0 instanceof cpw && this.p() instanceof cpw $$1 && !$$1.a((cpw)$$0) ? false : super.b($$0) && (this.n == null || !this.n.contains($$0.ar()));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("life", (short)this.k);
      if (this.j != null) {
         $$0.a("inBlockState", vm.a(this.j));
      }

      $$0.a("shake", (byte)this.d);
      $$0.a("inGround", this.a);
      $$0.a("pickup", (byte)this.c.ordinal());
      $$0.a("damage", this.l);
      $$0.a("crit", this.x());
      $$0.a("PierceLevel", this.y());
      $$0.a("SoundEvent", ma.b.b(this.m).toString());
      $$0.a("item", this.p.a(this.dX()));
      if (this.q != null) {
         $$0.a("weapon", this.q.b(this.dX(), new ux()));
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.k = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.j = vm.a(this.dV().a(mb.f), $$0.p("inBlockState"));
      }

      this.d = $$0.f("shake") & 255;
      this.a = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.l = $$0.k("damage");
      }

      this.c = cqd.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.m = ma.b.b(alz.a($$0.l("SoundEvent"))).orElse(this.m());
      }

      if ($$0.b("item", 10)) {
         this.a(cxo.a(this.dX(), (vu)$$0.p("item")).orElse(this.u()));
      } else {
         this.a(this.u());
      }

      if ($$0.b("weapon", 10)) {
         this.q = cxo.a(this.dX(), (vu)$$0.p("weapon")).orElse(null);
      } else {
         this.q = null;
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
      if (!this.dV().C && (this.a || this.A()) && this.d <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.at();
         }
      }
   }

   protected boolean a(cpw $$0) {
      return switch (this.c) {
         case a -> false;
         case b -> $$0.gg().f(this.t());
         case c -> $$0.fT();
      };
   }

   protected cxo t() {
      return this.p.v();
   }

   protected abstract cxo u();

   @Override
   protected bvj.b bg() {
      return bvj.b.a;
   }

   public cxo v() {
      return this.p;
   }

   public void h(double $$0) {
      this.l = $$0;
   }

   public double w() {
      return this.l;
   }

   @Override
   public boolean cB() {
      return this.aq().a(axy.H);
   }

   public void a(boolean $$0) {
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
         this.p = $$0;
      } else {
         this.p = this.u();
      }
   }

   public boolean x() {
      byte $$0 = this.al.a(f);
      return ($$0 & 1) != 0;
   }

   public byte y() {
      return this.al.a(g);
   }

   public void a(float $$0) {
      this.h((double)($$0 * 2.0F) + this.ae.a((double)this.dV().al().a() * 0.11, 0.57425));
   }

   protected float z() {
      return 0.6F;
   }

   public void b(boolean $$0) {
      this.ad = $$0;
      this.a(2, $$0);
   }

   public boolean A() {
      return !this.dV().C ? this.ad : (this.al.a(f) & 2) != 0;
   }

   @Override
   public boolean bH() {
      return super.bH() && !this.a;
   }

   @Override
   public bwx a_(int $$0) {
      return $$0 == 0 ? bwx.a(this::v, this::a) : super.a_($$0);
   }

   @Override
   protected boolean B() {
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
