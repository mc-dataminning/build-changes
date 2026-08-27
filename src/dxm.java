import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxm {
   public static final Codec<dxm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eci.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dxm::new)
   );
   public final il<eci> b;
   public final float c;

   public dxm(il<eci> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cxw $$0, doy $$1, axd $$2, ib $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
