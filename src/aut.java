import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record aut<T>(ajb<? extends ix<T>> a, ajc b) {
   private static final Interner<aut<?>> c = Interners.newWeakInterner();

   @Deprecated
   public aut(ajb<? extends ix<T>> a, ajc b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<aut<T>> a(ajb<? extends ix<T>> $$0) {
      return ajc.a.xmap($$1 -> a($$0, $$1), aut::b);
   }

   public static <T> Codec<aut<T>> b(ajb<? extends ix<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? ajc.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> aut<T> a(ajb<? extends ix<T>> $$0, ajc $$1) {
      return (aut<T>)c.intern(new aut<>($$0, $$1));
   }

   public boolean c(ajb<? extends ix<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<aut<E>> d(ajb<? extends ix<E>> $$0) {
      return this.c($$0) ? Optional.of((aut<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
