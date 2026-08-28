import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ers {
   public static final Codec<ers> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(alj.a(mi.bq), efe.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ers::new)
      )
      .validate(ers::a);
   public static final Codec<jg<ers>> b = alg.a(mi.bo, a);
   private final Map<alj<efe>, efe> c;

   public ers(Map<alj<efe>, efe> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<alj<efe>, efe> c() {
      Builder<alj<efe>, efe> $$0 = ImmutableMap.builder();
      eia.a(this.c.keySet().stream()).forEach($$1 -> {
         efe $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public eia a() {
      return new eia(this.c());
   }

   public Optional<efe> b() {
      return Optional.ofNullable(this.c.get(efe.b));
   }

   private static DataResult<ers> a(ers $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
