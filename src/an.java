import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record an<T extends aq>(ap<T> b, T c) {
   private static final MapCodec<an<?>> d = atq.a("trigger", "conditions", (Codec<ap<T>>)am.a, an::a, an::a);
   public static final Codec<an<?>> a = d.codec();

   private static <T extends aq> Codec<an<T>> a(ap<T> $$0) {
      return $$0.a().xmap($$1 -> new an<>($$0, (T)$$1), an::b);
   }

   public ap<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
