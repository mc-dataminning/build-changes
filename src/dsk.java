import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsk extends drw {
   public static final Codec<dsk> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               duf.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               asy.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               asy.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dsk::new)
   );
   public final int d;
   public final int e;

   public dsk(duf $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
