import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record avd<T>(ajg<? extends iy<T>> a, ajh b) {
   private static final Interner<avd<?>> c = Interners.newWeakInterner();

   @Deprecated
   public avd(ajg<? extends iy<T>> a, ajh b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<avd<T>> a(ajg<? extends iy<T>> $$0) {
      return ajh.a.xmap($$1 -> a($$0, $$1), avd::b);
   }

   public static <T> Codec<avd<T>> b(ajg<? extends iy<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? ajh.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> avd<T> a(ajg<? extends iy<T>> $$0, ajh $$1) {
      return (avd<T>)c.intern(new avd<>($$0, $$1));
   }

   public boolean c(ajg<? extends iy<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<avd<E>> d(ajg<? extends iy<E>> $$0) {
      return this.c($$0) ? Optional.of((avd<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
