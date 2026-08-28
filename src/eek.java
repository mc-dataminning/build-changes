import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eek extends edw {
   public static final Codec<eek> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egf.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               axv.l.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               axv.l.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eek::new)
   );
   public final int d;
   public final int e;

   public eek(egf $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
