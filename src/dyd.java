import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dyd {
   public static final Codec<dyd> a = atg.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(ags.a(kc.aM), dlz.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, dyd::new)),
      dyd::a
   );
   public static final Codec<ie<dyd>> b = agp.a(kc.aJ, a);
   private final Map<ags<dlz>, dlz> c;

   public dyd(Map<ags<dlz>, dlz> $$0) {
      this.c = $$0;
   }

   private ir<dlz> c() {
      ja<dlz> $$0 = new in<>(kc.aM, Lifecycle.experimental());
      dot.a(this.c.keySet().stream()).forEach($$1 -> {
         dlz $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((ags<dlz>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dot a() {
      return new dot(this.c());
   }

   public Optional<dlz> b() {
      return Optional.ofNullable(this.c.get(dlz.b));
   }

   private static DataResult<dyd> a(dyd $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
