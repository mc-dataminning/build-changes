import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ezf extends eyc {
   private static final Map<kt<?>, ezf.a<?>> b = Stream.of(
         new ezf.a<>(ku.U, dfw::a),
         new ezf.a<>(ku.J, dad::a),
         new ezf.a<>(ku.l, def::a),
         new ezf.a<>(ku.I, def::a),
         new ezf.a<>(ku.f, dat::a),
         new ezf.a<>(ku.n, cvl::a),
         new ezf.a<>(ku.m, cvl::a),
         new ezf.a<>(ku.o, dag::a),
         new ezf.a<>(ku.ab, cxu::a)
      )
      .collect(Collectors.toMap(ezf.a::a, $$0 -> (ezf.a<?>)$$0));
   private static final Codec<ezf.a<?>> c = ma.ao.q().comapFlatMap($$0 -> {
      ezf.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + ma.ao.b($$0));
   }, ezf.a::a);
   public static final MapCodec<ezf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, ezf::new)
   );
   private final Map<ezf.a<?>, Boolean> d;

   private ezf(List<ezy> $$0, Map<ezf.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cxp a(cxp $$0, ewp $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public eye<ezf> b() {
      return eyf.P;
   }

   static record a<T>(kt<T> a, ezf.b<T> b) {
      public void a(cxp $$0, boolean $$1) {
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
