import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxa implements dwy {
   public static final Codec<dxa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyz.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dyz.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dxa::new)
   );
   public final dyz b;
   public final dyz c;
   public final int d;

   public dxa(dyz $$0, dyz $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
