import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record aqh<T>(aev<? extends hq<T>> a, aew b) {
   private static final Interner<aqh<?>> c = Interners.newWeakInterner();

   @Deprecated
   public aqh(aev<? extends hq<T>> a, aew b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<aqh<T>> a(aev<? extends hq<T>> $$0) {
      return aew.a.xmap($$1 -> a($$0, $$1), aqh::b);
   }

   public static <T> Codec<aqh<T>> b(aev<? extends hq<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? aew.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> aqh<T> a(aev<? extends hq<T>> $$0, aew $$1) {
      return (aqh<T>)c.intern(new aqh<>($$0, $$1));
   }

   public boolean c(aev<? extends hq<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<aqh<E>> d(aev<? extends hq<E>> $$0) {
      return this.c($$0) ? Optional.of((aqh<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
