import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public final class cxd implements cry {
   public static final cxd a = new cxd(List.of());
   public static final Codec<cxd> b = cuo.b.listOf().xmap(cxd::new, $$0 -> $$0.f);
   public static final yw<wj, cxd> c = cuo.i.a(yu.a()).a(cxd::new, $$0 -> $$0.f);
   private static final Fraction d = Fraction.getFraction(1, 16);
   private static final int e = -1;
   final List<cuo> f;
   final Fraction g;

   cxd(List<cuo> $$0, Fraction $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   public cxd(List<cuo> $$0) {
      this($$0, a($$0));
   }

   private static Fraction a(List<cuo> $$0) {
      Fraction $$1 = Fraction.ZERO;

      for (cuo $$2 : $$0) {
         $$1 = $$1.add(a($$2).multiplyBy(Fraction.getFraction($$2.H(), 1)));
      }

      return $$1;
   }

   static Fraction a(cuo $$0) {
      cxd $$1 = $$0.a(kq.F);
      if ($$1 != null) {
         return d.add($$1.e());
      } else {
         List<dqc.c> $$2 = $$0.a(kq.ad, List.of());
         return !$$2.isEmpty() ? Fraction.ONE : Fraction.getFraction(1, $$0.j());
      }
   }

   public cuo a(int $$0) {
      return this.f.get($$0);
   }

   public Stream<cuo> a() {
      return this.f.stream().map(cuo::s);
   }

   public Iterable<cuo> b() {
      return this.f;
   }

   public Iterable<cuo> c() {
      return Lists.transform(this.f, cuo::s);
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
         return !($$0 instanceof cxd $$1) ? false : this.g.equals($$1.g) && cuo.a(this.f, $$1.f);
      }
   }

   @Override
   public int hashCode() {
      return cuo.a(this.f);
   }

   @Override
   public String toString() {
      return "BundleContents" + this.f;
   }

   public static class a {
      private final List<cuo> a;
      private Fraction b;

      public a(cxd $$0) {
         this.a = new ArrayList<>($$0.f);
         this.b = $$0.g;
      }

      public cxd.a a() {
         this.a.clear();
         this.b = Fraction.ZERO;
         return this;
      }

      private int b(cuo $$0) {
         if (!$$0.k()) {
            return -1;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (cuo.c(this.a.get($$1), $$0)) {
                  return $$1;
               }
            }

            return -1;
         }
      }

      private int c(cuo $$0) {
         Fraction $$1 = Fraction.ONE.subtract(this.b);
         return Math.max($$1.divideBy(cxd.a($$0)).intValue(), 0);
      }

      public int a(cuo $$0) {
         if (!$$0.e() && $$0.g().an_()) {
            int $$1 = Math.min($$0.H(), this.c($$0));
            if ($$1 == 0) {
               return 0;
            } else {
               this.b = this.b.add(cxd.a($$0).multiplyBy(Fraction.getFraction($$1, 1)));
               int $$2 = this.b($$0);
               if ($$2 != -1) {
                  cuo $$3 = this.a.remove($$2);
                  cuo $$4 = $$3.c($$3.H() + $$1);
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

      public int a(cro $$0, cmv $$1) {
         cuo $$2 = $$0.g();
         int $$3 = this.c($$2);
         return this.a($$0.b($$2.H(), $$3, $$1));
      }

      @Nullable
      public cuo b() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            cuo $$0 = this.a.remove(0).s();
            this.b = this.b.subtract(cxd.a($$0).multiplyBy(Fraction.getFraction($$0.H(), 1)));
            return $$0;
         }
      }

      public Fraction c() {
         return this.b;
      }

      public cxd d() {
         return new cxd(List.copyOf(this.a), this.b);
      }
   }
}
