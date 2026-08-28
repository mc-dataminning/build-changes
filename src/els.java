import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class els implements elq {
   public static final Codec<els> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               enr.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               enr.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, els::new)
   );
   public final enr b;
   public final enr c;
   public final int d;

   public els(enr $$0, enr $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
