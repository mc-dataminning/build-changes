import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emv extends emg {
   public static final Codec<emv> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eoq.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayw.m.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayw.m.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, emv::new)
   );
   public final int d;
   public final int e;

   public emv(eoq $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
