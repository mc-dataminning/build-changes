import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dvp {
   public static final Codec<dvp> a = asg.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(afv.a(jz.aJ), djl.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, dvp::new)),
      dvp::a
   );
   public static final Codec<ib<dvp>> b = afs.a(jz.aG, a);
   private final Map<afv<djl>, djl> c;

   public dvp(Map<afv<djl>, djl> $$0) {
      this.c = $$0;
   }

   private io<djl> c() {
      ix<djl> $$0 = new ik<>(jz.aJ, Lifecycle.experimental());
      dmf.a(this.c.keySet().stream()).forEach($$1 -> {
         djl $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((afv<djl>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dmf a() {
      return new dmf(this.c());
   }

   public Optional<djl> b() {
      return Optional.ofNullable(this.c.get(djl.b));
   }

   private static DataResult<dvp> a(dvp $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
