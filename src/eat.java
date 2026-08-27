import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eat {
   public static final Codec<eat> a = avp.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(aix.a(kg.aN), dop.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eat::new)),
      eat::a
   );
   public static final Codec<ij<eat>> b = aiu.a(kg.aK, a);
   private final Map<aix<dop>, dop> c;

   public eat(Map<aix<dop>, dop> $$0) {
      this.c = $$0;
   }

   private iv<dop> c() {
      je<dop> $$0 = new ir<>(kg.aN, Lifecycle.experimental());
      drj.a(this.c.keySet().stream()).forEach($$1 -> {
         dop $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((aix<dop>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public drj a() {
      return new drj(this.c());
   }

   public Optional<dop> b() {
      return Optional.ofNullable(this.c.get(dop.b));
   }

   private static DataResult<eat> a(eat $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
