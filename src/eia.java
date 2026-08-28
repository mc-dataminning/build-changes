import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eia {
   public static final Codec<eia> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(ale.a(lq.aT), dvw.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eia::new)
      )
      .validate(eia::a);
   public static final Codec<ji<eia>> b = alb.a(lq.aQ, a);
   private final Map<ale<dvw>, dvw> c;

   public eia(Map<ale<dvw>, dvw> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<ale<dvw>, dvw> c() {
      Builder<ale<dvw>, dvw> $$0 = ImmutableMap.builder();
      dyq.a(this.c.keySet().stream()).forEach($$1 -> {
         dvw $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dyq a() {
      return new dyq(this.c());
   }

   public Optional<dvw> b() {
      return Optional.ofNullable(this.c.get(dvw.b));
   }

   private static DataResult<eia> a(eia $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
