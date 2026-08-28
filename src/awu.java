import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record awu<T>(akq<? extends jz<T>> a, akr b) {
   private static final Interner<awu<?>> c = Interners.newWeakInterner();

   @Deprecated
   public awu(akq<? extends jz<T>> a, akr b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<awu<T>> a(akq<? extends jz<T>> $$0) {
      return akr.a.xmap($$1 -> a($$0, $$1), awu::b);
   }

   public static <T> Codec<awu<T>> b(akq<? extends jz<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? akr.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> awu<T> a(akq<? extends jz<T>> $$0, akr $$1) {
      return (awu<T>)c.intern(new awu<>($$0, $$1));
   }

   public boolean c(akq<? extends jz<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<awu<E>> d(akq<? extends jz<E>> $$0) {
      return this.c($$0) ? Optional.of((awu<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
