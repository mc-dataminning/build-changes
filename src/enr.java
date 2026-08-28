import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class enr {
   public static final Codec<enr> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(aly.a(mb.be), ebj.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, enr::new)
      )
      .validate(enr::a);
   public static final Codec<jq<enr>> b = alv.a(mb.ba, a);
   private final Map<aly<ebj>, ebj> c;

   public enr(Map<aly<ebj>, ebj> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<aly<ebj>, ebj> c() {
      Builder<aly<ebj>, ebj> $$0 = ImmutableMap.builder();
      eed.a(this.c.keySet().stream()).forEach($$1 -> {
         ebj $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public eed a() {
      return new eed(this.c());
   }

   public Optional<ebj> b() {
      return Optional.ofNullable(this.c.get(ebj.b));
   }

   private static DataResult<enr> a(enr $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
