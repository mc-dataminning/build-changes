import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eww extends evt {
   private static final Map<kt<?>, eww.a<?>> b = Stream.of(
         new eww.a<>(ku.U, ddt::a),
         new eww.a<>(ku.J, cyt::a),
         new eww.a<>(ku.l, dcc::a),
         new eww.a<>(ku.I, dcc::a),
         new eww.a<>(ku.f, czj::a),
         new eww.a<>(ku.n, cub::a),
         new eww.a<>(ku.m, cub::a),
         new eww.a<>(ku.o, cyw::a),
         new eww.a<>(ku.ab, cwk::a)
      )
      .collect(Collectors.toMap(eww.a::a, $$0 -> (eww.a<?>)$$0));
   private static final Codec<eww.a<?>> c = lz.ao.q().comapFlatMap($$0 -> {
      eww.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lz.ao.b($$0));
   }, eww.a::a);
   public static final MapCodec<eww> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, eww::new)
   );
   private final Map<eww.a<?>, Boolean> d;

   private eww(List<exr> $$0, Map<eww.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cwf a(cwf $$0, eug $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public evv<eww> b() {
      return evw.P;
   }

   static record a<T>(kt<T> a, eww.b<T> b) {
      public void a(cwf $$0, boolean $$1) {
         T $$2 = $$0.a(this.a);
         if ($$2 != null) {
            $$0.b(this.a, this.b.withTooltip($$2, $$1));
         }
      }
   }

   @FunctionalInterface
   interface b<T> {
      T withTooltip(T var1, boolean var2);
   }
}
