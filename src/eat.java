import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class eat {
   private final Predicate<eas>[][][] a;
   private final int b;
   private final int c;
   private final int d;

   public eat(Predicate<eas>[][][] $$0) {
      this.a = $$0;
      this.b = $$0.length;
      if (this.b > 0) {
         this.c = $$0[0].length;
         if (this.c > 0) {
            this.d = $$0[0][0].length;
         } else {
            this.d = 0;
         }
      } else {
         this.c = 0;
         this.d = 0;
      }
   }

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   @VisibleForTesting
   public Predicate<eas>[][][] d() {
      return this.a;
   }

   @Nullable
   @VisibleForTesting
   public eat.b a(djk $$0, iv $$1, jb $$2, jb $$3) {
      LoadingCache<iv, eas> $$4 = a($$0, false);
      return this.a($$1, $$2, $$3, $$4);
   }

   @Nullable
   private eat.b a(iv $$0, jb $$1, jb $$2, LoadingCache<iv, eas> $$3) {
      for (int $$4 = 0; $$4 < this.d; $$4++) {
         for (int $$5 = 0; $$5 < this.c; $$5++) {
            for (int $$6 = 0; $$6 < this.b; $$6++) {
               if (!this.a[$$6][$$5][$$4].test((eas)$$3.getUnchecked(a($$0, $$1, $$2, $$4, $$5, $$6)))) {
                  return null;
               }
            }
         }
      }

      return new eat.b($$0, $$1, $$2, $$3, this.d, this.c, this.b);
   }

   @Nullable
   public eat.b a(djk $$0, iv $$1) {
      LoadingCache<iv, eas> $$2 = a($$0, false);
      int $$3 = Math.max(Math.max(this.d, this.c), this.b);

      for (iv $$4 : iv.c($$1, $$1.b($$3 - 1, $$3 - 1, $$3 - 1))) {
         for (jb $$5 : jb.values()) {
            for (jb $$6 : jb.values()) {
               if ($$6 != $$5 && $$6 != $$5.g()) {
                  eat.b $$7 = this.a($$4, $$5, $$6, $$2);
                  if ($$7 != null) {
                     return $$7;
                  }
               }
            }
         }
      }

      return null;
   }

   public static LoadingCache<iv, eas> a(djk $$0, boolean $$1) {
      return CacheBuilder.newBuilder().build(new eat.a($$0, $$1));
   }

   protected static iv a(iv $$0, jb $$1, jb $$2, int $$3, int $$4, int $$5) {
      if ($$1 != $$2 && $$1 != $$2.g()) {
         ka $$6 = new ka($$1.j(), $$1.k(), $$1.l());
         ka $$7 = new ka($$2.j(), $$2.k(), $$2.l());
         ka $$8 = $$6.d($$7);
         return $$0.b(
            $$7.u() * -$$4 + $$8.u() * $$3 + $$6.u() * $$5, $$7.v() * -$$4 + $$8.v() * $$3 + $$6.v() * $$5, $$7.w() * -$$4 + $$8.w() * $$3 + $$6.w() * $$5
         );
      } else {
         throw new IllegalArgumentException("Invalid forwards & up combination");
      }
   }

   static class a extends CacheLoader<iv, eas> {
      private final djk a;
      private final boolean b;

      public a(djk $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public eas a(iv $$0) {
         return new eas(this.a, $$0, this.b);
      }
   }

   public static class b {
      private final iv a;
      private final jb b;
      private final jb c;
      private final LoadingCache<iv, eas> d;
      private final int e;
      private final int f;
      private final int g;

      public b(iv $$0, jb $$1, jb $$2, LoadingCache<iv, eas> $$3, int $$4, int $$5, int $$6) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
      }

      public iv a() {
         return this.a;
      }

      public jb b() {
         return this.b;
      }

      public jb c() {
         return this.c;
      }

      public int d() {
         return this.e;
      }

      public int e() {
         return this.f;
      }

      public int f() {
         return this.g;
      }

      public eas a(int $$0, int $$1, int $$2) {
         return (eas)this.d.getUnchecked(eat.a(this.a, this.b(), this.c(), $$0, $$1, $$2));
      }

      @Override
      public String toString() {
         return MoreObjects.toStringHelper(this).add("up", this.c).add("forwards", this.b).add("frontTopLeft", this.a).toString();
      }
   }
}
