import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class erq {
   public static final Codec<erq> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(alh.a(mh.bq), efc.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, erq::new)
      )
      .validate(erq::a);
   public static final Codec<jf<erq>> b = ale.a(mh.bo, a);
   private final Map<alh<efc>, efc> c;

   public erq(Map<alh<efc>, efc> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<alh<efc>, efc> c() {
      Builder<alh<efc>, efc> $$0 = ImmutableMap.builder();
      ehy.a(this.c.keySet().stream()).forEach($$1 -> {
         efc $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public ehy a() {
      return new ehy(this.c());
   }

   public Optional<efc> b() {
      return Optional.ofNullable(this.c.get(efc.b));
   }

   private static DataResult<erq> a(erq $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
