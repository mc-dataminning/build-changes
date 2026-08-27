import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ecr {
   public static final Codec<ecr> a = awe.b(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(ajg.a(kj.aO), dqn.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ecr::new)),
      ecr::a
   );
   public static final Codec<il<ecr>> b = ajd.a(kj.aL, a);
   private final Map<ajg<dqn>, dqn> c;

   public ecr(Map<ajg<dqn>, dqn> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<ajg<dqn>, dqn> c() {
      Builder<ajg<dqn>, dqn> $$0 = ImmutableMap.builder();
      dth.a(this.c.keySet().stream()).forEach($$1 -> {
         dqn $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dth a() {
      return new dth(this.c());
   }

   public Optional<dqn> b() {
      return Optional.ofNullable(this.c.get(dqn.b));
   }

   private static DataResult<ecr> a(ecr $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
