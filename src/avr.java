import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record avr<T>(ajs<? extends iy<T>> a, ajt b) {
   private static final Interner<avr<?>> c = Interners.newWeakInterner();

   @Deprecated
   public avr(ajs<? extends iy<T>> a, ajt b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<avr<T>> a(ajs<? extends iy<T>> $$0) {
      return ajt.a.xmap($$1 -> a($$0, $$1), avr::b);
   }

   public static <T> Codec<avr<T>> b(ajs<? extends iy<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? ajt.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> avr<T> a(ajs<? extends iy<T>> $$0, ajt $$1) {
      return (avr<T>)c.intern(new avr<>($$0, $$1));
   }

   public boolean c(ajs<? extends iy<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<avr<E>> d(ajs<? extends iy<E>> $$0) {
      return this.c($$0) ? Optional.of((avr<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
