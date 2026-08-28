import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efm extends eey {
   public static final Codec<efm> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehh.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayl.l.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayl.l.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, efm::new)
   );
   public final int d;
   public final int e;

   public efm(ehh $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
