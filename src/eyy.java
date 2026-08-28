import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eyy extends exv {
   private static final Map<kt<?>, eyy.a<?>> b = Stream.of(
         new eyy.a<>(ku.U, dfn::a),
         new eyy.a<>(ku.J, czu::a),
         new eyy.a<>(ku.l, ddw::a),
         new eyy.a<>(ku.I, ddw::a),
         new eyy.a<>(ku.f, dak::a),
         new eyy.a<>(ku.n, cvc::a),
         new eyy.a<>(ku.m, cvc::a),
         new eyy.a<>(ku.o, czx::a),
         new eyy.a<>(ku.ab, cxl::a)
      )
      .collect(Collectors.toMap(eyy.a::a, $$0 -> (eyy.a<?>)$$0));
   private static final Codec<eyy.a<?>> c = ma.ao.q().comapFlatMap($$0 -> {
      eyy.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + ma.ao.b($$0));
   }, eyy.a::a);
   public static final MapCodec<eyy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, eyy::new)
   );
   private final Map<eyy.a<?>, Boolean> d;

   private eyy(List<ezr> $$0, Map<eyy.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cxg a(cxg $$0, ewi $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public exx<eyy> b() {
      return exy.P;
   }

   static record a<T>(kt<T> a, eyy.b<T> b) {
      public void a(cxg $$0, boolean $$1) {
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
