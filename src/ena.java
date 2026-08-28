import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ena {
   public static final Codec<ena> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(aku.a(mc.bf), eas.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ena::new)
      )
      .validate(ena::a);
   public static final Codec<jr<ena>> b = akr.a(mc.bb, a);
   private final Map<aku<eas>, eas> c;

   public ena(Map<aku<eas>, eas> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<aku<eas>, eas> c() {
      Builder<aku<eas>, eas> $$0 = ImmutableMap.builder();
      edm.a(this.c.keySet().stream()).forEach($$1 -> {
         eas $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public edm a() {
      return new edm(this.c());
   }

   public Optional<eas> b() {
      return Optional.ofNullable(this.c.get(eas.b));
   }

   private static DataResult<ena> a(ena $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
