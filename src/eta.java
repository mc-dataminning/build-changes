import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eta extends erw {
   private static final Map<kl<?>, eta.a<?>> b = Stream.of(
         new eta.a<>(km.K, cwv::a),
         new eta.a<>(km.z, cxj::a),
         new eta.a<>(km.k, dah::a),
         new eta.a<>(km.y, dah::a),
         new eta.a<>(km.f, cxy::a),
         new eta.a<>(km.m, csd::a),
         new eta.a<>(km.l, csd::a),
         new eta.a<>(km.n, cxm::a)
      )
      .collect(Collectors.toMap(eta.a::a, $$0 -> (eta.a<?>)$$0));
   private static final Codec<eta.a<?>> c = lp.as.q().comapFlatMap($$0 -> {
      eta.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lp.as.b($$0));
   }, eta.a::a);
   public static final MapCodec<eta> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, eta::new)
   );
   private final Map<eta.a<?>, Boolean> d;

   private eta(List<etu> $$0, Map<eta.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cur a(cur $$0, eqk $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public ery<eta> b() {
      return erz.P;
   }

   static record a<T>(kl<T> a, eta.b<T> b) {
      public void a(cur $$0, boolean $$1) {
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
