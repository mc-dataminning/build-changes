import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class etk extends esh {
   private static final Map<km<?>, etk.a<?>> b = Stream.of(
         new etk.a<>(kn.K, cwg::a),
         new etk.a<>(kn.z, cwt::a),
         new etk.a<>(kn.k, czr::a),
         new etk.a<>(kn.y, czr::a),
         new etk.a<>(kn.f, cxi::a),
         new etk.a<>(kn.m, crp::a),
         new etk.a<>(kn.l, crp::a),
         new etk.a<>(kn.n, cww::a)
      )
      .collect(Collectors.toMap(etk.a::a, $$0 -> (etk.a<?>)$$0));
   private static final Codec<etk.a<?>> c = lq.aq.r().comapFlatMap($$0 -> {
      etk.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lq.aq.b($$0));
   }, etk.a::a);
   public static final MapCodec<etk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, etk::new)
   );
   private final Map<etk.a<?>, Boolean> d;

   private etk(List<euf> $$0, Map<etk.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cuc a(cuc $$0, equ $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public esj<etk> b() {
      return esk.P;
   }

   static record a<T>(km<T> a, etk.b<T> b) {
      public void a(cuc $$0, boolean $$1) {
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
