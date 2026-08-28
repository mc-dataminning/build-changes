import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public final class cxe implements csb {
   public static final cxe a = new cxe(List.of());
   public static final Codec<cxe> b = cur.b.listOf().xmap(cxe::new, $$0 -> $$0.f);
   public static final zn<xa, cxe> c = cur.i.a(zl.a()).a(cxe::new, $$0 -> $$0.f);
   private static final Fraction d = Fraction.getFraction(1, 16);
   private static final int e = -1;
   final List<cur> f;
   final Fraction g;

   cxe(List<cur> $$0, Fraction $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   public cxe(List<cur> $$0) {
      this($$0, a($$0));
   }

   private static Fraction a(List<cur> $$0) {
      Fraction $$1 = Fraction.ZERO;

      for (cur $$2 : $$0) {
         $$1 = $$1.add(a($$2).multiplyBy(Fraction.getFraction($$2.I(), 1)));
      }

      return $$1;
   }

   static Fraction a(cur $$0) {
      cxe $$1 = $$0.a(km.F);
      if ($$1 != null) {
         return d.add($$1.e());
      } else {
         List<dpg.c> $$2 = $$0.a(km.ac, List.of());
         return !$$2.isEmpty() ? Fraction.ONE : Fraction.getFraction(1, $$0.j());
      }
   }

   public cur a(int $$0) {
      return this.f.get($$0);
   }

   public Stream<cur> a() {
      return this.f.stream().map(cur::s);
   }

   public Iterable<cur> b() {
      return this.f;
   }

   public Iterable<cur> c() {
      return Lists.transform(this.f, cur::s);
   }

   public int d() {
      return this.f.size();
   }

   public Fraction e() {
      return this.g;
   }

   public boolean f() {
      return this.f.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof cxe $$1) ? false : this.g.equals($$1.g) && cur.a(this.f, $$1.f);
      }
   }

   @Override
   public int hashCode() {
      return cur.a(this.f);
   }

   @Override
   public String toString() {
      return "BundleContents" + this.f;
   }

   public static class a {
      private final List<cur> a;
      private Fraction b;

      public a(cxe $$0) {
         this.a = new ArrayList<>($$0.f);
         this.b = $$0.g;
      }

      public cxe.a a() {
         this.a.clear();
         this.b = Fraction.ZERO;
         return this;
      }

      private int b(cur $$0) {
         if (!$$0.k()) {
            return -1;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (cur.c(this.a.get($$1), $$0)) {
                  return $$1;
               }
            }

            return -1;
         }
      }

      private int c(cur $$0) {
         Fraction $$1 = Fraction.ONE.subtract(this.b);
         return Math.max($$1.divideBy(cxe.a($$0)).intValue(), 0);
      }

      public int a(cur $$0) {
         if (!$$0.e() && $$0.g().am_()) {
            int $$1 = Math.min($$0.I(), this.c($$0));
            if ($$1 == 0) {
               return 0;
            } else {
               this.b = this.b.add(cxe.a($$0).multiplyBy(Fraction.getFraction($$1, 1)));
               int $$2 = this.b($$0);
               if ($$2 != -1) {
                  cur $$3 = this.a.remove($$2);
                  cur $$4 = $$3.c($$3.I() + $$1);
                  $$0.h($$1);
                  this.a.add(0, $$4);
               } else {
                  this.a.add(0, $$0.a($$1));
               }

               return $$1;
            }
         } else {
            return 0;
         }
      }

      public int a(crr $$0, cmz $$1) {
         cur $$2 = $$0.g();
         int $$3 = this.c($$2);
         return this.a($$0.b($$2.I(), $$3, $$1));
      }

      @Nullable
      public cur b() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            cur $$0 = this.a.remove(0).s();
            this.b = this.b.subtract(cxe.a($$0).multiplyBy(Fraction.getFraction($$0.I(), 1)));
            return $$0;
         }
      }

      public Fraction c() {
         return this.b;
      }

      public cxe d() {
         return new cxe(List.copyOf(this.a), this.b);
      }
   }
}
