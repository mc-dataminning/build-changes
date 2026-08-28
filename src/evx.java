import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class evx extends euu {
   private static final Map<kq<?>, evx.a<?>> b = Stream.of(
         new evx.a<>(kr.P, cxr::a),
         new evx.a<>(kr.E, cyh::a),
         new evx.a<>(kr.k, dbq::a),
         new evx.a<>(kr.D, dbq::a),
         new evx.a<>(kr.f, cyx::a),
         new evx.a<>(kr.m, ctf::a),
         new evx.a<>(kr.l, ctf::a),
         new evx.a<>(kr.n, cyk::a),
         new evx.a<>(kr.W, cvu::a)
      )
      .collect(Collectors.toMap(evx.a::a, $$0 -> (evx.a<?>)$$0));
   private static final Codec<evx.a<?>> c = lu.ap.q().comapFlatMap($$0 -> {
      evx.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lu.ap.b($$0));
   }, evx.a::a);
   public static final MapCodec<evx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, evx::new)
   );
   private final Map<evx.a<?>, Boolean> d;

   private evx(List<ews> $$0, Map<evx.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cvp a(cvp $$0, eth $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public euw<evx> b() {
      return eux.P;
   }

   static record a<T>(kq<T> a, evx.b<T> b) {
      public void a(cvp $$0, boolean $$1) {
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
