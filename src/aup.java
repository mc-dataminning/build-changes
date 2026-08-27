import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record aup<T>(aix<? extends iv<T>> a, aiy b) {
   private static final Interner<aup<?>> c = Interners.newWeakInterner();

   @Deprecated
   public aup(aix<? extends iv<T>> a, aiy b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<aup<T>> a(aix<? extends iv<T>> $$0) {
      return aiy.a.xmap($$1 -> a($$0, $$1), aup::b);
   }

   public static <T> Codec<aup<T>> b(aix<? extends iv<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? aiy.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> aup<T> a(aix<? extends iv<T>> $$0, aiy $$1) {
      return (aup<T>)c.intern(new aup<>($$0, $$1));
   }

   public boolean c(aix<? extends iv<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<aup<E>> d(aix<? extends iv<E>> $$0) {
      return this.c($$0) ? Optional.of((aup<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
