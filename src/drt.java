import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drt extends drf {
   public static final Codec<drt> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dto.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               asq.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               asq.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, drt::new)
   );
   public final int d;
   public final int e;

   public drt(dto $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
