import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dus {
   public static final Codec<dus> a = arb.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(aet.a(je.aI), dio.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, dus::new)),
      dus::a
   );
   public static final Codec<hg<dus>> b = aeq.a(je.aF, a);
   private final Map<aet<dio>, dio> c;

   public dus(Map<aet<dio>, dio> $$0) {
      this.c = $$0;
   }

   private ht<dio> c() {
      ic<dio> $$0 = new ho<>(je.aI, Lifecycle.experimental());
      dli.a(this.c.keySet().stream()).forEach($$1 -> {
         dio $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((aet<dio>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dli a() {
      return new dli(this.c());
   }

   public Optional<dio> b() {
      return Optional.ofNullable(this.c.get(dio.b));
   }

   private static DataResult<dus> a(dus $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
