import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dum {
   public static final Codec<dum> a = aqw.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(aeo.a(jd.aI), dii.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, dum::new)),
      dum::a
   );
   public static final Codec<hf<dum>> b = ael.a(jd.aF, a);
   private final Map<aeo<dii>, dii> c;

   public dum(Map<aeo<dii>, dii> $$0) {
      this.c = $$0;
   }

   private hs<dii> c() {
      ib<dii> $$0 = new hn<>(jd.aI, Lifecycle.experimental());
      dlc.a(this.c.keySet().stream()).forEach($$1 -> {
         dii $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((aeo<dii>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dlc a() {
      return new dlc(this.c());
   }

   public Optional<dii> b() {
      return Optional.ofNullable(this.c.get(dii.b));
   }

   private static DataResult<dum> a(dum $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
