import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyc extends dxo {
   public static final Codec<dyc> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzx.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               awe.k.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               awe.k.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dyc::new)
   );
   public final int d;
   public final int e;

   public dyc(dzx $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
