import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eyf extends exc {
   private static final Map<ku<?>, eyf.a<?>> b = Stream.of(
         new eyf.a<>(kv.U, deu::a),
         new eyf.a<>(kv.J, czb::a),
         new eyf.a<>(kv.l, ddd::a),
         new eyf.a<>(kv.I, ddd::a),
         new eyf.a<>(kv.f, czr::a),
         new eyf.a<>(kv.n, cuj::a),
         new eyf.a<>(kv.m, cuj::a),
         new eyf.a<>(kv.o, cze::a),
         new eyf.a<>(kv.ab, cws::a)
      )
      .collect(Collectors.toMap(eyf.a::a, $$0 -> (eyf.a<?>)$$0));
   private static final Codec<eyf.a<?>> c = mb.ao.q().comapFlatMap($$0 -> {
      eyf.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + mb.ao.b($$0));
   }, eyf.a::a);
   public static final MapCodec<eyf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, eyf::new)
   );
   private final Map<eyf.a<?>, Boolean> d;

   private eyf(List<eyy> $$0, Map<eyf.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cwn a(cwn $$0, evp $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public exe<eyf> b() {
      return exf.P;
   }

   static record a<T>(ku<T> a, eyf.b<T> b) {
      public void a(cwn $$0, boolean $$1) {
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
