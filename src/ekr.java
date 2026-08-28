import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ekr {
   public static final Codec<ekr> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(alb.a(lv.bc), dyl.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ekr::new)
      )
      .validate(ekr::a);
   public static final Codec<jn<ekr>> b = aky.a(lv.aZ, a);
   private final Map<alb<dyl>, dyl> c;

   public ekr(Map<alb<dyl>, dyl> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<alb<dyl>, dyl> c() {
      Builder<alb<dyl>, dyl> $$0 = ImmutableMap.builder();
      ebf.a(this.c.keySet().stream()).forEach($$1 -> {
         dyl $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public ebf a() {
      return new ebf(this.c());
   }

   public Optional<dyl> b() {
      return Optional.ofNullable(this.c.get(dyl.b));
   }

   private static DataResult<ekr> a(ekr $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
