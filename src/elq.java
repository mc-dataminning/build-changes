import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class elq {
   public static final Codec<elq> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(alk.a(ma.bc), dzk.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, elq::new)
      )
      .validate(elq::a);
   public static final Codec<jq<elq>> b = alh.a(ma.aZ, a);
   private final Map<alk<dzk>, dzk> c;

   public elq(Map<alk<dzk>, dzk> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<alk<dzk>, dzk> c() {
      Builder<alk<dzk>, dzk> $$0 = ImmutableMap.builder();
      ece.a(this.c.keySet().stream()).forEach($$1 -> {
         dzk $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public ece a() {
      return new ece(this.c());
   }

   public Optional<dzk> b() {
      return Optional.ofNullable(this.c.get(dzk.b));
   }

   private static DataResult<elq> a(elq $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
