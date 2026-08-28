import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egu extends egp {
   public static final MapCodec<egu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpc.b(egp.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, egu::new)
   );
   private final bpc<egp> b;

   public egu(bpc<egp> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azf $$0, dyp $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public egq<?> a() {
      return egq.f;
   }
}
