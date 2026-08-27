import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class egy {
   public static final Codec<egy> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(akl.a(lf.aT), duu.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, egy::new)
      )
      .validate(egy::a);
   public static final Codec<ix<egy>> b = aki.a(lf.aQ, a);
   private final Map<akl<duu>, duu> c;

   public egy(Map<akl<duu>, duu> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<akl<duu>, duu> c() {
      Builder<akl<duu>, duu> $$0 = ImmutableMap.builder();
      dxo.a(this.c.keySet().stream()).forEach($$1 -> {
         duu $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dxo a() {
      return new dxo(this.c());
   }

   public Optional<duu> b() {
      return Optional.ofNullable(this.c.get(duu.b));
   }

   private static DataResult<egy> a(egy $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
