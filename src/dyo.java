import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dyo {
   public static final Codec<dyo> a = atq.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(ahc.a(ke.aN), dmk.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, dyo::new)),
      dyo::a
   );
   public static final Codec<ih<dyo>> b = agz.a(ke.aK, a);
   private final Map<ahc<dmk>, dmk> c;

   public dyo(Map<ahc<dmk>, dmk> $$0) {
      this.c = $$0;
   }

   private it<dmk> c() {
      jc<dmk> $$0 = new ip<>(ke.aN, Lifecycle.experimental());
      dpe.a(this.c.keySet().stream()).forEach($$1 -> {
         dmk $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((ahc<dmk>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dpe a() {
      return new dpe(this.c());
   }

   public Optional<dmk> b() {
      return Optional.ofNullable(this.c.get(dmk.b));
   }

   private static DataResult<dyo> a(dyo $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
