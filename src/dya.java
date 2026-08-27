import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dya extends dxm {
   public static final Codec<dya> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzv.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               awe.k.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               awe.k.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dya::new)
   );
   public final int d;
   public final int e;

   public dya(dzv $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
