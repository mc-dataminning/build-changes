import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eqi {
   public static final Codec<eqi> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(alf.a(mg.bo), edx.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eqi::new)
      )
      .validate(eqi::a);
   public static final Codec<je<eqi>> b = alc.a(mg.bm, a);
   private final Map<alf<edx>, edx> c;

   public eqi(Map<alf<edx>, edx> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<alf<edx>, edx> c() {
      Builder<alf<edx>, edx> $$0 = ImmutableMap.builder();
      egt.a(this.c.keySet().stream()).forEach($$1 -> {
         edx $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public egt a() {
      return new egt(this.c());
   }

   public Optional<edx> b() {
      return Optional.ofNullable(this.c.get(edx.b));
   }

   private static DataResult<eqi> a(eqi $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
