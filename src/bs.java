import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bs<V> {
   private final Function<blu, Optional<V>> a;
   private final bq.a b;

   public static <V> bs<V> a(it<V> $$0, Function<blu, Optional<V>> $$1) {
      return new bs<>($$0.q(), $$1);
   }

   public static <V> bs<V> a(Codec<V> $$0, Function<blu, Optional<V>> $$1) {
      return new bs<>($$0, $$1);
   }

   private bs(Codec<V> $$0, Function<blu, Optional<V>> $$1) {
      this.a = $$1;
      MapCodec<bs.a<V>> $$2 = RecordCodecBuilder.mapCodec($$1x -> $$1x.group($$0.fieldOf("variant").forGetter(bs.a::c)).apply($$1x, this::a));
      this.b = new bq.a($$2);
   }

   public bq.a a() {
      return this.b;
   }

   public bs.a<V> a(V $$0) {
      return new bs.a<>(this.b, this.a, $$0);
   }

   public static record a<V>(bq.a b, Function<blu, Optional<V>> c, V d) implements bq {
      @Override
      public boolean a(blu $$0, and $$1, @Nullable els $$2) {
         return this.c.apply($$0).filter($$0x -> $$0x.equals(this.d)).isPresent();
      }

      @Override
      public bq.a a() {
         return this.b;
      }

      public Function<blu, Optional<V>> b() {
         return this.c;
      }

      public V c() {
         return this.d;
      }
   }
}
