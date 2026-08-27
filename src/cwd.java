import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public final class cwd implements cra {
   public static final cwd a = new cwd(List.of());
   public static final Codec<cwd> b = ctq.a.listOf().xmap(cwd::new, $$0 -> $$0.f);
   public static final yv<wi, cwd> c = ctq.f.a(yt.a()).a(cwd::new, $$0 -> $$0.f);
   private static final Fraction d = Fraction.getFraction(1, 16);
   private static final int e = -1;
   final List<ctq> f;
   final Fraction g;

   cwd(List<ctq> $$0, Fraction $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   public cwd(List<ctq> $$0) {
      this($$0, a($$0));
   }

   private static Fraction a(List<ctq> $$0) {
      Fraction $$1 = Fraction.ZERO;

      for (ctq $$2 : $$0) {
         $$1 = $$1.add(a($$2).multiplyBy(Fraction.getFraction($$2.I(), 1)));
      }

      return $$1;
   }

   static Fraction a(ctq $$0) {
      cwd $$1 = $$0.a(kb.E);
      if ($$1 != null) {
         return d.add($$1.c());
      } else {
         List<dof.c> $$2 = $$0.a(kb.ab, List.of());
         return !$$2.isEmpty() ? Fraction.ONE : Fraction.getFraction(1, $$0.j());
      }
   }

   public ctq a(int $$0) {
      return this.f.get($$0);
   }

   public Stream<ctq> a() {
      return this.f.stream().map(ctq::s);
   }

   public int b() {
      return this.f.size();
   }

   public Fraction c() {
      return this.g;
   }

   public boolean d() {
      return this.f.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof cwd $$1) ? false : this.g.equals($$1.g) && ctq.a(this.f, $$1.f);
      }
   }

   @Override
   public int hashCode() {
      return ctq.a(this.f);
   }

   @Override
   public String toString() {
      return "BundleContents" + this.f;
   }

   public static class a {
      private final List<ctq> a;
      private Fraction b;

      public a(cwd $$0) {
         this.a = new ArrayList<>($$0.f);
         this.b = $$0.g;
      }

      private int b(ctq $$0) {
         if (!$$0.k()) {
            return -1;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (ctq.c(this.a.get($$1), $$0)) {
                  return $$1;
               }
            }

            return -1;
         }
      }

      private int c(ctq $$0) {
         Fraction $$1 = Fraction.ONE.subtract(this.b);
         return Math.max($$1.divideBy(cwd.a($$0)).intValue(), 0);
      }

      public int a(ctq $$0) {
         if (!$$0.e() && $$0.g().an_()) {
            int $$1 = Math.min($$0.I(), this.c($$0));
            if ($$1 == 0) {
               return 0;
            } else {
               this.b = this.b.add(cwd.a($$0).multiplyBy(Fraction.getFraction($$1, 1)));
               int $$2 = this.b($$0);
               if ($$2 != -1) {
                  ctq $$3 = this.a.remove($$2);
                  ctq $$4 = $$3.c($$3.I() + $$1);
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

      public int a(cqq $$0, cly $$1) {
         ctq $$2 = $$0.g();
         int $$3 = this.c($$2);
         return this.a($$0.b($$2.I(), $$3, $$1));
      }

      @Nullable
      public ctq a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            ctq $$0 = this.a.remove(0).s();
            this.b = this.b.subtract(cwd.a($$0).multiplyBy(Fraction.getFraction($$0.I(), 1)));
            return $$0;
         }
      }

      public Fraction b() {
         return this.b;
      }

      public cwd c() {
         return new cwd(List.copyOf(this.a), this.b);
      }
   }
}
