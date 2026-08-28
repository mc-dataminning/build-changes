import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record awk<T>(akj<? extends jw<T>> a, akk b) {
   private static final Interner<awk<?>> c = Interners.newWeakInterner();

   @Deprecated
   public awk(akj<? extends jw<T>> a, akk b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<awk<T>> a(akj<? extends jw<T>> $$0) {
      return akk.a.xmap($$1 -> a($$0, $$1), awk::b);
   }

   public static <T> Codec<awk<T>> b(akj<? extends jw<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? akk.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> awk<T> a(akj<? extends jw<T>> $$0, akk $$1) {
      return (awk<T>)c.intern(new awk<>($$0, $$1));
   }

   public boolean c(akj<? extends jw<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<awk<E>> d(akj<? extends jw<E>> $$0) {
      return this.c($$0) ? Optional.of((awk<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
