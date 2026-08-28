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

public class ecc {
   private static final double e = 0.1;
   protected static final int a = 4;
   protected static final int b = 8;
   protected static final int c = 2;
   private static final double f = 1.0;
   private static final double g = -1.0;
   private static final int h = 2;
   private static final int i = ka.a(16);
   private static final int j = i - 1;
   private static final int k = i;
   private static final int l = 2 * j + 1;
   private static final int m = 2 * k + 1;
   static final int n = l + m;
   private final dex o;
   private static final List<dhy> p = List.of(dia.l, dia.L, dia.i, dia.b, dia.k, dia.I, dia.K, dia.fl, dia.dP, dia.iA, dia.j);
   protected static final double d = Double.MAX_VALUE;
   private boolean q;
   private final double[] r;
   private final List<List<jp<dfw>>> s;
   private final transient double[][] t;

   private ecc(int $$0, int $$1, Optional<double[]> $$2) {
      this.r = $$2.orElseGet(() -> ad.a(new double[n], $$0x -> Arrays.fill($$0x, Double.MAX_VALUE)));
      this.t = new double[n][];
      ObjectArrayList<List<jp<dfw>>> $$3 = new ObjectArrayList(n);
      $$3.size(n);
      this.s = $$3;
      int $$4 = ki.c($$0);
      int $$5 = ki.c($$1) - $$4;
      this.o = dex.e($$4, $$5);
   }

   @Nullable
   public static ecc a(@Nullable ecc.d $$0) {
      return $$0 == null ? null : new ecc($$0.a(), $$0.b(), $$0.c());
   }

   public ecc.d a() {
      boolean $$0 = false;

      for (double $$1 : this.r) {
         if ($$1 != Double.MAX_VALUE) {
            $$0 = true;
            break;
         }
      }

      return new ecc.d(this.o.ap(), this.o.aq() + 1, $$0 ? Optional.of(DoubleArrays.copy(this.r)) : Optional.empty());
   }

   @Nullable
   public static ecc a(aru $$0, int $$1, int $$2) {
      dwz $$3 = $$0.a($$1, $$2);
      ecc $$4 = $$3.s();
      if ($$4 != null && !$$3.m().d(dya.f)) {
         $$4.a($$3, a($$0, $$1, $$2, false));
         return $$4;
      } else {
         return null;
      }
   }

   public static Set<jm> a(dfs $$0, int $$1, int $$2, boolean $$3) {
      Set<jm> $$4 = EnumSet.noneOf(jm.class);

      for (jm $$5 : jm.values()) {
         int $$6 = $$1 + $$5.b();
         int $$7 = $$2 + $$5.c();
         if ($$0.a($$6, $$7).r() == $$3) {
            $$4.add($$5);
         }
      }

      return $$4;
   }

   private void a(dwz $$0, Set<jm> $$1) {
      if (!this.q) {
         if ($$1.contains(jm.a) || $$1.contains(jm.g) || $$1.contains(jm.h)) {
            this.a(a(0, 0), $$0, 0, 0);
         }

         if ($$1.contains(jm.a)) {
            for (int $$2 = 1; $$2 < i; $$2++) {
               this.a(a($$2, 0), $$0, 4 * $$2, 0);
            }
         }

         if ($$1.contains(jm.g)) {
            for (int $$3 = 1; $$3 < i; $$3++) {
               this.a(a(0, $$3), $$0, 0, 4 * $$3);
            }
         }

         if ($$1.contains(jm.c)) {
            for (int $$4 = 1; $$4 < i; $$4++) {
               this.a(b(k, $$4), $$0, 15, 4 * $$4);
            }
         }

         if ($$1.contains(jm.e)) {
            for (int $$5 = 0; $$5 < i; $$5++) {
               this.a(b($$5, k), $$0, 4 * $$5, 15);
            }
         }

         if ($$1.contains(jm.c) && $$1.contains(jm.b)) {
            this.a(b(k, 0), $$0, 15, 0);
         }

         if ($$1.contains(jm.c) && $$1.contains(jm.e) && $$1.contains(jm.d)) {
            this.a(b(k, k), $$0, 15, 15);
         }

         this.q = true;
      }
   }

   private void a(int $$0, dwz $$1, int $$2, int $$3) {
      if (this.r[$$0] == Double.MAX_VALUE) {
         this.r[$$0] = (double)this.a($$1, $$2, $$3);
      }

      this.t[$$0] = this.a($$1, $$2, $$3, azj.a(this.r[$$0]));
      this.s.set($$0, this.b($$1, $$2, $$3));
   }

   private int a(dwz $$0, int $$1, int $$2) {
      int $$3;
      if ($$0.b(eaz.a.a)) {
         $$3 = Math.min($$0.a(eaz.a.a, $$1, $$2), this.o.an());
      } else {
         $$3 = this.o.an();
      }

      int $$5 = this.o.I_();
      jg.a $$6 = new jg.a($$1, $$3, $$2);

      while ($$6.v() > $$5) {
         if (p.contains($$0.a_($$6).b())) {
            return $$6.v();
         }

         $$6.c(jl.a);
      }

      return $$5;
   }

   private static double a(dwz $$0, jg.a $$1) {
      return a($$0, (jg)$$1.c(jl.a)) ? 1.0 : -1.0;
   }

   private static double b(dwz $$0, jg.a $$1) {
      double $$2 = 0.0;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         $$2 += a($$0, $$1);
      }

      return $$2;
   }

   private double[] a(dwz $$0, int $$1, int $$2, int $$3) {
      double[] $$4 = new double[this.c()];
      Arrays.fill($$4, -1.0);
      jg.a $$5 = new jg.a($$1, this.o.an() + 1, $$2);
      double $$6 = b($$0, $$5);

      for (int $$7 = $$4.length - 2; $$7 >= 0; $$7--) {
         double $$8 = a($$0, $$5);
         double $$9 = b($$0, $$5);
         $$4[$$7] = ($$6 + $$8 + $$9) / 15.0;
         $$6 = $$9;
      }

      int $$10 = this.a(azj.a($$3, 8));
      if ($$10 >= 0 && $$10 < $$4.length - 1) {
         double $$11 = ((double)$$3 + 0.5) % 8.0 / 8.0;
         double $$12 = (1.0 - $$11) / $$11;
         double $$13 = Math.max($$12, 1.0) * 0.25;
         $$4[$$10 + 1] = -$$12 / $$13;
         $$4[$$10] = 1.0 / $$13;
      }

      return $$4;
   }

   private List<jp<dfw>> b(dwz $$0, int $$1, int $$2) {
      ObjectArrayList<jp<dfw>> $$3 = new ObjectArrayList(this.d());
      $$3.size(this.d());

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         int $$5 = $$4 + ka.a(this.o.I_());
         $$3.set($$4, $$0.getNoiseBiome(ka.a($$1), $$5, ka.a($$2)));
      }

      return $$3;
   }

   private static boolean a(dwz $$0, jg $$1) {
      dvd $$2 = $$0.a_($$1);
      if ($$2.l()) {
         return false;
      } else if ($$2.a(awz.P)) {
         return false;
      } else if ($$2.a(awz.u)) {
         return false;
      } else {
         return $$2.a(dia.eT) || $$2.a(dia.eU) ? false : !$$2.g($$0, $$1).c();
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

   protected void a(int $$0, int $$1, int $$2, ecc.a $$3) {
      if ($$1 >= ka.a(this.o.I_()) && $$1 <= ka.a(this.o.an())) {
         int $$4 = $$1 - ka.a(this.o.I_());

         for (int $$5 = 0; $$5 < this.s.size(); $$5++) {
            if (this.s.get($$5) != null) {
               jp<dfw> $$6 = this.s.get($$5).get($$4);
               if ($$6 != null) {
                  $$3.consume($$0 + b($$5), $$2 + c($$5), $$6);
               }
            }
         }
      }
   }

   protected void a(int $$0, int $$1, ecc.c $$2) {
      for (int $$3 = 0; $$3 < this.r.length; $$3++) {
         double $$4 = this.r[$$3];
         if ($$4 != Double.MAX_VALUE) {
            $$2.consume($$0 + b($$3), $$1 + c($$3), $$4);
         }
      }
   }

   protected void a(int $$0, int $$1, int $$2, int $$3, ecc.b $$4) {
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
      return this.o.ao() * 2;
   }

   private int d() {
      return ka.d(this.o.ao());
   }

   private int e() {
      return this.f() + 1;
   }

   private int f() {
      return this.o.ap() * 2;
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

   public dex b() {
      return this.o;
   }

   protected interface a {
      void consume(int var1, int var2, jp<dfw> var3);
   }

   protected interface b {
      void consume(int var1, int var2, int var3, double var4);
   }

   protected interface c {
      void consume(int var1, int var2, double var3);
   }

   public static record d(int b, int c, Optional<double[]> d) {
      private static final Codec<double[]> e = Codec.DOUBLE.listOf().xmap(Doubles::toArray, Doubles::asList);
      public static final Codec<ecc.d> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("min_section").forGetter(ecc.d::a),
                     Codec.INT.fieldOf("max_section").forGetter(ecc.d::b),
                     e.lenientOptionalFieldOf("heights").forGetter(ecc.d::c)
                  )
                  .apply($$0, ecc.d::new)
         )
         .validate(ecc.d::a);

      private static DataResult<ecc.d> a(ecc.d $$0) {
         return $$0.d.isPresent() && ((double[])$$0.d.get()).length != ecc.n
            ? DataResult.error(() -> "heights has to be of length " + ecc.n)
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
