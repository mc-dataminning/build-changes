import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public final class dbg implements cxc {
   public static final dbg a = new dbg(List.of());
   public static final Codec<dbg> b = czd.b.listOf().flatXmap(dbg::a, $$0 -> DataResult.success($$0.g));
   public static final yw<wj, dbg> c = czd.i.a(yu.a()).a(dbg::new, $$0 -> $$0.g);
   private static final Fraction e = Fraction.getFraction(1, 16);
   private static final int f = -1;
   public static final int d = -1;
   final List<czd> g;
   final Fraction h;
   final int i;

   dbg(List<czd> $$0, Fraction $$1, int $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
   }

   private static DataResult<dbg> a(List<czd> $$0) {
      try {
         Fraction $$1 = b($$0);
         return DataResult.success(new dbg($$0, $$1, -1));
      } catch (ArithmeticException var2) {
         return DataResult.error(() -> "Excessive total bundle weight");
      }
   }

   public dbg(List<czd> $$0) {
      this($$0, b($$0), -1);
   }

   private static Fraction b(List<czd> $$0) {
      Fraction $$1 = Fraction.ZERO;

      for (czd $$2 : $$0) {
         $$1 = $$1.add(b($$2).multiplyBy(Fraction.getFraction($$2.M(), 1)));
      }

      return $$1;
   }

   static Fraction b(czd $$0) {
      dbg $$1 = $$0.a(kj.Q);
      if ($$1 != null) {
         return e.add($$1.f());
      } else {
         List<dxc.c> $$2 = $$0.a(kj.ar, dbc.c).a();
         return !$$2.isEmpty() ? Fraction.ONE : Fraction.getFraction(1, $$0.k());
      }
   }

   public static boolean a(czd $$0) {
      return !$$0.f() && $$0.h().d();
   }

   public int a() {
      int $$0 = this.e();
      int $$1 = $$0 > 12 ? 11 : 12;
      int $$2 = $$0 % 4;
      int $$3 = $$2 == 0 ? 0 : 4 - $$2;
      return Math.min($$0, $$1 - $$3);
   }

   public czd a(int $$0) {
      return this.g.get($$0);
   }

   public Stream<czd> b() {
      return this.g.stream().map(czd::v);
   }

   public Iterable<czd> c() {
      return this.g;
   }

   public Iterable<czd> d() {
      return Lists.transform(this.g, czd::v);
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
         return !($$0 instanceof dbg $$1) ? false : this.h.equals($$1.h) && czd.a(this.g, $$1.g);
      }
   }

   @Override
   public int hashCode() {
      return czd.a(this.g);
   }

   @Override
   public String toString() {
      return "BundleContents" + this.g;
   }

   public static class a {
      private final List<czd> a;
      private Fraction b;
      private int c;

      public a(dbg $$0) {
         this.a = new ArrayList<>($$0.g);
         this.b = $$0.h;
         this.c = $$0.i;
      }

      public dbg.a a() {
         this.a.clear();
         this.b = Fraction.ZERO;
         this.c = -1;
         return this;
      }

      private int b(czd $$0) {
         if (!$$0.l()) {
            return -1;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (czd.c(this.a.get($$1), $$0)) {
                  return $$1;
               }
            }

            return -1;
         }
      }

      private int c(czd $$0) {
         Fraction $$1 = Fraction.ONE.subtract(this.b);
         return Math.max($$1.divideBy(dbg.b($$0)).intValue(), 0);
      }

      public int a(czd $$0) {
         if (!dbg.a($$0)) {
            return 0;
         } else {
            int $$1 = Math.min($$0.M(), this.c($$0));
            if ($$1 == 0) {
               return 0;
            } else {
               this.b = this.b.add(dbg.b($$0).multiplyBy(Fraction.getFraction($$1, 1)));
               int $$2 = this.b($$0);
               if ($$2 != -1) {
                  czd $$3 = this.a.remove($$2);
                  czd $$4 = $$3.c($$3.M() + $$1);
                  $$0.h($$1);
                  this.a.add(0, $$4);
               } else {
                  this.a.add(0, $$0.a($$1));
               }

               return $$1;
            }
         }
      }

      public int a(cws $$0, crc $$1) {
         czd $$2 = $$0.g();
         int $$3 = this.c($$2);
         return dbg.a($$2) ? this.a($$0.b($$2.M(), $$3, $$1)) : 0;
      }

      public void a(int $$0) {
         this.c = this.c != $$0 && !this.b($$0) ? $$0 : -1;
      }

      private boolean b(int $$0) {
         return $$0 < 0 || $$0 >= this.a.size();
      }

      @Nullable
      public czd b() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            int $$0 = this.b(this.c) ? 0 : this.c;
            czd $$1 = this.a.remove($$0).v();
            this.b = this.b.subtract(dbg.b($$1).multiplyBy(Fraction.getFraction($$1.M(), 1)));
            this.a(-1);
            return $$1;
         }
      }

      public Fraction c() {
         return this.b;
      }

      public dbg d() {
         return new dbg(List.copyOf(this.a), this.b, this.c);
      }
   }
}
