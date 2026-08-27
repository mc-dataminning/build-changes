import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eao {
   public static final Codec<eao> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efk.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, eao::new)
   );
   public final iv<efk> b;
   public final float c;

   public eao(iv<efk> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dap $$0, drv $$1, ayd $$2, im $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
