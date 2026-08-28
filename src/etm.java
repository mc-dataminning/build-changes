import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class etm extends esj {
   private static final Map<km<?>, etm.a<?>> b = Stream.of(
         new etm.a<>(kn.K, cwh::a),
         new etm.a<>(kn.z, cwu::a),
         new etm.a<>(kn.k, czs::a),
         new etm.a<>(kn.y, czs::a),
         new etm.a<>(kn.f, cxj::a),
         new etm.a<>(kn.m, crq::a),
         new etm.a<>(kn.l, crq::a),
         new etm.a<>(kn.n, cwx::a)
      )
      .collect(Collectors.toMap(etm.a::a, $$0 -> (etm.a<?>)$$0));
   private static final Codec<etm.a<?>> c = lq.aq.r().comapFlatMap($$0 -> {
      etm.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lq.aq.b($$0));
   }, etm.a::a);
   public static final MapCodec<etm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, etm::new)
   );
   private final Map<etm.a<?>, Boolean> d;

   private etm(List<euh> $$0, Map<etm.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cud a(cud $$0, eqw $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public esl<etm> b() {
      return esm.P;
   }

   static record a<T>(km<T> a, etm.b<T> b) {
      public void a(cud $$0, boolean $$1) {
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
