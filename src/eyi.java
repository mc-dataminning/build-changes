import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eyi extends exf {
   private static final Map<ku<?>, eyi.a<?>> b = Stream.of(
         new eyi.a<>(kv.U, dex::a),
         new eyi.a<>(kv.J, cze::a),
         new eyi.a<>(kv.l, ddg::a),
         new eyi.a<>(kv.I, ddg::a),
         new eyi.a<>(kv.f, czu::a),
         new eyi.a<>(kv.n, cum::a),
         new eyi.a<>(kv.m, cum::a),
         new eyi.a<>(kv.o, czh::a),
         new eyi.a<>(kv.ab, cwv::a)
      )
      .collect(Collectors.toMap(eyi.a::a, $$0 -> (eyi.a<?>)$$0));
   private static final Codec<eyi.a<?>> c = mb.ao.q().comapFlatMap($$0 -> {
      eyi.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + mb.ao.b($$0));
   }, eyi.a::a);
   public static final MapCodec<eyi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, eyi::new)
   );
   private final Map<eyi.a<?>, Boolean> d;

   private eyi(List<ezb> $$0, Map<eyi.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cwq a(cwq $$0, evs $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public exh<eyi> b() {
      return exi.P;
   }

   static record a<T>(ku<T> a, eyi.b<T> b) {
      public void a(cwq $$0, boolean $$1) {
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
