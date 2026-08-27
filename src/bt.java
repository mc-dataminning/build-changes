import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bt<V> {
   private final Function<bkv, Optional<V>> a;
   private final br.a b;

   public static <V> bt<V> a(is<V> $$0, Function<bkv, Optional<V>> $$1) {
      return new bt<>($$0.q(), $$1);
   }

   public static <V> bt<V> a(Codec<V> $$0, Function<bkv, Optional<V>> $$1) {
      return new bt<>($$0, $$1);
   }

   private bt(Codec<V> $$0, Function<bkv, Optional<V>> $$1) {
      this.a = $$1;
      MapCodec<bt.a<V>> $$2 = RecordCodecBuilder.mapCodec($$1x -> $$1x.group($$0.fieldOf("variant").forGetter(bt.a::c)).apply($$1x, this::a));
      this.b = new br.a($$2);
   }

   public br.a a() {
      return this.b;
   }

   public bt.a<V> a(V $$0) {
      return new bt.a<>(this.b, this.a, $$0);
   }

   public static record a<V>(br.a b, Function<bkv, Optional<V>> c, V d) implements br {
      @Override
      public boolean a(bkv $$0, ami $$1, @Nullable ejz $$2) {
         return this.c.apply($$0).filter($$0x -> $$0x.equals(this.d)).isPresent();
      }

      @Override
      public br.a a() {
         return this.b;
      }

      public Function<bkv, Optional<V>> b() {
         return this.c;
      }

      public V c() {
         return this.d;
      }
   }
}
