import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eim {
   public static final Codec<eim> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(akj.a(lr.ba), dwh.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eim::new)
      )
      .validate(eim::a);
   public static final Codec<jj<eim>> b = akg.a(lr.aX, a);
   private final Map<akj<dwh>, dwh> c;

   public eim(Map<akj<dwh>, dwh> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<akj<dwh>, dwh> c() {
      Builder<akj<dwh>, dwh> $$0 = ImmutableMap.builder();
      dzb.a(this.c.keySet().stream()).forEach($$1 -> {
         dwh $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dzb a() {
      return new dzb(this.c());
   }

   public Optional<dwh> b() {
      return Optional.ofNullable(this.c.get(dwh.b));
   }

   private static DataResult<eim> a(eim $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
