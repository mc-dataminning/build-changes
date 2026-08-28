import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;

public class ayu {
   final LoadingCache<ayu.a<?, ?>, DataResult<?>> a;

   public ayu(int $$0) {
      this.a = CacheBuilder.newBuilder().maximumSize((long)$$0).concurrencyLevel(1).softValues().build(new CacheLoader<ayu.a<?, ?>, DataResult<?>>() {
         public DataResult<?> a(ayu.a<?, ?> $$0) {
            return $$0.a();
         }
      });
   }

   public <A> Codec<A> a(final Codec<A> $$0) {
      return new Codec<A>() {
         public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> $$0x, T $$1) {
            return $$0.decode($$0, $$1);
         }

         public <T> DataResult<T> encode(A $$0x, DynamicOps<T> $$1, T $$2) {
            return ((DataResult)ayu.this.a.getUnchecked(new ayu.a($$0, $$0, $$1))).map($$0xx -> $$0xx instanceof vk $$1x ? $$1x.d() : $$0xx);
         }
      };
   }

   static record a<A, T>(Codec<A> a, A b, DynamicOps<T> c) {
      public DataResult<T> a() {
         return this.a.encodeStart(this.c, this.b);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof ayu.a<?, ?> $$1) ? false : this.a == $$1.a && this.b.equals($$1.b) && this.c.equals($$1.c);
         }
      }

      @Override
      public int hashCode() {
         int $$0 = System.identityHashCode(this.a);
         $$0 = 31 * $$0 + this.b.hashCode();
         return 31 * $$0 + this.c.hashCode();
      }

      public Codec<A> b() {
         return this.a;
      }

      public A c() {
         return this.b;
      }

      public DynamicOps<T> d() {
         return this.c;
      }
   }
}
