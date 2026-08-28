import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eub extends esy {
   private static final Map<kp<?>, eub.a<?>> b = Stream.of(
         new eub.a<>(kq.K, cwv::a),
         new eub.a<>(kq.z, cxi::a),
         new eub.a<>(kq.k, dag::a),
         new eub.a<>(kq.y, dag::a),
         new eub.a<>(kq.f, cxx::a),
         new eub.a<>(kq.m, csa::a),
         new eub.a<>(kq.l, csa::a),
         new eub.a<>(kq.n, cxl::a),
         new eub.a<>(kq.R, cus::a)
      )
      .collect(Collectors.toMap(eub.a::a, $$0 -> (eub.a<?>)$$0));
   private static final Codec<eub.a<?>> c = lt.aq.r().comapFlatMap($$0 -> {
      eub.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lt.aq.b($$0));
   }, eub.a::a);
   public static final MapCodec<eub> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, eub::new)
   );
   private final Map<eub.a<?>, Boolean> d;

   private eub(List<euw> $$0, Map<eub.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cuo a(cuo $$0, erl $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public eta<eub> b() {
      return etb.P;
   }

   static record a<T>(kp<T> a, eub.b<T> b) {
      public void a(cuo $$0, boolean $$1) {
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
