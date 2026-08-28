import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eov {
   public static final Codec<eov> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(alc.a(me.bm), eck.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eov::new)
      )
      .validate(eov::a);
   public static final Codec<js<eov>> b = akz.a(me.bi, a);
   private final Map<alc<eck>, eck> c;

   public eov(Map<alc<eck>, eck> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<alc<eck>, eck> c() {
      Builder<alc<eck>, eck> $$0 = ImmutableMap.builder();
      efg.a(this.c.keySet().stream()).forEach($$1 -> {
         eck $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public efg a() {
      return new efg(this.c());
   }

   public Optional<eck> b() {
      return Optional.ofNullable(this.c.get(eck.b));
   }

   private static DataResult<eov> a(eov $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
