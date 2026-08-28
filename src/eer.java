import com.google.common.primitives.Doubles;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.doubles.DoubleArrays;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class eer {
   private static final double e = 0.1;
   protected static final int a = 4;
   protected static final int b = 8;
   protected static final int c = 2;
   private static final double f = 1.0;
   private static final double g = -1.0;
   private static final int h = 2;
   private static final int i = kc.a(16);
   private static final int j = i - 1;
   private static final int k = i;
   private static final int l = 2 * j + 1;
   private static final int m = 2 * k + 1;
   static final int n = l + m;
   private final dhb o;
   private static final List<dke> p = List.of(dkg.l, dkg.O, dkg.i, dkg.b, dkg.k, dkg.L, dkg.N, dkg.fA, dkg.ec, dkg.iY, dkg.j);
   protected static final double d = Double.MAX_VALUE;
   private boolean q;
   private final double[] r;
   private final List<List<jr<dic>>> s;
   private final transient double[][] t;

   private eer(int $$0, int $$1, Optional<double[]> $$2) {
      this.r = $$2.orElseGet(() -> af.a(new double[n], $$0x -> Arrays.fill($$0x, Double.MAX_VALUE)));
      this.t = new double[n][];
      ObjectArrayList<List<jr<dic>>> $$3 = new ObjectArrayList(n);
      $$3.size(n);
      this.s = $$3;
      int $$4 = kk.c($$0);
      int $$5 = kk.c($$1) - $$4;
      this.o = dhb.e($$4, $$5);
   }

   @Nullable
   public static eer a(@Nullable eer.d $$0) {
      return $$0 == null ? null : new eer($$0.a(), $$0.b(), $$0.c());
   }

   public eer.d a() {
      boolean $$0 = false;

      for (double $$1 : this.r) {
         if ($$1 != Double.MAX_VALUE) {
            $$0 = true;
            break;
         }
      }

      return new eer.d(this.o.aq(), this.o.ar() + 1, $$0 ? Optional.of(DoubleArrays.copy(this.r)) : Optional.empty());
   }

   @Nullable
   public static eer a(arl $$0, int $$1, int $$2) {
      dzm $$3 = $$0.a($$1, $$2);
      eer $$4 = $$3.v();
      if ($$4 != null && !$$3.o().d(ean.f)) {
         $$4.a($$3, a($$0, $$1, $$2, false));
         return $$4;
      } else {
         return null;
      }
   }

   public static Set<jo> a(dhy $$0, int $$1, int $$2, boolean $$3) {
      Set<jo> $$4 = EnumSet.noneOf(jo.class);

      for (jo $$5 : jo.values()) {
         int $$6 = $$1 + $$5.b();
         int $$7 = $$2 + $$5.c();
         if ($$0.a($$6, $$7).u() == $$3) {
            $$4.add($$5);
         }
      }

      return $$4;
   }

   private void a(dzm $$0, Set<jo> $$1) {
      if (!this.q) {
         if ($$1.contains(jo.a) || $$1.contains(jo.g) || $$1.contains(jo.h)) {
            this.a(a(0, 0), $$0, 0, 0);
         }

         if ($$1.contains(jo.a)) {
            for (int $$2 = 1; $$2 < i; $$2++) {
               this.a(a($$2, 0), $$0, 4 * $$2, 0);
            }
         }

         if ($$1.contains(jo.g)) {
            for (int $$3 = 1; $$3 < i; $$3++) {
               this.a(a(0, $$3), $$0, 0, 4 * $$3);
            }
         }

         if ($$1.contains(jo.c)) {
            for (int $$4 = 1; $$4 < i; $$4++) {
               this.a(b(k, $$4), $$0, 15, 4 * $$4);
            }
         }

         if ($$1.contains(jo.e)) {
            for (int $$5 = 0; $$5 < i; $$5++) {
               this.a(b($$5, k), $$0, 4 * $$5, 15);
            }
         }

         if ($$1.contains(jo.c) && $$1.contains(jo.b)) {
            this.a(b(k, 0), $$0, 15, 0);
         }

         if ($$1.contains(jo.c) && $$1.contains(jo.e) && $$1.contains(jo.d)) {
            this.a(b(k, k), $$0, 15, 15);
         }

         this.q = true;
      }
   }

   private void a(int $$0, dzm $$1, int $$2, int $$3) {
      if (this.r[$$0] == Double.MAX_VALUE) {
         this.r[$$0] = (double)this.a($$1, $$2, $$3);
      }

      this.t[$$0] = this.a($$1, $$2, $$3, ayz.a(this.r[$$0]));
      this.s.set($$0, this.b($$1, $$2, $$3));
   }

   private int a(dzm $$0, int $$1, int $$2) {
      int $$3;
      if ($$0.b(edo.a.a)) {
         $$3 = Math.min($$0.a(edo.a.a, $$1, $$2), this.o.ao());
      } else {
         $$3 = this.o.ao();
      }

      int $$5 = this.o.G_();
      ji.a $$6 = new ji.a($$1, $$3, $$2);

      while ($$6.v() > $$5) {
         if (p.contains($$0.a_($$6).b())) {
            return $$6.v();
         }

         $$6.c(jn.a);
      }

      return $$5;
   }

   private static double a(dzm $$0, ji.a $$1) {
      return a($$0, (ji)$$1.c(jn.a)) ? 1.0 : -1.0;
   }

   private static double b(dzm $$0, ji.a $$1) {
      double $$2 = 0.0;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         $$2 += a($$0, $$1);
      }

      return $$2;
   }

   private double[] a(dzm $$0, int $$1, int $$2, int $$3) {
      double[] $$4 = new double[this.c()];
      Arrays.fill($$4, -1.0);
      ji.a $$5 = new ji.a($$1, this.o.ao() + 1, $$2);
      double $$6 = b($$0, $$5);

      for (int $$7 = $$4.length - 2; $$7 >= 0; $$7--) {
         double $$8 = a($$0, $$5);
         double $$9 = b($$0, $$5);
         $$4[$$7] = ($$6 + $$8 + $$9) / 15.0;
         $$6 = $$9;
      }

      int $$10 = this.a(ayz.a($$3, 8));
      if ($$10 >= 0 && $$10 < $$4.length - 1) {
         double $$11 = ((double)$$3 + 0.5) % 8.0 / 8.0;
         double $$12 = (1.0 - $$11) / $$11;
         double $$13 = Math.max($$12, 1.0) * 0.25;
         $$4[$$10 + 1] = -$$12 / $$13;
         $$4[$$10] = 1.0 / $$13;
      }

      return $$4;
   }

   private List<jr<dic>> b(dzm $$0, int $$1, int $$2) {
      ObjectArrayList<jr<dic>> $$3 = new ObjectArrayList(this.d());
      $$3.size(this.d());

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         int $$5 = $$4 + kc.a(this.o.G_());
         $$3.set($$4, $$0.getNoiseBiome(kc.a($$1), $$5, kc.a($$2)));
      }

      return $$3;
   }

   private static boolean a(dzm $$0, ji $$1) {
      dxq $$2 = $$0.a_($$1);
      if ($$2.l()) {
         return false;
      } else if ($$2.a(awp.Q)) {
         return false;
      } else if ($$2.a(awp.u)) {
         return false;
      } else {
         return $$2.a(dkg.fh) || $$2.a(dkg.fi) ? false : !$$2.g($$0, $$1).c();
      }
   }

   protected double a(int $$0, int $$1, int $$2) {
      if ($$0 == k || $$2 == k) {
         return this.r[b($$0, $$2)];
      } else {
         return $$0 != 0 && $$2 != 0 ? Double.MAX_VALUE : this.r[a($$0, $$2)];
      }
   }

   private double a(@Nullable double[] $$0, int $$1) {
      if ($$0 == null) {
         return Double.MAX_VALUE;
      } else {
         int $$2 = this.a($$1);
         return $$2 >= 0 && $$2 < $$0.length ? $$0[$$2] * 0.1 : Double.MAX_VALUE;
      }
   }

   protected double b(int $$0, int $$1, int $$2) {
      if ($$1 == this.f()) {
         return 0.1;
      } else if ($$0 == k || $$2 == k) {
         return this.a(this.t[b($$0, $$2)], $$1);
      } else {
         return $$0 != 0 && $$2 != 0 ? Double.MAX_VALUE : this.a(this.t[a($$0, $$2)], $$1);
      }
   }

   protected void a(int $$0, int $$1, int $$2, eer.a $$3) {
      if ($$1 >= kc.a(this.o.G_()) && $$1 <= kc.a(this.o.ao())) {
         int $$4 = $$1 - kc.a(this.o.G_());

         for (int $$5 = 0; $$5 < this.s.size(); $$5++) {
            if (this.s.get($$5) != null) {
               jr<dic> $$6 = this.s.get($$5).get($$4);
               if ($$6 != null) {
                  $$3.consume($$0 + b($$5), $$2 + c($$5), $$6);
               }
            }
         }
      }
   }

   protected void a(int $$0, int $$1, eer.c $$2) {
      for (int $$3 = 0; $$3 < this.r.length; $$3++) {
         double $$4 = this.r[$$3];
         if ($$4 != Double.MAX_VALUE) {
            $$2.consume($$0 + b($$3), $$1 + c($$3), $$4);
         }
      }
   }

   protected void a(int $$0, int $$1, int $$2, int $$3, eer.b $$4) {
      int $$5 = this.e();
      int $$6 = Math.max(0, $$2 - $$5);
      int $$7 = Math.min(this.c(), $$3 - $$5);

      for (int $$8 = 0; $$8 < this.t.length; $$8++) {
         double[] $$9 = this.t[$$8];
         if ($$9 != null) {
            int $$10 = $$0 + b($$8);
            int $$11 = $$1 + c($$8);

            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$4.consume($$10, $$12 + $$5, $$11, $$9[$$12] * 0.1);
            }
         }
      }
   }

   private int c() {
      return this.o.ap() * 2;
   }

   private int d() {
      return kc.d(this.o.ap());
   }

   private int e() {
      return this.f() + 1;
   }

   private int f() {
      return this.o.aq() * 2;
   }

   private int a(int $$0) {
      return $$0 - this.e();
   }

   private static int a(int $$0, int $$1) {
      return j - $$0 + $$1;
   }

   private static int b(int $$0, int $$1) {
      return l + $$0 + k - $$1;
   }

   private static int b(int $$0) {
      if ($$0 < l) {
         return d(j - $$0);
      } else {
         int $$1 = $$0 - l;
         return k - d(k - $$1);
      }
   }

   private static int c(int $$0) {
      if ($$0 < l) {
         return d($$0 - j);
      } else {
         int $$1 = $$0 - l;
         return k - d($$1 - k);
      }
   }

   private static int d(int $$0) {
      return $$0 & ~($$0 >> 31);
   }

   public dhb b() {
      return this.o;
   }

   protected interface a {
      void consume(int var1, int var2, jr<dic> var3);
   }

   protected interface b {
      void consume(int var1, int var2, int var3, double var4);
   }

   protected interface c {
      void consume(int var1, int var2, double var3);
   }

   public static record d(int b, int c, Optional<double[]> d) {
      private static final Codec<double[]> e = Codec.DOUBLE.listOf().xmap(Doubles::toArray, Doubles::asList);
      public static final Codec<eer.d> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("min_section").forGetter(eer.d::a),
                     Codec.INT.fieldOf("max_section").forGetter(eer.d::b),
                     e.lenientOptionalFieldOf("heights").forGetter(eer.d::c)
                  )
                  .apply($$0, eer.d::new)
         )
         .validate(eer.d::a);

      private static DataResult<eer.d> a(eer.d $$0) {
         return $$0.d.isPresent() && ((double[])$$0.d.get()).length != eer.n
            ? DataResult.error(() -> "heights has to be of length " + eer.n)
            : DataResult.success($$0);
      }

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public Optional<double[]> c() {
         return this.d;
      }
   }
}
