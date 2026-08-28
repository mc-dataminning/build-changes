import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsp {
   private final Predicate<dso>[][][] a;
   private final int b;
   private final int c;
   private final int d;

   public dsp(Predicate<dso>[][][] $$0) {
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
   public Predicate<dso>[][][] d() {
      return this.a;
   }

   @Nullable
   @VisibleForTesting
   public dsp.b a(dci $$0, ja $$1, jf $$2, jf $$3) {
      LoadingCache<ja, dso> $$4 = a($$0, false);
      return this.a($$1, $$2, $$3, $$4);
   }

   @Nullable
   private dsp.b a(ja $$0, jf $$1, jf $$2, LoadingCache<ja, dso> $$3) {
      for (int $$4 = 0; $$4 < this.d; $$4++) {
         for (int $$5 = 0; $$5 < this.c; $$5++) {
            for (int $$6 = 0; $$6 < this.b; $$6++) {
               if (!this.a[$$6][$$5][$$4].test((dso)$$3.getUnchecked(a($$0, $$1, $$2, $$4, $$5, $$6)))) {
                  return null;
               }
            }
         }
      }

      return new dsp.b($$0, $$1, $$2, $$3, this.d, this.c, this.b);
   }

   @Nullable
   public dsp.b a(dci $$0, ja $$1) {
      LoadingCache<ja, dso> $$2 = a($$0, false);
      int $$3 = Math.max(Math.max(this.d, this.c), this.b);

      for (ja $$4 : ja.c($$1, $$1.b($$3 - 1, $$3 - 1, $$3 - 1))) {
         for (jf $$5 : jf.values()) {
            for (jf $$6 : jf.values()) {
               if ($$6 != $$5 && $$6 != $$5.g()) {
                  dsp.b $$7 = this.a($$4, $$5, $$6, $$2);
                  if ($$7 != null) {
                     return $$7;
                  }
               }
            }
         }
      }

      return null;
   }

   public static LoadingCache<ja, dso> a(dci $$0, boolean $$1) {
      return CacheBuilder.newBuilder().build(new dsp.a($$0, $$1));
   }

   protected static ja a(ja $$0, jf $$1, jf $$2, int $$3, int $$4, int $$5) {
      if ($$1 != $$2 && $$1 != $$2.g()) {
         ke $$6 = new ke($$1.j(), $$1.k(), $$1.l());
         ke $$7 = new ke($$2.j(), $$2.k(), $$2.l());
         ke $$8 = $$6.d($$7);
         return $$0.b(
            $$7.u() * -$$4 + $$8.u() * $$3 + $$6.u() * $$5, $$7.v() * -$$4 + $$8.v() * $$3 + $$6.v() * $$5, $$7.w() * -$$4 + $$8.w() * $$3 + $$6.w() * $$5
         );
      } else {
         throw new IllegalArgumentException("Invalid forwards & up combination");
      }
   }

   static class a extends CacheLoader<ja, dso> {
      private final dci a;
      private final boolean b;

      public a(dci $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dso a(ja $$0) {
         return new dso(this.a, $$0, this.b);
      }
   }

   public static class b {
      private final ja a;
      private final jf b;
      private final jf c;
      private final LoadingCache<ja, dso> d;
      private final int e;
      private final int f;
      private final int g;

      public b(ja $$0, jf $$1, jf $$2, LoadingCache<ja, dso> $$3, int $$4, int $$5, int $$6) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
      }

      public ja a() {
         return this.a;
      }

      public jf b() {
         return this.b;
      }

      public jf c() {
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

      public dso a(int $$0, int $$1, int $$2) {
         return (dso)this.d.getUnchecked(dsp.a(this.a, this.b(), this.c(), $$0, $$1, $$2));
      }

      @Override
      public String toString() {
         return MoreObjects.toStringHelper(this).add("up", this.c).add("forwards", this.b).add("frontTopLeft", this.a).toString();
      }
   }
}
