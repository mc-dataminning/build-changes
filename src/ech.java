import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ech extends ebt {
   public static final Codec<ech> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eec.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               axm.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               axm.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ech::new)
   );
   public final int d;
   public final int e;

   public ech(eec $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
