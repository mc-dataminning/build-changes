import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class epx {
   public static final Codec<epx> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(ald.a(mg.bn), edm.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, epx::new)
      )
      .validate(epx::a);
   public static final Codec<je<epx>> b = ala.a(mg.bl, a);
   private final Map<ald<edm>, edm> c;

   public epx(Map<ald<edm>, edm> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<ald<edm>, edm> c() {
      Builder<ald<edm>, edm> $$0 = ImmutableMap.builder();
      egi.a(this.c.keySet().stream()).forEach($$1 -> {
         edm $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public egi a() {
      return new egi(this.c());
   }

   public Optional<edm> b() {
      return Optional.ofNullable(this.c.get(edm.b));
   }

   private static DataResult<epx> a(epx $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
