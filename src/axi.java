import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record axi<T>(ala<? extends ka<T>> a, alb b) {
   private static final Interner<axi<?>> c = Interners.newWeakInterner();

   @Deprecated
   public axi(ala<? extends ka<T>> a, alb b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<axi<T>> a(ala<? extends ka<T>> $$0) {
      return alb.a.xmap($$1 -> a($$0, $$1), axi::b);
   }

   public static <T> Codec<axi<T>> b(ala<? extends ka<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? alb.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> axi<T> a(ala<? extends ka<T>> $$0, alb $$1) {
      return (axi<T>)c.intern(new axi<>($$0, $$1));
   }

   public boolean c(ala<? extends ka<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<axi<E>> d(ala<? extends ka<E>> $$0) {
      return this.c($$0) ? Optional.of((axi<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
