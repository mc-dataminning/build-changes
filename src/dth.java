import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dth {
   public static final Codec<dth> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyd.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dth::new)
   );
   public final ih<dyd> b;
   public final float c;

   public dth(ih<dyd> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cud $$0, dkx $$1, aup $$2, hx $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
