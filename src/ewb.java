import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ewb extends evt {
   public static final MapCodec<ewb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asi.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ayw.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ewb::new)
   );
   private final Optional<String> b;
   private final Optional<asi<String>> c;
   private final Optional<Integer> d;

   public ewb(List<exr> $$0, Optional<asi<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cwf a(cwf $$0, eug $$1) {
      $$0.a(ku.T, czn.a, this::a);
      return $$0;
   }

   private czn a(czn $$0) {
      return new czn(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public evv<ewb> b() {
      return evw.M;
   }
}
