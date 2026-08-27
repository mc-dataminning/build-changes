import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxw implements dxu {
   public static final Codec<dxw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzv.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dzv.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dxw::new)
   );
   public final dzv b;
   public final dzv c;
   public final int d;

   public dxw(dzv $$0, dzv $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
