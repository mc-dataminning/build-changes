import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dcg {
   private final Predicate<dcf>[][][] a;
   private final int b;
   private final int c;
   private final int d;

   public dcg(Predicate<dcf>[][][] $$0) {
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
   public Predicate<dcf>[][][] d() {
      return this.a;
   }

   @Nullable
   @VisibleForTesting
   public dcg.b a(cmp $$0, gu $$1, ha $$2, ha $$3) {
      LoadingCache<gu, dcf> $$4 = a($$0, false);
      return this.a($$1, $$2, $$3, $$4);
   }

   @Nullable
   private dcg.b a(gu $$0, ha $$1, ha $$2, LoadingCache<gu, dcf> $$3) {
      for (int $$4 = 0; $$4 < this.d; $$4++) {
         for (int $$5 = 0; $$5 < this.c; $$5++) {
            for (int $$6 = 0; $$6 < this.b; $$6++) {
               if (!this.a[$$6][$$5][$$4].test((dcf)$$3.getUnchecked(a($$0, $$1, $$2, $$4, $$5, $$6)))) {
                  return null;
               }
            }
         }
      }

      return new dcg.b($$0, $$1, $$2, $$3, this.d, this.c, this.b);
   }

   @Nullable
   public dcg.b a(cmp $$0, gu $$1) {
      LoadingCache<gu, dcf> $$2 = a($$0, false);
      int $$3 = Math.max(Math.max(this.d, this.c), this.b);

      for (gu $$4 : gu.a($$1, $$1.b($$3 - 1, $$3 - 1, $$3 - 1))) {
         for (ha $$5 : ha.values()) {
            for (ha $$6 : ha.values()) {
               if ($$6 != $$5 && $$6 != $$5.g()) {
                  dcg.b $$7 = this.a($$4, $$5, $$6, $$2);
                  if ($$7 != null) {
                     return $$7;
                  }
               }
            }
         }
      }

      return null;
   }

   public static LoadingCache<gu, dcf> a(cmp $$0, boolean $$1) {
      return CacheBuilder.newBuilder().build(new dcg.a($$0, $$1));
   }

   protected static gu a(gu $$0, ha $$1, ha $$2, int $$3, int $$4, int $$5) {
      if ($$1 != $$2 && $$1 != $$2.g()) {
         hz $$6 = new hz($$1.j(), $$1.k(), $$1.l());
         hz $$7 = new hz($$2.j(), $$2.k(), $$2.l());
         hz $$8 = $$6.d($$7);
         return $$0.b(
            $$7.u() * -$$4 + $$8.u() * $$3 + $$6.u() * $$5, $$7.v() * -$$4 + $$8.v() * $$3 + $$6.v() * $$5, $$7.w() * -$$4 + $$8.w() * $$3 + $$6.w() * $$5
         );
      } else {
         throw new IllegalArgumentException("Invalid forwards & up combination");
      }
   }

   static class a extends CacheLoader<gu, dcf> {
      private final cmp a;
      private final boolean b;

      public a(cmp $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dcf a(gu $$0) {
         return new dcf(this.a, $$0, this.b);
      }
   }

   public static class b {
      private final gu a;
      private final ha b;
      private final ha c;
      private final LoadingCache<gu, dcf> d;
      private final int e;
      private final int f;
      private final int g;

      public b(gu $$0, ha $$1, ha $$2, LoadingCache<gu, dcf> $$3, int $$4, int $$5, int $$6) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
      }

      public gu a() {
         return this.a;
      }

      public ha b() {
         return this.b;
      }

      public ha c() {
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

      public dcf a(int $$0, int $$1, int $$2) {
         return (dcf)this.d.getUnchecked(dcg.a(this.a, this.b(), this.c(), $$0, $$1, $$2));
      }

      @Override
      public String toString() {
         return MoreObjects.toStringHelper(this).add("up", this.c).add("forwards", this.b).add("frontTopLeft", this.a).toString();
      }
   }
}
