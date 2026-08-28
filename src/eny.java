import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eny {
   public static final Codec<eny> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(aly.a(mb.bf), ebq.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eny::new)
      )
      .validate(eny::a);
   public static final Codec<jq<eny>> b = alv.a(mb.bb, a);
   private final Map<aly<ebq>, ebq> c;

   public eny(Map<aly<ebq>, ebq> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<aly<ebq>, ebq> c() {
      Builder<aly<ebq>, ebq> $$0 = ImmutableMap.builder();
      eek.a(this.c.keySet().stream()).forEach($$1 -> {
         ebq $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public eek a() {
      return new eek(this.c());
   }

   public Optional<ebq> b() {
      return Optional.ofNullable(this.c.get(ebq.b));
   }

   private static DataResult<eny> a(eny $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
