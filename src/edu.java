import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edu extends edg {
   public static final Codec<edu> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efp.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               axo.l.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               axo.l.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, edu::new)
   );
   public final int d;
   public final int e;

   public edu(efp $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
