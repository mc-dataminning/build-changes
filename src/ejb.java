import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ejb {
   public static final Codec<ejb> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(akp.a(lu.bb), dww.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, ejb::new)
      )
      .validate(ejb::a);
   public static final Codec<jm<ejb>> b = akm.a(lu.aY, a);
   private final Map<akp<dww>, dww> c;

   public ejb(Map<akp<dww>, dww> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<akp<dww>, dww> c() {
      Builder<akp<dww>, dww> $$0 = ImmutableMap.builder();
      dzq.a(this.c.keySet().stream()).forEach($$1 -> {
         dww $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public dzq a() {
      return new dzq(this.c());
   }

   public Optional<dww> b() {
      return Optional.ofNullable(this.c.get(dww.b));
   }

   private static DataResult<ejb> a(ejb $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
