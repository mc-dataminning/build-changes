import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class euh extends ete {
   private static final Map<kp<?>, euh.a<?>> b = Stream.of(
         new euh.a<>(kq.K, cwx::a),
         new euh.a<>(kq.z, cxk::a),
         new euh.a<>(kq.k, dai::a),
         new euh.a<>(kq.y, dai::a),
         new euh.a<>(kq.f, cxz::a),
         new euh.a<>(kq.m, csc::a),
         new euh.a<>(kq.l, csc::a),
         new euh.a<>(kq.n, cxn::a),
         new euh.a<>(kq.R, cuu::a)
      )
      .collect(Collectors.toMap(euh.a::a, $$0 -> (euh.a<?>)$$0));
   private static final Codec<euh.a<?>> c = lt.aq.r().comapFlatMap($$0 -> {
      euh.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lt.aq.b($$0));
   }, euh.a::a);
   public static final MapCodec<euh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, euh::new)
   );
   private final Map<euh.a<?>, Boolean> d;

   private euh(List<evc> $$0, Map<euh.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cuq a(cuq $$0, err $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public etg<euh> b() {
      return eth.P;
   }

   static record a<T>(kp<T> a, euh.b<T> b) {
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
