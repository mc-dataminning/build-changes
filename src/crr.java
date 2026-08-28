import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class crr extends cse {
   private static final double d = 2.0;
   private static final int e = 7;
   private static final float f = 0.6F;
   private static final float g = 0.99F;
   private static final akj<Byte> h = akn.a(crr.class, akl.a);
   private static final akj<Byte> i = akn.a(crr.class, akl.a);
   private static final akj<Boolean> j = akn.a(crr.class, akl.k);
   private static final int k = 1;
   private static final int l = 2;
   @Nullable
   private eao m;
   protected int a;
   public crr.a b = crr.a.a;
   public int c;
   private int n;
   private double o = 2.0;
   private awm p = this.j();
   @Nullable
   private IntOpenHashSet q;
   @Nullable
   private List<bwi> r;
   private czk s = this.o();
   @Nullable
   private czk t = null;

   protected crr(bwr<? extends crr> $$0, djh $$1) {
      super($$0, $$1);
   }

   protected crr(bwr<? extends crr> $$0, double $$1, double $$2, double $$3, djh $$4, czk $$5, @Nullable czk $$6) {
      this($$0, $$4);
      this.s = $$5.v();
      this.c($$5);
      bau $$7 = $$5.e(kk.u);
      if ($$7 != null) {
         this.b = crr.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof arq $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.t = $$6.v();
         int $$9 = dfz.a($$8, $$6, this.s);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected crr(bwr<? extends crr> $$0, bxj $$1, djh $$2, czk $$3, @Nullable czk $$4) {
      this($$0, $$1.dz(), $$1.dD() - 0.1F, $$1.dF(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(awm $$0) {
      this.p = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cQ().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cJ();
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
   public void k(double $$0, double $$1, double $$2) {
      super.k($$0, $$1, $$2);
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
      fex $$1 = this.dx();
      iv $$2 = this.du();
      eao $$3 = this.dU().a_($$2);
      if (!$$3.l() && $$0) {
         ffr $$4 = $$3.g(this.dU(), $$2);
         if (!$$4.c()) {
            fex $$5 = this.ds();

            for (fes $$6 : $$4.e()) {
               if ($$6.a($$2).d($$5)) {
                  this.i(fex.c);
                  this.a(true);
                  break;
               }
            }
         }
      }

      if (this.c > 0) {
         this.c--;
      }

      if (this.bj() || $$3.a(dmo.rx)) {
         this.aF();
      }

      if (this.f() && $$0) {
         if (!this.dU().w_()) {
            if (this.m != $$3 && this.y()) {
               this.B();
            } else {
               this.g();
            }
         }

         this.a++;
         if (this.bI()) {
            this.aI();
         }

         if (!this.dU().C) {
            this.c(this.aE() > 0);
         }
      } else {
         this.a = 0;
         fex $$7 = this.ds();
         if (this.bh()) {
            this.b(this.v());
            this.a($$7);
         }

         if (this.t()) {
            for (int $$8 = 0; $$8 < 4; $$8++) {
               this.dU()
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
            $$9 = (float)(azm.d(-$$1.d, -$$1.f) * 180.0F / (float)Math.PI);
         } else {
            $$9 = (float)(azm.d($$1.d, $$1.f) * 180.0F / (float)Math.PI);
         }

         float $$11 = (float)(azm.d($$1.e, $$1.i()) * 180.0F / (float)Math.PI);
         this.x(f(this.dM(), $$11));
         this.w(f(this.dK(), $$9));
         if ($$0) {
            fet $$12 = this.dU().b(new diq($$7, $$7.e($$1), diq.a.a, diq.b.a, this));
            this.b($$12);
         } else {
            this.b($$7.e($$1));
            this.aI();
         }

         if (!this.bh()) {
            this.b(0.99F);
         }

         if ($$0 && !this.f()) {
            this.bd();
         }

         super.h();
      }
   }

   private void b(fet $$0) {
      while (this.bI()) {
         fex $$1 = this.ds();
         feu $$2 = this.c($$1, $$0.g());
         fex $$3 = Objects.requireNonNullElse($$2, $$0).g();
         this.b($$3);
         this.a($$1, $$3);
         if (this.as != null && this.as.e()) {
            this.bU();
         }

         if ($$2 == null) {
            if (this.bI() && $$0.d() != fev.a.a) {
               this.b((fev)$$0);
               this.ar = true;
            }
            break;
         } else if (this.bI() && !this.ad) {
            csf $$4 = this.b($$2);
            this.ar = true;
            if (this.u() > 0 && $$4 == csf.a) {
               continue;
            }
            break;
         }
      }
   }

   private void b(float $$0) {
      fex $$1 = this.dx();
      this.i($$1.c((double)$$0));
   }

   private void a(fex $$0) {
      fex $$1 = this.dx();

      for (int $$2 = 0; $$2 < 4; $$2++) {
         float $$3 = 0.25F;
         this.dU().a(ly.d, $$0.d - $$1.d * 0.25, $$0.e - $$1.e * 0.25, $$0.f - $$1.f * 0.25, $$1.d, $$1.e, $$1.f);
      }
   }

   @Override
   protected double bb() {
      return 0.05;
   }

   private boolean y() {
      return this.f() && this.dU().b(new fes(this.ds(), this.ds()).g(0.06));
   }

   private void B() {
      this.a(false);
      fex $$0 = this.dx();
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
   public boolean cI() {
      return !this.f();
   }

   @Override
   public void a(bxn $$0, fex $$1) {
      super.a($$0, $$1);
      if ($$0 != bxn.a && this.y()) {
         this.B();
      }
   }

   protected void g() {
      this.n++;
      if (this.n >= 1200) {
         this.aq();
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
   protected void b(czg $$0) {
      this.t = null;
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
   protected void a(feu $$0) {
      super.a($$0);
      bwi $$1 = $$0.a();
      float $$2 = (float)this.dx().g();
      double $$3 = this.o;
      bwi $$4 = this.q();
      bux $$5 = this.dV().a(this, (bwi)($$4 != null ? $$4 : this));
      if (this.dY() != null && this.dU() instanceof arq $$6) {
         $$3 = (double)dfz.a($$6, this.dY(), $$1, $$5, (float)$$3);
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
            this.aq();
            return;
         }

         this.q.add($$1.ao());
      }

      if (this.t()) {
         long $$8 = (long)this.ae.a($$7 / 2 + 2);
         $$7 = (int)Math.min($$8 + (long)$$7, 2147483647L);
      }

      if ($$4 instanceof bxj $$9) {
         $$9.B($$1);
      }

      boolean $$10 = $$1.an() == bwr.N;
      int $$11 = $$1.aE();
      if (this.bW() && !$$10) {
         $$1.e(5.0F);
      }

      if ($$1.b($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof bxj $$12) {
            if (!this.dU().C && this.u() <= 0) {
               $$12.o($$12.eV() + 1);
            }

            this.a($$12, $$5);
            if (this.dU() instanceof arq $$13) {
               dfz.a($$13, $$12, $$5, this.dY());
            }

            this.a($$12);
            if ($$12 instanceof crj && $$4 instanceof arr $$14 && !this.aZ() && $$12 != $$14) {
               $$14.f.b(new adb(adb.h, 0.0F));
            }

            if (!$$1.bI() && this.r != null) {
               this.r.add($$12);
            }

            if (!this.dU().C && $$4 instanceof arr $$15) {
               if (this.r != null) {
                  aq.H.a($$15, this.r, this.t);
               } else if (!$$1.bI()) {
                  aq.H.a($$15, List.of($$1), this.t);
               }
            }
         }

         this.a(this.p, 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
         if (this.u() <= 0) {
            this.aq();
         }
      } else {
         $$1.h($$11);
         this.a(csf.b, $$1, this.q(), false);
         this.i(this.dx().c(0.2));
         if (this.dU() instanceof arq $$16 && this.dx().h() < 1.0E-7) {
            if (this.b == crr.a.b) {
               this.a($$16, this.n(), 0.1F);
            }

            this.aq();
         }
      }
   }

   protected void a(bxj $$0, bux $$1) {
      double $$3 = (double)(this.t != null && this.dU() instanceof arq $$2 ? dfz.d($$2, this.t, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(byp.p));
         fex $$5 = this.dx().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.i($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(fet $$0) {
      this.m = this.dU().a_($$0.b());
      super.a($$0);
      czk $$1 = this.dY();
      if (this.dU() instanceof arq $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      fex $$3 = this.dx();
      fex $$4 = new fex(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      fex $$5 = $$4.c(0.05F);
      this.b(this.ds().d($$5));
      this.i(fex.c);
      this.a(this.m(), 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
      this.a(true);
      this.c = 7;
      this.b(false);
      this.a((byte)0);
      this.b(awn.aE);
      this.C();
   }

   protected void a(arq $$0, fet $$1, czk $$2) {
      fex $$3 = $$1.b().a($$1.g());
      dfz.a($$0, $$2, this.q() instanceof bxj $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.t = null);
   }

   @Override
   public czk dY() {
      return this.t;
   }

   protected awm j() {
      return awn.aE;
   }

   protected final awm m() {
      return this.p;
   }

   protected void a(bxj $$0) {
   }

   @Nullable
   protected feu c(fex $$0, fex $$1) {
      return csg.a(this.dU(), this, $$0, $$1, this.cQ().b(this.dx()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bwi $$0) {
      return $$0 instanceof crj && this.q() instanceof crj $$1 && !$$1.a((crj)$$0) ? false : super.b($$0) && (this.q == null || !this.q.contains($$0.ao()));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ale<uw> $$1 = this.dW().a(un.a);
      $$0.a("life", (short)this.n);
      $$0.b("inBlockState", eao.a, $$1, this.m);
      $$0.a("shake", (byte)this.c);
      $$0.a("inGround", this.f());
      $$0.a("pickup", crr.a.d, this.b);
      $$0.a("damage", this.o);
      $$0.a("crit", this.t());
      $$0.a("PierceLevel", this.u());
      $$0.a("SoundEvent", mg.b.q(), this.p);
      $$0.a("item", czk.b, $$1, this.s);
      $$0.b("weapon", czk.b, $$1, this.t);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ale<uw> $$1 = this.dW().a(un.a);
      this.n = $$0.e("life");
      this.m = $$0.<eao>a("inBlockState", eao.a, $$1).orElse(null);
      this.c = $$0.d("shake") & 255;
      this.a($$0.o("inGround"));
      if ($$0.b("damage", 99)) {
         this.o = $$0.i("damage");
      }

      this.b = $$0.<crr.a>a("pickup", crr.a.d).orElse(crr.a.a);
      this.b($$0.o("crit"));
      this.a($$0.d("PierceLevel"));
      this.p = $$0.<awm>a("SoundEvent", mg.b.q()).orElse(this.j());
      this.a($$0.<czk>a("item", czk.b, $$1).orElse(this.o()));
      this.t = $$0.<czk>a("weapon", czk.b, $$1).orElse(null);
   }

   @Override
   public void c(@Nullable bwi $$0) {
      super.c($$0);

      this.b = switch ($$0) {
         case null, default -> this.b;
         case crj $$1 when this.b == crr.a.a -> crr.a.b;
         case bxp $$2 -> crr.a.a;
      };
   }

   @Override
   public void a_(crj $$0) {
      if (!this.dU().C && (this.f() || this.w()) && this.c <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.aq();
         }
      }
   }

   protected boolean a(crj $$0) {
      return switch (this.b) {
         case a -> false;
         case b -> $$0.gi().g(this.n());
         case c -> $$0.fU();
      };
   }

   protected czk n() {
      return this.s.v();
   }

   protected abstract czk o();

   @Override
   protected bwi.c be() {
      return bwi.c.a;
   }

   public czk s() {
      return this.s;
   }

   public void h(double $$0) {
      this.o = $$0;
   }

   @Override
   public boolean cA() {
      return this.an().a(axf.H);
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

   protected void a(czk $$0) {
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
      this.h((double)($$0 * 2.0F) + this.ae.a((double)this.dU().an().a() * 0.11, 0.57425));
   }

   protected float v() {
      return 0.6F;
   }

   public void q(boolean $$0) {
      this.ad = $$0;
      this.a(2, $$0);
   }

   public boolean w() {
      return !this.dU().C ? this.ad : (this.al.a(h) & 2) != 0;
   }

   @Override
   public boolean bE() {
      return super.bE() && !this.f();
   }

   @Override
   public bya a_(int $$0) {
      return $$0 == 0 ? bya.a(this::s, this::a) : super.a_($$0);
   }

   @Override
   protected boolean x() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public static final Codec<crr.a> d = Codec.BYTE.xmap(crr.a::a, $$0 -> (byte)$$0.ordinal());

      public static crr.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
