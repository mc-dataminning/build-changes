import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eil {
   public static final Codec<eil> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(akj.a(lr.ba), dwg.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eil::new)
      )
      .validate(eil::a);
   public static final Codec<jj<eil>> b = akg.a(lr.aX, a);
   private final Map<akj<dwg>, dwg> c;

   public eil(Map<akj<dwg>, dwg> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<akj<dwg>, dwg> c() {
      Builder<akj<dwg>, dwg> $$0 = ImmutableMap.builder();
      dza.a(this.c.keySet().stream()).forEach($$1 -> {
         dwg $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dza a() {
      return new dza(this.c());
   }

   public Optional<dwg> b() {
      return Optional.ofNullable(this.c.get(dwg.b));
   }

   private static DataResult<eil> a(eil $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
