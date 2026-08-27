import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ert extends eqs {
   private static final Map<ka<?>, ert.a<?>> b = Stream.of(
         new ert.a<>(kb.J, cvu::a),
         new ert.a<>(kb.y, cwi::a),
         new ert.a<>(kb.j, czg::a),
         new ert.a<>(kb.x, czg::a),
         new ert.a<>(kb.e, cwx::a),
         new ert.a<>(kb.l, crc::a),
         new ert.a<>(kb.k, crc::a),
         new ert.a<>(kb.m, cwl::a)
      )
      .collect(Collectors.toMap(ert.a::a, $$0 -> (ert.a<?>)$$0));
   private static final Codec<ert.a<?>> c = le.as.q().comapFlatMap($$0 -> {
      ert.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + le.as.b($$0));
   }, ert.a::a);
   public static final MapCodec<ert> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, ert::new)
   );
   private final Map<ert.a<?>, Boolean> d;

   private ert(List<esn> $$0, Map<ert.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected ctq a(ctq $$0, eph $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public equ b() {
      return eqv.M;
   }

   static record a<T>(ka<T> a, ert.b<T> b) {
      public void a(ctq $$0, boolean $$1) {
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
