import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmy extends dmk {
   public static final Codec<dmy> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dot.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               aoi.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               aoi.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dmy::new)
   );
   public final int d;
   public final int e;

   public dmy(dot $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
