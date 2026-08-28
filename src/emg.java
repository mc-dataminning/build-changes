import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emg {
   public static final Codec<emg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(erh.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, emg::new)
   );
   public final jg<erh> b;
   public final float c;

   public emg(jg<erh> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dky $$0, ede $$1, azz $$2, iw $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
