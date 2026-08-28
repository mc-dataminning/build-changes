import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class esc {
   public static final Codec<esc> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(alq.a(mi.bq), efo.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, esc::new)
      )
      .validate(esc::a);
   public static final Codec<jg<esc>> b = aln.a(mi.bo, a);
   private final Map<alq<efo>, efo> c;

   public esc(Map<alq<efo>, efo> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<alq<efo>, efo> c() {
      Builder<alq<efo>, efo> $$0 = ImmutableMap.builder();
      eik.a(this.c.keySet().stream()).forEach($$1 -> {
         efo $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public eik a() {
      return new eik(this.c());
   }

   public Optional<efo> b() {
      return Optional.ofNullable(this.c.get(efo.b));
   }

   private static DataResult<esc> a(esc $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
