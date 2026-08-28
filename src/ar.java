import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record ar<T extends au>(at<T> b, T c) {
   private static final MapCodec<ar<?>> d = ayy.a("trigger", "conditions", (Codec<at<T>>)aq.a, ar::a, ar::a);
   public static final Codec<ar<?>> a = d.codec();

   private static <T extends au> Codec<ar<T>> a(at<T> $$0) {
      return $$0.a().xmap($$1 -> new ar<>($$0, (T)$$1), ar::b);
   }

   public at<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
