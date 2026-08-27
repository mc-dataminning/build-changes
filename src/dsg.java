import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsg implements dse {
   public static final Codec<dsg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               duf.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               duf.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dsg::new)
   );
   public final duf b;
   public final duf c;
   public final int d;

   public dsg(duf $$0, duf $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
