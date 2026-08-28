import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enh extends ems {
   public static final Codec<enh> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               epc.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               azg.m.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               azg.m.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, enh::new)
   );
   public final int d;
   public final int e;

   public enh(epc $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
