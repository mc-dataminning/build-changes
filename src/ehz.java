import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ehz {
   public static final Codec<ehz> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(ale.a(lq.aT), dvv.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ehz::new)
      )
      .validate(ehz::a);
   public static final Codec<ji<ehz>> b = alb.a(lq.aQ, a);
   private final Map<ale<dvv>, dvv> c;

   public ehz(Map<ale<dvv>, dvv> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<ale<dvv>, dvv> c() {
      Builder<ale<dvv>, dvv> $$0 = ImmutableMap.builder();
      dyp.a(this.c.keySet().stream()).forEach($$1 -> {
         dvv $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dyp a() {
      return new dyp(this.c());
   }

   public Optional<dvv> b() {
      return Optional.ofNullable(this.c.get(dvv.b));
   }

   private static DataResult<ehz> a(ehz $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
