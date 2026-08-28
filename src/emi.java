import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emi extends elu {
   public static final Codec<emi> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eod.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayu.m.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayu.m.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, emi::new)
   );
   public final int d;
   public final int e;

   public emi(eod $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
