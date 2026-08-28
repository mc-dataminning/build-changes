import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elo extends ela {
   public static final Codec<elo> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               enj.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayu.m.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayu.m.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, elo::new)
   );
   public final int d;
   public final int e;

   public elo(enj $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
