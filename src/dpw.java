import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpw extends dpi {
   public static final Codec<dpw> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drr.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               aqy.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               aqy.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dpw::new)
   );
   public final int d;
   public final int e;

   public dpw(drr $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
