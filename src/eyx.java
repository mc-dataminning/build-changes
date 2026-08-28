import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eyx extends exu {
   private static final Map<kt<?>, eyx.a<?>> b = Stream.of(
         new eyx.a<>(ku.U, dfo::a),
         new eyx.a<>(ku.J, czy::a),
         new eyx.a<>(ku.l, ddx::a),
         new eyx.a<>(ku.I, ddx::a),
         new eyx.a<>(ku.f, dao::a),
         new eyx.a<>(ku.n, cvg::a),
         new eyx.a<>(ku.m, cvg::a),
         new eyx.a<>(ku.o, dab::a),
         new eyx.a<>(ku.ab, cxp::a)
      )
      .collect(Collectors.toMap(eyx.a::a, $$0 -> (eyx.a<?>)$$0));
   private static final Codec<eyx.a<?>> c = ma.ao.q().comapFlatMap($$0 -> {
      eyx.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + ma.ao.b($$0));
   }, eyx.a::a);
   public static final MapCodec<eyx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, eyx::new)
   );
   private final Map<eyx.a<?>, Boolean> d;

   private eyx(List<ezs> $$0, Map<eyx.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cxk a(cxk $$0, ewh $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public exw<eyx> b() {
      return exx.P;
   }

   static record a<T>(kt<T> a, eyx.b<T> b) {
      public void a(cxk $$0, boolean $$1) {
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
