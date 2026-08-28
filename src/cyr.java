import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public final class cyr implements cuh {
   public static final cyr a = new cyr(List.of());
   public static final Codec<cyr> b = cwn.a.listOf().flatXmap(cyr::a, $$0 -> DataResult.success($$0.g));
   public static final ym<vz, cyr> c = cwn.h.a(yk.a()).a(cyr::new, $$0 -> $$0.g);
   private static final Fraction e = Fraction.getFraction(1, 16);
   private static final int f = -1;
   public static final int d = -1;
   final List<cwn> g;
   final Fraction h;
   final int i;

   cyr(List<cwn> $$0, Fraction $$1, int $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
   }

   private static DataResult<cyr> a(List<cwn> $$0) {
      try {
         Fraction $$1 = b($$0);
         return DataResult.success(new cyr($$0, $$1, -1));
      } catch (ArithmeticException var2) {
         return DataResult.error(() -> "Excessive total bundle weight");
      }
   }

   public cyr(List<cwn> $$0) {
      this($$0, b($$0), -1);
   }

   private static Fraction b(List<cwn> $$0) {
      Fraction $$1 = Fraction.ZERO;

      for (cwn $$2 : $$0) {
         $$1 = $$1.add(b($$2).multiplyBy(Fraction.getFraction($$2.M(), 1)));
      }

      return $$1;
   }

   static Fraction b(cwn $$0) {
      cyr $$1 = $$0.a(kv.P);
      if ($$1 != null) {
         return e.add($$1.f());
      } else {
         List<dtu.c> $$2 = $$0.a(kv.an, List.of());
         return !$$2.isEmpty() ? Fraction.ONE : Fraction.getFraction(1, $$0.k());
      }
   }

   public static boolean a(cwn $$0) {
      return !$$0.f() && $$0.h().e();
   }

   public int a() {
      int $$0 = this.e();
      int $$1 = $$0 > 12 ? 11 : 12;
      int $$2 = $$0 % 4;
      int $$3 = $$2 == 0 ? 0 : 4 - $$2;
      return Math.min($$0, $$1 - $$3);
   }

   public cwn a(int $$0) {
      return this.g.get($$0);
   }

   public Stream<cwn> b() {
      return this.g.stream().map(cwn::v);
   }

   public Iterable<cwn> c() {
      return this.g;
   }

   public Iterable<cwn> d() {
      return Lists.transform(this.g, cwn::v);
   }

   public int e() {
      return this.g.size();
   }

   public Fraction f() {
      return this.h;
   }

   public boolean g() {
      return this.g.isEmpty();
   }

   public int h() {
      return this.i;
   }

   public boolean i() {
      return this.i != -1;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof cyr $$1) ? false : this.h.equals($$1.h) && cwn.a(this.g, $$1.g);
      }
   }

   @Override
   public int hashCode() {
      return cwn.a(this.g);
   }

   @Override
   public String toString() {
      return "BundleContents" + this.g;
   }

   public static class a {
      private final List<cwn> a;
      private Fraction b;
      private int c;

      public a(cyr $$0) {
         this.a = new ArrayList<>($$0.g);
         this.b = $$0.h;
         this.c = $$0.i;
      }

      public cyr.a a() {
         this.a.clear();
         this.b = Fraction.ZERO;
         this.c = -1;
         return this;
      }

      private int b(cwn $$0) {
         if (!$$0.l()) {
            return -1;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (cwn.c(this.a.get($$1), $$0)) {
                  return $$1;
               }
            }

            return -1;
         }
      }

      private int c(cwn $$0) {
         Fraction $$1 = Fraction.ONE.subtract(this.b);
         return Math.max($$1.divideBy(cyr.b($$0)).intValue(), 0);
      }

      public int a(cwn $$0) {
         if (!cyr.a($$0)) {
            return 0;
         } else {
            int $$1 = Math.min($$0.M(), this.c($$0));
            if ($$1 == 0) {
               return 0;
            } else {
               this.b = this.b.add(cyr.b($$0).multiplyBy(Fraction.getFraction($$1, 1)));
               int $$2 = this.b($$0);
               if ($$2 != -1) {
                  cwn $$3 = this.a.remove($$2);
                  cwn $$4 = $$3.c($$3.M() + $$1);
                  $$0.h($$1);
                  this.a.add(0, $$4);
               } else {
                  this.a.add(0, $$0.a($$1));
               }

               return $$1;
            }
         }
      }

      public int a(ctx $$0, cov $$1) {
         cwn $$2 = $$0.g();
         int $$3 = this.c($$2);
         return cyr.a($$2) ? this.a($$0.b($$2.M(), $$3, $$1)) : 0;
      }

      public void a(int $$0) {
         this.c = this.c != $$0 && $$0 < this.a.size() ? $$0 : -1;
      }

      @Nullable
      public cwn b() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            int $$0 = this.c != -1 && this.c < this.a.size() ? this.c : 0;
            cwn $$1 = this.a.remove($$0).v();
            this.b = this.b.subtract(cyr.b($$1).multiplyBy(Fraction.getFraction($$1.M(), 1)));
            this.a(-1);
            return $$1;
         }
      }

      public Fraction c() {
         return this.b;
      }

      public cyr d() {
         return new cyr(List.copyOf(this.a), this.b, this.c);
      }
   }
}
