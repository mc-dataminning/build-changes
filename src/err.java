import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class err extends eqq {
   private static final Map<ka<?>, err.a<?>> b = Stream.of(
         new err.a<>(kb.J, cvs::a),
         new err.a<>(kb.y, cwg::a),
         new err.a<>(kb.j, cze::a),
         new err.a<>(kb.x, cze::a),
         new err.a<>(kb.e, cwv::a),
         new err.a<>(kb.l, cra::a),
         new err.a<>(kb.k, cra::a),
         new err.a<>(kb.m, cwj::a)
      )
      .collect(Collectors.toMap(err.a::a, $$0 -> (err.a<?>)$$0));
   private static final Codec<err.a<?>> c = le.as.q().comapFlatMap($$0 -> {
      err.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + le.as.b($$0));
   }, err.a::a);
   public static final MapCodec<err> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, err::new)
   );
   private final Map<err.a<?>, Boolean> d;

   private err(List<esl> $$0, Map<err.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cto a(cto $$0, epf $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public eqs b() {
      return eqt.M;
   }

   static record a<T>(ka<T> a, err.b<T> b) {
      public void a(cto $$0, boolean $$1) {
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
