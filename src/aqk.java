import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record aqk<T>(aey<? extends hq<T>> a, aez b) {
   private static final Interner<aqk<?>> c = Interners.newWeakInterner();

   @Deprecated
   public aqk(aey<? extends hq<T>> a, aez b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<aqk<T>> a(aey<? extends hq<T>> $$0) {
      return aez.a.xmap($$1 -> a($$0, $$1), aqk::b);
   }

   public static <T> Codec<aqk<T>> b(aey<? extends hq<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? aez.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> aqk<T> a(aey<? extends hq<T>> $$0, aez $$1) {
      return (aqk<T>)c.intern(new aqk<>($$0, $$1));
   }

   public boolean c(aey<? extends hq<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<aqk<E>> d(aey<? extends hq<E>> $$0) {
      return this.c($$0) ? Optional.of((aqk<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
