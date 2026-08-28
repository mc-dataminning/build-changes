import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edh extends ect {
   public static final Codec<edh> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efc.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayg.l.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayg.l.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, edh::new)
   );
   public final int d;
   public final int e;

   public edh(efc $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
