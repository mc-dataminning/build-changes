import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ctz extends cur {
   private static final ffc b = new ffc(0.0, 0.0, 0.0);
   private static final akj<Optional<eat>> c = akn.a(ctz.class, akl.j);
   private static final akj<Integer> d = akn.a(ctz.class, akl.b);
   private static final ImmutableMap<bxv, ImmutableList<Integer>> h = ImmutableMap.of(
      bxv.a, ImmutableList.of(0, 1, -1), bxv.f, ImmutableList.of(0, 1, -1), bxv.d, ImmutableList.of(0, 1)
   );
   protected static final float a = 0.95F;
   private boolean i;
   private boolean j;
   private final cuh k;
   private static final Map<ebx, Pair<ka, ka>> l = Maps.newEnumMap(
      (Map)ag.a(
         () -> {
            ka $$0 = jb.e.q();
            ka $$1 = jb.f.q();
            ka $$2 = jb.c.q();
            ka $$3 = jb.d.q();
            ka $$4 = $$0.p();
            ka $$5 = $$1.p();
            ka $$6 = $$2.p();
            ka $$7 = $$3.p();
            return ImmutableMap.of(
               ebx.a,
               Pair.of($$2, $$3),
               ebx.b,
               Pair.of($$0, $$1),
               ebx.c,
               Pair.of($$4, $$1),
               ebx.d,
               Pair.of($$0, $$5),
               ebx.e,
               Pair.of($$2, $$7),
               ebx.f,
               Pair.of($$6, $$3),
               ebx.g,
               Pair.of($$3, $$1),
               ebx.h,
               Pair.of($$3, $$0),
               ebx.i,
               Pair.of($$2, $$0),
               ebx.j,
               Pair.of($$2, $$1)
            );
         }
      )
   );

   protected ctz(bwr<?> $$0, djm $$1) {
      super($$0, $$1);
      this.I = true;
      if (b($$1)) {
         this.k = new cuo(this);
      } else {
         this.k = new cup(this);
      }
   }

   protected ctz(bwr<?> $$0, djm $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.p($$2, $$3, $$4);
   }

   public void p(double $$0, double $$1, double $$2) {
      this.a_($$0, $$1, $$2);
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
   }

   @Nullable
   public static <T extends ctz> T a(djm $$0, double $$1, double $$2, double $$3, bwr<T> $$4, bwq $$5, czn $$6, @Nullable crm $$7) {
      T $$8 = (T)$$4.a($$0, $$5);
      if ($$8 != null) {
         $$8.p($$1, $$2, $$3);
         bwr.a($$0, $$6, $$7).accept($$8);
         if ($$8.f() instanceof cuo $$9) {
            iv $$10 = $$8.j();
            eat $$11 = $$0.a_($$10);
            $$9.a($$10, $$11, true);
         }
      }

      return $$8;
   }

   public cuh f() {
      return this.k;
   }

   @Override
   protected bwi.c be() {
      return bwi.c.c;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, Optional.empty());
      $$0.a(d, this.x());
   }

   @Override
   public boolean i(bwi $$0) {
      return ctx.a(this, $$0);
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public ffc a(jb.a $$0, m.a $$1) {
      return bxj.k(super.a($$0, $$1));
   }

   @Override
   protected ffc a(bwi $$0, bwl $$1, float $$2) {
      boolean $$3 = $$0 instanceof cqy || $$0 instanceof cre;
      return $$3 ? b : super.a($$0, $$1, $$2);
   }

   @Override
   public ffc b(bxj $$0) {
      jb $$1 = this.cO();
      if ($$1.o() == jb.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cuf.a($$1);
         iv $$3 = this.du();
         iv.a $$4 = new iv.a();
         ImmutableList<bxv> $$5 = $$0.fN();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bxv $$6 = (bxv)$$14.next();
            bwl $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)h.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dU().a(cuf.a(this.dU(), $$4), () -> cuf.a(this.dU(), $$4.e()));
                  if (cuf.a($$11)) {
                     fex $$12 = new fex((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     ffc $$13 = ffc.a($$4, $$11);
                     if (cuf.a(this.dU(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cQ().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bxv $$15 = (bxv)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = azm.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cuf.a($$4, $$17, $$0x -> this.dU().a_($$0x).g(this.dU(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aR() {
      eat $$0 = this.dU().a_(this.du());
      return $$0.a(axc.P) ? 1.0F : super.aR();
   }

   @Override
   public void q(float $$0) {
      this.l(-this.I());
      this.d(10);
      this.b(this.G() + this.G() * 10.0F);
   }

   @Override
   public boolean bE() {
      return !this.dP();
   }

   public static Pair<ka, ka> a(ebx $$0) {
      return l.get($$0);
   }

   @Override
   public jb cO() {
      return this.k.l();
   }

   @Override
   protected double bb() {
      return this.bh() ? 0.005 : 0.04;
   }

   @Override
   public void h() {
      if (this.H() > 0) {
         this.d(this.H() - 1);
      }

      if (this.G() > 0.0F) {
         this.b(this.G() - 1.0F);
      }

      this.ax();
      this.bU();
      this.k.b();
      this.bn();
      if (this.bu()) {
         this.aB();
         this.aC();
         this.Z *= 0.5;
      }

      this.ak = false;
   }

   public boolean g() {
      return this.ak;
   }

   public iv j() {
      int $$0 = azm.a(this.dz());
      int $$1 = azm.a(this.dB());
      int $$2 = azm.a(this.dF());
      if (b(this.dU())) {
         double $$3 = this.dB() - 0.1 - 1.0E-5F;
         if (this.dU().a_(iv.a((double)$$0, $$3, (double)$$2)).a(axc.P)) {
            $$1 = azm.a($$3);
         }
      } else if (this.dU().a_(new iv($$0, $$1 - 1, $$2)).a(axc.P)) {
         $$1--;
      }

      return new iv($$0, $$1, $$2);
   }

   protected double a(arq $$0) {
      return this.k.b($$0);
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   @Override
   public void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void bd() {
      super.bd();
   }

   @Override
   public void av() {
      super.av();
   }

   @Override
   public boolean bn() {
      return super.bn();
   }

   @Override
   public ffc ae() {
      return this.k.c(super.ae());
   }

   @Override
   public bxe N_() {
      return this.k.a();
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      this.k.a($$0, $$1, $$2);
   }

   protected void b(arq $$0) {
      this.k.a($$0);
   }

   protected void e(arq $$0) {
      double $$1 = this.a($$0);
      ffc $$2 = this.dx();
      this.n(azm.a($$2.d, -$$1, $$1), $$2.e, azm.a($$2.f, -$$1, $$1));
      if (this.aH()) {
         this.i(this.dx().c(0.5));
      }

      this.a(bxn.a, this.dx());
      if (!this.aH()) {
         this.i(this.dx().c(0.95));
      }
   }

   protected double a(iv $$0, ebx $$1, double $$2) {
      return this.k.a($$0, $$1, $$2);
   }

   @Override
   public void a(bxn $$0, ffc $$1) {
      if (b(this.dU())) {
         ffc $$2 = this.ds().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.k.d();
         if ($$3) {
            super.a($$0, $$2.d(this.ds()));
         }

         if ($$0.equals(bxn.c)) {
            this.i = false;
         }
      } else {
         super.a($$0, $$1);
         this.aI();
      }
   }

   @Override
   public void aI() {
      if (!b(this.dU())) {
         this.a(this.ds(), this.ds());
      } else {
         super.aI();
      }
   }

   @Override
   public boolean co() {
      return this.i;
   }

   public void a(boolean $$0) {
      this.i = $$0;
   }

   public boolean m() {
      return this.j;
   }

   public void b(boolean $$0) {
      this.j = $$0;
   }

   public ffc a(iv $$0) {
      eat $$1 = this.dU().a_($$0);
      if ($$1.a(dmt.bw) && $$1.c(dsu.d)) {
         ebx $$2 = $$1.c(((dmg)$$1.b()).c());
         if ($$2 == ebx.b) {
            if (this.b($$0.h())) {
               return new ffc(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new ffc(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == ebx.a) {
            if (this.b($$0.f())) {
               return new ffc(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new ffc(0.0, 0.0, -1.0);
            }
         }

         return ffc.c;
      } else {
         return ffc.c;
      }
   }

   public boolean b(iv $$0) {
      return this.dU().a_($$0).d(this.dU(), $$0);
   }

   @Override
   protected ffc a(ffc $$0) {
      double $$1 = this.k.m();
      ffc $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bh()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(tz $$0) {
      ale<uw> $$1 = this.dW().a(un.a);
      this.a($$0.a("DisplayState", eat.a, $$1));
      this.c($$0.c("DisplayOffset", this.x()));
      this.j = $$0.o("FlippedRotation");
      this.ak = $$0.o("HasTicked");
   }

   @Override
   protected void b(tz $$0) {
      this.A().ifPresent($$1x -> {
         ale<uw> $$2 = this.dW().a(un.a);
         $$0.a("DisplayState", eat.a, $$2, $$1x);
      });
      int $$1 = this.w();
      if ($$1 != this.x()) {
         $$0.a("DisplayOffset", $$1);
      }

      $$0.a("FlippedRotation", this.j);
      $$0.a("HasTicked", this.ak);
   }

   @Override
   public void h(bwi $$0) {
      if (!this.dU().C) {
         if (!$$0.ad && !this.ad) {
            if (!this.y($$0)) {
               double $$1 = $$0.dz() - this.dz();
               double $$2 = $$0.dF() - this.dF();
               double $$3 = $$1 * $$1 + $$2 * $$2;
               if ($$3 >= 1.0E-4F) {
                  $$3 = Math.sqrt($$3);
                  $$1 /= $$3;
                  $$2 /= $$3;
                  double $$4 = 1.0 / $$3;
                  if ($$4 > 1.0) {
                     $$4 = 1.0;
                  }

                  $$1 *= $$4;
                  $$2 *= $$4;
                  $$1 *= 0.1F;
                  $$2 *= 0.1F;
                  $$1 *= 0.5;
                  $$2 *= 0.5;
                  if ($$0 instanceof ctz $$5) {
                     this.a($$5, $$1, $$2);
                  } else {
                     this.i(-$$1, 0.0, -$$2);
                     $$0.i($$1 / 4.0, 0.0, $$2 / 4.0);
                  }
               }
            }
         }
      }
   }

   private void a(ctz $$0, double $$1, double $$2) {
      double $$3;
      double $$4;
      if (b(this.dU())) {
         $$3 = this.dx().d;
         $$4 = this.dx().f;
      } else {
         $$3 = $$0.dz() - this.dz();
         $$4 = $$0.dF() - this.dF();
      }

      ffc $$7 = new ffc($$3, 0.0, $$4).d();
      ffc $$8 = new ffc((double)azm.b(this.dK() * (float) (Math.PI / 180.0)), 0.0, (double)azm.a(this.dK() * (float) (Math.PI / 180.0))).d();
      double $$9 = Math.abs($$7.b($$8));
      if (!($$9 < 0.8F) || b(this.dU())) {
         ffc $$10 = this.dx();
         ffc $$11 = $$0.dx();
         if ($$0.z() && !this.z()) {
            this.i($$10.d(0.2, 1.0, 0.2));
            this.i($$11.d - $$1, 0.0, $$11.f - $$2);
            $$0.i($$11.d(0.95, 1.0, 0.95));
         } else if (!$$0.z() && this.z()) {
            $$0.i($$11.d(0.2, 1.0, 0.2));
            $$0.i($$10.d + $$1, 0.0, $$10.f + $$2);
            this.i($$10.d(0.95, 1.0, 0.95));
         } else {
            double $$12 = ($$11.d + $$10.d) / 2.0;
            double $$13 = ($$11.f + $$10.f) / 2.0;
            this.i($$10.d(0.2, 1.0, 0.2));
            this.i($$12 - $$1, 0.0, $$13 - $$2);
            $$0.i($$11.d(0.2, 1.0, 0.2));
            $$0.i($$12 + $$1, 0.0, $$13 + $$2);
         }
      }
   }

   public eat n() {
      return this.A().orElseGet(this::v);
   }

   private Optional<eat> A() {
      return this.ar().a(c);
   }

   public eat v() {
      return dmt.a.m();
   }

   public int w() {
      return this.ar().a(d);
   }

   public int x() {
      return 6;
   }

   public void a(Optional<eat> $$0) {
      this.ar().a(c, $$0);
   }

   public void c(int $$0) {
      this.ar().a(d, $$0);
   }

   public static boolean b(djm $$0) {
      return $$0.K().b(cuy.d);
   }

   @Override
   public abstract czn dH();

   public boolean y() {
      return false;
   }

   public boolean z() {
      return false;
   }
}
