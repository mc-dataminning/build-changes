import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eyg extends exd {
   private static final Map<ku<?>, eyg.a<?>> b = Stream.of(
         new eyg.a<>(kv.U, dev::a),
         new eyg.a<>(kv.J, czc::a),
         new eyg.a<>(kv.l, dde::a),
         new eyg.a<>(kv.I, dde::a),
         new eyg.a<>(kv.f, czs::a),
         new eyg.a<>(kv.n, cuk::a),
         new eyg.a<>(kv.m, cuk::a),
         new eyg.a<>(kv.o, czf::a),
         new eyg.a<>(kv.ab, cwt::a)
      )
      .collect(Collectors.toMap(eyg.a::a, $$0 -> (eyg.a<?>)$$0));
   private static final Codec<eyg.a<?>> c = mb.ao.q().comapFlatMap($$0 -> {
      eyg.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + mb.ao.b($$0));
   }, eyg.a::a);
   public static final MapCodec<eyg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, eyg::new)
   );
   private final Map<eyg.a<?>, Boolean> d;

   private eyg(List<eyz> $$0, Map<eyg.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cwo a(cwo $$0, evq $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public exf<eyg> b() {
      return exg.P;
   }

   static record a<T>(ku<T> a, eyg.b<T> b) {
      public void a(cwo $$0, boolean $$1) {
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
