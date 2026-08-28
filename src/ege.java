import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ege extends efq {
   public static final Codec<ege> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehz.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayo.l.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayo.l.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ege::new)
   );
   public final int d;
   public final int e;

   public ege(ehz $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
