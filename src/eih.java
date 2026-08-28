import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eih extends eht {
   public static final Codec<eih> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekc.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayi.m.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayi.m.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eih::new)
   );
   public final int d;
   public final int e;

   public eih(ekc $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
