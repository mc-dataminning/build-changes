import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtu extends dtp {
   public static final Codec<dtu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bfi.b(dtp.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dtu::new)
   );
   private final bfi<dtp> b;

   public dtu(bfi<dtp> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(asc $$0, dlp $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dtq<?> a() {
      return dtq.f;
   }
}
