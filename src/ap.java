import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record ap<T extends as>(ar<T> b, T c) {
   private static final MapCodec<ap<?>> d = azd.a("trigger", "conditions", (Codec<ar<T>>)ao.a, ap::a, ap::a);
   public static final Codec<ap<?>> a = d.codec();

   private static <T extends as> Codec<ap<T>> a(ar<T> $$0) {
      return $$0.a().xmap($$1 -> new ap<>($$0, (T)$$1), ap::b);
   }

   public ar<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
