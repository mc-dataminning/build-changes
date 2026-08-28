import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eze extends eyb {
   private static final Map<kt<?>, eze.a<?>> b = Stream.of(
         new eze.a<>(ku.U, dfv::a),
         new eze.a<>(ku.J, dac::a),
         new eze.a<>(ku.l, dee::a),
         new eze.a<>(ku.I, dee::a),
         new eze.a<>(ku.f, das::a),
         new eze.a<>(ku.n, cvk::a),
         new eze.a<>(ku.m, cvk::a),
         new eze.a<>(ku.o, daf::a),
         new eze.a<>(ku.ab, cxt::a)
      )
      .collect(Collectors.toMap(eze.a::a, $$0 -> (eze.a<?>)$$0));
   private static final Codec<eze.a<?>> c = ma.ao.q().comapFlatMap($$0 -> {
      eze.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + ma.ao.b($$0));
   }, eze.a::a);
   public static final MapCodec<eze> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, eze::new)
   );
   private final Map<eze.a<?>, Boolean> d;

   private eze(List<ezx> $$0, Map<eze.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cxo a(cxo $$0, ewo $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public eyd<eze> b() {
      return eye.P;
   }

   static record a<T>(kt<T> a, eze.b<T> b) {
      public void a(cxo $$0, boolean $$1) {
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
