import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxk {
   public static final Codec<dxk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ecg.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dxk::new)
   );
   public final il<ecg> b;
   public final float c;

   public dxk(il<ecg> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cxu $$0, dow $$1, axd $$2, ib $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
