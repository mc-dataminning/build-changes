import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqa extends dpm {
   public static final Codec<dqa> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drv.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               arj.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               arj.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dqa::new)
   );
   public final int d;
   public final int e;

   public dqa(drv $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
