import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dyv {
   public static final Codec<dyv> a = atw.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(ahf.a(ke.aN), dmr.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, dyv::new)),
      dyv::a
   );
   public static final Codec<ih<dyv>> b = ahc.a(ke.aK, a);
   private final Map<ahf<dmr>, dmr> c;

   public dyv(Map<ahf<dmr>, dmr> $$0) {
      this.c = $$0;
   }

   private it<dmr> c() {
      jc<dmr> $$0 = new ip<>(ke.aN, Lifecycle.experimental());
      dpl.a(this.c.keySet().stream()).forEach($$1 -> {
         dmr $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((ahf<dmr>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dpl a() {
      return new dpl(this.c());
   }

   public Optional<dmr> b() {
      return Optional.ofNullable(this.c.get(dmr.b));
   }

   private static DataResult<dyv> a(dyv $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
