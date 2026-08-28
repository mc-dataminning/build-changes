import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekj extends eke {
   public static final MapCodec<ekj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bql.b(eke.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, ekj::new)
   );
   private final bql<eke> b;

   public ekj(bql<eke> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azs $$0, ecc $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public ekf<?> a() {
      return ekf.f;
   }
}
