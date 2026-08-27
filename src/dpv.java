import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpv extends dph {
   public static final Codec<dpv> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drq.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               aqw.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               aqw.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dpv::new)
   );
   public final int d;
   public final int e;

   public dpv(drq $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
