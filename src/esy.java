import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class esy extends eru {
   private static final Map<kl<?>, esy.a<?>> b = Stream.of(
         new esy.a<>(km.K, cwt::a),
         new esy.a<>(km.z, cxh::a),
         new esy.a<>(km.k, daf::a),
         new esy.a<>(km.y, daf::a),
         new esy.a<>(km.f, cxw::a),
         new esy.a<>(km.m, csb::a),
         new esy.a<>(km.l, csb::a),
         new esy.a<>(km.n, cxk::a)
      )
      .collect(Collectors.toMap(esy.a::a, $$0 -> (esy.a<?>)$$0));
   private static final Codec<esy.a<?>> c = lp.as.q().comapFlatMap($$0 -> {
      esy.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lp.as.b($$0));
   }, esy.a::a);
   public static final MapCodec<esy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, esy::new)
   );
   private final Map<esy.a<?>, Boolean> d;

   private esy(List<ets> $$0, Map<esy.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cup a(cup $$0, eqi $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public erw<esy> b() {
      return erx.P;
   }

   static record a<T>(kl<T> a, esy.b<T> b) {
      public void a(cup $$0, boolean $$1) {
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
