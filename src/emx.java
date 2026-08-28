import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emx extends emi {
   public static final Codec<emx> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eos.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayy.m.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayy.m.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, emx::new)
   );
   public final int d;
   public final int e;

   public emx(eos $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
