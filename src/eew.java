import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eew {
   public static final Codec<eew> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejs.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, eew::new)
   );
   public final jn<ejs> b;
   public final float c;

   public eew(jn<ejs> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dep $$0, dvx $$1, azk $$2, je $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
