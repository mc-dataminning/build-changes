import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfd {
   private final Predicate<dfc>[][][] a;
   private final int b;
   private final int c;
   private final int d;

   public dfd(Predicate<dfc>[][][] $$0) {
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
   public Predicate<dfc>[][][] d() {
      return this.a;
   }

   @Nullable
   @VisibleForTesting
   public dfd.b a(cpn $$0, gv $$1, hb $$2, hb $$3) {
      LoadingCache<gv, dfc> $$4 = a($$0, false);
      return this.a($$1, $$2, $$3, $$4);
   }

   @Nullable
   private dfd.b a(gv $$0, hb $$1, hb $$2, LoadingCache<gv, dfc> $$3) {
      for (int $$4 = 0; $$4 < this.d; $$4++) {
         for (int $$5 = 0; $$5 < this.c; $$5++) {
            for (int $$6 = 0; $$6 < this.b; $$6++) {
               if (!this.a[$$6][$$5][$$4].test((dfc)$$3.getUnchecked(a($$0, $$1, $$2, $$4, $$5, $$6)))) {
                  return null;
               }
            }
         }
      }

      return new dfd.b($$0, $$1, $$2, $$3, this.d, this.c, this.b);
   }

   @Nullable
   public dfd.b a(cpn $$0, gv $$1) {
      LoadingCache<gv, dfc> $$2 = a($$0, false);
      int $$3 = Math.max(Math.max(this.d, this.c), this.b);

      for (gv $$4 : gv.a($$1, $$1.b($$3 - 1, $$3 - 1, $$3 - 1))) {
         for (hb $$5 : hb.values()) {
            for (hb $$6 : hb.values()) {
               if ($$6 != $$5 && $$6 != $$5.g()) {
                  dfd.b $$7 = this.a($$4, $$5, $$6, $$2);
                  if ($$7 != null) {
                     return $$7;
                  }
               }
            }
         }
      }

      return null;
   }

   public static LoadingCache<gv, dfc> a(cpn $$0, boolean $$1) {
      return CacheBuilder.newBuilder().build(new dfd.a($$0, $$1));
   }

   protected static gv a(gv $$0, hb $$1, hb $$2, int $$3, int $$4, int $$5) {
      if ($$1 != $$2 && $$1 != $$2.g()) {
         ia $$6 = new ia($$1.j(), $$1.k(), $$1.l());
         ia $$7 = new ia($$2.j(), $$2.k(), $$2.l());
         ia $$8 = $$6.d($$7);
         return $$0.b(
            $$7.u() * -$$4 + $$8.u() * $$3 + $$6.u() * $$5, $$7.v() * -$$4 + $$8.v() * $$3 + $$6.v() * $$5, $$7.w() * -$$4 + $$8.w() * $$3 + $$6.w() * $$5
         );
      } else {
         throw new IllegalArgumentException("Invalid forwards & up combination");
      }
   }

   static class a extends CacheLoader<gv, dfc> {
      private final cpn a;
      private final boolean b;

      public a(cpn $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dfc a(gv $$0) {
         return new dfc(this.a, $$0, this.b);
      }
   }

   public static class b {
      private final gv a;
      private final hb b;
      private final hb c;
      private final LoadingCache<gv, dfc> d;
      private final int e;
      private final int f;
      private final int g;

      public b(gv $$0, hb $$1, hb $$2, LoadingCache<gv, dfc> $$3, int $$4, int $$5, int $$6) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
      }

      public gv a() {
         return this.a;
      }

      public hb b() {
         return this.b;
      }

      public hb c() {
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

      public dfc a(int $$0, int $$1, int $$2) {
         return (dfc)this.d.getUnchecked(dfd.a(this.a, this.b(), this.c(), $$0, $$1, $$2));
      }

      @Override
      public String toString() {
         return MoreObjects.toStringHelper(this).add("up", this.c).add("forwards", this.b).add("frontTopLeft", this.a).toString();
      }
   }
}
