import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egj {
   public static final Codec<egj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(elf.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, egj::new)
   );
   public final jq<elf> b;
   public final float c;

   public egj(jq<elf> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dgd $$0, dxk $$1, azv $$2, jh $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
