import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ega extends efm {
   public static final Codec<ega> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehv.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               aym.l.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               aym.l.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ega::new)
   );
   public final int d;
   public final int e;

   public ega(ehv $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
