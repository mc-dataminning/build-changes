import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record ao<T extends ar>(aq<T> b, T c) {
   private static final MapCodec<ao<?>> d = ayo.a("trigger", "conditions", (Codec<aq<T>>)an.a, ao::a, ao::a);
   public static final Codec<ao<?>> a = d.codec();

   private static <T extends ar> Codec<ao<T>> a(aq<T> $$0) {
      return $$0.a().xmap($$1 -> new ao<>($$0, (T)$$1), ao::b);
   }

   public aq<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
