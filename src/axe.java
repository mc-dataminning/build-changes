import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record axe<T>(ald<? extends jv<T>> a, ale b) {
   private static final Interner<axe<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axe(ald<? extends jv<T>> a, ale b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axe<T>> a(ald<? extends jv<T>> $$0) {
      return ale.a.xmap($$1 -> a($$0, $$1), axe::b);
   }

   public static <T> Codec<axe<T>> b(ald<? extends jv<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? ale.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> axe<T> a(ald<? extends jv<T>> $$0, ale $$1) {
      return (axe<T>)c.intern(new axe<>($$0, $$1));
   }

   public boolean c(ald<? extends jv<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axe<E>> d(ald<? extends jv<E>> $$0) {
      return this.c($$0) ? Optional.of((axe<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
