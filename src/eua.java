import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eua extends eta {
   private static final Map<kd<?>, eua.a<?>> b = Stream.of(
         new eua.a<>(ke.I, cwu::a),
         new eua.a<>(ke.x, cxi::a),
         new eua.a<>(ke.i, dai::a),
         new eua.a<>(ke.w, dai::a),
         new eua.a<>(ke.e, cxy::a),
         new eua.a<>(ke.k, crq::a),
         new eua.a<>(ke.j, crq::a),
         new eua.a<>(ke.l, cxl::a)
      )
      .collect(Collectors.toMap(eua.a::a, $$0 -> (eua.a<?>)$$0));
   private static final Codec<eua.a<?>> c = lh.as.q().comapFlatMap($$0 -> {
      eua.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lh.as.b($$0));
   }, eua.a::a);
   public static final Codec<eua> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, eua::new)
   );
   private final Map<eua.a<?>, Boolean> d;

   private eua(List<euu> $$0, Map<eua.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cuh a(cuh $$0, erp $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public etc b() {
      return etd.M;
   }

   static record a<T>(kd<T> a, eua.b<T> b) {
      public void a(cuh $$0, boolean $$1) {
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
