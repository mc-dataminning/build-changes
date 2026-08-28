import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ehu {
   public static final Codec<ehu> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(ala.a(lq.aT), dvq.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ehu::new)
      )
      .validate(ehu::a);
   public static final Codec<ji<ehu>> b = akx.a(lq.aQ, a);
   private final Map<ala<dvq>, dvq> c;

   public ehu(Map<ala<dvq>, dvq> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<ala<dvq>, dvq> c() {
      Builder<ala<dvq>, dvq> $$0 = ImmutableMap.builder();
      dyk.a(this.c.keySet().stream()).forEach($$1 -> {
         dvq $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dyk a() {
      return new dyk(this.c());
   }

   public Optional<dvq> b() {
      return Optional.ofNullable(this.c.get(dvq.b));
   }

   private static DataResult<ehu> a(ehu $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
