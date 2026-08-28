import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class esw extends ers {
   private static final Map<kl<?>, esw.a<?>> b = Stream.of(
         new esw.a<>(km.J, cwr::a),
         new esw.a<>(km.y, cxf::a),
         new esw.a<>(km.j, dad::a),
         new esw.a<>(km.x, dad::a),
         new esw.a<>(km.e, cxu::a),
         new esw.a<>(km.l, crz::a),
         new esw.a<>(km.k, crz::a),
         new esw.a<>(km.m, cxi::a)
      )
      .collect(Collectors.toMap(esw.a::a, $$0 -> (esw.a<?>)$$0));
   private static final Codec<esw.a<?>> c = lp.as.q().comapFlatMap($$0 -> {
      esw.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lp.as.b($$0));
   }, esw.a::a);
   public static final MapCodec<esw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, esw::new)
   );
   private final Map<esw.a<?>, Boolean> d;

   private esw(List<etq> $$0, Map<esw.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cun a(cun $$0, eqg $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public eru<esw> b() {
      return erv.P;
   }

   static record a<T>(kl<T> a, esw.b<T> b) {
      public void a(cun $$0, boolean $$1) {
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
