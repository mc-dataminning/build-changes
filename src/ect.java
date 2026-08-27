import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ect {
   public static final Codec<ect> a = awe.b(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(ajg.a(kj.aO), dqp.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ect::new)),
      ect::a
   );
   public static final Codec<il<ect>> b = ajd.a(kj.aL, a);
   private final Map<ajg<dqp>, dqp> c;

   public ect(Map<ajg<dqp>, dqp> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<ajg<dqp>, dqp> c() {
      Builder<ajg<dqp>, dqp> $$0 = ImmutableMap.builder();
      dtj.a(this.c.keySet().stream()).forEach($$1 -> {
         dqp $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dtj a() {
      return new dtj(this.c());
   }

   public Optional<dqp> b() {
      return Optional.ofNullable(this.c.get(dqp.b));
   }

   private static DataResult<ect> a(ect $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
