import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efz {
   public static final Codec<efz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekv.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, efz::new)
   );
   public final jp<ekv> b;
   public final float c;

   public efz(jp<ekv> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dfs $$0, dxa $$1, azr $$2, jg $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
