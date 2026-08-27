import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dzd {
   public static final Codec<dzd> a = atx.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(ahg.a(ke.aN), dmz.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, dzd::new)),
      dzd::a
   );
   public static final Codec<ih<dzd>> b = ahd.a(ke.aK, a);
   private final Map<ahg<dmz>, dmz> c;

   public dzd(Map<ahg<dmz>, dmz> $$0) {
      this.c = $$0;
   }

   private it<dmz> c() {
      jc<dmz> $$0 = new ip<>(ke.aN, Lifecycle.experimental());
      dpt.a(this.c.keySet().stream()).forEach($$1 -> {
         dmz $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((ahg<dmz>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dpt a() {
      return new dpt(this.c());
   }

   public Optional<dmz> b() {
      return Optional.ofNullable(this.c.get(dmz.b));
   }

   private static DataResult<dzd> a(dzd $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
