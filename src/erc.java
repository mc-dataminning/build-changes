import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class erc {
   public static final Codec<erc> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(alf.a(mh.bq), eer.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, erc::new)
      )
      .validate(erc::a);
   public static final Codec<jf<erc>> b = alc.a(mh.bo, a);
   private final Map<alf<eer>, eer> c;

   public erc(Map<alf<eer>, eer> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<alf<eer>, eer> c() {
      Builder<alf<eer>, eer> $$0 = ImmutableMap.builder();
      ehn.a(this.c.keySet().stream()).forEach($$1 -> {
         eer $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public ehn a() {
      return new ehn(this.c());
   }

   public Optional<eer> b() {
      return Optional.ofNullable(this.c.get(eer.b));
   }

   private static DataResult<erc> a(erc $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
