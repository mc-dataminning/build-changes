import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eij {
   public static final Codec<eij> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(enh.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, eij::new)
   );
   public final jq<enh> b;
   public final float c;

   public eij(jq<enh> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dhx $$0, dzk $$1, bac $$2, jh $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
