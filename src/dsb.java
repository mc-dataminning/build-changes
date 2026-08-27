import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsb implements drz {
   public static final Codec<dsb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dua.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dua.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dsb::new)
   );
   public final dua b;
   public final dua c;
   public final int d;

   public dsb(dua $$0, dua $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
