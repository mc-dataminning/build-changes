import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eew {
   public static final Codec<eew> a = aws.b(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(ajs.a(ks.aP), dss.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eew::new)),
      eew::a
   );
   public static final Codec<il<eew>> b = ajp.a(ks.aM, a);
   private final Map<ajs<dss>, dss> c;

   public eew(Map<ajs<dss>, dss> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<ajs<dss>, dss> c() {
      Builder<ajs<dss>, dss> $$0 = ImmutableMap.builder();
      dvm.a(this.c.keySet().stream()).forEach($$1 -> {
         dss $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dvm a() {
      return new dvm(this.c());
   }

   public Optional<dss> b() {
      return Optional.ofNullable(this.c.get(dss.b));
   }

   private static DataResult<eew> a(eew $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
