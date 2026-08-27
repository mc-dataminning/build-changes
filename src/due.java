import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class due extends dtq {
   public static final Codec<due> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvz.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               atw.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               atw.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, due::new)
   );
   public final int d;
   public final int e;

   public due(dvz $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
