import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dui implements dug {
   public static final Codec<dui> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwh.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dwh.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dui::new)
   );
   public final dwh b;
   public final dwh c;
   public final int d;

   public dui(dwh $$0, dwh $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
