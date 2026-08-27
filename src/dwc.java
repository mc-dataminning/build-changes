import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwc extends dvo {
   public static final Codec<dwc> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxx.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               avp.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               avp.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dwc::new)
   );
   public final int d;
   public final int e;

   public dwc(dxx $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
