import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class efv {
   public static final Codec<efv> a = axe.b(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(ake.a(ld.aS), dtr.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, efv::new)),
      efv::a
   );
   public static final Codec<iv<efv>> b = akb.a(ld.aP, a);
   private final Map<ake<dtr>, dtr> c;

   public efv(Map<ake<dtr>, dtr> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<ake<dtr>, dtr> c() {
      Builder<ake<dtr>, dtr> $$0 = ImmutableMap.builder();
      dwl.a(this.c.keySet().stream()).forEach($$1 -> {
         dtr $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dwl a() {
      return new dwl(this.c());
   }

   public Optional<dtr> b() {
      return Optional.ofNullable(this.c.get(dtr.b));
   }

   private static DataResult<efv> a(efv $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
