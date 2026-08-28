import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecu {
   public static final Codec<ecu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehq.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, ecu::new)
   );
   public final ji<ehq> b;
   public final float c;

   public ecu(ji<ehq> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dcv $$0, dub $$1, azh $$2, iz $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
