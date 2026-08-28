import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eib {
   public static final Codec<eib> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(ale.a(lq.aT), dvx.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eib::new)
      )
      .validate(eib::a);
   public static final Codec<ji<eib>> b = alb.a(lq.aQ, a);
   private final Map<ale<dvx>, dvx> c;

   public eib(Map<ale<dvx>, dvx> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<ale<dvx>, dvx> c() {
      Builder<ale<dvx>, dvx> $$0 = ImmutableMap.builder();
      dyr.a(this.c.keySet().stream()).forEach($$1 -> {
         dvx $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dyr a() {
      return new dyr(this.c());
   }

   public Optional<dvx> b() {
      return Optional.ofNullable(this.c.get(dvx.b));
   }

   private static DataResult<eib> a(eib $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
