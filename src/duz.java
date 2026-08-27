import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class duz {
   public static final Codec<duz> a = arh.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(aex.a(je.aI), div.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, duz::new)),
      duz::a
   );
   public static final Codec<hg<duz>> b = aeu.a(je.aF, a);
   private final Map<aex<div>, div> c;

   public duz(Map<aex<div>, div> $$0) {
      this.c = $$0;
   }

   private ht<div> c() {
      ic<div> $$0 = new ho<>(je.aI, Lifecycle.experimental());
      dlp.a(this.c.keySet().stream()).forEach($$1 -> {
         div $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((aex<div>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dlp a() {
      return new dlp(this.c());
   }

   public Optional<div> b() {
      return Optional.ofNullable(this.c.get(div.b));
   }

   private static DataResult<duz> a(duz $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
