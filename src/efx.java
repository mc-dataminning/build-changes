import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efx extends efs {
   public static final MapCodec<efx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bog.b(efs.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, efx::new)
   );
   private final bog<efs> b;

   public efx(bog<efs> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(aym $$0, dxs $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public eft<?> a() {
      return eft.f;
   }
}
