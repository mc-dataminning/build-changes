import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record arr<T>(agf<? extends io<T>> a, agg b) {
   private static final Interner<arr<?>> c = Interners.newWeakInterner();

   @Deprecated
   public arr(agf<? extends io<T>> a, agg b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<arr<T>> a(agf<? extends io<T>> $$0) {
      return agg.a.xmap($$1 -> a($$0, $$1), arr::b);
   }

   public static <T> Codec<arr<T>> b(agf<? extends io<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? agg.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> arr<T> a(agf<? extends io<T>> $$0, agg $$1) {
      return (arr<T>)c.intern(new arr<>($$0, $$1));
   }

   public boolean c(agf<? extends io<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<arr<E>> d(agf<? extends io<E>> $$0) {
      return this.c($$0) ? Optional.of((arr<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
