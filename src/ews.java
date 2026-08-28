import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ews extends evp {
   private static final Map<kt<?>, ews.a<?>> b = Stream.of(
         new ews.a<>(ku.U, ddp::a),
         new ews.a<>(ku.J, cyp::a),
         new ews.a<>(ku.l, dby::a),
         new ews.a<>(ku.I, dby::a),
         new ews.a<>(ku.f, czf::a),
         new ews.a<>(ku.n, ctx::a),
         new ews.a<>(ku.m, ctx::a),
         new ews.a<>(ku.o, cys::a),
         new ews.a<>(ku.ab, cwg::a)
      )
      .collect(Collectors.toMap(ews.a::a, $$0 -> (ews.a<?>)$$0));
   private static final Codec<ews.a<?>> c = ly.ao.q().comapFlatMap($$0 -> {
      ews.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + ly.ao.b($$0));
   }, ews.a::a);
   public static final MapCodec<ews> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, ews::new)
   );
   private final Map<ews.a<?>, Boolean> d;

   private ews(List<exn> $$0, Map<ews.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cwb a(cwb $$0, euc $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public evr<ews> b() {
      return evs.P;
   }

   static record a<T>(kt<T> a, ews.b<T> b) {
      public void a(cwb $$0, boolean $$1) {
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
