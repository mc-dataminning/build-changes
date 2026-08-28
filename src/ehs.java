import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehs {
   public static final Codec<ehs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emq.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, ehs::new)
   );
   public final jr<emq> b;
   public final float c;

   public ehs(jr<emq> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dhg $$0, dyt $$1, azh $$2, ji $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
