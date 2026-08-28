import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class esx extends ert {
   private static final Map<kl<?>, esx.a<?>> b = Stream.of(
         new esx.a<>(km.K, cws::a),
         new esx.a<>(km.z, cxg::a),
         new esx.a<>(km.k, dae::a),
         new esx.a<>(km.y, dae::a),
         new esx.a<>(km.f, cxv::a),
         new esx.a<>(km.m, csa::a),
         new esx.a<>(km.l, csa::a),
         new esx.a<>(km.n, cxj::a)
      )
      .collect(Collectors.toMap(esx.a::a, $$0 -> (esx.a<?>)$$0));
   private static final Codec<esx.a<?>> c = lp.as.q().comapFlatMap($$0 -> {
      esx.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lp.as.b($$0));
   }, esx.a::a);
   public static final MapCodec<esx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, esx::new)
   );
   private final Map<esx.a<?>, Boolean> d;

   private esx(List<etr> $$0, Map<esx.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cuo a(cuo $$0, eqh $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public erv<esx> b() {
      return erw.P;
   }

   static record a<T>(kl<T> a, esx.b<T> b) {
      public void a(cuo $$0, boolean $$1) {
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
