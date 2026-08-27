import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsf extends drr {
   public static final Codec<dsf> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dua.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               asu.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               asu.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dsf::new)
   );
   public final int d;
   public final int e;

   public dsf(dua $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
