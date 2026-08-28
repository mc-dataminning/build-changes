import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public final class cxf implements csa {
   public static final cxf a = new cxf(List.of());
   public static final Codec<cxf> b = cuq.b.listOf().xmap(cxf::new, $$0 -> $$0.f);
   public static final yx<wk, cxf> c = cuq.i.a(yv.a()).a(cxf::new, $$0 -> $$0.f);
   private static final Fraction d = Fraction.getFraction(1, 16);
   private static final int e = -1;
   final List<cuq> f;
   final Fraction g;

   cxf(List<cuq> $$0, Fraction $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   public cxf(List<cuq> $$0) {
      this($$0, a($$0));
   }

   private static Fraction a(List<cuq> $$0) {
      Fraction $$1 = Fraction.ZERO;

      for (cuq $$2 : $$0) {
         $$1 = $$1.add(a($$2).multiplyBy(Fraction.getFraction($$2.H(), 1)));
      }

      return $$1;
   }

   static Fraction a(cuq $$0) {
      cxf $$1 = $$0.a(kq.F);
      if ($$1 != null) {
         return d.add($$1.e());
      } else {
         List<dqe.c> $$2 = $$0.a(kq.ad, List.of());
         return !$$2.isEmpty() ? Fraction.ONE : Fraction.getFraction(1, $$0.j());
      }
   }

   public cuq a(int $$0) {
      return this.f.get($$0);
   }

   public Stream<cuq> a() {
      return this.f.stream().map(cuq::s);
   }

   public Iterable<cuq> b() {
      return this.f;
   }

   public Iterable<cuq> c() {
      return Lists.transform(this.f, cuq::s);
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
         return !($$0 instanceof cxf $$1) ? false : this.g.equals($$1.g) && cuq.a(this.f, $$1.f);
      }
   }

   @Override
   public int hashCode() {
      return cuq.a(this.f);
   }

   @Override
   public String toString() {
      return "BundleContents" + this.f;
   }

   public static class a {
      private final List<cuq> a;
      private Fraction b;

      public a(cxf $$0) {
         this.a = new ArrayList<>($$0.f);
         this.b = $$0.g;
      }

      public cxf.a a() {
         this.a.clear();
         this.b = Fraction.ZERO;
         return this;
      }

      private int b(cuq $$0) {
         if (!$$0.k()) {
            return -1;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (cuq.c(this.a.get($$1), $$0)) {
                  return $$1;
               }
            }

            return -1;
         }
      }

      private int c(cuq $$0) {
         Fraction $$1 = Fraction.ONE.subtract(this.b);
         return Math.max($$1.divideBy(cxf.a($$0)).intValue(), 0);
      }

      public int a(cuq $$0) {
         if (!$$0.e() && $$0.g().ar_()) {
            int $$1 = Math.min($$0.H(), this.c($$0));
            if ($$1 == 0) {
               return 0;
            } else {
               this.b = this.b.add(cxf.a($$0).multiplyBy(Fraction.getFraction($$1, 1)));
               int $$2 = this.b($$0);
               if ($$2 != -1) {
                  cuq $$3 = this.a.remove($$2);
                  cuq $$4 = $$3.c($$3.H() + $$1);
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

      public int a(crq $$0, cmx $$1) {
         cuq $$2 = $$0.g();
         int $$3 = this.c($$2);
         return this.a($$0.b($$2.H(), $$3, $$1));
      }

      @Nullable
      public cuq b() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            cuq $$0 = this.a.remove(0).s();
            this.b = this.b.subtract(cxf.a($$0).multiplyBy(Fraction.getFraction($$0.H(), 1)));
            return $$0;
         }
      }

      public Fraction c() {
         return this.b;
      }

      public cxf d() {
         return new cxf(List.copyOf(this.a), this.b);
      }
   }
}
