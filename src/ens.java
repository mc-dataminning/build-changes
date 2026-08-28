import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ens {
   public static final Codec<ens> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(alo.a(mb.bf), ebk.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ens::new)
      )
      .validate(ens::a);
   public static final Codec<jq<ens>> b = all.a(mb.bb, a);
   private final Map<alo<ebk>, ebk> c;

   public ens(Map<alo<ebk>, ebk> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<alo<ebk>, ebk> c() {
      Builder<alo<ebk>, ebk> $$0 = ImmutableMap.builder();
      eee.a(this.c.keySet().stream()).forEach($$1 -> {
         ebk $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public eee a() {
      return new eee(this.c());
   }

   public Optional<ebk> b() {
      return Optional.ofNullable(this.c.get(ebk.b));
   }

   private static DataResult<ens> a(ens $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
