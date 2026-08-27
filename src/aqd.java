import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record aqd<T>(aet<? extends ht<T>> a, aeu b) {
   private static final Interner<aqd<?>> c = Interners.newWeakInterner();

   @Deprecated
   public aqd(aet<? extends ht<T>> a, aeu b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<aqd<T>> a(aet<? extends ht<T>> $$0) {
      return aeu.a.xmap($$1 -> a($$0, $$1), aqd::b);
   }

   public static <T> Codec<aqd<T>> b(aet<? extends ht<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? aeu.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> aqd<T> a(aet<? extends ht<T>> $$0, aeu $$1) {
      return (aqd<T>)c.intern(new aqd<>($$0, $$1));
   }

   public boolean c(aet<? extends ht<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<aqd<E>> d(aet<? extends ht<E>> $$0) {
      return this.c($$0) ? Optional.of((aqd<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
