import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eji {
   public static final Codec<eji> a = axu.b(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(aks.a(li.aT), dwv.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eji::new)),
      eji::a
   );
   public static final Codec<ja<eji>> b = akp.a(li.aQ, a);
   private final Map<aks<dwv>, dwv> c;

   public eji(Map<aks<dwv>, dwv> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<aks<dwv>, dwv> c() {
      Builder<aks<dwv>, dwv> $$0 = ImmutableMap.builder();
      dzp.a(this.c.keySet().stream()).forEach($$1 -> {
         dwv $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dzp a() {
      return new dzp(this.c());
   }

   public Optional<dwv> b() {
      return Optional.ofNullable(this.c.get(dwv.b));
   }

   private static DataResult<eji> a(eji $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
