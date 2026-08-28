import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record axb<T>(ala<? extends jv<T>> a, alb b) {
   private static final Interner<axb<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axb(ala<? extends jv<T>> a, alb b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axb<T>> a(ala<? extends jv<T>> $$0) {
      return alb.a.xmap($$1 -> a($$0, $$1), axb::b);
   }

   public static <T> Codec<axb<T>> b(ala<? extends jv<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? alb.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> axb<T> a(ala<? extends jv<T>> $$0, alb $$1) {
      return (axb<T>)c.intern(new axb<>($$0, $$1));
   }

   public boolean c(ala<? extends jv<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axb<E>> d(ala<? extends jv<E>> $$0) {
      return this.c($$0) ? Optional.of((axb<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
