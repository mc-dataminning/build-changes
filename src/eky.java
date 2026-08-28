import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eky {
   public static final Codec<eky> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(epx.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, eky::new)
   );
   public final je<epx> b;
   public final float c;

   public eky(je<epx> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dju $$0, ebx $$1, azv $$2, iu $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
