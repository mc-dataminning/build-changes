import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class crf extends crs {
   private static final double d = 2.0;
   private static final int e = 7;
   private static final float f = 0.6F;
   private static final float g = 0.99F;
   private static final akj<Byte> h = akn.a(crf.class, akl.a);
   private static final akj<Byte> i = akn.a(crf.class, akl.a);
   private static final akj<Boolean> j = akn.a(crf.class, akl.k);
   private static final int k = 1;
   private static final int l = 2;
   @Nullable
   private dzz m;
   protected int a;
   public crf.a b = crf.a.a;
   public int c;
   private int n;
   private double o = 2.0;
   private awm p = this.j();
   @Nullable
   private IntOpenHashSet q;
   @Nullable
   private List<bwd> r;
   private cyy s = this.o();
   @Nullable
   private cyy t = null;

   protected crf(bwm<? extends crf> $$0, div $$1) {
      super($$0, $$1);
   }

   protected crf(bwm<? extends crf> $$0, double $$1, double $$2, double $$3, div $$4, cyy $$5, @Nullable cyy $$6) {
      this($$0, $$4);
      this.s = $$5.v();
      this.c($$5);
      bau $$7 = $$5.e(kj.u);
      if ($$7 != null) {
         this.b = crf.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof arq $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.t = $$6.v();
         int $$9 = dfn.a($$8, $$6, this.s);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected crf(bwm<? extends crf> $$0, bxc $$1, div $$2, cyy $$3, @Nullable cyy $$4) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(awm $$0) {
      this.p = $$0;
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
   protected void a(akn.a $$0) {
      $$0.a(h, (byte)0);
      $$0.a(i, (byte)0);
      $$0.a(j, false);
   }

   @Override
   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      super.c($$0, $$1, $$2, $$3, $$4);
      this.n = 0;
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      super.l($$0, $$1, $$2);
      this.n = 0;
      if (this.f() && azm.f($$0, $$1, $$2) > 0.0) {
         this.a(false);
      }
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (!this.ak && this.c <= 0 && $$0.equals(j) && this.f()) {
         this.c = 7;
      }
   }

   @Override
   public void h() {
      boolean $$0 = !this.w();
      fei $$1 = this.dy();
      iu $$2 = this.dv();
      dzz $$3 = this.dV().a_($$2);
      if (!$$3.l() && $$0) {
         ffc $$4 = $$3.g(this.dV(), $$2);
         if (!$$4.c()) {
            fei $$5 = this.dt();

            for (fed $$6 : $$4.e()) {
               if ($$6.a($$2).d($$5)) {
                  this.i(fei.c);
                  this.a(true);
                  break;
               }
            }
         }
      }

      if (this.c > 0) {
         this.c--;
      }

      if (this.bl() || $$3.a(dmc.ru)) {
         this.aH();
      }

      if (this.f() && $$0) {
         if (!this.dV().w_()) {
            if (this.m != $$3 && this.y()) {
               this.B();
            } else {
               this.g();
            }
         }

         this.a++;
         if (this.bK()) {
            this.aK();
         }

         if (!this.dV().C) {
            this.c(this.aG() > 0);
         }
      } else {
         this.a = 0;
         fei $$7 = this.dt();
         if (this.bj()) {
            this.b(this.v());
            this.a($$7);
         }

         if (this.t()) {
            for (int $$8 = 0; $$8 < 4; $$8++) {
               this.dV()
                  .a(
                     lx.f,
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
            $$9 = (float)(azm.d(-$$1.d, -$$1.f) * 180.0F / (float)Math.PI);
         } else {
            $$9 = (float)(azm.d($$1.d, $$1.f) * 180.0F / (float)Math.PI);
         }

         float $$11 = (float)(azm.d($$1.e, $$1.i()) * 180.0F / (float)Math.PI);
         this.x(f(this.dN(), $$11));
         this.w(f(this.dL(), $$9));
         if ($$0) {
            fee $$12 = this.dV().b(new die($$7, $$7.e($$1), die.a.a, die.b.a, this));
            this.b($$12);
         } else {
            this.b($$7.e($$1));
            this.aK();
         }

         if (!this.bj()) {
            this.b(0.99F);
         }

         if ($$0 && !this.f()) {
            this.bf();
         }

         super.h();
      }
   }

   private void b(fee $$0) {
      while (this.bK()) {
         fei $$1 = this.dt();
         fef $$2 = this.c($$1, $$0.g());
         fei $$3 = Objects.requireNonNullElse($$2, $$0).g();
         this.b($$3);
         this.a($$1, $$3);
         if (this.as != null && this.as.e()) {
            this.bW();
         }

         if ($$2 == null) {
            if (this.bK() && $$0.d() != feg.a.a) {
               this.b((feg)$$0);
               this.ar = true;
            }
            break;
         } else if (this.bK() && !this.ad) {
            crt $$4 = this.b($$2);
            this.ar = true;
            if (this.u() > 0 && $$4 == crt.a) {
               continue;
            }
            break;
         }
      }
   }

   private void b(float $$0) {
      fei $$1 = this.dy();
      this.i($$1.c((double)$$0));
   }

   private void a(fei $$0) {
      fei $$1 = this.dy();

      for (int $$2 = 0; $$2 < 4; $$2++) {
         float $$3 = 0.25F;
         this.dV().a(lx.d, $$0.d - $$1.d * 0.25, $$0.e - $$1.e * 0.25, $$0.f - $$1.f * 0.25, $$1.d, $$1.e, $$1.f);
      }
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   private boolean y() {
      return this.f() && this.dV().b(new fed(this.dt(), this.dt()).g(0.06));
   }

   private void B() {
      this.a(false);
      fei $$0 = this.dy();
      this.i($$0.d((double)(this.ae.i() * 0.2F), (double)(this.ae.i() * 0.2F), (double)(this.ae.i() * 0.2F)));
      this.n = 0;
   }

   protected boolean f() {
      return this.al.a(j);
   }

   protected void a(boolean $$0) {
      this.al.a(j, $$0);
   }

   @Override
   public boolean cJ() {
      return !this.f();
   }

   @Override
   public void a(bxg $$0, fei $$1) {
      super.a($$0, $$1);
      if ($$0 != bxg.a && this.y()) {
         this.B();
      }
   }

   protected void g() {
      this.n++;
      if (this.n >= 1200) {
         this.at();
      }
   }

   private void C() {
      if (this.r != null) {
         this.r.clear();
      }

      if (this.q != null) {
         this.q.clear();
      }
   }

   @Override
   protected void b(cyu $$0) {
      this.t = null;
   }

   @Override
   public void a(boolean $$0, iu $$1) {
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
   public void j(double $$0, double $$1, double $$2) {
      if (!this.f()) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(fef $$0) {
      super.a($$0);
      bwd $$1 = $$0.a();
      float $$2 = (float)this.dy().g();
      double $$3 = this.o;
      bwd $$4 = this.q();
      bus $$5 = this.dW().a(this, (bwd)($$4 != null ? $$4 : this));
      if (this.dZ() != null && this.dV() instanceof arq $$6) {
         $$3 = (double)dfn.a($$6, this.dZ(), $$1, $$5, (float)$$3);
      }

      int $$7 = azm.c(azm.a((double)$$2 * $$3, 0.0, 2.147483647E9));
      if (this.u() > 0) {
         if (this.q == null) {
            this.q = new IntOpenHashSet(5);
         }

         if (this.r == null) {
            this.r = Lists.newArrayListWithCapacity(5);
         }

         if (this.q.size() >= this.u() + 1) {
            this.at();
            return;
         }

         this.q.add($$1.ar());
      }

      if (this.t()) {
         long $$8 = (long)this.ae.a($$7 / 2 + 2);
         $$7 = (int)Math.min($$8 + (long)$$7, 2147483647L);
      }

      if ($$4 instanceof bxc $$9) {
         $$9.B($$1);
      }

      boolean $$10 = $$1.aq() == bwm.N;
      int $$11 = $$1.aG();
      if (this.bY() && !$$10) {
         $$1.e(5.0F);
      }

      if ($$1.b($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof bxc $$12) {
            if (!this.dV().C && this.u() <= 0) {
               $$12.o($$12.eV() + 1);
            }

            this.a($$12, $$5);
            if (this.dV() instanceof arq $$13) {
               dfn.a($$13, $$12, $$5, this.dZ());
            }

            this.a($$12);
            if ($$12 instanceof cqy && $$4 instanceof arr $$14 && !this.bb() && $$12 != $$14) {
               $$14.f.b(new adb(adb.h, 0.0F));
            }

            if (!$$1.bK() && this.r != null) {
               this.r.add($$12);
            }

            if (!this.dV().C && $$4 instanceof arr $$15) {
               if (this.r != null) {
                  ap.H.a($$15, this.r, this.t);
               } else if (!$$1.bK()) {
                  ap.H.a($$15, List.of($$1), this.t);
               }
            }
         }

         this.a(this.p, 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
         if (this.u() <= 0) {
            this.at();
         }
      } else {
         $$1.h($$11);
         this.a(crt.b, $$1, this.q(), false);
         this.i(this.dy().c(0.2));
         if (this.dV() instanceof arq $$16 && this.dy().h() < 1.0E-7) {
            if (this.b == crf.a.b) {
               this.a($$16, this.n(), 0.1F);
            }

            this.at();
         }
      }
   }

   protected void a(bxc $$0, bus $$1) {
      double $$3 = (double)(this.t != null && this.dV() instanceof arq $$2 ? dfn.d($$2, this.t, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(byi.p));
         fei $$5 = this.dy().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.j($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(fee $$0) {
      this.m = this.dV().a_($$0.b());
      super.a($$0);
      cyy $$1 = this.dZ();
      if (this.dV() instanceof arq $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      fei $$3 = this.dy();
      fei $$4 = new fei(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      fei $$5 = $$4.c(0.05F);
      this.b(this.dt().d($$5));
      this.i(fei.c);
      this.a(this.m(), 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
      this.a(true);
      this.c = 7;
      this.b(false);
      this.a((byte)0);
      this.b(awn.aE);
      this.C();
   }

   protected void a(arq $$0, fee $$1, cyy $$2) {
      fei $$3 = $$1.b().a($$1.g());
      dfn.a($$0, $$2, this.q() instanceof bxc $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.t = null);
   }

   @Override
   public cyy dZ() {
      return this.t;
   }

   protected awm j() {
      return awn.aE;
   }

   protected final awm m() {
      return this.p;
   }

   protected void a(bxc $$0) {
   }

   @Nullable
   protected fef c(fei $$0, fei $$1) {
      return cru.a(this.dV(), this, $$0, $$1, this.cR().b(this.dy()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bwd $$0) {
      return $$0 instanceof cqy && this.q() instanceof cqy $$1 && !$$1.a((cqy)$$0) ? false : super.b($$0) && (this.q == null || !this.q.contains($$0.ar()));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("life", (short)this.n);
      if (this.m != null) {
         $$0.a("inBlockState", uo.a(this.m));
      }

      $$0.a("shake", (byte)this.c);
      $$0.a("inGround", this.f());
      $$0.a("pickup", (byte)this.b.ordinal());
      $$0.a("damage", this.o);
      $$0.a("crit", this.t());
      $$0.a("PierceLevel", this.u());
      $$0.a("SoundEvent", mf.b.b(this.p).toString());
      $$0.a("item", this.s.a(this.dX()));
      if (this.t != null) {
         $$0.a("weapon", this.t.b(this.dX(), new tz()));
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.n = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.m = uo.a(this.dV().a(mg.i), $$0.p("inBlockState"));
      }

      this.c = $$0.f("shake") & 255;
      this.a($$0.q("inGround"));
      if ($$0.b("damage", 99)) {
         this.o = $$0.k("damage");
      }

      this.b = crf.a.a($$0.f("pickup"));
      this.b($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.p = mf.b.b(alg.a($$0.l("SoundEvent"))).orElse(this.j());
      }

      if ($$0.b("item", 10)) {
         this.a(cyy.a(this.dX(), (uw)$$0.p("item")).orElse(this.o()));
      } else {
         this.a(this.o());
      }

      if ($$0.b("weapon", 10)) {
         this.t = cyy.a(this.dX(), (uw)$$0.p("weapon")).orElse(null);
      } else {
         this.t = null;
      }
   }

   @Override
   public void c(@Nullable bwd $$0) {
      super.c($$0);

      this.b = switch ($$0) {
         case null, default -> this.b;
         case cqy $$1 when this.b == crf.a.a -> crf.a.b;
         case bxi $$2 -> crf.a.a;
      };
   }

   @Override
   public void a_(cqy $$0) {
      if (!this.dV().C && (this.f() || this.w()) && this.c <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.at();
         }
      }
   }

   protected boolean a(cqy $$0) {
      return switch (this.b) {
         case a -> false;
         case b -> $$0.gi().f(this.n());
         case c -> $$0.fU();
      };
   }

   protected cyy n() {
      return this.s.v();
   }

   protected abstract cyy o();

   @Override
   protected bwd.d bg() {
      return bwd.d.a;
   }

   public cyy s() {
      return this.s;
   }

   public void h(double $$0) {
      this.o = $$0;
   }

   @Override
   public boolean cB() {
      return this.aq().a(axf.H);
   }

   public void b(boolean $$0) {
      this.a(1, $$0);
   }

   private void a(byte $$0) {
      this.al.a(i, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.al.a(h);
      if ($$1) {
         this.al.a(h, (byte)($$2 | $$0));
      } else {
         this.al.a(h, (byte)($$2 & ~$$0));
      }
   }

   protected void a(cyy $$0) {
      if (!$$0.f()) {
         this.s = $$0;
      } else {
         this.s = this.o();
      }
   }

   public boolean t() {
      byte $$0 = this.al.a(h);
      return ($$0 & 1) != 0;
   }

   public byte u() {
      return this.al.a(i);
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
      return !this.dV().C ? this.ad : (this.al.a(h) & 2) != 0;
   }

   @Override
   public boolean bG() {
      return super.bG() && !this.f();
   }

   @Override
   public bxt a_(int $$0) {
      return $$0 == 0 ? bxt.a(this::s, this::a) : super.a_($$0);
   }

   @Override
   protected boolean x() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public static crf.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
