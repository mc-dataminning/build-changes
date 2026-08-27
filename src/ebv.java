import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ebv {
   public static final Codec<ebv> a = avu.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(ajb.a(ki.aO), dpr.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ebv::new)),
      ebv::a
   );
   public static final Codec<il<ebv>> b = aiy.a(ki.aL, a);
   private final Map<ajb<dpr>, dpr> c;

   public ebv(Map<ajb<dpr>, dpr> $$0) {
      this.c = $$0;
   }

   private ix<dpr> c() {
      jg<dpr> $$0 = new it<>(ki.aO, Lifecycle.experimental());
      dsl.a(this.c.keySet().stream()).forEach($$1 -> {
         dpr $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((ajb<dpr>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dsl a() {
      return new dsl(this.c());
   }

   public Optional<dpr> b() {
      return Optional.ofNullable(this.c.get(dpr.b));
   }

   private static DataResult<ebv> a(ebv $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
