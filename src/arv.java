import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record arv<T>(agh<? extends io<T>> a, agi b) {
   private static final Interner<arv<?>> c = Interners.newWeakInterner();

   @Deprecated
   public arv(agh<? extends io<T>> a, agi b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<arv<T>> a(agh<? extends io<T>> $$0) {
      return agi.a.xmap($$1 -> a($$0, $$1), arv::b);
   }

   public static <T> Codec<arv<T>> b(agh<? extends io<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? agi.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> arv<T> a(agh<? extends io<T>> $$0, agi $$1) {
      return (arv<T>)c.intern(new arv<>($$0, $$1));
   }

   public boolean c(agh<? extends io<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<arv<E>> d(agh<? extends io<E>> $$0) {
      return this.c($$0) ? Optional.of((arv<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
