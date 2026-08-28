import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public final class cwx implements cru {
   public static final cwx a = new cwx(List.of());
   public static final Codec<cwx> b = cuk.b.listOf().xmap(cwx::new, $$0 -> $$0.f);
   public static final zj<ww, cwx> c = cuk.i.a(zh.a()).a(cwx::new, $$0 -> $$0.f);
   private static final Fraction d = Fraction.getFraction(1, 16);
   private static final int e = -1;
   final List<cuk> f;
   final Fraction g;

   cwx(List<cuk> $$0, Fraction $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   public cwx(List<cuk> $$0) {
      this($$0, a($$0));
   }

   private static Fraction a(List<cuk> $$0) {
      Fraction $$1 = Fraction.ZERO;

      for (cuk $$2 : $$0) {
         $$1 = $$1.add(a($$2).multiplyBy(Fraction.getFraction($$2.I(), 1)));
      }

      return $$1;
   }

   static Fraction a(cuk $$0) {
      cwx $$1 = $$0.a(km.E);
      if ($$1 != null) {
         return d.add($$1.e());
      } else {
         List<doz.c> $$2 = $$0.a(km.ab, List.of());
         return !$$2.isEmpty() ? Fraction.ONE : Fraction.getFraction(1, $$0.j());
      }
   }

   public cuk a(int $$0) {
      return this.f.get($$0);
   }

   public Stream<cuk> a() {
      return this.f.stream().map(cuk::s);
   }

   public Iterable<cuk> b() {
      return this.f;
   }

   public Iterable<cuk> c() {
      return Lists.transform(this.f, cuk::s);
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
         return !($$0 instanceof cwx $$1) ? false : this.g.equals($$1.g) && cuk.a(this.f, $$1.f);
      }
   }

   @Override
   public int hashCode() {
      return cuk.a(this.f);
   }

   @Override
   public String toString() {
      return "BundleContents" + this.f;
   }

   public static class a {
      private final List<cuk> a;
      private Fraction b;

      public a(cwx $$0) {
         this.a = new ArrayList<>($$0.f);
         this.b = $$0.g;
      }

      public cwx.a a() {
         this.a.clear();
         this.b = Fraction.ZERO;
         return this;
      }

      private int b(cuk $$0) {
         if (!$$0.k()) {
            return -1;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (cuk.c(this.a.get($$1), $$0)) {
                  return $$1;
               }
            }

            return -1;
         }
      }

      private int c(cuk $$0) {
         Fraction $$1 = Fraction.ONE.subtract(this.b);
         return Math.max($$1.divideBy(cwx.a($$0)).intValue(), 0);
      }

      public int a(cuk $$0) {
         if (!$$0.e() && $$0.g().an_()) {
            int $$1 = Math.min($$0.I(), this.c($$0));
            if ($$1 == 0) {
               return 0;
            } else {
               this.b = this.b.add(cwx.a($$0).multiplyBy(Fraction.getFraction($$1, 1)));
               int $$2 = this.b($$0);
               if ($$2 != -1) {
                  cuk $$3 = this.a.remove($$2);
                  cuk $$4 = $$3.c($$3.I() + $$1);
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

      public int a(crk $$0, cms $$1) {
         cuk $$2 = $$0.g();
         int $$3 = this.c($$2);
         return this.a($$0.b($$2.I(), $$3, $$1));
      }

      @Nullable
      public cuk b() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            cuk $$0 = this.a.remove(0).s();
            this.b = this.b.subtract(cwx.a($$0).multiplyBy(Fraction.getFraction($$0.I(), 1)));
            return $$0;
         }
      }

      public Fraction c() {
         return this.b;
      }

      public cwx d() {
         return new cwx(List.copyOf(this.a), this.b);
      }
   }
}
