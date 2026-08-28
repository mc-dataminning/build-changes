import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class euf extends etc {
   private static final Map<kp<?>, euf.a<?>> b = Stream.of(
         new euf.a<>(kq.K, cwx::a),
         new euf.a<>(kq.z, cxk::a),
         new euf.a<>(kq.k, dai::a),
         new euf.a<>(kq.y, dai::a),
         new euf.a<>(kq.f, cxz::a),
         new euf.a<>(kq.m, csc::a),
         new euf.a<>(kq.l, csc::a),
         new euf.a<>(kq.n, cxn::a),
         new euf.a<>(kq.R, cuu::a)
      )
      .collect(Collectors.toMap(euf.a::a, $$0 -> (euf.a<?>)$$0));
   private static final Codec<euf.a<?>> c = lt.aq.r().comapFlatMap($$0 -> {
      euf.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lt.aq.b($$0));
   }, euf.a::a);
   public static final MapCodec<euf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, euf::new)
   );
   private final Map<euf.a<?>, Boolean> d;

   private euf(List<eva> $$0, Map<euf.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cuq a(cuq $$0, erp $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public ete<euf> b() {
      return etf.P;
   }

   static record a<T>(kp<T> a, euf.b<T> b) {
      public void a(cuq $$0, boolean $$1) {
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
