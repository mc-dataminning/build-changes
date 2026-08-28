import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class enb {
   public static final Codec<enb> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(aku.a(mc.bf), eat.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, enb::new)
      )
      .validate(enb::a);
   public static final Codec<jr<enb>> b = akr.a(mc.bb, a);
   private final Map<aku<eat>, eat> c;

   public enb(Map<aku<eat>, eat> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<aku<eat>, eat> c() {
      Builder<aku<eat>, eat> $$0 = ImmutableMap.builder();
      edn.a(this.c.keySet().stream()).forEach($$1 -> {
         eat $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public edn a() {
      return new edn(this.c());
   }

   public Optional<eat> b() {
      return Optional.ofNullable(this.c.get(eat.b));
   }

   private static DataResult<enb> a(enb $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
