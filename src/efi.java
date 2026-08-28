import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efi implements efg {
   public static final Codec<efi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehh.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               ehh.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, efi::new)
   );
   public final ehh b;
   public final ehh c;
   public final int d;

   public efi(ehh $$0, ehh $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
