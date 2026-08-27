import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class br<V> {
   private final Function<bii, Optional<V>> a;
   private final bp.a b;

   public static <V> br<V> a(hr<V> $$0, Function<bii, Optional<V>> $$1) {
      return new br<>($$0.q(), $$1);
   }

   public static <V> br<V> a(Codec<V> $$0, Function<bii, Optional<V>> $$1) {
      return new br<>($$0, $$1);
   }

   private br(Codec<V> $$0, Function<bii, Optional<V>> $$1) {
      this.a = $$1;
      MapCodec<br.a<V>> $$2 = RecordCodecBuilder.mapCodec($$1x -> $$1x.group($$0.fieldOf("variant").forGetter(br.a::c)).apply($$1x, this::a));
      this.b = new bp.a($$2);
   }

   public bp.a a() {
      return this.b;
   }

   public br.a<V> a(V $$0) {
      return new br.a<>(this.b, this.a, $$0);
   }

   public static record a<V>(bp.a b, Function<bii, Optional<V>> c, V d) implements bp {
      @Override
      public boolean a(bii $$0, akk $$1, @Nullable ehd $$2) {
         return this.c.apply($$0).filter($$0x -> $$0x.equals(this.d)).isPresent();
      }

      @Override
      public bp.a a() {
         return this.b;
      }

      public Function<bii, Optional<V>> b() {
         return this.c;
      }

      public V c() {
         return this.d;
      }
   }
}
