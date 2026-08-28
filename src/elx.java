import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class elx {
   public static final Codec<elx> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(ali.a(ma.bc), dzr.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, elx::new)
      )
      .validate(elx::a);
   public static final Codec<jq<elx>> b = alf.a(ma.aZ, a);
   private final Map<ali<dzr>, dzr> c;

   public elx(Map<ali<dzr>, dzr> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<ali<dzr>, dzr> c() {
      Builder<ali<dzr>, dzr> $$0 = ImmutableMap.builder();
      ecl.a(this.c.keySet().stream()).forEach($$1 -> {
         dzr $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public ecl a() {
      return new ecl(this.c());
   }

   public Optional<dzr> b() {
      return Optional.ofNullable(this.c.get(dzr.b));
   }

   private static DataResult<elx> a(elx $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
