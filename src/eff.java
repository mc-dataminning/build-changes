import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eff {
   public static final Codec<eff> a = awu.b(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(aju.a(ku.aQ), dtb.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eff::new)),
      eff::a
   );
   public static final Codec<in<eff>> b = ajr.a(ku.aN, a);
   private final Map<aju<dtb>, dtb> c;

   public eff(Map<aju<dtb>, dtb> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<aju<dtb>, dtb> c() {
      Builder<aju<dtb>, dtb> $$0 = ImmutableMap.builder();
      dvv.a(this.c.keySet().stream()).forEach($$1 -> {
         dtb $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dvv a() {
      return new dvv(this.c());
   }

   public Optional<dtb> b() {
      return Optional.ofNullable(this.c.get(dtb.b));
   }

   private static DataResult<eff> a(eff $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
