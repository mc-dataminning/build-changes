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
         $$0 -> $$0.group(Codec.unboundedMap(akt.a(mc.bh), ebn.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eny::new)
      )
      .validate(eny::a);
   public static final Codec<jr<eny>> b = akq.a(mc.bd, a);
   private final Map<akt<ebn>, ebn> c;

   public eny(Map<akt<ebn>, ebn> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<akt<ebn>, ebn> c() {
      Builder<akt<ebn>, ebn> $$0 = ImmutableMap.builder();
      eej.a(this.c.keySet().stream()).forEach($$1 -> {
         ebn $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public eej a() {
      return new eej(this.c());
   }

   public Optional<ebn> b() {
      return Optional.ofNullable(this.c.get(ebn.b));
   }

   private static DataResult<eny> a(eny $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
