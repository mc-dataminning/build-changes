import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class enc {
   public static final Codec<enc> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(aku.a(mc.bf), eau.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, enc::new)
      )
      .validate(enc::a);
   public static final Codec<jr<enc>> b = akr.a(mc.bb, a);
   private final Map<aku<eau>, eau> c;

   public enc(Map<aku<eau>, eau> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<aku<eau>, eau> c() {
      Builder<aku<eau>, eau> $$0 = ImmutableMap.builder();
      edo.a(this.c.keySet().stream()).forEach($$1 -> {
         eau $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public edo a() {
      return new edo(this.c());
   }

   public Optional<eau> b() {
      return Optional.ofNullable(this.c.get(eau.b));
   }

   private static DataResult<enc> a(enc $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
