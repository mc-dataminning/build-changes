import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record aq<T extends at>(as<T> b, T c) {
   private static final MapCodec<aq<?>> d = ayi.a("trigger", "conditions", (Codec<as<T>>)ap.a, aq::a, aq::a);
   public static final Codec<aq<?>> a = d.codec();

   private static <T extends at> Codec<aq<T>> a(as<T> $$0) {
      return $$0.a().xmap($$1 -> new aq<>($$0, (T)$$1), aq::b);
   }

   public as<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
