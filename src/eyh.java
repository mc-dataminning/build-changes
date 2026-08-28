import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eyh extends exe {
   private static final Map<ku<?>, eyh.a<?>> b = Stream.of(
         new eyh.a<>(kv.U, dew::a),
         new eyh.a<>(kv.J, czd::a),
         new eyh.a<>(kv.l, ddf::a),
         new eyh.a<>(kv.I, ddf::a),
         new eyh.a<>(kv.f, czt::a),
         new eyh.a<>(kv.n, cul::a),
         new eyh.a<>(kv.m, cul::a),
         new eyh.a<>(kv.o, czg::a),
         new eyh.a<>(kv.ab, cwu::a)
      )
      .collect(Collectors.toMap(eyh.a::a, $$0 -> (eyh.a<?>)$$0));
   private static final Codec<eyh.a<?>> c = mb.ao.q().comapFlatMap($$0 -> {
      eyh.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + mb.ao.b($$0));
   }, eyh.a::a);
   public static final MapCodec<eyh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, eyh::new)
   );
   private final Map<eyh.a<?>, Boolean> d;

   private eyh(List<eza> $$0, Map<eyh.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cwp a(cwp $$0, evr $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public exg<eyh> b() {
      return exh.P;
   }

   static record a<T>(ku<T> a, eyh.b<T> b) {
      public void a(cwp $$0, boolean $$1) {
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
