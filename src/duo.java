import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class duo {
   public static final Codec<duo> a = aqy.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(aeq.a(jc.aI), dik.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, duo::new)),
      duo::a
   );
   public static final Codec<he<duo>> b = aen.a(jc.aF, a);
   private final Map<aeq<dik>, dik> c;

   public duo(Map<aeq<dik>, dik> $$0) {
      this.c = $$0;
   }

   private hr<dik> c() {
      ia<dik> $$0 = new hm<>(jc.aI, Lifecycle.experimental());
      dle.a(this.c.keySet().stream()).forEach($$1 -> {
         dik $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((aeq<dik>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dle a() {
      return new dle(this.c());
   }

   public Optional<dik> b() {
      return Optional.ofNullable(this.c.get(dik.b));
   }

   private static DataResult<duo> a(duo $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
