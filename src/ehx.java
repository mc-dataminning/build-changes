import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ehx {
   public static final Codec<ehx> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(ald.a(lq.aT), dvt.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ehx::new)
      )
      .validate(ehx::a);
   public static final Codec<ji<ehx>> b = ala.a(lq.aQ, a);
   private final Map<ald<dvt>, dvt> c;

   public ehx(Map<ald<dvt>, dvt> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<ald<dvt>, dvt> c() {
      Builder<ald<dvt>, dvt> $$0 = ImmutableMap.builder();
      dyn.a(this.c.keySet().stream()).forEach($$1 -> {
         dvt $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dyn a() {
      return new dyn(this.c());
   }

   public Optional<dvt> b() {
      return Optional.ofNullable(this.c.get(dvt.b));
   }

   private static DataResult<ehx> a(ehx $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
