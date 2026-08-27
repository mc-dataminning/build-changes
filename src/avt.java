import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record avt<T>(aju<? extends ja<T>> a, ajv b) {
   private static final Interner<avt<?>> c = Interners.newWeakInterner();

   @Deprecated
   public avt(aju<? extends ja<T>> a, ajv b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<avt<T>> a(aju<? extends ja<T>> $$0) {
      return ajv.a.xmap($$1 -> a($$0, $$1), avt::b);
   }

   public static <T> Codec<avt<T>> b(aju<? extends ja<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? ajv.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> avt<T> a(aju<? extends ja<T>> $$0, ajv $$1) {
      return (avt<T>)c.intern(new avt<>($$0, $$1));
   }

   public boolean c(aju<? extends ja<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<avt<E>> d(aju<? extends ja<E>> $$0) {
      return this.c($$0) ? Optional.of((avt<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
