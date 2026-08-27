import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqg extends dps {
   public static final Codec<dqg> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsb.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               arf.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               arf.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dqg::new)
   );
   public final int d;
   public final int e;

   public dqg(dsb $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
