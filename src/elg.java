import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class elg {
   public static final Codec<elg> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(alg.a(ly.bc), dza.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, elg::new)
      )
      .validate(elg::a);
   public static final Codec<jp<elg>> b = ald.a(ly.aZ, a);
   private final Map<alg<dza>, dza> c;

   public elg(Map<alg<dza>, dza> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<alg<dza>, dza> c() {
      Builder<alg<dza>, dza> $$0 = ImmutableMap.builder();
      ebu.a(this.c.keySet().stream()).forEach($$1 -> {
         dza $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public ebu a() {
      return new ebu(this.c());
   }

   public Optional<dza> b() {
      return Optional.ofNullable(this.c.get(dza.b));
   }

   private static DataResult<elg> a(elg $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
