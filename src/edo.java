import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edo extends eda {
   public static final Codec<edo> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efj.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               axm.l.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               axm.l.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, edo::new)
   );
   public final int d;
   public final int e;

   public edo(efj $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
