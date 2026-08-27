import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record awl<T>(akl<? extends jk<T>> a, akm b) {
   private static final Interner<awl<?>> c = Interners.newWeakInterner();

   @Deprecated
   public awl(akl<? extends jk<T>> a, akm b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<awl<T>> a(akl<? extends jk<T>> $$0) {
      return akm.a.xmap($$1 -> a($$0, $$1), awl::b);
   }

   public static <T> Codec<awl<T>> b(akl<? extends jk<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? akm.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> awl<T> a(akl<? extends jk<T>> $$0, akm $$1) {
      return (awl<T>)c.intern(new awl<>($$0, $$1));
   }

   public boolean c(akl<? extends jk<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<awl<E>> d(akl<? extends jk<E>> $$0) {
      return this.c($$0) ? Optional.of((awl<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
