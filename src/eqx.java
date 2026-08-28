import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eqx {
   public static final Codec<eqx> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(alf.a(mh.bp), eem.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eqx::new)
      )
      .validate(eqx::a);
   public static final Codec<jf<eqx>> b = alc.a(mh.bn, a);
   private final Map<alf<eem>, eem> c;

   public eqx(Map<alf<eem>, eem> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<alf<eem>, eem> c() {
      Builder<alf<eem>, eem> $$0 = ImmutableMap.builder();
      ehi.a(this.c.keySet().stream()).forEach($$1 -> {
         eem $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public ehi a() {
      return new ehi(this.c());
   }

   public Optional<eem> b() {
      return Optional.ofNullable(this.c.get(eem.b));
   }

   private static DataResult<eqx> a(eqx $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
