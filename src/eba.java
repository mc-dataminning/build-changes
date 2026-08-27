import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eba {
   public static final Codec<eba> a = avq.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(aix.a(kg.aN), dow.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eba::new)),
      eba::a
   );
   public static final Codec<ij<eba>> b = aiu.a(kg.aK, a);
   private final Map<aix<dow>, dow> c;

   public eba(Map<aix<dow>, dow> $$0) {
      this.c = $$0;
   }

   private iv<dow> c() {
      je<dow> $$0 = new ir<>(kg.aN, Lifecycle.experimental());
      drq.a(this.c.keySet().stream()).forEach($$1 -> {
         dow $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((aix<dow>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public drq a() {
      return new drq(this.c());
   }

   public Optional<dow> b() {
      return Optional.ofNullable(this.c.get(dow.b));
   }

   private static DataResult<eba> a(eba $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
