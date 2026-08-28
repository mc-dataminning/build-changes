import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ejg {
   public static final Codec<ejg> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(akq.a(lu.bb), dwz.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ejg::new)
      )
      .validate(ejg::a);
   public static final Codec<jm<ejg>> b = akn.a(lu.aY, a);
   private final Map<akq<dwz>, dwz> c;

   public ejg(Map<akq<dwz>, dwz> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<akq<dwz>, dwz> c() {
      Builder<akq<dwz>, dwz> $$0 = ImmutableMap.builder();
      dzt.a(this.c.keySet().stream()).forEach($$1 -> {
         dwz $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dzt a() {
      return new dzt(this.c());
   }

   public Optional<dwz> b() {
      return Optional.ofNullable(this.c.get(dwz.b));
   }

   private static DataResult<ejg> a(ejg $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
