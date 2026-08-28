import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record awt<T>(akp<? extends jz<T>> a, akq b) {
   private static final Interner<awt<?>> c = Interners.newWeakInterner();

   @Deprecated
   public awt(akp<? extends jz<T>> a, akq b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<awt<T>> a(akp<? extends jz<T>> $$0) {
      return akq.a.xmap($$1 -> a($$0, $$1), awt::b);
   }

   public static <T> Codec<awt<T>> b(akp<? extends jz<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? akq.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> awt<T> a(akp<? extends jz<T>> $$0, akq $$1) {
      return (awt<T>)c.intern(new awt<>($$0, $$1));
   }

   public boolean c(akp<? extends jz<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<awt<E>> d(akp<? extends jz<E>> $$0) {
      return this.c($$0) ? Optional.of((awt<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
