import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eas extends ean {
   public static final Codec<eas> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bkv.b(ean.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, eas::new)
   );
   private final bkv<ean> b;

   public eas(bkv<ean> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(awt $$0, dsn $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public eao<?> a() {
      return eao.f;
   }
}
