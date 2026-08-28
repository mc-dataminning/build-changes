import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record axj<T>(alb<? extends ka<T>> a, alc b) {
   private static final Interner<axj<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axj(alb<? extends ka<T>> a, alc b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axj<T>> a(alb<? extends ka<T>> $$0) {
      return alc.a.xmap($$1 -> a($$0, $$1), axj::b);
   }

   public static <T> Codec<axj<T>> b(alb<? extends ka<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? alc.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> axj<T> a(alb<? extends ka<T>> $$0, alc $$1) {
      return (axj<T>)c.intern(new axj<>($$0, $$1));
   }

   public boolean c(alb<? extends ka<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axj<E>> d(alb<? extends ka<E>> $$0) {
      return this.c($$0) ? Optional.of((axj<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
