import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eku extends ekp {
   public static final MapCodec<eku> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqs.b(ekp.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, eku::new)
   );
   private final bqs<ekp> b;

   public eku(bqs<ekp> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azu $$0, ecn $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public ekq<?> a() {
      return ekq.f;
   }
}
