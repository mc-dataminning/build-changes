import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ekv {
   public static final Codec<ekv> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(ald.a(lw.bd), dyp.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ekv::new)
      )
      .validate(ekv::a);
   public static final Codec<jo<ekv>> b = ala.a(lw.ba, a);
   private final Map<ald<dyp>, dyp> c;

   public ekv(Map<ald<dyp>, dyp> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<ald<dyp>, dyp> c() {
      Builder<ald<dyp>, dyp> $$0 = ImmutableMap.builder();
      ebj.a(this.c.keySet().stream()).forEach($$1 -> {
         dyp $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public ebj a() {
      return new ebj(this.c());
   }

   public Optional<dyp> b() {
      return Optional.ofNullable(this.c.get(dyp.b));
   }

   private static DataResult<ekv> a(ekv $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
