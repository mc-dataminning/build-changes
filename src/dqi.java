import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqi {
   public static final Codec<dqi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dve.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dqi::new)
   );
   public final ib<dve> b;
   public final float c;

   public dqi(ib<dve> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(crt $$0, dhy $$1, ate $$2, ht $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
