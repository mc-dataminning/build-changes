import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eij extends ehv {
   public static final Codec<eij> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eke.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayi.m.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayi.m.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eij::new)
   );
   public final int d;
   public final int e;

   public eij(eke $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
