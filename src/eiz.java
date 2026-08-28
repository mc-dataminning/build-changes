import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiz extends eil {
   public static final Codec<eiz> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eku.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               azd.m.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               azd.m.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eiz::new)
   );
   public final int d;
   public final int e;

   public eiz(eku $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
