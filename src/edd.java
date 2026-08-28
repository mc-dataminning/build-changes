import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edd extends ecp {
   public static final Codec<edd> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eey.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayc.l.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayc.l.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, edd::new)
   );
   public final int d;
   public final int e;

   public edd(eey $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
