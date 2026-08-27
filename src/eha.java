import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eha {
   public static final Codec<eha> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(akm.a(lf.aT), duw.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eha::new)
      )
      .validate(eha::a);
   public static final Codec<ix<eha>> b = akj.a(lf.aQ, a);
   private final Map<akm<duw>, duw> c;

   public eha(Map<akm<duw>, duw> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<akm<duw>, duw> c() {
      Builder<akm<duw>, duw> $$0 = ImmutableMap.builder();
      dxq.a(this.c.keySet().stream()).forEach($$1 -> {
         duw $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dxq a() {
      return new dxq(this.c());
   }

   public Optional<duw> b() {
      return Optional.ofNullable(this.c.get(duw.b));
   }

   private static DataResult<eha> a(eha $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
