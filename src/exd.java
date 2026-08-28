import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exd extends ewa {
   private static final Map<kt<?>, exd.a<?>> b = Stream.of(
         new exd.a<>(ku.U, dea::a),
         new exd.a<>(ku.J, cza::a),
         new exd.a<>(ku.l, dcj::a),
         new exd.a<>(ku.I, dcj::a),
         new exd.a<>(ku.f, czq::a),
         new exd.a<>(ku.n, cui::a),
         new exd.a<>(ku.m, cui::a),
         new exd.a<>(ku.o, czd::a),
         new exd.a<>(ku.ab, cwr::a)
      )
      .collect(Collectors.toMap(exd.a::a, $$0 -> (exd.a<?>)$$0));
   private static final Codec<exd.a<?>> c = lz.ao.q().comapFlatMap($$0 -> {
      exd.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lz.ao.b($$0));
   }, exd.a::a);
   public static final MapCodec<exd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, exd::new)
   );
   private final Map<exd.a<?>, Boolean> d;

   private exd(List<exy> $$0, Map<exd.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cwm a(cwm $$0, eun $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public ewc<exd> b() {
      return ewd.P;
   }

   static record a<T>(kt<T> a, exd.b<T> b) {
      public void a(cwm $$0, boolean $$1) {
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
