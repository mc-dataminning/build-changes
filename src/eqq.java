import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eqq {
   public static final Codec<eqq> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(alf.a(mg.bp), eef.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eqq::new)
      )
      .validate(eqq::a);
   public static final Codec<je<eqq>> b = alc.a(mg.bn, a);
   private final Map<alf<eef>, eef> c;

   public eqq(Map<alf<eef>, eef> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<alf<eef>, eef> c() {
      Builder<alf<eef>, eef> $$0 = ImmutableMap.builder();
      ehb.a(this.c.keySet().stream()).forEach($$1 -> {
         eef $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public ehb a() {
      return new ehb(this.c());
   }

   public Optional<eef> b() {
      return Optional.ofNullable(this.c.get(eef.b));
   }

   private static DataResult<eqq> a(eqq $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
