import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzp {
   public static final Codec<dzp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eel.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dzp::new)
   );
   public final il<eel> b;
   public final float c;

   public dzp(il<eel> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(czs $$0, dqw $$1, axr $$2, ib $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
