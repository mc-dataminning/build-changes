import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqi extends dpu {
   public static final Codec<dqi> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsd.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               arh.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               arh.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dqi::new)
   );
   public final int d;
   public final int e;

   public dqi(dsd $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
