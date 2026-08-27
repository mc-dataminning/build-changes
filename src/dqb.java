import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqb extends dpn {
   public static final Codec<dqb> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drw.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               arb.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               arb.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dqb::new)
   );
   public final int d;
   public final int e;

   public dqb(drw $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
