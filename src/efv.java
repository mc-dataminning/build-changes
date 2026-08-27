import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efv extends efq {
   public static final MapCodec<efv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(boe.b(efq.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, efv::new)
   );
   private final boe<efq> b;

   public efv(boe<efq> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(ayk $$0, dxq $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public efr<?> a() {
      return efr.f;
   }
}
