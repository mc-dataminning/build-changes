import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ehy {
   public static final Codec<ehy> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(ald.a(lq.aT), dvu.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ehy::new)
      )
      .validate(ehy::a);
   public static final Codec<ji<ehy>> b = ala.a(lq.aQ, a);
   private final Map<ald<dvu>, dvu> c;

   public ehy(Map<ald<dvu>, dvu> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<ald<dvu>, dvu> c() {
      Builder<ald<dvu>, dvu> $$0 = ImmutableMap.builder();
      dyo.a(this.c.keySet().stream()).forEach($$1 -> {
         dvu $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dyo a() {
      return new dyo(this.c());
   }

   public Optional<dvu> b() {
      return Optional.ofNullable(this.c.get(dvu.b));
   }

   private static DataResult<ehy> a(ehy $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
