import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class esz extends erv {
   private static final Map<kl<?>, esz.a<?>> b = Stream.of(
         new esz.a<>(km.K, cwu::a),
         new esz.a<>(km.z, cxi::a),
         new esz.a<>(km.k, dag::a),
         new esz.a<>(km.y, dag::a),
         new esz.a<>(km.f, cxx::a),
         new esz.a<>(km.m, csc::a),
         new esz.a<>(km.l, csc::a),
         new esz.a<>(km.n, cxl::a)
      )
      .collect(Collectors.toMap(esz.a::a, $$0 -> (esz.a<?>)$$0));
   private static final Codec<esz.a<?>> c = lp.as.q().comapFlatMap($$0 -> {
      esz.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lp.as.b($$0));
   }, esz.a::a);
   public static final MapCodec<esz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, esz::new)
   );
   private final Map<esz.a<?>, Boolean> d;

   private esz(List<ett> $$0, Map<esz.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cuq a(cuq $$0, eqj $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public erx<esz> b() {
      return ery.P;
   }

   static record a<T>(kl<T> a, esz.b<T> b) {
      public void a(cuq $$0, boolean $$1) {
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
