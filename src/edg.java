import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edg implements ede {
   public static final Codec<edg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eff.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               eff.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edg::new)
   );
   public final eff b;
   public final eff c;
   public final int d;

   public edg(eff $$0, eff $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
