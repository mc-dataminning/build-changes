import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehc implements eha {
   public static final Codec<ehc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejb.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               ejb.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ehc::new)
   );
   public final ejb b;
   public final ejb c;
   public final int d;

   public ehc(ejb $$0, ejb $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
