import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ewm extends evj {
   private static final Map<ks<?>, ewm.a<?>> b = Stream.of(
         new ewm.a<>(kt.T, ddj::a),
         new ewm.a<>(kt.I, cyj::a),
         new ewm.a<>(kt.l, dbs::a),
         new ewm.a<>(kt.H, dbs::a),
         new ewm.a<>(kt.f, cyz::a),
         new ewm.a<>(kt.n, cts::a),
         new ewm.a<>(kt.m, cts::a),
         new ewm.a<>(kt.o, cym::a),
         new ewm.a<>(kt.aa, cwc::a)
      )
      .collect(Collectors.toMap(ewm.a::a, $$0 -> (ewm.a<?>)$$0));
   private static final Codec<ewm.a<?>> c = lx.ao.q().comapFlatMap($$0 -> {
      ewm.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lx.ao.b($$0));
   }, ewm.a::a);
   public static final MapCodec<ewm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, ewm::new)
   );
   private final Map<ewm.a<?>, Boolean> d;

   private ewm(List<exh> $$0, Map<ewm.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cvx a(cvx $$0, etw $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public evl<ewm> b() {
      return evm.P;
   }

   static record a<T>(ks<T> a, ewm.b<T> b) {
      public void a(cvx $$0, boolean $$1) {
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
