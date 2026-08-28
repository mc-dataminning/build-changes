import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eii extends ehu {
   public static final Codec<eii> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekd.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayi.m.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayi.m.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eii::new)
   );
   public final int d;
   public final int e;

   public eii(ekd $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
