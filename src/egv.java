import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egv extends egh {
   public static final Codec<egv> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eiq.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayt.m.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayt.m.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, egv::new)
   );
   public final int d;
   public final int e;

   public egv(eiq $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
