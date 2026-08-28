import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class emz {
   public static final Codec<emz> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(akt.a(mc.bf), ear.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, emz::new)
      )
      .validate(emz::a);
   public static final Codec<jr<emz>> b = akq.a(mc.bb, a);
   private final Map<akt<ear>, ear> c;

   public emz(Map<akt<ear>, ear> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<akt<ear>, ear> c() {
      Builder<akt<ear>, ear> $$0 = ImmutableMap.builder();
      edl.a(this.c.keySet().stream()).forEach($$1 -> {
         ear $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public edl a() {
      return new edl(this.c());
   }

   public Optional<ear> b() {
      return Optional.ofNullable(this.c.get(ear.b));
   }

   private static DataResult<emz> a(emz $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
