import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dww {
   public static final Codec<dww> a = asu.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(agh.a(jz.aK), dks.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, dww::new)),
      dww::a
   );
   public static final Codec<ib<dww>> b = age.a(jz.aH, a);
   private final Map<agh<dks>, dks> c;

   public dww(Map<agh<dks>, dks> $$0) {
      this.c = $$0;
   }

   private io<dks> c() {
      ix<dks> $$0 = new ik<>(jz.aK, Lifecycle.experimental());
      dnm.a(this.c.keySet().stream()).forEach($$1 -> {
         dks $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((agh<dks>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dnm a() {
      return new dnm(this.c());
   }

   public Optional<dks> b() {
      return Optional.ofNullable(this.c.get(dks.b));
   }

   private static DataResult<dww> a(dww $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
