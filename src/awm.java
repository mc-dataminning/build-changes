import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record awm<T>(akm<? extends jk<T>> a, akn b) {
   private static final Interner<awm<?>> c = Interners.newWeakInterner();

   @Deprecated
   public awm(akm<? extends jk<T>> a, akn b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<awm<T>> a(akm<? extends jk<T>> $$0) {
      return akn.a.xmap($$1 -> a($$0, $$1), awm::b);
   }

   public static <T> Codec<awm<T>> b(akm<? extends jk<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? akn.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> awm<T> a(akm<? extends jk<T>> $$0, akn $$1) {
      return (awm<T>)c.intern(new awm<>($$0, $$1));
   }

   public boolean c(akm<? extends jk<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<awm<E>> d(akm<? extends jk<E>> $$0) {
      return this.c($$0) ? Optional.of((awm<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
