import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eaf extends dzr {
   public static final Codec<eaf> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eca.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               aws.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               aws.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eaf::new)
   );
   public final int d;
   public final int e;

   public eaf(eca $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
