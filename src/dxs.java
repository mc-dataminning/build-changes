import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxs extends dxn {
   public static final Codec<dxs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bil.b(dxn.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dxs::new)
   );
   private final bil<dxn> b;

   public dxs(bil<dxn> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(auv $$0, dpn $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dxo<?> a() {
      return dxo.f;
   }
}
