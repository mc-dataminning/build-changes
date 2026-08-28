import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fab extends eyy {
   private static final Map<kw<?>, fab.a<?>> b = Stream.of(
         new fab.a<>(kx.W, dge::a),
         new fab.a<>(kx.K, daj::a),
         new fab.a<>(kx.l, den::a),
         new fab.a<>(kx.J, den::a),
         new fab.a<>(kx.f, daz::a),
         new fab.a<>(kx.n, cvw::a),
         new fab.a<>(kx.m, cvw::a),
         new fab.a<>(kx.o, dam::a),
         new fab.a<>(kx.ad, cyd::a)
      )
      .collect(Collectors.toMap(fab.a::a, $$0 -> (fab.a<?>)$$0));
   private static final Codec<fab.a<?>> c = md.ao.q().comapFlatMap($$0 -> {
      fab.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + md.ao.b($$0));
   }, fab.a::a);
   public static final MapCodec<fab> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, fab::new)
   );
   private final Map<fab.a<?>, Boolean> d;

   private fab(List<fau> $$0, Map<fab.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cxy a(cxy $$0, exl $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public eza<fab> b() {
      return ezb.P;
   }

   static record a<T>(kw<T> a, fab.b<T> b) {
      public void a(cxy $$0, boolean $$1) {
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
