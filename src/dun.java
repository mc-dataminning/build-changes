import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dun {
   public static final Codec<dun> a = aqy.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(aeq.a(jc.aI), dij.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, dun::new)),
      dun::a
   );
   public static final Codec<he<dun>> b = aen.a(jc.aF, a);
   private final Map<aeq<dij>, dij> c;

   public dun(Map<aeq<dij>, dij> $$0) {
      this.c = $$0;
   }

   private hr<dij> c() {
      ia<dij> $$0 = new hm<>(jc.aI, Lifecycle.experimental());
      dld.a(this.c.keySet().stream()).forEach($$1 -> {
         dij $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((aeq<dij>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dld a() {
      return new dld(this.c());
   }

   public Optional<dij> b() {
      return Optional.ofNullable(this.c.get(dij.b));
   }

   private static DataResult<dun> a(dun $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
