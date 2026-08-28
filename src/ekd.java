import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ekd {
   public static final Codec<ekd> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(ala.a(lv.bb), dxx.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ekd::new)
      )
      .validate(ekd::a);
   public static final Codec<jn<ekd>> b = akx.a(lv.aY, a);
   private final Map<ala<dxx>, dxx> c;

   public ekd(Map<ala<dxx>, dxx> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<ala<dxx>, dxx> c() {
      Builder<ala<dxx>, dxx> $$0 = ImmutableMap.builder();
      ear.a(this.c.keySet().stream()).forEach($$1 -> {
         dxx $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public ear a() {
      return new ear(this.c());
   }

   public Optional<dxx> b() {
      return Optional.ofNullable(this.c.get(dxx.b));
   }

   private static DataResult<ekd> a(ekd $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
