import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egp extends egb {
   public static final Codec<egp> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eik.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ays.m.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ays.m.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, egp::new)
   );
   public final int d;
   public final int e;

   public egp(eik $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
