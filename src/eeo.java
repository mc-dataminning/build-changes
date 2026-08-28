import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeo extends eea {
   public static final Codec<eeo> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egj.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               axw.l.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               axw.l.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eeo::new)
   );
   public final int d;
   public final int e;

   public eeo(egj $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
