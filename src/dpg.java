import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpg {
   public static final Codec<dpg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(duc.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dpg::new)
   );
   public final he<duc> b;
   public final float c;

   public dpg(he<duc> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cqf $$0, dgw $$1, aru $$2, gu $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
