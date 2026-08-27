import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dyu {
   public static final Codec<dyu> a = atv.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(ahf.a(ke.aN), dmq.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, dyu::new)),
      dyu::a
   );
   public static final Codec<ih<dyu>> b = ahc.a(ke.aK, a);
   private final Map<ahf<dmq>, dmq> c;

   public dyu(Map<ahf<dmq>, dmq> $$0) {
      this.c = $$0;
   }

   private it<dmq> c() {
      jc<dmq> $$0 = new ip<>(ke.aN, Lifecycle.experimental());
      dpk.a(this.c.keySet().stream()).forEach($$1 -> {
         dmq $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((ahf<dmq>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dpk a() {
      return new dpk(this.c());
   }

   public Optional<dmq> b() {
      return Optional.ofNullable(this.c.get(dmq.b));
   }

   private static DataResult<dyu> a(dyu $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
