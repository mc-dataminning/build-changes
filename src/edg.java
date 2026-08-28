import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edg extends ecs {
   public static final Codec<edg> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efb.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayf.l.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayf.l.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, edg::new)
   );
   public final int d;
   public final int e;

   public edg(efb $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
