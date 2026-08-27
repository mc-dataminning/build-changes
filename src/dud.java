import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dud extends dtp {
   public static final Codec<dud> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvy.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               atv.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               atv.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dud::new)
   );
   public final int d;
   public final int e;

   public dud(dvy $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
