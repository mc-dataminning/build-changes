import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record arz<T>(agl<? extends is<T>> a, agm b) {
   private static final Interner<arz<?>> c = Interners.newWeakInterner();

   @Deprecated
   public arz(agl<? extends is<T>> a, agm b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<arz<T>> a(agl<? extends is<T>> $$0) {
      return agm.a.xmap($$1 -> a($$0, $$1), arz::b);
   }

   public static <T> Codec<arz<T>> b(agl<? extends is<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? agm.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> arz<T> a(agl<? extends is<T>> $$0, agm $$1) {
      return (arz<T>)c.intern(new arz<>($$0, $$1));
   }

   public boolean c(agl<? extends is<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<arz<E>> d(agl<? extends is<E>> $$0) {
      return this.c($$0) ? Optional.of((arz<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
