import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzx extends dzs {
   public static final Codec<dzx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bkg.b(dzs.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dzx::new)
   );
   private final bkg<dzs> b;

   public dzx(bkg<dzs> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(awp $$0, drs $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dzt<?> a() {
      return dzt.f;
   }
}
