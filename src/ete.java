import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ete extends esb {
   private static final Map<km<?>, ete.a<?>> b = Stream.of(
         new ete.a<>(kn.K, cwe::a),
         new ete.a<>(kn.z, cwr::a),
         new ete.a<>(kn.k, czp::a),
         new ete.a<>(kn.y, czp::a),
         new ete.a<>(kn.f, cxg::a),
         new ete.a<>(kn.m, crm::a),
         new ete.a<>(kn.l, crm::a),
         new ete.a<>(kn.n, cwu::a)
      )
      .collect(Collectors.toMap(ete.a::a, $$0 -> (ete.a<?>)$$0));
   private static final Codec<ete.a<?>> c = lq.aq.r().comapFlatMap($$0 -> {
      ete.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lq.aq.b($$0));
   }, ete.a::a);
   public static final MapCodec<ete> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, ete::new)
   );
   private final Map<ete.a<?>, Boolean> d;

   private ete(List<etz> $$0, Map<ete.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cua a(cua $$0, eqo $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public esd<ete> b() {
      return ese.P;
   }

   static record a<T>(km<T> a, ete.b<T> b) {
      public void a(cua $$0, boolean $$1) {
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
