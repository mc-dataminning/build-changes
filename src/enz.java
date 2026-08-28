import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class enz {
   public static final Codec<enz> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(aly.a(mb.bf), ebr.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, enz::new)
      )
      .validate(enz::a);
   public static final Codec<jq<enz>> b = alv.a(mb.bb, a);
   private final Map<aly<ebr>, ebr> c;

   public enz(Map<aly<ebr>, ebr> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<aly<ebr>, ebr> c() {
      Builder<aly<ebr>, ebr> $$0 = ImmutableMap.builder();
      eel.a(this.c.keySet().stream()).forEach($$1 -> {
         ebr $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public eel a() {
      return new eel(this.c());
   }

   public Optional<ebr> b() {
      return Optional.ofNullable(this.c.get(ebr.b));
   }

   private static DataResult<enz> a(enz $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
