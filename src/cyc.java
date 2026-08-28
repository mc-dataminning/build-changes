import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public final class cyc implements ctg {
   public static final cyc a = new cyc(List.of());
   public static final Codec<cyc> b = cvs.b.listOf().xmap(cyc::new, $$0 -> $$0.g);
   public static final zc<wp, cyc> c = cvs.i.a(za.a()).a(cyc::new, $$0 -> $$0.g);
   private static final Fraction e = Fraction.getFraction(1, 16);
   private static final int f = -1;
   public static final int d = -1;
   final List<cvs> g;
   final Fraction h;
   final int i;

   cyc(List<cvs> $$0, Fraction $$1, int $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
   }

   public cyc(List<cvs> $$0) {
      this($$0, a($$0), -1);
   }

   private static Fraction a(List<cvs> $$0) {
      Fraction $$1 = Fraction.ZERO;

      for (cvs $$2 : $$0) {
         $$1 = $$1.add(b($$2).multiplyBy(Fraction.getFraction($$2.K(), 1)));
      }

      return $$1;
   }

   static Fraction b(cvs $$0) {
      cyc $$1 = $$0.a(ks.K);
      if ($$1 != null) {
         return e.add($$1.f());
      } else {
         List<drs.c> $$2 = $$0.a(ks.ai, List.of());
         return !$$2.isEmpty() ? Fraction.ONE : Fraction.getFraction(1, $$0.k());
      }
   }

   public static boolean a(cvs $$0) {
      return !$$0.f() && $$0.h().ap_();
   }

   public int a() {
      int $$0 = this.e();
      int $$1 = $$0 > 12 ? 11 : 12;
      int $$2 = $$0 % 4;
      int $$3 = $$2 == 0 ? 0 : 4 - $$2;
      return Math.min($$0, $$1 - $$3);
   }

   public cvs a(int $$0) {
      return this.g.get($$0);
   }

   public Stream<cvs> b() {
      return this.g.stream().map(cvs::u);
   }

   public Iterable<cvs> c() {
      return this.g;
   }

   public Iterable<cvs> d() {
      return Lists.transform(this.g, cvs::u);
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
         return !($$0 instanceof cyc $$1) ? false : this.h.equals($$1.h) && cvs.a(this.g, $$1.g);
      }
   }

   @Override
   public int hashCode() {
      return cvs.a(this.g);
   }

   @Override
   public String toString() {
      return "BundleContents" + this.g;
   }

   public static class a {
      private final List<cvs> a;
      private Fraction b;
      private int c;

      public a(cyc $$0) {
         this.a = new ArrayList<>($$0.g);
         this.b = $$0.h;
         this.c = $$0.i;
      }

      public cyc.a a() {
         this.a.clear();
         this.b = Fraction.ZERO;
         this.c = -1;
         return this;
      }

      private int b(cvs $$0) {
         if (!$$0.l()) {
            return -1;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (cvs.c(this.a.get($$1), $$0)) {
                  return $$1;
               }
            }

            return -1;
         }
      }

      private int c(cvs $$0) {
         Fraction $$1 = Fraction.ONE.subtract(this.b);
         return Math.max($$1.divideBy(cyc.b($$0)).intValue(), 0);
      }

      public int a(cvs $$0) {
         if (!cyc.a($$0)) {
            return 0;
         } else {
            int $$1 = Math.min($$0.K(), this.c($$0));
            if ($$1 == 0) {
               return 0;
            } else {
               this.b = this.b.add(cyc.b($$0).multiplyBy(Fraction.getFraction($$1, 1)));
               int $$2 = this.b($$0);
               if ($$2 != -1) {
                  cvs $$3 = this.a.remove($$2);
                  cvs $$4 = $$3.c($$3.K() + $$1);
                  $$0.h($$1);
                  this.a.add(0, $$4);
               } else {
                  this.a.add(0, $$0.a($$1));
               }

               return $$1;
            }
         }
      }

      public int a(csw $$0, cnx $$1) {
         cvs $$2 = $$0.g();
         int $$3 = this.c($$2);
         return cyc.a($$2) ? this.a($$0.b($$2.K(), $$3, $$1)) : 0;
      }

      public void a(int $$0) {
         this.c = this.c != $$0 && $$0 < this.a.size() ? $$0 : -1;
      }

      @Nullable
      public cvs b() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            int $$0 = this.c != -1 && this.c < this.a.size() ? this.c : 0;
            cvs $$1 = this.a.remove($$0).u();
            this.b = this.b.subtract(cyc.b($$1).multiplyBy(Fraction.getFraction($$1.K(), 1)));
            this.a(-1);
            return $$1;
         }
      }

      public Fraction c() {
         return this.b;
      }

      public cyc d() {
         return new cyc(List.copyOf(this.a), this.b, this.c);
      }
   }
}
