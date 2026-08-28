import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edi extends ecu {
   public static final Codec<edi> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efd.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayh.l.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayh.l.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, edi::new)
   );
   public final int d;
   public final int e;

   public edi(efd $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
