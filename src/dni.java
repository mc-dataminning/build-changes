import com.google.common.primitives.Doubles;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import javax.annotation.Nullable;

public class dni {
   private static final double f = 0.1;
   protected static final int a = 4;
   protected static final int b = 8;
   protected static final int c = 2;
   private static final double g = 1.0;
   private static final double h = -1.0;
   private static final int i = 2;
   private static final int j = in.a(16);
   private static final int k = j - 1;
   private static final int l = j;
   private static final int m = 2 * k + 1;
   private static final int n = 2 * l + 1;
   private static final int o = m + n;
   private final cru p;
   private static final List<cut> q = List.of(cuv.l, cuv.L, cuv.i, cuv.b, cuv.k, cuv.I, cuv.K, cuv.fl, cuv.dP, cuv.iA, cuv.j);
   protected static final double d = Double.MAX_VALUE;
   private boolean r;
   private final double[] s;
   private final List<List<ib<csq>>> t;
   private final transient double[][] u;
   private static final Codec<double[]> v = Codec.DOUBLE.listOf().xmap(Doubles::toArray, Doubles::asList);
   public static final Codec<dni> e = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("min_section").forGetter($$0x -> $$0x.p.al()),
                  Codec.INT.fieldOf("max_section").forGetter($$0x -> $$0x.p.am()),
                  v.optionalFieldOf("heights")
                     .forGetter($$0x -> DoubleStream.of($$0x.s).anyMatch($$0xx -> $$0xx != Double.MAX_VALUE) ? Optional.of($$0x.s) : Optional.empty())
               )
               .apply($$0, dni::new)
      )
      .comapFlatMap(dni::a, Function.identity());

   private static DataResult<dni> a(dni $$0) {
      return $$0.s.length != o ? DataResult.error(() -> "heights has to be of length " + o) : DataResult.success($$0);
   }

   private dni(int $$0, int $$1, Optional<double[]> $$2) {
      this.s = $$2.orElse(ac.a(new double[o], $$0x -> Arrays.fill($$0x, Double.MAX_VALUE)));
      this.u = new double[o][];
      ObjectArrayList<List<ib<csq>>> $$3 = new ObjectArrayList(o);
      $$3.size(o);
      this.t = $$3;
      int $$4 = iu.c($$0);
      int $$5 = iu.c($$1) - $$4;
      this.p = cru.e($$4, $$5);
   }

   @Nullable
   public static dni a(amh $$0, int $$1, int $$2) {
      dis $$3 = $$0.a($$1, $$2);
      dni $$4 = $$3.t();
      if ($$4 != null && $$3.k().b(dix.f)) {
         $$4.a($$3, a($$0, $$1, $$2, false));
         return $$4;
      } else {
         return null;
      }
   }

   public static Set<hy> a(csm $$0, int $$1, int $$2, boolean $$3) {
      Set<hy> $$4 = EnumSet.noneOf(hy.class);

      for (hy $$5 : hy.values()) {
         int $$6 = $$1 + $$5.b();
         int $$7 = $$2 + $$5.c();
         if ($$0.a($$6, $$7).s() == $$3) {
            $$4.add($$5);
         }
      }

      return $$4;
   }

   private void a(dis $$0, Set<hy> $$1) {
      if (!this.r) {
         if ($$1.contains(hy.a) || $$1.contains(hy.g) || $$1.contains(hy.h)) {
            this.a(a(0, 0), $$0, 0, 0);
         }

         if ($$1.contains(hy.a)) {
            for (int $$2 = 1; $$2 < j; $$2++) {
               this.a(a($$2, 0), $$0, 4 * $$2, 0);
            }
         }

         if ($$1.contains(hy.g)) {
            for (int $$3 = 1; $$3 < j; $$3++) {
               this.a(a(0, $$3), $$0, 0, 4 * $$3);
            }
         }

         if ($$1.contains(hy.c)) {
            for (int $$4 = 1; $$4 < j; $$4++) {
               this.a(b(l, $$4), $$0, 15, 4 * $$4);
            }
         }

         if ($$1.contains(hy.e)) {
            for (int $$5 = 0; $$5 < j; $$5++) {
               this.a(b($$5, l), $$0, 4 * $$5, 15);
            }
         }

         if ($$1.contains(hy.c) && $$1.contains(hy.b)) {
            this.a(b(l, 0), $$0, 15, 0);
         }

         if ($$1.contains(hy.c) && $$1.contains(hy.e) && $$1.contains(hy.d)) {
            this.a(b(l, l), $$0, 15, 15);
         }

         this.r = true;
      }
   }

   private void a(int $$0, dis $$1, int $$2, int $$3) {
      if (this.s[$$0] == Double.MAX_VALUE) {
         this.s[$$0] = (double)this.a($$1, $$2, $$3);
      }

      this.u[$$0] = this.a($$1, $$2, $$3, ati.a(this.s[$$0]));
      this.t.set($$0, this.b($$1, $$2, $$3));
   }

   private int a(dis $$0, int $$1, int $$2) {
      int $$3;
      if ($$0.b(dmf.a.a)) {
         $$3 = Math.min($$0.a(dmf.a.a, $$1, $$2) + 1, this.p.aj());
      } else {
         $$3 = this.p.aj();
      }

      int $$5 = this.p.I_();
      ht.a $$6 = new ht.a($$1, $$3, $$2);

      while ($$6.v() > $$5) {
         $$6.c(hx.a);
         if (q.contains($$0.a_($$6).b())) {
            return $$6.v();
         }
      }

      return $$5;
   }

   private static double a(dis $$0, ht.a $$1) {
      return a($$0, (ht)$$1.c(hx.a)) ? 1.0 : -1.0;
   }

   private static double b(dis $$0, ht.a $$1) {
      double $$2 = 0.0;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         $$2 += a($$0, $$1);
      }

      return $$2;
   }

   private double[] a(dis $$0, int $$1, int $$2, int $$3) {
      double[] $$4 = new double[this.b()];
      Arrays.fill($$4, -1.0);
      ht.a $$5 = new ht.a($$1, this.p.aj(), $$2);
      double $$6 = b($$0, $$5);

      for (int $$7 = $$4.length - 2; $$7 >= 0; $$7--) {
         double $$8 = a($$0, $$5);
         double $$9 = b($$0, $$5);
         $$4[$$7] = ($$6 + $$8 + $$9) / 15.0;
         $$6 = $$9;
      }

      int $$10 = this.a(ati.a($$3, 8));
      if ($$10 >= 0 && $$10 < $$4.length - 1) {
         double $$11 = ((double)$$3 + 0.5) % 8.0 / 8.0;
         double $$12 = (1.0 - $$11) / $$11;
         double $$13 = Math.max($$12, 1.0) * 0.25;
         $$4[$$10 + 1] = -$$12 / $$13;
         $$4[$$10] = 1.0 / $$13;
      }

      return $$4;
   }

   private List<ib<csq>> b(dis $$0, int $$1, int $$2) {
      ObjectArrayList<ib<csq>> $$3 = new ObjectArrayList(this.c());
      $$3.size(this.c());

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         int $$5 = $$4 + in.a(this.p.I_());
         $$3.set($$4, $$0.getNoiseBiome(in.a($$1), $$5, in.a($$2)));
      }

      return $$3;
   }

   private static boolean a(dis $$0, ht $$1) {
      dgw $$2 = $$0.a_($$1);
      if ($$2.i()) {
         return false;
      } else if ($$2.a(arc.O)) {
         return false;
      } else if ($$2.a(arc.t)) {
         return false;
      } else {
         return $$2.a(cuv.eT) || $$2.a(cuv.eU) ? false : !$$2.k($$0, $$1).c();
      }
   }

   protected double a(int $$0, int $$1, int $$2) {
      if ($$0 == l || $$2 == l) {
         return this.s[b($$0, $$2)];
      } else {
         return $$0 != 0 && $$2 != 0 ? Double.MAX_VALUE : this.s[a($$0, $$2)];
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
      if ($$1 == this.e()) {
         return 0.1;
      } else if ($$0 == l || $$2 == l) {
         return this.a(this.u[b($$0, $$2)], $$1);
      } else {
         return $$0 != 0 && $$2 != 0 ? Double.MAX_VALUE : this.a(this.u[a($$0, $$2)], $$1);
      }
   }

   protected void a(int $$0, int $$1, int $$2, dni.a $$3) {
      if ($$1 >= in.a(this.p.I_()) && $$1 < in.a(this.p.aj())) {
         int $$4 = $$1 - in.a(this.p.I_());

         for (int $$5 = 0; $$5 < this.t.size(); $$5++) {
            if (this.t.get($$5) != null) {
               ib<csq> $$6 = this.t.get($$5).get($$4);
               if ($$6 != null) {
                  $$3.consume($$0 + b($$5), $$2 + c($$5), $$6);
               }
            }
         }
      }
   }

   protected void a(int $$0, int $$1, dni.c $$2) {
      for (int $$3 = 0; $$3 < this.s.length; $$3++) {
         double $$4 = this.s[$$3];
         if ($$4 != Double.MAX_VALUE) {
            $$2.consume($$0 + b($$3), $$1 + c($$3), $$4);
         }
      }
   }

   protected void a(int $$0, int $$1, int $$2, int $$3, dni.b $$4) {
      int $$5 = this.d();
      int $$6 = Math.max(0, $$2 - $$5);
      int $$7 = Math.min(this.b(), $$3 - $$5);

      for (int $$8 = 0; $$8 < this.u.length; $$8++) {
         double[] $$9 = this.u[$$8];
         if ($$9 != null) {
            int $$10 = $$0 + b($$8);
            int $$11 = $$1 + c($$8);

            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$4.consume($$10, $$12 + $$5, $$11, $$9[$$12] * 0.1);
            }
         }
      }
   }

   private int b() {
      return this.p.ak() * 2;
   }

   private int c() {
      return in.d(this.p.ak());
   }

   private int d() {
      return this.e() + 1;
   }

   private int e() {
      return this.p.al() * 2;
   }

   private int a(int $$0) {
      return $$0 - this.d();
   }

   private static int a(int $$0, int $$1) {
      return k - $$0 + $$1;
   }

   private static int b(int $$0, int $$1) {
      return m + $$0 + l - $$1;
   }

   private static int b(int $$0) {
      if ($$0 < m) {
         return d(k - $$0);
      } else {
         int $$1 = $$0 - m;
         return l - d(l - $$1);
      }
   }

   private static int c(int $$0) {
      if ($$0 < m) {
         return d($$0 - k);
      } else {
         int $$1 = $$0 - m;
         return l - d($$1 - l);
      }
   }

   private static int d(int $$0) {
      return $$0 & ~($$0 >> 31);
   }

   public cru a() {
      return this.p;
   }

   protected interface a {
      void consume(int var1, int var2, ib<csq> var3);
   }

   protected interface b {
      void consume(int var1, int var2, int var3, double var4);
   }

   protected interface c {
      void consume(int var1, int var2, double var3);
   }
}
