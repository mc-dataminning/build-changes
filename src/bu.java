import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bu<V> {
   private final Function<bow, Optional<V>> a;
   private final bs.a b;

   public static <V> bu<V> a(iy<V> $$0, Function<bow, Optional<V>> $$1) {
      return new bu<>($$0.q(), $$1);
   }

   public static <V> bu<V> a(Codec<V> $$0, Function<bow, Optional<V>> $$1) {
      return new bu<>($$0, $$1);
   }

   private bu(Codec<V> $$0, Function<bow, Optional<V>> $$1) {
      this.a = $$1;
      MapCodec<bu.a<V>> $$2 = RecordCodecBuilder.mapCodec($$1x -> $$1x.group($$0.fieldOf("variant").forGetter(bu.a::c)).apply($$1x, this::a));
      this.b = new bs.a($$2);
   }

   public bs.a a() {
      return this.b;
   }

   public bu.a<V> a(V $$0) {
      return new bu.a<>(this.b, this.a, $$0);
   }

   public static record a<V>(bs.a b, Function<bow, Optional<V>> c, V d) implements bs {
      @Override
      public boolean a(bow $$0, apf $$1, @Nullable epr $$2) {
         return this.c.apply($$0).filter($$0x -> $$0x.equals(this.d)).isPresent();
      }

      @Override
      public bs.a a() {
         return this.b;
      }

      public Function<bow, Optional<V>> b() {
         return this.c;
      }

      public V c() {
         return this.d;
      }
   }
}
