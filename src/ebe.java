import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebe extends eaq {
   public static final Codec<ebe> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecz.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               axe.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               axe.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ebe::new)
   );
   public final int d;
   public final int e;

   public ebe(ecz $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
