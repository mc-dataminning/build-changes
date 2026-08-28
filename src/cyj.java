import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public final class cyj implements ctz {
   public static final cyj a = new cyj(List.of());
   public static final Codec<cyj> b = cwf.b.listOf().xmap(cyj::new, $$0 -> $$0.g);
   public static final zj<ww, cyj> c = cwf.i.a(zh.a()).a(cyj::new, $$0 -> $$0.g);
   private static final Fraction e = Fraction.getFraction(1, 16);
   private static final int f = -1;
   public static final int d = -1;
   final List<cwf> g;
   final Fraction h;
   final int i;

   cyj(List<cwf> $$0, Fraction $$1, int $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
   }

   public cyj(List<cwf> $$0) {
      this($$0, a($$0), -1);
   }

   private static Fraction a(List<cwf> $$0) {
      Fraction $$1 = Fraction.ZERO;

      for (cwf $$2 : $$0) {
         $$1 = $$1.add(b($$2).multiplyBy(Fraction.getFraction($$2.L(), 1)));
      }

      return $$1;
   }

   static Fraction b(cwf $$0) {
      cyj $$1 = $$0.a(ku.P);
      if ($$1 != null) {
         return e.add($$1.f());
      } else {
         List<dso.c> $$2 = $$0.a(ku.an, List.of());
         return !$$2.isEmpty() ? Fraction.ONE : Fraction.getFraction(1, $$0.k());
      }
   }

   public static boolean a(cwf $$0) {
      return !$$0.f() && $$0.h().e();
   }

   public int a() {
      int $$0 = this.e();
      int $$1 = $$0 > 12 ? 11 : 12;
      int $$2 = $$0 % 4;
      int $$3 = $$2 == 0 ? 0 : 4 - $$2;
      return Math.min($$0, $$1 - $$3);
   }

   public cwf a(int $$0) {
      return this.g.get($$0);
   }

   public Stream<cwf> b() {
      return this.g.stream().map(cwf::v);
   }

   public Iterable<cwf> c() {
      return this.g;
   }

   public Iterable<cwf> d() {
      return Lists.transform(this.g, cwf::v);
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
         return !($$0 instanceof cyj $$1) ? false : this.h.equals($$1.h) && cwf.a(this.g, $$1.g);
      }
   }

   @Override
   public int hashCode() {
      return cwf.a(this.g);
   }

   @Override
   public String toString() {
      return "BundleContents" + this.g;
   }

   public static class a {
      private final List<cwf> a;
      private Fraction b;
      private int c;

      public a(cyj $$0) {
         this.a = new ArrayList<>($$0.g);
         this.b = $$0.h;
         this.c = $$0.i;
      }

      public cyj.a a() {
         this.a.clear();
         this.b = Fraction.ZERO;
         this.c = -1;
         return this;
      }

      private int b(cwf $$0) {
         if (!$$0.l()) {
            return -1;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (cwf.c(this.a.get($$1), $$0)) {
                  return $$1;
               }
            }

            return -1;
         }
      }

      private int c(cwf $$0) {
         Fraction $$1 = Fraction.ONE.subtract(this.b);
         return Math.max($$1.divideBy(cyj.b($$0)).intValue(), 0);
      }

      public int a(cwf $$0) {
         if (!cyj.a($$0)) {
            return 0;
         } else {
            int $$1 = Math.min($$0.L(), this.c($$0));
            if ($$1 == 0) {
               return 0;
            } else {
               this.b = this.b.add(cyj.b($$0).multiplyBy(Fraction.getFraction($$1, 1)));
               int $$2 = this.b($$0);
               if ($$2 != -1) {
                  cwf $$3 = this.a.remove($$2);
                  cwf $$4 = $$3.c($$3.L() + $$1);
                  $$0.h($$1);
                  this.a.add(0, $$4);
               } else {
                  this.a.add(0, $$0.a($$1));
               }

               return $$1;
            }
         }
      }

      public int a(ctp $$0, cor $$1) {
         cwf $$2 = $$0.g();
         int $$3 = this.c($$2);
         return cyj.a($$2) ? this.a($$0.b($$2.L(), $$3, $$1)) : 0;
      }

      public void a(int $$0) {
         this.c = this.c != $$0 && $$0 < this.a.size() ? $$0 : -1;
      }

      @Nullable
      public cwf b() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            int $$0 = this.c != -1 && this.c < this.a.size() ? this.c : 0;
            cwf $$1 = this.a.remove($$0).v();
            this.b = this.b.subtract(cyj.b($$1).multiplyBy(Fraction.getFraction($$1.L(), 1)));
            this.a(-1);
            return $$1;
         }
      }

      public Fraction c() {
         return this.b;
      }

      public cyj d() {
         return new cyj(List.copyOf(this.a), this.b, this.c);
      }
   }
}
