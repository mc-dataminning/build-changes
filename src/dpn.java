import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dpn {
   private final Predicate<dpm>[][][] a;
   private final int b;
   private final int c;
   private final int d;

   public dpn(Predicate<dpm>[][][] $$0) {
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
   public Predicate<dpm>[][][] d() {
      return this.a;
   }

   @Nullable
   @VisibleForTesting
   public dpn.b a(czj $$0, id $$1, ij $$2, ij $$3) {
      LoadingCache<id, dpm> $$4 = a($$0, false);
      return this.a($$1, $$2, $$3, $$4);
   }

   @Nullable
   private dpn.b a(id $$0, ij $$1, ij $$2, LoadingCache<id, dpm> $$3) {
      for (int $$4 = 0; $$4 < this.d; $$4++) {
         for (int $$5 = 0; $$5 < this.c; $$5++) {
            for (int $$6 = 0; $$6 < this.b; $$6++) {
               if (!this.a[$$6][$$5][$$4].test((dpm)$$3.getUnchecked(a($$0, $$1, $$2, $$4, $$5, $$6)))) {
                  return null;
               }
            }
         }
      }

      return new dpn.b($$0, $$1, $$2, $$3, this.d, this.c, this.b);
   }

   @Nullable
   public dpn.b a(czj $$0, id $$1) {
      LoadingCache<id, dpm> $$2 = a($$0, false);
      int $$3 = Math.max(Math.max(this.d, this.c), this.b);

      for (id $$4 : id.a($$1, $$1.b($$3 - 1, $$3 - 1, $$3 - 1))) {
         for (ij $$5 : ij.values()) {
            for (ij $$6 : ij.values()) {
               if ($$6 != $$5 && $$6 != $$5.g()) {
                  dpn.b $$7 = this.a($$4, $$5, $$6, $$2);
                  if ($$7 != null) {
                     return $$7;
                  }
               }
            }
         }
      }

      return null;
   }

   public static LoadingCache<id, dpm> a(czj $$0, boolean $$1) {
      return CacheBuilder.newBuilder().build(new dpn.a($$0, $$1));
   }

   protected static id a(id $$0, ij $$1, ij $$2, int $$3, int $$4, int $$5) {
      if ($$1 != $$2 && $$1 != $$2.g()) {
         ji $$6 = new ji($$1.j(), $$1.k(), $$1.l());
         ji $$7 = new ji($$2.j(), $$2.k(), $$2.l());
         ji $$8 = $$6.d($$7);
         return $$0.b(
            $$7.u() * -$$4 + $$8.u() * $$3 + $$6.u() * $$5, $$7.v() * -$$4 + $$8.v() * $$3 + $$6.v() * $$5, $$7.w() * -$$4 + $$8.w() * $$3 + $$6.w() * $$5
         );
      } else {
         throw new IllegalArgumentException("Invalid forwards & up combination");
      }
   }

   static class a extends CacheLoader<id, dpm> {
      private final czj a;
      private final boolean b;

      public a(czj $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dpm a(id $$0) {
         return new dpm(this.a, $$0, this.b);
      }
   }

   public static class b {
      private final id a;
      private final ij b;
      private final ij c;
      private final LoadingCache<id, dpm> d;
      private final int e;
      private final int f;
      private final int g;

      public b(id $$0, ij $$1, ij $$2, LoadingCache<id, dpm> $$3, int $$4, int $$5, int $$6) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
      }

      public id a() {
         return this.a;
      }

      public ij b() {
         return this.b;
      }

      public ij c() {
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

      public dpm a(int $$0, int $$1, int $$2) {
         return (dpm)this.d.getUnchecked(dpn.a(this.a, this.b(), this.c(), $$0, $$1, $$2));
      }

      @Override
      public String toString() {
         return MoreObjects.toStringHelper(this).add("up", this.c).add("forwards", this.b).add("frontTopLeft", this.a).toString();
      }
   }
}
