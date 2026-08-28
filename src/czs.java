import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public final class czs implements cvi {
   public static final czs a = new czs(List.of());
   public static final Codec<czs> b = cxo.b.listOf().xmap(czs::new, $$0 -> $$0.g);
   public static final zt<xg, czs> c = cxo.i.a(zr.a()).a(czs::new, $$0 -> $$0.g);
   private static final Fraction e = Fraction.getFraction(1, 16);
   private static final int f = -1;
   public static final int d = -1;
   final List<cxo> g;
   final Fraction h;
   final int i;

   czs(List<cxo> $$0, Fraction $$1, int $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
   }

   public czs(List<cxo> $$0) {
      this($$0, a($$0), -1);
   }

   private static Fraction a(List<cxo> $$0) {
      Fraction $$1 = Fraction.ZERO;

      for (cxo $$2 : $$0) {
         $$1 = $$1.add(b($$2).multiplyBy(Fraction.getFraction($$2.L(), 1)));
      }

      return $$1;
   }

   static Fraction b(cxo $$0) {
      czs $$1 = $$0.a(ku.P);
      if ($$1 != null) {
         return e.add($$1.f());
      } else {
         List<dut.c> $$2 = $$0.a(ku.an, List.of());
         return !$$2.isEmpty() ? Fraction.ONE : Fraction.getFraction(1, $$0.k());
      }
   }

   public static boolean a(cxo $$0) {
      return !$$0.f() && $$0.h().e();
   }

   public int a() {
      int $$0 = this.e();
      int $$1 = $$0 > 12 ? 11 : 12;
      int $$2 = $$0 % 4;
      int $$3 = $$2 == 0 ? 0 : 4 - $$2;
      return Math.min($$0, $$1 - $$3);
   }

   public cxo a(int $$0) {
      return this.g.get($$0);
   }

   public Stream<cxo> b() {
      return this.g.stream().map(cxo::v);
   }

   public Iterable<cxo> c() {
      return this.g;
   }

   public Iterable<cxo> d() {
      return Lists.transform(this.g, cxo::v);
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
         return !($$0 instanceof czs $$1) ? false : this.h.equals($$1.h) && cxo.a(this.g, $$1.g);
      }
   }

   @Override
   public int hashCode() {
      return cxo.a(this.g);
   }

   @Override
   public String toString() {
      return "BundleContents" + this.g;
   }

   public static class a {
      private final List<cxo> a;
      private Fraction b;
      private int c;

      public a(czs $$0) {
         this.a = new ArrayList<>($$0.g);
         this.b = $$0.h;
         this.c = $$0.i;
      }

      public czs.a a() {
         this.a.clear();
         this.b = Fraction.ZERO;
         this.c = -1;
         return this;
      }

      private int b(cxo $$0) {
         if (!$$0.l()) {
            return -1;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (cxo.c(this.a.get($$1), $$0)) {
                  return $$1;
               }
            }

            return -1;
         }
      }

      private int c(cxo $$0) {
         Fraction $$1 = Fraction.ONE.subtract(this.b);
         return Math.max($$1.divideBy(czs.b($$0)).intValue(), 0);
      }

      public int a(cxo $$0) {
         if (!czs.a($$0)) {
            return 0;
         } else {
            int $$1 = Math.min($$0.L(), this.c($$0));
            if ($$1 == 0) {
               return 0;
            } else {
               this.b = this.b.add(czs.b($$0).multiplyBy(Fraction.getFraction($$1, 1)));
               int $$2 = this.b($$0);
               if ($$2 != -1) {
                  cxo $$3 = this.a.remove($$2);
                  cxo $$4 = $$3.c($$3.L() + $$1);
                  $$0.h($$1);
                  this.a.add(0, $$4);
               } else {
                  this.a.add(0, $$0.a($$1));
               }

               return $$1;
            }
         }
      }

      public int a(cuy $$0, cpw $$1) {
         cxo $$2 = $$0.g();
         int $$3 = this.c($$2);
         return czs.a($$2) ? this.a($$0.b($$2.L(), $$3, $$1)) : 0;
      }

      public void a(int $$0) {
         this.c = this.c != $$0 && $$0 < this.a.size() ? $$0 : -1;
      }

      @Nullable
      public cxo b() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            int $$0 = this.c != -1 && this.c < this.a.size() ? this.c : 0;
            cxo $$1 = this.a.remove($$0).v();
            this.b = this.b.subtract(czs.b($$1).multiplyBy(Fraction.getFraction($$1.L(), 1)));
            this.a(-1);
            return $$1;
         }
      }

      public Fraction c() {
         return this.b;
      }

      public czs d() {
         return new czs(List.copyOf(this.a), this.b, this.c);
      }
   }
}
