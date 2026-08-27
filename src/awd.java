import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record awd<T>(ake<? extends ji<T>> a, akf b) {
   private static final Interner<awd<?>> c = Interners.newWeakInterner();

   @Deprecated
   public awd(ake<? extends ji<T>> a, akf b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<awd<T>> a(ake<? extends ji<T>> $$0) {
      return akf.a.xmap($$1 -> a($$0, $$1), awd::b);
   }

   public static <T> Codec<awd<T>> b(ake<? extends ji<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? akf.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> awd<T> a(ake<? extends ji<T>> $$0, akf $$1) {
      return (awd<T>)c.intern(new awd<>($$0, $$1));
   }

   public boolean c(ake<? extends ji<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<awd<E>> d(ake<? extends ji<E>> $$0) {
      return this.c($$0) ? Optional.of((awd<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
