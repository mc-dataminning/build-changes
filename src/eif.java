import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eif {
   public static final Codec<eif> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(akj.a(lr.ba), dwa.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eif::new)
      )
      .validate(eif::a);
   public static final Codec<jj<eif>> b = akg.a(lr.aX, a);
   private final Map<akj<dwa>, dwa> c;

   public eif(Map<akj<dwa>, dwa> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<akj<dwa>, dwa> c() {
      Builder<akj<dwa>, dwa> $$0 = ImmutableMap.builder();
      dyu.a(this.c.keySet().stream()).forEach($$1 -> {
         dwa $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dyu a() {
      return new dyu(this.c());
   }

   public Optional<dwa> b() {
      return Optional.ofNullable(this.c.get(dwa.b));
   }

   private static DataResult<eif> a(eif $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
