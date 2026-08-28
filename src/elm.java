import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class elm {
   public static final Codec<elm> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(alh.a(lz.bc), dzg.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, elm::new)
      )
      .validate(elm::a);
   public static final Codec<jq<elm>> b = ale.a(lz.aZ, a);
   private final Map<alh<dzg>, dzg> c;

   public elm(Map<alh<dzg>, dzg> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<alh<dzg>, dzg> c() {
      Builder<alh<dzg>, dzg> $$0 = ImmutableMap.builder();
      eca.a(this.c.keySet().stream()).forEach($$1 -> {
         dzg $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public eca a() {
      return new eca(this.c());
   }

   public Optional<dzg> b() {
      return Optional.ofNullable(this.c.get(dzg.b));
   }

   private static DataResult<elm> a(elm $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
