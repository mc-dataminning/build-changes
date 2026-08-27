import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtx extends dtj {
   public static final Codec<dtx> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvs.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               atq.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               atq.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dtx::new)
   );
   public final int d;
   public final int e;

   public dtx(dvs $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
