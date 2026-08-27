import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ege {
   public static final Codec<ege> a = axh.b(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(akg.a(le.aT), dua.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ege::new)),
      ege::a
   );
   public static final Codec<iw<ege>> b = akd.a(le.aQ, a);
   private final Map<akg<dua>, dua> c;

   public ege(Map<akg<dua>, dua> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<akg<dua>, dua> c() {
      Builder<akg<dua>, dua> $$0 = ImmutableMap.builder();
      dwu.a(this.c.keySet().stream()).forEach($$1 -> {
         dua $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dwu a() {
      return new dwu(this.c());
   }

   public Optional<dua> b() {
      return Optional.ofNullable(this.c.get(dua.b));
   }

   private static DataResult<ege> a(ege $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
