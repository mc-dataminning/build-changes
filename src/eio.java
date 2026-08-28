import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eio {
   public static final Codec<eio> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(enn.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, eio::new)
   );
   public final jr<enn> b;
   public final float c;

   public eio(jr<enn> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dhy $$0, dzn $$1, azh $$2, ji $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
