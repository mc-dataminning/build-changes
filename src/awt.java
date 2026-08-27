import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record awt<T>(aks<? extends jn<T>> a, akt b) {
   private static final Interner<awt<?>> c = Interners.newWeakInterner();

   @Deprecated
   public awt(aks<? extends jn<T>> a, akt b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<awt<T>> a(aks<? extends jn<T>> $$0) {
      return akt.a.xmap($$1 -> a($$0, $$1), awt::b);
   }

   public static <T> Codec<awt<T>> b(aks<? extends jn<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? akt.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> awt<T> a(aks<? extends jn<T>> $$0, akt $$1) {
      return (awt<T>)c.intern(new awt<>($$0, $$1));
   }

   public boolean c(aks<? extends jn<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<awt<E>> d(aks<? extends jn<E>> $$0) {
      return this.c($$0) ? Optional.of((awt<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
